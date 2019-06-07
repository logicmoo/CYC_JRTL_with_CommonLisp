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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var4 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)$ic1$, var1);
            module0147.$g2095$.bind($ic2$, var1);
            SubLObject var5 = module0259.f16848($ic4$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var6 = (SubLObject)NIL;
            var6 = var5.first();
            while (NIL != var5) {
                final SubLObject var7 = module0202.f12757(module0220.f14556(var6, $ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                if (var7.isSymbol() && NIL != Symbols.fboundp(var7)) {
                    var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
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
        final SubLObject var10 = module0331.f22383(var9, (SubLObject)$ic6$);
        if (var10 == $ic6$) {
            module0229.f15259();
        }
        return var10;
    }
    
    public static SubLObject f36116(final SubLObject var9) {
        return (SubLObject)makeBoolean(NIL == module0035.f2194(var9, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36117(final SubLObject var12, final SubLObject var13) {
        return f36118(var12, var13, (SubLObject)T);
    }
    
    public static SubLObject f36119(final SubLObject var12, final SubLObject var13) {
        return f36118(var12, var13, (SubLObject)NIL);
    }
    
    public static SubLObject f36118(final SubLObject var12, final SubLObject var13, final SubLObject var14) {
        if (!var12.isString() || !var13.isString()) {
            module0229.f15259();
            return (SubLObject)NIL;
        }
        if (NIL != var14) {
            return module0035.sublisp_boolean(Strings.stringL(var12, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return module0035.sublisp_boolean(Strings.string_lessp(var12, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36120(final SubLObject var15, final SubLObject var16) {
        return f36121(var15, var16, Symbols.symbol_function((SubLObject)$ic11$));
    }
    
    public static SubLObject f36122(final SubLObject var15, final SubLObject var16) {
        return f36121(var15, var16, Symbols.symbol_function((SubLObject)$ic13$));
    }
    
    public static SubLObject f36121(final SubLObject var15, final SubLObject var16, final SubLObject var17) {
        if (var15.isString() && var16.isString()) {
            return module0035.sublisp_boolean(Sequences.search(var15, var16, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0208.f13542(var15) && NIL != module0208.f13542(var16)) {
            final SubLObject var18 = Equality.eql(var17, Symbols.symbol_function((SubLObject)$ic11$));
            return module0208.f13543(var15, var16, var18);
        }
        module0229.f15259();
        return (SubLObject)NIL;
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
        return module0038.f2673(var16, var19, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36125(final SubLObject var20, final SubLObject var16) {
        if (!var20.isString() || !var16.isString()) {
            module0229.f15259();
        }
        return module0035.sublisp_boolean(module0038.f2759(var20, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36126(final SubLObject var21) {
        final SubLObject var22 = module0205.f13277(var21, (SubLObject)UNPROVIDED);
        if (var22.isString()) {
            final SubLObject var23 = constants_high_oc.f10737(var22);
            if (NIL != var23) {
                return var23;
            }
            Errors.error((SubLObject)$ic18$, var22);
        }
        Errors.error((SubLObject)$ic19$, var22);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36127() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var4 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)$ic1$, var1);
            module0147.$g2095$.bind($ic2$, var1);
            SubLObject var5 = module0259.f16848($ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var6 = (SubLObject)NIL;
            var6 = var5.first();
            while (NIL != var5) {
                final SubLObject var7 = module0202.f12757(module0220.f14556(var6, $ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                if (var7.isSymbol() && NIL != Symbols.fboundp(var7)) {
                    var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
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
        if (NIL == var11) {
            module0229.f15259();
        }
        return var10;
    }
    
    public static SubLObject f36128(final SubLObject var16) {
        if (!var16.isString()) {
            module0229.f15259();
        }
        return Strings.string_upcase(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36129(final SubLObject var16) {
        return f36128(var16);
    }
    
    public static SubLObject f36130(final SubLObject var16) {
        if (!var16.isString()) {
            module0229.f15259();
        }
        return Strings.string_downcase(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36131(final SubLObject var16, final SubLObject var25, final SubLObject var26) {
        if (NIL == module0208.f13542(var16)) {
            module0229.f15259();
        }
        else if (var26.numG(f36132(var16)) || var25.numL((SubLObject)ZERO_INTEGER) || var25.numG(var26)) {
            module0229.f15259();
        }
        else {
            if (var16.isString()) {
                return module0038.f2623(var16, var25, var26);
            }
            if (NIL != module0208.f13537(var16, (SubLObject)UNPROVIDED)) {
                return module0208.f13546(var16, var25, var26);
            }
            module0229.f15259();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36133(final SubLObject var27) {
        if (NIL == var27 || NIL != module0035.find_if_not(Symbols.symbol_function((SubLObject)$ic28$), var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)$ic29$), var27);
    }
    
    public static SubLObject f36134(final SubLObject var27) {
        if (NIL == module0202.f12671(var27)) {
            module0229.f15259();
        }
        else if (NIL != module0035.find_if_not(Symbols.symbol_function((SubLObject)$ic28$), module0202.f12751(var27), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        else {
            if (NIL == var27) {
                return (SubLObject)$ic31$;
            }
            SubLObject var28 = (SubLObject)$ic31$;
            SubLObject var29 = conses_high.butlast(module0202.f12751(var27), (SubLObject)UNPROVIDED);
            SubLObject var30 = (SubLObject)NIL;
            var30 = var29.first();
            while (NIL != var29) {
                var28 = Sequences.cconcatenate(var28, new SubLObject[] { var30, $ic32$ });
                var29 = var29.rest();
                var30 = var29.first();
            }
            return Sequences.cconcatenate(var28, conses_high.last(var27, (SubLObject)UNPROVIDED).first());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36135(final SubLObject var28, final SubLObject var29) {
        if (!var28.isString() || !var29.isString()) {
            module0229.f15259();
        }
        return module0038.f2674(var28, var29, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36136(final SubLObject var16, final SubLObject var15, final SubLObject var30) {
        if (var16.isString() && NIL != module0038.f2611(var15) && var30.isString()) {
            return module0038.f2659(var30, var15, var16, (SubLObject)UNPROVIDED);
        }
        if (NIL != f36137(var16) && (NIL != module0038.f2611(var15) || (NIL != module0208.f13537(var15, (SubLObject)UNPROVIDED) && NIL != module0038.f2611(module0205.f13277(var15, (SubLObject)UNPROVIDED)))) && NIL != f36137(var30)) {
            final SubLObject var31 = module0037.f2569(module0209.f13554(var30), module0209.f13554(var15), module0209.f13554(var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (NIL != Sequences.find((SubLObject)$ic35$, var31, Symbols.symbol_function((SubLObject)$ic36$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? module0208.f13538(module0039.f3001(var31)) : module0039.f3001(var31);
        }
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36137(final SubLObject var32) {
        return (SubLObject)makeBoolean(NIL != module0039.f3006(var32) || NIL != module0208.f13537(var32, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36138(final SubLObject var33, final SubLObject var34, final SubLObject var35) {
        if (NIL == module0173.f10955(var33) || NIL == module0173.f10955(var34) || NIL == module0173.f10955(var35)) {
            module0229.f15259();
        }
        return module0732.f44913(var33, var34, var35);
    }
    
    public static SubLObject f36139(final SubLObject var36) {
        if (NIL == module0173.f10955(var36) && NIL == module0603.f36877(var36)) {
            module0229.f15259();
        }
        return module0202.f12787(module0764.f48461(var36, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
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
        return module0038.f2621(var28, var29, (SubLObject)UNPROVIDED);
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
        return Sequences.search(var28, var29, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36132(final SubLObject var37) {
        if (var37.isString()) {
            return Sequences.length(var37);
        }
        if (NIL != module0208.f13537(var37, (SubLObject)UNPROVIDED)) {
            return Sequences.length(module0039.f3000(module0205.f13277(var37, (SubLObject)UNPROVIDED)));
        }
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36144(final SubLObject var16) {
        if (!var16.isString()) {
            module0229.f15259();
        }
        final SubLObject var17 = reader.read_from_string_ignoring_errors(module0038.f2667(var16, (SubLObject)$ic45$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var17.isInteger()) {
            return var17;
        }
        module0229.f15259();
        return (SubLObject)NIL;
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
        final SubLObject var17 = reader.read_from_string_ignoring_errors(module0038.f2667(var16, (SubLObject)$ic45$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0552.f34074(var17)) {
            return var17;
        }
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36148(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (NIL == module0552.f34074(var39)) {
            module0229.f15259();
        }
        SubLObject var41 = (SubLObject)NIL;
        final SubLObject var42 = reader.$read_default_float_format$.currentBinding(var40);
        try {
            reader.$read_default_float_format$.bind((SubLObject)$ic50$, var40);
            var41 = print_high.princ_to_string(var39);
        }
        finally {
            reader.$read_default_float_format$.rebind(var42, var40);
        }
        return var41;
    }
    
    public static SubLObject f36149() {
        return $g4507$.getGlobalValue();
    }
    
    public static SubLObject f36150(final SubLObject var40, final SubLObject var41) {
        if (NIL == module0208.f13542(var40) || NIL == module0202.f12674(var41)) {
            module0229.f15259();
        }
        final SubLObject var42 = module0208.f13537(var40, (SubLObject)UNPROVIDED);
        final SubLObject var43 = (NIL != var42) ? module0205.f13277(var40, (SubLObject)UNPROVIDED) : var40;
        final SubLObject var44 = module0038.f2738(var43, module0202.f12751(var41), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var45 = (SubLObject)NIL;
        SubLObject var46 = var44;
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            var45 = (SubLObject)ConsesLow.cons((NIL != var42) ? module0208.f13540(var47) : var47, var45);
            var46 = var46.rest();
            var47 = var46.first();
        }
        if (NIL != module0035.f2002(var45, f36149(), (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        return module0202.f12787(Sequences.nreverse(var45), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36151(final SubLObject var46, final SubLObject var47) {
        if (NIL == module0209.f13550(var46) || NIL == module0004.f106(var47)) {
            module0229.f15259();
        }
        final SubLObject var48 = module0209.f13554(var46);
        return Vectors.aref(var48, var47);
    }
    
    public static SubLObject f36152(final SubLObject var16) {
        if (!var16.isString()) {
            module0229.f15259();
        }
        return module0589.f35898(var16, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36153(final SubLObject var49, final SubLObject var50, final SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)NIL;
        try {
            var52.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var54 = Errors.$error_handler$.currentBinding(var52);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var52);
                try {
                    SubLObject var55 = (SubLObject)NIL;
                    var55 = module0612.f37494(var51);
                    var52.resetMultipleValues();
                    final SubLObject var56 = module0589.f35940(f36154(var49));
                    final SubLObject var57 = var52.secondMultipleValue();
                    final SubLObject var58 = var52.thirdMultipleValue();
                    var52.resetMultipleValues();
                    final SubLObject var59 = module0591.f36105(var56, var58, var50, var55, var57, (SubLObject)UNPROVIDED);
                    if (var59.isString()) {
                        return var59;
                    }
                }
                catch (Throwable var60) {
                    Errors.handleThrowable(var60, (SubLObject)NIL);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36155(final SubLObject var16) {
        if (!var16.isString()) {
            module0229.f15259();
        }
        return module0589.f35872(var16);
    }
    
    public static SubLObject f36156(final SubLObject var60, final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (!var60.isString() || NIL == module0202.f12674(var61)) {
            module0229.f15259();
        }
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = (SubLObject)NIL;
        try {
            var62.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var65 = Errors.$error_handler$.currentBinding(var62);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var62);
                try {
                    final SubLObject var67;
                    final SubLObject var66 = var67 = f36157(var61);
                    SubLObject var68 = (SubLObject)NIL;
                    SubLObject var69 = var67;
                    SubLObject var70 = (SubLObject)NIL;
                    SubLObject var68_69 = (SubLObject)NIL;
                    while (NIL != var69) {
                        cdestructuring_bind.destructuring_bind_must_consp(var69, var66, (SubLObject)$ic60$);
                        var68_69 = var69.first();
                        var69 = var69.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var69, var66, (SubLObject)$ic60$);
                        if (NIL == conses_high.member(var68_69, (SubLObject)$ic61$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var70 = (SubLObject)T;
                        }
                        if (var68_69 == $ic62$) {
                            var68 = var69.first();
                        }
                        var69 = var69.rest();
                    }
                    if (NIL != var70 && NIL == var68) {
                        cdestructuring_bind.cdestructuring_bind_error(var66, (SubLObject)$ic60$);
                    }
                    final SubLObject var71 = cdestructuring_bind.property_list_member((SubLObject)$ic63$, var67);
                    final SubLObject var72 = (SubLObject)((NIL != var71) ? conses_high.cadr(var71) : NIL);
                    final SubLObject var73 = cdestructuring_bind.property_list_member((SubLObject)$ic64$, var67);
                    final SubLObject var74 = (SubLObject)((NIL != var73) ? conses_high.cadr(var73) : NIL);
                    final SubLObject var75 = cdestructuring_bind.property_list_member((SubLObject)$ic65$, var67);
                    final SubLObject var76 = (SubLObject)((NIL != var75) ? conses_high.cadr(var75) : NIL);
                    final SubLObject var77 = cdestructuring_bind.property_list_member((SubLObject)$ic66$, var67);
                    final SubLObject var78 = (SubLObject)((NIL != var77) ? conses_high.cadr(var77) : NIL);
                    final SubLObject var79 = cdestructuring_bind.property_list_member((SubLObject)$ic67$, var67);
                    final SubLObject var80 = (SubLObject)((NIL != var79) ? conses_high.cadr(var79) : NIL);
                    final SubLObject var81 = cdestructuring_bind.property_list_member((SubLObject)$ic68$, var67);
                    final SubLObject var82 = (SubLObject)((NIL != var81) ? conses_high.cadr(var81) : NIL);
                    final SubLObject var83 = cdestructuring_bind.property_list_member((SubLObject)$ic69$, var67);
                    final SubLObject var84 = (SubLObject)((NIL != var83) ? conses_high.cadr(var83) : NIL);
                    final SubLObject var85 = cdestructuring_bind.property_list_member((SubLObject)$ic70$, var67);
                    final SubLObject var86 = (SubLObject)((NIL != var85) ? conses_high.cadr(var85) : NIL);
                    SubLObject var87 = (SubLObject)NIL;
                    try {
                        var87 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_87 = module0015.$g131$.currentBinding(var62);
                        try {
                            module0015.$g131$.bind(var87, var62);
                            module0642.f39020(module0015.$g431$.getGlobalValue());
                            module0642.f39020(module0015.$g440$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var60);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != var72) {
                                module0642.f39020(module0015.$g157$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var72);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var74) {
                                module0642.f39020(module0015.$g158$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var74);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var76) {
                                module0642.f39046(module0015.$g434$.getGlobalValue());
                            }
                            if (NIL != var78) {
                                module0642.f39020(module0015.$g435$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var78);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var80) {
                                module0642.f39020(module0015.$g436$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var80);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var82) {
                                module0642.f39020(module0015.$g437$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var82);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var84) {
                                module0642.f39020(module0015.$g438$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049(var84));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var86) {
                                module0642.f39020(module0015.$g439$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var86);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_88 = module0015.$g533$.currentBinding(var62);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var62);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var62);
                            streams_high.close(var87, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_89, var62);
                        }
                    }
                }
                catch (Throwable var88) {
                    Errors.handleThrowable(var88, (SubLObject)NIL);
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
        if (NIL != var64) {
            module0229.f15259();
        }
        return var63;
    }
    
    public static SubLObject f36157(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = module0202.f12751(var61);
        SubLObject var65 = (SubLObject)NIL;
        var65 = var64.first();
        while (NIL != var64) {
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
        if (!var93.isString() || NIL == module0202.f12674(var61)) {
            module0229.f15259();
        }
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = (SubLObject)NIL;
        try {
            var94.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var97 = Errors.$error_handler$.currentBinding(var94);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var94);
                try {
                    final SubLObject var99;
                    final SubLObject var98 = var99 = f36160(var61);
                    SubLObject var100 = (SubLObject)NIL;
                    SubLObject var101 = var99;
                    SubLObject var102 = (SubLObject)NIL;
                    SubLObject var99_100 = (SubLObject)NIL;
                    while (NIL != var101) {
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)$ic72$);
                        var99_100 = var101.first();
                        var101 = var101.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)$ic72$);
                        if (NIL == conses_high.member(var99_100, (SubLObject)$ic73$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var102 = (SubLObject)T;
                        }
                        if (var99_100 == $ic62$) {
                            var100 = var101.first();
                        }
                        var101 = var101.rest();
                    }
                    if (NIL != var102 && NIL == var100) {
                        cdestructuring_bind.cdestructuring_bind_error(var98, (SubLObject)$ic72$);
                    }
                    final SubLObject var103 = cdestructuring_bind.property_list_member((SubLObject)$ic74$, var99);
                    final SubLObject var104 = (SubLObject)((NIL != var103) ? conses_high.cadr(var103) : NIL);
                    final SubLObject var105 = cdestructuring_bind.property_list_member((SubLObject)$ic75$, var99);
                    final SubLObject var106 = (SubLObject)((NIL != var105) ? conses_high.cadr(var105) : NIL);
                    final SubLObject var107 = cdestructuring_bind.property_list_member((SubLObject)$ic76$, var99);
                    final SubLObject var108 = (SubLObject)((NIL != var107) ? conses_high.cadr(var107) : NIL);
                    final SubLObject var109 = cdestructuring_bind.property_list_member((SubLObject)$ic69$, var99);
                    final SubLObject var110 = (SubLObject)((NIL != var109) ? conses_high.cadr(var109) : NIL);
                    final SubLObject var111 = cdestructuring_bind.property_list_member((SubLObject)$ic77$, var99);
                    final SubLObject var112 = (SubLObject)((NIL != var111) ? conses_high.cadr(var111) : NIL);
                    final SubLObject var113 = cdestructuring_bind.property_list_member((SubLObject)$ic78$, var99);
                    final SubLObject var114 = (SubLObject)((NIL != var113) ? conses_high.cadr(var113) : NIL);
                    final SubLObject var115 = cdestructuring_bind.property_list_member((SubLObject)$ic67$, var99);
                    final SubLObject var116 = (SubLObject)((NIL != var115) ? conses_high.cadr(var115) : NIL);
                    final SubLObject var117 = cdestructuring_bind.property_list_member((SubLObject)$ic66$, var99);
                    final SubLObject var118 = (SubLObject)((NIL != var117) ? conses_high.cadr(var117) : NIL);
                    final SubLObject var119 = cdestructuring_bind.property_list_member((SubLObject)$ic63$, var99);
                    final SubLObject var120 = (SubLObject)((NIL != var119) ? conses_high.cadr(var119) : NIL);
                    SubLObject var121 = (SubLObject)NIL;
                    try {
                        var121 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_115 = module0015.$g131$.currentBinding(var94);
                        try {
                            module0015.$g131$.bind(var121, var94);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (NIL != var120) {
                                module0642.f39020(module0015.$g157$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var120);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var104) {
                                module0642.f39046(module0015.$g369$.getGlobalValue());
                            }
                            if (NIL != var106) {
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var106);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var108) {
                                module0642.f39020(module0015.$g372$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var108);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var110) {
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049(var110));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var112) {
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049(var112));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var114) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var114);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var116) {
                                module0642.f39020(module0015.$g375$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var116);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var118) {
                                module0642.f39020(module0015.$g376$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var118);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_116 = module0015.$g533$.currentBinding(var94);
                            final SubLObject var122 = module0015.$g533$.currentBinding(var94);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var94);
                                module0015.$g533$.bind((SubLObject)NIL, var94);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var94);
                            streams_high.close(var121, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_117, var94);
                        }
                    }
                }
                catch (Throwable var123) {
                    Errors.handleThrowable(var123, (SubLObject)NIL);
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
        if (NIL != var96) {
            module0229.f15259();
        }
        return var95;
    }
    
    public static SubLObject f36161(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var9, (SubLObject)$ic80$);
        var11 = var9.first();
        final SubLObject var13 = var12 = var9.rest();
        if (!var12.isCons() || NIL == module0202.f12674(var11)) {
            module0229.f15259();
        }
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        try {
            var10.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var16 = Errors.$error_handler$.currentBinding(var10);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var10);
                try {
                    final SubLObject var122_123;
                    final SubLObject var120_121 = var122_123 = f36160(var11);
                    SubLObject var17 = (SubLObject)NIL;
                    SubLObject var18 = var122_123;
                    SubLObject var19 = (SubLObject)NIL;
                    SubLObject var127_128 = (SubLObject)NIL;
                    while (NIL != var18) {
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var120_121, (SubLObject)$ic72$);
                        var127_128 = var18.first();
                        var18 = var18.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var120_121, (SubLObject)$ic72$);
                        if (NIL == conses_high.member(var127_128, (SubLObject)$ic73$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var19 = (SubLObject)T;
                        }
                        if (var127_128 == $ic62$) {
                            var17 = var18.first();
                        }
                        var18 = var18.rest();
                    }
                    if (NIL != var19 && NIL == var17) {
                        cdestructuring_bind.cdestructuring_bind_error(var120_121, (SubLObject)$ic72$);
                    }
                    final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic74$, var122_123);
                    final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : NIL);
                    final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)$ic75$, var122_123);
                    final SubLObject var23 = (SubLObject)((NIL != var22) ? conses_high.cadr(var22) : NIL);
                    final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic76$, var122_123);
                    final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
                    final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)$ic69$, var122_123);
                    final SubLObject var27 = (SubLObject)((NIL != var26) ? conses_high.cadr(var26) : NIL);
                    final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)$ic77$, var122_123);
                    final SubLObject var29 = (SubLObject)((NIL != var28) ? conses_high.cadr(var28) : NIL);
                    final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)$ic78$, var122_123);
                    final SubLObject var31 = (SubLObject)((NIL != var30) ? conses_high.cadr(var30) : NIL);
                    final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)$ic67$, var122_123);
                    final SubLObject var33 = (SubLObject)((NIL != var32) ? conses_high.cadr(var32) : NIL);
                    final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)$ic66$, var122_123);
                    final SubLObject var35 = (SubLObject)((NIL != var34) ? conses_high.cadr(var34) : NIL);
                    final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)$ic63$, var122_123);
                    final SubLObject var37 = (SubLObject)((NIL != var36) ? conses_high.cadr(var36) : NIL);
                    SubLObject var38 = (SubLObject)NIL;
                    try {
                        var38 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_138 = module0015.$g131$.currentBinding(var10);
                        try {
                            module0015.$g131$.bind(var38, var10);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (NIL != var37) {
                                module0642.f39020(module0015.$g157$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var37);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var21) {
                                module0642.f39046(module0015.$g369$.getGlobalValue());
                            }
                            if (NIL != var23) {
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var23);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var25) {
                                module0642.f39020(module0015.$g372$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var25);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var27) {
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049(var27));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var29) {
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049(var29));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var31) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var31);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var33) {
                                module0642.f39020(module0015.$g375$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var33);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var35) {
                                module0642.f39020(module0015.$g376$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var35);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_139 = module0015.$g533$.currentBinding(var10);
                            final SubLObject var39 = module0015.$g533$.currentBinding(var10);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var10);
                                module0015.$g533$.bind((SubLObject)NIL, var10);
                                SubLObject var40 = var12;
                                SubLObject var41 = (SubLObject)NIL;
                                var41 = var40.first();
                                while (NIL != var40) {
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var10);
                            streams_high.close(var38, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_140, var10);
                        }
                    }
                }
                catch (Throwable var42) {
                    Errors.handleThrowable(var42, (SubLObject)NIL);
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
        if (NIL != var15) {
            module0229.f15259();
        }
        return var14;
    }
    
    public static SubLObject f36160(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = module0202.f12751(var61);
        SubLObject var65 = (SubLObject)NIL;
        var65 = var64.first();
        while (NIL != var64) {
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
        if (!var93.isString() || NIL == module0202.f12674(var61)) {
            module0229.f15259();
        }
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = (SubLObject)NIL;
        try {
            var94.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var97 = Errors.$error_handler$.currentBinding(var94);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var94);
                try {
                    final SubLObject var99;
                    final SubLObject var98 = var99 = f36163(var61);
                    SubLObject var100 = (SubLObject)NIL;
                    SubLObject var101 = var99;
                    SubLObject var102 = (SubLObject)NIL;
                    SubLObject var146_147 = (SubLObject)NIL;
                    while (NIL != var101) {
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)$ic82$);
                        var146_147 = var101.first();
                        var101 = var101.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)$ic82$);
                        if (NIL == conses_high.member(var146_147, (SubLObject)$ic83$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var102 = (SubLObject)T;
                        }
                        if (var146_147 == $ic62$) {
                            var100 = var101.first();
                        }
                        var101 = var101.rest();
                    }
                    if (NIL != var102 && NIL == var100) {
                        cdestructuring_bind.cdestructuring_bind_error(var98, (SubLObject)$ic82$);
                    }
                    final SubLObject var103 = cdestructuring_bind.property_list_member((SubLObject)$ic69$, var99);
                    final SubLObject var104 = (SubLObject)((NIL != var103) ? conses_high.cadr(var103) : NIL);
                    final SubLObject var105 = cdestructuring_bind.property_list_member((SubLObject)$ic77$, var99);
                    final SubLObject var106 = (SubLObject)((NIL != var105) ? conses_high.cadr(var105) : NIL);
                    final SubLObject var107 = cdestructuring_bind.property_list_member((SubLObject)$ic78$, var99);
                    final SubLObject var108 = (SubLObject)((NIL != var107) ? conses_high.cadr(var107) : NIL);
                    final SubLObject var109 = cdestructuring_bind.property_list_member((SubLObject)$ic66$, var99);
                    final SubLObject var110 = (SubLObject)((NIL != var109) ? conses_high.cadr(var109) : NIL);
                    SubLObject var111 = (SubLObject)NIL;
                    try {
                        var111 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_152 = module0015.$g131$.currentBinding(var94);
                        try {
                            module0015.$g131$.bind(var111, var94);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            if (NIL != var104) {
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var104);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var106) {
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049(var106));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var110) {
                                module0642.f39020(module0015.$g367$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var110);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var108) {
                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var108);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_153 = module0015.$g533$.currentBinding(var94);
                            final SubLObject var112 = module0015.$g533$.currentBinding(var94);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var94);
                                module0015.$g533$.bind((SubLObject)NIL, var94);
                                module0642.f39019(var93);
                            }
                            finally {
                                module0015.$g533$.rebind(var112, var94);
                                module0015.$g533$.rebind(var3_153, var94);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g131$.rebind(var3_152, var94);
                        }
                        var95 = streams_high.get_output_stream_string(var111);
                    }
                    finally {
                        final SubLObject var3_154 = Threads.$is_thread_performing_cleanupP$.currentBinding(var94);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var94);
                            streams_high.close(var111, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_154, var94);
                        }
                    }
                }
                catch (Throwable var113) {
                    Errors.handleThrowable(var113, (SubLObject)NIL);
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
        if (NIL != var96) {
            module0229.f15259();
        }
        return var95;
    }
    
    public static SubLObject f36164(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var9, (SubLObject)$ic85$);
        var11 = var9.first();
        final SubLObject var13 = var12 = var9.rest();
        if (!var12.isCons() || NIL == module0202.f12674(var11)) {
            module0229.f15259();
        }
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        try {
            var10.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var16 = Errors.$error_handler$.currentBinding(var10);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var10);
                try {
                    final SubLObject var160_161;
                    final SubLObject var158_159 = var160_161 = f36163(var11);
                    SubLObject var17 = (SubLObject)NIL;
                    SubLObject var18 = var160_161;
                    SubLObject var19 = (SubLObject)NIL;
                    SubLObject var165_166 = (SubLObject)NIL;
                    while (NIL != var18) {
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var158_159, (SubLObject)$ic82$);
                        var165_166 = var18.first();
                        var18 = var18.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var158_159, (SubLObject)$ic82$);
                        if (NIL == conses_high.member(var165_166, (SubLObject)$ic83$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var19 = (SubLObject)T;
                        }
                        if (var165_166 == $ic62$) {
                            var17 = var18.first();
                        }
                        var18 = var18.rest();
                    }
                    if (NIL != var19 && NIL == var17) {
                        cdestructuring_bind.cdestructuring_bind_error(var158_159, (SubLObject)$ic82$);
                    }
                    final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic69$, var160_161);
                    final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : NIL);
                    final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)$ic77$, var160_161);
                    final SubLObject var23 = (SubLObject)((NIL != var22) ? conses_high.cadr(var22) : NIL);
                    final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic78$, var160_161);
                    final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
                    final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)$ic66$, var160_161);
                    final SubLObject var27 = (SubLObject)((NIL != var26) ? conses_high.cadr(var26) : NIL);
                    SubLObject var28 = (SubLObject)NIL;
                    try {
                        var28 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_171 = module0015.$g131$.currentBinding(var10);
                        try {
                            module0015.$g131$.bind(var28, var10);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            if (NIL != var21) {
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var21);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var23) {
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049(var23));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var27) {
                                module0642.f39020(module0015.$g367$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var27);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var25) {
                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var25);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_172 = module0015.$g533$.currentBinding(var10);
                            final SubLObject var29 = module0015.$g533$.currentBinding(var10);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var10);
                                module0015.$g533$.bind((SubLObject)NIL, var10);
                                SubLObject var30 = var12;
                                SubLObject var173_174 = (SubLObject)NIL;
                                var173_174 = var30.first();
                                while (NIL != var30) {
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g131$.rebind(var3_171, var10);
                        }
                        var14 = streams_high.get_output_stream_string(var28);
                    }
                    finally {
                        final SubLObject var3_173 = Threads.$is_thread_performing_cleanupP$.currentBinding(var10);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var10);
                            streams_high.close(var28, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_173, var10);
                        }
                    }
                }
                catch (Throwable var31) {
                    Errors.handleThrowable(var31, (SubLObject)NIL);
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
        if (NIL != var15) {
            module0229.f15259();
        }
        return var14;
    }
    
    public static SubLObject f36163(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = module0202.f12751(var61);
        SubLObject var65 = (SubLObject)NIL;
        var65 = var64.first();
        while (NIL != var64) {
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
        if (!var93.isString() || NIL == module0202.f12674(var61)) {
            module0229.f15259();
        }
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = (SubLObject)NIL;
        try {
            var94.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var97 = Errors.$error_handler$.currentBinding(var94);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var94);
                try {
                    final SubLObject var99;
                    final SubLObject var98 = var99 = f36166(var61);
                    SubLObject var100 = (SubLObject)NIL;
                    SubLObject var101 = var99;
                    SubLObject var102 = (SubLObject)NIL;
                    SubLObject var181_182 = (SubLObject)NIL;
                    while (NIL != var101) {
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)$ic87$);
                        var181_182 = var101.first();
                        var101 = var101.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)$ic87$);
                        if (NIL == conses_high.member(var181_182, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var102 = (SubLObject)T;
                        }
                        if (var181_182 == $ic62$) {
                            var100 = var101.first();
                        }
                        var101 = var101.rest();
                    }
                    if (NIL != var102 && NIL == var100) {
                        cdestructuring_bind.cdestructuring_bind_error(var98, (SubLObject)$ic87$);
                    }
                    final SubLObject var103 = cdestructuring_bind.property_list_member((SubLObject)$ic89$, var99);
                    final SubLObject var104 = (SubLObject)((NIL != var103) ? conses_high.cadr(var103) : NIL);
                    final SubLObject var105 = cdestructuring_bind.property_list_member((SubLObject)$ic74$, var99);
                    final SubLObject var106 = (SubLObject)((NIL != var105) ? conses_high.cadr(var105) : NIL);
                    final SubLObject var107 = cdestructuring_bind.property_list_member((SubLObject)$ic69$, var99);
                    final SubLObject var108 = (SubLObject)((NIL != var107) ? conses_high.cadr(var107) : NIL);
                    final SubLObject var109 = cdestructuring_bind.property_list_member((SubLObject)$ic70$, var99);
                    final SubLObject var110 = (SubLObject)((NIL != var109) ? conses_high.cadr(var109) : NIL);
                    final SubLObject var111 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var99);
                    final SubLObject var112 = (SubLObject)((NIL != var111) ? conses_high.cadr(var111) : NIL);
                    final SubLObject var113 = cdestructuring_bind.property_list_member((SubLObject)$ic91$, var99);
                    final SubLObject var114 = (SubLObject)((NIL != var113) ? conses_high.cadr(var113) : NIL);
                    final SubLObject var115 = cdestructuring_bind.property_list_member((SubLObject)$ic92$, var99);
                    final SubLObject var116 = (SubLObject)((NIL != var115) ? conses_high.cadr(var115) : NIL);
                    final SubLObject var117 = cdestructuring_bind.property_list_member((SubLObject)$ic93$, var99);
                    final SubLObject var118 = (SubLObject)((NIL != var117) ? conses_high.cadr(var117) : NIL);
                    final SubLObject var119 = cdestructuring_bind.property_list_member((SubLObject)$ic78$, var99);
                    final SubLObject var120 = (SubLObject)((NIL != var119) ? conses_high.cadr(var119) : NIL);
                    final SubLObject var121 = cdestructuring_bind.property_list_member((SubLObject)$ic67$, var99);
                    final SubLObject var122 = (SubLObject)((NIL != var121) ? conses_high.cadr(var121) : NIL);
                    final SubLObject var123 = cdestructuring_bind.property_list_member((SubLObject)$ic94$, var99);
                    final SubLObject var124 = (SubLObject)((NIL != var123) ? conses_high.cadr(var123) : NIL);
                    SubLObject var125 = (SubLObject)NIL;
                    try {
                        var125 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_200 = module0015.$g131$.currentBinding(var94);
                        try {
                            module0015.$g131$.bind(var125, var94);
                            module0642.f39020(module0015.$g346$.getGlobalValue());
                            if (NIL != var104) {
                                module0642.f39046(module0015.$g348$.getGlobalValue());
                            }
                            if (NIL != var106) {
                                module0642.f39046(module0015.$g349$.getGlobalValue());
                            }
                            if (NIL != var108) {
                                module0642.f39020(module0015.$g351$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049(var108));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var110) {
                                module0642.f39020(module0015.$g352$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var110);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var112) {
                                module0642.f39020(module0015.$g353$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var112);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var114) {
                                module0642.f39020(module0015.$g354$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var114);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var116) {
                                module0642.f39020(module0015.$g355$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var116);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var118) {
                                module0642.f39020(module0015.$g356$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var118);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var120) {
                                module0642.f39020(module0015.$g357$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var120);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var122) {
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var122);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var124) {
                                module0642.f39020(module0015.$g359$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var124);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_201 = module0015.$g533$.currentBinding(var94);
                            final SubLObject var126 = module0015.$g533$.currentBinding(var94);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var94);
                                module0015.$g533$.bind((SubLObject)NIL, var94);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var94);
                            streams_high.close(var125, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_202, var94);
                        }
                    }
                }
                catch (Throwable var127) {
                    Errors.handleThrowable(var127, (SubLObject)NIL);
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
        if (NIL != var96) {
            module0229.f15259();
        }
        return var95;
    }
    
    public static SubLObject f36167(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var9, (SubLObject)$ic80$);
        var11 = var9.first();
        final SubLObject var13 = var12 = var9.rest();
        if (!var12.isCons() || NIL == module0202.f12674(var11)) {
            module0229.f15259();
        }
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        try {
            var10.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var16 = Errors.$error_handler$.currentBinding(var10);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var10);
                try {
                    final SubLObject var207_208;
                    final SubLObject var205_206 = var207_208 = f36166(var11);
                    SubLObject var17 = (SubLObject)NIL;
                    SubLObject var18 = var207_208;
                    SubLObject var19 = (SubLObject)NIL;
                    SubLObject var212_213 = (SubLObject)NIL;
                    while (NIL != var18) {
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var205_206, (SubLObject)$ic87$);
                        var212_213 = var18.first();
                        var18 = var18.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var205_206, (SubLObject)$ic87$);
                        if (NIL == conses_high.member(var212_213, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var19 = (SubLObject)T;
                        }
                        if (var212_213 == $ic62$) {
                            var17 = var18.first();
                        }
                        var18 = var18.rest();
                    }
                    if (NIL != var19 && NIL == var17) {
                        cdestructuring_bind.cdestructuring_bind_error(var205_206, (SubLObject)$ic87$);
                    }
                    final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic89$, var207_208);
                    final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : NIL);
                    final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)$ic74$, var207_208);
                    final SubLObject var23 = (SubLObject)((NIL != var22) ? conses_high.cadr(var22) : NIL);
                    final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic69$, var207_208);
                    final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
                    final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)$ic70$, var207_208);
                    final SubLObject var27 = (SubLObject)((NIL != var26) ? conses_high.cadr(var26) : NIL);
                    final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var207_208);
                    final SubLObject var29 = (SubLObject)((NIL != var28) ? conses_high.cadr(var28) : NIL);
                    final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)$ic91$, var207_208);
                    final SubLObject var31 = (SubLObject)((NIL != var30) ? conses_high.cadr(var30) : NIL);
                    final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)$ic92$, var207_208);
                    final SubLObject var33 = (SubLObject)((NIL != var32) ? conses_high.cadr(var32) : NIL);
                    final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)$ic93$, var207_208);
                    final SubLObject var35 = (SubLObject)((NIL != var34) ? conses_high.cadr(var34) : NIL);
                    final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)$ic78$, var207_208);
                    final SubLObject var37 = (SubLObject)((NIL != var36) ? conses_high.cadr(var36) : NIL);
                    final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)$ic67$, var207_208);
                    final SubLObject var39 = (SubLObject)((NIL != var38) ? conses_high.cadr(var38) : NIL);
                    final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)$ic94$, var207_208);
                    final SubLObject var41 = (SubLObject)((NIL != var40) ? conses_high.cadr(var40) : NIL);
                    SubLObject var42 = (SubLObject)NIL;
                    try {
                        var42 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_225 = module0015.$g131$.currentBinding(var10);
                        try {
                            module0015.$g131$.bind(var42, var10);
                            module0642.f39020(module0015.$g346$.getGlobalValue());
                            if (NIL != var21) {
                                module0642.f39046(module0015.$g348$.getGlobalValue());
                            }
                            if (NIL != var23) {
                                module0642.f39046(module0015.$g349$.getGlobalValue());
                            }
                            if (NIL != var25) {
                                module0642.f39020(module0015.$g351$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049(var25));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var27) {
                                module0642.f39020(module0015.$g352$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var27);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var29) {
                                module0642.f39020(module0015.$g353$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var29);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var31) {
                                module0642.f39020(module0015.$g354$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var31);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var33) {
                                module0642.f39020(module0015.$g355$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var33);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var35) {
                                module0642.f39020(module0015.$g356$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var35);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var37) {
                                module0642.f39020(module0015.$g357$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var37);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var39) {
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var39);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            if (NIL != var41) {
                                module0642.f39020(module0015.$g359$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var41);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_226 = module0015.$g533$.currentBinding(var10);
                            final SubLObject var43 = module0015.$g533$.currentBinding(var10);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var10);
                                module0015.$g533$.bind((SubLObject)NIL, var10);
                                SubLObject var44 = var12;
                                SubLObject var45 = (SubLObject)NIL;
                                var45 = var44.first();
                                while (NIL != var44) {
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var10);
                            streams_high.close(var42, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_227, var10);
                        }
                    }
                }
                catch (Throwable var46) {
                    Errors.handleThrowable(var46, (SubLObject)NIL);
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
        if (NIL != var15) {
            module0229.f15259();
        }
        return var14;
    }
    
    public static SubLObject f36166(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = module0202.f12751(var61);
        SubLObject var65 = (SubLObject)NIL;
        var65 = var64.first();
        while (NIL != var64) {
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
        if (!var93.isString() || NIL == module0202.f12674(var61)) {
            module0229.f15259();
        }
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = (SubLObject)NIL;
        try {
            var94.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var97 = Errors.$error_handler$.currentBinding(var94);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var94);
                try {
                    final SubLObject var99;
                    final SubLObject var98 = var99 = f36169(var61);
                    SubLObject var100 = (SubLObject)NIL;
                    SubLObject var101 = var99;
                    SubLObject var102 = (SubLObject)NIL;
                    SubLObject var234_235 = (SubLObject)NIL;
                    while (NIL != var101) {
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)$ic97$);
                        var234_235 = var101.first();
                        var101 = var101.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)$ic97$);
                        if (NIL == conses_high.member(var234_235, (SubLObject)$ic98$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var102 = (SubLObject)T;
                        }
                        if (var234_235 == $ic62$) {
                            var100 = var101.first();
                        }
                        var101 = var101.rest();
                    }
                    if (NIL != var102 && NIL == var100) {
                        cdestructuring_bind.cdestructuring_bind_error(var98, (SubLObject)$ic97$);
                    }
                    final SubLObject var103 = cdestructuring_bind.property_list_member((SubLObject)$ic63$, var99);
                    final SubLObject var104 = (SubLObject)((NIL != var103) ? conses_high.cadr(var103) : NIL);
                    final SubLObject var105 = cdestructuring_bind.property_list_member((SubLObject)$ic64$, var99);
                    final SubLObject var106 = (SubLObject)((NIL != var105) ? conses_high.cadr(var105) : NIL);
                    final SubLObject var107 = cdestructuring_bind.property_list_member((SubLObject)$ic99$, var99);
                    final SubLObject var108 = (SubLObject)((NIL != var107) ? conses_high.cadr(var107) : NIL);
                    final SubLObject var109 = cdestructuring_bind.property_list_member((SubLObject)$ic100$, var99);
                    final SubLObject var110 = (SubLObject)((NIL != var109) ? conses_high.cadr(var109) : NIL);
                    SubLObject var111 = (SubLObject)NIL;
                    try {
                        var111 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_242 = module0015.$g131$.currentBinding(var94);
                        try {
                            module0015.$g131$.bind(var111, var94);
                            if (NIL != var108 && NIL != var110) {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (NIL != var104) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var104);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                if (NIL != var106) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var106);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39020(module0015.$g147$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var108);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g148$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var110);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_243 = module0015.$g533$.currentBinding(var94);
                                final SubLObject var112 = module0015.$g533$.currentBinding(var94);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var94);
                                    module0015.$g533$.bind((SubLObject)NIL, var94);
                                    module0642.f39019(var93);
                                }
                                finally {
                                    module0015.$g533$.rebind(var112, var94);
                                    module0015.$g533$.rebind(var3_243, var94);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                            else if (NIL != var108) {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (NIL != var104) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var104);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                if (NIL != var106) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var106);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39020(module0015.$g147$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var108);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_244 = module0015.$g533$.currentBinding(var94);
                                final SubLObject var112 = module0015.$g533$.currentBinding(var94);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var94);
                                    module0015.$g533$.bind((SubLObject)NIL, var94);
                                    module0642.f39019(var93);
                                }
                                finally {
                                    module0015.$g533$.rebind(var112, var94);
                                    module0015.$g533$.rebind(var3_244, var94);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                            else if (NIL != var110) {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (NIL != var104) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var104);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                if (NIL != var106) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var106);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39020(module0015.$g148$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var110);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_245 = module0015.$g533$.currentBinding(var94);
                                final SubLObject var112 = module0015.$g533$.currentBinding(var94);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var94);
                                    module0015.$g533$.bind((SubLObject)NIL, var94);
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
                                if (NIL != var104) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var104);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                if (NIL != var106) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var106);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_246 = module0015.$g533$.currentBinding(var94);
                                final SubLObject var112 = module0015.$g533$.currentBinding(var94);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var94);
                                    module0015.$g533$.bind((SubLObject)NIL, var94);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var94);
                            streams_high.close(var111, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_247, var94);
                        }
                    }
                }
                catch (Throwable var113) {
                    Errors.handleThrowable(var113, (SubLObject)NIL);
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
        if (NIL != var96) {
            module0229.f15259();
        }
        return var95;
    }
    
    public static SubLObject f36170(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var9, (SubLObject)$ic80$);
        var11 = var9.first();
        final SubLObject var13 = var12 = var9.rest();
        if (!var12.isCons() || NIL == module0202.f12674(var11)) {
            module0229.f15259();
        }
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        try {
            var10.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var16 = Errors.$error_handler$.currentBinding(var10);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var10);
                try {
                    final SubLObject var252_253;
                    final SubLObject var250_251 = var252_253 = f36169(var11);
                    SubLObject var17 = (SubLObject)NIL;
                    SubLObject var18 = var252_253;
                    SubLObject var19 = (SubLObject)NIL;
                    SubLObject var257_258 = (SubLObject)NIL;
                    while (NIL != var18) {
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var250_251, (SubLObject)$ic97$);
                        var257_258 = var18.first();
                        var18 = var18.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var250_251, (SubLObject)$ic97$);
                        if (NIL == conses_high.member(var257_258, (SubLObject)$ic98$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var19 = (SubLObject)T;
                        }
                        if (var257_258 == $ic62$) {
                            var17 = var18.first();
                        }
                        var18 = var18.rest();
                    }
                    if (NIL != var19 && NIL == var17) {
                        cdestructuring_bind.cdestructuring_bind_error(var250_251, (SubLObject)$ic97$);
                    }
                    final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic63$, var252_253);
                    final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : NIL);
                    final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)$ic64$, var252_253);
                    final SubLObject var23 = (SubLObject)((NIL != var22) ? conses_high.cadr(var22) : NIL);
                    final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic99$, var252_253);
                    final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
                    final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)$ic100$, var252_253);
                    final SubLObject var27 = (SubLObject)((NIL != var26) ? conses_high.cadr(var26) : NIL);
                    SubLObject var28 = (SubLObject)NIL;
                    try {
                        var28 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_263 = module0015.$g131$.currentBinding(var10);
                        try {
                            module0015.$g131$.bind(var28, var10);
                            if (NIL != var25 && NIL != var27) {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (NIL != var21) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var21);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                if (NIL != var23) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var23);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39020(module0015.$g147$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var25);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g148$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var27);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_264 = module0015.$g533$.currentBinding(var10);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var10);
                                    f36171(var12);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_264, var10);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                            else if (NIL != var25) {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (NIL != var21) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var21);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                if (NIL != var23) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var23);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39020(module0015.$g147$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var25);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_265 = module0015.$g533$.currentBinding(var10);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var10);
                                    f36171(var12);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_265, var10);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                            else if (NIL != var27) {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (NIL != var21) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var21);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                if (NIL != var23) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var23);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39020(module0015.$g148$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var27);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_266 = module0015.$g533$.currentBinding(var10);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var10);
                                    f36171(var12);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_266, var10);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                            else {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (NIL != var21) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var21);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                if (NIL != var23) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var23);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_267 = module0015.$g533$.currentBinding(var10);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var10);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var10);
                            streams_high.close(var28, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_268, var10);
                        }
                    }
                }
                catch (Throwable var29) {
                    Errors.handleThrowable(var29, (SubLObject)NIL);
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
        if (NIL != var15) {
            module0229.f15259();
        }
        return var14;
    }
    
    public static SubLObject f36171(final SubLObject var93) {
        final SubLThread var94 = SubLProcess.currentSubLThread();
        final SubLObject var95 = module0015.$g533$.currentBinding(var94);
        try {
            module0015.$g533$.bind((SubLObject)NIL, var94);
            SubLObject var96 = var93;
            SubLObject var97 = (SubLObject)NIL;
            var97 = var96.first();
            while (NIL != var96) {
                module0642.f39019(var97);
                var96 = var96.rest();
                var97 = var96.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var95, var94);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36169(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = module0202.f12751(var61);
        SubLObject var65 = (SubLObject)NIL;
        var65 = var64.first();
        while (NIL != var64) {
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
        SubLObject var94 = (SubLObject)NIL;
        SubLObject var95 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var93, var92, (SubLObject)$ic103$);
        var94 = var93.first();
        var93 = var93.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var93, var92, (SubLObject)$ic103$);
        var95 = var93.first();
        var93 = var93.rest();
        if (NIL != var93) {
            cdestructuring_bind.cdestructuring_bind_error(var92, (SubLObject)$ic103$);
            return (SubLObject)NIL;
        }
        if (NIL != module0062.f4492(var94, (SubLObject)$ic104$)) {
            return Values.values(module0205.f13277(var94, (SubLObject)UNPROVIDED), var95);
        }
        return Values.values(f36172(var94), f36173(var95));
    }
    
    public static SubLObject f36172(final SubLObject var271) {
        final SubLObject var272 = (SubLObject)((NIL != module0173.f10955(var271)) ? module0594.f36343(var271) : NIL);
        if (!var272.isKeyword()) {
            module0229.f15259();
        }
        return var272;
    }
    
    public static SubLObject f36173(final SubLObject var272) {
        if (NIL != module0062.f4492((SubLObject)$ic105$, var272)) {
            return Sequences.cconcatenate(module0006.f207(module0205.f13277(var272, (SubLObject)UNPROVIDED)), (SubLObject)$ic106$);
        }
        if (NIL != module0202.f12674(var272)) {
            return module0038.f2761(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic107$), module0202.f12751(var272)), (SubLObject)UNPROVIDED);
        }
        return var272;
    }
    
    public static SubLObject f36174(final SubLObject var274, final SubLObject var275) {
        final SubLThread var276 = SubLProcess.currentSubLThread();
        SubLObject var277 = (SubLObject)NIL;
        SubLObject var278 = (SubLObject)NIL;
        try {
            var276.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var279 = Errors.$error_handler$.currentBinding(var276);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var276);
                try {
                    var277 = module0589.f35913(f36154(var274), f36154(var275));
                }
                catch (Throwable var280) {
                    Errors.handleThrowable(var280, (SubLObject)NIL);
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
        if (NIL != var278 || !var277.isString()) {
            module0229.f15259();
        }
        return module0202.f12643($ic108$, var277);
    }
    
    public static SubLObject f36154(final SubLObject var49) {
        if (var49.isString()) {
            return var49;
        }
        if (module0205.f13276(var49).eql($ic108$)) {
            return module0205.f13277(var49, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36175(final SubLObject var277) {
        if (NIL == var277) {
            module0229.f15259();
        }
        final SubLObject var278 = Strings.string_left_trim((SubLObject)$ic110$, Strings.string_right_trim((SubLObject)$ic111$, var277));
        return module0699.f42602(module0702.f42814(var278, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36176(final SubLObject var36) {
        if (NIL == var36) {
            module0229.f15259();
        }
        return module0712.f43671(var36, (SubLObject)NIL, (SubLObject)T, (SubLObject)NIL);
    }
    
    public static SubLObject f36177(final SubLObject var36) {
        if (NIL == var36) {
            module0229.f15259();
            return (SubLObject)NIL;
        }
        if (NIL != f36178(var36)) {
            return module0205.f13277(var36, (SubLObject)UNPROVIDED);
        }
        return module0712.f43671(var36, (SubLObject)NIL, (SubLObject)T, (SubLObject)NIL);
    }
    
    public static SubLObject f36178(final SubLObject var36) {
        return module0205.f13373(var36, $ic115$);
    }
    
    public static SubLObject f36179(final SubLObject var16) {
        if (var16.isString()) {
            return module0642.f39135(var16, module0038.$g916$.getGlobalValue());
        }
        if (NIL != module0208.f13537(var16, (SubLObject)UNPROVIDED)) {
            return module0208.f13540(module0642.f39135(module0205.f13277(var16, (SubLObject)UNPROVIDED), module0038.$g916$.getGlobalValue()));
        }
        module0229.f15259();
        return (SubLObject)NIL;
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
        if (NIL == module0202.f12932(var279) || !var47.isInteger() || var47.isNegative()) {
            module0229.f15259();
        }
        if (var279.isCons()) {
            if (!var47.numL(module0202.f12728(var279, (SubLObject)UNPROVIDED))) {
                module0229.f15259();
            }
            return module0205.f13134(var279, var47, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0167.f10813(var279)) {
            return f36182(var47, module0172.f10915(var279));
        }
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36183(final SubLObject var279) {
        if (NIL == module0202.f12932(var279)) {
            module0229.f15259();
        }
        final SubLObject var280 = conses_high.copy_list(module0205.f13207(var279, (SubLObject)UNPROVIDED));
        return reader.bq_cons($ic120$, ConsesLow.append(var280, (SubLObject)NIL));
    }
    
    public static SubLObject f36184(final SubLObject var279) {
        if (NIL == module0202.f12932(var279)) {
            module0229.f15259();
        }
        final SubLObject var280 = module0205.f13207(var279, (SubLObject)UNPROVIDED);
        final SubLObject var281 = Sequences.reverse(Sequences.delete_duplicates(Sequences.reverse(var280), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return reader.bq_cons($ic122$, ConsesLow.append(var281, (SubLObject)NIL));
    }
    
    public static SubLObject f36185(final SubLObject var279) {
        if (NIL == module0206.f13470(var279)) {
            module0229.f15259();
        }
        final SubLObject var280 = module0285.f18933(var279, (SubLObject)UNPROVIDED);
        return f36186(var280);
    }
    
    public static SubLObject f36186(final SubLObject var279) {
        if (NIL == module0205.f13336(var279)) {
            module0229.f15259();
        }
        return module0202.f12725(var279, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36187(final SubLObject var32) {
        return Equality.identity(var32);
    }
    
    public static SubLObject f36188(final SubLObject var282) {
        return f36189(var282, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36189(final SubLObject var282, SubLObject var283) {
        if (var283 == UNPROVIDED) {
            var283 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var284 = f36190(var282);
        if (NIL == var284) {
            module0229.f15259();
        }
        final SubLObject var285 = module0202.f12896(var284);
        final SubLObject var286 = module0202.f12898(var284);
        return module0202.f12788(module0434.f30589(var285, var286, var283, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36190(final SubLObject var282) {
        if (NIL != module0202.f12895(var282)) {
            return var282;
        }
        if (NIL != module0173.f10955(var282)) {
            final SubLObject var283 = module0225.f14739(var282);
            if (var283.isInteger() && !var283.isNegative()) {
                final SubLObject var284 = module0193.f12101(var283);
                final SubLObject var285 = (SubLObject)ConsesLow.cons(var282, var284);
                return (SubLObject)ConsesLow.list($ic128$, var284, var285);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36191(final SubLObject var288, final SubLObject var289, final SubLObject var290) {
        final SubLThread var291 = SubLProcess.currentSubLThread();
        if (NIL != $g4508$.getDynamicValue(var291)) {
            final SubLObject var292 = module0285.f18933(var288, (SubLObject)UNPROVIDED);
            final SubLObject var293 = module0285.f18933(var289, (SubLObject)UNPROVIDED);
            final SubLObject var294 = module0205.f13144(module0285.f18933(var290, (SubLObject)UNPROVIDED));
            return conses_high.subst(var292, var293, var294, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        return module0172.f10922(conses_high.subst(module0205.f13144(var288), module0205.f13144(var289), module0205.f13144(var290), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36192(final SubLObject var294) {
        final SubLObject var295 = module0205.f13144(var294);
        if (NIL == f36193(var295)) {
            module0229.f15259();
        }
        return module0205.f13144(module0205.f13147(module0205.f13144(var295), (SubLObject)$ic130$, (SubLObject)$ic131$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36194(final SubLObject var32) {
        return module0259.f16854(var32, $ic133$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36195(final SubLObject var296) {
        return module0285.f18993(module0202.f12643($ic134$, var296), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36196(final SubLObject var294) {
        final SubLObject var295 = module0205.f13144(var294);
        if (NIL == f36193(var295)) {
            module0229.f15259();
        }
        return module0205.f13144(module0205.f13147(module0205.f13144(var295), (SubLObject)$ic130$, (SubLObject)$ic135$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36193(final SubLObject var32) {
        return (SubLObject)makeBoolean(NIL != module0207.f13509(var32) && NIL == module0205.f13220($ic134$, var32, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0205.f13220($ic137$, var32, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36197(final SubLObject var296) {
        return module0285.f18993(module0202.f12643($ic137$, var296), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36198(final SubLObject var294) {
        return module0205.f13147(module0205.f13144(var294), (SubLObject)$ic138$, (SubLObject)$ic139$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36199(final SubLObject var32) {
        return module0202.f12589(var32, (SubLObject)$ic140$);
    }
    
    public static SubLObject f36200(final SubLObject var297, final SubLObject var298, final SubLObject var290) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        if (NIL != $g4508$.getDynamicValue(var299)) {
            final SubLObject var300 = module0285.f18933(var298, (SubLObject)UNPROVIDED);
            final SubLObject var301 = module0285.f18933(var290, (SubLObject)UNPROVIDED);
            final SubLObject var302 = module0172.f10922(module0202.f12817(var297, var300, var301));
            return module0202.f12683($ic141$, (SubLObject)ConsesLow.list(var302), (SubLObject)UNPROVIDED);
        }
        return module0172.f10922(module0202.f12817(var297, var298, var290));
    }
    
    public static SubLObject f36201(final SubLObject var301, final SubLObject var298, final SubLObject var290) {
        final SubLObject var302 = module0205.f13403(var301);
        return module0172.f10922(module0202.f12820(var302, var298, var290));
    }
    
    public static SubLObject f36202(final SubLObject var303, final SubLObject var304) {
        final SubLThread var305 = SubLProcess.currentSubLThread();
        if (NIL == module0202.f12674(var304)) {
            module0229.f15259();
        }
        final SubLObject var306 = module0202.f12751(var304);
        SubLObject var307 = (SubLObject)NIL;
        if (var303.eql($ic141$)) {
            var307 = module0202.f12683($ic141$, var306, (SubLObject)UNPROVIDED);
        }
        else if (NIL != $g4508$.getDynamicValue(var305)) {
            SubLObject var308 = (SubLObject)NIL;
            SubLObject var309 = (SubLObject)NIL;
            SubLObject var310 = var306;
            SubLObject var311 = (SubLObject)NIL;
            var311 = var310.first();
            while (NIL != var310) {
                if (NIL == module0206.f13470(var311)) {
                    module0229.f15259();
                }
                var309 = (SubLObject)ConsesLow.cons(module0285.f18933(var311, (SubLObject)UNPROVIDED), var309);
                var310 = var310.rest();
                var311 = var310.first();
            }
            var309 = Sequences.nreverse(var309);
            var308 = module0285.f18933(var303, (SubLObject)T);
            var307 = module0202.f12683(var308, var309, (SubLObject)UNPROVIDED);
            if (NIL == module0206.f13486(var307)) {
                module0229.f15259();
            }
            var307 = module0202.f12683($ic141$, (SubLObject)ConsesLow.list(var307), (SubLObject)UNPROVIDED);
        }
        else {
            var307 = module0202.f12683(var303, var306, (SubLObject)UNPROVIDED);
            if (NIL == module0206.f13486(var307)) {
                module0229.f15259();
            }
        }
        return module0172.f10922(var307);
    }
    
    public static SubLObject f36203(final SubLObject var297, final SubLObject var298, final SubLObject var290) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        SubLObject var300 = (SubLObject)NIL;
        final SubLObject var301 = $g4508$.currentBinding(var299);
        try {
            $g4508$.bind((SubLObject)T, var299);
            var300 = f36200(var297, var298, var290);
        }
        finally {
            $g4508$.rebind(var301, var299);
        }
        return var300;
    }
    
    public static SubLObject f36204(final SubLObject var301, final SubLObject var298, final SubLObject var290) {
        final SubLThread var302 = SubLProcess.currentSubLThread();
        SubLObject var303 = (SubLObject)NIL;
        final SubLObject var304 = $g4508$.currentBinding(var302);
        try {
            $g4508$.bind((SubLObject)T, var302);
            var303 = f36201(var301, var298, var290);
        }
        finally {
            $g4508$.rebind(var304, var302);
        }
        return var303;
    }
    
    public static SubLObject f36205(final SubLObject var303, final SubLObject var304) {
        final SubLThread var305 = SubLProcess.currentSubLThread();
        SubLObject var306 = (SubLObject)NIL;
        final SubLObject var307 = $g4508$.currentBinding(var305);
        try {
            $g4508$.bind((SubLObject)T, var305);
            var306 = f36202(var303, var304);
        }
        finally {
            $g4508$.rebind(var307, var305);
        }
        return var306;
    }
    
    public static SubLObject f36206(final SubLObject var279) {
        return module0205.f13144(var279);
    }
    
    public static SubLObject f36207(final SubLObject var288, final SubLObject var289, final SubLObject var310) {
        if (NIL == module0274.f18164(var310, (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        return conses_high.subst(var288, var289, var310, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36208(final SubLObject var311, final SubLObject var312, final SubLObject var313) {
        final SubLObject var314 = module0202.f12751(var313);
        final SubLObject var315 = module0732.f45146(var311, var312, var314);
        if (NIL != var315) {
            return var315;
        }
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36209(final SubLObject var33, final SubLObject var6) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        try {
            var34.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var37 = Errors.$error_handler$.currentBinding(var34);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var34);
                try {
                    var35 = module0730.f44564(var33, var6, module0147.f9552((SubLObject)UNPROVIDED));
                }
                catch (Throwable var38) {
                    Errors.handleThrowable(var38, (SubLObject)NIL);
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
        if (NIL != var36) {
            module0229.f15259();
            return (SubLObject)NIL;
        }
        return module0202.f12791(var35, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36210() {
        if (NIL == $g4509$.getGlobalValue()) {
            $g4509$.setGlobalValue(constants_high_oc.f10737((SubLObject)$ic152$));
        }
        return $g4509$.getGlobalValue();
    }
    
    public static SubLObject f36211() {
        if (NIL == $g4510$.getGlobalValue()) {
            $g4510$.setGlobalValue(constants_high_oc.f10737((SubLObject)$ic153$));
        }
        return $g4510$.getGlobalValue();
    }
    
    public static SubLObject f36212(final SubLObject var316) {
        if (!module0205.f13276(var316).eql(f36211())) {
            module0229.f15259();
        }
        SubLObject var317 = (SubLObject)NIL;
        SubLObject var318 = module0205.f13304(var316, (SubLObject)UNPROVIDED);
        SubLObject var319 = (SubLObject)NIL;
        var319 = var318.first();
        while (NIL != var318) {
            SubLObject var320 = (SubLObject)NIL;
            if (var319.isString()) {
                var320 = (SubLObject)ConsesLow.list(var319);
            }
            else if (NIL != module0202.f12589(var319, f36210())) {
                var320 = module0730.f44564(module0205.f13277(var319, (SubLObject)UNPROVIDED), module0205.f13368(var319, (SubLObject)UNPROVIDED), module0147.f9552((SubLObject)UNPROVIDED));
            }
            if (NIL != module0035.f2013(var320)) {
                var317 = (SubLObject)ConsesLow.cons(var320, var317);
            }
            else {
                module0229.f15259();
            }
            var318 = var318.rest();
            var319 = var318.first();
        }
        SubLObject var321 = (SubLObject)NIL;
        SubLObject var322 = module0035.f2489(Sequences.nreverse(var317), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var323 = (SubLObject)NIL;
        var323 = var322.first();
        while (NIL != var322) {
            var321 = (SubLObject)ConsesLow.cons(module0038.f2761(var323, (SubLObject)UNPROVIDED), var321);
            var322 = var322.rest();
            var323 = var322.first();
        }
        return module0202.f12791(var321, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36213(final SubLObject var18, final SubLObject var283, final SubLObject var280) {
        if (!var18.isString() || NIL == module0161.f10481(var283)) {
            module0229.f15259();
        }
        final SubLObject var284 = f36214(var280);
        if (NIL == var284) {
            module0229.f15259();
        }
        final SubLObject var285 = f36215(var284, var283, var18);
        if (NIL == var285) {
            module0229.f15259();
        }
        return var285;
    }
    
    public static SubLObject f36216(final SubLObject var18, final SubLObject var283, final SubLObject var280) {
        if (!var18.isString() || NIL == module0161.f10481(var283)) {
            module0229.f15259();
        }
        final SubLObject var284 = f36214(var280);
        if (NIL == var284) {
            module0229.f15259();
        }
        final SubLObject var285 = module0434.f30594(var284, var283, (SubLObject)$ic156$);
        if (NIL != var285) {
            final SubLObject var286 = module0233.f15370(var285.first().first());
            return var286;
        }
        final SubLObject var286 = f36215(var284, var283, var18);
        if (NIL == var286) {
            module0229.f15259();
        }
        return var286;
    }
    
    public static SubLObject f36214(final SubLObject var280) {
        SubLObject var281 = (SubLObject)NIL;
        if (NIL != module0173.f10955(var280)) {
            var281 = (SubLObject)ConsesLow.list($ic158$, (SubLObject)$ic159$, var280);
        }
        else if (var280.isCons() && $ic160$.eql(module0205.f13276(var280))) {
            var281 = module0205.f13368(var280, (SubLObject)UNPROVIDED);
        }
        return var281;
    }
    
    public static SubLObject f36215(final SubLObject var290, final SubLObject var283, final SubLObject var18) {
        final SubLObject var291 = module0541.f33547(var290, var283, var18, (SubLObject)UNPROVIDED);
        if (NIL != var291) {
            final SubLObject var292 = module0233.f15370(var291.first());
            final SubLObject var293 = module0126.f8395(var18, (SubLObject)UNPROVIDED);
            module0538.f33377(var292, var293);
            module0538.f33349((SubLObject)ConsesLow.list($ic161$, var292, var283), module0132.$g1549$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return var292;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36217(final SubLObject var323) {
        final SubLObject var324 = f36218(var323, $ic162$);
        final SubLObject var325 = module0035.remove_if_not((SubLObject)$ic163$, var324, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1997(var325)) {
            return var325.first();
        }
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36219(final SubLObject var323) {
        final SubLObject var324 = f36218(var323, $ic165$);
        if (NIL != module0035.f1997(var324)) {
            return var324.first();
        }
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36218(final SubLObject var323, final SubLObject var326) {
        if (NIL == module0212.f13762(var323)) {
            module0229.f15259();
        }
        final SubLObject var327 = module0220.f14562(var323, var326, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        final SubLObject var328 = module0035.remove_if_not((SubLObject)$ic167$, var327, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var329 = Sequences.remove_if((SubLObject)$ic168$, var328, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var330 = (SubLObject)NIL;
        SubLObject var331 = var329;
        SubLObject var332 = (SubLObject)NIL;
        var332 = var331.first();
        while (NIL != var331) {
            if (module0217.f14221(var332, (SubLObject)ONE_INTEGER, var326, (SubLObject)UNPROVIDED).eql((SubLObject)ONE_INTEGER)) {
                var330 = (SubLObject)ConsesLow.cons(var332, var330);
            }
            var331 = var331.rest();
            var332 = var331.first();
        }
        return var330;
    }
    
    public static SubLObject f36220(final SubLObject var330) {
        return module0305.f20438(var330, $ic169$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36221(final SubLObject var330) {
        return module0305.f20438(var330, $ic170$, (SubLObject)UNPROVIDED);
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
        return f36225(var36, $g4511$.getGlobalValue());
    }
    
    public static SubLObject f36226(final SubLObject var36, final SubLObject var332) {
        if (NIL != var332) {
            final SubLObject var333 = module0747.f46317(var36, (SubLObject)$ic176$);
            return (SubLObject)((NIL != var333) ? module0747.f46318(var333.first(), (SubLObject)NIL, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)NIL) : NIL);
        }
        return module0770.f49049(var36, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36225(final SubLObject var36, final SubLObject var332) {
        final SubLThread var333 = SubLProcess.currentSubLThread();
        final SubLObject var334 = module0034.$g879$.getDynamicValue(var333);
        SubLObject var335 = (SubLObject)NIL;
        if (NIL == var334) {
            return f36226(var36, var332);
        }
        var335 = module0034.f1857(var334, (SubLObject)$ic175$, (SubLObject)UNPROVIDED);
        if (NIL == var335) {
            var335 = module0034.f1807(module0034.f1842(var334), (SubLObject)$ic175$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var334, (SubLObject)$ic175$, var335);
        }
        final SubLObject var336 = module0034.f1782(var36, var332);
        final SubLObject var337 = module0034.f1814(var335, var336, (SubLObject)UNPROVIDED);
        if (var337 != $ic177$) {
            SubLObject var338 = var337;
            SubLObject var339 = (SubLObject)NIL;
            var339 = var338.first();
            while (NIL != var338) {
                SubLObject var340 = var339.first();
                final SubLObject var341 = conses_high.second(var339);
                if (var36.equal(var340.first())) {
                    var340 = var340.rest();
                    if (NIL != var340 && NIL == var340.rest() && var332.equal(var340.first())) {
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
        if (NIL == module0762.f48210(var342)) {
            module0229.f15259();
        }
        SubLObject var344 = (SubLObject)NIL;
        SubLObject var345 = (SubLObject)NIL;
        var343.resetMultipleValues();
        final SubLObject var343_344 = module0770.f49057(var342, module0147.$g2095$.getDynamicValue(var343), module0147.$g2095$.getDynamicValue(var343));
        final SubLObject var345_346 = var343.secondMultipleValue();
        var343.resetMultipleValues();
        var344 = var343_344;
        var345 = var345_346;
        if (NIL != var345 || NIL == module0209.f13550(var344)) {
            module0229.f15259();
        }
        return var344;
    }
    
    public static SubLObject f36228(final SubLObject var347, final SubLObject var348) {
        final SubLThread var349 = SubLProcess.currentSubLThread();
        return module0751.f46947(Functions.funcall((SubLObject)makeSymbol("S#39916", "CYC"), module0205.f13203(var347, (SubLObject)UNPROVIDED), var348, module0147.$g2095$.getDynamicValue(var349)));
    }
    
    public static SubLObject f36229(final SubLObject var349, final SubLObject var350) {
        final SubLThread var351 = SubLProcess.currentSubLThread();
        if (NIL == module0202.f12676(var349) || NIL == module0161.f10480(var350)) {
            module0229.f15259();
        }
        else {
            if (NIL != module0202.f12679(var349)) {
                return module0038.$g916$.getGlobalValue();
            }
            if (NIL != module0202.f12590(var349)) {
                final SubLObject var352 = f36230(var349);
                var351.resetMultipleValues();
                final SubLObject var353 = module0770.f49057(var352, var350, module0147.$g2095$.getDynamicValue(var351));
                final SubLObject var354 = var351.secondMultipleValue();
                var351.resetMultipleValues();
                if (NIL != var354 || !var353.isString()) {
                    module0229.f15259();
                }
                return var353;
            }
            module0229.f15259();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36230(final SubLObject var349) {
        SubLObject var350 = (SubLObject)NIL;
        SubLObject var351 = (SubLObject)ZERO_INTEGER;
        SubLObject var353;
        final SubLObject var352 = var353 = module0205.f13207(var349, (SubLObject)$ic181$);
        SubLObject var354 = (SubLObject)NIL;
        var354 = var353.first();
        while (NIL != var353) {
            var351 = Numbers.add(var351, (SubLObject)ONE_INTEGER);
            if (var351.numG((SubLObject)ONE_INTEGER)) {
                var350 = (SubLObject)ConsesLow.cons((SubLObject)$ic182$, var350);
            }
            var350 = (SubLObject)ConsesLow.cons(module0202.f12768($ic183$, $ic184$, var354), var350);
            var353 = var353.rest();
            var354 = var353.first();
        }
        if (NIL == var350) {
            module0229.f15259();
        }
        return (NIL != module0035.f1997(var350)) ? var350.first() : module0202.f12683($ic185$, Sequences.nreverse(var350), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36231(final SubLObject var354) {
        final SubLThread var355 = SubLProcess.currentSubLThread();
        final SubLObject var356 = module0220.f14565(var354, $ic186$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        SubLObject var357 = (SubLObject)NIL;
        final SubLObject var358 = module0147.$g2094$.currentBinding(var355);
        final SubLObject var359 = module0147.$g2095$.currentBinding(var355);
        try {
            module0147.$g2094$.bind((SubLObject)$ic1$, var355);
            module0147.$g2095$.bind($ic2$, var355);
            SubLObject var360 = var356;
            SubLObject var361 = (SubLObject)NIL;
            var361 = var360.first();
            while (NIL != var360) {
                if (NIL != module0259.f16854(var361, $ic187$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0259.f16854(var361, $ic188$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
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
        if (!Sequences.length(var357).eql((SubLObject)ONE_INTEGER)) {
            module0229.f15259();
        }
        return var357.first();
    }
    
    public static SubLObject f36232(final SubLObject var356) {
        if (!var356.isString() && NIL == module0208.f13537(var356, (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        return module0589.f35898((NIL != module0208.f13537(var356, (SubLObject)UNPROVIDED)) ? module0039.f3053(module0205.f13277(var356, (SubLObject)UNPROVIDED)) : var356, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36233(final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        SubLObject var51 = (SubLObject)NIL;
        SubLObject var52 = (SubLObject)NIL;
        try {
            var50.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var53 = Errors.$error_handler$.currentBinding(var50);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic56$, var50);
                try {
                    var52 = module0589.f35977(f36154(var49), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                catch (Throwable var54) {
                    Errors.handleThrowable(var54, (SubLObject)NIL);
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
        if (NIL != var51) {
            module0229.f15259();
        }
        else if (!var52.isString()) {
            module0229.f15259();
        }
        else if (NIL != Sequences.find((SubLObject)$ic191$, var52, Symbols.symbol_function((SubLObject)$ic192$), Symbols.symbol_function((SubLObject)$ic193$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        else {
            if (NIL != module0039.f3008(var52) && NIL != Sequences.search((SubLObject)$ic194$, var52, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return module0208.f13538(module0039.f3052(var52));
            }
            return var52;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36234(final SubLObject var9) {
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        if (Sequences.length(var9).numG((SubLObject)TWO_INTEGER)) {
            var11 = f36235(conses_high.cddr(var9));
        }
        if (NIL != var11) {
            final SubLObject var12 = (SubLObject)(conses_high.cadr(var9).eql((SubLObject)$ic176$) ? $ic196$ : conses_high.cadr(var9));
            SubLObject var13 = (SubLObject)NIL;
            try {
                var13 = module0004.f82(var9.first(), var12, (SubLObject)NIL, (SubLObject)$ic197$);
                if (NIL != module0003.f70(var13, var9.first(), var12)) {
                    module0589.f35885(var13, (SubLObject)ConsesLow.list(new SubLObject[] { $ic198$, var9.first(), $ic199$, conses_high.cadr(var9), $ic200$, $ic201$, $ic202$, $ic203$, $ic204$, var11, $ic205$, T, $ic206$, NIL, $ic207$, $ic176$, $ic208$, $ic176$, $ic209$, NIL }));
                    var10 = module0589.f35934(module0589.f35941(var13, (SubLObject)UNPROVIDED));
                }
            }
            finally {
                final SubLObject var14 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (NIL != var13) {
                        streams_high.close(var13, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var14);
                }
            }
        }
        else {
            final SubLObject var12 = (SubLObject)(conses_high.cadr(var9).eql((SubLObject)$ic176$) ? $ic196$ : conses_high.cadr(var9));
            SubLObject var13 = (SubLObject)NIL;
            try {
                var13 = module0004.f82(var9.first(), var12, (SubLObject)NIL, (SubLObject)$ic197$);
                if (NIL != module0003.f70(var13, var9.first(), var12)) {
                    module0589.f35885(var13, (SubLObject)ConsesLow.list(new SubLObject[] { $ic198$, var9.first(), $ic199$, conses_high.cadr(var9), $ic200$, $ic201$, $ic202$, $ic203$, $ic204$, NIL, $ic205$, T, $ic206$, NIL, $ic207$, $ic176$, $ic208$, $ic176$, $ic209$, NIL }));
                    var10 = module0589.f35934(module0589.f35941(var13, (SubLObject)UNPROVIDED));
                }
            }
            finally {
                final SubLObject var15 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (NIL != var13) {
                        streams_high.close(var13, (SubLObject)UNPROVIDED);
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
        SubLObject var361 = (SubLObject)$ic31$;
        SubLObject var362 = var360;
        SubLObject var363 = (SubLObject)NIL;
        var363 = var362.first();
        while (NIL != var362) {
            var361 = Sequences.cconcatenate(var361, new SubLObject[] { var363.isString() ? module0589.f35898(Sequences.cconcatenate((SubLObject)$ic211$, new SubLObject[] { var363, $ic211$ }), (SubLObject)UNPROVIDED) : module0589.f35898(module0038.f2624(var363), (SubLObject)UNPROVIDED), $ic212$ });
            var362 = var362.rest();
            var363 = var362.first();
        }
        return module0038.f2621(var361, (SubLObject)$ic212$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36236(final SubLObject var362) {
        final SubLObject var363 = (SubLObject)NIL;
        if (NIL != module0206.f13453(var362) && module0205.f13276(var362).eql($ic213$) && NIL != module0038.f2684(module0205.f13204(var362, (SubLObject)UNPROVIDED), (SubLObject)$ic214$) && NIL != module0038.f2673(module0205.f13204(var362, (SubLObject)UNPROVIDED), (SubLObject)$ic215$, (SubLObject)UNPROVIDED)) {
            return module0038.f2623(module0205.f13204(var362, (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER, Numbers.subtract(Sequences.length(module0205.f13204(var362, (SubLObject)UNPROVIDED)), (SubLObject)ONE_INTEGER));
        }
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36237(final SubLObject var356, final SubLObject var363) {
        if (!var356.isString()) {
            module0229.f15259();
        }
        SubLObject var364 = (SubLObject)NIL;
        SubLObject var365 = (SubLObject)NIL;
        var364 = module0731.f44808(var356, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var365) {
            SubLObject var366 = var364;
            SubLObject var367 = (SubLObject)NIL;
            var367 = var366.first();
            while (NIL == var365 && NIL != var366) {
                if (NIL != module0259.f16891(var367, $ic217$) && NIL != f36238(var367, var363)) {
                    var365 = var367;
                }
                var366 = var366.rest();
                var367 = var366.first();
            }
        }
        return (NIL != var365) ? var365 : module0205.f13327((SubLObject)ConsesLow.list($ic218$, var356, var363));
    }
    
    public static SubLObject f36238(final SubLObject var367, final SubLObject var368) {
        final SubLThread var369 = SubLProcess.currentSubLThread();
        final SubLObject var370 = module0147.$g2095$.getDynamicValue(var369);
        SubLObject var371 = (SubLObject)NIL;
        final SubLObject var372 = module0145.$g1942$.currentBinding(var369);
        try {
            module0145.$g1942$.bind((SubLObject)T, var369);
            var371 = module0540.f33526(module0409.f28506((SubLObject)ConsesLow.list($ic186$, var368, var367), var370, (SubLObject)$ic220$));
        }
        finally {
            module0145.$g1942$.rebind(var372, var369);
        }
        return var371;
    }
    
    public static SubLObject f36239(final SubLObject var370) {
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36240(final SubLObject var371) {
        if (NIL == module0202.f12674(var371)) {
            module0229.f15259();
        }
        return module0202.f12751(var371);
    }
    
    public static SubLObject f36241(final SubLObject var372) {
        final SubLThread var373 = SubLProcess.currentSubLThread();
        SubLObject var374 = (SubLObject)NIL;
        SubLObject var375 = (SubLObject)NIL;
        try {
            var373.throwStack.push($ic223$);
            final SubLObject var376 = Errors.$error_handler$.currentBinding(var373);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic224$), var373);
                try {
                    final SubLObject var377 = module0347.f23344((SubLObject)$ic225$, (SubLObject)ConsesLow.listS($ic226$, var372, (SubLObject)$ic227$), module0147.f9551(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
                    final SubLObject var378 = module0347.f23344((SubLObject)$ic228$, (SubLObject)ConsesLow.listS($ic229$, var372, (SubLObject)$ic230$), module0147.f9551(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
                    var374 = (SubLObject)((NIL != var377 && NIL != var378) ? f36242(var377, var378) : NIL);
                }
                catch (Throwable var379) {
                    Errors.handleThrowable(var379, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var376, var373);
            }
        }
        catch (Throwable var380) {
            var375 = Errors.handleThrowable(var380, (SubLObject)$ic223$);
        }
        finally {
            var373.throwStack.pop();
        }
        if (NIL == module0202.f12674(var374)) {
            module0229.f15259();
        }
        return var374;
    }
    
    public static SubLObject f36243(final SubLObject var376, final SubLObject var377) {
        final SubLThread var378 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0347.f23334(module0202.f12768($g4512$.getDynamicValue(var378), var376, var377), module0147.f9551(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36242(final SubLObject var374, final SubLObject var375) {
        final SubLThread var376 = SubLProcess.currentSubLThread();
        final SubLObject var377 = module0347.f23344((SubLObject)$ic232$, (SubLObject)ConsesLow.list($ic233$, (SubLObject)$ic232$, var374), module0147.f9551(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var378 = (SubLObject)NIL;
        final SubLObject var379 = $g4512$.currentBinding(var376);
        try {
            $g4512$.bind(var375, var376);
            final SubLObject var380 = Sort.sort(var377, (SubLObject)$ic234$, (SubLObject)UNPROVIDED);
            var378 = module0202.f12787(var380, (SubLObject)UNPROVIDED);
        }
        finally {
            $g4512$.rebind(var379, var376);
        }
        return var378;
    }
    
    public static SubLObject f36244(final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        SubLObject var55 = (SubLObject)NIL;
        SubLObject var56 = (SubLObject)NIL;
        try {
            var54.throwStack.push($ic223$);
            final SubLObject var57 = Errors.$error_handler$.currentBinding(var54);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic224$), var54);
                try {
                    final SubLObject var58 = Numbers.add(var53, module0612.$g4513$.getGlobalValue());
                    var55 = module0612.f37426(var58);
                }
                catch (Throwable var59) {
                    Errors.handleThrowable(var59, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var57, var54);
            }
        }
        catch (Throwable var60) {
            var56 = Errors.handleThrowable(var60, (SubLObject)$ic223$);
        }
        finally {
            var54.throwStack.pop();
        }
        if (NIL == var55) {
            module0229.f15259();
        }
        return var55;
    }
    
    public static SubLObject f36245(final SubLObject var382) {
        final SubLThread var383 = SubLProcess.currentSubLThread();
        SubLObject var384 = (SubLObject)NIL;
        SubLObject var385 = (SubLObject)NIL;
        try {
            var383.throwStack.push($ic223$);
            final SubLObject var386 = Errors.$error_handler$.currentBinding(var383);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic224$), var383);
                try {
                    var384 = Numbers.subtract(module0612.f37427(var382), module0612.$g4513$.getGlobalValue());
                }
                catch (Throwable var387) {
                    Errors.handleThrowable(var387, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var386, var383);
            }
        }
        catch (Throwable var388) {
            var385 = Errors.handleThrowable(var388, (SubLObject)$ic223$);
        }
        finally {
            var383.throwStack.pop();
        }
        if (NIL == var384) {
            module0229.f15259();
        }
        return var384;
    }
    
    public static SubLObject f36246(final SubLObject var384, final SubLObject var385) {
        return module0202.f12787(f36247(var384, var385, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36247(final SubLObject var384, SubLObject var385, SubLObject var386, SubLObject var387) {
        if (var385 == UNPROVIDED) {
            var385 = (SubLObject)TEN_INTEGER;
        }
        if (var386 == UNPROVIDED) {
            var386 = (SubLObject)NIL;
        }
        if (var387 == UNPROVIDED) {
            var387 = (SubLObject)NIL;
        }
        assert NIL != f36248(var384) : var384;
        assert NIL != module0004.f106(var385) : var385;
        assert NIL != module0035.f2015(var386) : var386;
        assert NIL != module0035.f2015(var387) : var387;
        final SubLObject var388 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        SubLObject var389 = module0260.f17033($ic243$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var390 = (SubLObject)NIL;
        var390 = var389.first();
        while (NIL != var389) {
            SubLObject var391 = (SubLObject)NIL;
            final SubLObject var392 = var390;
            if (NIL != module0158.f10010(var384, (SubLObject)TWO_INTEGER, var392)) {
                final SubLObject var393 = module0158.f10011(var384, (SubLObject)TWO_INTEGER, var392);
                SubLObject var394 = (SubLObject)NIL;
                final SubLObject var395 = (SubLObject)NIL;
                while (NIL == var394) {
                    final SubLObject var396 = module0052.f3695(var393, var395);
                    final SubLObject var397 = (SubLObject)makeBoolean(!var395.eql(var396));
                    if (NIL != var397) {
                        SubLObject var398 = (SubLObject)NIL;
                        try {
                            var398 = module0158.f10316(var396, (SubLObject)$ic241$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var393_398 = (SubLObject)NIL;
                            final SubLObject var394_399 = (SubLObject)NIL;
                            while (NIL == var393_398) {
                                final SubLObject var400_401 = module0052.f3695(var398, var394_399);
                                final SubLObject var396_402 = (SubLObject)makeBoolean(!var394_399.eql(var400_401));
                                if (NIL != var396_402) {
                                    var391 = module0178.f11331(var400_401, (SubLObject)ONE_INTEGER);
                                    if (NIL != assertion_handles_oc.f11035(var391)) {
                                        final SubLObject var399 = module0178.f11332(var391);
                                        if (NIL != module0256.f16576(var399, $ic158$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0256.f16576(var399, $ic242$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                            final SubLObject var400 = module0178.f11335(var391);
                                            module0084.f5775(var388, var400, (SubLObject)UNPROVIDED);
                                        }
                                    }
                                }
                                var393_398 = (SubLObject)makeBoolean(NIL == var396_402);
                            }
                        }
                        finally {
                            final SubLObject var401 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var398) {
                                    module0158.f10319(var398);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var401);
                            }
                        }
                    }
                    var394 = (SubLObject)makeBoolean(NIL == var397);
                }
            }
            var389 = var389.rest();
            var390 = var389.first();
        }
        SubLObject var402 = module0084.f5795(var388, Symbols.symbol_function((SubLObject)$ic244$));
        SubLObject var403 = var386;
        SubLObject var404 = (SubLObject)NIL;
        var404 = var403.first();
        while (NIL != var403) {
            var402 = Sequences.delete(var404, var402, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic245$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var403 = var403.rest();
            var404 = var403.first();
        }
        var403 = var387;
        SubLObject var405 = (SubLObject)NIL;
        var405 = var403.first();
        while (NIL != var403) {
            var402 = module0035.delete_if_not(var405, var402, Symbols.symbol_function((SubLObject)$ic245$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var403 = var403.rest();
            var405 = var403.first();
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic245$), module0035.f2124(var385, var402));
    }
    
    public static SubLObject f36248(final SubLObject var32) {
        return module0259.f16891(var32, $ic246$);
    }
    
    public static SubLObject f36249(final SubLObject var407, final SubLObject var408) {
        SubLObject var409 = module0751.f46648(var407, (SubLObject)UNPROVIDED);
        final SubLObject var410 = module0038.f2705(var409, (SubLObject)$ic247$, (SubLObject)$ic248$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0038.f2653(var410)) {
            var409 = var410;
        }
        var409 = module0038.f2735(var409);
        SubLObject var411 = module0202.f12684(var408);
        SubLObject var412 = (SubLObject)NIL;
        var412 = var411.first();
        while (NIL != var411) {
            var409 = module0038.f2659(Sequences.cconcatenate((SubLObject)$ic249$, new SubLObject[] { var412, $ic250$ }), var412, var409, (SubLObject)UNPROVIDED);
            var411 = var411.rest();
            var412 = var411.first();
        }
        final SubLObject var413 = module0038.f2861(var409, (SubLObject)UNPROVIDED);
        final SubLObject var414 = Mapping.mapcar((SubLObject)$ic251$, var413);
        SubLObject var415 = (SubLObject)NIL;
        SubLObject var416 = (SubLObject)NIL;
        SubLObject var294_416 = (SubLObject)NIL;
        SubLObject var417 = (SubLObject)NIL;
        SubLObject var418_419 = (SubLObject)NIL;
        var416 = var413;
        var294_416 = var416.first();
        var417 = var414;
        var418_419 = var417.first();
        while (NIL != var417 || NIL != var416) {
            if (var418_419.numG((SubLObject)ZERO_INTEGER)) {
                var415 = (SubLObject)ConsesLow.cons(var294_416, var415);
            }
            var416 = var416.rest();
            var294_416 = var416.first();
            var417 = var417.rest();
            var418_419 = var417.first();
        }
        var409 = module0038.f2767(Sequences.nreverse(var415), (SubLObject)$ic252$);
        if (NIL == var409) {
            module0229.f15259();
        }
        return var409;
    }
    
    public static SubLObject f36250(final SubLObject var294) {
        return Sequences.length(module0038.f2689((SubLObject)$ic249$, var294, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36251(final SubLObject var420, final SubLObject var421) {
        return Functions.apply(Symbols.symbol_function((SubLObject)$ic254$), (SubLObject)ConsesLow.cons((SubLObject)NIL, (SubLObject)ConsesLow.cons(var420, var421)));
    }
    
    public static SubLObject f36252(final SubLObject var422) {
        if (NIL == module0206.f13450(var422)) {
            module0229.f15259();
        }
        final SubLObject var423 = module0205.f13144(var422);
        SubLObject var424 = (SubLObject)NIL;
        final SubLObject var425 = $g4514$.getGlobalValue();
        SubLObject var426 = (SubLObject)NIL;
        try {
            var426 = Locks.seize_lock(var425);
            var424 = module0067.f4884($g4515$.getGlobalValue(), var423, (SubLObject)UNPROVIDED);
            if (NIL == var424) {
                var424 = module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0067.f4886($g4515$.getGlobalValue(), var423, var424);
            }
        }
        finally {
            if (NIL != var426) {
                Locks.release_lock(var425);
            }
        }
        return module0057.f4175(var424);
    }
    
    public static SubLObject f36253(final SubLObject var422, final SubLObject var39) {
        if (NIL == module0206.f13450(var422) || !var39.isInteger() || !var39.isPositive()) {
            module0229.f15259();
        }
        final SubLObject var423 = module0205.f13144(var422);
        final SubLObject var424 = (SubLObject)ConsesLow.cons(var423, var39);
        SubLObject var425 = (SubLObject)NIL;
        final SubLObject var426 = $g4516$.getGlobalValue();
        SubLObject var427 = (SubLObject)NIL;
        try {
            var427 = Locks.seize_lock(var426);
            var425 = module0067.f4884($g4517$.getGlobalValue(), var424, (SubLObject)UNPROVIDED);
            if (NIL == var425) {
                var425 = module0057.f4173(var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0067.f4886($g4517$.getGlobalValue(), var424, var425);
            }
        }
        finally {
            if (NIL != var427) {
                Locks.release_lock(var426);
            }
        }
        return module0057.f4175(var425);
    }
    
    public static SubLObject f36254(final SubLObject var27) {
        final SubLObject var28 = Sequences.find_if((SubLObject)$ic262$, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var29 = (NIL != var28) ? f36255(var27) : var27;
        final SubLObject var30 = (SubLObject)((NIL != var29) ? Functions.apply(Symbols.symbol_function((SubLObject)$ic29$), var29) : $ic31$);
        return (NIL != var28) ? module0208.f13538(var30) : var30;
    }
    
    public static SubLObject f36255(final SubLObject var27) {
        final SubLObject var28 = conses_high.copy_list(var27);
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        var29 = var27;
        var30 = var29.first();
        for (var31 = (SubLObject)ZERO_INTEGER; NIL != var29; var29 = var29.rest(), var30 = var29.first(), var31 = Numbers.add((SubLObject)ONE_INTEGER, var31)) {
            if (NIL != module0208.f13537(var30, (SubLObject)UNPROVIDED)) {
                ConsesLow.set_nth(var31, var28, module0205.f13277(var30, (SubLObject)UNPROVIDED));
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
        if (NIL == module0269.f17710(var434) || NIL == module0269.f17710(var435)) {
            module0229.f15259();
        }
        return (SubLObject)makeBoolean(NIL == module0256.f16596(var434, var435, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0256.f16596(var435, var434, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0257.f16689(var434, var435, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36258(final SubLObject var436) {
        return module0075.f5215(var436);
    }
    
    public static SubLObject f36259(final SubLObject var437) {
        SubLObject var438 = (SubLObject)ConsesLow.list($ic120$);
        SubLObject var439 = var437.rest();
        SubLObject var440 = (SubLObject)NIL;
        var440 = var439.first();
        while (NIL != var439) {
            SubLObject var441 = (SubLObject)ConsesLow.list($ic120$);
            SubLObject var5_440 = var440.rest();
            SubLObject var442 = (SubLObject)NIL;
            var442 = var5_440.first();
            while (NIL != var5_440) {
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
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var443) && !$ic120$.eql(var442.first())) {
            Errors.error((SubLObject)$ic275$, var442);
        }
        final SubLObject var444 = module0205.f13203(var442, (SubLObject)UNPROVIDED);
        if (NIL != module0269.f17708(var444)) {
            return module0205.f13207(var442, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0269.f17706(var444)) {
            return module0205.f13207(var442, (SubLObject)UNPROVIDED);
        }
        return var442;
    }
    
    public static SubLObject f36261(final SubLObject var443) {
        final SubLThread var444 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12598(var443)) {
            var444.resetMultipleValues();
            final SubLObject var445 = module0202.f12796(var443);
            final SubLObject var446 = var444.secondMultipleValue();
            final SubLObject var447 = var444.thirdMultipleValue();
            var444.resetMultipleValues();
            SubLObject var448 = f36262(var445, var446, var447);
            if (NIL == var448 && NIL != module0202.f12659(var446)) {
                final SubLObject var449 = var445;
                if (var449.eql($ic158$)) {
                    final SubLObject var450 = module0226.f14990(module0205.f13366(var446), (SubLObject)UNPROVIDED);
                    var448 = module0256.f16604(var447, var450, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else if (var449.eql($ic276$)) {
                    final SubLObject var450 = module0226.f14996(module0205.f13366(var446), (SubLObject)UNPROVIDED);
                    var448 = module0256.f16604(var447, var450, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            return var448;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36262(final SubLObject var6, final SubLObject var444, final SubLObject var323) {
        final SubLThread var445 = SubLProcess.currentSubLThread();
        final SubLObject var446 = module0144.$g1870$.currentBinding(var445);
        try {
            module0144.$g1870$.bind((SubLObject)NIL, var445);
            if (var6.eql($ic158$)) {
                return module0305.f20414(var323, var444, (SubLObject)UNPROVIDED);
            }
            if (var6.eql($ic276$)) {
                return module0305.f20423(var323, var444, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0144.$g1870$.rebind(var446, var445);
        }
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36264() {
        $g4506$ = SubLFiles.deflexical("S#39962", (SubLObject)$ic0$);
        $g4507$ = SubLFiles.deflexical("S#39963", (SubLObject)$ic52$);
        $g4508$ = SubLFiles.defparameter("S#39964", (SubLObject)NIL);
        $g4509$ = SubLFiles.deflexical("S#39965", (SubLObject)NIL);
        $g4510$ = SubLFiles.deflexical("S#39966", (SubLObject)NIL);
        $g4511$ = SubLFiles.deflexical("S#39967", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic173$)) ? $g4511$.getGlobalValue() : NIL));
        $g4512$ = SubLFiles.defparameter("S#39968", (SubLObject)NIL);
        $g4514$ = SubLFiles.deflexical("S#39969", Locks.make_lock((SubLObject)$ic256$));
        $g4515$ = SubLFiles.deflexical("S#39970", (NIL != Symbols.boundp((SubLObject)$ic257$)) ? $g4515$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g4516$ = SubLFiles.deflexical("S#39971", Locks.make_lock((SubLObject)$ic259$));
        $g4517$ = SubLFiles.deflexical("S#39972", (NIL != Symbols.boundp((SubLObject)$ic260$)) ? $g4517$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36265() {
        SubLObject var5 = $g4506$.getGlobalValue();
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            module0012.f416(var6);
            var5 = var5.rest();
            var6 = var5.first();
        }
        module0012.f416((SubLObject)$ic5$);
        module0012.f416((SubLObject)$ic7$);
        module0012.f416((SubLObject)$ic8$);
        module0012.f416((SubLObject)$ic9$);
        module0012.f416((SubLObject)$ic10$);
        module0012.f416((SubLObject)$ic12$);
        module0012.f416((SubLObject)$ic14$);
        module0012.f416((SubLObject)$ic15$);
        module0012.f416((SubLObject)$ic16$);
        module0012.f416((SubLObject)$ic17$);
        module0012.f416((SubLObject)$ic20$);
        module0012.f416((SubLObject)$ic22$);
        module0012.f416((SubLObject)$ic23$);
        module0002.f35((SubLObject)$ic24$, (SubLObject)$ic25$);
        module0012.f416((SubLObject)$ic26$);
        module0012.f416((SubLObject)$ic27$);
        module0012.f416((SubLObject)$ic30$);
        module0012.f416((SubLObject)$ic33$);
        module0012.f416((SubLObject)$ic34$);
        module0012.f416((SubLObject)$ic37$);
        module0012.f416((SubLObject)$ic38$);
        module0012.f416((SubLObject)$ic39$);
        module0012.f416((SubLObject)$ic40$);
        module0012.f416((SubLObject)$ic41$);
        module0012.f416((SubLObject)$ic42$);
        module0012.f416((SubLObject)$ic43$);
        module0012.f416((SubLObject)$ic44$);
        module0012.f416((SubLObject)$ic46$);
        module0012.f416((SubLObject)$ic47$);
        module0012.f416((SubLObject)$ic48$);
        module0012.f416((SubLObject)$ic49$);
        module0012.f416((SubLObject)$ic51$);
        module0012.f416((SubLObject)$ic53$);
        module0012.f416((SubLObject)$ic54$);
        module0012.f416((SubLObject)$ic55$);
        module0012.f416((SubLObject)$ic58$);
        module0012.f416((SubLObject)$ic59$);
        module0012.f416((SubLObject)$ic71$);
        module0012.f416((SubLObject)$ic79$);
        module0012.f416((SubLObject)$ic81$);
        module0012.f416((SubLObject)$ic84$);
        module0012.f416((SubLObject)$ic86$);
        module0012.f416((SubLObject)$ic95$);
        module0012.f416((SubLObject)$ic96$);
        module0012.f416((SubLObject)$ic101$);
        module0012.f416((SubLObject)$ic102$);
        module0012.f416((SubLObject)$ic109$);
        module0012.f416((SubLObject)$ic112$);
        module0012.f416((SubLObject)$ic113$);
        module0012.f416((SubLObject)$ic114$);
        module0012.f416((SubLObject)$ic116$);
        module0012.f416((SubLObject)$ic117$);
        module0012.f416((SubLObject)$ic118$);
        module0012.f416((SubLObject)$ic119$);
        module0012.f416((SubLObject)$ic121$);
        module0012.f416((SubLObject)$ic123$);
        module0012.f416((SubLObject)$ic124$);
        module0012.f416((SubLObject)$ic125$);
        module0012.f416((SubLObject)$ic126$);
        module0012.f416((SubLObject)$ic127$);
        module0012.f416((SubLObject)$ic129$);
        module0012.f416((SubLObject)$ic132$);
        module0012.f416((SubLObject)$ic136$);
        module0012.f416((SubLObject)$ic142$);
        module0012.f416((SubLObject)$ic143$);
        module0012.f416((SubLObject)$ic144$);
        module0012.f416((SubLObject)$ic145$);
        module0012.f416((SubLObject)$ic146$);
        module0012.f416((SubLObject)$ic147$);
        module0012.f416((SubLObject)$ic148$);
        module0012.f416((SubLObject)$ic149$);
        module0012.f416((SubLObject)$ic150$);
        module0012.f416((SubLObject)$ic151$);
        module0012.f416((SubLObject)$ic154$);
        module0012.f416((SubLObject)$ic155$);
        module0012.f416((SubLObject)$ic157$);
        module0012.f416((SubLObject)$ic164$);
        module0012.f416((SubLObject)$ic166$);
        module0012.f416((SubLObject)$ic171$);
        module0012.f416((SubLObject)$ic172$);
        module0003.f57((SubLObject)$ic173$);
        module0012.f416((SubLObject)$ic174$);
        module0034.f1895((SubLObject)$ic175$);
        module0012.f416((SubLObject)$ic178$);
        module0012.f416((SubLObject)$ic179$);
        module0012.f416((SubLObject)$ic180$);
        module0012.f416((SubLObject)$ic189$);
        module0012.f416((SubLObject)$ic190$);
        module0012.f416((SubLObject)$ic195$);
        module0012.f416((SubLObject)$ic210$);
        module0012.f416((SubLObject)$ic216$);
        module0012.f416((SubLObject)$ic219$);
        module0012.f416((SubLObject)$ic221$);
        module0012.f416((SubLObject)$ic222$);
        module0012.f416((SubLObject)$ic231$);
        module0012.f416((SubLObject)$ic235$);
        module0012.f416((SubLObject)$ic236$);
        module0012.f416((SubLObject)$ic237$);
        module0012.f416((SubLObject)$ic253$);
        module0012.f416((SubLObject)$ic255$);
        module0003.f57((SubLObject)$ic257$);
        module0012.f416((SubLObject)$ic258$);
        module0003.f57((SubLObject)$ic260$);
        module0012.f416((SubLObject)$ic261$);
        module0012.f416((SubLObject)$ic263$);
        module0027.f1449((SubLObject)$ic263$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic264$, NIL, $ic265$, NIL, $ic266$, NIL, $ic267$, $ic268$, $ic269$, T }), (SubLObject)$ic270$);
        module0012.f416((SubLObject)$ic271$);
        module0012.f416((SubLObject)$ic272$);
        module0012.f416((SubLObject)$ic273$);
        module0012.f416((SubLObject)$ic274$);
        module0012.f416((SubLObject)$ic277$);
        return (SubLObject)NIL;
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
        $g4506$ = null;
        $g4507$ = null;
        $g4508$ = null;
        $g4509$ = null;
        $g4510$ = null;
        $g4511$ = null;
        $g4512$ = null;
        $g4514$ = null;
        $g4515$ = null;
        $g4516$ = null;
        $g4517$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTED-WHEN"));
        $ic1$ = makeSymbol("S#12274", "CYC");
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("evaluationDefn"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("EvaluatablePredicate"));
        $ic5$ = makeSymbol("CYC-TRUE-SUBL");
        $ic6$ = makeKeyword("UNKNOWN");
        $ic7$ = makeSymbol("CYC-DIFFERENT");
        $ic8$ = makeSymbol("CYC-DIFFERENT-SYMBOLS");
        $ic9$ = makeSymbol("CYC-STRING-PRECEDES");
        $ic10$ = makeSymbol("CYC-STRING-PRECEDES-CASE-INSENSITIVE");
        $ic11$ = makeSymbol("CHAR=");
        $ic12$ = makeSymbol("CYC-SUBSTRING-PREDICATE");
        $ic13$ = makeSymbol("CHAR-EQUAL");
        $ic14$ = makeSymbol("CYC-SUBSTRING-CASE-INSENSITIVE-PREDICATE");
        $ic15$ = makeSymbol("CYC-PREFIX-SUBSTRING");
        $ic16$ = makeSymbol("CYC-SUFFIX-SUBSTRING");
        $ic17$ = makeSymbol("CYC-SUBWORD-PREDICATE");
        $ic18$ = makeString("Could not find constant ~A.");
        $ic19$ = makeString("Arg1 of #$FindConstantFn must be a string: ~A.");
        $ic20$ = makeSymbol("CYC-FIND-CONSTANT");
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("EvaluatableFunction"));
        $ic22$ = makeSymbol("CYC-EVALUATE-SUBL");
        $ic23$ = makeSymbol("CYC-STRING-UPCASE");
        $ic24$ = makeSymbol("S#39920", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("CYC-STRING-UPCASE"));
        $ic26$ = makeSymbol("CYC-STRING-DOWNCASE");
        $ic27$ = makeSymbol("CYC-SUBSTRING");
        $ic28$ = makeSymbol("STRINGP");
        $ic29$ = makeSymbol("CCONCATENATE");
        $ic30$ = makeSymbol("CYC-STRING-CONCAT");
        $ic31$ = makeString("");
        $ic32$ = makeString(" ");
        $ic33$ = makeSymbol("CYC-STRINGS-TO-PHRASE");
        $ic34$ = makeSymbol("CYC-PRE-REMOVE");
        $ic35$ = makeInteger(128);
        $ic36$ = makeSymbol("<=");
        $ic37$ = makeSymbol("CYC-REPLACE-SUBSTRING");
        $ic38$ = makeSymbol("CYC-UNIQUE-WS");
        $ic39$ = makeSymbol("GENERATE-NAMES-FOR-TERM");
        $ic40$ = makeSymbol("CYC-REMOVE-SUBSTRING");
        $ic41$ = makeSymbol("CYC-POST-REMOVE");
        $ic42$ = makeSymbol("CYC-TRIM-WHITESPACE");
        $ic43$ = makeSymbol("CYC-STRING-SEARCH");
        $ic44$ = makeSymbol("CYC-LENGTH");
        $ic45$ = makeString(",");
        $ic46$ = makeSymbol("CYC-STRING-TO-INTEGER");
        $ic47$ = makeSymbol("CYC-INTEGER-TO-STRING");
        $ic48$ = makeSymbol("CYC-STRINGIFY-FN");
        $ic49$ = makeSymbol("CYC-STRING-TO-REAL-NUMBER");
        $ic50$ = makeSymbol("DOUBLE-FLOAT");
        $ic51$ = makeSymbol("CYC-REAL-NUMBER-TO-STRING");
        $ic52$ = makeInteger(1000);
        $ic53$ = makeSymbol("CYC-STRING-TOKENIZE");
        $ic54$ = makeSymbol("CYC-STRING-TO-NTH-CODE-POINT");
        $ic55$ = makeSymbol("CYC-HTTP-URL-ENCODE");
        $ic56$ = makeSymbol("S#38", "CYC");
        $ic57$ = makeSymbol("S#5859", "CYC");
        $ic58$ = makeSymbol("CYC-XML-VALUE-STRING");
        $ic59$ = makeSymbol("CYC-HTTP-URL-DECODE");
        $ic60$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("S#1519", "CYC"), makeSymbol("CLASS"), makeSymbol("S#894", "CYC"), makeSymbol("S#895", "CYC"), makeSymbol("S#896", "CYC"), makeSymbol("S#1549", "CYC"), makeSymbol("S#1550", "CYC"), makeSymbol("S#1560", "CYC") });
        $ic61$ = ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("CLASS"), (SubLObject)makeKeyword("ISMAP"), (SubLObject)makeKeyword("HEIGHT"), (SubLObject)makeKeyword("WIDTH"), (SubLObject)makeKeyword("ALT"), (SubLObject)makeKeyword("ALIGN"), (SubLObject)makeKeyword("BORDER"));
        $ic62$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic63$ = makeKeyword("ID");
        $ic64$ = makeKeyword("CLASS");
        $ic65$ = makeKeyword("ISMAP");
        $ic66$ = makeKeyword("HEIGHT");
        $ic67$ = makeKeyword("WIDTH");
        $ic68$ = makeKeyword("ALT");
        $ic69$ = makeKeyword("ALIGN");
        $ic70$ = makeKeyword("BORDER");
        $ic71$ = makeSymbol("CYC-HTML-IMAGE");
        $ic72$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("S#1577", "CYC"), makeSymbol("S#1584", "CYC"), makeSymbol("S#1585", "CYC"), makeSymbol("S#1550", "CYC"), makeSymbol("S#1586", "CYC"), makeSymbol("S#1582", "CYC"), makeSymbol("S#896", "CYC"), makeSymbol("S#895", "CYC"), makeSymbol("S#1519", "CYC") });
        $ic73$ = ConsesLow.list(new SubLObject[] { makeKeyword("NOWRAP"), makeKeyword("COLSPAN"), makeKeyword("ROWSPAN"), makeKeyword("ALIGN"), makeKeyword("VALIGN"), makeKeyword("BGCOLOR"), makeKeyword("WIDTH"), makeKeyword("HEIGHT"), makeKeyword("ID") });
        $ic74$ = makeKeyword("NOWRAP");
        $ic75$ = makeKeyword("COLSPAN");
        $ic76$ = makeKeyword("ROWSPAN");
        $ic77$ = makeKeyword("VALIGN");
        $ic78$ = makeKeyword("BGCOLOR");
        $ic79$ = makeSymbol("CYC-HTML-TABLE-DATA");
        $ic80$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#6511", "CYC"), (SubLObject)makeSymbol("S#1525", "CYC"));
        $ic81$ = makeSymbol("CYC-HTML-TABLE-DATA-VARIABLE-ARITY");
        $ic82$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#1550", "CYC"), (SubLObject)makeSymbol("S#1586", "CYC"), (SubLObject)makeSymbol("S#1582", "CYC"), (SubLObject)makeSymbol("S#895", "CYC"));
        $ic83$ = ConsesLow.list((SubLObject)makeKeyword("ALIGN"), (SubLObject)makeKeyword("VALIGN"), (SubLObject)makeKeyword("BGCOLOR"), (SubLObject)makeKeyword("HEIGHT"));
        $ic84$ = makeSymbol("CYC-HTML-TABLE-ROW");
        $ic85$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#6511", "CYC"), (SubLObject)makeSymbol("S#1625", "CYC"));
        $ic86$ = makeSymbol("CYC-HTML-TABLE-ROW-VARIABLE-ARITY");
        $ic87$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("S#1576", "CYC"), makeSymbol("S#1577", "CYC"), makeSymbol("S#1550", "CYC"), makeSymbol("S#1560", "CYC"), makeSymbol("S#1578", "CYC"), makeSymbol("S#1579", "CYC"), makeSymbol("S#1580", "CYC"), makeSymbol("S#1581", "CYC"), makeSymbol("S#1582", "CYC"), makeSymbol("S#896", "CYC"), makeSymbol("S#1583", "CYC") });
        $ic88$ = ConsesLow.list(new SubLObject[] { makeKeyword("NOFLOW"), makeKeyword("NOWRAP"), makeKeyword("ALIGN"), makeKeyword("BORDER"), makeKeyword("CELLPADDING"), makeKeyword("CELLSPACING"), makeKeyword("COLSPEC"), makeKeyword("UNITS"), makeKeyword("BGCOLOR"), makeKeyword("WIDTH"), makeKeyword("BACKGROUND") });
        $ic89$ = makeKeyword("NOFLOW");
        $ic90$ = makeKeyword("CELLPADDING");
        $ic91$ = makeKeyword("CELLSPACING");
        $ic92$ = makeKeyword("COLSPEC");
        $ic93$ = makeKeyword("UNITS");
        $ic94$ = makeKeyword("BACKGROUND");
        $ic95$ = makeSymbol("CYC-HTML-TABLE");
        $ic96$ = makeSymbol("CYC-HTML-TABLE-VARIABLE-ARITY");
        $ic97$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("CLASS"), (SubLObject)makeSymbol("S#1520", "CYC"), (SubLObject)makeSymbol("S#1513", "CYC"));
        $ic98$ = ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("CLASS"), (SubLObject)makeKeyword("STYLE"), (SubLObject)makeKeyword("ONLOAD"));
        $ic99$ = makeKeyword("STYLE");
        $ic100$ = makeKeyword("ONLOAD");
        $ic101$ = makeSymbol("CYC-HTML-DIVISION");
        $ic102$ = makeSymbol("CYC-HTML-DIVISION-VARIABLE-ARITY");
        $ic103$ = ConsesLow.list((SubLObject)makeSymbol("S#39973", "CYC"), (SubLObject)makeSymbol("S#39974", "CYC"));
        $ic104$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SubLQuoteFn")), (SubLObject)makeKeyword("ANYTHING"));
        $ic105$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Percent")), (SubLObject)makeKeyword("ANYTHING"));
        $ic106$ = makeString("%");
        $ic107$ = makeSymbol("S#39931", "CYC");
        $ic108$ = constant_handles_oc.f8479((SubLObject)makeString("URLFn"));
        $ic109$ = makeSymbol("CYC-CONTEXTUAL-URL");
        $ic110$ = ConsesLow.list((SubLObject)Characters.CHAR_less);
        $ic111$ = ConsesLow.list((SubLObject)Characters.CHAR_greater);
        $ic112$ = makeSymbol("CYC-TERM-FROM-SPARQL-URI");
        $ic113$ = makeSymbol("OPEN-CYC-URI-FOR-TERM");
        $ic114$ = makeSymbol("CANONICAL-URI-FOR-TERM");
        $ic115$ = constant_handles_oc.f8479((SubLObject)makeString("ResourceWithURIFn"));
        $ic116$ = makeSymbol("CYC-REMOVE-HTML-TAGS");
        $ic117$ = makeSymbol("CYC-CAPITALIZE-SMART");
        $ic118$ = makeSymbol("CYC-RECAPITALIZE-SMART");
        $ic119$ = makeSymbol("CYC-RELATION-ARG");
        $ic120$ = constant_handles_oc.f8479((SubLObject)makeString("TheList"));
        $ic121$ = makeSymbol("CYC-RELATION-ARGS-LIST");
        $ic122$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic123$ = makeSymbol("CYC-RELATION-ARG-SET");
        $ic124$ = makeSymbol("CYC-QUOTED-RELATION-EXPRESSION-ARITY");
        $ic125$ = makeSymbol("CYC-RELATION-EXPRESSION-ARITY");
        $ic126$ = makeSymbol("CYC-IDENTITY");
        $ic127$ = makeSymbol("CYC-RELATION-TUPLES");
        $ic128$ = constant_handles_oc.f8479((SubLObject)makeString("Kappa"));
        $ic129$ = makeSymbol("CYC-SUBSTITUTE-FORMULA");
        $ic130$ = makeSymbol("S#39936", "CYC");
        $ic131$ = makeSymbol("S#39937", "CYC");
        $ic132$ = makeSymbol("CYC-BILATERAL-FORM-OF-SENTENCE-LEFT");
        $ic133$ = constant_handles_oc.f8479((SubLObject)makeString("SymmetricAnatomicalPartType"));
        $ic134$ = constant_handles_oc.f8479((SubLObject)makeString("LeftObjectOfPairFn"));
        $ic135$ = makeSymbol("S#39939", "CYC");
        $ic136$ = makeSymbol("CYC-BILATERAL-FORM-OF-SENTENCE-RIGHT");
        $ic137$ = constant_handles_oc.f8479((SubLObject)makeString("RightObjectOfPairFn"));
        $ic138$ = makeSymbol("S#39941", "CYC");
        $ic139$ = makeSymbol("NAT-ARG1");
        $ic140$ = makeSymbol("?SIDEFN");
        $ic141$ = constant_handles_oc.f8479((SubLObject)makeString("Quote"));
        $ic142$ = makeSymbol("CYC-SUBSTITUTE-FORMULA-ARG");
        $ic143$ = makeSymbol("CYC-SUBSTITUTE-FORMULA-ARG-POSITION");
        $ic144$ = makeSymbol("CYC-MAKE-FORMULA");
        $ic145$ = makeSymbol("CYC-SUBSTITUTE-QUOTED-FORMULA-ARG");
        $ic146$ = makeSymbol("CYC-SUBSTITUTE-QUOTED-FORMULA-ARG-POSITION");
        $ic147$ = makeSymbol("CYC-MAKE-QUOTED-FORMULA");
        $ic148$ = makeSymbol("CYCL-TO-EL-FN");
        $ic149$ = makeSymbol("CYC-SUBSTITUTE-NLTE");
        $ic150$ = makeSymbol("SEM-TRANS-TEMPLATE-DEFN");
        $ic151$ = makeSymbol("CYC-WORD-STRINGS");
        $ic152$ = makeString("WordStringsFn");
        $ic153$ = makeString("WordSequenceFn");
        $ic154$ = makeSymbol("CYC-STRINGS-OF-WORD-SEQUENCE");
        $ic155$ = makeSymbol("CYC-INSTANTIATE");
        $ic156$ = ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER);
        $ic157$ = makeSymbol("CYC-FIND-OR-INSTANTIATE");
        $ic158$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic159$ = makeSymbol("?OBJ");
        $ic160$ = constant_handles_oc.f8479((SubLObject)makeString("TheSetOf"));
        $ic161$ = constant_handles_oc.f8479((SubLObject)makeString("definingMt"));
        $ic162$ = constant_handles_oc.f8479((SubLObject)makeString("resultIsa"));
        $ic163$ = makeSymbol("S#39948", "CYC");
        $ic164$ = makeSymbol("CYC-INDIVIDUAL-DENOTING-UNARY-FUNCTION-FOR");
        $ic165$ = constant_handles_oc.f8479((SubLObject)makeString("resultGenl"));
        $ic166$ = makeSymbol("CYC-COLLECTION-DENOTING-UNARY-FUNCTION-FOR");
        $ic167$ = makeSymbol("S#39947", "CYC");
        $ic168$ = makeSymbol("SKOLEM-FUNCTION?");
        $ic169$ = constant_handles_oc.f8479((SubLObject)makeString("UnaryFunction"));
        $ic170$ = constant_handles_oc.f8479((SubLObject)makeString("IndividualDenotingFunction"));
        $ic171$ = makeSymbol("CYC-EL-VARIABLE-FN");
        $ic172$ = makeSymbol("CYC-ADD-ENGLISH-SUFFIX");
        $ic173$ = makeSymbol("S#39967", "CYC");
        $ic174$ = makeSymbol("GENERATE-PHRASE-DEFN");
        $ic175$ = makeSymbol("S#39950", "CYC");
        $ic176$ = makeKeyword("DEFAULT");
        $ic177$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic178$ = makeSymbol("BEST-STRING-OF-NL-PHRASE-DEFN");
        $ic179$ = makeSymbol("GENERATE-GKE-GLOSS-WRT-MT");
        $ic180$ = makeSymbol("BASIC-DATUM-PARAPHRASE-DEFN");
        $ic181$ = makeKeyword("IGNORE");
        $ic182$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("BestNLPhraseOfStringFn")), (SubLObject)makeString(","));
        $ic183$ = constant_handles_oc.f8479((SubLObject)makeString("TermParaphraseFn-Constrained"));
        $ic184$ = constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic"));
        $ic185$ = constant_handles_oc.f8479((SubLObject)makeString("ConcatenatePhrasesFn"));
        $ic186$ = constant_handles_oc.f8479((SubLObject)makeString("geopoliticalSubdivision"));
        $ic187$ = constant_handles_oc.f8479((SubLObject)makeString("State-UnitedStates"));
        $ic188$ = constant_handles_oc.f8479((SubLObject)makeString("CanadianProvince"));
        $ic189$ = makeSymbol("STATE-OR-PROVINCE-FOR-CITY-DEFN");
        $ic190$ = makeSymbol("CYC-HTML-URL-ENCODE");
        $ic191$ = makeInteger(255);
        $ic192$ = makeSymbol("<");
        $ic193$ = makeSymbol("CHAR-CODE");
        $ic194$ = makeString("charset=utf-8");
        $ic195$ = makeSymbol("CYC-URL-SOURCE");
        $ic196$ = makeInteger(80);
        $ic197$ = makeKeyword("PRIVATE");
        $ic198$ = makeKeyword("MACHINE");
        $ic199$ = makeKeyword("PORT");
        $ic200$ = makeKeyword("METHOD");
        $ic201$ = makeKeyword("GET");
        $ic202$ = makeKeyword("URL");
        $ic203$ = makeString("simple-http-get");
        $ic204$ = makeKeyword("QUERY");
        $ic205$ = makeKeyword("KEEP-ALIVE?");
        $ic206$ = makeKeyword("WIDE-NEWLINES?");
        $ic207$ = makeKeyword("ACCEPT-TYPES");
        $ic208$ = makeKeyword("CONTENT-TYPE");
        $ic209$ = makeKeyword("SOAP-ACTION-URI");
        $ic210$ = makeSymbol("CYC-GET-FROM-HTTP-SOURCE");
        $ic211$ = makeString("\"");
        $ic212$ = makeString("&");
        $ic213$ = constant_handles_oc.f8479((SubLObject)makeString("SchemaObjectFn"));
        $ic214$ = makeString("<");
        $ic215$ = makeString(">");
        $ic216$ = makeSymbol("CYC-TERM-URI-FN");
        $ic217$ = constant_handles_oc.f8479((SubLObject)makeString("City"));
        $ic218$ = constant_handles_oc.f8479((SubLObject)makeString("CityNamedFn"));
        $ic219$ = makeSymbol("CITY-NAMED-FN-DEFN");
        $ic220$ = ConsesLow.list((SubLObject)makeKeyword("ALLOWED-MODULES"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("MODULE-SUBTYPE"), (SubLObject)makeKeyword("SKSI"))));
        $ic221$ = makeSymbol("TEXT-TOPIC-STRUCTURE");
        $ic222$ = makeSymbol("EL-LIST-TO-SUBL-LIST");
        $ic223$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic224$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic225$ = makeKeyword("BASE-SET");
        $ic226$ = constant_handles_oc.f8479((SubLObject)makeString("baseSet"));
        $ic227$ = ConsesLow.list((SubLObject)makeKeyword("BASE-SET"));
        $ic228$ = makeKeyword("ORDERING-RELATION");
        $ic229$ = constant_handles_oc.f8479((SubLObject)makeString("orderingRelation"));
        $ic230$ = ConsesLow.list((SubLObject)makeKeyword("ORDERING-RELATION"));
        $ic231$ = makeSymbol("CYC-ORDERING-RESULT");
        $ic232$ = makeKeyword("ELEMENT");
        $ic233$ = constant_handles_oc.f8479((SubLObject)makeString("elementOf"));
        $ic234$ = makeSymbol("S#39954", "CYC");
        $ic235$ = makeSymbol("CYC-SECONDS-SINCE-1970-TO-DATE");
        $ic236$ = makeSymbol("CYC-DATE-TO-SECONDS-SINCE-1970");
        $ic237$ = makeSymbol("CYC-TYPES-MOST-OFTEN-ASSERTED-USING-TOOL");
        $ic238$ = makeSymbol("S#39957", "CYC");
        $ic239$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic240$ = makeSymbol("S#747", "CYC");
        $ic241$ = makeKeyword("GAF");
        $ic242$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic243$ = constant_handles_oc.f8479((SubLObject)makeString("assertedUsingTool"));
        $ic244$ = makeSymbol(">");
        $ic245$ = makeSymbol("CAR");
        $ic246$ = constant_handles_oc.f8479((SubLObject)makeString("AssertionGeneratingRKFTool"));
        $ic247$ = makeString("<TEXT>");
        $ic248$ = makeString("</TEXT>");
        $ic249$ = makeString("<b>");
        $ic250$ = makeString("</b>");
        $ic251$ = makeSymbol("S#39958", "CYC");
        $ic252$ = makeString(" ... ");
        $ic253$ = makeSymbol("CYC-HTML-FOR-TEXT-CONTAINING-STRINGS");
        $ic254$ = makeSymbol("FORMAT");
        $ic255$ = makeSymbol("CYC-FORMAT");
        $ic256$ = makeString("term -> isg table lock");
        $ic257$ = makeSymbol("S#39970", "CYC");
        $ic258$ = makeSymbol("CYC-NEXT-INTEGER-IN-SEQUENCE");
        $ic259$ = makeString("term -> isg w/ start table lock");
        $ic260$ = makeSymbol("S#39972", "CYC");
        $ic261$ = makeSymbol("CYC-NEXT-INTEGER-IN-SEQUENCE-STARTING-AT");
        $ic262$ = makeSymbol("S#16379", "CYC");
        $ic263$ = makeSymbol("CYC-CONCATENATE-STRINGS");
        $ic264$ = makeKeyword("TEST");
        $ic265$ = makeKeyword("OWNER");
        $ic266$ = makeKeyword("CLASSES");
        $ic267$ = makeKeyword("KB");
        $ic268$ = makeKeyword("FULL");
        $ic269$ = makeKeyword("WORKING?");
        $ic270$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("foo"), (SubLObject)makeString("bar"))), (SubLObject)makeString("foobar")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("UnicodeStringFn")), (SubLObject)makeString("for debts not exceeding &ua3;5,000")), (SubLObject)makeString(" or more"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("UnicodeStringFn")), (SubLObject)makeString("for debts not exceeding &ua3;5,000 or more"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("as well as "), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("UnicodeStringFn")), (SubLObject)makeString("for debts not exceeding &ua3;5,000")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("UnicodeStringFn")), (SubLObject)makeString("as well as for debts not exceeding &ua3;5,000"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("UnicodeStringFn")), (SubLObject)makeString("for debts not exceeding &ua3;5,000")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("UnicodeStringFn")), (SubLObject)makeString(" or &ua3;6,000")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("UnicodeStringFn")), (SubLObject)makeString("for debts not exceeding &ua3;5,000 or &ua3;6,000"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("&quot;"), (SubLObject)makeString("US Designates Al Akhtar Trust"), (SubLObject)makeString("&quot;"))), (SubLObject)makeString("&quot;US Designates Al Akhtar Trust&quot;")));
        $ic271$ = makeSymbol("CYC-TERM-SIMILARITY-METRIC");
        $ic272$ = makeSymbol("CYC-KB-ORTHOGONAL");
        $ic273$ = makeSymbol("CYC-CONTENT-OF-FILE");
        $ic274$ = makeSymbol("CYC-TRANSFORM-RELATION-TUPLES");
        $ic275$ = makeString("~a doesn't start with #$TheList");
        $ic276$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic277$ = makeSymbol("CYC-PROVABLE-VIA-DEFNS");
    }
    
    public static final class $f36115$UnaryFunction extends UnaryFunction
    {
        public $f36115$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-DIFFERENT"));
        }
        
        public SubLObject processItem(final SubLObject var11) {
            return f36115(var11);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2298 ms
	
	Decompiled with Procyon 0.5.32.
*/
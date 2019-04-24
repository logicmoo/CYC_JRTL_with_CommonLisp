package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0034 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0034";
    public static final String myFingerPrint = "95268657594caeb6ece1263dd6740ce3683358c34bcd2ac53c393c4abb2dc084";
    public static SubLSymbol $g869$;
    public static SubLSymbol $g870$;
    private static SubLSymbol $g871$;
    private static SubLSymbol $g872$;
    private static SubLSymbol $g873$;
    public static SubLSymbol $g874$;
    public static SubLSymbol $g875$;
    public static SubLSymbol $g876$;
    public static SubLSymbol $g877$;
    public static SubLSymbol $g878$;
    public static SubLSymbol $g879$;
    private static SubLSymbol $g880$;
    private static SubLSymbol $g881$;
    private static SubLSymbol $g882$;
    public static SubLSymbol $g883$;
    public static SubLSymbol $g884$;
    public static SubLSymbol $g885$;
    public static SubLSymbol $g886$;
    public static SubLSymbol $g887$;
    public static SubLSymbol $g888$;
    public static SubLSymbol $g889$;
    public static SubLSymbol $g890$;
    public static SubLSymbol $g891$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLInteger $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
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
    private static final SubLString $ic65$;
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
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLList $ic85$;
    private static final SubLList $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLList $ic90$;
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
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLList $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLList $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLList $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLList $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLList $ic143$;
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLList $ic148$;
    private static final SubLString $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
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
    private static final SubLList $ic166$;
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
    private static final SubLList $ic193$;
    private static final SubLList $ic194$;
    private static final SubLList $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLList $ic197$;
    private static final SubLList $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLString $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLList $ic208$;
    private static final SubLList $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLList $ic212$;
    private static final SubLList $ic213$;
    private static final SubLList $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLString $ic224$;
    private static final SubLString $ic225$;
    private static final SubLString $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLString $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLSymbol $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLList $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLList $ic245$;
    private static final SubLList $ic246$;
    private static final SubLString $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLList $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLList $ic257$;
    private static final SubLList $ic258$;
    private static final SubLList $ic259$;
    private static final SubLList $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLList $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLString $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLList $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLList $ic271$;
    private static final SubLList $ic272$;
    private static final SubLString $ic273$;
    
    
    public static SubLObject f1765(final SubLObject var1) {
        final SubLObject var2 = module0034.$g869$.getGlobalValue();
        SubLObject var3 = (SubLObject)module0034.NIL;
        try {
            var3 = ReadWriteLocks.rw_lock_seize_write_lock(var2);
            SubLObject var4 = Hashtables.gethash_without_values(var1, module0034.$g871$.getGlobalValue(), (SubLObject)module0034.ZERO_INTEGER);
            var4 = Numbers.add((SubLObject)module0034.ONE_INTEGER, var4);
            Hashtables.sethash(var1, module0034.$g871$.getGlobalValue(), var4);
        }
        finally {
            if (module0034.NIL != var3) {
                ReadWriteLocks.rw_lock_release_write_lock(var2);
            }
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1766(final SubLObject var1) {
        final SubLObject var2 = module0034.$g869$.getGlobalValue();
        SubLObject var3 = (SubLObject)module0034.NIL;
        try {
            var3 = ReadWriteLocks.rw_lock_seize_write_lock(var2);
            SubLObject var4 = Hashtables.gethash_without_values(var1, module0034.$g872$.getGlobalValue(), (SubLObject)module0034.ZERO_INTEGER);
            var4 = Numbers.add((SubLObject)module0034.ONE_INTEGER, var4);
            Hashtables.sethash(var1, module0034.$g872$.getGlobalValue(), var4);
        }
        finally {
            if (module0034.NIL != var3) {
                ReadWriteLocks.rw_lock_release_write_lock(var2);
            }
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1767() {
        final SubLObject var5 = module0034.$g869$.getGlobalValue();
        SubLObject var6 = (SubLObject)module0034.NIL;
        try {
            var6 = ReadWriteLocks.rw_lock_seize_read_lock(var5);
            SubLObject var7 = module0030.f1630(module0034.$g871$.getGlobalValue());
            SubLObject var8 = module0030.f1630(module0034.$g872$.getGlobalValue());
            var7 = Sort.sort(var7, Symbols.symbol_function((SubLObject)module0034.$ic4$), Symbols.symbol_function((SubLObject)module0034.$ic5$));
            var8 = Sort.sort(var8, Symbols.symbol_function((SubLObject)module0034.$ic4$), Symbols.symbol_function((SubLObject)module0034.$ic5$));
            SubLObject var9 = var7;
            SubLObject var10 = (SubLObject)module0034.NIL;
            var10 = var9.first();
            while (module0034.NIL != var9) {
                PrintLow.format((SubLObject)module0034.T, (SubLObject)module0034.$ic6$, var10.first(), var10.rest());
                var9 = var9.rest();
                var10 = var9.first();
            }
            var9 = var8;
            var10 = (SubLObject)module0034.NIL;
            var10 = var9.first();
            while (module0034.NIL != var9) {
                PrintLow.format((SubLObject)module0034.T, (SubLObject)module0034.$ic7$, var10.first(), var10.rest());
                var9 = var9.rest();
                var10 = var9.first();
            }
        }
        finally {
            if (module0034.NIL != var6) {
                ReadWriteLocks.rw_lock_release_read_lock(var5);
            }
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1768() {
        final SubLObject var2 = module0034.$g869$.getGlobalValue();
        SubLObject var3 = (SubLObject)module0034.NIL;
        try {
            var3 = ReadWriteLocks.rw_lock_seize_write_lock(var2);
            Hashtables.clrhash(module0034.$g871$.getGlobalValue());
            Hashtables.clrhash(module0034.$g872$.getGlobalValue());
        }
        finally {
            if (module0034.NIL != var3) {
                ReadWriteLocks.rw_lock_release_write_lock(var2);
            }
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1769(final SubLObject var11, final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var15;
        final SubLObject var14 = var15 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0034.$ic10$);
        final SubLObject var16 = var15.rest();
        var15 = var15.first();
        SubLObject var17 = (SubLObject)module0034.NIL;
        SubLObject var18 = var15;
        SubLObject var19 = (SubLObject)module0034.NIL;
        SubLObject var20_21 = (SubLObject)module0034.NIL;
        while (module0034.NIL != var18) {
            cdestructuring_bind.destructuring_bind_must_consp(var18, var14, (SubLObject)module0034.$ic10$);
            var20_21 = var18.first();
            var18 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var14, (SubLObject)module0034.$ic10$);
            if (module0034.NIL == conses_high.member(var20_21, (SubLObject)module0034.$ic11$, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED)) {
                var19 = (SubLObject)module0034.T;
            }
            if (var20_21 == module0034.$ic12$) {
                var17 = var18.first();
            }
            var18 = var18.rest();
        }
        if (module0034.NIL != var19 && module0034.NIL == var17) {
            cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)module0034.$ic10$);
        }
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0034.$ic13$, var15);
        final SubLObject var21 = (SubLObject)((module0034.NIL != var20) ? conses_high.cadr(var20) : module0034.NIL);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)module0034.$ic14$, var15);
        final SubLObject var23 = (SubLObject)((module0034.NIL != var22) ? conses_high.cadr(var22) : module0034.NIL);
        final SubLObject var24;
        var15 = (var24 = var16);
        if (module0034.NIL != var21 && module0034.NIL == Errors.$ignore_mustsP$.getDynamicValue(var13) && module0034.$ic9$ != var21) {
            Errors.error((SubLObject)module0034.$ic15$);
        }
        if (module0034.NIL != var23 && module0034.NIL == Errors.$ignore_mustsP$.getDynamicValue(var13) && module0034.$ic9$ != var23) {
            Errors.error((SubLObject)module0034.$ic16$);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic18$, ConsesLow.append((SubLObject)((module0034.NIL != var23) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic19$, var23)) : module0034.NIL), (SubLObject)((module0034.NIL != var21) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic20$, var21)) : module0034.NIL), var24, (SubLObject)module0034.NIL));
    }
    
    public static SubLObject f1770(SubLObject var25) {
        if (var25 == module0034.UNPROVIDED) {
            var25 = (SubLObject)module0034.$ic9$;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        if (module0034.NIL == Errors.$ignore_mustsP$.getDynamicValue(var26) && module0034.$ic9$ != var25) {
            Errors.error((SubLObject)module0034.$ic16$);
        }
        module0034.$g876$.setDynamicValue((SubLObject)module0034.T, var26);
        module0034.$g874$.setDynamicValue(var25, var26);
        return module0034.$g876$.getDynamicValue(var26);
    }
    
    public static SubLObject f1771(SubLObject var23) {
        if (var23 == module0034.UNPROVIDED) {
            var23 = (SubLObject)module0034.$ic9$;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (module0034.NIL == Errors.$ignore_mustsP$.getDynamicValue(var24) && module0034.$ic9$ != var23) {
            Errors.error((SubLObject)module0034.$ic15$);
        }
        module0034.$g876$.setDynamicValue((SubLObject)module0034.NIL, var24);
        module0034.$g875$.setDynamicValue(var23, var24);
        return module0034.$g876$.getDynamicValue(var24);
    }
    
    public static SubLObject f1772(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        if (module0034.NIL == module0034.$g876$.getDynamicValue(var28)) {
            return (SubLObject)module0034.T;
        }
        if (module0034.NIL == module0034.$g875$.getDynamicValue(var28)) {
            return (SubLObject)module0034.NIL;
        }
        if (module0034.$ic9$ != module0034.$g875$.getDynamicValue(var28)) {
            return module0004.f104(var27, module0034.$g875$.getDynamicValue(var28), Symbols.symbol_function((SubLObject)module0034.EQ), (SubLObject)module0034.UNPROVIDED);
        }
        if (module0034.$ic9$ == module0034.$g874$.getDynamicValue(var28)) {
            return (SubLObject)module0034.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0034.NIL == module0004.f104(var27, module0034.$g874$.getDynamicValue(var28), Symbols.symbol_function((SubLObject)module0034.EQ), (SubLObject)module0034.UNPROVIDED));
    }
    
    public static SubLObject f1773(final SubLObject var28) {
        SubLObject var29 = (SubLObject)module0034.ZERO_INTEGER;
        SubLObject var30 = (SubLObject)module0034.FOUR_INTEGER;
        SubLObject var31 = (SubLObject)module0034.$ic21$;
        SubLObject var32 = var28;
        SubLObject var33 = (SubLObject)module0034.NIL;
        var33 = var32.first();
        while (module0034.NIL != var32) {
            var30 = module0012.f603(var30);
            var31 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var33), var30), var31);
            var32 = var32.rest();
            var33 = var32.first();
        }
        var29 = var31;
        return var29;
    }
    
    public static SubLObject f1774(final SubLObject var33, final SubLObject var34, final SubLObject var35, final SubLObject var36, final SubLObject var37, final SubLObject var38, final SubLObject var39, final SubLObject var40, final SubLObject var41, final SubLObject var42) {
        SubLObject var43 = (SubLObject)module0034.ZERO_INTEGER;
        SubLObject var44 = (SubLObject)module0034.FOUR_INTEGER;
        SubLObject var45 = (SubLObject)module0034.$ic21$;
        var44 = module0012.f603(var44);
        var45 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var33), var44), var45);
        var44 = module0012.f603(var44);
        var45 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var34), var44), var45);
        var44 = module0012.f603(var44);
        var45 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var35), var44), var45);
        var44 = module0012.f603(var44);
        var45 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var36), var44), var45);
        var44 = module0012.f603(var44);
        var45 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var37), var44), var45);
        var44 = module0012.f603(var44);
        var45 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var38), var44), var45);
        var44 = module0012.f603(var44);
        var45 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var39), var44), var45);
        var44 = module0012.f603(var44);
        var45 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var40), var44), var45);
        var44 = module0012.f603(var44);
        var45 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var41), var44), var45);
        var44 = module0012.f603(var44);
        var45 = (var43 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var42), var44), var45));
        return var43;
    }
    
    public static SubLObject f1775(final SubLObject var33, final SubLObject var34, final SubLObject var35, final SubLObject var36, final SubLObject var37, final SubLObject var38, final SubLObject var39, final SubLObject var40, final SubLObject var41) {
        SubLObject var42 = (SubLObject)module0034.ZERO_INTEGER;
        SubLObject var43 = (SubLObject)module0034.FOUR_INTEGER;
        SubLObject var44 = (SubLObject)module0034.$ic21$;
        var43 = module0012.f603(var43);
        var44 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var33), var43), var44);
        var43 = module0012.f603(var43);
        var44 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var34), var43), var44);
        var43 = module0012.f603(var43);
        var44 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var35), var43), var44);
        var43 = module0012.f603(var43);
        var44 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var36), var43), var44);
        var43 = module0012.f603(var43);
        var44 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var37), var43), var44);
        var43 = module0012.f603(var43);
        var44 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var38), var43), var44);
        var43 = module0012.f603(var43);
        var44 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var39), var43), var44);
        var43 = module0012.f603(var43);
        var44 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var40), var43), var44);
        var43 = module0012.f603(var43);
        var44 = (var42 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var41), var43), var44));
        return var42;
    }
    
    public static SubLObject f1776(final SubLObject var33, final SubLObject var34, final SubLObject var35, final SubLObject var36, final SubLObject var37, final SubLObject var38, final SubLObject var39, final SubLObject var40) {
        SubLObject var41 = (SubLObject)module0034.ZERO_INTEGER;
        SubLObject var42 = (SubLObject)module0034.FOUR_INTEGER;
        SubLObject var43 = (SubLObject)module0034.$ic21$;
        var42 = module0012.f603(var42);
        var43 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var33), var42), var43);
        var42 = module0012.f603(var42);
        var43 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var34), var42), var43);
        var42 = module0012.f603(var42);
        var43 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var35), var42), var43);
        var42 = module0012.f603(var42);
        var43 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var36), var42), var43);
        var42 = module0012.f603(var42);
        var43 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var37), var42), var43);
        var42 = module0012.f603(var42);
        var43 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var38), var42), var43);
        var42 = module0012.f603(var42);
        var43 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var39), var42), var43);
        var42 = module0012.f603(var42);
        var43 = (var41 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var40), var42), var43));
        return var41;
    }
    
    public static SubLObject f1777(final SubLObject var33, final SubLObject var34, final SubLObject var35, final SubLObject var36, final SubLObject var37, final SubLObject var38, final SubLObject var39) {
        SubLObject var40 = (SubLObject)module0034.ZERO_INTEGER;
        SubLObject var41 = (SubLObject)module0034.FOUR_INTEGER;
        SubLObject var42 = (SubLObject)module0034.$ic21$;
        var41 = module0012.f603(var41);
        var42 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var33), var41), var42);
        var41 = module0012.f603(var41);
        var42 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var34), var41), var42);
        var41 = module0012.f603(var41);
        var42 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var35), var41), var42);
        var41 = module0012.f603(var41);
        var42 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var36), var41), var42);
        var41 = module0012.f603(var41);
        var42 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var37), var41), var42);
        var41 = module0012.f603(var41);
        var42 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var38), var41), var42);
        var41 = module0012.f603(var41);
        var42 = (var40 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var39), var41), var42));
        return var40;
    }
    
    public static SubLObject f1778(final SubLObject var33, final SubLObject var34, final SubLObject var35, final SubLObject var36, final SubLObject var37, final SubLObject var38) {
        SubLObject var39 = (SubLObject)module0034.ZERO_INTEGER;
        SubLObject var40 = (SubLObject)module0034.FOUR_INTEGER;
        SubLObject var41 = (SubLObject)module0034.$ic21$;
        var40 = module0012.f603(var40);
        var41 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var33), var40), var41);
        var40 = module0012.f603(var40);
        var41 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var34), var40), var41);
        var40 = module0012.f603(var40);
        var41 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var35), var40), var41);
        var40 = module0012.f603(var40);
        var41 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var36), var40), var41);
        var40 = module0012.f603(var40);
        var41 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var37), var40), var41);
        var40 = module0012.f603(var40);
        var41 = (var39 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var38), var40), var41));
        return var39;
    }
    
    public static SubLObject f1779(final SubLObject var33, final SubLObject var34, final SubLObject var35, final SubLObject var36, final SubLObject var37) {
        SubLObject var38 = (SubLObject)module0034.ZERO_INTEGER;
        SubLObject var39 = (SubLObject)module0034.FOUR_INTEGER;
        SubLObject var40 = (SubLObject)module0034.$ic21$;
        var39 = module0012.f603(var39);
        var40 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var33), var39), var40);
        var39 = module0012.f603(var39);
        var40 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var34), var39), var40);
        var39 = module0012.f603(var39);
        var40 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var35), var39), var40);
        var39 = module0012.f603(var39);
        var40 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var36), var39), var40);
        var39 = module0012.f603(var39);
        var40 = (var38 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var37), var39), var40));
        return var38;
    }
    
    public static SubLObject f1780(final SubLObject var33, final SubLObject var34, final SubLObject var35, final SubLObject var36) {
        SubLObject var37 = (SubLObject)module0034.ZERO_INTEGER;
        SubLObject var38 = (SubLObject)module0034.FOUR_INTEGER;
        SubLObject var39 = (SubLObject)module0034.$ic21$;
        var38 = module0012.f603(var38);
        var39 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var33), var38), var39);
        var38 = module0012.f603(var38);
        var39 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var34), var38), var39);
        var38 = module0012.f603(var38);
        var39 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var35), var38), var39);
        var38 = module0012.f603(var38);
        var39 = (var37 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var36), var38), var39));
        return var37;
    }
    
    public static SubLObject f1781(final SubLObject var33, final SubLObject var34, final SubLObject var35) {
        SubLObject var36 = (SubLObject)module0034.ZERO_INTEGER;
        SubLObject var37 = (SubLObject)module0034.FOUR_INTEGER;
        SubLObject var38 = (SubLObject)module0034.$ic21$;
        var37 = module0012.f603(var37);
        var38 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var33), var37), var38);
        var37 = module0012.f603(var37);
        var38 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var34), var37), var38);
        var37 = module0012.f603(var37);
        var38 = (var36 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var35), var37), var38));
        return var36;
    }
    
    public static SubLObject f1782(final SubLObject var33, final SubLObject var34) {
        SubLObject var35 = (SubLObject)module0034.ZERO_INTEGER;
        SubLObject var36 = (SubLObject)module0034.FOUR_INTEGER;
        SubLObject var37 = (SubLObject)module0034.$ic21$;
        var36 = module0012.f603(var36);
        var37 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var33), var36), var37);
        var36 = module0012.f603(var36);
        var37 = (var35 = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(var34), var36), var37));
        return var35;
    }
    
    public static SubLObject f1783(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic22$);
        final SubLObject var15 = var14.rest();
        var14 = var14.first();
        SubLObject var16 = (SubLObject)module0034.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic22$);
        var16 = var14.first();
        var14 = var14.rest();
        if (module0034.NIL == var14) {
            final SubLObject var17;
            var14 = (var17 = var15);
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic23$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic24$, var16))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic25$, (SubLObject)module0034.$ic23$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic27$, (SubLObject)module0034.$ic28$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic29$, (SubLObject)module0034.$ic30$, ConsesLow.append(var17, (SubLObject)module0034.NIL))), (SubLObject)module0034.$ic31$), reader.bq_cons((SubLObject)module0034.$ic32$, ConsesLow.append(var17, (SubLObject)module0034.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0034.$ic22$);
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1784(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic22$);
        final SubLObject var15 = var14.rest();
        var14 = var14.first();
        SubLObject var16 = (SubLObject)module0034.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic22$);
        var16 = var14.first();
        var14 = var14.rest();
        if (module0034.NIL == var14) {
            final SubLObject var17;
            var14 = (var17 = var15);
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic23$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic24$, var16))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic25$, (SubLObject)module0034.$ic23$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic33$, (SubLObject)module0034.$ic28$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic29$, (SubLObject)module0034.$ic30$, ConsesLow.append(var17, (SubLObject)module0034.NIL))), (SubLObject)module0034.$ic31$), reader.bq_cons((SubLObject)module0034.$ic32$, ConsesLow.append(var17, (SubLObject)module0034.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0034.$ic22$);
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1785(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic34$);
        final SubLObject var15 = var14.rest();
        var14 = var14.first();
        SubLObject var16 = (SubLObject)module0034.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic34$);
        var16 = var14.first();
        var14 = var14.rest();
        if (module0034.NIL == var14) {
            final SubLObject var17;
            var14 = (var17 = var15);
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic25$, var16, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic27$, (SubLObject)ConsesLow.list(var16), (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic29$, (SubLObject)module0034.$ic30$, ConsesLow.append(var17, (SubLObject)module0034.NIL))), (SubLObject)module0034.$ic31$), reader.bq_cons((SubLObject)module0034.$ic32$, ConsesLow.append(var17, (SubLObject)module0034.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0034.$ic34$);
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1786(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic34$);
        final SubLObject var15 = var14.rest();
        var14 = var14.first();
        SubLObject var16 = (SubLObject)module0034.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic34$);
        var16 = var14.first();
        var14 = var14.rest();
        if (module0034.NIL == var14) {
            final SubLObject var17;
            var14 = (var17 = var15);
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic25$, var16, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic33$, (SubLObject)ConsesLow.list(var16), (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic29$, (SubLObject)module0034.$ic30$, ConsesLow.append(var17, (SubLObject)module0034.NIL))), (SubLObject)module0034.$ic31$), reader.bq_cons((SubLObject)module0034.$ic32$, ConsesLow.append(var17, (SubLObject)module0034.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0034.$ic34$);
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1787(final SubLObject var57, final SubLObject var58) {
        f1788(var57, var58, (SubLObject)module0034.ZERO_INTEGER);
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1789(final SubLObject var57) {
        return (SubLObject)((var57.getClass() == $sX3030_native.class) ? module0034.T : module0034.NIL);
    }
    
    public static SubLObject f1790(final SubLObject var57) {
        assert module0034.NIL != f1789(var57) : var57;
        return var57.getField2();
    }
    
    public static SubLObject f1791(final SubLObject var57) {
        assert module0034.NIL != f1789(var57) : var57;
        return var57.getField3();
    }
    
    public static SubLObject f1792(final SubLObject var57) {
        assert module0034.NIL != f1789(var57) : var57;
        return var57.getField4();
    }
    
    public static SubLObject f1793(final SubLObject var57) {
        assert module0034.NIL != f1789(var57) : var57;
        return var57.getField5();
    }
    
    public static SubLObject f1794(final SubLObject var57) {
        assert module0034.NIL != f1789(var57) : var57;
        return var57.getField6();
    }
    
    public static SubLObject f1795(final SubLObject var57) {
        assert module0034.NIL != f1789(var57) : var57;
        return var57.getField7();
    }
    
    public static SubLObject f1796(final SubLObject var57) {
        assert module0034.NIL != f1789(var57) : var57;
        return var57.getField8();
    }
    
    public static SubLObject f1797(final SubLObject var57, final SubLObject var59) {
        assert module0034.NIL != f1789(var57) : var57;
        return var57.setField2(var59);
    }
    
    public static SubLObject f1798(final SubLObject var57, final SubLObject var59) {
        assert module0034.NIL != f1789(var57) : var57;
        return var57.setField3(var59);
    }
    
    public static SubLObject f1799(final SubLObject var57, final SubLObject var59) {
        assert module0034.NIL != f1789(var57) : var57;
        return var57.setField4(var59);
    }
    
    public static SubLObject f1800(final SubLObject var57, final SubLObject var59) {
        assert module0034.NIL != f1789(var57) : var57;
        return var57.setField5(var59);
    }
    
    public static SubLObject f1801(final SubLObject var57, final SubLObject var59) {
        assert module0034.NIL != f1789(var57) : var57;
        return var57.setField6(var59);
    }
    
    public static SubLObject f1802(final SubLObject var57, final SubLObject var59) {
        assert module0034.NIL != f1789(var57) : var57;
        return var57.setField7(var59);
    }
    
    public static SubLObject f1803(final SubLObject var57, final SubLObject var59) {
        assert module0034.NIL != f1789(var57) : var57;
        return var57.setField8(var59);
    }
    
    public static SubLObject f1804(SubLObject var60) {
        if (var60 == module0034.UNPROVIDED) {
            var60 = (SubLObject)module0034.NIL;
        }
        final SubLObject var61 = (SubLObject)new $sX3030_native();
        SubLObject var62;
        SubLObject var63;
        SubLObject var64;
        SubLObject var65;
        for (var62 = (SubLObject)module0034.NIL, var62 = var60; module0034.NIL != var62; var62 = conses_high.cddr(var62)) {
            var63 = var62.first();
            var64 = conses_high.cadr(var62);
            var65 = var63;
            if (var65.eql((SubLObject)module0034.$ic58$)) {
                f1797(var61, var64);
            }
            else if (var65.eql((SubLObject)module0034.$ic59$)) {
                f1798(var61, var64);
            }
            else if (var65.eql((SubLObject)module0034.$ic60$)) {
                f1799(var61, var64);
            }
            else if (var65.eql((SubLObject)module0034.$ic61$)) {
                f1800(var61, var64);
            }
            else if (var65.eql((SubLObject)module0034.$ic62$)) {
                f1801(var61, var64);
            }
            else if (var65.eql((SubLObject)module0034.$ic63$)) {
                f1802(var61, var64);
            }
            else if (var65.eql((SubLObject)module0034.$ic64$)) {
                f1803(var61, var64);
            }
            else {
                Errors.error((SubLObject)module0034.$ic65$, var63);
            }
        }
        return var61;
    }
    
    public static SubLObject f1805(final SubLObject var66, final SubLObject var67) {
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic66$, (SubLObject)module0034.$ic67$, (SubLObject)module0034.SEVEN_INTEGER);
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic68$, (SubLObject)module0034.$ic58$, f1790(var66));
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic68$, (SubLObject)module0034.$ic59$, f1791(var66));
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic68$, (SubLObject)module0034.$ic60$, f1792(var66));
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic68$, (SubLObject)module0034.$ic61$, f1793(var66));
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic68$, (SubLObject)module0034.$ic62$, f1794(var66));
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic68$, (SubLObject)module0034.$ic63$, f1795(var66));
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic68$, (SubLObject)module0034.$ic64$, f1796(var66));
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic69$, (SubLObject)module0034.$ic67$, (SubLObject)module0034.SEVEN_INTEGER);
        return var66;
    }
    
    public static SubLObject f1806(final SubLObject var66, final SubLObject var67) {
        return f1805(var66, var67);
    }
    
    public static SubLObject f1807(final SubLObject var53, final SubLObject var68, final SubLObject var69, SubLObject var70, SubLObject var71, SubLObject var72) {
        if (var70 == module0034.UNPROVIDED) {
            var70 = (SubLObject)module0034.NIL;
        }
        if (var71 == module0034.UNPROVIDED) {
            var71 = Symbols.symbol_function((SubLObject)module0034.EQL);
        }
        if (var72 == module0034.UNPROVIDED) {
            var72 = (SubLObject)module0034.ZERO_INTEGER;
        }
        final SubLObject var73 = f1804((SubLObject)module0034.UNPROVIDED);
        enforceType(var72, module0034.$ic71$);
        if (module0034.NIL != var70) {
            enforceType(var70, module0034.$ic72$);
        }
        enforceType(var68, module0034.$ic73$);
        if (var71.isSymbol()) {
            var71 = Symbols.symbol_function(var71);
        }
        enforceType(var71, module0034.$ic74$);
        if (module0034.NIL != var70) {
            f1797(var73, module0089.f6070(var70, var69.eql((SubLObject)module0034.ONE_INTEGER) ? var71 : Symbols.symbol_function((SubLObject)module0034.EQL)));
        }
        else {
            f1797(var73, module0067.f4880(var69.eql((SubLObject)module0034.ONE_INTEGER) ? var71 : Symbols.symbol_function((SubLObject)module0034.EQL), var72));
        }
        f1799(var73, var53);
        f1800(var73, var70);
        f1801(var73, var68);
        f1802(var73, var71);
        f1803(var73, var69);
        f1798(var73, (SubLObject)module0034.$ic75$);
        return var73;
    }
    
    public static SubLObject f1808(final SubLObject var74, final SubLObject var58, final SubLObject var75) {
        PrintLow.format(var58, (SubLObject)module0034.$ic76$, new SubLObject[] { f1794(var74), f1792(var74), f1793(var74), f1795(var74) });
        PrintLow.format(var58, (SubLObject)module0034.$ic77$);
        return var74;
    }
    
    public static SubLObject f1788(final SubLObject var74, final SubLObject var58, final SubLObject var75) {
        enforceType(var74, module0034.$ic36$);
        if (module0034.NIL != f1792(var74)) {
            SubLObject var76 = (SubLObject)module0034.NIL;
            final SubLObject var77 = f1792(var74);
            SubLObject var78 = (SubLObject)module0034.NIL;
            try {
                var78 = ReadWriteLocks.rw_lock_seize_read_lock(var77);
                var76 = f1808(var74, var58, var75);
            }
            finally {
                if (module0034.NIL != var78) {
                    ReadWriteLocks.rw_lock_release_read_lock(var77);
                }
            }
            return var76;
        }
        return f1808(var74, var58, var75);
    }
    
    public static SubLObject f1809(final SubLObject var77) {
        return f1791(var77);
    }
    
    public static SubLObject f1810(final SubLObject var77, SubLObject var53) {
        if (var53 == module0034.UNPROVIDED) {
            var53 = f1792(var77);
        }
        if (module0034.NIL != var53) {
            SubLObject var78 = (SubLObject)module0034.NIL;
            final SubLObject var79 = var53;
            SubLObject var80 = (SubLObject)module0034.NIL;
            try {
                var80 = ReadWriteLocks.rw_lock_seize_read_lock(var79);
                var78 = f1791(var77);
            }
            finally {
                if (module0034.NIL != var80) {
                    ReadWriteLocks.rw_lock_release_read_lock(var79);
                }
            }
            return var78;
        }
        return f1791(var77);
    }
    
    public static SubLObject f1811(final SubLObject var77, final SubLObject var78) {
        f1798(var77, var78);
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1812(final SubLObject var77, final SubLObject var78, SubLObject var53) {
        if (var53 == module0034.UNPROVIDED) {
            var53 = f1792(var77);
        }
        if (module0034.NIL != var53) {
            SubLObject var79 = (SubLObject)module0034.NIL;
            final SubLObject var80 = var53;
            SubLObject var81 = (SubLObject)module0034.NIL;
            try {
                var81 = ReadWriteLocks.rw_lock_seize_write_lock(var80);
                var79 = f1811(var77, var78);
            }
            finally {
                if (module0034.NIL != var81) {
                    ReadWriteLocks.rw_lock_release_write_lock(var80);
                }
            }
            return var79;
        }
        return f1811(var77, var78);
    }
    
    public static SubLObject f1813(final SubLObject var77, final SubLObject var79, SubLObject var80) {
        if (var80 == module0034.UNPROVIDED) {
            var80 = (SubLObject)module0034.$ic75$;
        }
        if (module0034.NIL != f1793(var77)) {
            return module0089.f6079(f1790(var77), var79, var80);
        }
        return module0067.f4885(f1790(var77), var79, var80);
    }
    
    public static SubLObject f1814(final SubLObject var77, final SubLObject var79, SubLObject var80) {
        if (var80 == module0034.UNPROVIDED) {
            var80 = (SubLObject)module0034.$ic75$;
        }
        if (module0034.NIL != f1792(var77)) {
            SubLObject var81 = (SubLObject)module0034.NIL;
            final SubLObject var82 = f1792(var77);
            SubLObject var83 = (SubLObject)module0034.NIL;
            try {
                var83 = ReadWriteLocks.rw_lock_seize_read_lock(var82);
                var81 = f1813(var77, var79, var80);
            }
            finally {
                if (module0034.NIL != var83) {
                    ReadWriteLocks.rw_lock_release_read_lock(var82);
                }
            }
            return var81;
        }
        return f1813(var77, var79, var80);
    }
    
    public static SubLObject f1815(final SubLObject var77, final SubLObject var79, final SubLObject var81) {
        if (module0034.NIL != f1793(var77)) {
            return module0089.f6082(f1790(var77), var79, var81);
        }
        return module0067.f4886(f1790(var77), var79, var81);
    }
    
    public static SubLObject f1816(final SubLObject var77, final SubLObject var79, final SubLObject var81, SubLObject var53) {
        if (var53 == module0034.UNPROVIDED) {
            var53 = f1792(var77);
        }
        if (module0034.NIL != var53) {
            SubLObject var82 = (SubLObject)module0034.NIL;
            final SubLObject var83 = var53;
            SubLObject var84 = (SubLObject)module0034.NIL;
            try {
                var84 = ReadWriteLocks.rw_lock_seize_write_lock(var83);
                var82 = f1815(var77, var79, var81);
            }
            finally {
                if (module0034.NIL != var84) {
                    ReadWriteLocks.rw_lock_release_write_lock(var83);
                }
            }
            return var82;
        }
        return f1815(var77, var79, var81);
    }
    
    public static SubLObject f1817(final SubLObject var77) {
        if (module0034.NIL != f1793(var77)) {
            module0089.f6092(f1790(var77));
        }
        else {
            module0067.f4881(f1790(var77));
        }
        f1798(var77, (SubLObject)module0034.$ic75$);
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1818(final SubLObject var77) {
        if (module0034.NIL == var77) {
            return (SubLObject)module0034.NIL;
        }
        enforceType(var77, module0034.$ic36$);
        if (module0034.NIL != f1792(var77)) {
            SubLObject var78 = (SubLObject)module0034.NIL;
            final SubLObject var79 = f1792(var77);
            SubLObject var80 = (SubLObject)module0034.NIL;
            try {
                var80 = ReadWriteLocks.rw_lock_seize_write_lock(var79);
                var78 = f1817(var77);
            }
            finally {
                if (module0034.NIL != var80) {
                    ReadWriteLocks.rw_lock_release_write_lock(var79);
                }
            }
            return var78;
        }
        return f1817(var77);
    }
    
    public static SubLObject f1819(final SubLObject var77) {
        return f1793(var77);
    }
    
    public static SubLObject f1820(final SubLObject var77) {
        return f1794(var77);
    }
    
    public static SubLObject f1821(final SubLObject var77) {
        return f1795(var77);
    }
    
    public static SubLObject f1822(final SubLObject var77) {
        if (module0034.NIL != f1793(var77)) {
            return module0089.f6102(f1790(var77));
        }
        return module0067.f4902(f1790(var77));
    }
    
    public static SubLObject f1823(final SubLObject var77, SubLObject var53) {
        if (var53 == module0034.UNPROVIDED) {
            var53 = f1792(var77);
        }
        if (module0034.NIL != var53) {
            SubLObject var78 = (SubLObject)module0034.NIL;
            final SubLObject var79 = var53;
            SubLObject var80 = (SubLObject)module0034.NIL;
            try {
                var80 = ReadWriteLocks.rw_lock_seize_read_lock(var79);
                var78 = f1822(var77);
            }
            finally {
                if (module0034.NIL != var80) {
                    ReadWriteLocks.rw_lock_release_read_lock(var79);
                }
            }
            return var78;
        }
        return f1822(var77);
    }
    
    public static SubLObject f1824(final SubLObject var77) {
        if (module0034.NIL != f1793(var77)) {
            return module0089.f6069(f1790(var77));
        }
        return module0067.f4861(f1790(var77));
    }
    
    public static SubLObject f1825(final SubLObject var77, SubLObject var53) {
        if (var53 == module0034.UNPROVIDED) {
            var53 = f1792(var77);
        }
        if (module0034.NIL != var53) {
            SubLObject var78 = (SubLObject)module0034.NIL;
            final SubLObject var79 = var53;
            SubLObject var80 = (SubLObject)module0034.NIL;
            try {
                var80 = ReadWriteLocks.rw_lock_seize_read_lock(var79);
                var78 = f1824(var77);
            }
            finally {
                if (module0034.NIL != var80) {
                    ReadWriteLocks.rw_lock_release_read_lock(var79);
                }
            }
            return var78;
        }
        return f1824(var77);
    }
    
    public static SubLObject f1826(final SubLObject var77, final SubLObject var82) {
        if (module0034.NIL != f1793(var77)) {
            return module0089.f6087(f1790(var77), var82);
        }
        return module0067.f4887(f1790(var77), var82);
    }
    
    public static SubLObject f1827(final SubLObject var77, final SubLObject var82, SubLObject var53) {
        if (var53 == module0034.UNPROVIDED) {
            var53 = f1792(var77);
        }
        if (module0034.NIL != var53) {
            SubLObject var83 = (SubLObject)module0034.NIL;
            final SubLObject var84 = var53;
            SubLObject var85 = (SubLObject)module0034.NIL;
            try {
                var85 = ReadWriteLocks.rw_lock_seize_write_lock(var84);
                var83 = f1826(var77, var82);
            }
            finally {
                if (module0034.NIL != var85) {
                    ReadWriteLocks.rw_lock_release_write_lock(var84);
                }
            }
            return var83;
        }
        return f1826(var77, var82);
    }
    
    public static SubLObject f1828(final SubLObject var77, SubLObject var28, SubLObject var29) {
        if (var29 == module0034.UNPROVIDED) {
            var29 = (SubLObject)module0034.NIL;
        }
        final SubLObject var78 = Sequences.length(var28);
        if (var78.eql((SubLObject)module0034.ZERO_INTEGER)) {
            f1798(var77, (SubLObject)module0034.$ic75$);
            return (SubLObject)module0034.NIL;
        }
        if (var78.eql((SubLObject)module0034.ONE_INTEGER)) {
            f1826(var77, var28.first());
            return (SubLObject)module0034.NIL;
        }
        if (module0034.NIL == var29) {
            var29 = f1773(var28);
        }
        SubLObject var80;
        final SubLObject var79 = var80 = f1813(var77, var29, (SubLObject)module0034.UNPROVIDED);
        SubLObject var81 = (SubLObject)module0034.NIL;
        final SubLObject var82 = Sequences.length(var28);
        final SubLObject var83 = Numbers.subtract(var82, (SubLObject)module0034.ONE_INTEGER);
        final SubLObject var84 = f1795(var77);
        if (var79 == module0034.$ic75$) {
            return (SubLObject)module0034.NIL;
        }
        while (module0034.NIL != var80) {
            SubLObject var86;
            final SubLObject var85 = var86 = var80.first();
            SubLObject var87 = (SubLObject)module0034.NIL;
            SubLObject var88 = (SubLObject)module0034.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)module0034.$ic78$);
            var87 = var86.first();
            var86 = var86.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)module0034.$ic78$);
            var88 = var86.first();
            var86 = var86.rest();
            if (module0034.NIL == var86) {
                SubLObject var89;
                for (var89 = (SubLObject)module0034.NIL, var89 = (SubLObject)module0034.ZERO_INTEGER; var89.numL(var82); var89 = Numbers.add(var89, (SubLObject)module0034.ONE_INTEGER)) {
                    if (module0034.NIL != Functions.funcall(var84, var28.first(), var87.first())) {
                        if (var89.eql(var83)) {
                            if (var87.rest() == module0034.NIL) {
                                if (module0034.NIL != var81) {
                                    return ConsesLow.rplacd(var81, var80.rest());
                                }
                                if (module0034.NIL != var80.rest()) {
                                    return f1815(var77, var29, var80.rest());
                                }
                                return f1826(var77, var29);
                            }
                        }
                        else {
                            var28 = var28.rest();
                            var87 = var87.rest();
                        }
                    }
                    else {
                        var89 = var82;
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var85, (SubLObject)module0034.$ic78$);
            }
            var81 = var80;
            var80 = var80.rest();
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1829(final SubLObject var77, final SubLObject var28, SubLObject var29, SubLObject var53) {
        if (var29 == module0034.UNPROVIDED) {
            var29 = f1773(var28);
        }
        if (var53 == module0034.UNPROVIDED) {
            var53 = (SubLObject)((module0034.NIL != var77) ? f1792(var77) : module0034.NIL);
        }
        if (module0034.NIL == var77) {
            return (SubLObject)module0034.NIL;
        }
        if (module0034.NIL != var53) {
            SubLObject var78 = (SubLObject)module0034.NIL;
            final SubLObject var79 = var53;
            SubLObject var80 = (SubLObject)module0034.NIL;
            try {
                var80 = ReadWriteLocks.rw_lock_seize_write_lock(var79);
                var78 = f1828(var77, var28, var29);
            }
            finally {
                if (module0034.NIL != var80) {
                    ReadWriteLocks.rw_lock_release_write_lock(var79);
                }
            }
            return var78;
        }
        return f1828(var77, var28, var29);
    }
    
    public static SubLObject f1830(final SubLObject var77) {
        enforceType(var77, module0034.$ic36$);
        final SubLObject var78 = f1807(f1792(var77), f1794(var77), f1796(var77), f1821(var77), f1793(var77), f1824(var77));
        if (module0034.NIL != f1793(var77)) {
            f1797(var78, module0089.f6096(f1790(var77)));
        }
        else {
            f1797(var78, module0084.f5760(f1790(var77)));
        }
        f1798(var78, f1791(var77));
        SubLObject var79 = f1822(var78);
        SubLObject var80 = (SubLObject)module0034.NIL;
        var80 = var79.first();
        while (module0034.NIL != var79) {
            final SubLObject var81 = f1813(var78, var80, (SubLObject)module0034.UNPROVIDED);
            final SubLObject var82 = conses_high.copy_list(var81);
            f1815(var78, var80, var82);
            var79 = var79.rest();
            var80 = var79.first();
        }
        return var78;
    }
    
    public static SubLObject f1831(final SubLObject var77) {
        enforceType(var77, module0034.$ic36$);
        if (module0034.NIL != f1792(var77)) {
            SubLObject var78 = (SubLObject)module0034.NIL;
            final SubLObject var79 = f1792(var77);
            SubLObject var80 = (SubLObject)module0034.NIL;
            try {
                var80 = ReadWriteLocks.rw_lock_seize_read_lock(var79);
                var78 = ((module0034.NIL != f1793(var77)) ? module0090.f6316(f1790(var77)) : module0084.f5760(f1790(var77)));
            }
            finally {
                if (module0034.NIL != var80) {
                    ReadWriteLocks.rw_lock_release_read_lock(var79);
                }
            }
            return var78;
        }
        return (module0034.NIL != f1793(var77)) ? module0090.f6316(f1790(var77)) : module0084.f5760(f1790(var77));
    }
    
    public static SubLObject f1832(final SubLObject var77, SubLObject var53) {
        if (var53 == module0034.UNPROVIDED) {
            var53 = f1792(var77);
        }
        if (module0034.NIL != var53) {
            SubLObject var78 = (SubLObject)module0034.NIL;
            final SubLObject var79 = var53;
            SubLObject var80 = (SubLObject)module0034.NIL;
            try {
                var80 = ReadWriteLocks.rw_lock_seize_read_lock(var79);
                var78 = f1830(var77);
            }
            finally {
                if (module0034.NIL != var80) {
                    ReadWriteLocks.rw_lock_release_read_lock(var79);
                }
            }
            return var78;
        }
        return f1830(var77);
    }
    
    public static SubLObject f1833(final SubLObject var77, final SubLObject var28) {
        if (module0034.NIL == var77) {
            return (SubLObject)module0034.NIL;
        }
        assert module0034.NIL != f1789(var77) : var77;
        assert module0034.NIL != Types.listp(var28) : var28;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0034.$ic75$ != f1834(var77, var28, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED));
    }
    
    public static SubLObject f1834(final SubLObject var77, SubLObject var28, SubLObject var29, SubLObject var84) {
        if (var29 == module0034.UNPROVIDED) {
            var29 = (SubLObject)module0034.$ic80$;
        }
        if (var84 == module0034.UNPROVIDED) {
            var84 = (SubLObject)module0034.$ic80$;
        }
        if (module0034.NIL == var77) {
            return Values.values((SubLObject)module0034.$ic75$, (SubLObject)module0034.NIL, (SubLObject)module0034.NIL);
        }
        if (module0034.NIL == var28) {
            return Values.values(f1791(var77), (SubLObject)module0034.NIL, (SubLObject)module0034.NIL);
        }
        if (module0034.NIL == var28.rest()) {
            return Values.values(f1814(var77, var28.first(), (SubLObject)module0034.$ic75$), (SubLObject)module0034.NIL, (SubLObject)module0034.NIL);
        }
        if (var29 == module0034.$ic80$) {
            var29 = f1773(var28);
        }
        if (var84 == module0034.$ic80$) {
            var84 = f1814(var77, var29, (SubLObject)module0034.UNPROVIDED);
        }
        final SubLObject var85 = f1795(var77);
        final SubLObject var86 = Sequences.length(var28);
        final SubLObject var87 = Numbers.subtract(var86, (SubLObject)module0034.ONE_INTEGER);
        if (!var84.isList()) {
            return Values.values((SubLObject)module0034.$ic75$, var29, (SubLObject)module0034.NIL);
        }
        SubLObject var88 = var84;
        SubLObject var89 = (SubLObject)module0034.NIL;
        var89 = var88.first();
        while (module0034.NIL != var88) {
            SubLObject var91;
            final SubLObject var90 = var91 = var89;
            SubLObject var92 = (SubLObject)module0034.NIL;
            SubLObject var93 = (SubLObject)module0034.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var91, var90, (SubLObject)module0034.$ic81$);
            var92 = var91.first();
            var91 = var91.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var91, var90, (SubLObject)module0034.$ic81$);
            var93 = var91.first();
            var91 = var91.rest();
            if (module0034.NIL == var91) {
                SubLObject var94;
                for (var94 = (SubLObject)module0034.NIL, var94 = (SubLObject)module0034.ZERO_INTEGER; var94.numL(var86); var94 = Numbers.add(var94, (SubLObject)module0034.ONE_INTEGER)) {
                    if (module0034.NIL != Functions.funcall(var85, var28.first(), var92.first())) {
                        if (var94.eql(var87)) {
                            if (var92.rest() == module0034.NIL) {
                                return Values.values(var93, var29, var84);
                            }
                        }
                        else {
                            var28 = var28.rest();
                            var92 = var92.rest();
                        }
                    }
                    else {
                        var94 = var86;
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var90, (SubLObject)module0034.$ic81$);
            }
            var88 = var88.rest();
            var89 = var88.first();
        }
        return Values.values((SubLObject)module0034.$ic75$, var29, var84);
    }
    
    public static SubLObject f1835(final SubLObject var77, final SubLObject var33) {
        return f1814(var77, var33, (SubLObject)module0034.UNPROVIDED);
    }
    
    public static SubLObject f1836(final SubLObject var77, final SubLObject var29, SubLObject var84, final SubLObject var98, final SubLObject var28) {
        if (!var84.isList()) {
            var84 = (SubLObject)module0034.NIL;
        }
        if (module0034.NIL == var28) {
            f1798(var77, var98);
            return (SubLObject)module0034.NIL;
        }
        var84 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var28, var98), var84);
        f1816(var77, var29, var84, (SubLObject)module0034.UNPROVIDED);
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1837(final SubLObject var57, final SubLObject var58) {
        f1838(var57, var58, (SubLObject)module0034.ZERO_INTEGER);
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1839(final SubLObject var57) {
        return (SubLObject)((var57.getClass() == $sX3043_native.class) ? module0034.T : module0034.NIL);
    }
    
    public static SubLObject f1840(final SubLObject var57) {
        assert module0034.NIL != f1839(var57) : var57;
        return var57.getField2();
    }
    
    public static SubLObject f1841(final SubLObject var57) {
        assert module0034.NIL != f1839(var57) : var57;
        return var57.getField3();
    }
    
    public static SubLObject f1842(final SubLObject var57) {
        assert module0034.NIL != f1839(var57) : var57;
        return var57.getField4();
    }
    
    public static SubLObject f1843(final SubLObject var57) {
        assert module0034.NIL != f1839(var57) : var57;
        return var57.getField5();
    }
    
    public static SubLObject f1844(final SubLObject var57) {
        assert module0034.NIL != f1839(var57) : var57;
        return var57.getField6();
    }
    
    public static SubLObject f1845(final SubLObject var57, final SubLObject var59) {
        assert module0034.NIL != f1839(var57) : var57;
        return var57.setField2(var59);
    }
    
    public static SubLObject f1846(final SubLObject var57, final SubLObject var59) {
        assert module0034.NIL != f1839(var57) : var57;
        return var57.setField3(var59);
    }
    
    public static SubLObject f1847(final SubLObject var57, final SubLObject var59) {
        assert module0034.NIL != f1839(var57) : var57;
        return var57.setField4(var59);
    }
    
    public static SubLObject f1848(final SubLObject var57, final SubLObject var59) {
        assert module0034.NIL != f1839(var57) : var57;
        return var57.setField5(var59);
    }
    
    public static SubLObject f1849(final SubLObject var57, final SubLObject var59) {
        assert module0034.NIL != f1839(var57) : var57;
        return var57.setField6(var59);
    }
    
    public static SubLObject f1850(SubLObject var60) {
        if (var60 == module0034.UNPROVIDED) {
            var60 = (SubLObject)module0034.NIL;
        }
        final SubLObject var61 = (SubLObject)new $sX3043_native();
        SubLObject var62;
        SubLObject var63;
        SubLObject var64;
        SubLObject var65;
        for (var62 = (SubLObject)module0034.NIL, var62 = var60; module0034.NIL != var62; var62 = conses_high.cddr(var62)) {
            var63 = var62.first();
            var64 = conses_high.cadr(var62);
            var65 = var63;
            if (var65.eql((SubLObject)module0034.$ic58$)) {
                f1845(var61, var64);
            }
            else if (var65.eql((SubLObject)module0034.$ic100$)) {
                f1846(var61, var64);
            }
            else if (var65.eql((SubLObject)module0034.$ic60$)) {
                f1847(var61, var64);
            }
            else if (var65.eql((SubLObject)module0034.$ic101$)) {
                f1848(var61, var64);
            }
            else if (var65.eql((SubLObject)module0034.$ic102$)) {
                f1849(var61, var64);
            }
            else {
                Errors.error((SubLObject)module0034.$ic65$, var63);
            }
        }
        return var61;
    }
    
    public static SubLObject f1851(final SubLObject var66, final SubLObject var67) {
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic66$, (SubLObject)module0034.$ic103$, (SubLObject)module0034.FIVE_INTEGER);
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic68$, (SubLObject)module0034.$ic58$, f1840(var66));
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic68$, (SubLObject)module0034.$ic100$, f1841(var66));
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic68$, (SubLObject)module0034.$ic60$, f1842(var66));
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic68$, (SubLObject)module0034.$ic101$, f1843(var66));
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic68$, (SubLObject)module0034.$ic102$, f1844(var66));
        Functions.funcall(var67, var66, (SubLObject)module0034.$ic69$, (SubLObject)module0034.$ic103$, (SubLObject)module0034.FIVE_INTEGER);
        return var66;
    }
    
    public static SubLObject f1852(final SubLObject var66, final SubLObject var67) {
        return f1851(var66, var67);
    }
    
    public static SubLObject f1853(SubLObject var1, SubLObject var53, SubLObject var102, SubLObject var71) {
        if (var1 == module0034.UNPROVIDED) {
            var1 = (SubLObject)module0034.NIL;
        }
        if (var53 == module0034.UNPROVIDED) {
            var53 = (SubLObject)module0034.NIL;
        }
        if (var102 == module0034.UNPROVIDED) {
            var102 = (SubLObject)module0034.NIL;
        }
        if (var71 == module0034.UNPROVIDED) {
            var71 = Symbols.symbol_function((SubLObject)module0034.EQL);
        }
        final SubLObject var103 = f1850((SubLObject)module0034.UNPROVIDED);
        if (module0034.NIL != var1) {
            enforceType(var1, module0034.$ic105$);
        }
        if (module0034.NIL != var53) {
            enforceType(var53, module0034.$ic106$);
        }
        if (var71.isSymbol()) {
            var71 = Symbols.symbol_function(var71);
        }
        enforceType(var71, module0034.$ic107$);
        if (module0034.NIL != var102 && module0034.NIL == var53) {
            var53 = ReadWriteLocks.new_rw_lock((SubLObject)module0034.$ic108$);
        }
        f1848(var103, var1);
        f1847(var103, var53);
        f1845(var103, module0067.f4880(var71, (SubLObject)module0034.UNPROVIDED));
        f1846(var103, (SubLObject)module0034.NIL);
        f1849(var103, var102);
        return var103;
    }
    
    public static SubLObject f1854(SubLObject var1, SubLObject var53, SubLObject var102, SubLObject var71) {
        if (var1 == module0034.UNPROVIDED) {
            var1 = (SubLObject)module0034.NIL;
        }
        if (var53 == module0034.UNPROVIDED) {
            var53 = (SubLObject)module0034.NIL;
        }
        if (var102 == module0034.UNPROVIDED) {
            var102 = (SubLObject)module0034.NIL;
        }
        if (var71 == module0034.UNPROVIDED) {
            var71 = Symbols.symbol_function((SubLObject)module0034.EQL);
        }
        return f1853(var1, var53, var102, var71);
    }
    
    public static SubLObject f1855(final SubLObject var74, final SubLObject var58, final SubLObject var75) {
        PrintLow.format(var58, (SubLObject)module0034.$ic109$, new SubLObject[] { f1843(var74), f1842(var74), f1844(var74), f1841(var74), f1840(var74) });
        PrintLow.format(var58, (SubLObject)module0034.$ic77$);
        return var74;
    }
    
    public static SubLObject f1838(final SubLObject var74, final SubLObject var58, final SubLObject var75) {
        final SubLObject var76 = f1842(var74);
        if (module0034.NIL != var76) {
            SubLObject var77 = (SubLObject)module0034.NIL;
            final SubLObject var78 = var76;
            SubLObject var79 = (SubLObject)module0034.NIL;
            try {
                var79 = ReadWriteLocks.rw_lock_seize_read_lock(var78);
                var77 = f1855(var74, var58, var75);
            }
            finally {
                if (module0034.NIL != var79) {
                    ReadWriteLocks.rw_lock_release_read_lock(var78);
                }
            }
            return var77;
        }
        return f1855(var74, var58, var75);
    }
    
    public static SubLObject f1856(final SubLObject var104, final SubLObject var79, SubLObject var80) {
        if (var80 == module0034.UNPROVIDED) {
            var80 = (SubLObject)module0034.NIL;
        }
        return module0067.f4885(f1840(var104), var79, var80);
    }
    
    public static SubLObject f1857(final SubLObject var104, final SubLObject var79, SubLObject var80) {
        if (var80 == module0034.UNPROVIDED) {
            var80 = (SubLObject)module0034.NIL;
        }
        final SubLObject var105 = f1842(var104);
        if (module0034.NIL != var105) {
            SubLObject var106 = (SubLObject)module0034.NIL;
            final SubLObject var107 = var105;
            SubLObject var108 = (SubLObject)module0034.NIL;
            try {
                var108 = ReadWriteLocks.rw_lock_seize_read_lock(var107);
                var106 = f1856(var104, var79, var80);
            }
            finally {
                if (module0034.NIL != var108) {
                    ReadWriteLocks.rw_lock_release_read_lock(var107);
                }
            }
            return var106;
        }
        return f1856(var104, var79, var80);
    }
    
    public static SubLObject f1858(final SubLObject var104, final SubLObject var68) {
        if (module0034.NIL == var104) {
            return (SubLObject)module0034.NIL;
        }
        assert module0034.NIL != f1839(var104) : var104;
        assert module0034.NIL != Types.symbolp(var68) : var68;
        return f1857(var104, var68, (SubLObject)module0034.UNPROVIDED);
    }
    
    public static SubLObject f1859(final SubLObject var104, final SubLObject var79, final SubLObject var81) {
        return module0067.f4886(f1840(var104), var79, var81);
    }
    
    public static SubLObject f1860(final SubLObject var104, final SubLObject var79, final SubLObject var81) {
        final SubLObject var105 = f1842(var104);
        if (module0034.NIL != var105) {
            SubLObject var106 = (SubLObject)module0034.NIL;
            final SubLObject var107 = var105;
            SubLObject var108 = (SubLObject)module0034.NIL;
            try {
                var108 = ReadWriteLocks.rw_lock_seize_write_lock(var107);
                var106 = f1859(var104, var79, var81);
            }
            finally {
                if (module0034.NIL != var108) {
                    ReadWriteLocks.rw_lock_release_write_lock(var107);
                }
            }
            return var106;
        }
        return f1859(var104, var79, var81);
    }
    
    public static SubLObject f1861(final SubLObject var104, final SubLObject var79) {
        return module0067.f4887(f1840(var104), var79);
    }
    
    public static SubLObject f1862(final SubLObject var104, final SubLObject var79) {
        final SubLObject var105 = f1842(var104);
        if (module0034.NIL != var105) {
            SubLObject var106 = (SubLObject)module0034.NIL;
            final SubLObject var107 = var105;
            SubLObject var108 = (SubLObject)module0034.NIL;
            try {
                var108 = ReadWriteLocks.rw_lock_seize_write_lock(var107);
                var106 = f1861(var104, var79);
            }
            finally {
                if (module0034.NIL != var108) {
                    ReadWriteLocks.rw_lock_release_write_lock(var107);
                }
            }
            return var106;
        }
        return f1861(var104, var79);
    }
    
    public static SubLObject f1863(final SubLObject var104) {
        return module0067.f4881(f1840(var104));
    }
    
    public static SubLObject f1864(final SubLObject var104) {
        if (module0034.NIL == var104) {
            return (SubLObject)module0034.NIL;
        }
        final SubLObject var105 = f1842(var104);
        if (module0034.NIL != var105) {
            SubLObject var106 = (SubLObject)module0034.NIL;
            final SubLObject var107 = var105;
            SubLObject var108 = (SubLObject)module0034.NIL;
            try {
                var108 = ReadWriteLocks.rw_lock_seize_write_lock(var107);
                var106 = f1863(var104);
            }
            finally {
                if (module0034.NIL != var108) {
                    ReadWriteLocks.rw_lock_release_write_lock(var107);
                }
            }
            return var106;
        }
        return f1863(var104);
    }
    
    public static SubLObject f1865(final SubLObject var104) {
        return module0067.f4854(f1840(var104));
    }
    
    public static SubLObject f1866(final SubLObject var104) {
        return f1842(var104);
    }
    
    public static SubLObject f1867(final SubLObject var104) {
        return f1843(var104);
    }
    
    public static SubLObject f1868(final SubLObject var104) {
        return f1844(var104);
    }
    
    public static SubLObject f1869(final SubLObject var104) {
        return f1841(var104);
    }
    
    public static SubLObject f1870(final SubLObject var104) {
        final SubLObject var105 = f1842(var104);
        if (module0034.NIL != var105) {
            SubLObject var106 = (SubLObject)module0034.NIL;
            final SubLObject var107 = var105;
            SubLObject var108 = (SubLObject)module0034.NIL;
            try {
                var108 = ReadWriteLocks.rw_lock_seize_read_lock(var107);
                var106 = f1869(var104);
            }
            finally {
                if (module0034.NIL != var108) {
                    ReadWriteLocks.rw_lock_release_read_lock(var107);
                }
            }
            return var106;
        }
        return f1869(var104);
    }
    
    public static SubLObject f1871(final SubLObject var104) {
        return module0067.f4902(f1840(var104));
    }
    
    public static SubLObject f1872(final SubLObject var104) {
        final SubLObject var105 = f1842(var104);
        if (module0034.NIL != var105) {
            SubLObject var106 = (SubLObject)module0034.NIL;
            final SubLObject var107 = var105;
            SubLObject var108 = (SubLObject)module0034.NIL;
            try {
                var108 = ReadWriteLocks.rw_lock_seize_read_lock(var107);
                var106 = f1871(var104);
            }
            finally {
                if (module0034.NIL != var108) {
                    ReadWriteLocks.rw_lock_release_read_lock(var107);
                }
            }
            return var106;
        }
        return f1871(var104);
    }
    
    public static SubLObject f1873(final SubLObject var104, final SubLObject var105) {
        f1846(var104, var105);
        return var104;
    }
    
    public static SubLObject f1874(final SubLObject var104, final SubLObject var105) {
        final SubLObject var106 = f1842(var104);
        if (module0034.NIL != var106) {
            SubLObject var107 = (SubLObject)module0034.NIL;
            final SubLObject var108 = var106;
            SubLObject var109 = (SubLObject)module0034.NIL;
            try {
                var109 = ReadWriteLocks.rw_lock_seize_write_lock(var108);
                var107 = f1873(var104, var105);
            }
            finally {
                if (module0034.NIL != var109) {
                    ReadWriteLocks.rw_lock_release_write_lock(var108);
                }
            }
            return var107;
        }
        return f1873(var104, var105);
    }
    
    public static SubLObject f1875(final SubLObject var104) {
        enforceType(var104, module0034.$ic83$);
        SubLObject var105 = (SubLObject)module0034.NIL;
        final SubLObject var106 = f1842(var104);
        SubLObject var107 = (SubLObject)module0034.NIL;
        try {
            var107 = ReadWriteLocks.rw_lock_seize_read_lock(var106);
            var105 = f1853(Sequences.cconcatenate((SubLObject)module0034.$ic110$, f1843(var104)), (SubLObject)module0034.NIL, (SubLObject)module0034.NIL, Symbols.symbol_function((SubLObject)module0034.EQL));
        }
        finally {
            if (module0034.NIL != var107) {
                ReadWriteLocks.rw_lock_release_read_lock(var106);
            }
        }
        Errors.error((SubLObject)module0034.$ic111$);
        f1845(var105, (SubLObject)module0034.NIL);
        SubLObject var108 = f1871(var105);
        SubLObject var109 = (SubLObject)module0034.NIL;
        var109 = var108.first();
        while (module0034.NIL != var108) {
            final SubLObject var110 = f1856(var105, var109, (SubLObject)module0034.UNPROVIDED);
            final SubLObject var111 = f1832(var110, (SubLObject)module0034.UNPROVIDED);
            f1859(var105, var109, var111);
            var108 = var108.rest();
            var109 = var108.first();
        }
        return var105;
    }
    
    public static SubLObject f1876(final SubLObject var93, final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        enforceType(var93, module0034.$ic83$);
        enforceType(var106, module0034.$ic83$);
        final SubLObject var108 = f1842(var106);
        SubLObject var109 = (SubLObject)module0034.NIL;
        try {
            var109 = ReadWriteLocks.rw_lock_seize_write_lock(var108);
            SubLObject var110 = f1871(var93);
            SubLObject var111 = (SubLObject)module0034.NIL;
            var111 = var110.first();
            while (module0034.NIL != var110) {
                final SubLObject var112 = f1857(var93, var111, (SubLObject)module0034.UNPROVIDED);
                final SubLObject var113 = f1857(var106, var111, (SubLObject)module0034.UNPROVIDED);
                if (module0034.NIL != var113) {
                    SubLObject var9_110 = f1822(var93);
                    SubLObject var114 = (SubLObject)module0034.NIL;
                    var114 = var9_110.first();
                    while (module0034.NIL != var9_110) {
                        final SubLObject var115 = f1813(var112, var114, (SubLObject)module0034.UNPROVIDED);
                        SubLObject var116 = f1813(var113, var114, (SubLObject)module0034.UNPROVIDED);
                        final SubLObject var117 = Hashtables.make_hash_table(Numbers.multiply((SubLObject)module0034.TWO_INTEGER, Sequences.length(var115)), Symbols.symbol_function((SubLObject)module0034.EQUAL), (SubLObject)module0034.UNPROVIDED);
                        if (var116 == module0034.$ic75$) {
                            f1815(var113, var114, var115);
                        }
                        else {
                            SubLObject var9_111 = var116;
                            SubLObject var118 = (SubLObject)module0034.NIL;
                            var118 = var9_111.first();
                            while (module0034.NIL != var9_111) {
                                var107.resetMultipleValues();
                                final SubLObject var119 = var118;
                                final SubLObject var120 = var107.secondMultipleValue();
                                var107.resetMultipleValues();
                                Hashtables.sethash(var119, var117, var120);
                                var9_111 = var9_111.rest();
                                var118 = var9_111.first();
                            }
                            SubLObject var9_112 = var115;
                            SubLObject var121 = (SubLObject)module0034.NIL;
                            var121 = var9_112.first();
                            while (module0034.NIL != var9_112) {
                                var107.resetMultipleValues();
                                final SubLObject var119 = var121;
                                final SubLObject var120 = var107.secondMultipleValue();
                                var107.resetMultipleValues();
                                if (module0034.NIL != Hashtables.gethash(var117, var119, (SubLObject)module0034.UNPROVIDED)) {
                                    Errors.error((SubLObject)module0034.$ic112$);
                                    var116 = Sequences.remove_if(Symbols.symbol_function((SubLObject)module0034.$ic113$), var116, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED);
                                }
                                var116 = (SubLObject)ConsesLow.cons(var121, var116);
                                var9_112 = var9_112.rest();
                                var121 = var9_112.first();
                            }
                            f1815(var113, var114, var116);
                        }
                        var9_110 = var9_110.rest();
                        var114 = var9_110.first();
                    }
                }
                else {
                    f1859(var106, var111, f1832(var112, (SubLObject)module0034.UNPROVIDED));
                }
                var110 = var110.rest();
                var111 = var110.first();
            }
        }
        finally {
            if (module0034.NIL != var109) {
                ReadWriteLocks.rw_lock_release_write_lock(var108);
            }
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1877(final SubLObject var120, final SubLObject var121) {
        return Equality.equal(var121, var120.first());
    }
    
    public static SubLObject f1878(final SubLObject var104) {
        enforceType(var104, module0034.$ic83$);
        final SubLObject var105 = f1842(var104);
        if (module0034.NIL != var105) {
            SubLObject var106 = (SubLObject)module0034.NIL;
            final SubLObject var107 = var105;
            SubLObject var108 = (SubLObject)module0034.NIL;
            try {
                var108 = ReadWriteLocks.rw_lock_seize_write_lock(var107);
                var106 = f1879(var104);
            }
            finally {
                if (module0034.NIL != var108) {
                    ReadWriteLocks.rw_lock_release_write_lock(var107);
                }
            }
            return var106;
        }
        return f1879(var104);
    }
    
    public static SubLObject f1879(final SubLObject var104) {
        final SubLThread var105 = SubLProcess.currentSubLThread();
        SubLObject var106 = (SubLObject)module0034.NIL;
        SubLObject var107 = f1871(var104);
        SubLObject var108 = (SubLObject)module0034.NIL;
        var108 = var107.first();
        while (module0034.NIL != var107) {
            final SubLObject var109 = f1857(var104, var108, (SubLObject)module0034.UNPROVIDED);
            final SubLObject var110 = f1790(var109);
            var105.resetMultipleValues();
            final SubLObject var111 = f1880(var110);
            final SubLObject var112 = var105.secondMultipleValue();
            var105.resetMultipleValues();
            var106 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var108, var111, var112), var106);
            var107 = var107.rest();
            var108 = var107.first();
        }
        return Sort.sort(var106, (SubLObject)module0034.$ic4$, (SubLObject)module0034.$ic114$);
    }
    
    public static SubLObject f1880(final SubLObject var123) {
        if (module0034.NIL != module0079.f5404(var123)) {
            return Values.values(module0079.f5406(var123), module0079.f5406(var123));
        }
        if (module0034.NIL != module0089.f6045(var123)) {
            return Values.values(module0089.f6069(var123), module0089.f6046(var123));
        }
        Errors.error((SubLObject)module0034.$ic115$, (SubLObject)Types.type_of(var123));
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1881() {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return module0034.$g879$.getDynamicValue(var13);
    }
    
    public static SubLObject f1882(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic22$);
        final SubLObject var15 = var14.rest();
        var14 = var14.first();
        SubLObject var16 = (SubLObject)module0034.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic22$);
        var16 = var14.first();
        var14 = var14.rest();
        if (module0034.NIL == var14) {
            final SubLObject var17;
            var14 = (var17 = var15);
            final SubLObject var18 = (SubLObject)module0034.$ic116$;
            final SubLObject var19 = (SubLObject)module0034.$ic117$;
            final SubLObject var20 = (SubLObject)module0034.$ic118$;
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var20, var16), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic119$, var20), reader.bq_cons(var18, (SubLObject)module0034.$ic120$)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic122$, var20, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic123$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic24$, var20))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic29$, var18, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic124$, var20)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list(reader.bq_cons(var19, (SubLObject)module0034.$ic125$)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic25$, (SubLObject)ConsesLow.list((SubLObject)module0034.EQ, (SubLObject)module0034.NIL, var18), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic126$, var20, var19), (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic123$, (SubLObject)ConsesLow.list((SubLObject)module0034.EQ, var18, var19)), (SubLObject)module0034.$ic127$)))), reader.bq_cons((SubLObject)module0034.$ic128$, ConsesLow.append(var17, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic122$, var20, (SubLObject)ConsesLow.list((SubLObject)module0034.EQ, (SubLObject)module0034.NIL, var18)), (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic126$, var20, (SubLObject)module0034.$ic120$))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0034.$ic22$);
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1883(final SubLObject var104) {
        return var104;
    }
    
    public static SubLObject f1884(final SubLObject var93, final SubLObject var106, final SubLObject var131) {
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1885(final SubLObject var11, final SubLObject var12) {
        final SubLObject var13 = var11.rest();
        final SubLObject var15;
        final SubLObject var14 = var15 = var13;
        final SubLObject var16 = (SubLObject)module0034.$ic129$;
        return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list(reader.bq_cons(var16, (SubLObject)module0034.$ic130$)), (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic131$, (SubLObject)ConsesLow.list(var16), ConsesLow.append(var15, (SubLObject)module0034.NIL)));
    }
    
    public static SubLObject f1886(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic132$);
        final SubLObject var15 = var14.rest();
        var14 = var14.first();
        SubLObject var16 = (SubLObject)module0034.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic132$);
        var16 = var14.first();
        var14 = var14.rest();
        if (module0034.NIL == var14) {
            final SubLObject var17;
            var14 = (var17 = var15);
            final SubLObject var18 = (SubLObject)module0034.$ic133$;
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list(reader.bq_cons(var18, (SubLObject)module0034.$ic130$)), (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic131$, (SubLObject)ConsesLow.list(var18), ConsesLow.append(var17, (SubLObject)module0034.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic134$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic135$, var18), var16));
        }
        cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0034.$ic132$);
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1887(final SubLObject var11, final SubLObject var12) {
        final SubLObject var13 = var11.rest();
        final SubLObject var15;
        final SubLObject var14 = var15 = var13;
        final SubLObject var16 = (SubLObject)module0034.$ic136$;
        return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list(reader.bq_cons(var16, (SubLObject)module0034.$ic137$)), (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic131$, (SubLObject)ConsesLow.list(var16), ConsesLow.append(var15, (SubLObject)module0034.NIL)));
    }
    
    public static SubLObject f1888() {
        SubLObject var139 = f1881();
        if (module0034.NIL == f1839(var139)) {
            var139 = f1853((SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED);
        }
        return var139;
    }
    
    public static SubLObject f1889(final SubLObject var46, final SubLObject var140) {
        assert module0034.NIL != f1839(var46) : var46;
        assert module0034.NIL != Types.symbolp(var140) : var140;
        final SubLObject var141 = f1857(var46, var140, (SubLObject)module0034.UNPROVIDED);
        if (module0034.NIL != var141) {
            f1818(var141);
        }
        return var46;
    }
    
    public static SubLObject f1890(final SubLObject var140) {
        assert module0034.NIL != Types.symbolp(var140) : var140;
        final SubLObject var141 = f1881();
        return f1889(var141, var140);
    }
    
    public static SubLObject f1891(final SubLObject var46) {
        assert module0034.NIL != f1839(var46) : var46;
        f1864(var46);
        return var46;
    }
    
    public static SubLObject f1892() {
        final SubLObject var46 = f1881();
        if (module0034.NIL != var46) {
            return f1891(var46);
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1893(final SubLObject var46, final SubLObject var140, final SubLObject var28) {
        if (module0034.NIL != f1839(var46) && var140.isSymbol()) {
            final SubLObject var141 = f1857(var46, var140, (SubLObject)module0034.UNPROVIDED);
            if (module0034.NIL != var141) {
                return f1829(var141, var28, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED);
            }
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1894(final SubLObject var140, final SubLObject var28) {
        final SubLObject var141 = f1881();
        if (module0034.NIL != var141) {
            return f1893(var141, var140, var28);
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1895(final SubLObject var140) {
        if (module0034.NIL == conses_high.member(var140, module0034.$g880$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0034.EQL), Symbols.symbol_function((SubLObject)module0034.IDENTITY))) {
            module0034.$g880$.setGlobalValue((SubLObject)ConsesLow.cons(var140, module0034.$g880$.getGlobalValue()));
        }
        return var140;
    }
    
    public static SubLObject f1896() {
        return module0035.remove_if_not((SubLObject)module0034.$ic141$, module0034.$g880$.getGlobalValue(), (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED);
    }
    
    public static SubLObject f1897(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        SubLObject var15 = (SubLObject)module0034.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic143$);
        var15 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic143$);
        final SubLObject var16 = var14.rest();
        final SubLObject var17;
        var14 = (var17 = var14.first());
        var14 = var16;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic143$);
        final SubLObject var145_146 = var14.rest();
        var14 = var14.first();
        SubLObject var18 = (SubLObject)module0034.NIL;
        SubLObject var19 = var14;
        SubLObject var20 = (SubLObject)module0034.NIL;
        SubLObject var150_151 = (SubLObject)module0034.NIL;
        while (module0034.NIL != var19) {
            cdestructuring_bind.destructuring_bind_must_consp(var19, var13, (SubLObject)module0034.$ic143$);
            var150_151 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var13, (SubLObject)module0034.$ic143$);
            if (module0034.NIL == conses_high.member(var150_151, (SubLObject)module0034.$ic144$, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED)) {
                var20 = (SubLObject)module0034.T;
            }
            if (var150_151 == module0034.$ic12$) {
                var18 = var19.first();
            }
            var19 = var19.rest();
        }
        if (module0034.NIL != var20 && module0034.NIL == var18) {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0034.$ic143$);
        }
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)module0034.$ic63$, var14);
        final SubLObject var22 = (SubLObject)((module0034.NIL != var21) ? conses_high.cadr(var21) : module0034.NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)module0034.$ic61$, var14);
        final SubLObject var24 = (SubLObject)((module0034.NIL != var23) ? conses_high.cadr(var23) : module0034.NIL);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)module0034.$ic145$, var14);
        final SubLObject var26 = (SubLObject)((module0034.NIL != var25) ? conses_high.cadr(var25) : module0034.NIL);
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)module0034.$ic146$, var14);
        final SubLObject var28 = (SubLObject)((module0034.NIL != var27) ? conses_high.cadr(var27) : module0034.NIL);
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)module0034.$ic147$, var14);
        final SubLObject var30 = (SubLObject)((module0034.NIL != var29) ? conses_high.cadr(var29) : module0034.NIL);
        final SubLObject var31;
        var14 = (var31 = var145_146);
        return f1898(var15, var17, var22, var24, var26, var28, var30, var31);
    }
    
    public static SubLObject f1899(final SubLObject var71) {
        if (module0034.NIL == var71) {
            return (SubLObject)module0034.$ic148$;
        }
        if (var71.isCons()) {
            if (Sequences.length(var71).numG((SubLObject)module0034.TWO_INTEGER)) {
                Errors.error((SubLObject)module0034.$ic149$, Sequences.length(var71), var71);
            }
            if (module0034.$ic150$ == var71.first()) {
                return var71;
            }
            if (module0034.$ic151$ == var71.first()) {
                return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, module0030.f1592(Eval.eval(var71)));
            }
            Errors.error((SubLObject)module0034.$ic152$, var71);
            return (SubLObject)module0034.NIL;
        }
        else {
            if (var71.isFunction()) {
                return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, module0030.f1592(Eval.eval(var71)));
            }
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var71);
        }
    }
    
    public static SubLObject f1898(final SubLObject var1, final SubLObject var121, final SubLObject var71, final SubLObject var70, final SubLObject var155, final SubLObject var157, final SubLObject var159, final SubLObject var26) {
        final SubLObject var160 = f1900(var121);
        final SubLObject var161 = Sequences.length(var160);
        if (var161.eql((SubLObject)module0034.ZERO_INTEGER)) {
            return f1901(var1, var121, var71, var70, var155, var157, var159, var26);
        }
        if (var161.eql((SubLObject)module0034.ONE_INTEGER)) {
            return f1901(var1, var121, var71, var70, var155, var157, var159, var26);
        }
        return f1902(var1, var121, var71, var70, var155, var157, var159, var26);
    }
    
    public static SubLObject f1901(final SubLObject var1, final SubLObject var121, final SubLObject var71, final SubLObject var70, final SubLObject var155, final SubLObject var157, final SubLObject var159, final SubLObject var26) {
        final SubLObject var160 = (SubLObject)module0034.$ic153$;
        final SubLObject var161 = (SubLObject)module0034.$ic154$;
        final SubLObject var162 = (SubLObject)module0034.$ic155$;
        final SubLObject var163 = f1903(var1);
        final SubLObject var164 = f1899(var71);
        final SubLObject var165 = f1900(var121);
        return (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic156$, f1904(var1), f1905(var163, var121, var26), ConsesLow.append((SubLObject)((module0034.NIL != var155) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic157$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic158$, var155, var1))) : module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0034.$ic159$, var1, ConsesLow.append(var121, (SubLObject)module0034.NIL), ConsesLow.append((SubLObject)((module0034.NIL != module0034.$g870$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic160$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1))) : module0034.NIL), (SubLObject)((module0034.NIL != module0034.$g873$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic161$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic32$, reader.bq_cons(var163, ConsesLow.append(var165, (SubLObject)module0034.NIL))))) : module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var160, f1906(var157, var1, var159, var165)), reader.bq_cons(var161, (SubLObject)module0034.$ic120$)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic162$, var160, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic32$, reader.bq_cons(var163, ConsesLow.append(var165, (SubLObject)module0034.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic29$, var161, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic163$, var160, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic162$, var161, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic29$, var161, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic164$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic24$, var160), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1), Sequences.length(var165), var70, var164)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic165$, var160, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1), var161)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var162, f1907(var161, var165, (SubLObject)module0034.ZERO_INTEGER, (SubLObject)module0034.NIL, (SubLObject)module0034.NIL))), (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS((SubLObject)module0034.EQ, var162, (SubLObject)module0034.$ic166$), ConsesLow.append((SubLObject)((module0034.NIL != module0034.$g870$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic167$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1))) : module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic29$, var162, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic168$, reader.bq_cons(var163, ConsesLow.append(var165, (SubLObject)module0034.NIL)))), (SubLObject)((module0034.NIL == var165) ? ConsesLow.list((SubLObject)module0034.$ic169$, var161, var162) : ConsesLow.listS((SubLObject)module0034.$ic170$, var161, ConsesLow.append(var165, (SubLObject)ConsesLow.list(var162))))))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic32$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic171$, var162))))))))));
    }
    
    public static SubLObject f1902(final SubLObject var1, final SubLObject var121, final SubLObject var71, final SubLObject var70, final SubLObject var155, final SubLObject var157, final SubLObject var159, final SubLObject var26) {
        final SubLObject var160 = (SubLObject)module0034.$ic172$;
        final SubLObject var161 = (SubLObject)module0034.$ic173$;
        final SubLObject var162 = (SubLObject)module0034.$ic174$;
        final SubLObject var163 = (SubLObject)module0034.$ic175$;
        final SubLObject var164 = (SubLObject)module0034.$ic176$;
        final SubLObject var165 = f1903(var1);
        final SubLObject var166 = f1899(var71);
        final SubLObject var167 = f1900(var121);
        return (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic156$, f1904(var1), f1905(var165, var121, var26), ConsesLow.append((SubLObject)((module0034.NIL != var155) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic157$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic158$, var155, var1))) : module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0034.$ic159$, var1, ConsesLow.append(var121, (SubLObject)module0034.NIL), ConsesLow.append((SubLObject)((module0034.NIL != module0034.$g870$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic160$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1))) : module0034.NIL), (SubLObject)((module0034.NIL != module0034.$g873$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic161$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic32$, reader.bq_cons(var165, ConsesLow.append(var167, (SubLObject)module0034.NIL))))) : module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var161, f1906(var157, var1, var159, var167)), reader.bq_cons(var162, (SubLObject)module0034.$ic120$)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic162$, var161, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic32$, reader.bq_cons(var165, ConsesLow.append(var167, (SubLObject)module0034.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic29$, var162, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic163$, var161, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic162$, var162, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic29$, var162, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic164$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic24$, var161), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1), Sequences.length(var167), var70, var166)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic165$, var161, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1), var162)), (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var160, f1908(var167)), (SubLObject)ConsesLow.list(var164, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic177$, var162, var160))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic123$, (SubLObject)ConsesLow.listS((SubLObject)module0034.EQ, var164, (SubLObject)module0034.$ic166$)), f1907(var162, var167, var160, var164, var166)), ConsesLow.append((SubLObject)((module0034.NIL != module0034.$g870$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic167$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1))) : module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var163, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic168$, reader.bq_cons(var165, ConsesLow.append(var167, (SubLObject)module0034.NIL))))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic178$, var162, var160, var164, var163, reader.bq_cons((SubLObject)module0034.$ic179$, ConsesLow.append(var167, (SubLObject)module0034.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic32$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic171$, var163)))))))))))));
    }
    
    public static SubLObject f1908(final SubLObject var160) {
        final SubLObject var161 = Sequences.length(var160);
        SubLObject var162 = (SubLObject)module0034.NIL;
        SubLObject var163 = (SubLObject)module0034.NIL;
        SubLObject var164 = (SubLObject)module0034.NIL;
        SubLObject var165 = (SubLObject)module0034.NIL;
        SubLObject var166 = (SubLObject)module0034.NIL;
        SubLObject var167 = (SubLObject)module0034.NIL;
        SubLObject var168 = (SubLObject)module0034.NIL;
        SubLObject var169 = (SubLObject)module0034.NIL;
        SubLObject var170 = (SubLObject)module0034.NIL;
        SubLObject var171 = (SubLObject)module0034.NIL;
        if (var161.numL((SubLObject)module0034.ELEVEN_INTEGER)) {
            var162 = var160.first();
            SubLObject var172 = var160.rest();
            var163 = var172.first();
            var172 = var172.rest();
            var164 = var172.first();
            var172 = var172.rest();
            var165 = var172.first();
            var172 = var172.rest();
            var166 = var172.first();
            var172 = var172.rest();
            var167 = var172.first();
            var172 = var172.rest();
            var168 = var172.first();
            var172 = var172.rest();
            var169 = var172.first();
            var172 = var172.rest();
            var170 = var172.first();
            var172 = var172.rest();
            var171 = var172.first();
        }
        if (module0034.TWO_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic180$, var162, var163);
        }
        if (module0034.THREE_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic181$, var162, var163, var164);
        }
        if (module0034.FOUR_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic182$, var162, var163, var164, var165);
        }
        if (module0034.FIVE_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic183$, var162, var163, var164, var165, var166);
        }
        if (module0034.SIX_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic184$, var162, var163, var164, var165, var166, var167);
        }
        if (module0034.SEVEN_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic185$, var162, var163, var164, var165, var166, var167, var168);
        }
        if (module0034.EIGHT_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list(new SubLObject[] { module0034.$ic186$, var162, var163, var164, var165, var166, var167, var168, var169 });
        }
        if (module0034.NINE_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list(new SubLObject[] { module0034.$ic187$, var162, var163, var164, var165, var166, var167, var168, var169, var170 });
        }
        if (module0034.TEN_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list(new SubLObject[] { module0034.$ic188$, var162, var163, var164, var165, var166, var167, var168, var169, var170, var171 });
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic189$, reader.bq_cons((SubLObject)module0034.$ic179$, ConsesLow.append(var160, (SubLObject)module0034.NIL)));
    }
    
    public static SubLObject f1907(final SubLObject var77, final SubLObject var160, final SubLObject var29, final SubLObject var84, SubLObject var71) {
        final SubLObject var161 = Sequences.length(var160);
        SubLObject var162 = (SubLObject)module0034.NIL;
        SubLObject var163 = (SubLObject)module0034.NIL;
        SubLObject var164 = (SubLObject)module0034.NIL;
        SubLObject var165 = (SubLObject)module0034.NIL;
        SubLObject var166 = (SubLObject)module0034.NIL;
        SubLObject var167 = (SubLObject)module0034.NIL;
        SubLObject var168 = (SubLObject)module0034.NIL;
        SubLObject var169 = (SubLObject)module0034.NIL;
        SubLObject var170 = (SubLObject)module0034.NIL;
        SubLObject var171 = (SubLObject)module0034.NIL;
        var71 = Eval.eval(var71);
        if (var161.numL((SubLObject)module0034.ELEVEN_INTEGER)) {
            var162 = var160.first();
            SubLObject var172 = var160.rest();
            var163 = var172.first();
            var172 = var172.rest();
            var164 = var172.first();
            var172 = var172.rest();
            var165 = var172.first();
            var172 = var172.rest();
            var166 = var172.first();
            var172 = var172.rest();
            var167 = var172.first();
            var172 = var172.rest();
            var168 = var172.first();
            var172 = var172.rest();
            var169 = var172.first();
            var172 = var172.rest();
            var170 = var172.first();
            var172 = var172.rest();
            var171 = var172.first();
        }
        if (module0034.ZERO_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic190$, var77);
        }
        if (module0034.ONE_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic177$, var77, var162, (SubLObject)module0034.$ic166$);
        }
        if (module0034.TWO_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic191$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic192$, var84), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic193$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var162, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic122$, (SubLObject)module0034.$ic196$, (SubLObject)module0034.$ic197$, (SubLObject)ConsesLow.listS(var71, var163, (SubLObject)module0034.$ic194$)), (SubLObject)module0034.$ic198$))));
        }
        if (module0034.THREE_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic191$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic192$, var84), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic193$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var162, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var163, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic122$, (SubLObject)module0034.$ic196$, (SubLObject)module0034.$ic197$, (SubLObject)ConsesLow.listS(var71, var164, (SubLObject)module0034.$ic194$)), (SubLObject)module0034.$ic198$)))));
        }
        if (module0034.FOUR_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic191$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic192$, var84), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic193$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var162, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var163, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var164, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic122$, (SubLObject)module0034.$ic196$, (SubLObject)module0034.$ic197$, (SubLObject)ConsesLow.listS(var71, var165, (SubLObject)module0034.$ic194$)), (SubLObject)module0034.$ic198$))))));
        }
        if (module0034.FIVE_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic191$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic192$, var84), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic193$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var162, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var163, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var164, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var165, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic122$, (SubLObject)module0034.$ic196$, (SubLObject)module0034.$ic197$, (SubLObject)ConsesLow.listS(var71, var166, (SubLObject)module0034.$ic194$)), (SubLObject)module0034.$ic198$)))))));
        }
        if (module0034.SIX_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic191$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic192$, var84), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic193$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var162, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var163, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var164, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var165, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var166, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic122$, (SubLObject)module0034.$ic196$, (SubLObject)module0034.$ic197$, (SubLObject)ConsesLow.listS(var71, var167, (SubLObject)module0034.$ic194$)), (SubLObject)module0034.$ic198$))))))));
        }
        if (module0034.SEVEN_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic191$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic192$, var84), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic193$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var162, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var163, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var164, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var165, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var166, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var167, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic122$, (SubLObject)module0034.$ic196$, (SubLObject)module0034.$ic197$, (SubLObject)ConsesLow.listS(var71, var168, (SubLObject)module0034.$ic194$)), (SubLObject)module0034.$ic198$)))))))));
        }
        if (module0034.EIGHT_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic191$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic192$, var84), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic193$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var162, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var163, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var164, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var165, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var166, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var167, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var168, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic122$, (SubLObject)module0034.$ic196$, (SubLObject)module0034.$ic197$, (SubLObject)ConsesLow.listS(var71, var169, (SubLObject)module0034.$ic194$)), (SubLObject)module0034.$ic198$))))))))));
        }
        if (module0034.NINE_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic191$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic192$, var84), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic193$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var162, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var163, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var164, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var165, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var166, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var167, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var168, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var169, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic122$, (SubLObject)module0034.$ic196$, (SubLObject)module0034.$ic197$, (SubLObject)ConsesLow.listS(var71, var170, (SubLObject)module0034.$ic194$)), (SubLObject)module0034.$ic198$)))))))))));
        }
        if (module0034.TEN_INTEGER.eql(var161)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic191$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic192$, var84), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic193$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var162, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var163, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var164, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var165, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var166, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var167, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var168, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var169, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS(var71, var170, (SubLObject)module0034.$ic194$), (SubLObject)module0034.$ic195$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic122$, (SubLObject)module0034.$ic196$, (SubLObject)module0034.$ic197$, (SubLObject)ConsesLow.listS(var71, var171, (SubLObject)module0034.$ic194$)), (SubLObject)module0034.$ic198$))))))))))));
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic199$, var77, reader.bq_cons((SubLObject)module0034.$ic179$, ConsesLow.append(var160, (SubLObject)module0034.NIL)), var29, var84);
    }
    
    public static SubLObject f1906(final SubLObject var157, final SubLObject var1, final SubLObject var159, final SubLObject var121) {
        if (module0034.NIL != var157) {
            SubLObject var160 = (SubLObject)module0034.NIL;
            var160 = (SubLObject)ConsesLow.cons(var157, var160);
            SubLObject var161 = var159;
            SubLObject var162 = (SubLObject)module0034.NIL;
            var162 = var161.first();
            while (module0034.NIL != var161) {
                enforceType(var162, module0034.$ic71$);
                if (var162.eql((SubLObject)module0034.ZERO_INTEGER)) {
                    var160 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0034.$ic200$, Symbols.symbol_name(var1)), var160);
                }
                else {
                    var160 = (SubLObject)ConsesLow.cons(ConsesLow.nth(Numbers.subtract(var162, (SubLObject)module0034.ONE_INTEGER), var121), var160);
                }
                var161 = var161.rest();
                var162 = var161.first();
            }
            return Sequences.nreverse(var160);
        }
        return (SubLObject)module0034.$ic119$;
    }
    
    public static SubLObject f1904(final SubLObject var161) {
        return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic201$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var161));
    }
    
    public static SubLObject f1909(final SubLObject var140) {
        if (module0034.NIL == conses_high.member(var140, module0034.$g881$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0034.EQL), Symbols.symbol_function((SubLObject)module0034.IDENTITY))) {
            module0034.$g881$.setGlobalValue((SubLObject)ConsesLow.cons(var140, module0034.$g881$.getGlobalValue()));
        }
        return var140;
    }
    
    public static SubLObject f1910() {
        return module0035.remove_if_not((SubLObject)module0034.$ic141$, module0034.$g881$.getGlobalValue(), (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED);
    }
    
    public static SubLObject f1911() {
        return module0035.remove_if_not((SubLObject)module0034.$ic203$, Mapping.mapcar((SubLObject)module0034.$ic204$, f1910()), (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED);
    }
    
    public static SubLObject f1912() {
        return Mapping.mapcar((SubLObject)module0034.$ic205$, f1911());
    }
    
    public static SubLObject f1913() {
        return ConsesLow.append(module0034.$g880$.getGlobalValue(), module0034.$g881$.getGlobalValue());
    }
    
    public static SubLObject f1914() {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = f1912();
        module0012.$g82$.setDynamicValue((SubLObject)module0034.$ic206$, var13);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var13);
        module0012.$g83$.setDynamicValue(Sequences.length(var14), var13);
        module0012.$g84$.setDynamicValue((SubLObject)module0034.ZERO_INTEGER, var13);
        final SubLObject var15 = module0012.$g75$.currentBinding(var13);
        final SubLObject var16 = module0012.$g76$.currentBinding(var13);
        final SubLObject var17 = module0012.$g77$.currentBinding(var13);
        final SubLObject var18 = module0012.$g78$.currentBinding(var13);
        try {
            module0012.$g75$.bind((SubLObject)module0034.ZERO_INTEGER, var13);
            module0012.$g76$.bind((SubLObject)module0034.NIL, var13);
            module0012.$g77$.bind((SubLObject)module0034.T, var13);
            module0012.$g78$.bind(Time.get_universal_time(), var13);
            module0012.f478(module0012.$g82$.getDynamicValue(var13));
            SubLObject var19 = var14;
            SubLObject var20 = (SubLObject)module0034.NIL;
            var20 = var19.first();
            while (module0034.NIL != var19) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var13), module0012.$g83$.getDynamicValue(var13));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var13), (SubLObject)module0034.ONE_INTEGER), var13);
                if (module0034.NIL != var20) {
                    f1818(var20);
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var18, var13);
            module0012.$g77$.rebind(var17, var13);
            module0012.$g76$.rebind(var16, var13);
            module0012.$g75$.rebind(var15, var13);
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1915(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        SubLObject var15 = (SubLObject)module0034.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic208$);
        var15 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic208$);
        final SubLObject var16 = var14.rest();
        final SubLObject var17;
        var14 = (var17 = var14.first());
        var14 = var16;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic208$);
        final SubLObject var176_177 = var14.rest();
        var14 = var14.first();
        SubLObject var18 = (SubLObject)module0034.NIL;
        SubLObject var19 = var14;
        SubLObject var20 = (SubLObject)module0034.NIL;
        SubLObject var181_182 = (SubLObject)module0034.NIL;
        while (module0034.NIL != var19) {
            cdestructuring_bind.destructuring_bind_must_consp(var19, var13, (SubLObject)module0034.$ic208$);
            var181_182 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var13, (SubLObject)module0034.$ic208$);
            if (module0034.NIL == conses_high.member(var181_182, (SubLObject)module0034.$ic209$, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED)) {
                var20 = (SubLObject)module0034.T;
            }
            if (var181_182 == module0034.$ic12$) {
                var18 = var19.first();
            }
            var19 = var19.rest();
        }
        if (module0034.NIL != var20 && module0034.NIL == var18) {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0034.$ic208$);
        }
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)module0034.$ic63$, var14);
        final SubLObject var22 = (SubLObject)((module0034.NIL != var21) ? conses_high.cadr(var21) : module0034.NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)module0034.$ic61$, var14);
        final SubLObject var24 = (SubLObject)((module0034.NIL != var23) ? conses_high.cadr(var23) : module0034.NIL);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)module0034.$ic145$, var14);
        final SubLObject var26 = (SubLObject)((module0034.NIL != var25) ? conses_high.cadr(var25) : module0034.NIL);
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)module0034.$ic210$, var14);
        final SubLObject var28 = (SubLObject)((module0034.NIL != var27) ? conses_high.cadr(var27) : module0034.NIL);
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)module0034.$ic211$, var14);
        final SubLObject var30 = (SubLObject)((module0034.NIL != var29) ? conses_high.cadr(var29) : module0034.NIL);
        final SubLObject var31;
        var14 = (var31 = var176_177);
        return f1916(var15, var17, var22, var28, var24, var26, var30, var31);
    }
    
    public static SubLObject f1917(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        SubLObject var15 = (SubLObject)module0034.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic212$);
        var15 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic212$);
        final SubLObject var16 = var14.rest();
        var14 = var14.first();
        SubLObject var17 = (SubLObject)module0034.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic212$);
        var17 = var14.first();
        var14 = var14.rest();
        if (module0034.NIL == var14) {
            var14 = var16;
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic212$);
            final SubLObject var192_193 = var14.rest();
            var14 = var14.first();
            SubLObject var18 = (SubLObject)module0034.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic212$);
            var18 = var14.first();
            var14 = var14.rest();
            final SubLObject var19 = (SubLObject)(var14.isCons() ? var14.first() : module0034.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var14, var13, (SubLObject)module0034.$ic212$);
            var14 = var14.rest();
            if (module0034.NIL == var14) {
                final SubLObject var20;
                var14 = (var20 = var192_193);
                if (module0034.NIL != var19) {
                    return (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic207$, var15, (SubLObject)ConsesLow.list(var17), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic210$, var18, (SubLObject)module0034.$ic63$, var19), ConsesLow.append(var20, (SubLObject)module0034.NIL));
                }
                return (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic207$, var15, (SubLObject)ConsesLow.list(var17), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic210$, var18), ConsesLow.append(var20, (SubLObject)module0034.NIL));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0034.$ic212$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0034.$ic212$);
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1918(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        SubLObject var15 = (SubLObject)module0034.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic213$);
        var15 = var14.first();
        var14 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic213$);
        final SubLObject var16 = var14.rest();
        final SubLObject var17;
        var14 = (var17 = var14.first());
        var14 = var16;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic213$);
        final SubLObject var197_198 = var14.rest();
        var14 = var14.first();
        SubLObject var18 = (SubLObject)module0034.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic213$);
        var18 = var14.first();
        var14 = var14.rest();
        final SubLObject var19 = (SubLObject)(var14.isCons() ? var14.first() : module0034.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var14, var13, (SubLObject)module0034.$ic213$);
        var14 = var14.rest();
        if (module0034.NIL != var14) {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0034.$ic213$);
            return (SubLObject)module0034.NIL;
        }
        final SubLObject var20;
        var14 = (var20 = var197_198);
        if (module0034.NIL != var19) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic207$, var15, ConsesLow.append(var17, (SubLObject)module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic210$, var18, (SubLObject)module0034.$ic63$, var19), ConsesLow.append(var20, (SubLObject)module0034.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic207$, var15, ConsesLow.append(var17, (SubLObject)module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic210$, var18), ConsesLow.append(var20, (SubLObject)module0034.NIL));
    }
    
    public static SubLObject f1919(final SubLObject var74) {
        return conses_high.member(var74, module0034.$g882$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0034.EQ), (SubLObject)module0034.UNPROVIDED);
    }
    
    public static SubLObject f1916(final SubLObject var1, final SubLObject var121, final SubLObject var71, final SubLObject var124, final SubLObject var70, final SubLObject var155, final SubLObject var188, final SubLObject var26) {
        final SubLObject var189 = f1900(var121);
        final SubLObject var190 = Sequences.length(var189);
        if (var190.eql((SubLObject)module0034.ZERO_INTEGER)) {
            return f1920(var1, var121, var71, var124, var70, var155, var188, var26);
        }
        if (var190.eql((SubLObject)module0034.ONE_INTEGER)) {
            return f1920(var1, var121, var71, var124, var70, var155, var188, var26);
        }
        return f1921(var1, var121, var71, var124, var70, var155, var188, var26);
    }
    
    public static SubLObject f1920(final SubLObject var1, final SubLObject var121, SubLObject var71, SubLObject var124, final SubLObject var70, final SubLObject var155, final SubLObject var188, final SubLObject var26) {
        if (module0034.NIL == var71) {
            var71 = Symbols.symbol_function((SubLObject)module0034.EQL);
        }
        if (module0034.NIL == var124) {
            var124 = (SubLObject)module0034.ZERO_INTEGER;
        }
        if (module0034.NIL != var188 && !module0034.areAssertionsDisabledFor(me) && module0034.NIL == f1919(var188)) {
            throw new AssertionError(var188);
        }
        final SubLObject var189 = (SubLObject)module0034.$ic216$;
        final SubLObject var190 = (SubLObject)module0034.$ic217$;
        final SubLObject var191 = f1900(var121);
        final SubLObject var192 = f1922(var1);
        final SubLObject var193 = Sequences.length(var191);
        final SubLObject var194 = f1903(var1);
        final SubLObject var195 = f1899(var71);
        return (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic156$, new SubLObject[] { f1923(var192), f1924(var1), f1925(var1, var121, var192), f1926(var1), f1905(var194, var191, var26), ConsesLow.append((SubLObject)((module0034.NIL != var155) ? f1927(var155, var1, var121) : module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0034.$ic159$, var1, ConsesLow.append(var121, (SubLObject)module0034.NIL), ConsesLow.append((SubLObject)((module0034.NIL != module0034.$g870$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic160$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1))) : module0034.NIL), (SubLObject)((module0034.NIL != module0034.$g873$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic161$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic32$, reader.bq_cons(var194, ConsesLow.append(var191, (SubLObject)module0034.NIL))))) : module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var190, var192)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic162$, var190, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic29$, var190, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic218$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var192), var70, var195, var193, var124)), f1928(var1, var188)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var189, f1907(var190, var191, (SubLObject)module0034.ZERO_INTEGER, (SubLObject)module0034.NIL, (SubLObject)module0034.NIL))), (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.listS((SubLObject)module0034.EQ, var189, (SubLObject)module0034.$ic166$), ConsesLow.append((SubLObject)((module0034.NIL != module0034.$g870$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic167$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1))) : module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic29$, var189, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic168$, reader.bq_cons(var194, ConsesLow.append(var191, (SubLObject)module0034.NIL)))), (SubLObject)((module0034.NIL == var191) ? ConsesLow.list((SubLObject)module0034.$ic169$, var190, var189) : ConsesLow.listS((SubLObject)module0034.$ic170$, var190, ConsesLow.append(var191, (SubLObject)ConsesLow.list(var189))))))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic32$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic171$, var189))))))))) });
    }
    
    public static SubLObject f1921(final SubLObject var1, final SubLObject var121, SubLObject var71, SubLObject var124, final SubLObject var70, final SubLObject var155, final SubLObject var188, final SubLObject var26) {
        if (module0034.NIL == var71) {
            var71 = Symbols.symbol_function((SubLObject)module0034.EQL);
        }
        if (module0034.NIL == var124) {
            var124 = (SubLObject)module0034.ZERO_INTEGER;
        }
        if (module0034.NIL != var188 && !module0034.areAssertionsDisabledFor(me) && module0034.NIL == f1919(var188)) {
            throw new AssertionError(var188);
        }
        final SubLObject var189 = (SubLObject)module0034.$ic219$;
        final SubLObject var190 = (SubLObject)module0034.$ic220$;
        final SubLObject var191 = (SubLObject)module0034.$ic221$;
        final SubLObject var192 = (SubLObject)module0034.$ic222$;
        final SubLObject var193 = f1900(var121);
        final SubLObject var194 = f1922(var1);
        final SubLObject var195 = Sequences.length(var193);
        final SubLObject var196 = f1903(var1);
        final SubLObject var197 = f1899(var71);
        return (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic156$, new SubLObject[] { f1923(var194), f1924(var1), f1925(var1, var121, var194), f1926(var1), f1905(var196, var193, var26), ConsesLow.append((SubLObject)((module0034.NIL != var155) ? f1927(var155, var1, var121) : module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0034.$ic159$, var1, ConsesLow.append(var121, (SubLObject)module0034.NIL), ConsesLow.append((SubLObject)((module0034.NIL != module0034.$g870$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic160$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1))) : module0034.NIL), (SubLObject)((module0034.NIL != module0034.$g873$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic161$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic32$, reader.bq_cons(var196, ConsesLow.append(var193, (SubLObject)module0034.NIL))))) : module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var192, var194)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic162$, var192, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic29$, var192, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic218$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var194), var70, var197, var195, var124)), f1928(var1, var188)), (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var189, f1908(var193)), (SubLObject)ConsesLow.list(var191, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic177$, var192, var189))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic123$, (SubLObject)ConsesLow.listS((SubLObject)module0034.EQ, var191, (SubLObject)module0034.$ic166$)), f1907(var192, var193, var189, var191, var197)), ConsesLow.append((SubLObject)((module0034.NIL != module0034.$g870$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic167$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1))) : module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var190, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic168$, reader.bq_cons(var196, ConsesLow.append(var193, (SubLObject)module0034.NIL))))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic178$, var192, var189, var191, var190, reader.bq_cons((SubLObject)module0034.$ic179$, ConsesLow.append(var193, (SubLObject)module0034.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic32$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic171$, var190)))))))))))) });
    }
    
    public static SubLObject f1929(final SubLObject var77, final SubLObject var200) {
        assert module0034.NIL != f1789(var77) : var77;
        assert module0034.NIL != Types.hash_table_p(var200) : var200;
        if (module0034.NIL != f1792(var77)) {
            SubLObject var201 = (SubLObject)module0034.NIL;
            final SubLObject var202 = f1792(var77);
            SubLObject var203 = (SubLObject)module0034.NIL;
            try {
                var203 = ReadWriteLocks.rw_lock_seize_write_lock(var202);
                var201 = f1930(var77, var200);
            }
            finally {
                if (module0034.NIL != var203) {
                    ReadWriteLocks.rw_lock_release_write_lock(var202);
                }
            }
            return var201;
        }
        return f1930(var77, var200);
    }
    
    public static SubLObject f1930(final SubLObject var77, final SubLObject var200) {
        f1817(var77);
        SubLObject var202;
        final SubLObject var201 = var202 = module0030.f1625(var200);
        SubLObject var203 = (SubLObject)module0034.NIL;
        var203 = var202.first();
        while (module0034.NIL != var202) {
            if (module0034.NIL != var203) {
                f1815(var77, var203, Hashtables.gethash(var200, var203, (SubLObject)module0034.UNPROVIDED));
            }
            else {
                f1798(var77, Hashtables.gethash(var200, var203, (SubLObject)module0034.UNPROVIDED));
            }
            var202 = var202.rest();
            var203 = var202.first();
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1931(final SubLObject var77) {
        assert module0034.NIL != f1789(var77) : var77;
        if (module0034.NIL != f1792(var77)) {
            SubLObject var78 = (SubLObject)module0034.NIL;
            final SubLObject var79 = f1792(var77);
            SubLObject var80 = (SubLObject)module0034.NIL;
            try {
                var80 = ReadWriteLocks.rw_lock_seize_read_lock(var79);
                var78 = f1932(var77);
            }
            finally {
                if (module0034.NIL != var80) {
                    ReadWriteLocks.rw_lock_release_read_lock(var79);
                }
            }
            return var78;
        }
        return f1932(var77);
    }
    
    public static SubLObject f1932(final SubLObject var77) {
        SubLObject var78 = (SubLObject)module0034.NIL;
        var78 = Hashtables.make_hash_table(f1824(var77), Symbols.symbol_function((SubLObject)module0034.EQL), (SubLObject)module0034.UNPROVIDED);
        SubLObject var80;
        final SubLObject var79 = var80 = f1822(var77);
        SubLObject var81 = (SubLObject)module0034.NIL;
        var81 = var80.first();
        while (module0034.NIL != var80) {
            Hashtables.sethash(var81, var78, f1813(var77, var81, (SubLObject)module0034.UNPROVIDED));
            var80 = var80.rest();
            var81 = var80.first();
        }
        Hashtables.sethash((SubLObject)module0034.NIL, var78, f1791(var77));
        return var78;
    }
    
    public static SubLObject f1933(final SubLObject var1, SubLObject var87, SubLObject var70, SubLObject var71, SubLObject var124) {
        if (var87 == module0034.UNPROVIDED) {
            var87 = (SubLObject)module0034.NIL;
        }
        if (var70 == module0034.UNPROVIDED) {
            var70 = (SubLObject)module0034.NIL;
        }
        if (var71 == module0034.UNPROVIDED) {
            var71 = Symbols.symbol_function((SubLObject)module0034.EQL);
        }
        if (var124 == module0034.UNPROVIDED) {
            var124 = (SubLObject)module0034.ZERO_INTEGER;
        }
        final SubLObject var125 = f1922(var1);
        SubLObject var126 = Symbols.symbol_value(var125);
        if (module0034.NIL == var126) {
            var126 = f1934(var1, var125, var70, var71, var87, var124);
        }
        return var126;
    }
    
    public static SubLObject f1934(final SubLObject var1, final SubLObject var202, final SubLObject var70, SubLObject var71, final SubLObject var87, final SubLObject var124) {
        if (module0034.NIL == var71) {
            var71 = Symbols.symbol_function((SubLObject)module0034.EQL);
        }
        SubLObject var203 = (SubLObject)module0034.NIL;
        final SubLObject var204 = module0034.$g869$.getGlobalValue();
        SubLObject var205 = (SubLObject)module0034.NIL;
        try {
            var205 = ReadWriteLocks.rw_lock_seize_write_lock(var204);
            var203 = Symbols.symbol_value(var202);
            if (module0034.NIL == var203) {
                var203 = f1807(ReadWriteLocks.new_rw_lock(Sequences.cconcatenate((SubLObject)module0034.$ic224$, Symbols.symbol_name(var1))), var1, var87, var70, var71, var124);
                Symbols.set(var202, var203);
            }
        }
        finally {
            if (module0034.NIL != var205) {
                ReadWriteLocks.rw_lock_release_write_lock(var204);
            }
        }
        return var203;
    }
    
    public static SubLObject f1935(final SubLObject var104, final SubLObject var140) {
        if (module0034.NIL != var104) {
            return f1857(var104, var140, (SubLObject)module0034.NIL);
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1936(final SubLObject var140) {
        final SubLObject var141 = f1922(var140);
        final SubLObject var142 = (SubLObject)((module0034.NIL != Symbols.boundp(var141)) ? Symbols.symbol_value(var141) : module0034.NIL);
        if (module0034.NIL != var142) {
            f1818(var142);
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1937(final SubLObject var1) {
        return Packages.intern(PrintLow.format((SubLObject)module0034.NIL, (SubLObject)module0034.$ic225$, var1), (SubLObject)module0034.UNPROVIDED);
    }
    
    public static SubLObject f1922(final SubLObject var1) {
        return Packages.intern(PrintLow.format((SubLObject)module0034.NIL, (SubLObject)module0034.$ic226$, var1), (SubLObject)module0034.UNPROVIDED);
    }
    
    public static SubLObject f1923(final SubLObject var77) {
        return (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic227$, var77, (SubLObject)module0034.$ic120$);
    }
    
    public static SubLObject f1938(final SubLObject var1) {
        return Packages.intern(PrintLow.format((SubLObject)module0034.NIL, (SubLObject)module0034.$ic228$, var1), (SubLObject)module0034.UNPROVIDED);
    }
    
    public static SubLObject f1928(final SubLObject var1, final SubLObject var188) {
        final SubLObject var189 = f1938(var1);
        if (var188.eql((SubLObject)module0034.$ic229$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic230$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var189));
        }
        if (var188.eql((SubLObject)module0034.$ic231$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic232$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var189));
        }
        if (var188.eql((SubLObject)module0034.$ic233$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic234$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var189));
        }
        if (var188.eql((SubLObject)module0034.$ic235$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic236$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var189));
        }
        if (var188.eql((SubLObject)module0034.$ic237$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic238$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var189));
        }
        if (var188.eql((SubLObject)module0034.$ic239$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic240$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var189));
        }
        if (var188.eql((SubLObject)module0034.$ic241$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic242$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var189));
        }
        return (SubLObject)module0034.$ic243$;
    }
    
    public static SubLObject f1924(final SubLObject var1) {
        final SubLObject var2 = f1938(var1);
        final SubLObject var3 = f1922(var1);
        return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic156$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic159$, var2, (SubLObject)module0034.NIL, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic17$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic244$, var3)), (SubLObject)module0034.$ic245$), (SubLObject)module0034.$ic246$));
    }
    
    public static SubLObject f1939(final SubLObject var1) {
        return Packages.intern(PrintLow.format((SubLObject)module0034.NIL, (SubLObject)module0034.$ic247$, var1), (SubLObject)module0034.UNPROVIDED);
    }
    
    public static SubLObject f1925(final SubLObject var1, final SubLObject var121, final SubLObject var77) {
        final SubLObject var122 = f1939(var1);
        final SubLObject var123 = f1900(var121);
        return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic159$, var122, ConsesLow.append(var121, (SubLObject)module0034.NIL), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic32$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic248$, var77, reader.bq_cons((SubLObject)module0034.$ic179$, ConsesLow.append(var123, (SubLObject)module0034.NIL)))));
    }
    
    public static SubLObject f1940(final SubLObject var207) {
        assert module0034.NIL != Types.function_spec_p(var207) : var207;
        if (module0034.NIL == conses_high.member(var207, module0034.$g883$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0034.EQL), Symbols.symbol_function((SubLObject)module0034.IDENTITY))) {
            module0034.$g883$.setGlobalValue((SubLObject)ConsesLow.cons(var207, module0034.$g883$.getGlobalValue()));
        }
        return var207;
    }
    
    public static SubLObject f1941(final SubLObject var207) {
        assert module0034.NIL != Types.function_spec_p(var207) : var207;
        module0034.$g883$.setGlobalValue(Sequences.delete(var207, module0034.$g883$.getGlobalValue(), (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED));
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1942() {
        SubLObject var9 = module0034.$g883$.getGlobalValue();
        SubLObject var10 = (SubLObject)module0034.NIL;
        var10 = var9.first();
        while (module0034.NIL != var9) {
            if (module0034.NIL != Symbols.fboundp(var10)) {
                Functions.funcall(var10);
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1943(final SubLObject var207) {
        assert module0034.NIL != Types.function_spec_p(var207) : var207;
        if (module0034.NIL == conses_high.member(var207, module0034.$g884$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0034.EQL), Symbols.symbol_function((SubLObject)module0034.IDENTITY))) {
            module0034.$g884$.setGlobalValue((SubLObject)ConsesLow.cons(var207, module0034.$g884$.getGlobalValue()));
        }
        return var207;
    }
    
    public static SubLObject f1944(final SubLObject var207) {
        assert module0034.NIL != Types.function_spec_p(var207) : var207;
        module0034.$g884$.setGlobalValue(Sequences.delete(var207, module0034.$g884$.getGlobalValue(), (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED));
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1945() {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0034.NIL == module0034.$g885$.getDynamicValue(var13));
    }
    
    public static SubLObject f1946(final SubLObject var11, final SubLObject var12) {
        final SubLObject var13 = var11.rest();
        final SubLObject var15;
        final SubLObject var14 = var15 = var13;
        return (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic17$, (SubLObject)module0034.$ic251$, ConsesLow.append(var15, (SubLObject)module0034.NIL));
    }
    
    public static SubLObject f1947(final SubLObject var207) {
        assert module0034.NIL != Types.function_spec_p(var207) : var207;
        if (module0034.NIL == conses_high.member(var207, module0034.$g886$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0034.EQL), Symbols.symbol_function((SubLObject)module0034.IDENTITY))) {
            module0034.$g886$.setGlobalValue((SubLObject)ConsesLow.cons(var207, module0034.$g886$.getGlobalValue()));
        }
        return var207;
    }
    
    public static SubLObject f1948(final SubLObject var207) {
        assert module0034.NIL != Types.function_spec_p(var207) : var207;
        module0034.$g886$.setGlobalValue(Sequences.delete(var207, module0034.$g886$.getGlobalValue(), (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED));
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1949(final SubLObject var207) {
        assert module0034.NIL != Types.function_spec_p(var207) : var207;
        if (module0034.NIL == conses_high.member(var207, module0034.$g887$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0034.EQL), Symbols.symbol_function((SubLObject)module0034.IDENTITY))) {
            module0034.$g887$.setGlobalValue((SubLObject)ConsesLow.cons(var207, module0034.$g887$.getGlobalValue()));
        }
        return var207;
    }
    
    public static SubLObject f1950(final SubLObject var207) {
        assert module0034.NIL != Types.function_spec_p(var207) : var207;
        module0034.$g887$.setGlobalValue(Sequences.delete(var207, module0034.$g887$.getGlobalValue(), (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED));
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1951(final SubLObject var207) {
        assert module0034.NIL != Types.function_spec_p(var207) : var207;
        if (module0034.NIL == conses_high.member(var207, module0034.$g888$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0034.EQL), Symbols.symbol_function((SubLObject)module0034.IDENTITY))) {
            module0034.$g888$.setGlobalValue((SubLObject)ConsesLow.cons(var207, module0034.$g888$.getGlobalValue()));
        }
        return var207;
    }
    
    public static SubLObject f1952(final SubLObject var207) {
        assert module0034.NIL != Types.function_spec_p(var207) : var207;
        module0034.$g888$.setGlobalValue(Sequences.delete(var207, module0034.$g888$.getGlobalValue(), (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED));
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1953(final SubLObject var207) {
        assert module0034.NIL != Types.function_spec_p(var207) : var207;
        if (module0034.NIL == conses_high.member(var207, module0034.$g889$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0034.EQL), Symbols.symbol_function((SubLObject)module0034.IDENTITY))) {
            module0034.$g889$.setGlobalValue((SubLObject)ConsesLow.cons(var207, module0034.$g889$.getGlobalValue()));
        }
        return var207;
    }
    
    public static SubLObject f1954(final SubLObject var207) {
        assert module0034.NIL != Types.function_spec_p(var207) : var207;
        module0034.$g889$.setGlobalValue(Sequences.delete(var207, module0034.$g889$.getGlobalValue(), (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED));
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1955(final SubLObject var207) {
        assert module0034.NIL != Types.function_spec_p(var207) : var207;
        if (module0034.NIL == conses_high.member(var207, module0034.$g890$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0034.EQL), Symbols.symbol_function((SubLObject)module0034.IDENTITY))) {
            module0034.$g890$.setGlobalValue((SubLObject)ConsesLow.cons(var207, module0034.$g890$.getGlobalValue()));
        }
        return var207;
    }
    
    public static SubLObject f1956(final SubLObject var207) {
        assert module0034.NIL != Types.function_spec_p(var207) : var207;
        module0034.$g890$.setGlobalValue(Sequences.delete(var207, module0034.$g890$.getGlobalValue(), (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED));
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1957(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic257$);
        final SubLObject var15 = var14.rest();
        var14 = var14.first();
        SubLObject var16 = (SubLObject)module0034.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic257$);
        var16 = var14.first();
        var14 = var14.rest();
        SubLObject var17 = (SubLObject)module0034.NIL;
        SubLObject var18 = var14;
        SubLObject var19 = (SubLObject)module0034.NIL;
        SubLObject var217_218 = (SubLObject)module0034.NIL;
        while (module0034.NIL != var18) {
            cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)module0034.$ic257$);
            var217_218 = var18.first();
            var18 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)module0034.$ic257$);
            if (module0034.NIL == conses_high.member(var217_218, (SubLObject)module0034.$ic258$, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED)) {
                var19 = (SubLObject)module0034.T;
            }
            if (var217_218 == module0034.$ic12$) {
                var17 = var18.first();
            }
            var18 = var18.rest();
        }
        if (module0034.NIL != var19 && module0034.NIL == var17) {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0034.$ic257$);
        }
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0034.$ic63$, var14);
        final SubLObject var21 = (SubLObject)((module0034.NIL != var20) ? conses_high.cadr(var20) : module0034.NIL);
        final SubLObject var22;
        var14 = (var22 = var15);
        return (SubLObject)module0034.$ic259$;
    }
    
    public static SubLObject f1958(final SubLObject var11, final SubLObject var12) {
        SubLObject var14;
        final SubLObject var13 = var14 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic257$);
        final SubLObject var15 = var14.rest();
        var14 = var14.first();
        SubLObject var16 = (SubLObject)module0034.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0034.$ic257$);
        var16 = var14.first();
        var14 = var14.rest();
        SubLObject var17 = (SubLObject)module0034.NIL;
        SubLObject var18 = var14;
        SubLObject var19 = (SubLObject)module0034.NIL;
        SubLObject var227_228 = (SubLObject)module0034.NIL;
        while (module0034.NIL != var18) {
            cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)module0034.$ic257$);
            var227_228 = var18.first();
            var18 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)module0034.$ic257$);
            if (module0034.NIL == conses_high.member(var227_228, (SubLObject)module0034.$ic258$, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED)) {
                var19 = (SubLObject)module0034.T;
            }
            if (var227_228 == module0034.$ic12$) {
                var17 = var18.first();
            }
            var18 = var18.rest();
        }
        if (module0034.NIL != var19 && module0034.NIL == var17) {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0034.$ic257$);
        }
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0034.$ic63$, var14);
        final SubLObject var21 = (SubLObject)((module0034.NIL != var20) ? conses_high.cadr(var20) : module0034.NIL);
        final SubLObject var22;
        var14 = (var22 = var15);
        return (SubLObject)module0034.$ic260$;
    }
    
    public static SubLObject f1900(final SubLObject var121) {
        SubLObject var122 = (SubLObject)module0034.NIL;
        SubLObject var123 = var121;
        SubLObject var124 = (SubLObject)module0034.NIL;
        var124 = var123.first();
        while (module0034.NIL != var123) {
            if (var124 != module0034.$ic261$) {
                if (var124.isCons()) {
                    var122 = (SubLObject)ConsesLow.cons(var124.first(), var122);
                }
                else {
                    var122 = (SubLObject)ConsesLow.cons(var124, var122);
                }
            }
            var123 = var123.rest();
            var124 = var123.first();
        }
        return Sequences.nreverse(var122);
    }
    
    public static SubLObject f1959(final SubLObject var98) {
        if (module0034.NIL != var98.rest()) {
            return module0004.values_list(var98);
        }
        return var98.first();
    }
    
    public static SubLObject f1926(final SubLObject var161) {
        return (SubLObject)ConsesLow.list((SubLObject)module0034.$ic263$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var161));
    }
    
    public static SubLObject f1903(final SubLObject var1) {
        return Packages.intern(PrintLow.format((SubLObject)module0034.NIL, (SubLObject)module0034.$ic264$, var1), (SubLObject)module0034.UNPROVIDED);
    }
    
    public static SubLObject f1905(final SubLObject var161, final SubLObject var121, final SubLObject var26) {
        return (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic265$, var161, ConsesLow.append(var121, (SubLObject)module0034.NIL), ConsesLow.append(var26, (SubLObject)module0034.NIL));
    }
    
    public static SubLObject f1927(final SubLObject var155, final SubLObject var1, final SubLObject var121) {
        if (module0034.NIL != conses_high.member(var155, (SubLObject)module0034.$ic266$, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic156$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic267$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1)), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic157$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic158$, (SubLObject)module0034.$ic268$, var1))));
        }
        if (var155 == module0034.$ic269$) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic156$, (SubLObject)ConsesLow.listS((SubLObject)module0034.$ic270$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic150$, var1), var121, (SubLObject)module0034.$ic271$), (SubLObject)ConsesLow.list((SubLObject)module0034.$ic157$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic158$, (SubLObject)module0034.$ic268$, var1))));
        }
        if (module0034.NIL != conses_high.member(var155, (SubLObject)module0034.$ic272$, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0034.$ic157$, (SubLObject)ConsesLow.list((SubLObject)module0034.$ic158$, var155, var1)));
        }
        Errors.warn((SubLObject)module0034.$ic273$);
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1960() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1765", "S#3050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1766", "S#3051", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1767", "S#3052", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1768", "S#3053", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1769", "S#3054");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1770", "S#3055", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1771", "S#3056", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1772", "S#3057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1773", "S#3058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1774", "S#3059", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1775", "S#3060", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1776", "S#3061", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1777", "S#3062", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1778", "S#3063", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1779", "S#3064", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1780", "S#3065", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1781", "S#3066", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1782", "S#3067", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1783", "S#3068");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1784", "S#3069");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1785", "S#3070");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1786", "S#3071");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1787", "S#3072", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1789", "S#3031", 1, 0, false);
        new $f1789$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1790", "S#3073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1791", "S#3074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1792", "S#3075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1793", "S#3076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1794", "S#3077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1795", "S#3078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1796", "S#3079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1797", "S#3080", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1798", "S#3081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1799", "S#3082", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1800", "S#3083", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1801", "S#3084", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1802", "S#3085", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1803", "S#3086", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1804", "S#3087", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1805", "S#3088", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1806", "S#3089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1807", "S#3090", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1808", "S#3091", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1788", "S#3092", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1809", "S#3093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1810", "S#3094", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1811", "S#3095", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1812", "S#3096", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1813", "S#3097", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1814", "S#3098", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1815", "S#3099", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1816", "S#3100", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1817", "S#3101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1818", "S#3102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1819", "S#3103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1820", "S#3104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1821", "S#3105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1822", "S#3106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1823", "S#3107", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1824", "S#3108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1825", "S#3109", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1826", "S#3110", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1827", "S#3111", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1828", "S#3112", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1829", "S#3113", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1830", "S#3114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1831", "S#3115", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1832", "S#3116", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1833", "S#3117", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1834", "S#3118", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1835", "S#3119", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1836", "S#3120", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1837", "S#3121", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1839", "S#3044", 1, 0, false);
        new $f1839$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1840", "S#3122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1841", "S#3123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1842", "S#3124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1843", "S#3125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1844", "S#3126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1845", "S#3127", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1846", "S#3128", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1847", "S#3129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1848", "S#3130", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1849", "S#3131", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1850", "S#3132", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1851", "S#3133", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1852", "S#3134", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1853", "S#3135", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1854", "S#3136", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1855", "S#3137", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1838", "S#3138", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1856", "S#3139", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1857", "S#3140", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1858", "S#3141", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1859", "S#3142", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1860", "S#3143", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1861", "S#3144", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1862", "S#3145", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1863", "S#3146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1864", "S#3147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1865", "S#3148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1866", "S#3149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1867", "S#3150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1868", "S#3151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1869", "S#3152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1870", "S#3153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1871", "S#3154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1872", "S#3155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1873", "S#3156", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1874", "S#3157", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1875", "S#3158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1876", "S#3159", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1877", "S#3160", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1878", "S#3161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1879", "S#3162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1880", "S#3163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1881", "S#3164", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1882", "S#3165");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1883", "S#3166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1884", "S#3167", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1885", "S#3168");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1886", "S#3169");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1887", "S#3170");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1888", "S#3171", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1889", "S#3172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1890", "S#3173", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1891", "S#3174", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1892", "S#3175", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1893", "S#3176", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1894", "S#3177", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1895", "S#3178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1896", "S#3179", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1897", "DEFINE-MEMOIZED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1899", "S#3180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1898", "S#3181", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1901", "S#3182", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1902", "S#3183", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1908", "S#3184", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1907", "S#3185", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1906", "S#3186", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1904", "S#3187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1909", "S#3188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1910", "S#3189", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1911", "S#3190", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1912", "S#3191", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1913", "S#3192", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1914", "S#3193", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1915", "DEFINE-CACHED-NEW");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1917", "S#3194");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1918", "S#3195");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1919", "S#3196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1916", "S#3197", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1920", "S#3198", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1921", "S#3199", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1929", "S#3200", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1930", "S#3201", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1931", "S#3202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1932", "S#3203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1933", "S#3204", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1934", "S#3205", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1935", "S#3206", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1936", "S#3207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1937", "S#3208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1922", "S#3209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1923", "S#3210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1938", "S#3211", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1928", "S#3212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1924", "S#3213", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1939", "S#3214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1925", "S#3215", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1940", "S#3216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1941", "S#3217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1942", "S#3218", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1943", "S#3219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1944", "S#3220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1945", "S#3221", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1946", "S#3222");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1947", "S#3223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1948", "S#3224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1949", "S#3225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1950", "S#3226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1951", "S#3227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1952", "S#3228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1953", "S#3229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1954", "S#3230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1955", "S#3231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1956", "S#3232", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1957", "S#3233");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0034", "f1958", "S#3234");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1900", "S#3235", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1959", "S#3236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1926", "S#3237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1903", "S#3238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1905", "S#3239", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0034", "f1927", "S#3240", 3, 0, false);
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1961() {
        module0034.$g869$ = SubLFiles.defconstant("S#3241", ReadWriteLocks.new_rw_lock((SubLObject)module0034.$ic0$));
        module0034.$g870$ = SubLFiles.deflexical("S#3242", (SubLObject)((module0034.NIL != Symbols.boundp((SubLObject)module0034.$ic1$)) ? module0034.$g870$.getGlobalValue() : module0034.NIL));
        module0034.$g871$ = SubLFiles.deflexical("S#3243", (module0034.NIL != Symbols.boundp((SubLObject)module0034.$ic2$)) ? module0034.$g871$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0034.SIXTEEN_INTEGER, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED));
        module0034.$g872$ = SubLFiles.deflexical("S#3244", (module0034.NIL != Symbols.boundp((SubLObject)module0034.$ic3$)) ? module0034.$g872$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0034.SIXTEEN_INTEGER, (SubLObject)module0034.UNPROVIDED, (SubLObject)module0034.UNPROVIDED));
        module0034.$g873$ = SubLFiles.deflexical("S#3245", (SubLObject)((module0034.NIL != Symbols.boundp((SubLObject)module0034.$ic8$)) ? module0034.$g873$.getGlobalValue() : module0034.NIL));
        module0034.$g874$ = SubLFiles.defvar("S#3246", (SubLObject)module0034.$ic9$);
        module0034.$g875$ = SubLFiles.defvar("S#3247", (SubLObject)module0034.NIL);
        module0034.$g876$ = SubLFiles.defparameter("S#3248", (SubLObject)module0034.T);
        module0034.$g877$ = SubLFiles.defconstant("S#3249", (SubLObject)module0034.$ic35$);
        module0034.$g878$ = SubLFiles.defconstant("S#3250", (SubLObject)module0034.$ic82$);
        module0034.$g879$ = SubLFiles.defparameter("S#3251", (SubLObject)module0034.NIL);
        module0034.$g880$ = SubLFiles.deflexical("S#3252", (SubLObject)((module0034.NIL != Symbols.boundp((SubLObject)module0034.$ic140$)) ? module0034.$g880$.getGlobalValue() : module0034.NIL));
        module0034.$g881$ = SubLFiles.deflexical("S#3253", (SubLObject)((module0034.NIL != Symbols.boundp((SubLObject)module0034.$ic202$)) ? module0034.$g881$.getGlobalValue() : module0034.NIL));
        module0034.$g882$ = SubLFiles.deflexical("S#3254", (SubLObject)module0034.$ic214$);
        module0034.$g883$ = SubLFiles.deflexical("S#3255", (SubLObject)((module0034.NIL != Symbols.boundp((SubLObject)module0034.$ic249$)) ? module0034.$g883$.getGlobalValue() : module0034.NIL));
        module0034.$g884$ = SubLFiles.deflexical("S#3256", (SubLObject)((module0034.NIL != Symbols.boundp((SubLObject)module0034.$ic250$)) ? module0034.$g884$.getGlobalValue() : module0034.NIL));
        module0034.$g885$ = SubLFiles.defparameter("S#3257", (SubLObject)module0034.NIL);
        module0034.$g886$ = SubLFiles.deflexical("S#3258", (SubLObject)((module0034.NIL != Symbols.boundp((SubLObject)module0034.$ic252$)) ? module0034.$g886$.getGlobalValue() : module0034.NIL));
        module0034.$g887$ = SubLFiles.deflexical("S#3259", (SubLObject)((module0034.NIL != Symbols.boundp((SubLObject)module0034.$ic253$)) ? module0034.$g887$.getGlobalValue() : module0034.NIL));
        module0034.$g888$ = SubLFiles.deflexical("S#3260", (SubLObject)((module0034.NIL != Symbols.boundp((SubLObject)module0034.$ic254$)) ? module0034.$g888$.getGlobalValue() : module0034.NIL));
        module0034.$g889$ = SubLFiles.deflexical("S#3261", (SubLObject)((module0034.NIL != Symbols.boundp((SubLObject)module0034.$ic255$)) ? module0034.$g889$.getGlobalValue() : module0034.NIL));
        module0034.$g890$ = SubLFiles.deflexical("S#3262", (SubLObject)((module0034.NIL != Symbols.boundp((SubLObject)module0034.$ic256$)) ? module0034.$g890$.getGlobalValue() : module0034.NIL));
        module0034.$g891$ = SubLFiles.defconstant("S#3263", (SubLObject)module0034.$ic21$);
        return (SubLObject)module0034.NIL;
    }
    
    public static SubLObject f1962() {
        module0003.f57((SubLObject)module0034.$ic1$);
        module0003.f57((SubLObject)module0034.$ic2$);
        module0003.f57((SubLObject)module0034.$ic3$);
        module0003.f57((SubLObject)module0034.$ic8$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0034.$g877$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0034.$ic42$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0034.$ic43$);
        Structures.def_csetf((SubLObject)module0034.$ic44$, (SubLObject)module0034.$ic45$);
        Structures.def_csetf((SubLObject)module0034.$ic46$, (SubLObject)module0034.$ic47$);
        Structures.def_csetf((SubLObject)module0034.$ic48$, (SubLObject)module0034.$ic49$);
        Structures.def_csetf((SubLObject)module0034.$ic50$, (SubLObject)module0034.$ic51$);
        Structures.def_csetf((SubLObject)module0034.$ic52$, (SubLObject)module0034.$ic53$);
        Structures.def_csetf((SubLObject)module0034.$ic54$, (SubLObject)module0034.$ic55$);
        Structures.def_csetf((SubLObject)module0034.$ic56$, (SubLObject)module0034.$ic57$);
        Equality.identity((SubLObject)module0034.$ic35$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0034.$g877$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0034.$ic70$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0034.$g878$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0034.$ic89$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0034.$ic90$);
        Structures.def_csetf((SubLObject)module0034.$ic91$, (SubLObject)module0034.$ic92$);
        Structures.def_csetf((SubLObject)module0034.$ic93$, (SubLObject)module0034.$ic94$);
        Structures.def_csetf((SubLObject)module0034.$ic24$, (SubLObject)module0034.$ic95$);
        Structures.def_csetf((SubLObject)module0034.$ic96$, (SubLObject)module0034.$ic97$);
        Structures.def_csetf((SubLObject)module0034.$ic98$, (SubLObject)module0034.$ic99$);
        Equality.identity((SubLObject)module0034.$ic82$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0034.$g878$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0034.$ic104$));
        module0002.f50((SubLObject)module0034.$ic138$, (SubLObject)module0034.$ic139$);
        module0003.f57((SubLObject)module0034.$ic140$);
        module0002.f38((SubLObject)module0034.$ic142$);
        module0003.f57((SubLObject)module0034.$ic202$);
        module0002.f38((SubLObject)module0034.$ic207$);
        module0003.f57((SubLObject)module0034.$ic249$);
        module0003.f57((SubLObject)module0034.$ic250$);
        module0003.f57((SubLObject)module0034.$ic252$);
        module0003.f57((SubLObject)module0034.$ic253$);
        module0003.f57((SubLObject)module0034.$ic254$);
        module0003.f57((SubLObject)module0034.$ic255$);
        module0003.f57((SubLObject)module0034.$ic256$);
        module0002.f50((SubLObject)module0034.$ic171$, (SubLObject)module0034.$ic262$);
        return (SubLObject)module0034.NIL;
    }
    
    public void declareFunctions() {
        f1960();
    }
    
    public void initializeVariables() {
        f1961();
    }
    
    public void runTopLevelForms() {
        f1962();
    }
    
    static {
        me = (SubLFile)new module0034();
        module0034.$g869$ = null;
        module0034.$g870$ = null;
        module0034.$g871$ = null;
        module0034.$g872$ = null;
        module0034.$g873$ = null;
        module0034.$g874$ = null;
        module0034.$g875$ = null;
        module0034.$g876$ = null;
        module0034.$g877$ = null;
        module0034.$g878$ = null;
        module0034.$g879$ = null;
        module0034.$g880$ = null;
        module0034.$g881$ = null;
        module0034.$g882$ = null;
        module0034.$g883$ = null;
        module0034.$g884$ = null;
        module0034.$g885$ = null;
        module0034.$g886$ = null;
        module0034.$g887$ = null;
        module0034.$g888$ = null;
        module0034.$g889$ = null;
        module0034.$g890$ = null;
        module0034.$g891$ = null;
        $ic0$ = SubLObjectFactory.makeString("global-caching-lock");
        $ic1$ = SubLObjectFactory.makeSymbol("S#3242", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#3243", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#3244", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol(">");
        $ic5$ = SubLObjectFactory.makeSymbol("CDR");
        $ic6$ = SubLObjectFactory.makeString("Cached Function Call: ~S(~S)~%");
        $ic7$ = SubLObjectFactory.makeString("Missed Cached Function Call: ~S(~S)~%");
        $ic8$ = SubLObjectFactory.makeSymbol("S#3245", "CYC");
        $ic9$ = SubLObjectFactory.makeKeyword("ALL");
        $ic10$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#3264", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3265", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DISABLE"), (SubLObject)SubLObjectFactory.makeKeyword("ENABLE"));
        $ic12$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic13$ = SubLObjectFactory.makeKeyword("DISABLE");
        $ic14$ = SubLObjectFactory.makeKeyword("ENABLE");
        $ic15$ = SubLObjectFactory.makeString("DISABLE must be :ALL");
        $ic16$ = SubLObjectFactory.makeString("ENABLE must be :ALL");
        $ic17$ = SubLObjectFactory.makeSymbol("CLET");
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3246", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3246", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3247", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3247", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3248", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3248", "CYC")));
        $ic19$ = SubLObjectFactory.makeSymbol("S#3055", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#3056", "CYC");
        $ic21$ = SubLObjectFactory.makeInteger(167);
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3266", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic23$ = SubLObjectFactory.makeSymbol("S#672", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#3124", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("PIF");
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3267", "CYC"));
        $ic27$ = SubLObjectFactory.makeSymbol("S#3018", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#672", "CYC"));
        $ic29$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic30$ = SubLObjectFactory.makeSymbol("S#3267", "CYC");
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("S#3267", "CYC")));
        $ic32$ = SubLObjectFactory.makeSymbol("RET");
        $ic33$ = SubLObjectFactory.makeSymbol("S#3019", "CYC");
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#672", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic35$ = SubLObjectFactory.makeSymbol("S#3030", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#3031", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3268", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3269", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2959", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3270", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3271", "CYC"));
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STORE"), (SubLObject)SubLObjectFactory.makeKeyword("ZERO-ARG-RESULTS"), (SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("CAPACITY"), (SubLObject)SubLObjectFactory.makeKeyword("FUNC-SYMBOL"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("ARGS-LENGTH"));
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3073", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3074", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3075", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3076", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3077", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3078", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3079", "CYC"));
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3080", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3081", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3082", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3083", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3084", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3085", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3086", "CYC"));
        $ic41$ = SubLObjectFactory.makeSymbol("S#3092", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#3072", "CYC");
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#3031", "CYC"));
        $ic44$ = SubLObjectFactory.makeSymbol("S#3073", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#3080", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#3074", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#3081", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#3075", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#3082", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#3076", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#3083", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#3077", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#3084", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#3078", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#3085", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#3079", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#3086", "CYC");
        $ic58$ = SubLObjectFactory.makeKeyword("STORE");
        $ic59$ = SubLObjectFactory.makeKeyword("ZERO-ARG-RESULTS");
        $ic60$ = SubLObjectFactory.makeKeyword("LOCK");
        $ic61$ = SubLObjectFactory.makeKeyword("CAPACITY");
        $ic62$ = SubLObjectFactory.makeKeyword("FUNC-SYMBOL");
        $ic63$ = SubLObjectFactory.makeKeyword("TEST");
        $ic64$ = SubLObjectFactory.makeKeyword("ARGS-LENGTH");
        $ic65$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic66$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic67$ = SubLObjectFactory.makeSymbol("S#3087", "CYC");
        $ic68$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic69$ = SubLObjectFactory.makeKeyword("END");
        $ic70$ = SubLObjectFactory.makeSymbol("S#3089", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic72$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic73$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic74$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic75$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic76$ = SubLObjectFactory.makeString("#<caching-state function: ~A lock: '~A' capacity: ~A test: ~S ~%    store: ");
        $ic77$ = SubLObjectFactory.makeString(">");
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3272", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3267", "CYC"));
        $ic79$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic80$ = SubLObjectFactory.makeKeyword("RECALC");
        $ic81$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3272", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3273", "CYC"));
        $ic82$ = SubLObjectFactory.makeSymbol("S#3043", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#3044", "CYC");
        $ic84$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3268", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("S#672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3274", "CYC"));
        $ic85$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STORE"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT-PROCESS"), (SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("SHOULD-CLONE"));
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3123", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3125", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3126", "CYC"));
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3128", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3129", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3131", "CYC"));
        $ic88$ = SubLObjectFactory.makeSymbol("S#3138", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#3121", "CYC");
        $ic90$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#3044", "CYC"));
        $ic91$ = SubLObjectFactory.makeSymbol("S#3122", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("S#3127", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("S#3123", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("S#3128", "CYC");
        $ic95$ = SubLObjectFactory.makeSymbol("S#3129", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#3125", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#3130", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("S#3126", "CYC");
        $ic99$ = SubLObjectFactory.makeSymbol("S#3131", "CYC");
        $ic100$ = SubLObjectFactory.makeKeyword("CURRENT-PROCESS");
        $ic101$ = SubLObjectFactory.makeKeyword("NAME");
        $ic102$ = SubLObjectFactory.makeKeyword("SHOULD-CLONE");
        $ic103$ = SubLObjectFactory.makeSymbol("S#3132", "CYC");
        $ic104$ = SubLObjectFactory.makeSymbol("S#3134", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic106$ = SubLObjectFactory.makeSymbol("READER-WRITER-LOCK-P");
        $ic107$ = SubLObjectFactory.makeSymbol("FUNCTIONP");
        $ic108$ = SubLObjectFactory.makeString("memoization-state-clone-lock");
        $ic109$ = SubLObjectFactory.makeString("#<memoization-state name: '~A' lock: '~A' should-clone: ~A current-process: '~A' ~%    store: ~A ");
        $ic110$ = SubLObjectFactory.makeString("Clone: ");
        $ic111$ = SubLObjectFactory.makeString("Need to implement dictionary copy!");
        $ic112$ = SubLObjectFactory.makeString("implement me in: memoization-state-merge-cloned-state");
        $ic113$ = SubLObjectFactory.makeSymbol("S#3160", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic115$ = SubLObjectFactory.makeString("Dont know how to determine size and capacity for objects of type ~A.");
        $ic116$ = SubLObjectFactory.makeUninternedSymbol("US#23B8C91");
        $ic117$ = SubLObjectFactory.makeUninternedSymbol("US#45AF0C1");
        $ic118$ = SubLObjectFactory.makeUninternedSymbol("US#5D6548F");
        $ic119$ = SubLObjectFactory.makeSymbol("S#3251", "CYC");
        $ic120$ = ConsesLow.list((SubLObject)module0034.NIL);
        $ic121$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic122$ = SubLObjectFactory.makeSymbol("CAND");
        $ic123$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic124$ = SubLObjectFactory.makeSymbol("S#3152", "CYC");
        $ic125$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS")));
        $ic126$ = SubLObjectFactory.makeSymbol("S#3156", "CYC");
        $ic127$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.")));
        $ic128$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic129$ = SubLObjectFactory.makeUninternedSymbol("US#352BA47");
        $ic130$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3136", "CYC")));
        $ic131$ = SubLObjectFactory.makeSymbol("S#3165", "CYC");
        $ic132$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic133$ = SubLObjectFactory.makeUninternedSymbol("US#352BA47");
        $ic134$ = SubLObjectFactory.makeSymbol("S#194", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#3161", "CYC");
        $ic136$ = SubLObjectFactory.makeUninternedSymbol("US#352BA47");
        $ic137$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3171", "CYC")));
        $ic138$ = SubLObjectFactory.makeSymbol("S#3171", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("S#3170", "CYC");
        $ic140$ = SubLObjectFactory.makeSymbol("S#3252", "CYC");
        $ic141$ = SubLObjectFactory.makeSymbol("FBOUNDP");
        $ic142$ = SubLObjectFactory.makeSymbol("DEFINE-MEMOIZED");
        $ic143$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2959", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FACCESS"), (SubLObject)SubLObjectFactory.makeSymbol("S#3275", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3276", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic144$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("CAPACITY"), (SubLObject)SubLObjectFactory.makeKeyword("FACCESS"), (SubLObject)SubLObjectFactory.makeKeyword("MEMOIZATION-STATE-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("MEMOIZATION-STATE-FUNCTION-ARG-POSITIONS"));
        $ic145$ = SubLObjectFactory.makeKeyword("FACCESS");
        $ic146$ = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE-FUNCTION");
        $ic147$ = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE-FUNCTION-ARG-POSITIONS");
        $ic148$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)module0034.EQL);
        $ic149$ = SubLObjectFactory.makeString("Got a test expression of length: ~S for ~S~%");
        $ic150$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic151$ = SubLObjectFactory.makeSymbol("FUNCTION");
        $ic152$ = SubLObjectFactory.makeString("Don't know how to convert: ~S to a test~%");
        $ic153$ = SubLObjectFactory.makeUninternedSymbol("US#3F5C755");
        $ic154$ = SubLObjectFactory.makeUninternedSymbol("US#376EE80");
        $ic155$ = SubLObjectFactory.makeUninternedSymbol("US#563B6C3");
        $ic156$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic157$ = SubLObjectFactory.makeSymbol("DECLAIM");
        $ic158$ = SubLObjectFactory.makeSymbol("FACCESS");
        $ic159$ = SubLObjectFactory.makeSymbol("DEFINE");
        $ic160$ = SubLObjectFactory.makeSymbol("S#3050", "CYC");
        $ic161$ = SubLObjectFactory.makeSymbol("S#3057", "CYC");
        $ic162$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic163$ = SubLObjectFactory.makeSymbol("S#3140", "CYC");
        $ic164$ = SubLObjectFactory.makeSymbol("S#3090", "CYC");
        $ic165$ = SubLObjectFactory.makeSymbol("S#3143", "CYC");
        $ic166$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&"));
        $ic167$ = SubLObjectFactory.makeSymbol("S#3051", "CYC");
        $ic168$ = SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST");
        $ic169$ = SubLObjectFactory.makeSymbol("S#3096", "CYC");
        $ic170$ = SubLObjectFactory.makeSymbol("S#3100", "CYC");
        $ic171$ = SubLObjectFactory.makeSymbol("S#3236", "CYC");
        $ic172$ = SubLObjectFactory.makeUninternedSymbol("US#170B150");
        $ic173$ = SubLObjectFactory.makeUninternedSymbol("US#3F5C755");
        $ic174$ = SubLObjectFactory.makeUninternedSymbol("US#376EE80");
        $ic175$ = SubLObjectFactory.makeUninternedSymbol("US#563B6C3");
        $ic176$ = SubLObjectFactory.makeUninternedSymbol("US#BB262");
        $ic177$ = SubLObjectFactory.makeSymbol("S#3098", "CYC");
        $ic178$ = SubLObjectFactory.makeSymbol("S#3120", "CYC");
        $ic179$ = SubLObjectFactory.makeSymbol("LIST");
        $ic180$ = SubLObjectFactory.makeSymbol("S#3067", "CYC");
        $ic181$ = SubLObjectFactory.makeSymbol("S#3066", "CYC");
        $ic182$ = SubLObjectFactory.makeSymbol("S#3065", "CYC");
        $ic183$ = SubLObjectFactory.makeSymbol("S#3064", "CYC");
        $ic184$ = SubLObjectFactory.makeSymbol("S#3063", "CYC");
        $ic185$ = SubLObjectFactory.makeSymbol("S#3062", "CYC");
        $ic186$ = SubLObjectFactory.makeSymbol("S#3061", "CYC");
        $ic187$ = SubLObjectFactory.makeSymbol("S#3060", "CYC");
        $ic188$ = SubLObjectFactory.makeSymbol("S#3059", "CYC");
        $ic189$ = SubLObjectFactory.makeSymbol("S#3058", "CYC");
        $ic190$ = SubLObjectFactory.makeSymbol("S#3094", "CYC");
        $ic191$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic192$ = SubLObjectFactory.makeSymbol("S#3277", "CYC");
        $ic193$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3272", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("S#3277", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3278", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("S#3277", "CYC"))));
        $ic194$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("S#3272", "CYC")));
        $ic195$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPOP"), (SubLObject)SubLObjectFactory.makeSymbol("S#3272", "CYC"));
        $ic196$ = SubLObjectFactory.makeSymbol("S#3272", "CYC");
        $ic197$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#3272", "CYC")));
        $ic198$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3236", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3278", "CYC"))));
        $ic199$ = SubLObjectFactory.makeSymbol("S#3118", "CYC");
        $ic200$ = SubLObjectFactory.makeSymbol("MAKE-SYMBOL");
        $ic201$ = SubLObjectFactory.makeSymbol("S#3178", "CYC");
        $ic202$ = SubLObjectFactory.makeSymbol("S#3253", "CYC");
        $ic203$ = SubLObjectFactory.makeSymbol("BOUNDP");
        $ic204$ = SubLObjectFactory.makeSymbol("S#3209", "CYC");
        $ic205$ = SubLObjectFactory.makeSymbol("SYMBOL-VALUE");
        $ic206$ = SubLObjectFactory.makeString("Clearing all globally cached functions");
        $ic207$ = SubLObjectFactory.makeSymbol("DEFINE-CACHED-NEW");
        $ic208$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2959", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FACCESS"), (SubLObject)SubLObjectFactory.makeSymbol("S#1534", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3279", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic209$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("CAPACITY"), (SubLObject)SubLObjectFactory.makeKeyword("FACCESS"), (SubLObject)SubLObjectFactory.makeKeyword("SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("CLEAR-WHEN"));
        $ic210$ = SubLObjectFactory.makeKeyword("SIZE");
        $ic211$ = SubLObjectFactory.makeKeyword("CLEAR-WHEN");
        $ic212$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#202", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1534", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic213$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1534", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic214$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HL-STORE-MODIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("GENL-MT-MODIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("GENL-PREDS-MODIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("GENLS-MODIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("ISA-MODIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("QUOTED-ISA-MODIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("WFF-CONSTRAINT-MODIFIED"));
        $ic215$ = SubLObjectFactory.makeSymbol("S#3196", "CYC");
        $ic216$ = SubLObjectFactory.makeUninternedSymbol("US#563B6C3");
        $ic217$ = SubLObjectFactory.makeUninternedSymbol("US#376EE80");
        $ic218$ = SubLObjectFactory.makeSymbol("S#3205", "CYC");
        $ic219$ = SubLObjectFactory.makeUninternedSymbol("US#170B150");
        $ic220$ = SubLObjectFactory.makeUninternedSymbol("US#563B6C3");
        $ic221$ = SubLObjectFactory.makeUninternedSymbol("US#BB262");
        $ic222$ = SubLObjectFactory.makeUninternedSymbol("US#376EE80");
        $ic223$ = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $ic224$ = SubLObjectFactory.makeString("global caching lock for ");
        $ic225$ = SubLObjectFactory.makeString("*~A-RW-LOCK*");
        $ic226$ = SubLObjectFactory.makeString("*~A-CACHING-STATE*");
        $ic227$ = SubLObjectFactory.makeSymbol("DEFLEXICAL-PRIVATE");
        $ic228$ = SubLObjectFactory.makeString("CLEAR-~A");
        $ic229$ = SubLObjectFactory.makeKeyword("HL-STORE-MODIFIED");
        $ic230$ = SubLObjectFactory.makeSymbol("S#3216", "CYC");
        $ic231$ = SubLObjectFactory.makeKeyword("GENL-MT-MODIFIED");
        $ic232$ = SubLObjectFactory.makeSymbol("S#3219", "CYC");
        $ic233$ = SubLObjectFactory.makeKeyword("GENL-PREDS-MODIFIED");
        $ic234$ = SubLObjectFactory.makeSymbol("S#3223", "CYC");
        $ic235$ = SubLObjectFactory.makeKeyword("GENLS-MODIFIED");
        $ic236$ = SubLObjectFactory.makeSymbol("S#3225", "CYC");
        $ic237$ = SubLObjectFactory.makeKeyword("ISA-MODIFIED");
        $ic238$ = SubLObjectFactory.makeSymbol("S#3229", "CYC");
        $ic239$ = SubLObjectFactory.makeKeyword("QUOTED-ISA-MODIFIED");
        $ic240$ = SubLObjectFactory.makeSymbol("S#3231", "CYC");
        $ic241$ = SubLObjectFactory.makeKeyword("WFF-CONSTRAINT-MODIFIED");
        $ic242$ = SubLObjectFactory.makeSymbol("S#3227", "CYC");
        $ic243$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"));
        $ic244$ = SubLObjectFactory.makeSymbol("S#3280", "CYC");
        $ic245$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("S#3280", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3102", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3280", "CYC"))));
        $ic246$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)module0034.NIL));
        $ic247$ = SubLObjectFactory.makeString("REMOVE-~A");
        $ic248$ = SubLObjectFactory.makeSymbol("S#3113", "CYC");
        $ic249$ = SubLObjectFactory.makeSymbol("S#3255", "CYC");
        $ic250$ = SubLObjectFactory.makeSymbol("S#3256", "CYC");
        $ic251$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3257", "CYC"), (SubLObject)module0034.T));
        $ic252$ = SubLObjectFactory.makeSymbol("S#3258", "CYC");
        $ic253$ = SubLObjectFactory.makeSymbol("S#3259", "CYC");
        $ic254$ = SubLObjectFactory.makeSymbol("S#3260", "CYC");
        $ic255$ = SubLObjectFactory.makeSymbol("S#3261", "CYC");
        $ic256$ = SubLObjectFactory.makeSymbol("S#3262", "CYC");
        $ic257$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3281", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#151", "CYC"));
        $ic258$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"));
        $ic259$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Unimplemented macro memoized-already."));
        $ic260$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Unimplemented macro cached-already."));
        $ic261$ = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $ic262$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE-CACHED-NEW"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINE-MEMOIZED"));
        $ic263$ = SubLObjectFactory.makeSymbol("S#3188", "CYC");
        $ic264$ = SubLObjectFactory.makeString("~A-INTERNAL");
        $ic265$ = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $ic266$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3282", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3283", "CYC"));
        $ic267$ = SubLObjectFactory.makeSymbol("S#12", "CYC");
        $ic268$ = SubLObjectFactory.makeSymbol("PUBLIC");
        $ic269$ = SubLObjectFactory.makeSymbol("S#3284", "CYC");
        $ic270$ = SubLObjectFactory.makeSymbol("S#374", "CYC");
        $ic271$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), (SubLObject)module0034.NIL, (SubLObject)module0034.NIL);
        $ic272$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIVATE"), (SubLObject)SubLObjectFactory.makeSymbol("PROTECTED"), (SubLObject)SubLObjectFactory.makeSymbol("PUBLIC"));
        $ic273$ = SubLObjectFactory.makeString("~A is not a known FACCESS visibility type for cached functions.");
    }
    
    public static final class $sX3030_native extends SubLStructNative
    {
        public SubLObject $store;
        public SubLObject $zero_arg_results;
        public SubLObject $lock;
        public SubLObject $capacity;
        public SubLObject $func_symbol;
        public SubLObject $test;
        public SubLObject $args_length;
        private static final SubLStructDeclNative structDecl;
        
        public $sX3030_native() {
            this.$store = (SubLObject)CommonSymbols.NIL;
            this.$zero_arg_results = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$capacity = (SubLObject)CommonSymbols.NIL;
            this.$func_symbol = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
            this.$args_length = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX3030_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$store;
        }
        
        public SubLObject getField3() {
            return this.$zero_arg_results;
        }
        
        public SubLObject getField4() {
            return this.$lock;
        }
        
        public SubLObject getField5() {
            return this.$capacity;
        }
        
        public SubLObject getField6() {
            return this.$func_symbol;
        }
        
        public SubLObject getField7() {
            return this.$test;
        }
        
        public SubLObject getField8() {
            return this.$args_length;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$store = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$zero_arg_results = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$capacity = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$func_symbol = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$test = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$args_length = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX3030_native.class, module0034.$ic35$, module0034.$ic36$, module0034.$ic37$, module0034.$ic38$, new String[] { "$store", "$zero_arg_results", "$lock", "$capacity", "$func_symbol", "$test", "$args_length" }, module0034.$ic39$, module0034.$ic40$, module0034.$ic41$);
        }
    }
    
    public static final class $f1789$UnaryFunction extends UnaryFunction
    {
        public $f1789$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#3031"));
        }
        
        public SubLObject processItem(final SubLObject var33) {
            return module0034.f1789(var33);
        }
    }
    
    public static final class $sX3043_native extends SubLStructNative
    {
        public SubLObject $store;
        public SubLObject $current_process;
        public SubLObject $lock;
        public SubLObject $name;
        public SubLObject $should_clone;
        private static final SubLStructDeclNative structDecl;
        
        public $sX3043_native() {
            this.$store = (SubLObject)CommonSymbols.NIL;
            this.$current_process = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$should_clone = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX3043_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$store;
        }
        
        public SubLObject getField3() {
            return this.$current_process;
        }
        
        public SubLObject getField4() {
            return this.$lock;
        }
        
        public SubLObject getField5() {
            return this.$name;
        }
        
        public SubLObject getField6() {
            return this.$should_clone;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$store = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$current_process = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$should_clone = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX3043_native.class, module0034.$ic82$, module0034.$ic83$, module0034.$ic84$, module0034.$ic85$, new String[] { "$store", "$current_process", "$lock", "$name", "$should_clone" }, module0034.$ic86$, module0034.$ic87$, module0034.$ic88$);
        }
    }
    
    public static final class $f1839$UnaryFunction extends UnaryFunction
    {
        public $f1839$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#3044"));
        }
        
        public SubLObject processItem(final SubLObject var33) {
            return module0034.f1839(var33);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0034.class
	Total time: 1242 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/
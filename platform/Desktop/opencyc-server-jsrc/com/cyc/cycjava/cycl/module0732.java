package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0732 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0732";
    public static final String myFingerPrint = "243768ffc4be64dcec3d4b4d42a44d7d7e05e5cab98569b9011dbfe6ca15003d";
    private static SubLSymbol $g5788$;
    private static SubLSymbol $g5789$;
    private static SubLSymbol $g5790$;
    private static SubLSymbol $g5791$;
    private static SubLSymbol $g5792$;
    private static SubLSymbol $g5793$;
    private static SubLSymbol $g5794$;
    private static SubLSymbol $g5795$;
    private static SubLSymbol $g5796$;
    private static SubLSymbol $g5797$;
    private static SubLSymbol $g5798$;
    private static SubLSymbol $g5799$;
    private static SubLSymbol $g5800$;
    private static SubLSymbol $g5801$;
    private static SubLSymbol $g5802$;
    private static SubLSymbol $g5803$;
    private static SubLSymbol $g5804$;
    private static SubLSymbol $g5805$;
    private static SubLSymbol $g5806$;
    private static SubLSymbol $g5807$;
    private static SubLSymbol $g5808$;
    private static SubLSymbol $g5809$;
    private static SubLSymbol $g5810$;
    private static SubLSymbol $g5811$;
    private static SubLSymbol $g5812$;
    private static SubLSymbol $g5813$;
    private static final SubLList $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLInteger $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLInteger $ic57$;
    private static final SubLList $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLObject $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLInteger $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLObject $ic77$;
    private static final SubLList $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLObject $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLList $ic102$;
    private static final SubLList $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLObject $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLList $ic119$;
    private static final SubLList $ic120$;
    private static final SubLList $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLList $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLString $ic133$;
    private static final SubLList $ic134$;
    private static final SubLObject $ic135$;
    private static final SubLObject $ic136$;
    private static final SubLObject $ic137$;
    private static final SubLObject $ic138$;
    private static final SubLObject $ic139$;
    private static final SubLObject $ic140$;
    private static final SubLObject $ic141$;
    private static final SubLObject $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLObject $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLObject $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLObject $ic153$;
    private static final SubLObject $ic154$;
    private static final SubLObject $ic155$;
    private static final SubLObject $ic156$;
    private static final SubLObject $ic157$;
    private static final SubLObject $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLString $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLString $ic166$;
    private static final SubLList $ic167$;
    private static final SubLObject $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLString $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLString $ic181$;
    private static final SubLObject $ic182$;
    private static final SubLList $ic183$;
    private static final SubLString $ic184$;
    private static final SubLInteger $ic185$;
    private static final SubLString $ic186$;
    private static final SubLString $ic187$;
    private static final SubLString $ic188$;
    private static final SubLList $ic189$;
    private static final SubLObject $ic190$;
    private static final SubLObject $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLList $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLObject $ic195$;
    private static final SubLString $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLString $ic198$;
    private static final SubLString $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLString $ic202$;
    private static final SubLString $ic203$;
    private static final SubLString $ic204$;
    private static final SubLObject $ic205$;
    private static final SubLList $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLObject $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLObject $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLInteger $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLObject $ic216$;
    private static final SubLObject $ic217$;
    private static final SubLObject $ic218$;
    private static final SubLString $ic219$;
    private static final SubLObject $ic220$;
    private static final SubLObject $ic221$;
    private static final SubLObject $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLObject $ic227$;
    private static final SubLList $ic228$;
    private static final SubLObject $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLObject $ic231$;
    private static final SubLObject $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLObject $ic234$;
    private static final SubLObject $ic235$;
    private static final SubLObject $ic236$;
    private static final SubLObject $ic237$;
    private static final SubLObject $ic238$;
    private static final SubLList $ic239$;
    private static final SubLString $ic240$;
    private static final SubLObject $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLObject $ic243$;
    private static final SubLObject $ic244$;
    private static final SubLString $ic245$;
    private static final SubLString $ic246$;
    private static final SubLString $ic247$;
    private static final SubLList $ic248$;
    private static final SubLObject $ic249$;
    private static final SubLString $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLString $ic252$;
    private static final SubLString $ic253$;
    private static final SubLString $ic254$;
    private static final SubLObject $ic255$;
    private static final SubLObject $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLString $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLObject $ic262$;
    private static final SubLObject $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLObject $ic265$;
    private static final SubLObject $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLSymbol $ic272$;
    private static final SubLObject $ic273$;
    private static final SubLObject $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLObject $ic277$;
    private static final SubLObject $ic278$;
    private static final SubLObject $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLObject $ic283$;
    private static final SubLList $ic284$;
    private static final SubLObject $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLObject $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLInteger $ic289$;
    private static final SubLList $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLList $ic292$;
    private static final SubLSymbol $ic293$;
    private static final SubLList $ic294$;
    private static final SubLSymbol $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLSymbol $ic297$;
    private static final SubLList $ic298$;
    private static final SubLList $ic299$;
    private static final SubLList $ic300$;
    private static final SubLList $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLObject $ic304$;
    private static final SubLList $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLInteger $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLSymbol $ic309$;
    private static final SubLSymbol $ic310$;
    private static final SubLObject $ic311$;
    private static final SubLObject $ic312$;
    private static final SubLSymbol $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLList $ic316$;
    private static final SubLSymbol $ic317$;
    
    public static SubLObject f44910(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL != constant_handles_oc.f8449(var1) && module0732.NIL == module0167.f10813(var1) && module0732.NIL != module0038.f2673(constants_high_oc.f10743(var1), (SubLObject)module0732.$ic1$, (SubLObject)module0732.UNPROVIDED));
    }
    
    public static SubLObject f44911(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = (SubLObject)module0732.NIL;
        }
        final SubLObject var5 = module0731.f44828(var2, var3, var4);
        return f44912((SubLObject)module0732.ZERO_INTEGER, var5);
    }
    
    public static SubLObject f44913(final SubLObject var6, final SubLObject var3, SubLObject var7) {
        assert module0732.NIL != module0206.f13444(var6) : var6;
        assert module0732.NIL != module0173.f10955(var3) : var3;
        if (module0732.NIL == module0173.f10955(var7) && module0732.NIL != module0202.f12659(var7)) {
            var7 = module0285.f18993(var7, (SubLObject)module0732.UNPROVIDED);
        }
        assert module0732.NIL != module0173.f10955(var7) : var7;
        SubLObject var9;
        final SubLObject var8 = var9 = module0731.f44828(var6, var3, (SubLObject)module0732.UNPROVIDED);
        SubLObject var10 = (SubLObject)module0732.NIL;
        var10 = var9.first();
        while (module0732.NIL != var9) {
            final SubLObject var11 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0732.$ic4$), module0731.f44827(var6, var3, var10, (SubLObject)module0732.$ic5$));
            if (module0732.NIL != module0004.f104(var7, var11, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                return var10;
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        SubLObject var12;
        for (var12 = (SubLObject)module0732.NIL, var12 = (SubLObject)module0732.ZERO_INTEGER; module0732.NIL != module0004.f104(var12, var8, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED); var12 = Numbers.add((SubLObject)module0732.ONE_INTEGER, var12)) {}
        return var12;
    }
    
    public static SubLObject f44914(final SubLObject var2, final SubLObject var3, final SubLObject var12, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = (SubLObject)module0732.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == module0004.f104(var12, module0731.f44828(var2, var3, var4), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED));
    }
    
    public static SubLObject f44912(final SubLObject var13, final SubLObject var14) {
        if (module0732.NIL != module0004.f104(var13, var14, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
            return f44912(Numbers.add((SubLObject)module0732.ONE_INTEGER, var13), var14);
        }
        return var13;
    }
    
    public static SubLObject f44915(final SubLObject var15) {
        assert module0732.NIL != Types.stringp(var15) : var15;
        final SubLObject var16 = module0038.f2867(var15, (SubLObject)module0732.T);
        final SubLObject var17 = Sequences.find((SubLObject)Characters.CHAR_space, var15, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        if (module0732.NIL != var17) {
            return Sequences.cconcatenate(var16, (SubLObject)module0732.$ic7$);
        }
        return Sequences.cconcatenate(var16, (SubLObject)module0732.$ic8$);
    }
    
    public static SubLObject f44916(final SubLObject var2, final SubLObject var18, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return module0220.f14554(var2, var18, var4, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44917(final SubLObject var2, final SubLObject var18, final SubLObject var15, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        final SubLObject var19 = f44916(var2, var18, (SubLObject)module0732.UNPROVIDED);
        if (module0732.NIL != var19 && (module0732.NIL == var15 || module0732.NIL == Strings.string_equal(var19, var15, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED))) {
            module0543.f33657((SubLObject)ConsesLow.list(var18, var2, var19), var4);
        }
        if (module0732.NIL != var15) {
            module0603.f36865((SubLObject)ConsesLow.list(var18, var2, var15), var4, (SubLObject)module0732.$ic10$, (SubLObject)module0732.UNPROVIDED);
        }
        return var15;
    }
    
    public static SubLObject f44918(final SubLObject var2, final SubLObject var3, final SubLObject var10, final SubLObject var20, SubLObject var4, SubLObject var21) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        if (var21 == module0732.UNPROVIDED) {
            var21 = (SubLObject)module0732.$ic11$;
        }
        final SubLObject var22 = module0731.f44819(var21);
        final SubLObject var23 = module0202.f12770(var22, var2, var3, var10, var20);
        if (module0732.NIL == module0274.f18060(var23, var4, (SubLObject)module0732.UNPROVIDED)) {
            return Values.values((SubLObject)module0732.NIL, module0274.f18195(var23, var4, (SubLObject)module0732.UNPROVIDED));
        }
        return Values.values((SubLObject)module0732.T, (SubLObject)module0732.$ic12$);
    }
    
    public static SubLObject f44919(final SubLObject var2, final SubLObject var3, final SubLObject var10, final SubLObject var20, SubLObject var4, SubLObject var21) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        if (var21 == module0732.UNPROVIDED) {
            var21 = (SubLObject)module0732.$ic11$;
        }
        final SubLObject var22 = module0731.f44819(var21);
        final SubLObject var23 = (SubLObject)((var21 == module0732.$ic11$) ? module0732.$ic13$ : module0732.$ic11$);
        final SubLObject var24 = module0731.f44819(var23);
        SubLObject var25 = (SubLObject)module0732.NIL;
        module0603.f36864(module0202.f12770(var24, var2, var3, var10, var20), var4);
        if (var22.eql(module0732.$ic14$)) {
            SubLObject var26 = module0731.f44823(var2, var3, var10, (SubLObject)module0732.UNPROVIDED);
            SubLObject var27 = (SubLObject)module0732.NIL;
            var27 = var26.first();
            while (module0732.NIL != var26) {
                if (!var27.eql(var20)) {
                    module0603.f36864(module0202.f12770(module0732.$ic14$, var2, var3, var10, var27), var4);
                }
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        if (module0732.NIL != var20) {
            var25 = module0603.f36865(module0202.f12770(var22, var2, var3, var10, var20), var4, (SubLObject)module0732.$ic10$, (SubLObject)module0732.UNPROVIDED);
        }
        return var25;
    }
    
    public static SubLObject f44920(final SubLObject var2, final SubLObject var3, final SubLObject var12, final SubLObject var20, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        if (module0732.NIL != module0173.f10955(var20)) {
            module0543.f33628((SubLObject)ConsesLow.list(module0732.$ic15$, var2, var3, var12, var20), var4, (SubLObject)module0732.$ic10$, (SubLObject)module0732.UNPROVIDED);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f44921(final SubLObject var2, final SubLObject var3, final SubLObject var12, final SubLObject var20, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        if (module0732.NIL != module0173.f10955(var20)) {
            module0543.f33657((SubLObject)ConsesLow.list(module0732.$ic15$, var2, var3, var12, var20), var4);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f44922(final SubLObject var2, final SubLObject var3, final SubLObject var12, final SubLObject var27, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        final SubLObject var28 = module0731.f44834(var2, var3, var12, (SubLObject)module0732.UNPROVIDED);
        final SubLObject var29 = conses_high.set_difference(var28, var27, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        final SubLObject var30 = conses_high.set_difference(var27, var28, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        SubLObject var31 = var29;
        SubLObject var32 = (SubLObject)module0732.NIL;
        var32 = var31.first();
        while (module0732.NIL != var31) {
            f44921(var2, var3, var12, var32, var4);
            var31 = var31.rest();
            var32 = var31.first();
        }
        var31 = var30;
        SubLObject var33 = (SubLObject)module0732.NIL;
        var33 = var31.first();
        while (module0732.NIL != var31) {
            f44920(var2, var3, var12, var33, var4);
            var31 = var31.rest();
            var33 = var31.first();
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f44923(final SubLObject var15, final SubLObject var2, final SubLObject var32) {
        return module0731.f44832(var2, var32);
    }
    
    public static SubLObject f44924(final SubLObject var3, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0584.$g4396$.getDynamicValue();
        }
        return (SubLObject)((module0732.NIL != module0018.f971()) ? conses_high.copy_list(f44925(var3, var4)) : module0732.NIL);
    }
    
    public static SubLObject f44926() {
        return f44927();
    }
    
    public static SubLObject f44927() {
        final SubLObject var33 = module0732.$g5789$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f44928(final SubLObject var3, final SubLObject var4) {
        return module0034.f1829(module0732.$g5789$.getGlobalValue(), (SubLObject)ConsesLow.list(var3, var4), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44929(final SubLObject var3, final SubLObject var4) {
        return f44930(var3, var4, module0077.f5313((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED));
    }
    
    public static SubLObject f44925(final SubLObject var3, final SubLObject var4) {
        SubLObject var5 = module0732.$g5789$.getGlobalValue();
        if (module0732.NIL == var5) {
            var5 = module0034.f1934((SubLObject)module0732.$ic16$, (SubLObject)module0732.$ic17$, (SubLObject)module0732.NIL, (SubLObject)module0732.EQUAL, (SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.ZERO_INTEGER);
        }
        final SubLObject var6 = module0034.f1782(var3, var4);
        final SubLObject var7 = module0034.f1814(var5, var6, (SubLObject)module0732.UNPROVIDED);
        if (var7 != module0732.$ic18$) {
            SubLObject var8 = var7;
            SubLObject var9 = (SubLObject)module0732.NIL;
            var9 = var8.first();
            while (module0732.NIL != var8) {
                SubLObject var10 = var9.first();
                final SubLObject var11 = conses_high.second(var9);
                if (var3.equal(var10.first())) {
                    var10 = var10.rest();
                    if (module0732.NIL != var10 && module0732.NIL == var10.rest() && var4.equal(var10.first())) {
                        return module0034.f1959(var11);
                    }
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        final SubLObject var12 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44929(var3, var4)));
        module0034.f1836(var5, var6, var7, var12, (SubLObject)ConsesLow.list(var3, var4));
        return module0034.f1959(var12);
    }
    
    public static SubLObject f44930(final SubLObject var3, final SubLObject var4, SubLObject var41) {
        if (var41 == module0732.UNPROVIDED) {
            var41 = module0077.f5313((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        }
        SubLObject var42 = f44931(var3);
        if (module0732.NIL == var42) {
            SubLObject var43 = module0256.f16524(var3, var4, (SubLObject)module0732.UNPROVIDED);
            SubLObject var44 = (SubLObject)module0732.NIL;
            var44 = var43.first();
            while (module0732.NIL != var43) {
                if (module0732.NIL != module0731.f44656(var44, var4) && module0732.NIL == module0077.f5320(var44, var41)) {
                    module0077.f5326(var44, var41);
                    var42 = ConsesLow.append(var42, f44930(var44, var4, var41));
                }
                var43 = var43.rest();
                var44 = var43.first();
            }
        }
        return Sequences.delete_duplicates(var42, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44931(final SubLObject var3) {
        return module0220.f14565(var3, module0732.$ic19$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44932(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (var3.eql(module0732.$ic20$)) {
            return module0584.$g4416$.getDynamicValue(var4);
        }
        if (var3.eql(module0732.$ic21$)) {
            return module0584.$g4421$.getDynamicValue(var4);
        }
        if (var3.eql(module0732.$ic22$)) {
            return module0584.$g4420$.getDynamicValue(var4);
        }
        if (var3.eql(module0732.$ic23$)) {
            return module0584.$g4418$.getDynamicValue(var4);
        }
        if (var3.eql(module0732.$ic24$)) {
            return module0584.$g4419$.getDynamicValue(var4);
        }
        if (var3.eql(module0732.$ic25$)) {
            return module0584.$g4422$.getDynamicValue(var4);
        }
        if (var3.eql(module0732.$ic26$)) {
            return module0584.$g4423$.getDynamicValue(var4);
        }
        if (var3.eql(module0732.$ic27$)) {
            return module0584.$g4424$.getDynamicValue(var4);
        }
        return module0220.f14565(var3, module0732.$ic19$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44933(final SubLObject var3) {
        return f44932(var3);
    }
    
    public static SubLObject f44934(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0732.NIL != module0018.f971()) ? conses_high.copy_list(f44935(var3, module0584.$g4396$.getDynamicValue(var4))) : module0732.NIL);
    }
    
    public static SubLObject f44936() {
        return f44937();
    }
    
    public static SubLObject f44937() {
        final SubLObject var33 = module0732.$g5790$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f44938(final SubLObject var3, final SubLObject var4) {
        return module0034.f1829(module0732.$g5790$.getGlobalValue(), (SubLObject)ConsesLow.list(var3, var4), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44939(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = f44924(var3, var4);
        if (module0732.NIL != module0731.f44713(module0732.$ic25$, var3, var4)) {
            final SubLObject var7 = module0732.$ic29$;
            if (module0732.NIL == conses_high.member(var7, var6, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                var6 = (SubLObject)ConsesLow.cons(var7, var6);
            }
        }
        else if (module0732.NIL != module0731.f44713(module0732.$ic20$, var3, var4)) {
            var6 = ConsesLow.append(var6, f44924(module0732.$ic24$, var4));
        }
        SubLObject var8 = conses_high.copy_list(var6);
        SubLObject var9 = (SubLObject)module0732.NIL;
        var9 = var8.first();
        while (module0732.NIL != var8) {
            SubLObject var9_48 = f44940(var9);
            SubLObject var10 = (SubLObject)module0732.NIL;
            var10 = var9_48.first();
            while (module0732.NIL != var9_48) {
                final SubLObject var11 = var10;
                if (module0732.NIL == conses_high.member(var11, var6, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                    var6 = (SubLObject)ConsesLow.cons(var11, var6);
                }
                var9_48 = var9_48.rest();
                var10 = var9_48.first();
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        final SubLObject var12 = module0584.$g4396$.currentBinding(var5);
        try {
            module0584.$g4396$.bind(var4, var5);
            var6 = Sort.sort(var6, (SubLObject)module0732.$ic30$, (SubLObject)module0732.UNPROVIDED);
        }
        finally {
            module0584.$g4396$.rebind(var12, var5);
        }
        return var6;
    }
    
    public static SubLObject f44935(final SubLObject var3, final SubLObject var4) {
        SubLObject var5 = module0732.$g5790$.getGlobalValue();
        if (module0732.NIL == var5) {
            var5 = module0034.f1934((SubLObject)module0732.$ic28$, (SubLObject)module0732.$ic31$, (SubLObject)module0732.NIL, (SubLObject)module0732.EQUAL, (SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.$ic32$);
        }
        final SubLObject var6 = module0034.f1782(var3, var4);
        final SubLObject var7 = module0034.f1814(var5, var6, (SubLObject)module0732.UNPROVIDED);
        if (var7 != module0732.$ic18$) {
            SubLObject var8 = var7;
            SubLObject var9 = (SubLObject)module0732.NIL;
            var9 = var8.first();
            while (module0732.NIL != var8) {
                SubLObject var10 = var9.first();
                final SubLObject var11 = conses_high.second(var9);
                if (var3.equal(var10.first())) {
                    var10 = var10.rest();
                    if (module0732.NIL != var10 && module0732.NIL == var10.rest() && var4.equal(var10.first())) {
                        return module0034.f1959(var11);
                    }
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        final SubLObject var12 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44939(var3, var4)));
        module0034.f1836(var5, var6, var7, var12, (SubLObject)ConsesLow.list(var3, var4));
        return module0034.f1959(var12);
    }
    
    public static SubLObject f44940(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)module0732.NIL;
        final SubLObject var50 = module0147.$g2094$.currentBinding(var48);
        final SubLObject var51 = module0147.$g2095$.currentBinding(var48);
        try {
            module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var48);
            module0147.$g2095$.bind(module0732.$ic34$, var48);
            final SubLObject var52 = (SubLObject)module0732.$ic37$;
            final SubLObject var53 = module0056.f4145(var52);
            SubLObject var54 = (SubLObject)module0732.NIL;
            final SubLObject var50_57 = module0139.$g1635$.currentBinding(var48);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var48);
                final SubLObject var55 = (SubLObject)module0732.NIL;
                final SubLObject var50_58 = module0141.$g1714$.currentBinding(var48);
                final SubLObject var52_60 = module0141.$g1715$.currentBinding(var48);
                try {
                    module0141.$g1714$.bind((module0732.NIL != var55) ? var55 : module0141.f9283(), var48);
                    module0141.$g1715$.bind((SubLObject)((module0732.NIL != var55) ? module0732.$ic38$ : module0141.$g1715$.getDynamicValue(var48)), var48);
                    if (module0732.NIL != var55 && module0732.NIL != module0136.f8864() && module0732.NIL == module0141.f9279(var55)) {
                        final SubLObject var56 = module0136.$g1591$.getDynamicValue(var48);
                        if (var56.eql((SubLObject)module0732.$ic39$)) {
                            module0136.f8870((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic40$, var55, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                        }
                        else if (var56.eql((SubLObject)module0732.$ic42$)) {
                            module0136.f8871((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var55, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                        }
                        else if (var56.eql((SubLObject)module0732.$ic44$)) {
                            Errors.warn((SubLObject)module0732.$ic40$, var55, (SubLObject)module0732.$ic41$);
                        }
                        else {
                            Errors.warn((SubLObject)module0732.$ic45$, module0136.$g1591$.getDynamicValue(var48));
                            Errors.cerror((SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var55, (SubLObject)module0732.$ic41$);
                        }
                    }
                    final SubLObject var50_59 = module0141.$g1670$.currentBinding(var48);
                    final SubLObject var52_61 = module0141.$g1671$.currentBinding(var48);
                    final SubLObject var57 = module0141.$g1672$.currentBinding(var48);
                    final SubLObject var58 = module0141.$g1674$.currentBinding(var48);
                    final SubLObject var59 = module0137.$g1605$.currentBinding(var48);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0732.$ic46$), var48);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0732.$ic46$)), var48);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0732.$ic46$)), var48);
                        module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                        module0137.$g1605$.bind(module0137.f8955(module0732.$ic46$), var48);
                        if (module0732.NIL != module0136.f8865() || module0732.NIL != module0244.f15795(var47, module0137.f8955((SubLObject)module0732.UNPROVIDED))) {
                            final SubLObject var50_60 = module0141.$g1677$.currentBinding(var48);
                            final SubLObject var52_62 = module0138.$g1619$.currentBinding(var48);
                            final SubLObject var63_68 = module0141.$g1674$.currentBinding(var48);
                            try {
                                module0141.$g1677$.bind(module0141.f9208(), var48);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0732.$ic46$)), var48);
                                module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                                module0249.f16055(var47, (SubLObject)module0732.UNPROVIDED);
                                for (var54 = (SubLObject)ConsesLow.list(var47, module0141.f9195()); module0732.NIL != var54; var54 = module0056.f4150(var53)) {
                                    final SubLObject var53_69 = var54.first();
                                    final SubLObject var60 = conses_high.second(var54);
                                    final SubLObject var61 = var53_69;
                                    final SubLObject var50_61 = module0141.$g1674$.currentBinding(var48);
                                    try {
                                        module0141.$g1674$.bind(var60, var48);
                                        if (module0732.NIL != module0250.f16115(module0141.f9190(), var53_69)) {
                                            SubLObject var62 = module0220.f14562(var61, module0732.$ic47$, (SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.UNPROVIDED);
                                            SubLObject var63 = (SubLObject)module0732.NIL;
                                            var63 = var62.first();
                                            while (module0732.NIL != var62) {
                                                final SubLObject var64 = var63;
                                                if (module0732.NIL == conses_high.member(var64, var49, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                    var49 = (SubLObject)ConsesLow.cons(var64, var49);
                                                }
                                                SubLObject var9_73 = f44941(var63);
                                                SubLObject var65 = (SubLObject)module0732.NIL;
                                                var65 = var9_73.first();
                                                while (module0732.NIL != var9_73) {
                                                    final SubLObject var66 = var65;
                                                    if (module0732.NIL == conses_high.member(var66, var49, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                        var49 = (SubLObject)ConsesLow.cons(var66, var49);
                                                    }
                                                    var9_73 = var9_73.rest();
                                                    var65 = var9_73.first();
                                                }
                                                var62 = var62.rest();
                                                var63 = var62.first();
                                            }
                                        }
                                        SubLObject var68;
                                        final SubLObject var67 = var68 = module0200.f12443(module0137.f8955(module0732.$ic46$));
                                        SubLObject var69 = (SubLObject)module0732.NIL;
                                        var69 = var68.first();
                                        while (module0732.NIL != var68) {
                                            final SubLObject var50_62 = module0137.$g1605$.currentBinding(var48);
                                            final SubLObject var52_63 = module0141.$g1674$.currentBinding(var48);
                                            try {
                                                module0137.$g1605$.bind(var69, var48);
                                                module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var48)) : module0141.$g1674$.getDynamicValue(var48)), var48);
                                                final SubLObject var70 = module0228.f15229(var53_69);
                                                if (module0732.NIL != module0138.f8992(var70)) {
                                                    final SubLObject var71 = module0242.f15664(var70, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                    if (module0732.NIL != var71) {
                                                        final SubLObject var72 = module0245.f15834(var71, module0138.f8979(), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                        if (module0732.NIL != var72) {
                                                            SubLObject var73;
                                                            for (var73 = module0066.f4838(module0067.f4891(var72)); module0732.NIL == module0066.f4841(var73); var73 = module0066.f4840(var73)) {
                                                                var48.resetMultipleValues();
                                                                final SubLObject var74 = module0066.f4839(var73);
                                                                final SubLObject var75 = var48.secondMultipleValue();
                                                                var48.resetMultipleValues();
                                                                if (module0732.NIL != module0147.f9507(var74)) {
                                                                    final SubLObject var50_63 = module0138.$g1623$.currentBinding(var48);
                                                                    try {
                                                                        module0138.$g1623$.bind(var74, var48);
                                                                        SubLObject var82_86;
                                                                        for (var82_86 = module0066.f4838(module0067.f4891(var75)); module0732.NIL == module0066.f4841(var82_86); var82_86 = module0066.f4840(var82_86)) {
                                                                            var48.resetMultipleValues();
                                                                            final SubLObject var76 = module0066.f4839(var82_86);
                                                                            final SubLObject var77 = var48.secondMultipleValue();
                                                                            var48.resetMultipleValues();
                                                                            if (module0732.NIL != module0141.f9289(var76)) {
                                                                                final SubLObject var50_64 = module0138.$g1624$.currentBinding(var48);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var76, var48);
                                                                                    final SubLObject var78 = var77;
                                                                                    if (module0732.NIL != module0077.f5302(var78)) {
                                                                                        final SubLObject var79 = module0077.f5333(var78);
                                                                                        SubLObject var80;
                                                                                        SubLObject var81;
                                                                                        SubLObject var82;
                                                                                        for (var80 = module0032.f1741(var79), var81 = (SubLObject)module0732.NIL, var81 = module0032.f1742(var80, var79); module0732.NIL == module0032.f1744(var80, var81); var81 = module0032.f1743(var81)) {
                                                                                            var82 = module0032.f1745(var80, var81);
                                                                                            if (module0732.NIL != module0032.f1746(var81, var82) && module0732.NIL == module0249.f16059(var82, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                module0249.f16055(var82, (SubLObject)module0732.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var82, module0141.f9195()), var53);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var78.isList()) {
                                                                                        SubLObject var83 = var78;
                                                                                        SubLObject var84 = (SubLObject)module0732.NIL;
                                                                                        var84 = var83.first();
                                                                                        while (module0732.NIL != var83) {
                                                                                            if (module0732.NIL == module0249.f16059(var84, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                module0249.f16055(var84, (SubLObject)module0732.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var84, module0141.f9195()), var53);
                                                                                            }
                                                                                            var83 = var83.rest();
                                                                                            var84 = var83.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0732.$ic48$, var78);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var50_64, var48);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var82_86);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var50_63, var48);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var73);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0732.NIL != module0155.f9785(var70, (SubLObject)module0732.UNPROVIDED)) {
                                                    SubLObject var9_74;
                                                    final SubLObject var85 = var9_74 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED)));
                                                    SubLObject var86 = (SubLObject)module0732.NIL;
                                                    var86 = var9_74.first();
                                                    while (module0732.NIL != var9_74) {
                                                        final SubLObject var50_65 = module0138.$g1625$.currentBinding(var48);
                                                        try {
                                                            module0138.$g1625$.bind(var86, var48);
                                                            final SubLObject var88;
                                                            final SubLObject var87 = var88 = Functions.funcall(var86, var70);
                                                            if (module0732.NIL != module0077.f5302(var88)) {
                                                                final SubLObject var89 = module0077.f5333(var88);
                                                                SubLObject var90;
                                                                SubLObject var91;
                                                                SubLObject var92;
                                                                for (var90 = module0032.f1741(var89), var91 = (SubLObject)module0732.NIL, var91 = module0032.f1742(var90, var89); module0732.NIL == module0032.f1744(var90, var91); var91 = module0032.f1743(var91)) {
                                                                    var92 = module0032.f1745(var90, var91);
                                                                    if (module0732.NIL != module0032.f1746(var91, var92) && module0732.NIL == module0249.f16059(var92, (SubLObject)module0732.UNPROVIDED)) {
                                                                        module0249.f16055(var92, (SubLObject)module0732.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var92, module0141.f9195()), var53);
                                                                    }
                                                                }
                                                            }
                                                            else if (var88.isList()) {
                                                                SubLObject var93 = var88;
                                                                SubLObject var94 = (SubLObject)module0732.NIL;
                                                                var94 = var93.first();
                                                                while (module0732.NIL != var93) {
                                                                    if (module0732.NIL == module0249.f16059(var94, (SubLObject)module0732.UNPROVIDED)) {
                                                                        module0249.f16055(var94, (SubLObject)module0732.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var94, module0141.f9195()), var53);
                                                                    }
                                                                    var93 = var93.rest();
                                                                    var94 = var93.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0732.$ic48$, var88);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var50_65, var48);
                                                        }
                                                        var9_74 = var9_74.rest();
                                                        var86 = var9_74.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var52_63, var48);
                                                module0137.$g1605$.rebind(var50_62, var48);
                                            }
                                            var68 = var68.rest();
                                            var69 = var68.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var50_61, var48);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var63_68, var48);
                                module0138.$g1619$.rebind(var52_62, var48);
                                module0141.$g1677$.rebind(var50_60, var48);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.$ic50$, var47, module0244.f15748(module0137.f8955((SubLObject)module0732.UNPROVIDED)), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var59, var48);
                        module0141.$g1674$.rebind(var58, var48);
                        module0141.$g1672$.rebind(var57, var48);
                        module0141.$g1671$.rebind(var52_61, var48);
                        module0141.$g1670$.rebind(var50_59, var48);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var52_60, var48);
                    module0141.$g1714$.rebind(var50_58, var48);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var48));
            }
            finally {
                module0139.$g1635$.rebind(var50_57, var48);
            }
        }
        finally {
            module0147.$g2095$.rebind(var51, var48);
            module0147.$g2094$.rebind(var50, var48);
        }
        return var49;
    }
    
    public static SubLObject f44941(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)module0732.NIL;
        final SubLObject var50 = module0147.$g2094$.currentBinding(var48);
        final SubLObject var51 = module0147.$g2095$.currentBinding(var48);
        try {
            module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var48);
            module0147.$g2095$.bind(module0732.$ic34$, var48);
            final SubLObject var52 = (SubLObject)module0732.$ic37$;
            final SubLObject var53 = module0056.f4145(var52);
            SubLObject var54 = (SubLObject)module0732.NIL;
            final SubLObject var50_101 = module0139.$g1635$.currentBinding(var48);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var48);
                final SubLObject var55 = (SubLObject)module0732.NIL;
                final SubLObject var50_102 = module0141.$g1714$.currentBinding(var48);
                final SubLObject var52_103 = module0141.$g1715$.currentBinding(var48);
                try {
                    module0141.$g1714$.bind((module0732.NIL != var55) ? var55 : module0141.f9283(), var48);
                    module0141.$g1715$.bind((SubLObject)((module0732.NIL != var55) ? module0732.$ic38$ : module0141.$g1715$.getDynamicValue(var48)), var48);
                    if (module0732.NIL != var55 && module0732.NIL != module0136.f8864() && module0732.NIL == module0141.f9279(var55)) {
                        final SubLObject var56 = module0136.$g1591$.getDynamicValue(var48);
                        if (var56.eql((SubLObject)module0732.$ic39$)) {
                            module0136.f8870((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic40$, var55, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                        }
                        else if (var56.eql((SubLObject)module0732.$ic42$)) {
                            module0136.f8871((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var55, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                        }
                        else if (var56.eql((SubLObject)module0732.$ic44$)) {
                            Errors.warn((SubLObject)module0732.$ic40$, var55, (SubLObject)module0732.$ic41$);
                        }
                        else {
                            Errors.warn((SubLObject)module0732.$ic45$, module0136.$g1591$.getDynamicValue(var48));
                            Errors.cerror((SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var55, (SubLObject)module0732.$ic41$);
                        }
                    }
                    final SubLObject var50_103 = module0141.$g1670$.currentBinding(var48);
                    final SubLObject var52_104 = module0141.$g1671$.currentBinding(var48);
                    final SubLObject var57 = module0141.$g1672$.currentBinding(var48);
                    final SubLObject var58 = module0141.$g1674$.currentBinding(var48);
                    final SubLObject var59 = module0137.$g1605$.currentBinding(var48);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0732.$ic46$), var48);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0732.$ic46$)), var48);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0732.$ic46$)), var48);
                        module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                        module0137.$g1605$.bind(module0137.f8955(module0732.$ic46$), var48);
                        if (module0732.NIL != module0136.f8865() || module0732.NIL != module0244.f15795(var47, module0137.f8955((SubLObject)module0732.UNPROVIDED))) {
                            final SubLObject var50_104 = module0141.$g1677$.currentBinding(var48);
                            final SubLObject var52_105 = module0138.$g1619$.currentBinding(var48);
                            final SubLObject var63_108 = module0141.$g1674$.currentBinding(var48);
                            try {
                                module0141.$g1677$.bind(module0141.f9208(), var48);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0732.$ic46$)), var48);
                                module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                                module0249.f16055(var47, (SubLObject)module0732.UNPROVIDED);
                                for (var54 = (SubLObject)ConsesLow.list(var47, module0141.f9195()); module0732.NIL != var54; var54 = module0056.f4150(var53)) {
                                    final SubLObject var53_109 = var54.first();
                                    final SubLObject var60 = conses_high.second(var54);
                                    final SubLObject var61 = var53_109;
                                    final SubLObject var50_105 = module0141.$g1674$.currentBinding(var48);
                                    try {
                                        module0141.$g1674$.bind(var60, var48);
                                        if (module0732.NIL != module0250.f16115(module0141.f9190(), var53_109)) {
                                            var49 = ConsesLow.nconc(var49, module0220.f14562(var61, module0732.$ic51$, (SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.UNPROVIDED));
                                        }
                                        SubLObject var63;
                                        final SubLObject var62 = var63 = module0200.f12443(module0137.f8955(module0732.$ic46$));
                                        SubLObject var64 = (SubLObject)module0732.NIL;
                                        var64 = var63.first();
                                        while (module0732.NIL != var63) {
                                            final SubLObject var50_106 = module0137.$g1605$.currentBinding(var48);
                                            final SubLObject var52_106 = module0141.$g1674$.currentBinding(var48);
                                            try {
                                                module0137.$g1605$.bind(var64, var48);
                                                module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var48)) : module0141.$g1674$.getDynamicValue(var48)), var48);
                                                final SubLObject var65 = module0228.f15229(var53_109);
                                                if (module0732.NIL != module0138.f8992(var65)) {
                                                    final SubLObject var66 = module0242.f15664(var65, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                    if (module0732.NIL != var66) {
                                                        final SubLObject var67 = module0245.f15834(var66, module0138.f8979(), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                        if (module0732.NIL != var67) {
                                                            SubLObject var68;
                                                            for (var68 = module0066.f4838(module0067.f4891(var67)); module0732.NIL == module0066.f4841(var68); var68 = module0066.f4840(var68)) {
                                                                var48.resetMultipleValues();
                                                                final SubLObject var69 = module0066.f4839(var68);
                                                                final SubLObject var70 = var48.secondMultipleValue();
                                                                var48.resetMultipleValues();
                                                                if (module0732.NIL != module0147.f9507(var69)) {
                                                                    final SubLObject var50_107 = module0138.$g1623$.currentBinding(var48);
                                                                    try {
                                                                        module0138.$g1623$.bind(var69, var48);
                                                                        SubLObject var82_114;
                                                                        for (var82_114 = module0066.f4838(module0067.f4891(var70)); module0732.NIL == module0066.f4841(var82_114); var82_114 = module0066.f4840(var82_114)) {
                                                                            var48.resetMultipleValues();
                                                                            final SubLObject var71 = module0066.f4839(var82_114);
                                                                            final SubLObject var72 = var48.secondMultipleValue();
                                                                            var48.resetMultipleValues();
                                                                            if (module0732.NIL != module0141.f9289(var71)) {
                                                                                final SubLObject var50_108 = module0138.$g1624$.currentBinding(var48);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var71, var48);
                                                                                    final SubLObject var73 = var72;
                                                                                    if (module0732.NIL != module0077.f5302(var73)) {
                                                                                        final SubLObject var74 = module0077.f5333(var73);
                                                                                        SubLObject var75;
                                                                                        SubLObject var76;
                                                                                        SubLObject var77;
                                                                                        for (var75 = module0032.f1741(var74), var76 = (SubLObject)module0732.NIL, var76 = module0032.f1742(var75, var74); module0732.NIL == module0032.f1744(var75, var76); var76 = module0032.f1743(var76)) {
                                                                                            var77 = module0032.f1745(var75, var76);
                                                                                            if (module0732.NIL != module0032.f1746(var76, var77) && module0732.NIL == module0249.f16059(var77, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                module0249.f16055(var77, (SubLObject)module0732.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var77, module0141.f9195()), var53);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var73.isList()) {
                                                                                        SubLObject var78 = var73;
                                                                                        SubLObject var79 = (SubLObject)module0732.NIL;
                                                                                        var79 = var78.first();
                                                                                        while (module0732.NIL != var78) {
                                                                                            if (module0732.NIL == module0249.f16059(var79, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                module0249.f16055(var79, (SubLObject)module0732.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var79, module0141.f9195()), var53);
                                                                                            }
                                                                                            var78 = var78.rest();
                                                                                            var79 = var78.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0732.$ic48$, var73);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var50_108, var48);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var82_114);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var50_107, var48);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var68);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0732.NIL != module0155.f9785(var65, (SubLObject)module0732.UNPROVIDED)) {
                                                    SubLObject var9_116;
                                                    final SubLObject var80 = var9_116 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED)));
                                                    SubLObject var81 = (SubLObject)module0732.NIL;
                                                    var81 = var9_116.first();
                                                    while (module0732.NIL != var9_116) {
                                                        final SubLObject var50_109 = module0138.$g1625$.currentBinding(var48);
                                                        try {
                                                            module0138.$g1625$.bind(var81, var48);
                                                            final SubLObject var83;
                                                            final SubLObject var82 = var83 = Functions.funcall(var81, var65);
                                                            if (module0732.NIL != module0077.f5302(var83)) {
                                                                final SubLObject var84 = module0077.f5333(var83);
                                                                SubLObject var85;
                                                                SubLObject var86;
                                                                SubLObject var87;
                                                                for (var85 = module0032.f1741(var84), var86 = (SubLObject)module0732.NIL, var86 = module0032.f1742(var85, var84); module0732.NIL == module0032.f1744(var85, var86); var86 = module0032.f1743(var86)) {
                                                                    var87 = module0032.f1745(var85, var86);
                                                                    if (module0732.NIL != module0032.f1746(var86, var87) && module0732.NIL == module0249.f16059(var87, (SubLObject)module0732.UNPROVIDED)) {
                                                                        module0249.f16055(var87, (SubLObject)module0732.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var87, module0141.f9195()), var53);
                                                                    }
                                                                }
                                                            }
                                                            else if (var83.isList()) {
                                                                SubLObject var88 = var83;
                                                                SubLObject var89 = (SubLObject)module0732.NIL;
                                                                var89 = var88.first();
                                                                while (module0732.NIL != var88) {
                                                                    if (module0732.NIL == module0249.f16059(var89, (SubLObject)module0732.UNPROVIDED)) {
                                                                        module0249.f16055(var89, (SubLObject)module0732.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var89, module0141.f9195()), var53);
                                                                    }
                                                                    var88 = var88.rest();
                                                                    var89 = var88.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0732.$ic48$, var83);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var50_109, var48);
                                                        }
                                                        var9_116 = var9_116.rest();
                                                        var81 = var9_116.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var52_106, var48);
                                                module0137.$g1605$.rebind(var50_106, var48);
                                            }
                                            var63 = var63.rest();
                                            var64 = var63.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var50_105, var48);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var63_108, var48);
                                module0138.$g1619$.rebind(var52_105, var48);
                                module0141.$g1677$.rebind(var50_104, var48);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.$ic50$, var47, module0244.f15748(module0137.f8955((SubLObject)module0732.UNPROVIDED)), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var59, var48);
                        module0141.$g1674$.rebind(var58, var48);
                        module0141.$g1672$.rebind(var57, var48);
                        module0141.$g1671$.rebind(var52_104, var48);
                        module0141.$g1670$.rebind(var50_103, var48);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var52_103, var48);
                    module0141.$g1714$.rebind(var50_102, var48);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var48));
            }
            finally {
                module0139.$g1635$.rebind(var50_101, var48);
            }
        }
        finally {
            module0147.$g2095$.rebind(var51, var48);
            module0147.$g2094$.rebind(var50, var48);
        }
        return var49;
    }
    
    public static SubLObject f44942(final SubLObject var118, final SubLObject var119, SubLObject var4, SubLObject var120) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0584.$g4396$.getDynamicValue();
        }
        if (var120 == module0732.UNPROVIDED) {
            var120 = (SubLObject)module0732.T;
        }
        SubLObject var121 = (SubLObject)module0732.NIL;
        SubLObject var122 = var118;
        SubLObject var123 = (SubLObject)module0732.NIL;
        var123 = var122.first();
        while (module0732.NIL != var122) {
            SubLObject var9_123 = var119;
            SubLObject var124 = (SubLObject)module0732.NIL;
            var124 = var9_123.first();
            while (module0732.NIL != var9_123) {
                SubLObject var9_124 = f44943(var123, var124, var4);
                SubLObject var125 = (SubLObject)module0732.NIL;
                var125 = var9_124.first();
                while (module0732.NIL != var9_124) {
                    final SubLObject var126 = var125;
                    if (module0732.NIL == conses_high.member(var126, var121, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                        var121 = (SubLObject)ConsesLow.cons(var126, var121);
                    }
                    var9_124 = var9_124.rest();
                    var125 = var9_124.first();
                }
                var9_123 = var9_123.rest();
                var124 = var9_123.first();
            }
            var122 = var122.rest();
            var123 = var122.first();
        }
        if (module0732.NIL != var120) {
            var121 = module0035.f2467(var121, (SubLObject)module0732.$ic52$, (SubLObject)module0732.UNPROVIDED);
        }
        else {
            var121 = module0035.f2153(var121, Symbols.symbol_function((SubLObject)module0732.EQL), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        }
        var121 = Sequences.nreverse(var121);
        return var121;
    }
    
    public static SubLObject f44943(final SubLObject var122, final SubLObject var124, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0584.$g4396$.getDynamicValue();
        }
        if (var122.eql(var124)) {
            return (SubLObject)ConsesLow.list(var122);
        }
        if (module0732.NIL != module0584.f35795(var122) && module0732.NIL == module0731.f44702(var124, module0732.$ic53$, (SubLObject)module0732.UNPROVIDED) && module0732.NIL != module0731.f44702(var124, module0732.$ic54$, (SubLObject)module0732.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(var122);
        }
        if (module0732.NIL != module0584.f35795(var124) && module0732.NIL == module0731.f44702(var122, module0732.$ic53$, (SubLObject)module0732.UNPROVIDED) && module0732.NIL != module0731.f44702(var122, module0732.$ic54$, (SubLObject)module0732.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(var124);
        }
        if (module0732.NIL != module0751.f47030(var122) && module0732.NIL != module0751.f47030(var124)) {
            return module0751.f47135((SubLObject)ConsesLow.list(var122, var124), var4, (SubLObject)module0732.UNPROVIDED);
        }
        return module0260.f17087((SubLObject)ConsesLow.list(var122, var124), (SubLObject)module0732.NIL, var4, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44944(final SubLObject var127, final SubLObject var128, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0584.$g4396$.getDynamicValue();
        }
        return (SubLObject)((module0732.NIL != module0018.f971()) ? f44945(var127, var128, var4) : module0732.NIL);
    }
    
    public static SubLObject f44946() {
        final SubLObject var33 = module0732.$g5791$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f44947(final SubLObject var127, final SubLObject var128, final SubLObject var4) {
        return module0034.f1829(module0732.$g5791$.getGlobalValue(), (SubLObject)ConsesLow.list(var127, var128, var4), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44948(final SubLObject var127, final SubLObject var128, final SubLObject var4) {
        if (var127.eql(var128)) {
            return (SubLObject)module0732.NIL;
        }
        if (module0732.NIL != module0731.f44702(var127, var128, var4)) {
            return (SubLObject)module0732.T;
        }
        if (var127.eql(f44949(var128))) {
            return (SubLObject)module0732.T;
        }
        if (module0732.NIL == module0731.f44695(var127, (SubLObject)module0732.UNPROVIDED)) {
            return (SubLObject)module0732.T;
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f44945(final SubLObject var127, final SubLObject var128, final SubLObject var4) {
        SubLObject var129 = module0732.$g5791$.getGlobalValue();
        if (module0732.NIL == var129) {
            var129 = module0034.f1934((SubLObject)module0732.$ic55$, (SubLObject)module0732.$ic56$, (SubLObject)module0732.NIL, (SubLObject)module0732.EQL, (SubLObject)module0732.THREE_INTEGER, (SubLObject)module0732.$ic57$);
        }
        final SubLObject var130 = module0034.f1781(var127, var128, var4);
        final SubLObject var131 = module0034.f1814(var129, var130, (SubLObject)module0732.UNPROVIDED);
        if (var131 != module0732.$ic18$) {
            SubLObject var132 = var131;
            SubLObject var133 = (SubLObject)module0732.NIL;
            var133 = var132.first();
            while (module0732.NIL != var132) {
                SubLObject var134 = var133.first();
                final SubLObject var135 = conses_high.second(var133);
                if (var127.eql(var134.first())) {
                    var134 = var134.rest();
                    if (var128.eql(var134.first())) {
                        var134 = var134.rest();
                        if (module0732.NIL != var134 && module0732.NIL == var134.rest() && var4.eql(var134.first())) {
                            return module0034.f1959(var135);
                        }
                    }
                }
                var132 = var132.rest();
                var133 = var132.first();
            }
        }
        final SubLObject var136 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44948(var127, var128, var4)));
        module0034.f1836(var129, var130, var131, var136, (SubLObject)ConsesLow.list(var127, var128, var4));
        return module0034.f1959(var136);
    }
    
    public static SubLObject f44950(final SubLObject var129) {
        return module0209.f13552(module0178.f11335(var129));
    }
    
    public static SubLObject f44951(final SubLObject var130) {
        SubLObject var131 = (SubLObject)module0732.NIL;
        SubLObject var132 = module0731.f44736(var130, (SubLObject)module0732.UNPROVIDED);
        SubLObject var133 = (SubLObject)module0732.NIL;
        var133 = var132.first();
        while (module0732.NIL != var132) {
            SubLObject var9_131 = f44924(var133, (SubLObject)module0732.UNPROVIDED);
            SubLObject var134 = (SubLObject)module0732.NIL;
            var134 = var9_131.first();
            while (module0732.NIL != var9_131) {
                final SubLObject var135 = var134;
                if (module0732.NIL == conses_high.member(var135, var131, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                    var131 = (SubLObject)ConsesLow.cons(var135, var131);
                }
                var9_131 = var9_131.rest();
                var134 = var9_131.first();
            }
            var132 = var132.rest();
            var133 = var132.first();
        }
        return var131;
    }
    
    public static SubLObject f44952(final SubLObject var130) {
        final SubLObject var131 = ConsesLow.append((SubLObject)module0732.$ic58$, module0584.f35812());
        return module0035.f2226(var131, f44951(var130), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44953(final SubLObject var130) {
        return f44952(var130);
    }
    
    public static SubLObject f44954(final SubLObject var15, SubLObject var133) {
        if (var133 == module0732.UNPROVIDED) {
            var133 = (SubLObject)module0732.NIL;
        }
        SubLObject var134 = (SubLObject)module0732.NIL;
        SubLObject var135 = module0731.f44745(var15, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        SubLObject var136 = (SubLObject)module0732.NIL;
        var136 = var135.first();
        while (module0732.NIL != var135) {
            final SubLObject var137 = f44955(var136, var133);
            if (module0732.NIL != var137) {
                final SubLObject var138 = var137;
                if (module0732.NIL == conses_high.member(var138, var134, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                    var134 = (SubLObject)ConsesLow.cons(var138, var134);
                }
            }
            var135 = var135.rest();
            var136 = var135.first();
        }
        return var134;
    }
    
    public static SubLObject f44955(final SubLObject var3, SubLObject var133) {
        if (var133 == module0732.UNPROVIDED) {
            var133 = (SubLObject)module0732.NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        SubLObject var135 = (SubLObject)module0732.NIL;
        if (module0732.NIL != module0256.f16605(module0732.$ic59$, var3, module0584.$g4396$.getDynamicValue(var134), (SubLObject)module0732.UNPROVIDED)) {
            var135 = (SubLObject)ConsesLow.cons(module0732.$ic60$, var135);
        }
        else if (module0732.NIL != module0256.f16605(module0732.$ic61$, var3, module0584.$g4396$.getDynamicValue(var134), (SubLObject)module0732.UNPROVIDED)) {
            var135 = f44956(var133);
        }
        else if (module0732.NIL != module0256.f16605(module0732.$ic62$, var3, module0584.$g4396$.getDynamicValue(var134), (SubLObject)module0732.UNPROVIDED)) {
            var135 = (SubLObject)ConsesLow.cons(module0732.$ic63$, var135);
        }
        return var135;
    }
    
    public static SubLObject f44956(final SubLObject var133) {
        SubLObject var134 = (SubLObject)module0732.NIL;
        SubLObject var135 = var133;
        SubLObject var136 = (SubLObject)module0732.NIL;
        var136 = var135.first();
        while (module0732.NIL != var135) {
            if (module0732.NIL != module0205.f13220(module0732.$ic63$, var136, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                final SubLObject var137 = module0732.$ic63$;
                if (module0732.NIL == conses_high.member(var137, var134, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                    var134 = (SubLObject)ConsesLow.cons(var137, var134);
                }
            }
            if (module0732.NIL != module0205.f13220(module0732.$ic60$, var136, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                final SubLObject var137 = module0732.$ic60$;
                if (module0732.NIL == conses_high.member(var137, var134, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                    var134 = (SubLObject)ConsesLow.cons(var137, var134);
                }
            }
            var135 = var135.rest();
            var136 = var135.first();
        }
        if (module0732.NIL == var134) {
            var134 = (SubLObject)ConsesLow.cons(module0732.$ic60$, var134);
        }
        return var134;
    }
    
    public static SubLObject f44957(final SubLObject var15, SubLObject var133) {
        if (var133 == module0732.UNPROVIDED) {
            var133 = (SubLObject)module0732.NIL;
        }
        if (module0732.NIL != Strings.stringE(var15, (SubLObject)module0732.$ic12$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(module0732.$ic64$);
        }
        if (module0732.NIL == var133) {
            var133 = module0731.f44809(var15, module0732.$ic65$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        }
        return f44958(var133);
    }
    
    public static SubLObject f44958(final SubLObject var136) {
        SubLObject var137 = (SubLObject)module0732.NIL;
        SubLObject var138 = var136;
        SubLObject var139 = (SubLObject)module0732.NIL;
        var139 = var138.first();
        while (module0732.NIL != var138) {
            if (module0732.NIL != module0269.f17832(var139)) {
                var137 = (SubLObject)ConsesLow.cons(var139, var137);
            }
            else if (module0732.NIL == module0269.f17831(var139)) {
                final SubLObject var140 = f44959(var139);
                if (module0732.NIL != var140) {
                    var137 = (SubLObject)ConsesLow.cons(var140, var137);
                }
            }
            var138 = var138.rest();
            var139 = var138.first();
        }
        return var137;
    }
    
    public static SubLObject f44959(final SubLObject var7) {
        if (var7.isNumber() || module0732.NIL != f44960(var7)) {
            return (SubLObject)ConsesLow.list(module0732.$ic66$, var7);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f44960(final SubLObject var138) {
        return (SubLObject)((module0732.NIL != module0018.f971()) ? f44961(var138) : module0732.NIL);
    }
    
    public static SubLObject f44962() {
        final SubLObject var33 = module0732.$g5792$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f44963(final SubLObject var138) {
        return module0034.f1829(module0732.$g5792$.getGlobalValue(), (SubLObject)ConsesLow.list(var138), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44964(final SubLObject var138) {
        return module0305.f20438(var138, module0732.$ic68$, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44961(final SubLObject var138) {
        SubLObject var139 = module0732.$g5792$.getGlobalValue();
        if (module0732.NIL == var139) {
            var139 = module0034.f1934((SubLObject)module0732.$ic67$, (SubLObject)module0732.$ic69$, (SubLObject)module0732.NIL, (SubLObject)module0732.EQUAL, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic70$);
        }
        SubLObject var140 = module0034.f1814(var139, var138, (SubLObject)module0732.$ic18$);
        if (var140 == module0732.$ic18$) {
            var140 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44964(var138)));
            module0034.f1816(var139, var138, var140, (SubLObject)module0732.UNPROVIDED);
        }
        return module0034.f1959(var140);
    }
    
    public static SubLObject f44965(final SubLObject var142, final SubLObject var143) {
        final SubLObject var144 = f44966(var142, (SubLObject)module0732.UNPROVIDED);
        final SubLObject var145 = f44966(var143, (SubLObject)module0732.UNPROVIDED);
        if (!var144.isInteger()) {
            return var145;
        }
        if (!var145.isInteger()) {
            return var144;
        }
        return module0048.f3381((SubLObject)ConsesLow.list(var144, var145), (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44966(final SubLObject var146, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0584.$g4396$.getDynamicValue();
        }
        return (SubLObject)((module0732.NIL != module0018.f971()) ? f44967(var146, var4) : module0732.NIL);
    }
    
    public static SubLObject f44968() {
        return f44969();
    }
    
    public static SubLObject f44970(final SubLObject var146, final SubLObject var4) {
        return f44971(var146, var4);
    }
    
    public static SubLObject f44969() {
        final SubLObject var33 = module0732.$g5793$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f44971(final SubLObject var146, final SubLObject var4) {
        return module0034.f1829(module0732.$g5793$.getGlobalValue(), (SubLObject)ConsesLow.list(var146, var4), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44972(final SubLObject var146, final SubLObject var4) {
        final SubLThread var147 = SubLProcess.currentSubLThread();
        if (module0732.NIL != module0731.f44656(var146, (SubLObject)module0732.UNPROVIDED)) {
            return (SubLObject)module0732.ZERO_INTEGER;
        }
        if (module0205.f13276(var146).eql(module0732.$ic72$)) {
            return (SubLObject)module0732.ONE_INTEGER;
        }
        if (module0205.f13276(var146).eql(module0732.$ic73$)) {
            return (SubLObject)module0732.TWO_INTEGER;
        }
        if (module0732.NIL == constant_handles_oc.f8463(constants_high_oc.f10737((SubLObject)module0732.$ic74$), (SubLObject)module0732.UNPROVIDED)) {
            return (SubLObject)module0732.NIL;
        }
        SubLObject var148 = (SubLObject)module0732.NIL;
        final SubLObject var149 = module0148.$g2099$.currentBinding(var147);
        try {
            module0148.$g2099$.bind((SubLObject)module0732.$ic75$, var147);
            var148 = module0434.f30579((SubLObject)module0732.$ic76$, (SubLObject)ConsesLow.listS(module0732.$ic77$, var146, (SubLObject)module0732.$ic78$), var4, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED).first();
        }
        finally {
            module0148.$g2099$.rebind(var149, var147);
        }
        if (module0732.NIL != var148) {
            return var148;
        }
        Errors.warn((SubLObject)module0732.$ic79$, var146, var4);
        f44970(var146, var4);
        return (SubLObject)module0732.ONE_INTEGER;
    }
    
    public static SubLObject f44967(final SubLObject var146, final SubLObject var4) {
        SubLObject var147 = module0732.$g5793$.getGlobalValue();
        if (module0732.NIL == var147) {
            var147 = module0034.f1934((SubLObject)module0732.$ic71$, (SubLObject)module0732.$ic80$, (SubLObject)module0732.NIL, (SubLObject)module0732.EQUAL, (SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.ZERO_INTEGER);
        }
        final SubLObject var148 = module0034.f1782(var146, var4);
        final SubLObject var149 = module0034.f1814(var147, var148, (SubLObject)module0732.UNPROVIDED);
        if (var149 != module0732.$ic18$) {
            SubLObject var150 = var149;
            SubLObject var151 = (SubLObject)module0732.NIL;
            var151 = var150.first();
            while (module0732.NIL != var150) {
                SubLObject var152 = var151.first();
                final SubLObject var153 = conses_high.second(var151);
                if (var146.equal(var152.first())) {
                    var152 = var152.rest();
                    if (module0732.NIL != var152 && module0732.NIL == var152.rest() && var4.equal(var152.first())) {
                        return module0034.f1959(var153);
                    }
                }
                var150 = var150.rest();
                var151 = var150.first();
            }
        }
        final SubLObject var154 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44972(var146, var4)));
        module0034.f1836(var147, var148, var149, var154, (SubLObject)ConsesLow.list(var146, var4));
        return module0034.f1959(var154);
    }
    
    public static SubLObject f44973(final SubLObject var146, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0584.$g4396$.getDynamicValue();
        }
        return (SubLObject)((module0732.NIL != module0018.f971()) ? f44974(var146, var4) : module0732.NIL);
    }
    
    public static SubLObject f44975() {
        final SubLObject var33 = module0732.$g5794$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f44976(final SubLObject var146, final SubLObject var4) {
        return module0034.f1829(module0732.$g5794$.getGlobalValue(), (SubLObject)ConsesLow.list(var146, var4), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44977(final SubLObject var146, final SubLObject var4) {
        if (module0732.NIL != module0731.f44656(var146, (SubLObject)module0732.UNPROVIDED)) {
            return var146;
        }
        if (module0732.NIL != conses_high.member(module0205.f13276(var146), (SubLObject)module0732.$ic82$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
            return module0205.f13277(var146, (SubLObject)module0732.UNPROVIDED);
        }
        if (var146.eql(module0732.$ic83$)) {
            return module0732.$ic84$;
        }
        if (var146.eql(module0732.$ic85$)) {
            return module0732.$ic86$;
        }
        if (var146.eql(module0732.$ic87$)) {
            return module0732.$ic65$;
        }
        if (module0732.NIL == var146) {
            return (SubLObject)module0732.NIL;
        }
        if (var146.eql(module0732.$ic88$)) {
            return module0732.$ic25$;
        }
        return module0434.f30579((SubLObject)module0732.$ic89$, (SubLObject)ConsesLow.listS(module0732.$ic90$, var146, (SubLObject)module0732.$ic91$), var4, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED).first();
    }
    
    public static SubLObject f44974(final SubLObject var146, final SubLObject var4) {
        SubLObject var147 = module0732.$g5794$.getGlobalValue();
        if (module0732.NIL == var147) {
            var147 = module0034.f1934((SubLObject)module0732.$ic81$, (SubLObject)module0732.$ic92$, (SubLObject)module0732.NIL, (SubLObject)module0732.EQUAL, (SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.ZERO_INTEGER);
        }
        final SubLObject var148 = module0034.f1782(var146, var4);
        final SubLObject var149 = module0034.f1814(var147, var148, (SubLObject)module0732.UNPROVIDED);
        if (var149 != module0732.$ic18$) {
            SubLObject var150 = var149;
            SubLObject var151 = (SubLObject)module0732.NIL;
            var151 = var150.first();
            while (module0732.NIL != var150) {
                SubLObject var152 = var151.first();
                final SubLObject var153 = conses_high.second(var151);
                if (var146.equal(var152.first())) {
                    var152 = var152.rest();
                    if (module0732.NIL != var152 && module0732.NIL == var152.rest() && var4.equal(var152.first())) {
                        return module0034.f1959(var153);
                    }
                }
                var150 = var150.rest();
                var151 = var150.first();
            }
        }
        final SubLObject var154 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44977(var146, var4)));
        module0034.f1836(var147, var148, var149, var154, (SubLObject)ConsesLow.list(var146, var4));
        return module0034.f1959(var154);
    }
    
    public static SubLObject f44978(final SubLObject var148, final SubLObject var149) {
        if (module0732.NIL == module0731.f44656(var148, (SubLObject)module0732.UNPROVIDED)) {
            return var148;
        }
        if (var149.eql((SubLObject)module0732.ONE_INTEGER)) {
            return module0228.f15229(module0202.f12643(module0732.$ic72$, var148));
        }
        if (var149.eql((SubLObject)module0732.TWO_INTEGER)) {
            return module0228.f15229(module0202.f12643(module0732.$ic73$, var148));
        }
        return var148;
    }
    
    public static SubLObject f44979() {
        module0731.f44773();
        module0584.f35778();
        module0731.f44650();
        return f44980();
    }
    
    public static SubLObject f44981(SubLObject var150) {
        if (var150 == module0732.UNPROVIDED) {
            var150 = (SubLObject)module0732.NIL;
        }
        if (module0732.NIL != module0212.f13762(var150)) {
            if (module0732.NIL != module0173.f10955(var150)) {
                module0745.f46272(var150);
            }
            if (module0732.NIL != module0269.f17726(var150) && module0732.NIL != module0158.f10078(var150)) {
                final SubLObject var151 = module0158.f10080(var150);
                SubLObject var152 = (SubLObject)module0732.NIL;
                try {
                    var152 = module0158.f10316(var151, (SubLObject)module0732.$ic93$, (SubLObject)module0732.NIL, (SubLObject)module0732.NIL);
                    SubLObject var153 = (SubLObject)module0732.NIL;
                    final SubLObject var154 = (SubLObject)module0732.NIL;
                    while (module0732.NIL == var153) {
                        final SubLObject var155 = module0052.f3695(var152, var154);
                        final SubLObject var156 = (SubLObject)SubLObjectFactory.makeBoolean(!var154.eql(var155));
                        if (module0732.NIL != var156) {
                            final SubLObject var157 = module0178.f11334(var155);
                            if (module0732.NIL != module0167.f10813(var157)) {
                                module0745.f46272(var157);
                            }
                        }
                        var153 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var156);
                    }
                }
                finally {
                    final SubLObject var158 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0732.T);
                        if (module0732.NIL != var152) {
                            module0158.f10319(var152);
                        }
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var158);
                    }
                }
            }
        }
        f44982();
        return (SubLObject)module0732.T;
    }
    
    public static SubLObject f44980() {
        f44983();
        f44984();
        f44985();
        f44986();
        f44987();
        f44988();
        f44989();
        return (SubLObject)module0732.$ic94$;
    }
    
    public static SubLObject f44983() {
        final SubLObject var33 = module0732.$g5795$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f44990(final SubLObject var47) {
        return module0034.f1829(module0732.$g5795$.getGlobalValue(), (SubLObject)ConsesLow.list(var47), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44991(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)module0732.NIL;
        if (module0732.NIL != module0018.f971()) {
            final SubLObject var50 = (SubLObject)module0732.$ic37$;
            final SubLObject var51 = module0056.f4145(var50);
            SubLObject var52 = (SubLObject)module0732.NIL;
            final SubLObject var53 = module0139.$g1635$.currentBinding(var48);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var48);
                final SubLObject var54 = (SubLObject)module0732.NIL;
                final SubLObject var50_159 = module0141.$g1714$.currentBinding(var48);
                final SubLObject var55 = module0141.$g1715$.currentBinding(var48);
                try {
                    module0141.$g1714$.bind((module0732.NIL != var54) ? var54 : module0141.f9283(), var48);
                    module0141.$g1715$.bind((SubLObject)((module0732.NIL != var54) ? module0732.$ic38$ : module0141.$g1715$.getDynamicValue(var48)), var48);
                    if (module0732.NIL != var54 && module0732.NIL != module0136.f8864() && module0732.NIL == module0141.f9279(var54)) {
                        final SubLObject var56 = module0136.$g1591$.getDynamicValue(var48);
                        if (var56.eql((SubLObject)module0732.$ic39$)) {
                            module0136.f8870((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic40$, var54, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                        }
                        else if (var56.eql((SubLObject)module0732.$ic42$)) {
                            module0136.f8871((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var54, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                        }
                        else if (var56.eql((SubLObject)module0732.$ic44$)) {
                            Errors.warn((SubLObject)module0732.$ic40$, var54, (SubLObject)module0732.$ic41$);
                        }
                        else {
                            Errors.warn((SubLObject)module0732.$ic45$, module0136.$g1591$.getDynamicValue(var48));
                            Errors.cerror((SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var54, (SubLObject)module0732.$ic41$);
                        }
                    }
                    final SubLObject var50_160 = module0141.$g1670$.currentBinding(var48);
                    final SubLObject var52_161 = module0141.$g1671$.currentBinding(var48);
                    final SubLObject var57 = module0141.$g1672$.currentBinding(var48);
                    final SubLObject var58 = module0141.$g1674$.currentBinding(var48);
                    final SubLObject var59 = module0137.$g1605$.currentBinding(var48);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0732.$ic46$), var48);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0732.$ic46$)), var48);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0732.$ic46$)), var48);
                        module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                        module0137.$g1605$.bind(module0137.f8955(module0732.$ic46$), var48);
                        if (module0732.NIL != module0136.f8865() || module0732.NIL != module0244.f15795(var47, module0137.f8955((SubLObject)module0732.UNPROVIDED))) {
                            final SubLObject var50_161 = module0141.$g1677$.currentBinding(var48);
                            final SubLObject var52_162 = module0138.$g1619$.currentBinding(var48);
                            final SubLObject var63_164 = module0141.$g1674$.currentBinding(var48);
                            try {
                                module0141.$g1677$.bind(module0141.f9208(), var48);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0732.$ic46$)), var48);
                                module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                                module0249.f16055(var47, (SubLObject)module0732.UNPROVIDED);
                                for (var52 = (SubLObject)ConsesLow.list(var47, module0141.f9195()); module0732.NIL != var52; var52 = module0056.f4150(var51)) {
                                    final SubLObject var53_165 = var52.first();
                                    final SubLObject var60 = conses_high.second(var52);
                                    final SubLObject var61 = var53_165;
                                    final SubLObject var50_162 = module0141.$g1674$.currentBinding(var48);
                                    try {
                                        module0141.$g1674$.bind(var60, var48);
                                        if (module0732.NIL != module0250.f16115(module0141.f9190(), var53_165)) {
                                            final SubLObject var62 = module0220.f14556(var61, module0732.$ic96$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                            if (module0732.NIL != var62) {
                                                var49 = var62;
                                            }
                                        }
                                        SubLObject var64;
                                        final SubLObject var63 = var64 = module0200.f12443(module0137.f8955(module0732.$ic46$));
                                        SubLObject var65 = (SubLObject)module0732.NIL;
                                        var65 = var64.first();
                                        while (module0732.NIL != var64) {
                                            final SubLObject var50_163 = module0137.$g1605$.currentBinding(var48);
                                            final SubLObject var52_163 = module0141.$g1674$.currentBinding(var48);
                                            try {
                                                module0137.$g1605$.bind(var65, var48);
                                                module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var48)) : module0141.$g1674$.getDynamicValue(var48)), var48);
                                                final SubLObject var66 = module0228.f15229(var53_165);
                                                if (module0732.NIL != module0138.f8992(var66)) {
                                                    final SubLObject var67 = module0242.f15664(var66, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                    if (module0732.NIL != var67) {
                                                        final SubLObject var68 = module0245.f15834(var67, module0138.f8979(), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                        if (module0732.NIL != var68) {
                                                            SubLObject var69;
                                                            for (var69 = module0066.f4838(module0067.f4891(var68)); module0732.NIL == module0066.f4841(var69); var69 = module0066.f4840(var69)) {
                                                                var48.resetMultipleValues();
                                                                final SubLObject var70 = module0066.f4839(var69);
                                                                final SubLObject var71 = var48.secondMultipleValue();
                                                                var48.resetMultipleValues();
                                                                if (module0732.NIL != module0147.f9507(var70)) {
                                                                    final SubLObject var50_164 = module0138.$g1623$.currentBinding(var48);
                                                                    try {
                                                                        module0138.$g1623$.bind(var70, var48);
                                                                        SubLObject var82_171;
                                                                        for (var82_171 = module0066.f4838(module0067.f4891(var71)); module0732.NIL == module0066.f4841(var82_171); var82_171 = module0066.f4840(var82_171)) {
                                                                            var48.resetMultipleValues();
                                                                            final SubLObject var72 = module0066.f4839(var82_171);
                                                                            final SubLObject var73 = var48.secondMultipleValue();
                                                                            var48.resetMultipleValues();
                                                                            if (module0732.NIL != module0141.f9289(var72)) {
                                                                                final SubLObject var50_165 = module0138.$g1624$.currentBinding(var48);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var72, var48);
                                                                                    final SubLObject var74 = var73;
                                                                                    if (module0732.NIL != module0077.f5302(var74)) {
                                                                                        final SubLObject var75 = module0077.f5333(var74);
                                                                                        SubLObject var76;
                                                                                        SubLObject var77;
                                                                                        SubLObject var78;
                                                                                        for (var76 = module0032.f1741(var75), var77 = (SubLObject)module0732.NIL, var77 = module0032.f1742(var76, var75); module0732.NIL == module0032.f1744(var76, var77); var77 = module0032.f1743(var77)) {
                                                                                            var78 = module0032.f1745(var76, var77);
                                                                                            if (module0732.NIL != module0032.f1746(var77, var78) && module0732.NIL == module0249.f16059(var78, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                module0249.f16055(var78, (SubLObject)module0732.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var78, module0141.f9195()), var51);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var74.isList()) {
                                                                                        SubLObject var79 = var74;
                                                                                        SubLObject var80 = (SubLObject)module0732.NIL;
                                                                                        var80 = var79.first();
                                                                                        while (module0732.NIL != var79) {
                                                                                            if (module0732.NIL == module0249.f16059(var80, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                module0249.f16055(var80, (SubLObject)module0732.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var80, module0141.f9195()), var51);
                                                                                            }
                                                                                            var79 = var79.rest();
                                                                                            var80 = var79.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0732.$ic48$, var74);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var50_165, var48);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var82_171);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var50_164, var48);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var69);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0732.NIL != module0155.f9785(var66, (SubLObject)module0732.UNPROVIDED)) {
                                                    SubLObject var9_173;
                                                    final SubLObject var81 = var9_173 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED)));
                                                    SubLObject var82 = (SubLObject)module0732.NIL;
                                                    var82 = var9_173.first();
                                                    while (module0732.NIL != var9_173) {
                                                        final SubLObject var50_166 = module0138.$g1625$.currentBinding(var48);
                                                        try {
                                                            module0138.$g1625$.bind(var82, var48);
                                                            final SubLObject var84;
                                                            final SubLObject var83 = var84 = Functions.funcall(var82, var66);
                                                            if (module0732.NIL != module0077.f5302(var84)) {
                                                                final SubLObject var85 = module0077.f5333(var84);
                                                                SubLObject var86;
                                                                SubLObject var87;
                                                                SubLObject var88;
                                                                for (var86 = module0032.f1741(var85), var87 = (SubLObject)module0732.NIL, var87 = module0032.f1742(var86, var85); module0732.NIL == module0032.f1744(var86, var87); var87 = module0032.f1743(var87)) {
                                                                    var88 = module0032.f1745(var86, var87);
                                                                    if (module0732.NIL != module0032.f1746(var87, var88) && module0732.NIL == module0249.f16059(var88, (SubLObject)module0732.UNPROVIDED)) {
                                                                        module0249.f16055(var88, (SubLObject)module0732.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var88, module0141.f9195()), var51);
                                                                    }
                                                                }
                                                            }
                                                            else if (var84.isList()) {
                                                                SubLObject var89 = var84;
                                                                SubLObject var90 = (SubLObject)module0732.NIL;
                                                                var90 = var89.first();
                                                                while (module0732.NIL != var89) {
                                                                    if (module0732.NIL == module0249.f16059(var90, (SubLObject)module0732.UNPROVIDED)) {
                                                                        module0249.f16055(var90, (SubLObject)module0732.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var90, module0141.f9195()), var51);
                                                                    }
                                                                    var89 = var89.rest();
                                                                    var90 = var89.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0732.$ic48$, var84);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var50_166, var48);
                                                        }
                                                        var9_173 = var9_173.rest();
                                                        var82 = var9_173.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var52_163, var48);
                                                module0137.$g1605$.rebind(var50_163, var48);
                                            }
                                            var64 = var64.rest();
                                            var65 = var64.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var50_162, var48);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var63_164, var48);
                                module0138.$g1619$.rebind(var52_162, var48);
                                module0141.$g1677$.rebind(var50_161, var48);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.$ic50$, var47, module0244.f15748(module0137.f8955((SubLObject)module0732.UNPROVIDED)), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var59, var48);
                        module0141.$g1674$.rebind(var58, var48);
                        module0141.$g1672$.rebind(var57, var48);
                        module0141.$g1671$.rebind(var52_161, var48);
                        module0141.$g1670$.rebind(var50_160, var48);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var55, var48);
                    module0141.$g1714$.rebind(var50_159, var48);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var48));
            }
            finally {
                module0139.$g1635$.rebind(var53, var48);
            }
        }
        return var49;
    }
    
    public static SubLObject f44992(final SubLObject var47) {
        SubLObject var48 = module0732.$g5795$.getGlobalValue();
        if (module0732.NIL == var48) {
            var48 = module0034.f1934((SubLObject)module0732.$ic95$, (SubLObject)module0732.$ic97$, (SubLObject)module0732.NIL, (SubLObject)module0732.EQL, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.ZERO_INTEGER);
        }
        SubLObject var49 = module0034.f1814(var48, var47, (SubLObject)module0732.$ic18$);
        if (var49 == module0732.$ic18$) {
            var49 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44991(var47)));
            module0034.f1816(var48, var47, var49, (SubLObject)module0732.UNPROVIDED);
        }
        return module0034.f1959(var49);
    }
    
    public static SubLObject f44984() {
        final SubLObject var33 = module0732.$g5796$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f44993(final SubLObject var47) {
        return module0034.f1829(module0732.$g5796$.getGlobalValue(), (SubLObject)ConsesLow.list(var47), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f44994(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)module0732.NIL;
        if (module0732.NIL != module0018.f971()) {
            final SubLObject var50 = (SubLObject)module0732.$ic37$;
            final SubLObject var51 = module0056.f4145(var50);
            SubLObject var52 = (SubLObject)module0732.NIL;
            final SubLObject var53 = module0139.$g1635$.currentBinding(var48);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var48);
                final SubLObject var54 = (SubLObject)module0732.NIL;
                final SubLObject var50_175 = module0141.$g1714$.currentBinding(var48);
                final SubLObject var55 = module0141.$g1715$.currentBinding(var48);
                try {
                    module0141.$g1714$.bind((module0732.NIL != var54) ? var54 : module0141.f9283(), var48);
                    module0141.$g1715$.bind((SubLObject)((module0732.NIL != var54) ? module0732.$ic38$ : module0141.$g1715$.getDynamicValue(var48)), var48);
                    if (module0732.NIL != var54 && module0732.NIL != module0136.f8864() && module0732.NIL == module0141.f9279(var54)) {
                        final SubLObject var56 = module0136.$g1591$.getDynamicValue(var48);
                        if (var56.eql((SubLObject)module0732.$ic39$)) {
                            module0136.f8870((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic40$, var54, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                        }
                        else if (var56.eql((SubLObject)module0732.$ic42$)) {
                            module0136.f8871((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var54, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                        }
                        else if (var56.eql((SubLObject)module0732.$ic44$)) {
                            Errors.warn((SubLObject)module0732.$ic40$, var54, (SubLObject)module0732.$ic41$);
                        }
                        else {
                            Errors.warn((SubLObject)module0732.$ic45$, module0136.$g1591$.getDynamicValue(var48));
                            Errors.cerror((SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var54, (SubLObject)module0732.$ic41$);
                        }
                    }
                    final SubLObject var50_176 = module0141.$g1670$.currentBinding(var48);
                    final SubLObject var52_177 = module0141.$g1671$.currentBinding(var48);
                    final SubLObject var57 = module0141.$g1672$.currentBinding(var48);
                    final SubLObject var58 = module0141.$g1674$.currentBinding(var48);
                    final SubLObject var59 = module0137.$g1605$.currentBinding(var48);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0732.$ic46$), var48);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0732.$ic46$)), var48);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0732.$ic46$)), var48);
                        module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                        module0137.$g1605$.bind(module0137.f8955(module0732.$ic46$), var48);
                        if (module0732.NIL != module0136.f8865() || module0732.NIL != module0244.f15795(var47, module0137.f8955((SubLObject)module0732.UNPROVIDED))) {
                            final SubLObject var50_177 = module0141.$g1677$.currentBinding(var48);
                            final SubLObject var52_178 = module0138.$g1619$.currentBinding(var48);
                            final SubLObject var63_180 = module0141.$g1674$.currentBinding(var48);
                            try {
                                module0141.$g1677$.bind(module0141.f9208(), var48);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0732.$ic46$)), var48);
                                module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                                module0249.f16055(var47, (SubLObject)module0732.UNPROVIDED);
                                for (var52 = (SubLObject)ConsesLow.list(var47, module0141.f9195()); module0732.NIL != var52; var52 = module0056.f4150(var51)) {
                                    final SubLObject var53_181 = var52.first();
                                    final SubLObject var60 = conses_high.second(var52);
                                    final SubLObject var61 = var53_181;
                                    final SubLObject var50_178 = module0141.$g1674$.currentBinding(var48);
                                    try {
                                        module0141.$g1674$.bind(var60, var48);
                                        if (module0732.NIL != module0250.f16115(module0141.f9190(), var53_181)) {
                                            final SubLObject var62 = module0220.f14556(var61, module0732.$ic99$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                            if (module0732.NIL != var62) {
                                                var49 = var62;
                                            }
                                        }
                                        SubLObject var64;
                                        final SubLObject var63 = var64 = module0200.f12443(module0137.f8955(module0732.$ic46$));
                                        SubLObject var65 = (SubLObject)module0732.NIL;
                                        var65 = var64.first();
                                        while (module0732.NIL != var64) {
                                            final SubLObject var50_179 = module0137.$g1605$.currentBinding(var48);
                                            final SubLObject var52_179 = module0141.$g1674$.currentBinding(var48);
                                            try {
                                                module0137.$g1605$.bind(var65, var48);
                                                module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var48)) : module0141.$g1674$.getDynamicValue(var48)), var48);
                                                final SubLObject var66 = module0228.f15229(var53_181);
                                                if (module0732.NIL != module0138.f8992(var66)) {
                                                    final SubLObject var67 = module0242.f15664(var66, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                    if (module0732.NIL != var67) {
                                                        final SubLObject var68 = module0245.f15834(var67, module0138.f8979(), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                        if (module0732.NIL != var68) {
                                                            SubLObject var69;
                                                            for (var69 = module0066.f4838(module0067.f4891(var68)); module0732.NIL == module0066.f4841(var69); var69 = module0066.f4840(var69)) {
                                                                var48.resetMultipleValues();
                                                                final SubLObject var70 = module0066.f4839(var69);
                                                                final SubLObject var71 = var48.secondMultipleValue();
                                                                var48.resetMultipleValues();
                                                                if (module0732.NIL != module0147.f9507(var70)) {
                                                                    final SubLObject var50_180 = module0138.$g1623$.currentBinding(var48);
                                                                    try {
                                                                        module0138.$g1623$.bind(var70, var48);
                                                                        SubLObject var82_186;
                                                                        for (var82_186 = module0066.f4838(module0067.f4891(var71)); module0732.NIL == module0066.f4841(var82_186); var82_186 = module0066.f4840(var82_186)) {
                                                                            var48.resetMultipleValues();
                                                                            final SubLObject var72 = module0066.f4839(var82_186);
                                                                            final SubLObject var73 = var48.secondMultipleValue();
                                                                            var48.resetMultipleValues();
                                                                            if (module0732.NIL != module0141.f9289(var72)) {
                                                                                final SubLObject var50_181 = module0138.$g1624$.currentBinding(var48);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var72, var48);
                                                                                    final SubLObject var74 = var73;
                                                                                    if (module0732.NIL != module0077.f5302(var74)) {
                                                                                        final SubLObject var75 = module0077.f5333(var74);
                                                                                        SubLObject var76;
                                                                                        SubLObject var77;
                                                                                        SubLObject var78;
                                                                                        for (var76 = module0032.f1741(var75), var77 = (SubLObject)module0732.NIL, var77 = module0032.f1742(var76, var75); module0732.NIL == module0032.f1744(var76, var77); var77 = module0032.f1743(var77)) {
                                                                                            var78 = module0032.f1745(var76, var77);
                                                                                            if (module0732.NIL != module0032.f1746(var77, var78) && module0732.NIL == module0249.f16059(var78, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                module0249.f16055(var78, (SubLObject)module0732.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var78, module0141.f9195()), var51);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var74.isList()) {
                                                                                        SubLObject var79 = var74;
                                                                                        SubLObject var80 = (SubLObject)module0732.NIL;
                                                                                        var80 = var79.first();
                                                                                        while (module0732.NIL != var79) {
                                                                                            if (module0732.NIL == module0249.f16059(var80, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                module0249.f16055(var80, (SubLObject)module0732.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var80, module0141.f9195()), var51);
                                                                                            }
                                                                                            var79 = var79.rest();
                                                                                            var80 = var79.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0732.$ic48$, var74);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var50_181, var48);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var82_186);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var50_180, var48);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var69);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0732.NIL != module0155.f9785(var66, (SubLObject)module0732.UNPROVIDED)) {
                                                    SubLObject var9_188;
                                                    final SubLObject var81 = var9_188 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED)));
                                                    SubLObject var82 = (SubLObject)module0732.NIL;
                                                    var82 = var9_188.first();
                                                    while (module0732.NIL != var9_188) {
                                                        final SubLObject var50_182 = module0138.$g1625$.currentBinding(var48);
                                                        try {
                                                            module0138.$g1625$.bind(var82, var48);
                                                            final SubLObject var84;
                                                            final SubLObject var83 = var84 = Functions.funcall(var82, var66);
                                                            if (module0732.NIL != module0077.f5302(var84)) {
                                                                final SubLObject var85 = module0077.f5333(var84);
                                                                SubLObject var86;
                                                                SubLObject var87;
                                                                SubLObject var88;
                                                                for (var86 = module0032.f1741(var85), var87 = (SubLObject)module0732.NIL, var87 = module0032.f1742(var86, var85); module0732.NIL == module0032.f1744(var86, var87); var87 = module0032.f1743(var87)) {
                                                                    var88 = module0032.f1745(var86, var87);
                                                                    if (module0732.NIL != module0032.f1746(var87, var88) && module0732.NIL == module0249.f16059(var88, (SubLObject)module0732.UNPROVIDED)) {
                                                                        module0249.f16055(var88, (SubLObject)module0732.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var88, module0141.f9195()), var51);
                                                                    }
                                                                }
                                                            }
                                                            else if (var84.isList()) {
                                                                SubLObject var89 = var84;
                                                                SubLObject var90 = (SubLObject)module0732.NIL;
                                                                var90 = var89.first();
                                                                while (module0732.NIL != var89) {
                                                                    if (module0732.NIL == module0249.f16059(var90, (SubLObject)module0732.UNPROVIDED)) {
                                                                        module0249.f16055(var90, (SubLObject)module0732.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var90, module0141.f9195()), var51);
                                                                    }
                                                                    var89 = var89.rest();
                                                                    var90 = var89.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0732.$ic48$, var84);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var50_182, var48);
                                                        }
                                                        var9_188 = var9_188.rest();
                                                        var82 = var9_188.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var52_179, var48);
                                                module0137.$g1605$.rebind(var50_179, var48);
                                            }
                                            var64 = var64.rest();
                                            var65 = var64.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var50_178, var48);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var63_180, var48);
                                module0138.$g1619$.rebind(var52_178, var48);
                                module0141.$g1677$.rebind(var50_177, var48);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.$ic50$, var47, module0244.f15748(module0137.f8955((SubLObject)module0732.UNPROVIDED)), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var59, var48);
                        module0141.$g1674$.rebind(var58, var48);
                        module0141.$g1672$.rebind(var57, var48);
                        module0141.$g1671$.rebind(var52_177, var48);
                        module0141.$g1670$.rebind(var50_176, var48);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var55, var48);
                    module0141.$g1714$.rebind(var50_175, var48);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var48));
            }
            finally {
                module0139.$g1635$.rebind(var53, var48);
            }
        }
        return var49;
    }
    
    public static SubLObject f44995(final SubLObject var47) {
        SubLObject var48 = module0732.$g5796$.getGlobalValue();
        if (module0732.NIL == var48) {
            var48 = module0034.f1934((SubLObject)module0732.$ic98$, (SubLObject)module0732.$ic100$, (SubLObject)module0732.NIL, (SubLObject)module0732.EQL, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.ZERO_INTEGER);
        }
        SubLObject var49 = module0034.f1814(var48, var47, (SubLObject)module0732.$ic18$);
        if (var49 == module0732.$ic18$) {
            var49 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44994(var47)));
            module0034.f1816(var48, var47, var49, (SubLObject)module0732.UNPROVIDED);
        }
        return module0034.f1959(var49);
    }
    
    public static SubLObject f44996(final SubLObject var190) {
        if (module0732.NIL != module0178.f11284(var190)) {
            final SubLObject var191 = module0178.f11333(var190);
            final SubLObject var192 = f44992(var191);
            final SubLObject var193 = (SubLObject)((module0732.NIL != module0202.f12908(var192)) ? module0178.f11331(var190, var192) : module0732.NIL);
            return var193;
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f44985() {
        module0732.$g5797$.setGlobalValue(module0107.f7627());
        return module0732.$g5797$.getGlobalValue();
    }
    
    public static SubLObject f44997() {
        if (module0732.NIL != module0107.f7628(module0732.$g5797$.getGlobalValue())) {
            final SubLObject var192 = (SubLObject)module0732.$ic101$;
            final SubLObject var193 = (SubLObject)module0732.$ic102$;
            final SubLObject var194 = (SubLObject)module0732.$ic103$;
            final SubLObject var195 = module0434.f30576(var192, var193, module0732.$ic104$, var194);
            module0732.$g5797$.setGlobalValue(module0084.f5781(var195, Symbols.symbol_function((SubLObject)module0732.EQUAL)));
        }
        return module0732.$g5797$.getGlobalValue();
    }
    
    public static SubLObject f44998(final SubLObject var47) {
        return f44999(var47);
    }
    
    public static SubLObject f44999(final SubLObject var47) {
        return (SubLObject)((module0732.NIL != module0018.f971()) ? f45000(var47) : module0732.NIL);
    }
    
    public static SubLObject f45001() {
        final SubLObject var33 = module0732.$g5798$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45002(final SubLObject var47) {
        return module0034.f1829(module0732.$g5798$.getGlobalValue(), (SubLObject)ConsesLow.list(var47), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45003(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = module0225.f14739(var47);
        SubLObject var50 = (SubLObject)module0732.NIL;
        if (var49.isInteger() && module0732.NIL == var50) {
            SubLObject var51;
            SubLObject var52;
            SubLObject var53;
            SubLObject var54;
            SubLObject var55;
            SubLObject var56;
            SubLObject var57;
            SubLObject var50_200;
            SubLObject var58;
            SubLObject var50_201;
            SubLObject var52_202;
            SubLObject var59;
            SubLObject var50_202;
            SubLObject var52_203;
            SubLObject var60;
            SubLObject var61;
            SubLObject var62;
            SubLObject var50_203;
            SubLObject var52_204;
            SubLObject var63_207;
            SubLObject var53_208;
            SubLObject var63;
            SubLObject var64;
            SubLObject var50_204;
            SubLObject var66;
            SubLObject var65;
            SubLObject var67;
            SubLObject var50_205;
            SubLObject var52_205;
            SubLObject var68;
            SubLObject var69;
            SubLObject var70;
            SubLObject var71;
            SubLObject var72;
            SubLObject var73;
            SubLObject var50_206;
            SubLObject var82_213;
            SubLObject var74;
            SubLObject var75;
            SubLObject var50_207;
            SubLObject var76;
            SubLObject var77;
            SubLObject var78;
            SubLObject var79;
            SubLObject var80;
            SubLObject var81;
            SubLObject var82;
            SubLObject var9_215;
            SubLObject var83;
            SubLObject var84;
            SubLObject var50_208;
            SubLObject var86;
            SubLObject var85;
            SubLObject var87;
            SubLObject var88;
            SubLObject var89;
            SubLObject var90;
            SubLObject var91;
            SubLObject var92;
            for (var51 = module0048.f_1X(var49), var52 = (SubLObject)module0732.NIL, var52 = (SubLObject)module0732.ONE_INTEGER; module0732.NIL == var50 && !var52.numGE(var51); var52 = module0048.f_1X(var52)) {
                var53 = module0147.$g2094$.currentBinding(var48);
                var54 = module0147.$g2095$.currentBinding(var48);
                try {
                    module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var48);
                    module0147.$g2095$.bind(module0732.$ic34$, var48);
                    var55 = (SubLObject)module0732.$ic37$;
                    var56 = module0056.f4145(var55);
                    var57 = (SubLObject)module0732.NIL;
                    var50_200 = module0139.$g1635$.currentBinding(var48);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var48);
                        var58 = (SubLObject)module0732.NIL;
                        var50_201 = module0141.$g1714$.currentBinding(var48);
                        var52_202 = module0141.$g1715$.currentBinding(var48);
                        try {
                            module0141.$g1714$.bind((module0732.NIL != var58) ? var58 : module0141.f9283(), var48);
                            module0141.$g1715$.bind((SubLObject)((module0732.NIL != var58) ? module0732.$ic38$ : module0141.$g1715$.getDynamicValue(var48)), var48);
                            if (module0732.NIL != var58 && module0732.NIL != module0136.f8864() && module0732.NIL == module0141.f9279(var58)) {
                                var59 = module0136.$g1591$.getDynamicValue(var48);
                                if (var59.eql((SubLObject)module0732.$ic39$)) {
                                    module0136.f8870((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                                else if (var59.eql((SubLObject)module0732.$ic42$)) {
                                    module0136.f8871((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                                else if (var59.eql((SubLObject)module0732.$ic44$)) {
                                    Errors.warn((SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0732.$ic45$, module0136.$g1591$.getDynamicValue(var48));
                                    Errors.cerror((SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$);
                                }
                            }
                            var50_202 = module0141.$g1670$.currentBinding(var48);
                            var52_203 = module0141.$g1671$.currentBinding(var48);
                            var60 = module0141.$g1672$.currentBinding(var48);
                            var61 = module0141.$g1674$.currentBinding(var48);
                            var62 = module0137.$g1605$.currentBinding(var48);
                            try {
                                module0141.$g1670$.bind(module0137.f8955(module0732.$ic46$), var48);
                                module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0732.$ic46$)), var48);
                                module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0732.$ic46$)), var48);
                                module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                                module0137.$g1605$.bind(module0137.f8955(module0732.$ic46$), var48);
                                if (module0732.NIL != module0136.f8865() || module0732.NIL != module0244.f15795(var47, module0137.f8955((SubLObject)module0732.UNPROVIDED))) {
                                    var50_203 = module0141.$g1677$.currentBinding(var48);
                                    var52_204 = module0138.$g1619$.currentBinding(var48);
                                    var63_207 = module0141.$g1674$.currentBinding(var48);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9208(), var48);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0732.$ic46$)), var48);
                                        module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                                        module0249.f16055(var47, (SubLObject)module0732.UNPROVIDED);
                                        for (var57 = (SubLObject)ConsesLow.list(var47, module0141.f9195()); module0732.NIL != var57; var57 = module0056.f4150(var56)) {
                                            var53_208 = var57.first();
                                            var63 = conses_high.second(var57);
                                            var64 = var53_208;
                                            var50_204 = module0141.$g1674$.currentBinding(var48);
                                            try {
                                                module0141.$g1674$.bind(var63, var48);
                                                if (module0732.NIL != module0250.f16115(module0141.f9190(), var53_208) && module0732.NIL != module0731.f44880(var64, var52)) {
                                                    var50 = var52;
                                                }
                                                var65 = (var66 = module0200.f12443(module0137.f8955(module0732.$ic46$)));
                                                var67 = (SubLObject)module0732.NIL;
                                                var67 = var66.first();
                                                while (module0732.NIL != var66) {
                                                    var50_205 = module0137.$g1605$.currentBinding(var48);
                                                    var52_205 = module0141.$g1674$.currentBinding(var48);
                                                    try {
                                                        module0137.$g1605$.bind(var67, var48);
                                                        module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var48)) : module0141.$g1674$.getDynamicValue(var48)), var48);
                                                        var68 = module0228.f15229(var53_208);
                                                        if (module0732.NIL != module0138.f8992(var68)) {
                                                            var69 = module0242.f15664(var68, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                            if (module0732.NIL != var69) {
                                                                var70 = module0245.f15834(var69, module0138.f8979(), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                                if (module0732.NIL != var70) {
                                                                    for (var71 = module0066.f4838(module0067.f4891(var70)); module0732.NIL == module0066.f4841(var71); var71 = module0066.f4840(var71)) {
                                                                        var48.resetMultipleValues();
                                                                        var72 = module0066.f4839(var71);
                                                                        var73 = var48.secondMultipleValue();
                                                                        var48.resetMultipleValues();
                                                                        if (module0732.NIL != module0147.f9507(var72)) {
                                                                            var50_206 = module0138.$g1623$.currentBinding(var48);
                                                                            try {
                                                                                module0138.$g1623$.bind(var72, var48);
                                                                                for (var82_213 = module0066.f4838(module0067.f4891(var73)); module0732.NIL == module0066.f4841(var82_213); var82_213 = module0066.f4840(var82_213)) {
                                                                                    var48.resetMultipleValues();
                                                                                    var74 = module0066.f4839(var82_213);
                                                                                    var75 = var48.secondMultipleValue();
                                                                                    var48.resetMultipleValues();
                                                                                    if (module0732.NIL != module0141.f9289(var74)) {
                                                                                        var50_207 = module0138.$g1624$.currentBinding(var48);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var74, var48);
                                                                                            var76 = var75;
                                                                                            if (module0732.NIL != module0077.f5302(var76)) {
                                                                                                var77 = module0077.f5333(var76);
                                                                                                for (var78 = module0032.f1741(var77), var79 = (SubLObject)module0732.NIL, var79 = module0032.f1742(var78, var77); module0732.NIL == module0032.f1744(var78, var79); var79 = module0032.f1743(var79)) {
                                                                                                    var80 = module0032.f1745(var78, var79);
                                                                                                    if (module0732.NIL != module0032.f1746(var79, var80) && module0732.NIL == module0249.f16059(var80, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        module0249.f16055(var80, (SubLObject)module0732.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var80, module0141.f9195()), var56);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var76.isList()) {
                                                                                                var81 = var76;
                                                                                                var82 = (SubLObject)module0732.NIL;
                                                                                                var82 = var81.first();
                                                                                                while (module0732.NIL != var81) {
                                                                                                    if (module0732.NIL == module0249.f16059(var82, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        module0249.f16055(var82, (SubLObject)module0732.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var82, module0141.f9195()), var56);
                                                                                                    }
                                                                                                    var81 = var81.rest();
                                                                                                    var82 = var81.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)module0732.$ic48$, var76);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var50_207, var48);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var82_213);
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var50_206, var48);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var71);
                                                                }
                                                            }
                                                            else {
                                                                module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (module0732.NIL != module0155.f9785(var68, (SubLObject)module0732.UNPROVIDED)) {
                                                            var83 = (var9_215 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED))));
                                                            var84 = (SubLObject)module0732.NIL;
                                                            var84 = var9_215.first();
                                                            while (module0732.NIL != var9_215) {
                                                                var50_208 = module0138.$g1625$.currentBinding(var48);
                                                                try {
                                                                    module0138.$g1625$.bind(var84, var48);
                                                                    var85 = (var86 = Functions.funcall(var84, var68));
                                                                    if (module0732.NIL != module0077.f5302(var86)) {
                                                                        var87 = module0077.f5333(var86);
                                                                        for (var88 = module0032.f1741(var87), var89 = (SubLObject)module0732.NIL, var89 = module0032.f1742(var88, var87); module0732.NIL == module0032.f1744(var88, var89); var89 = module0032.f1743(var89)) {
                                                                            var90 = module0032.f1745(var88, var89);
                                                                            if (module0732.NIL != module0032.f1746(var89, var90) && module0732.NIL == module0249.f16059(var90, (SubLObject)module0732.UNPROVIDED)) {
                                                                                module0249.f16055(var90, (SubLObject)module0732.UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var90, module0141.f9195()), var56);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var86.isList()) {
                                                                        var91 = var86;
                                                                        var92 = (SubLObject)module0732.NIL;
                                                                        var92 = var91.first();
                                                                        while (module0732.NIL != var91) {
                                                                            if (module0732.NIL == module0249.f16059(var92, (SubLObject)module0732.UNPROVIDED)) {
                                                                                module0249.f16055(var92, (SubLObject)module0732.UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var92, module0141.f9195()), var56);
                                                                            }
                                                                            var91 = var91.rest();
                                                                            var92 = var91.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)module0732.$ic48$, var86);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1625$.rebind(var50_208, var48);
                                                                }
                                                                var9_215 = var9_215.rest();
                                                                var84 = var9_215.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var52_205, var48);
                                                        module0137.$g1605$.rebind(var50_205, var48);
                                                    }
                                                    var66 = var66.rest();
                                                    var67 = var66.first();
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var50_204, var48);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var63_207, var48);
                                        module0138.$g1619$.rebind(var52_204, var48);
                                        module0141.$g1677$.rebind(var50_203, var48);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.$ic50$, var47, module0244.f15748(module0137.f8955((SubLObject)module0732.UNPROVIDED)), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var62, var48);
                                module0141.$g1674$.rebind(var61, var48);
                                module0141.$g1672$.rebind(var60, var48);
                                module0141.$g1671$.rebind(var52_203, var48);
                                module0141.$g1670$.rebind(var50_202, var48);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var52_202, var48);
                            module0141.$g1714$.rebind(var50_201, var48);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var48));
                    }
                    finally {
                        module0139.$g1635$.rebind(var50_200, var48);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var54, var48);
                    module0147.$g2094$.rebind(var53, var48);
                }
            }
        }
        return var50;
    }
    
    public static SubLObject f45000(final SubLObject var47) {
        SubLObject var48 = module0732.$g5798$.getGlobalValue();
        if (module0732.NIL == var48) {
            var48 = module0034.f1934((SubLObject)module0732.$ic105$, (SubLObject)module0732.$ic106$, (SubLObject)module0732.NIL, (SubLObject)module0732.EQUAL, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.ZERO_INTEGER);
        }
        SubLObject var49 = module0034.f1814(var48, var47, (SubLObject)module0732.$ic18$);
        if (var49 == module0732.$ic18$) {
            var49 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45003(var47)));
            module0034.f1816(var48, var47, var49, (SubLObject)module0732.UNPROVIDED);
        }
        return module0034.f1959(var49);
    }
    
    public static SubLObject f44986() {
        final SubLObject var33 = module0732.$g5799$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45004(final SubLObject var47, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0584.$g4396$.getDynamicValue();
        }
        return module0034.f1829(module0732.$g5799$.getGlobalValue(), (SubLObject)ConsesLow.list(var47, var4), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45005(final SubLObject var47, final SubLObject var4) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = module0225.f14739(var47);
        SubLObject var50 = (SubLObject)module0732.NIL;
        if (module0732.NIL != module0018.f971() && var49.isInteger() && module0732.NIL == var50) {
            SubLObject var51;
            SubLObject var52;
            SubLObject var53;
            SubLObject var54;
            SubLObject var55;
            SubLObject var56;
            SubLObject var57;
            SubLObject var58;
            SubLObject var59;
            SubLObject var50_218;
            SubLObject var60;
            SubLObject var50_219;
            SubLObject var52_220;
            SubLObject var61;
            SubLObject var50_220;
            SubLObject var52_221;
            SubLObject var63_223;
            SubLObject var62;
            SubLObject var63;
            SubLObject var50_221;
            SubLObject var52_222;
            SubLObject var63_224;
            SubLObject var53_227;
            SubLObject var64;
            SubLObject var65;
            SubLObject var50_222;
            SubLObject var67;
            SubLObject var66;
            SubLObject var68;
            SubLObject var50_223;
            SubLObject var52_223;
            SubLObject var69;
            SubLObject var70;
            SubLObject var71;
            SubLObject var72;
            SubLObject var83_231;
            SubLObject var73;
            SubLObject var50_224;
            SubLObject var82_233;
            SubLObject var74;
            SubLObject var75;
            SubLObject var50_225;
            SubLObject var76;
            SubLObject var77;
            SubLObject var78;
            SubLObject var79;
            SubLObject var80;
            SubLObject var81;
            SubLObject var82;
            SubLObject var9_235;
            SubLObject var83;
            SubLObject var84;
            SubLObject var50_226;
            SubLObject var86;
            SubLObject var85;
            SubLObject var87;
            SubLObject var88;
            SubLObject var89;
            SubLObject var90;
            SubLObject var91;
            SubLObject var92;
            for (var51 = module0048.f_1X(var49), var52 = (SubLObject)module0732.NIL, var52 = (SubLObject)module0732.ONE_INTEGER; module0732.NIL == var50 && !var52.numGE(var51); var52 = module0048.f_1X(var52)) {
                var53 = module0147.f9540(var4);
                var54 = module0147.$g2095$.currentBinding(var48);
                var55 = module0147.$g2094$.currentBinding(var48);
                var56 = module0147.$g2096$.currentBinding(var48);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var53), var48);
                    module0147.$g2094$.bind(module0147.f9546(var53), var48);
                    module0147.$g2096$.bind(module0147.f9549(var53), var48);
                    var57 = (SubLObject)module0732.$ic37$;
                    var58 = module0056.f4145(var57);
                    var59 = (SubLObject)module0732.NIL;
                    var50_218 = module0139.$g1635$.currentBinding(var48);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var48);
                        var60 = (SubLObject)module0732.NIL;
                        var50_219 = module0141.$g1714$.currentBinding(var48);
                        var52_220 = module0141.$g1715$.currentBinding(var48);
                        try {
                            module0141.$g1714$.bind((module0732.NIL != var60) ? var60 : module0141.f9283(), var48);
                            module0141.$g1715$.bind((SubLObject)((module0732.NIL != var60) ? module0732.$ic38$ : module0141.$g1715$.getDynamicValue(var48)), var48);
                            if (module0732.NIL != var60 && module0732.NIL != module0136.f8864() && module0732.NIL == module0141.f9279(var60)) {
                                var61 = module0136.$g1591$.getDynamicValue(var48);
                                if (var61.eql((SubLObject)module0732.$ic39$)) {
                                    module0136.f8870((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic40$, var60, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                                else if (var61.eql((SubLObject)module0732.$ic42$)) {
                                    module0136.f8871((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var60, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                                else if (var61.eql((SubLObject)module0732.$ic44$)) {
                                    Errors.warn((SubLObject)module0732.$ic40$, var60, (SubLObject)module0732.$ic41$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0732.$ic45$, module0136.$g1591$.getDynamicValue(var48));
                                    Errors.cerror((SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var60, (SubLObject)module0732.$ic41$);
                                }
                            }
                            var50_220 = module0141.$g1670$.currentBinding(var48);
                            var52_221 = module0141.$g1671$.currentBinding(var48);
                            var63_223 = module0141.$g1672$.currentBinding(var48);
                            var62 = module0141.$g1674$.currentBinding(var48);
                            var63 = module0137.$g1605$.currentBinding(var48);
                            try {
                                module0141.$g1670$.bind(module0137.f8955(module0732.$ic46$), var48);
                                module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0732.$ic46$)), var48);
                                module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0732.$ic46$)), var48);
                                module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                                module0137.$g1605$.bind(module0137.f8955(module0732.$ic46$), var48);
                                if (module0732.NIL != module0136.f8865() || module0732.NIL != module0244.f15795(var47, module0137.f8955((SubLObject)module0732.UNPROVIDED))) {
                                    var50_221 = module0141.$g1677$.currentBinding(var48);
                                    var52_222 = module0138.$g1619$.currentBinding(var48);
                                    var63_224 = module0141.$g1674$.currentBinding(var48);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9208(), var48);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0732.$ic46$)), var48);
                                        module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                                        module0249.f16055(var47, (SubLObject)module0732.UNPROVIDED);
                                        for (var59 = (SubLObject)ConsesLow.list(var47, module0141.f9195()); module0732.NIL != var59; var59 = module0056.f4150(var58)) {
                                            var53_227 = var59.first();
                                            var64 = conses_high.second(var59);
                                            var65 = var53_227;
                                            var50_222 = module0141.$g1674$.currentBinding(var48);
                                            try {
                                                module0141.$g1674$.bind(var64, var48);
                                                if (module0732.NIL != module0250.f16115(module0141.f9190(), var53_227) && module0732.NIL != module0004.f104(module0732.$ic108$, module0226.f14882(var65, var52, var4), (SubLObject)module0732.$ic109$, (SubLObject)module0732.UNPROVIDED)) {
                                                    var50 = var52;
                                                }
                                                var66 = (var67 = module0200.f12443(module0137.f8955(module0732.$ic46$)));
                                                var68 = (SubLObject)module0732.NIL;
                                                var68 = var67.first();
                                                while (module0732.NIL != var67) {
                                                    var50_223 = module0137.$g1605$.currentBinding(var48);
                                                    var52_223 = module0141.$g1674$.currentBinding(var48);
                                                    try {
                                                        module0137.$g1605$.bind(var68, var48);
                                                        module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var48)) : module0141.$g1674$.getDynamicValue(var48)), var48);
                                                        var69 = module0228.f15229(var53_227);
                                                        if (module0732.NIL != module0138.f8992(var69)) {
                                                            var70 = module0242.f15664(var69, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                            if (module0732.NIL != var70) {
                                                                var71 = module0245.f15834(var70, module0138.f8979(), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                                if (module0732.NIL != var71) {
                                                                    for (var72 = module0066.f4838(module0067.f4891(var71)); module0732.NIL == module0066.f4841(var72); var72 = module0066.f4840(var72)) {
                                                                        var48.resetMultipleValues();
                                                                        var83_231 = module0066.f4839(var72);
                                                                        var73 = var48.secondMultipleValue();
                                                                        var48.resetMultipleValues();
                                                                        if (module0732.NIL != module0147.f9507(var83_231)) {
                                                                            var50_224 = module0138.$g1623$.currentBinding(var48);
                                                                            try {
                                                                                module0138.$g1623$.bind(var83_231, var48);
                                                                                for (var82_233 = module0066.f4838(module0067.f4891(var73)); module0732.NIL == module0066.f4841(var82_233); var82_233 = module0066.f4840(var82_233)) {
                                                                                    var48.resetMultipleValues();
                                                                                    var74 = module0066.f4839(var82_233);
                                                                                    var75 = var48.secondMultipleValue();
                                                                                    var48.resetMultipleValues();
                                                                                    if (module0732.NIL != module0141.f9289(var74)) {
                                                                                        var50_225 = module0138.$g1624$.currentBinding(var48);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var74, var48);
                                                                                            var76 = var75;
                                                                                            if (module0732.NIL != module0077.f5302(var76)) {
                                                                                                var77 = module0077.f5333(var76);
                                                                                                for (var78 = module0032.f1741(var77), var79 = (SubLObject)module0732.NIL, var79 = module0032.f1742(var78, var77); module0732.NIL == module0032.f1744(var78, var79); var79 = module0032.f1743(var79)) {
                                                                                                    var80 = module0032.f1745(var78, var79);
                                                                                                    if (module0732.NIL != module0032.f1746(var79, var80) && module0732.NIL == module0249.f16059(var80, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        module0249.f16055(var80, (SubLObject)module0732.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var80, module0141.f9195()), var58);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var76.isList()) {
                                                                                                var81 = var76;
                                                                                                var82 = (SubLObject)module0732.NIL;
                                                                                                var82 = var81.first();
                                                                                                while (module0732.NIL != var81) {
                                                                                                    if (module0732.NIL == module0249.f16059(var82, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        module0249.f16055(var82, (SubLObject)module0732.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var82, module0141.f9195()), var58);
                                                                                                    }
                                                                                                    var81 = var81.rest();
                                                                                                    var82 = var81.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)module0732.$ic48$, var76);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var50_225, var48);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var82_233);
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var50_224, var48);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var72);
                                                                }
                                                            }
                                                            else {
                                                                module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (module0732.NIL != module0155.f9785(var69, (SubLObject)module0732.UNPROVIDED)) {
                                                            var83 = (var9_235 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED))));
                                                            var84 = (SubLObject)module0732.NIL;
                                                            var84 = var9_235.first();
                                                            while (module0732.NIL != var9_235) {
                                                                var50_226 = module0138.$g1625$.currentBinding(var48);
                                                                try {
                                                                    module0138.$g1625$.bind(var84, var48);
                                                                    var85 = (var86 = Functions.funcall(var84, var69));
                                                                    if (module0732.NIL != module0077.f5302(var86)) {
                                                                        var87 = module0077.f5333(var86);
                                                                        for (var88 = module0032.f1741(var87), var89 = (SubLObject)module0732.NIL, var89 = module0032.f1742(var88, var87); module0732.NIL == module0032.f1744(var88, var89); var89 = module0032.f1743(var89)) {
                                                                            var90 = module0032.f1745(var88, var89);
                                                                            if (module0732.NIL != module0032.f1746(var89, var90) && module0732.NIL == module0249.f16059(var90, (SubLObject)module0732.UNPROVIDED)) {
                                                                                module0249.f16055(var90, (SubLObject)module0732.UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var90, module0141.f9195()), var58);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var86.isList()) {
                                                                        var91 = var86;
                                                                        var92 = (SubLObject)module0732.NIL;
                                                                        var92 = var91.first();
                                                                        while (module0732.NIL != var91) {
                                                                            if (module0732.NIL == module0249.f16059(var92, (SubLObject)module0732.UNPROVIDED)) {
                                                                                module0249.f16055(var92, (SubLObject)module0732.UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var92, module0141.f9195()), var58);
                                                                            }
                                                                            var91 = var91.rest();
                                                                            var92 = var91.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)module0732.$ic48$, var86);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1625$.rebind(var50_226, var48);
                                                                }
                                                                var9_235 = var9_235.rest();
                                                                var84 = var9_235.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var52_223, var48);
                                                        module0137.$g1605$.rebind(var50_223, var48);
                                                    }
                                                    var67 = var67.rest();
                                                    var68 = var67.first();
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var50_222, var48);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var63_224, var48);
                                        module0138.$g1619$.rebind(var52_222, var48);
                                        module0141.$g1677$.rebind(var50_221, var48);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.$ic50$, var47, module0244.f15748(module0137.f8955((SubLObject)module0732.UNPROVIDED)), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var63, var48);
                                module0141.$g1674$.rebind(var62, var48);
                                module0141.$g1672$.rebind(var63_223, var48);
                                module0141.$g1671$.rebind(var52_221, var48);
                                module0141.$g1670$.rebind(var50_220, var48);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var52_220, var48);
                            module0141.$g1714$.rebind(var50_219, var48);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var48));
                    }
                    finally {
                        module0139.$g1635$.rebind(var50_218, var48);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var56, var48);
                    module0147.$g2094$.rebind(var55, var48);
                    module0147.$g2095$.rebind(var54, var48);
                }
            }
        }
        return var50;
    }
    
    public static SubLObject f45006(final SubLObject var47, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0584.$g4396$.getDynamicValue();
        }
        SubLObject var48 = module0732.$g5799$.getGlobalValue();
        if (module0732.NIL == var48) {
            var48 = module0034.f1934((SubLObject)module0732.$ic107$, (SubLObject)module0732.$ic110$, (SubLObject)module0732.NIL, (SubLObject)module0732.EQL, (SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.ZERO_INTEGER);
        }
        final SubLObject var49 = module0034.f1782(var47, var4);
        final SubLObject var50 = module0034.f1814(var48, var49, (SubLObject)module0732.UNPROVIDED);
        if (var50 != module0732.$ic18$) {
            SubLObject var51 = var50;
            SubLObject var52 = (SubLObject)module0732.NIL;
            var52 = var51.first();
            while (module0732.NIL != var51) {
                SubLObject var53 = var52.first();
                final SubLObject var54 = conses_high.second(var52);
                if (var47.eql(var53.first())) {
                    var53 = var53.rest();
                    if (module0732.NIL != var53 && module0732.NIL == var53.rest() && var4.eql(var53.first())) {
                        return module0034.f1959(var54);
                    }
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        final SubLObject var55 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45005(var47, var4)));
        module0034.f1836(var48, var49, var50, var55, (SubLObject)ConsesLow.list(var47, var4));
        return module0034.f1959(var55);
    }
    
    public static SubLObject f44988() {
        final SubLObject var33 = module0732.$g5800$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45007(final SubLObject var47) {
        return module0034.f1829(module0732.$g5800$.getGlobalValue(), (SubLObject)ConsesLow.list(var47), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45008(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        if (var47.eql(module0732.$ic112$)) {
            return (SubLObject)module0732.ONE_INTEGER;
        }
        final SubLObject var49 = module0225.f14739(var47);
        SubLObject var50 = (SubLObject)module0732.NIL;
        if (module0732.NIL != module0018.f971() && var49.isInteger() && module0732.NIL == var50) {
            SubLObject var51;
            SubLObject var52;
            SubLObject var53;
            SubLObject var54;
            SubLObject var55;
            SubLObject var56;
            SubLObject var57;
            SubLObject var50_238;
            SubLObject var58;
            SubLObject var50_239;
            SubLObject var52_240;
            SubLObject var59;
            SubLObject var50_240;
            SubLObject var52_241;
            SubLObject var60;
            SubLObject var61;
            SubLObject var62;
            SubLObject var50_241;
            SubLObject var52_242;
            SubLObject var63_245;
            SubLObject var53_246;
            SubLObject var63;
            SubLObject var64;
            SubLObject var50_242;
            SubLObject var65;
            SubLObject var66;
            SubLObject var68;
            SubLObject var67;
            SubLObject var69;
            SubLObject var50_243;
            SubLObject var52_243;
            SubLObject var70;
            SubLObject var71;
            SubLObject var72;
            SubLObject var73;
            SubLObject var74;
            SubLObject var75;
            SubLObject var50_244;
            SubLObject var82_252;
            SubLObject var76;
            SubLObject var77;
            SubLObject var50_245;
            SubLObject var78;
            SubLObject var79;
            SubLObject var80;
            SubLObject var81;
            SubLObject var82;
            SubLObject var83;
            SubLObject var84;
            SubLObject var9_254;
            SubLObject var85;
            SubLObject var86;
            SubLObject var50_246;
            SubLObject var88;
            SubLObject var87;
            SubLObject var89;
            SubLObject var90;
            SubLObject var91;
            SubLObject var92;
            SubLObject var93;
            SubLObject var94;
            for (var51 = module0048.f_1X(var49), var52 = (SubLObject)module0732.NIL, var52 = (SubLObject)module0732.ONE_INTEGER; module0732.NIL == var50 && !var52.numGE(var51); var52 = module0048.f_1X(var52)) {
                var53 = module0147.$g2094$.currentBinding(var48);
                var54 = module0147.$g2095$.currentBinding(var48);
                try {
                    module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var48);
                    module0147.$g2095$.bind(module0732.$ic34$, var48);
                    var55 = (SubLObject)module0732.$ic37$;
                    var56 = module0056.f4145(var55);
                    var57 = (SubLObject)module0732.NIL;
                    var50_238 = module0139.$g1635$.currentBinding(var48);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var48);
                        var58 = (SubLObject)module0732.NIL;
                        var50_239 = module0141.$g1714$.currentBinding(var48);
                        var52_240 = module0141.$g1715$.currentBinding(var48);
                        try {
                            module0141.$g1714$.bind((module0732.NIL != var58) ? var58 : module0141.f9283(), var48);
                            module0141.$g1715$.bind((SubLObject)((module0732.NIL != var58) ? module0732.$ic38$ : module0141.$g1715$.getDynamicValue(var48)), var48);
                            if (module0732.NIL != var58 && module0732.NIL != module0136.f8864() && module0732.NIL == module0141.f9279(var58)) {
                                var59 = module0136.$g1591$.getDynamicValue(var48);
                                if (var59.eql((SubLObject)module0732.$ic39$)) {
                                    module0136.f8870((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                                else if (var59.eql((SubLObject)module0732.$ic42$)) {
                                    module0136.f8871((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                                else if (var59.eql((SubLObject)module0732.$ic44$)) {
                                    Errors.warn((SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0732.$ic45$, module0136.$g1591$.getDynamicValue(var48));
                                    Errors.cerror((SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$);
                                }
                            }
                            var50_240 = module0141.$g1670$.currentBinding(var48);
                            var52_241 = module0141.$g1671$.currentBinding(var48);
                            var60 = module0141.$g1672$.currentBinding(var48);
                            var61 = module0141.$g1674$.currentBinding(var48);
                            var62 = module0137.$g1605$.currentBinding(var48);
                            try {
                                module0141.$g1670$.bind(module0137.f8955(module0732.$ic46$), var48);
                                module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0732.$ic46$)), var48);
                                module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0732.$ic46$)), var48);
                                module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                                module0137.$g1605$.bind(module0137.f8955(module0732.$ic46$), var48);
                                if (module0732.NIL != module0136.f8865() || module0732.NIL != module0244.f15795(var47, module0137.f8955((SubLObject)module0732.UNPROVIDED))) {
                                    var50_241 = module0141.$g1677$.currentBinding(var48);
                                    var52_242 = module0138.$g1619$.currentBinding(var48);
                                    var63_245 = module0141.$g1674$.currentBinding(var48);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9208(), var48);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0732.$ic46$)), var48);
                                        module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                                        module0249.f16055(var47, (SubLObject)module0732.UNPROVIDED);
                                        for (var57 = (SubLObject)ConsesLow.list(var47, module0141.f9195()); module0732.NIL != var57; var57 = module0056.f4150(var56)) {
                                            var53_246 = var57.first();
                                            var63 = conses_high.second(var57);
                                            var64 = var53_246;
                                            var50_242 = module0141.$g1674$.currentBinding(var48);
                                            try {
                                                module0141.$g1674$.bind(var63, var48);
                                                if (module0732.NIL != module0250.f16115(module0141.f9190(), var53_246) && module0732.NIL == var50) {
                                                    var65 = module0226.f14882(var64, var52, (SubLObject)module0732.UNPROVIDED);
                                                    var66 = (SubLObject)module0732.NIL;
                                                    var66 = var65.first();
                                                    while (module0732.NIL == var50 && module0732.NIL != var65) {
                                                        if (module0732.NIL != module0256.f16576(var66, module0732.$ic113$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                            var50 = var52;
                                                        }
                                                        var65 = var65.rest();
                                                        var66 = var65.first();
                                                    }
                                                }
                                                var67 = (var68 = module0200.f12443(module0137.f8955(module0732.$ic46$)));
                                                var69 = (SubLObject)module0732.NIL;
                                                var69 = var68.first();
                                                while (module0732.NIL != var68) {
                                                    var50_243 = module0137.$g1605$.currentBinding(var48);
                                                    var52_243 = module0141.$g1674$.currentBinding(var48);
                                                    try {
                                                        module0137.$g1605$.bind(var69, var48);
                                                        module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var48)) : module0141.$g1674$.getDynamicValue(var48)), var48);
                                                        var70 = module0228.f15229(var53_246);
                                                        if (module0732.NIL != module0138.f8992(var70)) {
                                                            var71 = module0242.f15664(var70, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                            if (module0732.NIL != var71) {
                                                                var72 = module0245.f15834(var71, module0138.f8979(), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                                if (module0732.NIL != var72) {
                                                                    for (var73 = module0066.f4838(module0067.f4891(var72)); module0732.NIL == module0066.f4841(var73); var73 = module0066.f4840(var73)) {
                                                                        var48.resetMultipleValues();
                                                                        var74 = module0066.f4839(var73);
                                                                        var75 = var48.secondMultipleValue();
                                                                        var48.resetMultipleValues();
                                                                        if (module0732.NIL != module0147.f9507(var74)) {
                                                                            var50_244 = module0138.$g1623$.currentBinding(var48);
                                                                            try {
                                                                                module0138.$g1623$.bind(var74, var48);
                                                                                for (var82_252 = module0066.f4838(module0067.f4891(var75)); module0732.NIL == module0066.f4841(var82_252); var82_252 = module0066.f4840(var82_252)) {
                                                                                    var48.resetMultipleValues();
                                                                                    var76 = module0066.f4839(var82_252);
                                                                                    var77 = var48.secondMultipleValue();
                                                                                    var48.resetMultipleValues();
                                                                                    if (module0732.NIL != module0141.f9289(var76)) {
                                                                                        var50_245 = module0138.$g1624$.currentBinding(var48);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var76, var48);
                                                                                            var78 = var77;
                                                                                            if (module0732.NIL != module0077.f5302(var78)) {
                                                                                                var79 = module0077.f5333(var78);
                                                                                                for (var80 = module0032.f1741(var79), var81 = (SubLObject)module0732.NIL, var81 = module0032.f1742(var80, var79); module0732.NIL == module0032.f1744(var80, var81); var81 = module0032.f1743(var81)) {
                                                                                                    var82 = module0032.f1745(var80, var81);
                                                                                                    if (module0732.NIL != module0032.f1746(var81, var82) && module0732.NIL == module0249.f16059(var82, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        module0249.f16055(var82, (SubLObject)module0732.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var82, module0141.f9195()), var56);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var78.isList()) {
                                                                                                var83 = var78;
                                                                                                var84 = (SubLObject)module0732.NIL;
                                                                                                var84 = var83.first();
                                                                                                while (module0732.NIL != var83) {
                                                                                                    if (module0732.NIL == module0249.f16059(var84, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        module0249.f16055(var84, (SubLObject)module0732.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var84, module0141.f9195()), var56);
                                                                                                    }
                                                                                                    var83 = var83.rest();
                                                                                                    var84 = var83.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)module0732.$ic48$, var78);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var50_245, var48);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var82_252);
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var50_244, var48);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var73);
                                                                }
                                                            }
                                                            else {
                                                                module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (module0732.NIL != module0155.f9785(var70, (SubLObject)module0732.UNPROVIDED)) {
                                                            var85 = (var9_254 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED))));
                                                            var86 = (SubLObject)module0732.NIL;
                                                            var86 = var9_254.first();
                                                            while (module0732.NIL != var9_254) {
                                                                var50_246 = module0138.$g1625$.currentBinding(var48);
                                                                try {
                                                                    module0138.$g1625$.bind(var86, var48);
                                                                    var87 = (var88 = Functions.funcall(var86, var70));
                                                                    if (module0732.NIL != module0077.f5302(var88)) {
                                                                        var89 = module0077.f5333(var88);
                                                                        for (var90 = module0032.f1741(var89), var91 = (SubLObject)module0732.NIL, var91 = module0032.f1742(var90, var89); module0732.NIL == module0032.f1744(var90, var91); var91 = module0032.f1743(var91)) {
                                                                            var92 = module0032.f1745(var90, var91);
                                                                            if (module0732.NIL != module0032.f1746(var91, var92) && module0732.NIL == module0249.f16059(var92, (SubLObject)module0732.UNPROVIDED)) {
                                                                                module0249.f16055(var92, (SubLObject)module0732.UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var92, module0141.f9195()), var56);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var88.isList()) {
                                                                        var93 = var88;
                                                                        var94 = (SubLObject)module0732.NIL;
                                                                        var94 = var93.first();
                                                                        while (module0732.NIL != var93) {
                                                                            if (module0732.NIL == module0249.f16059(var94, (SubLObject)module0732.UNPROVIDED)) {
                                                                                module0249.f16055(var94, (SubLObject)module0732.UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var94, module0141.f9195()), var56);
                                                                            }
                                                                            var93 = var93.rest();
                                                                            var94 = var93.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)module0732.$ic48$, var88);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1625$.rebind(var50_246, var48);
                                                                }
                                                                var9_254 = var9_254.rest();
                                                                var86 = var9_254.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var52_243, var48);
                                                        module0137.$g1605$.rebind(var50_243, var48);
                                                    }
                                                    var68 = var68.rest();
                                                    var69 = var68.first();
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var50_242, var48);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var63_245, var48);
                                        module0138.$g1619$.rebind(var52_242, var48);
                                        module0141.$g1677$.rebind(var50_241, var48);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.$ic50$, var47, module0244.f15748(module0137.f8955((SubLObject)module0732.UNPROVIDED)), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var62, var48);
                                module0141.$g1674$.rebind(var61, var48);
                                module0141.$g1672$.rebind(var60, var48);
                                module0141.$g1671$.rebind(var52_241, var48);
                                module0141.$g1670$.rebind(var50_240, var48);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var52_240, var48);
                            module0141.$g1714$.rebind(var50_239, var48);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var48));
                    }
                    finally {
                        module0139.$g1635$.rebind(var50_238, var48);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var54, var48);
                    module0147.$g2094$.rebind(var53, var48);
                }
            }
        }
        return var50;
    }
    
    public static SubLObject f45009(final SubLObject var47) {
        SubLObject var48 = module0732.$g5800$.getGlobalValue();
        if (module0732.NIL == var48) {
            var48 = module0034.f1934((SubLObject)module0732.$ic111$, (SubLObject)module0732.$ic114$, (SubLObject)module0732.NIL, (SubLObject)module0732.EQL, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.ZERO_INTEGER);
        }
        SubLObject var49 = module0034.f1814(var48, var47, (SubLObject)module0732.$ic18$);
        if (var49 == module0732.$ic18$) {
            var49 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45008(var47)));
            module0034.f1816(var48, var47, var49, (SubLObject)module0732.UNPROVIDED);
        }
        return module0034.f1959(var49);
    }
    
    public static SubLObject f44987() {
        final SubLObject var33 = module0732.$g5801$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45010(final SubLObject var47) {
        return module0034.f1829(module0732.$g5801$.getGlobalValue(), (SubLObject)ConsesLow.list(var47), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45011(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = module0225.f14739(var47);
        SubLObject var50 = (SubLObject)module0732.NIL;
        if (module0732.NIL != module0018.f971() && var49.isInteger() && module0732.NIL == var50) {
            SubLObject var51;
            SubLObject var52;
            SubLObject var53;
            SubLObject var54;
            SubLObject var55;
            SubLObject var56;
            SubLObject var57;
            SubLObject var50_257;
            SubLObject var58;
            SubLObject var50_258;
            SubLObject var52_259;
            SubLObject var59;
            SubLObject var50_259;
            SubLObject var52_260;
            SubLObject var60;
            SubLObject var61;
            SubLObject var62;
            SubLObject var50_260;
            SubLObject var52_261;
            SubLObject var63_264;
            SubLObject var53_265;
            SubLObject var63;
            SubLObject var64;
            SubLObject var50_261;
            SubLObject var65;
            SubLObject var66;
            SubLObject var68;
            SubLObject var67;
            SubLObject var69;
            SubLObject var50_262;
            SubLObject var52_262;
            SubLObject var70;
            SubLObject var71;
            SubLObject var72;
            SubLObject var73;
            SubLObject var74;
            SubLObject var75;
            SubLObject var50_263;
            SubLObject var82_270;
            SubLObject var76;
            SubLObject var77;
            SubLObject var50_264;
            SubLObject var78;
            SubLObject var79;
            SubLObject var80;
            SubLObject var81;
            SubLObject var82;
            SubLObject var83;
            SubLObject var84;
            SubLObject var9_272;
            SubLObject var85;
            SubLObject var86;
            SubLObject var50_265;
            SubLObject var88;
            SubLObject var87;
            SubLObject var89;
            SubLObject var90;
            SubLObject var91;
            SubLObject var92;
            SubLObject var93;
            SubLObject var94;
            for (var51 = module0048.f_1X(var49), var52 = (SubLObject)module0732.NIL, var52 = (SubLObject)module0732.ONE_INTEGER; module0732.NIL == var50 && !var52.numGE(var51); var52 = module0048.f_1X(var52)) {
                var53 = module0147.$g2094$.currentBinding(var48);
                var54 = module0147.$g2095$.currentBinding(var48);
                try {
                    module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var48);
                    module0147.$g2095$.bind(module0732.$ic34$, var48);
                    var55 = (SubLObject)module0732.$ic37$;
                    var56 = module0056.f4145(var55);
                    var57 = (SubLObject)module0732.NIL;
                    var50_257 = module0139.$g1635$.currentBinding(var48);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var48);
                        var58 = (SubLObject)module0732.NIL;
                        var50_258 = module0141.$g1714$.currentBinding(var48);
                        var52_259 = module0141.$g1715$.currentBinding(var48);
                        try {
                            module0141.$g1714$.bind((module0732.NIL != var58) ? var58 : module0141.f9283(), var48);
                            module0141.$g1715$.bind((SubLObject)((module0732.NIL != var58) ? module0732.$ic38$ : module0141.$g1715$.getDynamicValue(var48)), var48);
                            if (module0732.NIL != var58 && module0732.NIL != module0136.f8864() && module0732.NIL == module0141.f9279(var58)) {
                                var59 = module0136.$g1591$.getDynamicValue(var48);
                                if (var59.eql((SubLObject)module0732.$ic39$)) {
                                    module0136.f8870((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                                else if (var59.eql((SubLObject)module0732.$ic42$)) {
                                    module0136.f8871((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                                else if (var59.eql((SubLObject)module0732.$ic44$)) {
                                    Errors.warn((SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0732.$ic45$, module0136.$g1591$.getDynamicValue(var48));
                                    Errors.cerror((SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$);
                                }
                            }
                            var50_259 = module0141.$g1670$.currentBinding(var48);
                            var52_260 = module0141.$g1671$.currentBinding(var48);
                            var60 = module0141.$g1672$.currentBinding(var48);
                            var61 = module0141.$g1674$.currentBinding(var48);
                            var62 = module0137.$g1605$.currentBinding(var48);
                            try {
                                module0141.$g1670$.bind(module0137.f8955(module0732.$ic46$), var48);
                                module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0732.$ic46$)), var48);
                                module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0732.$ic46$)), var48);
                                module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                                module0137.$g1605$.bind(module0137.f8955(module0732.$ic46$), var48);
                                if (module0732.NIL != module0136.f8865() || module0732.NIL != module0244.f15795(var47, module0137.f8955((SubLObject)module0732.UNPROVIDED))) {
                                    var50_260 = module0141.$g1677$.currentBinding(var48);
                                    var52_261 = module0138.$g1619$.currentBinding(var48);
                                    var63_264 = module0141.$g1674$.currentBinding(var48);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9208(), var48);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0732.$ic46$)), var48);
                                        module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                                        module0249.f16055(var47, (SubLObject)module0732.UNPROVIDED);
                                        for (var57 = (SubLObject)ConsesLow.list(var47, module0141.f9195()); module0732.NIL != var57; var57 = module0056.f4150(var56)) {
                                            var53_265 = var57.first();
                                            var63 = conses_high.second(var57);
                                            var64 = var53_265;
                                            var50_261 = module0141.$g1674$.currentBinding(var48);
                                            try {
                                                module0141.$g1674$.bind(var63, var48);
                                                if (module0732.NIL != module0250.f16115(module0141.f9190(), var53_265) && module0732.NIL == var50) {
                                                    var65 = module0226.f14882(var64, var52, (SubLObject)module0732.UNPROVIDED);
                                                    var66 = (SubLObject)module0732.NIL;
                                                    var66 = var65.first();
                                                    while (module0732.NIL == var50 && module0732.NIL != var65) {
                                                        if (module0732.NIL != module0256.f16576(var66, module0732.$ic116$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                            var50 = var52;
                                                        }
                                                        var65 = var65.rest();
                                                        var66 = var65.first();
                                                    }
                                                }
                                                var67 = (var68 = module0200.f12443(module0137.f8955(module0732.$ic46$)));
                                                var69 = (SubLObject)module0732.NIL;
                                                var69 = var68.first();
                                                while (module0732.NIL != var68) {
                                                    var50_262 = module0137.$g1605$.currentBinding(var48);
                                                    var52_262 = module0141.$g1674$.currentBinding(var48);
                                                    try {
                                                        module0137.$g1605$.bind(var69, var48);
                                                        module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var48)) : module0141.$g1674$.getDynamicValue(var48)), var48);
                                                        var70 = module0228.f15229(var53_265);
                                                        if (module0732.NIL != module0138.f8992(var70)) {
                                                            var71 = module0242.f15664(var70, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                            if (module0732.NIL != var71) {
                                                                var72 = module0245.f15834(var71, module0138.f8979(), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                                if (module0732.NIL != var72) {
                                                                    for (var73 = module0066.f4838(module0067.f4891(var72)); module0732.NIL == module0066.f4841(var73); var73 = module0066.f4840(var73)) {
                                                                        var48.resetMultipleValues();
                                                                        var74 = module0066.f4839(var73);
                                                                        var75 = var48.secondMultipleValue();
                                                                        var48.resetMultipleValues();
                                                                        if (module0732.NIL != module0147.f9507(var74)) {
                                                                            var50_263 = module0138.$g1623$.currentBinding(var48);
                                                                            try {
                                                                                module0138.$g1623$.bind(var74, var48);
                                                                                for (var82_270 = module0066.f4838(module0067.f4891(var75)); module0732.NIL == module0066.f4841(var82_270); var82_270 = module0066.f4840(var82_270)) {
                                                                                    var48.resetMultipleValues();
                                                                                    var76 = module0066.f4839(var82_270);
                                                                                    var77 = var48.secondMultipleValue();
                                                                                    var48.resetMultipleValues();
                                                                                    if (module0732.NIL != module0141.f9289(var76)) {
                                                                                        var50_264 = module0138.$g1624$.currentBinding(var48);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var76, var48);
                                                                                            var78 = var77;
                                                                                            if (module0732.NIL != module0077.f5302(var78)) {
                                                                                                var79 = module0077.f5333(var78);
                                                                                                for (var80 = module0032.f1741(var79), var81 = (SubLObject)module0732.NIL, var81 = module0032.f1742(var80, var79); module0732.NIL == module0032.f1744(var80, var81); var81 = module0032.f1743(var81)) {
                                                                                                    var82 = module0032.f1745(var80, var81);
                                                                                                    if (module0732.NIL != module0032.f1746(var81, var82) && module0732.NIL == module0249.f16059(var82, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        module0249.f16055(var82, (SubLObject)module0732.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var82, module0141.f9195()), var56);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var78.isList()) {
                                                                                                var83 = var78;
                                                                                                var84 = (SubLObject)module0732.NIL;
                                                                                                var84 = var83.first();
                                                                                                while (module0732.NIL != var83) {
                                                                                                    if (module0732.NIL == module0249.f16059(var84, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        module0249.f16055(var84, (SubLObject)module0732.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var84, module0141.f9195()), var56);
                                                                                                    }
                                                                                                    var83 = var83.rest();
                                                                                                    var84 = var83.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)module0732.$ic48$, var78);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var50_264, var48);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var82_270);
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var50_263, var48);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var73);
                                                                }
                                                            }
                                                            else {
                                                                module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (module0732.NIL != module0155.f9785(var70, (SubLObject)module0732.UNPROVIDED)) {
                                                            var85 = (var9_272 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED))));
                                                            var86 = (SubLObject)module0732.NIL;
                                                            var86 = var9_272.first();
                                                            while (module0732.NIL != var9_272) {
                                                                var50_265 = module0138.$g1625$.currentBinding(var48);
                                                                try {
                                                                    module0138.$g1625$.bind(var86, var48);
                                                                    var87 = (var88 = Functions.funcall(var86, var70));
                                                                    if (module0732.NIL != module0077.f5302(var88)) {
                                                                        var89 = module0077.f5333(var88);
                                                                        for (var90 = module0032.f1741(var89), var91 = (SubLObject)module0732.NIL, var91 = module0032.f1742(var90, var89); module0732.NIL == module0032.f1744(var90, var91); var91 = module0032.f1743(var91)) {
                                                                            var92 = module0032.f1745(var90, var91);
                                                                            if (module0732.NIL != module0032.f1746(var91, var92) && module0732.NIL == module0249.f16059(var92, (SubLObject)module0732.UNPROVIDED)) {
                                                                                module0249.f16055(var92, (SubLObject)module0732.UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var92, module0141.f9195()), var56);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var88.isList()) {
                                                                        var93 = var88;
                                                                        var94 = (SubLObject)module0732.NIL;
                                                                        var94 = var93.first();
                                                                        while (module0732.NIL != var93) {
                                                                            if (module0732.NIL == module0249.f16059(var94, (SubLObject)module0732.UNPROVIDED)) {
                                                                                module0249.f16055(var94, (SubLObject)module0732.UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var94, module0141.f9195()), var56);
                                                                            }
                                                                            var93 = var93.rest();
                                                                            var94 = var93.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)module0732.$ic48$, var88);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1625$.rebind(var50_265, var48);
                                                                }
                                                                var9_272 = var9_272.rest();
                                                                var86 = var9_272.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var52_262, var48);
                                                        module0137.$g1605$.rebind(var50_262, var48);
                                                    }
                                                    var68 = var68.rest();
                                                    var69 = var68.first();
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var50_261, var48);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var63_264, var48);
                                        module0138.$g1619$.rebind(var52_261, var48);
                                        module0141.$g1677$.rebind(var50_260, var48);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.$ic50$, var47, module0244.f15748(module0137.f8955((SubLObject)module0732.UNPROVIDED)), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var62, var48);
                                module0141.$g1674$.rebind(var61, var48);
                                module0141.$g1672$.rebind(var60, var48);
                                module0141.$g1671$.rebind(var52_260, var48);
                                module0141.$g1670$.rebind(var50_259, var48);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var52_259, var48);
                            module0141.$g1714$.rebind(var50_258, var48);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var48));
                    }
                    finally {
                        module0139.$g1635$.rebind(var50_257, var48);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var54, var48);
                    module0147.$g2094$.rebind(var53, var48);
                }
            }
        }
        return var50;
    }
    
    public static SubLObject f45012(final SubLObject var47) {
        SubLObject var48 = module0732.$g5801$.getGlobalValue();
        if (module0732.NIL == var48) {
            var48 = module0034.f1934((SubLObject)module0732.$ic115$, (SubLObject)module0732.$ic117$, (SubLObject)module0732.NIL, (SubLObject)module0732.EQL, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.ZERO_INTEGER);
        }
        SubLObject var49 = module0034.f1814(var48, var47, (SubLObject)module0732.$ic18$);
        if (var49 == module0732.$ic18$) {
            var49 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45011(var47)));
            module0034.f1816(var48, var47, var49, (SubLObject)module0732.UNPROVIDED);
        }
        return module0034.f1959(var49);
    }
    
    public static SubLObject f44989() {
        final SubLObject var33 = module0732.$g5802$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45013(final SubLObject var47) {
        return module0034.f1829(module0732.$g5802$.getGlobalValue(), (SubLObject)ConsesLow.list(var47), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45014(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        if (module0732.NIL != module0018.f971() && module0732.NIL != module0212.f13762(var47)) {
            SubLObject var49 = (SubLObject)module0732.NIL;
            SubLObject var51;
            final SubLObject var50 = var51 = (SubLObject)ConsesLow.list(module0172.f10921((SubLObject)module0732.$ic119$), module0172.f10921((SubLObject)module0732.$ic120$));
            SubLObject var52 = (SubLObject)module0732.NIL;
            var52 = var51.first();
            while (module0732.NIL != var51) {
                final SubLObject var53 = module0147.$g2094$.currentBinding(var48);
                final SubLObject var54 = module0147.$g2095$.currentBinding(var48);
                try {
                    module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var48);
                    module0147.$g2095$.bind(module0732.$ic34$, var48);
                    final SubLObject var55 = (SubLObject)module0732.$ic37$;
                    final SubLObject var56 = module0056.f4145(var55);
                    SubLObject var57 = (SubLObject)module0732.NIL;
                    final SubLObject var50_277 = module0139.$g1635$.currentBinding(var48);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var48);
                        final SubLObject var58 = (SubLObject)module0732.NIL;
                        final SubLObject var50_278 = module0141.$g1714$.currentBinding(var48);
                        final SubLObject var52_279 = module0141.$g1715$.currentBinding(var48);
                        try {
                            module0141.$g1714$.bind((module0732.NIL != var58) ? var58 : module0141.f9283(), var48);
                            module0141.$g1715$.bind((SubLObject)((module0732.NIL != var58) ? module0732.$ic38$ : module0141.$g1715$.getDynamicValue(var48)), var48);
                            if (module0732.NIL != var58 && module0732.NIL != module0136.f8864() && module0732.NIL == module0141.f9279(var58)) {
                                final SubLObject var59 = module0136.$g1591$.getDynamicValue(var48);
                                if (var59.eql((SubLObject)module0732.$ic39$)) {
                                    module0136.f8870((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                                else if (var59.eql((SubLObject)module0732.$ic42$)) {
                                    module0136.f8871((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                                else if (var59.eql((SubLObject)module0732.$ic44$)) {
                                    Errors.warn((SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0732.$ic45$, module0136.$g1591$.getDynamicValue(var48));
                                    Errors.cerror((SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var58, (SubLObject)module0732.$ic41$);
                                }
                            }
                            final SubLObject var50_279 = module0141.$g1670$.currentBinding(var48);
                            final SubLObject var52_280 = module0141.$g1671$.currentBinding(var48);
                            final SubLObject var60 = module0141.$g1672$.currentBinding(var48);
                            final SubLObject var61 = module0141.$g1674$.currentBinding(var48);
                            final SubLObject var62 = module0137.$g1605$.currentBinding(var48);
                            try {
                                module0141.$g1670$.bind(module0137.f8955(module0732.$ic46$), var48);
                                module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0732.$ic46$)), var48);
                                module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0732.$ic46$)), var48);
                                module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                                module0137.$g1605$.bind(module0137.f8955(module0732.$ic46$), var48);
                                if (module0732.NIL != module0136.f8865() || module0732.NIL != module0244.f15795(var47, module0137.f8955((SubLObject)module0732.UNPROVIDED))) {
                                    final SubLObject var50_280 = module0141.$g1677$.currentBinding(var48);
                                    final SubLObject var52_281 = module0138.$g1619$.currentBinding(var48);
                                    final SubLObject var63_284 = module0141.$g1674$.currentBinding(var48);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9208(), var48);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0732.$ic46$)), var48);
                                        module0141.$g1674$.bind((SubLObject)module0732.NIL, var48);
                                        module0249.f16055(var47, (SubLObject)module0732.UNPROVIDED);
                                        for (var57 = (SubLObject)ConsesLow.list(var47, module0141.f9195()); module0732.NIL != var57; var57 = module0056.f4150(var56)) {
                                            final SubLObject var53_285 = var57.first();
                                            final SubLObject var63 = conses_high.second(var57);
                                            final SubLObject var64 = var53_285;
                                            final SubLObject var50_281 = module0141.$g1674$.currentBinding(var48);
                                            try {
                                                module0141.$g1674$.bind(var63, var48);
                                                if (module0732.NIL != module0250.f16115(module0141.f9190(), var53_285)) {
                                                    SubLObject var9_287 = Sequences.remove_duplicates(module0220.f14598(var64, module0732.$ic122$, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic123$, (SubLObject)module0732.UNPROVIDED), Symbols.symbol_function((SubLObject)module0732.EQUAL), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                    SubLObject var65 = (SubLObject)module0732.NIL;
                                                    var65 = var9_287.first();
                                                    while (module0732.NIL != var9_287) {
                                                        SubLObject var67;
                                                        final SubLObject var66 = var67 = var65;
                                                        SubLObject var68 = (SubLObject)module0732.NIL;
                                                        SubLObject var69 = (SubLObject)module0732.NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)module0732.$ic121$);
                                                        var68 = var67.first();
                                                        var67 = var67.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)module0732.$ic121$);
                                                        var69 = var67.first();
                                                        var67 = var67.rest();
                                                        if (module0732.NIL == var67) {
                                                            if (module0732.NIL != module0256.f16576(var69, var52, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                final SubLObject var70 = var68;
                                                                if (module0732.NIL == conses_high.member(var70, var49, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                                    var49 = (SubLObject)ConsesLow.cons(var70, var49);
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(var66, (SubLObject)module0732.$ic121$);
                                                        }
                                                        var9_287 = var9_287.rest();
                                                        var65 = var9_287.first();
                                                    }
                                                }
                                                SubLObject var9_288;
                                                final SubLObject var71 = var9_288 = module0200.f12443(module0137.f8955(module0732.$ic46$));
                                                SubLObject var72 = (SubLObject)module0732.NIL;
                                                var72 = var9_288.first();
                                                while (module0732.NIL != var9_288) {
                                                    final SubLObject var50_282 = module0137.$g1605$.currentBinding(var48);
                                                    final SubLObject var52_282 = module0141.$g1674$.currentBinding(var48);
                                                    try {
                                                        module0137.$g1605$.bind(var72, var48);
                                                        module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var48)) : module0141.$g1674$.getDynamicValue(var48)), var48);
                                                        final SubLObject var73 = module0228.f15229(var53_285);
                                                        if (module0732.NIL != module0138.f8992(var73)) {
                                                            final SubLObject var74 = module0242.f15664(var73, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                            if (module0732.NIL != var74) {
                                                                final SubLObject var75 = module0245.f15834(var74, module0138.f8979(), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                                if (module0732.NIL != var75) {
                                                                    SubLObject var76;
                                                                    for (var76 = module0066.f4838(module0067.f4891(var75)); module0732.NIL == module0066.f4841(var76); var76 = module0066.f4840(var76)) {
                                                                        var48.resetMultipleValues();
                                                                        final SubLObject var77 = module0066.f4839(var76);
                                                                        final SubLObject var78 = var48.secondMultipleValue();
                                                                        var48.resetMultipleValues();
                                                                        if (module0732.NIL != module0147.f9507(var77)) {
                                                                            final SubLObject var50_283 = module0138.$g1623$.currentBinding(var48);
                                                                            try {
                                                                                module0138.$g1623$.bind(var77, var48);
                                                                                SubLObject var82_297;
                                                                                for (var82_297 = module0066.f4838(module0067.f4891(var78)); module0732.NIL == module0066.f4841(var82_297); var82_297 = module0066.f4840(var82_297)) {
                                                                                    var48.resetMultipleValues();
                                                                                    final SubLObject var79 = module0066.f4839(var82_297);
                                                                                    final SubLObject var80 = var48.secondMultipleValue();
                                                                                    var48.resetMultipleValues();
                                                                                    if (module0732.NIL != module0141.f9289(var79)) {
                                                                                        final SubLObject var50_284 = module0138.$g1624$.currentBinding(var48);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var79, var48);
                                                                                            final SubLObject var81 = var80;
                                                                                            if (module0732.NIL != module0077.f5302(var81)) {
                                                                                                final SubLObject var82 = module0077.f5333(var81);
                                                                                                SubLObject var83;
                                                                                                SubLObject var84;
                                                                                                SubLObject var85;
                                                                                                for (var83 = module0032.f1741(var82), var84 = (SubLObject)module0732.NIL, var84 = module0032.f1742(var83, var82); module0732.NIL == module0032.f1744(var83, var84); var84 = module0032.f1743(var84)) {
                                                                                                    var85 = module0032.f1745(var83, var84);
                                                                                                    if (module0732.NIL != module0032.f1746(var84, var85) && module0732.NIL == module0249.f16059(var85, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        module0249.f16055(var85, (SubLObject)module0732.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var85, module0141.f9195()), var56);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var81.isList()) {
                                                                                                SubLObject var86 = var81;
                                                                                                SubLObject var87 = (SubLObject)module0732.NIL;
                                                                                                var87 = var86.first();
                                                                                                while (module0732.NIL != var86) {
                                                                                                    if (module0732.NIL == module0249.f16059(var87, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        module0249.f16055(var87, (SubLObject)module0732.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var87, module0141.f9195()), var56);
                                                                                                    }
                                                                                                    var86 = var86.rest();
                                                                                                    var87 = var86.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)module0732.$ic48$, var81);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var50_284, var48);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var82_297);
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var50_283, var48);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var76);
                                                                }
                                                            }
                                                            else {
                                                                module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (module0732.NIL != module0155.f9785(var73, (SubLObject)module0732.UNPROVIDED)) {
                                                            SubLObject var9_289;
                                                            final SubLObject var88 = var9_289 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var48), module0137.f8955((SubLObject)module0732.UNPROVIDED)));
                                                            SubLObject var89 = (SubLObject)module0732.NIL;
                                                            var89 = var9_289.first();
                                                            while (module0732.NIL != var9_289) {
                                                                final SubLObject var50_285 = module0138.$g1625$.currentBinding(var48);
                                                                try {
                                                                    module0138.$g1625$.bind(var89, var48);
                                                                    final SubLObject var91;
                                                                    final SubLObject var90 = var91 = Functions.funcall(var89, var73);
                                                                    if (module0732.NIL != module0077.f5302(var91)) {
                                                                        final SubLObject var92 = module0077.f5333(var91);
                                                                        SubLObject var93;
                                                                        SubLObject var94;
                                                                        SubLObject var95;
                                                                        for (var93 = module0032.f1741(var92), var94 = (SubLObject)module0732.NIL, var94 = module0032.f1742(var93, var92); module0732.NIL == module0032.f1744(var93, var94); var94 = module0032.f1743(var94)) {
                                                                            var95 = module0032.f1745(var93, var94);
                                                                            if (module0732.NIL != module0032.f1746(var94, var95) && module0732.NIL == module0249.f16059(var95, (SubLObject)module0732.UNPROVIDED)) {
                                                                                module0249.f16055(var95, (SubLObject)module0732.UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var95, module0141.f9195()), var56);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var91.isList()) {
                                                                        SubLObject var96 = var91;
                                                                        SubLObject var97 = (SubLObject)module0732.NIL;
                                                                        var97 = var96.first();
                                                                        while (module0732.NIL != var96) {
                                                                            if (module0732.NIL == module0249.f16059(var97, (SubLObject)module0732.UNPROVIDED)) {
                                                                                module0249.f16055(var97, (SubLObject)module0732.UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var97, module0141.f9195()), var56);
                                                                            }
                                                                            var96 = var96.rest();
                                                                            var97 = var96.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)module0732.$ic48$, var91);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1625$.rebind(var50_285, var48);
                                                                }
                                                                var9_289 = var9_289.rest();
                                                                var89 = var9_289.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var52_282, var48);
                                                        module0137.$g1605$.rebind(var50_282, var48);
                                                    }
                                                    var9_288 = var9_288.rest();
                                                    var72 = var9_288.first();
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var50_281, var48);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var63_284, var48);
                                        module0138.$g1619$.rebind(var52_281, var48);
                                        module0141.$g1677$.rebind(var50_280, var48);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.$ic50$, var47, module0244.f15748(module0137.f8955((SubLObject)module0732.UNPROVIDED)), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var62, var48);
                                module0141.$g1674$.rebind(var61, var48);
                                module0141.$g1672$.rebind(var60, var48);
                                module0141.$g1671$.rebind(var52_280, var48);
                                module0141.$g1670$.rebind(var50_279, var48);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var52_279, var48);
                            module0141.$g1714$.rebind(var50_278, var48);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var48));
                    }
                    finally {
                        module0139.$g1635$.rebind(var50_277, var48);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var54, var48);
                    module0147.$g2094$.rebind(var53, var48);
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
            return Sort.sort(var49, Symbols.symbol_function((SubLObject)module0732.$ic124$), (SubLObject)module0732.UNPROVIDED);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45015(final SubLObject var47) {
        SubLObject var48 = module0732.$g5802$.getGlobalValue();
        if (module0732.NIL == var48) {
            var48 = module0034.f1934((SubLObject)module0732.$ic118$, (SubLObject)module0732.$ic125$, (SubLObject)module0732.NIL, (SubLObject)module0732.EQL, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic57$);
        }
        SubLObject var49 = module0034.f1814(var48, var47, (SubLObject)module0732.$ic18$);
        if (var49 == module0732.$ic18$) {
            var49 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45014(var47)));
            module0034.f1816(var48, var47, var49, (SubLObject)module0732.UNPROVIDED);
        }
        return module0034.f1959(var49);
    }
    
    public static SubLObject f45016(final SubLObject var22, final SubLObject var301) {
        final SubLObject var302 = module0208.f13535(module0205.f13134(var22, var301, (SubLObject)module0732.UNPROVIDED));
        if (module0732.NIL != module0202.f12674(var302)) {
            return module0202.f12751(var302);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45017(final SubLObject var22) {
        final SubLObject var23 = module0205.f13136(var22);
        final SubLObject var24 = f45009(var23);
        final SubLObject var25 = f45015(var23);
        final SubLObject var26 = (SubLObject)((module0732.NIL != var24) ? Sequences.find(var24, var25, (SubLObject)module0732.$ic126$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) : module0732.NIL);
        final SubLObject var27 = (SubLObject)((module0732.NIL != var24) ? Sequences.find(var24, var25, (SubLObject)module0732.$ic124$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) : module0732.NIL);
        return Values.values(var26, var27);
    }
    
    public static SubLObject f45018(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        var23.resetMultipleValues();
        final SubLObject var24 = f45017(var22);
        final SubLObject var25 = var23.secondMultipleValue();
        var23.resetMultipleValues();
        if (module0732.NIL != var24) {
            return f45016(var22, var24);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45019(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        var23.resetMultipleValues();
        final SubLObject var24 = f45017(var22);
        final SubLObject var25 = var23.secondMultipleValue();
        var23.resetMultipleValues();
        if (module0732.NIL != var25) {
            return f45016(var22, var25);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45020(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)module0732.NIL;
        SubLObject var25 = (SubLObject)module0732.NIL;
        var23.resetMultipleValues();
        final SubLObject var26 = f45017(var22);
        final SubLObject var27 = var23.secondMultipleValue();
        var23.resetMultipleValues();
        if (module0732.NIL != var26) {
            var24 = f45016(var22, var26);
        }
        if (module0732.NIL != var27) {
            var25 = f45016(var22, var27);
        }
        return Values.values(var24, var25);
    }
    
    public static SubLObject f45021(final SubLObject var22) {
        assert module0732.NIL != f45022(var22) : var22;
        return f45023(var22, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45022(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL != module0202.f12590(var1) && f44992(module0205.f13132(var1)).isInteger());
    }
    
    public static SubLObject f45023(final SubLObject var22, SubLObject var309) {
        if (var309 == module0732.UNPROVIDED) {
            var309 = (SubLObject)module0732.NIL;
        }
        final SubLThread var310 = SubLProcess.currentSubLThread();
        assert module0732.NIL != module0202.f12590(var22) : var22;
        final SubLObject var311 = module0205.f13180(var22, (SubLObject)module0732.UNPROVIDED);
        final SubLObject var312 = ConsesLow.nth((SubLObject)module0732.ZERO_INTEGER, var311);
        SubLObject var313 = (SubLObject)module0732.NIL;
        SubLObject var314 = (SubLObject)module0732.NIL;
        SubLObject var315 = (SubLObject)module0732.NIL;
        SubLObject var316 = (SubLObject)module0732.NIL;
        SubLObject var317 = (SubLObject)module0732.NIL;
        final SubLObject var318 = f44992(var312);
        final SubLObject var319 = f44998(var312);
        final SubLObject var320 = f45009(var312);
        if (var320.isInteger()) {
            if (var318.isInteger()) {
                var313 = ConsesLow.nth(var318, var311);
            }
            var317 = ((module0732.NIL != var319) ? ConsesLow.nth(var319, var311) : module0731.f44877(var312, (SubLObject)module0732.UNPROVIDED));
            var314 = ConsesLow.nth(var320, var311);
            var310.resetMultipleValues();
            final SubLObject var312_313 = f45020(var22);
            final SubLObject var314_315 = var310.secondMultipleValue();
            var310.resetMultipleValues();
            var315 = var312_313;
            var316 = var314_315;
        }
        if (var309.eql((SubLObject)module0732.$ic129$)) {
            return var317;
        }
        if (var309.eql((SubLObject)module0732.$ic11$)) {
            return var313;
        }
        if (var309.eql((SubLObject)module0732.$ic130$)) {
            return var312;
        }
        if (var309.eql((SubLObject)module0732.$ic131$)) {
            return var314;
        }
        return Values.values(var315, var314, var316, var317, var313, var312);
    }
    
    public static SubLObject f45024(final SubLObject var22, final SubLObject var3, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = (SubLObject)module0732.NIL;
        }
        return module0731.f44713(f45023(var22, (SubLObject)module0732.$ic129$), var3, var4);
    }
    
    public static SubLObject f45025(final SubLObject var22, final SubLObject var15, final SubLObject var316, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = (SubLObject)module0732.NIL;
        }
        final SubLThread var317 = SubLProcess.currentSubLThread();
        SubLObject var318 = (SubLObject)module0732.NIL;
        var317.resetMultipleValues();
        final SubLObject var319 = f45023(var22, (SubLObject)module0732.UNPROVIDED);
        final SubLObject var320 = var317.secondMultipleValue();
        final SubLObject var321 = var317.thirdMultipleValue();
        final SubLObject var322 = var317.fourthMultipleValue();
        final SubLObject var323 = var317.fifthMultipleValue();
        final SubLObject var324 = var317.sixthMultipleValue();
        var317.resetMultipleValues();
        if (module0732.NIL != module0004.f104(var15, module0730.f44561(var320, (SubLObject)ConsesLow.list(module0732.$ic54$), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED), (SubLObject)module0732.$ic132$, (SubLObject)module0732.UNPROVIDED)) {
            var318 = module0731.f44713(var322, var316, var4);
        }
        return var318;
    }
    
    public static SubLObject f45026(final SubLObject var307, final SubLObject var322, final SubLObject var308) {
        if (module0732.NIL == var307 && module0732.NIL == var308) {
            return var322;
        }
        if (module0732.NIL == var307) {
            return Sequences.cconcatenate(var322, new SubLObject[] { module0732.$ic133$, module0038.f2761(var308, (SubLObject)Characters.CHAR_space) });
        }
        if (module0732.NIL == var308) {
            return Sequences.cconcatenate(module0038.f2761(var307, (SubLObject)Characters.CHAR_space), new SubLObject[] { module0732.$ic133$, var322 });
        }
        return Sequences.cconcatenate(module0038.f2761(var307, (SubLObject)module0732.UNPROVIDED), new SubLObject[] { module0732.$ic133$, var322, module0732.$ic133$, module0038.f2761(var308, (SubLObject)module0732.UNPROVIDED) });
    }
    
    public static SubLObject f45027(final SubLObject var47) {
        return module0035.f2305(f45028(), var47, Symbols.symbol_function((SubLObject)module0732.EQL), var47);
    }
    
    public static SubLObject f44949(final SubLObject var47) {
        return module0035.f2294(f45028(), var47, Symbols.symbol_function((SubLObject)module0732.EQL), var47);
    }
    
    public static SubLObject f45028() {
        return module0732.$g5803$.getGlobalValue();
    }
    
    public static SubLObject f45029(final SubLObject var3) {
        if (var3.eql(module0732.$ic135$)) {
            return module0732.$ic136$;
        }
        if (var3.eql(module0732.$ic24$)) {
            return module0732.$ic137$;
        }
        if (var3.eql(module0732.$ic23$)) {
            return module0732.$ic21$;
        }
        return var3;
    }
    
    public static SubLObject f45030(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic138$, var4);
    }
    
    public static SubLObject f45031(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic138$, var15, var4);
    }
    
    public static SubLObject f45032(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic53$, var4);
    }
    
    public static SubLObject f45033(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic53$, var15, var4);
    }
    
    public static SubLObject f45034(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic139$, var4);
    }
    
    public static SubLObject f45035(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic139$, var15, var4);
    }
    
    public static SubLObject f45036(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic140$, var4);
    }
    
    public static SubLObject f45037(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic140$, var15, var4);
    }
    
    public static SubLObject f45038(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic141$, var4);
    }
    
    public static SubLObject f45039(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic141$, var15, var4);
    }
    
    public static SubLObject f45040(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic142$, var4);
    }
    
    public static SubLObject f45041(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic142$, var15, var4);
    }
    
    public static SubLObject f45042(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic143$, var4);
    }
    
    public static SubLObject f45043(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic143$, var15, var4);
    }
    
    public static SubLObject f45044(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic144$, var4);
    }
    
    public static SubLObject f45045(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic144$, var15, var4);
    }
    
    public static SubLObject f45046(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic145$, var4);
    }
    
    public static SubLObject f45047(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic145$, var15, var4);
    }
    
    public static SubLObject f45048(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic146$, var4);
    }
    
    public static SubLObject f45049(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic146$, var15, var4);
    }
    
    public static SubLObject f45050(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, constants_high_oc.f10737((SubLObject)module0732.$ic147$), var4);
    }
    
    public static SubLObject f45051(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, constants_high_oc.f10737((SubLObject)module0732.$ic148$), var15, var4);
    }
    
    public static SubLObject f45052(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic29$, var4);
    }
    
    public static SubLObject f45053(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic29$, var15, var4);
    }
    
    public static SubLObject f45054(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, constants_high_oc.f10737((SubLObject)module0732.$ic149$), var4);
    }
    
    public static SubLObject f45055(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, constants_high_oc.f10737((SubLObject)module0732.$ic149$), var15, var4);
    }
    
    public static SubLObject f45056(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic150$, var4);
    }
    
    public static SubLObject f45057(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic150$, var15, var4);
    }
    
    public static SubLObject f45058(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic151$, var4);
    }
    
    public static SubLObject f45059(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic151$, var15, var4);
    }
    
    public static SubLObject f45060(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic152$, var4);
    }
    
    public static SubLObject f45061(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic152$, var15, var4);
    }
    
    public static SubLObject f45062(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic153$, var4);
    }
    
    public static SubLObject f45063(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic153$, var15, var4);
    }
    
    public static SubLObject f45064(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic154$, var4);
    }
    
    public static SubLObject f45065(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic154$, var15, var4);
    }
    
    public static SubLObject f45066(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic155$, var4);
    }
    
    public static SubLObject f45067(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic155$, var15, var4);
    }
    
    public static SubLObject f45068(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic156$, var4);
    }
    
    public static SubLObject f45069(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic156$, var15, var4);
    }
    
    public static SubLObject f45070(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic157$, var4);
    }
    
    public static SubLObject f45071(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic157$, var15, var4);
    }
    
    public static SubLObject f45072(final SubLObject var2, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        return f44916(var2, module0732.$ic158$, var4);
    }
    
    public static SubLObject f45073(final SubLObject var2, final SubLObject var15, final SubLObject var4) {
        return f44917(var2, module0732.$ic158$, var15, var4);
    }
    
    public static SubLObject f45074(final SubLObject var323, final SubLObject var324, SubLObject var325, SubLObject var326, SubLObject var327, SubLObject var328) {
        if (var325 == module0732.UNPROVIDED) {
            var325 = (SubLObject)module0732.$ic159$;
        }
        if (var326 == module0732.UNPROVIDED) {
            var326 = (SubLObject)module0732.$ic160$;
        }
        if (var327 == module0732.UNPROVIDED) {
            var327 = Symbols.symbol_function((SubLObject)module0732.IDENTITY);
        }
        if (var328 == module0732.UNPROVIDED) {
            var328 = (SubLObject)module0732.ZERO_INTEGER;
        }
        assert module0732.NIL != Types.listp(var323) : var323;
        assert module0732.NIL != Types.functionp(var327) : var327;
        SubLObject var329 = (SubLObject)module0732.ZERO_INTEGER;
        SubLObject var330 = (SubLObject)module0732.NIL;
        SubLObject var331 = var326;
        if (var331.eql((SubLObject)module0732.$ic160$)) {
            SubLObject var332 = (SubLObject)module0732.NIL;
            SubLObject var333 = (SubLObject)module0732.NIL;
            SubLObject var334 = (SubLObject)module0732.NIL;
            var332 = var328;
            var333 = var323;
            var334 = module0087.f5983(var324, var333).first();
            while (module0732.NIL != var333) {
                if (module0732.NIL == var334) {
                    var334 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var333.first()), (SubLObject)module0732.NIL);
                }
                var329 = Sequences.length(var334.first());
                var330 = (SubLObject)ConsesLow.cons(module0782.f50324(var332, Numbers.add(var332, var329), Functions.funcall(var327, (SubLObject)ConsesLow.cons(module0038.f2761(Sequences.subseq(var333, (SubLObject)module0732.ZERO_INTEGER, var329), (SubLObject)module0732.UNPROVIDED), var334.rest()))), var330);
                var332 = Numbers.add(var332, var329);
                var333 = conses_high.nthcdr(var329, var333);
                var334 = module0087.f5983(var324, var333).first();
            }
        }
        else if (var331.eql((SubLObject)module0732.$ic163$)) {
            SubLObject var332 = (SubLObject)module0732.NIL;
            SubLObject var333 = (SubLObject)module0732.NIL;
            SubLObject var335 = (SubLObject)module0732.NIL;
            var332 = var328;
            var333 = var323;
            var335 = module0087.f5983(var324, var333);
            while (module0732.NIL != var333) {
                var329 = (SubLObject)module0732.ZERO_INTEGER;
                SubLObject var336 = var335;
                SubLObject var337 = (SubLObject)module0732.NIL;
                var337 = var336.first();
                while (module0732.NIL != var336) {
                    var329 = Sequences.length(var337.first());
                    var330 = (SubLObject)ConsesLow.cons(module0782.f50324(var332, Numbers.add(var332, var329), Functions.funcall(var327, (SubLObject)ConsesLow.cons(module0038.f2761(var337.first(), (SubLObject)module0732.UNPROVIDED), var337.rest()))), var330);
                    var336 = var336.rest();
                    var337 = var336.first();
                }
                if (!var329.numE((SubLObject)module0732.ONE_INTEGER)) {
                    var330 = (SubLObject)ConsesLow.cons(module0782.f50324(var332, Numbers.add(var332, (SubLObject)module0732.ONE_INTEGER), Functions.funcall(var327, (SubLObject)ConsesLow.cons(var333.first(), (SubLObject)module0732.NIL))), var330);
                }
                var332 = Numbers.add(var332, (SubLObject)module0732.ONE_INTEGER);
                var333 = module0087.f5978(var333, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.UNPROVIDED);
                var335 = module0087.f5983(var324, var333);
            }
        }
        else {
            Errors.error((SubLObject)module0732.$ic164$, var326);
        }
        var331 = var325;
        if (var331.eql((SubLObject)module0732.$ic165$)) {
            return Sequences.reverse(var330);
        }
        if (var331.eql((SubLObject)module0732.$ic159$)) {
            return f45075(Sequences.reverse(var330), Vectors.make_vector(Numbers.add(module0782.f50327(var330.first()), (SubLObject)module0732.ONE_INTEGER), (SubLObject)module0732.UNPROVIDED));
        }
        Errors.error((SubLObject)module0732.$ic166$, var325);
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45075(final SubLObject var330, final SubLObject var335) {
        final SubLThread var336 = SubLProcess.currentSubLThread();
        if (module0732.NIL != conses_high.endp(var330)) {
            return (SubLObject)module0732.$ic167$;
        }
        if (module0732.NIL != module0035.f1997(var330)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0782.f50329(var330.first())));
        }
        SubLObject var337 = (SubLObject)module0732.NIL;
        SubLObject var338 = (SubLObject)module0732.NIL;
        final SubLObject var339 = Numbers.add(module0782.f50326(var330.first()), (SubLObject)module0732.ONE_INTEGER);
        SubLObject var340 = (SubLObject)module0732.NIL;
        var336.resetMultipleValues();
        final SubLObject var341 = f45076(var330, var339);
        final SubLObject var342 = var336.secondMultipleValue();
        var336.resetMultipleValues();
        SubLObject var343 = var341;
        SubLObject var344 = (SubLObject)module0732.NIL;
        var344 = var343.first();
        while (module0732.NIL != var343) {
            var338 = module0782.f50327(var344);
            var337 = Vectors.aref(var335, var338);
            if (module0732.NIL == var337) {
                var336.resetMultipleValues();
                final SubLObject var345 = f45076(var342, var338);
                final SubLObject var346 = var336.secondMultipleValue();
                var336.resetMultipleValues();
                var337 = f45075(var346, var335);
                Vectors.set_aref(var335, var338, var337);
            }
            SubLObject var9_345 = var337;
            SubLObject var347 = (SubLObject)module0732.NIL;
            var347 = var9_345.first();
            while (module0732.NIL != var9_345) {
                var340 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(module0782.f50329(var344), var347), var340);
                var9_345 = var9_345.rest();
                var347 = var9_345.first();
            }
            var343 = var343.rest();
            var344 = var343.first();
        }
        return var340;
    }
    
    public static SubLObject f45076(final SubLObject var330, final SubLObject var331) {
        SubLObject var332 = (SubLObject)module0732.NIL;
        SubLObject var333 = var330;
        for (SubLObject var334 = var330.first(); var334.isVector() && module0782.f50326(var334).numL(var331); var334 = var333.first()) {
            var332 = (SubLObject)ConsesLow.cons(var334, var332);
            var333 = var333.rest();
        }
        return Values.values(Sequences.reverse(var332), var333);
    }
    
    public static SubLObject f45077() {
        return Sequences.length(module0259.f16850(module0732.$ic168$));
    }
    
    public static SubLObject f45078() {
        SubLObject var317 = (SubLObject)module0732.ZERO_INTEGER;
        final SubLObject var318 = Sequences.remove_if(Symbols.symbol_function((SubLObject)module0732.$ic169$), module0584.$g4426$.getGlobalValue(), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        SubLObject var319 = (SubLObject)ConsesLow.cons(module0732.$ic112$, var318);
        SubLObject var320 = (SubLObject)module0732.NIL;
        var320 = var319.first();
        while (module0732.NIL != var319) {
            final SubLObject var321 = module0217.f14247(var320, (SubLObject)module0732.UNPROVIDED);
            var317 = Numbers.add(var317, var321);
            var319 = var319.rest();
            var320 = var319.first();
        }
        return var317;
    }
    
    public static SubLObject f45079() {
        return module0217.f14247(module0732.$ic14$, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45080(final SubLObject var18) {
        return module0217.f14247(var18, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45081(SubLObject var351) {
        if (var351 == module0732.UNPROVIDED) {
            var351 = (SubLObject)module0732.NIL;
        }
        PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic170$, new SubLObject[] { module0011.f351(), module0018.f971(), module0574.f35163() });
        final SubLObject var352 = Sequences.cconcatenate((SubLObject)module0732.$ic171$, new SubLObject[] { module0038.f2638(module0018.f971()), module0574.f35163().isPositive() ? Sequences.cconcatenate((SubLObject)module0732.$ic172$, module0038.f2638(module0574.f35163())) : module0732.$ic12$, module0732.$ic173$, module0038.f2638(module0051.f3557((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)), module0732.$ic174$ });
        SubLObject var353 = (SubLObject)module0732.NIL;
        try {
            var353 = compatibility.open_text(var352, (SubLObject)module0732.$ic175$);
            if (!var353.isStream()) {
                Errors.error((SubLObject)module0732.$ic176$, var352);
            }
            final SubLObject var354_355 = var353;
            PrintLow.format(var354_355, (SubLObject)module0732.$ic170$, new SubLObject[] { module0011.f351(), module0018.f971(), module0574.f35163() });
            PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic177$, f45077());
            PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic178$, f45078());
            PrintLow.format(var354_355, (SubLObject)module0732.$ic177$, f45077());
            PrintLow.format(var354_355, (SubLObject)module0732.$ic178$, f45078());
            final SubLObject var354 = f45082(var354_355, var351, (SubLObject)module0732.UNPROVIDED);
            PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic179$, var354);
            PrintLow.format(var354_355, (SubLObject)module0732.$ic180$, var354);
        }
        finally {
            final SubLObject var355 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0732.T);
                if (var353.isStream()) {
                    streams_high.close(var353, (SubLObject)module0732.UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var355);
            }
        }
        PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic181$, var352);
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45082(final SubLObject var354, final SubLObject var351, SubLObject var357) {
        if (var357 == module0732.UNPROVIDED) {
            var357 = module0732.$ic182$;
        }
        final SubLObject var358 = f45083(var357, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        final SubLObject var359 = (SubLObject)module0732.ZERO_INTEGER;
        final SubLObject var360 = (SubLObject)module0732.NIL;
        return f45084(var354, var351, var358, var359, var360);
    }
    
    public static SubLObject f45084(final SubLObject var354, final SubLObject var351, final SubLObject var358, SubLObject var356, SubLObject var359) {
        final SubLThread var360 = SubLProcess.currentSubLThread();
        SubLObject var361 = (SubLObject)module0732.NIL;
        SubLObject var362 = (SubLObject)module0732.NIL;
        SubLObject var363 = (SubLObject)module0732.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var358, var358, (SubLObject)module0732.$ic183$);
        var361 = var358.first();
        SubLObject var364 = var358.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var364, var358, (SubLObject)module0732.$ic183$);
        var362 = var364.first();
        var364 = var364.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var364, var358, (SubLObject)module0732.$ic183$);
        var363 = var364.first();
        var364 = var364.rest();
        if (module0732.NIL == var364) {
            if (module0732.NIL != var362) {
                PrintLow.format(var354, (SubLObject)module0732.$ic184$, var361);
                if (module0732.NIL != var351) {
                    PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic184$, var361);
                }
                SubLObject var365 = (SubLObject)module0732.ZERO_INTEGER;
                SubLObject var366 = var362;
                SubLObject var367 = (SubLObject)module0732.NIL;
                var367 = var366.first();
                while (module0732.NIL != var366) {
                    if (module0732.NIL == module0004.f104(var367, var359, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                        var359 = (SubLObject)ConsesLow.cons(var367, var359);
                        final SubLObject var368 = (SubLObject)module0732.$ic185$;
                        final SubLObject var369 = module0597.f36628(var367);
                        final SubLObject var370 = f45080(var367);
                        if (var370.isPositive()) {
                            PrintLow.format(var354, (SubLObject)module0732.$ic186$, var369);
                            SubLObject var371;
                            SubLObject var372;
                            for (var371 = Numbers.max((SubLObject)module0732.ZERO_INTEGER, Numbers.subtract(var368, Sequences.length(var369))), var372 = (SubLObject)module0732.NIL, var372 = (SubLObject)module0732.ZERO_INTEGER; var372.numL(var371); var372 = Numbers.add(var372, (SubLObject)module0732.ONE_INTEGER)) {
                                print_high.princ((SubLObject)module0732.$ic133$, var354);
                            }
                            PrintLow.format(var354, (SubLObject)module0732.$ic187$, var370);
                            if (module0732.NIL != var351) {
                                PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic186$, var369);
                                for (var371 = Numbers.max((SubLObject)module0732.ZERO_INTEGER, Numbers.subtract(var368, Sequences.length(var369))), var372 = (SubLObject)module0732.NIL, var372 = (SubLObject)module0732.ZERO_INTEGER; var372.numL(var371); var372 = Numbers.add(var372, (SubLObject)module0732.ONE_INTEGER)) {
                                    print_high.princ((SubLObject)module0732.$ic133$, (SubLObject)module0732.T);
                                }
                                PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic187$, var370);
                            }
                            var365 = Numbers.add(var365, var370);
                        }
                    }
                    var366 = var366.rest();
                    var367 = var366.first();
                }
                if (var365.isPositive()) {
                    PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic188$, var361, var365);
                    PrintLow.format(var354, (SubLObject)module0732.$ic188$, var361, var365);
                    var356 = Numbers.add(var356, var365);
                }
            }
            SubLObject var373 = var363;
            SubLObject var374 = (SubLObject)module0732.NIL;
            var374 = var373.first();
            while (module0732.NIL != var373) {
                var360.resetMultipleValues();
                final SubLObject var371_372 = f45084(var354, var351, var374, var356, var359);
                final SubLObject var373_374 = var360.secondMultipleValue();
                var360.resetMultipleValues();
                var356 = var371_372;
                var359 = var373_374;
                var373 = var373.rest();
                var374 = var373.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var358, (SubLObject)module0732.$ic183$);
        }
        return Values.values(var356, var359);
    }
    
    public static SubLObject f45083(SubLObject var357, SubLObject var375, SubLObject var376) {
        if (var357 == module0732.UNPROVIDED) {
            var357 = module0732.$ic182$;
        }
        if (var375 == module0732.UNPROVIDED) {
            var375 = (SubLObject)module0732.NIL;
        }
        if (var376 == module0732.UNPROVIDED) {
            var376 = (SubLObject)module0732.NIL;
        }
        final SubLThread var377 = SubLProcess.currentSubLThread();
        SubLObject var378 = (SubLObject)module0732.NIL;
        if (module0732.NIL == module0004.f104(var357, module0732.$g5804$.getGlobalValue(), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == conses_high.member(var357, var375, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
            var375 = (SubLObject)ConsesLow.cons(var357, var375);
            final SubLObject var379 = module0147.$g2094$.currentBinding(var377);
            final SubLObject var380 = module0147.$g2095$.currentBinding(var377);
            try {
                module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var377);
                module0147.$g2095$.bind(module0732.$ic34$, var377);
                SubLObject var381 = (SubLObject)module0732.NIL;
                SubLObject var382 = module0220.f14562(var357, module0732.$ic190$, (SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.UNPROVIDED);
                SubLObject var383 = (SubLObject)module0732.NIL;
                var383 = var382.first();
                while (module0732.NIL != var382) {
                    if (module0732.NIL == module0035.f2428(var383, var375, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == module0035.f2428(var383, var376, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == module0035.f2428(var383, var381, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                        final SubLObject var384 = f45083(var383, var375, (SubLObject)ConsesLow.cons(var381, var376));
                        final SubLObject var385 = conses_high.second(var384);
                        if (module0732.NIL != module0035.f1993(var385, (SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.UNPROVIDED)) {
                            SubLObject var9_381 = conses_high.third(var384);
                            SubLObject var386 = (SubLObject)module0732.NIL;
                            var386 = var9_381.first();
                            while (module0732.NIL != var9_381) {
                                var381 = (SubLObject)ConsesLow.cons(var386, var381);
                                var9_381 = var9_381.rest();
                                var386 = var9_381.first();
                            }
                        }
                        else {
                            var381 = (SubLObject)ConsesLow.cons(var384, var381);
                        }
                        var375 = (SubLObject)ConsesLow.cons(var383, var375);
                    }
                    var382 = var382.rest();
                    var383 = var382.first();
                }
                var378 = (SubLObject)ConsesLow.cons(var381, var378);
                SubLObject var387 = (SubLObject)module0732.NIL;
                final SubLObject var388 = var357;
                final SubLObject var50_384 = module0137.$g1605$.currentBinding(var377);
                final SubLObject var52_385 = module0139.$g1636$.currentBinding(var377);
                try {
                    module0137.$g1605$.bind(module0137.f8955(module0732.$ic191$), var377);
                    module0139.$g1636$.bind(module0139.f9007(), var377);
                    SubLObject var386_387 = var388;
                    final SubLObject var389 = (SubLObject)module0732.$ic36$;
                    final SubLObject var390 = module0056.f4145(var389);
                    final SubLObject var50_385 = module0139.$g1635$.currentBinding(var377);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var377);
                        final SubLObject var391 = (SubLObject)module0732.NIL;
                        final SubLObject var50_386 = module0141.$g1714$.currentBinding(var377);
                        final SubLObject var52_386 = module0141.$g1715$.currentBinding(var377);
                        try {
                            module0141.$g1714$.bind((module0732.NIL != var391) ? var391 : module0141.f9283(), var377);
                            module0141.$g1715$.bind((SubLObject)((module0732.NIL != var391) ? module0732.$ic38$ : module0141.$g1715$.getDynamicValue(var377)), var377);
                            if (module0732.NIL != var391 && module0732.NIL != module0136.f8864() && module0732.NIL == module0141.f9279(var391)) {
                                final SubLObject var392 = module0136.$g1591$.getDynamicValue(var377);
                                if (var392.eql((SubLObject)module0732.$ic39$)) {
                                    module0136.f8870((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic40$, var391, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                                else if (var392.eql((SubLObject)module0732.$ic42$)) {
                                    module0136.f8871((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var391, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                                else if (var392.eql((SubLObject)module0732.$ic44$)) {
                                    Errors.warn((SubLObject)module0732.$ic40$, var391, (SubLObject)module0732.$ic41$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0732.$ic45$, module0136.$g1591$.getDynamicValue(var377));
                                    Errors.cerror((SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var391, (SubLObject)module0732.$ic41$);
                                }
                            }
                            final SubLObject var50_387 = module0141.$g1670$.currentBinding(var377);
                            final SubLObject var52_387 = module0141.$g1671$.currentBinding(var377);
                            final SubLObject var393 = module0141.$g1672$.currentBinding(var377);
                            final SubLObject var394 = module0141.$g1674$.currentBinding(var377);
                            final SubLObject var395 = module0137.$g1605$.currentBinding(var377);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0732.$ic191$)), var377);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0732.$ic191$))), var377);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0732.$ic191$))), var377);
                                module0141.$g1674$.bind((SubLObject)module0732.NIL, var377);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0732.$ic191$)), var377);
                                if (module0732.NIL != module0136.f8865() || module0732.NIL != module0244.f15795(var388, module0137.f8955((SubLObject)module0732.UNPROVIDED))) {
                                    final SubLObject var50_388 = module0141.$g1677$.currentBinding(var377);
                                    final SubLObject var52_388 = module0138.$g1619$.currentBinding(var377);
                                    final SubLObject var63_397 = module0141.$g1674$.currentBinding(var377);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var377);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0732.$ic191$))), var377);
                                        module0141.$g1674$.bind((SubLObject)module0732.NIL, var377);
                                        module0249.f16055(var386_387, (SubLObject)module0732.UNPROVIDED);
                                        while (module0732.NIL != var386_387) {
                                            final SubLObject var396 = var386_387;
                                            SubLObject var398;
                                            final SubLObject var397 = var398 = module0200.f12443(module0137.f8955(module0732.$ic191$));
                                            SubLObject var399 = (SubLObject)module0732.NIL;
                                            var399 = var398.first();
                                            while (module0732.NIL != var398) {
                                                final SubLObject var50_389 = module0137.$g1605$.currentBinding(var377);
                                                final SubLObject var52_389 = module0141.$g1674$.currentBinding(var377);
                                                try {
                                                    module0137.$g1605$.bind(var399, var377);
                                                    module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var377)) : module0141.$g1674$.getDynamicValue(var377)), var377);
                                                    final SubLObject var400 = module0228.f15229(var396);
                                                    if (module0732.NIL != module0138.f8992(var400)) {
                                                        final SubLObject var401 = module0242.f15664(var400, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                        if (module0732.NIL != var401) {
                                                            final SubLObject var402 = module0245.f15834(var401, module0244.f15780(module0137.f8955(module0732.$ic191$)), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                            if (module0732.NIL != var402) {
                                                                SubLObject var403;
                                                                for (var403 = module0066.f4838(module0067.f4891(var402)); module0732.NIL == module0066.f4841(var403); var403 = module0066.f4840(var403)) {
                                                                    var377.resetMultipleValues();
                                                                    final SubLObject var404 = module0066.f4839(var403);
                                                                    final SubLObject var405 = var377.secondMultipleValue();
                                                                    var377.resetMultipleValues();
                                                                    if (module0732.NIL != module0147.f9507(var404)) {
                                                                        final SubLObject var50_390 = module0138.$g1623$.currentBinding(var377);
                                                                        try {
                                                                            module0138.$g1623$.bind(var404, var377);
                                                                            SubLObject var82_403;
                                                                            for (var82_403 = module0066.f4838(module0067.f4891(var405)); module0732.NIL == module0066.f4841(var82_403); var82_403 = module0066.f4840(var82_403)) {
                                                                                var377.resetMultipleValues();
                                                                                final SubLObject var406 = module0066.f4839(var82_403);
                                                                                final SubLObject var407 = var377.secondMultipleValue();
                                                                                var377.resetMultipleValues();
                                                                                if (module0732.NIL != module0141.f9289(var406)) {
                                                                                    final SubLObject var50_391 = module0138.$g1624$.currentBinding(var377);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var406, var377);
                                                                                        final SubLObject var408 = var407;
                                                                                        if (module0732.NIL != module0077.f5302(var408)) {
                                                                                            final SubLObject var409 = module0077.f5333(var408);
                                                                                            SubLObject var410;
                                                                                            SubLObject var411;
                                                                                            SubLObject var412;
                                                                                            for (var410 = module0032.f1741(var409), var411 = (SubLObject)module0732.NIL, var411 = module0032.f1742(var410, var409); module0732.NIL == module0032.f1744(var410, var411); var411 = module0032.f1743(var411)) {
                                                                                                var412 = module0032.f1745(var410, var411);
                                                                                                if (module0732.NIL != module0032.f1746(var411, var412) && module0732.NIL == module0249.f16059(var412, module0139.$g1636$.getDynamicValue(var377))) {
                                                                                                    module0249.f16055(var412, module0139.$g1636$.getDynamicValue(var377));
                                                                                                    if (module0732.NIL != module0173.f10955(var412) && !module0217.f14247(var412, (SubLObject)module0732.UNPROVIDED).isZero() && module0732.NIL == module0035.f2428(var412, var378, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == module0035.f2428(var412, var376, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        var387 = (SubLObject)ConsesLow.cons(var412, var387);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var408.isList()) {
                                                                                            SubLObject var413 = var408;
                                                                                            SubLObject var414 = (SubLObject)module0732.NIL;
                                                                                            var414 = var413.first();
                                                                                            while (module0732.NIL != var413) {
                                                                                                if (module0732.NIL == module0249.f16059(var414, module0139.$g1636$.getDynamicValue(var377))) {
                                                                                                    module0249.f16055(var414, module0139.$g1636$.getDynamicValue(var377));
                                                                                                    if (module0732.NIL != module0173.f10955(var414) && !module0217.f14247(var414, (SubLObject)module0732.UNPROVIDED).isZero() && module0732.NIL == module0035.f2428(var414, var378, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == module0035.f2428(var414, var376, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        var387 = (SubLObject)ConsesLow.cons(var414, var387);
                                                                                                    }
                                                                                                }
                                                                                                var413 = var413.rest();
                                                                                                var414 = var413.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0732.$ic48$, var408);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var50_391, var377);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var82_403);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var50_390, var377);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var403);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                        }
                                                        if (module0732.NIL != module0200.f12419(var400, module0137.f8955((SubLObject)module0732.UNPROVIDED))) {
                                                            SubLObject var415 = module0248.f15995(var400);
                                                            SubLObject var416 = (SubLObject)module0732.NIL;
                                                            var416 = var415.first();
                                                            while (module0732.NIL != var415) {
                                                                SubLObject var418;
                                                                final SubLObject var417 = var418 = var416;
                                                                SubLObject var419 = (SubLObject)module0732.NIL;
                                                                SubLObject var420 = (SubLObject)module0732.NIL;
                                                                SubLObject var421 = (SubLObject)module0732.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var418, var417, (SubLObject)module0732.$ic193$);
                                                                var419 = var418.first();
                                                                var418 = var418.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var418, var417, (SubLObject)module0732.$ic193$);
                                                                var420 = var418.first();
                                                                var418 = var418.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var418, var417, (SubLObject)module0732.$ic193$);
                                                                var421 = var418.first();
                                                                var418 = var418.rest();
                                                                if (module0732.NIL == var418) {
                                                                    if (module0732.NIL != module0147.f9507(var420)) {
                                                                        final SubLObject var50_392 = module0138.$g1623$.currentBinding(var377);
                                                                        try {
                                                                            module0138.$g1623$.bind(var420, var377);
                                                                            if (module0732.NIL != module0141.f9289(var421)) {
                                                                                final SubLObject var50_393 = module0138.$g1624$.currentBinding(var377);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var421, var377);
                                                                                    final SubLObject var408;
                                                                                    final SubLObject var422 = var408 = (SubLObject)ConsesLow.list(var419);
                                                                                    if (module0732.NIL != module0077.f5302(var408)) {
                                                                                        final SubLObject var409 = module0077.f5333(var408);
                                                                                        SubLObject var410;
                                                                                        SubLObject var411;
                                                                                        SubLObject var412;
                                                                                        for (var410 = module0032.f1741(var409), var411 = (SubLObject)module0732.NIL, var411 = module0032.f1742(var410, var409); module0732.NIL == module0032.f1744(var410, var411); var411 = module0032.f1743(var411)) {
                                                                                            var412 = module0032.f1745(var410, var411);
                                                                                            if (module0732.NIL != module0032.f1746(var411, var412) && module0732.NIL == module0249.f16059(var412, module0139.$g1636$.getDynamicValue(var377))) {
                                                                                                module0249.f16055(var412, module0139.$g1636$.getDynamicValue(var377));
                                                                                                if (module0732.NIL != module0173.f10955(var412) && !module0217.f14247(var412, (SubLObject)module0732.UNPROVIDED).isZero() && module0732.NIL == module0035.f2428(var412, var378, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == module0035.f2428(var412, var376, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                    var387 = (SubLObject)ConsesLow.cons(var412, var387);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var408.isList()) {
                                                                                        SubLObject var95_414 = var408;
                                                                                        SubLObject var414 = (SubLObject)module0732.NIL;
                                                                                        var414 = var95_414.first();
                                                                                        while (module0732.NIL != var95_414) {
                                                                                            if (module0732.NIL == module0249.f16059(var414, module0139.$g1636$.getDynamicValue(var377))) {
                                                                                                module0249.f16055(var414, module0139.$g1636$.getDynamicValue(var377));
                                                                                                if (module0732.NIL != module0173.f10955(var414) && !module0217.f14247(var414, (SubLObject)module0732.UNPROVIDED).isZero() && module0732.NIL == module0035.f2428(var414, var378, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == module0035.f2428(var414, var376, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                    var387 = (SubLObject)ConsesLow.cons(var414, var387);
                                                                                                }
                                                                                            }
                                                                                            var95_414 = var95_414.rest();
                                                                                            var414 = var95_414.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0732.$ic48$, var408);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var50_393, var377);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var50_392, var377);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var417, (SubLObject)module0732.$ic193$);
                                                                }
                                                                var415 = var415.rest();
                                                                var416 = var415.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0732.NIL != module0155.f9785(var400, (SubLObject)module0732.UNPROVIDED)) {
                                                        SubLObject var9_382;
                                                        final SubLObject var423 = var9_382 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0732.$ic191$)), module0141.$g1714$.getDynamicValue(var377), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0732.$ic191$)), module0141.$g1714$.getDynamicValue(var377), module0137.f8955((SubLObject)module0732.UNPROVIDED)));
                                                        SubLObject var424 = (SubLObject)module0732.NIL;
                                                        var424 = var9_382.first();
                                                        while (module0732.NIL != var9_382) {
                                                            final SubLObject var50_394 = module0138.$g1625$.currentBinding(var377);
                                                            try {
                                                                module0138.$g1625$.bind(var424, var377);
                                                                final SubLObject var426;
                                                                final SubLObject var425 = var426 = Functions.funcall(var424, var400);
                                                                if (module0732.NIL != module0077.f5302(var426)) {
                                                                    final SubLObject var427 = module0077.f5333(var426);
                                                                    SubLObject var428;
                                                                    SubLObject var429;
                                                                    SubLObject var430;
                                                                    for (var428 = module0032.f1741(var427), var429 = (SubLObject)module0732.NIL, var429 = module0032.f1742(var428, var427); module0732.NIL == module0032.f1744(var428, var429); var429 = module0032.f1743(var429)) {
                                                                        var430 = module0032.f1745(var428, var429);
                                                                        if (module0732.NIL != module0032.f1746(var429, var430) && module0732.NIL == module0249.f16059(var430, module0139.$g1636$.getDynamicValue(var377))) {
                                                                            module0249.f16055(var430, module0139.$g1636$.getDynamicValue(var377));
                                                                            if (module0732.NIL != module0173.f10955(var430) && !module0217.f14247(var430, (SubLObject)module0732.UNPROVIDED).isZero() && module0732.NIL == module0035.f2428(var430, var378, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == module0035.f2428(var430, var376, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                var387 = (SubLObject)ConsesLow.cons(var430, var387);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var426.isList()) {
                                                                    SubLObject var431 = var426;
                                                                    SubLObject var432 = (SubLObject)module0732.NIL;
                                                                    var432 = var431.first();
                                                                    while (module0732.NIL != var431) {
                                                                        if (module0732.NIL == module0249.f16059(var432, module0139.$g1636$.getDynamicValue(var377))) {
                                                                            module0249.f16055(var432, module0139.$g1636$.getDynamicValue(var377));
                                                                            if (module0732.NIL != module0173.f10955(var432) && !module0217.f14247(var432, (SubLObject)module0732.UNPROVIDED).isZero() && module0732.NIL == module0035.f2428(var432, var378, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == module0035.f2428(var432, var376, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                var387 = (SubLObject)ConsesLow.cons(var432, var387);
                                                                            }
                                                                        }
                                                                        var431 = var431.rest();
                                                                        var432 = var431.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0732.$ic48$, var426);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var50_394, var377);
                                                            }
                                                            var9_382 = var9_382.rest();
                                                            var424 = var9_382.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var52_389, var377);
                                                    module0137.$g1605$.rebind(var50_389, var377);
                                                }
                                                var398 = var398.rest();
                                                var399 = var398.first();
                                            }
                                            SubLObject var434;
                                            final SubLObject var433 = var434 = module0200.f12443(module0244.f15771(module0137.f8955(module0732.$ic191$)));
                                            SubLObject var435 = (SubLObject)module0732.NIL;
                                            var435 = var434.first();
                                            while (module0732.NIL != var434) {
                                                final SubLObject var50_395 = module0137.$g1605$.currentBinding(var377);
                                                final SubLObject var52_390 = module0141.$g1674$.currentBinding(var377);
                                                try {
                                                    module0137.$g1605$.bind(var435, var377);
                                                    module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var377)) : module0141.$g1674$.getDynamicValue(var377)), var377);
                                                    final SubLObject var436 = module0228.f15229(var386_387);
                                                    if (module0732.NIL != module0138.f8992(var436)) {
                                                        final SubLObject var437 = module0242.f15664(var436, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                        if (module0732.NIL != var437) {
                                                            final SubLObject var438 = module0245.f15834(var437, module0138.f8979(), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                            if (module0732.NIL != var438) {
                                                                SubLObject var439;
                                                                for (var439 = module0066.f4838(module0067.f4891(var438)); module0732.NIL == module0066.f4841(var439); var439 = module0066.f4840(var439)) {
                                                                    var377.resetMultipleValues();
                                                                    final SubLObject var440 = module0066.f4839(var439);
                                                                    final SubLObject var441 = var377.secondMultipleValue();
                                                                    var377.resetMultipleValues();
                                                                    if (module0732.NIL != module0147.f9507(var440)) {
                                                                        final SubLObject var50_396 = module0138.$g1623$.currentBinding(var377);
                                                                        try {
                                                                            module0138.$g1623$.bind(var440, var377);
                                                                            SubLObject var82_404;
                                                                            for (var82_404 = module0066.f4838(module0067.f4891(var441)); module0732.NIL == module0066.f4841(var82_404); var82_404 = module0066.f4840(var82_404)) {
                                                                                var377.resetMultipleValues();
                                                                                final SubLObject var442 = module0066.f4839(var82_404);
                                                                                final SubLObject var443 = var377.secondMultipleValue();
                                                                                var377.resetMultipleValues();
                                                                                if (module0732.NIL != module0141.f9289(var442)) {
                                                                                    final SubLObject var50_397 = module0138.$g1624$.currentBinding(var377);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var442, var377);
                                                                                        final SubLObject var444 = var443;
                                                                                        if (module0732.NIL != module0077.f5302(var444)) {
                                                                                            final SubLObject var445 = module0077.f5333(var444);
                                                                                            SubLObject var446;
                                                                                            SubLObject var447;
                                                                                            SubLObject var448;
                                                                                            for (var446 = module0032.f1741(var445), var447 = (SubLObject)module0732.NIL, var447 = module0032.f1742(var446, var445); module0732.NIL == module0032.f1744(var446, var447); var447 = module0032.f1743(var447)) {
                                                                                                var448 = module0032.f1745(var446, var447);
                                                                                                if (module0732.NIL != module0032.f1746(var447, var448) && module0732.NIL == module0249.f16059(var448, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                    module0249.f16055(var448, (SubLObject)module0732.UNPROVIDED);
                                                                                                    module0056.f4149(var448, var390);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var444.isList()) {
                                                                                            SubLObject var449 = var444;
                                                                                            SubLObject var450 = (SubLObject)module0732.NIL;
                                                                                            var450 = var449.first();
                                                                                            while (module0732.NIL != var449) {
                                                                                                if (module0732.NIL == module0249.f16059(var450, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                    module0249.f16055(var450, (SubLObject)module0732.UNPROVIDED);
                                                                                                    module0056.f4149(var450, var390);
                                                                                                }
                                                                                                var449 = var449.rest();
                                                                                                var450 = var449.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0732.$ic48$, var444);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var50_397, var377);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var82_404);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var50_396, var377);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var439);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0732.NIL != module0155.f9785(var436, (SubLObject)module0732.UNPROVIDED)) {
                                                        SubLObject var9_383;
                                                        final SubLObject var451 = var9_383 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var377), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var377), module0137.f8955((SubLObject)module0732.UNPROVIDED)));
                                                        SubLObject var452 = (SubLObject)module0732.NIL;
                                                        var452 = var9_383.first();
                                                        while (module0732.NIL != var9_383) {
                                                            final SubLObject var50_398 = module0138.$g1625$.currentBinding(var377);
                                                            try {
                                                                module0138.$g1625$.bind(var452, var377);
                                                                final SubLObject var454;
                                                                final SubLObject var453 = var454 = Functions.funcall(var452, var436);
                                                                if (module0732.NIL != module0077.f5302(var454)) {
                                                                    final SubLObject var455 = module0077.f5333(var454);
                                                                    SubLObject var456;
                                                                    SubLObject var457;
                                                                    SubLObject var458;
                                                                    for (var456 = module0032.f1741(var455), var457 = (SubLObject)module0732.NIL, var457 = module0032.f1742(var456, var455); module0732.NIL == module0032.f1744(var456, var457); var457 = module0032.f1743(var457)) {
                                                                        var458 = module0032.f1745(var456, var457);
                                                                        if (module0732.NIL != module0032.f1746(var457, var458) && module0732.NIL == module0249.f16059(var458, (SubLObject)module0732.UNPROVIDED)) {
                                                                            module0249.f16055(var458, (SubLObject)module0732.UNPROVIDED);
                                                                            module0056.f4149(var458, var390);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var454.isList()) {
                                                                    SubLObject var459 = var454;
                                                                    SubLObject var460 = (SubLObject)module0732.NIL;
                                                                    var460 = var459.first();
                                                                    while (module0732.NIL != var459) {
                                                                        if (module0732.NIL == module0249.f16059(var460, (SubLObject)module0732.UNPROVIDED)) {
                                                                            module0249.f16055(var460, (SubLObject)module0732.UNPROVIDED);
                                                                            module0056.f4149(var460, var390);
                                                                        }
                                                                        var459 = var459.rest();
                                                                        var460 = var459.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0732.$ic48$, var454);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var50_398, var377);
                                                            }
                                                            var9_383 = var9_383.rest();
                                                            var452 = var9_383.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var52_390, var377);
                                                    module0137.$g1605$.rebind(var50_395, var377);
                                                }
                                                var434 = var434.rest();
                                                var435 = var434.first();
                                            }
                                            var386_387 = module0056.f4150(var390);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var63_397, var377);
                                        module0138.$g1619$.rebind(var52_388, var377);
                                        module0141.$g1677$.rebind(var50_388, var377);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.$ic50$, var388, module0244.f15748(module0137.f8955((SubLObject)module0732.UNPROVIDED)), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var395, var377);
                                module0141.$g1674$.rebind(var394, var377);
                                module0141.$g1672$.rebind(var393, var377);
                                module0141.$g1671$.rebind(var52_387, var377);
                                module0141.$g1670$.rebind(var50_387, var377);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var52_386, var377);
                            module0141.$g1714$.rebind(var50_386, var377);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var377));
                    }
                    finally {
                        module0139.$g1635$.rebind(var50_385, var377);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var377));
                }
                finally {
                    module0139.$g1636$.rebind(var52_385, var377);
                    module0137.$g1605$.rebind(var50_384, var377);
                }
                var387 = Sort.sort(var387, Symbols.symbol_function((SubLObject)module0732.$ic126$), (SubLObject)module0732.$ic194$);
                var378 = (SubLObject)ConsesLow.cons(var387, var378);
            }
            finally {
                module0147.$g2095$.rebind(var380, var377);
                module0147.$g2094$.rebind(var379, var377);
            }
            if (module0732.NIL != var378) {
                var378 = (SubLObject)ConsesLow.cons(var357, var378);
            }
        }
        return var378;
    }
    
    public static SubLObject f45085() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var45 = module0259.f16848(module0732.$ic195$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        SubLObject var46 = (SubLObject)module0732.ZERO_INTEGER;
        SubLObject var47 = (SubLObject)module0732.NIL;
        SubLObject var48 = (SubLObject)module0732.NIL;
        final SubLObject var49 = (SubLObject)module0732.$ic196$;
        final SubLObject var50 = module0173.f10962();
        SubLObject var51 = (SubLObject)module0732.ZERO_INTEGER;
        final SubLObject var52 = module0012.$g75$.currentBinding(var44);
        final SubLObject var53 = module0012.$g76$.currentBinding(var44);
        final SubLObject var54 = module0012.$g77$.currentBinding(var44);
        final SubLObject var55 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)module0732.ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)module0732.NIL, var44);
            module0012.$g77$.bind((SubLObject)module0732.T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var49);
            SubLObject var56 = module0173.f10961();
            SubLObject var57 = (SubLObject)module0732.NIL;
            var57 = var56.first();
            while (module0732.NIL != var56) {
                final SubLObject var58 = var57;
                if (module0732.NIL == module0065.f4772(var58, (SubLObject)module0732.$ic197$)) {
                    final SubLObject var434_435 = var58;
                    if (module0732.NIL == module0065.f4775(var434_435, (SubLObject)module0732.$ic197$)) {
                        final SubLObject var59 = module0065.f4740(var434_435);
                        final SubLObject var60 = (SubLObject)module0732.NIL;
                        SubLObject var61;
                        SubLObject var62;
                        SubLObject var63;
                        SubLObject var64;
                        SubLObject var65;
                        SubLObject var66;
                        SubLObject var9_443;
                        SubLObject var67;
                        for (var61 = Sequences.length(var59), var62 = (SubLObject)module0732.NIL, var62 = (SubLObject)module0732.ZERO_INTEGER; var62.numL(var61); var62 = Numbers.add(var62, (SubLObject)module0732.ONE_INTEGER)) {
                            var63 = ((module0732.NIL != var60) ? Numbers.subtract(var61, var62, (SubLObject)module0732.ONE_INTEGER) : var62);
                            var64 = Vectors.aref(var59, var63);
                            if (module0732.NIL == module0065.f4749(var64) || module0732.NIL == module0065.f4773((SubLObject)module0732.$ic197$)) {
                                if (module0732.NIL != module0065.f4749(var64)) {
                                    var64 = (SubLObject)module0732.$ic197$;
                                }
                                var51 = Numbers.add(var51, (SubLObject)module0732.ONE_INTEGER);
                                module0012.note_percent_progress(var51, var50);
                                var65 = f45086(var64);
                                var66 = (SubLObject)module0732.NIL;
                                if (module0732.NIL != var65) {
                                    var9_443 = var65;
                                    var67 = (SubLObject)module0732.NIL;
                                    var67 = var9_443.first();
                                    while (module0732.NIL != var9_443) {
                                        if (module0732.NIL == module0004.f104(module0178.f11303(var67).first(), var45, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                            var66 = (SubLObject)module0732.T;
                                        }
                                        var9_443 = var9_443.rest();
                                        var67 = var9_443.first();
                                    }
                                    if (module0732.NIL != var66) {
                                        var46 = Numbers.add(var46, (SubLObject)module0732.ONE_INTEGER);
                                    }
                                    else {
                                        var48 = (SubLObject)ConsesLow.cons(var64, var48);
                                        PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic198$, var64, Sequences.length(var48));
                                        PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic199$, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0732.$ic200$), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0732.$ic201$), var65)));
                                    }
                                }
                                else {
                                    var47 = (SubLObject)ConsesLow.cons(var64, var47);
                                }
                            }
                        }
                    }
                    final SubLObject var445_446 = var58;
                    if (module0732.NIL == module0065.f4777(var445_446) || module0732.NIL == module0065.f4773((SubLObject)module0732.$ic197$)) {
                        final SubLObject var68 = module0065.f4738(var445_446);
                        SubLObject var69 = module0065.f4739(var445_446);
                        final SubLObject var70 = module0065.f4734(var445_446);
                        final SubLObject var71 = (SubLObject)((module0732.NIL != module0065.f4773((SubLObject)module0732.$ic197$)) ? module0732.NIL : module0732.$ic197$);
                        while (var69.numL(var70)) {
                            final SubLObject var72 = Hashtables.gethash_without_values(var69, var68, var71);
                            if (module0732.NIL == module0065.f4773((SubLObject)module0732.$ic197$) || module0732.NIL == module0065.f4749(var72)) {
                                var51 = Numbers.add(var51, (SubLObject)module0732.ONE_INTEGER);
                                module0012.note_percent_progress(var51, var50);
                                final SubLObject var73 = f45086(var72);
                                SubLObject var74 = (SubLObject)module0732.NIL;
                                if (module0732.NIL != var73) {
                                    SubLObject var9_444 = var73;
                                    SubLObject var75 = (SubLObject)module0732.NIL;
                                    var75 = var9_444.first();
                                    while (module0732.NIL != var9_444) {
                                        if (module0732.NIL == module0004.f104(module0178.f11303(var75).first(), var45, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                            var74 = (SubLObject)module0732.T;
                                        }
                                        var9_444 = var9_444.rest();
                                        var75 = var9_444.first();
                                    }
                                    if (module0732.NIL != var74) {
                                        var46 = Numbers.add(var46, (SubLObject)module0732.ONE_INTEGER);
                                    }
                                    else {
                                        var48 = (SubLObject)ConsesLow.cons(var72, var48);
                                        PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic198$, var72, Sequences.length(var48));
                                        PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic199$, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0732.$ic200$), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0732.$ic201$), var73)));
                                    }
                                }
                                else {
                                    var47 = (SubLObject)ConsesLow.cons(var72, var47);
                                }
                            }
                            var69 = Numbers.add(var69, (SubLObject)module0732.ONE_INTEGER);
                        }
                    }
                }
                var56 = var56.rest();
                var57 = var56.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var55, var44);
            module0012.$g77$.rebind(var54, var44);
            module0012.$g76$.rebind(var53, var44);
            module0012.$g75$.rebind(var52, var44);
        }
        PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic202$, var46);
        PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic203$, Sequences.length(var48));
        PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic204$, Sequences.length(var47));
        return var46;
    }
    
    public static SubLObject f45087(final SubLObject var248, SubLObject var451) {
        if (var451 == module0732.UNPROVIDED) {
            var451 = (SubLObject)module0732.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == f45088(var248, var451, (SubLObject)module0732.ONE_INTEGER));
    }
    
    public static SubLObject f45089(final SubLObject var248) {
        final SubLThread var249 = SubLProcess.currentSubLThread();
        SubLObject var250 = (SubLObject)module0732.NIL;
        final SubLObject var251 = module0147.$g2094$.currentBinding(var249);
        final SubLObject var252 = module0147.$g2095$.currentBinding(var249);
        try {
            module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var249);
            module0147.$g2095$.bind(module0732.$ic34$, var249);
            SubLObject var253 = module0259.f16848(module0732.$ic205$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
            SubLObject var254 = (SubLObject)module0732.NIL;
            var254 = var253.first();
            while (module0732.NIL != var253) {
                SubLObject var9_454 = module0219.f14509(var248, (SubLObject)module0732.TWO_INTEGER, var254, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                SubLObject var255 = (SubLObject)module0732.NIL;
                var255 = var9_454.first();
                while (module0732.NIL != var9_454) {
                    var250 = (SubLObject)ConsesLow.cons(var255, var250);
                    var9_454 = var9_454.rest();
                    var255 = var9_454.first();
                }
                var253 = var253.rest();
                var254 = var253.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var252, var249);
            module0147.$g2094$.rebind(var251, var249);
        }
        return var250;
    }
    
    public static SubLObject f45086(final SubLObject var248) {
        return f45088(var248, (SubLObject)module0732.T, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45090(final SubLObject var248) {
        return (SubLObject)((module0732.NIL != var248) ? f45088(var248, (SubLObject)module0732.NIL, (SubLObject)module0732.UNPROVIDED) : module0732.NIL);
    }
    
    public static SubLObject f45088(final SubLObject var248, SubLObject var451, SubLObject var455) {
        if (var451 == module0732.UNPROVIDED) {
            var451 = (SubLObject)module0732.T;
        }
        if (var455 == module0732.UNPROVIDED) {
            var455 = (SubLObject)module0732.NIL;
        }
        SubLObject var456 = (SubLObject)((module0732.NIL != module0018.f971()) ? f45091(var248, var451, var455, (SubLObject)module0732.UNPROVIDED) : module0732.NIL);
        if (module0732.NIL != module0035.find_if_not((SubLObject)module0732.$ic207$, var456, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
            f45092(var248, var451, var455, (SubLObject)module0732.UNPROVIDED);
            var456 = f45091(var248, var451, var455, (SubLObject)module0732.UNPROVIDED);
            return module0035.remove_if_not((SubLObject)module0732.$ic207$, var456, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        }
        return var456;
    }
    
    public static SubLObject f44982() {
        final SubLObject var33 = module0732.$g5806$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45092(final SubLObject var248, SubLObject var451, SubLObject var455, SubLObject var457) {
        if (var451 == module0732.UNPROVIDED) {
            var451 = (SubLObject)module0732.T;
        }
        if (var455 == module0732.UNPROVIDED) {
            var455 = (SubLObject)module0732.NIL;
        }
        if (var457 == module0732.UNPROVIDED) {
            var457 = module0732.$g5805$.getGlobalValue();
        }
        return module0034.f1829(module0732.$g5806$.getGlobalValue(), (SubLObject)ConsesLow.list(var248, var451, var455, var457), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45093(final SubLObject var248, final SubLObject var451, final SubLObject var455, final SubLObject var457) {
        final SubLThread var458 = SubLProcess.currentSubLThread();
        if (module0732.NIL != f45094(var248)) {
            return f45095(var248, var455);
        }
        SubLObject var459 = (SubLObject)module0732.NIL;
        final SubLObject var460 = Types.numberp(var455);
        SubLObject var461 = (SubLObject)module0732.NIL;
        final SubLObject var462 = module0147.$g2094$.currentBinding(var458);
        final SubLObject var463 = module0147.$g2095$.currentBinding(var458);
        try {
            module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var458);
            module0147.$g2095$.bind(module0732.$ic34$, var458);
            final SubLObject var464 = (SubLObject)((module0732.NIL != var451) ? module0732.NIL : module0259.f16848(module0732.$ic195$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED));
            if (module0732.NIL == var461) {
                SubLObject var465 = var457;
                SubLObject var466 = (SubLObject)module0732.NIL;
                var466 = var465.first();
                while (module0732.NIL == var461 && module0732.NIL != var465) {
                    final SubLObject var467 = var466;
                    final SubLObject var50_461 = module0137.$g1605$.currentBinding(var458);
                    final SubLObject var52_462 = module0139.$g1636$.currentBinding(var458);
                    try {
                        module0137.$g1605$.bind(module0137.f8955(module0732.$ic191$), var458);
                        module0139.$g1636$.bind(module0139.f9007(), var458);
                        if (module0732.NIL == var461) {
                            SubLObject var386_463 = var467;
                            final SubLObject var468 = (SubLObject)module0732.$ic36$;
                            final SubLObject var469 = module0056.f4145(var468);
                            final SubLObject var50_462 = module0139.$g1635$.currentBinding(var458);
                            try {
                                module0139.$g1635$.bind(module0139.f9007(), var458);
                                final SubLObject var470 = (SubLObject)module0732.NIL;
                                final SubLObject var50_463 = module0141.$g1714$.currentBinding(var458);
                                final SubLObject var52_463 = module0141.$g1715$.currentBinding(var458);
                                try {
                                    module0141.$g1714$.bind((module0732.NIL != var470) ? var470 : module0141.f9283(), var458);
                                    module0141.$g1715$.bind((SubLObject)((module0732.NIL != var470) ? module0732.$ic38$ : module0141.$g1715$.getDynamicValue(var458)), var458);
                                    if (module0732.NIL != var470 && module0732.NIL != module0136.f8864() && module0732.NIL == module0141.f9279(var470)) {
                                        final SubLObject var471 = module0136.$g1591$.getDynamicValue(var458);
                                        if (var471.eql((SubLObject)module0732.$ic39$)) {
                                            module0136.f8870((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic40$, var470, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                        }
                                        else if (var471.eql((SubLObject)module0732.$ic42$)) {
                                            module0136.f8871((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var470, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                        }
                                        else if (var471.eql((SubLObject)module0732.$ic44$)) {
                                            Errors.warn((SubLObject)module0732.$ic40$, var470, (SubLObject)module0732.$ic41$);
                                        }
                                        else {
                                            Errors.warn((SubLObject)module0732.$ic45$, module0136.$g1591$.getDynamicValue(var458));
                                            Errors.cerror((SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var470, (SubLObject)module0732.$ic41$);
                                        }
                                    }
                                    final SubLObject var50_464 = module0141.$g1670$.currentBinding(var458);
                                    final SubLObject var52_464 = module0141.$g1671$.currentBinding(var458);
                                    final SubLObject var472 = module0141.$g1672$.currentBinding(var458);
                                    final SubLObject var473 = module0141.$g1674$.currentBinding(var458);
                                    final SubLObject var474 = module0137.$g1605$.currentBinding(var458);
                                    try {
                                        module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0732.$ic191$)), var458);
                                        module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0732.$ic191$))), var458);
                                        module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0732.$ic191$))), var458);
                                        module0141.$g1674$.bind((SubLObject)module0732.NIL, var458);
                                        module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0732.$ic191$)), var458);
                                        if (module0732.NIL != module0136.f8865() || module0732.NIL != module0244.f15795(var467, module0137.f8955((SubLObject)module0732.UNPROVIDED))) {
                                            final SubLObject var50_465 = module0141.$g1677$.currentBinding(var458);
                                            final SubLObject var52_465 = module0138.$g1619$.currentBinding(var458);
                                            final SubLObject var63_471 = module0141.$g1674$.currentBinding(var458);
                                            try {
                                                module0141.$g1677$.bind(module0141.f9210(), var458);
                                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0732.$ic191$))), var458);
                                                module0141.$g1674$.bind((SubLObject)module0732.NIL, var458);
                                                module0249.f16055(var386_463, (SubLObject)module0732.UNPROVIDED);
                                                while (module0732.NIL != var386_463 && module0732.NIL == var461) {
                                                    final SubLObject var475 = var386_463;
                                                    final SubLObject var476 = module0200.f12443(module0137.f8955(module0732.$ic191$));
                                                    SubLObject var477;
                                                    SubLObject var478;
                                                    SubLObject var50_466;
                                                    SubLObject var52_466;
                                                    SubLObject var479;
                                                    SubLObject var480;
                                                    SubLObject var481;
                                                    SubLObject var482;
                                                    SubLObject var483;
                                                    SubLObject var484;
                                                    SubLObject var50_467;
                                                    SubLObject var82_476;
                                                    SubLObject var485;
                                                    SubLObject var486;
                                                    SubLObject var50_468;
                                                    SubLObject var487;
                                                    SubLObject var488;
                                                    SubLObject var489;
                                                    SubLObject var490;
                                                    SubLObject var491;
                                                    SubLObject var479_480;
                                                    SubLObject var492;
                                                    SubLObject var493;
                                                    SubLObject var494;
                                                    SubLObject var495;
                                                    SubLObject var496;
                                                    SubLObject var497;
                                                    SubLObject var153_483;
                                                    SubLObject var154_484;
                                                    SubLObject var498;
                                                    SubLObject var156_485;
                                                    SubLObject var499;
                                                    SubLObject var500;
                                                    SubLObject var501;
                                                    SubLObject var502;
                                                    SubLObject var50_469;
                                                    SubLObject var95_488;
                                                    SubLObject var503;
                                                    SubLObject var479_481;
                                                    SubLObject var504;
                                                    SubLObject var505;
                                                    SubLObject var506;
                                                    SubLObject var507;
                                                    SubLObject var508;
                                                    SubLObject var509;
                                                    SubLObject var153_484;
                                                    SubLObject var154_485;
                                                    SubLObject var510;
                                                    SubLObject var156_486;
                                                    SubLObject var511;
                                                    SubLObject var512;
                                                    SubLObject var513;
                                                    SubLObject var50_470;
                                                    SubLObject var95_489;
                                                    SubLObject var514;
                                                    SubLObject var516;
                                                    SubLObject var515;
                                                    SubLObject var517;
                                                    SubLObject var518;
                                                    SubLObject var519;
                                                    SubLObject var50_471;
                                                    SubLObject var50_472;
                                                    SubLObject var520;
                                                    SubLObject var479_482;
                                                    SubLObject var153_485;
                                                    SubLObject var154_486;
                                                    SubLObject var156_487;
                                                    SubLObject var50_473;
                                                    SubLObject var95_490;
                                                    SubLObject var479_483;
                                                    SubLObject var153_486;
                                                    SubLObject var154_487;
                                                    SubLObject var156_488;
                                                    SubLObject var50_474;
                                                    SubLObject var521;
                                                    SubLObject var472_510;
                                                    SubLObject var522;
                                                    SubLObject var50_475;
                                                    SubLObject var524;
                                                    SubLObject var523;
                                                    SubLObject var525;
                                                    SubLObject var526;
                                                    SubLObject var527;
                                                    SubLObject var528;
                                                    SubLObject var479_484;
                                                    SubLObject var529;
                                                    SubLObject var530;
                                                    SubLObject var531;
                                                    SubLObject var532;
                                                    SubLObject var533;
                                                    SubLObject var534;
                                                    SubLObject var153_487;
                                                    SubLObject var154_488;
                                                    SubLObject var535;
                                                    SubLObject var156_489;
                                                    SubLObject var536;
                                                    SubLObject var537;
                                                    SubLObject var538;
                                                    SubLObject var539;
                                                    SubLObject var50_476;
                                                    SubLObject var95_491;
                                                    SubLObject var540;
                                                    SubLObject var479_485;
                                                    SubLObject var541;
                                                    SubLObject var542;
                                                    SubLObject var543;
                                                    SubLObject var544;
                                                    SubLObject var545;
                                                    SubLObject var546;
                                                    SubLObject var153_488;
                                                    SubLObject var154_489;
                                                    SubLObject var547;
                                                    SubLObject var156_490;
                                                    SubLObject var548;
                                                    SubLObject var549;
                                                    SubLObject var550;
                                                    SubLObject var50_477;
                                                    for (var477 = (SubLObject)module0732.NIL, var477 = var476; module0732.NIL == var461 && module0732.NIL != var477; var477 = var477.rest()) {
                                                        var478 = var477.first();
                                                        var50_466 = module0137.$g1605$.currentBinding(var458);
                                                        var52_466 = module0141.$g1674$.currentBinding(var458);
                                                        try {
                                                            module0137.$g1605$.bind(var478, var458);
                                                            module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var458)) : module0141.$g1674$.getDynamicValue(var458)), var458);
                                                            var479 = module0228.f15229(var475);
                                                            if (module0732.NIL != module0138.f8992(var479)) {
                                                                var480 = module0242.f15664(var479, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                                if (module0732.NIL != var480) {
                                                                    var481 = module0245.f15834(var480, module0244.f15780(module0137.f8955(module0732.$ic191$)), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                                    if (module0732.NIL != var481) {
                                                                        for (var482 = module0066.f4838(module0067.f4891(var481)); module0732.NIL == var461 && module0732.NIL == module0066.f4841(var482); var482 = module0066.f4840(var482)) {
                                                                            var458.resetMultipleValues();
                                                                            var483 = module0066.f4839(var482);
                                                                            var484 = var458.secondMultipleValue();
                                                                            var458.resetMultipleValues();
                                                                            if (module0732.NIL != module0147.f9507(var483)) {
                                                                                var50_467 = module0138.$g1623$.currentBinding(var458);
                                                                                try {
                                                                                    module0138.$g1623$.bind(var483, var458);
                                                                                    for (var82_476 = module0066.f4838(module0067.f4891(var484)); module0732.NIL == var461 && module0732.NIL == module0066.f4841(var82_476); var82_476 = module0066.f4840(var82_476)) {
                                                                                        var458.resetMultipleValues();
                                                                                        var485 = module0066.f4839(var82_476);
                                                                                        var486 = var458.secondMultipleValue();
                                                                                        var458.resetMultipleValues();
                                                                                        if (module0732.NIL != module0141.f9289(var485)) {
                                                                                            var50_468 = module0138.$g1624$.currentBinding(var458);
                                                                                            try {
                                                                                                module0138.$g1624$.bind(var485, var458);
                                                                                                var487 = var486;
                                                                                                if (module0732.NIL != module0077.f5302(var487)) {
                                                                                                    var488 = module0077.f5333(var487);
                                                                                                    for (var489 = module0032.f1741(var488), var490 = (SubLObject)module0732.NIL, var490 = module0032.f1742(var489, var488); module0732.NIL == var461 && module0732.NIL == module0032.f1744(var489, var490); var490 = module0032.f1743(var490)) {
                                                                                                        var491 = module0032.f1745(var489, var490);
                                                                                                        if (module0732.NIL != module0032.f1746(var490, var491) && module0732.NIL == module0249.f16059(var491, module0139.$g1636$.getDynamicValue(var458))) {
                                                                                                            module0249.f16055(var491, module0139.$g1636$.getDynamicValue(var458));
                                                                                                            if (module0732.NIL != module0173.f10955(var491)) {
                                                                                                                var479_480 = var491;
                                                                                                                if (module0732.NIL != module0158.f10010(var248, (SubLObject)module0732.NIL, var479_480)) {
                                                                                                                    var492 = module0158.f10011(var248, (SubLObject)module0732.NIL, var479_480);
                                                                                                                    var493 = var461;
                                                                                                                    var494 = (SubLObject)module0732.NIL;
                                                                                                                    while (module0732.NIL == var493) {
                                                                                                                        var495 = module0052.f3695(var492, var494);
                                                                                                                        var496 = (SubLObject)SubLObjectFactory.makeBoolean(!var494.eql(var495));
                                                                                                                        if (module0732.NIL != var496) {
                                                                                                                            var497 = (SubLObject)module0732.NIL;
                                                                                                                            try {
                                                                                                                                var497 = module0158.f10316(var495, (SubLObject)module0732.$ic93$, (SubLObject)module0732.NIL, (SubLObject)module0732.NIL);
                                                                                                                                var153_483 = var461;
                                                                                                                                var154_484 = (SubLObject)module0732.NIL;
                                                                                                                                while (module0732.NIL == var153_483) {
                                                                                                                                    var498 = module0052.f3695(var497, var154_484);
                                                                                                                                    var156_485 = (SubLObject)SubLObjectFactory.makeBoolean(!var154_484.eql(var498));
                                                                                                                                    if (module0732.NIL != var156_485 && module0732.NIL != module0004.f104(var248, module0178.f11330(var498), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == conses_high.member(module0178.f11333(var498), var464, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                                        var499 = var498;
                                                                                                                                        if (module0732.NIL == conses_high.member(var499, var459, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                                                                                                            var459 = (SubLObject)ConsesLow.cons(var499, var459);
                                                                                                                                        }
                                                                                                                                        var500 = module0211.f13701(var498);
                                                                                                                                        var501 = (SubLObject)module0732.NIL;
                                                                                                                                        var501 = var500.first();
                                                                                                                                        while (module0732.NIL != var500) {
                                                                                                                                            if (module0732.NIL != module0259.f16854(module0205.f13132(var501), module0732.$ic209$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                                                var502 = var501;
                                                                                                                                                if (module0732.NIL == conses_high.member(var502, var459, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                                                                                                                    var459 = (SubLObject)ConsesLow.cons(var502, var459);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var500 = var500.rest();
                                                                                                                                            var501 = var500.first();
                                                                                                                                        }
                                                                                                                                        if (module0732.NIL != var460 && module0732.NIL != module0035.f2000(var459, var455, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                                            var461 = (SubLObject)module0732.T;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var153_483 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var156_485 || module0732.NIL != var461);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            finally {
                                                                                                                                var50_469 = Threads.$is_thread_performing_cleanupP$.currentBinding(var458);
                                                                                                                                try {
                                                                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0732.T, var458);
                                                                                                                                    if (module0732.NIL != var497) {
                                                                                                                                        module0158.f10319(var497);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                finally {
                                                                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var50_469, var458);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var493 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var496 || module0732.NIL != var461);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (var487.isList()) {
                                                                                                    if (module0732.NIL == var461) {
                                                                                                        var95_488 = var487;
                                                                                                        var503 = (SubLObject)module0732.NIL;
                                                                                                        var503 = var95_488.first();
                                                                                                        while (module0732.NIL == var461 && module0732.NIL != var95_488) {
                                                                                                            if (module0732.NIL == module0249.f16059(var503, module0139.$g1636$.getDynamicValue(var458))) {
                                                                                                                module0249.f16055(var503, module0139.$g1636$.getDynamicValue(var458));
                                                                                                                if (module0732.NIL != module0173.f10955(var503)) {
                                                                                                                    var479_481 = var503;
                                                                                                                    if (module0732.NIL != module0158.f10010(var248, (SubLObject)module0732.NIL, var479_481)) {
                                                                                                                        var504 = module0158.f10011(var248, (SubLObject)module0732.NIL, var479_481);
                                                                                                                        var505 = var461;
                                                                                                                        var506 = (SubLObject)module0732.NIL;
                                                                                                                        while (module0732.NIL == var505) {
                                                                                                                            var507 = module0052.f3695(var504, var506);
                                                                                                                            var508 = (SubLObject)SubLObjectFactory.makeBoolean(!var506.eql(var507));
                                                                                                                            if (module0732.NIL != var508) {
                                                                                                                                var509 = (SubLObject)module0732.NIL;
                                                                                                                                try {
                                                                                                                                    var509 = module0158.f10316(var507, (SubLObject)module0732.$ic93$, (SubLObject)module0732.NIL, (SubLObject)module0732.NIL);
                                                                                                                                    var153_484 = var461;
                                                                                                                                    var154_485 = (SubLObject)module0732.NIL;
                                                                                                                                    while (module0732.NIL == var153_484) {
                                                                                                                                        var510 = module0052.f3695(var509, var154_485);
                                                                                                                                        var156_486 = (SubLObject)SubLObjectFactory.makeBoolean(!var154_485.eql(var510));
                                                                                                                                        if (module0732.NIL != var156_486 && module0732.NIL != module0004.f104(var248, module0178.f11330(var510), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == conses_high.member(module0178.f11333(var510), var464, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                                            var511 = var510;
                                                                                                                                            if (module0732.NIL == conses_high.member(var511, var459, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                                                                                                                var459 = (SubLObject)ConsesLow.cons(var511, var459);
                                                                                                                                            }
                                                                                                                                            var512 = module0211.f13701(var510);
                                                                                                                                            var513 = (SubLObject)module0732.NIL;
                                                                                                                                            var513 = var512.first();
                                                                                                                                            while (module0732.NIL != var512) {
                                                                                                                                                if (module0732.NIL != module0259.f16854(module0205.f13132(var513), module0732.$ic209$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                                                    var499 = var513;
                                                                                                                                                    if (module0732.NIL == conses_high.member(var499, var459, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                                                                                                                        var459 = (SubLObject)ConsesLow.cons(var499, var459);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var512 = var512.rest();
                                                                                                                                                var513 = var512.first();
                                                                                                                                            }
                                                                                                                                            if (module0732.NIL != var460 && module0732.NIL != module0035.f2000(var459, var455, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                                                var461 = (SubLObject)module0732.T;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        var153_484 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var156_486 || module0732.NIL != var461);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                finally {
                                                                                                                                    var50_470 = Threads.$is_thread_performing_cleanupP$.currentBinding(var458);
                                                                                                                                    try {
                                                                                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0732.T, var458);
                                                                                                                                        if (module0732.NIL != var509) {
                                                                                                                                            module0158.f10319(var509);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    finally {
                                                                                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var50_470, var458);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var505 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var508 || module0732.NIL != var461);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            var95_488 = var95_488.rest();
                                                                                                            var503 = var95_488.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)module0732.$ic48$, var487);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                module0138.$g1624$.rebind(var50_468, var458);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    module0066.f4842(var82_476);
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1623$.rebind(var50_467, var458);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var482);
                                                                    }
                                                                }
                                                                else {
                                                                    module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                                }
                                                                if (module0732.NIL != module0200.f12419(var479, module0137.f8955((SubLObject)module0732.UNPROVIDED)) && module0732.NIL == var461) {
                                                                    var95_489 = module0248.f15995(var479);
                                                                    var514 = (SubLObject)module0732.NIL;
                                                                    var514 = var95_489.first();
                                                                    while (module0732.NIL == var461 && module0732.NIL != var95_489) {
                                                                        var515 = (var516 = var514);
                                                                        var517 = (SubLObject)module0732.NIL;
                                                                        var518 = (SubLObject)module0732.NIL;
                                                                        var519 = (SubLObject)module0732.NIL;
                                                                        cdestructuring_bind.destructuring_bind_must_consp(var516, var515, (SubLObject)module0732.$ic193$);
                                                                        var517 = var516.first();
                                                                        var516 = var516.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(var516, var515, (SubLObject)module0732.$ic193$);
                                                                        var518 = var516.first();
                                                                        var516 = var516.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(var516, var515, (SubLObject)module0732.$ic193$);
                                                                        var519 = var516.first();
                                                                        var516 = var516.rest();
                                                                        if (module0732.NIL == var516) {
                                                                            if (module0732.NIL != module0147.f9507(var518)) {
                                                                                var50_471 = module0138.$g1623$.currentBinding(var458);
                                                                                try {
                                                                                    module0138.$g1623$.bind(var518, var458);
                                                                                    if (module0732.NIL != module0141.f9289(var519)) {
                                                                                        var50_472 = module0138.$g1624$.currentBinding(var458);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var519, var458);
                                                                                            var520 = (var487 = (SubLObject)ConsesLow.list(var517));
                                                                                            if (module0732.NIL != module0077.f5302(var487)) {
                                                                                                var488 = module0077.f5333(var487);
                                                                                                for (var489 = module0032.f1741(var488), var490 = (SubLObject)module0732.NIL, var490 = module0032.f1742(var489, var488); module0732.NIL == var461 && module0732.NIL == module0032.f1744(var489, var490); var490 = module0032.f1743(var490)) {
                                                                                                    var491 = module0032.f1745(var489, var490);
                                                                                                    if (module0732.NIL != module0032.f1746(var490, var491) && module0732.NIL == module0249.f16059(var491, module0139.$g1636$.getDynamicValue(var458))) {
                                                                                                        module0249.f16055(var491, module0139.$g1636$.getDynamicValue(var458));
                                                                                                        if (module0732.NIL != module0173.f10955(var491)) {
                                                                                                            var479_482 = var491;
                                                                                                            if (module0732.NIL != module0158.f10010(var248, (SubLObject)module0732.NIL, var479_482)) {
                                                                                                                var492 = module0158.f10011(var248, (SubLObject)module0732.NIL, var479_482);
                                                                                                                var493 = var461;
                                                                                                                var494 = (SubLObject)module0732.NIL;
                                                                                                                while (module0732.NIL == var493) {
                                                                                                                    var495 = module0052.f3695(var492, var494);
                                                                                                                    var496 = (SubLObject)SubLObjectFactory.makeBoolean(!var494.eql(var495));
                                                                                                                    if (module0732.NIL != var496) {
                                                                                                                        var497 = (SubLObject)module0732.NIL;
                                                                                                                        try {
                                                                                                                            var497 = module0158.f10316(var495, (SubLObject)module0732.$ic93$, (SubLObject)module0732.NIL, (SubLObject)module0732.NIL);
                                                                                                                            var153_485 = var461;
                                                                                                                            var154_486 = (SubLObject)module0732.NIL;
                                                                                                                            while (module0732.NIL == var153_485) {
                                                                                                                                var498 = module0052.f3695(var497, var154_486);
                                                                                                                                var156_487 = (SubLObject)SubLObjectFactory.makeBoolean(!var154_486.eql(var498));
                                                                                                                                if (module0732.NIL != var156_487 && module0732.NIL != module0004.f104(var248, module0178.f11330(var498), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == conses_high.member(module0178.f11333(var498), var464, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                                    var499 = var498;
                                                                                                                                    if (module0732.NIL == conses_high.member(var499, var459, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                                                                                                        var459 = (SubLObject)ConsesLow.cons(var499, var459);
                                                                                                                                    }
                                                                                                                                    var500 = module0211.f13701(var498);
                                                                                                                                    var501 = (SubLObject)module0732.NIL;
                                                                                                                                    var501 = var500.first();
                                                                                                                                    while (module0732.NIL != var500) {
                                                                                                                                        if (module0732.NIL != module0259.f16854(module0205.f13132(var501), module0732.$ic209$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                                            var502 = var501;
                                                                                                                                            if (module0732.NIL == conses_high.member(var502, var459, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                                                                                                                var459 = (SubLObject)ConsesLow.cons(var502, var459);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        var500 = var500.rest();
                                                                                                                                        var501 = var500.first();
                                                                                                                                    }
                                                                                                                                    if (module0732.NIL != var460 && module0732.NIL != module0035.f2000(var459, var455, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                                        var461 = (SubLObject)module0732.T;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var153_485 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var156_487 || module0732.NIL != var461);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        finally {
                                                                                                                            var50_473 = Threads.$is_thread_performing_cleanupP$.currentBinding(var458);
                                                                                                                            try {
                                                                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0732.T, var458);
                                                                                                                                if (module0732.NIL != var497) {
                                                                                                                                    module0158.f10319(var497);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            finally {
                                                                                                                                Threads.$is_thread_performing_cleanupP$.rebind(var50_473, var458);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var493 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var496 || module0732.NIL != var461);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var487.isList()) {
                                                                                                if (module0732.NIL == var461) {
                                                                                                    var95_490 = var487;
                                                                                                    var503 = (SubLObject)module0732.NIL;
                                                                                                    var503 = var95_490.first();
                                                                                                    while (module0732.NIL == var461 && module0732.NIL != var95_490) {
                                                                                                        if (module0732.NIL == module0249.f16059(var503, module0139.$g1636$.getDynamicValue(var458))) {
                                                                                                            module0249.f16055(var503, module0139.$g1636$.getDynamicValue(var458));
                                                                                                            if (module0732.NIL != module0173.f10955(var503)) {
                                                                                                                var479_483 = var503;
                                                                                                                if (module0732.NIL != module0158.f10010(var248, (SubLObject)module0732.NIL, var479_483)) {
                                                                                                                    var504 = module0158.f10011(var248, (SubLObject)module0732.NIL, var479_483);
                                                                                                                    var505 = var461;
                                                                                                                    var506 = (SubLObject)module0732.NIL;
                                                                                                                    while (module0732.NIL == var505) {
                                                                                                                        var507 = module0052.f3695(var504, var506);
                                                                                                                        var508 = (SubLObject)SubLObjectFactory.makeBoolean(!var506.eql(var507));
                                                                                                                        if (module0732.NIL != var508) {
                                                                                                                            var509 = (SubLObject)module0732.NIL;
                                                                                                                            try {
                                                                                                                                var509 = module0158.f10316(var507, (SubLObject)module0732.$ic93$, (SubLObject)module0732.NIL, (SubLObject)module0732.NIL);
                                                                                                                                var153_486 = var461;
                                                                                                                                var154_487 = (SubLObject)module0732.NIL;
                                                                                                                                while (module0732.NIL == var153_486) {
                                                                                                                                    var510 = module0052.f3695(var509, var154_487);
                                                                                                                                    var156_488 = (SubLObject)SubLObjectFactory.makeBoolean(!var154_487.eql(var510));
                                                                                                                                    if (module0732.NIL != var156_488 && module0732.NIL != module0004.f104(var248, module0178.f11330(var510), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == conses_high.member(module0178.f11333(var510), var464, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                                        var511 = var510;
                                                                                                                                        if (module0732.NIL == conses_high.member(var511, var459, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                                                                                                            var459 = (SubLObject)ConsesLow.cons(var511, var459);
                                                                                                                                        }
                                                                                                                                        var512 = module0211.f13701(var510);
                                                                                                                                        var513 = (SubLObject)module0732.NIL;
                                                                                                                                        var513 = var512.first();
                                                                                                                                        while (module0732.NIL != var512) {
                                                                                                                                            if (module0732.NIL != module0259.f16854(module0205.f13132(var513), module0732.$ic209$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                                                var499 = var513;
                                                                                                                                                if (module0732.NIL == conses_high.member(var499, var459, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                                                                                                                    var459 = (SubLObject)ConsesLow.cons(var499, var459);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var512 = var512.rest();
                                                                                                                                            var513 = var512.first();
                                                                                                                                        }
                                                                                                                                        if (module0732.NIL != var460 && module0732.NIL != module0035.f2000(var459, var455, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                                            var461 = (SubLObject)module0732.T;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var153_486 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var156_488 || module0732.NIL != var461);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            finally {
                                                                                                                                var50_474 = Threads.$is_thread_performing_cleanupP$.currentBinding(var458);
                                                                                                                                try {
                                                                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0732.T, var458);
                                                                                                                                    if (module0732.NIL != var509) {
                                                                                                                                        module0158.f10319(var509);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                finally {
                                                                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var50_474, var458);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var505 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var508 || module0732.NIL != var461);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        var95_490 = var95_490.rest();
                                                                                                        var503 = var95_490.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)module0732.$ic48$, var487);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var50_472, var458);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1623$.rebind(var50_471, var458);
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            cdestructuring_bind.cdestructuring_bind_error(var515, (SubLObject)module0732.$ic193$);
                                                                        }
                                                                        var95_489 = var95_489.rest();
                                                                        var514 = var95_489.first();
                                                                    }
                                                                }
                                                            }
                                                            else if (module0732.NIL != module0155.f9785(var479, (SubLObject)module0732.UNPROVIDED)) {
                                                                var521 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0732.$ic191$)), module0141.$g1714$.getDynamicValue(var458), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0732.$ic191$)), module0141.$g1714$.getDynamicValue(var458), module0137.f8955((SubLObject)module0732.UNPROVIDED)));
                                                                for (var472_510 = (SubLObject)module0732.NIL, var472_510 = var521; module0732.NIL == var461 && module0732.NIL != var472_510; var472_510 = var472_510.rest()) {
                                                                    var522 = var472_510.first();
                                                                    var50_475 = module0138.$g1625$.currentBinding(var458);
                                                                    try {
                                                                        module0138.$g1625$.bind(var522, var458);
                                                                        var523 = (var524 = Functions.funcall(var522, var479));
                                                                        if (module0732.NIL != module0077.f5302(var524)) {
                                                                            var525 = module0077.f5333(var524);
                                                                            for (var526 = module0032.f1741(var525), var527 = (SubLObject)module0732.NIL, var527 = module0032.f1742(var526, var525); module0732.NIL == var461 && module0732.NIL == module0032.f1744(var526, var527); var527 = module0032.f1743(var527)) {
                                                                                var528 = module0032.f1745(var526, var527);
                                                                                if (module0732.NIL != module0032.f1746(var527, var528) && module0732.NIL == module0249.f16059(var528, module0139.$g1636$.getDynamicValue(var458))) {
                                                                                    module0249.f16055(var528, module0139.$g1636$.getDynamicValue(var458));
                                                                                    if (module0732.NIL != module0173.f10955(var528)) {
                                                                                        var479_484 = var528;
                                                                                        if (module0732.NIL != module0158.f10010(var248, (SubLObject)module0732.NIL, var479_484)) {
                                                                                            var529 = module0158.f10011(var248, (SubLObject)module0732.NIL, var479_484);
                                                                                            var530 = var461;
                                                                                            var531 = (SubLObject)module0732.NIL;
                                                                                            while (module0732.NIL == var530) {
                                                                                                var532 = module0052.f3695(var529, var531);
                                                                                                var533 = (SubLObject)SubLObjectFactory.makeBoolean(!var531.eql(var532));
                                                                                                if (module0732.NIL != var533) {
                                                                                                    var534 = (SubLObject)module0732.NIL;
                                                                                                    try {
                                                                                                        var534 = module0158.f10316(var532, (SubLObject)module0732.$ic93$, (SubLObject)module0732.NIL, (SubLObject)module0732.NIL);
                                                                                                        var153_487 = var461;
                                                                                                        var154_488 = (SubLObject)module0732.NIL;
                                                                                                        while (module0732.NIL == var153_487) {
                                                                                                            var535 = module0052.f3695(var534, var154_488);
                                                                                                            var156_489 = (SubLObject)SubLObjectFactory.makeBoolean(!var154_488.eql(var535));
                                                                                                            if (module0732.NIL != var156_489 && module0732.NIL != module0004.f104(var248, module0178.f11330(var535), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == conses_high.member(module0178.f11333(var535), var464, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                var536 = var535;
                                                                                                                if (module0732.NIL == conses_high.member(var536, var459, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                                                                                    var459 = (SubLObject)ConsesLow.cons(var536, var459);
                                                                                                                }
                                                                                                                var537 = module0211.f13701(var535);
                                                                                                                var538 = (SubLObject)module0732.NIL;
                                                                                                                var538 = var537.first();
                                                                                                                while (module0732.NIL != var537) {
                                                                                                                    if (module0732.NIL != module0259.f16854(module0205.f13132(var538), module0732.$ic209$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                        var539 = var538;
                                                                                                                        if (module0732.NIL == conses_high.member(var539, var459, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                                                                                            var459 = (SubLObject)ConsesLow.cons(var539, var459);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var537 = var537.rest();
                                                                                                                    var538 = var537.first();
                                                                                                                }
                                                                                                                if (module0732.NIL != var460 && module0732.NIL != module0035.f2000(var459, var455, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                    var461 = (SubLObject)module0732.T;
                                                                                                                }
                                                                                                            }
                                                                                                            var153_487 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var156_489 || module0732.NIL != var461);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        var50_476 = Threads.$is_thread_performing_cleanupP$.currentBinding(var458);
                                                                                                        try {
                                                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0732.T, var458);
                                                                                                            if (module0732.NIL != var534) {
                                                                                                                module0158.f10319(var534);
                                                                                                            }
                                                                                                        }
                                                                                                        finally {
                                                                                                            Threads.$is_thread_performing_cleanupP$.rebind(var50_476, var458);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                var530 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var533 || module0732.NIL != var461);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (var524.isList()) {
                                                                            if (module0732.NIL == var461) {
                                                                                var95_491 = var524;
                                                                                var540 = (SubLObject)module0732.NIL;
                                                                                var540 = var95_491.first();
                                                                                while (module0732.NIL == var461 && module0732.NIL != var95_491) {
                                                                                    if (module0732.NIL == module0249.f16059(var540, module0139.$g1636$.getDynamicValue(var458))) {
                                                                                        module0249.f16055(var540, module0139.$g1636$.getDynamicValue(var458));
                                                                                        if (module0732.NIL != module0173.f10955(var540)) {
                                                                                            var479_485 = var540;
                                                                                            if (module0732.NIL != module0158.f10010(var248, (SubLObject)module0732.NIL, var479_485)) {
                                                                                                var541 = module0158.f10011(var248, (SubLObject)module0732.NIL, var479_485);
                                                                                                var542 = var461;
                                                                                                var543 = (SubLObject)module0732.NIL;
                                                                                                while (module0732.NIL == var542) {
                                                                                                    var544 = module0052.f3695(var541, var543);
                                                                                                    var545 = (SubLObject)SubLObjectFactory.makeBoolean(!var543.eql(var544));
                                                                                                    if (module0732.NIL != var545) {
                                                                                                        var546 = (SubLObject)module0732.NIL;
                                                                                                        try {
                                                                                                            var546 = module0158.f10316(var544, (SubLObject)module0732.$ic93$, (SubLObject)module0732.NIL, (SubLObject)module0732.NIL);
                                                                                                            var153_488 = var461;
                                                                                                            var154_489 = (SubLObject)module0732.NIL;
                                                                                                            while (module0732.NIL == var153_488) {
                                                                                                                var547 = module0052.f3695(var546, var154_489);
                                                                                                                var156_490 = (SubLObject)SubLObjectFactory.makeBoolean(!var154_489.eql(var547));
                                                                                                                if (module0732.NIL != var156_490 && module0732.NIL != module0004.f104(var248, module0178.f11330(var547), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == conses_high.member(module0178.f11333(var547), var464, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                    var548 = var547;
                                                                                                                    if (module0732.NIL == conses_high.member(var548, var459, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                                                                                        var459 = (SubLObject)ConsesLow.cons(var548, var459);
                                                                                                                    }
                                                                                                                    var549 = module0211.f13701(var547);
                                                                                                                    var550 = (SubLObject)module0732.NIL;
                                                                                                                    var550 = var549.first();
                                                                                                                    while (module0732.NIL != var549) {
                                                                                                                        if (module0732.NIL != module0259.f16854(module0205.f13132(var550), module0732.$ic209$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                            var536 = var550;
                                                                                                                            if (module0732.NIL == conses_high.member(var536, var459, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                                                                                                                var459 = (SubLObject)ConsesLow.cons(var536, var459);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var549 = var549.rest();
                                                                                                                        var550 = var549.first();
                                                                                                                    }
                                                                                                                    if (module0732.NIL != var460 && module0732.NIL != module0035.f2000(var459, var455, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                        var461 = (SubLObject)module0732.T;
                                                                                                                    }
                                                                                                                }
                                                                                                                var153_488 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var156_490 || module0732.NIL != var461);
                                                                                                            }
                                                                                                        }
                                                                                                        finally {
                                                                                                            var50_477 = Threads.$is_thread_performing_cleanupP$.currentBinding(var458);
                                                                                                            try {
                                                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0732.T, var458);
                                                                                                                if (module0732.NIL != var546) {
                                                                                                                    module0158.f10319(var546);
                                                                                                                }
                                                                                                            }
                                                                                                            finally {
                                                                                                                Threads.$is_thread_performing_cleanupP$.rebind(var50_477, var458);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    var542 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var545 || module0732.NIL != var461);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    var95_491 = var95_491.rest();
                                                                                    var540 = var95_491.first();
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)module0732.$ic48$, var524);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1625$.rebind(var50_475, var458);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0141.$g1674$.rebind(var52_466, var458);
                                                            module0137.$g1605$.rebind(var50_466, var458);
                                                        }
                                                    }
                                                    final SubLObject var551 = module0200.f12443(module0244.f15771(module0137.f8955(module0732.$ic191$)));
                                                    SubLObject var552;
                                                    SubLObject var553;
                                                    SubLObject var50_478;
                                                    SubLObject var52_467;
                                                    SubLObject var554;
                                                    SubLObject var555;
                                                    SubLObject var556;
                                                    SubLObject var557;
                                                    SubLObject var558;
                                                    SubLObject var559;
                                                    SubLObject var50_479;
                                                    SubLObject var82_477;
                                                    SubLObject var560;
                                                    SubLObject var561;
                                                    SubLObject var50_480;
                                                    SubLObject var562;
                                                    SubLObject var563;
                                                    SubLObject var564;
                                                    SubLObject var565;
                                                    SubLObject var566;
                                                    SubLObject var95_492;
                                                    SubLObject var567;
                                                    SubLObject var568;
                                                    SubLObject var472_511;
                                                    SubLObject var569;
                                                    SubLObject var50_481;
                                                    SubLObject var571;
                                                    SubLObject var570;
                                                    SubLObject var572;
                                                    SubLObject var573;
                                                    SubLObject var574;
                                                    SubLObject var575;
                                                    SubLObject var95_493;
                                                    SubLObject var576;
                                                    for (var552 = (SubLObject)module0732.NIL, var552 = var551; module0732.NIL == var461 && module0732.NIL != var552; var552 = var552.rest()) {
                                                        var553 = var552.first();
                                                        var50_478 = module0137.$g1605$.currentBinding(var458);
                                                        var52_467 = module0141.$g1674$.currentBinding(var458);
                                                        try {
                                                            module0137.$g1605$.bind(var553, var458);
                                                            module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var458)) : module0141.$g1674$.getDynamicValue(var458)), var458);
                                                            var554 = module0228.f15229(var386_463);
                                                            if (module0732.NIL != module0138.f8992(var554)) {
                                                                var555 = module0242.f15664(var554, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                                if (module0732.NIL != var555) {
                                                                    var556 = module0245.f15834(var555, module0138.f8979(), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                                    if (module0732.NIL != var556) {
                                                                        for (var557 = module0066.f4838(module0067.f4891(var556)); module0732.NIL == var461 && module0732.NIL == module0066.f4841(var557); var557 = module0066.f4840(var557)) {
                                                                            var458.resetMultipleValues();
                                                                            var558 = module0066.f4839(var557);
                                                                            var559 = var458.secondMultipleValue();
                                                                            var458.resetMultipleValues();
                                                                            if (module0732.NIL != module0147.f9507(var558)) {
                                                                                var50_479 = module0138.$g1623$.currentBinding(var458);
                                                                                try {
                                                                                    module0138.$g1623$.bind(var558, var458);
                                                                                    for (var82_477 = module0066.f4838(module0067.f4891(var559)); module0732.NIL == var461 && module0732.NIL == module0066.f4841(var82_477); var82_477 = module0066.f4840(var82_477)) {
                                                                                        var458.resetMultipleValues();
                                                                                        var560 = module0066.f4839(var82_477);
                                                                                        var561 = var458.secondMultipleValue();
                                                                                        var458.resetMultipleValues();
                                                                                        if (module0732.NIL != module0141.f9289(var560)) {
                                                                                            var50_480 = module0138.$g1624$.currentBinding(var458);
                                                                                            try {
                                                                                                module0138.$g1624$.bind(var560, var458);
                                                                                                var562 = var561;
                                                                                                if (module0732.NIL != module0077.f5302(var562)) {
                                                                                                    var563 = module0077.f5333(var562);
                                                                                                    for (var564 = module0032.f1741(var563), var565 = (SubLObject)module0732.NIL, var565 = module0032.f1742(var564, var563); module0732.NIL == var461 && module0732.NIL == module0032.f1744(var564, var565); var565 = module0032.f1743(var565)) {
                                                                                                        var566 = module0032.f1745(var564, var565);
                                                                                                        if (module0732.NIL != module0032.f1746(var565, var566) && module0732.NIL == module0249.f16059(var566, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                            module0249.f16055(var566, (SubLObject)module0732.UNPROVIDED);
                                                                                                            module0056.f4149(var566, var469);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (var562.isList()) {
                                                                                                    if (module0732.NIL == var461) {
                                                                                                        var95_492 = var562;
                                                                                                        var567 = (SubLObject)module0732.NIL;
                                                                                                        var567 = var95_492.first();
                                                                                                        while (module0732.NIL == var461 && module0732.NIL != var95_492) {
                                                                                                            if (module0732.NIL == module0249.f16059(var567, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                                module0249.f16055(var567, (SubLObject)module0732.UNPROVIDED);
                                                                                                                module0056.f4149(var567, var469);
                                                                                                            }
                                                                                                            var95_492 = var95_492.rest();
                                                                                                            var567 = var95_492.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)module0732.$ic48$, var562);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                module0138.$g1624$.rebind(var50_480, var458);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    module0066.f4842(var82_477);
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1623$.rebind(var50_479, var458);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var557);
                                                                    }
                                                                }
                                                                else {
                                                                    module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (module0732.NIL != module0155.f9785(var554, (SubLObject)module0732.UNPROVIDED)) {
                                                                var568 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var458), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var458), module0137.f8955((SubLObject)module0732.UNPROVIDED)));
                                                                for (var472_511 = (SubLObject)module0732.NIL, var472_511 = var568; module0732.NIL == var461 && module0732.NIL != var472_511; var472_511 = var472_511.rest()) {
                                                                    var569 = var472_511.first();
                                                                    var50_481 = module0138.$g1625$.currentBinding(var458);
                                                                    try {
                                                                        module0138.$g1625$.bind(var569, var458);
                                                                        var570 = (var571 = Functions.funcall(var569, var554));
                                                                        if (module0732.NIL != module0077.f5302(var571)) {
                                                                            var572 = module0077.f5333(var571);
                                                                            for (var573 = module0032.f1741(var572), var574 = (SubLObject)module0732.NIL, var574 = module0032.f1742(var573, var572); module0732.NIL == var461 && module0732.NIL == module0032.f1744(var573, var574); var574 = module0032.f1743(var574)) {
                                                                                var575 = module0032.f1745(var573, var574);
                                                                                if (module0732.NIL != module0032.f1746(var574, var575) && module0732.NIL == module0249.f16059(var575, (SubLObject)module0732.UNPROVIDED)) {
                                                                                    module0249.f16055(var575, (SubLObject)module0732.UNPROVIDED);
                                                                                    module0056.f4149(var575, var469);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (var571.isList()) {
                                                                            if (module0732.NIL == var461) {
                                                                                var95_493 = var571;
                                                                                var576 = (SubLObject)module0732.NIL;
                                                                                var576 = var95_493.first();
                                                                                while (module0732.NIL == var461 && module0732.NIL != var95_493) {
                                                                                    if (module0732.NIL == module0249.f16059(var576, (SubLObject)module0732.UNPROVIDED)) {
                                                                                        module0249.f16055(var576, (SubLObject)module0732.UNPROVIDED);
                                                                                        module0056.f4149(var576, var469);
                                                                                    }
                                                                                    var95_493 = var95_493.rest();
                                                                                    var576 = var95_493.first();
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)module0732.$ic48$, var571);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1625$.rebind(var50_481, var458);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0141.$g1674$.rebind(var52_467, var458);
                                                            module0137.$g1605$.rebind(var50_478, var458);
                                                        }
                                                    }
                                                    var386_463 = module0056.f4150(var469);
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var63_471, var458);
                                                module0138.$g1619$.rebind(var52_465, var458);
                                                module0141.$g1677$.rebind(var50_465, var458);
                                            }
                                        }
                                        else {
                                            module0136.f8872((SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.$ic50$, var467, module0244.f15748(module0137.f8955((SubLObject)module0732.UNPROVIDED)), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        module0137.$g1605$.rebind(var474, var458);
                                        module0141.$g1674$.rebind(var473, var458);
                                        module0141.$g1672$.rebind(var472, var458);
                                        module0141.$g1671$.rebind(var52_464, var458);
                                        module0141.$g1670$.rebind(var50_464, var458);
                                    }
                                }
                                finally {
                                    module0141.$g1715$.rebind(var52_463, var458);
                                    module0141.$g1714$.rebind(var50_463, var458);
                                }
                                module0139.f9011(module0139.$g1635$.getDynamicValue(var458));
                            }
                            finally {
                                module0139.$g1635$.rebind(var50_462, var458);
                            }
                        }
                        module0139.f9011(module0139.$g1636$.getDynamicValue(var458));
                    }
                    finally {
                        module0139.$g1636$.rebind(var52_462, var458);
                        module0137.$g1605$.rebind(var50_461, var458);
                    }
                    var465 = var465.rest();
                    var466 = var465.first();
                }
            }
            if (module0732.NIL != module0158.f10274(var248, (SubLObject)module0732.NIL)) {
                final SubLObject var577 = module0158.f10275(var248);
                SubLObject var578 = (SubLObject)module0732.NIL;
                try {
                    var578 = module0158.f10316(var577, (SubLObject)module0732.NIL, (SubLObject)module0732.$ic210$, (SubLObject)module0732.NIL);
                    SubLObject var579 = var461;
                    final SubLObject var580 = (SubLObject)module0732.NIL;
                    while (module0732.NIL == var579) {
                        final SubLObject var581 = module0052.f3695(var578, var580);
                        final SubLObject var582 = (SubLObject)SubLObjectFactory.makeBoolean(!var580.eql(var581));
                        if (module0732.NIL != var582 && module0732.NIL != module0158.f10280(var581) && module0205.f13132(var581).eql(module0732.$ic211$) && module0732.NIL != module0205.f13220(var248, var581, (SubLObject)module0732.T, Symbols.symbol_function((SubLObject)module0732.EQ), (SubLObject)module0732.$ic212$)) {
                            final SubLObject var583 = var581;
                            if (module0732.NIL == conses_high.member(var583, var459, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                var459 = (SubLObject)ConsesLow.cons(var583, var459);
                            }
                            if (module0732.NIL != var460 && module0732.NIL != module0035.f2000(var459, var455, (SubLObject)module0732.UNPROVIDED)) {
                                var461 = (SubLObject)module0732.T;
                            }
                        }
                        var579 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var582 || module0732.NIL != var461);
                    }
                }
                finally {
                    final SubLObject var50_482 = Threads.$is_thread_performing_cleanupP$.currentBinding(var458);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0732.T, var458);
                        if (module0732.NIL != var578) {
                            module0158.f10319(var578);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var50_482, var458);
                    }
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var463, var458);
            module0147.$g2094$.rebind(var462, var458);
        }
        return var459;
    }
    
    public static SubLObject f45091(final SubLObject var248, SubLObject var451, SubLObject var455, SubLObject var457) {
        if (var451 == module0732.UNPROVIDED) {
            var451 = (SubLObject)module0732.T;
        }
        if (var455 == module0732.UNPROVIDED) {
            var455 = (SubLObject)module0732.NIL;
        }
        if (var457 == module0732.UNPROVIDED) {
            var457 = module0732.$g5805$.getGlobalValue();
        }
        SubLObject var458 = module0732.$g5806$.getGlobalValue();
        if (module0732.NIL == var458) {
            var458 = module0034.f1934((SubLObject)module0732.$ic208$, (SubLObject)module0732.$ic213$, (SubLObject)module0732.NIL, (SubLObject)module0732.EQL, (SubLObject)module0732.FOUR_INTEGER, (SubLObject)module0732.$ic214$);
            module0034.f1940((SubLObject)module0732.$ic215$);
        }
        final SubLObject var459 = module0034.f1780(var248, var451, var455, var457);
        final SubLObject var460 = module0034.f1814(var458, var459, (SubLObject)module0732.UNPROVIDED);
        if (var460 != module0732.$ic18$) {
            SubLObject var461 = var460;
            SubLObject var462 = (SubLObject)module0732.NIL;
            var462 = var461.first();
            while (module0732.NIL != var461) {
                SubLObject var463 = var462.first();
                final SubLObject var464 = conses_high.second(var462);
                if (var248.eql(var463.first())) {
                    var463 = var463.rest();
                    if (var451.eql(var463.first())) {
                        var463 = var463.rest();
                        if (var455.eql(var463.first())) {
                            var463 = var463.rest();
                            if (module0732.NIL != var463 && module0732.NIL == var463.rest() && var457.eql(var463.first())) {
                                return module0034.f1959(var464);
                            }
                        }
                    }
                }
                var461 = var461.rest();
                var462 = var461.first();
            }
        }
        final SubLObject var465 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45093(var248, var451, var455, var457)));
        module0034.f1836(var458, var459, var460, var465, (SubLObject)ConsesLow.list(var248, var451, var455, var457));
        return module0034.f1959(var465);
    }
    
    public static SubLObject f45094(final SubLObject var248) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL != module0259.f16891(var248, module0732.$ic113$) || module0732.NIL != module0259.f16891(var248, module0732.$ic216$) || (module0732.NIL != module0259.f16891(var248, module0732.$ic217$) && module0732.NIL == module0259.f16891(var248, module0732.$ic218$)));
    }
    
    public static SubLObject f45095(final SubLObject var248, SubLObject var455) {
        if (var455 == module0732.UNPROVIDED) {
            var455 = (SubLObject)module0732.NIL;
        }
        final SubLThread var456 = SubLProcess.currentSubLThread();
        SubLObject var457 = (SubLObject)module0732.NIL;
        SubLObject var458 = (SubLObject)module0732.NIL;
        final SubLObject var459 = var455;
        if (module0732.NIL == var458) {
            SubLObject var460 = module0732.$g5805$.getGlobalValue();
            SubLObject var461 = (SubLObject)module0732.NIL;
            var461 = var460.first();
            while (module0732.NIL == var458 && module0732.NIL != var460) {
                final SubLObject var462 = module0147.$g2094$.currentBinding(var456);
                final SubLObject var463 = module0147.$g2095$.currentBinding(var456);
                try {
                    module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var456);
                    module0147.$g2095$.bind(module0732.$ic34$, var456);
                    if (module0732.NIL == var458) {
                        SubLObject var95_534 = module0259.f16848(var461, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                        SubLObject var464 = (SubLObject)module0732.NIL;
                        var464 = var95_534.first();
                        while (module0732.NIL == var458 && module0732.NIL != var95_534) {
                            final SubLObject var465 = f44992(var464);
                            if (module0732.NIL != var465 && module0732.NIL == var458) {
                                SubLObject var95_535 = module0219.f14509(var248, var465, var464, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                SubLObject var466 = (SubLObject)module0732.NIL;
                                var466 = var95_535.first();
                                while (module0732.NIL == var458 && module0732.NIL != var95_535) {
                                    final SubLObject var467 = var466;
                                    if (module0732.NIL == conses_high.member(var467, var457, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                        var457 = (SubLObject)ConsesLow.cons(var467, var457);
                                    }
                                    if (module0732.NIL != var459 && Sequences.length(var457).numGE(var455)) {
                                        var458 = (SubLObject)module0732.T;
                                    }
                                    var95_535 = var95_535.rest();
                                    var466 = var95_535.first();
                                }
                            }
                            var95_534 = var95_534.rest();
                            var464 = var95_534.first();
                        }
                    }
                    if (module0732.NIL != module0158.f10274(var248, (SubLObject)module0732.$ic93$)) {
                        final SubLObject var468 = module0158.f10275(var248);
                        SubLObject var469 = (SubLObject)module0732.NIL;
                        try {
                            var469 = module0158.f10316(var468, (SubLObject)module0732.$ic93$, (SubLObject)module0732.$ic210$, (SubLObject)module0732.NIL);
                            SubLObject var470 = (SubLObject)module0732.NIL;
                            final SubLObject var471 = (SubLObject)module0732.NIL;
                            while (module0732.NIL == var470) {
                                final SubLObject var466 = module0052.f3695(var469, var471);
                                final SubLObject var472 = (SubLObject)SubLObjectFactory.makeBoolean(!var471.eql(var466));
                                if (module0732.NIL != var472 && module0732.NIL != module0158.f10280(var466) && module0178.f11333(var466).eql(module0732.$ic211$) && module0732.NIL != module0205.f13220(var248, var466, (SubLObject)module0732.T, Symbols.symbol_function((SubLObject)module0732.EQ), (SubLObject)module0732.$ic212$)) {
                                    final SubLObject var473 = var466;
                                    if (module0732.NIL == conses_high.member(var473, var457, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                                        var457 = (SubLObject)ConsesLow.cons(var473, var457);
                                    }
                                }
                                var470 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var472);
                            }
                        }
                        finally {
                            final SubLObject var50_536 = Threads.$is_thread_performing_cleanupP$.currentBinding(var456);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0732.T, var456);
                                if (module0732.NIL != var469) {
                                    module0158.f10319(var469);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var50_536, var456);
                            }
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var463, var456);
                    module0147.$g2094$.rebind(var462, var456);
                }
                var460 = var460.rest();
                var461 = var460.first();
            }
        }
        return var457;
    }
    
    public static SubLObject f45096(final SubLObject var150, SubLObject var4, SubLObject var537) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = (SubLObject)module0732.NIL;
        }
        if (var537 == module0732.UNPROVIDED) {
            var537 = (SubLObject)module0732.NIL;
        }
        final SubLThread var538 = SubLProcess.currentSubLThread();
        if (module0732.NIL == module0173.f10955(var150)) {
            return (SubLObject)module0732.NIL;
        }
        SubLObject var539 = (SubLObject)module0732.NIL;
        final SubLObject var540 = module0147.$g2094$.currentBinding(var538);
        final SubLObject var541 = module0147.$g2095$.currentBinding(var538);
        try {
            module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var538);
            module0147.$g2095$.bind(module0732.$ic34$, var538);
            final SubLObject var542 = var4;
            final SubLObject var50_538 = module0147.$g2095$.currentBinding(var538);
            final SubLObject var52_539 = module0147.$g2094$.currentBinding(var538);
            final SubLObject var543 = module0147.$g2096$.currentBinding(var538);
            try {
                module0147.$g2095$.bind(module0147.f9545(var542), var538);
                module0147.$g2094$.bind(module0147.f9546(var542), var538);
                module0147.$g2096$.bind(module0147.f9549(var542), var538);
                if (module0732.NIL == var537) {
                    final SubLObject var544 = constants_high_oc.f10737((SubLObject)module0732.$ic219$);
                    if (module0732.NIL != constant_handles_oc.f8463(var544, (SubLObject)module0732.UNPROVIDED)) {
                        var539 = module0219.f14509(var150, (SubLObject)module0732.ONE_INTEGER, var544, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                    }
                    SubLObject var545 = module0219.f14509(var150, (SubLObject)module0732.ONE_INTEGER, module0732.$ic220$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                    SubLObject var546 = (SubLObject)module0732.NIL;
                    var546 = var545.first();
                    while (module0732.NIL != var545) {
                        var539 = (SubLObject)ConsesLow.cons(var546, var539);
                        var545 = var545.rest();
                        var546 = var545.first();
                    }
                }
                if (module0732.NIL != var537 || module0732.NIL != module0751.f46605()) {
                    SubLObject var545 = module0219.f14509(var150, (SubLObject)module0732.ONE_INTEGER, module0732.$ic221$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                    SubLObject var546 = (SubLObject)module0732.NIL;
                    var546 = var545.first();
                    while (module0732.NIL != var545) {
                        var539 = (SubLObject)ConsesLow.cons(var546, var539);
                        var545 = var545.rest();
                        var546 = var545.first();
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var543, var538);
                module0147.$g2094$.rebind(var52_539, var538);
                module0147.$g2095$.rebind(var50_538, var538);
            }
        }
        finally {
            module0147.$g2095$.rebind(var541, var538);
            module0147.$g2094$.rebind(var540, var538);
        }
        if (module0732.NIL != module0751.f46600()) {
            var539 = Sequences.nreverse(var539);
        }
        return var539;
    }
    
    public static SubLObject f45097(final SubLObject var150, SubLObject var4, SubLObject var537, SubLObject var541) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0584.$g4396$.getDynamicValue();
        }
        if (var537 == module0732.UNPROVIDED) {
            var537 = (SubLObject)module0732.NIL;
        }
        if (var541 == module0732.UNPROVIDED) {
            var541 = (SubLObject)module0732.$ic5$;
        }
        final SubLThread var542 = SubLProcess.currentSubLThread();
        if (module0732.NIL == module0173.f10955(var150)) {
            return (SubLObject)module0732.NIL;
        }
        SubLObject var543 = (SubLObject)module0732.NIL;
        final SubLObject var544 = module0147.$g2094$.currentBinding(var542);
        final SubLObject var545 = module0147.$g2095$.currentBinding(var542);
        try {
            module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var542);
            module0147.$g2095$.bind(module0732.$ic34$, var542);
            final SubLObject var546 = var4;
            final SubLObject var50_543 = module0147.$g2095$.currentBinding(var542);
            final SubLObject var52_544 = module0147.$g2094$.currentBinding(var542);
            final SubLObject var547 = module0147.$g2096$.currentBinding(var542);
            try {
                module0147.$g2095$.bind(module0147.f9545(var546), var542);
                module0147.$g2094$.bind(module0147.f9546(var546), var542);
                module0147.$g2096$.bind(module0147.f9549(var546), var542);
                if (module0732.NIL == var537) {
                    final SubLObject var548 = module0732.$ic222$;
                    if (module0732.NIL != constant_handles_oc.f8463(var548, (SubLObject)module0732.UNPROVIDED)) {
                        var543 = (SubLObject)ConsesLow.cons(Mapping.mapcar((SubLObject)module0732.$ic223$, Sort.sort(module0219.f14509(var150, (SubLObject)module0732.ONE_INTEGER, var548, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED), (SubLObject)module0732.$ic224$, (SubLObject)module0732.UNPROVIDED)), var543);
                    }
                    var543 = (SubLObject)ConsesLow.cons(f45098(var150, var541), var543);
                }
                if (module0732.NIL != var537 || module0732.NIL != module0751.f46605()) {
                    final SubLObject var549 = Sort.sort(module0219.f14509(var150, (SubLObject)module0732.ONE_INTEGER, module0732.$ic221$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED), (SubLObject)module0732.$ic224$, (SubLObject)module0732.UNPROVIDED);
                    final SubLObject var550 = Mapping.mapcar((SubLObject)module0732.$ic223$, var549);
                    var543 = (SubLObject)ConsesLow.cons(var550, var543);
                }
            }
            finally {
                module0147.$g2096$.rebind(var547, var542);
                module0147.$g2094$.rebind(var52_544, var542);
                module0147.$g2095$.rebind(var50_543, var542);
            }
        }
        finally {
            module0147.$g2095$.rebind(var545, var542);
            module0147.$g2094$.rebind(var544, var542);
        }
        if (module0732.NIL != module0751.f46600()) {
            var543 = Sequences.nreverse(var543);
        }
        return module0035.delete_if_not((SubLObject)module0732.$ic225$, Functions.apply(Symbols.symbol_function((SubLObject)module0732.$ic226$), var543), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45098(final SubLObject var150, final SubLObject var541) {
        SubLObject var542 = (SubLObject)module0732.NIL;
        SubLObject var543 = (SubLObject)module0732.$ic228$;
        SubLObject var544 = (SubLObject)module0732.NIL;
        var544 = var543.first();
        while (module0732.NIL != var543) {
            final SubLObject var545 = Equality.eql(var544, module0732.$ic227$);
            if (module0732.NIL != constant_handles_oc.f8463(var544, (SubLObject)module0732.UNPROVIDED)) {
                SubLObject var9_548 = module0219.f14509(var150, (SubLObject)module0732.ONE_INTEGER, var544, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                SubLObject var546 = (SubLObject)module0732.NIL;
                var546 = var9_548.first();
                while (module0732.NIL != var9_548) {
                    if (module0732.NIL == var545 || module0732.NIL != f45099(module0178.f11335(var546), var541)) {
                        var542 = (SubLObject)ConsesLow.cons((module0732.NIL != var545) ? module0178.f11336(var546) : module0178.f11335(var546), var542);
                    }
                    var9_548 = var9_548.rest();
                    var546 = var9_548.first();
                }
            }
            var543 = var543.rest();
            var544 = var543.first();
        }
        final SubLObject var547 = module0732.$ic229$;
        if (module0732.NIL != module0158.f10010(var150, (SubLObject)module0732.NIL, var547)) {
            final SubLObject var548 = module0158.f10011(var150, (SubLObject)module0732.NIL, var547);
            SubLObject var549 = (SubLObject)module0732.NIL;
            final SubLObject var550 = (SubLObject)module0732.NIL;
            while (module0732.NIL == var549) {
                final SubLObject var551 = module0052.f3695(var548, var550);
                final SubLObject var552 = (SubLObject)SubLObjectFactory.makeBoolean(!var550.eql(var551));
                if (module0732.NIL != var552) {
                    SubLObject var553 = (SubLObject)module0732.NIL;
                    try {
                        var553 = module0158.f10316(var551, (SubLObject)module0732.$ic93$, (SubLObject)module0732.$ic210$, (SubLObject)module0732.NIL);
                        SubLObject var153_550 = (SubLObject)module0732.NIL;
                        final SubLObject var154_551 = (SubLObject)module0732.NIL;
                        while (module0732.NIL == var153_550) {
                            final SubLObject var554 = module0052.f3695(var553, var154_551);
                            final SubLObject var156_553 = (SubLObject)SubLObjectFactory.makeBoolean(!var154_551.eql(var554));
                            if (module0732.NIL != var156_553) {
                                var542 = (SubLObject)ConsesLow.cons(var554, var542);
                            }
                            var153_550 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var156_553);
                        }
                    }
                    finally {
                        final SubLObject var555 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0732.T);
                            if (module0732.NIL != var553) {
                                module0158.f10319(var553);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var555);
                        }
                    }
                }
                var549 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var552);
            }
        }
        return Mapping.mapcar((SubLObject)module0732.$ic223$, Sort.stable_sort(var542, (SubLObject)module0732.$ic230$, (SubLObject)module0732.UNPROVIDED));
    }
    
    public static SubLObject f45100(final SubLObject var554, final SubLObject var555) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL != assertion_handles_oc.f11035(var554) && module0732.NIL != assertion_handles_oc.f11035(var555) && module0732.NIL != module0730.f44608(var554, var555));
    }
    
    public static SubLObject f45099(final SubLObject var556, final SubLObject var541) {
        if (module0732.$ic5$.eql(var541)) {
            return (SubLObject)module0732.T;
        }
        if (module0732.NIL != module0035.f2012(var541)) {
            return (SubLObject)module0732.NIL;
        }
        if (module0732.NIL != module0731.f44656(var556, (SubLObject)module0732.UNPROVIDED)) {
            return module0035.f2013(module0751.f47099(var541, f44924(var556, (SubLObject)module0732.UNPROVIDED), (SubLObject)module0732.UNPROVIDED));
        }
        return module0035.f2013(module0751.f47099(var541, (SubLObject)ConsesLow.list(var556), (SubLObject)module0732.UNPROVIDED));
    }
    
    public static SubLObject f45101(final SubLObject var190) {
        if (module0732.NIL != module0178.f11284(var190) && module0178.f11333(var190).eql(module0732.$ic229$)) {
            return module0202.f12683(module0732.$ic231$, module0178.f11330(var190), (SubLObject)module0732.UNPROVIDED);
        }
        if (module0732.NIL != module0202.f12883(var190, (SubLObject)module0732.UNPROVIDED)) {
            return module0205.f13204(var190, (SubLObject)module0732.UNPROVIDED);
        }
        return module0205.f13144(var190);
    }
    
    public static SubLObject f45102(final SubLObject var248) {
        final SubLObject var249 = f45086(var248);
        SubLObject var250 = (SubLObject)module0732.NIL;
        if (module0732.NIL != var249) {
            SubLObject var251 = var249;
            SubLObject var252 = (SubLObject)module0732.NIL;
            var252 = var251.first();
            while (module0732.NIL != var251) {
                if (module0732.NIL != module0004.f104(module0178.f11303(var252).first(), module0259.f16848(module0732.$ic195$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                    var250 = (SubLObject)ConsesLow.cons(var252, var250);
                }
                var251 = var251.rest();
                var252 = var251.first();
            }
        }
        return var250;
    }
    
    public static SubLObject f45103(final SubLObject var248) {
        final SubLObject var249 = f45086(var248);
        SubLObject var250 = (SubLObject)module0732.NIL;
        if (module0732.NIL != var249) {
            SubLObject var251 = var249;
            SubLObject var252 = (SubLObject)module0732.NIL;
            var252 = var251.first();
            while (module0732.NIL != var251) {
                if (module0732.NIL != module0004.f104(module0178.f11303(var252).first(), module0259.f16848(module0732.$ic232$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                    var250 = (SubLObject)ConsesLow.cons(var252, var250);
                }
                var251 = var251.rest();
                var252 = var251.first();
            }
        }
        return var250;
    }
    
    public static SubLObject f45104(final SubLObject var150) {
        final SubLObject var151 = f45102(var150).first();
        SubLObject var152 = (SubLObject)module0732.NIL;
        if (module0732.NIL != module0178.f11284(var151)) {
            var152 = module0178.f11335(var151);
        }
        return var152;
    }
    
    public static SubLObject f45105(final SubLObject var248, SubLObject var451) {
        if (var451 == module0732.UNPROVIDED) {
            var451 = (SubLObject)module0732.T;
        }
        final SubLThread var452 = SubLProcess.currentSubLThread();
        SubLObject var453 = (SubLObject)module0732.NIL;
        SubLObject var454 = (SubLObject)module0732.NIL;
        final SubLObject var455 = module0147.$g2094$.currentBinding(var452);
        final SubLObject var456 = module0147.$g2095$.currentBinding(var452);
        try {
            module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var452);
            module0147.$g2095$.bind(module0732.$ic34$, var452);
            var453 = Sequences.remove_duplicates(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0732.$ic233$), module0219.f14512(module0732.$ic96$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
            if (module0732.NIL == var451) {
                var453 = conses_high.set_difference(var453, module0259.f16848(module0732.$ic195$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
            }
            SubLObject var457 = var453;
            SubLObject var458 = (SubLObject)module0732.NIL;
            var458 = var457.first();
            while (module0732.NIL != var457) {
                final SubLObject var459 = f44992(var458);
                if (module0732.NIL != module0220.f14562(var248, var458, var459, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                    var454 = ConsesLow.append(var454, module0219.f14509(var248, var459, var458, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED));
                }
                var457 = var457.rest();
                var458 = var457.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var456, var452);
            module0147.$g2094$.rebind(var455, var452);
        }
        return var454;
    }
    
    public static SubLObject f45106(final SubLObject var248) {
        final SubLThread var249 = SubLProcess.currentSubLThread();
        SubLObject var250 = (SubLObject)module0732.NIL;
        SubLObject var251 = (SubLObject)module0732.NIL;
        final SubLObject var252 = module0147.$g2094$.currentBinding(var249);
        final SubLObject var253 = module0147.$g2095$.currentBinding(var249);
        try {
            module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var249);
            module0147.$g2095$.bind(module0732.$ic34$, var249);
            SubLObject var254;
            var250 = (var254 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0732.$ic233$), module0219.f14512(module0732.$ic99$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)));
            SubLObject var255 = (SubLObject)module0732.NIL;
            var255 = var254.first();
            while (module0732.NIL != var254) {
                SubLObject var9_559;
                final SubLObject var256 = var9_559 = module0218.f14449((SubLObject)ConsesLow.list(var248, var255), (SubLObject)module0732.T);
                SubLObject var257 = (SubLObject)module0732.NIL;
                var257 = var9_559.first();
                while (module0732.NIL != var9_559) {
                    if (module0205.f13136(module0178.f11303(var257)).eql(var255)) {
                        var251 = (SubLObject)ConsesLow.cons(var257, var251);
                    }
                    var9_559 = var9_559.rest();
                    var257 = var9_559.first();
                }
                var254 = var254.rest();
                var255 = var254.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var253, var249);
            module0147.$g2094$.rebind(var252, var249);
        }
        return Sequences.remove_duplicates(var251, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45107(final SubLObject var248, SubLObject var451) {
        if (var451 == module0732.UNPROVIDED) {
            var451 = (SubLObject)module0732.T;
        }
        final SubLThread var452 = SubLProcess.currentSubLThread();
        SubLObject var453 = (SubLObject)module0732.NIL;
        SubLObject var454 = (SubLObject)module0732.NIL;
        final SubLObject var455 = module0147.$g2094$.currentBinding(var452);
        final SubLObject var456 = module0147.$g2095$.currentBinding(var452);
        try {
            module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var452);
            module0147.$g2095$.bind(module0732.$ic34$, var452);
            var453 = conses_high.union(module0256.f16552(var248, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED), module0259.f16848(var248, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var456, var452);
            module0147.$g2094$.rebind(var455, var452);
        }
        SubLObject var457 = var453;
        SubLObject var458 = (SubLObject)module0732.NIL;
        var458 = var457.first();
        while (module0732.NIL != var457) {
            if (module0732.NIL != f45087(var458, var451) && module0732.NIL == module0259.f16975(var458, module0732.$ic234$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == module0259.f16975(var458, module0732.$ic235$, module0732.$ic236$, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == module0259.f16975(var458, module0732.$ic237$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                var454 = (SubLObject)ConsesLow.cons(var458, var454);
            }
            var457 = var457.rest();
            var458 = var457.first();
        }
        return var454;
    }
    
    public static SubLObject f45108() {
        SubLObject var562 = (SubLObject)module0732.NIL;
        SubLObject var563 = (SubLObject)module0732.NIL;
        SubLObject var564;
        var562 = (var564 = module0220.f14563(module0732.$ic25$, module0732.$ic14$, module0732.$ic9$, (SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.UNPROVIDED));
        SubLObject var565 = (SubLObject)module0732.NIL;
        var565 = var564.first();
        while (module0732.NIL != var564) {
            if (module0732.NIL == module0220.f14563(var565, module0732.$ic238$, module0732.$ic9$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                final SubLObject var566 = var565;
                if (module0732.NIL == conses_high.member(var566, var563, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                    var563 = (SubLObject)ConsesLow.cons(var566, var563);
                }
            }
            var564 = var564.rest();
            var565 = var564.first();
        }
        return var563;
    }
    
    public static SubLObject f45109() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0732.ZERO_INTEGER;
        final SubLObject var46 = module0147.$g2094$.currentBinding(var44);
        final SubLObject var47 = module0147.$g2095$.currentBinding(var44);
        try {
            module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var44);
            module0147.$g2095$.bind(module0732.$ic34$, var44);
            final SubLObject var48 = module0732.$ic14$;
            if (module0732.NIL != module0158.f10010(module0732.$ic25$, (SubLObject)module0732.TWO_INTEGER, var48)) {
                final SubLObject var49 = module0158.f10011(module0732.$ic25$, (SubLObject)module0732.TWO_INTEGER, var48);
                SubLObject var50 = (SubLObject)module0732.NIL;
                final SubLObject var51 = (SubLObject)module0732.NIL;
                while (module0732.NIL == var50) {
                    final SubLObject var52 = module0052.f3695(var49, var51);
                    final SubLObject var53 = (SubLObject)SubLObjectFactory.makeBoolean(!var51.eql(var52));
                    if (module0732.NIL != var53) {
                        SubLObject var54 = (SubLObject)module0732.NIL;
                        try {
                            var54 = module0158.f10316(var52, (SubLObject)module0732.$ic93$, (SubLObject)module0732.NIL, (SubLObject)module0732.NIL);
                            SubLObject var153_564 = (SubLObject)module0732.NIL;
                            final SubLObject var154_565 = (SubLObject)module0732.NIL;
                            while (module0732.NIL == var153_564) {
                                final SubLObject var55 = module0052.f3695(var54, var154_565);
                                final SubLObject var156_566 = (SubLObject)SubLObjectFactory.makeBoolean(!var154_565.eql(var55));
                                if (module0732.NIL != var156_566) {
                                    final SubLObject var56 = module0178.f11334(var55);
                                    final SubLObject var57 = module0178.f11336(var55);
                                    final SubLObject var58 = module0220.f14601(var56, module0732.$ic15$, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic239$, (SubLObject)module0732.UNPROVIDED);
                                    SubLObject var59 = (SubLObject)module0732.NIL;
                                    if (module0732.NIL == var59) {
                                        SubLObject var60 = var58;
                                        SubLObject var61 = (SubLObject)module0732.NIL;
                                        var61 = var60.first();
                                        while (module0732.NIL == var59 && module0732.NIL != var60) {
                                            if (conses_high.second(var61).eql(var57) && var61.first().eql(module0732.$ic25$)) {
                                                var59 = (SubLObject)module0732.T;
                                            }
                                            var60 = var60.rest();
                                            var61 = var60.first();
                                        }
                                    }
                                    if (module0732.NIL == var59) {
                                        var45 = Numbers.add(var45, (SubLObject)module0732.ONE_INTEGER);
                                        PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic240$, module0178.f11303(var55), module0178.f11287(var55));
                                    }
                                }
                                var153_564 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var156_566);
                            }
                        }
                        finally {
                            final SubLObject var50_570 = Threads.$is_thread_performing_cleanupP$.currentBinding(var44);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0732.T, var44);
                                if (module0732.NIL != var54) {
                                    module0158.f10319(var54);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var50_570, var44);
                            }
                        }
                    }
                    var50 = (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var53);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var47, var44);
            module0147.$g2094$.rebind(var46, var44);
        }
        return var45;
    }
    
    public static SubLObject f45110(final SubLObject var7, SubLObject var3) {
        if (var3 == module0732.UNPROVIDED) {
            var3 = module0732.$ic25$;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)module0732.NIL;
        SubLObject var10 = (SubLObject)module0732.NIL;
        final SubLObject var11 = module0147.$g2094$.currentBinding(var8);
        final SubLObject var12 = module0147.$g2095$.currentBinding(var8);
        try {
            module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var8);
            module0147.$g2095$.bind(module0732.$ic34$, var8);
            var9 = module0256.f16552(var7, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var12, var8);
            module0147.$g2094$.rebind(var11, var8);
        }
        SubLObject var13 = var9;
        SubLObject var14 = (SubLObject)module0732.NIL;
        var14 = var13.first();
        while (module0732.NIL != var13) {
            SubLObject var9_573;
            final SubLObject var15 = var9_573 = module0219.f14509(var14, (SubLObject)module0732.FOUR_INTEGER, module0732.$ic14$, module0732.$ic9$, (SubLObject)module0732.UNPROVIDED);
            SubLObject var16 = (SubLObject)module0732.NIL;
            var16 = var9_573.first();
            while (module0732.NIL != var9_573) {
                if (module0178.f11335(var16).eql(var3)) {
                    var10 = (SubLObject)ConsesLow.cons(module0178.f11334(var16), var10);
                }
                var9_573 = var9_573.rest();
                var16 = var9_573.first();
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return var10;
    }
    
    public static SubLObject f45111(final SubLObject var3) {
        final SubLObject var4 = module0220.f14563(var3, module0732.$ic14$, module0732.$ic9$, (SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.UNPROVIDED);
        SubLObject var5 = (SubLObject)module0732.NIL;
        SubLObject var6 = var4;
        SubLObject var7 = (SubLObject)module0732.NIL;
        var7 = var6.first();
        while (module0732.NIL != var6) {
            final SubLObject var8 = module0219.f14509(var7, (SubLObject)module0732.ONE_INTEGER, module0732.$ic241$, module0732.$ic9$, (SubLObject)module0732.UNPROVIDED);
            if (module0732.NIL == var8) {
                final SubLObject var9 = var7;
                if (module0732.NIL == conses_high.member(var9, var5, Symbols.symbol_function((SubLObject)module0732.EQL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                    var5 = (SubLObject)ConsesLow.cons(var9, var5);
                }
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return var5;
    }
    
    public static SubLObject f45112(final SubLObject var577, SubLObject var4) {
        if (var4 == module0732.UNPROVIDED) {
            var4 = module0732.$ic9$;
        }
        if (module0732.NIL != var577) {
            SubLObject var578 = (SubLObject)module0732.NIL;
            try {
                var578 = compatibility.open_text(var577, (SubLObject)module0732.$ic242$);
                if (!var578.isStream()) {
                    Errors.error((SubLObject)module0732.$ic176$, var577);
                }
                final SubLObject var354_579 = var578;
                SubLObject var579 = (SubLObject)module0732.$ic248$;
                SubLObject var580 = (SubLObject)module0732.NIL;
                var580 = var579.first();
                while (module0732.NIL != var579) {
                    final SubLObject var581 = ConsesLow.append(module0220.f14563(var580, module0732.$ic14$, var4, (SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.UNPROVIDED), module0220.f14563(var580, module0732.$ic243$, var4, (SubLObject)module0732.THREE_INTEGER, (SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.UNPROVIDED), module0220.f14563(var580, module0732.$ic244$, var4, (SubLObject)module0732.THREE_INTEGER, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.UNPROVIDED));
                    SubLObject var9_580 = Sequences.remove_duplicates(var581, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                    SubLObject var582 = (SubLObject)module0732.NIL;
                    var582 = var9_580.first();
                    while (module0732.NIL != var9_580) {
                        if (module0732.NIL == module0220.f14579(module0732.$ic241$, var582, var580, module0732.$ic9$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED) && (var4.eql(module0732.$ic9$) || module0732.NIL == module0220.f14579(module0732.$ic241$, var582, var580, var4, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED))) {
                            PrintLow.format(var354_579, (SubLObject)module0732.$ic245$, new SubLObject[] { var582, var580, var4 });
                            streams_high.terpri(var354_579);
                            print_high.princ((SubLObject)module0732.$ic246$, var354_579);
                            streams_high.terpri(var354_579);
                            streams_high.terpri(var354_579);
                            final SubLObject var583 = f44924(var580, (SubLObject)module0732.UNPROVIDED).first();
                            final SubLObject var584 = Strings.string_downcase(module0038.f2752(module0597.f36628(var582), (SubLObject)module0732.$ic173$).first(), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                            final SubLObject var585 = (module0732.NIL != module0220.f14545(var582, module0732.$ic241$, var4, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? var4 : module0732.$ic9$;
                            PrintLow.format(var354_579, (SubLObject)module0732.$ic247$, new SubLObject[] { var583, var582, var584, var585 });
                            streams_high.terpri(var354_579);
                            streams_high.terpri(var354_579);
                        }
                        var9_580 = var9_580.rest();
                        var582 = var9_580.first();
                    }
                    var579 = var579.rest();
                    var580 = var579.first();
                }
            }
            finally {
                final SubLObject var586 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0732.T);
                    if (var578.isStream()) {
                        streams_high.close(var578, (SubLObject)module0732.UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var586);
                }
            }
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45113() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0732.NIL;
        final SubLObject var46 = (SubLObject)module0732.$ic196$;
        final SubLObject var47 = module0173.f10962();
        SubLObject var48 = (SubLObject)module0732.ZERO_INTEGER;
        final SubLObject var49 = module0012.$g75$.currentBinding(var44);
        final SubLObject var50 = module0012.$g76$.currentBinding(var44);
        final SubLObject var51 = module0012.$g77$.currentBinding(var44);
        final SubLObject var52 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)module0732.ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)module0732.NIL, var44);
            module0012.$g77$.bind((SubLObject)module0732.T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var46);
            SubLObject var53 = module0173.f10961();
            SubLObject var54 = (SubLObject)module0732.NIL;
            var54 = var53.first();
            while (module0732.NIL != var53) {
                final SubLObject var55 = var54;
                if (module0732.NIL == module0065.f4772(var55, (SubLObject)module0732.$ic197$)) {
                    final SubLObject var434_583 = var55;
                    if (module0732.NIL == module0065.f4775(var434_583, (SubLObject)module0732.$ic197$)) {
                        final SubLObject var56 = module0065.f4740(var434_583);
                        final SubLObject var57 = (SubLObject)module0732.NIL;
                        SubLObject var58;
                        SubLObject var59;
                        SubLObject var60;
                        SubLObject var61;
                        SubLObject var50_584;
                        SubLObject var52_585;
                        SubLObject var62;
                        SubLObject var9_587;
                        SubLObject var63;
                        SubLObject var64;
                        SubLObject var9_588;
                        SubLObject var65;
                        SubLObject var66;
                        for (var58 = Sequences.length(var56), var59 = (SubLObject)module0732.NIL, var59 = (SubLObject)module0732.ZERO_INTEGER; var59.numL(var58); var59 = Numbers.add(var59, (SubLObject)module0732.ONE_INTEGER)) {
                            var60 = ((module0732.NIL != var57) ? Numbers.subtract(var58, var59, (SubLObject)module0732.ONE_INTEGER) : var59);
                            var61 = Vectors.aref(var56, var60);
                            if (module0732.NIL == module0065.f4749(var61) || module0732.NIL == module0065.f4773((SubLObject)module0732.$ic197$)) {
                                if (module0732.NIL != module0065.f4749(var61)) {
                                    var61 = (SubLObject)module0732.$ic197$;
                                }
                                var48 = Numbers.add(var48, (SubLObject)module0732.ONE_INTEGER);
                                module0012.note_percent_progress(var48, var47);
                                var50_584 = module0147.$g2094$.currentBinding(var44);
                                var52_585 = module0147.$g2095$.currentBinding(var44);
                                try {
                                    module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var44);
                                    module0147.$g2095$.bind(module0732.$ic34$, var44);
                                    var62 = module0226.f15146(var61, module0732.$ic249$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                    if (Sequences.length(var62).numG((SubLObject)module0732.ONE_INTEGER)) {
                                        var9_587 = var62;
                                        var63 = (SubLObject)module0732.NIL;
                                        var63 = var9_587.first();
                                        while (module0732.NIL != var9_587) {
                                            var64 = module0178.f11335(var63);
                                            var9_588 = Sequences.remove(var63, var62, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                            var65 = (SubLObject)module0732.NIL;
                                            var65 = var9_588.first();
                                            while (module0732.NIL != var9_588) {
                                                var66 = module0178.f11335(var65);
                                                if (var64.isString() && var66.isString() && var64.equalp(var66) && module0732.NIL != Strings.stringL(var64, var66, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                    PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic240$, module0178.f11303(var63), module0178.f11287(var63));
                                                    PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic250$, module0178.f11303(var65), module0178.f11287(var65));
                                                    var45 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, var65), var45);
                                                }
                                                var9_588 = var9_588.rest();
                                                var65 = var9_588.first();
                                            }
                                            var9_587 = var9_587.rest();
                                            var63 = var9_587.first();
                                        }
                                    }
                                }
                                finally {
                                    module0147.$g2095$.rebind(var52_585, var44);
                                    module0147.$g2094$.rebind(var50_584, var44);
                                }
                            }
                        }
                    }
                    final SubLObject var445_591 = var55;
                    if (module0732.NIL == module0065.f4777(var445_591) || module0732.NIL == module0065.f4773((SubLObject)module0732.$ic197$)) {
                        final SubLObject var67 = module0065.f4738(var445_591);
                        SubLObject var68 = module0065.f4739(var445_591);
                        final SubLObject var69 = module0065.f4734(var445_591);
                        final SubLObject var70 = (SubLObject)((module0732.NIL != module0065.f4773((SubLObject)module0732.$ic197$)) ? module0732.NIL : module0732.$ic197$);
                        while (var68.numL(var69)) {
                            final SubLObject var71 = Hashtables.gethash_without_values(var68, var67, var70);
                            if (module0732.NIL == module0065.f4773((SubLObject)module0732.$ic197$) || module0732.NIL == module0065.f4749(var71)) {
                                var48 = Numbers.add(var48, (SubLObject)module0732.ONE_INTEGER);
                                module0012.note_percent_progress(var48, var47);
                                final SubLObject var50_585 = module0147.$g2094$.currentBinding(var44);
                                final SubLObject var52_586 = module0147.$g2095$.currentBinding(var44);
                                try {
                                    module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var44);
                                    module0147.$g2095$.bind(module0732.$ic34$, var44);
                                    final SubLObject var72 = module0226.f15146(var71, module0732.$ic249$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                    if (Sequences.length(var72).numG((SubLObject)module0732.ONE_INTEGER)) {
                                        SubLObject var9_589 = var72;
                                        SubLObject var73 = (SubLObject)module0732.NIL;
                                        var73 = var9_589.first();
                                        while (module0732.NIL != var9_589) {
                                            final SubLObject var74 = module0178.f11335(var73);
                                            SubLObject var9_590 = Sequences.remove(var73, var72, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                            SubLObject var75 = (SubLObject)module0732.NIL;
                                            var75 = var9_590.first();
                                            while (module0732.NIL != var9_590) {
                                                final SubLObject var76 = module0178.f11335(var75);
                                                if (var74.isString() && var76.isString() && var74.equalp(var76) && module0732.NIL != Strings.stringL(var74, var76, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                    PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic240$, module0178.f11303(var73), module0178.f11287(var73));
                                                    PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic250$, module0178.f11303(var75), module0178.f11287(var75));
                                                    var45 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var73, var75), var45);
                                                }
                                                var9_590 = var9_590.rest();
                                                var75 = var9_590.first();
                                            }
                                            var9_589 = var9_589.rest();
                                            var73 = var9_589.first();
                                        }
                                    }
                                }
                                finally {
                                    module0147.$g2095$.rebind(var52_586, var44);
                                    module0147.$g2094$.rebind(var50_585, var44);
                                }
                            }
                            var68 = Numbers.add(var68, (SubLObject)module0732.ONE_INTEGER);
                        }
                    }
                }
                var53 = var53.rest();
                var54 = var53.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var52, var44);
            module0012.$g77$.rebind(var51, var44);
            module0012.$g76$.rebind(var50, var44);
            module0012.$g75$.rebind(var49, var44);
        }
        return var45;
    }
    
    public static SubLObject f45114() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0732.NIL;
        final SubLObject var46 = (SubLObject)module0732.$ic196$;
        final SubLObject var47 = module0173.f10962();
        SubLObject var48 = (SubLObject)module0732.ZERO_INTEGER;
        final SubLObject var49 = module0012.$g75$.currentBinding(var44);
        final SubLObject var50 = module0012.$g76$.currentBinding(var44);
        final SubLObject var51 = module0012.$g77$.currentBinding(var44);
        final SubLObject var52 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)module0732.ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)module0732.NIL, var44);
            module0012.$g77$.bind((SubLObject)module0732.T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var46);
            SubLObject var53 = module0173.f10961();
            SubLObject var54 = (SubLObject)module0732.NIL;
            var54 = var53.first();
            while (module0732.NIL != var53) {
                final SubLObject var55 = var54;
                if (module0732.NIL == module0065.f4772(var55, (SubLObject)module0732.$ic197$)) {
                    final SubLObject var434_596 = var55;
                    if (module0732.NIL == module0065.f4775(var434_596, (SubLObject)module0732.$ic197$)) {
                        final SubLObject var56 = module0065.f4740(var434_596);
                        final SubLObject var57 = (SubLObject)module0732.NIL;
                        SubLObject var58;
                        SubLObject var59;
                        SubLObject var60;
                        SubLObject var61;
                        SubLObject var50_597;
                        SubLObject var52_598;
                        SubLObject var9_599;
                        SubLObject var62;
                        SubLObject var63;
                        SubLObject var64;
                        for (var58 = Sequences.length(var56), var59 = (SubLObject)module0732.NIL, var59 = (SubLObject)module0732.ZERO_INTEGER; var59.numL(var58); var59 = Numbers.add(var59, (SubLObject)module0732.ONE_INTEGER)) {
                            var60 = ((module0732.NIL != var57) ? Numbers.subtract(var58, var59, (SubLObject)module0732.ONE_INTEGER) : var59);
                            var61 = Vectors.aref(var56, var60);
                            if (module0732.NIL == module0065.f4749(var61) || module0732.NIL == module0065.f4773((SubLObject)module0732.$ic197$)) {
                                if (module0732.NIL != module0065.f4749(var61)) {
                                    var61 = (SubLObject)module0732.$ic197$;
                                }
                                var48 = Numbers.add(var48, (SubLObject)module0732.ONE_INTEGER);
                                module0012.note_percent_progress(var48, var47);
                                var50_597 = module0147.$g2094$.currentBinding(var44);
                                var52_598 = module0147.$g2095$.currentBinding(var44);
                                try {
                                    module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var44);
                                    module0147.$g2095$.bind(module0732.$ic34$, var44);
                                    var62 = (var9_599 = module0226.f15146(var61, module0732.$ic249$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED));
                                    var63 = (SubLObject)module0732.NIL;
                                    var63 = var9_599.first();
                                    while (module0732.NIL != var9_599) {
                                        var64 = module0178.f11335(var63);
                                        if (var64.isString() && module0732.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)module0732.$ic251$), var64, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                            var45 = (SubLObject)ConsesLow.cons(var63, var45);
                                            PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic252$, module0178.f11303(var63));
                                        }
                                        var9_599 = var9_599.rest();
                                        var63 = var9_599.first();
                                    }
                                }
                                finally {
                                    module0147.$g2095$.rebind(var52_598, var44);
                                    module0147.$g2094$.rebind(var50_597, var44);
                                }
                            }
                        }
                    }
                    final SubLObject var445_600 = var55;
                    if (module0732.NIL == module0065.f4777(var445_600) || module0732.NIL == module0065.f4773((SubLObject)module0732.$ic197$)) {
                        final SubLObject var65 = module0065.f4738(var445_600);
                        SubLObject var66 = module0065.f4739(var445_600);
                        final SubLObject var67 = module0065.f4734(var445_600);
                        final SubLObject var68 = (SubLObject)((module0732.NIL != module0065.f4773((SubLObject)module0732.$ic197$)) ? module0732.NIL : module0732.$ic197$);
                        while (var66.numL(var67)) {
                            final SubLObject var69 = Hashtables.gethash_without_values(var66, var65, var68);
                            if (module0732.NIL == module0065.f4773((SubLObject)module0732.$ic197$) || module0732.NIL == module0065.f4749(var69)) {
                                var48 = Numbers.add(var48, (SubLObject)module0732.ONE_INTEGER);
                                module0012.note_percent_progress(var48, var47);
                                final SubLObject var50_598 = module0147.$g2094$.currentBinding(var44);
                                final SubLObject var52_599 = module0147.$g2095$.currentBinding(var44);
                                try {
                                    module0147.$g2094$.bind((SubLObject)module0732.$ic33$, var44);
                                    module0147.$g2095$.bind(module0732.$ic34$, var44);
                                    SubLObject var9_600;
                                    final SubLObject var70 = var9_600 = module0226.f15146(var69, module0732.$ic249$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                    SubLObject var71 = (SubLObject)module0732.NIL;
                                    var71 = var9_600.first();
                                    while (module0732.NIL != var9_600) {
                                        final SubLObject var72 = module0178.f11335(var71);
                                        if (var72.isString() && module0732.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)module0732.$ic251$), var72, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                            var45 = (SubLObject)ConsesLow.cons(var71, var45);
                                            PrintLow.format((SubLObject)module0732.T, (SubLObject)module0732.$ic252$, module0178.f11303(var71));
                                        }
                                        var9_600 = var9_600.rest();
                                        var71 = var9_600.first();
                                    }
                                }
                                finally {
                                    module0147.$g2095$.rebind(var52_599, var44);
                                    module0147.$g2094$.rebind(var50_598, var44);
                                }
                            }
                            var66 = Numbers.add(var66, (SubLObject)module0732.ONE_INTEGER);
                        }
                    }
                }
                var53 = var53.rest();
                var54 = var53.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var52, var44);
            module0012.$g77$.rebind(var51, var44);
            module0012.$g76$.rebind(var50, var44);
            module0012.$g75$.rebind(var49, var44);
        }
        return var45;
    }
    
    public static SubLObject f45115(SubLObject var354, SubLObject var604) {
        if (var354 == module0732.UNPROVIDED) {
            var354 = (SubLObject)module0732.T;
        }
        if (var604 == module0732.UNPROVIDED) {
            var604 = (SubLObject)module0732.T;
        }
        final SubLThread var605 = SubLProcess.currentSubLThread();
        PrintLow.format(var354, (SubLObject)module0732.$ic253$);
        final SubLObject var606 = (SubLObject)module0732.$ic196$;
        final SubLObject var607 = module0173.f10962();
        SubLObject var608 = (SubLObject)module0732.ZERO_INTEGER;
        final SubLObject var609 = module0012.$g75$.currentBinding(var605);
        final SubLObject var610 = module0012.$g76$.currentBinding(var605);
        final SubLObject var611 = module0012.$g77$.currentBinding(var605);
        final SubLObject var612 = module0012.$g78$.currentBinding(var605);
        try {
            module0012.$g75$.bind((SubLObject)module0732.ZERO_INTEGER, var605);
            module0012.$g76$.bind((SubLObject)module0732.NIL, var605);
            module0012.$g77$.bind((SubLObject)module0732.T, var605);
            module0012.$g78$.bind(Time.get_universal_time(), var605);
            module0012.f478(var606);
            SubLObject var613 = module0173.f10961();
            SubLObject var614 = (SubLObject)module0732.NIL;
            var614 = var613.first();
            while (module0732.NIL != var613) {
                final SubLObject var615 = var614;
                if (module0732.NIL == module0065.f4772(var615, (SubLObject)module0732.$ic197$)) {
                    final SubLObject var434_605 = var615;
                    if (module0732.NIL == module0065.f4775(var434_605, (SubLObject)module0732.$ic197$)) {
                        final SubLObject var616 = module0065.f4740(var434_605);
                        final SubLObject var617 = (SubLObject)module0732.NIL;
                        SubLObject var618;
                        SubLObject var619;
                        SubLObject var620;
                        SubLObject var621;
                        for (var618 = Sequences.length(var616), var619 = (SubLObject)module0732.NIL, var619 = (SubLObject)module0732.ZERO_INTEGER; var619.numL(var618); var619 = Numbers.add(var619, (SubLObject)module0732.ONE_INTEGER)) {
                            var620 = ((module0732.NIL != var617) ? Numbers.subtract(var618, var619, (SubLObject)module0732.ONE_INTEGER) : var619);
                            var621 = Vectors.aref(var616, var620);
                            if (module0732.NIL == module0065.f4749(var621) || module0732.NIL == module0065.f4773((SubLObject)module0732.$ic197$)) {
                                if (module0732.NIL != module0065.f4749(var621)) {
                                    var621 = (SubLObject)module0732.$ic197$;
                                }
                                var608 = Numbers.add(var608, (SubLObject)module0732.ONE_INTEGER);
                                module0012.note_percent_progress(var608, var607);
                                if ((module0732.NIL == var604 || module0732.NIL == module0269.f17704(var621)) && module0732.NIL != f45116(var621)) {
                                    PrintLow.format(var354, (SubLObject)module0732.$ic254$, new SubLObject[] { var621, module0269.f17701(var621, (SubLObject)module0732.UNPROVIDED), Sequences.length(f45086(var621)) });
                                }
                            }
                        }
                    }
                    final SubLObject var445_606 = var615;
                    if (module0732.NIL == module0065.f4777(var445_606) || module0732.NIL == module0065.f4773((SubLObject)module0732.$ic197$)) {
                        final SubLObject var622 = module0065.f4738(var445_606);
                        SubLObject var623 = module0065.f4739(var445_606);
                        final SubLObject var624 = module0065.f4734(var445_606);
                        final SubLObject var625 = (SubLObject)((module0732.NIL != module0065.f4773((SubLObject)module0732.$ic197$)) ? module0732.NIL : module0732.$ic197$);
                        while (var623.numL(var624)) {
                            final SubLObject var626 = Hashtables.gethash_without_values(var623, var622, var625);
                            if (module0732.NIL == module0065.f4773((SubLObject)module0732.$ic197$) || module0732.NIL == module0065.f4749(var626)) {
                                var608 = Numbers.add(var608, (SubLObject)module0732.ONE_INTEGER);
                                module0012.note_percent_progress(var608, var607);
                                if ((module0732.NIL == var604 || module0732.NIL == module0269.f17704(var626)) && module0732.NIL != f45116(var626)) {
                                    PrintLow.format(var354, (SubLObject)module0732.$ic254$, new SubLObject[] { var626, module0269.f17701(var626, (SubLObject)module0732.UNPROVIDED), Sequences.length(f45086(var626)) });
                                }
                            }
                            var623 = Numbers.add(var623, (SubLObject)module0732.ONE_INTEGER);
                        }
                    }
                }
                var613 = var613.rest();
                var614 = var613.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var612, var605);
            module0012.$g77$.rebind(var611, var605);
            module0012.$g76$.rebind(var610, var605);
            module0012.$g75$.rebind(var609, var605);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45116(final SubLObject var150) {
        final SubLThread var151 = SubLProcess.currentSubLThread();
        SubLObject var152 = (SubLObject)module0732.NIL;
        final SubLObject var153 = module0732.$ic255$;
        final SubLObject var154 = module0137.$g1605$.currentBinding(var151);
        final SubLObject var155 = module0139.$g1636$.currentBinding(var151);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0732.$ic191$), var151);
            module0139.$g1636$.bind(module0139.f9007(), var151);
            if (module0732.NIL == var152) {
                SubLObject var386_608 = var153;
                final SubLObject var156 = (SubLObject)module0732.$ic36$;
                final SubLObject var157 = module0056.f4145(var156);
                final SubLObject var50_609 = module0139.$g1635$.currentBinding(var151);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var151);
                    final SubLObject var158 = module0579.$g4260$.getDynamicValue(var151);
                    final SubLObject var50_610 = module0147.$g2095$.currentBinding(var151);
                    final SubLObject var52_611 = module0147.$g2094$.currentBinding(var151);
                    final SubLObject var159 = module0147.$g2096$.currentBinding(var151);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var158), var151);
                        module0147.$g2094$.bind(module0147.f9546(var158), var151);
                        module0147.$g2096$.bind(module0147.f9549(var158), var151);
                        final SubLObject var160 = module0732.$ic256$;
                        final SubLObject var50_611 = module0141.$g1714$.currentBinding(var151);
                        final SubLObject var52_612 = module0141.$g1715$.currentBinding(var151);
                        try {
                            module0141.$g1714$.bind((module0732.NIL != var160) ? var160 : module0141.f9283(), var151);
                            module0141.$g1715$.bind((SubLObject)((module0732.NIL != var160) ? module0732.$ic38$ : module0141.$g1715$.getDynamicValue(var151)), var151);
                            if (module0732.NIL != var160 && module0732.NIL != module0136.f8864() && module0732.NIL == module0141.f9279(var160)) {
                                final SubLObject var161 = module0136.$g1591$.getDynamicValue(var151);
                                if (var161.eql((SubLObject)module0732.$ic39$)) {
                                    module0136.f8870((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic40$, var160, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                                else if (var161.eql((SubLObject)module0732.$ic42$)) {
                                    module0136.f8871((SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var160, (SubLObject)module0732.$ic41$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                                else if (var161.eql((SubLObject)module0732.$ic44$)) {
                                    Errors.warn((SubLObject)module0732.$ic40$, var160, (SubLObject)module0732.$ic41$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0732.$ic45$, module0136.$g1591$.getDynamicValue(var151));
                                    Errors.cerror((SubLObject)module0732.$ic43$, (SubLObject)module0732.$ic40$, var160, (SubLObject)module0732.$ic41$);
                                }
                            }
                            final SubLObject var50_612 = module0141.$g1670$.currentBinding(var151);
                            final SubLObject var52_613 = module0141.$g1671$.currentBinding(var151);
                            final SubLObject var63_616 = module0141.$g1672$.currentBinding(var151);
                            final SubLObject var162 = module0141.$g1674$.currentBinding(var151);
                            final SubLObject var163 = module0137.$g1605$.currentBinding(var151);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0732.$ic191$)), var151);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0732.$ic191$))), var151);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0732.$ic191$))), var151);
                                module0141.$g1674$.bind((SubLObject)module0732.NIL, var151);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0732.$ic191$)), var151);
                                if (module0732.NIL != module0136.f8865() || module0732.NIL != module0244.f15795(var153, module0137.f8955((SubLObject)module0732.UNPROVIDED))) {
                                    final SubLObject var50_613 = module0141.$g1677$.currentBinding(var151);
                                    final SubLObject var52_614 = module0138.$g1619$.currentBinding(var151);
                                    final SubLObject var63_617 = module0141.$g1674$.currentBinding(var151);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var151);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0732.$ic191$))), var151);
                                        module0141.$g1674$.bind((SubLObject)module0732.NIL, var151);
                                        module0249.f16055(var386_608, (SubLObject)module0732.UNPROVIDED);
                                        while (module0732.NIL != var386_608 && module0732.NIL == var152) {
                                            final SubLObject var164 = var386_608;
                                            final SubLObject var165 = module0200.f12443(module0137.f8955(module0732.$ic191$));
                                            SubLObject var166;
                                            SubLObject var167;
                                            SubLObject var50_614;
                                            SubLObject var52_615;
                                            SubLObject var168;
                                            SubLObject var169;
                                            SubLObject var170;
                                            SubLObject var171;
                                            SubLObject var172;
                                            SubLObject var173;
                                            SubLObject var50_615;
                                            SubLObject var82_623;
                                            SubLObject var174;
                                            SubLObject var175;
                                            SubLObject var50_616;
                                            SubLObject var176;
                                            SubLObject var177;
                                            SubLObject var178;
                                            SubLObject var179;
                                            SubLObject var180;
                                            SubLObject var181;
                                            SubLObject var182;
                                            SubLObject var183;
                                            SubLObject var184;
                                            SubLObject var186;
                                            SubLObject var185;
                                            SubLObject var187;
                                            SubLObject var188;
                                            SubLObject var189;
                                            SubLObject var50_617;
                                            SubLObject var50_618;
                                            SubLObject var190;
                                            SubLObject var95_630;
                                            SubLObject var191;
                                            SubLObject var472_631;
                                            SubLObject var192;
                                            SubLObject var50_619;
                                            SubLObject var194;
                                            SubLObject var193;
                                            SubLObject var195;
                                            SubLObject var196;
                                            SubLObject var197;
                                            SubLObject var198;
                                            SubLObject var199;
                                            SubLObject var200;
                                            for (var166 = (SubLObject)module0732.NIL, var166 = var165; module0732.NIL == var152 && module0732.NIL != var166; var166 = var166.rest()) {
                                                var167 = var166.first();
                                                var50_614 = module0137.$g1605$.currentBinding(var151);
                                                var52_615 = module0141.$g1674$.currentBinding(var151);
                                                try {
                                                    module0137.$g1605$.bind(var167, var151);
                                                    module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var151)) : module0141.$g1674$.getDynamicValue(var151)), var151);
                                                    var168 = module0228.f15229(var164);
                                                    if (module0732.NIL != module0138.f8992(var168)) {
                                                        var169 = module0242.f15664(var168, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                        if (module0732.NIL != var169) {
                                                            var170 = module0245.f15834(var169, module0244.f15780(module0137.f8955(module0732.$ic191$)), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                            if (module0732.NIL != var170) {
                                                                for (var171 = module0066.f4838(module0067.f4891(var170)); module0732.NIL == var152 && module0732.NIL == module0066.f4841(var171); var171 = module0066.f4840(var171)) {
                                                                    var151.resetMultipleValues();
                                                                    var172 = module0066.f4839(var171);
                                                                    var173 = var151.secondMultipleValue();
                                                                    var151.resetMultipleValues();
                                                                    if (module0732.NIL != module0147.f9507(var172)) {
                                                                        var50_615 = module0138.$g1623$.currentBinding(var151);
                                                                        try {
                                                                            module0138.$g1623$.bind(var172, var151);
                                                                            for (var82_623 = module0066.f4838(module0067.f4891(var173)); module0732.NIL == var152 && module0732.NIL == module0066.f4841(var82_623); var82_623 = module0066.f4840(var82_623)) {
                                                                                var151.resetMultipleValues();
                                                                                var174 = module0066.f4839(var82_623);
                                                                                var175 = var151.secondMultipleValue();
                                                                                var151.resetMultipleValues();
                                                                                if (module0732.NIL != module0141.f9289(var174)) {
                                                                                    var50_616 = module0138.$g1624$.currentBinding(var151);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var174, var151);
                                                                                        var176 = var175;
                                                                                        if (module0732.NIL != module0077.f5302(var176)) {
                                                                                            var177 = module0077.f5333(var176);
                                                                                            for (var178 = module0032.f1741(var177), var179 = (SubLObject)module0732.NIL, var179 = module0032.f1742(var178, var177); module0732.NIL == var152 && module0732.NIL == module0032.f1744(var178, var179); var179 = module0032.f1743(var179)) {
                                                                                                var180 = module0032.f1745(var178, var179);
                                                                                                if (module0732.NIL != module0032.f1746(var179, var180) && module0732.NIL == module0249.f16059(var180, module0139.$g1636$.getDynamicValue(var151))) {
                                                                                                    module0249.f16055(var180, module0139.$g1636$.getDynamicValue(var151));
                                                                                                    if (module0732.NIL != module0173.f10955(var180) && module0732.NIL != module0220.f14565(var150, var180, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        var152 = (SubLObject)module0732.T;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var176.isList()) {
                                                                                            if (module0732.NIL == var152) {
                                                                                                var181 = var176;
                                                                                                var182 = (SubLObject)module0732.NIL;
                                                                                                var182 = var181.first();
                                                                                                while (module0732.NIL == var152 && module0732.NIL != var181) {
                                                                                                    if (module0732.NIL == module0249.f16059(var182, module0139.$g1636$.getDynamicValue(var151))) {
                                                                                                        module0249.f16055(var182, module0139.$g1636$.getDynamicValue(var151));
                                                                                                        if (module0732.NIL != module0173.f10955(var182) && module0732.NIL != module0220.f14565(var150, var182, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                            var152 = (SubLObject)module0732.T;
                                                                                                        }
                                                                                                    }
                                                                                                    var181 = var181.rest();
                                                                                                    var182 = var181.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0732.$ic48$, var176);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var50_616, var151);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var82_623);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var50_615, var151);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var171);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                        }
                                                        if (module0732.NIL != module0200.f12419(var168, module0137.f8955((SubLObject)module0732.UNPROVIDED)) && module0732.NIL == var152) {
                                                            var183 = module0248.f15995(var168);
                                                            var184 = (SubLObject)module0732.NIL;
                                                            var184 = var183.first();
                                                            while (module0732.NIL == var152 && module0732.NIL != var183) {
                                                                var185 = (var186 = var184);
                                                                var187 = (SubLObject)module0732.NIL;
                                                                var188 = (SubLObject)module0732.NIL;
                                                                var189 = (SubLObject)module0732.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var186, var185, (SubLObject)module0732.$ic193$);
                                                                var187 = var186.first();
                                                                var186 = var186.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var186, var185, (SubLObject)module0732.$ic193$);
                                                                var188 = var186.first();
                                                                var186 = var186.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var186, var185, (SubLObject)module0732.$ic193$);
                                                                var189 = var186.first();
                                                                var186 = var186.rest();
                                                                if (module0732.NIL == var186) {
                                                                    if (module0732.NIL != module0147.f9507(var188)) {
                                                                        var50_617 = module0138.$g1623$.currentBinding(var151);
                                                                        try {
                                                                            module0138.$g1623$.bind(var188, var151);
                                                                            if (module0732.NIL != module0141.f9289(var189)) {
                                                                                var50_618 = module0138.$g1624$.currentBinding(var151);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var189, var151);
                                                                                    var190 = (var176 = (SubLObject)ConsesLow.list(var187));
                                                                                    if (module0732.NIL != module0077.f5302(var176)) {
                                                                                        var177 = module0077.f5333(var176);
                                                                                        for (var178 = module0032.f1741(var177), var179 = (SubLObject)module0732.NIL, var179 = module0032.f1742(var178, var177); module0732.NIL == var152 && module0732.NIL == module0032.f1744(var178, var179); var179 = module0032.f1743(var179)) {
                                                                                            var180 = module0032.f1745(var178, var179);
                                                                                            if (module0732.NIL != module0032.f1746(var179, var180) && module0732.NIL == module0249.f16059(var180, module0139.$g1636$.getDynamicValue(var151))) {
                                                                                                module0249.f16055(var180, module0139.$g1636$.getDynamicValue(var151));
                                                                                                if (module0732.NIL != module0173.f10955(var180) && module0732.NIL != module0220.f14565(var150, var180, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                    var152 = (SubLObject)module0732.T;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var176.isList()) {
                                                                                        if (module0732.NIL == var152) {
                                                                                            var95_630 = var176;
                                                                                            var182 = (SubLObject)module0732.NIL;
                                                                                            var182 = var95_630.first();
                                                                                            while (module0732.NIL == var152 && module0732.NIL != var95_630) {
                                                                                                if (module0732.NIL == module0249.f16059(var182, module0139.$g1636$.getDynamicValue(var151))) {
                                                                                                    module0249.f16055(var182, module0139.$g1636$.getDynamicValue(var151));
                                                                                                    if (module0732.NIL != module0173.f10955(var182) && module0732.NIL != module0220.f14565(var150, var182, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        var152 = (SubLObject)module0732.T;
                                                                                                    }
                                                                                                }
                                                                                                var95_630 = var95_630.rest();
                                                                                                var182 = var95_630.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0732.$ic48$, var176);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var50_618, var151);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var50_617, var151);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var185, (SubLObject)module0732.$ic193$);
                                                                }
                                                                var183 = var183.rest();
                                                                var184 = var183.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0732.NIL != module0155.f9785(var168, (SubLObject)module0732.UNPROVIDED)) {
                                                        var191 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0732.$ic191$)), module0141.$g1714$.getDynamicValue(var151), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0732.$ic191$)), module0141.$g1714$.getDynamicValue(var151), module0137.f8955((SubLObject)module0732.UNPROVIDED)));
                                                        for (var472_631 = (SubLObject)module0732.NIL, var472_631 = var191; module0732.NIL == var152 && module0732.NIL != var472_631; var472_631 = var472_631.rest()) {
                                                            var192 = var472_631.first();
                                                            var50_619 = module0138.$g1625$.currentBinding(var151);
                                                            try {
                                                                module0138.$g1625$.bind(var192, var151);
                                                                var193 = (var194 = Functions.funcall(var192, var168));
                                                                if (module0732.NIL != module0077.f5302(var194)) {
                                                                    var195 = module0077.f5333(var194);
                                                                    for (var196 = module0032.f1741(var195), var197 = (SubLObject)module0732.NIL, var197 = module0032.f1742(var196, var195); module0732.NIL == var152 && module0732.NIL == module0032.f1744(var196, var197); var197 = module0032.f1743(var197)) {
                                                                        var198 = module0032.f1745(var196, var197);
                                                                        if (module0732.NIL != module0032.f1746(var197, var198) && module0732.NIL == module0249.f16059(var198, module0139.$g1636$.getDynamicValue(var151))) {
                                                                            module0249.f16055(var198, module0139.$g1636$.getDynamicValue(var151));
                                                                            if (module0732.NIL != module0173.f10955(var198) && module0732.NIL != module0220.f14565(var150, var198, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                var152 = (SubLObject)module0732.T;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var194.isList()) {
                                                                    if (module0732.NIL == var152) {
                                                                        var199 = var194;
                                                                        var200 = (SubLObject)module0732.NIL;
                                                                        var200 = var199.first();
                                                                        while (module0732.NIL == var152 && module0732.NIL != var199) {
                                                                            if (module0732.NIL == module0249.f16059(var200, module0139.$g1636$.getDynamicValue(var151))) {
                                                                                module0249.f16055(var200, module0139.$g1636$.getDynamicValue(var151));
                                                                                if (module0732.NIL != module0173.f10955(var200) && module0732.NIL != module0220.f14565(var150, var200, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                                                                    var152 = (SubLObject)module0732.T;
                                                                                }
                                                                            }
                                                                            var199 = var199.rest();
                                                                            var200 = var199.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0732.$ic48$, var194);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var50_619, var151);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var52_615, var151);
                                                    module0137.$g1605$.rebind(var50_614, var151);
                                                }
                                            }
                                            final SubLObject var201 = module0200.f12443(module0244.f15771(module0137.f8955(module0732.$ic191$)));
                                            SubLObject var202;
                                            SubLObject var203;
                                            SubLObject var50_620;
                                            SubLObject var52_616;
                                            SubLObject var204;
                                            SubLObject var205;
                                            SubLObject var206;
                                            SubLObject var207;
                                            SubLObject var208;
                                            SubLObject var209;
                                            SubLObject var50_621;
                                            SubLObject var82_624;
                                            SubLObject var210;
                                            SubLObject var211;
                                            SubLObject var50_622;
                                            SubLObject var212;
                                            SubLObject var213;
                                            SubLObject var214;
                                            SubLObject var215;
                                            SubLObject var216;
                                            SubLObject var217;
                                            SubLObject var218;
                                            SubLObject var219;
                                            SubLObject var472_632;
                                            SubLObject var220;
                                            SubLObject var50_623;
                                            SubLObject var222;
                                            SubLObject var221;
                                            SubLObject var223;
                                            SubLObject var224;
                                            SubLObject var225;
                                            SubLObject var226;
                                            SubLObject var227;
                                            SubLObject var228;
                                            for (var202 = (SubLObject)module0732.NIL, var202 = var201; module0732.NIL == var152 && module0732.NIL != var202; var202 = var202.rest()) {
                                                var203 = var202.first();
                                                var50_620 = module0137.$g1605$.currentBinding(var151);
                                                var52_616 = module0141.$g1674$.currentBinding(var151);
                                                try {
                                                    module0137.$g1605$.bind(var203, var151);
                                                    module0141.$g1674$.bind((SubLObject)((module0732.NIL != module0141.f9205((SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0732.NIL == module0141.$g1674$.getDynamicValue(var151)) : module0141.$g1674$.getDynamicValue(var151)), var151);
                                                    var204 = module0228.f15229(var386_608);
                                                    if (module0732.NIL != module0138.f8992(var204)) {
                                                        var205 = module0242.f15664(var204, module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                        if (module0732.NIL != var205) {
                                                            var206 = module0245.f15834(var205, module0138.f8979(), module0137.f8955((SubLObject)module0732.UNPROVIDED));
                                                            if (module0732.NIL != var206) {
                                                                for (var207 = module0066.f4838(module0067.f4891(var206)); module0732.NIL == var152 && module0732.NIL == module0066.f4841(var207); var207 = module0066.f4840(var207)) {
                                                                    var151.resetMultipleValues();
                                                                    var208 = module0066.f4839(var207);
                                                                    var209 = var151.secondMultipleValue();
                                                                    var151.resetMultipleValues();
                                                                    if (module0732.NIL != module0147.f9507(var208)) {
                                                                        var50_621 = module0138.$g1623$.currentBinding(var151);
                                                                        try {
                                                                            module0138.$g1623$.bind(var208, var151);
                                                                            for (var82_624 = module0066.f4838(module0067.f4891(var209)); module0732.NIL == var152 && module0732.NIL == module0066.f4841(var82_624); var82_624 = module0066.f4840(var82_624)) {
                                                                                var151.resetMultipleValues();
                                                                                var210 = module0066.f4839(var82_624);
                                                                                var211 = var151.secondMultipleValue();
                                                                                var151.resetMultipleValues();
                                                                                if (module0732.NIL != module0141.f9289(var210)) {
                                                                                    var50_622 = module0138.$g1624$.currentBinding(var151);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var210, var151);
                                                                                        var212 = var211;
                                                                                        if (module0732.NIL != module0077.f5302(var212)) {
                                                                                            var213 = module0077.f5333(var212);
                                                                                            for (var214 = module0032.f1741(var213), var215 = (SubLObject)module0732.NIL, var215 = module0032.f1742(var214, var213); module0732.NIL == var152 && module0732.NIL == module0032.f1744(var214, var215); var215 = module0032.f1743(var215)) {
                                                                                                var216 = module0032.f1745(var214, var215);
                                                                                                if (module0732.NIL != module0032.f1746(var215, var216) && module0732.NIL == module0249.f16059(var216, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                    module0249.f16055(var216, (SubLObject)module0732.UNPROVIDED);
                                                                                                    module0056.f4149(var216, var157);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var212.isList()) {
                                                                                            if (module0732.NIL == var152) {
                                                                                                var217 = var212;
                                                                                                var218 = (SubLObject)module0732.NIL;
                                                                                                var218 = var217.first();
                                                                                                while (module0732.NIL == var152 && module0732.NIL != var217) {
                                                                                                    if (module0732.NIL == module0249.f16059(var218, (SubLObject)module0732.UNPROVIDED)) {
                                                                                                        module0249.f16055(var218, (SubLObject)module0732.UNPROVIDED);
                                                                                                        module0056.f4149(var218, var157);
                                                                                                    }
                                                                                                    var217 = var217.rest();
                                                                                                    var218 = var217.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0732.$ic48$, var212);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var50_622, var151);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var82_624);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var50_621, var151);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var207);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0732.FIVE_INTEGER, (SubLObject)module0732.$ic49$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0732.NIL != module0155.f9785(var204, (SubLObject)module0732.UNPROVIDED)) {
                                                        var219 = ((module0732.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var151), module0137.f8955((SubLObject)module0732.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var151), module0137.f8955((SubLObject)module0732.UNPROVIDED)));
                                                        for (var472_632 = (SubLObject)module0732.NIL, var472_632 = var219; module0732.NIL == var152 && module0732.NIL != var472_632; var472_632 = var472_632.rest()) {
                                                            var220 = var472_632.first();
                                                            var50_623 = module0138.$g1625$.currentBinding(var151);
                                                            try {
                                                                module0138.$g1625$.bind(var220, var151);
                                                                var221 = (var222 = Functions.funcall(var220, var204));
                                                                if (module0732.NIL != module0077.f5302(var222)) {
                                                                    var223 = module0077.f5333(var222);
                                                                    for (var224 = module0032.f1741(var223), var225 = (SubLObject)module0732.NIL, var225 = module0032.f1742(var224, var223); module0732.NIL == var152 && module0732.NIL == module0032.f1744(var224, var225); var225 = module0032.f1743(var225)) {
                                                                        var226 = module0032.f1745(var224, var225);
                                                                        if (module0732.NIL != module0032.f1746(var225, var226) && module0732.NIL == module0249.f16059(var226, (SubLObject)module0732.UNPROVIDED)) {
                                                                            module0249.f16055(var226, (SubLObject)module0732.UNPROVIDED);
                                                                            module0056.f4149(var226, var157);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var222.isList()) {
                                                                    if (module0732.NIL == var152) {
                                                                        var227 = var222;
                                                                        var228 = (SubLObject)module0732.NIL;
                                                                        var228 = var227.first();
                                                                        while (module0732.NIL == var152 && module0732.NIL != var227) {
                                                                            if (module0732.NIL == module0249.f16059(var228, (SubLObject)module0732.UNPROVIDED)) {
                                                                                module0249.f16055(var228, (SubLObject)module0732.UNPROVIDED);
                                                                                module0056.f4149(var228, var157);
                                                                            }
                                                                            var227 = var227.rest();
                                                                            var228 = var227.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0732.$ic48$, var222);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var50_623, var151);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var52_616, var151);
                                                    module0137.$g1605$.rebind(var50_620, var151);
                                                }
                                            }
                                            var386_608 = module0056.f4150(var157);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var63_617, var151);
                                        module0138.$g1619$.rebind(var52_614, var151);
                                        module0141.$g1677$.rebind(var50_613, var151);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.$ic50$, var153, module0244.f15748(module0137.f8955((SubLObject)module0732.UNPROVIDED)), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var163, var151);
                                module0141.$g1674$.rebind(var162, var151);
                                module0141.$g1672$.rebind(var63_616, var151);
                                module0141.$g1671$.rebind(var52_613, var151);
                                module0141.$g1670$.rebind(var50_612, var151);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var52_612, var151);
                            module0141.$g1714$.rebind(var50_611, var151);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var159, var151);
                        module0147.$g2094$.rebind(var52_611, var151);
                        module0147.$g2095$.rebind(var50_610, var151);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var151));
                }
                finally {
                    module0139.$g1635$.rebind(var50_609, var151);
                }
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var151));
        }
        finally {
            module0139.$g1636$.rebind(var155, var151);
            module0137.$g1605$.rebind(var154, var151);
        }
        if (module0732.NIL == var152) {
            var151.resetMultipleValues();
            final SubLObject var229 = module0767.f48860(var150, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
            final SubLObject var230 = var151.secondMultipleValue();
            var151.resetMultipleValues();
            if (!var230.eql((SubLObject)module0732.NIL) && module0732.NIL == conses_high.member(var230, module0259.f16848(module0732.$ic195$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                var152 = (SubLObject)module0732.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL == var152);
    }
    
    public static SubLObject f45117(final SubLObject var15, SubLObject var640, SubLObject var641, SubLObject var642) {
        if (var640 == module0732.UNPROVIDED) {
            var640 = module0584.$g4389$.getDynamicValue();
        }
        if (var641 == module0732.UNPROVIDED) {
            var641 = module0584.$g4396$.getDynamicValue();
        }
        if (var642 == module0732.UNPROVIDED) {
            var642 = module0584.$g4390$.getDynamicValue();
        }
        assert module0732.NIL != Types.stringp(var15) : var15;
        assert module0732.NIL != module0584.f35771(var642) : var642;
        SubLObject var643 = module0738.f45749(var15, var640, var641, (SubLObject)module0732.UNPROVIDED);
        if (module0732.NIL != module0731.f44731(var643, var642)) {
            var643 = Sequences.delete_duplicates(ConsesLow.append(var643, module0788.f50501(var15)), Symbols.symbol_function((SubLObject)module0732.EQ), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        }
        return var643;
    }
    
    public static SubLObject f45118(final SubLObject var15, SubLObject var640, SubLObject var641) {
        if (var640 == module0732.UNPROVIDED) {
            var640 = module0584.$g4389$.getDynamicValue();
        }
        if (var641 == module0732.UNPROVIDED) {
            var641 = module0584.$g4396$.getDynamicValue();
        }
        assert module0732.NIL != Types.stringp(var15) : var15;
        final SubLObject var642 = module0738.f45750(var15, var640, var641, (SubLObject)module0732.UNPROVIDED);
        return var642;
    }
    
    public static SubLObject f45119(final SubLObject var15, SubLObject var640, SubLObject var641, SubLObject var642) {
        if (var640 == module0732.UNPROVIDED) {
            var640 = module0584.$g4389$.getDynamicValue();
        }
        if (var641 == module0732.UNPROVIDED) {
            var641 = module0584.$g4396$.getDynamicValue();
        }
        if (var642 == module0732.UNPROVIDED) {
            var642 = module0584.$g4390$.getDynamicValue();
        }
        assert module0732.NIL != module0584.f35771(var642) : var642;
        final SubLObject var643 = ConsesLow.append((SubLObject)module0732.$ic58$, module0584.f35812());
        return module0035.f2226(var643, f45117(var15, var640, var641, var642), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45120(final SubLObject var15, SubLObject var640, SubLObject var641) {
        if (var640 == module0732.UNPROVIDED) {
            var640 = module0584.$g4389$.getDynamicValue();
        }
        if (var641 == module0732.UNPROVIDED) {
            var641 = module0584.$g4396$.getDynamicValue();
        }
        return f45119(var15, var640, var641, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45121(final SubLObject var643, SubLObject var130, SubLObject var644, SubLObject var640, SubLObject var641) {
        if (var130 == module0732.UNPROVIDED) {
            var130 = (SubLObject)module0732.NIL;
        }
        if (var644 == module0732.UNPROVIDED) {
            var644 = (SubLObject)module0732.NIL;
        }
        if (var640 == module0732.UNPROVIDED) {
            var640 = module0584.$g4389$.getDynamicValue();
        }
        if (var641 == module0732.UNPROVIDED) {
            var641 = module0584.$g4396$.getDynamicValue();
        }
        SubLObject var645 = (module0732.NIL != var130) ? f44952(var130) : f45119(var643, var640, var641, (SubLObject)module0732.UNPROVIDED);
        final SubLObject var646 = (module0732.NIL != var130) ? module0731.f44737(var643, var130, var640, var641, (SubLObject)module0732.UNPROVIDED) : module0730.f44560(var643, var640, var641, (SubLObject)module0732.UNPROVIDED);
        SubLObject var647 = (SubLObject)module0732.NIL;
        if (module0732.NIL != var644 && var130 == module0732.$ic258$) {
            var645 = module0035.f2218(var645, module0732.$g5788$.getGlobalValue(), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        }
        SubLObject var648 = var646;
        SubLObject var649 = (SubLObject)module0732.NIL;
        var649 = var648.first();
        while (module0732.NIL != var648) {
            SubLObject var9_647 = module0730.f44575(var649, var645, (SubLObject)module0732.NIL, var641);
            SubLObject var650 = (SubLObject)module0732.NIL;
            var650 = var9_647.first();
            while (module0732.NIL != var9_647) {
                final SubLObject var651 = var650;
                if (module0732.NIL == conses_high.member(var651, var647, Symbols.symbol_function((SubLObject)module0732.EQUAL), Symbols.symbol_function((SubLObject)module0732.IDENTITY))) {
                    var647 = (SubLObject)ConsesLow.cons(var651, var647);
                }
                var9_647 = var9_647.rest();
                var650 = var9_647.first();
            }
            var648 = var648.rest();
            var649 = var648.first();
        }
        return var647;
    }
    
    public static SubLObject f45122(final SubLObject var643, SubLObject var130, SubLObject var644, SubLObject var640, SubLObject var641) {
        if (var130 == module0732.UNPROVIDED) {
            var130 = (SubLObject)module0732.NIL;
        }
        if (var644 == module0732.UNPROVIDED) {
            var644 = (SubLObject)module0732.NIL;
        }
        if (var640 == module0732.UNPROVIDED) {
            var640 = module0584.$g4389$.getDynamicValue();
        }
        if (var641 == module0732.UNPROVIDED) {
            var641 = module0584.$g4396$.getDynamicValue();
        }
        return Sequences.reverse(f45121(var643, var130, var644, var640, var641));
    }
    
    public static SubLObject f45123(final SubLObject var643, SubLObject var130, SubLObject var644, SubLObject var640, SubLObject var641) {
        if (var130 == module0732.UNPROVIDED) {
            var130 = (SubLObject)module0732.NIL;
        }
        if (var644 == module0732.UNPROVIDED) {
            var644 = (SubLObject)module0732.NIL;
        }
        if (var640 == module0732.UNPROVIDED) {
            var640 = module0584.$g4389$.getDynamicValue();
        }
        if (var641 == module0732.UNPROVIDED) {
            var641 = module0584.$g4396$.getDynamicValue();
        }
        final SubLObject var645 = f45122(var643, var130, var644, var640, var641);
        return (module0732.NIL != var645) ? var645.first() : var643;
    }
    
    public static SubLObject f45124(final SubLObject var643, final SubLObject var130, SubLObject var641) {
        if (var641 == module0732.UNPROVIDED) {
            var641 = module0584.$g4396$.getDynamicValue();
        }
        assert module0732.NIL != Types.keywordp(var130) : var130;
        return module0035.sublisp_boolean(module0731.f44737(var643, var130, (SubLObject)module0732.NIL, var641, (SubLObject)module0732.UNPROVIDED));
    }
    
    public static SubLObject f45125(final SubLObject var643, final SubLObject var32, SubLObject var641, SubLObject var642) {
        if (var641 == module0732.UNPROVIDED) {
            var641 = module0584.$g4396$.getDynamicValue();
        }
        if (var642 == module0732.UNPROVIDED) {
            var642 = module0584.$g4390$.getDynamicValue();
        }
        return module0035.sublisp_boolean(module0731.f44727(var643, var32, (SubLObject)module0732.NIL, var641, var642));
    }
    
    public static SubLObject f45126(final SubLObject var643, SubLObject var641, SubLObject var649) {
        if (var641 == module0732.UNPROVIDED) {
            var641 = module0584.$g4396$.getDynamicValue();
        }
        if (var649 == module0732.UNPROVIDED) {
            var649 = (SubLObject)module0732.NIL;
        }
        final SubLObject var650 = module0603.f36876((SubLObject)module0732.$ic260$, module0732.$ic65$);
        final SubLObject var651 = (module0732.NIL != var649) ? module0732.$ic65$ : var650;
        return f45125(var643, var651, var641, (SubLObject)module0732.$ic261$);
    }
    
    public static SubLObject f45127(SubLObject var558, SubLObject var652) {
        if (var652 == module0732.UNPROVIDED) {
            var652 = (SubLObject)module0732.NIL;
        }
        final SubLThread var653 = SubLProcess.currentSubLThread();
        final SubLObject var654 = module0038.f2738(var558, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
        if (module0732.NIL != f45126(var654.first(), module0584.$g4396$.getDynamicValue(var653), var652)) {
            var558 = module0777.f50092(var654.rest());
        }
        return var558;
    }
    
    public static SubLObject f45128(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL != module0731.f44751(var15, (SubLObject)module0732.UNPROVIDED) && module0732.NIL != module0731.f44746(var15, module0732.$ic262$, (SubLObject)module0732.NIL, module0584.$g4396$.getDynamicValue(var16), (SubLObject)module0732.$ic261$));
    }
    
    public static SubLObject f45129(final SubLObject var15) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL != module0540.f33525((SubLObject)ConsesLow.list(module0732.$ic263$, (SubLObject)module0732.$ic264$, var15), module0732.$ic265$, (SubLObject)module0732.UNPROVIDED) || module0732.NIL != module0540.f33525((SubLObject)ConsesLow.list(module0732.$ic266$, (SubLObject)module0732.$ic264$, var15), module0732.$ic265$, (SubLObject)module0732.UNPROVIDED));
    }
    
    public static SubLObject f45130(final SubLObject var15) {
        final SubLObject var16 = ConsesLow.append(module0434.f30579((SubLObject)module0732.$ic264$, (SubLObject)ConsesLow.list(module0732.$ic263$, (SubLObject)module0732.$ic264$, var15), module0732.$ic265$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED), module0434.f30579((SubLObject)module0732.$ic264$, (SubLObject)ConsesLow.list(module0732.$ic266$, (SubLObject)module0732.$ic264$, var15), module0732.$ic265$, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED));
        if (module0732.NIL == var16) {
            return (SubLObject)module0732.NIL;
        }
        if (module0732.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)module0732.$ic267$), var16, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
            if (module0732.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)module0732.$ic268$), var16, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                return (SubLObject)module0732.$ic269$;
            }
            return (SubLObject)module0732.$ic270$;
        }
        else {
            if (module0732.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)module0732.$ic268$), var16, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                return (SubLObject)module0732.$ic271$;
            }
            return (SubLObject)module0732.$ic272$;
        }
    }
    
    public static SubLObject f45131(final SubLObject var1) {
        return module0259.f16891(var1, module0732.$ic273$);
    }
    
    public static SubLObject f45132(final SubLObject var1) {
        return module0259.f16891(var1, module0732.$ic274$);
    }
    
    public static SubLObject f45133(final SubLObject var654, final SubLObject var655, SubLObject var656) {
        if (var656 == module0732.UNPROVIDED) {
            var656 = (SubLObject)module0732.$ic272$;
        }
        if (module0732.$ic272$ == var656) {
            var656 = (SubLObject)((module0732.NIL != f45134(var655)) ? module0732.$ic275$ : module0732.$ic276$);
        }
        final SubLObject var657 = var656;
        if (var657.eql((SubLObject)module0732.$ic275$)) {
            return module0202.f12768(module0732.$ic277$, var655, var654);
        }
        return module0202.f12768(module0732.$ic278$, var654, var655);
    }
    
    public static SubLObject f45135(final SubLObject var657, SubLObject var658) {
        if (var658 == module0732.UNPROVIDED) {
            var658 = module0732.$ic279$;
        }
        assert module0732.NIL != module0731.f44769(var657) : var657;
        return f45136(var657, var658);
    }
    
    public static SubLObject f45137(final SubLObject var657, final SubLObject var658) {
        final SubLObject var659 = (SubLObject)module0732.$ic282$;
        final SubLObject var660 = module0202.f12768(module0732.$ic283$, var657, var659);
        final SubLObject var661 = (SubLObject)module0732.$ic284$;
        return module0434.f30578(var659, var660, var658, var661).first();
    }
    
    public static SubLObject f45136(final SubLObject var657, final SubLObject var658) {
        final SubLThread var659 = SubLProcess.currentSubLThread();
        final SubLObject var660 = module0034.$g879$.getDynamicValue(var659);
        SubLObject var661 = (SubLObject)module0732.NIL;
        if (module0732.NIL == var660) {
            return f45137(var657, var658);
        }
        var661 = module0034.f1857(var660, (SubLObject)module0732.$ic281$, (SubLObject)module0732.UNPROVIDED);
        if (module0732.NIL == var661) {
            var661 = module0034.f1807(module0034.f1842(var660), (SubLObject)module0732.$ic281$, (SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.NIL, (SubLObject)module0732.EQUAL, (SubLObject)module0732.UNPROVIDED);
            module0034.f1860(var660, (SubLObject)module0732.$ic281$, var661);
        }
        final SubLObject var662 = module0034.f1782(var657, var658);
        final SubLObject var663 = module0034.f1814(var661, var662, (SubLObject)module0732.UNPROVIDED);
        if (var663 != module0732.$ic18$) {
            SubLObject var664 = var663;
            SubLObject var665 = (SubLObject)module0732.NIL;
            var665 = var664.first();
            while (module0732.NIL != var664) {
                SubLObject var666 = var665.first();
                final SubLObject var667 = conses_high.second(var665);
                if (var657.equal(var666.first())) {
                    var666 = var666.rest();
                    if (module0732.NIL != var666 && module0732.NIL == var666.rest() && var658.equal(var666.first())) {
                        return module0034.f1959(var667);
                    }
                }
                var664 = var664.rest();
                var665 = var664.first();
            }
        }
        final SubLObject var668 = Values.arg2(var659.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45137(var657, var658)));
        module0034.f1836(var661, var662, var663, var668, (SubLObject)ConsesLow.list(var657, var658));
        return module0034.f1959(var668);
    }
    
    public static SubLObject f45134(final SubLObject var1) {
        return module0259.f16891(var1, module0732.$ic285$);
    }
    
    public static SubLObject f45138(final SubLObject var667) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0732.NIL != module0731.f44750(var667, (SubLObject)module0732.UNPROVIDED) && module0732.NIL == f45139(var667, (SubLObject)module0732.UNPROVIDED));
    }
    
    public static SubLObject f45140() {
        final SubLObject var33 = module0732.$g5808$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45141(final SubLObject var667, SubLObject var668) {
        if (var668 == module0732.UNPROVIDED) {
            var668 = module0584.$g4396$.getDynamicValue();
        }
        return module0034.f1829(module0732.$g5808$.getGlobalValue(), (SubLObject)ConsesLow.list(var667, var668), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45142(final SubLObject var667, final SubLObject var668) {
        SubLObject var669 = conses_high.copy_list(module0732.$g5807$.getGlobalValue());
        SubLObject var670;
        var669 = (var670 = (SubLObject)ConsesLow.cons(module0732.$ic287$, var669));
        SubLObject var671 = (SubLObject)module0732.NIL;
        var671 = var670.first();
        while (module0732.NIL != var670) {
            if (module0732.NIL != module0731.f44746(var667, var671, (SubLObject)module0732.NIL, var668, (SubLObject)module0732.$ic261$)) {
                return (SubLObject)module0732.T;
            }
            var670 = var670.rest();
            var671 = var670.first();
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45139(final SubLObject var667, SubLObject var668) {
        if (var668 == module0732.UNPROVIDED) {
            var668 = module0584.$g4396$.getDynamicValue();
        }
        SubLObject var669 = module0732.$g5808$.getGlobalValue();
        if (module0732.NIL == var669) {
            var669 = module0034.f1934((SubLObject)module0732.$ic286$, (SubLObject)module0732.$ic288$, (SubLObject)module0732.$ic289$, (SubLObject)module0732.EQUAL, (SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.ZERO_INTEGER);
        }
        final SubLObject var670 = module0034.f1782(var667, var668);
        final SubLObject var671 = module0034.f1814(var669, var670, (SubLObject)module0732.UNPROVIDED);
        if (var671 != module0732.$ic18$) {
            SubLObject var672 = var671;
            SubLObject var673 = (SubLObject)module0732.NIL;
            var673 = var672.first();
            while (module0732.NIL != var672) {
                SubLObject var674 = var673.first();
                final SubLObject var675 = conses_high.second(var673);
                if (var667.equal(var674.first())) {
                    var674 = var674.rest();
                    if (module0732.NIL != var674 && module0732.NIL == var674.rest() && var668.equal(var674.first())) {
                        return module0034.f1959(var675);
                    }
                }
                var672 = var672.rest();
                var673 = var672.first();
            }
        }
        final SubLObject var676 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45142(var667, var668)));
        module0034.f1836(var669, var670, var671, var676, (SubLObject)ConsesLow.list(var667, var668));
        return module0034.f1959(var676);
    }
    
    public static SubLObject f45143(final SubLObject var670) {
        return module0035.f2293(module0732.$g5809$.getGlobalValue(), var670, Symbols.symbol_function((SubLObject)module0732.EQL), (SubLObject)module0732.NIL).first();
    }
    
    public static SubLObject f45144(final SubLObject var670) {
        return conses_high.copy_list(module0035.f2293(module0732.$g5809$.getGlobalValue(), var670, Symbols.symbol_function((SubLObject)module0732.EQL), (SubLObject)module0732.NIL).rest());
    }
    
    public static SubLObject f45145(final SubLObject var671, final SubLObject var670) {
        if (module0732.NIL != module0202.f12595(var671)) {
            final SubLObject var672 = f45143(var670);
            SubLObject var673 = f45144(var670);
            SubLObject var674 = (SubLObject)module0732.NIL;
            SubLObject var675 = (SubLObject)module0732.NIL;
            SubLObject var676 = (SubLObject)module0732.NIL;
            SubLObject var677 = (SubLObject)module0732.NIL;
            SubLObject var678 = module0205.f13207(var671, (SubLObject)module0732.$ic291$);
            SubLObject var679;
            SubLObject var680;
            for (var679 = (SubLObject)module0732.NIL, var679 = var678; module0732.NIL == var676 && module0732.NIL != var679; var679 = var679.rest()) {
                var680 = var679.first();
                if (module0732.NIL != module0337.f22630(var680, (SubLObject)module0732.$ic292$)) {
                    var676 = var680;
                }
            }
            if (module0732.NIL != var676) {
                var674 = module0205.f13204(var676, (SubLObject)module0732.UNPROVIDED);
                var678 = module0205.f13207(var671, (SubLObject)module0732.$ic291$);
                SubLObject var681;
                for (var679 = (SubLObject)module0732.NIL, var679 = var678; module0732.NIL == var677 && module0732.NIL != var679; var679 = var679.rest()) {
                    var680 = var679.first();
                    if (!var680.equal(var676)) {
                        if (module0732.NIL != module0337.f22630(var680, (SubLObject)ConsesLow.listS((SubLObject)module0732.$ic293$, var672, (SubLObject)module0732.$ic294$))) {
                            var681 = module0205.f13204(var680, (SubLObject)module0732.UNPROVIDED);
                            if (module0732.NIL != module0004.f104(var681, var673, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED)) {
                                var673 = Sequences.delete(var681, var673, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
                                var675 = module0035.f2063(var675, var681, module0205.f13132(var680), (SubLObject)module0732.UNPROVIDED);
                            }
                            else {
                                var677 = var680;
                            }
                        }
                        else {
                            var677 = var680;
                        }
                    }
                }
                if (module0732.NIL != var677 || module0732.NIL != var673) {
                    var674 = (SubLObject)module0732.NIL;
                    var675 = (SubLObject)module0732.NIL;
                }
            }
            return Values.values(var674, var675, var677);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45146(final SubLObject var670, final SubLObject var674, final SubLObject var675) {
        assert module0732.NIL != module0173.f10955(var670) : var670;
        assert module0732.NIL != module0206.f13451(var674) : var674;
        final SubLObject var676 = f45143(var670);
        final SubLObject var677 = f45144(var670);
        SubLObject var678 = (SubLObject)module0732.NIL;
        if (module0732.NIL != var676 && module0732.NIL != var677) {
            final SubLObject var679 = (SubLObject)ConsesLow.list(module0732.$ic191$, var676, var674);
            SubLObject var680 = (SubLObject)ConsesLow.list(var679);
            SubLObject var681 = (SubLObject)module0732.NIL;
            SubLObject var685_686 = (SubLObject)module0732.NIL;
            SubLObject var682 = (SubLObject)module0732.NIL;
            SubLObject var688_689 = (SubLObject)module0732.NIL;
            var681 = var677;
            var685_686 = var681.first();
            var682 = var675;
            var688_689 = var682.first();
            while (module0732.NIL != var682 || module0732.NIL != var681) {
                assert module0732.NIL != module0206.f13451(var688_689) : var688_689;
                var680 = (SubLObject)ConsesLow.cons(module0202.f12768(var688_689, var676, var685_686), var680);
                var681 = var681.rest();
                var685_686 = var681.first();
                var682 = var682.rest();
                var688_689 = var682.first();
            }
            var678 = module0202.f12773(Sequences.nreverse(var680));
        }
        return var678;
    }
    
    public static SubLObject f45147(final SubLObject var4) {
        f45148();
        SubLObject var5 = module0067.f4885(module0732.$g5810$.getGlobalValue(), var4, (SubLObject)module0732.UNPROVIDED);
        if (module0732.NIL == var5) {
            var5 = f45149(var4);
            if (module0732.NIL != var5) {
                module0067.f4886(module0732.$g5810$.getGlobalValue(), var4, var5);
            }
        }
        return var5;
    }
    
    public static SubLObject f45149(final SubLObject var4) {
        if (!module0161.f10557(var4).equal(var4)) {
            return f45147(module0161.f10557(var4));
        }
        if (module0732.NIL != module0161.f10488(var4)) {
            final SubLObject var5 = module0161.f10522(var4);
            SubLObject var6 = (SubLObject)module0732.NIL;
            SubLObject var7 = (SubLObject)module0732.NIL;
            if (module0732.NIL == var7) {
                SubLObject var8 = var5;
                SubLObject var9 = (SubLObject)module0732.NIL;
                var9 = var8.first();
                while (module0732.NIL == var7 && module0732.NIL != var8) {
                    final SubLObject var10 = f45147(var9);
                    if (module0732.NIL != var10) {
                        if (module0732.NIL == var6) {
                            var6 = var10;
                        }
                        else if (!var10.equal(var6)) {
                            var7 = (SubLObject)module0732.T;
                        }
                    }
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
            return (SubLObject)((module0732.NIL != var7) ? module0732.NIL : var6);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45150() {
        if (module0732.NIL != module0067.f4852(module0732.$g5810$.getGlobalValue())) {
            module0067.f4881(module0732.$g5810$.getGlobalValue());
        }
        return module0732.$g5810$.getGlobalValue();
    }
    
    public static SubLObject f45151() {
        if (module0732.NIL != module0067.f4852(module0732.$g5810$.getGlobalValue())) {
            f45150();
        }
        else {
            module0732.$g5810$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)module0732.EQUAL), (SubLObject)module0732.UNPROVIDED));
        }
        SubLObject var9 = module0434.f30576((SubLObject)module0732.$ic299$, (SubLObject)module0732.$ic300$, module0732.$ic104$, (SubLObject)module0732.$ic301$);
        SubLObject var10 = (SubLObject)module0732.NIL;
        var10 = var9.first();
        while (module0732.NIL != var9) {
            SubLObject var12;
            final SubLObject var11 = var12 = var10;
            SubLObject var13 = (SubLObject)module0732.NIL;
            SubLObject var14 = (SubLObject)module0732.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)module0732.$ic298$);
            var13 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)module0732.$ic298$);
            var14 = var12.first();
            var12 = var12.rest();
            if (module0732.NIL == var12) {
                module0067.f4886(module0732.$g5810$.getGlobalValue(), var13, var14);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)module0732.$ic298$);
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        return module0732.$g5810$.getGlobalValue();
    }
    
    public static SubLObject f45148() {
        if (module0732.NIL == module0067.f4852(module0732.$g5810$.getGlobalValue())) {
            f45151();
        }
        return module0732.$g5810$.getGlobalValue();
    }
    
    public static SubLObject f45152(final SubLObject var698, final SubLObject var190, final SubLObject var582) {
        return module0731.f44644(var582, var698);
    }
    
    public static SubLObject f45153() {
        final SubLObject var33 = module0732.$g5811$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45154(final SubLObject var690) {
        return module0034.f1829(module0732.$g5811$.getGlobalValue(), (SubLObject)ConsesLow.list(var690), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45155(final SubLObject var690) {
        return module0434.f30578((SubLObject)module0732.$ic303$, (SubLObject)ConsesLow.listS(module0732.$ic304$, var690, (SubLObject)module0732.$ic305$), module0732.$ic104$, (SubLObject)module0732.UNPROVIDED).first();
    }
    
    public static SubLObject f45156(final SubLObject var690) {
        SubLObject var691 = module0732.$g5811$.getGlobalValue();
        if (module0732.NIL == var691) {
            var691 = module0034.f1934((SubLObject)module0732.$ic302$, (SubLObject)module0732.$ic306$, (SubLObject)module0732.$ic307$, (SubLObject)module0732.EQL, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0732.$ic308$);
        }
        SubLObject var692 = module0034.f1814(var691, var690, (SubLObject)module0732.$ic18$);
        if (var692 == module0732.$ic18$) {
            var692 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45155(var690)));
            module0034.f1816(var691, var690, var692, (SubLObject)module0732.UNPROVIDED);
        }
        return module0034.f1959(var692);
    }
    
    public static SubLObject f45157() {
        final SubLObject var33 = module0732.$g5812$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45158(final SubLObject var699) {
        return module0034.f1829(module0732.$g5812$.getGlobalValue(), (SubLObject)ConsesLow.list(var699), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45159(final SubLObject var699) {
        return module0434.f30578((SubLObject)module0732.$ic310$, (SubLObject)ConsesLow.list(module0732.$ic311$, (SubLObject)module0732.$ic310$, var699), module0732.$ic312$, (SubLObject)module0732.UNPROVIDED).first();
    }
    
    public static SubLObject f45160(final SubLObject var699) {
        SubLObject var700 = module0732.$g5812$.getGlobalValue();
        if (module0732.NIL == var700) {
            var700 = module0034.f1934((SubLObject)module0732.$ic309$, (SubLObject)module0732.$ic313$, (SubLObject)module0732.$ic307$, (SubLObject)module0732.EQL, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.ZERO_INTEGER);
        }
        SubLObject var701 = module0034.f1814(var700, var699, (SubLObject)module0732.$ic18$);
        if (var701 == module0732.$ic18$) {
            var701 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45159(var699)));
            module0034.f1816(var700, var699, var701, (SubLObject)module0732.UNPROVIDED);
        }
        return module0034.f1959(var701);
    }
    
    public static SubLObject f45161() {
        final SubLObject var33 = module0732.$g5813$.getGlobalValue();
        if (module0732.NIL != var33) {
            module0034.f1818(var33);
        }
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45162(final SubLObject var690) {
        return module0034.f1829(module0732.$g5813$.getGlobalValue(), (SubLObject)ConsesLow.list(var690), (SubLObject)module0732.UNPROVIDED, (SubLObject)module0732.UNPROVIDED);
    }
    
    public static SubLObject f45163(final SubLObject var690) {
        return module0434.f30578((SubLObject)module0732.$ic315$, (SubLObject)ConsesLow.listS(module0732.$ic311$, var690, (SubLObject)module0732.$ic316$), module0732.$ic312$, (SubLObject)module0732.UNPROVIDED).first();
    }
    
    public static SubLObject f45164(final SubLObject var690) {
        SubLObject var691 = module0732.$g5813$.getGlobalValue();
        if (module0732.NIL == var691) {
            var691 = module0034.f1934((SubLObject)module0732.$ic314$, (SubLObject)module0732.$ic317$, (SubLObject)module0732.$ic307$, (SubLObject)module0732.EQL, (SubLObject)module0732.ONE_INTEGER, (SubLObject)module0732.ZERO_INTEGER);
        }
        SubLObject var692 = module0034.f1814(var691, var690, (SubLObject)module0732.$ic18$);
        if (var692 == module0732.$ic18$) {
            var692 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45163(var690)));
            module0034.f1816(var691, var690, var692, (SubLObject)module0732.UNPROVIDED);
        }
        return module0034.f1959(var692);
    }
    
    public static SubLObject f45165() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44910", "S#49156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44911", "NEXT-AVAILABLE-WS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44913", "S#39902", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44914", "S#49157", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44912", "S#49158", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44915", "S#49159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44916", "S#49160", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44917", "S#49161", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44918", "CHECK-DENOT", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44919", "S#49162", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44920", "S#49163", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44921", "S#49164", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44922", "S#49165", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44923", "S#49166", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44924", "S#48576", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44926", "S#49167", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44927", "S#48866", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44928", "S#49168", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44929", "S#49169", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44925", "S#49170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44930", "S#49171", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44931", "S#49172", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44932", "S#49173", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44933", "S#49174", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44934", "S#48849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44936", "S#48848", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44937", "S#48865", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44938", "S#49175", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44939", "S#49176", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44935", "S#49177", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44940", "S#49178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44941", "S#49179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44942", "S#48847", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44943", "S#49180", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44944", "S#49181", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44946", "S#49182", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44947", "S#49183", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44948", "S#49184", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44945", "S#49185", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44950", "S#49186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44951", "PREDS-FOR-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44952", "ORDERED-LEXIFICATION-PREDS-FOR-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44953", "S#49187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44954", "S#49188", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44955", "S#49189", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44956", "S#49190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44957", "S#49191", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44958", "S#49192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44959", "S#49193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44960", "S#49194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44962", "S#49195", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44963", "S#49196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44964", "S#49197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44961", "S#49198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44965", "S#49199", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44966", "S#49200", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44968", "S#49201", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44970", "S#49202", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44969", "S#48867", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44971", "S#49203", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44972", "S#49204", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44967", "S#49205", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44973", "S#49206", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44975", "S#48868", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44976", "S#49207", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44977", "S#49208", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44974", "S#49209", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44978", "S#49210", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44979", "S#49211", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44981", "S#49212", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44980", "S#49213", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44983", "S#49214", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44990", "S#49215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44991", "S#49216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44992", "S#48888", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44984", "S#49217", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44993", "S#49218", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44994", "S#49219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44995", "S#48893", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44996", "S#49220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44985", "S#49221", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44997", "S#49222", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44998", "S#48894", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44999", "S#49223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45001", "S#49224", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45002", "S#49225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45003", "S#49226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45000", "S#49227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44986", "S#49228", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45004", "S#49229", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45005", "S#49230", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45006", "S#49231", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44988", "S#49232", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45007", "S#49233", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45008", "S#49234", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45009", "S#48887", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44987", "S#49235", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45010", "S#49236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45011", "S#49237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45012", "S#49238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44989", "S#49239", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45013", "S#49240", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45014", "S#49241", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45015", "S#48886", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45016", "S#49242", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45017", "S#49243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45018", "S#49244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45019", "S#49245", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45020", "S#49246", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45021", "S#49247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45022", "S#49248", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45023", "PARSE-LEXICAL-SEMANTIC-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45024", "S#49249", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45025", "S#49250", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45026", "S#49251", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45027", "S#49133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44949", "S#48753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45028", "S#49252", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45029", "S#48857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45030", "S#48602", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45031", "S#49253", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45032", "S#48603", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45033", "S#49254", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45034", "S#49255", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45035", "S#49256", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45036", "S#49257", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45037", "S#49258", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45038", "S#49259", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45039", "S#49260", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45040", "S#49261", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45041", "S#49262", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45042", "S#48604", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45043", "S#49263", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45044", "S#48605", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45045", "S#49264", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45046", "S#49265", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45047", "S#49266", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45048", "S#48606", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45049", "S#49267", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45050", "S#48591", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45051", "S#49268", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45052", "S#49269", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45053", "S#49270", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45054", "S#49271", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45055", "S#49272", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45056", "S#48607", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45057", "S#49273", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45058", "S#48592", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45059", "S#49274", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45060", "S#49275", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45061", "S#49276", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45062", "S#49277", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45063", "S#49278", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45064", "S#49279", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45065", "S#49280", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45066", "S#49281", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45067", "S#49282", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45068", "S#49283", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45069", "S#49284", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45070", "S#49285", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45071", "S#49286", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45072", "S#49287", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45073", "S#49288", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45074", "S#49289", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45075", "S#49290", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45076", "S#49291", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45077", "S#49292", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45078", "S#49293", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45079", "S#49294", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45080", "S#49295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45081", "S#49296", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45082", "S#49297", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45084", "S#49298", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45083", "S#49299", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45085", "S#49300", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45087", "S#49301", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45089", "S#49302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45086", "S#49303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45090", "S#49304", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45088", "S#49305", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f44982", "S#49306", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45092", "S#49307", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45093", "S#49308", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45091", "S#49309", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45094", "S#49310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45095", "S#49311", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45096", "S#49312", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45097", "S#49313", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45098", "S#49314", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45100", "S#49315", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45099", "S#49316", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45101", "S#49317", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45102", "S#49318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45103", "S#49319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45104", "S#49320", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45105", "S#49321", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45106", "S#49322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45107", "S#49323", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45108", "S#49324", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45109", "S#49325", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45110", "S#49326", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45111", "S#49327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45112", "S#49328", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45113", "S#49329", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45114", "S#49330", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45115", "S#49331", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45116", "S#49332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45117", "PREDS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45118", "S#49333", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45119", "ORDERED-LEXIFICATION-PREDS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45120", "S#49334", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45121", "WORD-VARIANTS", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45122", "ORDERED-WORD-VARIANTS", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45123", "S#49335", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45124", "S#49336", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45125", "S#49337", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45126", "S#49338", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45127", "S#49339", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45128", "S#49340", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45129", "S#49341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45130", "S#49342", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45131", "S#49343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45132", "S#49344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45133", "S#49345", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45135", "S#48870", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45137", "S#49346", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45136", "S#49347", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45134", "S#49348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45138", "S#49349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45140", "S#49350", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45141", "S#49351", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45142", "S#49352", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45139", "S#49353", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45143", "S#49354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45144", "S#49355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45145", "S#49356", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45146", "S#39910", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45147", "S#48035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45149", "S#49357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45150", "S#49358", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45151", "S#49359", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45148", "S#49360", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45152", "S#49361", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45153", "S#49362", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45154", "S#49363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45155", "S#49364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45156", "LEXICAL-MT-FOR-LANGUAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45157", "S#49365", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45158", "S#49366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45159", "S#49367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45160", "GET-LANGUAGE-FOR-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45161", "S#49368", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45162", "S#49369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45163", "S#49370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0732", "f45164", "GET-CODE-FOR-LANGUAGE", 1, 0, false);
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45166() {
        module0732.$g5788$ = SubLFiles.deflexical("S#49371", (SubLObject)module0732.$ic0$);
        module0732.$g5789$ = SubLFiles.deflexical("S#49372", (SubLObject)module0732.NIL);
        module0732.$g5790$ = SubLFiles.deflexical("S#49373", (SubLObject)module0732.NIL);
        module0732.$g5791$ = SubLFiles.deflexical("S#49374", (SubLObject)module0732.NIL);
        module0732.$g5792$ = SubLFiles.deflexical("S#49375", (SubLObject)module0732.NIL);
        module0732.$g5793$ = SubLFiles.deflexical("S#49376", (SubLObject)module0732.NIL);
        module0732.$g5794$ = SubLFiles.deflexical("S#49377", (SubLObject)module0732.NIL);
        module0732.$g5795$ = SubLFiles.deflexical("S#49378", (SubLObject)module0732.NIL);
        module0732.$g5796$ = SubLFiles.deflexical("S#49379", (SubLObject)module0732.NIL);
        module0732.$g5797$ = SubLFiles.deflexical("S#49380", module0107.f7627());
        module0732.$g5798$ = SubLFiles.deflexical("S#49381", (SubLObject)module0732.NIL);
        module0732.$g5799$ = SubLFiles.deflexical("S#49382", (SubLObject)module0732.NIL);
        module0732.$g5800$ = SubLFiles.deflexical("S#49383", (SubLObject)module0732.NIL);
        module0732.$g5801$ = SubLFiles.deflexical("S#49384", (SubLObject)module0732.NIL);
        module0732.$g5802$ = SubLFiles.deflexical("S#49385", (SubLObject)module0732.NIL);
        module0732.$g5803$ = SubLFiles.deflexical("S#49386", (SubLObject)module0732.$ic134$);
        module0732.$g5804$ = SubLFiles.deflexical("S#49387", (SubLObject)module0732.$ic189$);
        module0732.$g5805$ = SubLFiles.defconstant("S#49388", (SubLObject)module0732.$ic206$);
        module0732.$g5806$ = SubLFiles.deflexical("S#49389", (SubLObject)module0732.NIL);
        module0732.$g5807$ = SubLFiles.deflexical("S#49390", (SubLObject)module0732.NIL);
        module0732.$g5808$ = SubLFiles.deflexical("S#49391", (SubLObject)module0732.NIL);
        module0732.$g5809$ = SubLFiles.deflexical("S#49392", (SubLObject)module0732.$ic290$);
        module0732.$g5810$ = SubLFiles.deflexical("S#49393", (SubLObject)module0732.$ic296$);
        module0732.$g5811$ = SubLFiles.deflexical("S#49394", (SubLObject)module0732.NIL);
        module0732.$g5812$ = SubLFiles.deflexical("S#49395", (SubLObject)module0732.NIL);
        module0732.$g5813$ = SubLFiles.deflexical("S#49396", (SubLObject)module0732.NIL);
        return (SubLObject)module0732.NIL;
    }
    
    public static SubLObject f45167() {
        module0034.f1909((SubLObject)module0732.$ic16$);
        module0034.f1909((SubLObject)module0732.$ic28$);
        module0034.f1909((SubLObject)module0732.$ic55$);
        module0034.f1909((SubLObject)module0732.$ic67$);
        module0034.f1909((SubLObject)module0732.$ic71$);
        module0034.f1909((SubLObject)module0732.$ic81$);
        module0034.f1909((SubLObject)module0732.$ic95$);
        module0034.f1909((SubLObject)module0732.$ic98$);
        module0034.f1909((SubLObject)module0732.$ic105$);
        module0034.f1909((SubLObject)module0732.$ic107$);
        module0034.f1909((SubLObject)module0732.$ic111$);
        module0034.f1909((SubLObject)module0732.$ic115$);
        module0034.f1909((SubLObject)module0732.$ic118$);
        module0034.f1909((SubLObject)module0732.$ic208$);
        module0034.f1895((SubLObject)module0732.$ic281$);
        module0034.f1909((SubLObject)module0732.$ic286$);
        module0012.f419((SubLObject)module0732.$ic297$);
        module0034.f1909((SubLObject)module0732.$ic302$);
        module0002.f38((SubLObject)module0732.$ic302$);
        module0034.f1909((SubLObject)module0732.$ic309$);
        module0002.f38((SubLObject)module0732.$ic309$);
        module0034.f1909((SubLObject)module0732.$ic314$);
        module0002.f38((SubLObject)module0732.$ic314$);
        return (SubLObject)module0732.NIL;
    }
    
    public void declareFunctions() {
        f45165();
    }
    
    public void initializeVariables() {
        f45166();
    }
    
    public void runTopLevelForms() {
        f45167();
    }
    
    static {
        me = (SubLFile)new module0732();
        module0732.$g5788$ = null;
        module0732.$g5789$ = null;
        module0732.$g5790$ = null;
        module0732.$g5791$ = null;
        module0732.$g5792$ = null;
        module0732.$g5793$ = null;
        module0732.$g5794$ = null;
        module0732.$g5795$ = null;
        module0732.$g5796$ = null;
        module0732.$g5797$ = null;
        module0732.$g5798$ = null;
        module0732.$g5799$ = null;
        module0732.$g5800$ = null;
        module0732.$g5801$ = null;
        module0732.$g5802$ = null;
        module0732.$g5803$ = null;
        module0732.$g5804$ = null;
        module0732.$g5805$ = null;
        module0732.$g5806$ = null;
        module0732.$g5807$ = null;
        module0732.$g5808$ = null;
        module0732.$g5809$ = null;
        module0732.$g5810$ = null;
        module0732.$g5811$ = null;
        module0732.$g5812$ = null;
        module0732.$g5813$ = null;
        $ic0$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Mass")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Pl")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Sg")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("gerund")));
        $ic1$ = SubLObjectFactory.makeString("MWW");
        $ic2$ = SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $ic3$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic4$ = SubLObjectFactory.makeSymbol("CAR");
        $ic5$ = SubLObjectFactory.makeKeyword("ANY");
        $ic6$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic7$ = SubLObjectFactory.makeString("-MWW");
        $ic8$ = SubLObjectFactory.makeString("-TheWord");
        $ic9$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt"));
        $ic10$ = SubLObjectFactory.makeKeyword("MONOTONIC");
        $ic11$ = SubLObjectFactory.makeKeyword("DENOT");
        $ic12$ = SubLObjectFactory.makeString("");
        $ic13$ = SubLObjectFactory.makeKeyword("RELATED");
        $ic14$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("denotation"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("subcatFrame"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#49170", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#49372", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic19$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("speechPartPreds"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CountNoun"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MassNoun"));
        $ic22$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AgentiveNoun"));
        $ic23$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProperMassNoun"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProperCountNoun"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Verb"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Adverb"));
        $ic28$ = SubLObjectFactory.makeSymbol("S#49177", "CYC");
        $ic29$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("gerund"));
        $ic30$ = SubLObjectFactory.makeSymbol("S#49181", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#49373", "CYC");
        $ic32$ = SubLObjectFactory.makeInteger(32);
        $ic33$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic34$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic35$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic36$ = SubLObjectFactory.makeKeyword("STACK");
        $ic37$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic38$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic39$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic40$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic41$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic42$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic43$ = SubLObjectFactory.makeString("continue anyway");
        $ic44$ = SubLObjectFactory.makeKeyword("WARN");
        $ic45$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic46$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("paraphraseCoercionAllowedFrom"));
        $ic48$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic49$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic50$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic51$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularSuffix"));
        $ic52$ = SubLObjectFactory.makeSymbol("SPEC-POS-PRED?");
        $ic53$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural"));
        $ic54$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nounStrings"));
        $ic55$ = SubLObjectFactory.makeSymbol("S#49185", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#49374", "CYC");
        $ic57$ = SubLObjectFactory.makeInteger(64);
        $ic58$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("infinitive")));
        $ic59$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Determiner-Definite"));
        $ic60$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Definite-NLAttr"));
        $ic61$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PossessiveMarker"));
        $ic62$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Determiner-Indefinite"));
        $ic63$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Indefinite-NLAttr"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BareForm-NLAttr"));
        $ic65$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $ic66$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NumericalQuant-NLAttrFn"));
        $ic67$ = SubLObjectFactory.makeSymbol("S#49198", "CYC");
        $ic68$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ScalarInterval"));
        $ic69$ = SubLObjectFactory.makeSymbol("S#49375", "CYC");
        $ic70$ = SubLObjectFactory.makeInteger(128);
        $ic71$ = SubLObjectFactory.makeSymbol("S#49205", "CYC");
        $ic72$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1"));
        $ic73$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn"));
        $ic74$ = SubLObjectFactory.makeString("barLevelOfPhraseType");
        $ic75$ = SubLObjectFactory.makeSymbol("S#12343", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("?LEVEL");
        $ic77$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("barLevelOfPhraseType"));
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LEVEL"));
        $ic79$ = SubLObjectFactory.makeString("Couldn't determine bar-level for ~S in ~S. Using 1.~%");
        $ic80$ = SubLObjectFactory.makeSymbol("S#49376", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#49209", "CYC");
        $ic82$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn")));
        $ic83$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $ic84$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Noun"));
        $ic85$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PrepositionalPhrase"));
        $ic86$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Preposition"));
        $ic87$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PossessivePhrase"));
        $ic88$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLSentence"));
        $ic89$ = SubLObjectFactory.makeSymbol("?POS");
        $ic90$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("posOfPhraseType"));
        $ic91$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?POS"));
        $ic92$ = SubLObjectFactory.makeSymbol("S#49377", "CYC");
        $ic93$ = SubLObjectFactory.makeKeyword("GAF");
        $ic94$ = SubLObjectFactory.makeKeyword("CLEARED");
        $ic95$ = SubLObjectFactory.makeSymbol("S#48888", "CYC");
        $ic96$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("denotatumArg"));
        $ic97$ = SubLObjectFactory.makeSymbol("S#49378", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("S#48893", "CYC");
        $ic99$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("semTransArg"));
        $ic100$ = SubLObjectFactory.makeSymbol("S#49379", "CYC");
        $ic101$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?N"));
        $ic102$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLSemanticPredicate"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?GENL-PRED")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("argIsa")), (SubLObject)SubLObjectFactory.makeSymbol("?GENL-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?N"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SpeechPart"))));
        $ic103$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)module0732.NIL, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $ic104$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic105$ = SubLObjectFactory.makeSymbol("S#49227", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("S#49381", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("S#49231", "CYC");
        $ic108$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubcategorizationFrame"));
        $ic109$ = SubLObjectFactory.makeSymbol("SPEC?");
        $ic110$ = SubLObjectFactory.makeSymbol("S#49382", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#48887", "CYC");
        $ic112$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("partOfSpeech"));
        $ic113$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LexicalWord"));
        $ic114$ = SubLObjectFactory.makeSymbol("S#49383", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#49238", "CYC");
        $ic116$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Integer"));
        $ic117$ = SubLObjectFactory.makeSymbol("S#49384", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#48886", "CYC");
        $ic119$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ListOfTypeFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubLString")));
        $ic120$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ListOfTypeFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ControlCharacterFreeString")));
        $ic121$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"));
        $ic122$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $ic123$ = ConsesLow.list((SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.THREE_INTEGER);
        $ic124$ = SubLObjectFactory.makeSymbol("<");
        $ic125$ = SubLObjectFactory.makeSymbol("S#49385", "CYC");
        $ic126$ = SubLObjectFactory.makeSymbol(">");
        $ic127$ = SubLObjectFactory.makeSymbol("S#49248", "CYC");
        $ic128$ = SubLObjectFactory.makeSymbol("S#12753", "CYC");
        $ic129$ = SubLObjectFactory.makeKeyword("POS");
        $ic130$ = SubLObjectFactory.makeKeyword("PRED");
        $ic131$ = SubLObjectFactory.makeKeyword("WU");
        $ic132$ = SubLObjectFactory.makeSymbol("STRING=");
        $ic133$ = SubLObjectFactory.makeString(" ");
        $ic134$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnSingular")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular"))), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnPlural")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural"))), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnMassNumber")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("massNumber"))), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnNonPlural-Generic")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"))), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("properNounStrings")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("commonNounStrings"))));
        $ic135$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProperNoun"));
        $ic136$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CommonNoun"));
        $ic137$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SimpleNoun"));
        $ic138$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular"));
        $ic139$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("massNumber"));
        $ic140$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnSingular"));
        $ic141$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnPlural"));
        $ic142$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnMassNumber"));
        $ic143$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Sg"));
        $ic144$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Pl"));
        $ic145$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Mass"));
        $ic146$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("infinitive"));
        $ic147$ = SubLObjectFactory.makeString("thirdPersonSg-Present");
        $ic148$ = SubLObjectFactory.makeString("thirdPersonSg-Generic");
        $ic149$ = SubLObjectFactory.makeString("pastTense-Universal");
        $ic150$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("perfect"));
        $ic151$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("presentParticiple"));
        $ic152$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularDegree"));
        $ic153$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("comparativeDegree"));
        $ic154$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("superlativeDegree"));
        $ic155$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonGradableAdjectiveForm"));
        $ic156$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularAdverb"));
        $ic157$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("comparativeAdverb"));
        $ic158$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("superlativeAdverb"));
        $ic159$ = SubLObjectFactory.makeKeyword("STRING");
        $ic160$ = SubLObjectFactory.makeKeyword("GREEDY");
        $ic161$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic162$ = SubLObjectFactory.makeSymbol("FUNCTIONP");
        $ic163$ = SubLObjectFactory.makeKeyword("DILIGENT");
        $ic164$ = SubLObjectFactory.makeString("~s is not a valid mode argument");
        $ic165$ = SubLObjectFactory.makeKeyword("INTERVAL");
        $ic166$ = SubLObjectFactory.makeString("~s is not a valid output argument");
        $ic167$ = ConsesLow.list((SubLObject)module0732.NIL);
        $ic168$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EnglishWord"));
        $ic169$ = SubLObjectFactory.makeSymbol("S#39567", "CYC");
        $ic170$ = SubLObjectFactory.makeString("~%;;; NL statistics~%;;; CycL ~A, KB ~S.~D~%");
        $ic171$ = SubLObjectFactory.makeString("/cyc/departments/nl/doc/stats/kb");
        $ic172$ = SubLObjectFactory.makeString(".");
        $ic173$ = SubLObjectFactory.makeString("-");
        $ic174$ = SubLObjectFactory.makeString(".stats");
        $ic175$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic176$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic177$ = SubLObjectFactory.makeString("~%Instances of #$EnglishWord : ~6,' D");
        $ic178$ = SubLObjectFactory.makeString("~%Number of root forms       : ~6,' D~%");
        $ic179$ = SubLObjectFactory.makeString("~%~%Grand total : ~D~%~%");
        $ic180$ = SubLObjectFactory.makeString("~%~%Grand total : ~D");
        $ic181$ = SubLObjectFactory.makeString("Output in ~S");
        $ic182$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLPredicate"));
        $ic183$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17932", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCES"), (SubLObject)SubLObjectFactory.makeSymbol("S#49397", "CYC"));
        $ic184$ = SubLObjectFactory.makeString("~%~%Instances of ~S:");
        $ic185$ = SubLObjectFactory.makeInteger(40);
        $ic186$ = SubLObjectFactory.makeString("~%~A");
        $ic187$ = SubLObjectFactory.makeString(": ~6,' D");
        $ic188$ = SubLObjectFactory.makeString("~%Total for ~S: ~D");
        $ic189$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("OpenCycNLPredicate")));
        $ic190$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic191$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic192$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic193$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic194$ = SubLObjectFactory.makeSymbol("NUM-PREDICATE-EXTENT-INDEX");
        $ic195$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProperNamePredicate-Loose"));
        $ic196$ = SubLObjectFactory.makeString("mapping Cyc FORTs");
        $ic197$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic198$ = SubLObjectFactory.makeString("~&LOOSE: ~S (~D so far)~%");
        $ic199$ = SubLObjectFactory.makeString(" ~S");
        $ic200$ = SubLObjectFactory.makeSymbol("THIRD");
        $ic201$ = SubLObjectFactory.makeSymbol("ASSERTION-FORMULA");
        $ic202$ = SubLObjectFactory.makeString("~%~%Forts with real lexification:  ~6,' D~%");
        $ic203$ = SubLObjectFactory.makeString("~%~%Forts with loose lexification: ~6,' D~%");
        $ic204$ = SubLObjectFactory.makeString("~%~%Forts with NO lexification:    ~6,' D~%");
        $ic205$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ParseTemplatePredicate-Reln"));
        $ic206$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLSemanticPredicate")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLGenerationPredicate")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLPragmaticPredicate")));
        $ic207$ = SubLObjectFactory.makeSymbol("S#14110", "CYC");
        $ic208$ = SubLObjectFactory.makeSymbol("S#49309", "CYC");
        $ic209$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLPragmaticPredicate"));
        $ic210$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic211$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genTemplate-QuerySentence"));
        $ic212$ = SubLObjectFactory.makeSymbol("S#11996", "CYC");
        $ic213$ = SubLObjectFactory.makeSymbol("S#49389", "CYC");
        $ic214$ = SubLObjectFactory.makeInteger(1024);
        $ic215$ = SubLObjectFactory.makeSymbol("S#49306", "CYC");
        $ic216$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLSyntacticPredicate"));
        $ic217$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LinguisticObjectType"));
        $ic218$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycLExpressionType"));
        $ic219$ = SubLObjectFactory.makeString("genStringAssertion-Terse");
        $ic220$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genStringAssertion"));
        $ic221$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genStringAssertion-Precise"));
        $ic222$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genStringAssertion-Terse"));
        $ic223$ = SubLObjectFactory.makeSymbol("S#49317", "CYC");
        $ic224$ = SubLObjectFactory.makeSymbol("S#48802", "CYC");
        $ic225$ = SubLObjectFactory.makeSymbol("S#15821", "CYC");
        $ic226$ = SubLObjectFactory.makeSymbol("APPEND");
        $ic227$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genStringAssertion-Constrained"));
        $ic228$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("preferredLexification")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genStringAssertion")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genStringAssertion-Constrained")));
        $ic229$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("preferredNameString"));
        $ic230$ = SubLObjectFactory.makeSymbol("S#49315", "CYC");
        $ic231$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nameString"));
        $ic232$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProperNamePredicate-Stub"));
        $ic233$ = SubLObjectFactory.makeSymbol("GAF-ARG1");
        $ic234$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheTerm"));
        $ic235$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("StubTerm"));
        $ic236$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycNounLearnerMt"));
        $ic237$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TestingConstant"));
        $ic238$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("verbSemTrans"));
        $ic239$ = ConsesLow.list((SubLObject)module0732.TWO_INTEGER, (SubLObject)module0732.THREE_INTEGER, (SubLObject)module0732.FOUR_INTEGER);
        $ic240$ = SubLObjectFactory.makeString("~&~S in ~S~%");
        $ic241$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("posForms"));
        $ic242$ = SubLObjectFactory.makeKeyword("APPEND");
        $ic243$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("multiWordString"));
        $ic244$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("compoundString"));
        $ic245$ = SubLObjectFactory.makeString(";; ~a has ~a denotations in ~a");
        $ic246$ = SubLObjectFactory.makeString(";; without appropriate #$posForms in #$GeneralEnglishMt or elsewhere");
        $ic247$ = SubLObjectFactory.makeString("(ke-assert '(~a ~a \"~a\") ~a :DEFAULT :FORWARD)");
        $ic248$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CountNoun")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MassNoun")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProperMassNoun")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProperCountNoun")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AgentiveNoun")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Adjective")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Adverb")));
        $ic249$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("StringIndexingSlot"));
        $ic250$ = SubLObjectFactory.makeString("~&~S in ~S~%~%");
        $ic251$ = SubLObjectFactory.makeSymbol("S#4076", "CYC");
        $ic252$ = SubLObjectFactory.makeString("~&~S~%");
        $ic253$ = SubLObjectFactory.makeString("; fort\ttype\t#lex-asserts~%");
        $ic254$ = SubLObjectFactory.makeString("~s\t~s\t~s~%");
        $ic255$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLGenerationPredicate"));
        $ic256$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic257$ = SubLObjectFactory.makeSymbol("S#39431", "CYC");
        $ic258$ = SubLObjectFactory.makeKeyword("NOUN");
        $ic259$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic260$ = SubLObjectFactory.makeString("Determiner-Central");
        $ic261$ = SubLObjectFactory.makeKeyword("NEVER");
        $ic262$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("WHWord"));
        $ic263$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nameSpelling"));
        $ic264$ = SubLObjectFactory.makeSymbol("?NAME");
        $ic265$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NameLexicalMt"));
        $ic266$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("commonNickname"));
        $ic267$ = SubLObjectFactory.makeSymbol("S#49343", "CYC");
        $ic268$ = SubLObjectFactory.makeSymbol("S#49344", "CYC");
        $ic269$ = SubLObjectFactory.makeKeyword("BOTH");
        $ic270$ = SubLObjectFactory.makeKeyword("MASC");
        $ic271$ = SubLObjectFactory.makeKeyword("FEM");
        $ic272$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic273$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HumanMaleGivenName"));
        $ic274$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HumanFemaleGivenName"));
        $ic275$ = SubLObjectFactory.makeKeyword("PREFIX");
        $ic276$ = SubLObjectFactory.makeKeyword("SUFFIX");
        $ic277$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("WordWithPrefixFn"));
        $ic278$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("WordWithSuffixFn"));
        $ic279$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AllLexicalMicrotheoryPSC"));
        $ic280$ = SubLObjectFactory.makeSymbol("S#48986", "CYC");
        $ic281$ = SubLObjectFactory.makeSymbol("S#49347", "CYC");
        $ic282$ = SubLObjectFactory.makeSymbol("?AFFIX");
        $ic283$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("derivedUsingAffix"));
        $ic284$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)module0732.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0732.ONE_INTEGER);
        $ic285$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LexicalPrefix"));
        $ic286$ = SubLObjectFactory.makeSymbol("S#49353", "CYC");
        $ic287$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Number-SP"));
        $ic288$ = SubLObjectFactory.makeSymbol("S#49391", "CYC");
        $ic289$ = SubLObjectFactory.makeInteger(100);
        $ic290$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TransitiveNPFrame")), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntransitiveVerbFrame")), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT")));
        $ic291$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic292$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"));
        $ic293$ = SubLObjectFactory.makeKeyword("FORT");
        $ic294$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")));
        $ic295$ = SubLObjectFactory.makeSymbol("S#13264", "CYC");
        $ic296$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic297$ = SubLObjectFactory.makeSymbol("S#49358", "CYC");
        $ic298$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#887", "CYC"));
        $ic299$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MT"), (SubLObject)SubLObjectFactory.makeSymbol("?LANGUAGE"));
        $ic300$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("mtLanguage")), (SubLObject)SubLObjectFactory.makeSymbol("?MT"), (SubLObject)SubLObjectFactory.makeSymbol("?LANGUAGE"));
        $ic301$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $ic302$ = SubLObjectFactory.makeSymbol("LEXICAL-MT-FOR-LANGUAGE");
        $ic303$ = SubLObjectFactory.makeKeyword("MT");
        $ic304$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("languageHasRootLexicon"));
        $ic305$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $ic306$ = SubLObjectFactory.makeSymbol("S#49394", "CYC");
        $ic307$ = SubLObjectFactory.makeInteger(256);
        $ic308$ = SubLObjectFactory.makeSymbol("S#49362", "CYC");
        $ic309$ = SubLObjectFactory.makeSymbol("GET-LANGUAGE-FOR-CODE");
        $ic310$ = SubLObjectFactory.makeKeyword("LANG");
        $ic311$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("languageCodeDigraph"));
        $ic312$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CrossLinguisticLexicalMt"));
        $ic313$ = SubLObjectFactory.makeSymbol("S#49395", "CYC");
        $ic314$ = SubLObjectFactory.makeSymbol("GET-CODE-FOR-LANGUAGE");
        $ic315$ = SubLObjectFactory.makeKeyword("CODE");
        $ic316$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CODE"));
        $ic317$ = SubLObjectFactory.makeSymbol("S#49396", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0732.class
	Total time: 9732 ms
	
	Decompiled with Procyon 0.5.32.
*/
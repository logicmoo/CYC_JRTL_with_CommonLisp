package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0821 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0821";
    public static final String myFingerPrint = "6f3b7d871a4e6396fa9cf7e9604dede16de0fbec2955bc0d22fefac27957047d";
    private static SubLSymbol $g6527$;
    private static SubLSymbol $g6528$;
    private static SubLSymbol $g6529$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLInteger $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLList $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLString $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLString $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLString $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLString $ic138$;
    
    public static SubLObject f52796(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0821.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0821.NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)module0821.NIL;
        SubLObject var9_10 = (SubLObject)module0821.NIL;
        while (module0821.NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0821.$ic0$);
            var9_10 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)module0821.$ic0$);
            if (module0821.NIL == conses_high.member(var9_10, (SubLObject)module0821.$ic1$, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED)) {
                var8 = (SubLObject)module0821.T;
            }
            if (var9_10 == module0821.$ic2$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (module0821.NIL != var8 && module0821.NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0821.$ic0$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0821.$ic3$, var4);
        final SubLObject var10 = (SubLObject)((module0821.NIL != var9) ? conses_high.cadr(var9) : module0821.NIL);
        final SubLObject var11;
        var4 = (var11 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0821.$ic4$, reader.bq_cons((SubLObject)module0821.$ic5$, ConsesLow.append((SubLObject)((module0821.NIL != var10) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0821.$ic6$, (SubLObject)ConsesLow.list((SubLObject)module0821.$ic7$, var10))) : module0821.NIL), (SubLObject)module0821.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0821.$ic8$, (SubLObject)module0821.$ic9$, ConsesLow.append(var11, (SubLObject)module0821.NIL)));
    }
    
    public static SubLObject f52797(final SubLObject var14) {
        module0642.f39020(module0015.$g240$.getGlobalValue());
        module0656.f39837((SubLObject)module0821.$ic10$, var14, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g241$.getGlobalValue());
        return var14;
    }
    
    public static SubLObject f52798(final SubLObject var14) {
        module0642.f39020(module0015.$g240$.getGlobalValue());
        module0656.f39837((SubLObject)module0821.$ic11$, var14, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g241$.getGlobalValue());
        return var14;
    }
    
    public static SubLObject f52799(final SubLObject var15) {
        module0642.f39020(module0015.$g240$.getGlobalValue());
        module0656.f39837((SubLObject)module0821.$ic12$, var15, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g241$.getGlobalValue());
        return var15;
    }
    
    public static SubLObject f52800(final SubLObject var14) {
        final SubLObject var15 = module0811.f51802(var14);
        module0642.f39019(var15);
        return var14;
    }
    
    public static SubLObject f52801(final SubLObject var14) {
        final SubLObject var15 = module0811.f51801(var14);
        module0642.f39019(var15);
        return var14;
    }
    
    public static SubLObject f52802(final SubLObject var14) {
        return f52803(module0811.f51802(var14));
    }
    
    public static SubLObject f52804(final SubLObject var14) {
        return f52803(module0811.f51801(var14));
    }
    
    public static SubLObject f52803(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = f52805(var17);
        module0642.f39020(module0015.$g149$.getGlobalValue());
        module0642.f39020(module0015.$g152$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39048(var19);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        final SubLObject var20 = module0015.$g533$.currentBinding(var18);
        try {
            module0015.$g533$.bind((SubLObject)module0821.T, var18);
            module0642.f39027((SubLObject)module0821.$ic13$, (SubLObject)module0821.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var20, var18);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        return var17;
    }
    
    public static SubLObject f52805(final SubLObject var17) {
        return conses_high.second(conses_high.assoc(var17, module0821.$g6527$.getGlobalValue(), (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED));
    }
    
    public static SubLObject f52806(final SubLObject var21) {
        module0642.f39020(module0015.$g240$.getGlobalValue());
        module0642.f39019(var21);
        module0642.f39020(module0015.$g241$.getGlobalValue());
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52807(SubLObject var22) {
        if (var22 == module0821.UNPROVIDED) {
            var22 = (SubLObject)module0821.NIL;
        }
        return f52808();
    }
    
    public static SubLObject f52809(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0656.f39832((SubLObject)module0821.$ic16$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0821.$ic17$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        if (module0821.NIL != var25) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        final SubLObject var26 = module0015.$g533$.currentBinding(var24);
        try {
            module0015.$g533$.bind((SubLObject)module0821.T, var24);
            module0642.f39019(var23);
        }
        finally {
            module0015.$g533$.rebind(var26, var24);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52810(SubLObject var22) {
        if (var22 == module0821.UNPROVIDED) {
            var22 = (SubLObject)module0821.NIL;
        }
        return f52808();
    }
    
    public static SubLObject f52811(SubLObject var23) {
        if (var23 == module0821.UNPROVIDED) {
            var23 = (SubLObject)module0821.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (module0821.NIL == var23) {
            var23 = (SubLObject)module0821.$ic21$;
        }
        final SubLObject var25 = module0656.f39832((SubLObject)module0821.$ic22$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0821.$ic23$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        if (module0821.NIL != var25) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        final SubLObject var26 = module0015.$g533$.currentBinding(var24);
        try {
            module0015.$g533$.bind((SubLObject)module0821.T, var24);
            module0642.f39019(var23);
        }
        finally {
            module0015.$g533$.rebind(var26, var24);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52808() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0821.NIL == module0820.f52653()) {
            return module0656.f39789((SubLObject)module0821.$ic26$, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
        }
        module0642.f39020((SubLObject)module0821.$ic27$);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
        final SubLObject var19 = module0014.f672((SubLObject)module0821.$ic28$);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39020((SubLObject)module0821.$ic29$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        if (module0821.NIL != var19) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
            module0642.f39020(var19);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39020((SubLObject)module0821.$ic30$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0821.$ic31$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        final SubLObject var20 = module0015.$g535$.currentBinding(var18);
        try {
            module0015.$g535$.bind((SubLObject)module0821.T, var18);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
            final SubLObject var20_26 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)module0821.T, var18);
                final SubLObject var21 = module0656.f39832((SubLObject)module0821.NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020((SubLObject)module0821.$ic32$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                if (module0821.NIL != var21) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(var21);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_27 = module0015.$g533$.currentBinding(var18);
                final SubLObject var22 = module0015.$g541$.currentBinding(var18);
                final SubLObject var23 = module0015.$g539$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var18);
                    module0015.$g541$.bind((SubLObject)module0821.T, var18);
                    module0015.$g539$.bind(module0015.f797(), var18);
                    module0642.f39069((SubLObject)module0821.$ic33$, (SubLObject)module0821.T, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39021((SubLObject)module0821.$ic31$);
                    module0642.f39026((SubLObject)module0821.TWO_INTEGER);
                    module0656.f39837((SubLObject)module0821.$ic34$, (SubLObject)module0821.$ic35$, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39026((SubLObject)module0821.TWO_INTEGER);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_28 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var18);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_29 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var18);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0821.$ic37$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                            final SubLObject var20_30 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)module0821.T, var18);
                                module0642.f39019((SubLObject)module0821.$ic38$);
                            }
                            finally {
                                module0015.$g533$.rebind(var20_30, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0821.$ic37$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                            final SubLObject var20_31 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)module0821.T, var18);
                                module0642.f39020(module0015.$g318$.getGlobalValue());
                                module0642.f39020(module0015.$g320$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                                module0642.f39020((SubLObject)module0821.$ic39$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                                final SubLObject var20_32 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0821.T, var18);
                                    module0642.f39020(module0015.$g324$.getGlobalValue());
                                    module0642.f39046(module0015.$g327$.getGlobalValue());
                                    module0642.f39020(module0015.$g326$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0821.$ic40$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                                    final SubLObject var20_33 = module0015.$g533$.currentBinding(var18);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0821.T, var18);
                                        module0642.f39019((SubLObject)module0821.$ic41$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var20_33, var18);
                                    }
                                    module0642.f39020(module0015.$g325$.getGlobalValue());
                                    module0642.f39020(module0015.$g324$.getGlobalValue());
                                    module0642.f39020(module0015.$g326$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0821.$ic42$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                                    final SubLObject var20_34 = module0015.$g533$.currentBinding(var18);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0821.T, var18);
                                        module0642.f39019((SubLObject)module0821.$ic43$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var20_34, var18);
                                    }
                                    module0642.f39020(module0015.$g325$.getGlobalValue());
                                    module0642.f39020(module0015.$g324$.getGlobalValue());
                                    module0642.f39020(module0015.$g326$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0821.$ic44$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                                    final SubLObject var20_35 = module0015.$g533$.currentBinding(var18);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0821.T, var18);
                                        module0642.f39019((SubLObject)module0821.$ic45$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var20_35, var18);
                                    }
                                    module0642.f39020(module0015.$g325$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_32, var18);
                                }
                                module0642.f39020(module0015.$g319$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_31, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0821.$ic37$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                            final SubLObject var20_36 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)module0821.T, var18);
                                module0642.f39019((SubLObject)module0821.$ic46$);
                            }
                            finally {
                                module0015.$g533$.rebind(var20_36, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var20_29, var18);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0821.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_28, var18);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    module0642.f39075((SubLObject)module0821.$ic47$, (SubLObject)module0821.NIL, (SubLObject)module0821.$ic48$);
                    module0642.f39026((SubLObject)module0821.TWO_INTEGER);
                    module0642.f39074((SubLObject)module0821.$ic49$, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39032((SubLObject)module0821.UNPROVIDED);
                    module0644.f39184((SubLObject)module0821.$ic47$, (SubLObject)module0821.$ic50$);
                    module0642.f39032((SubLObject)module0821.UNPROVIDED);
                    module0015.f799(module0015.$g539$.getDynamicValue(var18));
                }
                finally {
                    module0015.$g539$.rebind(var23, var18);
                    module0015.$g541$.rebind(var22, var18);
                    module0015.$g533$.rebind(var20_27, var18);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)module0821.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var20_26, var18);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0821.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var20, var18);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52812(final SubLObject var22) {
        final SubLObject var23 = module0642.f39104((SubLObject)module0821.$ic39$, var22);
        final SubLObject var24 = module0642.f39104((SubLObject)module0821.$ic47$, var22);
        if (module0821.$ic40$.equal(var23)) {
            return f52813(reader.read_from_string_ignoring_errors(var24, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED));
        }
        if (module0821.$ic42$.equal(var23)) {
            return f52814(reader.read_from_string_ignoring_errors(var24, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED));
        }
        if (module0821.$ic44$.equal(var23)) {
            return f52815(Strings.string_upcase(var24, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED));
        }
        return f52810((SubLObject)module0821.UNPROVIDED);
    }
    
    public static SubLObject f52816(SubLObject var22) {
        if (var22 == module0821.UNPROVIDED) {
            var22 = (SubLObject)module0821.NIL;
        }
        return f52817();
    }
    
    public static SubLObject f52818(SubLObject var23) {
        if (var23 == module0821.UNPROVIDED) {
            var23 = (SubLObject)module0821.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (module0821.NIL == var23) {
            var23 = (SubLObject)module0821.$ic53$;
        }
        final SubLObject var25 = module0656.f39832((SubLObject)module0821.$ic22$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0821.$ic54$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        if (module0821.NIL != var25) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        final SubLObject var26 = module0015.$g533$.currentBinding(var24);
        try {
            module0015.$g533$.bind((SubLObject)module0821.T, var24);
            module0642.f39019(var23);
        }
        finally {
            module0015.$g533$.rebind(var26, var24);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52817() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0821.NIL == module0820.f52653()) {
            return module0656.f39789((SubLObject)module0821.$ic26$, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
        }
        module0642.f39020((SubLObject)module0821.$ic27$);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
        final SubLObject var19 = module0014.f672((SubLObject)module0821.$ic28$);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39020((SubLObject)module0821.$ic29$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        if (module0821.NIL != var19) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
            module0642.f39020(var19);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39020((SubLObject)module0821.$ic30$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0821.$ic56$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        final SubLObject var20 = module0015.$g535$.currentBinding(var18);
        try {
            module0015.$g535$.bind((SubLObject)module0821.T, var18);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
            final SubLObject var20_42 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)module0821.T, var18);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0656.f39837((SubLObject)module0821.$ic34$, (SubLObject)module0821.$ic56$, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39032((SubLObject)module0821.FOUR_INTEGER);
                module0656.f39837((SubLObject)module0821.$ic24$, (SubLObject)module0821.$ic57$, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                module0642.f39026((SubLObject)module0821.TWO_INTEGER);
                module0642.f39019((SubLObject)module0821.$ic58$);
                module0642.f39026((SubLObject)module0821.UNPROVIDED);
                f52819();
                module0642.f39051((SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020((SubLObject)module0821.ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0015.$g353$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020((SubLObject)module0821.ONE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0015.$g354$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020((SubLObject)module0821.ONE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_43 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var18);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_44 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var18);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_45 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var18);
                            module0642.f39019((SubLObject)module0821.$ic59$);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_45, var18);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_46 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var18);
                            module0642.f39019((SubLObject)module0821.$ic60$);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_46, var18);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var20_44, var18);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0821.UNPROVIDED);
                    SubLObject var21 = module0820.f52654();
                    SubLObject var22 = (SubLObject)module0821.NIL;
                    var22 = var21.first();
                    while (module0821.NIL != var21) {
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_47 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var18);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                            final SubLObject var20_48 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)module0821.T, var18);
                                f52799(var22);
                            }
                            finally {
                                module0015.$g533$.rebind(var20_48, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                            final SubLObject var20_49 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)module0821.T, var18);
                                f52820(var22);
                            }
                            finally {
                                module0015.$g533$.rebind(var20_49, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var20_47, var18);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0821.UNPROVIDED);
                        var21 = var21.rest();
                        var22 = var21.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var20_43, var18);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
                module0642.f39029((SubLObject)module0821.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var20_42, var18);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0821.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var20, var18);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52819() {
        final SubLObject var51 = module0820.f52665();
        module0642.f39020(module0015.$g240$.getGlobalValue());
        SubLObject var52 = var51;
        SubLObject var53 = (SubLObject)module0821.NIL;
        var53 = var52.first();
        while (module0821.NIL != var52) {
            f52821(var53);
            module0642.f39032((SubLObject)module0821.UNPROVIDED);
            var52 = var52.rest();
            var53 = var52.first();
        }
        module0642.f39020(module0015.$g241$.getGlobalValue());
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52820(final SubLObject var15) {
        final SubLObject var16 = module0820.f52664(var15);
        if (module0821.T != var16) {
            module0642.f39020(module0015.$g240$.getGlobalValue());
            f52821(var16);
            module0642.f39020(module0015.$g241$.getGlobalValue());
        }
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52821(final SubLObject var54) {
        if (var54.isAtom()) {
            module0642.f39019(Symbols.symbol_name(var54));
        }
        else {
            SubLObject var55 = (SubLObject)module0821.NIL;
            SubLObject var56 = (SubLObject)module0821.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var54, var54, (SubLObject)module0821.$ic62$);
            var55 = var54.first();
            final SubLObject var57 = var56 = var54.rest();
            module0642.f39019((SubLObject)module0821.$ic63$);
            module0642.f39019(Symbols.symbol_name(var55));
            SubLObject var58 = var56;
            SubLObject var59 = (SubLObject)module0821.NIL;
            var59 = var58.first();
            while (module0821.NIL != var58) {
                module0642.f39032((SubLObject)module0821.UNPROVIDED);
                f52821(var59);
                var58 = var58.rest();
                var59 = var58.first();
            }
            module0642.f39019((SubLObject)module0821.$ic64$);
        }
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52822(final SubLObject var22) {
        SubLObject var23 = (SubLObject)module0821.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var22, (SubLObject)module0821.$ic65$);
        var23 = var22.first();
        final SubLObject var24 = var22.rest();
        if (module0821.NIL == var24) {
            return f52815(var23);
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0821.$ic65$);
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52823(final SubLObject var15, SubLObject var23) {
        if (var23 == module0821.UNPROVIDED) {
            var23 = (SubLObject)module0821.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert module0821.NIL != module0820.f52652(var15) : var15;
        if (module0821.NIL == var23) {
            var23 = var15;
        }
        final SubLObject var25 = module0656.f39832((SubLObject)module0821.$ic22$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0821.$ic68$);
        module0642.f39044(var15);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        if (module0821.NIL != var25) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        final SubLObject var26 = module0015.$g533$.currentBinding(var24);
        try {
            module0015.$g533$.bind((SubLObject)module0821.T, var24);
            module0642.f39019(var23);
        }
        finally {
            module0015.$g533$.rebind(var26, var24);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var15;
    }
    
    public static SubLObject f52815(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0821.NIL == module0820.f52653()) {
            return module0656.f39789((SubLObject)module0821.$ic26$, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
        }
        final SubLObject var17 = PrintLow.format((SubLObject)module0821.NIL, (SubLObject)module0821.$ic70$, var15);
        module0642.f39020((SubLObject)module0821.$ic27$);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var16), module0655.$g5142$.getDynamicValue(var16));
        final SubLObject var18 = module0014.f672((SubLObject)module0821.$ic28$);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39020((SubLObject)module0821.$ic29$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        if (module0821.NIL != var18) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
            module0642.f39020(var18);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39020((SubLObject)module0821.$ic30$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var17);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        final SubLObject var19 = module0015.$g535$.currentBinding(var16);
        try {
            module0015.$g535$.bind((SubLObject)module0821.T, var16);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
            final SubLObject var20_62 = module0015.$g533$.currentBinding(var16);
            try {
                module0015.$g533$.bind((SubLObject)module0821.T, var16);
                module0642.f39021((SubLObject)module0821.$ic71$);
                f52799(var15);
                module0642.f39032((SubLObject)module0821.FOUR_INTEGER);
                module0656.f39837((SubLObject)module0821.$ic24$, (SubLObject)module0821.$ic57$, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                module0642.f39026((SubLObject)module0821.TWO_INTEGER);
                module0642.f39021((SubLObject)module0821.$ic72$);
                f52824(var15);
                final SubLObject var20 = module0820.f52709(var15);
                module0642.f39026((SubLObject)module0821.UNPROVIDED);
                f52825(var15, var20);
                final SubLObject var21 = module0820.f52708(var15);
                module0642.f39026((SubLObject)module0821.UNPROVIDED);
                f52826(var15, var21);
                final SubLObject var22 = module0820.f52681(var15);
                final SubLObject var23 = module0820.f52680(var15);
                if (module0821.NIL != var22 || module0821.NIL != var23) {
                    module0642.f39051((SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39021((SubLObject)module0821.$ic73$);
                    module0642.f39026((SubLObject)module0821.UNPROVIDED);
                    if (module0821.NIL != var22) {
                        module0642.f39026((SubLObject)module0821.UNPROVIDED);
                        f52827(var22, (SubLObject)module0821.$ic74$, (SubLObject)module0821.$ic75$, (SubLObject)module0821.$ic76$);
                    }
                    if (module0821.NIL != var23) {
                        module0642.f39026((SubLObject)module0821.UNPROVIDED);
                        f52828(var23, (SubLObject)module0821.$ic77$, (SubLObject)module0821.$ic75$, (SubLObject)module0821.$ic78$);
                    }
                }
                SubLObject var24 = module0820.f52692(var15);
                SubLObject var25 = module0820.f52691(var15);
                if (module0821.NIL != var24 || module0821.NIL != var25) {
                    module0642.f39051((SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39021((SubLObject)module0821.$ic79$);
                    if (module0821.NIL != var24) {
                        var24 = module0809.f51692(var24);
                        module0642.f39026((SubLObject)module0821.TWO_INTEGER);
                        module0642.f39019((SubLObject)module0821.$ic80$);
                        f52829(var15, var24);
                    }
                    if (module0821.NIL != var25) {
                        var25 = module0809.f51691(var25);
                        module0642.f39026((SubLObject)module0821.TWO_INTEGER);
                        module0642.f39019((SubLObject)module0821.$ic81$);
                        f52830(var15, var25);
                    }
                }
                module0642.f39029((SubLObject)module0821.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var20_62, var16);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0821.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var19, var16);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52829(final SubLObject var15, final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        final SubLObject var68 = module0015.$g533$.currentBinding(var67);
        try {
            module0015.$g533$.bind((SubLObject)module0821.T, var67);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
            final SubLObject var20_67 = module0015.$g533$.currentBinding(var67);
            try {
                module0015.$g533$.bind((SubLObject)module0821.T, var67);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_68 = module0015.$g533$.currentBinding(var67);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var67);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)module0821.$ic82$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_68, var67);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_69 = module0015.$g533$.currentBinding(var67);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var67);
                    module0642.f39032((SubLObject)module0821.TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var20_69, var67);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_70 = module0015.$g533$.currentBinding(var67);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var67);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)module0821.$ic83$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_70, var67);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var20_67, var67);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0821.UNPROVIDED);
            SubLObject var69 = var66;
            SubLObject var70 = (SubLObject)module0821.NIL;
            var70 = var69.first();
            while (module0821.NIL != var69) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_71 = module0015.$g533$.currentBinding(var67);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var67);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_72 = module0015.$g533$.currentBinding(var67);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var67);
                        f52797(var70);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_72, var67);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_73 = module0015.$g533$.currentBinding(var67);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var67);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_73, var67);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_74 = module0015.$g533$.currentBinding(var67);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var67);
                        final SubLObject var71 = module0820.f52695(var15, var70);
                        SubLObject var47_77 = Sequences.reverse(var71);
                        SubLObject var72 = (SubLObject)module0821.NIL;
                        var72 = var47_77.first();
                        while (module0821.NIL != var47_77) {
                            module0642.f39019(var72);
                            module0642.f39032((SubLObject)module0821.UNPROVIDED);
                            var47_77 = var47_77.rest();
                            var72 = var47_77.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var20_74, var67);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_71, var67);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0821.UNPROVIDED);
                var69 = var69.rest();
                var70 = var69.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var68, var67);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52830(final SubLObject var15, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        final SubLObject var67 = module0015.$g533$.currentBinding(var66);
        try {
            module0015.$g533$.bind((SubLObject)module0821.T, var66);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
            final SubLObject var20_79 = module0015.$g533$.currentBinding(var66);
            try {
                module0015.$g533$.bind((SubLObject)module0821.T, var66);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_80 = module0015.$g533$.currentBinding(var66);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var66);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)module0821.$ic84$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_80, var66);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_81 = module0015.$g533$.currentBinding(var66);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var66);
                    module0642.f39032((SubLObject)module0821.TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var20_81, var66);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_82 = module0015.$g533$.currentBinding(var66);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var66);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)module0821.$ic83$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_82, var66);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var20_79, var66);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0821.UNPROVIDED);
            SubLObject var68 = var65;
            SubLObject var69 = (SubLObject)module0821.NIL;
            var69 = var68.first();
            while (module0821.NIL != var68) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_83 = module0015.$g533$.currentBinding(var66);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var66);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_84 = module0015.$g533$.currentBinding(var66);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var66);
                        f52798(var69);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_84, var66);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_85 = module0015.$g533$.currentBinding(var66);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var66);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_85, var66);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_86 = module0015.$g533$.currentBinding(var66);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var66);
                        final SubLObject var70 = module0820.f52694(var15, var69);
                        SubLObject var47_88 = Sequences.reverse(var70);
                        SubLObject var71 = (SubLObject)module0821.NIL;
                        var71 = var47_88.first();
                        while (module0821.NIL != var47_88) {
                            module0642.f39019(var71);
                            module0642.f39032((SubLObject)module0821.UNPROVIDED);
                            var47_88 = var47_88.rest();
                            var71 = var47_88.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var20_86, var66);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_83, var66);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0821.UNPROVIDED);
                var68 = var68.rest();
                var69 = var68.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var67, var66);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52826(final SubLObject var15, SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        var64 = module0820.f52661(var64);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        final SubLObject var66 = module0015.$g533$.currentBinding(var65);
        try {
            module0015.$g533$.bind((SubLObject)module0821.T, var65);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
            final SubLObject var20_89 = module0015.$g533$.currentBinding(var65);
            try {
                module0015.$g533$.bind((SubLObject)module0821.T, var65);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_90 = module0015.$g533$.currentBinding(var65);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var65);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39021((SubLObject)module0821.$ic85$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_90, var65);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_91 = module0015.$g533$.currentBinding(var65);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var65);
                    module0642.f39032((SubLObject)module0821.TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var20_91, var65);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_92 = module0015.$g533$.currentBinding(var65);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var65);
                    SubLObject var67 = var64;
                    SubLObject var68 = (SubLObject)module0821.NIL;
                    var68 = var67.first();
                    while (module0821.NIL != var67) {
                        if (!var68.eql(var64.first())) {
                            module0642.f39019((SubLObject)module0821.$ic86$);
                        }
                        f52831(var15, var68);
                        var67 = var67.rest();
                        var68 = var67.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var20_92, var65);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var20_89, var65);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0821.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var66, var65);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52831(final SubLObject var94, final SubLObject var95) {
        if (var95.equal(var94)) {
            module0642.f39020(module0015.$g207$.getGlobalValue());
            module0642.f39020(module0015.$g234$.getGlobalValue());
            f52799(var95);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39020(module0015.$g208$.getGlobalValue());
        }
        else {
            f52799(var95);
        }
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52825(final SubLObject var15, SubLObject var63) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        var63 = module0820.f52661(var63);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        final SubLObject var65 = module0015.$g533$.currentBinding(var64);
        try {
            module0015.$g533$.bind((SubLObject)module0821.T, var64);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
            final SubLObject var20_96 = module0015.$g533$.currentBinding(var64);
            try {
                module0015.$g533$.bind((SubLObject)module0821.T, var64);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_97 = module0015.$g533$.currentBinding(var64);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var64);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39021((SubLObject)module0821.$ic87$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_97, var64);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_98 = module0015.$g533$.currentBinding(var64);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var64);
                    module0642.f39032((SubLObject)module0821.TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var20_98, var64);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_99 = module0015.$g533$.currentBinding(var64);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var64);
                    SubLObject var66 = var63;
                    SubLObject var67 = (SubLObject)module0821.NIL;
                    var67 = var66.first();
                    while (module0821.NIL != var66) {
                        if (!var67.eql(var63.first())) {
                            module0642.f39019((SubLObject)module0821.$ic86$);
                        }
                        f52832(var15, var67);
                        var66 = var66.rest();
                        var67 = var66.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var20_99, var64);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var20_96, var64);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0821.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var65, var64);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52832(final SubLObject var95, final SubLObject var94) {
        if (var95.equal(var94)) {
            module0642.f39020(module0015.$g207$.getGlobalValue());
            module0642.f39020(module0015.$g234$.getGlobalValue());
            f52799(var94);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39020(module0015.$g208$.getGlobalValue());
        }
        else {
            f52799(var94);
        }
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52833(final SubLObject var22) {
        SubLObject var23 = (SubLObject)module0821.NIL;
        SubLObject var24 = (SubLObject)module0821.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var22, (SubLObject)module0821.$ic88$);
        var23 = var22.first();
        SubLObject var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var22, (SubLObject)module0821.$ic88$);
        var24 = var25.first();
        var25 = var25.rest();
        if (module0821.NIL == var25) {
            final SubLObject var26 = Packages.find_package(var23);
            final SubLObject var27 = Packages.find_symbol(var24, var26);
            return f52814(var27);
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0821.$ic88$);
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52834(final SubLObject var14, SubLObject var23) {
        if (var23 == module0821.UNPROVIDED) {
            var23 = (SubLObject)module0821.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert module0821.NIL != Types.symbolp(var14) : var14;
        if (module0821.NIL == var23) {
            var23 = f52835(var14);
        }
        final SubLObject var25 = module0656.f39832((SubLObject)module0821.$ic22$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0821.$ic91$);
        module0642.f39044(f52836(Symbols.symbol_package(var14)));
        module0642.f39019((SubLObject)module0821.$ic92$);
        module0642.f39044(Symbols.symbol_name(var14));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        if (module0821.NIL != var25) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        final SubLObject var26 = module0015.$g533$.currentBinding(var24);
        try {
            module0015.$g533$.bind((SubLObject)module0821.T, var24);
            module0642.f39019(var23);
        }
        finally {
            module0015.$g533$.rebind(var26, var24);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var14;
    }
    
    public static SubLObject f52814(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0821.NIL == module0820.f52653()) {
            return module0656.f39789((SubLObject)module0821.$ic26$, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
        }
        final SubLObject var16 = PrintLow.format((SubLObject)module0821.NIL, (SubLObject)module0821.$ic94$, var14);
        module0642.f39020((SubLObject)module0821.$ic27$);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var15), module0655.$g5142$.getDynamicValue(var15));
        final SubLObject var17 = module0014.f672((SubLObject)module0821.$ic28$);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39020((SubLObject)module0821.$ic29$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        if (module0821.NIL != var17) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
            module0642.f39020(var17);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39020((SubLObject)module0821.$ic30$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var16);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        final SubLObject var18 = module0015.$g535$.currentBinding(var15);
        try {
            module0015.$g535$.bind((SubLObject)module0821.T, var15);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
            final SubLObject var20_105 = module0015.$g533$.currentBinding(var15);
            try {
                module0015.$g533$.bind((SubLObject)module0821.T, var15);
                module0642.f39021((SubLObject)module0821.$ic95$);
                f52798(var14);
                module0642.f39032((SubLObject)module0821.FOUR_INTEGER);
                module0642.f39019((SubLObject)module0821.$ic96$);
                f52801(var14);
                module0642.f39032((SubLObject)module0821.FOUR_INTEGER);
                module0656.f39837((SubLObject)module0821.$ic24$, (SubLObject)module0821.$ic57$, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var19 = module0820.f52676(var14);
                final SubLObject var20 = module0820.f52677(var14);
                module0642.f39026((SubLObject)module0821.TWO_INTEGER);
                module0642.f39021((SubLObject)module0821.$ic97$);
                module0642.f39026((SubLObject)module0821.UNPROVIDED);
                if (module0821.NIL != var19) {
                    f52837(var19, var20);
                }
                else if (module0821.NIL != Symbols.boundp(var14)) {
                    module0642.f39019((SubLObject)module0821.$ic98$);
                }
                else {
                    module0642.f39019((SubLObject)module0821.$ic99$);
                }
                SubLObject var21 = module0820.f52703(var14);
                SubLObject var22 = module0820.f52702(var14);
                SubLObject var23 = module0820.f52704(var14);
                if (module0821.NIL != var21 || module0821.NIL != var22 || module0821.NIL != var23) {
                    final SubLObject var24 = module0820.f52705(var14);
                    module0642.f39051((SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                    f52826(var19, var24);
                    if (module0821.NIL != var21) {
                        var21 = module0809.f51696(var21);
                        module0642.f39026((SubLObject)module0821.UNPROVIDED);
                        f52828(var21, (SubLObject)module0821.$ic100$, (SubLObject)module0821.$ic59$, (SubLObject)module0821.$ic101$);
                    }
                    if (module0821.NIL != var22) {
                        var22 = module0809.f51695(var22);
                        module0642.f39026((SubLObject)module0821.UNPROVIDED);
                        f52827(var22, (SubLObject)module0821.$ic102$, (SubLObject)module0821.$ic59$, (SubLObject)module0821.$ic103$);
                    }
                    if (module0821.NIL != var23) {
                        var23 = module0809.f51698(var22);
                        module0642.f39026((SubLObject)module0821.UNPROVIDED);
                        f52838(var23, (SubLObject)module0821.$ic104$);
                    }
                }
                var21 = module0820.f52688(var14);
                var22 = module0820.f52687(var14);
                if (module0821.NIL != var21 || module0821.NIL != var22) {
                    final SubLObject var25 = module0820.f52690(var14);
                    module0642.f39051((SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                    f52825(var19, var25);
                    if (module0821.NIL != var21) {
                        var21 = module0809.f51692(var21);
                        module0642.f39026((SubLObject)module0821.UNPROVIDED);
                        f52828(var21, (SubLObject)module0821.$ic105$, (SubLObject)module0821.$ic59$, (SubLObject)module0821.$ic101$);
                    }
                    if (module0821.NIL != var22) {
                        var22 = module0809.f51691(var22);
                        module0642.f39026((SubLObject)module0821.UNPROVIDED);
                        f52827(var22, (SubLObject)module0821.$ic106$, (SubLObject)module0821.$ic59$, (SubLObject)module0821.$ic103$);
                    }
                }
                module0642.f39029((SubLObject)module0821.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var20_105, var15);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0821.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var18, var15);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52839(final SubLObject var22) {
        SubLObject var23 = (SubLObject)module0821.NIL;
        SubLObject var24 = (SubLObject)module0821.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var22, (SubLObject)module0821.$ic88$);
        var23 = var22.first();
        SubLObject var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var22, (SubLObject)module0821.$ic88$);
        var24 = var25.first();
        var25 = var25.rest();
        if (module0821.NIL == var25) {
            final SubLObject var26 = Packages.find_package(var23);
            final SubLObject var27 = Packages.find_symbol(var24, var26);
            return f52813(var27);
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0821.$ic88$);
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52840(final SubLObject var14, SubLObject var23) {
        if (var23 == module0821.UNPROVIDED) {
            var23 = (SubLObject)module0821.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert module0821.NIL != Types.symbolp(var14) : var14;
        if (module0821.NIL == var23) {
            var23 = f52835(var14);
        }
        final SubLObject var25 = module0656.f39832((SubLObject)module0821.$ic22$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0821.$ic108$);
        module0642.f39044(f52836(Symbols.symbol_package(var14)));
        module0642.f39019((SubLObject)module0821.$ic92$);
        module0642.f39044(Symbols.symbol_name(var14));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        if (module0821.NIL != var25) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        final SubLObject var26 = module0015.$g533$.currentBinding(var24);
        try {
            module0015.$g533$.bind((SubLObject)module0821.T, var24);
            module0642.f39019(var23);
        }
        finally {
            module0015.$g533$.rebind(var26, var24);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var14;
    }
    
    public static SubLObject f52813(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0821.NIL == module0820.f52653()) {
            return module0656.f39789((SubLObject)module0821.$ic26$, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
        }
        final SubLObject var16 = PrintLow.format((SubLObject)module0821.NIL, (SubLObject)module0821.$ic110$, var14);
        module0642.f39020((SubLObject)module0821.$ic27$);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var15), module0655.$g5142$.getDynamicValue(var15));
        final SubLObject var17 = module0014.f672((SubLObject)module0821.$ic28$);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39020((SubLObject)module0821.$ic29$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        if (module0821.NIL != var17) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
            module0642.f39020(var17);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39020((SubLObject)module0821.$ic30$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var16);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        final SubLObject var18 = module0015.$g535$.currentBinding(var15);
        try {
            module0015.$g535$.bind((SubLObject)module0821.T, var15);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
            final SubLObject var20_109 = module0015.$g533$.currentBinding(var15);
            try {
                module0015.$g533$.bind((SubLObject)module0821.T, var15);
                module0642.f39021((SubLObject)module0821.$ic111$);
                f52797(var14);
                module0642.f39032((SubLObject)module0821.FOUR_INTEGER);
                module0642.f39019((SubLObject)module0821.$ic96$);
                f52800(var14);
                module0642.f39032((SubLObject)module0821.FOUR_INTEGER);
                module0656.f39837((SubLObject)module0821.$ic24$, (SubLObject)module0821.$ic57$, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                module0642.f39026((SubLObject)module0821.UNPROVIDED);
                module0642.f39027((SubLObject)module0821.$ic13$, (SubLObject)module0821.UNPROVIDED);
                module0642.f39019((SubLObject)module0821.$ic112$);
                module0642.f39020(module0015.$g213$.getGlobalValue());
                module0656.f39804(module0820.f52674(var14), (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0015.$g214$.getGlobalValue());
                final SubLObject var19 = module0820.f52670(var14);
                final SubLObject var20 = module0820.f52671(var14);
                module0642.f39026((SubLObject)module0821.TWO_INTEGER);
                module0642.f39021((SubLObject)module0821.$ic97$);
                module0642.f39026((SubLObject)module0821.UNPROVIDED);
                if (module0821.NIL != var19) {
                    f52837(var19, var20);
                }
                else if (module0821.NIL != Symbols.fboundp(var14)) {
                    module0642.f39019((SubLObject)module0821.$ic113$);
                }
                else {
                    module0642.f39019((SubLObject)module0821.$ic114$);
                }
                SubLObject var21 = module0820.f52698(var14);
                SubLObject var22 = module0820.f52697(var14);
                SubLObject var23 = module0820.f52699(var14);
                if (module0821.NIL != var21 || module0821.NIL != var22 || module0821.NIL != var23) {
                    final SubLObject var24 = module0820.f52700(var14);
                    module0642.f39051((SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                    f52826(var19, var24);
                    if (module0821.NIL != var21) {
                        var21 = module0809.f51696(var21);
                        module0642.f39026((SubLObject)module0821.UNPROVIDED);
                        f52828(var21, (SubLObject)module0821.$ic115$, (SubLObject)module0821.$ic59$, (SubLObject)module0821.$ic101$);
                    }
                    if (module0821.NIL != var22) {
                        var22 = module0809.f51695(var22);
                        module0642.f39026((SubLObject)module0821.UNPROVIDED);
                        f52827(var22, (SubLObject)module0821.$ic116$, (SubLObject)module0821.$ic59$, (SubLObject)module0821.$ic103$);
                    }
                    if (module0821.NIL != var23) {
                        var23 = module0809.f51698(var23);
                        module0642.f39026((SubLObject)module0821.UNPROVIDED);
                        f52838(var23, (SubLObject)module0821.$ic117$);
                    }
                }
                var21 = module0820.f52684(var14);
                var22 = module0820.f52682(var14);
                if (module0821.NIL != var21 || module0821.NIL != var22) {
                    final SubLObject var25 = module0820.f52686(var14);
                    module0642.f39051((SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
                    f52825(var19, var25);
                    if (module0821.NIL != var21) {
                        var21 = module0809.f51692(var21);
                        module0642.f39026((SubLObject)module0821.UNPROVIDED);
                        f52828(var21, (SubLObject)module0821.$ic118$, (SubLObject)module0821.$ic59$, (SubLObject)module0821.$ic101$);
                    }
                    if (module0821.NIL != var22) {
                        var22 = module0809.f51691(var22);
                        module0642.f39026((SubLObject)module0821.UNPROVIDED);
                        f52827(var22, (SubLObject)module0821.$ic119$, (SubLObject)module0821.$ic59$, (SubLObject)module0821.$ic103$);
                    }
                }
                module0642.f39029((SubLObject)module0821.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var20_109, var15);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0821.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var18, var15);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0821.UNPROVIDED);
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52841() {
        final SubLObject var110 = module0821.$g6528$.getGlobalValue();
        if (module0821.NIL != var110) {
            module0034.f1818(var110);
        }
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52842(final SubLObject var104) {
        return module0034.f1829(module0821.$g6528$.getGlobalValue(), (SubLObject)ConsesLow.list(var104), (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
    }
    
    public static SubLObject f52843(final SubLObject var104) {
        assert module0821.NIL != Types.packagep(var104) : var104;
        final SubLObject var105 = Packages.package_nicknames(var104);
        if (module0821.NIL != var105) {
            return var105.first();
        }
        return Packages.package_name(var104);
    }
    
    public static SubLObject f52836(final SubLObject var104) {
        SubLObject var105 = module0821.$g6528$.getGlobalValue();
        if (module0821.NIL == var105) {
            var105 = module0034.f1934((SubLObject)module0821.$ic120$, (SubLObject)module0821.$ic122$, (SubLObject)module0821.NIL, (SubLObject)module0821.EQ, (SubLObject)module0821.ONE_INTEGER, (SubLObject)module0821.TEN_INTEGER);
        }
        SubLObject var106 = module0034.f1814(var105, var104, (SubLObject)module0821.$ic123$);
        if (var106 == module0821.$ic123$) {
            var106 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f52843(var104)));
            module0034.f1816(var105, var104, var106, (SubLObject)module0821.UNPROVIDED);
        }
        return module0034.f1959(var106);
    }
    
    public static SubLObject f52844() {
        final SubLObject var110 = module0821.$g6529$.getGlobalValue();
        if (module0821.NIL != var110) {
            module0034.f1818(var110);
        }
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52845(final SubLObject var14) {
        return module0034.f1829(module0821.$g6529$.getGlobalValue(), (SubLObject)ConsesLow.list(var14), (SubLObject)module0821.UNPROVIDED, (SubLObject)module0821.UNPROVIDED);
    }
    
    public static SubLObject f52846(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        assert module0821.NIL != Types.symbolp(var14) : var14;
        if (var14.eql(Packages.find_symbol(Symbols.symbol_name(var14), Packages.$package$.getDynamicValue(var15)))) {
            return print_high.prin1_to_string(var14);
        }
        final SubLObject var16 = Symbols.symbol_package(var14);
        if (module0821.NIL == var16) {
            return PrintLow.format((SubLObject)module0821.NIL, (SubLObject)module0821.$ic125$, Symbols.symbol_name(var14));
        }
        return PrintLow.format((SubLObject)module0821.NIL, (SubLObject)module0821.$ic126$, f52836(var16), Symbols.symbol_name(var14));
    }
    
    public static SubLObject f52835(final SubLObject var14) {
        SubLObject var15 = module0821.$g6529$.getGlobalValue();
        if (module0821.NIL == var15) {
            var15 = module0034.f1934((SubLObject)module0821.$ic124$, (SubLObject)module0821.$ic127$, (SubLObject)module0821.NIL, (SubLObject)module0821.EQ, (SubLObject)module0821.ONE_INTEGER, (SubLObject)module0821.TEN_INTEGER);
        }
        SubLObject var16 = module0034.f1814(var15, var14, (SubLObject)module0821.$ic123$);
        if (var16 == module0821.$ic123$) {
            var16 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f52846(var14)));
            module0034.f1816(var15, var14, var16, (SubLObject)module0821.UNPROVIDED);
        }
        return module0034.f1959(var16);
    }
    
    public static SubLObject f52837(final SubLObject var15, SubLObject var78) {
        if (var78 == module0821.UNPROVIDED) {
            var78 = (SubLObject)module0821.NIL;
        }
        final SubLThread var79 = SubLProcess.currentSubLThread();
        if (module0821.NIL != var15) {
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
            final SubLObject var80 = module0015.$g533$.currentBinding(var79);
            try {
                module0015.$g533$.bind((SubLObject)module0821.T, var79);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_114 = module0015.$g533$.currentBinding(var79);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var79);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_115 = module0015.$g533$.currentBinding(var79);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var79);
                        module0642.f39019((SubLObject)module0821.$ic71$);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_115, var79);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_116 = module0015.$g533$.currentBinding(var79);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var79);
                        f52799(var15);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_116, var79);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_114, var79);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0821.UNPROVIDED);
                if (module0821.NIL != var78) {
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_117 = module0015.$g533$.currentBinding(var79);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var79);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_118 = module0015.$g533$.currentBinding(var79);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var79);
                            module0642.f39019((SubLObject)module0821.$ic128$);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_118, var79);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_119 = module0015.$g533$.currentBinding(var79);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var79);
                            module0642.f39019(var78);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_119, var79);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var20_117, var79);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0821.UNPROVIDED);
                }
                final SubLObject var81 = module0820.f52666(var15);
                if (module0821.NIL != var81) {
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_120 = module0015.$g533$.currentBinding(var79);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var79);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_121 = module0015.$g533$.currentBinding(var79);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var79);
                            module0642.f39019((SubLObject)module0821.$ic129$);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_121, var79);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_122 = module0015.$g533$.currentBinding(var79);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var79);
                            f52806(var81);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_122, var79);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var20_120, var79);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_123 = module0015.$g533$.currentBinding(var79);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var79);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_124 = module0015.$g533$.currentBinding(var79);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var79);
                            module0642.f39019((SubLObject)module0821.$ic58$);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_124, var79);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_125 = module0015.$g533$.currentBinding(var79);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var79);
                            f52820(var15);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_125, var79);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var20_123, var79);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0821.UNPROVIDED);
                }
            }
            finally {
                module0015.$g533$.rebind(var80, var79);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52824(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0821.NIL != var15) {
            final SubLObject var17 = module0820.f52666(var15);
            if (module0821.NIL != var17) {
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var18 = module0015.$g533$.currentBinding(var16);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var16);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_126 = module0015.$g533$.currentBinding(var16);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var16);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_127 = module0015.$g533$.currentBinding(var16);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var16);
                            module0642.f39019((SubLObject)module0821.$ic129$);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_127, var16);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_128 = module0015.$g533$.currentBinding(var16);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var16);
                            f52806(var17);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_128, var16);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var20_126, var16);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_129 = module0015.$g533$.currentBinding(var16);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var16);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_130 = module0015.$g533$.currentBinding(var16);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var16);
                            module0642.f39019((SubLObject)module0821.$ic58$);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_130, var16);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_131 = module0015.$g533$.currentBinding(var16);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var16);
                            f52820(var15);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_131, var16);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var20_129, var16);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0821.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var18, var16);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
        }
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52828(final SubLObject var66, final SubLObject var132, final SubLObject var133, final SubLObject var134) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        final SubLObject var136 = module0015.$g533$.currentBinding(var135);
        try {
            module0015.$g533$.bind((SubLObject)module0821.T, var135);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
            final SubLObject var20_135 = module0015.$g533$.currentBinding(var135);
            try {
                module0015.$g533$.bind((SubLObject)module0821.T, var135);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_136 = module0015.$g533$.currentBinding(var135);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var135);
                    module0642.f39019(var132);
                }
                finally {
                    module0015.$g533$.rebind(var20_136, var135);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_137 = module0015.$g533$.currentBinding(var135);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var135);
                    module0642.f39027((SubLObject)module0821.$ic13$, (SubLObject)module0821.TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var20_137, var135);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_138 = module0015.$g533$.currentBinding(var135);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var135);
                    module0642.f39019(var133);
                }
                finally {
                    module0015.$g533$.rebind(var20_138, var135);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var20_135, var135);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0821.UNPROVIDED);
            SubLObject var137 = var66;
            SubLObject var138 = (SubLObject)module0821.NIL;
            var138 = var137.first();
            while (module0821.NIL != var137) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_139 = module0015.$g533$.currentBinding(var135);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var135);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_140 = module0015.$g533$.currentBinding(var135);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var135);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020((SubLObject)module0821.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020((SubLObject)module0821.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_141 = module0015.$g533$.currentBinding(var135);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var135);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                            final SubLObject var20_142 = module0015.$g533$.currentBinding(var135);
                            try {
                                module0015.$g533$.bind((SubLObject)module0821.T, var135);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                                final SubLObject var20_143 = module0015.$g533$.currentBinding(var135);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0821.T, var135);
                                    f52802(var138);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_143, var135);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                                final SubLObject var20_144 = module0015.$g533$.currentBinding(var135);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0821.T, var135);
                                    module0642.f39027((SubLObject)module0821.$ic13$, (SubLObject)module0821.TWO_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_144, var135);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                                final SubLObject var20_145 = module0015.$g533$.currentBinding(var135);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0821.T, var135);
                                    f52797(var138);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_145, var135);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_142, var135);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0821.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_141, var135);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var20_140, var135);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_146 = module0015.$g533$.currentBinding(var135);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var135);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_146, var135);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_147 = module0015.$g533$.currentBinding(var135);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var135);
                        Functions.funcall(var134, var138);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_147, var135);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_139, var135);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0821.UNPROVIDED);
                var137 = var137.rest();
                var138 = var137.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var136, var135);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52827(final SubLObject var65, final SubLObject var148, final SubLObject var133, final SubLObject var134) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
        final SubLObject var150 = module0015.$g533$.currentBinding(var149);
        try {
            module0015.$g533$.bind((SubLObject)module0821.T, var149);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
            final SubLObject var20_149 = module0015.$g533$.currentBinding(var149);
            try {
                module0015.$g533$.bind((SubLObject)module0821.T, var149);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_150 = module0015.$g533$.currentBinding(var149);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var149);
                    module0642.f39019(var148);
                }
                finally {
                    module0015.$g533$.rebind(var20_150, var149);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_151 = module0015.$g533$.currentBinding(var149);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var149);
                    module0642.f39027((SubLObject)module0821.$ic13$, (SubLObject)module0821.TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var20_151, var149);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_152 = module0015.$g533$.currentBinding(var149);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var149);
                    module0642.f39019(var133);
                }
                finally {
                    module0015.$g533$.rebind(var20_152, var149);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var20_149, var149);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0821.UNPROVIDED);
            SubLObject var151 = var65;
            SubLObject var152 = (SubLObject)module0821.NIL;
            var152 = var151.first();
            while (module0821.NIL != var151) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                final SubLObject var20_153 = module0015.$g533$.currentBinding(var149);
                try {
                    module0015.$g533$.bind((SubLObject)module0821.T, var149);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_154 = module0015.$g533$.currentBinding(var149);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var149);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020((SubLObject)module0821.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39020((SubLObject)module0821.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                        final SubLObject var20_155 = module0015.$g533$.currentBinding(var149);
                        try {
                            module0015.$g533$.bind((SubLObject)module0821.T, var149);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                            final SubLObject var20_156 = module0015.$g533$.currentBinding(var149);
                            try {
                                module0015.$g533$.bind((SubLObject)module0821.T, var149);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                                final SubLObject var20_157 = module0015.$g533$.currentBinding(var149);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0821.T, var149);
                                    f52804(var152);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_157, var149);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                                final SubLObject var20_158 = module0015.$g533$.currentBinding(var149);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0821.T, var149);
                                    module0642.f39027((SubLObject)module0821.$ic13$, (SubLObject)module0821.TWO_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_158, var149);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                                final SubLObject var20_159 = module0015.$g533$.currentBinding(var149);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0821.T, var149);
                                    f52798(var152);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_159, var149);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_156, var149);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0821.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_155, var149);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var20_154, var149);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_160 = module0015.$g533$.currentBinding(var149);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var149);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_160, var149);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic36$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0821.$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0821.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0821.UNPROVIDED);
                    final SubLObject var20_161 = module0015.$g533$.currentBinding(var149);
                    try {
                        module0015.$g533$.bind((SubLObject)module0821.T, var149);
                        Functions.funcall(var134, var152);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_161, var149);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_153, var149);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0821.UNPROVIDED);
                var151 = var151.rest();
                var152 = var151.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var150, var149);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52838(final SubLObject var106, final SubLObject var12) {
        module0642.f39019(var12);
        SubLObject var107 = var106;
        SubLObject var108 = (SubLObject)module0821.NIL;
        var108 = var107.first();
        while (module0821.NIL != var107) {
            module0642.f39026((SubLObject)module0821.UNPROVIDED);
            f52799(var108);
            var107 = var107.rest();
            var108 = var107.first();
        }
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52847(final SubLObject var71) {
        final SubLObject var72 = module0820.f52670(var71);
        if (module0821.NIL != var72) {
            f52799(var72);
        }
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52848(final SubLObject var83) {
        final SubLObject var84 = module0820.f52676(var83);
        if (module0821.NIL != var84) {
            f52799(var84);
        }
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52849(final SubLObject var71) {
        SubLObject var72 = (SubLObject)module0821.NIL;
        if (module0821.NIL != module0820.f52669(var71)) {
            var72 = (SubLObject)ConsesLow.cons((SubLObject)module0821.$ic130$, var72);
        }
        if (module0821.NIL != module0820.f52696(var71)) {
            var72 = (SubLObject)ConsesLow.cons((SubLObject)module0821.$ic131$, var72);
        }
        else if (module0821.NIL != module0820.f52706(var71)) {
            var72 = (SubLObject)ConsesLow.cons((SubLObject)module0821.$ic132$, var72);
        }
        var72 = Sequences.nreverse(var72);
        return f52850(var72);
    }
    
    public static SubLObject f52851(final SubLObject var83) {
        SubLObject var84 = (SubLObject)module0821.NIL;
        final SubLObject var85 = module0820.f52675(var83);
        if (var85.eql((SubLObject)module0821.$ic133$)) {
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0821.$ic134$, var84);
        }
        else if (var85.eql((SubLObject)module0821.$ic135$)) {
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0821.$ic136$, var84);
        }
        else if (var85.eql((SubLObject)module0821.$ic137$)) {
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0821.$ic138$, var84);
        }
        if (module0821.NIL != module0820.f52701(var83)) {
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0821.$ic131$, var84);
        }
        else if (module0821.NIL != module0820.f52707(var83)) {
            var84 = (SubLObject)ConsesLow.cons((SubLObject)module0821.$ic132$, var84);
        }
        var84 = Sequences.nreverse(var84);
        return f52850(var84);
    }
    
    public static SubLObject f52850(final SubLObject var162) {
        if (module0821.NIL != var162) {
            SubLObject var163 = var162;
            SubLObject var164 = (SubLObject)module0821.NIL;
            var164 = var163.first();
            while (module0821.NIL != var163) {
                if (!var164.eql(var162.first())) {
                    module0642.f39019((SubLObject)module0821.$ic86$);
                }
                module0642.f39019(var164);
                var163 = var163.rest();
                var164 = var163.first();
            }
        }
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52852() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0821", "f52796", "S#58159");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52797", "S#58160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52798", "S#58161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52799", "S#58162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52800", "S#58163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52801", "S#58164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52802", "S#58165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52804", "S#58166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52803", "S#58167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52805", "S#58168", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52806", "S#58169", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52807", "CB-TD-TOOL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52809", "S#58170", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52810", "CB-TD-SEARCH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52811", "S#58171", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52808", "S#58172", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52812", "CB-TD-HANDLE-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52816", "CB-TD-SUMMARY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52818", "S#58173", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52817", "S#58174", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52819", "S#58175", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52820", "S#58176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52821", "S#58177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52822", "CB-TD-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52823", "S#58178", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52815", "S#58179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52829", "S#58180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52830", "S#58181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52826", "S#58182", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52831", "S#58183", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52825", "S#58184", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52832", "S#58185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52833", "CB-TD-GLOBAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52834", "S#58186", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52814", "S#58187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52839", "CB-TD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52840", "S#58188", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52813", "S#58189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52841", "S#58190", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52842", "S#58191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52843", "S#58192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52836", "S#58193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52844", "S#58194", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52845", "S#58195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52846", "S#58196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52835", "S#58197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52837", "S#58198", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52824", "S#58199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52828", "S#58200", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52827", "S#58201", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52838", "S#58202", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52847", "S#58203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52848", "S#58204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52849", "S#58205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52851", "S#58206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0821", "f52850", "S#58207", 1, 0, false);
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52853() {
        module0821.$g6527$ = SubLFiles.deflexical("S#58208", (SubLObject)module0821.$ic14$);
        module0821.$g6528$ = SubLFiles.deflexical("S#58209", (SubLObject)module0821.NIL);
        module0821.$g6529$ = SubLFiles.deflexical("S#58210", (SubLObject)module0821.NIL);
        return (SubLObject)module0821.NIL;
    }
    
    public static SubLObject f52854() {
        module0015.f873((SubLObject)module0821.$ic15$);
        module0656.f39840((SubLObject)module0821.$ic18$, (SubLObject)module0821.$ic19$, (SubLObject)module0821.ONE_INTEGER);
        module0015.f873((SubLObject)module0821.$ic20$);
        module0656.f39840((SubLObject)module0821.$ic24$, (SubLObject)module0821.$ic25$, (SubLObject)module0821.ONE_INTEGER);
        module0015.f873((SubLObject)module0821.$ic51$);
        module0015.f873((SubLObject)module0821.$ic52$);
        module0656.f39840((SubLObject)module0821.$ic34$, (SubLObject)module0821.$ic55$, (SubLObject)module0821.ONE_INTEGER);
        module0015.f873((SubLObject)module0821.$ic66$);
        module0656.f39840((SubLObject)module0821.$ic12$, (SubLObject)module0821.$ic69$, (SubLObject)module0821.TWO_INTEGER);
        module0015.f873((SubLObject)module0821.$ic89$);
        module0656.f39840((SubLObject)module0821.$ic11$, (SubLObject)module0821.$ic93$, (SubLObject)module0821.TWO_INTEGER);
        module0015.f873((SubLObject)module0821.$ic107$);
        module0656.f39840((SubLObject)module0821.$ic10$, (SubLObject)module0821.$ic109$, (SubLObject)module0821.TWO_INTEGER);
        module0034.f1909((SubLObject)module0821.$ic120$);
        module0034.f1909((SubLObject)module0821.$ic124$);
        return (SubLObject)module0821.NIL;
    }
    
    public void declareFunctions() {
        f52852();
    }
    
    public void initializeVariables() {
        f52853();
    }
    
    public void runTopLevelForms() {
        f52854();
    }
    
    static {
        me = (SubLFile)new module0821();
        module0821.$g6527$ = null;
        module0821.$g6528$ = null;
        module0821.$g6529$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#1523", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TITLE"));
        $ic2$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = SubLObjectFactory.makeKeyword("TITLE");
        $ic4$ = SubLObjectFactory.makeSymbol("S#930", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#43662", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#942", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#1531", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#925", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SHOW-COPYRIGHT"), (SubLObject)module0821.T);
        $ic10$ = SubLObjectFactory.makeKeyword("TD-METHOD");
        $ic11$ = SubLObjectFactory.makeKeyword("TD-GLOBAL");
        $ic12$ = SubLObjectFactory.makeKeyword("TD-MODULE");
        $ic13$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic14$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIVATE"), (SubLObject)SubLObjectFactory.makeString("FF7F7F")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROTECTED"), (SubLObject)SubLObjectFactory.makeString("FFFF7F")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUBLIC"), (SubLObject)SubLObjectFactory.makeString("7FFF7F")));
        $ic15$ = SubLObjectFactory.makeSymbol("CB-TD-TOOL");
        $ic16$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic17$ = SubLObjectFactory.makeString("cb-td-tool");
        $ic18$ = SubLObjectFactory.makeKeyword("TD-TOOL");
        $ic19$ = SubLObjectFactory.makeSymbol("S#58170", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("CB-TD-SEARCH");
        $ic21$ = SubLObjectFactory.makeString("[Translation Database Browser]");
        $ic22$ = SubLObjectFactory.makeKeyword("SELF");
        $ic23$ = SubLObjectFactory.makeString("cb-td-search");
        $ic24$ = SubLObjectFactory.makeKeyword("TD-SEARCH");
        $ic25$ = SubLObjectFactory.makeSymbol("S#58171", "CYC");
        $ic26$ = SubLObjectFactory.makeString("There is no current SubL translation state.");
        $ic27$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic28$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic29$ = SubLObjectFactory.makeString("stylesheet");
        $ic30$ = SubLObjectFactory.makeString("text/css");
        $ic31$ = SubLObjectFactory.makeString("Translation Database Browser");
        $ic32$ = SubLObjectFactory.makeString("post");
        $ic33$ = SubLObjectFactory.makeString("cb-td-handle-search");
        $ic34$ = SubLObjectFactory.makeKeyword("TD-SUMMARY");
        $ic35$ = SubLObjectFactory.makeString("[Current Translation Summary]");
        $ic36$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic37$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic38$ = SubLObjectFactory.makeString("Find a ");
        $ic39$ = SubLObjectFactory.makeString("kind");
        $ic40$ = SubLObjectFactory.makeString("method");
        $ic41$ = SubLObjectFactory.makeString("function or macro");
        $ic42$ = SubLObjectFactory.makeString("global");
        $ic43$ = SubLObjectFactory.makeString("global variable");
        $ic44$ = SubLObjectFactory.makeString("module");
        $ic45$ = SubLObjectFactory.makeString("source file");
        $ic46$ = SubLObjectFactory.makeString(" called");
        $ic47$ = SubLObjectFactory.makeString("name");
        $ic48$ = SubLObjectFactory.makeInteger(40);
        $ic49$ = SubLObjectFactory.makeString("Find now");
        $ic50$ = SubLObjectFactory.makeString("Clear Input");
        $ic51$ = SubLObjectFactory.makeSymbol("CB-TD-HANDLE-SEARCH");
        $ic52$ = SubLObjectFactory.makeSymbol("CB-TD-SUMMARY");
        $ic53$ = SubLObjectFactory.makeString("[Summary]");
        $ic54$ = SubLObjectFactory.makeString("cb-td-summary");
        $ic55$ = SubLObjectFactory.makeSymbol("S#58173", "CYC");
        $ic56$ = SubLObjectFactory.makeString("Translation Summary");
        $ic57$ = SubLObjectFactory.makeString("[Search Page]");
        $ic58$ = SubLObjectFactory.makeString("Features : ");
        $ic59$ = SubLObjectFactory.makeString("Module");
        $ic60$ = SubLObjectFactory.makeString("Features");
        $ic61$ = SubLObjectFactory.makeKeyword("TOP");
        $ic62$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58211", "CYC"));
        $ic63$ = SubLObjectFactory.makeString("(");
        $ic64$ = SubLObjectFactory.makeString(")");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"));
        $ic66$ = SubLObjectFactory.makeSymbol("CB-TD-MODULE");
        $ic67$ = SubLObjectFactory.makeSymbol("S#58000", "CYC");
        $ic68$ = SubLObjectFactory.makeString("cb-td-module|");
        $ic69$ = SubLObjectFactory.makeSymbol("S#58178", "CYC");
        $ic70$ = SubLObjectFactory.makeString("Module : ~A");
        $ic71$ = SubLObjectFactory.makeString("Module : ");
        $ic72$ = SubLObjectFactory.makeString("Properties");
        $ic73$ = SubLObjectFactory.makeString("Definitions");
        $ic74$ = SubLObjectFactory.makeString("Globals defined in this module");
        $ic75$ = SubLObjectFactory.makeString("Attributes");
        $ic76$ = SubLObjectFactory.makeSymbol("S#58206", "CYC");
        $ic77$ = SubLObjectFactory.makeString("Methods defined in this module");
        $ic78$ = SubLObjectFactory.makeSymbol("S#58205", "CYC");
        $ic79$ = SubLObjectFactory.makeString("Top-Level References");
        $ic80$ = SubLObjectFactory.makeString("Methods called by top-level forms in this module");
        $ic81$ = SubLObjectFactory.makeString("Globals called by top-level forms in this module");
        $ic82$ = SubLObjectFactory.makeString("Methods");
        $ic83$ = SubLObjectFactory.makeString("File positions");
        $ic84$ = SubLObjectFactory.makeString("Globals");
        $ic85$ = SubLObjectFactory.makeString("Callers :");
        $ic86$ = SubLObjectFactory.makeString(", ");
        $ic87$ = SubLObjectFactory.makeString("Calls :");
        $ic88$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58212", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#58213", "CYC"));
        $ic89$ = SubLObjectFactory.makeSymbol("CB-TD-GLOBAL");
        $ic90$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic91$ = SubLObjectFactory.makeString("cb-td-global|");
        $ic92$ = SubLObjectFactory.makeString("|");
        $ic93$ = SubLObjectFactory.makeSymbol("S#58186", "CYC");
        $ic94$ = SubLObjectFactory.makeString("Global : ~S");
        $ic95$ = SubLObjectFactory.makeString("Global Variable : ");
        $ic96$ = SubLObjectFactory.makeString("Access : ");
        $ic97$ = SubLObjectFactory.makeString("Definition");
        $ic98$ = SubLObjectFactory.makeString("Internal variable");
        $ic99$ = SubLObjectFactory.makeString("Undefined variable");
        $ic100$ = SubLObjectFactory.makeString("Methods that reference this global");
        $ic101$ = SubLObjectFactory.makeSymbol("S#58203", "CYC");
        $ic102$ = SubLObjectFactory.makeString("Globals whose initialization references this global");
        $ic103$ = SubLObjectFactory.makeSymbol("S#58204", "CYC");
        $ic104$ = SubLObjectFactory.makeString("Modules that reference this global from top-level forms");
        $ic105$ = SubLObjectFactory.makeString("Methods called in the initialization of this global");
        $ic106$ = SubLObjectFactory.makeString("Globals referenced in the initialization of this global");
        $ic107$ = SubLObjectFactory.makeSymbol("CB-TD-METHOD");
        $ic108$ = SubLObjectFactory.makeString("cb-td-method|");
        $ic109$ = SubLObjectFactory.makeSymbol("S#58188", "CYC");
        $ic110$ = SubLObjectFactory.makeString("Method : ~S");
        $ic111$ = SubLObjectFactory.makeString("Method : ");
        $ic112$ = SubLObjectFactory.makeString("Arglist : ");
        $ic113$ = SubLObjectFactory.makeString("Internal method");
        $ic114$ = SubLObjectFactory.makeString("Undefined method");
        $ic115$ = SubLObjectFactory.makeString("Methods that call this method");
        $ic116$ = SubLObjectFactory.makeString("Globals whose initialization calls this method");
        $ic117$ = SubLObjectFactory.makeString("Modules that call this method from top-level forms");
        $ic118$ = SubLObjectFactory.makeString("Methods called by this method");
        $ic119$ = SubLObjectFactory.makeString("Globals referenced by this method");
        $ic120$ = SubLObjectFactory.makeSymbol("S#58193", "CYC");
        $ic121$ = SubLObjectFactory.makeSymbol("PACKAGEP");
        $ic122$ = SubLObjectFactory.makeSymbol("S#58209", "CYC");
        $ic123$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic124$ = SubLObjectFactory.makeSymbol("S#58197", "CYC");
        $ic125$ = SubLObjectFactory.makeString("#:~A");
        $ic126$ = SubLObjectFactory.makeString("~A::~A");
        $ic127$ = SubLObjectFactory.makeSymbol("S#58210", "CYC");
        $ic128$ = SubLObjectFactory.makeString("Position : ");
        $ic129$ = SubLObjectFactory.makeString("Pathname : ");
        $ic130$ = SubLObjectFactory.makeString("macro");
        $ic131$ = SubLObjectFactory.makeString("no callers");
        $ic132$ = SubLObjectFactory.makeString("no external callers");
        $ic133$ = SubLObjectFactory.makeKeyword("CONSTANT");
        $ic134$ = SubLObjectFactory.makeString("constant");
        $ic135$ = SubLObjectFactory.makeKeyword("LEXICAL");
        $ic136$ = SubLObjectFactory.makeString("lexical");
        $ic137$ = SubLObjectFactory.makeKeyword("SPECIAL");
        $ic138$ = SubLObjectFactory.makeString("special");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0821.class
	Total time: 1056 ms
	
	Decompiled with Procyon 0.5.32.
*/
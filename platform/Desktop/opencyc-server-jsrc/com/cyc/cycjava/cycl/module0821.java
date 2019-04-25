package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9_10 = (SubLObject)NIL;
        while (NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic0$);
            var9_10 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic0$);
            if (NIL == conses_high.member(var9_10, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var8 = (SubLObject)T;
            }
            if (var9_10 == $ic2$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (NIL != var8 && NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? conses_high.cadr(var9) : NIL);
        final SubLObject var11;
        var4 = (var11 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic4$, reader.bq_cons((SubLObject)$ic5$, ConsesLow.append((SubLObject)((NIL != var10) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic7$, var10))) : NIL), (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic8$, (SubLObject)$ic9$, ConsesLow.append(var11, (SubLObject)NIL)));
    }
    
    public static SubLObject f52797(final SubLObject var14) {
        module0642.f39020(module0015.$g240$.getGlobalValue());
        module0656.f39837((SubLObject)$ic10$, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g241$.getGlobalValue());
        return var14;
    }
    
    public static SubLObject f52798(final SubLObject var14) {
        module0642.f39020(module0015.$g240$.getGlobalValue());
        module0656.f39837((SubLObject)$ic11$, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g241$.getGlobalValue());
        return var14;
    }
    
    public static SubLObject f52799(final SubLObject var15) {
        module0642.f39020(module0015.$g240$.getGlobalValue());
        module0656.f39837((SubLObject)$ic12$, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39048(var19);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0015.$g533$.currentBinding(var18);
        try {
            module0015.$g533$.bind((SubLObject)T, var18);
            module0642.f39027((SubLObject)$ic13$, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var20, var18);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        return var17;
    }
    
    public static SubLObject f52805(final SubLObject var17) {
        return conses_high.second(conses_high.assoc(var17, $g6527$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f52806(final SubLObject var21) {
        module0642.f39020(module0015.$g240$.getGlobalValue());
        module0642.f39019(var21);
        module0642.f39020(module0015.$g241$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52807(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        return f52808();
    }
    
    public static SubLObject f52809(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0656.f39832((SubLObject)$ic16$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic17$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var25) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var26 = module0015.$g533$.currentBinding(var24);
        try {
            module0015.$g533$.bind((SubLObject)T, var24);
            module0642.f39019(var23);
        }
        finally {
            module0015.$g533$.rebind(var26, var24);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52810(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        return f52808();
    }
    
    public static SubLObject f52811(SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (NIL == var23) {
            var23 = (SubLObject)$ic21$;
        }
        final SubLObject var25 = module0656.f39832((SubLObject)$ic22$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic23$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var25) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var26 = module0015.$g533$.currentBinding(var24);
        try {
            module0015.$g533$.bind((SubLObject)T, var24);
            module0642.f39019(var23);
        }
        finally {
            module0015.$g533$.rebind(var26, var24);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52808() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (NIL == module0820.f52653()) {
            return module0656.f39789((SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0642.f39020((SubLObject)$ic27$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
        final SubLObject var19 = module0014.f672((SubLObject)$ic28$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic29$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var19) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var19);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic30$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic31$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var20 = module0015.$g535$.currentBinding(var18);
        try {
            module0015.$g535$.bind((SubLObject)T, var18);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_26 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                final SubLObject var21 = module0656.f39832((SubLObject)NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic32$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var21) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var21);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_27 = module0015.$g533$.currentBinding(var18);
                final SubLObject var22 = module0015.$g541$.currentBinding(var18);
                final SubLObject var23 = module0015.$g539$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0015.$g541$.bind((SubLObject)T, var18);
                    module0015.$g539$.bind(module0015.f797(), var18);
                    module0642.f39069((SubLObject)$ic33$, (SubLObject)T, (SubLObject)UNPROVIDED);
                    module0642.f39021((SubLObject)$ic31$);
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    module0656.f39837((SubLObject)$ic34$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_28 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_29 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic37$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_30 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39019((SubLObject)$ic38$);
                            }
                            finally {
                                module0015.$g533$.rebind(var20_30, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic37$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_31 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39020(module0015.$g318$.getGlobalValue());
                                module0642.f39020(module0015.$g320$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic39$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_32 = module0015.$g533$.currentBinding(var18);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var18);
                                    module0642.f39020(module0015.$g324$.getGlobalValue());
                                    module0642.f39046(module0015.$g327$.getGlobalValue());
                                    module0642.f39020(module0015.$g326$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)$ic40$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var20_33 = module0015.$g533$.currentBinding(var18);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var18);
                                        module0642.f39019((SubLObject)$ic41$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var20_33, var18);
                                    }
                                    module0642.f39020(module0015.$g325$.getGlobalValue());
                                    module0642.f39020(module0015.$g324$.getGlobalValue());
                                    module0642.f39020(module0015.$g326$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)$ic42$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var20_34 = module0015.$g533$.currentBinding(var18);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var18);
                                        module0642.f39019((SubLObject)$ic43$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var20_34, var18);
                                    }
                                    module0642.f39020(module0015.$g325$.getGlobalValue());
                                    module0642.f39020(module0015.$g324$.getGlobalValue());
                                    module0642.f39020(module0015.$g326$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)$ic44$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var20_35 = module0015.$g533$.currentBinding(var18);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var18);
                                        module0642.f39019((SubLObject)$ic45$);
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
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic37$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_36 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39019((SubLObject)$ic46$);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_28, var18);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    module0642.f39075((SubLObject)$ic47$, (SubLObject)NIL, (SubLObject)$ic48$);
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    module0642.f39074((SubLObject)$ic49$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0644.f39184((SubLObject)$ic47$, (SubLObject)$ic50$);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0015.f799(module0015.$g539$.getDynamicValue(var18));
                }
                finally {
                    module0015.$g539$.rebind(var23, var18);
                    module0015.$g541$.rebind(var22, var18);
                    module0015.$g533$.rebind(var20_27, var18);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var20_26, var18);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var20, var18);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52812(final SubLObject var22) {
        final SubLObject var23 = module0642.f39104((SubLObject)$ic39$, var22);
        final SubLObject var24 = module0642.f39104((SubLObject)$ic47$, var22);
        if ($ic40$.equal(var23)) {
            return f52813(reader.read_from_string_ignoring_errors(var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if ($ic42$.equal(var23)) {
            return f52814(reader.read_from_string_ignoring_errors(var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if ($ic44$.equal(var23)) {
            return f52815(Strings.string_upcase(var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return f52810((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f52816(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        return f52817();
    }
    
    public static SubLObject f52818(SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (NIL == var23) {
            var23 = (SubLObject)$ic53$;
        }
        final SubLObject var25 = module0656.f39832((SubLObject)$ic22$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic54$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var25) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var26 = module0015.$g533$.currentBinding(var24);
        try {
            module0015.$g533$.bind((SubLObject)T, var24);
            module0642.f39019(var23);
        }
        finally {
            module0015.$g533$.rebind(var26, var24);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52817() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (NIL == module0820.f52653()) {
            return module0656.f39789((SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0642.f39020((SubLObject)$ic27$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
        final SubLObject var19 = module0014.f672((SubLObject)$ic28$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic29$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var19) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var19);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic30$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic56$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var20 = module0015.$g535$.currentBinding(var18);
        try {
            module0015.$g535$.bind((SubLObject)T, var18);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_42 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0656.f39837((SubLObject)$ic34$, (SubLObject)$ic56$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39032((SubLObject)FOUR_INTEGER);
                module0656.f39837((SubLObject)$ic24$, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)TWO_INTEGER);
                module0642.f39019((SubLObject)$ic58$);
                module0642.f39026((SubLObject)UNPROVIDED);
                f52819();
                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g353$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ONE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g354$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ONE_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_43 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_44 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_45 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39019((SubLObject)$ic59$);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_45, var18);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_46 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39019((SubLObject)$ic60$);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                    SubLObject var21 = module0820.f52654();
                    SubLObject var22 = (SubLObject)NIL;
                    var22 = var21.first();
                    while (NIL != var21) {
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_47 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_48 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                f52799(var22);
                            }
                            finally {
                                module0015.$g533$.rebind(var20_48, var18);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_49 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        var21 = var21.rest();
                        var22 = var21.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var20_43, var18);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var20_42, var18);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var20, var18);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52819() {
        final SubLObject var51 = module0820.f52665();
        module0642.f39020(module0015.$g240$.getGlobalValue());
        SubLObject var52 = var51;
        SubLObject var53 = (SubLObject)NIL;
        var53 = var52.first();
        while (NIL != var52) {
            f52821(var53);
            module0642.f39032((SubLObject)UNPROVIDED);
            var52 = var52.rest();
            var53 = var52.first();
        }
        module0642.f39020(module0015.$g241$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52820(final SubLObject var15) {
        final SubLObject var16 = module0820.f52664(var15);
        if (T != var16) {
            module0642.f39020(module0015.$g240$.getGlobalValue());
            f52821(var16);
            module0642.f39020(module0015.$g241$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52821(final SubLObject var54) {
        if (var54.isAtom()) {
            module0642.f39019(Symbols.symbol_name(var54));
        }
        else {
            SubLObject var55 = (SubLObject)NIL;
            SubLObject var56 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var54, var54, (SubLObject)$ic62$);
            var55 = var54.first();
            final SubLObject var57 = var56 = var54.rest();
            module0642.f39019((SubLObject)$ic63$);
            module0642.f39019(Symbols.symbol_name(var55));
            SubLObject var58 = var56;
            SubLObject var59 = (SubLObject)NIL;
            var59 = var58.first();
            while (NIL != var58) {
                module0642.f39032((SubLObject)UNPROVIDED);
                f52821(var59);
                var58 = var58.rest();
                var59 = var58.first();
            }
            module0642.f39019((SubLObject)$ic64$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52822(final SubLObject var22) {
        SubLObject var23 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var22, (SubLObject)$ic65$);
        var23 = var22.first();
        final SubLObject var24 = var22.rest();
        if (NIL == var24) {
            return f52815(var23);
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)$ic65$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52823(final SubLObject var15, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert NIL != module0820.f52652(var15) : var15;
        if (NIL == var23) {
            var23 = var15;
        }
        final SubLObject var25 = module0656.f39832((SubLObject)$ic22$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic68$);
        module0642.f39044(var15);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var25) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var26 = module0015.$g533$.currentBinding(var24);
        try {
            module0015.$g533$.bind((SubLObject)T, var24);
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
        if (NIL == module0820.f52653()) {
            return module0656.f39789((SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var17 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic70$, var15);
        module0642.f39020((SubLObject)$ic27$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var16), module0655.$g5142$.getDynamicValue(var16));
        final SubLObject var18 = module0014.f672((SubLObject)$ic28$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic29$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var18) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var18);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic30$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var17);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var19 = module0015.$g535$.currentBinding(var16);
        try {
            module0015.$g535$.bind((SubLObject)T, var16);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_62 = module0015.$g533$.currentBinding(var16);
            try {
                module0015.$g533$.bind((SubLObject)T, var16);
                module0642.f39021((SubLObject)$ic71$);
                f52799(var15);
                module0642.f39032((SubLObject)FOUR_INTEGER);
                module0656.f39837((SubLObject)$ic24$, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)TWO_INTEGER);
                module0642.f39021((SubLObject)$ic72$);
                f52824(var15);
                final SubLObject var20 = module0820.f52709(var15);
                module0642.f39026((SubLObject)UNPROVIDED);
                f52825(var15, var20);
                final SubLObject var21 = module0820.f52708(var15);
                module0642.f39026((SubLObject)UNPROVIDED);
                f52826(var15, var21);
                final SubLObject var22 = module0820.f52681(var15);
                final SubLObject var23 = module0820.f52680(var15);
                if (NIL != var22 || NIL != var23) {
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39021((SubLObject)$ic73$);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    if (NIL != var22) {
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f52827(var22, (SubLObject)$ic74$, (SubLObject)$ic75$, (SubLObject)$ic76$);
                    }
                    if (NIL != var23) {
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f52828(var23, (SubLObject)$ic77$, (SubLObject)$ic75$, (SubLObject)$ic78$);
                    }
                }
                SubLObject var24 = module0820.f52692(var15);
                SubLObject var25 = module0820.f52691(var15);
                if (NIL != var24 || NIL != var25) {
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39021((SubLObject)$ic79$);
                    if (NIL != var24) {
                        var24 = module0809.f51692(var24);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39019((SubLObject)$ic80$);
                        f52829(var15, var24);
                    }
                    if (NIL != var25) {
                        var25 = module0809.f51691(var25);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39019((SubLObject)$ic81$);
                        f52830(var15, var25);
                    }
                }
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var20_62, var16);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var19, var16);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52829(final SubLObject var15, final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var68 = module0015.$g533$.currentBinding(var67);
        try {
            module0015.$g533$.bind((SubLObject)T, var67);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_67 = module0015.$g533$.currentBinding(var67);
            try {
                module0015.$g533$.bind((SubLObject)T, var67);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_68 = module0015.$g533$.currentBinding(var67);
                try {
                    module0015.$g533$.bind((SubLObject)T, var67);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic82$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_68, var67);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_69 = module0015.$g533$.currentBinding(var67);
                try {
                    module0015.$g533$.bind((SubLObject)T, var67);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var20_69, var67);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_70 = module0015.$g533$.currentBinding(var67);
                try {
                    module0015.$g533$.bind((SubLObject)T, var67);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic83$);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            SubLObject var69 = var66;
            SubLObject var70 = (SubLObject)NIL;
            var70 = var69.first();
            while (NIL != var69) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_71 = module0015.$g533$.currentBinding(var67);
                try {
                    module0015.$g533$.bind((SubLObject)T, var67);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_72 = module0015.$g533$.currentBinding(var67);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var67);
                        f52797(var70);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_72, var67);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_73 = module0015.$g533$.currentBinding(var67);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var67);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_73, var67);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_74 = module0015.$g533$.currentBinding(var67);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var67);
                        final SubLObject var71 = module0820.f52695(var15, var70);
                        SubLObject var47_77 = Sequences.reverse(var71);
                        SubLObject var72 = (SubLObject)NIL;
                        var72 = var47_77.first();
                        while (NIL != var47_77) {
                            module0642.f39019(var72);
                            module0642.f39032((SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                var69 = var69.rest();
                var70 = var69.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var68, var67);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52830(final SubLObject var15, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var67 = module0015.$g533$.currentBinding(var66);
        try {
            module0015.$g533$.bind((SubLObject)T, var66);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_79 = module0015.$g533$.currentBinding(var66);
            try {
                module0015.$g533$.bind((SubLObject)T, var66);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_80 = module0015.$g533$.currentBinding(var66);
                try {
                    module0015.$g533$.bind((SubLObject)T, var66);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic84$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_80, var66);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_81 = module0015.$g533$.currentBinding(var66);
                try {
                    module0015.$g533$.bind((SubLObject)T, var66);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var20_81, var66);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_82 = module0015.$g533$.currentBinding(var66);
                try {
                    module0015.$g533$.bind((SubLObject)T, var66);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic83$);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            SubLObject var68 = var65;
            SubLObject var69 = (SubLObject)NIL;
            var69 = var68.first();
            while (NIL != var68) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_83 = module0015.$g533$.currentBinding(var66);
                try {
                    module0015.$g533$.bind((SubLObject)T, var66);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_84 = module0015.$g533$.currentBinding(var66);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var66);
                        f52798(var69);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_84, var66);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_85 = module0015.$g533$.currentBinding(var66);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var66);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_85, var66);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_86 = module0015.$g533$.currentBinding(var66);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var66);
                        final SubLObject var70 = module0820.f52694(var15, var69);
                        SubLObject var47_88 = Sequences.reverse(var70);
                        SubLObject var71 = (SubLObject)NIL;
                        var71 = var47_88.first();
                        while (NIL != var47_88) {
                            module0642.f39019(var71);
                            module0642.f39032((SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                var68 = var68.rest();
                var69 = var68.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var67, var66);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52826(final SubLObject var15, SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        var64 = module0820.f52661(var64);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var66 = module0015.$g533$.currentBinding(var65);
        try {
            module0015.$g533$.bind((SubLObject)T, var65);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_89 = module0015.$g533$.currentBinding(var65);
            try {
                module0015.$g533$.bind((SubLObject)T, var65);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_90 = module0015.$g533$.currentBinding(var65);
                try {
                    module0015.$g533$.bind((SubLObject)T, var65);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39021((SubLObject)$ic85$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_90, var65);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_91 = module0015.$g533$.currentBinding(var65);
                try {
                    module0015.$g533$.bind((SubLObject)T, var65);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var20_91, var65);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_92 = module0015.$g533$.currentBinding(var65);
                try {
                    module0015.$g533$.bind((SubLObject)T, var65);
                    SubLObject var67 = var64;
                    SubLObject var68 = (SubLObject)NIL;
                    var68 = var67.first();
                    while (NIL != var67) {
                        if (!var68.eql(var64.first())) {
                            module0642.f39019((SubLObject)$ic86$);
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
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var66, var65);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52825(final SubLObject var15, SubLObject var63) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        var63 = module0820.f52661(var63);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var65 = module0015.$g533$.currentBinding(var64);
        try {
            module0015.$g533$.bind((SubLObject)T, var64);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_96 = module0015.$g533$.currentBinding(var64);
            try {
                module0015.$g533$.bind((SubLObject)T, var64);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_97 = module0015.$g533$.currentBinding(var64);
                try {
                    module0015.$g533$.bind((SubLObject)T, var64);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39021((SubLObject)$ic87$);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_97, var64);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_98 = module0015.$g533$.currentBinding(var64);
                try {
                    module0015.$g533$.bind((SubLObject)T, var64);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var20_98, var64);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_99 = module0015.$g533$.currentBinding(var64);
                try {
                    module0015.$g533$.bind((SubLObject)T, var64);
                    SubLObject var66 = var63;
                    SubLObject var67 = (SubLObject)NIL;
                    var67 = var66.first();
                    while (NIL != var66) {
                        if (!var67.eql(var63.first())) {
                            module0642.f39019((SubLObject)$ic86$);
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
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var65, var64);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52833(final SubLObject var22) {
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var22, (SubLObject)$ic88$);
        var23 = var22.first();
        SubLObject var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var22, (SubLObject)$ic88$);
        var24 = var25.first();
        var25 = var25.rest();
        if (NIL == var25) {
            final SubLObject var26 = Packages.find_package(var23);
            final SubLObject var27 = Packages.find_symbol(var24, var26);
            return f52814(var27);
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)$ic88$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52834(final SubLObject var14, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert NIL != Types.symbolp(var14) : var14;
        if (NIL == var23) {
            var23 = f52835(var14);
        }
        final SubLObject var25 = module0656.f39832((SubLObject)$ic22$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic91$);
        module0642.f39044(f52836(Symbols.symbol_package(var14)));
        module0642.f39019((SubLObject)$ic92$);
        module0642.f39044(Symbols.symbol_name(var14));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var25) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var26 = module0015.$g533$.currentBinding(var24);
        try {
            module0015.$g533$.bind((SubLObject)T, var24);
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
        if (NIL == module0820.f52653()) {
            return module0656.f39789((SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var16 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic94$, var14);
        module0642.f39020((SubLObject)$ic27$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var15), module0655.$g5142$.getDynamicValue(var15));
        final SubLObject var17 = module0014.f672((SubLObject)$ic28$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic29$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var17) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var17);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic30$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var16);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var18 = module0015.$g535$.currentBinding(var15);
        try {
            module0015.$g535$.bind((SubLObject)T, var15);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_105 = module0015.$g533$.currentBinding(var15);
            try {
                module0015.$g533$.bind((SubLObject)T, var15);
                module0642.f39021((SubLObject)$ic95$);
                f52798(var14);
                module0642.f39032((SubLObject)FOUR_INTEGER);
                module0642.f39019((SubLObject)$ic96$);
                f52801(var14);
                module0642.f39032((SubLObject)FOUR_INTEGER);
                module0656.f39837((SubLObject)$ic24$, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var19 = module0820.f52676(var14);
                final SubLObject var20 = module0820.f52677(var14);
                module0642.f39026((SubLObject)TWO_INTEGER);
                module0642.f39021((SubLObject)$ic97$);
                module0642.f39026((SubLObject)UNPROVIDED);
                if (NIL != var19) {
                    f52837(var19, var20);
                }
                else if (NIL != Symbols.boundp(var14)) {
                    module0642.f39019((SubLObject)$ic98$);
                }
                else {
                    module0642.f39019((SubLObject)$ic99$);
                }
                SubLObject var21 = module0820.f52703(var14);
                SubLObject var22 = module0820.f52702(var14);
                SubLObject var23 = module0820.f52704(var14);
                if (NIL != var21 || NIL != var22 || NIL != var23) {
                    final SubLObject var24 = module0820.f52705(var14);
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    f52826(var19, var24);
                    if (NIL != var21) {
                        var21 = module0809.f51696(var21);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f52828(var21, (SubLObject)$ic100$, (SubLObject)$ic59$, (SubLObject)$ic101$);
                    }
                    if (NIL != var22) {
                        var22 = module0809.f51695(var22);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f52827(var22, (SubLObject)$ic102$, (SubLObject)$ic59$, (SubLObject)$ic103$);
                    }
                    if (NIL != var23) {
                        var23 = module0809.f51698(var22);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f52838(var23, (SubLObject)$ic104$);
                    }
                }
                var21 = module0820.f52688(var14);
                var22 = module0820.f52687(var14);
                if (NIL != var21 || NIL != var22) {
                    final SubLObject var25 = module0820.f52690(var14);
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    f52825(var19, var25);
                    if (NIL != var21) {
                        var21 = module0809.f51692(var21);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f52828(var21, (SubLObject)$ic105$, (SubLObject)$ic59$, (SubLObject)$ic101$);
                    }
                    if (NIL != var22) {
                        var22 = module0809.f51691(var22);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f52827(var22, (SubLObject)$ic106$, (SubLObject)$ic59$, (SubLObject)$ic103$);
                    }
                }
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var20_105, var15);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var18, var15);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52839(final SubLObject var22) {
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var22, (SubLObject)$ic88$);
        var23 = var22.first();
        SubLObject var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var22, (SubLObject)$ic88$);
        var24 = var25.first();
        var25 = var25.rest();
        if (NIL == var25) {
            final SubLObject var26 = Packages.find_package(var23);
            final SubLObject var27 = Packages.find_symbol(var24, var26);
            return f52813(var27);
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)$ic88$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52840(final SubLObject var14, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert NIL != Types.symbolp(var14) : var14;
        if (NIL == var23) {
            var23 = f52835(var14);
        }
        final SubLObject var25 = module0656.f39832((SubLObject)$ic22$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic108$);
        module0642.f39044(f52836(Symbols.symbol_package(var14)));
        module0642.f39019((SubLObject)$ic92$);
        module0642.f39044(Symbols.symbol_name(var14));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var25) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var26 = module0015.$g533$.currentBinding(var24);
        try {
            module0015.$g533$.bind((SubLObject)T, var24);
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
        if (NIL == module0820.f52653()) {
            return module0656.f39789((SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var16 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic110$, var14);
        module0642.f39020((SubLObject)$ic27$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var15), module0655.$g5142$.getDynamicValue(var15));
        final SubLObject var17 = module0014.f672((SubLObject)$ic28$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic29$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var17) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var17);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic30$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var16);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var18 = module0015.$g535$.currentBinding(var15);
        try {
            module0015.$g535$.bind((SubLObject)T, var15);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_109 = module0015.$g533$.currentBinding(var15);
            try {
                module0015.$g533$.bind((SubLObject)T, var15);
                module0642.f39021((SubLObject)$ic111$);
                f52797(var14);
                module0642.f39032((SubLObject)FOUR_INTEGER);
                module0642.f39019((SubLObject)$ic96$);
                f52800(var14);
                module0642.f39032((SubLObject)FOUR_INTEGER);
                module0656.f39837((SubLObject)$ic24$, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39027((SubLObject)$ic13$, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic112$);
                module0642.f39020(module0015.$g213$.getGlobalValue());
                module0656.f39804(module0820.f52674(var14), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g214$.getGlobalValue());
                final SubLObject var19 = module0820.f52670(var14);
                final SubLObject var20 = module0820.f52671(var14);
                module0642.f39026((SubLObject)TWO_INTEGER);
                module0642.f39021((SubLObject)$ic97$);
                module0642.f39026((SubLObject)UNPROVIDED);
                if (NIL != var19) {
                    f52837(var19, var20);
                }
                else if (NIL != Symbols.fboundp(var14)) {
                    module0642.f39019((SubLObject)$ic113$);
                }
                else {
                    module0642.f39019((SubLObject)$ic114$);
                }
                SubLObject var21 = module0820.f52698(var14);
                SubLObject var22 = module0820.f52697(var14);
                SubLObject var23 = module0820.f52699(var14);
                if (NIL != var21 || NIL != var22 || NIL != var23) {
                    final SubLObject var24 = module0820.f52700(var14);
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    f52826(var19, var24);
                    if (NIL != var21) {
                        var21 = module0809.f51696(var21);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f52828(var21, (SubLObject)$ic115$, (SubLObject)$ic59$, (SubLObject)$ic101$);
                    }
                    if (NIL != var22) {
                        var22 = module0809.f51695(var22);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f52827(var22, (SubLObject)$ic116$, (SubLObject)$ic59$, (SubLObject)$ic103$);
                    }
                    if (NIL != var23) {
                        var23 = module0809.f51698(var23);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f52838(var23, (SubLObject)$ic117$);
                    }
                }
                var21 = module0820.f52684(var14);
                var22 = module0820.f52682(var14);
                if (NIL != var21 || NIL != var22) {
                    final SubLObject var25 = module0820.f52686(var14);
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    f52825(var19, var25);
                    if (NIL != var21) {
                        var21 = module0809.f51692(var21);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f52828(var21, (SubLObject)$ic118$, (SubLObject)$ic59$, (SubLObject)$ic101$);
                    }
                    if (NIL != var22) {
                        var22 = module0809.f51691(var22);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f52827(var22, (SubLObject)$ic119$, (SubLObject)$ic59$, (SubLObject)$ic103$);
                    }
                }
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var20_109, var15);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var18, var15);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52841() {
        final SubLObject var110 = $g6528$.getGlobalValue();
        if (NIL != var110) {
            module0034.f1818(var110);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52842(final SubLObject var104) {
        return module0034.f1829($g6528$.getGlobalValue(), (SubLObject)ConsesLow.list(var104), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f52843(final SubLObject var104) {
        assert NIL != Types.packagep(var104) : var104;
        final SubLObject var105 = Packages.package_nicknames(var104);
        if (NIL != var105) {
            return var105.first();
        }
        return Packages.package_name(var104);
    }
    
    public static SubLObject f52836(final SubLObject var104) {
        SubLObject var105 = $g6528$.getGlobalValue();
        if (NIL == var105) {
            var105 = module0034.f1934((SubLObject)$ic120$, (SubLObject)$ic122$, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)ONE_INTEGER, (SubLObject)TEN_INTEGER);
        }
        SubLObject var106 = module0034.f1814(var105, var104, (SubLObject)$ic123$);
        if (var106 == $ic123$) {
            var106 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f52843(var104)));
            module0034.f1816(var105, var104, var106, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var106);
    }
    
    public static SubLObject f52844() {
        final SubLObject var110 = $g6529$.getGlobalValue();
        if (NIL != var110) {
            module0034.f1818(var110);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52845(final SubLObject var14) {
        return module0034.f1829($g6529$.getGlobalValue(), (SubLObject)ConsesLow.list(var14), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f52846(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        assert NIL != Types.symbolp(var14) : var14;
        if (var14.eql(Packages.find_symbol(Symbols.symbol_name(var14), Packages.$package$.getDynamicValue(var15)))) {
            return print_high.prin1_to_string(var14);
        }
        final SubLObject var16 = Symbols.symbol_package(var14);
        if (NIL == var16) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic125$, Symbols.symbol_name(var14));
        }
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic126$, f52836(var16), Symbols.symbol_name(var14));
    }
    
    public static SubLObject f52835(final SubLObject var14) {
        SubLObject var15 = $g6529$.getGlobalValue();
        if (NIL == var15) {
            var15 = module0034.f1934((SubLObject)$ic124$, (SubLObject)$ic127$, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)ONE_INTEGER, (SubLObject)TEN_INTEGER);
        }
        SubLObject var16 = module0034.f1814(var15, var14, (SubLObject)$ic123$);
        if (var16 == $ic123$) {
            var16 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f52846(var14)));
            module0034.f1816(var15, var14, var16, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var16);
    }
    
    public static SubLObject f52837(final SubLObject var15, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLThread var79 = SubLProcess.currentSubLThread();
        if (NIL != var15) {
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var80 = module0015.$g533$.currentBinding(var79);
            try {
                module0015.$g533$.bind((SubLObject)T, var79);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_114 = module0015.$g533$.currentBinding(var79);
                try {
                    module0015.$g533$.bind((SubLObject)T, var79);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_115 = module0015.$g533$.currentBinding(var79);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var79);
                        module0642.f39019((SubLObject)$ic71$);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_115, var79);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_116 = module0015.$g533$.currentBinding(var79);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var79);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                if (NIL != var78) {
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_117 = module0015.$g533$.currentBinding(var79);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var79);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_118 = module0015.$g533$.currentBinding(var79);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var79);
                            module0642.f39019((SubLObject)$ic128$);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_118, var79);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_119 = module0015.$g533$.currentBinding(var79);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var79);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                final SubLObject var81 = module0820.f52666(var15);
                if (NIL != var81) {
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_120 = module0015.$g533$.currentBinding(var79);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var79);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_121 = module0015.$g533$.currentBinding(var79);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var79);
                            module0642.f39019((SubLObject)$ic129$);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_121, var79);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_122 = module0015.$g533$.currentBinding(var79);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var79);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_123 = module0015.$g533$.currentBinding(var79);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var79);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_124 = module0015.$g533$.currentBinding(var79);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var79);
                            module0642.f39019((SubLObject)$ic58$);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_124, var79);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_125 = module0015.$g533$.currentBinding(var79);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var79);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0015.$g533$.rebind(var80, var79);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52824(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL != var15) {
            final SubLObject var17 = module0820.f52666(var15);
            if (NIL != var17) {
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var18 = module0015.$g533$.currentBinding(var16);
                try {
                    module0015.$g533$.bind((SubLObject)T, var16);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_126 = module0015.$g533$.currentBinding(var16);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var16);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_127 = module0015.$g533$.currentBinding(var16);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var16);
                            module0642.f39019((SubLObject)$ic129$);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_127, var16);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_128 = module0015.$g533$.currentBinding(var16);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var16);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_129 = module0015.$g533$.currentBinding(var16);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var16);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_130 = module0015.$g533$.currentBinding(var16);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var16);
                            module0642.f39019((SubLObject)$ic58$);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_130, var16);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_131 = module0015.$g533$.currentBinding(var16);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var16);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var18, var16);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52828(final SubLObject var66, final SubLObject var132, final SubLObject var133, final SubLObject var134) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var136 = module0015.$g533$.currentBinding(var135);
        try {
            module0015.$g533$.bind((SubLObject)T, var135);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_135 = module0015.$g533$.currentBinding(var135);
            try {
                module0015.$g533$.bind((SubLObject)T, var135);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_136 = module0015.$g533$.currentBinding(var135);
                try {
                    module0015.$g533$.bind((SubLObject)T, var135);
                    module0642.f39019(var132);
                }
                finally {
                    module0015.$g533$.rebind(var20_136, var135);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_137 = module0015.$g533$.currentBinding(var135);
                try {
                    module0015.$g533$.bind((SubLObject)T, var135);
                    module0642.f39027((SubLObject)$ic13$, (SubLObject)TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var20_137, var135);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_138 = module0015.$g533$.currentBinding(var135);
                try {
                    module0015.$g533$.bind((SubLObject)T, var135);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            SubLObject var137 = var66;
            SubLObject var138 = (SubLObject)NIL;
            var138 = var137.first();
            while (NIL != var137) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_139 = module0015.$g533$.currentBinding(var135);
                try {
                    module0015.$g533$.bind((SubLObject)T, var135);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_140 = module0015.$g533$.currentBinding(var135);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var135);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_141 = module0015.$g533$.currentBinding(var135);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var135);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_142 = module0015.$g533$.currentBinding(var135);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var135);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_143 = module0015.$g533$.currentBinding(var135);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var135);
                                    f52802(var138);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_143, var135);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_144 = module0015.$g533$.currentBinding(var135);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var135);
                                    module0642.f39027((SubLObject)$ic13$, (SubLObject)TWO_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_144, var135);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_145 = module0015.$g533$.currentBinding(var135);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var135);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
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
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_146 = module0015.$g533$.currentBinding(var135);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var135);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_146, var135);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_147 = module0015.$g533$.currentBinding(var135);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var135);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                var137 = var137.rest();
                var138 = var137.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var136, var135);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52827(final SubLObject var65, final SubLObject var148, final SubLObject var133, final SubLObject var134) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var150 = module0015.$g533$.currentBinding(var149);
        try {
            module0015.$g533$.bind((SubLObject)T, var149);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_149 = module0015.$g533$.currentBinding(var149);
            try {
                module0015.$g533$.bind((SubLObject)T, var149);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_150 = module0015.$g533$.currentBinding(var149);
                try {
                    module0015.$g533$.bind((SubLObject)T, var149);
                    module0642.f39019(var148);
                }
                finally {
                    module0015.$g533$.rebind(var20_150, var149);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_151 = module0015.$g533$.currentBinding(var149);
                try {
                    module0015.$g533$.bind((SubLObject)T, var149);
                    module0642.f39027((SubLObject)$ic13$, (SubLObject)TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var20_151, var149);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_152 = module0015.$g533$.currentBinding(var149);
                try {
                    module0015.$g533$.bind((SubLObject)T, var149);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            SubLObject var151 = var65;
            SubLObject var152 = (SubLObject)NIL;
            var152 = var151.first();
            while (NIL != var151) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_153 = module0015.$g533$.currentBinding(var149);
                try {
                    module0015.$g533$.bind((SubLObject)T, var149);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_154 = module0015.$g533$.currentBinding(var149);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var149);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_155 = module0015.$g533$.currentBinding(var149);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var149);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_156 = module0015.$g533$.currentBinding(var149);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var149);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_157 = module0015.$g533$.currentBinding(var149);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var149);
                                    f52804(var152);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_157, var149);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_158 = module0015.$g533$.currentBinding(var149);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var149);
                                    module0642.f39027((SubLObject)$ic13$, (SubLObject)TWO_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_158, var149);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_159 = module0015.$g533$.currentBinding(var149);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var149);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
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
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_160 = module0015.$g533$.currentBinding(var149);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var149);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_160, var149);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic36$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic61$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_161 = module0015.$g533$.currentBinding(var149);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var149);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                var151 = var151.rest();
                var152 = var151.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var150, var149);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52838(final SubLObject var106, final SubLObject var12) {
        module0642.f39019(var12);
        SubLObject var107 = var106;
        SubLObject var108 = (SubLObject)NIL;
        var108 = var107.first();
        while (NIL != var107) {
            module0642.f39026((SubLObject)UNPROVIDED);
            f52799(var108);
            var107 = var107.rest();
            var108 = var107.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52847(final SubLObject var71) {
        final SubLObject var72 = module0820.f52670(var71);
        if (NIL != var72) {
            f52799(var72);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52848(final SubLObject var83) {
        final SubLObject var84 = module0820.f52676(var83);
        if (NIL != var84) {
            f52799(var84);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52849(final SubLObject var71) {
        SubLObject var72 = (SubLObject)NIL;
        if (NIL != module0820.f52669(var71)) {
            var72 = (SubLObject)ConsesLow.cons((SubLObject)$ic130$, var72);
        }
        if (NIL != module0820.f52696(var71)) {
            var72 = (SubLObject)ConsesLow.cons((SubLObject)$ic131$, var72);
        }
        else if (NIL != module0820.f52706(var71)) {
            var72 = (SubLObject)ConsesLow.cons((SubLObject)$ic132$, var72);
        }
        var72 = Sequences.nreverse(var72);
        return f52850(var72);
    }
    
    public static SubLObject f52851(final SubLObject var83) {
        SubLObject var84 = (SubLObject)NIL;
        final SubLObject var85 = module0820.f52675(var83);
        if (var85.eql((SubLObject)$ic133$)) {
            var84 = (SubLObject)ConsesLow.cons((SubLObject)$ic134$, var84);
        }
        else if (var85.eql((SubLObject)$ic135$)) {
            var84 = (SubLObject)ConsesLow.cons((SubLObject)$ic136$, var84);
        }
        else if (var85.eql((SubLObject)$ic137$)) {
            var84 = (SubLObject)ConsesLow.cons((SubLObject)$ic138$, var84);
        }
        if (NIL != module0820.f52701(var83)) {
            var84 = (SubLObject)ConsesLow.cons((SubLObject)$ic131$, var84);
        }
        else if (NIL != module0820.f52707(var83)) {
            var84 = (SubLObject)ConsesLow.cons((SubLObject)$ic132$, var84);
        }
        var84 = Sequences.nreverse(var84);
        return f52850(var84);
    }
    
    public static SubLObject f52850(final SubLObject var162) {
        if (NIL != var162) {
            SubLObject var163 = var162;
            SubLObject var164 = (SubLObject)NIL;
            var164 = var163.first();
            while (NIL != var163) {
                if (!var164.eql(var162.first())) {
                    module0642.f39019((SubLObject)$ic86$);
                }
                module0642.f39019(var164);
                var163 = var163.rest();
                var164 = var163.first();
            }
        }
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52853() {
        $g6527$ = SubLFiles.deflexical("S#58208", (SubLObject)$ic14$);
        $g6528$ = SubLFiles.deflexical("S#58209", (SubLObject)NIL);
        $g6529$ = SubLFiles.deflexical("S#58210", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f52854() {
        module0015.f873((SubLObject)$ic15$);
        module0656.f39840((SubLObject)$ic18$, (SubLObject)$ic19$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic20$);
        module0656.f39840((SubLObject)$ic24$, (SubLObject)$ic25$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic51$);
        module0015.f873((SubLObject)$ic52$);
        module0656.f39840((SubLObject)$ic34$, (SubLObject)$ic55$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic66$);
        module0656.f39840((SubLObject)$ic12$, (SubLObject)$ic69$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic89$);
        module0656.f39840((SubLObject)$ic11$, (SubLObject)$ic93$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic107$);
        module0656.f39840((SubLObject)$ic10$, (SubLObject)$ic109$, (SubLObject)TWO_INTEGER);
        module0034.f1909((SubLObject)$ic120$);
        module0034.f1909((SubLObject)$ic124$);
        return (SubLObject)NIL;
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
        $g6527$ = null;
        $g6528$ = null;
        $g6529$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#1523", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("TITLE"));
        $ic2$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = makeKeyword("TITLE");
        $ic4$ = makeSymbol("S#930", "CYC");
        $ic5$ = makeSymbol("S#43662", "CYC");
        $ic6$ = makeSymbol("S#942", "CYC");
        $ic7$ = makeSymbol("S#1531", "CYC");
        $ic8$ = makeSymbol("S#925", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeKeyword("SHOW-COPYRIGHT"), (SubLObject)T);
        $ic10$ = makeKeyword("TD-METHOD");
        $ic11$ = makeKeyword("TD-GLOBAL");
        $ic12$ = makeKeyword("TD-MODULE");
        $ic13$ = makeKeyword("NBSP");
        $ic14$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("PRIVATE"), (SubLObject)makeString("FF7F7F")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("PROTECTED"), (SubLObject)makeString("FFFF7F")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("PUBLIC"), (SubLObject)makeString("7FFF7F")));
        $ic15$ = makeSymbol("CB-TD-TOOL");
        $ic16$ = makeKeyword("MAIN");
        $ic17$ = makeString("cb-td-tool");
        $ic18$ = makeKeyword("TD-TOOL");
        $ic19$ = makeSymbol("S#58170", "CYC");
        $ic20$ = makeSymbol("CB-TD-SEARCH");
        $ic21$ = makeString("[Translation Database Browser]");
        $ic22$ = makeKeyword("SELF");
        $ic23$ = makeString("cb-td-search");
        $ic24$ = makeKeyword("TD-SEARCH");
        $ic25$ = makeSymbol("S#58171", "CYC");
        $ic26$ = makeString("There is no current SubL translation state.");
        $ic27$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic28$ = makeKeyword("CB-CYC");
        $ic29$ = makeString("stylesheet");
        $ic30$ = makeString("text/css");
        $ic31$ = makeString("Translation Database Browser");
        $ic32$ = makeString("post");
        $ic33$ = makeString("cb-td-handle-search");
        $ic34$ = makeKeyword("TD-SUMMARY");
        $ic35$ = makeString("[Current Translation Summary]");
        $ic36$ = makeKeyword("LEFT");
        $ic37$ = makeKeyword("CENTER");
        $ic38$ = makeString("Find a ");
        $ic39$ = makeString("kind");
        $ic40$ = makeString("method");
        $ic41$ = makeString("function or macro");
        $ic42$ = makeString("global");
        $ic43$ = makeString("global variable");
        $ic44$ = makeString("module");
        $ic45$ = makeString("source file");
        $ic46$ = makeString(" called");
        $ic47$ = makeString("name");
        $ic48$ = makeInteger(40);
        $ic49$ = makeString("Find now");
        $ic50$ = makeString("Clear Input");
        $ic51$ = makeSymbol("CB-TD-HANDLE-SEARCH");
        $ic52$ = makeSymbol("CB-TD-SUMMARY");
        $ic53$ = makeString("[Summary]");
        $ic54$ = makeString("cb-td-summary");
        $ic55$ = makeSymbol("S#58173", "CYC");
        $ic56$ = makeString("Translation Summary");
        $ic57$ = makeString("[Search Page]");
        $ic58$ = makeString("Features : ");
        $ic59$ = makeString("Module");
        $ic60$ = makeString("Features");
        $ic61$ = makeKeyword("TOP");
        $ic62$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#58211", "CYC"));
        $ic63$ = makeString("(");
        $ic64$ = makeString(")");
        $ic65$ = ConsesLow.list((SubLObject)makeSymbol("S#205", "CYC"));
        $ic66$ = makeSymbol("CB-TD-MODULE");
        $ic67$ = makeSymbol("S#58000", "CYC");
        $ic68$ = makeString("cb-td-module|");
        $ic69$ = makeSymbol("S#58178", "CYC");
        $ic70$ = makeString("Module : ~A");
        $ic71$ = makeString("Module : ");
        $ic72$ = makeString("Properties");
        $ic73$ = makeString("Definitions");
        $ic74$ = makeString("Globals defined in this module");
        $ic75$ = makeString("Attributes");
        $ic76$ = makeSymbol("S#58206", "CYC");
        $ic77$ = makeString("Methods defined in this module");
        $ic78$ = makeSymbol("S#58205", "CYC");
        $ic79$ = makeString("Top-Level References");
        $ic80$ = makeString("Methods called by top-level forms in this module");
        $ic81$ = makeString("Globals called by top-level forms in this module");
        $ic82$ = makeString("Methods");
        $ic83$ = makeString("File positions");
        $ic84$ = makeString("Globals");
        $ic85$ = makeString("Callers :");
        $ic86$ = makeString(", ");
        $ic87$ = makeString("Calls :");
        $ic88$ = ConsesLow.list((SubLObject)makeSymbol("S#58212", "CYC"), (SubLObject)makeSymbol("S#58213", "CYC"));
        $ic89$ = makeSymbol("CB-TD-GLOBAL");
        $ic90$ = makeSymbol("SYMBOLP");
        $ic91$ = makeString("cb-td-global|");
        $ic92$ = makeString("|");
        $ic93$ = makeSymbol("S#58186", "CYC");
        $ic94$ = makeString("Global : ~S");
        $ic95$ = makeString("Global Variable : ");
        $ic96$ = makeString("Access : ");
        $ic97$ = makeString("Definition");
        $ic98$ = makeString("Internal variable");
        $ic99$ = makeString("Undefined variable");
        $ic100$ = makeString("Methods that reference this global");
        $ic101$ = makeSymbol("S#58203", "CYC");
        $ic102$ = makeString("Globals whose initialization references this global");
        $ic103$ = makeSymbol("S#58204", "CYC");
        $ic104$ = makeString("Modules that reference this global from top-level forms");
        $ic105$ = makeString("Methods called in the initialization of this global");
        $ic106$ = makeString("Globals referenced in the initialization of this global");
        $ic107$ = makeSymbol("CB-TD-METHOD");
        $ic108$ = makeString("cb-td-method|");
        $ic109$ = makeSymbol("S#58188", "CYC");
        $ic110$ = makeString("Method : ~S");
        $ic111$ = makeString("Method : ");
        $ic112$ = makeString("Arglist : ");
        $ic113$ = makeString("Internal method");
        $ic114$ = makeString("Undefined method");
        $ic115$ = makeString("Methods that call this method");
        $ic116$ = makeString("Globals whose initialization calls this method");
        $ic117$ = makeString("Modules that call this method from top-level forms");
        $ic118$ = makeString("Methods called by this method");
        $ic119$ = makeString("Globals referenced by this method");
        $ic120$ = makeSymbol("S#58193", "CYC");
        $ic121$ = makeSymbol("PACKAGEP");
        $ic122$ = makeSymbol("S#58209", "CYC");
        $ic123$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic124$ = makeSymbol("S#58197", "CYC");
        $ic125$ = makeString("#:~A");
        $ic126$ = makeString("~A::~A");
        $ic127$ = makeSymbol("S#58210", "CYC");
        $ic128$ = makeString("Position : ");
        $ic129$ = makeString("Pathname : ");
        $ic130$ = makeString("macro");
        $ic131$ = makeString("no callers");
        $ic132$ = makeString("no external callers");
        $ic133$ = makeKeyword("CONSTANT");
        $ic134$ = makeString("constant");
        $ic135$ = makeKeyword("LEXICAL");
        $ic136$ = makeString("lexical");
        $ic137$ = makeKeyword("SPECIAL");
        $ic138$ = makeString("special");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1056 ms
	
	Decompiled with Procyon 0.5.32.
*/
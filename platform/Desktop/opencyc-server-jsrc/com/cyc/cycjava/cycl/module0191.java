package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0191 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0191";
    public static final String myFingerPrint = "9391efa8ab93635a1c9bf54f14752c9843ec08fd47cbe3d26d7e76e583e27bdc";
    private static SubLSymbol $g2247$;
    private static SubLSymbol $g2248$;
    private static SubLSymbol $g2249$;
    private static SubLSymbol $g2250$;
    public static SubLSymbol $g2251$;
    private static final SubLList $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLString $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLString $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLList $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLString $ic49$;
    private static final SubLList $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLString $ic72$;
    private static final SubLList $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    
    public static SubLObject f11907(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0191.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0191.NIL;
        SubLObject var7 = (SubLObject)module0191.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0191.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0191.$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : module0191.$ic1$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0191.$ic0$);
        var4 = var4.rest();
        if (module0191.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)module0191.$ic2$, (SubLObject)ConsesLow.list(var6, var8), (SubLObject)ConsesLow.listS((SubLObject)module0191.$ic3$, (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0191.$ic4$, var6)), ConsesLow.append(var9, (SubLObject)module0191.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0191.$ic0$);
        return (SubLObject)module0191.NIL;
    }
    
    public static SubLObject f11908(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0191.$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0191.NIL;
        SubLObject var7 = (SubLObject)module0191.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0191.$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0191.$ic5$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : module0191.$ic6$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0191.$ic5$);
        var4 = var4.rest();
        if (module0191.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)module0191.$ic7$, (SubLObject)ConsesLow.list(var6, var7, var8), (SubLObject)ConsesLow.listS((SubLObject)module0191.$ic8$, (SubLObject)ConsesLow.list((SubLObject)module0191.$ic9$, var7), ConsesLow.append(var9, (SubLObject)module0191.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0191.$ic5$);
        return (SubLObject)module0191.NIL;
    }
    
    public static SubLObject f11909(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0191.$ic10$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0191.NIL;
        SubLObject var7 = (SubLObject)module0191.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0191.$ic10$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0191.$ic10$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : module0191.$ic11$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0191.$ic10$);
        var4 = var4.rest();
        if (module0191.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)module0191.$ic7$, (SubLObject)ConsesLow.list(var6, var7, var8), (SubLObject)ConsesLow.listS((SubLObject)module0191.$ic8$, (SubLObject)ConsesLow.list((SubLObject)module0191.$ic12$, var7), ConsesLow.append(var9, (SubLObject)module0191.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0191.$ic10$);
        return (SubLObject)module0191.NIL;
    }
    
    public static SubLObject f11910(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0191.NIL != f11911(var16) || module0191.NIL != module0184.f11659(var16));
    }
    
    public static SubLObject f11912(final SubLObject var7, SubLObject var17) {
        if (var17 == module0191.UNPROVIDED) {
            var17 = (SubLObject)module0191.NIL;
        }
        if (module0191.NIL != f11911(var7)) {
            return (SubLObject)module0191.T;
        }
        if (module0191.NIL != module0184.f11659(var7)) {
            return module0184.f11665(var7, var17);
        }
        return (SubLObject)module0191.NIL;
    }
    
    public static SubLObject f11913(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0191.NIL != f11914(var16) || module0191.NIL != module0188.f11767(var16));
    }
    
    public static SubLObject f11915(final SubLObject var7) {
        assert module0191.NIL != f11910(var7) : var7;
        if (module0191.NIL != f11911(var7)) {
            return f11916(var7);
        }
        if (module0191.NIL != module0184.f11659(var7)) {
            return module0188.f11769(var7);
        }
        Errors.error((SubLObject)module0191.$ic17$);
        return (SubLObject)module0191.NIL;
    }
    
    public static SubLObject f11917(final SubLObject var18) {
        return var18.first();
    }
    
    public static SubLObject f11918(final SubLObject var16) {
        return module0004.f104(var16, module0191.$g2247$.getGlobalValue(), (SubLObject)module0191.UNPROVIDED, (SubLObject)module0191.UNPROVIDED);
    }
    
    public static SubLObject f11919() {
        return module0191.$g2248$.getGlobalValue();
    }
    
    public static SubLObject f11920(final SubLObject var19) {
        final SubLObject var20 = conses_high.assoc(var19, f11919(), (SubLObject)module0191.UNPROVIDED, (SubLObject)module0191.UNPROVIDED);
        if (module0191.NIL == var20) {
            return (SubLObject)module0191.NIL;
        }
        final SubLObject var21 = conses_high.copy_list(conses_high.second(var20));
        final SubLObject var22 = Mapping.mapcan((SubLObject)module0191.$ic20$, var21, module0191.EMPTY_SUBL_OBJECT_ARRAY);
        return ConsesLow.append(var21, var22);
    }
    
    public static SubLObject f11921(final SubLObject var19) {
        return (SubLObject)ConsesLow.cons(var19, f11920(var19));
    }
    
    public static SubLObject f11922(final SubLObject var24, final SubLObject var25) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0191.NIL != f11910(var24) && module0191.NIL != f11910(var25) && (var24.eql(var25) || module0191.NIL != ((module0191.NIL != f11911(var24)) ? SubLObjectFactory.makeBoolean(module0191.NIL != f11911(var25) && module0191.NIL != f11923(var24, var25)) : SubLObjectFactory.makeBoolean(module0191.NIL != module0184.f11659(var25) && module0191.NIL != module0188.f11780(var24, var25)))));
    }
    
    public static SubLObject f11924(final SubLObject var7) {
        assert module0191.NIL != f11910(var7) : var7;
        if (module0191.NIL != f11911(var7)) {
            return f11925(var7);
        }
        return module0188.f11789(var7);
    }
    
    public static SubLObject f11926(final SubLObject var7) {
        assert module0191.NIL != f11910(var7) : var7;
        if (module0191.NIL != f11911(var7)) {
            return f11927(var7);
        }
        final SubLObject var8 = module0188.f11789(var7);
        final SubLObject var9 = module0188.f11790(var7);
        return module0130.f8529(var8, var9);
    }
    
    public static SubLObject f11928(final SubLObject var7) {
        assert module0191.NIL != f11910(var7) : var7;
        if (module0191.NIL != f11911(var7)) {
            return f11929(var7);
        }
        return module0188.f11790(var7);
    }
    
    public static SubLObject f11930(final SubLObject var7, final SubLObject var28) {
        if (module0191.NIL != f11911(var7)) {
            return f11931(var7, var28);
        }
        return module0185.f11682(var7);
    }
    
    public static SubLObject f11911(final SubLObject var16) {
        return f11932(var16);
    }
    
    public static SubLObject f11914(final SubLObject var16) {
        return f11933(var16);
    }
    
    public static SubLObject f11916(final SubLObject var29) {
        assert module0191.NIL != f11911(var29) : var29;
        if (module0191.NIL != f11932(var29)) {
            return f11934(var29);
        }
        Errors.error((SubLObject)module0191.$ic32$);
        return (SubLObject)module0191.NIL;
    }
    
    public static SubLObject f11931(final SubLObject var29, final SubLObject var6) {
        return module0175.f11096(var6, var29);
    }
    
    public static SubLObject f11923(final SubLObject var30, final SubLObject var31) {
        return f11935(var30, var31);
    }
    
    public static SubLObject f11925(final SubLObject var29) {
        return f11936(var29);
    }
    
    public static SubLObject f11929(final SubLObject var29) {
        return f11937(var29);
    }
    
    public static SubLObject f11927(final SubLObject var29) {
        return f11938(var29);
    }
    
    public static SubLObject f11932(final SubLObject var16) {
        return f11939(var16);
    }
    
    public static SubLObject f11933(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0191.NIL != module0035.f1998(var16) && module0191.$ic34$ == var16.first() && module0191.NIL != module0130.f8508(conses_high.second(var16)));
    }
    
    public static SubLObject f11934(final SubLObject var32) {
        final SubLObject var33 = f11937(var32);
        final SubLObject var34 = f11940(var33);
        return var34;
    }
    
    public static SubLObject f11941(final SubLObject var6, final SubLObject var33) {
        return f11942(var33);
    }
    
    public static SubLObject f11940(final SubLObject var34) {
        assert module0191.NIL != module0130.f8508(var34) : var34;
        return (SubLObject)ConsesLow.list((SubLObject)module0191.$ic34$, var34);
    }
    
    public static SubLObject f11943(final SubLObject var35) {
        return conses_high.second(var35);
    }
    
    public static SubLObject f11944(final SubLObject var32) {
        return (SubLObject)module0191.NIL;
    }
    
    public static SubLObject f11945() {
        return module0191.$g2250$.getGlobalValue();
    }
    
    public static SubLObject f11939(final SubLObject var16) {
        return module0004.f104(var16, module0191.$g2250$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0191.EQ), (SubLObject)module0191.UNPROVIDED);
    }
    
    public static SubLObject f11942(final SubLObject var33) {
        assert module0191.NIL != module0130.f8520(var33) : var33;
        return Sequences.find(var33, module0191.$g2249$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0191.EQ), Symbols.symbol_function((SubLObject)module0191.$ic39$), (SubLObject)module0191.UNPROVIDED, (SubLObject)module0191.UNPROVIDED).first();
    }
    
    public static SubLObject f11946(final SubLObject var32) {
        return conses_high.second(Sequences.find(var32, module0191.$g2249$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0191.EQ), Symbols.symbol_function((SubLObject)module0191.$ic37$), (SubLObject)module0191.UNPROVIDED, (SubLObject)module0191.UNPROVIDED));
    }
    
    public static SubLObject f11947() {
        return (SubLObject)module0191.$ic40$;
    }
    
    public static SubLObject f11935(final SubLObject var36, final SubLObject var37) {
        return Equality.eq(var36, var37);
    }
    
    public static SubLObject f11938(final SubLObject var32) {
        if (module0191.NIL != f11939(var32)) {
            return f11946(var32);
        }
        return (SubLObject)module0191.NIL;
    }
    
    public static SubLObject f11937(final SubLObject var32) {
        return module0130.f8523(f11938(var32));
    }
    
    public static SubLObject f11936(final SubLObject var32) {
        return module0130.f8524(f11938(var32));
    }
    
    public static SubLObject f11948(final SubLObject var16) {
        if (module0191.NIL == module0035.f2014(var16)) {
            return (SubLObject)module0191.NIL;
        }
        SubLObject var17 = var16;
        SubLObject var18 = (SubLObject)module0191.NIL;
        var18 = var17.first();
        while (module0191.NIL != var17) {
            if (module0191.NIL == f11949(var18)) {
                return (SubLObject)module0191.NIL;
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return (SubLObject)module0191.T;
    }
    
    public static SubLObject f11949(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0191.NIL != module0174.f11035(var16) || (module0191.NIL != module0035.f2014(var16) && module0191.NIL != module0035.f1995(var16, (SubLObject)module0191.FOUR_INTEGER, (SubLObject)module0191.UNPROVIDED) && module0191.NIL != module0333.f22421(var16.first()) && module0191.NIL != module0202.f12660(conses_high.second(var16)) && module0191.NIL != module0161.f10481(conses_high.third(var16)) && module0191.NIL != module0130.f8507(conses_high.fourth(var16))));
    }
    
    public static SubLObject f11950(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0191.NIL != f11951(var16) || module0191.NIL != f11952(var16));
    }
    
    public static SubLObject f11951(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0191.NIL != module0174.f11035(var16) || module0191.NIL != module0179.f11424(var16));
    }
    
    public static SubLObject f11953(final SubLObject var16) {
        return f11954(var16);
    }
    
    public static SubLObject f11954(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0191.NIL != module0035.f2014(var16) && module0191.NIL != module0035.f2370((SubLObject)module0191.$ic41$, var16, (SubLObject)module0191.UNPROVIDED));
    }
    
    public static SubLObject f11955(final SubLObject var28, SubLObject var17) {
        if (var17 == module0191.UNPROVIDED) {
            var17 = (SubLObject)module0191.NIL;
        }
        if (module0191.NIL != module0174.f11035(var28)) {
            return module0174.f11041(var28, (SubLObject)module0191.UNPROVIDED);
        }
        if (module0191.NIL != module0179.f11424(var28)) {
            return module0179.f11430(var28, var17);
        }
        if (module0191.NIL != f11952(var28)) {
            return f11956(var28);
        }
        return (SubLObject)module0191.NIL;
    }
    
    public static SubLObject f11957(final SubLObject var28) {
        if (module0191.NIL != module0174.f11035(var28)) {
            return f11958(var28);
        }
        if (module0191.NIL != module0179.f11424(var28)) {
            return f11959(var28);
        }
        if (module0191.NIL != f11952(var28)) {
            return f11960(var28);
        }
        return (SubLObject)module0191.NIL;
    }
    
    public static SubLObject f11960(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        SubLObject var41 = (SubLObject)module0191.NIL;
        try {
            var40.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var42 = Errors.$error_handler$.currentBinding(var40);
            try {
                Errors.$error_handler$.bind((SubLObject)module0191.$ic43$, var40);
                try {
                    if (module0191.NIL == module0274.f18101(f11961(var39), (SubLObject)module0191.UNPROVIDED)) {
                        var41 = (SubLObject)module0191.$ic44$;
                    }
                }
                catch (Throwable var43) {
                    Errors.handleThrowable(var43, (SubLObject)module0191.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var42, var40);
            }
        }
        catch (Throwable var44) {
            var41 = Errors.handleThrowable(var44, module0003.$g3$.getGlobalValue());
        }
        finally {
            var40.throwStack.pop();
        }
        return var41;
    }
    
    public static SubLObject f11959(final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        SubLObject var47 = (SubLObject)module0191.NIL;
        try {
            var46.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var48 = Errors.$error_handler$.currentBinding(var46);
            try {
                Errors.$error_handler$.bind((SubLObject)module0191.$ic43$, var46);
                try {
                    if (module0191.NIL == module0274.f18101(module0183.f11560(var45), (SubLObject)module0191.UNPROVIDED)) {
                        var47 = (SubLObject)module0191.$ic44$;
                    }
                }
                catch (Throwable var49) {
                    Errors.handleThrowable(var49, (SubLObject)module0191.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var48, var46);
            }
        }
        catch (Throwable var50) {
            var47 = Errors.handleThrowable(var50, module0003.$g3$.getGlobalValue());
        }
        finally {
            var46.throwStack.pop();
        }
        return var47;
    }
    
    public static SubLObject f11958(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0191.NIL;
        try {
            var7.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var9 = Errors.$error_handler$.currentBinding(var7);
            try {
                Errors.$error_handler$.bind((SubLObject)module0191.$ic43$, var7);
                try {
                    if (module0191.NIL == module0274.f18101(module0538.f33367(var6, (SubLObject)module0191.UNPROVIDED), (SubLObject)module0191.UNPROVIDED)) {
                        var8 = (SubLObject)module0191.$ic44$;
                    }
                }
                catch (Throwable var10) {
                    Errors.handleThrowable(var10, (SubLObject)module0191.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var9, var7);
            }
        }
        catch (Throwable var11) {
            var8 = Errors.handleThrowable(var11, module0003.$g3$.getGlobalValue());
        }
        finally {
            var7.throwStack.pop();
        }
        return var8;
    }
    
    public static SubLObject f11962(final SubLObject var46, final SubLObject var47) {
        if (module0191.NIL != module0174.f11035(var46) || module0191.NIL != module0174.f11035(var47)) {
            return Equality.eql(var46, var47);
        }
        if (module0191.NIL != module0179.f11424(var46) || module0191.NIL != module0179.f11424(var47)) {
            return Equality.eql(var46, var47);
        }
        return Equality.equal(var46, var47);
    }
    
    public static SubLObject f11963(final SubLObject var46, final SubLObject var47) {
        if (module0191.NIL != module0174.f11035(var46)) {
            if (module0191.NIL == module0174.f11035(var47)) {
                return (SubLObject)module0191.T;
            }
            if (module0191.NIL != module0178.f11290(var46)) {
                if (module0191.NIL != module0178.f11290(var47)) {
                    return Numbers.numL(module0174.f11025(var46), module0174.f11025(var47));
                }
                return (SubLObject)module0191.T;
            }
            else {
                if (module0191.NIL != module0178.f11290(var47)) {
                    return (SubLObject)module0191.NIL;
                }
                return Numbers.numL(module0174.f11025(var46), module0174.f11025(var47));
            }
        }
        else if (module0191.NIL != module0179.f11424(var46)) {
            if (module0191.NIL != module0174.f11035(var47)) {
                return (SubLObject)module0191.NIL;
            }
            if (module0191.NIL != module0179.f11424(var47)) {
                return Numbers.numL(module0179.f11415(var46), module0179.f11415(var47));
            }
            return (SubLObject)module0191.T;
        }
        else {
            if (module0191.NIL != module0174.f11035(var47)) {
                return (SubLObject)module0191.NIL;
            }
            if (module0191.NIL != module0179.f11424(var47)) {
                return (SubLObject)module0191.NIL;
            }
            return module0213.f13927(var46, var47, (SubLObject)module0191.UNPROVIDED, (SubLObject)module0191.UNPROVIDED, (SubLObject)module0191.UNPROVIDED);
        }
    }
    
    public static SubLObject f11964(final SubLObject var49) {
        return Sort.sort(var49, Symbols.symbol_function((SubLObject)module0191.$ic45$), (SubLObject)module0191.UNPROVIDED);
    }
    
    public static SubLObject f11965(final SubLObject var28) {
        assert module0191.NIL != f11950(var28) : var28;
        if (module0191.NIL != module0174.f11035(var28)) {
            return module0191.$g2251$.getGlobalValue();
        }
        if (module0191.NIL != module0179.f11424(var28)) {
            return module0183.f11559(var28);
        }
        return f11966(var28);
    }
    
    public static SubLObject f11967(final SubLObject var28) {
        assert module0191.NIL != f11950(var28) : var28;
        if (module0191.NIL != module0174.f11035(var28)) {
            return module0178.f11303(var28);
        }
        if (module0191.NIL != module0179.f11424(var28)) {
            return module0183.f11560(var28);
        }
        return f11961(var28);
    }
    
    public static SubLObject f11968(final SubLObject var28) {
        return module0205.f13136(f11967(var28));
    }
    
    public static SubLObject f11969(final SubLObject var28) {
        return f11967(var28);
    }
    
    public static SubLObject f11970(final SubLObject var28) {
        if (module0191.NIL != module0174.f11035(var28)) {
            return module0289.f19396(var28);
        }
        if (module0191.NIL != module0179.f11424(var28)) {
            return module0183.f11563(var28);
        }
        return module0205.f13144(f11961(var28));
    }
    
    public static SubLObject f11971(final SubLObject var28) {
        if (module0191.NIL != module0174.f11035(var28)) {
            return module0178.f11305(var28);
        }
        if (module0191.NIL != module0179.f11424(var28)) {
            return module0183.f11564(var28);
        }
        return module0202.f12782(f11972(var28), f11961(var28));
    }
    
    public static SubLObject f11973(final SubLObject var28) {
        if (module0191.NIL != module0174.f11035(var28)) {
            return module0289.f19402(var28);
        }
        if (module0191.NIL != module0179.f11424(var28)) {
            return module0183.f11565(var28);
        }
        return module0202.f12782(f11974(var28), f11970(var28));
    }
    
    public static SubLObject f11975(final SubLObject var28) {
        if (module0191.NIL != module0174.f11035(var28)) {
            return module0178.f11289(var28);
        }
        if (module0191.NIL != module0179.f11424(var28)) {
            return module0183.f11567(var28);
        }
        return module0202.f12762(f11961(var28));
    }
    
    public static SubLObject f11976(final SubLObject var28) {
        assert module0191.NIL != f11950(var28) : var28;
        if (module0191.NIL != module0174.f11035(var28)) {
            return module0178.f11287(var28);
        }
        if (module0191.NIL != module0179.f11424(var28)) {
            return module0183.f11561(var28);
        }
        return f11972(var28);
    }
    
    public static SubLObject f11974(final SubLObject var28) {
        if (module0191.NIL != module0174.f11035(var28)) {
            return module0289.f19401(var28);
        }
        if (module0191.NIL != module0179.f11424(var28)) {
            return module0183.f11566(var28);
        }
        return module0205.f13144(f11972(var28));
    }
    
    public static SubLObject f11977(final SubLObject var28) {
        if (module0191.NIL != module0174.f11035(var28)) {
            return (SubLObject)ConsesLow.list(var28);
        }
        if (module0191.NIL != module0179.f11424(var28)) {
            return module0183.f11558(var28);
        }
        return module0333.f22434(var28);
    }
    
    public static SubLObject f11978(final SubLObject var28) {
        assert module0191.NIL != f11950(var28) : var28;
        return module0130.f8524(f11979(var28));
    }
    
    public static SubLObject f11980(final SubLObject var28) {
        assert module0191.NIL != f11950(var28) : var28;
        return module0130.f8523(f11979(var28));
    }
    
    public static SubLObject f11979(final SubLObject var28) {
        if (module0191.NIL != module0174.f11035(var28)) {
            return module0178.f11302(var28);
        }
        if (module0191.NIL != module0179.f11424(var28)) {
            return module0183.f11562(var28);
        }
        return f11981(var28);
    }
    
    public static SubLObject f11982(final SubLObject var28) {
        if (module0191.NIL != module0174.f11035(var28)) {
            return f11983(var28);
        }
        if (module0191.NIL != module0179.f11424(var28)) {
            return module0183.f11557(var28);
        }
        return var28;
    }
    
    public static SubLObject f11984(final SubLObject var28, final SubLObject var50) {
        return f11985(f11982(var28), var50);
    }
    
    public static SubLObject f11986(final SubLObject var49, SubLObject var51) {
        if (var51 == module0191.UNPROVIDED) {
            var51 = (SubLObject)module0191.T;
        }
        SubLObject var52 = (SubLObject)module0191.NIL;
        SubLObject var53 = var49;
        SubLObject var54 = (SubLObject)module0191.NIL;
        var54 = var53.first();
        while (module0191.NIL != var53) {
            var52 = (SubLObject)ConsesLow.cons(f11987(var54, var51), var52);
            var53 = var53.rest();
            var54 = var53.first();
        }
        return Sort.sort(var52, (SubLObject)module0191.$ic45$, (SubLObject)module0191.UNPROVIDED);
    }
    
    public static SubLObject f11987(final SubLObject var28, SubLObject var53) {
        if (var53 == module0191.UNPROVIDED) {
            var53 = (SubLObject)module0191.T;
        }
        if (module0191.NIL != module0174.f11035(var28)) {
            return var28;
        }
        if (module0191.NIL != module0179.f11424(var28)) {
            return var28;
        }
        return f11988(var28, var53);
    }
    
    public static SubLObject f11988(final SubLObject var39, SubLObject var53) {
        if (var53 == module0191.UNPROVIDED) {
            var53 = (SubLObject)module0191.T;
        }
        SubLObject var54 = f11989(var39);
        if (module0191.NIL == var54) {
            if (module0191.NIL != var53) {
                var54 = module0183.f11555(var39);
            }
            else {
                var54 = module0183.f11552(var39);
            }
        }
        return (module0191.NIL != var54) ? var54 : var39;
    }
    
    public static SubLObject f11952(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var16.isList() && module0191.NIL != module0035.f2014(var16) && module0191.NIL != module0035.f1995(var16, (SubLObject)module0191.FOUR_INTEGER, (SubLObject)module0191.UNPROVIDED) && module0191.NIL != module0333.f22421(var16.first()));
    }
    
    public static SubLObject f11990(final SubLObject var55, final SubLObject var56, SubLObject var57, SubLObject var33) {
        if (var57 == module0191.UNPROVIDED) {
            var57 = module0147.$g2095$.getDynamicValue();
        }
        if (var33 == module0191.UNPROVIDED) {
            var33 = (SubLObject)module0191.$ic66$;
        }
        assert module0191.NIL != module0333.f22421(var55) : var55;
        assert module0191.NIL != module0202.f12661(var56) : var56;
        assert module0191.NIL != module0161.f10481(var57) : var57;
        assert module0191.NIL != module0130.f8520(var33) : var33;
        return (SubLObject)ConsesLow.list(var55, var56, var57, var33);
    }
    
    public static SubLObject f11983(final SubLObject var6) {
        assert module0191.NIL != module0174.f11035(var6) : var6;
        final SubLObject var7 = f11965(var6);
        final SubLObject var8 = f11969(var6);
        final SubLObject var9 = f11976(var6);
        final SubLObject var10 = f11979(var6);
        return f11990(var7, var8, var9, var10);
    }
    
    public static SubLObject f11989(final SubLObject var39) {
        SubLObject var40 = (SubLObject)module0191.NIL;
        if (f11966(var39).eql(module0191.$g2251$.getGlobalValue())) {
            var40 = module0288.f19338(f11961(var39), f11972(var39));
        }
        return var40;
    }
    
    public static SubLObject f11956(final SubLObject var39) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0191.NIL != f11952(var39) && module0191.NIL != module0333.f22421(f11966(var39)) && module0191.NIL != module0202.f12660(f11961(var39)) && module0191.NIL == module0205.f13145((SubLObject)module0191.$ic76$, f11961(var39), (SubLObject)module0191.UNPROVIDED, (SubLObject)module0191.UNPROVIDED) && module0191.NIL == module0205.f13145((SubLObject)module0191.$ic76$, f11972(var39), (SubLObject)module0191.UNPROVIDED, (SubLObject)module0191.UNPROVIDED) && module0191.NIL != module0161.f10483(f11972(var39)) && module0191.NIL != module0130.f8520(f11981(var39)));
    }
    
    public static SubLObject f11991(final SubLObject var16, final SubLObject var59) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0191.NIL != f11952(var16) && var59.eql(f11966(var16)));
    }
    
    public static SubLObject f11966(final SubLObject var39) {
        assert module0191.NIL != f11952(var39) : var39;
        return var39.first();
    }
    
    public static SubLObject f11961(final SubLObject var39) {
        assert module0191.NIL != f11952(var39) : var39;
        return conses_high.second(var39);
    }
    
    public static SubLObject f11972(final SubLObject var39) {
        assert module0191.NIL != f11952(var39) : var39;
        return conses_high.third(var39);
    }
    
    public static SubLObject f11981(final SubLObject var39) {
        assert module0191.NIL != f11952(var39) : var39;
        return conses_high.fourth(var39);
    }
    
    public static SubLObject f11992(final SubLObject var39) {
        return Equality.eq(f11966(var39), (SubLObject)module0191.$ic77$);
    }
    
    public static SubLObject f11985(final SubLObject var39, final SubLObject var50) {
        SubLObject var51 = (SubLObject)module0191.NIL;
        SubLObject var52 = (SubLObject)module0191.NIL;
        SubLObject var53 = (SubLObject)module0191.NIL;
        SubLObject var54 = (SubLObject)module0191.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var39, var39, (SubLObject)module0191.$ic78$);
        var51 = var39.first();
        SubLObject var55 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var55, var39, (SubLObject)module0191.$ic78$);
        var52 = var55.first();
        var55 = var55.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var55, var39, (SubLObject)module0191.$ic78$);
        var53 = var55.first();
        var55 = var55.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var55, var39, (SubLObject)module0191.$ic78$);
        var54 = var55.first();
        var55 = var55.rest();
        if (module0191.NIL == var55) {
            return f11990(var51, var52, var50, var54);
        }
        cdestructuring_bind.cdestructuring_bind_error(var39, (SubLObject)module0191.$ic78$);
        return (SubLObject)module0191.NIL;
    }
    
    public static SubLObject f11993(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0191.NIL != module0035.f2015(var16) && module0191.NIL != module0035.f2370(Symbols.symbol_function((SubLObject)module0191.$ic41$), var16, (SubLObject)module0191.UNPROVIDED));
    }
    
    public static SubLObject f11994(final SubLObject var16) {
        return module0035.f2192((SubLObject)module0191.$ic79$, var16);
    }
    
    public static SubLObject f11995(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0191.NIL != module0035.f2014(var16) && module0191.NIL != module0035.f2370(Symbols.symbol_function((SubLObject)module0191.$ic41$), var16, (SubLObject)module0191.UNPROVIDED));
    }
    
    public static SubLObject f11996(final SubLObject var16) {
        return Types.sublisp_null(var16);
    }
    
    public static SubLObject f11997(final SubLObject var62, final SubLObject var63) {
        return module0035.f2200(var62, var63, (SubLObject)module0191.$ic80$);
    }
    
    public static SubLObject f11998(final SubLObject var64) {
        assert module0191.NIL != f11993(var64) : var64;
        return Sort.sort(conses_high.copy_list(var64), Symbols.symbol_function((SubLObject)module0191.$ic45$), (SubLObject)module0191.UNPROVIDED);
    }
    
    public static SubLObject f11999(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0191.NIL != module0035.f2015(var16) && module0191.NIL != module0035.f2370(Symbols.symbol_function((SubLObject)module0191.$ic64$), var16, (SubLObject)module0191.UNPROVIDED));
    }
    
    public static SubLObject f12000(final SubLObject var64) {
        assert module0191.NIL != f11993(var64) : var64;
        SubLObject var65 = (SubLObject)module0191.NIL;
        SubLObject var66 = var64;
        SubLObject var67 = (SubLObject)module0191.NIL;
        var67 = var66.first();
        while (module0191.NIL != var66) {
            if (module0191.NIL != module0174.f11035(var67)) {
                var67 = f11983(var67);
            }
            var65 = (SubLObject)ConsesLow.cons(var67, var65);
            var66 = var66.rest();
            var67 = var66.first();
        }
        return Sequences.nreverse(var65);
    }
    
    public static SubLObject f12001() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0191", "f11907", "S#14714");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0191", "f11908", "S#14715");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0191", "f11909", "S#14716");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11910", "ARGUMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11912", "S#14090", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11913", "S#14717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11915", "S#14094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11917", "S#14718", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11918", "S#14719", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11919", "S#14720", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11920", "S#14709", 1, 0, false);
        new $f11920$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11921", "S#14721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11922", "ARGUMENT-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11924", "ARGUMENT-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11926", "S#14722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11928", "ARGUMENT-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11930", "S#14723", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11911", "BELIEF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11914", "S#14724", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11916", "S#14725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11931", "S#14726", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11923", "S#14727", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11925", "S#14728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11929", "S#14729", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11927", "S#14730", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11932", "ASSERTED-ARGUMENT-P", 1, 0, false);
        new $f11932$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11933", "S#14731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11934", "S#14732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11941", "S#13893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11940", "S#14733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11943", "S#14734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11944", "S#13898", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11945", "S#14735", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11939", "S#14736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11942", "S#14737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11946", "S#14738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11947", "S#14739", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11935", "S#14740", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11938", "S#14741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11937", "S#13891", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11936", "S#13890", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11948", "S#14742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11949", "S#14743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11950", "SUPPORT-P", 1, 0, false);
        new $f11950$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11951", "S#14744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11953", "S#14745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11954", "S#14746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11955", "S#14361", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11957", "S#14747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11960", "S#14748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11959", "S#14749", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11958", "S#14750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11962", "S#14596", 2, 0, false);
        new $f11962$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11963", "S#14710", 2, 0, false);
        new $f11963$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11964", "S#14751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11965", "SUPPORT-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11967", "SUPPORT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11968", "S#14752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11969", "S#11997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11970", "S#14753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11971", "S#14754", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11973", "S#14755", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11975", "S#14756", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11976", "SUPPORT-MT", 1, 0, false);
        new $f11976$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11974", "S#14757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11977", "S#14758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11978", "SUPPORT-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11980", "SUPPORT-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11979", "S#14759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11982", "S#14760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11984", "S#14761", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11986", "S#14304", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11987", "S#14762", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11988", "S#14763", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11952", "HL-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11990", "MAKE-HL-SUPPORT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11983", "S#14764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11989", "S#14765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11956", "S#14357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11991", "S#14766", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11966", "S#14351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11961", "S#14352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11972", "S#14353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11981", "S#14354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11992", "S#14767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11985", "S#14768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11993", "S#14254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11994", "S#14769", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11995", "S#14350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11996", "S#14770", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11997", "S#14713", 2, 0, false);
        new $f11997$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11998", "S#14771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f11999", "S#14772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0191", "f12000", "S#14773", 1, 0, false);
        return (SubLObject)module0191.NIL;
    }
    
    public static SubLObject f12002() {
        module0191.$g2247$ = SubLFiles.deflexical("S#14774", (SubLObject)module0191.$ic18$);
        module0191.$g2248$ = SubLFiles.deflexical("S#14775", (SubLObject)module0191.$ic19$);
        module0191.$g2249$ = SubLFiles.deflexical("S#14776", (SubLObject)module0191.$ic36$);
        module0191.$g2250$ = SubLFiles.deflexical("S#14777", Mapping.mapcar(Symbols.symbol_function((SubLObject)module0191.$ic37$), module0191.$g2249$.getGlobalValue()));
        module0191.$g2251$ = SubLFiles.deflexical("S#14778", (SubLObject)module0191.$ic46$);
        return (SubLObject)module0191.NIL;
    }
    
    public static SubLObject f12003() {
        module0012.f368((SubLObject)module0191.$ic13$, (SubLObject)module0191.$ic14$, (SubLObject)module0191.$ic15$, (SubLObject)module0191.NIL, (SubLObject)module0191.$ic16$);
        module0012.f368((SubLObject)module0191.$ic21$, (SubLObject)module0191.$ic22$, (SubLObject)module0191.$ic23$, (SubLObject)module0191.NIL, (SubLObject)module0191.$ic16$);
        module0012.f368((SubLObject)module0191.$ic24$, (SubLObject)module0191.$ic25$, (SubLObject)module0191.$ic26$, (SubLObject)module0191.$ic27$, (SubLObject)module0191.$ic28$);
        module0012.f368((SubLObject)module0191.$ic29$, (SubLObject)module0191.$ic25$, (SubLObject)module0191.$ic30$, (SubLObject)module0191.$ic27$, (SubLObject)module0191.$ic31$);
        module0012.f368((SubLObject)module0191.$ic12$, (SubLObject)module0191.$ic14$, (SubLObject)module0191.$ic33$, (SubLObject)module0191.NIL, (SubLObject)module0191.$ic16$);
        module0012.f368((SubLObject)module0191.$ic41$, (SubLObject)module0191.$ic14$, (SubLObject)module0191.$ic42$, (SubLObject)module0191.NIL, (SubLObject)module0191.$ic16$);
        module0012.f368((SubLObject)module0191.$ic47$, (SubLObject)module0191.$ic48$, (SubLObject)module0191.$ic49$, (SubLObject)module0191.$ic50$, (SubLObject)module0191.$ic51$);
        module0012.f368((SubLObject)module0191.$ic52$, (SubLObject)module0191.$ic48$, (SubLObject)module0191.$ic53$, (SubLObject)module0191.$ic50$, (SubLObject)module0191.$ic54$);
        module0002.f35((SubLObject)module0191.$ic55$, (SubLObject)module0191.$ic56$);
        module0012.f368((SubLObject)module0191.$ic57$, (SubLObject)module0191.$ic48$, (SubLObject)module0191.$ic58$, (SubLObject)module0191.$ic50$, (SubLObject)module0191.$ic59$);
        module0012.f368((SubLObject)module0191.$ic60$, (SubLObject)module0191.$ic48$, (SubLObject)module0191.$ic61$, (SubLObject)module0191.$ic50$, (SubLObject)module0191.$ic28$);
        module0012.f368((SubLObject)module0191.$ic62$, (SubLObject)module0191.$ic48$, (SubLObject)module0191.$ic63$, (SubLObject)module0191.$ic50$, (SubLObject)module0191.$ic31$);
        module0012.f368((SubLObject)module0191.$ic64$, (SubLObject)module0191.$ic14$, (SubLObject)module0191.$ic65$, (SubLObject)module0191.NIL, (SubLObject)module0191.$ic16$);
        module0012.f368((SubLObject)module0191.$ic70$, (SubLObject)module0191.$ic71$, (SubLObject)module0191.$ic72$, (SubLObject)module0191.$ic73$, (SubLObject)module0191.$ic74$);
        return (SubLObject)module0191.NIL;
    }
    
    public void declareFunctions() {
        f12001();
    }
    
    public void initializeVariables() {
        f12002();
    }
    
    public void runTopLevelForms() {
        f12003();
    }
    
    static {
        me = (SubLFile)new module0191();
        module0191.$g2247$ = null;
        module0191.$g2248$ = null;
        module0191.$g2249$ = null;
        module0191.$g2250$ = null;
        module0191.$g2251$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9952", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc arguments"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeString("mapping Cyc arguments");
        $ic2$ = SubLObjectFactory.makeSymbol("DO-ASSERTIONS");
        $ic3$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic4$ = SubLObjectFactory.makeSymbol("ASSERTION-ARGUMENTS");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9952", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc belief arguments"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic6$ = SubLObjectFactory.makeString("mapping Cyc belief arguments");
        $ic7$ = SubLObjectFactory.makeSymbol("S#14714", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic9$ = SubLObjectFactory.makeSymbol("BELIEF-P");
        $ic10$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9952", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc asserted arguments"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic11$ = SubLObjectFactory.makeString("mapping Cyc asserted arguments");
        $ic12$ = SubLObjectFactory.makeSymbol("ASSERTED-ARGUMENT-P");
        $ic13$ = SubLObjectFactory.makeSymbol("ARGUMENT-P");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"));
        $ic15$ = SubLObjectFactory.makeString("Return T iff OBJECT is an HL argument structure.");
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic17$ = SubLObjectFactory.makeString("unexpected argument type");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARGUMENT"), (SubLObject)SubLObjectFactory.makeKeyword("BELIEF"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-ARGUMENT"), (SubLObject)SubLObjectFactory.makeKeyword("DEDUCTION"));
        $ic19$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARGUMENT"), (SubLObject)module0191.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BELIEF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARGUMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-ARGUMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BELIEF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEDUCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARGUMENT"))));
        $ic20$ = SubLObjectFactory.makeSymbol("S#14709", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("ARGUMENT-EQUAL");
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14779", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14780", "CYC"));
        $ic23$ = SubLObjectFactory.makeString("Return T iff ARGUMENT1 and ARGUMENT2 are equivalent arguments.");
        $ic24$ = SubLObjectFactory.makeSymbol("ARGUMENT-TRUTH");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9952", "CYC"));
        $ic26$ = SubLObjectFactory.makeString("Return the truth of ARGUMENT.");
        $ic27$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9952", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT-P")));
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P"));
        $ic29$ = SubLObjectFactory.makeSymbol("ARGUMENT-STRENGTH");
        $ic30$ = SubLObjectFactory.makeString("Return the strength of ARGUMENT.");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-STRENGTH-P"));
        $ic32$ = SubLObjectFactory.makeString("unexpected belief type");
        $ic33$ = SubLObjectFactory.makeString("Return T iff OBJECT is an HL asserted argument structure.");
        $ic34$ = SubLObjectFactory.makeKeyword("ASSERTED-ARGUMENT");
        $ic35$ = SubLObjectFactory.makeSymbol("S#10605", "CYC");
        $ic36$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-TRUE-MON"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-MON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-TRUE-DEF"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-UNKNOWN"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-FALSE-DEF"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE-DEF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-FALSE-MON"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE-MON")));
        $ic37$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic38$ = SubLObjectFactory.makeSymbol("S#10615", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCAL"));
        $ic41$ = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $ic42$ = SubLObjectFactory.makeString("Return T iff OBJECT can be a support in an argument.");
        $ic43$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic44$ = SubLObjectFactory.makeKeyword("SYNTACTICALLY-ILL-FORMED");
        $ic45$ = SubLObjectFactory.makeSymbol("S#14710", "CYC");
        $ic46$ = SubLObjectFactory.makeKeyword("ASSERTION");
        $ic47$ = SubLObjectFactory.makeSymbol("SUPPORT-MODULE");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14595", "CYC"));
        $ic49$ = SubLObjectFactory.makeString("Return the module of SUPPORT.");
        $ic50$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14595", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-P")));
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-SUPPORT-MODULE-P"));
        $ic52$ = SubLObjectFactory.makeSymbol("SUPPORT-SENTENCE");
        $ic53$ = SubLObjectFactory.makeString("Return the sentence of SUPPORT.");
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSP"));
        $ic55$ = SubLObjectFactory.makeSymbol("S#11997", "CYC");
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-SENTENCE"));
        $ic57$ = SubLObjectFactory.makeSymbol("SUPPORT-MT");
        $ic58$ = SubLObjectFactory.makeString("Return the microtheory of SUPPORT.");
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC"));
        $ic60$ = SubLObjectFactory.makeSymbol("SUPPORT-TRUTH");
        $ic61$ = SubLObjectFactory.makeString("Return the truth of SUPPORT.");
        $ic62$ = SubLObjectFactory.makeSymbol("SUPPORT-STRENGTH");
        $ic63$ = SubLObjectFactory.makeString("Return the strength of SUPPORT.");
        $ic64$ = SubLObjectFactory.makeSymbol("HL-SUPPORT-P");
        $ic65$ = SubLObjectFactory.makeString("Does OBJECT represent an HL support?");
        $ic66$ = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $ic67$ = SubLObjectFactory.makeSymbol("HL-SUPPORT-MODULE-P");
        $ic68$ = SubLObjectFactory.makeSymbol("S#14712", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("MAKE-HL-SUPPORT");
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("*MT*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF")));
        $ic72$ = SubLObjectFactory.makeString("Construct a new HL support.");
        $ic73$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("HL-SUPPORT-MODULE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14712", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10615", "CYC")));
        $ic74$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-SUPPORT-P"));
        $ic75$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic76$ = SubLObjectFactory.makeSymbol("S#14187", "CYC");
        $ic77$ = SubLObjectFactory.makeKeyword("GENLPREDS");
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic79$ = SubLObjectFactory.makeSymbol("S#14254", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("S#14596", "CYC");
    }
    
    public static final class $f11920$UnaryFunction extends UnaryFunction
    {
        public $f11920$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14709"));
        }
        
        public SubLObject processItem(final SubLObject var23) {
            return module0191.f11920(var23);
        }
    }
    
    public static final class $f11932$UnaryFunction extends UnaryFunction
    {
        public $f11932$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ASSERTED-ARGUMENT-P"));
        }
        
        public SubLObject processItem(final SubLObject var23) {
            return module0191.f11932(var23);
        }
    }
    
    public static final class $f11950$UnaryFunction extends UnaryFunction
    {
        public $f11950$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SUPPORT-P"));
        }
        
        public SubLObject processItem(final SubLObject var23) {
            return module0191.f11950(var23);
        }
    }
    
    public static final class $f11962$BinaryFunction extends BinaryFunction
    {
        public $f11962$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14596"));
        }
        
        public SubLObject processItem(final SubLObject var23, final SubLObject var48) {
            return module0191.f11962(var23, var48);
        }
    }
    
    public static final class $f11963$BinaryFunction extends BinaryFunction
    {
        public $f11963$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14710"));
        }
        
        public SubLObject processItem(final SubLObject var23, final SubLObject var48) {
            return module0191.f11963(var23, var48);
        }
    }
    
    public static final class $f11976$UnaryFunction extends UnaryFunction
    {
        public $f11976$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SUPPORT-MT"));
        }
        
        public SubLObject processItem(final SubLObject var23) {
            return module0191.f11976(var23);
        }
    }
    
    public static final class $f11997$BinaryFunction extends BinaryFunction
    {
        public $f11997$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14713"));
        }
        
        public SubLObject processItem(final SubLObject var23, final SubLObject var48) {
            return module0191.f11997(var23, var48);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0191.class
	Total time: 320 ms
	
	Decompiled with Procyon 0.5.32.
*/
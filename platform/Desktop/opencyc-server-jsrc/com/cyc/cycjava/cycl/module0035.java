package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0035 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0035";
    public static final String myFingerPrint = "5daa1c1f9e6773a638ce36ae891c0eaa501de3bbf75e4eaa1e7d06f5328066b7";
    public static SubLSymbol $g892$;
    public static SubLSymbol $g893$;
    private static SubLSymbol $g894$;
    private static SubLSymbol $g895$;
    private static SubLSymbol $g896$;
    private static SubLSymbol $g897$;
    private static SubLSymbol $g898$;
    private static SubLSymbol $g899$;
    private static SubLSymbol $g900$;
    private static SubLSymbol $g901$;
    private static SubLSymbol $g902$;
    private static SubLSymbol $g903$;
    private static SubLSymbol $g904$;
    private static SubLSymbol $g905$;
    public static SubLSymbol $g906$;
    private static SubLSymbol $g907$;
    private static SubLSymbol $g908$;
    private static SubLSymbol $g909$;
    private static final SubLInteger $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLList $ic50$;
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
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLFloat $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLInteger $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLList $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLInteger $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLList $ic136$;
    private static final SubLList $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLList $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLList $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLList $ic143$;
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLList $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLList $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLString $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLString $ic165$;
    private static final SubLList $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLFloat $ic168$;
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
    private static final SubLList $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLList $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLList $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLString $ic190$;
    private static final SubLString $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLList $ic197$;
    
    public static SubLObject sublisp_boolean(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != var1);
    }
    
    public static SubLObject f1963(final SubLObject var1) {
        return Types.sublisp_null(var1);
    }
    
    public static SubLObject f1964(final SubLObject var2, final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!var2.eql(var3));
    }
    
    public static SubLObject f1965(final SubLObject var2, final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!var2.eql(var3));
    }
    
    public static SubLObject f1966(final SubLObject var2, final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!var2.equal(var3));
    }
    
    public static SubLObject f1967(final SubLObject var2, final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!var2.equalp(var3));
    }
    
    public static SubLObject f1968(final SubLObject var4, final SubLObject var5, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == conses_high.assoc(var4, var5, var6, var7));
    }
    
    public static SubLObject f1969(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!var1.isCons());
    }
    
    public static SubLObject f1970(final SubLObject var2, final SubLObject var3) {
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f1971(final SubLObject var2, final SubLObject var3) {
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f1972() {
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject caadr(final SubLObject var8) {
        return conses_high.cadr(var8).first();
    }
    
    public static SubLObject caddr(final SubLObject var9) {
        return conses_high.cddr(var9).first();
    }
    
    public static SubLObject cdddr(final SubLObject var9) {
        return conses_high.cddr(var9).rest();
    }
    
    public static SubLObject cadddr(final SubLObject var9) {
        return cdddr(var9).first();
    }
    
    public static SubLObject cadadr(final SubLObject var9) {
        return conses_high.cadr(conses_high.cadr(var9));
    }
    
    public static SubLObject cadar(final SubLObject var9) {
        return conses_high.cdar(var9).first();
    }
    
    public static SubLObject cdadr(final SubLObject var8) {
        return conses_high.cadr(var8).rest();
    }
    
    public static SubLObject f1973(final SubLObject var11, final SubLObject var12) {
        return ConsesLow.append(var12, (SubLObject)ConsesLow.list(var11));
    }
    
    public static SubLObject f1974(final SubLObject var8) {
        if (var8.isCons()) {
            return ConsesLow.append(var8.rest(), (SubLObject)ConsesLow.list(var8.first()));
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f1975(final SubLObject var8) {
        if (var8.isCons()) {
            return ConsesLow.append(conses_high.last(var8, (SubLObject)module0035.UNPROVIDED), conses_high.butlast(var8, (SubLObject)module0035.UNPROVIDED));
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f1976(final SubLObject var13, final SubLObject var14, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != conses_high.subsetp(var13, var14, var6, var7) && module0035.NIL == conses_high.subsetp(var14, var13, var6, var7));
    }
    
    public static SubLObject f1977(final SubLObject var13, final SubLObject var14, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != conses_high.subsetp(var13, var14, var6, var7) && !var13.equal(var14));
    }
    
    public static SubLObject f1978(final SubLObject var15, SubLObject var8, SubLObject var16, SubLObject var17) {
        if (var16 == module0035.UNPROVIDED) {
            var16 = (SubLObject)module0035.NIL;
        }
        if (var17 == module0035.UNPROVIDED) {
            var17 = (SubLObject)module0035.ZERO_INTEGER;
        }
        final SubLObject var18 = Sequences.length(var8);
        if (module0035.ZERO_INTEGER.numE(var18)) {
            return (SubLObject)module0035.NIL;
        }
        if (module0035.NIL == var16) {
            var16 = var18;
        }
        if (var16.numL((SubLObject)module0035.ZERO_INTEGER)) {
            Errors.error((SubLObject)module0035.$ic1$);
        }
        else if (var16.numG(var18)) {
            Errors.error((SubLObject)module0035.$ic2$);
        }
        else if (var17.numL((SubLObject)module0035.ZERO_INTEGER) && var16.numG(Numbers.abs(var17))) {
            Errors.error((SubLObject)module0035.$ic3$);
        }
        else if (var17.numG((SubLObject)module0035.ZERO_INTEGER) && var16.numG(Numbers.subtract(var18, var17))) {
            Errors.error((SubLObject)module0035.$ic3$);
        }
        if (!module0035.ZERO_INTEGER.numE(var17)) {
            if (module0035.ZERO_INTEGER.numL(var17)) {
                var8 = conses_high.nthcdr(var17, var8);
            }
            else {
                var8 = conses_high.nthcdr(Numbers.add(var18, var17), var8);
            }
        }
        return ConsesLow.nth(Numbers.mod(var15, var16), var8);
    }
    
    public static SubLObject f1979(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        SubLObject var23 = (SubLObject)module0035.NIL;
        SubLObject var24 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic4$);
        var23 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic4$);
        var24 = var22.first();
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            return (SubLObject)ConsesLow.list((SubLObject)module0035.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic6$, var23, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic7$, var24)), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic8$, var24));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic4$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f1980(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic9$);
        final SubLObject var23 = var22.rest();
        var22 = var22.first();
        SubLObject var24 = (SubLObject)module0035.NIL;
        SubLObject var25 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic9$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic9$);
        var25 = var22.first();
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            final SubLObject var26;
            var22 = (var26 = var23);
            return (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic10$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic7$, var25))), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic8$, var25), ConsesLow.append(var26, (SubLObject)module0035.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic9$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f1981(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        SubLObject var23 = (SubLObject)module0035.NIL;
        SubLObject var24 = (SubLObject)module0035.NIL;
        SubLObject var25 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic11$);
        var23 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic11$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic11$);
        var25 = var22.first();
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            return (SubLObject)ConsesLow.list((SubLObject)module0035.$ic12$, var24, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic13$, var23, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic14$, (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic15$, var25, (SubLObject)module0035.$ic16$), var24)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic11$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f1982(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic17$);
        final SubLObject var23 = var22.rest();
        final SubLObject var24;
        var22 = (var24 = var22.first());
        final SubLObject var25;
        var22 = (var25 = var23);
        SubLObject var26 = (SubLObject)module0035.NIL;
        SubLObject var27 = (SubLObject)module0035.NIL;
        SubLObject var28 = var24;
        SubLObject var29 = (SubLObject)module0035.NIL;
        var29 = var28.first();
        while (module0035.NIL != var28) {
            SubLObject var42_43;
            final SubLObject var40_41 = var42_43 = var29;
            SubLObject var30 = (SubLObject)module0035.NIL;
            SubLObject var31 = (SubLObject)module0035.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var42_43, var40_41, (SubLObject)module0035.$ic18$);
            var30 = var42_43.first();
            var42_43 = var42_43.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var42_43, var40_41, (SubLObject)module0035.$ic18$);
            var31 = var42_43.first();
            var42_43 = var42_43.rest();
            if (module0035.NIL == var42_43) {
                final SubLObject var32 = Symbols.make_symbol(Symbols.symbol_name(var30));
                var26 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var32, var31, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic19$, var32)), var26);
                var26 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var30, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic20$, var32), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic20$, var32)), var26);
                var27 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0035.$ic21$, var32), var27);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var40_41, (SubLObject)module0035.$ic18$);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic22$, Sequences.nreverse(var26), (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)module0035.$ic23$, var27)), ConsesLow.append(var25, (SubLObject)module0035.NIL));
    }
    
    public static SubLObject f1983(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic24$);
        final SubLObject var23 = var22.rest();
        var22 = var22.first();
        SubLObject var24 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic24$);
        var24 = var22.first();
        final SubLObject var25;
        var22 = (var25 = var22.rest());
        final SubLObject var26;
        var22 = (var26 = var23);
        return (SubLObject)ConsesLow.list((SubLObject)module0035.$ic10$, (SubLObject)ConsesLow.list(reader.bq_cons(var24, (SubLObject)module0035.$ic25$)), (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic26$, var25, ConsesLow.append(var26, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0035.$ic27$, var24)))));
    }
    
    public static SubLObject f1984(final SubLObject var19, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var23;
        final SubLObject var22 = var23 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0035.$ic28$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0035.$ic28$);
        var25 = var23.first();
        final SubLObject var26;
        var23 = (var26 = var23.rest());
        final SubLObject var27;
        var23 = (var27 = var24);
        if (module0035.NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && !var25.isSymbol()) {
            Errors.error((SubLObject)module0035.$ic29$, var25);
        }
        SubLObject var28 = (SubLObject)module0035.NIL;
        SubLObject var29 = (SubLObject)module0035.NIL;
        SubLObject var30 = var26;
        SubLObject var31 = (SubLObject)module0035.NIL;
        var31 = var30.first();
        while (module0035.NIL != var30) {
            SubLObject var57_58;
            final SubLObject var55_56 = var57_58 = var31;
            SubLObject var32 = (SubLObject)module0035.NIL;
            SubLObject var33 = (SubLObject)module0035.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var57_58, var55_56, (SubLObject)module0035.$ic18$);
            var32 = var57_58.first();
            var57_58 = var57_58.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var57_58, var55_56, (SubLObject)module0035.$ic18$);
            var33 = var57_58.first();
            var57_58 = var57_58.rest();
            if (module0035.NIL == var57_58) {
                final SubLObject var34 = Symbols.make_symbol(Symbols.symbol_name(var32));
                var28 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var34, var33, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic19$, var34)), var28);
                var28 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var32, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic20$, var34), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic20$, var34)), var28);
                var29 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0035.$ic21$, var34), var29);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var55_56, (SubLObject)module0035.$ic18$);
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0035.$ic30$, var25, (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic22$, Sequences.nreverse(var28), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0035.$ic31$, var25, reader.bq_cons((SubLObject)module0035.$ic23$, var29))), ConsesLow.append(var27, (SubLObject)module0035.NIL)));
    }
    
    public static SubLObject f1985(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic32$);
        final SubLObject var23 = var22.rest();
        var22 = var22.first();
        SubLObject var24 = (SubLObject)module0035.NIL;
        SubLObject var25 = (SubLObject)module0035.NIL;
        SubLObject var26 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic32$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic32$);
        var25 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic32$);
        var26 = var22.first();
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            final SubLObject var27;
            var22 = (var27 = var23);
            final SubLObject var28 = (SubLObject)module0035.$ic33$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var28, var26, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic19$, var28)), (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic20$, var28), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic20$, var28)), (SubLObject)ConsesLow.list(var25, (SubLObject)module0035.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic34$, (SubLObject)module0035.ONE_INTEGER, var25))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0035.$ic21$, var28)), ConsesLow.append(var27, (SubLObject)module0035.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic32$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f1986(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic35$);
        final SubLObject var23 = var22.rest();
        var22 = var22.first();
        SubLObject var24 = (SubLObject)module0035.NIL;
        SubLObject var25 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic35$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic35$);
        var25 = var22.first();
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            final SubLObject var26;
            var22 = (var26 = var23);
            return (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic36$, (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic37$, var25)), ConsesLow.append(var26, (SubLObject)module0035.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic35$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f1987(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic32$);
        final SubLObject var23 = var22.rest();
        var22 = var22.first();
        SubLObject var24 = (SubLObject)module0035.NIL;
        SubLObject var25 = (SubLObject)module0035.NIL;
        SubLObject var26 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic32$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic32$);
        var25 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic32$);
        var26 = var22.first();
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            final SubLObject var27;
            var22 = (var27 = var23);
            final SubLObject var28 = (SubLObject)module0035.$ic38$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var28, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic37$, var26), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic19$, var28)), (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic20$, var28), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic20$, var28)), (SubLObject)ConsesLow.list(var25, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic39$, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic40$, var26)), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic39$, var25))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0035.$ic21$, var28)), ConsesLow.append(var27, (SubLObject)module0035.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic32$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f1988(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic41$);
        final SubLObject var23 = var22.rest();
        var22 = var22.first();
        SubLObject var24 = (SubLObject)module0035.NIL;
        SubLObject var25 = (SubLObject)module0035.NIL;
        SubLObject var26 = (SubLObject)module0035.NIL;
        SubLObject var27 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic41$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic41$);
        var25 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic41$);
        var26 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic41$);
        var27 = var22.first();
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            final SubLObject var28;
            var22 = (var28 = var23);
            final SubLObject var29 = (SubLObject)module0035.$ic42$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var29, var26, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic19$, var29)), (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic20$, var29), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic20$, var29)), (SubLObject)ConsesLow.list(var25, (SubLObject)module0035.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic34$, (SubLObject)module0035.ONE_INTEGER, var25))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0035.$ic31$, var27, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic21$, var29))), ConsesLow.append(var28, (SubLObject)module0035.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic41$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f1989(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic17$);
        final SubLObject var23 = var22.rest();
        final SubLObject var24;
        var22 = (var24 = var22.first());
        final SubLObject var25;
        var22 = (var25 = var23);
        return (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic43$, (SubLObject)ConsesLow.list(var24), ConsesLow.append(var25, (SubLObject)module0035.NIL));
    }
    
    public static SubLObject f1990(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic44$);
        final SubLObject var23 = var22.rest();
        var22 = var22.first();
        SubLObject var24 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic44$);
        var24 = var22.first();
        var22 = var22.rest();
        final SubLObject var25 = (SubLObject)(var22.isCons() ? var22.first() : module0035.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var22, var21, (SubLObject)module0035.$ic44$);
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            final SubLObject var26;
            var22 = (var26 = var23);
            SubLObject var27 = (SubLObject)module0035.NIL;
            SubLObject var28 = (SubLObject)module0035.NIL;
            final SubLObject var29 = Symbols.make_symbol((SubLObject)module0035.$ic45$);
            var27 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var29, (SubLObject)module0035.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic34$, (SubLObject)module0035.ONE_INTEGER, var29)), var27);
            SubLObject var30 = (SubLObject)module0035.NIL;
            SubLObject var31 = (SubLObject)module0035.NIL;
            SubLObject var32 = (SubLObject)module0035.NIL;
            var30 = var24;
            var31 = var30.first();
            for (var32 = (SubLObject)module0035.ZERO_INTEGER; module0035.NIL != var30; var30 = var30.rest(), var31 = var30.first(), var32 = Numbers.add((SubLObject)module0035.ONE_INTEGER, var32)) {
                SubLObject var85_86;
                final SubLObject var83_84 = var85_86 = var31;
                SubLObject var33 = (SubLObject)module0035.NIL;
                SubLObject var34 = (SubLObject)module0035.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)module0035.$ic18$);
                var33 = var85_86.first();
                var85_86 = var85_86.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)module0035.$ic18$);
                var34 = var85_86.first();
                var85_86 = var85_86.rest();
                if (module0035.NIL == var85_86) {
                    final SubLObject var35 = Symbols.make_symbol(Sequences.cconcatenate(Symbols.symbol_name(var33), (SubLObject)module0035.$ic46$));
                    final SubLObject var36 = Symbols.make_symbol(Sequences.cconcatenate(Symbols.symbol_name(var33), (SubLObject)module0035.$ic47$));
                    var27 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var35, var34, var35), var27);
                    var27 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var36, var35, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic19$, var36)), var27);
                    var27 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var33, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic20$, var35), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic48$, var29, var35)), var27);
                    if (module0035.NIL == module0004.f104(var32, var25, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
                        var28 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0035.$ic21$, var36), var28);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var83_84, (SubLObject)module0035.$ic18$);
                }
            }
            return (SubLObject)ConsesLow.list((SubLObject)module0035.$ic10$, (SubLObject)ConsesLow.list(reader.bq_cons(var29, (SubLObject)module0035.$ic25$)), (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic22$, Sequences.nreverse(var27), (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)module0035.$ic23$, var28)), ConsesLow.append(var26, (SubLObject)module0035.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic44$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f1991(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic49$);
        final SubLObject var23 = var22.rest();
        var22 = var22.first();
        SubLObject var24 = (SubLObject)module0035.NIL;
        SubLObject var25 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic49$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic49$);
        var25 = var22.first();
        var22 = var22.rest();
        SubLObject var26 = (SubLObject)module0035.NIL;
        SubLObject var27 = var22;
        SubLObject var28 = (SubLObject)module0035.NIL;
        SubLObject var97_98 = (SubLObject)module0035.NIL;
        while (module0035.NIL != var27) {
            cdestructuring_bind.destructuring_bind_must_consp(var27, var21, (SubLObject)module0035.$ic49$);
            var97_98 = var27.first();
            var27 = var27.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var27, var21, (SubLObject)module0035.$ic49$);
            if (module0035.NIL == conses_high.member(var97_98, (SubLObject)module0035.$ic50$, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
                var28 = (SubLObject)module0035.T;
            }
            if (var97_98 == module0035.$ic51$) {
                var26 = var27.first();
            }
            var27 = var27.rest();
        }
        if (module0035.NIL != var28 && module0035.NIL == var26) {
            cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic49$);
        }
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)module0035.$ic52$, var22);
        final SubLObject var30 = (SubLObject)((module0035.NIL != var29) ? conses_high.cadr(var29) : module0035.$ic53$);
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)module0035.$ic54$, var22);
        final SubLObject var32 = (SubLObject)((module0035.NIL != var31) ? conses_high.cadr(var31) : module0035.NIL);
        final SubLObject var33;
        var22 = (var33 = var23);
        final SubLObject var34 = (SubLObject)module0035.$ic55$;
        final SubLObject var35 = (SubLObject)module0035.$ic56$;
        final SubLObject var36 = (SubLObject)module0035.$ic57$;
        return (SubLObject)ConsesLow.list((SubLObject)module0035.$ic10$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var34, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic58$, var25))), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var35, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic7$, var34), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic7$, var34))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0035.$ic31$, var32, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic21$, var34))), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic8$, var34), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic59$, (SubLObject)ConsesLow.list(var36, var35, (SubLObject)module0035.$ic54$, var32), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic60$, (SubLObject)ConsesLow.list(var30, var36), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic61$, var36, var34), (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic10$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var24, var36)), ConsesLow.append(var33, (SubLObject)module0035.NIL))))));
    }
    
    public static SubLObject f1992(final SubLObject var106) {
        SubLObject var107 = (SubLObject)module0035.NIL;
        SubLObject var108 = (SubLObject)module0035.NIL;
        SubLObject var109 = var106;
        SubLObject var110 = (SubLObject)module0035.NIL;
        var110 = var109.first();
        while (module0035.NIL != var109) {
            if (var110 == module0035.$ic62$) {
                var108 = (SubLObject)module0035.T;
            }
            else if (module0035.NIL == var108) {
                var107 = (SubLObject)ConsesLow.cons(var110, var107);
            }
            else if (var110.isCons() && var110.first().isSymbol()) {
                var107 = (SubLObject)ConsesLow.cons(var110.first(), var107);
            }
            else {
                var107 = (SubLObject)ConsesLow.cons(var110, var107);
            }
            var109 = var109.rest();
            var110 = var109.first();
        }
        return Sequences.nreverse(var107);
    }
    
    public static SubLObject f1993(final SubLObject var110, final SubLObject var15, SubLObject var111) {
        if (var111 == module0035.UNPROVIDED) {
            var111 = (SubLObject)module0035.NIL;
        }
        if (!var110.isList()) {
            return Numbers.numL(Sequences.length(var110), var15);
        }
        SubLObject var112 = (SubLObject)module0035.NIL;
        SubLObject var113 = (SubLObject)module0035.NIL;
        var112 = var110;
        for (var113 = (SubLObject)module0035.ZERO_INTEGER; !var113.numGE(var15); var113 = Numbers.add(var113, (SubLObject)module0035.ONE_INTEGER)) {
            if (module0035.NIL == var112) {
                return (SubLObject)module0035.T;
            }
            if (!var112.isCons()) {
                return (SubLObject)((module0035.NIL != var111) ? Numbers.numL(Numbers.add(var113, (SubLObject)module0035.ONE_INTEGER), var15) : module0035.T);
            }
            var112 = var112.rest();
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f1994(final SubLObject var110, final SubLObject var15, SubLObject var111) {
        if (var111 == module0035.UNPROVIDED) {
            var111 = (SubLObject)module0035.NIL;
        }
        return f1993(var110, Numbers.add(var15, (SubLObject)module0035.ONE_INTEGER), var111);
    }
    
    public static SubLObject f1995(final SubLObject var110, final SubLObject var15, SubLObject var111) {
        if (var111 == module0035.UNPROVIDED) {
            var111 = (SubLObject)module0035.NIL;
        }
        if (!var110.isList()) {
            return Numbers.numE(Sequences.length(var110), var15);
        }
        if (module0035.NIL == var111 && module0035.NIL == f1996(var110)) {
            if (var15.eql((SubLObject)module0035.ZERO_INTEGER)) {
                return Types.sublisp_null(var110);
            }
            if (var15.eql((SubLObject)module0035.ONE_INTEGER)) {
                return f1997(var110);
            }
            if (var15.eql((SubLObject)module0035.TWO_INTEGER)) {
                return f1998(var110);
            }
            if (var15.eql((SubLObject)module0035.THREE_INTEGER)) {
                return f1999(var110);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != f1994(var110, var15, var111) && module0035.NIL != f2000(var110, var15, var111));
    }
    
    public static SubLObject f2001(final SubLObject var115, final SubLObject var15, SubLObject var111) {
        if (var111 == module0035.UNPROVIDED) {
            var111 = (SubLObject)module0035.NIL;
        }
        SubLObject var116 = (SubLObject)module0035.NIL;
        if (module0035.NIL == var116) {
            SubLObject var117 = var115;
            SubLObject var118 = (SubLObject)module0035.NIL;
            var118 = var117.first();
            while (module0035.NIL == var116 && module0035.NIL != var117) {
                if (module0035.NIL == f1995(var118, var15, var111)) {
                    var116 = (SubLObject)module0035.T;
                }
                var117 = var117.rest();
                var118 = var117.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == var116);
    }
    
    public static SubLObject f2002(final SubLObject var110, final SubLObject var15, SubLObject var111) {
        if (var111 == module0035.UNPROVIDED) {
            var111 = (SubLObject)module0035.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == f1994(var110, var15, var111));
    }
    
    public static SubLObject f2000(final SubLObject var110, final SubLObject var15, SubLObject var111) {
        if (var111 == module0035.UNPROVIDED) {
            var111 = (SubLObject)module0035.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == f1993(var110, var15, var111));
    }
    
    public static SubLObject f2003(final SubLObject var118) {
        assert module0035.NIL != Types.sequencep(var118) : var118;
        if (var118.isString()) {
            return Equality.eql((SubLObject)module0035.$ic64$, var118);
        }
        return f1995(var118, (SubLObject)module0035.ZERO_INTEGER, (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2004(final SubLObject var119, final SubLObject var120) {
        if (module0035.NIL == var119) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == var120 || (!var120.isCons() && Sequences.length(var120).isZero()));
        }
        if (var119.isCons()) {
            if (module0035.NIL == var120) {
                return (SubLObject)module0035.NIL;
            }
            if (var120.isCons()) {
                SubLObject var121;
                SubLObject var122;
                for (var121 = (SubLObject)module0035.NIL, var122 = (SubLObject)module0035.NIL, var121 = var119, var122 = var120; module0035.NIL != var121 && module0035.NIL != var122; var121 = var121.rest(), var122 = var122.rest()) {}
                return Equality.eq(var121, var122);
            }
            return Numbers.numE(Sequences.length(var119), Sequences.length(var120));
        }
        else {
            if (module0035.NIL == var120) {
                return Numbers.zerop(Sequences.length(var119));
            }
            return f1995(var120, Sequences.length(var119), (SubLObject)module0035.UNPROVIDED);
        }
    }
    
    public static SubLObject f2005(final SubLObject var115) {
        SubLObject var116 = (SubLObject)module0035.NIL;
        if (module0035.NIL == var116) {
            SubLObject var117;
            SubLObject var118;
            for (var117 = var115.rest(), var118 = (SubLObject)module0035.NIL, var118 = var117.first(); module0035.NIL == var116 && module0035.NIL != var117; var116 = (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == f2004(var118, var115.first())), var117 = var117.rest(), var118 = var117.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == var116);
    }
    
    public static SubLObject f2006(final SubLObject var119, final SubLObject var120) {
        return f2007(var119, var120);
    }
    
    public static SubLObject f2007(final SubLObject var119, final SubLObject var120) {
        if (module0035.NIL == var119) {
            return (SubLObject)module0035.NIL;
        }
        if (var119.isCons()) {
            if (module0035.NIL == var120) {
                return (SubLObject)module0035.T;
            }
            if (var120.isCons()) {
                SubLObject var121;
                SubLObject var122;
                for (var121 = (SubLObject)module0035.NIL, var122 = (SubLObject)module0035.NIL, var121 = var119, var122 = var120; module0035.NIL != var121 && module0035.NIL != var122; var121 = var121.rest(), var122 = var122.rest()) {}
                return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != var121 && module0035.NIL == var122);
            }
            return Numbers.numG(Sequences.length(var119), Sequences.length(var120));
        }
        else {
            if (module0035.NIL == var120) {
                return (SubLObject)SubLObjectFactory.makeBoolean(!Sequences.length(var119).isZero());
            }
            return f1993(var120, Sequences.length(var119), (SubLObject)module0035.UNPROVIDED);
        }
    }
    
    public static SubLObject f2008(final SubLObject var119, final SubLObject var120) {
        if (module0035.NIL == var119) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == var120 || (!var120.isCons() && Sequences.length(var120).isZero()));
        }
        if (var119.isCons()) {
            if (module0035.NIL == var120) {
                return (SubLObject)module0035.T;
            }
            if (var120.isCons()) {
                SubLObject var121;
                SubLObject var122;
                for (var121 = (SubLObject)module0035.NIL, var122 = (SubLObject)module0035.NIL, var121 = var119, var122 = var120; module0035.NIL != var121 && module0035.NIL != var122; var121 = var121.rest(), var122 = var122.rest()) {}
                return (SubLObject)SubLObjectFactory.makeBoolean(var121.eql(var122) || module0035.NIL == var122);
            }
            return Numbers.numGE(Sequences.length(var119), Sequences.length(var120));
        }
        else {
            if (module0035.NIL == var120) {
                return (SubLObject)module0035.T;
            }
            return f1994(var120, Sequences.length(var119), (SubLObject)module0035.UNPROVIDED);
        }
    }
    
    public static SubLObject f2009(final SubLObject var119, final SubLObject var120) {
        return f2010(var119, var120);
    }
    
    public static SubLObject f2010(final SubLObject var119, final SubLObject var120) {
        return f2007(var120, var119);
    }
    
    public static SubLObject f2011(final SubLObject var119, final SubLObject var120) {
        return f2008(var120, var119);
    }
    
    public static SubLObject f2012(final SubLObject var124) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var124.isList() && module0035.NIL != f1995(var124, (SubLObject)module0035.ZERO_INTEGER, (SubLObject)module0035.UNPROVIDED));
    }
    
    public static SubLObject f2013(final SubLObject var124) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var124.isList() && module0035.NIL != f2002(var124, (SubLObject)module0035.ZERO_INTEGER, (SubLObject)module0035.UNPROVIDED));
    }
    
    public static SubLObject f2014(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && module0035.NIL == conses_high.last(var1, (SubLObject)module0035.UNPROVIDED).rest());
    }
    
    public static SubLObject f1996(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && module0035.NIL != conses_high.last(var1, (SubLObject)module0035.UNPROVIDED).rest());
    }
    
    public static SubLObject f2015(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == var1 || module0035.NIL != f2014(var1));
    }
    
    public static SubLObject f2016(final SubLObject var9) {
        final SubLObject var10 = var9.rest();
        if (!var10.isCons()) {
            return (SubLObject)module0035.ONE_INTEGER;
        }
        return Numbers.add((SubLObject)module0035.ONE_INTEGER, f2016(var10));
    }
    
    public static SubLObject f2017(final SubLObject var9) {
        return conses_high.last(var9, (SubLObject)module0035.UNPROVIDED).rest();
    }
    
    public static SubLObject f2018(final SubLObject var9) {
        if (!var9.isCons()) {
            return (SubLObject)module0035.NIL;
        }
        final SubLObject var10 = var9.first();
        final SubLObject var11 = var9.rest();
        if (var11.isCons()) {
            return (SubLObject)ConsesLow.cons(var10, f2018(var11));
        }
        if (module0035.NIL != var11) {
            return (SubLObject)ConsesLow.list(var10);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2019(final SubLObject var9) {
        if (!var9.isCons()) {
            return (SubLObject)module0035.NIL;
        }
        final SubLObject var10 = var9.first();
        final SubLObject var11 = var9.rest();
        if (var11.isCons()) {
            return (SubLObject)ConsesLow.cons(var10, f2019(var11));
        }
        if (module0035.NIL != var11) {
            return (SubLObject)ConsesLow.cons(var10, (SubLObject)ConsesLow.cons(var11, (SubLObject)module0035.NIL));
        }
        return var9;
    }
    
    public static SubLObject f2020(final SubLObject var1, final SubLObject var8) {
        return f2021(var1, conses_high.copy_list(var8));
    }
    
    public static SubLObject f2021(final SubLObject var1, final SubLObject var8) {
        if (var8.isList()) {
            final SubLObject var9 = conses_high.last(var8, (SubLObject)module0035.UNPROVIDED);
            final SubLObject var10 = var9.rest();
            if (module0035.NIL != var10) {
                ConsesLow.rplacd(var9, (SubLObject)ConsesLow.cons(var10, var1));
            }
            else {
                ConsesLow.rplacd(var9, var1);
            }
            return var8;
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2022(final SubLObject var8) {
        final SubLObject var9 = conses_high.last(var8, (SubLObject)module0035.UNPROVIDED).first();
        return f2021(var9, conses_high.nbutlast(var8, (SubLObject)module0035.UNPROVIDED));
    }
    
    public static SubLObject f2023(final SubLObject var8) {
        return f2022(conses_high.copy_list(var8));
    }
    
    public static SubLObject f2024(SubLObject var8, SubLObject var128) {
        if (var128 == module0035.UNPROVIDED) {
            var128 = (SubLObject)module0035.$ic65$;
        }
        final SubLThread var129 = SubLProcess.currentSubLThread();
        if (!var8.isList()) {
            return Values.values(var8, (SubLObject)module0035.T);
        }
        SubLObject var130 = (SubLObject)module0035.NIL;
        SubLObject var131 = (SubLObject)module0035.NIL;
        if (module0035.NIL == var131) {
            SubLObject var132 = var8;
            SubLObject var133 = (SubLObject)module0035.NIL;
            var133 = var132.first();
            while (module0035.NIL == var131 && module0035.NIL != var132) {
                var129.resetMultipleValues();
                final SubLObject var134 = f2024(var133, (SubLObject)module0035.UNPROVIDED);
                final SubLObject var135 = var129.secondMultipleValue();
                var129.resetMultipleValues();
                var130 = (SubLObject)ConsesLow.cons(var134, var130);
                if (module0035.NIL == var135) {
                    var131 = (SubLObject)module0035.T;
                }
                var132 = var132.rest();
                var133 = var132.first();
            }
        }
        if (module0035.NIL != var131) {
            return Values.values((SubLObject)module0035.NIL, (SubLObject)module0035.NIL);
        }
        var8 = Sequences.nreverse(var130);
        final SubLObject var136 = Sequences.position(var128, var8, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL != var136) {
            final SubLObject var137 = Sequences.length(var8);
            if (module0035.THREE_INTEGER.numG(var137)) {
                return Values.values((SubLObject)module0035.NIL, (SubLObject)module0035.NIL);
            }
            if (!var136.numE(Numbers.subtract(var137, (SubLObject)module0035.TWO_INTEGER))) {
                return Values.values((SubLObject)module0035.NIL, (SubLObject)module0035.NIL);
            }
            if (conses_high.last(var8, (SubLObject)module0035.UNPROVIDED).first().eql(var128)) {
                return Values.values((SubLObject)module0035.NIL, (SubLObject)module0035.NIL);
            }
            ConsesLow.rplacd(conses_high.nthcdr(Numbers.subtract(var137, (SubLObject)module0035.THREE_INTEGER), var8), conses_high.nthcdr(Numbers.subtract(var137, (SubLObject)module0035.ONE_INTEGER), var8).first());
        }
        return Values.values(var8, (SubLObject)module0035.T);
    }
    
    public static SubLObject f2025(final SubLObject var8, final SubLObject var15) {
        SubLObject var16 = (SubLObject)module0035.NIL;
        SubLObject var17 = (SubLObject)module0035.NIL;
        var16 = var8;
        for (var17 = (SubLObject)module0035.ZERO_INTEGER; !var17.numG(var15); var17 = module0048.f_1X(var17)) {
            if (!var16.isList()) {
                return (SubLObject)module0035.NIL;
            }
            if (module0035.NIL == var16) {
                return (SubLObject)module0035.NIL;
            }
            var16 = var16.rest();
        }
        return (SubLObject)module0035.T;
    }
    
    public static SubLObject f2026(final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == Functions.funcall(module0035.$g893$.getDynamicValue(var125), var124));
    }
    
    public static SubLObject remove_if_not(final SubLObject var6, final SubLObject var118, SubLObject var7, SubLObject var137, SubLObject var138, SubLObject var139) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        if (var139 == module0035.UNPROVIDED) {
            var139 = (SubLObject)module0035.NIL;
        }
        final SubLThread var140 = SubLProcess.currentSubLThread();
        SubLObject var141 = (SubLObject)module0035.NIL;
        final SubLObject var142 = module0035.$g893$.currentBinding(var140);
        try {
            module0035.$g893$.bind(var6, var140);
            var141 = Sequences.remove_if((SubLObject)module0035.$ic66$, var118, var7, var137, var138, var139);
        }
        finally {
            module0035.$g893$.rebind(var142, var140);
        }
        return var141;
    }
    
    public static SubLObject delete_if_not(final SubLObject var6, final SubLObject var118, SubLObject var7, SubLObject var137, SubLObject var138, SubLObject var139) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        if (var139 == module0035.UNPROVIDED) {
            var139 = (SubLObject)module0035.NIL;
        }
        final SubLThread var140 = SubLProcess.currentSubLThread();
        SubLObject var141 = (SubLObject)module0035.NIL;
        final SubLObject var142 = module0035.$g893$.currentBinding(var140);
        try {
            module0035.$g893$.bind(var6, var140);
            var141 = Sequences.delete_if((SubLObject)module0035.$ic66$, var118, var7, var137, var138, var139);
        }
        finally {
            module0035.$g893$.rebind(var142, var140);
        }
        return var141;
    }
    
    public static SubLObject substitute_if_not(final SubLObject var142, final SubLObject var6, final SubLObject var118, SubLObject var7, SubLObject var137, SubLObject var138, SubLObject var139) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        if (var139 == module0035.UNPROVIDED) {
            var139 = (SubLObject)module0035.NIL;
        }
        final SubLThread var143 = SubLProcess.currentSubLThread();
        SubLObject var144 = (SubLObject)module0035.NIL;
        final SubLObject var145 = module0035.$g893$.currentBinding(var143);
        try {
            module0035.$g893$.bind(var6, var143);
            var144 = Sequences.substitute_if(var142, (SubLObject)module0035.$ic66$, var118, var7, var137, var138, var139);
        }
        finally {
            module0035.$g893$.rebind(var145, var143);
        }
        return var144;
    }
    
    public static SubLObject nsubstitute_if_not(final SubLObject var142, final SubLObject var6, final SubLObject var118, SubLObject var7, SubLObject var137, SubLObject var138, SubLObject var139) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        if (var139 == module0035.UNPROVIDED) {
            var139 = (SubLObject)module0035.NIL;
        }
        final SubLThread var143 = SubLProcess.currentSubLThread();
        SubLObject var144 = (SubLObject)module0035.NIL;
        final SubLObject var145 = module0035.$g893$.currentBinding(var143);
        try {
            module0035.$g893$.bind(var6, var143);
            var144 = Sequences.nsubstitute_if(var142, (SubLObject)module0035.$ic66$, var118, var7, var137, var138, var139);
        }
        finally {
            module0035.$g893$.rebind(var145, var143);
        }
        return var144;
    }
    
    public static SubLObject find_if_not(final SubLObject var6, final SubLObject var118, SubLObject var7, SubLObject var137, SubLObject var138) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        final SubLThread var139 = SubLProcess.currentSubLThread();
        SubLObject var140 = (SubLObject)module0035.NIL;
        final SubLObject var141 = module0035.$g893$.currentBinding(var139);
        try {
            module0035.$g893$.bind(var6, var139);
            var140 = Sequences.find_if((SubLObject)module0035.$ic66$, var118, var7, var137, var138);
        }
        finally {
            module0035.$g893$.rebind(var141, var139);
        }
        return var140;
    }
    
    public static SubLObject position_if_not(final SubLObject var6, final SubLObject var118, SubLObject var7, SubLObject var137, SubLObject var138) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        final SubLThread var139 = SubLProcess.currentSubLThread();
        SubLObject var140 = (SubLObject)module0035.NIL;
        final SubLObject var141 = module0035.$g893$.currentBinding(var139);
        try {
            module0035.$g893$.bind(var6, var139);
            var140 = Sequences.position_if((SubLObject)module0035.$ic66$, var118, var7, var137, var138);
        }
        finally {
            module0035.$g893$.rebind(var141, var139);
        }
        return var140;
    }
    
    public static SubLObject f2027(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Functions.funcall(module0035.$g894$.getDynamicValue(var2), var1, module0035.$g895$.getDynamicValue(var2));
    }
    
    public static SubLObject f2028(final SubLObject var6, final SubLObject var118, final SubLObject var143, SubLObject var7, SubLObject var137, SubLObject var138) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        SubLObject var145 = (SubLObject)module0035.NIL;
        final SubLObject var146 = module0035.$g894$.currentBinding(var144);
        final SubLObject var147 = module0035.$g895$.currentBinding(var144);
        try {
            module0035.$g894$.bind(var6, var144);
            module0035.$g895$.bind(var143, var144);
            var145 = Sequences.position_if((SubLObject)module0035.$ic67$, var118, var7, var137, var138);
        }
        finally {
            module0035.$g895$.rebind(var147, var144);
            module0035.$g894$.rebind(var146, var144);
        }
        return var145;
    }
    
    public static SubLObject f2029(final SubLObject var4, final SubLObject var118, SubLObject var6, SubLObject var7, SubLObject var137, SubLObject var138) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        final SubLObject var139 = (module0035.NIL != var138) ? var138 : module0048.f_1_(Sequences.length(var118));
        final SubLObject var140 = Numbers.subtract(var139, var137);
        SubLObject var141;
        SubLObject var142;
        for (var141 = (SubLObject)module0035.MINUS_ONE_INTEGER, var142 = (SubLObject)module0035.NIL, var142 = var140; !var142.numLE(var141); var142 = Numbers.add(var142, (SubLObject)module0035.MINUS_ONE_INTEGER)) {
            if (module0035.NIL != Functions.funcall(var6, var4, Functions.funcall(var7, Sequences.elt(var118, Numbers.add(var137, var142))))) {
                return var142;
            }
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2030(final SubLObject var4, final SubLObject var93, SubLObject var6, SubLObject var150) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var150 == module0035.UNPROVIDED) {
            var150 = (SubLObject)module0035.NIL;
        }
        if (var93.isAtom()) {
            return (SubLObject)module0035.NIL;
        }
        if (module0035.NIL != f1996(var93)) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var151 = (SubLObject)module0035.NIL;
        SubLObject var152 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var153 = var93;
        SubLObject var154 = (SubLObject)module0035.NIL;
        var154 = var153.first();
        while (module0035.NIL != var153) {
            if (module0035.NIL != Functions.funcall(var6, var4, var154)) {
                var151 = (SubLObject)ConsesLow.cons(var152, var151);
            }
            else if (module0035.NIL == Symbols.fboundp(var150) || module0035.NIL == Functions.funcall(var150, var154)) {
                if (var154.isList()) {
                    SubLObject var38_154 = f2030(var4, var154, var6, (SubLObject)module0035.UNPROVIDED);
                    SubLObject var155 = (SubLObject)module0035.NIL;
                    var155 = var38_154.first();
                    while (module0035.NIL != var38_154) {
                        if (var155.isList()) {
                            var151 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var152, var155), var151);
                        }
                        else {
                            var151 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var152, var155), var151);
                        }
                        var38_154 = var38_154.rest();
                        var155 = var38_154.first();
                    }
                }
            }
            var152 = Numbers.add(var152, (SubLObject)module0035.ONE_INTEGER);
            var153 = var153.rest();
            var154 = var153.first();
        }
        return var151;
    }
    
    public static SubLObject f2031(final SubLObject var4, final SubLObject var93, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var93.isCons()) {
            SubLObject var94 = f2032(var4, var93, var6, (SubLObject)module0035.UNPROVIDED);
            if (module0035.NIL != var94) {
                return (SubLObject)ConsesLow.list(var94);
            }
            var94 = (SubLObject)module0035.ZERO_INTEGER;
            SubLObject var95 = (SubLObject)module0035.NIL;
            SubLObject var96;
            SubLObject var97;
            for (var96 = (SubLObject)module0035.NIL, var96 = var93; !var96.isAtom(); var96 = var96.rest()) {
                var97 = var96.first();
                var95 = f2031(var4, var97, var6);
                if (module0035.NIL != var95) {
                    return (SubLObject)ConsesLow.cons(var94, var95);
                }
                var94 = Numbers.add(var94, (SubLObject)module0035.ONE_INTEGER);
            }
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2033(final SubLObject var4, final SubLObject var93, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var93.isCons()) {
            SubLObject var94 = (SubLObject)module0035.ZERO_INTEGER;
            SubLObject var95 = (SubLObject)module0035.NIL;
            SubLObject var96;
            SubLObject var97;
            for (var96 = (SubLObject)module0035.NIL, var96 = var93; !var96.isAtom(); var96 = var96.rest()) {
                var97 = var96.first();
                if (module0035.NIL != Functions.funcall(var6, var4, var97)) {
                    return (SubLObject)ConsesLow.list(var94);
                }
                var95 = f2033(var4, var97, var6);
                if (module0035.NIL != var95) {
                    return (SubLObject)ConsesLow.cons(var94, var95);
                }
                var94 = Numbers.add(var94, (SubLObject)module0035.ONE_INTEGER);
            }
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2032(final SubLObject var4, final SubLObject var8, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        assert module0035.NIL != Types.listp(var8) : var8;
        if (module0035.NIL != f2015(var8)) {
            return Sequences.position(var4, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
        }
        SubLObject var9 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var10;
        SubLObject var11;
        for (var10 = (SubLObject)module0035.NIL, var10 = var8; !var10.isAtom(); var10 = var10.rest()) {
            var11 = var10.first();
            if (module0035.NIL != Functions.funcall(var6, var4, Functions.funcall(var7, var11))) {
                return var9;
            }
            var9 = Numbers.add(var9, (SubLObject)module0035.ONE_INTEGER);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2034(final SubLObject var157) {
        if (!var157.isList()) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var158 = var157;
        SubLObject var159 = (SubLObject)module0035.NIL;
        var159 = var158.first();
        while (module0035.NIL != var158) {
            if (!var159.isInteger()) {
                return (SubLObject)module0035.NIL;
            }
            var158 = var158.rest();
            var159 = var158.first();
        }
        return (SubLObject)module0035.T;
    }
    
    public static SubLObject f2035(final SubLObject var151, final SubLObject var93) {
        if (var93.isAtom()) {
            return (SubLObject)module0035.NIL;
        }
        if (module0035.NIL != f1996(var93)) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var152 = (SubLObject)module0035.NIL;
        SubLObject var153 = var151;
        SubLObject var154 = (SubLObject)module0035.NIL;
        var154 = var153.first();
        while (module0035.NIL != var153) {
            if (var154.isInteger()) {
                var152 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var154, var93), var152);
            }
            else if (var154.isList()) {
                var152 = ConsesLow.nconc(var152, f2035(var154.rest(), ConsesLow.nth(var154.first(), var93)));
            }
            var153 = var153.rest();
            var154 = var153.first();
        }
        return var152;
    }
    
    public static SubLObject f2036(final SubLObject var151, final SubLObject var93) {
        SubLObject var152 = (SubLObject)module0035.NIL;
        SubLObject var153 = var151;
        SubLObject var154 = (SubLObject)module0035.NIL;
        var154 = var153.first();
        while (module0035.NIL != var153) {
            var152 = (SubLObject)ConsesLow.cons(f2037(var93, (SubLObject)(var154.isList() ? var154 : ConsesLow.list(var154)), (SubLObject)module0035.UNPROVIDED), var152);
            var153 = var153.rest();
            var154 = var153.first();
        }
        return Sequences.nreverse(var152);
    }
    
    public static SubLObject f2038(final SubLObject var1, final SubLObject var161) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0035.ONE_INTEGER), f2037(var1, var161, (SubLObject)module0035.UNPROVIDED));
    }
    
    public static SubLObject f2037(final SubLObject var1, final SubLObject var161, SubLObject var162) {
        if (var162 == module0035.UNPROVIDED) {
            var162 = (SubLObject)module0035.NIL;
        }
        final SubLObject var163 = var161.first();
        final SubLObject var164 = var161.rest();
        if (module0035.NIL == var163) {
            return Values.values(var1, (SubLObject)module0035.T);
        }
        if (var163.isInteger() && var1.isList() && module0035.NIL != f2002(var1, var163, (SubLObject)module0035.UNPROVIDED)) {
            final SubLObject var165 = ConsesLow.nth(var163, var1);
            return f2037(var165, var164, (SubLObject)module0035.UNPROVIDED);
        }
        return Values.values(var162, (SubLObject)module0035.NIL);
    }
    
    public static SubLObject f2039(final SubLObject var8, final SubLObject var161, final SubLObject var166) {
        return f2040(conses_high.copy_tree(var8), var161, var166);
    }
    
    public static SubLObject f2040(final SubLObject var1, final SubLObject var161, final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        if (module0035.NIL != var161) {
            var167.resetMultipleValues();
            final SubLObject var168 = f2040(ConsesLow.nth(var161.first(), var1), var161.rest(), var166);
            final SubLObject var169 = var167.secondMultipleValue();
            var167.resetMultipleValues();
            if (module0035.NIL != var169) {
                final SubLObject var170 = conses_high.nthcdr(var161.first(), var1);
                if (var170.isCons()) {
                    ConsesLow.rplaca(var170, var166);
                }
            }
            return Values.values(var1, (SubLObject)module0035.NIL);
        }
        return Values.values(var1, Types.sublisp_null(var161));
    }
    
    public static SubLObject f2041(final SubLObject var8, final SubLObject var161) {
        assert module0035.NIL != f2014(var8) : var8;
        assert module0035.NIL != f2014(var161) : var161;
        assert module0035.NIL != f2015(var161) : var161;
        SubLObject var162 = var161;
        SubLObject var163 = (SubLObject)module0035.NIL;
        var163 = var162.first();
        while (module0035.NIL != var162) {
            assert module0035.NIL != module0004.f106(var163) : var163;
            var162 = var162.rest();
            var163 = var162.first();
        }
        return f2042(conses_high.copy_tree(var8), var161);
    }
    
    public static SubLObject f2043(final SubLObject var8, final SubLObject var161) {
        assert module0035.NIL != f2014(var8) : var8;
        assert module0035.NIL != f2014(var161) : var161;
        assert module0035.NIL != f2015(var161) : var161;
        SubLObject var162 = var161;
        SubLObject var163 = (SubLObject)module0035.NIL;
        var163 = var162.first();
        while (module0035.NIL != var162) {
            assert module0035.NIL != module0004.f106(var163) : var163;
            var162 = var162.rest();
            var163 = var162.first();
        }
        return f2042(var8, var161);
    }
    
    public static SubLObject f2042(final SubLObject var8, final SubLObject var161) {
        if (module0035.NIL != f2002(var161, (SubLObject)module0035.ONE_INTEGER, (SubLObject)module0035.UNPROVIDED)) {
            final SubLObject var162 = ConsesLow.nth(var161.first(), var8);
            final SubLObject var163 = f2042(var162, var161.rest());
            return f2044(var161.first(), var163, var8);
        }
        return f2045(var161.first(), var8);
    }
    
    public static SubLObject f2046(final SubLObject var4, final SubLObject var93, final SubLObject var172, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var4 == module0035.$ic71$) {
            return (SubLObject)module0035.NIL;
        }
        if (module0035.NIL != Functions.funcall(var6, var4, var93)) {
            return (SubLObject)module0035.$ic72$;
        }
        final SubLObject var173 = conses_high.copy_tree(var93);
        SubLObject var174 = (SubLObject)module0035.$ic73$;
        SubLObject var175 = (SubLObject)module0035.NIL;
        while (module0035.NIL != var174) {
            var174 = Functions.funcall(var172, var4, var173, var6);
            if (module0035.NIL != var174) {
                var175 = (SubLObject)ConsesLow.cons(var174, var175);
                f2040(var173, var174, (SubLObject)module0035.$ic71$);
            }
        }
        return Sequences.nreverse(var175);
    }
    
    public static SubLObject f2047(final SubLObject var4, final SubLObject var93, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        return f2046(var4, var93, (SubLObject)module0035.$ic74$, var6);
    }
    
    public static SubLObject f2048(final SubLObject var4, final SubLObject var93, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        return f2046(var4, var93, (SubLObject)module0035.$ic75$, var6);
    }
    
    public static SubLObject f2049(final SubLObject var4, final SubLObject var93) {
        final SubLObject var94 = f2030(var4, var93, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
        SubLObject var95 = (SubLObject)module0035.NIL;
        SubLObject var96 = var94;
        SubLObject var97 = (SubLObject)module0035.NIL;
        var97 = var96.first();
        while (module0035.NIL != var96) {
            var95 = (SubLObject)ConsesLow.cons(var97.isInteger() ? var93 : f2037(var93, conses_high.butlast(var97, (SubLObject)module0035.UNPROVIDED), (SubLObject)module0035.UNPROVIDED), var95);
            var96 = var96.rest();
            var97 = var96.first();
        }
        return var95;
    }
    
    public static SubLObject f2050(final SubLObject var6, final SubLObject var93, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2051(var6, var93, var7);
    }
    
    public static SubLObject f2052(final SubLObject var6, final SubLObject var93, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return Sort.stable_sort(f2051(var6, var93, var7), Symbols.symbol_function((SubLObject)module0035.$ic76$), (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2051(final SubLObject var6, final SubLObject var93, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var94 = (SubLObject)module0035.NIL;
        SubLObject var95 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var96;
        SubLObject var97;
        SubLObject var98;
        SubLObject var99;
        for (var96 = (SubLObject)module0035.NIL, var96 = var93; !var96.isAtom(); var96 = var96.rest()) {
            var97 = var96.first();
            if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var97))) {
                var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var95), var94);
            }
            var98 = f2051(var6, var97, var7);
            var99 = (SubLObject)module0035.NIL;
            var99 = var98.first();
            while (module0035.NIL != var98) {
                var94 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var95, var99), var94);
                var98 = var98.rest();
                var99 = var98.first();
            }
            var95 = Numbers.add(var95, (SubLObject)module0035.ONE_INTEGER);
        }
        return var94;
    }
    
    public static SubLObject f2053(final SubLObject var6, final SubLObject var93, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2052(var6, var93, var7).first();
    }
    
    public static SubLObject f2054(final SubLObject var6, final SubLObject var93, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var93.isCons()) {
            SubLObject var94 = (SubLObject)module0035.ZERO_INTEGER;
            SubLObject var95 = (SubLObject)module0035.NIL;
            SubLObject var96;
            SubLObject var97;
            for (var96 = (SubLObject)module0035.NIL, var96 = var93; !var96.isAtom(); var96 = var96.rest()) {
                var97 = var96.first();
                if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var97))) {
                    return (SubLObject)ConsesLow.list(var94);
                }
                var95 = f2054(var6, var97, var7);
                if (module0035.NIL != var95) {
                    return (SubLObject)ConsesLow.cons(var94, var95);
                }
                var94 = Numbers.add(var94, (SubLObject)module0035.ONE_INTEGER);
            }
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject count_if_not(final SubLObject var6, final SubLObject var118, SubLObject var7, SubLObject var137, SubLObject var138) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        final SubLThread var139 = SubLProcess.currentSubLThread();
        SubLObject var140 = (SubLObject)module0035.NIL;
        final SubLObject var141 = module0035.$g893$.currentBinding(var139);
        try {
            module0035.$g893$.bind(var6, var139);
            var140 = Sequences.count_if((SubLObject)module0035.$ic66$, var118, var7, var137, var138);
        }
        finally {
            module0035.$g893$.rebind(var141, var139);
        }
        return var140;
    }
    
    public static SubLObject subst_if_not(final SubLObject var142, final SubLObject var6, final SubLObject var93, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        final SubLThread var143 = SubLProcess.currentSubLThread();
        SubLObject var144 = (SubLObject)module0035.NIL;
        final SubLObject var145 = module0035.$g893$.currentBinding(var143);
        try {
            module0035.$g893$.bind(var6, var143);
            var144 = conses_high.subst_if(var142, (SubLObject)module0035.$ic66$, var93, var7);
        }
        finally {
            module0035.$g893$.rebind(var145, var143);
        }
        return var144;
    }
    
    public static SubLObject nsubst_if_not(final SubLObject var142, final SubLObject var6, final SubLObject var93, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        final SubLThread var143 = SubLProcess.currentSubLThread();
        SubLObject var144 = (SubLObject)module0035.NIL;
        final SubLObject var145 = module0035.$g893$.currentBinding(var143);
        try {
            module0035.$g893$.bind(var6, var143);
            var144 = conses_high.nsubst_if(var142, (SubLObject)module0035.$ic66$, var93, var7);
        }
        finally {
            module0035.$g893$.rebind(var145, var143);
        }
        return var144;
    }
    
    public static SubLObject member_if_not(final SubLObject var6, final SubLObject var8, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)module0035.NIL;
        final SubLObject var11 = module0035.$g893$.currentBinding(var9);
        try {
            module0035.$g893$.bind(var6, var9);
            var10 = conses_high.member_if((SubLObject)module0035.$ic66$, var8, var7);
        }
        finally {
            module0035.$g893$.rebind(var11, var9);
        }
        return var10;
    }
    
    public static SubLObject assoc_if_not(final SubLObject var178, final SubLObject var5) {
        final SubLThread var179 = SubLProcess.currentSubLThread();
        SubLObject var180 = (SubLObject)module0035.NIL;
        final SubLObject var181 = module0035.$g893$.currentBinding(var179);
        try {
            module0035.$g893$.bind(var178, var179);
            var180 = conses_high.assoc_if((SubLObject)module0035.$ic66$, var5);
        }
        finally {
            module0035.$g893$.rebind(var181, var179);
        }
        return var180;
    }
    
    public static SubLObject rassoc_if_not(final SubLObject var178, final SubLObject var5) {
        final SubLThread var179 = SubLProcess.currentSubLThread();
        SubLObject var180 = (SubLObject)module0035.NIL;
        final SubLObject var181 = module0035.$g893$.currentBinding(var179);
        try {
            module0035.$g893$.bind(var178, var179);
            var180 = conses_high.rassoc_if((SubLObject)module0035.$ic66$, var5);
        }
        finally {
            module0035.$g893$.rebind(var181, var179);
        }
        return var180;
    }
    
    public static SubLObject f2055(final SubLObject var4, final SubLObject var5, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        SubLObject var7 = (SubLObject)module0035.NIL;
        SubLObject var8 = var5;
        SubLObject var9 = (SubLObject)module0035.NIL;
        var9 = var8.first();
        while (module0035.NIL != var8) {
            if (module0035.NIL != Functions.funcall(var6, var4, var9.first())) {
                var7 = (SubLObject)ConsesLow.cons(var9, var7);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return Sequences.nreverse(var7);
    }
    
    public static SubLObject f2056(final SubLObject var7, final SubLObject var180, SubLObject var5, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        final SubLObject var181 = conses_high.assoc(var7, var5, var6, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL == var181) {
            var5 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list(var180)), var5);
        }
        else {
            ConsesLow.rplacd(var181, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var180, var181.rest().first())));
        }
        return var5;
    }
    
    public static SubLObject f2057(final SubLObject var7, final SubLObject var180, SubLObject var5, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        final SubLObject var181 = conses_high.assoc(var7, var5, var6, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL == var181) {
            var5 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list(var180)), var5);
        }
        else if (module0035.NIL == module0004.f104(var180, var181.rest().first(), (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
            ConsesLow.rplacd(var181, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var180, var181.rest().first())));
        }
        return var5;
    }
    
    public static SubLObject f2058(final SubLObject var7, final SubLObject var180, SubLObject var5, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        final SubLObject var181 = conses_high.assoc(var7, var5, var6, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL == var181) {
            var5 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var7, var180), var5);
        }
        else {
            ConsesLow.rplacd(var181, (SubLObject)ConsesLow.cons(var180, var181.rest()));
        }
        return var5;
    }
    
    public static SubLObject f2059(final SubLObject var182, final SubLObject var183) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != f2060(var182, var183, Symbols.symbol_function((SubLObject)module0035.EQL)) && module0035.NIL != f2060(var183, var182, Symbols.symbol_function((SubLObject)module0035.EQL)));
    }
    
    public static SubLObject f2060(final SubLObject var182, final SubLObject var183, final SubLObject var6) {
        SubLObject var184 = (SubLObject)module0035.NIL;
        SubLObject var185 = var182;
        SubLObject var186 = (SubLObject)module0035.NIL;
        var186 = var185.first();
        while (module0035.NIL != var185) {
            SubLObject var188;
            final SubLObject var187 = var188 = var186;
            SubLObject var189 = (SubLObject)module0035.NIL;
            SubLObject var190 = (SubLObject)module0035.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var188, var187, (SubLObject)module0035.$ic77$);
            var189 = var188.first();
            var188 = (var190 = var188.rest());
            if (module0035.NIL == module0004.f104(var189, var184, var6, (SubLObject)module0035.UNPROVIDED)) {
                var184 = (SubLObject)ConsesLow.cons(var189, var184);
                final SubLObject var191 = conses_high.assoc(var189, var183, var6, (SubLObject)module0035.UNPROVIDED);
                if (module0035.NIL == var191 || (var191.isCons() && !var190.equal(var191.rest()))) {
                    return (SubLObject)module0035.NIL;
                }
            }
            var185 = var185.rest();
            var186 = var185.first();
        }
        return (SubLObject)module0035.T;
    }
    
    public static SubLObject f2061(final SubLObject var5, final SubLObject var8) {
        SubLObject var9 = conses_high.copy_alist(var5);
        final SubLObject var10 = f2062(var5);
        SubLObject var11 = var8;
        SubLObject var12 = (SubLObject)module0035.NIL;
        var12 = var11.first();
        while (module0035.NIL != var11) {
            if (module0035.NIL == module0004.f104(var12, var10, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
                var9 = f2063(var9, var12, var12, (SubLObject)module0035.UNPROVIDED);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return var9;
    }
    
    public static SubLObject f2064(final SubLObject var8, SubLObject var193) {
        if (var193 == module0035.UNPROVIDED) {
            var193 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var194 = (SubLObject)module0035.NIL;
        SubLObject var195 = var8;
        SubLObject var196 = (SubLObject)module0035.NIL;
        var196 = var195.first();
        while (module0035.NIL != var195) {
            var194 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var196, var193.eql(Symbols.symbol_function((SubLObject)module0035.IDENTITY)) ? var196 : Functions.funcall(var193, var196)), var194);
            var195 = var195.rest();
            var196 = var195.first();
        }
        return Sequences.nreverse(var194);
    }
    
    public static SubLObject f2065(final SubLObject var191, final SubLObject var194) {
        if (module0035.NIL == f2004(var191, var194)) {
            Errors.error((SubLObject)module0035.$ic78$);
        }
        SubLObject var195 = (SubLObject)module0035.NIL;
        SubLObject var196 = (SubLObject)module0035.NIL;
        SubLObject var7_196 = (SubLObject)module0035.NIL;
        SubLObject var197 = (SubLObject)module0035.NIL;
        SubLObject var198_199 = (SubLObject)module0035.NIL;
        var196 = var191;
        var7_196 = var196.first();
        var197 = var194;
        var198_199 = var197.first();
        while (module0035.NIL != var197 || module0035.NIL != var196) {
            var195 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var7_196, var198_199), var195);
            var196 = var196.rest();
            var7_196 = var196.first();
            var197 = var197.rest();
            var198_199 = var197.first();
        }
        return Sequences.nreverse(var195);
    }
    
    public static SubLObject f2066(final SubLObject var200, final SubLObject var201) {
        if (module0035.NIL == f2004(var200, var201)) {
            Errors.error((SubLObject)module0035.$ic78$);
        }
        SubLObject var202 = (SubLObject)module0035.NIL;
        SubLObject var203 = (SubLObject)module0035.NIL;
        SubLObject var203_204 = (SubLObject)module0035.NIL;
        SubLObject var204 = (SubLObject)module0035.NIL;
        SubLObject var206_207 = (SubLObject)module0035.NIL;
        var203 = var200;
        var203_204 = var203.first();
        var204 = var201;
        var206_207 = var204.first();
        while (module0035.NIL != var204 || module0035.NIL != var203) {
            var202 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var203_204, var206_207), var202);
            var203 = var203.rest();
            var203_204 = var203.first();
            var204 = var204.rest();
            var206_207 = var204.first();
        }
        return Sequences.nreverse(var202);
    }
    
    public static SubLObject f2067(final SubLObject var208) {
        assert module0035.NIL != f2015(var208) : var208;
        SubLObject var209 = var208;
        SubLObject var210 = (SubLObject)module0035.NIL;
        var210 = var209.first();
        while (module0035.NIL != var209) {
            assert module0035.NIL != f1998(var210) : var210;
            var209 = var209.rest();
            var210 = var209.first();
        }
        SubLObject var211 = (SubLObject)module0035.NIL;
        SubLObject var212 = (SubLObject)module0035.NIL;
        SubLObject var213 = var208;
        SubLObject var214 = (SubLObject)module0035.NIL;
        var214 = var213.first();
        while (module0035.NIL != var213) {
            var211 = (SubLObject)ConsesLow.cons(var214.first(), var211);
            var212 = (SubLObject)ConsesLow.cons(conses_high.second(var214), var212);
            var213 = var213.rest();
            var214 = var213.first();
        }
        return (SubLObject)ConsesLow.list(Sequences.nreverse(var211), Sequences.nreverse(var212));
    }
    
    public static SubLObject f2068(final SubLObject var13) {
        if (var13.isAtom()) {
            return (SubLObject)module0035.NIL;
        }
        return var13.first();
    }
    
    public static SubLObject f2069(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        SubLObject var23 = (SubLObject)module0035.NIL;
        SubLObject var24 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic80$);
        var23 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic80$);
        var24 = var22.first();
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            if (module0035.NIL == f2070(var23)) {
                Errors.warn((SubLObject)module0035.$ic81$, var23);
            }
            return (SubLObject)ConsesLow.list((SubLObject)module0035.$ic82$, var23, var23, var24);
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic80$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2071(final SubLObject var126, final SubLObject var125, final SubLObject var9) {
        if (var9.first().eql(var126) && var9.rest().eql(var125)) {
            return var9;
        }
        return (SubLObject)ConsesLow.cons(var126, var125);
    }
    
    public static SubLObject f2072(final SubLObject var126, final SubLObject var125, final SubLObject var9) {
        if (!var126.eql(var9.first())) {
            ConsesLow.rplaca(var9, var126);
        }
        if (!var125.eql(var9.rest())) {
            ConsesLow.rplacd(var9, var125);
        }
        return var9;
    }
    
    public static SubLObject f2073(final SubLObject var124, final SubLObject var118, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        return Sequences.delete(var124, var118, var6, Symbols.symbol_function((SubLObject)module0035.IDENTITY), (SubLObject)module0035.ZERO_INTEGER, (SubLObject)module0035.NIL, (SubLObject)module0035.ONE_INTEGER);
    }
    
    public static SubLObject f2074(final SubLObject var124, final SubLObject var118, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        return Sequences.remove(var124, var118, var6, Symbols.symbol_function((SubLObject)module0035.IDENTITY), (SubLObject)module0035.ZERO_INTEGER, (SubLObject)module0035.NIL, (SubLObject)module0035.ONE_INTEGER);
    }
    
    public static SubLObject f2075(final SubLObject var118, SubLObject var7, SubLObject var137, SubLObject var138) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        return Sequences.remove_duplicates(var118, Symbols.symbol_function((SubLObject)module0035.EQUAL), var7, var137, var138);
    }
    
    public static SubLObject f2076(final SubLObject var215, final SubLObject var8) {
        SubLObject var216;
        for (var216 = (SubLObject)module0035.NIL, var216 = var8; module0035.NIL != var216; var216 = var216.rest()) {
            ConsesLow.rplaca(var216, Functions.funcall(var215, var216.first()));
        }
        return var8;
    }
    
    public static SubLObject f2077(final SubLObject var215, final SubLObject var8) {
        SubLObject var216 = (SubLObject)module0035.NIL;
        SubLObject var217 = var8;
        SubLObject var218 = (SubLObject)module0035.NIL;
        var218 = var217.first();
        while (module0035.NIL != var217) {
            SubLObject var38_218 = Functions.funcall(var215, var218);
            SubLObject var219 = (SubLObject)module0035.NIL;
            var219 = var38_218.first();
            while (module0035.NIL != var38_218) {
                var216 = (SubLObject)ConsesLow.cons(var219, var216);
                var38_218 = var38_218.rest();
                var219 = var38_218.first();
            }
            var217 = var217.rest();
            var218 = var217.first();
        }
        return Sequences.nreverse(var216);
    }
    
    public static SubLObject f2078(final SubLObject var215, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        SubLObject var216 = (SubLObject)module0035.NIL;
        SubLObject var217 = var8;
        SubLObject var218 = (SubLObject)module0035.NIL;
        var218 = var217.first();
        while (module0035.NIL != var217) {
            SubLObject var38_219 = Functions.funcall(var215, var218);
            SubLObject var219 = (SubLObject)module0035.NIL;
            var219 = var38_219.first();
            while (module0035.NIL != var38_219) {
                final SubLObject var220 = var219;
                if (module0035.NIL == conses_high.member(var220, var216, var6, Symbols.symbol_function((SubLObject)module0035.IDENTITY))) {
                    var216 = (SubLObject)ConsesLow.cons(var220, var216);
                }
                var38_219 = var38_219.rest();
                var219 = var38_219.first();
            }
            var217 = var217.rest();
            var218 = var217.first();
        }
        return Sequences.nreverse(var216);
    }
    
    public static SubLObject f2079(final SubLObject var215, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        SubLObject var216 = (SubLObject)module0035.NIL;
        SubLObject var217 = var8;
        SubLObject var218 = (SubLObject)module0035.NIL;
        var218 = var217.first();
        while (module0035.NIL != var217) {
            var216 = conses_high.nunion(Functions.funcall(var215, var218), var216, var6, (SubLObject)module0035.UNPROVIDED);
            var217 = var217.rest();
            var218 = var217.first();
        }
        return var216;
    }
    
    public static SubLObject f2080(final SubLObject var215, final SubLObject var13, final SubLObject var14) {
        SubLObject var216 = (SubLObject)module0035.NIL;
        if (module0035.NIL != var13 && module0035.NIL != var14) {
            SubLObject var217 = var13;
            SubLObject var218 = (SubLObject)module0035.NIL;
            var218 = var217.first();
            while (module0035.NIL != var217) {
                SubLObject var38_222 = var14;
                SubLObject var219 = (SubLObject)module0035.NIL;
                var219 = var38_222.first();
                while (module0035.NIL != var38_222) {
                    var216 = (SubLObject)ConsesLow.cons(Functions.funcall(var215, var218, var219), var216);
                    var38_222 = var38_222.rest();
                    var219 = var38_222.first();
                }
                var217 = var217.rest();
                var218 = var217.first();
            }
        }
        return Sequences.nreverse(var216);
    }
    
    public static SubLObject f2081(final SubLObject var215, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        assert module0035.NIL != Types.function_spec_p(var215) : var215;
        assert module0035.NIL != Types.listp(var8) : var8;
        if (module0035.NIL == var8) {
            return (SubLObject)module0035.NIL;
        }
        if (module0035.NIL != f1997(var8)) {
            return (SubLObject)ConsesLow.make_list((SubLObject)module0035.ONE_INTEGER, Functions.funcall(var215, var8.first()));
        }
        final SubLObject var216 = module0077.f5313(var6, (SubLObject)module0035.UNPROVIDED);
        SubLObject var217 = (SubLObject)module0035.NIL;
        SubLObject var218 = var8;
        SubLObject var219 = (SubLObject)module0035.NIL;
        var219 = var218.first();
        while (module0035.NIL != var218) {
            final SubLObject var220 = Functions.funcall(var215, var219);
            if (module0035.NIL == module0077.f5320(var220, var216)) {
                module0077.f5326(var220, var216);
                var217 = (SubLObject)ConsesLow.cons(var220, var217);
            }
            var218 = var218.rest();
            var219 = var218.first();
        }
        module0077.f5328(var216);
        return Sequences.nreverse(var217);
    }
    
    public static SubLObject f2082(final SubLObject var8) {
        SubLObject var9;
        SubLObject var10;
        for (var9 = (SubLObject)module0035.NIL, var10 = (SubLObject)module0035.NIL, var9 = var8, var10 = var9.rest(); !var10.isAtom(); var10 = var9.rest()) {
            var9 = var10;
        }
        return var9;
    }
    
    public static SubLObject f2083(final SubLObject var4, final SubLObject var8) {
        return ConsesLow.append(var8, (SubLObject)ConsesLow.list(var4));
    }
    
    public static SubLObject f2084(final SubLObject var4, SubLObject var8) {
        final SubLObject var9 = (SubLObject)ConsesLow.cons(var4, (SubLObject)module0035.NIL);
        if (module0035.NIL != var8) {
            final SubLObject var10 = f2082(var8);
            ConsesLow.rplacd(var10, var9);
        }
        else {
            var8 = var9;
        }
        return var8;
    }
    
    public static SubLObject f2085(final SubLObject var4, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (module0035.NIL != module0004.f104(var4, var8, var6, (SubLObject)module0035.UNPROVIDED)) {
            return var8;
        }
        return f2083(var4, var8);
    }
    
    public static SubLObject f2086(final SubLObject var4, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (module0035.NIL != module0004.f104(var4, var8, var6, (SubLObject)module0035.UNPROVIDED)) {
            return var8;
        }
        return f2084(var4, var8);
    }
    
    public static SubLObject f2087(final SubLObject var4, final SubLObject var8) {
        if (module0035.NIL != var4) {
            return f2083(var4, var8);
        }
        return var8;
    }
    
    public static SubLObject f2088(final SubLObject var4, final SubLObject var8) {
        if (module0035.NIL != var4) {
            return f2084(var4, var8);
        }
        return var8;
    }
    
    public static SubLObject f2089(final SubLObject var15, final SubLObject var8) {
        final SubLObject var16 = Sequences.length(var8);
        final SubLObject var17 = module0048.f_1_(Numbers.subtract(var16, var15));
        return (SubLObject)((module0035.NIL != module0004.f106(var17)) ? ConsesLow.nth(var17, var8) : module0035.NIL);
    }
    
    public static SubLObject f2090(final SubLObject var4, final SubLObject var110, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        return Sequences.nreverse(Sequences.delete(var4, Sequences.reverse(var110), var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED));
    }
    
    public static SubLObject f2091(final SubLObject var232, SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        SubLObject var233 = var232;
        SubLObject var234 = (SubLObject)module0035.NIL;
        var234 = var233.first();
        while (module0035.NIL != var233) {
            var8 = Sequences.remove(var234, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
            var233 = var233.rest();
            var234 = var233.first();
        }
        return var8;
    }
    
    public static SubLObject f2092(final SubLObject var8, final SubLObject var193) {
        SubLObject var194 = (SubLObject)module0035.NIL;
        SubLObject var195 = (SubLObject)module0035.NIL;
        SubLObject var196 = var8;
        SubLObject var197 = (SubLObject)module0035.NIL;
        var197 = var196.first();
        while (module0035.NIL != var196) {
            if (module0035.NIL != Functions.funcall(var193, var197)) {
                var194 = (SubLObject)ConsesLow.cons(var197, var194);
            }
            else {
                var195 = (SubLObject)ConsesLow.cons(var197, var195);
            }
            var196 = var196.rest();
            var197 = var196.first();
        }
        return Values.values(Sequences.nreverse(var194), Sequences.nreverse(var195));
    }
    
    public static SubLObject f2093(final SubLObject var8, final SubLObject var193) {
        final SubLObject var194 = remove_if_not(var193, var8, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
        final SubLObject var195 = Sequences.delete_if(var193, var8, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
        return Values.values(var194, var195);
    }
    
    public static SubLObject f2094(final SubLObject var8, final SubLObject var234, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var235 = (SubLObject)module0035.NIL;
        SubLObject var236 = (SubLObject)module0035.NIL;
        SubLObject var237 = var8;
        SubLObject var238 = (SubLObject)module0035.NIL;
        var238 = var237.first();
        while (module0035.NIL != var237) {
            if (module0035.NIL != Functions.funcall(var6, var234, Functions.funcall(var7, var238))) {
                var235 = (SubLObject)ConsesLow.cons(var238, var235);
            }
            else {
                var236 = (SubLObject)ConsesLow.cons(var238, var236);
            }
            var237 = var237.rest();
            var238 = var237.first();
        }
        return Values.values(Sequences.nreverse(var235), Sequences.nreverse(var236));
    }
    
    public static SubLObject f2095(final SubLObject var8, final SubLObject var15) {
        assert module0035.NIL != module0004.f105(var15) : var15;
        final SubLObject var16 = (SubLObject)ConsesLow.make_list(var15, (SubLObject)module0035.UNPROVIDED);
        SubLObject var17 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var18 = var8;
        SubLObject var19 = (SubLObject)module0035.NIL;
        var19 = var18.first();
        while (module0035.NIL != var18) {
            ConsesLow.set_nth(var17, var16, (SubLObject)ConsesLow.cons(var19, ConsesLow.nth(var17, var16)));
            var17 = Numbers.add(var17, (SubLObject)module0035.ONE_INTEGER);
            if (var17.numGE(var15)) {
                var17 = (SubLObject)module0035.ZERO_INTEGER;
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        return Mapping.mapcar((SubLObject)module0035.$ic85$, var16);
    }
    
    public static SubLObject f2096(final SubLObject var8, final SubLObject var15) {
        return f2095(f2097(var8), var15);
    }
    
    public static SubLObject f2098(final SubLObject var8, final SubLObject var15) {
        final SubLObject var16 = conses_high.nthcdr(var15, var8);
        final SubLObject var17 = conses_high.ldiff(var8, var16);
        return Values.values(var17, var16);
    }
    
    public static SubLObject f2099(final SubLObject var8) {
        assert module0035.NIL != Types.listp(var8) : var8;
        if (module0035.NIL == var8) {
            return (SubLObject)module0035.NIL;
        }
        return ConsesLow.nth(random.random(Sequences.length(var8)), var8);
    }
    
    public static SubLObject f2100(final SubLObject var238) {
        assert module0035.NIL != Types.vectorp(var238) : var238;
        return Vectors.aref(var238, random.random(Sequences.length(var238)));
    }
    
    public static SubLObject f2101(final SubLObject var15, final SubLObject var8) {
        final SubLObject var16 = Sequences.length(var8);
        if (var15.numG(var16)) {
            return f2097(var8);
        }
        if (module0048.f3274(var15).numG(var16)) {
            final SubLObject var17 = f2102(Numbers.subtract(var16, var15), var8);
            return f2097(var17);
        }
        SubLObject var17 = (SubLObject)module0035.NIL;
        SubLObject var15_241;
        SubLObject var19;
        for (SubLObject var18 = conses_high.copy_list(var8); module0035.NIL != var18 && module0035.NIL == f2000(var17, var15, (SubLObject)module0035.UNPROVIDED); var17 = (SubLObject)ConsesLow.cons(var19, var17), var18 = f2045(var15_241, var18)) {
            var15_241 = random.random(Sequences.length(var18));
            var19 = ConsesLow.nth(var15_241, var18);
        }
        return var17;
    }
    
    public static SubLObject f2102(final SubLObject var15, final SubLObject var8) {
        SubLObject var16 = conses_high.copy_list(var8);
        SubLObject var17;
        for (var17 = (SubLObject)module0035.NIL, var17 = (SubLObject)module0035.ZERO_INTEGER; var17.numL(var15); var17 = Numbers.add(var17, (SubLObject)module0035.ONE_INTEGER)) {
            var16 = f2103(var16);
        }
        return var16;
    }
    
    public static SubLObject f2103(final SubLObject var8) {
        final SubLObject var9 = random.random(Sequences.length(var8));
        final SubLObject var10 = ConsesLow.nth(var9, var8);
        return Values.values(f2045(var9, var8), var10);
    }
    
    public static SubLObject f2097(final SubLObject var8) {
        return module0037.f2558(f2104(f2105(var8)), (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2104(final SubLObject var238) {
        final SubLObject var239 = Sequences.length(var238);
        if (var239.numLE((SubLObject)module0035.ONE_INTEGER)) {
            return var238;
        }
        final SubLObject var240 = Vectors.make_vector(var239, (SubLObject)module0035.UNPROVIDED);
        return f2106(var238, var240, (SubLObject)module0035.ZERO_INTEGER);
    }
    
    public static SubLObject f2106(final SubLObject var238, final SubLObject var243, final SubLObject var17) {
        final SubLObject var244 = Sequences.length(var238);
        final SubLObject var245 = Numbers.integerDivide(var244, (SubLObject)module0035.TWO_INTEGER);
        final SubLObject var246 = Vectors.make_vector(var244, (SubLObject)module0035.UNPROVIDED);
        SubLObject var247 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var248 = (SubLObject)module0035.NIL;
        while (module0035.NIL == var248) {
            final SubLObject var249 = random.random(var244);
            if (module0035.NIL == Vectors.aref(var246, var249)) {
                Vectors.set_aref(var243, Numbers.add(var247, var17), Vectors.aref(var238, var249));
                Vectors.set_aref(var246, var249, (SubLObject)module0035.T);
                var247 = Numbers.add(var247, (SubLObject)module0035.ONE_INTEGER);
                if (var244.numL((SubLObject)module0035.TEN_INTEGER)) {
                    if (var247.numE(var244)) {
                        return var243;
                    }
                    continue;
                }
                else {
                    if (!var247.numE(var245)) {
                        continue;
                    }
                    var248 = (SubLObject)module0035.T;
                }
            }
        }
        final SubLObject var250 = Numbers.subtract(var244, var245);
        final SubLObject var251 = Vectors.make_vector(var250, (SubLObject)module0035.UNPROVIDED);
        SubLObject var252 = (SubLObject)module0035.ZERO_INTEGER;
        final SubLObject var253 = (SubLObject)module0035.NIL;
        SubLObject var252_253;
        SubLObject var254;
        SubLObject var113_255;
        SubLObject var255;
        for (var252_253 = Sequences.length(var238), var254 = (SubLObject)module0035.NIL, var254 = (SubLObject)module0035.ZERO_INTEGER; var254.numL(var252_253); var254 = Numbers.add(var254, (SubLObject)module0035.ONE_INTEGER)) {
            var113_255 = ((module0035.NIL != var253) ? Numbers.subtract(var252_253, var254, (SubLObject)module0035.ONE_INTEGER) : var254);
            var255 = Vectors.aref(var238, var113_255);
            if (module0035.NIL == Vectors.aref(var246, var113_255)) {
                Vectors.set_aref(var251, var252, var255);
                var252 = Numbers.add(var252, (SubLObject)module0035.ONE_INTEGER);
            }
        }
        return f2106(var251, var243, Numbers.add(var17, var245));
    }
    
    public static SubLObject f2107(final SubLObject var2, final SubLObject var3) {
        return Equality.eq((SubLObject)module0035.ZERO_INTEGER, random.random((SubLObject)module0035.TWO_INTEGER));
    }
    
    public static SubLObject f2108(final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = conses_high.third(var13);
        final SubLObject var16 = conses_high.third(var14);
        if (var15.isNumber() && var16.isNumber()) {
            return Numbers.numL(var15, var16);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2109(final SubLObject var4, final SubLObject var110, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var111 = (SubLObject)module0035.NIL;
        for (SubLObject var112 = var110, var113 = (SubLObject)(var112.isList() ? module0035.NIL : Sequences.length(var112)), var114 = (SubLObject)module0035.ZERO_INTEGER, var115 = module0005.f149(var114, var113, var112); module0035.NIL == var115; var115 = module0005.f149(var114, var113, var112)) {
            final SubLObject var116 = module0005.f150(var114, var112);
            if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var116), var4)) {
                var111 = (SubLObject)ConsesLow.cons(var116, var111);
            }
            var112 = module0005.f151(var112);
            var114 = Numbers.add(var114, (SubLObject)module0035.ONE_INTEGER);
        }
        return Sequences.nreverse(var111);
    }
    
    public static SubLObject f2110(final SubLObject var6, final SubLObject var110, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var111 = (SubLObject)module0035.NIL;
        for (SubLObject var112 = var110, var113 = (SubLObject)(var112.isList() ? module0035.NIL : Sequences.length(var112)), var114 = (SubLObject)module0035.ZERO_INTEGER, var115 = module0005.f149(var114, var113, var112); module0035.NIL == var115; var115 = module0005.f149(var114, var113, var112)) {
            final SubLObject var116 = module0005.f150(var114, var112);
            if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var116))) {
                var111 = (SubLObject)ConsesLow.cons(var116, var111);
            }
            var112 = module0005.f151(var112);
            var114 = Numbers.add(var114, (SubLObject)module0035.ONE_INTEGER);
        }
        return Sequences.nreverse(var111);
    }
    
    public static SubLObject f2111(final SubLObject var6, final SubLObject var110, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var111 = (SubLObject)module0035.NIL;
        for (SubLObject var112 = var110, var113 = (SubLObject)(var112.isList() ? module0035.NIL : Sequences.length(var112)), var114 = (SubLObject)module0035.ZERO_INTEGER, var115 = module0005.f149(var114, var113, var112); module0035.NIL == var115; var115 = module0005.f149(var114, var113, var112)) {
            final SubLObject var116 = module0005.f150(var114, var112);
            if (module0035.NIL == Functions.funcall(var6, Functions.funcall(var7, var116))) {
                var111 = (SubLObject)ConsesLow.cons(var116, var111);
            }
            var112 = module0005.f151(var112);
            var114 = Numbers.add(var114, (SubLObject)module0035.ONE_INTEGER);
        }
        return Sequences.nreverse(var111);
    }
    
    public static SubLObject f2112(final SubLObject var4, final SubLObject var110, SubLObject var6, SubLObject var7, SubLObject var137) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        SubLObject var138 = (SubLObject)module0035.NIL;
        while (module0035.NIL != var137) {
            final SubLObject var139 = Sequences.position(var4, var110, var6, var7, var137, (SubLObject)module0035.UNPROVIDED);
            if (module0035.NIL != var139) {
                var138 = (SubLObject)ConsesLow.cons(var139, var138);
                var137 = module0048.f_1X(var139);
            }
            else {
                var137 = (SubLObject)module0035.NIL;
            }
        }
        return Sequences.nreverse(var138);
    }
    
    public static SubLObject f2113(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0035.NIL == Errors.$ignore_mustsP$.getDynamicValue(var9) && module0035.NIL == f1997(var8)) {
            Errors.error((SubLObject)module0035.$ic87$, var8);
        }
        return var8.first();
    }
    
    public static SubLObject f2114(final SubLObject var8) {
        return conses_high.last(var8, (SubLObject)module0035.UNPROVIDED).first();
    }
    
    public static SubLObject f2115(final SubLObject var8) {
        if (module0035.NIL != var8.rest()) {
            return ConsesLow.nth(Numbers.subtract(Sequences.length(var8), (SubLObject)module0035.TWO_INTEGER), var8);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2116(final SubLObject var264, final SubLObject var8) {
        if (module0035.NIL != var264) {
            return (SubLObject)ConsesLow.cons(var264, var8);
        }
        return var8;
    }
    
    public static SubLObject f2117(final SubLObject var1) {
        if (module0035.NIL != var1) {
            return (SubLObject)ConsesLow.list(var1);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2118(final SubLObject var4, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (module0035.NIL != var4) {
            return conses_high.adjoin(var4, var8, var6, (SubLObject)module0035.UNPROVIDED);
        }
        return var8;
    }
    
    public static SubLObject f2119(final SubLObject var93) {
        SubLObject var94 = (SubLObject)ConsesLow.list(var93);
        SubLObject var95 = (SubLObject)module0035.NIL;
        SubLObject var96 = (SubLObject)module0035.NIL;
        while (module0035.NIL != var94) {
            var95 = var94.first();
            var94 = var94.rest();
            if (var95.isAtom()) {
                if (module0035.NIL == var95) {
                    continue;
                }
                var96 = (SubLObject)ConsesLow.cons(var95, var96);
            }
            else {
                if (module0035.NIL != var95.rest()) {
                    var94 = (SubLObject)ConsesLow.cons(var95.rest(), var94);
                }
                var94 = (SubLObject)ConsesLow.cons(var95.first(), var94);
            }
        }
        return Sequences.nreverse(var96);
    }
    
    public static SubLObject f2120(final SubLObject var8, final SubLObject var1) {
        if (module0035.NIL == var8) {
            return var8;
        }
        SubLObject var9 = (SubLObject)ConsesLow.list(var8.first());
        SubLObject var10 = var8.rest();
        SubLObject var11 = (SubLObject)module0035.NIL;
        var11 = var10.first();
        while (module0035.NIL != var10) {
            var9 = (SubLObject)ConsesLow.cons(var1, var9);
            var9 = (SubLObject)ConsesLow.cons(var11, var9);
            var10 = var10.rest();
            var11 = var10.first();
        }
        return Sequences.nreverse(var9);
    }
    
    public static SubLObject f2121(final SubLObject var15, final SubLObject var8) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)module0035.NIL;
        SubLObject var18 = (SubLObject)module0035.NIL;
        try {
            var16.throwStack.push(module0035.$ic88$);
            final SubLObject var19 = Errors.$error_handler$.currentBinding(var16);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0035.$ic89$), var16);
                try {
                    var17 = ConsesLow.nth(var15, var8);
                }
                catch (Throwable var20) {
                    Errors.handleThrowable(var20, (SubLObject)module0035.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var19, var16);
            }
        }
        catch (Throwable var21) {
            var18 = Errors.handleThrowable(var21, (SubLObject)module0035.$ic88$);
        }
        finally {
            var16.throwStack.pop();
        }
        return var17;
    }
    
    public static SubLObject f2122(final SubLObject var271, final SubLObject var8) {
        assert module0035.NIL != Types.listp(var271) : var271;
        assert module0035.NIL != Types.listp(var8) : var8;
        SubLObject var272 = (SubLObject)module0035.NIL;
        SubLObject var273 = var271;
        SubLObject var274 = (SubLObject)module0035.NIL;
        var274 = var273.first();
        while (module0035.NIL != var273) {
            var272 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var274, var8), var272);
            var273 = var273.rest();
            var274 = var273.first();
        }
        return Sequences.nreverse(var272);
    }
    
    public static SubLObject f2123(final SubLObject var15, final SubLObject var8) {
        SubLObject var16 = (SubLObject)module0035.NIL;
        SubLObject var17 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var18 = var8;
        SubLObject var19 = (SubLObject)module0035.NIL;
        var19 = var18.first();
        while (module0035.NIL != var18) {
            if (var17.numE(var15)) {
                var17 = (SubLObject)module0035.ZERO_INTEGER;
            }
            if (var17.isZero()) {
                var16 = (SubLObject)ConsesLow.cons(var19, var16);
            }
            var17 = Numbers.add(var17, (SubLObject)module0035.ONE_INTEGER);
            var18 = var18.rest();
            var19 = var18.first();
        }
        return Sequences.nreverse(var16);
    }
    
    public static SubLObject f2124(final SubLObject var15, final SubLObject var8) {
        return conses_high.ldiff(var8, conses_high.nthcdr(var15, var8));
    }
    
    public static SubLObject f2125(final SubLObject var272, final SubLObject var8) {
        final SubLObject var273 = Sequences.length(var8);
        final SubLObject var274 = Numbers.round(Numbers.multiply(var273, var272, (SubLObject)module0035.$ic90$), (SubLObject)module0035.UNPROVIDED);
        return f2124(var274, var8);
    }
    
    public static SubLObject f2126(final SubLObject var15, final SubLObject var6, final SubLObject var8, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var16 = (SubLObject)module0035.NIL;
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        for (var17 = (SubLObject)module0035.ZERO_INTEGER, var18 = (SubLObject)module0035.NIL, var18 = var8; !var17.numGE(var15) && module0035.NIL != var18; var18 = var18.rest()) {
            var19 = var18.first();
            if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var19))) {
                var17 = Numbers.add(var17, (SubLObject)module0035.ONE_INTEGER);
                var16 = (SubLObject)ConsesLow.cons(var19, var16);
            }
        }
        return Sequences.nreverse(var16);
    }
    
    public static SubLObject f2127(final SubLObject var8) {
        return f2124((SubLObject)module0035.TWO_INTEGER, var8);
    }
    
    public static SubLObject f2128(final SubLObject var8) {
        return f2124((SubLObject)module0035.TEN_INTEGER, var8);
    }
    
    public static SubLObject f2129(final SubLObject var15, final SubLObject var8) {
        final SubLObject var16 = Numbers.subtract(Sequences.length(var8), var15);
        return conses_high.nthcdr(var16, var8);
    }
    
    public static SubLObject f2130(final SubLObject var8, final SubLObject var15, final SubLObject var276) {
        return f2124(var276, conses_high.nthcdr(Numbers.multiply(var15, var276), var8));
    }
    
    public static SubLObject f2045(final SubLObject var15, final SubLObject var8) {
        assert module0035.NIL != Types.integerp(var15) : var15;
        assert module0035.NIL != Types.listp(var8) : var8;
        if (var15.numE((SubLObject)module0035.ZERO_INTEGER)) {
            return var8.rest();
        }
        final SubLObject var16 = conses_high.nthcdr(module0048.f_1_(var15), var8);
        if (var16.isCons()) {
            ConsesLow.rplacd(var16, conses_high.cddr(var16));
        }
        return var8;
    }
    
    public static SubLObject f2131(final SubLObject var15, final SubLObject var8) {
        return f2045(var15, conses_high.copy_list(var8));
    }
    
    public static SubLObject f2132(final SubLObject var8) {
        return f2131(Numbers.subtract(Sequences.length(var8), (SubLObject)module0035.ONE_INTEGER), var8);
    }
    
    public static SubLObject f2133(final SubLObject var271, final SubLObject var8) {
        assert module0035.NIL != Types.listp(var271) : var271;
        assert module0035.NIL != Types.listp(var8) : var8;
        SubLObject var272 = var8;
        SubLObject var273 = var271;
        SubLObject var274 = (SubLObject)module0035.NIL;
        var274 = var273.first();
        while (module0035.NIL != var273) {
            var272 = f2131(var274, var272);
            var273 = var273.rest();
            var274 = var273.first();
        }
        return var272;
    }
    
    public static SubLObject f2134(final SubLObject var8, final SubLObject var142) {
        return f2044(module0048.f_1_(Sequences.length(var8)), var142, var8);
    }
    
    public static SubLObject f2044(final SubLObject var15, final SubLObject var142, final SubLObject var8) {
        assert module0035.NIL != Types.integerp(var15) : var15;
        assert module0035.NIL != Types.listp(var8) : var8;
        if (var15.numL((SubLObject)module0035.ZERO_INTEGER)) {
            return var8;
        }
        if (var15.numG(Numbers.subtract(Sequences.length(var8), (SubLObject)module0035.ONE_INTEGER))) {
            return var8;
        }
        final SubLObject var143 = conses_high.nthcdr(var15, var8);
        if (var143.isCons()) {
            ConsesLow.rplaca(var143, var142);
        }
        return var8;
    }
    
    public static SubLObject f2135(final SubLObject var217, final SubLObject var142, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQ);
        }
        return (module0035.NIL != Sequences.find(var217, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) ? f2136(var217, var142, conses_high.copy_list(var8), var6) : var8;
    }
    
    public static SubLObject f2136(final SubLObject var217, final SubLObject var142, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQ);
        }
        SubLObject var218;
        for (var218 = (SubLObject)module0035.NIL, var218 = var8; !var218.isAtom(); var218 = var218.rest()) {
            if (module0035.NIL != Functions.funcall(var6, var218.first(), var217)) {
                ConsesLow.rplaca(var218, var142);
            }
        }
        return var8;
    }
    
    public static SubLObject f2137(final SubLObject var217, final SubLObject var142, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQ);
        }
        SubLObject var218;
        for (var218 = (SubLObject)module0035.NIL, var218 = var8; !var218.isAtom(); var218 = var218.rest()) {
            if (module0035.NIL != Functions.funcall(var6, var218.first(), var217)) {
                ConsesLow.rplaca(var218, var142);
                return var8;
            }
        }
        return var8;
    }
    
    public static SubLObject f2138(final SubLObject var15, final SubLObject var152, final SubLObject var142, final SubLObject var8) {
        assert module0035.NIL != Types.integerp(var152) : var152;
        assert module0035.NIL != Types.integerp(var15) : var15;
        assert module0035.NIL != Types.listp(var8) : var8;
        if (Numbers.add(var152, var15).numL((SubLObject)module0035.ZERO_INTEGER)) {
            return var8;
        }
        if (var152.numG(Numbers.subtract(Sequences.length(var8), (SubLObject)module0035.ONE_INTEGER))) {
            return var8;
        }
        final SubLObject var153 = conses_high.nthcdr(Numbers.max(var152, (SubLObject)module0035.ZERO_INTEGER), var8);
        if (var153.isCons()) {
            ConsesLow.rplaca(var153, var142);
        }
        SubLObject var154;
        SubLObject var155;
        for (var154 = Numbers.subtract(var15, Numbers.add((SubLObject)module0035.ONE_INTEGER, Numbers.max(Numbers.minus(var152), (SubLObject)module0035.ZERO_INTEGER))), var155 = (SubLObject)module0035.NIL, var155 = (SubLObject)module0035.ZERO_INTEGER; var155.numL(var154); var155 = Numbers.add(var155, (SubLObject)module0035.ONE_INTEGER)) {
            f2045(Numbers.add(var152, (SubLObject)module0035.ONE_INTEGER, Numbers.max(Numbers.minus(var152), (SubLObject)module0035.ZERO_INTEGER)), var8);
        }
        return var8;
    }
    
    public static SubLObject f2139(final SubLObject var4, final SubLObject var8, final SubLObject var149) {
        assert module0035.NIL != Types.integerp(var149) : var149;
        assert module0035.NIL != Types.listp(var8) : var8;
        final SubLObject var150 = Sequences.length(var8);
        SubLObject var151 = (SubLObject)module0035.NIL;
        SubLObject var152 = (SubLObject)module0035.NIL;
        if (var149.numG(var150) || var149.numL((SubLObject)module0035.ZERO_INTEGER)) {
            Errors.error((SubLObject)module0035.$ic92$);
            return (SubLObject)module0035.NIL;
        }
        if (var149.numLE((SubLObject)module0035.ZERO_INTEGER) || var150.eql((SubLObject)module0035.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.cons(var4, var8);
        }
        if (var149.numGE(var150)) {
            return ConsesLow.nconc(var8, (SubLObject)ConsesLow.list(var4));
        }
        var151 = conses_high.nthcdr(Numbers.subtract(var149, (SubLObject)module0035.ONE_INTEGER), var8);
        var152 = (SubLObject)ConsesLow.list(var4);
        ConsesLow.rplacd(var152, var151.rest());
        ConsesLow.rplacd(var151, var152);
        return var8;
    }
    
    public static SubLObject f2140(final SubLObject var4, final SubLObject var8) {
        final SubLObject var9 = random.random(module0048.f_1X(Sequences.length(var8)));
        return f2139(var4, var8, var9);
    }
    
    public static SubLObject f2141(final SubLObject var279, SubLObject var8, final SubLObject var280, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        final SubLObject var281 = Sequences.position(var280, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
        var8 = f2142(var279, var8, var281);
        var8 = f2143(var279, var8, var281);
        return var8;
    }
    
    public static SubLObject f2144(final SubLObject var4, final SubLObject var8, final SubLObject var152) {
        final SubLObject var153 = random.random(var152);
        return f2139(var4, var8, var153);
    }
    
    public static SubLObject f2143(final SubLObject var4, final SubLObject var8, final SubLObject var152) {
        final SubLObject var153 = random.random(module0048.f_1X(var152));
        return f2139(var4, var8, var153);
    }
    
    public static SubLObject f2142(final SubLObject var4, final SubLObject var8, final SubLObject var152) {
        final SubLObject var153 = Sequences.length(var8);
        final SubLObject var154 = random.random(Numbers.subtract(var153, var152));
        final SubLObject var155 = Numbers.add((SubLObject)module0035.ONE_INTEGER, var152, var154);
        return f2139(var4, var8, var155);
    }
    
    public static SubLObject f2145(final SubLObject var15, final SubLObject var8) {
        final SubLObject var16 = ConsesLow.nth(var15, var8);
        return f2146(var16, var8, (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2147(final SubLObject var15, final SubLObject var282, final SubLObject var8) {
        final SubLObject var283 = ConsesLow.nth(var15, var8);
        if (var15.eql(var282)) {
            return var8;
        }
        if (var282.eql((SubLObject)module0035.ZERO_INTEGER)) {
            return f2146(var283, var8, (SubLObject)module0035.UNPROVIDED);
        }
        if (var282.eql(module0048.f_1_(Sequences.length(var8)))) {
            return f2148(var283, var8);
        }
        return f2139(var283, f2045(var15, var8), var282);
    }
    
    public static SubLObject f2146(final SubLObject var4, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = var6;
        if (var10.eql((SubLObject)module0035.EQ)) {
            var9.resetMultipleValues();
            final SubLObject var11 = Equality.eq(var4, var8.first());
            var9.resetMultipleValues();
            return (SubLObject)((module0035.NIL != var11) ? var8 : ConsesLow.cons(var4, Sequences.delete(var4, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)));
        }
        if (var10.eql((SubLObject)module0035.EQL)) {
            var9.resetMultipleValues();
            final SubLObject var11 = Equality.eql(var4, var8.first());
            var9.resetMultipleValues();
            return (SubLObject)((module0035.NIL != var11) ? var8 : ConsesLow.cons(var4, Sequences.delete(var4, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)));
        }
        if (var10.eql((SubLObject)module0035.EQUAL)) {
            var9.resetMultipleValues();
            final SubLObject var11 = Equality.equal(var4, var8.first());
            var9.resetMultipleValues();
            return (SubLObject)((module0035.NIL != var11) ? var8 : ConsesLow.cons(var4, Sequences.delete(var4, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)));
        }
        if (var10.eql((SubLObject)module0035.EQUALP)) {
            var9.resetMultipleValues();
            final SubLObject var11 = Equality.equalp(var4, var8.first());
            var9.resetMultipleValues();
            return (SubLObject)((module0035.NIL != var11) ? var8 : ConsesLow.cons(var4, Sequences.delete(var4, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)));
        }
        var9.resetMultipleValues();
        final SubLObject var11 = Functions.funcall(var6, var4, var8.first());
        var9.resetMultipleValues();
        return (SubLObject)((module0035.NIL != var11) ? var8 : ConsesLow.cons(var4, Sequences.delete(var4, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)));
    }
    
    public static SubLObject f2149(final SubLObject var4, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = var6;
        if (var10.eql((SubLObject)module0035.EQ)) {
            var9.resetMultipleValues();
            final SubLObject var11 = Equality.eq(var4, var8.first());
            var9.resetMultipleValues();
            return (SubLObject)((module0035.NIL != var11) ? var8 : ConsesLow.cons(var4, Sequences.remove(var4, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)));
        }
        if (var10.eql((SubLObject)module0035.EQL)) {
            var9.resetMultipleValues();
            final SubLObject var11 = Equality.eql(var4, var8.first());
            var9.resetMultipleValues();
            return (SubLObject)((module0035.NIL != var11) ? var8 : ConsesLow.cons(var4, Sequences.remove(var4, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)));
        }
        if (var10.eql((SubLObject)module0035.EQUAL)) {
            var9.resetMultipleValues();
            final SubLObject var11 = Equality.equal(var4, var8.first());
            var9.resetMultipleValues();
            return (SubLObject)((module0035.NIL != var11) ? var8 : ConsesLow.cons(var4, Sequences.remove(var4, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)));
        }
        if (var10.eql((SubLObject)module0035.EQUALP)) {
            var9.resetMultipleValues();
            final SubLObject var11 = Equality.equalp(var4, var8.first());
            var9.resetMultipleValues();
            return (SubLObject)((module0035.NIL != var11) ? var8 : ConsesLow.cons(var4, Sequences.remove(var4, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)));
        }
        var9.resetMultipleValues();
        final SubLObject var11 = Functions.funcall(var6, var4, var8.first());
        var9.resetMultipleValues();
        return (SubLObject)((module0035.NIL != var11) ? var8 : ConsesLow.cons(var4, Sequences.remove(var4, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)));
    }
    
    public static SubLObject f2148(final SubLObject var4, final SubLObject var8) {
        return ConsesLow.nconc(Sequences.delete(var4, var8, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED), (SubLObject)ConsesLow.list(var4));
    }
    
    public static SubLObject f2150(final SubLObject var4, final SubLObject var8) {
        return ConsesLow.append(Sequences.remove(var4, var8, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED), (SubLObject)ConsesLow.list(var4));
    }
    
    public static SubLObject f2151(final SubLObject var15, final SubLObject var142, final SubLObject var8) {
        return f2044(var15, var142, conses_high.copy_list(var8));
    }
    
    public static SubLObject f2152(final SubLObject var8, final SubLObject var142) {
        return f2151(module0048.f_1_(Sequences.length(var8)), var142, var8);
    }
    
    public static SubLObject f2153(final SubLObject var8, SubLObject var6, SubLObject var7, SubLObject var137, SubLObject var138) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        return Sequences.remove_duplicates(var8, var6, var7, var137, var138);
    }
    
    public static SubLObject f2154(final SubLObject var8, SubLObject var6, SubLObject var7, SubLObject var137, SubLObject var138) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        return Sequences.nreverse(Sequences.delete_duplicates(Sequences.reverse(var8), var6, var7, var137, var138));
    }
    
    public static SubLObject f2155(final SubLObject var8, SubLObject var6, SubLObject var7, SubLObject var137, SubLObject var138) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        return Sequences.delete_duplicates(var8, var6, var7, var137, var138);
    }
    
    public static SubLObject f2156(final SubLObject var8, SubLObject var6, SubLObject var7, SubLObject var137, SubLObject var138) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        return Sequences.nreverse(Sequences.delete_duplicates(Sequences.nreverse(var8), var6, var7, var137, var138));
    }
    
    public static SubLObject f2157(final SubLObject var8, SubLObject var7, SubLObject var137, SubLObject var138, SubLObject var139) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        if (var139 == module0035.UNPROVIDED) {
            var139 = (SubLObject)module0035.NIL;
        }
        return Sequences.remove_if((SubLObject)module0035.$ic21$, var8, var7, var137, var138, var139);
    }
    
    public static SubLObject f2158(final SubLObject var8, final SubLObject var284, SubLObject var6, SubLObject var7, SubLObject var137, SubLObject var138) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        return Sequences.nreverse(Sequences.remove_duplicates(Sequences.nreverse((SubLObject)ConsesLow.cons(var284, conses_high.copy_list(var8))), var6, var7, var137, var138)).rest();
    }
    
    public static SubLObject f2159(final SubLObject var8, final SubLObject var285) {
        SubLObject var286 = (SubLObject)module0035.NIL;
        SubLObject var287;
        SubLObject var288;
        for (var287 = Sequences.length(var8), var288 = (SubLObject)module0035.NIL, var288 = (SubLObject)module0035.ZERO_INTEGER; var288.numL(var287); var288 = Numbers.add(var288, (SubLObject)module0035.ONE_INTEGER)) {
            if (module0035.NIL == module0004.f104(var288, var285, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
                var286 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var288, var8), var286);
            }
        }
        return Sequences.nreverse(var286);
    }
    
    public static SubLObject f2160(final SubLObject var286, SubLObject var137) {
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        final SubLObject var287 = f2161(var286, var137);
        final SubLObject var288 = f2162(var287, var286, var137);
        if (module0035.NIL != var288) {
            return var287;
        }
        f2163(var286, var137);
        return f2161(var286, var137);
    }
    
    public static SubLObject f2164(final SubLObject var286, SubLObject var137) {
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        SubLObject var287 = (SubLObject)module0035.NIL;
        SubLObject var288;
        for (var288 = (SubLObject)module0035.NIL, var288 = (SubLObject)module0035.ZERO_INTEGER; var288.numL(var286); var288 = Numbers.add(var288, (SubLObject)module0035.ONE_INTEGER)) {
            var287 = (SubLObject)ConsesLow.cons(Numbers.add(var137, var288), var287);
        }
        return Sequences.nreverse(var287);
    }
    
    public static SubLObject f2162(final SubLObject var288, final SubLObject var239, final SubLObject var137) {
        SubLObject var289 = (SubLObject)SubLObjectFactory.makeBoolean(!var288.isList() || !var239.isInteger() || !var137.isInteger() || module0035.NIL == f1995(var288, var239, (SubLObject)module0035.UNPROVIDED));
        SubLObject var290 = (SubLObject)module0035.NIL;
        SubLObject var291 = (SubLObject)module0035.NIL;
        SubLObject var292 = (SubLObject)module0035.NIL;
        var290 = var288;
        var291 = var290.first();
        for (var292 = (SubLObject)module0035.ZERO_INTEGER; module0035.NIL == var289 && module0035.NIL != var290; var290 = var290.rest(), var291 = var290.first(), var292 = Numbers.add((SubLObject)module0035.ONE_INTEGER, var292)) {
            if (!var291.eql(Numbers.add(var292, var137))) {
                var289 = (SubLObject)module0035.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == var289);
    }
    
    public static SubLObject f2165() {
        final SubLObject var291 = module0035.$g896$.getGlobalValue();
        if (module0035.NIL != var291) {
            module0034.f1818(var291);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2163(final SubLObject var286, final SubLObject var137) {
        return module0034.f1829(module0035.$g896$.getGlobalValue(), (SubLObject)ConsesLow.list(var286, var137), (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2166(final SubLObject var286, final SubLObject var137) {
        return f2164(var286, var137);
    }
    
    public static SubLObject f2161(final SubLObject var286, final SubLObject var137) {
        SubLObject var287 = module0035.$g896$.getGlobalValue();
        if (module0035.NIL == var287) {
            var287 = module0034.f1934((SubLObject)module0035.$ic93$, (SubLObject)module0035.$ic94$, (SubLObject)module0035.NIL, (SubLObject)module0035.EQL, (SubLObject)module0035.TWO_INTEGER, (SubLObject)module0035.$ic95$);
        }
        final SubLObject var288 = module0034.f1782(var286, var137);
        final SubLObject var289 = module0034.f1814(var287, var288, (SubLObject)module0035.UNPROVIDED);
        if (var289 != module0035.$ic96$) {
            SubLObject var290 = var289;
            SubLObject var291 = (SubLObject)module0035.NIL;
            var291 = var290.first();
            while (module0035.NIL != var290) {
                SubLObject var292 = var291.first();
                final SubLObject var293 = conses_high.second(var291);
                if (var286.eql(var292.first())) {
                    var292 = var292.rest();
                    if (module0035.NIL != var292 && module0035.NIL == var292.rest() && var137.eql(var292.first())) {
                        return module0034.f1959(var293);
                    }
                }
                var290 = var290.rest();
                var291 = var290.first();
            }
        }
        final SubLObject var294 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f2166(var286, var137)));
        module0034.f1836(var287, var288, var289, var294, (SubLObject)ConsesLow.list(var286, var137));
        return module0034.f1959(var294);
    }
    
    public static SubLObject f2167(final SubLObject var239, SubLObject var137) {
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        return f2160(var239, var137);
    }
    
    public static SubLObject f2168(final SubLObject var299, final SubLObject var93, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        SubLObject var300 = (SubLObject)module0035.NIL;
        if (var93.isCons()) {
            if (module0035.NIL == var300) {
                SubLObject var301 = var93.rest();
                SubLObject var302 = (SubLObject)module0035.NIL;
                var302 = var301.first();
                while (module0035.NIL == var300 && module0035.NIL != var301) {
                    if (var302.isCons() && module0035.NIL != Functions.funcall(var6, var302.first(), var299)) {
                        var300 = var93.first();
                    }
                    var301 = var301.rest();
                    var302 = var301.first();
                }
            }
            if (module0035.NIL == var300) {
                SubLObject var301 = var93.rest();
                SubLObject var302 = (SubLObject)module0035.NIL;
                var302 = var301.first();
                while (module0035.NIL == var300 && module0035.NIL != var301) {
                    if (var302.isCons()) {
                        var300 = f2168(var299, var302, var6);
                    }
                    var301 = var301.rest();
                    var302 = var301.first();
                }
            }
        }
        return var300;
    }
    
    public static SubLObject f2169(final SubLObject var4, final SubLObject var8) {
        return module0004.f104(var4, var8, Symbols.symbol_function((SubLObject)module0035.EQ), (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2170(final SubLObject var4, final SubLObject var8) {
        return module0004.f104(var4, var8, Symbols.symbol_function((SubLObject)module0035.$ic97$), (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2171(final SubLObject var4, final SubLObject var8) {
        return module0004.f104(var4, var8, Symbols.symbol_function((SubLObject)module0035.EQUAL), (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2172(final SubLObject var4, final SubLObject var8) {
        return module0004.f104(var4, var8, Symbols.symbol_function((SubLObject)module0035.EQUALP), (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2173(final SubLObject var4, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var6.eql(Symbols.symbol_function((SubLObject)module0035.EQ)) || var6 == module0035.EQ) {
            return f2174(var4, var8);
        }
        if (var6.eql(Symbols.symbol_function((SubLObject)module0035.EQL)) || var6 == module0035.EQL) {
            return f2175(var4, var8);
        }
        if (var6.eql(Symbols.symbol_function((SubLObject)module0035.EQUAL)) || var6 == module0035.EQUAL) {
            return f2176(var4, var8);
        }
        if (var6.eql(Symbols.symbol_function((SubLObject)module0035.EQUALP)) || var6 == module0035.EQUALP) {
            return f2177(var4, var8);
        }
        return f2178(var4, var8, var6);
    }
    
    public static SubLObject f2174(final SubLObject var4, final SubLObject var8) {
        SubLObject var9 = (SubLObject)module0035.NIL;
        SubLObject var10 = (SubLObject)module0035.NIL;
        SubLObject var11;
        SubLObject var12;
        for (var11 = (SubLObject)module0035.NIL, var11 = var8; !var11.isAtom(); var11 = var11.rest()) {
            var12 = var11.first();
            if (var4.eql(var12)) {
                return f2179(var9, var10, var11);
            }
            var9 = var10;
            var10 = var11;
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2175(final SubLObject var4, final SubLObject var8) {
        SubLObject var9 = (SubLObject)module0035.NIL;
        SubLObject var10 = (SubLObject)module0035.NIL;
        SubLObject var11;
        SubLObject var12;
        for (var11 = (SubLObject)module0035.NIL, var11 = var8; !var11.isAtom(); var11 = var11.rest()) {
            var12 = var11.first();
            if (var4.eql(var12)) {
                return f2179(var9, var10, var11);
            }
            var9 = var10;
            var10 = var11;
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2176(final SubLObject var4, final SubLObject var8) {
        SubLObject var9 = (SubLObject)module0035.NIL;
        SubLObject var10 = (SubLObject)module0035.NIL;
        SubLObject var11;
        SubLObject var12;
        for (var11 = (SubLObject)module0035.NIL, var11 = var8; !var11.isAtom(); var11 = var11.rest()) {
            var12 = var11.first();
            if (var4.equal(var12)) {
                return f2179(var9, var10, var11);
            }
            var9 = var10;
            var10 = var11;
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2177(final SubLObject var4, final SubLObject var8) {
        SubLObject var9 = (SubLObject)module0035.NIL;
        SubLObject var10 = (SubLObject)module0035.NIL;
        SubLObject var11;
        SubLObject var12;
        for (var11 = (SubLObject)module0035.NIL, var11 = var8; !var11.isAtom(); var11 = var11.rest()) {
            var12 = var11.first();
            if (var4.equalp(var12)) {
                return f2179(var9, var10, var11);
            }
            var9 = var10;
            var10 = var11;
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2178(final SubLObject var4, final SubLObject var8, final SubLObject var6) {
        SubLObject var9 = (SubLObject)module0035.NIL;
        SubLObject var10 = (SubLObject)module0035.NIL;
        SubLObject var11;
        SubLObject var12;
        for (var11 = (SubLObject)module0035.NIL, var11 = var8; !var11.isAtom(); var11 = var11.rest()) {
            var12 = var11.first();
            if (module0035.NIL != Functions.funcall(var6, var4, var12)) {
                return f2179(var9, var10, var11);
            }
            var9 = var10;
            var10 = var11;
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2179(final SubLObject var301, final SubLObject var302, final SubLObject var303) {
        if (module0035.NIL != var301) {
            ConsesLow.rplacd(var301, var303);
            ConsesLow.rplacd(var302, var303.rest());
            ConsesLow.rplacd(var303, var302);
        }
        return (SubLObject)module0035.T;
    }
    
    public static SubLObject f2180(final SubLObject var13, final SubLObject var14, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        final SubLObject var15 = Sequences.length(var13);
        final SubLObject var16 = Sequences.length(var14);
        final SubLObject var17 = Numbers.numG(var15, var16);
        final SubLObject var18 = (module0035.NIL != var17) ? var14 : var13;
        final SubLObject var19 = (module0035.NIL != var17) ? var13 : var14;
        SubLObject var20 = (SubLObject)module0035.NIL;
        if (var7.eql(Symbols.symbol_function((SubLObject)module0035.IDENTITY)) || var7 == module0035.IDENTITY) {
            if (module0035.NIL == var20) {
                SubLObject var21 = var18;
                SubLObject var22 = (SubLObject)module0035.NIL;
                var22 = var21.first();
                while (module0035.NIL == var20 && module0035.NIL != var21) {
                    if (module0035.NIL != module0004.f104(var22, var19, var6, var7)) {
                        var20 = (SubLObject)module0035.T;
                    }
                    var21 = var21.rest();
                    var22 = var21.first();
                }
            }
        }
        else if (module0035.NIL == var20) {
            SubLObject var21 = var18;
            SubLObject var22 = (SubLObject)module0035.NIL;
            var22 = var21.first();
            while (module0035.NIL == var20 && module0035.NIL != var21) {
                if (module0035.NIL != module0004.f104(Functions.funcall(var7, var22), var19, var6, var7)) {
                    var20 = (SubLObject)module0035.T;
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        return var20;
    }
    
    public static SubLObject f2181(SubLObject var13, SubLObject var14, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.$ic98$);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var7.eql(Symbols.symbol_function((SubLObject)module0035.IDENTITY)) || var7 == module0035.IDENTITY) {
            SubLObject var15 = var13.first();
            SubLObject var16 = var14.first();
            while (module0035.NIL != var13 && module0035.NIL != var14) {
                if (module0035.NIL != Functions.funcall(var6, var15, var16)) {
                    var13 = var13.rest();
                    var15 = var13.first();
                }
                else {
                    if (module0035.NIL == Functions.funcall(var6, var16, var15)) {
                        return (SubLObject)module0035.T;
                    }
                    var14 = var14.rest();
                    var16 = var14.first();
                }
            }
        }
        else {
            SubLObject var15 = Functions.funcall(var7, var13.first());
            SubLObject var16 = Functions.funcall(var7, var14.first());
            while (module0035.NIL != var13 && module0035.NIL != var14) {
                if (module0035.NIL != Functions.funcall(var6, var15, var16)) {
                    var13 = var13.rest();
                    var15 = Functions.funcall(var7, var13.first());
                }
                else {
                    if (module0035.NIL == Functions.funcall(var6, var16, var15)) {
                        return (SubLObject)module0035.T;
                    }
                    var14 = var14.rest();
                    var16 = Functions.funcall(var7, var14.first());
                }
            }
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2182(final SubLObject var313, final SubLObject var15, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.$ic98$);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        final SubLObject var314 = ConsesLow.nth(var15, var313);
        SubLObject var315 = (SubLObject)module0035.NIL;
        SubLObject var316 = (SubLObject)module0035.NIL;
        SubLObject var317 = (SubLObject)module0035.NIL;
        SubLObject var318 = (SubLObject)module0035.NIL;
        var316 = var313;
        var317 = var316.first();
        for (var318 = (SubLObject)module0035.ZERO_INTEGER; module0035.NIL != var316; var316 = var316.rest(), var317 = var316.first(), var318 = Numbers.add((SubLObject)module0035.ONE_INTEGER, var318)) {
            if (module0035.NIL != f2181(var317, var314, var6, var7)) {
                var315 = (SubLObject)ConsesLow.cons(var318, var315);
            }
        }
        return Sequences.nreverse(var315);
    }
    
    public static SubLObject f2183(final SubLObject var315, final SubLObject var316, SubLObject var6, SubLObject var317, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var317 == module0035.UNPROVIDED) {
            var317 = Symbols.symbol_function((SubLObject)module0035.$ic98$);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        final SubLThread var318 = SubLProcess.currentSubLThread();
        SubLObject var319 = var315.rest();
        SubLObject var320 = (SubLObject)module0035.NIL;
        final SubLObject var321 = var7;
        if (var321.eql((SubLObject)module0035.IDENTITY)) {
            var318.resetMultipleValues();
            SubLObject var322 = Equality.identity(var315.first());
            var318.resetMultipleValues();
            if (module0035.NIL == var320) {
                SubLObject var323 = var316;
                SubLObject var324 = (SubLObject)module0035.NIL;
                var324 = var323.first();
                while (module0035.NIL == var320 && module0035.NIL != var323) {
                    final SubLObject var114_321 = var7;
                    if (var114_321.eql((SubLObject)module0035.IDENTITY)) {
                        var318.resetMultipleValues();
                        final SubLObject var325 = Equality.identity(var324);
                        var318.resetMultipleValues();
                        if (module0035.NIL == var322) {
                            var320 = (SubLObject)module0035.T;
                        }
                        else if (module0035.NIL != Functions.funcall(var317, var322, var325)) {
                            var320 = (SubLObject)module0035.T;
                        }
                        else if (module0035.NIL != Functions.funcall(var6, var322, var325)) {
                            var322 = Functions.funcall(var7, var319.first());
                            var319 = var319.rest();
                        }
                    }
                    else {
                        var318.resetMultipleValues();
                        final SubLObject var325 = Functions.funcall(var7, var324);
                        var318.resetMultipleValues();
                        if (module0035.NIL == var322) {
                            var320 = (SubLObject)module0035.T;
                        }
                        else if (module0035.NIL != Functions.funcall(var317, var322, var325)) {
                            var320 = (SubLObject)module0035.T;
                        }
                        else if (module0035.NIL != Functions.funcall(var6, var322, var325)) {
                            var322 = Functions.funcall(var7, var319.first());
                            var319 = var319.rest();
                        }
                    }
                    var323 = var323.rest();
                    var324 = var323.first();
                }
            }
            return Types.sublisp_null(var322);
        }
        var318.resetMultipleValues();
        SubLObject var322 = Functions.funcall(var7, var315.first());
        var318.resetMultipleValues();
        if (module0035.NIL == var320) {
            SubLObject var323 = var316;
            SubLObject var324 = (SubLObject)module0035.NIL;
            var324 = var323.first();
            while (module0035.NIL == var320 && module0035.NIL != var323) {
                final SubLObject var114_322 = var7;
                if (var114_322.eql((SubLObject)module0035.IDENTITY)) {
                    var318.resetMultipleValues();
                    final SubLObject var325 = Equality.identity(var324);
                    var318.resetMultipleValues();
                    if (module0035.NIL == var322) {
                        var320 = (SubLObject)module0035.T;
                    }
                    else if (module0035.NIL != Functions.funcall(var317, var322, var325)) {
                        var320 = (SubLObject)module0035.T;
                    }
                    else if (module0035.NIL != Functions.funcall(var6, var322, var325)) {
                        var322 = Functions.funcall(var7, var319.first());
                        var319 = var319.rest();
                    }
                }
                else {
                    var318.resetMultipleValues();
                    final SubLObject var325 = Functions.funcall(var7, var324);
                    var318.resetMultipleValues();
                    if (module0035.NIL == var322) {
                        var320 = (SubLObject)module0035.T;
                    }
                    else if (module0035.NIL != Functions.funcall(var317, var322, var325)) {
                        var320 = (SubLObject)module0035.T;
                    }
                    else if (module0035.NIL != Functions.funcall(var6, var322, var325)) {
                        var322 = Functions.funcall(var7, var319.first());
                        var319 = var319.rest();
                    }
                }
                var323 = var323.rest();
                var324 = var323.first();
            }
        }
        return Types.sublisp_null(var322);
    }
    
    public static SubLObject f2184(final SubLObject var8, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.$ic99$);
        }
        SubLObject var9 = var8.first();
        SubLObject var10 = var8.rest();
        SubLObject var11 = (SubLObject)module0035.NIL;
        var11 = var10.first();
        while (module0035.NIL != var10) {
            if (module0035.NIL == Functions.funcall(var7, var9, var11)) {
                return (SubLObject)module0035.NIL;
            }
            var9 = var11;
            var10 = var10.rest();
            var11 = var10.first();
        }
        return (SubLObject)module0035.T;
    }
    
    public static SubLObject f2185(final SubLObject var4, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        final SubLObject var9 = conses_high.member(var4, var8, var6, (SubLObject)module0035.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != var9 && module0035.NIL == module0004.f104(var4, var9.rest(), var6, (SubLObject)module0035.UNPROVIDED));
    }
    
    public static SubLObject f2186(final SubLObject var4, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == f1997(var8) || module0035.NIL == Functions.funcall(var6, var4, var8.first()));
    }
    
    public static SubLObject f2187(final SubLObject var4, final SubLObject var8, final SubLObject var15, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        SubLObject var16 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var17 = (SubLObject)module0035.NIL;
        if (module0035.NIL == var17) {
            SubLObject var18 = var8;
            SubLObject var19 = (SubLObject)module0035.NIL;
            var19 = var18.first();
            while (module0035.NIL == var17 && module0035.NIL != var18) {
                if (module0035.NIL != Functions.funcall(var6, var19, var4)) {
                    var16 = Numbers.add(var16, (SubLObject)module0035.ONE_INTEGER);
                    if (var16.numGE(var15)) {
                        var17 = (SubLObject)module0035.T;
                    }
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        return var17;
    }
    
    public static SubLObject f2188(final SubLObject var4, final SubLObject var8, final SubLObject var15, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        SubLObject var16 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var17 = var8;
        SubLObject var18 = (SubLObject)module0035.NIL;
        var18 = var17.first();
        while (module0035.NIL != var17) {
            if (module0035.NIL != Functions.funcall(var6, var18, var4)) {
                var16 = Numbers.add(var16, (SubLObject)module0035.ONE_INTEGER);
                if (var16.numG(var15)) {
                    return (SubLObject)module0035.NIL;
                }
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return Numbers.numE(var16, var15);
    }
    
    public static SubLObject f2189(final SubLObject var4, final SubLObject var8, final SubLObject var15, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        SubLObject var16 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var17 = var8;
        SubLObject var18 = (SubLObject)module0035.NIL;
        var18 = var17.first();
        while (module0035.NIL != var17) {
            if (module0035.NIL != Functions.funcall(var6, var18, var4)) {
                var16 = Numbers.add(var16, (SubLObject)module0035.ONE_INTEGER);
                if (var16.numG(var15)) {
                    return (SubLObject)module0035.NIL;
                }
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return (SubLObject)module0035.T;
    }
    
    public static SubLObject f1997(final SubLObject var8) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var8.isCons() && module0035.NIL == var8.rest());
    }
    
    public static SubLObject f1998(final SubLObject var8) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var8.isCons() && module0035.NIL != var8.rest() && module0035.NIL == conses_high.cddr(var8));
    }
    
    public static SubLObject f1999(final SubLObject var8) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var8.isCons() && module0035.NIL != conses_high.cddr(var8) && module0035.NIL == cdddr(var8));
    }
    
    public static SubLObject f2190(final SubLObject var1, final SubLObject var239, SubLObject var111) {
        if (var111 == module0035.UNPROVIDED) {
            var111 = (SubLObject)module0035.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isList() && module0035.NIL != f1995(var1, var239, var111));
    }
    
    public static SubLObject f2191(final SubLObject var8) {
        return f2192(Symbols.symbol_function((SubLObject)module0035.$ic79$), var8);
    }
    
    public static SubLObject f2193(final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (module0035.NIL != var8) {
            final SubLObject var9 = var8.first();
            SubLObject var10 = var8.rest();
            SubLObject var11 = (SubLObject)module0035.NIL;
            var11 = var10.first();
            while (module0035.NIL != var10) {
                if (module0035.NIL == Functions.funcall(var6, var9, var11)) {
                    return (SubLObject)module0035.NIL;
                }
                var10 = var10.rest();
                var11 = var10.first();
            }
            return (SubLObject)module0035.T;
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2194(final SubLObject var8, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var9 = (SubLObject)module0035.NIL, var10 = (SubLObject)module0035.NIL, var11 = (SubLObject)module0035.NIL, var10 = var8.first(), var11 = var8.rest(); module0035.NIL == var9 && module0035.NIL != var11; var9 = conses_high.member(Functions.funcall(var7, var10), var11, var6, var7), var10 = var11.first(), var11 = var11.rest()) {}
        return var9;
    }
    
    public static SubLObject f2195(final SubLObject var8, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2194(var8, Symbols.symbol_function((SubLObject)module0035.EQUAL), var7);
    }
    
    public static SubLObject f2196(final SubLObject var8, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var9 = (SubLObject)module0035.NIL;
        SubLObject var10 = (SubLObject)module0035.NIL;
        SubLObject var11 = (SubLObject)module0035.NIL;
        var10 = var8.first();
        for (var11 = var8.rest(); module0035.NIL != var11; var11 = var11.rest()) {
            if (module0035.NIL != module0004.f104(Functions.funcall(var7, var10), var11, var6, var7) && module0035.NIL == module0004.f104(var10, var9, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
                var9 = (SubLObject)ConsesLow.cons(var10, var9);
            }
            var10 = var11.first();
        }
        return Sequences.nreverse(var9);
    }
    
    public static SubLObject f2197(final SubLObject var4, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        return f2187(var4, var8, (SubLObject)module0035.TWO_INTEGER, var6);
    }
    
    public static SubLObject f2198(final SubLObject var8, SubLObject var6, SubLObject var329, SubLObject var330) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var329 == module0035.UNPROVIDED) {
            var329 = (SubLObject)module0035.TWO_INTEGER;
        }
        if (var330 == module0035.UNPROVIDED) {
            var330 = (SubLObject)module0035.ONE_INTEGER;
        }
        final SubLThread var331 = SubLProcess.currentSubLThread();
        assert module0035.NIL != f2015(var8) : var8;
        assert module0035.NIL != module0004.f105(var329) : var329;
        if (module0035.NIL == Errors.$ignore_mustsP$.getDynamicValue(var331) && !var329.numG((SubLObject)module0035.ONE_INTEGER)) {
            Errors.error((SubLObject)module0035.$ic100$, var329);
        }
        assert module0035.NIL != module0004.f105(var330) : var330;
        final SubLObject var332 = var8.first();
        if (module0035.NIL == f2197(var332, var8, var6)) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var333 = (SubLObject)module0035.NIL;
        final SubLObject var334 = Sequences.length(var8);
        SubLObject var335 = (SubLObject)module0035.NIL;
        SubLObject var336 = (SubLObject)module0035.NIL;
        SubLObject var337 = (SubLObject)module0035.NIL;
        SubLObject var338 = (SubLObject)module0035.NIL;
        SubLObject var339 = (SubLObject)module0035.NIL;
        var337 = var8;
        var338 = var337.first();
        for (var339 = (SubLObject)module0035.ZERO_INTEGER; module0035.NIL == var335 && module0035.NIL != var337; var337 = var337.rest(), var338 = var337.first(), var339 = Numbers.add((SubLObject)module0035.ONE_INTEGER, var339)) {
            if (var339.isZero()) {
                final SubLObject var340 = Vectors.make_vector((SubLObject)module0035.THREE_INTEGER, (SubLObject)module0035.UNPROVIDED);
                Vectors.set_aref(var340, (SubLObject)module0035.ZERO_INTEGER, (SubLObject)ConsesLow.list(var338));
                Vectors.set_aref(var340, (SubLObject)module0035.ONE_INTEGER, (SubLObject)module0035.ZERO_INTEGER);
                Vectors.set_aref(var340, (SubLObject)module0035.TWO_INTEGER, (SubLObject)module0035.ONE_INTEGER);
                var333 = (SubLObject)ConsesLow.cons(var340, var333);
            }
            else if (module0035.NIL == var333) {
                var335 = (SubLObject)module0035.T;
            }
            else {
                SubLObject var341 = (SubLObject)module0035.NIL;
                SubLObject var342 = (SubLObject)module0035.NIL;
                if (module0035.NIL == var336) {
                    SubLObject var343 = var333;
                    SubLObject var344 = (SubLObject)module0035.NIL;
                    var344 = var343.first();
                    while (module0035.NIL == var336 && module0035.NIL != var343) {
                        var331.resetMultipleValues();
                        final SubLObject var345 = f2199(var344, var338, var339, var8, var334, var6, var329, var330);
                        final SubLObject var346 = var331.secondMultipleValue();
                        var331.resetMultipleValues();
                        final SubLObject var347 = var345;
                        if (var347.eql((SubLObject)module0035.$ic101$)) {
                            var341 = (SubLObject)ConsesLow.cons(var344, var341);
                        }
                        else if (var347.eql((SubLObject)module0035.$ic102$)) {
                            var336 = var344;
                            var335 = (SubLObject)module0035.T;
                        }
                        if (module0035.NIL != var346) {
                            var342 = (SubLObject)ConsesLow.cons(var346, var342);
                        }
                        var343 = var343.rest();
                        var344 = var343.first();
                    }
                }
                SubLObject var348 = var341;
                SubLObject var349 = (SubLObject)module0035.NIL;
                var349 = var348.first();
                while (module0035.NIL != var348) {
                    var333 = Sequences.delete(var349, var333, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
                    var348 = var348.rest();
                    var349 = var348.first();
                }
                var348 = var342;
                SubLObject var350 = (SubLObject)module0035.NIL;
                var350 = var348.first();
                while (module0035.NIL != var348) {
                    var333 = (SubLObject)ConsesLow.cons(var350, var333);
                    var348 = var348.rest();
                    var350 = var348.first();
                }
            }
        }
        return (SubLObject)((module0035.NIL != var336) ? Vectors.aref(var336, (SubLObject)module0035.ZERO_INTEGER) : module0035.NIL);
    }
    
    public static SubLObject f2199(final SubLObject var118, final SubLObject var4, final SubLObject var113, final SubLObject var8, final SubLObject var239, final SubLObject var6, final SubLObject var329, final SubLObject var330) {
        final SubLObject var331 = Vectors.aref(var118, (SubLObject)module0035.ZERO_INTEGER);
        final SubLObject var332 = Vectors.aref(var118, (SubLObject)module0035.ONE_INTEGER);
        final SubLObject var333 = Vectors.aref(var118, (SubLObject)module0035.TWO_INTEGER);
        SubLObject var334 = (SubLObject)module0035.$ic101$;
        SubLObject var335 = (SubLObject)module0035.NIL;
        if (var332.isZero() && var239.numGE(Numbers.multiply(var329, module0048.f_1X(Sequences.length(var331))))) {
            var335 = Vectors.make_vector((SubLObject)module0035.THREE_INTEGER, (SubLObject)module0035.UNPROVIDED);
            Vectors.set_aref(var335, (SubLObject)module0035.ZERO_INTEGER, f2124(module0048.f_1X(var113), var8));
            Vectors.set_aref(var335, (SubLObject)module0035.ONE_INTEGER, (SubLObject)module0035.ZERO_INTEGER);
            Vectors.set_aref(var335, (SubLObject)module0035.TWO_INTEGER, module0048.f_1X(Sequences.length(var331)));
        }
        if (var332.isZero()) {
            if (module0035.NIL != f2000(var331, var330, (SubLObject)module0035.UNPROVIDED) && module0035.NIL != Functions.funcall(var6, var4, var331.first())) {
                Vectors.set_aref(var118, (SubLObject)module0035.ONE_INTEGER, (SubLObject)module0035.ONE_INTEGER);
                Vectors.set_aref(var118, (SubLObject)module0035.TWO_INTEGER, (SubLObject)module0035.ONE_INTEGER);
                var334 = (SubLObject)module0035.$ic103$;
            }
        }
        else if (module0035.ONE_INTEGER.eql(Numbers.subtract(Sequences.length(var331), var333)) && module0035.NIL != Functions.funcall(var6, var4, f2114(var331))) {
            Vectors.set_aref(var118, (SubLObject)module0035.ONE_INTEGER, Numbers.add(Vectors.aref(var118, (SubLObject)module0035.ONE_INTEGER), (SubLObject)module0035.ONE_INTEGER));
            Vectors.set_aref(var118, (SubLObject)module0035.TWO_INTEGER, (SubLObject)module0035.ZERO_INTEGER);
            if (module0048.f_1X(var332).numGE(var329)) {
                var334 = (SubLObject)module0035.$ic102$;
            }
            else {
                var334 = (SubLObject)module0035.$ic103$;
            }
        }
        else if (module0035.NIL != Functions.funcall(var6, var4, ConsesLow.nth(var333, var331))) {
            Vectors.set_aref(var118, (SubLObject)module0035.TWO_INTEGER, Numbers.add(Vectors.aref(var118, (SubLObject)module0035.TWO_INTEGER), (SubLObject)module0035.ONE_INTEGER));
            var334 = (SubLObject)module0035.$ic103$;
        }
        return Values.values(var334, var335);
    }
    
    public static SubLObject f2200(final SubLObject var308, final SubLObject var309, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        SubLObject var310 = (SubLObject)module0035.NIL;
        SubLObject var311 = (SubLObject)module0035.NIL;
        if (!Sequences.length(var308).eql(Sequences.length(var309))) {
            var311 = (SubLObject)module0035.T;
        }
        if (module0035.NIL == var311) {
            SubLObject var312 = var308;
            SubLObject var313 = (SubLObject)module0035.NIL;
            var313 = var312.first();
            while (module0035.NIL != var312) {
                if (!Sequences.count(var313, var308, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED).eql(Sequences.count(var313, var309, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED))) {
                    var311 = (SubLObject)module0035.T;
                }
                var312 = var312.rest();
                var313 = var312.first();
            }
        }
        if (module0035.NIL == var311) {
            var310 = f2201(var308, var309, var6);
        }
        return var310;
    }
    
    public static SubLObject f2201(final SubLObject var308, final SubLObject var309, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(var308.equal(var309) || (module0035.NIL != conses_high.subsetp(var308, var309, var6, (SubLObject)module0035.UNPROVIDED) && module0035.NIL != conses_high.subsetp(var309, var308, var6, (SubLObject)module0035.UNPROVIDED)));
    }
    
    public static SubLObject f2202(final SubLObject var342, final SubLObject var343, SubLObject var344) {
        if (var344 == module0035.UNPROVIDED) {
            var344 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        SubLObject var345 = var343;
        SubLObject var346 = (SubLObject)module0035.NIL;
        var346 = var345.first();
        while (module0035.NIL != var345) {
            if (module0035.NIL != f2201(var342, var346, var344)) {
                return (SubLObject)module0035.T;
            }
            var345 = var345.rest();
            var346 = var345.first();
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2203(final SubLObject var343, final SubLObject var342, SubLObject var344) {
        if (var344 == module0035.UNPROVIDED) {
            var344 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        return f2202(var342, var343, var344);
    }
    
    public static SubLObject f2204(final SubLObject var308, final SubLObject var309) {
        return f2201(var308, var309, Symbols.symbol_function((SubLObject)module0035.EQUALP));
    }
    
    public static SubLObject f2205(final SubLObject var308, final SubLObject var309, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != f2206(var308, var309, var6) && module0035.NIL != f2206(var309, var308, var6));
    }
    
    public static SubLObject f2206(final SubLObject var13, final SubLObject var14, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0035.NIL != f1993(var13, module0035.$g892$.getDynamicValue(var15), (SubLObject)module0035.UNPROVIDED) && module0035.NIL != f1993(var14, module0035.$g892$.getDynamicValue(var15), (SubLObject)module0035.UNPROVIDED)) {
            return conses_high.subsetp(var13, var14, var6, (SubLObject)module0035.UNPROVIDED);
        }
        final SubLObject var16 = Sequences.length(var13);
        final SubLObject var17 = Sequences.length(var14);
        if (!var16.numLE(var17)) {
            return (SubLObject)module0035.NIL;
        }
        final SubLObject var18 = module0030.f1635(var14, var6, var17, (SubLObject)module0035.UNPROVIDED);
        SubLObject var19 = var13;
        SubLObject var20 = (SubLObject)module0035.NIL;
        var20 = var19.first();
        while (module0035.NIL != var19) {
            if (module0035.NIL == Hashtables.gethash(var20, var18, (SubLObject)module0035.UNPROVIDED)) {
                return (SubLObject)module0035.NIL;
            }
            var19 = var19.rest();
            var20 = var19.first();
        }
        return (SubLObject)module0035.T;
    }
    
    public static SubLObject f2207(final SubLObject var13, final SubLObject var14) {
        return f2206(var13, var14, Symbols.symbol_function((SubLObject)module0035.EQUAL));
    }
    
    public static SubLObject f2208(final SubLObject var13, final SubLObject var14, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        return f2206(var14, var13, var6);
    }
    
    public static SubLObject f2209(final SubLObject var13, final SubLObject var14) {
        return f2208(var13, var14, Symbols.symbol_function((SubLObject)module0035.EQUAL));
    }
    
    public static SubLObject f2210(final SubLObject var308, final SubLObject var309) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != conses_high.subsetp(var308, var309, Symbols.symbol_function((SubLObject)module0035.EQUAL), (SubLObject)module0035.UNPROVIDED) && module0035.NIL != conses_high.subsetp(var309, var308, Symbols.symbol_function((SubLObject)module0035.EQUAL), (SubLObject)module0035.UNPROVIDED));
    }
    
    public static SubLObject f2211(final SubLObject var347, final SubLObject var348, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return conses_high.subsetp(var347, var348, Symbols.symbol_function((SubLObject)module0035.EQUAL), var7);
    }
    
    public static SubLObject f2212(final SubLObject var13, final SubLObject var14, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return conses_high.subsetp(var14, var13, var6, var7);
    }
    
    public static SubLObject f2213(final SubLObject var308, final SubLObject var309, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var310 = (SubLObject)module0035.NIL;
        if (module0035.NIL == var310) {
            SubLObject var311;
            SubLObject var312;
            for (var311 = var308, var312 = (SubLObject)module0035.NIL, var312 = var311.first(); module0035.NIL == var310 && module0035.NIL != var311; var310 = (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == module0004.f104(var312, var309, var6, var7)), var311 = var311.rest(), var312 = var311.first()) {}
        }
        return var310;
    }
    
    public static SubLObject f2214(final SubLObject var349, final SubLObject var350) {
        if (var349.equal(var350)) {
            return (SubLObject)module0035.T;
        }
        if (var349.isCons() && var350.isCons()) {
            return f2201(var349, var350, (SubLObject)module0035.$ic104$);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2215(final SubLObject var13, final SubLObject var14, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var15 = (SubLObject)module0035.NIL;
        SubLObject var16 = var13;
        SubLObject var17 = (SubLObject)module0035.NIL;
        var17 = var16.first();
        while (module0035.NIL != var16) {
            final SubLObject var18 = var17;
            if (module0035.NIL == conses_high.member(var18, var15, var6, var7)) {
                var15 = (SubLObject)ConsesLow.cons(var18, var15);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        var16 = var14;
        var17 = (SubLObject)module0035.NIL;
        var17 = var16.first();
        while (module0035.NIL != var16) {
            final SubLObject var18 = var17;
            if (module0035.NIL == conses_high.member(var18, var15, var6, var7)) {
                var15 = (SubLObject)ConsesLow.cons(var18, var15);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f2216(final SubLObject var308, final SubLObject var309, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var310 = (SubLObject)module0035.NIL;
        SubLObject var311 = var309;
        SubLObject var312 = (SubLObject)module0035.NIL;
        var312 = var311.first();
        while (module0035.NIL != var311) {
            if (module0035.NIL == module0004.f104(var312, var308, var6, var7)) {
                var310 = (SubLObject)ConsesLow.cons(var312, var310);
            }
            var311 = var311.rest();
            var312 = var311.first();
        }
        return ConsesLow.append(var308, Sequences.nreverse(var310));
    }
    
    public static SubLObject f2217(final SubLObject var343, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var344 = var343.first();
        SubLObject var345 = var343.rest();
        SubLObject var346 = (SubLObject)module0035.NIL;
        var346 = var345.first();
        while (module0035.NIL != var345) {
            var344 = conses_high.union(var346, var344, var6, var7);
            var345 = var345.rest();
            var346 = var345.first();
        }
        return var344;
    }
    
    public static SubLObject f2218(final SubLObject var13, final SubLObject var14, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var15 = (SubLObject)module0035.NIL;
        SubLObject var16 = var13;
        SubLObject var17 = (SubLObject)module0035.NIL;
        var17 = var16.first();
        while (module0035.NIL != var16) {
            if (module0035.NIL == module0004.f104(var17, var14, var6, var7)) {
                var15 = (SubLObject)ConsesLow.cons(var17, var15);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f2219(final SubLObject var13, final SubLObject var14, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        return module0030.f1619(module0030.f1635(var13, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED), module0030.f1635(var14, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED));
    }
    
    public static SubLObject f2220(final SubLObject var13, final SubLObject var14, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0035.NIL != f1994(var13, module0035.$g892$.getDynamicValue(var15), (SubLObject)module0035.UNPROVIDED) && module0035.NIL != f1994(var14, module0035.$g892$.getDynamicValue(var15), (SubLObject)module0035.UNPROVIDED)) {
            return conses_high.set_difference(var13, var14, var6, (SubLObject)module0035.UNPROVIDED);
        }
        return f2219(var13, var14, var6);
    }
    
    public static SubLObject f2221(final SubLObject var8, final SubLObject var351, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = (SubLObject)module0035.IDENTITY;
        }
        assert module0035.NIL != Types.listp(var8) : var8;
        assert module0035.NIL != module0004.f85(var351) : var351;
        assert module0035.NIL != module0004.f85(var7) : var7;
        SubLObject var352 = (SubLObject)ConsesLow.list(var8.first());
        SubLObject var353 = (SubLObject)module0035.NIL;
        SubLObject var354 = var8.rest();
        SubLObject var355 = (SubLObject)module0035.NIL;
        var355 = var354.first();
        while (module0035.NIL != var354) {
            if (module0035.NIL != Functions.funcall(var351, Functions.funcall(var7, var355), Functions.funcall(var7, var352.first()))) {
                var352 = (SubLObject)ConsesLow.cons(var355, var352);
                var353 = (SubLObject)module0035.T;
            }
            else {
                var353 = (SubLObject)module0035.NIL;
                SubLObject var356 = (SubLObject)module0035.NIL;
                SubLObject var357 = (SubLObject)module0035.NIL;
                var356 = (SubLObject)module0035.NIL;
                for (var357 = var352; module0035.NIL == var353 && module0035.NIL != var357; var357 = var357.rest()) {
                    if (module0035.NIL != Functions.funcall(var351, Functions.funcall(var7, var355), Functions.funcall(var7, var357.first()))) {
                        ConsesLow.rplacd(var356, (SubLObject)ConsesLow.cons(var355, var357));
                        var353 = (SubLObject)module0035.T;
                    }
                    var356 = var357;
                }
            }
            if (module0035.NIL == var353) {
                var352 = ConsesLow.append(var352, (SubLObject)ConsesLow.list(var355));
            }
            var354 = var354.rest();
            var355 = var354.first();
        }
        return var352;
    }
    
    public static SubLObject f2105(final SubLObject var8) {
        assert module0035.NIL != Types.listp(var8) : var8;
        final SubLObject var9 = Vectors.make_vector(Sequences.length(var8), (SubLObject)module0035.UNPROVIDED);
        SubLObject var10 = (SubLObject)module0035.NIL;
        SubLObject var11 = (SubLObject)module0035.NIL;
        SubLObject var12 = (SubLObject)module0035.NIL;
        var10 = var8;
        var11 = var10.first();
        for (var12 = (SubLObject)module0035.ZERO_INTEGER; module0035.NIL != var10; var10 = var10.rest(), var11 = var10.first(), var12 = Numbers.add((SubLObject)module0035.ONE_INTEGER, var12)) {
            Vectors.set_aref(var9, var12, var11);
        }
        return var9;
    }
    
    public static SubLObject f2222(final SubLObject var238) {
        SubLObject var239 = (SubLObject)module0035.NIL;
        final SubLObject var240 = (SubLObject)module0035.T;
        SubLObject var241;
        SubLObject var242;
        SubLObject var243;
        SubLObject var244;
        for (var241 = Sequences.length(var238), var242 = (SubLObject)module0035.NIL, var242 = (SubLObject)module0035.ZERO_INTEGER; var242.numL(var241); var242 = Numbers.add(var242, (SubLObject)module0035.ONE_INTEGER)) {
            var243 = ((module0035.NIL != var240) ? Numbers.subtract(var241, var242, (SubLObject)module0035.ONE_INTEGER) : var242);
            var244 = Vectors.aref(var238, var243);
            var239 = (SubLObject)ConsesLow.cons(var244, var239);
        }
        return var239;
    }
    
    public static SubLObject f2223(final SubLObject var8, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQUAL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        assert module0035.NIL != Types.listp(var8) : var8;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == f2194(var8, var6, var7));
    }
    
    public static SubLObject f2224(final SubLObject var118, final SubLObject var151) {
        assert module0035.NIL != Types.sequencep(var118) : var118;
        if (var118.isList()) {
            SubLObject var152 = (SubLObject)module0035.NIL;
            SubLObject var153 = var151;
            SubLObject var154 = (SubLObject)module0035.NIL;
            var154 = var153.first();
            while (module0035.NIL != var153) {
                var152 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var154, var118), var152);
                var153 = var153.rest();
                var154 = var153.first();
            }
            return Sequences.nreverse(var152);
        }
        if (var118.isVector()) {
            final SubLObject var152 = Vectors.make_vector(Sequences.length(var151), (SubLObject)module0035.UNPROVIDED);
            SubLObject var155 = (SubLObject)module0035.NIL;
            SubLObject var154 = (SubLObject)module0035.NIL;
            SubLObject var156 = (SubLObject)module0035.NIL;
            var155 = var151;
            var154 = var155.first();
            for (var156 = (SubLObject)module0035.ZERO_INTEGER; module0035.NIL != var155; var155 = var155.rest(), var154 = var155.first(), var156 = Numbers.add((SubLObject)module0035.ONE_INTEGER, var156)) {
                Vectors.set_aref(var152, var156, Vectors.aref(var118, var154));
            }
            return var152;
        }
        SubLObject var152 = Strings.make_string(Sequences.length(var151), (SubLObject)module0035.UNPROVIDED);
        SubLObject var155 = (SubLObject)module0035.NIL;
        SubLObject var154 = (SubLObject)module0035.NIL;
        SubLObject var156 = (SubLObject)module0035.NIL;
        var155 = var151;
        var154 = var155.first();
        for (var156 = (SubLObject)module0035.ZERO_INTEGER; module0035.NIL != var155; var155 = var155.rest(), var154 = var155.first(), var156 = Numbers.add((SubLObject)module0035.ONE_INTEGER, var156)) {
            Strings.set_char(var152, var156, Strings.sublisp_char(var118, var154));
        }
        return var152;
    }
    
    public static SubLObject f2225(final SubLObject var357, final SubLObject var358) {
        return f2220(var357, var358, (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2226(final SubLObject var13, final SubLObject var14, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var15 = (SubLObject)module0035.NIL;
        SubLObject var16 = var13;
        SubLObject var17 = (SubLObject)module0035.NIL;
        var17 = var16.first();
        while (module0035.NIL != var16) {
            if (module0035.NIL != Sequences.find(var17, var14, var6, var7, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
                var15 = (SubLObject)ConsesLow.cons(var17, var15);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f2227(final SubLObject var313, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var314 = var313.first();
        SubLObject var315 = var313.rest();
        SubLObject var316 = (SubLObject)module0035.NIL;
        var316 = var315.first();
        while (module0035.NIL != var315) {
            var314 = conses_high.intersection(var314, var316, var6, var7);
            var315 = var315.rest();
            var316 = var315.first();
        }
        return var314;
    }
    
    public static SubLObject f2228(final SubLObject var313, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var314 = (SubLObject)module0035.NIL;
        SubLObject var315 = var313;
        SubLObject var316 = (SubLObject)module0035.NIL;
        var316 = var315.first();
        while (module0035.NIL != var315) {
            final SubLObject var317 = (var7.eql(Symbols.symbol_function((SubLObject)module0035.IDENTITY)) || var7 == module0035.IDENTITY) ? var316 : Mapping.mapcar(var7, var316);
            var314 = (SubLObject)ConsesLow.cons(module0078.f5367(var317, var6, (SubLObject)module0035.UNPROVIDED), var314);
            var315 = var315.rest();
            var316 = var315.first();
        }
        return module0077.f5312(module0078.f5351(var314, var6));
    }
    
    public static SubLObject f2229(final SubLObject var191, final SubLObject var180) {
        if (module0035.NIL != f2004(var191, var180)) {
            return conses_high.pairlis(var191, var180, (SubLObject)module0035.UNPROVIDED);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2230(final SubLObject var5) {
        return Mapping.mapcar((SubLObject)module0035.$ic106$, var5);
    }
    
    public static SubLObject f2231(final SubLObject var9) {
        return (SubLObject)ConsesLow.cons(var9.rest(), var9.first());
    }
    
    public static SubLObject f2232(final SubLObject var362) {
        return (SubLObject)ConsesLow.list(conses_high.second(var362), var362.first());
    }
    
    public static SubLObject f2233(final SubLObject var363, final SubLObject var364, final SubLObject var118) {
        final SubLObject var365 = Sequences.search(var364, var118, Symbols.symbol_function((SubLObject)module0035.EQUAL), (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL != var365) {
            return f2234(var363, var364, var365, var118);
        }
        return var118;
    }
    
    public static SubLObject f2234(final SubLObject var363, final SubLObject var364, final SubLObject var365, final SubLObject var118) {
        final SubLObject var366 = Sequences.length(var364);
        if (var365.numG((SubLObject)module0035.ZERO_INTEGER)) {
            ConsesLow.rplacd(conses_high.nthcdr(Numbers.subtract(var365, (SubLObject)module0035.ONE_INTEGER), var118), ConsesLow.append(var363, conses_high.nthcdr(Numbers.add(var365, var366), var118)));
            return f2233(var363, var364, var118);
        }
        return f2233(var363, var364, ConsesLow.append(var363, conses_high.nthcdr(Numbers.add(var365, var366), var118)));
    }
    
    public static SubLObject f2235(final SubLObject var13, final SubLObject var14, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQUAL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0035.NIL == var13) {
            return Values.values((SubLObject)module0035.NIL, var14);
        }
        if (module0035.NIL == var14) {
            return Values.values(var13, (SubLObject)module0035.NIL);
        }
        if (module0035.NIL != conses_high.member(Functions.funcall(var7, var13.first()), var14, var6, var7)) {
            return f2235(var13.rest(), Sequences.remove(Functions.funcall(var7, var13.first()), var14, var6, var7, (SubLObject)module0035.ZERO_INTEGER, (SubLObject)module0035.NIL, (SubLObject)module0035.ONE_INTEGER), var6, var7);
        }
        var15.resetMultipleValues();
        final SubLObject var16 = f2235(var13.rest(), var14, var6, var7);
        final SubLObject var17 = var15.secondMultipleValue();
        var15.resetMultipleValues();
        return Values.values((SubLObject)ConsesLow.cons(var13.first(), var16), var17);
    }
    
    public static SubLObject f2236(final SubLObject var313) {
        if (!Sequences.length(var313).numG((SubLObject)module0035.ONE_INTEGER)) {
            return (SubLObject)module0035.NIL;
        }
        final SubLObject var314 = var313.first();
        final SubLObject var315 = var313.rest();
        SubLObject var316 = (SubLObject)module0035.NIL;
        SubLObject var317 = var315;
        SubLObject var318 = (SubLObject)module0035.NIL;
        var318 = var317.first();
        while (module0035.NIL != var317) {
            final SubLObject var319 = f2237(var314, var318);
            if (module0035.NIL == var319) {
                return (SubLObject)module0035.NIL;
            }
            if (module0035.NIL == var316) {
                var316 = var319;
            }
            else if (!var319.equal(var316)) {
                return (SubLObject)module0035.NIL;
            }
            var317 = var317.rest();
            var318 = var317.first();
        }
        return var316;
    }
    
    public static SubLObject f2237(final SubLObject var13, final SubLObject var14) {
        if (!Sequences.length(var13).equal(Sequences.length(var14))) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var15 = (SubLObject)module0035.NIL;
        SubLObject var16 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var17 = (SubLObject)module0035.NIL;
        SubLObject var371_372 = (SubLObject)module0035.NIL;
        SubLObject var18 = (SubLObject)module0035.NIL;
        SubLObject var374_375 = (SubLObject)module0035.NIL;
        var17 = var13;
        var371_372 = var17.first();
        var18 = var14;
        var374_375 = var18.first();
        while (module0035.NIL != var18 || module0035.NIL != var17) {
            if (!var371_372.equal(var374_375)) {
                var15 = (SubLObject)ConsesLow.cons(var16, var15);
            }
            if (Sequences.length(var15).numG((SubLObject)module0035.ONE_INTEGER)) {
                return (SubLObject)module0035.NIL;
            }
            var16 = Numbers.add(var16, (SubLObject)module0035.ONE_INTEGER);
            var17 = var17.rest();
            var371_372 = var17.first();
            var18 = var18.rest();
            var374_375 = var18.first();
        }
        if (module0035.NIL != var15) {
            return var15.first();
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2238(final SubLObject var171, final SubLObject var376, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQUAL);
        }
        if (var376.equalp((SubLObject)module0035.NIL)) {
            return var8;
        }
        final SubLObject var377 = Sequences.length(var8);
        final SubLObject var378 = Sequences.length(var376);
        final SubLObject var379 = Sequences.search(var376, var8, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
        final SubLObject var380 = (SubLObject)((module0035.NIL != var379) ? Sequences.subseq(var8, (SubLObject)module0035.ZERO_INTEGER, var379) : module0035.NIL);
        final SubLObject var381 = (module0035.NIL != var379) ? Sequences.subseq(var8, Numbers.add(var378, var379), var377) : var8;
        if (module0035.NIL != var379) {
            return ConsesLow.append(var380, var171, f2238(var171, var376, var381, (SubLObject)module0035.UNPROVIDED));
        }
        return var8;
    }
    
    public static SubLObject f2239(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isAtom() && (module0035.NIL == var1 || module0035.T == var1 || var1.isKeyword() || !var1.isSymbol()));
    }
    
    public static SubLObject f2240(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != f1998(var1) && module0035.$ic107$ == var1.first());
    }
    
    public static SubLObject f2070(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isAtom() || module0035.NIL != f2240(var1));
    }
    
    public static SubLObject f2241(final SubLObject var1) {
        if (module0035.NIL != f2239(var1)) {
            return var1;
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0035.$ic107$, var1);
    }
    
    public static SubLObject f2242(final SubLObject var1) {
        if (module0035.NIL != f2240(var1)) {
            return conses_high.second(var1);
        }
        return var1;
    }
    
    public static SubLObject f2243(final SubLObject var4, final SubLObject var380, SubLObject var6, SubLObject var178, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = (SubLObject)module0035.$ic108$;
        }
        if (var178 == module0035.UNPROVIDED) {
            var178 = (SubLObject)module0035.$ic109$;
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.$ic110$);
        }
        if (var7.eql(Symbols.symbol_function((SubLObject)module0035.$ic110$)) || var7 == module0035.$ic110$) {
            if (module0035.NIL == var380) {
                return (SubLObject)ConsesLow.list(var4);
            }
            if (module0035.NIL != Functions.funcall(var6, Symbols.symbol_name(var4), Symbols.symbol_name(var380.first()))) {
                return var380;
            }
            if (module0035.NIL != Functions.funcall(var178, Symbols.symbol_name(var4), Symbols.symbol_name(var380.first()))) {
                return (SubLObject)ConsesLow.cons(var4, var380);
            }
            return (SubLObject)ConsesLow.cons(var380.first(), f2243(var4, var380.rest(), var6, var178, (SubLObject)module0035.UNPROVIDED));
        }
        else {
            if (module0035.NIL == var380) {
                return (SubLObject)ConsesLow.list(var4);
            }
            if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var4), Functions.funcall(var7, var380.first()))) {
                return var380;
            }
            if (module0035.NIL != Functions.funcall(var178, Functions.funcall(var7, var4), Functions.funcall(var7, var380.first()))) {
                return (SubLObject)ConsesLow.cons(var4, var380);
            }
            return (SubLObject)ConsesLow.cons(var380.first(), f2243(var4, var380.rest(), var6, var178, var7));
        }
    }
    
    public static SubLObject f2244(final SubLObject var4, final SubLObject var380, final SubLObject var178, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2245(var4, var380, var178, var7);
    }
    
    public static SubLObject f2245(final SubLObject var1, SubLObject var380, final SubLObject var178, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        assert module0035.NIL != Types.listp(var380) : var380;
        final SubLObject var381 = Functions.funcall(var7, var1);
        SubLObject var382 = (SubLObject)module0035.NIL;
        SubLObject var383 = (SubLObject)module0035.NIL;
        var382 = (SubLObject)module0035.NIL;
        for (var383 = var380; module0035.NIL != var383; var383 = var383.rest()) {
            final SubLObject var384 = var383.first();
            final SubLObject var385 = Functions.funcall(var7, var384);
            if (module0035.NIL != Functions.funcall(var178, var381, var385)) {
                if (module0035.NIL != var382) {
                    ConsesLow.rplacd(var382, (SubLObject)ConsesLow.cons(var1, var383));
                }
                else {
                    var380 = (SubLObject)ConsesLow.cons(var1, var380);
                }
                return var380;
            }
            var382 = var383;
        }
        if (module0035.NIL != var382) {
            ConsesLow.rplacd(var382, (SubLObject)ConsesLow.cons(var1, var383));
        }
        else {
            var380 = (SubLObject)ConsesLow.cons(var1, var380);
        }
        return var380;
    }
    
    public static SubLObject f2246(final SubLObject var4, final SubLObject var380, final SubLObject var178, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2245(var4, conses_high.copy_list(var380), var178, var7);
    }
    
    public static SubLObject f2247(final SubLObject var226, final SubLObject var384, final SubLObject var118, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var385 = var118;
        SubLObject var386 = (SubLObject)module0035.NIL;
        var386 = var385.first();
        while (module0035.NIL != var385) {
            if (module0035.NIL != Functions.funcall(var6, var226, var386)) {
                return (SubLObject)module0035.T;
            }
            if (module0035.NIL != module0004.f104(var386, var384, var6, var7)) {
                return (SubLObject)module0035.NIL;
            }
            var385 = var385.rest();
            var386 = var385.first();
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2248(final SubLObject var386) {
        assert module0035.NIL != Types.listp(var386) : var386;
        if (module0035.NIL != module0004.f104((SubLObject)module0035.$ic119$, var386, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
            return (SubLObject)module0035.NIL;
        }
        final SubLObject var387 = Sequences.length(var386);
        if (module0035.NIL != module0004.f104((SubLObject)module0035.$ic62$, var386, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
            return Numbers.subtract(var387, (SubLObject)module0035.ONE_INTEGER);
        }
        return var387;
    }
    
    public static SubLObject f2249(final SubLObject var386) {
        assert module0035.NIL != Types.listp(var386) : var386;
        SubLObject var387 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var388 = var386;
        SubLObject var389 = (SubLObject)module0035.NIL;
        var389 = var388.first();
        while (module0035.NIL != var388) {
            if (module0035.NIL != module0004.f104(var389, (SubLObject)module0035.$ic120$, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
                return var387;
            }
            var387 = Numbers.add(var387, (SubLObject)module0035.ONE_INTEGER);
            var388 = var388.rest();
            var389 = var388.first();
        }
        return var387;
    }
    
    public static SubLObject f2250(final SubLObject var389, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQUAL);
        }
        SubLObject var390 = (SubLObject)module0035.NIL;
        SubLObject var391 = var389;
        SubLObject var392 = (SubLObject)module0035.NIL;
        var392 = var391.first();
        while (module0035.NIL != var391) {
            if (module0035.NIL == f2251(var392, var6)) {
                var390 = (SubLObject)ConsesLow.cons(var392, var390);
            }
            var391 = var391.rest();
            var392 = var391.first();
        }
        return Sequences.nreverse(var390);
    }
    
    public static SubLObject f2251(final SubLObject var390, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQUAL);
        }
        if (!var390.equal((SubLObject)module0035.$ic121$)) {
            return Functions.funcall(var6, var390.first(), var390.rest());
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2252(final SubLObject var23, final SubLObject var389, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return conses_high.assoc(var23, var389, var6, var7).rest();
    }
    
    public static SubLObject f2253(final SubLObject var23, final SubLObject var389, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return Sequences.remove(conses_high.assoc(var23, var389, var6, var7), var389, Symbols.symbol_function((SubLObject)module0035.EQUAL), (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2254(final SubLObject var23, final SubLObject var391) {
        SubLObject var392 = (SubLObject)module0035.NIL;
        SubLObject var393 = var391;
        SubLObject var394 = (SubLObject)module0035.NIL;
        var394 = var393.first();
        while (module0035.NIL != var393) {
            final SubLObject var395 = conses_high.assoc(var23, var394, Symbols.symbol_function((SubLObject)module0035.EQUAL), (SubLObject)module0035.UNPROVIDED).rest();
            if (module0035.NIL != var395) {
                final SubLObject var396 = var395;
                if (module0035.NIL == conses_high.member(var396, var392, Symbols.symbol_function((SubLObject)module0035.EQUAL), Symbols.symbol_function((SubLObject)module0035.IDENTITY))) {
                    var392 = (SubLObject)ConsesLow.cons(var396, var392);
                }
            }
            var393 = var393.rest();
            var394 = var393.first();
        }
        return var392;
    }
    
    public static SubLObject f2255(final SubLObject var124) {
        SubLObject var125 = (SubLObject)module0035.NIL;
        if (var124.isCons() && module0035.NIL != module0201.f12546(var124.first())) {
            var125 = (SubLObject)module0035.T;
        }
        return var125;
    }
    
    public static SubLObject f2256(final SubLObject var394, final SubLObject var389) {
        SubLObject var395 = (SubLObject)module0035.NIL;
        SubLObject var396 = var389;
        SubLObject var397 = (SubLObject)module0035.NIL;
        var397 = var396.first();
        while (module0035.NIL != var396) {
            final SubLObject var398 = f2257(var397, (SubLObject)module0035.$ic122$, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
            SubLObject var399 = (SubLObject)module0035.NIL;
            SubLObject var38_398 = var394;
            SubLObject var400 = (SubLObject)module0035.NIL;
            var400 = var38_398.first();
            while (module0035.NIL != var38_398) {
                final SubLObject var401 = conses_high.assoc(var400, var398, Symbols.symbol_function((SubLObject)module0035.EQUAL), (SubLObject)module0035.UNPROVIDED).rest();
                if (module0035.NIL != var401) {
                    var399 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0035.NIL, (SubLObject)module0035.$ic123$, var400, var401), var399);
                }
                var38_398 = var38_398.rest();
                var400 = var38_398.first();
            }
            if (module0035.NIL != var399) {
                var395 = (SubLObject)ConsesLow.cons(var399, var395);
            }
            var396 = var396.rest();
            var397 = var396.first();
        }
        return var395;
    }
    
    public static SubLObject f2258(final SubLObject var6, final SubLObject var400, final SubLObject var1, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var1))) {
            Functions.funcall(var400, var1);
        }
        else if (var1.isCons()) {
            f2258(var6, var400, var1.first(), var7);
            f2258(var6, var400, var1.rest(), var7);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2259(final SubLObject var6, final SubLObject var1, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var1))) {
            return var1;
        }
        if (var1.isCons()) {
            SubLObject var8 = (SubLObject)module0035.NIL;
            SubLObject var9 = var1;
            SubLObject var10 = (SubLObject)module0035.NIL;
            var10 = var9.first();
            while (module0035.NIL != var9) {
                if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var10))) {
                    var8 = (SubLObject)ConsesLow.cons(var10, var8);
                }
                else if (var10.isCons()) {
                    SubLObject var38_401 = f2259(var6, var10, var7);
                    SubLObject var11 = (SubLObject)module0035.NIL;
                    var11 = var38_401.first();
                    while (module0035.NIL != var38_401) {
                        var8 = (SubLObject)ConsesLow.cons(var11, var8);
                        var38_401 = var38_401.rest();
                        var11 = var38_401.first();
                    }
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
            return Sequences.nreverse(var8);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2260(final SubLObject var6, final SubLObject var1, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var1))) {
            return (SubLObject)module0035.NIL;
        }
        if (var1.isCons()) {
            return Sequences.remove((SubLObject)module0035.NIL, (SubLObject)ConsesLow.cons(f2260(var6, var1.first(), var7), f2260(var6, var1.rest(), var7)), (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
        }
        return var1;
    }
    
    public static SubLObject f2261(final SubLObject var221, final SubLObject var223, SubLObject var1, SubLObject var6, SubLObject var266) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var266 == module0035.UNPROVIDED) {
            var266 = (SubLObject)module0035.$ic124$;
        }
        var1 = conses_high.nsubst(var266, var223, var1, var6, (SubLObject)module0035.UNPROVIDED);
        var1 = conses_high.nsubst(var223, var221, var1, var6, (SubLObject)module0035.UNPROVIDED);
        var1 = conses_high.nsubst(var221, var266, var1, var6, (SubLObject)module0035.UNPROVIDED);
        return var1;
    }
    
    public static SubLObject f2262(final SubLObject var221, final SubLObject var223, final SubLObject var1, SubLObject var6, SubLObject var266) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var266 == module0035.UNPROVIDED) {
            var266 = (SubLObject)module0035.$ic124$;
        }
        return f2261(var221, var223, conses_high.copy_tree(var1), var6, var266);
    }
    
    public static SubLObject f2263(final SubLObject var6, final SubLObject var1, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var1))) {
            return ConsesLow.append((SubLObject)ConsesLow.list(var1), f2264(var6, var1, var7));
        }
        return f2264(var6, var1, var7);
    }
    
    public static SubLObject f2264(final SubLObject var6, final SubLObject var1, final SubLObject var7) {
        return (SubLObject)(var1.isCons() ? ConsesLow.append(f2263(var6, var1.first(), var7), f2263(var6, var1.rest(), var7)) : module0035.NIL);
    }
    
    public static SubLObject f2265(final SubLObject var118, SubLObject var403, SubLObject var7, SubLObject var137, SubLObject var138) {
        if (var403 == module0035.UNPROVIDED) {
            var403 = module0035.$g899$.getGlobalValue();
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        assert module0035.NIL != Types.listp(var118) : var118;
        assert module0035.NIL != Types.hash_table_p(var403) : var403;
        SubLObject var404 = (SubLObject)module0035.NIL;
        if (var403.eql(module0035.$g897$.getGlobalValue())) {
            final SubLObject var405 = module0035.$g901$.getGlobalValue();
            SubLObject var406 = (SubLObject)module0035.NIL;
            try {
                var406 = Locks.seize_lock(var405);
                var404 = f2266(var118, var403, var7, var137, var138);
            }
            finally {
                if (module0035.NIL != var406) {
                    Locks.release_lock(var405);
                }
            }
        }
        else if (var403.eql(module0035.$g898$.getGlobalValue())) {
            final SubLObject var407 = module0035.$g902$.getGlobalValue();
            SubLObject var408 = (SubLObject)module0035.NIL;
            try {
                var408 = Locks.seize_lock(var407);
                var404 = f2266(var118, var403, var7, var137, var138);
            }
            finally {
                if (module0035.NIL != var408) {
                    Locks.release_lock(var407);
                }
            }
        }
        else if (var403.eql(module0035.$g899$.getGlobalValue())) {
            final SubLObject var409 = module0035.$g903$.getGlobalValue();
            SubLObject var410 = (SubLObject)module0035.NIL;
            try {
                var410 = Locks.seize_lock(var409);
                var404 = f2266(var118, var403, var7, var137, var138);
            }
            finally {
                if (module0035.NIL != var410) {
                    Locks.release_lock(var409);
                }
            }
        }
        else if (var403.eql(module0035.$g900$.getGlobalValue())) {
            final SubLObject var411 = module0035.$g904$.getGlobalValue();
            SubLObject var412 = (SubLObject)module0035.NIL;
            try {
                var412 = Locks.seize_lock(var411);
                var404 = f2266(var118, var403, var7, var137, var138);
            }
            finally {
                if (module0035.NIL != var412) {
                    Locks.release_lock(var411);
                }
            }
        }
        else {
            var404 = f2266(var118, var403, var7, var137, var138);
        }
        return var404;
    }
    
    public static SubLObject f2266(SubLObject var118, final SubLObject var403, final SubLObject var7, final SubLObject var137, final SubLObject var138) {
        Hashtables.clrhash(var403);
        final SubLObject var404 = conses_high.nthcdr(var137, var118);
        SubLObject var405 = var137;
        SubLObject var406 = (SubLObject)module0035.NIL;
        if (module0035.NIL == var406) {
            SubLObject var407 = var404;
            SubLObject var408 = (SubLObject)module0035.NIL;
            var408 = var407.first();
            while (module0035.NIL == var406 && module0035.NIL != var407) {
                if (var138.isInteger() && var138.numE(var405)) {
                    var406 = (SubLObject)module0035.T;
                }
                else {
                    Hashtables.sethash(Functions.funcall(var7, var408), var403, var405);
                }
                var405 = Numbers.add(var405, (SubLObject)module0035.ONE_INTEGER);
                var407 = var407.rest();
                var408 = var407.first();
            }
        }
        SubLObject var409 = (SubLObject)(var137.numE((SubLObject)module0035.ZERO_INTEGER) ? module0035.NIL : conses_high.nthcdr(Numbers.subtract(var137, (SubLObject)module0035.ONE_INTEGER), var118));
        SubLObject var410 = (SubLObject)module0035.NIL;
        SubLObject var411 = (SubLObject)module0035.NIL;
        SubLObject var412 = (SubLObject)module0035.NIL;
        SubLObject var408 = (SubLObject)module0035.NIL;
        var411 = var137;
        var412 = ((module0035.NIL != var409) ? var409.rest() : var118);
        var408 = var412.first();
        while (module0035.NIL == var410 && module0035.NIL != var412) {
            var410 = (SubLObject)SubLObjectFactory.makeBoolean(var138.isInteger() && var138.numE(var411));
            if (module0035.NIL == var410) {
                if (var411.eql(Hashtables.gethash(Functions.funcall(var7, var408), var403, (SubLObject)module0035.UNPROVIDED))) {
                    var409 = var412;
                }
                else if (module0035.NIL != var409) {
                    ConsesLow.rplacd(var409, var412.rest());
                }
                else {
                    var118 = var412.rest();
                }
            }
            var411 = Numbers.add(var411, (SubLObject)module0035.ONE_INTEGER);
            var412 = var412.rest();
            var408 = var412.first();
        }
        return var118;
    }
    
    public static SubLObject f2267(final SubLObject var118, SubLObject var403, SubLObject var7, SubLObject var137, SubLObject var138) {
        if (var403 == module0035.UNPROVIDED) {
            var403 = module0035.$g899$.getGlobalValue();
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        return f2265(conses_high.copy_list(var118), var403, var7, var137, var138);
    }
    
    public static SubLObject f2268(final SubLObject var6) {
        final SubLObject var8;
        final SubLObject var7 = var8 = module0030.f1592(var6);
        if (var8.eql((SubLObject)module0035.$ic107$) || var8.eql((SubLObject)module0035.EQ)) {
            return module0035.$g897$.getGlobalValue();
        }
        if (var8.eql((SubLObject)module0035.$ic107$) || var8.eql((SubLObject)module0035.EQL)) {
            return module0035.$g898$.getGlobalValue();
        }
        if (var8.eql((SubLObject)module0035.$ic107$) || var8.eql((SubLObject)module0035.EQUAL)) {
            return module0035.$g899$.getGlobalValue();
        }
        return module0035.$g900$.getGlobalValue();
    }
    
    public static SubLObject f2269(final SubLObject var118, SubLObject var6, SubLObject var7, SubLObject var403, SubLObject var137, SubLObject var138) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQUAL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var403 == module0035.UNPROVIDED) {
            var403 = (SubLObject)module0035.NIL;
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        final SubLThread var404 = SubLProcess.currentSubLThread();
        assert module0035.NIL != Types.function_spec_p(var6) : var6;
        if (module0035.NIL != f1994(var118, (SubLObject)module0035.ONE_INTEGER, (SubLObject)module0035.UNPROVIDED)) {
            return var118;
        }
        if (module0035.NIL != f1994(var118, module0035.$g892$.getDynamicValue(var404), (SubLObject)module0035.UNPROVIDED)) {
            return Sequences.delete_duplicates(var118, var6, var7, var137, var138);
        }
        if (module0035.NIL != var403) {
            return f2265(var118, var403, var7, var137, var138);
        }
        if (module0035.NIL != module0030.f1591(var6)) {
            return f2265(var118, f2268(var6), var7, var137, var138);
        }
        return Sequences.delete_duplicates(var118, var6, var7, var137, var138);
    }
    
    public static SubLObject f2270(final SubLObject var8, SubLObject var6, SubLObject var7, SubLObject var403, SubLObject var137, SubLObject var138) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQUAL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var403 == module0035.UNPROVIDED) {
            var403 = (SubLObject)module0035.NIL;
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        return f2269(conses_high.copy_list(var8), var6, var7, var403, var137, var138);
    }
    
    public static SubLObject f2271(final SubLObject var8, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQUAL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        final SubLObject var9 = var8.first();
        return f2146(var9, f2269(conses_high.copy_list(var8), var6, var7, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED), var6);
    }
    
    public static SubLObject f2272(final SubLObject var415) {
        return f2269(var415, Symbols.symbol_function((SubLObject)module0035.EQ), (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2273(final SubLObject var415) {
        return f2269(var415, Symbols.symbol_function((SubLObject)module0035.EQ), (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2274(final SubLObject var8, final SubLObject var6) {
        final SubLObject var9 = Hashtables.make_hash_table(Sequences.length(var8), var6, (SubLObject)module0035.UNPROVIDED);
        SubLObject var10 = (SubLObject)module0035.NIL;
        SubLObject var11 = var8;
        SubLObject var12 = (SubLObject)module0035.NIL;
        var12 = var11.first();
        while (module0035.NIL != var11) {
            final SubLObject var13 = Hashtables.gethash(var12, var9, (SubLObject)module0035.UNPROVIDED);
            if (module0035.NIL != var13) {
                if (var13 != module0035.$ic131$) {
                    Hashtables.sethash(var12, var9, (SubLObject)module0035.$ic131$);
                }
            }
            else {
                Hashtables.sethash(var12, var9, (SubLObject)module0035.$ic132$);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        SubLObject var14 = (SubLObject)module0035.NIL;
        SubLObject var15 = (SubLObject)module0035.NIL;
        final Iterator var16 = Hashtables.getEntrySetIterator(var9);
        try {
            while (Hashtables.iteratorHasNext(var16)) {
                final Map.Entry var17 = Hashtables.iteratorNextEntry(var16);
                var14 = Hashtables.getEntryKey(var17);
                var15 = Hashtables.getEntryValue(var17);
                if (var15 == module0035.$ic132$) {
                    var10 = (SubLObject)ConsesLow.cons(var14, var10);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var16);
        }
        return var10;
    }
    
    public static SubLObject f2275(final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (module0035.NIL != module0030.f1591(var6)) {
            return f2274(var8, var6);
        }
        final SubLObject var9 = Sequences.length(var8);
        final SubLObject var10 = Hashtables.make_hash_table(var9, Symbols.symbol_function((SubLObject)module0035.EQL), (SubLObject)module0035.UNPROVIDED);
        SubLObject var11 = (SubLObject)module0035.NIL;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var12 = (SubLObject)module0035.NIL, var12 = (SubLObject)module0035.ZERO_INTEGER; var12.numL(var9); var12 = Numbers.add(var12, (SubLObject)module0035.ONE_INTEGER)) {
            if (module0035.NIL == Hashtables.gethash(var12, var10, (SubLObject)module0035.UNPROVIDED)) {
                var13 = ConsesLow.nth(var12, var8);
                for (var14 = Numbers.subtract(var9, var12, (SubLObject)module0035.ONE_INTEGER), var15 = (SubLObject)module0035.NIL, var15 = (SubLObject)module0035.ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)module0035.ONE_INTEGER)) {
                    var16 = Numbers.add(var15, var12, (SubLObject)module0035.ONE_INTEGER);
                    if (module0035.NIL == Hashtables.gethash(var16, var10, (SubLObject)module0035.UNPROVIDED)) {
                        var17 = ConsesLow.nth(var16, var8);
                        if (module0035.NIL != Functions.funcall(var6, var13, var17)) {
                            Hashtables.sethash(var12, var10, (SubLObject)module0035.T);
                            Hashtables.sethash(var16, var10, (SubLObject)module0035.T);
                        }
                    }
                }
            }
        }
        for (var12 = (SubLObject)module0035.NIL, var12 = (SubLObject)module0035.ZERO_INTEGER; var12.numL(var9); var12 = Numbers.add(var12, (SubLObject)module0035.ONE_INTEGER)) {
            if (module0035.NIL == Hashtables.gethash(var12, var10, (SubLObject)module0035.UNPROVIDED)) {
                var11 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var12, var8), var11);
            }
        }
        return var11;
    }
    
    public static SubLObject f2276(final SubLObject var15, final SubLObject var8, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        final SubLObject var16 = Sequences.length(var8);
        final SubLObject var17 = Vectors.make_vector(var16, (SubLObject)module0035.ZERO_INTEGER);
        final SubLObject var18 = module0037.f2562(var16);
        SubLObject var19 = (SubLObject)module0035.NIL;
        SubLObject var20;
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var20 = (SubLObject)module0035.NIL, var20 = (SubLObject)module0035.ZERO_INTEGER; var20.numL(var16); var20 = Numbers.add(var20, (SubLObject)module0035.ONE_INTEGER)) {
            if (!Vectors.aref(var17, Vectors.aref(var18, var20)).numGE(var15)) {
                var21 = ConsesLow.nth(var20, var8);
                for (var22 = Numbers.subtract(var16, var20, (SubLObject)module0035.ONE_INTEGER), var23 = (SubLObject)module0035.NIL, var23 = (SubLObject)module0035.ZERO_INTEGER; var23.numL(var22); var23 = Numbers.add(var23, (SubLObject)module0035.ONE_INTEGER)) {
                    var24 = Numbers.add(var23, var20, (SubLObject)module0035.ONE_INTEGER);
                    if (!Vectors.aref(var17, Vectors.aref(var18, var24)).numGE(var15)) {
                        var25 = ConsesLow.nth(var24, var8);
                        if (module0035.NIL != Functions.funcall(var6, var21, var25)) {
                            Vectors.set_aref(var18, var24, Vectors.aref(var18, var20));
                            Vectors.set_aref(var17, Vectors.aref(var18, var20), Numbers.add(Vectors.aref(var17, Vectors.aref(var18, var20)), (SubLObject)module0035.ONE_INTEGER));
                        }
                    }
                }
            }
        }
        for (var20 = (SubLObject)module0035.NIL, var20 = (SubLObject)module0035.ZERO_INTEGER; var20.numL(var16); var20 = Numbers.add(var20, (SubLObject)module0035.ONE_INTEGER)) {
            if (Vectors.aref(var17, Vectors.aref(var18, var20)).numL(var15)) {
                var19 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var20, var8), var19);
            }
        }
        return Sequences.nreverse(var19);
    }
    
    public static SubLObject f2277(final SubLObject var200, final SubLObject var201, SubLObject var351, SubLObject var7) {
        if (var351 == module0035.UNPROVIDED) {
            var351 = (SubLObject)module0035.$ic133$;
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2278(Sort.sort(var200, var351, var7), Sort.sort(var201, var351, var7), var351, var7);
    }
    
    public static SubLObject f2278(SubLObject var425, SubLObject var426, SubLObject var351, SubLObject var7) {
        if (var351 == module0035.UNPROVIDED) {
            var351 = (SubLObject)module0035.$ic133$;
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        assert module0035.NIL != Types.listp(var425) : var425;
        assert module0035.NIL != Types.listp(var426) : var426;
        SubLObject var427 = (SubLObject)module0035.NIL;
        while (module0035.NIL != var425 && module0035.NIL != var426) {
            final SubLObject var428 = var425.first();
            final SubLObject var429 = var426.first();
            if (module0035.NIL != Functions.funcall(var351, Functions.funcall(var7, var428), Functions.funcall(var7, var429))) {
                var425 = var425.rest();
            }
            else if (module0035.NIL != Functions.funcall(var351, Functions.funcall(var7, var429), Functions.funcall(var7, var428))) {
                var426 = var426.rest();
            }
            else {
                var427 = (SubLObject)ConsesLow.cons(var428, var427);
                var425 = var425.rest();
                var426 = var426.rest();
            }
        }
        return Sequences.nreverse(var427);
    }
    
    public static SubLObject f2279(final SubLObject var425, final SubLObject var426, SubLObject var351, SubLObject var7) {
        if (var351 == module0035.UNPROVIDED) {
            var351 = (SubLObject)module0035.$ic133$;
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        assert module0035.NIL != Types.listp(var425) : var425;
        assert module0035.NIL != Types.listp(var426) : var426;
        if (module0035.NIL != f2011(var425, var426)) {
            return f2280(var425, var426, var351, var7);
        }
        return f2280(var426, var425, var351, var7);
    }
    
    public static SubLObject f2281(final SubLObject var425, final SubLObject var426, SubLObject var351, SubLObject var7) {
        if (var351 == module0035.UNPROVIDED) {
            var351 = (SubLObject)module0035.$ic133$;
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        assert module0035.NIL != Types.listp(var425) : var425;
        assert module0035.NIL != Types.listp(var426) : var426;
        return f2280(var425, var426, var351, var7);
    }
    
    public static SubLObject f2280(SubLObject var425, SubLObject var426, final SubLObject var351, final SubLObject var7) {
        SubLObject var427 = var425;
        SubLObject var428 = (SubLObject)module0035.NIL;
        while (module0035.NIL != var425 && module0035.NIL != var426) {
            final SubLObject var429 = var425.first();
            final SubLObject var430 = var426.first();
            if (module0035.NIL != Functions.funcall(var351, Functions.funcall(var7, var429), Functions.funcall(var7, var430))) {
                if (module0035.NIL != var428) {
                    ConsesLow.rplacd(var428, var425.rest());
                }
                else {
                    var427 = var425.rest();
                }
                var425 = var425.rest();
            }
            else if (module0035.NIL != Functions.funcall(var351, Functions.funcall(var7, var430), Functions.funcall(var7, var429))) {
                var426 = var426.rest();
            }
            else {
                var428 = var425;
                var425 = var425.rest();
                var426 = var426.rest();
            }
        }
        if (module0035.NIL != var428) {
            ConsesLow.rplacd(var428, (SubLObject)module0035.NIL);
        }
        else {
            var427 = (SubLObject)module0035.NIL;
        }
        return var427;
    }
    
    public static SubLObject f2282(final SubLObject var200, final SubLObject var201, SubLObject var351, SubLObject var7) {
        if (var351 == module0035.UNPROVIDED) {
            var351 = (SubLObject)module0035.$ic133$;
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2277(conses_high.copy_list(var200), conses_high.copy_list(var201), var351, var7);
    }
    
    public static SubLObject f2283(final SubLObject var425, final SubLObject var426, SubLObject var351, SubLObject var7) {
        if (var351 == module0035.UNPROVIDED) {
            var351 = (SubLObject)module0035.$ic133$;
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2284(var425, var426, var351, var7, (SubLObject)module0035.NIL);
    }
    
    public static SubLObject f2285(final SubLObject var425, final SubLObject var426, SubLObject var351, SubLObject var7) {
        if (var351 == module0035.UNPROVIDED) {
            var351 = (SubLObject)module0035.$ic133$;
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2284(var425, var426, var351, var7, (SubLObject)module0035.T);
    }
    
    public static SubLObject f2284(SubLObject var425, SubLObject var426, final SubLObject var351, final SubLObject var7, final SubLObject var428) {
        assert module0035.NIL != Types.listp(var425) : var425;
        assert module0035.NIL != Types.listp(var426) : var426;
        SubLObject var429 = (SubLObject)module0035.NIL;
        while (module0035.NIL != var425 && module0035.NIL != var426) {
            final SubLObject var430 = var425.first();
            final SubLObject var431 = var426.first();
            if (module0035.NIL != Functions.funcall(var351, Functions.funcall(var7, var430), Functions.funcall(var7, var431))) {
                var429 = (SubLObject)ConsesLow.cons(var430, var429);
                var425 = var425.rest();
            }
            else if (module0035.NIL != Functions.funcall(var351, Functions.funcall(var7, var431), Functions.funcall(var7, var430))) {
                var429 = (SubLObject)ConsesLow.cons(var431, var429);
                var426 = var426.rest();
            }
            else {
                var429 = (SubLObject)ConsesLow.cons(var430, var429);
                var425 = var425.rest();
                var426 = var426.rest();
            }
        }
        var429 = Sequences.nreverse(var429);
        if (module0035.NIL != var425) {
            var429 = ((module0035.NIL != var428) ? ConsesLow.append(var429, var425) : ConsesLow.nconc(var429, var425));
        }
        else if (module0035.NIL != var426) {
            var429 = ((module0035.NIL != var428) ? ConsesLow.append(var429, var426) : ConsesLow.nconc(var429, var426));
        }
        return var429;
    }
    
    public static SubLObject f2286(final SubLObject var429, SubLObject var351, SubLObject var7) {
        if (var351 == module0035.UNPROVIDED) {
            var351 = (SubLObject)module0035.$ic134$;
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2287(var429, (SubLObject)module0035.ZERO_INTEGER, var351, var7);
    }
    
    public static SubLObject f2287(final SubLObject var429, final SubLObject var273, final SubLObject var351, final SubLObject var7) {
        if (var273.numGE(Sequences.length(var429))) {
            return var429;
        }
        final SubLObject var430 = f2182(var429, var273, var351, var7);
        SubLObject var431 = (SubLObject)module0035.NIL;
        if (module0035.NIL != f1997(var430)) {
            return f2287(var429, Numbers.add(var273, (SubLObject)module0035.ONE_INTEGER), var351, var7);
        }
        SubLObject var432 = (SubLObject)module0035.NIL;
        SubLObject var433 = var430;
        SubLObject var434 = (SubLObject)module0035.NIL;
        var434 = var433.first();
        while (module0035.NIL != var433) {
            var432 = ConsesLow.append(ConsesLow.nth(var434, var429), var432);
            var433 = var433.rest();
            var434 = var433.first();
        }
        var432 = f2288(Sort.sort(var432, var351, var7), (SubLObject)module0035.UNPROVIDED);
        var431 = (SubLObject)ConsesLow.cons(var432, var431);
        SubLObject var435 = (SubLObject)module0035.NIL;
        SubLObject var436 = (SubLObject)module0035.NIL;
        SubLObject var437 = (SubLObject)module0035.NIL;
        var435 = var429;
        var436 = var435.first();
        for (var437 = (SubLObject)module0035.ZERO_INTEGER; module0035.NIL != var435; var435 = var435.rest(), var436 = var435.first(), var437 = Numbers.add((SubLObject)module0035.ONE_INTEGER, var437)) {
            if (module0035.NIL == module0004.f104(var437, var430, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
                var431 = (SubLObject)ConsesLow.cons(var436, var431);
            }
        }
        return f2287(var431, (SubLObject)module0035.ZERO_INTEGER, var351, var7);
    }
    
    public static SubLObject f2288(final SubLObject var380, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        SubLObject var381 = var380;
        for (SubLObject var382 = var380.rest(); module0035.NIL != var382; var382 = var382.rest()) {
            if (module0035.NIL != Functions.funcall(var6, var382.first(), var381.first())) {
                ConsesLow.rplacd(var381, var382.rest());
            }
            else {
                var381 = var382;
            }
        }
        return var380;
    }
    
    public static SubLObject f2289(final SubLObject var380, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        return f2288(conses_high.copy_list(var380), var6);
    }
    
    public static SubLObject f2290(final SubLObject var4, final SubLObject var6, final SubLObject var8, SubLObject var7, SubLObject var137, SubLObject var138) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (var138 == module0035.UNPROVIDED) {
            var138 = (SubLObject)module0035.NIL;
        }
        assert module0035.NIL != Types.integerp(var137) : var137;
        assert module0035.NIL != Types.listp(var8) : var8;
        SubLObject var139;
        SubLObject var140;
        SubLObject var141;
        SubLObject var142;
        for (var139 = Functions.funcall(var7, var4), var140 = var137, var141 = (var138.isInteger() ? Numbers.add((SubLObject)module0035.ONE_INTEGER, var138) : Sequences.length(var8)), var142 = (SubLObject)module0035.NIL, var142 = ConsesLow.nth(var140, var8); !var140.numE(var141) && module0035.NIL == Functions.funcall(var6, var139, Functions.funcall(var7, var142)); var140 = Numbers.add(var140, (SubLObject)module0035.ONE_INTEGER), var142 = ConsesLow.nth(var140, var8)) {}
        if (!var140.numE(var141)) {
            return var140;
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2291(SubLObject var425, SubLObject var426, SubLObject var351, SubLObject var7) {
        if (var351 == module0035.UNPROVIDED) {
            var351 = (SubLObject)module0035.$ic133$;
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        assert module0035.NIL != Types.listp(var425) : var425;
        assert module0035.NIL != Types.listp(var426) : var426;
        SubLObject var427 = (SubLObject)module0035.NIL;
        while (module0035.NIL != var425 && module0035.NIL != var426) {
            final SubLObject var428 = var425.first();
            final SubLObject var429 = var426.first();
            if (module0035.NIL != Functions.funcall(var351, Functions.funcall(var7, var428), Functions.funcall(var7, var429))) {
                var427 = (SubLObject)ConsesLow.cons(var428, var427);
                var425 = var425.rest();
            }
            else if (module0035.NIL != Functions.funcall(var351, Functions.funcall(var7, var429), Functions.funcall(var7, var428))) {
                var426 = var426.rest();
            }
            else {
                var425 = var425.rest();
                var426 = var426.rest();
            }
        }
        return ConsesLow.append(Sequences.nreverse(var427), var425);
    }
    
    public static SubLObject f2292(final SubLObject var1) {
        return Types.listp(var1);
    }
    
    public static SubLObject f2293(final SubLObject var5, final SubLObject var7, SubLObject var6, SubLObject var162) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var162 == module0035.UNPROVIDED) {
            var162 = (SubLObject)module0035.NIL;
        }
        assert module0035.NIL != f2292(var5) : var5;
        final SubLObject var163 = conses_high.assoc(var7, var5, var6, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL != var163) {
            return Values.values(var163.rest(), (SubLObject)module0035.T);
        }
        return Values.values(var162, (SubLObject)module0035.NIL);
    }
    
    public static SubLObject f2294(final SubLObject var5, final SubLObject var7, SubLObject var6, SubLObject var162) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var162 == module0035.UNPROVIDED) {
            var162 = (SubLObject)module0035.NIL;
        }
        final SubLObject var163 = conses_high.assoc(var7, var5, var6, (SubLObject)module0035.UNPROVIDED);
        return (module0035.NIL != var163) ? var163.rest() : var162;
    }
    
    public static SubLObject f2295(final SubLObject var5, final SubLObject var7, SubLObject var6, SubLObject var162) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var162 == module0035.UNPROVIDED) {
            var162 = (SubLObject)module0035.NIL;
        }
        if (var6.eql(Symbols.symbol_function((SubLObject)module0035.EQ)) || var6 == module0035.EQ) {
            return f2296(var5, var7, var162);
        }
        if (var6.eql(Symbols.symbol_function((SubLObject)module0035.EQL)) || var6 == module0035.EQL) {
            return f2297(var5, var7, var162);
        }
        if (var6.eql(Symbols.symbol_function((SubLObject)module0035.EQUAL)) || var6 == module0035.EQUAL) {
            return f2298(var5, var7, var162);
        }
        if (var6.eql(Symbols.symbol_function((SubLObject)module0035.EQUALP)) || var6 == module0035.EQUALP) {
            return f2299(var5, var7, var162);
        }
        return f2300(var5, var7, var6, var162);
    }
    
    public static SubLObject f2296(final SubLObject var5, final SubLObject var7, SubLObject var162) {
        if (var162 == module0035.UNPROVIDED) {
            var162 = (SubLObject)module0035.NIL;
        }
        SubLObject var163 = (SubLObject)module0035.NIL;
        SubLObject var164 = (SubLObject)module0035.NIL;
        SubLObject var165;
        SubLObject var166;
        SubLObject var167;
        for (var165 = (SubLObject)module0035.NIL, var165 = var5; !var165.isAtom(); var165 = var165.rest()) {
            var166 = var165.first();
            var167 = var166.first();
            if (var7.eql(var167)) {
                return f2301(var163, var164, var165, var166.rest());
            }
            var163 = var164;
            var164 = var165;
        }
        return var162;
    }
    
    public static SubLObject f2297(final SubLObject var5, final SubLObject var7, SubLObject var162) {
        if (var162 == module0035.UNPROVIDED) {
            var162 = (SubLObject)module0035.NIL;
        }
        SubLObject var163 = (SubLObject)module0035.NIL;
        SubLObject var164 = (SubLObject)module0035.NIL;
        SubLObject var165;
        SubLObject var166;
        SubLObject var167;
        for (var165 = (SubLObject)module0035.NIL, var165 = var5; !var165.isAtom(); var165 = var165.rest()) {
            var166 = var165.first();
            var167 = var166.first();
            if (var7.eql(var167)) {
                return f2301(var163, var164, var165, var166.rest());
            }
            var163 = var164;
            var164 = var165;
        }
        return var162;
    }
    
    public static SubLObject f2298(final SubLObject var5, final SubLObject var7, SubLObject var162) {
        if (var162 == module0035.UNPROVIDED) {
            var162 = (SubLObject)module0035.NIL;
        }
        SubLObject var163 = (SubLObject)module0035.NIL;
        SubLObject var164 = (SubLObject)module0035.NIL;
        SubLObject var165;
        SubLObject var166;
        SubLObject var167;
        for (var165 = (SubLObject)module0035.NIL, var165 = var5; !var165.isAtom(); var165 = var165.rest()) {
            var166 = var165.first();
            var167 = var166.first();
            if (var7.equal(var167)) {
                return f2301(var163, var164, var165, var166.rest());
            }
            var163 = var164;
            var164 = var165;
        }
        return var162;
    }
    
    public static SubLObject f2299(final SubLObject var5, final SubLObject var7, SubLObject var162) {
        if (var162 == module0035.UNPROVIDED) {
            var162 = (SubLObject)module0035.NIL;
        }
        SubLObject var163 = (SubLObject)module0035.NIL;
        SubLObject var164 = (SubLObject)module0035.NIL;
        SubLObject var165;
        SubLObject var166;
        SubLObject var167;
        for (var165 = (SubLObject)module0035.NIL, var165 = var5; !var165.isAtom(); var165 = var165.rest()) {
            var166 = var165.first();
            var167 = var166.first();
            if (var7.equalp(var167)) {
                return f2301(var163, var164, var165, var166.rest());
            }
            var163 = var164;
            var164 = var165;
        }
        return var162;
    }
    
    public static SubLObject f2300(final SubLObject var5, final SubLObject var7, final SubLObject var6, SubLObject var162) {
        if (var162 == module0035.UNPROVIDED) {
            var162 = (SubLObject)module0035.NIL;
        }
        SubLObject var163 = (SubLObject)module0035.NIL;
        SubLObject var164 = (SubLObject)module0035.NIL;
        SubLObject var165;
        SubLObject var166;
        SubLObject var167;
        for (var165 = (SubLObject)module0035.NIL, var165 = var5; !var165.isAtom(); var165 = var165.rest()) {
            var166 = var165.first();
            var167 = var166.first();
            if (module0035.NIL != Functions.funcall(var6, var7, var167)) {
                return f2301(var163, var164, var165, var166.rest());
            }
            var163 = var164;
            var164 = var165;
        }
        return var162;
    }
    
    public static SubLObject f2301(final SubLObject var301, final SubLObject var302, final SubLObject var436, final SubLObject var198) {
        if (module0035.NIL != var301) {
            ConsesLow.rplacd(var301, var436);
            ConsesLow.rplacd(var302, var436.rest());
            ConsesLow.rplacd(var436, var302);
        }
        return var198;
    }
    
    public static SubLObject f2302(final SubLObject var5, final SubLObject var7, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        assert module0035.NIL != f2292(var5) : var5;
        return module0004.f104(var7, var5, var6, Symbols.symbol_function((SubLObject)module0035.$ic20$));
    }
    
    public static SubLObject f2303(final SubLObject var5, final SubLObject var198, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        assert module0035.NIL != f2292(var5) : var5;
        return module0004.f104(var198, var5, var6, Symbols.symbol_function((SubLObject)module0035.$ic19$));
    }
    
    public static SubLObject f2304(final SubLObject var5, final SubLObject var198, SubLObject var6, SubLObject var162) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var162 == module0035.UNPROVIDED) {
            var162 = (SubLObject)module0035.NIL;
        }
        assert module0035.NIL != f2292(var5) : var5;
        final SubLObject var199 = conses_high.rassoc(var198, var5, var6, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL != var199) {
            return Values.values(var199.first(), (SubLObject)module0035.T);
        }
        return Values.values(var162, (SubLObject)module0035.NIL);
    }
    
    public static SubLObject f2305(final SubLObject var5, final SubLObject var198, SubLObject var6, SubLObject var162) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var162 == module0035.UNPROVIDED) {
            var162 = (SubLObject)module0035.NIL;
        }
        assert module0035.NIL != f2292(var5) : var5;
        final SubLObject var199 = conses_high.rassoc(var198, var5, var6, (SubLObject)module0035.UNPROVIDED);
        return (module0035.NIL != var199) ? var199.first() : var162;
    }
    
    public static SubLObject f2063(SubLObject var5, final SubLObject var7, final SubLObject var198, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        assert module0035.NIL != f2292(var5) : var5;
        final SubLObject var199 = conses_high.assoc(var7, var5, var6, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL != var199) {
            ConsesLow.rplacd(var199, var198);
        }
        else {
            var5 = conses_high.acons(var7, var198, var5);
        }
        return Values.values(var5, sublisp_boolean(var199));
    }
    
    public static SubLObject f2306(SubLObject var5, final SubLObject var7, final SubLObject var198, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        assert module0035.NIL != f2292(var5) : var5;
        final SubLObject var199 = conses_high.assoc(var7, var5, var6, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL != var199) {
            ConsesLow.rplacd(var199, var198);
        }
        else {
            var5 = conses_high.acons(var7, var198, var5);
        }
        return var5;
    }
    
    public static SubLObject f2307(SubLObject var5, final SubLObject var7, final SubLObject var198, final SubLObject var438, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var438.isZero()) {
            return (SubLObject)module0035.NIL;
        }
        var5 = f2306(var5, var7, var198, var6);
        if (module0035.NIL != f2002(var5, var438, (SubLObject)module0035.UNPROVIDED)) {
            ConsesLow.rplacd(conses_high.nthcdr(module0048.f_1_(var438), var5), (SubLObject)module0035.NIL);
        }
        return var5;
    }
    
    public static SubLObject f2308(SubLObject var5, final SubLObject var7, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        assert module0035.NIL != f2292(var5) : var5;
        final SubLObject var8 = conses_high.assoc(var7, var5, var6, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL != var8 && !var8.eql(var5.first())) {
            var5 = (SubLObject)ConsesLow.cons(var8, f2073(var8, var5, Symbols.symbol_function((SubLObject)module0035.EQ)));
        }
        return var5;
    }
    
    public static SubLObject f2309(SubLObject var5, final SubLObject var7, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        assert module0035.NIL != f2292(var5) : var5;
        final SubLObject var8 = conses_high.assoc(var7, var5, var6, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL != var8) {
            var5 = f2073(var8, var5, (SubLObject)module0035.UNPROVIDED);
        }
        return Values.values(var5, sublisp_boolean(var8));
    }
    
    public static SubLObject f2310(SubLObject var5, final SubLObject var7, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        assert module0035.NIL != f2292(var5) : var5;
        final SubLObject var8 = conses_high.assoc(var7, var5, var6, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL != var8) {
            var5 = f2073(var8, var5, (SubLObject)module0035.UNPROVIDED);
        }
        return var5;
    }
    
    public static SubLObject f2311(SubLObject var5, final SubLObject var7, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        assert module0035.NIL != f2292(var5) : var5;
        final SubLObject var8 = conses_high.assoc(var7, var5, var6, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL != var8) {
            var5 = f2074(var8, var5, (SubLObject)module0035.UNPROVIDED);
        }
        return Values.values(var5, sublisp_boolean(var8));
    }
    
    public static SubLObject f2312(SubLObject var5, final SubLObject var7, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        assert module0035.NIL != f2292(var5) : var5;
        final SubLObject var8 = conses_high.assoc(var7, var5, var6, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL != var8) {
            var5 = f2074(var8, var5, (SubLObject)module0035.UNPROVIDED);
        }
        return var5;
    }
    
    public static SubLObject f2313(SubLObject var5, final SubLObject var7, final SubLObject var198, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        assert module0035.NIL != f2292(var5) : var5;
        final SubLObject var199 = conses_high.assoc(var7, var5, var6, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL != var199) {
            ConsesLow.rplacd(var199, (SubLObject)ConsesLow.cons(var198, var199.rest()));
        }
        else {
            var5 = conses_high.acons(var7, (SubLObject)ConsesLow.list(var198), var5);
        }
        return Values.values(var5, sublisp_boolean(var199));
    }
    
    public static SubLObject f2314(SubLObject var5, final SubLObject var7, final SubLObject var198, SubLObject var439, SubLObject var440) {
        if (var439 == module0035.UNPROVIDED) {
            var439 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var440 == module0035.UNPROVIDED) {
            var440 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        assert module0035.NIL != f2292(var5) : var5;
        final SubLObject var441 = conses_high.assoc(var7, var5, var439, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL == var441) {
            var5 = conses_high.acons(var7, (SubLObject)ConsesLow.list(var198), var5);
        }
        else if (module0035.NIL == conses_high.member(var198, var441.rest(), var440, (SubLObject)module0035.UNPROVIDED)) {
            ConsesLow.rplacd(var441, (SubLObject)ConsesLow.cons(var198, var441.rest()));
        }
        return Values.values(var5, sublisp_boolean(var441));
    }
    
    public static SubLObject f2315(final SubLObject var5, final SubLObject var7, final SubLObject var198, SubLObject var439, SubLObject var440) {
        if (var439 == module0035.UNPROVIDED) {
            var439 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var440 == module0035.UNPROVIDED) {
            var440 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        final SubLObject var441 = conses_high.assoc(var7, var5, var439, (SubLObject)module0035.UNPROVIDED);
        if (module0035.NIL != var441) {
            ConsesLow.rplacd(var441, Sequences.remove(var198, var441.rest(), var440, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED));
        }
        return var5;
    }
    
    public static SubLObject f2316(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        SubLObject var23 = (SubLObject)module0035.NIL;
        SubLObject var24 = (SubLObject)module0035.NIL;
        SubLObject var25 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic136$);
        var23 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic136$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic136$);
        var25 = var22.first();
        var22 = var22.rest();
        final SubLObject var26 = (SubLObject)(var22.isCons() ? var22.first() : module0035.$ic137$);
        cdestructuring_bind.destructuring_bind_must_listp(var22, var21, (SubLObject)module0035.$ic136$);
        var22 = var22.rest();
        final SubLObject var27 = (SubLObject)(var22.isCons() ? var22.first() : module0035.$ic137$);
        cdestructuring_bind.destructuring_bind_must_listp(var22, var21, (SubLObject)module0035.$ic136$);
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            return (SubLObject)ConsesLow.list((SubLObject)module0035.$ic12$, var23, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic138$, var23, var24, var25, var26, var27));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic136$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2317(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        SubLObject var23 = (SubLObject)module0035.NIL;
        SubLObject var24 = (SubLObject)module0035.NIL;
        SubLObject var25 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic139$);
        var23 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic139$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic139$);
        var25 = var22.first();
        var22 = var22.rest();
        final SubLObject var26 = (SubLObject)(var22.isCons() ? var22.first() : module0035.$ic137$);
        cdestructuring_bind.destructuring_bind_must_listp(var22, var21, (SubLObject)module0035.$ic139$);
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            return (SubLObject)ConsesLow.list((SubLObject)module0035.$ic12$, var23, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic140$, var23, var24, var25, var26));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic139$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2318(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        SubLObject var23 = (SubLObject)module0035.NIL;
        SubLObject var24 = (SubLObject)module0035.NIL;
        SubLObject var25 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic141$);
        var23 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic141$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic141$);
        var25 = var22.first();
        var22 = var22.rest();
        final SubLObject var26 = (SubLObject)(var22.isCons() ? var22.first() : module0035.$ic137$);
        cdestructuring_bind.destructuring_bind_must_listp(var22, var21, (SubLObject)module0035.$ic141$);
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            return (SubLObject)ConsesLow.list((SubLObject)module0035.$ic12$, var23, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic142$, var23, var24, var25, var26));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic141$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2062(final SubLObject var5) {
        assert module0035.NIL != f2292(var5) : var5;
        SubLObject var6 = (SubLObject)module0035.NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0035.NIL;
        var8 = var7.first();
        while (module0035.NIL != var7) {
            SubLObject var10;
            final SubLObject var9 = var10 = var8;
            SubLObject var11 = (SubLObject)module0035.NIL;
            SubLObject var12 = (SubLObject)module0035.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0035.$ic143$);
            var11 = var10.first();
            var10 = (var12 = var10.rest());
            var6 = (SubLObject)ConsesLow.cons(var11, var6);
            var7 = var7.rest();
            var8 = var7.first();
        }
        return Sequences.nreverse(var6);
    }
    
    public static SubLObject f2319(final SubLObject var5) {
        assert module0035.NIL != f2292(var5) : var5;
        SubLObject var6 = (SubLObject)module0035.NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0035.NIL;
        var8 = var7.first();
        while (module0035.NIL != var7) {
            SubLObject var10;
            final SubLObject var9 = var10 = var8;
            SubLObject var11 = (SubLObject)module0035.NIL;
            SubLObject var12 = (SubLObject)module0035.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0035.$ic143$);
            var11 = var10.first();
            var10 = (var12 = var10.rest());
            var6 = (SubLObject)ConsesLow.cons(var12, var6);
            var7 = var7.rest();
            var8 = var7.first();
        }
        return Sequences.nreverse(var6);
    }
    
    public static SubLObject f2320(final SubLObject var5, final SubLObject var178) {
        assert module0035.NIL != f2292(var5) : var5;
        return conses_high.copy_alist(Sort.stable_sort(conses_high.copy_list(var5), var178, Symbols.symbol_function((SubLObject)module0035.$ic20$)));
    }
    
    public static SubLObject f2321(final SubLObject var182, final SubLObject var183, SubLObject var439, SubLObject var440) {
        if (var439 == module0035.UNPROVIDED) {
            var439 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var440 == module0035.UNPROVIDED) {
            var440 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != f2322(var182, var183, var439, var440) && module0035.NIL != f2322(var183, var182, var439, var440));
    }
    
    public static SubLObject f2322(final SubLObject var182, final SubLObject var183, SubLObject var439, SubLObject var440) {
        if (var439 == module0035.UNPROVIDED) {
            var439 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var440 == module0035.UNPROVIDED) {
            var440 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        SubLObject var441;
        SubLObject var442;
        SubLObject var443;
        SubLObject var445;
        SubLObject var444;
        SubLObject var446;
        SubLObject var447;
        for (var441 = (SubLObject)module0035.NIL, var442 = (SubLObject)module0035.NIL, var442 = var183; module0035.NIL == var441 && module0035.NIL != var442; var441 = (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == Functions.funcall(var440, var447, f2293(var182, var446, var439, (SubLObject)module0035.UNPROVIDED))), var442 = var442.rest()) {
            var443 = var442.first();
            var444 = (var445 = var443);
            var446 = (SubLObject)module0035.NIL;
            var447 = (SubLObject)module0035.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var445, var444, (SubLObject)module0035.$ic143$);
            var446 = var445.first();
            var445 = (var447 = var445.rest());
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == var441);
    }
    
    public static SubLObject f2323(final SubLObject var5, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        assert module0035.NIL != f2292(var5) : var5;
        final SubLObject var7 = Hashtables.make_hash_table(Sequences.length(var5), var6, (SubLObject)module0035.UNPROVIDED);
        SubLObject var8 = var5;
        SubLObject var9 = (SubLObject)module0035.NIL;
        var9 = var8.first();
        while (module0035.NIL != var8) {
            SubLObject var11;
            final SubLObject var10 = var11 = var9;
            SubLObject var12 = (SubLObject)module0035.NIL;
            SubLObject var13 = (SubLObject)module0035.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)module0035.$ic143$);
            var12 = var11.first();
            var11 = (var13 = var11.rest());
            Hashtables.sethash(var12, var7, var13);
            var8 = var8.rest();
            var9 = var8.first();
        }
        return var7;
    }
    
    public static SubLObject f2324(final SubLObject var5, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        assert module0035.NIL != f2292(var5) : var5;
        final SubLObject var7 = Hashtables.make_hash_table(Sequences.length(var5), var6, (SubLObject)module0035.UNPROVIDED);
        SubLObject var8 = var5;
        SubLObject var9 = (SubLObject)module0035.NIL;
        var9 = var8.first();
        while (module0035.NIL != var8) {
            SubLObject var11;
            final SubLObject var10 = var11 = var9;
            SubLObject var12 = (SubLObject)module0035.NIL;
            SubLObject var13 = (SubLObject)module0035.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)module0035.$ic143$);
            var12 = var11.first();
            var11 = (var13 = var11.rest());
            Hashtables.sethash(var13, var7, var12);
            var8 = var8.rest();
            var9 = var8.first();
        }
        return var7;
    }
    
    public static SubLObject f2325(final SubLObject var5, final SubLObject var178) {
        return Sort.sort(var5, var178, Symbols.symbol_function((SubLObject)module0035.$ic20$));
    }
    
    public static SubLObject f2326(final SubLObject var5, final SubLObject var178) {
        return Sort.sort(var5, var178, Symbols.symbol_function((SubLObject)module0035.$ic19$));
    }
    
    public static SubLObject f2327(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == var1 || (module0035.NIL != f2014(var1) && module0035.NIL != Numbers.evenp(Sequences.length(var1))));
    }
    
    public static SubLObject f2328(final SubLObject var124) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != var124 && module0035.NIL != f2014(var124));
    }
    
    public static SubLObject f2329(final SubLObject var459, final SubLObject var351) {
        SubLObject var460 = (SubLObject)module0035.NIL;
        SubLObject var461;
        SubLObject var462;
        SubLObject var463;
        for (var461 = (SubLObject)module0035.NIL, var461 = var459; module0035.NIL != var461; var461 = conses_high.cddr(var461)) {
            var462 = var461.first();
            var463 = conses_high.cadr(var461);
            if (module0035.NIL != Functions.funcall(var351, var462)) {
                var460 = (SubLObject)ConsesLow.cons(var462, var460);
                var460 = (SubLObject)ConsesLow.cons(var463, var460);
            }
        }
        return Sequences.nreverse(var460);
    }
    
    public static SubLObject f2330(final SubLObject var459, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQ);
        }
        SubLObject var460 = (SubLObject)module0035.NIL;
        SubLObject var461;
        SubLObject var462;
        SubLObject var463;
        for (var461 = (SubLObject)module0035.NIL, var461 = var459; module0035.NIL != var461; var461 = conses_high.cddr(var461)) {
            var462 = var461.first();
            var463 = conses_high.cadr(var461);
            if (module0035.NIL == Functions.funcall(var6, var462, var463)) {
                var460 = (SubLObject)ConsesLow.cons(var462, var460);
                var460 = (SubLObject)ConsesLow.cons(var463, var460);
            }
        }
        return Sequences.nreverse(var460);
    }
    
    public static SubLObject f2331(final SubLObject var1, final SubLObject var351) {
        if (module0035.NIL == f2327(var1)) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var352;
        SubLObject var353;
        SubLObject var354;
        for (var352 = (SubLObject)module0035.NIL, var352 = var1; module0035.NIL != var352; var352 = conses_high.cddr(var352)) {
            var353 = var352.first();
            var354 = conses_high.cadr(var352);
            if (module0035.NIL == Functions.funcall(var351, var353)) {
                return (SubLObject)module0035.NIL;
            }
        }
        return (SubLObject)module0035.T;
    }
    
    public static SubLObject f2332(final SubLObject var1, final SubLObject var351) {
        if (module0035.NIL == f2327(var1)) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var352;
        SubLObject var353;
        SubLObject var354;
        for (var352 = (SubLObject)module0035.NIL, var352 = var1; module0035.NIL != var352; var352 = conses_high.cddr(var352)) {
            var353 = var352.first();
            var354 = conses_high.cadr(var352);
            if (module0035.NIL == Functions.funcall(var351, var354)) {
                return (SubLObject)module0035.NIL;
            }
        }
        return (SubLObject)module0035.T;
    }
    
    public static SubLObject f2333(final SubLObject var191, final SubLObject var180) {
        if (module0035.NIL == f2004(var191, var180)) {
            Errors.error((SubLObject)module0035.$ic78$);
        }
        SubLObject var192 = (SubLObject)module0035.NIL;
        SubLObject var193 = (SubLObject)module0035.NIL;
        SubLObject var7_464 = (SubLObject)module0035.NIL;
        SubLObject var194 = (SubLObject)module0035.NIL;
        SubLObject var466_467 = (SubLObject)module0035.NIL;
        var193 = var191;
        var7_464 = var193.first();
        var194 = var180;
        var466_467 = var194.first();
        while (module0035.NIL != var194 || module0035.NIL != var193) {
            var192 = conses_high.putf(var192, var7_464, var466_467);
            var193 = var193.rest();
            var7_464 = var193.first();
            var194 = var194.rest();
            var466_467 = var194.first();
        }
        return var192;
    }
    
    public static SubLObject f2334(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        SubLObject var23 = (SubLObject)module0035.NIL;
        SubLObject var24 = (SubLObject)module0035.NIL;
        SubLObject var25 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic144$);
        var23 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic144$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic144$);
        var25 = var22.first();
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            return (SubLObject)ConsesLow.list((SubLObject)module0035.$ic6$, var23, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic145$, var23, var24, var25));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic144$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2335(final SubLObject var459, final SubLObject var7, SubLObject var162) {
        if (var162 == module0035.UNPROVIDED) {
            var162 = (SubLObject)module0035.NIL;
        }
        return conses_high.getf(var459, var7, var162);
    }
    
    public static SubLObject f2336(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        SubLObject var23 = (SubLObject)module0035.NIL;
        SubLObject var24 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic146$);
        var23 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic146$);
        var24 = var22.first();
        var22 = var22.rest();
        SubLObject var25 = (SubLObject)module0035.NIL;
        SubLObject var26 = var22;
        SubLObject var27 = (SubLObject)module0035.NIL;
        SubLObject var476_477 = (SubLObject)module0035.NIL;
        while (module0035.NIL != var26) {
            cdestructuring_bind.destructuring_bind_must_consp(var26, var21, (SubLObject)module0035.$ic146$);
            var476_477 = var26.first();
            var26 = var26.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var26, var21, (SubLObject)module0035.$ic146$);
            if (module0035.NIL == conses_high.member(var476_477, (SubLObject)module0035.$ic147$, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
                var27 = (SubLObject)module0035.T;
            }
            if (var476_477 == module0035.$ic51$) {
                var25 = var26.first();
            }
            var26 = var26.rest();
        }
        if (module0035.NIL != var27 && module0035.NIL == var25) {
            cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic146$);
        }
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)module0035.$ic148$, var22);
        final SubLObject var29 = (SubLObject)((module0035.NIL != var28) ? conses_high.cadr(var28) : module0035.ONE_INTEGER);
        return (SubLObject)ConsesLow.list((SubLObject)module0035.$ic149$, var23, var24, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic34$, (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic150$, var23, var24, (SubLObject)module0035.$ic25$), var29));
    }
    
    public static SubLObject f2337(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        SubLObject var23 = (SubLObject)module0035.NIL;
        SubLObject var24 = (SubLObject)module0035.NIL;
        SubLObject var25 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic151$);
        var23 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic151$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic151$);
        var25 = var22.first();
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            return (SubLObject)ConsesLow.list((SubLObject)module0035.$ic149$, var23, var24, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic13$, var25, (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic150$, var23, var24, (SubLObject)module0035.$ic72$)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic151$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2338(final SubLObject var5) {
        SubLObject var6 = (SubLObject)module0035.NIL;
        SubLObject var7 = Sequences.reverse(var5);
        SubLObject var8 = (SubLObject)module0035.NIL;
        var8 = var7.first();
        while (module0035.NIL != var7) {
            SubLObject var10;
            final SubLObject var9 = var10 = var8;
            SubLObject var11 = (SubLObject)module0035.NIL;
            SubLObject var12 = (SubLObject)module0035.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0035.$ic143$);
            var11 = var10.first();
            var10 = (var12 = var10.rest());
            var6 = (SubLObject)ConsesLow.cons(var12, var6);
            var6 = (SubLObject)ConsesLow.cons(var11, var6);
            var7 = var7.rest();
            var8 = var7.first();
        }
        return var6;
    }
    
    public static SubLObject f2339(final SubLObject var459) {
        SubLObject var460 = (SubLObject)module0035.NIL;
        SubLObject var461;
        SubLObject var462;
        SubLObject var463;
        for (var461 = (SubLObject)module0035.NIL, var461 = var459; module0035.NIL != var461; var461 = conses_high.cddr(var461)) {
            var462 = var461.first();
            var463 = conses_high.cadr(var461);
            var460 = f2063(var460, var462, var463, (SubLObject)module0035.UNPROVIDED);
        }
        return Sequences.nreverse(var460);
    }
    
    public static SubLObject f2340(SubLObject var484, final SubLObject var485) {
        assert module0035.NIL != f2327(var484) : var484;
        assert module0035.NIL != f2327(var485) : var485;
        if (module0035.NIL == var485) {
            return var484;
        }
        if (module0035.NIL == var484) {
            return conses_high.copy_list(var485);
        }
        SubLObject var486;
        SubLObject var487;
        SubLObject var488;
        for (var486 = (SubLObject)module0035.NIL, var486 = var485; module0035.NIL != var486; var486 = conses_high.cddr(var486)) {
            var487 = var486.first();
            var488 = conses_high.cadr(var486);
            var484 = conses_high.putf(var484, var487, var488);
        }
        return var484;
    }
    
    public static SubLObject f2341(final SubLObject var484, final SubLObject var485) {
        return f2340(conses_high.copy_list(var484), var485);
    }
    
    public static SubLObject f2342(final SubLObject var459, final SubLObject var178) {
        return f2338(f2325(f2339(var459), var178));
    }
    
    public static SubLObject f2343(final SubLObject var459, final SubLObject var487, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        final SubLObject var488 = f2339(var459);
        final SubLObject var489 = f2344(var488, var487, var6, Symbols.symbol_function((SubLObject)module0035.$ic20$));
        final SubLObject var490 = f2338(var489);
        return var490;
    }
    
    public static SubLObject f2345(final SubLObject var459, final SubLObject var470) {
        SubLObject var471;
        SubLObject var472;
        SubLObject var473;
        for (var471 = (SubLObject)module0035.NIL, var471 = var459; module0035.NIL != var471; var471 = conses_high.cddr(var471)) {
            var472 = var471.first();
            var473 = conses_high.cadr(var471);
            if (var470.eql(var472)) {
                return (SubLObject)module0035.T;
            }
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2346(final SubLObject var459, final SubLObject var7) {
        return f2345(var459, var7);
    }
    
    public static SubLObject f2347(final SubLObject var7, final SubLObject var459) {
        return f2345(var459, var7);
    }
    
    public static SubLObject f2348(final SubLObject var459, final SubLObject var470) {
        if (module0035.NIL != conses_high.getf(var459, var470, (SubLObject)module0035.UNPROVIDED)) {
            return (SubLObject)module0035.T;
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2349(final SubLObject var462, final SubLObject var490, final SubLObject var491, SubLObject var162) {
        if (var162 == module0035.UNPROVIDED) {
            var162 = (SubLObject)module0035.$ic153$;
        }
        SubLObject var492 = conses_high.getf(var490, var462, var162);
        if (var492.eql(var162)) {
            var492 = conses_high.getf(var491, var462, (SubLObject)module0035.UNPROVIDED);
        }
        return var492;
    }
    
    public static SubLObject f2350(final SubLObject var492, final SubLObject var493) {
        SubLObject var494 = conses_high.copy_list(var492);
        SubLObject var495;
        SubLObject var496;
        SubLObject var497;
        for (var495 = (SubLObject)module0035.NIL, var495 = var493; module0035.NIL != var495; var495 = conses_high.cddr(var495)) {
            var496 = var495.first();
            var497 = conses_high.cadr(var495);
            var494 = f2351(var494, var496, var497);
        }
        return var494;
    }
    
    public static SubLObject f2352(final SubLObject var124, final SubLObject var496) {
        if (module0035.NIL == f2327(var124)) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var497;
        SubLObject var498;
        SubLObject var499;
        for (var497 = (SubLObject)module0035.NIL, var497 = var124; module0035.NIL != var497; var497 = conses_high.cddr(var497)) {
            var498 = var497.first();
            var499 = conses_high.cadr(var497);
            if (module0035.NIL == module0004.f104(var498, var496, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
                return (SubLObject)module0035.NIL;
            }
        }
        return (SubLObject)module0035.T;
    }
    
    public static SubLObject f2351(SubLObject var459, final SubLObject var470, final SubLObject var198) {
        if (module0035.NIL == f2345(var459, var470)) {
            var459 = conses_high.putf(var459, var470, var198);
        }
        return var459;
    }
    
    public static SubLObject f2353(final SubLObject var459) {
        SubLObject var460 = (SubLObject)module0035.NIL;
        SubLObject var461;
        SubLObject var462;
        SubLObject var463;
        for (var461 = (SubLObject)module0035.NIL, var461 = var459; module0035.NIL != var461; var461 = conses_high.cddr(var461)) {
            var462 = var461.first();
            var463 = conses_high.cadr(var461);
            var460 = (SubLObject)ConsesLow.cons(var462, var460);
        }
        return Sequences.nreverse(var460);
    }
    
    public static SubLObject f2354(final SubLObject var459) {
        return f2353(var459);
    }
    
    public static SubLObject f2355(final SubLObject var459) {
        SubLObject var460 = (SubLObject)module0035.NIL;
        SubLObject var461;
        SubLObject var462;
        SubLObject var463;
        for (var461 = (SubLObject)module0035.NIL, var461 = var459; module0035.NIL != var461; var461 = conses_high.cddr(var461)) {
            var462 = var461.first();
            var463 = conses_high.cadr(var461);
            var460 = (SubLObject)ConsesLow.cons(var463, var460);
        }
        return Sequences.nreverse(var460);
    }
    
    public static SubLObject f2356(final SubLObject var459, final SubLObject var498) {
        SubLObject var499 = (SubLObject)module0035.NIL;
        SubLObject var500;
        SubLObject var501;
        SubLObject var502;
        for (var500 = (SubLObject)module0035.NIL, var500 = var459; module0035.NIL != var500; var500 = conses_high.cddr(var500)) {
            var501 = var500.first();
            var502 = conses_high.cadr(var500);
            if (module0035.NIL != module0004.f104(var501, var498, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
                var499 = conses_high.putf(var499, var501, var502);
            }
        }
        return var499;
    }
    
    public static SubLObject f2357(final SubLObject var459, final SubLObject var499) {
        SubLObject var500 = conses_high.copy_list(var459);
        SubLObject var501 = var499;
        SubLObject var502 = (SubLObject)module0035.NIL;
        var502 = var501.first();
        while (module0035.NIL != var501) {
            var500 = conses_high.remf(var500, var502);
            var501 = var501.rest();
            var502 = var501.first();
        }
        return var500;
    }
    
    public static SubLObject f2358(final SubLObject var501, final SubLObject var470, final SubLObject var198, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQUAL);
        }
        SubLObject var502 = (SubLObject)module0035.NIL;
        SubLObject var503 = var501;
        SubLObject var504 = (SubLObject)module0035.NIL;
        var504 = var503.first();
        while (module0035.NIL != var503) {
            if (module0035.NIL != Functions.funcall(var6, conses_high.getf(var504, var470, (SubLObject)module0035.UNPROVIDED), var198)) {
                var502 = (SubLObject)ConsesLow.cons(var504, var502);
            }
            var503 = var503.rest();
            var504 = var503.first();
        }
        var502 = Sequences.nreverse(var502);
        return var502;
    }
    
    public static SubLObject f2359(final SubLObject var501, final SubLObject var470, final SubLObject var6) {
        final SubLThread var502 = SubLProcess.currentSubLThread();
        SubLObject var503 = (SubLObject)module0035.NIL;
        final SubLObject var504 = module0035.$g905$.currentBinding(var502);
        try {
            module0035.$g905$.bind(var470, var502);
            var503 = Sort.sort(conses_high.copy_list(var501), var6, (SubLObject)module0035.$ic154$);
        }
        finally {
            module0035.$g905$.rebind(var504, var502);
        }
        return var503;
    }
    
    public static SubLObject f2360(final SubLObject var459) {
        final SubLThread var460 = SubLProcess.currentSubLThread();
        return conses_high.getf(var459, module0035.$g905$.getDynamicValue(var460), (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2361(final SubLObject var502, final SubLObject var503, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = (SubLObject)module0035.EQL;
        }
        SubLObject var504;
        SubLObject var505;
        SubLObject var506;
        SubLObject var507;
        for (var504 = (SubLObject)module0035.NIL, var505 = (SubLObject)module0035.NIL, var505 = var502; module0035.NIL == var504 && module0035.NIL != var505; var505 = conses_high.cddr(var505)) {
            var506 = var505.first();
            var507 = conses_high.cadr(var505);
            if (module0035.NIL == f2346(var503, var506) || module0035.NIL == Functions.funcall(var6, var507, conses_high.getf(var503, var506, (SubLObject)module0035.UNPROVIDED))) {
                var504 = (SubLObject)module0035.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == var504);
    }
    
    public static SubLObject f2362(final SubLObject var484, final SubLObject var485, SubLObject var440) {
        if (var440 == module0035.UNPROVIDED) {
            var440 = (SubLObject)module0035.EQL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != f2361(var484, var485, var440) && module0035.NIL != f2361(var485, var484, var440));
    }
    
    public static SubLObject f2363(final SubLObject var8) {
        final SubLObject var9 = Sequences.length(var8);
        if (var9.eql((SubLObject)module0035.ZERO_INTEGER)) {
            return (SubLObject)module0035.$ic64$;
        }
        if (var9.eql((SubLObject)module0035.ONE_INTEGER)) {
            return print_high.princ_to_string(var8.first());
        }
        if (var9.eql((SubLObject)module0035.TWO_INTEGER)) {
            return PrintLow.format((SubLObject)module0035.NIL, (SubLObject)module0035.$ic155$, var8.first(), conses_high.second(var8));
        }
        final SubLObject var10 = Mapping.mapcar((SubLObject)module0035.$ic156$, var8);
        SubLObject var11 = Numbers.add(Numbers.multiply((SubLObject)module0035.TWO_INTEGER, Numbers.subtract(Sequences.length(var10), (SubLObject)module0035.ONE_INTEGER)), (SubLObject)module0035.FOUR_INTEGER);
        SubLObject var12 = var10;
        SubLObject var13 = (SubLObject)module0035.NIL;
        var13 = var12.first();
        while (module0035.NIL != var12) {
            var11 = Numbers.add(var11, Sequences.length(var13));
            var12 = var12.rest();
            var13 = var12.first();
        }
        final SubLObject var14 = Strings.make_string(var11, (SubLObject)module0035.UNPROVIDED);
        SubLObject var15 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var16 = (SubLObject)module0035.NIL;
        SubLObject var17 = (SubLObject)module0035.NIL;
        var16 = var10;
        var17 = var16.first();
        while (module0035.NIL != var16) {
            SubLObject var18;
            SubLObject var19;
            for (var18 = Sequences.length(var17), var19 = (SubLObject)module0035.NIL, var19 = (SubLObject)module0035.ZERO_INTEGER; var19.numL(var18); var19 = Numbers.add(var19, (SubLObject)module0035.ONE_INTEGER)) {
                Strings.set_char(var14, var15, Strings.sublisp_char(var17, var19));
                var15 = Numbers.add(var15, (SubLObject)module0035.ONE_INTEGER);
            }
            if (module0035.NIL != var16.rest()) {
                if (module0035.NIL != var16.rest().rest()) {
                    SubLObject var20;
                    for (var20 = (SubLObject)module0035.NIL, var20 = (SubLObject)module0035.ZERO_INTEGER; var20.numL((SubLObject)module0035.TWO_INTEGER); var20 = Numbers.add(var20, (SubLObject)module0035.ONE_INTEGER)) {
                        Strings.set_char(var14, var15, Strings.sublisp_char((SubLObject)module0035.$ic157$, var20));
                        var15 = Numbers.add(var15, (SubLObject)module0035.ONE_INTEGER);
                    }
                }
                else {
                    SubLObject var20;
                    for (var20 = (SubLObject)module0035.NIL, var20 = (SubLObject)module0035.ZERO_INTEGER; var20.numL((SubLObject)module0035.SIX_INTEGER); var20 = Numbers.add(var20, (SubLObject)module0035.ONE_INTEGER)) {
                        Strings.set_char(var14, var15, Strings.sublisp_char((SubLObject)module0035.$ic158$, var20));
                        var15 = Numbers.add(var15, (SubLObject)module0035.ONE_INTEGER);
                    }
                }
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return var14;
    }
    
    public static SubLObject f2364(final SubLObject var459, SubLObject var506) {
        if (var506 == module0035.UNPROVIDED) {
            var506 = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert module0035.NIL != f2327(var459) : var459;
        SubLObject var507;
        SubLObject var508;
        SubLObject var509;
        for (var507 = (SubLObject)module0035.NIL, var507 = var459; module0035.NIL != var507; var507 = conses_high.cddr(var507)) {
            var508 = var507.first();
            var509 = conses_high.cadr(var507);
            PrintLow.format(var506, (SubLObject)module0035.$ic159$, var508, var509);
        }
        return var459;
    }
    
    public static SubLObject f2365(final SubLObject var459, SubLObject var506) {
        if (var506 == module0035.UNPROVIDED) {
            var506 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var507 = SubLProcess.currentSubLThread();
        assert module0035.NIL != f2327(var459) : var459;
        if (module0035.NIL != var459) {
            final SubLObject var508 = reader.$read_default_float_format$.currentBinding(var507);
            try {
                reader.$read_default_float_format$.bind((SubLObject)module0035.$ic160$, var507);
                final SubLObject var509 = module0048.f3381(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0035.$ic40$), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0035.$ic161$), f2353(var459))), (SubLObject)module0035.UNPROVIDED);
                SubLObject var510;
                SubLObject var511;
                SubLObject var512;
                for (var510 = (SubLObject)module0035.NIL, var510 = var459; module0035.NIL != var510; var510 = conses_high.cddr(var510)) {
                    var511 = var510.first();
                    var512 = conses_high.cadr(var510);
                    if (var512.isDouble()) {
                        PrintLow.format(var506, (SubLObject)module0035.$ic162$, module0038.f2628(var511, var509), var512);
                    }
                    else {
                        PrintLow.format(var506, (SubLObject)module0035.$ic163$, module0038.f2628(var511, var509), var512);
                    }
                }
            }
            finally {
                reader.$read_default_float_format$.rebind(var508, var507);
            }
        }
        return var459;
    }
    
    public static SubLObject f2366(final SubLObject var5, SubLObject var506) {
        if (var506 == module0035.UNPROVIDED) {
            var506 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f2365(f2338(var5), var506);
    }
    
    public static SubLObject f2367(final SubLObject var507, SubLObject var506) {
        if (var506 == module0035.UNPROVIDED) {
            var506 = (SubLObject)module0035.T;
        }
        assert module0035.NIL != f2015(var507) : var507;
        SubLObject var508 = var507;
        SubLObject var509 = (SubLObject)module0035.NIL;
        var509 = var508.first();
        while (module0035.NIL != var508) {
            assert module0035.NIL != Types.listp(var509) : var509;
            var508 = var508.rest();
            var509 = var508.first();
        }
        SubLObject var510 = (SubLObject)module0035.NIL;
        var508 = var507;
        SubLObject var511 = (SubLObject)module0035.NIL;
        var511 = var508.first();
        while (module0035.NIL != var508) {
            var510 = (SubLObject)ConsesLow.cons(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0035.$ic164$), var511), var510);
            var508 = var508.rest();
            var511 = var508.first();
        }
        var510 = Sequences.nreverse(var510);
        final SubLObject var512 = module0048.f3381(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0035.$ic40$), var510), (SubLObject)module0035.UNPROVIDED);
        SubLObject var513 = (SubLObject)module0035.NIL;
        SubLObject var514;
        SubLObject var515;
        SubLObject var516;
        SubLObject var517;
        SubLObject var518;
        for (var514 = (SubLObject)module0035.NIL, var514 = (SubLObject)module0035.ZERO_INTEGER; var514.numL(var512); var514 = Numbers.add(var514, (SubLObject)module0035.ONE_INTEGER)) {
            var515 = (SubLObject)module0035.ZERO_INTEGER;
            var516 = var510;
            var517 = (SubLObject)module0035.NIL;
            var517 = var516.first();
            while (module0035.NIL != var516) {
                var518 = Sequences.length(ConsesLow.nth(var514, var517));
                var515 = Numbers.max(var515, var518);
                var516 = var516.rest();
                var517 = var516.first();
            }
            var513 = (SubLObject)ConsesLow.cons(var515, var513);
        }
        var513 = Sequences.nreverse(var513);
        SubLObject var519 = var510;
        SubLObject var520 = (SubLObject)module0035.NIL;
        var520 = var519.first();
        while (module0035.NIL != var519) {
            streams_high.terpri(var506);
            SubLObject var521 = (SubLObject)module0035.NIL;
            SubLObject var505_513 = (SubLObject)module0035.NIL;
            SubLObject var522 = (SubLObject)module0035.NIL;
            SubLObject var515_516 = (SubLObject)module0035.NIL;
            var521 = var520;
            var505_513 = var521.first();
            var522 = var513;
            var515_516 = var522.first();
            while (module0035.NIL != var522 || module0035.NIL != var521) {
                print_high.princ((SubLObject)module0035.$ic165$, var506);
                if (module0035.NIL != var505_513) {
                    print_high.princ(module0038.f2628(var505_513, var515_516), var506);
                }
                else {
                    print_high.princ(Strings.make_string(var515_516, (SubLObject)module0035.UNPROVIDED), var506);
                }
                var521 = var521.rest();
                var505_513 = var521.first();
                var522 = var522.rest();
                var515_516 = var522.first();
            }
            var519 = var519.rest();
            var520 = var519.first();
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2368(final SubLObject var8, SubLObject var517, SubLObject var506) {
        if (var517 == module0035.UNPROVIDED) {
            var517 = (SubLObject)Characters.CHAR_comma;
        }
        if (var506 == module0035.UNPROVIDED) {
            var506 = (SubLObject)module0035.T;
        }
        assert module0035.NIL != Types.listp(var8) : var8;
        print_high.prin1(var8.first(), var506);
        SubLObject var518 = var8.rest();
        SubLObject var519 = (SubLObject)module0035.NIL;
        var519 = var518.first();
        while (module0035.NIL != var518) {
            print_high.princ(var517, var506);
            print_high.prin1(var519, var506);
            var518 = var518.rest();
            var519 = var518.first();
        }
        return var8;
    }
    
    public static SubLObject f2369(final SubLObject var178, final SubLObject var8, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var179 = (SubLObject)module0035.NIL;
        if (var7.eql(Symbols.symbol_function((SubLObject)module0035.IDENTITY)) || var7 == module0035.IDENTITY) {
            if (module0035.NIL == var179) {
                SubLObject var180;
                SubLObject var181;
                for (var180 = var8, var181 = (SubLObject)module0035.NIL, var181 = var180.first(); module0035.NIL == var179 && module0035.NIL != var180; var179 = Functions.funcall(var178, var181), var180 = var180.rest(), var181 = var180.first()) {}
            }
        }
        else if (module0035.NIL == var179) {
            SubLObject var180;
            SubLObject var181;
            for (var180 = var8, var181 = (SubLObject)module0035.NIL, var181 = var180.first(); module0035.NIL == var179 && module0035.NIL != var180; var179 = Functions.funcall(var178, Functions.funcall(var7, var181)), var180 = var180.rest(), var181 = var180.first()) {}
        }
        return var179;
    }
    
    public static SubLObject f2370(final SubLObject var178, final SubLObject var8, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var179 = (SubLObject)module0035.NIL;
        if (var7.eql(Symbols.symbol_function((SubLObject)module0035.IDENTITY)) || var7 == module0035.IDENTITY) {
            if (module0035.NIL == var179) {
                SubLObject var180;
                SubLObject var181;
                for (var180 = var8, var181 = (SubLObject)module0035.NIL, var181 = var180.first(); module0035.NIL == var179 && module0035.NIL != var180; var179 = (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == Functions.funcall(var178, var181)), var180 = var180.rest(), var181 = var180.first()) {}
            }
        }
        else if (module0035.NIL == var179) {
            SubLObject var180;
            SubLObject var181;
            for (var180 = var8, var181 = (SubLObject)module0035.NIL, var181 = var180.first(); module0035.NIL == var179 && module0035.NIL != var180; var179 = (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == Functions.funcall(var178, Functions.funcall(var7, var181))), var180 = var180.rest(), var181 = var180.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == var179);
    }
    
    public static SubLObject f2371(final SubLObject var178, final SubLObject var8, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == f2369(var178, var8, var7));
    }
    
    public static SubLObject f2372(final SubLObject var178, final SubLObject var8, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == f2370(var178, var8, var7));
    }
    
    public static SubLObject f2373(final SubLObject var484, final SubLObject var485, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        SubLObject var486 = (SubLObject)module0035.NIL;
        SubLObject var487 = (SubLObject)module0035.NIL;
        SubLObject var488;
        SubLObject var489;
        SubLObject var490;
        for (var488 = (SubLObject)module0035.NIL, var488 = var484; module0035.NIL != var488; var488 = conses_high.cddr(var488)) {
            var489 = var488.first();
            var490 = conses_high.cadr(var488);
            if (module0035.NIL == Functions.funcall(var6, var490, conses_high.getf(var485, var489, (SubLObject)module0035.UNPROVIDED))) {
                var486 = conses_high.putf(var486, var489, var490);
            }
        }
        for (var488 = (SubLObject)module0035.NIL, var488 = var485; module0035.NIL != var488; var488 = conses_high.cddr(var488)) {
            var489 = var488.first();
            var490 = conses_high.cadr(var488);
            if (module0035.NIL == Functions.funcall(var6, var490, conses_high.getf(var484, var489, (SubLObject)module0035.UNPROVIDED))) {
                var487 = conses_high.putf(var487, var489, var490);
            }
        }
        return Values.values(var486, var487);
    }
    
    public static SubLObject f2374(final SubLObject var8, final SubLObject var520) {
        final SubLThread var521 = SubLProcess.currentSubLThread();
        assert module0035.NIL != Types.listp(var8) : var8;
        assert module0035.NIL != Types.listp(var520) : var520;
        if (module0035.NIL == var520) {
            return (SubLObject)ConsesLow.list(var8);
        }
        SubLObject var522 = (SubLObject)module0035.NIL;
        final SubLObject var523 = module0035.$g906$.currentBinding(var521);
        try {
            module0035.$g906$.bind((SubLObject)module0035.NIL, var521);
            var522 = f2375(var8, var520, (SubLObject)module0035.ZERO_INTEGER);
        }
        finally {
            module0035.$g906$.rebind(var523, var521);
        }
        return var522;
    }
    
    public static SubLObject f2375(final SubLObject var8, final SubLObject var520, final SubLObject var273) {
        final SubLThread var521 = SubLProcess.currentSubLThread();
        final SubLObject var522 = conses_high.assoc(var8, module0035.$g906$.getDynamicValue(var521), (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED).rest();
        if (module0035.NIL != var522) {
            return var522;
        }
        SubLObject var523 = (SubLObject)module0035.NIL;
        if (module0035.NIL == var8) {
            var523 = (SubLObject)ConsesLow.list((SubLObject)module0035.NIL);
        }
        else {
            final SubLObject var524 = var8.first();
            final SubLObject var525 = var8.rest();
            final SubLObject var526 = Numbers.add(var273, (SubLObject)module0035.ONE_INTEGER);
            final SubLObject var527 = conses_high.member(var526, var520, Symbols.symbol_function((SubLObject)module0035.$ic99$), Symbols.symbol_function((SubLObject)module0035.$ic20$));
            SubLObject var529;
            final SubLObject var528 = var529 = f2375(var525, var527, var526);
            SubLObject var530 = (SubLObject)module0035.NIL;
            var530 = var529.first();
            while (module0035.NIL != var529) {
                var523 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var524, var530), var523);
                var529 = var529.rest();
                var530 = var529.first();
            }
            final SubLObject var531 = conses_high.member(var273, var520, Symbols.symbol_function((SubLObject)module0035.$ic99$), Symbols.symbol_function((SubLObject)module0035.$ic20$));
            SubLObject var532 = (SubLObject)module0035.NIL;
            if (module0035.NIL == var532) {
                SubLObject var533 = var531;
                SubLObject var534 = (SubLObject)module0035.NIL;
                var534 = var533.first();
                while (module0035.NIL == var532 && module0035.NIL != var533) {
                    SubLObject var536;
                    final SubLObject var535 = var536 = var534;
                    SubLObject var537 = (SubLObject)module0035.NIL;
                    SubLObject var538 = (SubLObject)module0035.NIL;
                    SubLObject var539 = (SubLObject)module0035.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var536, var535, (SubLObject)module0035.$ic166$);
                    var537 = var536.first();
                    var536 = var536.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var536, var535, (SubLObject)module0035.$ic166$);
                    var538 = var536.first();
                    var536 = var536.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var536, var535, (SubLObject)module0035.$ic166$);
                    var539 = var536.first();
                    var536 = var536.rest();
                    if (module0035.NIL == var536) {
                        if (var273.numE(var537)) {
                            final SubLObject var540 = conses_high.nthcdr(var538, var8);
                            final SubLObject var541 = Numbers.add(var273, var538);
                            final SubLObject var542 = conses_high.member(var541, var520, Symbols.symbol_function((SubLObject)module0035.$ic99$), Symbols.symbol_function((SubLObject)module0035.$ic20$));
                            SubLObject var544;
                            final SubLObject var543 = var544 = f2375(var540, var542, var541);
                            SubLObject var545 = (SubLObject)module0035.NIL;
                            var545 = var544.first();
                            while (module0035.NIL != var544) {
                                var523 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var539, var545), var523);
                                var544 = var544.rest();
                                var545 = var544.first();
                            }
                        }
                        else {
                            var532 = (SubLObject)module0035.T;
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var535, (SubLObject)module0035.$ic166$);
                    }
                    var533 = var533.rest();
                    var534 = var533.first();
                }
            }
            var523 = Sequences.nreverse(var523);
        }
        module0035.$g906$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var8, var523), module0035.$g906$.getDynamicValue(var521)), var521);
        return var523;
    }
    
    public static SubLObject f2376(final SubLObject var8, final SubLObject var520) {
        assert module0035.NIL != Types.listp(var8) : var8;
        assert module0035.NIL != Types.listp(var520) : var520;
        if (module0035.NIL == var520) {
            return var8;
        }
        return f2377(var8, var520, (SubLObject)module0035.ZERO_INTEGER);
    }
    
    public static SubLObject f2377(final SubLObject var8, final SubLObject var520, final SubLObject var273) {
        if (module0035.NIL == var8) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var521 = conses_high.member(var273, var520, Symbols.symbol_function((SubLObject)module0035.$ic99$), Symbols.symbol_function((SubLObject)module0035.$ic20$));
        final SubLObject var522 = conses_high.member(var273, var521, Symbols.symbol_function((SubLObject)module0035.$ic98$), Symbols.symbol_function((SubLObject)module0035.$ic20$));
        if (var521.eql(var522)) {
            return (SubLObject)ConsesLow.cons(var8.first(), f2377(var8.rest(), var522, Numbers.add(var273, (SubLObject)module0035.ONE_INTEGER)));
        }
        while (module0035.NIL != var521.rest() && var273.numE(conses_high.caar(var521.rest()))) {
            var521 = var521.rest();
        }
        SubLObject var524;
        final SubLObject var523 = var524 = var521.first();
        SubLObject var525 = (SubLObject)module0035.NIL;
        SubLObject var526 = (SubLObject)module0035.NIL;
        SubLObject var527 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var524, var523, (SubLObject)module0035.$ic166$);
        var525 = var524.first();
        var524 = var524.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var524, var523, (SubLObject)module0035.$ic166$);
        var526 = var524.first();
        var524 = var524.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var524, var523, (SubLObject)module0035.$ic166$);
        var527 = var524.first();
        var524 = var524.rest();
        if (module0035.NIL == var524) {
            final SubLObject var528 = conses_high.nthcdr(var526, var8);
            final SubLObject var529 = Numbers.add(var273, var526);
            final SubLObject var530 = conses_high.member(var529, var520, Symbols.symbol_function((SubLObject)module0035.$ic99$), Symbols.symbol_function((SubLObject)module0035.$ic20$));
            return (SubLObject)ConsesLow.cons(var527, f2377(var528, var530, var529));
        }
        cdestructuring_bind.cdestructuring_bind_error(var523, (SubLObject)module0035.$ic166$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2378(final SubLObject var8, final SubLObject var6, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        assert module0035.NIL != Types.listp(var8) : var8;
        if (module0035.NIL == var8) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var9 = var8.first();
        final SubLObject var10 = var8.rest();
        if (var7.eql(Symbols.symbol_function((SubLObject)module0035.IDENTITY)) || var7 == module0035.IDENTITY) {
            SubLObject var11 = var10;
            SubLObject var12 = (SubLObject)module0035.NIL;
            var12 = var11.first();
            while (module0035.NIL != var11) {
                if (module0035.NIL != Functions.funcall(var6, var12, var9)) {
                    var9 = var12;
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        else {
            SubLObject var11 = var10;
            SubLObject var12 = (SubLObject)module0035.NIL;
            var12 = var11.first();
            while (module0035.NIL != var11) {
                if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var12), Functions.funcall(var7, var9))) {
                    var9 = var12;
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        return var9;
    }
    
    public static SubLObject f2379(final SubLObject var8, final SubLObject var6, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        assert module0035.NIL != Types.listp(var8) : var8;
        if (module0035.NIL == var8) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var9 = (SubLObject)ConsesLow.list(var8.first());
        final SubLObject var10 = var8.rest();
        if (var7.eql(Symbols.symbol_function((SubLObject)module0035.IDENTITY)) || var7 == module0035.IDENTITY) {
            SubLObject var11 = var10;
            SubLObject var12 = (SubLObject)module0035.NIL;
            var12 = var11.first();
            while (module0035.NIL != var11) {
                if (module0035.NIL != Functions.funcall(var6, var12, var9.first())) {
                    var9 = (SubLObject)ConsesLow.list(var12);
                }
                else if (module0035.NIL == Functions.funcall(var6, var9.first(), var12)) {
                    var9 = (SubLObject)ConsesLow.cons(var12, var9);
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        else {
            SubLObject var11 = var10;
            SubLObject var12 = (SubLObject)module0035.NIL;
            var12 = var11.first();
            while (module0035.NIL != var11) {
                if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var12), Functions.funcall(var7, var9.first()))) {
                    var9 = (SubLObject)ConsesLow.list(var12);
                }
                else if (module0035.NIL == Functions.funcall(var6, Functions.funcall(var7, var9.first()), Functions.funcall(var7, var12))) {
                    var9 = (SubLObject)ConsesLow.cons(var12, var9);
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        return var9;
    }
    
    public static SubLObject f2380(final SubLObject var545, final SubLObject var8, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        assert module0035.NIL != Types.integerp(var545) : var545;
        assert module0035.NIL != Numbers.plusp(var545) : var545;
        assert module0035.NIL != Types.listp(var8) : var8;
        if (module0035.NIL == var8) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var546 = (SubLObject)module0035.ONE_INTEGER;
        SubLObject var547 = (SubLObject)module0035.ONE_INTEGER;
        SubLObject var548 = Functions.funcall(var7, var8.first());
        SubLObject var549 = (SubLObject)module0035.NIL;
        SubLObject var550 = (SubLObject)module0035.NIL;
        if (var546.numE(var545)) {
            var549 = (SubLObject)ConsesLow.cons(var8.first(), var549);
        }
        if (module0035.NIL == var550) {
            SubLObject var551 = var8.rest();
            SubLObject var552 = (SubLObject)module0035.NIL;
            var552 = var551.first();
            while (module0035.NIL == var550 && module0035.NIL != var551) {
                var547 = Numbers.add(var547, (SubLObject)module0035.ONE_INTEGER);
                final SubLObject var553 = Functions.funcall(var7, var552);
                if (module0035.NIL == Functions.funcall(var6, var548, var553)) {
                    var546 = var547;
                }
                if (var546.numE(var545)) {
                    var549 = (SubLObject)ConsesLow.cons(var552, var549);
                }
                var548 = var553;
                var550 = Numbers.numG(var546, var545);
                var551 = var551.rest();
                var552 = var551.first();
            }
        }
        return Sequences.nreverse(var549);
    }
    
    public static SubLObject f2381(final SubLObject var548, final SubLObject var549, SubLObject var6, SubLObject var550, SubLObject var551) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var550 == module0035.UNPROVIDED) {
            var550 = (SubLObject)module0035.$ic168$;
        }
        if (var551 == module0035.UNPROVIDED) {
            var551 = (SubLObject)module0035.$ic168$;
        }
        final SubLObject var552 = Sequences.length(var548);
        final SubLObject var553 = module0067.f4880(var6, var552);
        SubLObject var554 = (SubLObject)module0035.NIL;
        SubLObject var555 = (SubLObject)module0035.NIL;
        SubLObject var556 = (SubLObject)module0035.NIL;
        var554 = var548;
        var555 = var554.first();
        for (var556 = (SubLObject)module0035.ZERO_INTEGER; module0035.NIL != var554; var554 = var554.rest(), var555 = var554.first(), var556 = Numbers.add((SubLObject)module0035.ONE_INTEGER, var556)) {
            module0067.f4886(var553, var555, Numbers.multiply(var556, var550));
        }
        var554 = (SubLObject)module0035.NIL;
        var555 = (SubLObject)module0035.NIL;
        var556 = (SubLObject)module0035.NIL;
        var554 = var549;
        var555 = var554.first();
        for (var556 = (SubLObject)module0035.ZERO_INTEGER; module0035.NIL != var554; var554 = var554.rest(), var555 = var554.first(), var556 = Numbers.add((SubLObject)module0035.ONE_INTEGER, var556)) {
            final SubLObject var550_554 = module0067.f4884(var553, var555, (SubLObject)module0035.UNPROVIDED);
            if (var550_554.isNumber()) {
                final SubLObject var557 = Numbers.add(var550_554, Numbers.multiply(var556, var551));
                module0067.f4886(var553, var555, var557);
            }
        }
        return module0084.f5796(var553, Symbols.symbol_function((SubLObject)module0035.$ic98$), (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2382(final SubLObject var342) {
        if (module0035.NIL == var342) {
            return (SubLObject)ConsesLow.list(var342);
        }
        final SubLObject var343 = var342.first();
        final SubLObject var344 = f2382(var342.rest());
        final SubLObject var345 = conses_high.copy_list(var344);
        SubLObject var346 = (SubLObject)module0035.NIL;
        SubLObject var347 = (SubLObject)module0035.NIL;
        var346 = var345;
        var347 = var346.first();
        while (module0035.NIL != var346) {
            ConsesLow.rplaca(var346, (SubLObject)ConsesLow.cons(var343, var347));
            var346 = var346.rest();
            var347 = var346.first();
        }
        return ConsesLow.nconc(var344, var345);
    }
    
    public static SubLObject f2383(final SubLObject var342, final SubLObject var559) {
        if (module0035.NIL != f1995(var342, var559, (SubLObject)module0035.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(var342);
        }
        if (module0035.NIL != f2002(var342, var559, (SubLObject)module0035.UNPROVIDED)) {
            return f2384(var342, var559);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2384(final SubLObject var342, final SubLObject var559) {
        if (var559.numE((SubLObject)module0035.ZERO_INTEGER)) {
            return (SubLObject)module0035.$ic72$;
        }
        if (!var559.numGE((SubLObject)module0035.ONE_INTEGER)) {
            return (SubLObject)module0035.NIL;
        }
        if (module0035.NIL == var342) {
            return (SubLObject)module0035.NIL;
        }
        final SubLObject var560 = f2384(var342.rest(), Numbers.subtract(var559, (SubLObject)module0035.ONE_INTEGER));
        SubLObject var561 = (SubLObject)module0035.NIL;
        SubLObject var562 = var560;
        SubLObject var563 = (SubLObject)module0035.NIL;
        var563 = var562.first();
        while (module0035.NIL != var562) {
            var561 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var342.first(), var563), var561);
            var562 = var562.rest();
            var563 = var562.first();
        }
        return ConsesLow.append(var561, f2384(var342.rest(), var559));
    }
    
    public static SubLObject f2385(final SubLObject var221, final SubLObject var223, final SubLObject var487, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        final SubLObject var488 = Sequences.position(var221, var487, var6, var7, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
        final SubLObject var489 = Sequences.position(var223, var487, var6, var7, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
        if (!var488.isInteger()) {
            return (SubLObject)module0035.NIL;
        }
        if (var489.isInteger()) {
            return Numbers.numL(var488, var489);
        }
        return (SubLObject)module0035.T;
    }
    
    public static SubLObject f2344(final SubLObject var110, final SubLObject var487, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        final SubLThread var488 = SubLProcess.currentSubLThread();
        assert module0035.NIL != Types.sequencep(var110) : var110;
        assert module0035.NIL != Types.sequencep(var487) : var487;
        SubLObject var489 = (SubLObject)module0035.NIL;
        final SubLObject var490 = module0035.$g907$.currentBinding(var488);
        final SubLObject var491 = module0035.$g908$.currentBinding(var488);
        try {
            module0035.$g907$.bind(var487, var488);
            module0035.$g908$.bind(var6, var488);
            var489 = Sort.sort(var110, (SubLObject)module0035.$ic169$, var7);
        }
        finally {
            module0035.$g908$.rebind(var491, var488);
            module0035.$g907$.rebind(var490, var488);
        }
        return var489;
    }
    
    public static SubLObject f2386(final SubLObject var110, final SubLObject var487, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        final SubLThread var488 = SubLProcess.currentSubLThread();
        assert module0035.NIL != Types.sequencep(var110) : var110;
        assert module0035.NIL != Types.sequencep(var487) : var487;
        SubLObject var489 = (SubLObject)module0035.NIL;
        final SubLObject var490 = module0035.$g907$.currentBinding(var488);
        final SubLObject var491 = module0035.$g908$.currentBinding(var488);
        try {
            module0035.$g907$.bind(var487, var488);
            module0035.$g908$.bind(var6, var488);
            var489 = Sort.stable_sort(var110, (SubLObject)module0035.$ic169$, var7);
        }
        finally {
            module0035.$g908$.rebind(var491, var488);
            module0035.$g907$.rebind(var490, var488);
        }
        return var489;
    }
    
    public static SubLObject f2387(final SubLObject var221, final SubLObject var223) {
        final SubLThread var224 = SubLProcess.currentSubLThread();
        return f2385(var221, var223, module0035.$g907$.getDynamicValue(var224), module0035.$g908$.getDynamicValue(var224), (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2388(final SubLObject var110, final SubLObject var6, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        SubLObject var112 = (SubLObject)module0035.NIL;
        final SubLObject var113 = module0035.$g909$.currentBinding(var111);
        try {
            module0035.$g909$.bind(var6, var111);
            var112 = Sort.sort(var110, (SubLObject)module0035.$ic170$, var7);
        }
        finally {
            module0035.$g909$.rebind(var113, var111);
        }
        return var112;
    }
    
    public static SubLObject f2389(final SubLObject var110, final SubLObject var6, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        SubLObject var112 = (SubLObject)module0035.NIL;
        final SubLObject var113 = module0035.$g909$.currentBinding(var111);
        try {
            module0035.$g909$.bind(var6, var111);
            var112 = Sort.stable_sort(var110, (SubLObject)module0035.$ic170$, var7);
        }
        finally {
            module0035.$g909$.rebind(var113, var111);
        }
        return var112;
    }
    
    public static SubLObject f2390(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != Functions.funcall(module0035.$g909$.getDynamicValue(var4), var2) && module0035.NIL == Functions.funcall(module0035.$g909$.getDynamicValue(var4), var3));
    }
    
    public static SubLObject f2391(final SubLObject var8, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return Sort.sort(var8, Symbols.symbol_function((SubLObject)module0035.$ic98$), var7);
    }
    
    public static SubLObject f2392(final SubLObject var8, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return Sort.sort(var8, Symbols.symbol_function((SubLObject)module0035.$ic171$), var7);
    }
    
    public static SubLObject f2393(final SubLObject var8, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return Sort.sort(var8, Symbols.symbol_function((SubLObject)module0035.$ic134$), var7);
    }
    
    public static SubLObject f2394(final SubLObject var8, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return Sort.sort(var8, Symbols.symbol_function((SubLObject)module0035.$ic172$), var7);
    }
    
    public static SubLObject f2395(final SubLObject var565, final SubLObject var566, SubLObject var567) {
        if (var567 == module0035.UNPROVIDED) {
            var567 = (SubLObject)module0035.$ic173$;
        }
        SubLObject var568 = (SubLObject)module0035.NIL;
        SubLObject var569 = (SubLObject)module0035.NIL;
        SubLObject var570 = var565;
        SubLObject var571 = (SubLObject)module0035.NIL;
        var571 = var570.first();
        while (module0035.NIL != var570) {
            SubLObject var572 = (SubLObject)module0035.NIL;
            SubLObject var38_572 = var571;
            SubLObject var573 = (SubLObject)module0035.NIL;
            var573 = var38_572.first();
            while (module0035.NIL != var38_572) {
                var572 = (SubLObject)ConsesLow.cons(Sort.sort(var573, var567, (SubLObject)module0035.UNPROVIDED), var572);
                var38_572 = var38_572.rest();
                var573 = var38_572.first();
            }
            var568 = (SubLObject)ConsesLow.cons(Sort.sort(var572, (SubLObject)module0035.$ic174$, (SubLObject)module0035.UNPROVIDED), var568);
            var570 = var570.rest();
            var571 = var570.first();
        }
        var570 = var566;
        SubLObject var574 = (SubLObject)module0035.NIL;
        var574 = var570.first();
        while (module0035.NIL != var570) {
            SubLObject var575 = (SubLObject)module0035.NIL;
            SubLObject var38_573 = var574;
            SubLObject var576 = (SubLObject)module0035.NIL;
            var576 = var38_573.first();
            while (module0035.NIL != var38_573) {
                var575 = (SubLObject)ConsesLow.cons(Sort.sort(var576, var567, (SubLObject)module0035.UNPROVIDED), var575);
                var38_573 = var38_573.rest();
                var576 = var38_573.first();
            }
            var569 = (SubLObject)ConsesLow.cons(Sort.sort(var575, (SubLObject)module0035.$ic174$, (SubLObject)module0035.UNPROVIDED), var569);
            var570 = var570.rest();
            var574 = var570.first();
        }
        return f2396(var568, var569, var567);
    }
    
    public static SubLObject f2396(final SubLObject var570, final SubLObject var573, SubLObject var567) {
        if (var567 == module0035.UNPROVIDED) {
            var567 = (SubLObject)module0035.$ic173$;
        }
        SubLObject var574 = (SubLObject)module0035.NIL;
        SubLObject var575 = (SubLObject)module0035.NIL;
        SubLObject var576 = var570;
        SubLObject var577 = (SubLObject)module0035.NIL;
        var577 = var576.first();
        while (module0035.NIL != var576) {
            var574 = (SubLObject)ConsesLow.cons(Sort.sort(var577, var567, (SubLObject)module0035.UNPROVIDED), var574);
            var576 = var576.rest();
            var577 = var576.first();
        }
        var576 = var573;
        SubLObject var578 = (SubLObject)module0035.NIL;
        var578 = var576.first();
        while (module0035.NIL != var576) {
            var575 = (SubLObject)ConsesLow.cons(Sort.sort(var578, var567, (SubLObject)module0035.UNPROVIDED), var575);
            var576 = var576.rest();
            var578 = var576.first();
        }
        return f2397(var574, var575, var567);
    }
    
    public static SubLObject f2397(final SubLObject var308, final SubLObject var309, SubLObject var567) {
        if (var567 == module0035.UNPROVIDED) {
            var567 = (SubLObject)module0035.$ic173$;
        }
        return Functions.funcall(var567, Sort.sort(var308, var567, (SubLObject)module0035.UNPROVIDED), Sort.sort(var309, var567, (SubLObject)module0035.UNPROVIDED));
    }
    
    public static SubLObject f2398(final SubLObject var8, SubLObject var576) {
        if (var576 == module0035.UNPROVIDED) {
            var576 = (SubLObject)module0035.NIL;
        }
        SubLObject var577 = conses_high.copy_tree(var8);
        SubLObject var579;
        final SubLObject var578 = var579 = f2399(var8, (SubLObject)module0035.$ic175$, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
        SubLObject var580 = (SubLObject)module0035.NIL;
        var580 = var579.first();
        while (module0035.NIL != var579) {
            var577 = conses_high.subst(var576, var580, var577, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
            var579 = var579.rest();
            var580 = var579.first();
        }
        return var577;
    }
    
    public static SubLObject f2400(final SubLObject var580) {
        return Sort.sort(var580, (SubLObject)module0035.$ic176$, (SubLObject)module0035.UNPROVIDED).first();
    }
    
    public static SubLObject f2401(final SubLObject var581, final SubLObject var582) {
        return f2402(var581, var582, (SubLObject)module0035.$ic177$, Symbols.symbol_function((SubLObject)module0035.EQL));
    }
    
    public static SubLObject f2403(final SubLObject var93) {
        return Sort.sort(var93, (SubLObject)module0035.$ic173$, (SubLObject)module0035.UNPROVIDED).first();
    }
    
    public static SubLObject f2404(final SubLObject var349, final SubLObject var350) {
        return f2402(var349, var350, (SubLObject)module0035.$ic134$, Symbols.symbol_function((SubLObject)module0035.EQL));
    }
    
    public static SubLObject f2405(final SubLObject var583, final SubLObject var584) {
        return (SubLObject)(var583.isNumber() ? (var584.isNumber() ? Numbers.numL(var583, var584) : module0035.NIL) : (var584.isNumber() ? module0035.T : module0035.NIL));
    }
    
    public static SubLObject f2406(final SubLObject var583, final SubLObject var584) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!var583.eql(var584) && module0035.NIL == f2405(var583, var584));
    }
    
    public static SubLObject f2407(final SubLObject var583, final SubLObject var584) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var583.eql(var584) || module0035.NIL == f2405(var583, var584));
    }
    
    public static SubLObject f2408(final SubLObject var583, final SubLObject var584) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var583.eql(var584) || module0035.NIL != f2405(var583, var584));
    }
    
    public static SubLObject f2409(final SubLObject var8, SubLObject var162) {
        if (var162 == module0035.UNPROVIDED) {
            var162 = (SubLObject)module0035.ZERO_INTEGER;
        }
        final SubLObject var163 = f2378(var8, (SubLObject)module0035.$ic172$, (SubLObject)module0035.UNPROVIDED);
        return var163.isNumber() ? var163 : var162;
    }
    
    public static SubLObject f2410(final SubLObject var583, final SubLObject var584) {
        if (var583.isNumber() && var584.isNumber()) {
            return Numbers.subtract(var583, var584);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2411(final SubLObject var583, final SubLObject var584) {
        if (var583.isNumber() && var584.isNumber() && !module0035.ZERO_INTEGER.numE(var584)) {
            return Numbers.divide(var583, var584);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2412(final SubLObject var583, final SubLObject var584) {
        if (var583.isNumber() && var584.isNumber()) {
            return Numbers.multiply(var583, var584);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2413(final SubLObject var583, final SubLObject var584) {
        if (var583.isNumber() && var584.isNumber()) {
            return Numbers.add(var583, var584);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2414(final SubLObject var583, final SubLObject var584) {
        if (var583.isNumber() && var584.isNumber()) {
            return Numbers.numE(var583, var584);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2415(final SubLObject var583, final SubLObject var584) {
        return Numbers.numL(Numbers.abs(var583), Numbers.abs(var584));
    }
    
    public static SubLObject f2416(final SubLObject var583, final SubLObject var584) {
        return Numbers.numG(Numbers.abs(var583), Numbers.abs(var584));
    }
    
    public static SubLObject f2417(final SubLObject var583, final SubLObject var584) {
        if (var583.isNumber() && var584.isNumber()) {
            return Numbers.numE(var583, var584);
        }
        return Equality.equal(var583, var584);
    }
    
    public static SubLObject f2402(final SubLObject var349, final SubLObject var350, SubLObject var6, SubLObject var585) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.$ic98$);
        }
        if (var585 == module0035.UNPROVIDED) {
            var585 = Symbols.symbol_function((SubLObject)module0035.$ic178$);
        }
        return Equality.eq((SubLObject)module0035.$ic179$, f2418(var349, var350, var6, var585));
    }
    
    public static SubLObject f2418(final SubLObject var349, final SubLObject var350, final SubLObject var6, final SubLObject var585) {
        if (var349.isCons()) {
            if (!var350.isCons()) {
                return (SubLObject)module0035.$ic179$;
            }
            SubLObject var586;
            SubLObject var587;
            SubLObject var588;
            SubLObject var589;
            SubLObject var590;
            for (var586 = (SubLObject)module0035.$ic180$, var587 = (SubLObject)module0035.NIL, var588 = (SubLObject)module0035.NIL, var589 = (SubLObject)module0035.NIL, var590 = (SubLObject)module0035.NIL, var587 = var349, var588 = var587.first(), var589 = var350, var590 = var589.first(); var586 == module0035.$ic180$ && module0035.NIL != var587 && module0035.NIL != var589; var586 = f2418(var588, var590, var6, var585), var587 = var587.rest(), var588 = var587.first(), var589 = var589.rest(), var590 = var589.first()) {}
            if (module0035.NIL == var587 && module0035.NIL != var589) {
                return (SubLObject)module0035.$ic179$;
            }
            if (module0035.NIL == var589 && module0035.NIL != var587) {
                return (SubLObject)module0035.$ic181$;
            }
            return var586;
        }
        else {
            if (var350.isCons()) {
                return (SubLObject)module0035.$ic181$;
            }
            return (SubLObject)((module0035.NIL != Functions.funcall(var6, var349, var350)) ? module0035.$ic179$ : ((module0035.NIL != Functions.funcall(var585, var349, var350)) ? module0035.$ic180$ : module0035.$ic181$));
        }
    }
    
    public static SubLObject f2419(final SubLObject var8, final SubLObject var591) {
        final SubLObject var592 = Sort.sort(conses_high.copy_list(var8), var591, (SubLObject)module0035.UNPROVIDED);
        final SubLObject var593 = Sequences.length(var592);
        final SubLObject var594 = Numbers.integerDivide(var593, (SubLObject)module0035.TWO_INTEGER);
        return ConsesLow.nth(var594, var592);
    }
    
    public static SubLObject f2420(final SubLObject var313) {
        return f2378(var313, Symbols.symbol_function((SubLObject)module0035.$ic98$), Symbols.symbol_function((SubLObject)module0035.$ic40$));
    }
    
    public static SubLObject f2421(final SubLObject var313) {
        return f2378(var313, Symbols.symbol_function((SubLObject)module0035.$ic171$), Symbols.symbol_function((SubLObject)module0035.$ic40$));
    }
    
    public static SubLObject f2422(final SubLObject var93) {
        if (var93.isAtom()) {
            return (SubLObject)module0035.ZERO_INTEGER;
        }
        SubLObject var94 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var95;
        for (var95 = (SubLObject)module0035.NIL, var95 = var93; !var95.isAtom(); var95 = var95.rest()) {
            var94 = Numbers.add(var94, (SubLObject)module0035.ONE_INTEGER);
            var94 = Numbers.add(var94, f2422(var95.first()));
        }
        if (module0035.NIL != var95) {
            var94 = Numbers.add(var94, f2422(var95));
        }
        return var94;
    }
    
    public static SubLObject f2423(final SubLObject var4, final SubLObject var1, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (module0035.NIL != Functions.funcall(var6, var4, Functions.funcall(var7, var1))) {
            return (SubLObject)module0035.NIL;
        }
        if (!var1.isCons()) {
            return var1;
        }
        if (module0035.NIL != Functions.funcall(var6, var4, Functions.funcall(var7, var1.first()))) {
            return f2423(var4, var1.rest(), var6, var7);
        }
        return ConsesLow.rplacd(ConsesLow.rplaca(var1, f2423(var4, var1.first(), var6, var7)), f2423(var4, var1.rest(), var6, var7));
    }
    
    public static SubLObject f2424(final SubLObject var215, final SubLObject var93, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (!var93.isCons()) {
            Functions.funcall(var215, Functions.funcall(var7, var93));
        }
        else {
            SubLObject var216;
            for (var216 = (SubLObject)module0035.NIL, var216 = var93; !var216.isAtom(); var216 = var216.rest()) {
                f2424(var215, var216.first(), var7);
            }
            if (module0035.NIL != var216) {
                Functions.funcall(var215, Functions.funcall(var7, var216));
            }
        }
        return var93;
    }
    
    public static SubLObject f2425(final SubLObject var1, final SubLObject var351, final SubLObject var593, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var1.isAtom()) {
            if (module0035.NIL != Functions.funcall(var351, Functions.funcall(var7, var1))) {
                return Functions.funcall(var593, var1);
            }
            return var1;
        }
        else {
            if (!var1.isCons()) {
                return (SubLObject)module0035.NIL;
            }
            SubLObject var594;
            for (var594 = (SubLObject)module0035.NIL, var594 = var1; var594.isCons(); var594 = var594.rest()) {
                ConsesLow.rplaca(var594, f2425(var594.first(), var351, var593, var7));
                if (!var594.rest().isCons()) {
                    ConsesLow.rplacd(var594, f2425(var594.rest(), var351, var593, var7));
                }
            }
            if (module0035.NIL != Functions.funcall(var351, Functions.funcall(var7, var1))) {
                return Functions.funcall(var593, var1);
            }
            return var1;
        }
    }
    
    public static SubLObject f2426(final SubLObject var1, final SubLObject var351, final SubLObject var593, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2425(conses_high.copy_tree(var1), var351, var593, var7);
    }
    
    public static SubLObject f2427(final SubLObject var4, final SubLObject var1, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2428(var4, var1, var6, var7);
    }
    
    public static SubLObject f2428(final SubLObject var4, final SubLObject var1, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)module0035.NIL;
        SubLObject var10 = (SubLObject)module0035.NIL;
        if (module0035.NIL != var4 && (var7.eql(Symbols.symbol_function((SubLObject)module0035.IDENTITY)) || var7 == module0035.IDENTITY)) {
            if (var6.eql(Symbols.symbol_function((SubLObject)module0035.EQ)) || var6 == module0035.EQ) {
                var9 = f2429(var4, var1);
                var10 = sublisp_boolean(var9);
            }
            else if (var6.eql(Symbols.symbol_function((SubLObject)module0035.EQL)) || var6 == module0035.EQL) {
                var9 = f2430(var4, var1);
                var10 = sublisp_boolean(var9);
            }
            else if (var6.eql(Symbols.symbol_function((SubLObject)module0035.EQUAL)) || var6 == module0035.EQUAL) {
                var9 = f2431(var4, var1);
                var10 = sublisp_boolean(var9);
            }
            else {
                var9 = f2432(var4, var1, var6, var7);
                var10 = sublisp_boolean(var9);
            }
        }
        else {
            var8.resetMultipleValues();
            final SubLObject var595_596 = f2433(var4, var1, var6, var7);
            final SubLObject var597_598 = var8.secondMultipleValue();
            var8.resetMultipleValues();
            var9 = var595_596;
            var10 = var597_598;
        }
        return Values.values(var9, var10);
    }
    
    public static SubLObject f2433(final SubLObject var4, final SubLObject var1, final SubLObject var6, final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0035.NIL != Functions.funcall(var6, var4, Functions.funcall(var7, var1))) {
            return Values.values(var1, (SubLObject)module0035.T);
        }
        if (!var1.isCons()) {
            return Values.values((SubLObject)module0035.NIL, (SubLObject)module0035.NIL);
        }
        SubLObject var9 = (SubLObject)module0035.NIL;
        SubLObject var10 = (SubLObject)module0035.NIL;
        var9 = var1;
        var10 = var9.first();
        while (var9.rest().isCons()) {
            var8.resetMultipleValues();
            final SubLObject var11 = f2433(var4, var10, var6, var7);
            final SubLObject var12 = var8.secondMultipleValue();
            var8.resetMultipleValues();
            if (module0035.NIL != var12) {
                return Values.values(var11, var12);
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        var8.resetMultipleValues();
        SubLObject var11 = f2433(var4, var9.first(), var6, var7);
        SubLObject var12 = var8.secondMultipleValue();
        var8.resetMultipleValues();
        if (module0035.NIL != var12) {
            return Values.values(var11, var12);
        }
        if (module0035.NIL != var9.rest()) {
            var8.resetMultipleValues();
            var11 = f2433(var4, var9.rest(), var6, var7);
            var12 = var8.secondMultipleValue();
            var8.resetMultipleValues();
            if (module0035.NIL != var12) {
                return Values.values(var11, var12);
            }
        }
        return Values.values((SubLObject)module0035.NIL, (SubLObject)module0035.NIL);
    }
    
    public static SubLObject f2432(final SubLObject var4, final SubLObject var1, final SubLObject var6, final SubLObject var7) {
        if (module0035.NIL != Functions.funcall(var6, var4, Functions.funcall(var7, var1))) {
            return var1;
        }
        if (!var1.isCons()) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var8 = (SubLObject)module0035.NIL;
        SubLObject var9 = (SubLObject)module0035.NIL;
        var8 = var1;
        var9 = var8.first();
        while (var8.rest().isCons()) {
            final SubLObject var10 = f2432(var4, var9, var6, var7);
            if (module0035.NIL != var10) {
                return var10;
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        SubLObject var10 = f2432(var4, var8.first(), var6, var7);
        if (module0035.NIL != var10) {
            return var10;
        }
        if (module0035.NIL != var8.rest()) {
            var10 = f2432(var4, var8.rest(), var6, var7);
            if (module0035.NIL != var10) {
                return var10;
            }
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2434(final SubLObject var4, final SubLObject var1) {
        return sublisp_boolean(f2429(var4, var1));
    }
    
    public static SubLObject f2429(final SubLObject var4, final SubLObject var1) {
        if (var4.eql(var1)) {
            return var4;
        }
        if (!var1.isCons()) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var5 = (SubLObject)module0035.NIL;
        SubLObject var6 = (SubLObject)module0035.NIL;
        var5 = var1;
        var6 = var5.first();
        while (var5.rest().isCons()) {
            final SubLObject var7 = f2429(var4, var6);
            if (module0035.NIL != var7) {
                return var4;
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        SubLObject var7 = f2429(var4, var5.first());
        if (module0035.NIL != var7) {
            return var4;
        }
        if (module0035.NIL != var5.rest()) {
            var7 = f2429(var4, var5.rest());
            if (module0035.NIL != var7) {
                return var4;
            }
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2435(final SubLObject var4, final SubLObject var1) {
        return sublisp_boolean(f2430(var4, var1));
    }
    
    public static SubLObject f2430(final SubLObject var4, final SubLObject var1) {
        if (var4.eql(var1)) {
            return var4;
        }
        if (!var1.isCons()) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var5 = (SubLObject)module0035.NIL;
        SubLObject var6 = (SubLObject)module0035.NIL;
        var5 = var1;
        var6 = var5.first();
        while (var5.rest().isCons()) {
            final SubLObject var7 = f2430(var4, var6);
            if (module0035.NIL != var7) {
                return var4;
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        SubLObject var7 = f2430(var4, var5.first());
        if (module0035.NIL != var7) {
            return var4;
        }
        if (module0035.NIL != var5.rest()) {
            var7 = f2430(var4, var5.rest());
            if (module0035.NIL != var7) {
                return var4;
            }
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2436(final SubLObject var4, final SubLObject var1) {
        return sublisp_boolean(f2431(var4, var1));
    }
    
    public static SubLObject f2431(final SubLObject var4, final SubLObject var1) {
        if (var4.equal(var1)) {
            return var4;
        }
        if (!var1.isCons()) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var5 = (SubLObject)module0035.NIL;
        SubLObject var6 = (SubLObject)module0035.NIL;
        var5 = var1;
        var6 = var5.first();
        while (var5.rest().isCons()) {
            final SubLObject var7 = f2431(var4, var6);
            if (module0035.NIL != var7) {
                return var4;
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        SubLObject var7 = f2431(var4, var5.first());
        if (module0035.NIL != var7) {
            return var4;
        }
        if (module0035.NIL != var5.rest()) {
            var7 = f2431(var4, var5.rest());
            if (module0035.NIL != var7) {
                return var4;
            }
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2437(final SubLObject var159, final SubLObject var93, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var160 = var159;
        SubLObject var161 = (SubLObject)module0035.NIL;
        var161 = var160.first();
        while (module0035.NIL != var160) {
            if (module0035.NIL != f2428(var161, var93, var6, var7)) {
                return var161;
            }
            var160 = var160.rest();
            var161 = var160.first();
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2438(final SubLObject var6, final SubLObject var1, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2439(var6, var1, var7);
    }
    
    public static SubLObject f2439(final SubLObject var6, final SubLObject var1, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var1))) {
            return var1;
        }
        if (!var1.isCons()) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var8 = (SubLObject)module0035.NIL;
        SubLObject var9 = (SubLObject)module0035.NIL;
        SubLObject var10 = (SubLObject)module0035.NIL;
        var9 = var1;
        var10 = var9.first();
        while (var9.rest().isCons()) {
            var8 = f2439(var6, var10, var7);
            if (module0035.NIL != var8) {
                return var8;
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        var8 = f2439(var6, var9.first(), var7);
        if (module0035.NIL != var8) {
            return var8;
        }
        if (module0035.NIL != var9.rest()) {
            var8 = f2439(var6, var9.rest(), var7);
        }
        return var8;
    }
    
    public static SubLObject f2440(final SubLObject var4, final SubLObject var1, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2441(var4, var1, var6, var7);
    }
    
    public static SubLObject f2441(final SubLObject var4, final SubLObject var1, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2442(var4, var1, var6, var7, (SubLObject)module0035.NIL, (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2443(final SubLObject var4, final SubLObject var1, final SubLObject var139, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return Numbers.numG(f2442(var4, var1, var6, var7, var139, (SubLObject)module0035.UNPROVIDED), var139);
    }
    
    public static SubLObject f2444(final SubLObject var4, final SubLObject var1, final SubLObject var139, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return Numbers.numGE(f2442(var4, var1, var6, var7, var139, (SubLObject)module0035.UNPROVIDED), var139);
    }
    
    public static SubLObject f2445(final SubLObject var4, final SubLObject var1, final SubLObject var139, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return Numbers.numL(f2442(var4, var1, var6, var7, var139, (SubLObject)module0035.UNPROVIDED), var139);
    }
    
    public static SubLObject f2446(final SubLObject var4, final SubLObject var1, final SubLObject var139, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return Numbers.numLE(f2442(var4, var1, var6, var7, var139, (SubLObject)module0035.UNPROVIDED), var139);
    }
    
    public static SubLObject f2447(final SubLObject var4, final SubLObject var1, final SubLObject var139, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return Numbers.numE(f2442(var4, var1, var6, var7, var139, (SubLObject)module0035.UNPROVIDED), var139);
    }
    
    public static SubLObject f2442(final SubLObject var4, SubLObject var1, final SubLObject var6, final SubLObject var7, final SubLObject var147, SubLObject var600) {
        if (var600 == module0035.UNPROVIDED) {
            var600 = (SubLObject)module0035.ZERO_INTEGER;
        }
        if (module0035.NIL != Functions.funcall(var6, var4, Functions.funcall(var7, var1))) {
            return module0048.f_1X(var600);
        }
        if (var1.isCons()) {
            SubLObject var602;
            for (SubLObject var601 = (SubLObject)module0035.NIL; var1.isCons() && (!var147.isNumber() || var600.numLE(var147)); var1 = var602.rest(), var600 = f2442(var4, var601, var6, var7, var147, var600)) {
                var602 = var1;
                var601 = var602.first();
            }
            if (module0035.NIL != var1 && (!var147.isNumber() || var600.numLE(var147))) {
                var600 = f2442(var4, var1, var6, var7, var147, var600);
            }
            return var600;
        }
        return var600;
    }
    
    public static SubLObject f2448(final SubLObject var4, final SubLObject var1) {
        return f2449(var4, var1, (SubLObject)module0035.ZERO_INTEGER);
    }
    
    public static SubLObject f2449(final SubLObject var4, final SubLObject var1, SubLObject var600) {
        if (var4.eql(var1)) {
            var600 = Numbers.add(var600, (SubLObject)module0035.ONE_INTEGER);
        }
        else if (var1.isCons()) {
            SubLObject var601 = (SubLObject)module0035.NIL;
            SubLObject var602 = (SubLObject)module0035.NIL;
            var601 = var1;
            var602 = var601.first();
            while (var601.rest().isCons()) {
                var600 = f2449(var4, var602, var600);
                var601 = var601.rest();
                var602 = var601.first();
            }
            var600 = f2449(var4, var601.first(), var600);
            if (module0035.NIL != var601.rest()) {
                var600 = f2449(var4, var601.rest(), var600);
            }
        }
        return var600;
    }
    
    public static SubLObject f2450(final SubLObject var6, final SubLObject var1, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2451(var6, var1, var7);
    }
    
    public static SubLObject f2451(final SubLObject var6, final SubLObject var1, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (module0035.NIL != Functions.funcall(var6, Functions.funcall(var7, var1))) {
            return (SubLObject)module0035.ONE_INTEGER;
        }
        if (var1.isCons()) {
            SubLObject var8 = (SubLObject)module0035.ZERO_INTEGER;
            SubLObject var9 = (SubLObject)module0035.NIL;
            SubLObject var10 = (SubLObject)module0035.NIL;
            var9 = var1;
            var10 = var9.first();
            while (var9.rest().isCons()) {
                var8 = Numbers.add(var8, f2451(var6, var10, var7));
                var9 = var9.rest();
                var10 = var9.first();
            }
            var8 = Numbers.add(var8, f2451(var6, var9.first(), var7));
            if (module0035.NIL != var9.rest()) {
                var8 = Numbers.add(var8, f2451(var6, var9.rest(), var7));
            }
            return var8;
        }
        return (SubLObject)module0035.ZERO_INTEGER;
    }
    
    public static SubLObject f2452(final SubLObject var93, final SubLObject var178, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        final SubLObject var179 = f2399(var93, var178, (SubLObject)module0035.NIL, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
        final SubLObject var180 = module0078.f5367(var179, var6, (SubLObject)module0035.UNPROVIDED);
        return module0077.f5311(var180);
    }
    
    public static SubLObject f2257(final SubLObject var1, final SubLObject var178, SubLObject var6, SubLObject var7, SubLObject var603) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var603 == module0035.UNPROVIDED) {
            var603 = (SubLObject)module0035.T;
        }
        return f2399(var1, var178, var6, var7, var603);
    }
    
    public static SubLObject f2399(final SubLObject var1, final SubLObject var178, SubLObject var6, SubLObject var7, SubLObject var603) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var603 == module0035.UNPROVIDED) {
            var603 = (SubLObject)module0035.T;
        }
        return Sequences.nreverse(f2453(var1, var178, var6, var7, var603, (SubLObject)module0035.NIL));
    }
    
    public static SubLObject f2453(final SubLObject var1, final SubLObject var178, final SubLObject var6, final SubLObject var7, final SubLObject var603, final SubLObject var604) {
        SubLObject var605 = var604;
        if (module0035.NIL != Functions.funcall(var178, Functions.funcall(var7, var1))) {
            if (module0035.NIL != var6) {
                if (module0035.NIL == conses_high.member(var1, var605, var6, Symbols.symbol_function((SubLObject)module0035.IDENTITY))) {
                    var605 = (SubLObject)ConsesLow.cons(var1, var605);
                }
            }
            else {
                var605 = (SubLObject)ConsesLow.cons(var1, var605);
            }
            if (module0035.NIL == var603) {
                return var605;
            }
        }
        if (var1.isCons()) {
            SubLObject var606 = (SubLObject)module0035.NIL;
            SubLObject var607 = (SubLObject)module0035.NIL;
            var606 = var1;
            var607 = var606.first();
            while (var606.rest().isCons()) {
                var605 = f2453(var607, var178, var6, var7, var603, var605);
                var606 = var606.rest();
                var607 = var606.first();
            }
            var605 = f2453(var606.first(), var178, var6, var7, var603, var605);
            if (module0035.NIL != var606.rest()) {
                var605 = f2453(var606.rest(), var178, var6, var7, var603, var605);
            }
        }
        return var605;
    }
    
    public static SubLObject f2454(final SubLObject var1, final SubLObject var178, SubLObject var7, SubLObject var603) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var603 == module0035.UNPROVIDED) {
            var603 = (SubLObject)module0035.T;
        }
        return (module0035.NIL != var603) ? f2455(var1, var178, var7) : f2456(var1, var178, var7);
    }
    
    public static SubLObject f2455(final SubLObject var1, final SubLObject var178, final SubLObject var7) {
        return (SubLObject)((module0035.NIL != Functions.funcall(var178, Functions.funcall(var7, var1))) ? (var1.isCons() ? ConsesLow.cons(var1, ConsesLow.nconc(f2455(var1.first(), var178, var7), f2455(var1.rest(), var178, var7))) : ConsesLow.cons(var1, (SubLObject)module0035.NIL)) : (var1.isCons() ? ConsesLow.nconc(f2455(var1.first(), var178, var7), f2455(var1.rest(), var178, var7)) : module0035.NIL));
    }
    
    public static SubLObject f2456(final SubLObject var1, final SubLObject var178, final SubLObject var7) {
        return (SubLObject)((module0035.NIL != Functions.funcall(var178, Functions.funcall(var7, var1))) ? ConsesLow.cons(var1, (SubLObject)module0035.NIL) : (var1.isCons() ? ConsesLow.nconc(f2456(var1.first(), var178, var7), f2456(var1.rest(), var178, var7)) : module0035.NIL));
    }
    
    public static SubLObject f2457(final SubLObject var93, final SubLObject var605, final SubLObject var606) {
        SubLObject var607 = (SubLObject)module0035.NIL;
        SubLObject var608 = var93;
        SubLObject var609 = (SubLObject)module0035.NIL;
        var609 = var608.first();
        while (module0035.NIL != var608) {
            if (var609.equal(var605)) {
                var607 = (SubLObject)ConsesLow.cons(var606, var607);
            }
            else if (var609.isList()) {
                var607 = (SubLObject)ConsesLow.cons(f2457(var609, var605, var606), var607);
            }
            else {
                var607 = (SubLObject)ConsesLow.cons(var609, var607);
            }
            var608 = var608.rest();
            var609 = var608.first();
        }
        return Sequences.nreverse(var607);
    }
    
    public static SubLObject f2458(final SubLObject var93, final SubLObject var608) {
        final SubLThread var609 = SubLProcess.currentSubLThread();
        SubLObject var610 = (SubLObject)module0035.NIL;
        SubLObject var611 = var93;
        SubLObject var612 = (SubLObject)module0035.NIL;
        var612 = var611.first();
        while (module0035.NIL != var611) {
            var609.resetMultipleValues();
            final SubLObject var613 = module0067.f4884(var608, var612, (SubLObject)module0035.UNPROVIDED);
            final SubLObject var614 = var609.secondMultipleValue();
            var609.resetMultipleValues();
            if (module0035.NIL != var614) {
                var610 = (SubLObject)ConsesLow.cons(var613, var610);
            }
            else if (var612.isList()) {
                var610 = (SubLObject)ConsesLow.cons(f2458(var612, var608), var610);
            }
            else {
                var610 = (SubLObject)ConsesLow.cons(var612, var610);
            }
            var611 = var611.rest();
            var612 = var611.first();
        }
        return Sequences.nreverse(var610);
    }
    
    public static SubLObject f2459(final SubLObject var93, final SubLObject var605, SubLObject var610) {
        SubLObject var611 = (SubLObject)module0035.NIL;
        if (!var610.isList()) {
            var610 = (SubLObject)ConsesLow.list(var610);
        }
        SubLObject var612 = var93;
        SubLObject var613 = (SubLObject)module0035.NIL;
        var613 = var612.first();
        while (module0035.NIL != var612) {
            if (var613.equal(var605)) {
                SubLObject var38_611 = var610;
                SubLObject var614 = (SubLObject)module0035.NIL;
                var614 = var38_611.first();
                while (module0035.NIL != var38_611) {
                    var611 = (SubLObject)ConsesLow.cons(var614, var611);
                    var38_611 = var38_611.rest();
                    var614 = var38_611.first();
                }
            }
            else if (var613.isList()) {
                var611 = (SubLObject)ConsesLow.cons(f2459(var613, var605, var610), var611);
            }
            else {
                var611 = (SubLObject)ConsesLow.cons(var613, var611);
            }
            var612 = var612.rest();
            var613 = var612.first();
        }
        return Sequences.nreverse(var611);
    }
    
    public static SubLObject f2460(final SubLObject var215, final SubLObject var1, final SubLObject var178, SubLObject var7, SubLObject var612) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (var612 == module0035.UNPROVIDED) {
            var612 = (SubLObject)module0035.NIL;
        }
        final SubLThread var613 = SubLProcess.currentSubLThread();
        if (module0035.NIL != Functions.funcall(var178, var1)) {
            final SubLObject var614 = Functions.funcall(var215, Functions.funcall(var7, var1));
            var612 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var1, var614), var612);
            return Values.values(var614, var612);
        }
        if (var1.isCons()) {
            SubLObject var614 = (SubLObject)module0035.NIL;
            SubLObject var615 = var1;
            SubLObject var616 = (SubLObject)module0035.NIL;
            var616 = var615.first();
            while (module0035.NIL != var615) {
                var613.resetMultipleValues();
                final SubLObject var617 = f2460(var215, var616, var178, var7, (SubLObject)module0035.UNPROVIDED);
                final SubLObject var618 = var613.secondMultipleValue();
                var613.resetMultipleValues();
                var614 = (SubLObject)ConsesLow.cons(var617, var614);
                var612 = ConsesLow.append(var612, var618);
                var615 = var615.rest();
                var616 = var615.first();
            }
            return Values.values(Sequences.nreverse(var614), var612);
        }
        return Values.values(var1, var612);
    }
    
    public static SubLObject f2461(final SubLObject var8, final SubLObject var617) {
        assert module0035.NIL != Types.listp(var8) : var8;
        SubLObject var618 = (SubLObject)module0035.NIL;
        SubLObject var619 = var8;
        SubLObject var620 = (SubLObject)module0035.NIL;
        var620 = var619.first();
        while (module0035.NIL != var619) {
            SubLObject var621 = (SubLObject)module0035.NIL;
            if (module0035.NIL == var621) {
                SubLObject var622;
                SubLObject var623;
                for (var622 = var617, var623 = (SubLObject)module0035.NIL, var623 = var622.first(); module0035.NIL == var621 && module0035.NIL != var622; var621 = (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL == f2427(var623, var620, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)), var622 = var622.rest(), var623 = var622.first()) {}
            }
            if (module0035.NIL == var621) {
                var618 = (SubLObject)ConsesLow.cons(var620, var618);
            }
            var619 = var619.rest();
            var620 = var619.first();
        }
        return Sequences.nreverse(var618);
    }
    
    public static SubLObject f2462(final SubLObject var8, final SubLObject var6, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (module0035.NIL == var8) {
            return (SubLObject)module0035.NIL;
        }
        return f2463(var8, var6, var7);
    }
    
    public static SubLObject f2463(final SubLObject var8, final SubLObject var6, final SubLObject var7) {
        for (SubLObject var9 = var8; module0035.NIL != var9 && module0035.NIL == f1997(var9); var9 = var9.rest()) {
            final SubLObject var10 = ConsesLow.nth((SubLObject)module0035.ONE_INTEGER, var9);
            SubLObject var11;
            SubLObject var12;
            for (var11 = var8, var12 = (SubLObject)module0035.NIL; module0035.NIL == var12 && module0035.NIL != var11; var11 = var11.rest()) {
                if (!var11.eql(var9.rest())) {
                    if (module0035.NIL != f2464(var10, ConsesLow.nth((SubLObject)module0035.ZERO_INTEGER, var11), var6, var7)) {
                        var12 = (SubLObject)module0035.T;
                        f2045((SubLObject)module0035.ONE_INTEGER, var9);
                    }
                    else if (!var11.eql(var9) && module0035.NIL != var11.rest() && module0035.NIL != f2465(var10, ConsesLow.nth((SubLObject)module0035.ONE_INTEGER, var11), var6, var7)) {
                        f2045((SubLObject)module0035.ONE_INTEGER, var11);
                    }
                }
            }
            if (module0035.NIL == var12) {}
        }
        final SubLObject var13 = var8.first();
        SubLObject var14 = (SubLObject)module0035.NIL;
        if (module0035.NIL == var14) {
            SubLObject var15;
            SubLObject var16;
            for (var15 = var8.rest(), var16 = (SubLObject)module0035.NIL, var16 = var15.first(); module0035.NIL == var14 && module0035.NIL != var15; var14 = f2464(var13, var16, var6, var7), var15 = var15.rest(), var16 = var15.first()) {}
        }
        return (module0035.NIL != var14) ? var8.rest() : var8;
    }
    
    public static SubLObject f2464(final SubLObject var221, final SubLObject var223, final SubLObject var6, final SubLObject var7) {
        return f2466(var223, var221, var6, var7);
    }
    
    public static SubLObject f2465(final SubLObject var221, final SubLObject var223, final SubLObject var6, final SubLObject var7) {
        return f2466(var221, var223, var6, var7);
    }
    
    public static SubLObject f2466(final SubLObject var221, final SubLObject var223, final SubLObject var6, final SubLObject var7) {
        return sublisp_boolean(Functions.funcall(var6, Functions.funcall(var7, var221), Functions.funcall(var7, var223)));
    }
    
    public static SubLObject f2467(final SubLObject var8, final SubLObject var6, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        return f2462(conses_high.copy_list(var8), var6, var7);
    }
    
    public static SubLObject f2468(final SubLObject var360) {
        if (Sequences.length(var360).eql((SubLObject)module0035.ONE_INTEGER)) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0035.$ic58$), var360.first());
        }
        final SubLObject var361 = Sequences.reverse(var360);
        SubLObject var362 = f2469(conses_high.second(var361), var361.first(), (SubLObject)module0035.$ic58$);
        SubLObject var363 = conses_high.cddr(var361);
        SubLObject var364 = (SubLObject)module0035.NIL;
        var364 = var363.first();
        while (module0035.NIL != var363) {
            var362 = f2469(var364, var362, (SubLObject)module0035.$ic13$);
            var363 = var363.rest();
            var364 = var363.first();
        }
        return var362;
    }
    
    public static SubLObject f2469(final SubLObject var308, final SubLObject var309, final SubLObject var400) {
        SubLObject var401 = (SubLObject)module0035.NIL;
        SubLObject var402 = var308;
        SubLObject var403 = (SubLObject)module0035.NIL;
        var403 = var402.first();
        while (module0035.NIL != var402) {
            SubLObject var38_624 = f2470(var403, var309, var400);
            SubLObject var404 = (SubLObject)module0035.NIL;
            var404 = var38_624.first();
            while (module0035.NIL != var38_624) {
                var401 = (SubLObject)ConsesLow.cons(var404, var401);
                var38_624 = var38_624.rest();
                var404 = var38_624.first();
            }
            var402 = var402.rest();
            var403 = var402.first();
        }
        return Sequences.nreverse(var401);
    }
    
    public static SubLObject f2470(final SubLObject var625, final SubLObject var342, final SubLObject var400) {
        SubLObject var626 = (SubLObject)module0035.NIL;
        SubLObject var627 = var342;
        SubLObject var628 = (SubLObject)module0035.NIL;
        var628 = var627.first();
        while (module0035.NIL != var627) {
            var626 = (SubLObject)ConsesLow.cons(Functions.funcall(var400, var625, var628), var626);
            var627 = var627.rest();
            var628 = var627.first();
        }
        return Sequences.nreverse(var626);
    }
    
    public static SubLObject f2471(final SubLObject var313) {
        if (module0035.NIL != var313) {
            return Functions.apply((SubLObject)module0035.$ic182$, (SubLObject)ConsesLow.cons((SubLObject)module0035.$ic58$, var313));
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2472(final SubLObject var360, SubLObject var627) {
        if (var627 == module0035.UNPROVIDED) {
            var627 = (SubLObject)module0035.NIL;
        }
        final SubLObject var628 = f2473(var627, var360);
        final SubLObject var629 = f2468(var628);
        final SubLObject var630 = f2474(var627, var629, (SubLObject)module0035.UNPROVIDED);
        return var630;
    }
    
    public static SubLObject f2474(final SubLObject var627, final SubLObject var342, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        SubLObject var628 = (SubLObject)module0035.NIL;
        SubLObject var629 = var342;
        SubLObject var630 = (SubLObject)module0035.NIL;
        var630 = var629.first();
        while (module0035.NIL != var629) {
            if (module0035.NIL != module0004.f104(var627, var630, var6, (SubLObject)module0035.UNPROVIDED)) {
                var628 = (SubLObject)ConsesLow.cons(f2090(var627, var630, var6), var628);
            }
            else {
                var628 = (SubLObject)ConsesLow.cons(var630, var628);
            }
            var629 = var629.rest();
            var630 = var629.first();
        }
        return Sequences.nreverse(var628);
    }
    
    public static SubLObject f2473(final SubLObject var627, final SubLObject var342) {
        SubLObject var628 = (SubLObject)module0035.NIL;
        SubLObject var629 = var342;
        SubLObject var630 = (SubLObject)module0035.NIL;
        var630 = var629.first();
        while (module0035.NIL != var629) {
            if (var630.isCons()) {
                var628 = (SubLObject)ConsesLow.cons(f2085(var627, var630, (SubLObject)module0035.UNPROVIDED), var628);
            }
            else {
                var628 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var630), var628);
            }
            var629 = var629.rest();
            var630 = var629.first();
        }
        return Sequences.nreverse(var628);
    }
    
    public static SubLObject f2475(final SubLObject var356, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQUAL);
        }
        if (module0035.NIL == var356) {
            return (SubLObject)module0035.NIL;
        }
        final SubLObject var357 = Sequences.length(var356);
        SubLObject var358 = (SubLObject)module0035.NIL;
        if (module0035.NIL == var6) {
            SubLObject var359 = f2476(Sequences.length(var356));
            SubLObject var360 = (SubLObject)module0035.NIL;
            var360 = var359.first();
            while (module0035.NIL != var359) {
                var358 = (SubLObject)ConsesLow.cons(f2477(var356, var360), var358);
                var359 = var359.rest();
                var360 = var359.first();
            }
        }
        else if (var357.numL((SubLObject)module0035.FIVE_INTEGER)) {
            SubLObject var359 = f2476(Sequences.length(var356));
            SubLObject var360 = (SubLObject)module0035.NIL;
            var360 = var359.first();
            while (module0035.NIL != var359) {
                final SubLObject var361 = f2477(var356, var360);
                if (module0035.NIL == conses_high.member(var361, var358, var6, Symbols.symbol_function((SubLObject)module0035.IDENTITY))) {
                    var358 = (SubLObject)ConsesLow.cons(var361, var358);
                }
                var359 = var359.rest();
                var360 = var359.first();
            }
        }
        else {
            SubLObject var359 = f2476(Sequences.length(var356));
            SubLObject var360 = (SubLObject)module0035.NIL;
            var360 = var359.first();
            while (module0035.NIL != var359) {
                var358 = (SubLObject)ConsesLow.cons(f2477(var356, var360), var358);
                var359 = var359.rest();
                var360 = var359.first();
            }
            var358 = f2269(var358, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
        }
        return var358;
    }
    
    public static SubLObject f2478(final SubLObject var356, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQ);
        }
        if (module0035.NIL == var356) {
            return (SubLObject)module0035.NIL;
        }
        if (var356.isAtom()) {
            return (SubLObject)ConsesLow.list(var356);
        }
        if (module0035.NIL == var356.rest()) {
            return (SubLObject)ConsesLow.list(var356);
        }
        if (module0035.NIL == var356.rest().rest()) {
            return (SubLObject)ConsesLow.list(var356, Sequences.reverse(var356));
        }
        SubLObject var357 = (SubLObject)module0035.NIL;
        SubLObject var358 = var356;
        SubLObject var359 = (SubLObject)module0035.NIL;
        var359 = var358.first();
        while (module0035.NIL != var358) {
            SubLObject var38_633 = f2478(Sequences.remove(var359, var356, var6, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED), (SubLObject)module0035.UNPROVIDED);
            SubLObject var360 = (SubLObject)module0035.NIL;
            var360 = var38_633.first();
            while (module0035.NIL != var38_633) {
                var357 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var359, var360), var357);
                var38_633 = var38_633.rest();
                var360 = var38_633.first();
            }
            var358 = var358.rest();
            var359 = var358.first();
        }
        return var357;
    }
    
    public static SubLObject f2476(final SubLObject var15) {
        if (var15.numE((SubLObject)module0035.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0035.NIL);
        }
        return f2478(f2160(var15, (SubLObject)module0035.UNPROVIDED), (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2479(final SubLObject var8, final SubLObject var631, final SubLObject var93) {
        SubLObject var632 = (SubLObject)module0035.NIL;
        SubLObject var633;
        SubLObject var634;
        SubLObject var635;
        SubLObject var636;
        SubLObject var637;
        for (var633 = Sequences.length(var631), var634 = (SubLObject)module0035.NIL, var634 = (SubLObject)module0035.ZERO_INTEGER; var634.numL(var633); var634 = Numbers.add(var634, (SubLObject)module0035.ONE_INTEGER)) {
            var635 = ConsesLow.nth(var634, var631);
            if (!var634.numE(var635)) {
                var636 = ConsesLow.nth(var634, var8);
                var637 = ConsesLow.nth(var635, var8);
                var632 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var636, var637), var632);
            }
        }
        return conses_high.nsublis(var632, var93, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2480(final SubLObject var8, final SubLObject var631, final SubLObject var93) {
        return f2479(var8, var631, conses_high.copy_tree(var93));
    }
    
    public static SubLObject f2477(final SubLObject var8, final SubLObject var631) {
        if (module0035.NIL != var631) {
            SubLObject var632 = (SubLObject)module0035.NIL;
            SubLObject var633 = var631;
            SubLObject var634 = (SubLObject)module0035.NIL;
            var634 = var633.first();
            while (module0035.NIL != var633) {
                var632 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var634, var8), var632);
                var633 = var633.rest();
                var634 = var633.first();
            }
            return Sequences.nreverse(var632);
        }
        return var8;
    }
    
    public static SubLObject f2481(final SubLObject var8) {
        SubLObject var9 = (SubLObject)module0035.NIL;
        SubLObject var10 = var8;
        SubLObject var11 = (SubLObject)module0035.NIL;
        if (module0035.NIL == var8) {
            return (SubLObject)module0035.NIL;
        }
        while (module0035.NIL == f1997(var10)) {
            var9 = random.random(Sequences.length(var10));
            var11 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var9, var10), var11);
            var10 = f2131(var9, var10);
        }
        return (SubLObject)ConsesLow.cons(var10.first(), var11);
    }
    
    public static SubLObject f2482(final SubLObject var15, final SubLObject var147) {
        SubLObject var148 = (SubLObject)module0035.NIL;
        if (var15.numE((SubLObject)module0035.ONE_INTEGER)) {
            SubLObject var149;
            for (var149 = (SubLObject)module0035.NIL, var149 = (SubLObject)module0035.ZERO_INTEGER; var149.numL(var147); var149 = Numbers.add(var149, (SubLObject)module0035.ONE_INTEGER)) {
                var148 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var149), var148);
            }
        }
        else {
            SubLObject var151;
            final SubLObject var150 = var151 = f2482(module0048.f_1_(var15), var147);
            SubLObject var152 = (SubLObject)module0035.NIL;
            var152 = var151.first();
            while (module0035.NIL != var151) {
                SubLObject var153;
                for (var153 = (SubLObject)module0035.NIL, var153 = (SubLObject)module0035.ZERO_INTEGER; var153.numL(var147); var153 = Numbers.add(var153, (SubLObject)module0035.ONE_INTEGER)) {
                    if (module0035.NIL == module0004.f104(var153, var152, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
                        var148 = (SubLObject)ConsesLow.cons(ConsesLow.append(var152, (SubLObject)ConsesLow.list(var153)), var148);
                    }
                }
                var151 = var151.rest();
                var152 = var151.first();
            }
        }
        return Sequences.nreverse(var148);
    }
    
    public static SubLObject f2483(final SubLObject var639, final SubLObject var640, SubLObject var641, SubLObject var642) {
        if (var641 == module0035.UNPROVIDED) {
            var641 = (SubLObject)module0035.NIL;
        }
        if (var642 == module0035.UNPROVIDED) {
            var642 = (SubLObject)module0035.NIL;
        }
        final SubLThread var643 = SubLProcess.currentSubLThread();
        assert module0035.NIL != Types.listp(var639) : var639;
        if (module0035.NIL != var639) {
            SubLObject var644 = (SubLObject)ConsesLow.cons(var641, var639);
            try {
                ConsesLow.rplacd(conses_high.last(var644, (SubLObject)module0035.UNPROVIDED), (SubLObject)ConsesLow.cons(var642, (SubLObject)module0035.NIL));
                while (module0035.NIL != conses_high.cddr(var644)) {
                    SubLObject var646;
                    final SubLObject var645 = var646 = var644;
                    SubLObject var647 = (SubLObject)module0035.NIL;
                    SubLObject var648 = (SubLObject)module0035.NIL;
                    SubLObject var649 = (SubLObject)module0035.NIL;
                    SubLObject var650 = (SubLObject)module0035.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var646, var645, (SubLObject)module0035.$ic183$);
                    var647 = var646.first();
                    var646 = var646.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var646, var645, (SubLObject)module0035.$ic183$);
                    var648 = var646.first();
                    var646 = var646.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var646, var645, (SubLObject)module0035.$ic183$);
                    var649 = var646.first();
                    var646 = (var650 = var646.rest());
                    SubLObject var651 = var640;
                    SubLObject var652 = (SubLObject)module0035.NIL;
                    var652 = var651.first();
                    while (module0035.NIL != var651) {
                        if (var652.isFunctionSpec()) {
                            var643.resetMultipleValues();
                            final SubLObject var653 = Functions.funcall(var652, var647, var648, var649);
                            final SubLObject var654 = var643.secondMultipleValue();
                            final SubLObject var655 = var643.thirdMultipleValue();
                            final SubLObject var656 = var643.fourthMultipleValue();
                            var643.resetMultipleValues();
                            if (module0035.NIL != var653) {
                                if (!var647.eql(var654)) {
                                    ConsesLow.set_nth((SubLObject)module0035.ZERO_INTEGER, var644, var654);
                                }
                                if (!var648.eql(var655)) {
                                    ConsesLow.set_nth((SubLObject)module0035.ONE_INTEGER, var644, var655);
                                }
                                if (!var649.eql(var656)) {
                                    ConsesLow.set_nth((SubLObject)module0035.TWO_INTEGER, var644, var656);
                                }
                            }
                        }
                        var651 = var651.rest();
                        var652 = var651.first();
                    }
                    var644 = var644.rest();
                }
            }
            finally {
                final SubLObject var657 = Threads.$is_thread_performing_cleanupP$.currentBinding(var643);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0035.T, var643);
                    ConsesLow.rplacd(conses_high.last(var644, (SubLObject)module0035.TWO_INTEGER), (SubLObject)module0035.NIL);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var657, var643);
                }
            }
        }
        return var639;
    }
    
    public static SubLObject f2484(final SubLObject var654, final SubLObject var15) {
        assert module0035.NIL != Types.integerp(var15) : var15;
        if (var15.numLE((SubLObject)module0035.ZERO_INTEGER)) {
            return (SubLObject)module0035.NIL;
        }
        if (module0035.NIL == var654) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var655 = (SubLObject)module0035.NIL;
        SubLObject var656 = (SubLObject)module0035.NIL;
        SubLObject var657 = (SubLObject)module0035.NIL;
        SubLObject var658 = (SubLObject)module0035.NIL;
        var655 = var654;
        var656 = var655.first();
        var657 = (SubLObject)ConsesLow.list((SubLObject)module0035.NIL);
        for (var658 = (SubLObject)module0035.ZERO_INTEGER; module0035.NIL != var655; var655 = var655.rest(), var656 = var655.first(), var657 = var657, var658 = Numbers.add(var658, (SubLObject)module0035.ONE_INTEGER)) {
            if (var658.numL(var15)) {
                ConsesLow.rplaca(var657, (SubLObject)ConsesLow.cons(var656, var657.first()));
            }
            else {
                ConsesLow.rplaca(var657, Sequences.nreverse(var657.first()));
                var657 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var656), var657);
                var658 = (SubLObject)module0035.ZERO_INTEGER;
            }
        }
        ConsesLow.rplaca(var657, Sequences.nreverse(var657.first()));
        return Sequences.nreverse(var657);
    }
    
    public static SubLObject f2485(final SubLObject var414) {
        return module0004.f86(var414);
    }
    
    public static SubLObject f2486(final SubLObject var414) {
        SubLObject var415 = (SubLObject)module0035.NIL;
        if (var414.isSymbol() && module0035.NIL == var415) {
            var415 = conses_high.second(Symbols.get(var414, (SubLObject)module0035.$ic186$, (SubLObject)module0035.NIL));
        }
        return var415;
    }
    
    public static SubLObject f2487(final SubLObject var8, final SubLObject var1) {
        final SubLObject var9 = var8.first();
        final SubLObject var10 = var8.rest();
        if (module0035.NIL == var9) {
            return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var1), var10);
        }
        return (SubLObject)ConsesLow.cons(ConsesLow.append((SubLObject)ConsesLow.list(var1), var9), var10);
    }
    
    public static SubLObject f2488(final SubLObject var8) {
        final SubLObject var9 = Sequences.nreverse(var8.first());
        final SubLObject var10 = var8.rest();
        if (module0035.NIL == var9) {
            return f2487(var10, (SubLObject)module0035.NIL);
        }
        return f2487(var10, var9);
    }
    
    public static SubLObject f2489(final SubLObject var12, SubLObject var660, SubLObject var137, SubLObject var6) {
        if (var660 == module0035.UNPROVIDED) {
            var660 = Symbols.symbol_function((SubLObject)module0035.$ic13$);
        }
        if (var137 == module0035.UNPROVIDED) {
            var137 = (SubLObject)module0035.NIL;
        }
        if (var6 == module0035.UNPROVIDED) {
            var6 = (SubLObject)module0035.NIL;
        }
        SubLObject var661 = (SubLObject)ConsesLow.list(var137);
        if (module0035.NIL != Symbols.fboundp(var6)) {
            SubLObject var662 = var12;
            SubLObject var663 = (SubLObject)module0035.NIL;
            var663 = var662.first();
            while (module0035.NIL != var662) {
                var661 = f2490(var663, var661, var660, var6);
                var662 = var662.rest();
                var663 = var662.first();
            }
        }
        else {
            SubLObject var662 = var12;
            SubLObject var663 = (SubLObject)module0035.NIL;
            var663 = var662.first();
            while (module0035.NIL != var662) {
                var661 = f2491(var663, var661, var660);
                var662 = var662.rest();
                var663 = var662.first();
            }
        }
        return f2076(Symbols.symbol_function((SubLObject)module0035.$ic37$), var661);
    }
    
    public static SubLObject f2491(final SubLObject var662, final SubLObject var396, final SubLObject var660) {
        SubLObject var663 = (SubLObject)module0035.NIL;
        SubLObject var664 = var396;
        SubLObject var665 = (SubLObject)module0035.NIL;
        var665 = var664.first();
        while (module0035.NIL != var664) {
            SubLObject var38_664 = var662;
            SubLObject var666 = (SubLObject)module0035.NIL;
            var666 = var38_664.first();
            while (module0035.NIL != var38_664) {
                var663 = (SubLObject)ConsesLow.cons(Functions.funcall(var660, var666, var665), var663);
                var38_664 = var38_664.rest();
                var666 = var38_664.first();
            }
            var664 = var664.rest();
            var665 = var664.first();
        }
        return Sequences.nreverse(var663);
    }
    
    public static SubLObject f2490(final SubLObject var662, final SubLObject var396, final SubLObject var660, final SubLObject var6) {
        SubLObject var663 = (SubLObject)module0035.NIL;
        SubLObject var664 = var396;
        SubLObject var665 = (SubLObject)module0035.NIL;
        var665 = var664.first();
        while (module0035.NIL != var664) {
            SubLObject var38_666 = var662;
            SubLObject var666 = (SubLObject)module0035.NIL;
            var666 = var38_666.first();
            while (module0035.NIL != var38_666) {
                if (module0035.NIL != Functions.funcall(var6, var666, var665)) {
                    var663 = (SubLObject)ConsesLow.cons(Functions.funcall(var660, var666, var665), var663);
                }
                var38_666 = var38_666.rest();
                var666 = var38_666.first();
            }
            var664 = var664.rest();
            var665 = var664.first();
        }
        return Sequences.nreverse(var663);
    }
    
    public static SubLObject f2492(final SubLObject var667) {
        SubLObject var668 = (SubLObject)module0035.NIL;
        SubLObject var669;
        SubLObject var670;
        SubLObject var671;
        for (var669 = (SubLObject)module0035.NIL, var669 = var667; module0035.NIL == f1993(var669, (SubLObject)module0035.TWO_INTEGER, (SubLObject)module0035.UNPROVIDED); var669 = var669.rest()) {
            var670 = var669.rest();
            var671 = (SubLObject)module0035.NIL;
            var671 = var670.first();
            while (module0035.NIL != var670) {
                var668 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var669.first(), var671), var668);
                var670 = var670.rest();
                var671 = var670.first();
            }
        }
        return Sequences.nreverse(var668);
    }
    
    public static SubLObject f2493(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic187$);
        final SubLObject var23 = var22.rest();
        var22 = var22.first();
        SubLObject var24 = (SubLObject)module0035.NIL;
        SubLObject var25 = (SubLObject)module0035.NIL;
        SubLObject var26 = (SubLObject)module0035.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic187$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic187$);
        var25 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic187$);
        var26 = var22.first();
        var22 = var22.rest();
        if (module0035.NIL == var22) {
            var22 = var23;
            SubLObject var27 = (SubLObject)module0035.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0035.$ic187$);
            var27 = var22.first();
            final SubLObject var28;
            var22 = (var28 = var22.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)module0035.$ic10$, (SubLObject)ConsesLow.list(reader.bq_cons(var24, (SubLObject)module0035.$ic72$)), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic36$, (SubLObject)ConsesLow.list(var25, (SubLObject)ConsesLow.list((SubLObject)module0035.$ic37$, var26)), (SubLObject)ConsesLow.list((SubLObject)module0035.$ic61$, var27, var24)), ConsesLow.append(var28, (SubLObject)module0035.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0035.$ic187$);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2494(final SubLObject var192, final SubLObject var39, SubLObject var6) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (module0035.NIL != Functions.funcall(var6, var192, var39)) {
            return (SubLObject)module0035.T;
        }
        if (var39.isList()) {
            SubLObject var193 = var39;
            SubLObject var194 = (SubLObject)module0035.NIL;
            var194 = var193.first();
            while (module0035.NIL != var193) {
                if (module0035.NIL != f2494(var192, var194, var6)) {
                    return (SubLObject)module0035.T;
                }
                var193 = var193.rest();
                var194 = var193.first();
            }
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2192(final SubLObject var351, final SubLObject var1) {
        if (module0035.NIL != f2015(var1)) {
            SubLObject var352 = var1;
            SubLObject var353 = (SubLObject)module0035.NIL;
            var353 = var352.first();
            while (module0035.NIL != var352) {
                if (module0035.NIL == Functions.funcall(var351, var353)) {
                    return (SubLObject)module0035.NIL;
                }
                var352 = var352.rest();
                var353 = var352.first();
            }
            return (SubLObject)module0035.T;
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2495(final SubLObject var351, final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != f2013(var1) && module0035.NIL != f2192(var351, var1));
    }
    
    public static SubLObject f2496(final SubLObject var1) {
        return f2192(Symbols.symbol_function((SubLObject)module0035.$ic53$), var1);
    }
    
    public static SubLObject f2497(final SubLObject var1) {
        return f2192(Symbols.symbol_function((SubLObject)module0035.$ic188$), var1);
    }
    
    public static SubLObject f2498(final SubLObject var1) {
        return module0038.f2614(var1);
    }
    
    public static SubLObject f2499(final SubLObject var1) {
        if (module0035.NIL != f2015(var1)) {
            return f2370(Symbols.symbol_function((SubLObject)module0035.$ic189$), var1, (SubLObject)module0035.UNPROVIDED);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2500(final SubLObject var1) {
        if (module0035.NIL != f2015(var1)) {
            return f2370(Symbols.symbol_function((SubLObject)module0035.$ic105$), var1, (SubLObject)module0035.UNPROVIDED);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2501(final SubLObject var39, final SubLObject var674) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var39.isCons() && var674.eql(var39.first()));
    }
    
    public static SubLObject f2502(final SubLObject var674, final SubLObject var675) {
        final SubLThread var676 = SubLProcess.currentSubLThread();
        if (module0035.NIL == Errors.$ignore_mustsP$.getDynamicValue(var676) && !var674.eql(var675)) {
            Errors.error((SubLObject)module0035.$ic190$, var675, var674);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2503(final SubLObject var39, final SubLObject var675) {
        final SubLThread var676 = SubLProcess.currentSubLThread();
        if (module0035.NIL == Errors.$ignore_mustsP$.getDynamicValue(var676) && module0035.NIL == f2501(var39, var675)) {
            Errors.error((SubLObject)module0035.$ic191$, var39, var675);
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2504(final SubLObject var676, final SubLObject var677) {
        if (var677.isAtom()) {
            return (SubLObject)module0035.NIL;
        }
        final SubLObject var678 = var677.first();
        final SubLObject var679 = var677.rest();
        if (var676.equal(var678)) {
            return (SubLObject)module0035.T;
        }
        SubLObject var680 = var679;
        SubLObject var681 = (SubLObject)module0035.NIL;
        var681 = var680.first();
        while (module0035.NIL != var680) {
            if (module0035.NIL != f2504(var676, var681)) {
                return (SubLObject)module0035.T;
            }
            var680 = var680.rest();
            var681 = var680.first();
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2505(final SubLObject var414, final SubLObject var28) {
        if (module0035.NIL == var28) {
            return (SubLObject)module0035.NIL;
        }
        if (var28.isCons()) {
            SubLObject var415 = (SubLObject)module0035.NIL;
            SubLObject var416 = (SubLObject)module0035.NIL;
            while (var28.isCons()) {
                var415 = var28.first();
                if (var415.isCons()) {
                    var416 = var415.first();
                    if (var416.eql(var414)) {
                        return (SubLObject)module0035.T;
                    }
                    if (module0035.NIL != f2505(var414, var415.rest())) {
                        return (SubLObject)module0035.T;
                    }
                    continue;
                }
            }
            return (SubLObject)module0035.NIL;
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2506(final SubLObject var414, final SubLObject var28) {
        if (module0035.NIL != f2014(var28)) {
            SubLObject var415 = var28;
            SubLObject var416 = (SubLObject)module0035.NIL;
            var416 = var415.first();
            while (module0035.NIL != var415) {
                if (module0035.NIL != f2507(var414, var416)) {
                    return (SubLObject)module0035.T;
                }
                var415 = var415.rest();
                var416 = var415.first();
            }
            return (SubLObject)module0035.NIL;
        }
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2507(final SubLObject var414, final SubLObject var677) {
        if (!var677.isCons()) {
            return Equality.eq(var414, var677);
        }
        final SubLObject var678 = var677.rest();
        if (var677.first() == module0035.$ic107$) {
            return (SubLObject)module0035.NIL;
        }
        return f2506(var414, var678);
    }
    
    public static SubLObject f2508(final SubLObject var1, final SubLObject var677) {
        if (var677.isAtom()) {
            return Equality.equal(var1, var677);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0035.NIL != f2508(var1, var677.first()) || module0035.NIL != f2508(var1, var677.rest()));
    }
    
    public static SubLObject f2509(final SubLObject var505, SubLObject var680, SubLObject var681) {
        if (var680 == module0035.UNPROVIDED) {
            var680 = (SubLObject)Characters.CHAR_question;
        }
        if (var681 == module0035.UNPROVIDED) {
            var681 = (SubLObject)Characters.CHAR_space;
        }
        if (module0035.NIL == var505) {
            return (SubLObject)module0035.NIL;
        }
        if (!var505.isString()) {
            return (SubLObject)module0035.NIL;
        }
        if (module0035.NIL != Strings.string_equal(var505, (SubLObject)module0035.$ic64$, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED)) {
            return (SubLObject)module0035.NIL;
        }
        SubLObject var682 = (SubLObject)module0035.NIL;
        SubLObject var683 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var684 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var685 = (SubLObject)module0035.ZERO_INTEGER;
        final SubLObject var686 = Sequences.length(var505);
        SubLObject var687 = (SubLObject)module0035.NIL;
        SubLObject var688 = (SubLObject)module0035.NIL;
        SubLObject var689 = (SubLObject)module0035.NIL;
        SubLObject var690 = (SubLObject)module0035.NIL;
        SubLObject var691 = (SubLObject)module0035.NIL;
        while (var683.numL(var686)) {
            var687 = Vectors.aref(var505, var683);
            if (module0035.NIL != Characters.charE(var687, var680)) {
                if (!var684.numE(var683)) {
                    var688 = Numbers.subtract(var683, var684);
                    var689 = Strings.make_string(var688, (SubLObject)module0035.UNPROVIDED);
                    SubLObject var692;
                    for (var692 = (SubLObject)module0035.NIL, var692 = (SubLObject)module0035.ZERO_INTEGER; var692.numL(var688); var692 = Numbers.add(var692, (SubLObject)module0035.ONE_INTEGER)) {
                        Vectors.set_aref(var689, var692, Vectors.aref(var505, Numbers.add(var684, var692)));
                    }
                    var682 = (SubLObject)ConsesLow.cons(var689, var682);
                }
                var685 = var683;
                for (var683 = Numbers.add(var683, (SubLObject)module0035.ONE_INTEGER); var683.numL(var686) && module0035.NIL == Characters.charE(Vectors.aref(var505, var683), var681); var683 = Numbers.add(var683, (SubLObject)module0035.ONE_INTEGER)) {}
                var684 = var683;
                var690 = Numbers.subtract(var683, var685);
                var691 = Strings.make_string(var690, (SubLObject)module0035.UNPROVIDED);
                SubLObject var693;
                for (var693 = (SubLObject)module0035.NIL, var693 = (SubLObject)module0035.ZERO_INTEGER; var693.numL(var690); var693 = Numbers.add(var693, (SubLObject)module0035.ONE_INTEGER)) {
                    Vectors.set_aref(var691, var693, Vectors.aref(var505, Numbers.add(var685, var693)));
                }
                var682 = (SubLObject)ConsesLow.cons(Packages.intern(var691, (SubLObject)module0035.UNPROVIDED), var682);
            }
            else {
                var683 = Numbers.add(var683, (SubLObject)module0035.ONE_INTEGER);
            }
        }
        if (!var684.numE(var683)) {
            var688 = Numbers.subtract(var683, var684);
            var689 = Strings.make_string(var688, (SubLObject)module0035.UNPROVIDED);
            SubLObject var692;
            for (var692 = (SubLObject)module0035.NIL, var692 = (SubLObject)module0035.ZERO_INTEGER; var692.numL(var688); var692 = Numbers.add(var692, (SubLObject)module0035.ONE_INTEGER)) {
                Vectors.set_aref(var689, var692, Vectors.aref(var505, Numbers.add(var684, var692)));
            }
            var682 = (SubLObject)ConsesLow.cons(var689, var682);
        }
        return Sequences.nreverse(var682);
    }
    
    public static SubLObject f2510(final SubLObject var93, final SubLObject var692, SubLObject var693, SubLObject var694, SubLObject var695) {
        if (var693 == module0035.UNPROVIDED) {
            var693 = (SubLObject)module0035.$ic192$;
        }
        if (var694 == module0035.UNPROVIDED) {
            var694 = (SubLObject)module0035.$ic193$;
        }
        if (var695 == module0035.UNPROVIDED) {
            var695 = (SubLObject)module0035.$ic19$;
        }
        SubLObject var696 = (SubLObject)module0035.NIL;
        SubLObject var697 = (SubLObject)module0035.NIL;
        SubLObject var698 = (SubLObject)module0035.NIL;
        SubLObject var699 = var693;
        if (var699.eql((SubLObject)module0035.$ic192$)) {
            var696 = Types.atom(var93);
        }
        else if (var699.eql((SubLObject)module0035.$ic189$)) {
            var696 = Types.symbolp(var93);
        }
        else if (var699.eql((SubLObject)module0035.$ic188$)) {
            var696 = Types.keywordp(var93);
        }
        else if (var699.eql((SubLObject)module0035.$ic194$)) {
            var696 = Types.stringp(var93);
        }
        else {
            var696 = Functions.funcall(var693, var93);
        }
        if (module0035.NIL != var696) {
            var699 = var694;
            if (var699.eql((SubLObject)module0035.$ic193$)) {
                var697 = conses_high.assoc(var93, var692, (SubLObject)module0035.UNPROVIDED, (SubLObject)module0035.UNPROVIDED);
            }
            else {
                var697 = Functions.funcall(var694, var93, var692);
            }
            if (module0035.NIL != var697) {
                var699 = var695;
                if (var699.eql((SubLObject)module0035.$ic19$)) {
                    var698 = var697.rest();
                }
                else {
                    var698 = Functions.funcall(var695, var697);
                }
                return var698;
            }
            return var93;
        }
        else {
            if (var93.isCons()) {
                return (SubLObject)ConsesLow.cons(f2510(var93.first(), var692, var693, var694, var695), f2510(var93.rest(), var692, var693, var694, var695));
            }
            return var93;
        }
    }
    
    public static SubLObject f2511(final SubLObject var697, SubLObject var698, SubLObject var699) {
        if (var698 == module0035.UNPROVIDED) {
            var698 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var699 == module0035.UNPROVIDED) {
            var699 = (SubLObject)module0035.NIL;
        }
        final SubLThread var700 = SubLProcess.currentSubLThread();
        SubLObject var701 = (SubLObject)module0035.NIL;
        SubLObject var702 = (SubLObject)module0035.NIL;
        try {
            var700.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var703 = Errors.$error_handler$.currentBinding(var700);
            try {
                Errors.$error_handler$.bind((SubLObject)module0035.$ic195$, var700);
                try {
                    var702 = reader.read_delimited_list(var697, var698, var699);
                }
                catch (Throwable var704) {
                    Errors.handleThrowable(var704, (SubLObject)module0035.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var703, var700);
            }
        }
        catch (Throwable var705) {
            var701 = Errors.handleThrowable(var705, module0003.$g3$.getGlobalValue());
        }
        finally {
            var700.throwStack.pop();
        }
        if (module0035.NIL != var701) {
            return var701;
        }
        return var702;
    }
    
    public static SubLObject f2512(final SubLObject var701, final SubLObject var93, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        if (module0035.NIL == var93) {
            return (SubLObject)ConsesLow.cons((SubLObject)module0035.NIL, (SubLObject)module0035.NIL);
        }
        SubLObject var702 = f2513(var93, var701, var6, var7);
        if (module0035.NIL == var702) {
            if (var93.isCons()) {
                final SubLObject var703 = f2512(var701, var93.first(), var6, var7);
                final SubLObject var704 = f2512(var701, var93.rest(), var6, var7);
                SubLObject var705 = var703;
                SubLObject var706 = (SubLObject)module0035.NIL;
                var706 = var705.first();
                while (module0035.NIL != var705) {
                    SubLObject var38_706 = var704;
                    SubLObject var707 = (SubLObject)module0035.NIL;
                    var707 = var38_706.first();
                    while (module0035.NIL != var38_706) {
                        var702 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var706, var707), var702);
                        var38_706 = var38_706.rest();
                        var707 = var38_706.first();
                    }
                    var705 = var705.rest();
                    var706 = var705.first();
                }
            }
            else {
                var702 = (SubLObject)ConsesLow.cons(var93, (SubLObject)module0035.NIL);
            }
        }
        return var702;
    }
    
    public static SubLObject f2513(final SubLObject var4, final SubLObject var701, SubLObject var6, SubLObject var7) {
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var702 = (SubLObject)module0035.NIL;
        SubLObject var703 = var701;
        SubLObject var704 = (SubLObject)module0035.NIL;
        var704 = var703.first();
        while (module0035.NIL != var703) {
            if (module0035.NIL != Functions.funcall(var6, var4, Functions.funcall(var7, var704.first()))) {
                var702 = ConsesLow.append(var704.rest(), var702);
            }
            var703 = var703.rest();
            var704 = var703.first();
        }
        return var702;
    }
    
    public static SubLObject f2514(final SubLObject var1, SubLObject var710, SubLObject var6) {
        if (var710 == module0035.UNPROVIDED) {
            var710 = (SubLObject)module0035.NIL;
        }
        if (var6 == module0035.UNPROVIDED) {
            var6 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (!var1.isList()) {
            return (SubLObject)module0035.NIL;
        }
        if (module0035.NIL != var710) {
            SubLObject var711 = (SubLObject)module0035.NIL;
            SubLObject var712 = (SubLObject)module0035.NIL;
            var711 = var1;
            var712 = (SubLObject)(var711.isCons() ? var711.first() : module0035.NIL);
            while (var711.isCons()) {
                if (!var712.isCons()) {
                    return (SubLObject)module0035.NIL;
                }
                if (module0035.NIL == module0004.f104(var712.first(), var710, var6, (SubLObject)module0035.UNPROVIDED)) {
                    return (SubLObject)module0035.NIL;
                }
                var711 = var711.rest();
                var712 = (SubLObject)(var711.isCons() ? var711.first() : module0035.NIL);
            }
            return (SubLObject)((module0035.NIL == var711) ? module0035.T : module0035.NIL);
        }
        SubLObject var711 = (SubLObject)module0035.NIL;
        SubLObject var712 = (SubLObject)module0035.NIL;
        var711 = var1;
        var712 = (SubLObject)(var711.isCons() ? var711.first() : module0035.NIL);
        while (var711.isCons()) {
            if (!var712.isCons()) {
                return (SubLObject)module0035.NIL;
            }
            var711 = var711.rest();
            var712 = (SubLObject)(var711.isCons() ? var711.first() : module0035.NIL);
        }
        return (SubLObject)((module0035.NIL == var711) ? module0035.T : module0035.NIL);
    }
    
    public static SubLObject f2515(final SubLObject var8, SubLObject var591, SubLObject var7, SubLObject var711) {
        if (var591 == module0035.UNPROVIDED) {
            var591 = Symbols.symbol_function((SubLObject)module0035.$ic98$);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var711 == module0035.UNPROVIDED) {
            var711 = (SubLObject)module0035.NIL;
        }
        final SubLObject var712 = module0067.f4880(var7, Sequences.length(var8));
        SubLObject var713 = var8;
        SubLObject var714 = (SubLObject)module0035.NIL;
        var714 = var713.first();
        while (module0035.NIL != var713) {
            module0084.f5775(var712, var714, (SubLObject)module0035.UNPROVIDED);
            var713 = var713.rest();
            var714 = var713.first();
        }
        SubLObject var715 = module0084.f5795(var712, var591);
        if (module0035.NIL != var711) {
            var715 = Sort.stable_sort(var715, var711, Symbols.symbol_function((SubLObject)module0035.$ic20$));
        }
        return var715;
    }
    
    public static SubLObject f2516(final SubLObject var8, SubLObject var591, SubLObject var7, SubLObject var711) {
        if (var591 == module0035.UNPROVIDED) {
            var591 = Symbols.symbol_function((SubLObject)module0035.$ic98$);
        }
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.EQL);
        }
        if (var711 == module0035.UNPROVIDED) {
            var711 = (SubLObject)module0035.NIL;
        }
        return f2338(f2515(var8, var591, var7, var711));
    }
    
    public static SubLObject f2517(final SubLObject var713) {
        return f2365(f2338(var713), (SubLObject)module0035.UNPROVIDED);
    }
    
    public static SubLObject f2518(final SubLObject var8, final SubLObject var113, final SubLObject var16) {
        SubLObject var114 = (SubLObject)module0035.NIL;
        SubLObject var115;
        SubLObject var116;
        for (var115 = Numbers.add(var113, var16, (SubLObject)module0035.ONE_INTEGER), var116 = (SubLObject)module0035.NIL, var116 = Numbers.subtract(var113, var16); !var116.numGE(var115); var116 = module0048.f_1X(var116)) {
            var114 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var116, var8), var114);
        }
        return Sequences.nreverse(var114);
    }
    
    public static SubLObject f2519(final SubLObject var8, final SubLObject var16) {
        return f2518(var8, Numbers.integerDivide(Sequences.length(var8), (SubLObject)module0035.TWO_INTEGER), var16);
    }
    
    public static SubLObject f2520(final SubLObject var8, final SubLObject var714, SubLObject var7) {
        if (var7 == module0035.UNPROVIDED) {
            var7 = Symbols.symbol_function((SubLObject)module0035.IDENTITY);
        }
        SubLObject var715 = (SubLObject)ConsesLow.make_list(Sequences.length(var714), (SubLObject)module0035.UNPROVIDED);
        SubLObject var716 = (SubLObject)module0035.NIL;
        SubLObject var717 = var8;
        SubLObject var718 = (SubLObject)module0035.NIL;
        var718 = var717.first();
        while (module0035.NIL != var717) {
            final SubLObject var719 = Functions.funcall(var7, var718);
            SubLObject var720 = (SubLObject)module0035.NIL;
            SubLObject var721 = (SubLObject)module0035.NIL;
            SubLObject var722 = (SubLObject)module0035.NIL;
            SubLObject var723 = (SubLObject)module0035.NIL;
            var721 = var714;
            var722 = var721.first();
            for (var723 = (SubLObject)module0035.ZERO_INTEGER; module0035.NIL == var720 && module0035.NIL != var721; var721 = var721.rest(), var722 = var721.first(), var723 = module0048.f_1X(var723)) {
                if (module0035.NIL != Functions.funcall(var722, var719)) {
                    var720 = (SubLObject)module0035.T;
                    ConsesLow.set_nth(var723, var715, (SubLObject)ConsesLow.cons(var718, ConsesLow.nth(var723, var715)));
                }
            }
            if (module0035.NIL == var720) {
                var716 = (SubLObject)ConsesLow.cons(var718, var716);
            }
            var717 = var717.rest();
            var718 = var717.first();
        }
        var715 = f2076(Symbols.symbol_function((SubLObject)module0035.$ic85$), var715);
        if (module0035.NIL != var716) {
            var715 = ConsesLow.nconc(var715, (SubLObject)ConsesLow.list(Sequences.nreverse(var716)));
        }
        return var715;
    }
    
    public static SubLObject f2521(final SubLObject var720) {
        final SubLObject var721 = Sequences.length(var720.first());
        final SubLObject var722 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0035.$ic196$), (SubLObject)ConsesLow.make_list(var721, Symbols.symbol_function((SubLObject)module0035.EQ)));
        SubLObject var723;
        SubLObject var724;
        SubLObject var725;
        SubLObject var726;
        SubLObject var727;
        SubLObject var728;
        SubLObject var729;
        for (var723 = (SubLObject)module0035.NIL, var723 = (SubLObject)module0035.ZERO_INTEGER; var723.numL(var721); var723 = Numbers.add(var723, (SubLObject)module0035.ONE_INTEGER)) {
            var724 = ConsesLow.nth(var723, (SubLObject)module0035.$ic197$);
            assert module0035.NIL != Types.function_spec_p(var724) : var724;
            var725 = Sort.stable_sort(conses_high.copy_list(var720), Symbols.symbol_function((SubLObject)module0035.$ic98$), var724);
            var726 = ConsesLow.nth(var723, var722);
            var727 = (SubLObject)module0035.NIL;
            var728 = (SubLObject)module0035.NIL;
            var729 = (SubLObject)module0035.NIL;
            var727 = var725;
            var728 = var727.first();
            for (var729 = (SubLObject)module0035.ZERO_INTEGER; module0035.NIL != var727; var727 = var727.rest(), var728 = var727.first(), var729 = Numbers.add((SubLObject)module0035.ONE_INTEGER, var729)) {
                module0067.f4886(var726, var728, var729);
            }
        }
        SubLObject var730 = (SubLObject)module0035.NIL;
        SubLObject var731 = var720;
        SubLObject var732 = (SubLObject)module0035.NIL;
        var732 = var731.first();
        while (module0035.NIL != var731) {
            SubLObject var733 = (SubLObject)module0035.NIL;
            var727 = (SubLObject)module0035.NIL;
            SubLObject var734 = (SubLObject)module0035.NIL;
            SubLObject var735 = (SubLObject)module0035.NIL;
            var727 = var732;
            var734 = var727.first();
            for (var735 = (SubLObject)module0035.ZERO_INTEGER; module0035.NIL != var727; var727 = var727.rest(), var734 = var727.first(), var735 = Numbers.add((SubLObject)module0035.ONE_INTEGER, var735)) {
                final SubLObject var736 = module0067.f4884(ConsesLow.nth(var735, var722), var732, (SubLObject)module0035.UNPROVIDED);
                var733 = (SubLObject)ConsesLow.cons(var736, var733);
                var733 = (SubLObject)ConsesLow.cons(var734, var733);
            }
            var730 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var733), var730);
            var731 = var731.rest();
            var732 = var731.first();
        }
        return Sequences.nreverse(var730);
    }
    
    public static SubLObject f2522(final SubLObject var728) {
        if (module0035.NIL != f1997(var728)) {
            return var728.first();
        }
        SubLObject var729 = (SubLObject)module0035.NIL;
        SubLObject var730 = (SubLObject)module0035.ZERO_INTEGER;
        SubLObject var731 = (SubLObject)module0035.NIL;
        while (module0035.NIL == var731) {
            SubLObject var732 = (SubLObject)module0035.NIL;
            if (module0035.NIL == var731) {
                SubLObject var733 = var728;
                SubLObject var734 = (SubLObject)module0035.NIL;
                var734 = var733.first();
                while (module0035.NIL == var731 && module0035.NIL != var733) {
                    final SubLObject var735 = ConsesLow.nth(var730, var734);
                    if (module0035.NIL != var735) {
                        var732 = ConsesLow.append(var732, var735);
                    }
                    else {
                        var731 = (SubLObject)module0035.T;
                    }
                    var733 = var733.rest();
                    var734 = var733.first();
                }
            }
            if (module0035.NIL == var731) {
                var730 = Numbers.add(var730, (SubLObject)module0035.ONE_INTEGER);
                var729 = (SubLObject)ConsesLow.cons(var732, var729);
            }
        }
        return Sequences.nreverse(var729);
    }
    
    public static SubLObject f2523(final SubLObject var1, final SubLObject var328) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && var328.equal(var1.first()));
    }
    
    public static SubLObject f2524() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "sublisp_boolean", "BOOLEAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1963", "S#3301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1964", "NOT-EQ", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1965", "S#3302", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1966", "S#3303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1967", "S#3304", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1968", "S#3305", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1969", "S#3306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1970", "S#3307", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1971", "BULL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1972", "S#3308", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "caadr", "CAADR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "caddr", "CADDR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "cdddr", "CDDDR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "cadddr", "CADDDR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "cadadr", "CADADR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "cadar", "CADAR", 1, 0, false);
        new $cadar$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "cdadr", "CDADR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1973", "S#3309", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1974", "S#3310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1975", "S#3311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1976", "S#3312", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1977", "S#3313", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1978", "S#3314", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f1979", "S#3315");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f1980", "S#3316");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f1981", "S#3317");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f1982", "S#3318");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f1983", "S#3319");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f1984", "S#3320");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f1985", "S#1601");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f1986", "S#3321");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f1987", "S#3322");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f1988", "S#3323");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f1989", "S#3324");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f1990", "S#3325");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f1991", "S#3326");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1992", "S#3327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1993", "S#3328", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1994", "S#3329", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1995", "LENGTH=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2001", "LENGTHS=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2002", "S#3330", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2000", "LENGTH>=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2003", "S#3331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2004", "S#3332", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2005", "S#3333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2006", "S#3334", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2007", "S#3335", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2008", "S#3336", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2009", "S#3337", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2010", "S#3338", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2011", "S#3339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2012", "S#3340", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2013", "S#3341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2014", "S#2028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1996", "S#3285", 1, 0, false);
        new $f1996$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2015", "S#747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2016", "S#2030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2017", "S#3342", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2018", "S#3343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2019", "S#3344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2020", "S#3345", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2021", "S#3346", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2022", "S#3347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2023", "S#3348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2024", "S#3349", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2025", "S#3350", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2026", "S#3286", 1, 0, false);
        new $f2026$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "remove_if_not", "REMOVE-IF-NOT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "delete_if_not", "DELETE-IF-NOT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "substitute_if_not", "SUBSTITUTE-IF-NOT", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "nsubstitute_if_not", "NSUBSTITUTE-IF-NOT", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "find_if_not", "FIND-IF-NOT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "position_if_not", "POSITION-IF-NOT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2027", "S#3351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2028", "S#3352", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2029", "S#3353", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2030", "S#3354", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2031", "S#3355", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2033", "S#3356", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2032", "S#3357", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2034", "S#3358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2035", "S#3359", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2036", "S#3360", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2038", "S#3361", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2037", "S#3362", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2039", "S#3363", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2040", "S#3364", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2041", "S#3365", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2043", "S#3366", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2042", "S#3367", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2046", "S#3368", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2047", "S#3369", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2048", "S#3370", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2049", "S#3371", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2050", "S#3372", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2052", "S#3373", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2051", "S#3374", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2053", "S#3375", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2054", "S#3376", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "count_if_not", "COUNT-IF-NOT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "subst_if_not", "SUBST-IF-NOT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "nsubst_if_not", "NSUBST-IF-NOT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "member_if_not", "MEMBER-IF-NOT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "assoc_if_not", "ASSOC-IF-NOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "rassoc_if_not", "RASSOC-IF-NOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2055", "S#3377", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2056", "S#3378", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2057", "S#3379", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2058", "S#3380", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2059", "S#3381", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2060", "S#3382", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2061", "S#3383", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2064", "S#3384", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2065", "S#3385", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2066", "S#3386", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2067", "S#3387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2068", "S#3388", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f2069", "FIRST-OF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2071", "S#66", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2072", "S#67", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2073", "S#3389", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2074", "S#3390", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2075", "S#3391", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2076", "S#3392", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2077", "S#3393", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2078", "S#3394", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2079", "S#3395", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2080", "S#3396", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2081", "S#3397", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2082", "S#3398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2083", "S#3399", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2084", "S#2826", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2085", "S#3400", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2086", "S#2828", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2087", "S#3401", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2088", "S#3402", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2089", "S#3403", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2090", "S#3404", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2091", "S#3405", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2092", "S#3406", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2093", "S#3407", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2094", "S#3408", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2095", "S#3409", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2096", "S#3410", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2098", "S#3411", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2099", "S#2829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2100", "S#3412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2101", "S#3413", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2102", "S#3414", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2103", "S#3415", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2097", "S#3416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2104", "S#3417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2106", "S#3418", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2107", "S#3419", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2108", "S#3420", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2109", "S#3421", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2110", "S#2685", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2111", "S#3422", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2112", "S#3423", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2113", "S#3424", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2114", "S#3425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2115", "S#3426", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2116", "S#3427", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2117", "S#3428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2118", "S#3429", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2119", "FLATTEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2120", "S#3430", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2121", "S#3431", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2122", "S#3432", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2123", "S#3433", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2124", "S#2532", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2125", "S#3434", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2126", "S#3435", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2127", "S#3436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2128", "S#3437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2129", "S#3438", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2130", "S#3439", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2045", "S#3440", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2131", "S#3441", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2132", "S#3442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2133", "S#3443", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2134", "S#3444", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2044", "S#3445", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2135", "S#3446", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2136", "S#3447", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2137", "S#3448", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2138", "S#3449", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2139", "S#3450", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2140", "S#3451", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2141", "S#3452", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2144", "S#3453", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2143", "S#3454", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2142", "S#3455", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2145", "S#3456", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2147", "S#3457", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2146", "S#3458", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2149", "S#3459", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2148", "S#3460", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2150", "S#3461", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2151", "S#3462", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2152", "S#3463", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2153", "S#3464", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2154", "S#3465", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2155", "S#3466", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2156", "S#3467", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2157", "S#3468", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2158", "S#3469", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2159", "S#3470", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2160", "S#3471", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2164", "S#3472", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2162", "S#3473", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2165", "S#3474", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2163", "S#3475", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2166", "S#3476", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2161", "S#3477", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2167", "S#3478", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2168", "S#3479", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2169", "S#68", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2170", "S#3480", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2171", "S#3481", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2172", "S#3482", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2173", "S#2965", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2174", "S#3483", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2175", "S#3484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2176", "S#3485", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2177", "S#3486", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2178", "S#3487", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2179", "S#3488", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2180", "INTERSECT?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2181", "S#3489", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2182", "S#3490", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2183", "S#3491", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2184", "S#3492", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2185", "S#3493", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2186", "S#3494", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2187", "S#3495", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2188", "S#3496", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2189", "S#3497", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1997", "SINGLETON?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1998", "DOUBLETON?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f1999", "S#3498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2190", "S#3499", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2191", "S#3500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2193", "S#3501", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2194", "S#3502", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2195", "S#3503", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2196", "S#3504", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2197", "S#3505", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2198", "S#3506", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2199", "S#3507", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2200", "S#3508", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2201", "SETS-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2202", "S#3509", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2203", "S#3510", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2204", "S#3511", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2205", "S#3512", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2206", "S#3513", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2207", "S#3514", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2208", "S#3515", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2209", "S#3516", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2210", "SETS-EQUAL-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2211", "S#3517", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2212", "SUPERSETP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2213", "S#3518", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2214", "S#3519", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2215", "S#3520", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2216", "S#3521", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2217", "S#3522", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2218", "S#3523", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2219", "S#3524", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2220", "S#3525", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2221", "S#3526", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2105", "S#3527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2222", "S#3528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2223", "S#3529", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2224", "S#3530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2225", "S#3531", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2226", "S#3532", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2227", "S#3533", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2228", "S#3534", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2229", "S#3535", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2230", "S#3536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2231", "S#3292", 1, 0, false);
        new $f2231$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2232", "S#3537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2233", "S#3538", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2234", "S#3539", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2235", "S#3540", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2236", "S#3541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2237", "S#3542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2238", "S#3543", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2239", "S#3544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2240", "S#3545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2070", "S#3546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2241", "S#2613", 1, 0, false);
        new $f2241$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2242", "S#3547", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2243", "S#3548", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2244", "S#2827", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2245", "S#3549", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2246", "S#3550", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2247", "S#3551", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2248", "S#917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2249", "S#3552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2250", "S#3553", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2251", "S#3554", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2252", "S#3555", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2253", "S#3556", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2254", "S#3557", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2255", "S#3558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2256", "S#3559", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2258", "S#3560", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2259", "S#3561", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2260", "S#3562", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2261", "S#3563", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2262", "S#3564", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2263", "S#3565", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2264", "S#3566", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2265", "S#3567", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2266", "S#3568", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2267", "S#3569", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2268", "S#3570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2269", "FAST-DELETE-DUPLICATES", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2270", "S#3571", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2271", "S#3572", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2272", "S#3573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2273", "S#3574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2274", "S#3575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2275", "S#3576", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2276", "S#3577", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2277", "S#3578", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2278", "S#3579", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2279", "S#3580", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2281", "S#3581", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2280", "S#3582", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2282", "S#3583", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2283", "S#3584", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2285", "S#3585", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2284", "S#3586", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2286", "S#3587", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2287", "S#3588", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2288", "S#3589", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2289", "S#3590", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2290", "S#3591", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2291", "S#3592", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2292", "S#3593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2293", "S#2619", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2294", "S#3594", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2295", "S#3595", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2296", "S#3596", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2297", "S#3597", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2298", "S#3598", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2299", "S#3599", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2300", "S#3600", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2301", "S#3601", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2302", "S#3602", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2303", "S#3603", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2304", "S#3604", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2305", "S#3605", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2063", "ALIST-ENTER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2306", "S#3606", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2307", "S#3607", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2308", "S#3608", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2309", "S#3609", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2310", "S#3610", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2311", "S#3611", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2312", "S#3612", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2313", "S#3613", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2314", "S#3614", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2315", "S#3615", 3, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f2316", "S#3616");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f2317", "S#3617");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f2318", "S#3618");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2062", "S#3619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2319", "S#3620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2320", "S#3621", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2321", "S#3622", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2322", "S#3623", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2323", "S#3624", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2324", "S#3625", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2325", "S#3626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2326", "S#3627", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2327", "S#748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2328", "S#3628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2329", "S#3629", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2330", "S#3630", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2331", "S#3631", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2332", "S#3632", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2333", "S#3633", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f2334", "S#3634");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2335", "S#3635", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f2336", "S#3636");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f2337", "S#3637");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2338", "S#3638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2339", "S#3639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2340", "S#3640", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2341", "S#3641", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2342", "S#3642", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2343", "S#3643", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2345", "S#3644", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2346", "S#3645", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2347", "S#3646", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2348", "S#3647", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2349", "S#3648", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2350", "S#3649", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2352", "S#3650", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2351", "S#3651", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2353", "S#3652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2354", "S#3653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2355", "S#3654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2356", "S#3655", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2357", "S#3656", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2358", "S#3657", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2359", "S#3658", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2360", "S#3659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2361", "S#3660", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2362", "S#3661", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2363", "S#3662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2364", "S#3663", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2365", "S#3664", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2366", "S#3665", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2367", "S#3666", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2368", "S#3667", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2369", "S#3668", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2370", "S#3669", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2371", "S#3670", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2372", "S#3671", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2373", "S#3672", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2374", "S#3673", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2375", "S#3674", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2376", "S#3675", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2377", "S#3676", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2378", "S#3677", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2379", "S#3678", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2380", "S#3679", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2381", "S#3680", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2382", "POWERSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2383", "S#3681", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2384", "S#3682", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2385", "S#2618", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2344", "S#3683", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2386", "S#3684", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2387", "S#3297", 2, 0, false);
        new $f2387$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2388", "S#3685", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2389", "S#3686", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2390", "S#3687", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2391", "S#3688", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2392", "S#3689", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2393", "S#3690", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2394", "S#3691", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2395", "S#3692", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2396", "S#3693", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2397", "S#3694", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2398", "S#3695", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2400", "S#3696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2401", "S#3697", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2403", "S#3698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2404", "S#3699", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2405", "S#3700", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2406", "S#3701", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2407", "S#3702", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2408", "S#3703", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2409", "S#3704", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2410", "S#3705", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2411", "S#3706", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2412", "S#3707", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2413", "S#3708", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2414", "S#3709", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2415", "S#3710", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2416", "S#3711", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2417", "S#3712", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2402", "S#3713", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2418", "S#3714", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2419", "S#3715", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2420", "S#3716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2421", "S#3717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2422", "S#3718", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2423", "S#3719", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2424", "S#3720", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2425", "S#3721", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2426", "S#3722", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2427", "S#3723", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2428", "TREE-FIND", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2433", "S#3724", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2432", "S#3725", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2434", "S#3726", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2429", "S#3727", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2435", "S#3728", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2430", "S#3729", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2436", "S#3730", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2431", "S#3731", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2437", "S#3732", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2438", "S#3733", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2439", "TREE-FIND-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2440", "S#3734", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2441", "S#3735", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2443", "S#3736", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2444", "S#3737", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2445", "S#3738", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2446", "S#3739", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2447", "S#3740", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2442", "S#3741", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2448", "S#3742", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2449", "S#3743", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2450", "S#3744", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2451", "S#3745", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2452", "S#3746", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2257", "S#3747", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2399", "TREE-GATHER", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2453", "S#3748", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2454", "S#3749", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2455", "S#3750", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2456", "S#3751", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2457", "S#3752", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2458", "S#3753", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2459", "S#3754", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2460", "S#3755", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2461", "S#3756", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2462", "S#3757", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2463", "S#3758", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2464", "S#3759", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2465", "S#3760", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2466", "S#3761", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2467", "S#3762", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2468", "S#3763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2469", "S#3764", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2470", "S#3765", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2471", "S#3766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2472", "S#3767", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2474", "S#3768", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2473", "S#3769", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2475", "S#3770", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2478", "S#3771", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2476", "S#3772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2479", "S#3773", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2480", "S#3774", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2477", "S#3775", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2481", "S#3776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2482", "S#3777", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2483", "S#3778", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2484", "S#3779", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2485", "S#3780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2486", "S#3781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2487", "S#3782", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2488", "S#3783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2489", "S#3784", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2491", "S#3785", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2490", "S#3786", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2492", "S#3787", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0035", "f2493", "MAPEXP");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2494", "S#3788", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2192", "S#3789", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2495", "S#3790", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2496", "S#3791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2497", "S#3792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2498", "S#3793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2499", "S#3794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2500", "S#3795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2501", "S#3796", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2502", "S#3797", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2503", "S#3798", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2504", "S#3799", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2505", "S#3800", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2506", "S#3801", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2507", "S#3802", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2508", "S#3803", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2509", "S#3804", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2510", "S#3805", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2511", "S#3806", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2512", "S#3807", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2513", "S#3808", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2514", "S#3809", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2515", "S#3810", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2516", "S#3811", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2517", "S#3812", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2518", "S#3813", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2519", "S#3814", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2520", "S#3815", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2521", "S#3816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2522", "S#3817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0035", "f2523", "S#3818", 2, 0, false);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2525() {
        module0035.$g892$ = SubLFiles.defparameter("S#3819", (SubLObject)module0035.$ic0$);
        module0035.$g893$ = SubLFiles.defparameter("S#3820", (SubLObject)module0035.NIL);
        module0035.$g894$ = SubLFiles.defparameter("S#3821", (SubLObject)module0035.NIL);
        module0035.$g895$ = SubLFiles.defparameter("S#3822", (SubLObject)module0035.NIL);
        module0035.$g896$ = SubLFiles.deflexical("S#3823", (SubLObject)module0035.NIL);
        module0035.$g897$ = SubLFiles.deflexical("S#3824", Hashtables.make_hash_table((SubLObject)module0035.$ic125$, Symbols.symbol_function((SubLObject)module0035.EQ), (SubLObject)module0035.UNPROVIDED));
        module0035.$g898$ = SubLFiles.deflexical("S#3825", Hashtables.make_hash_table((SubLObject)module0035.$ic125$, Symbols.symbol_function((SubLObject)module0035.EQL), (SubLObject)module0035.UNPROVIDED));
        module0035.$g899$ = SubLFiles.deflexical("S#3826", Hashtables.make_hash_table((SubLObject)module0035.$ic125$, Symbols.symbol_function((SubLObject)module0035.EQUAL), (SubLObject)module0035.UNPROVIDED));
        module0035.$g900$ = SubLFiles.deflexical("S#3827", Hashtables.make_hash_table((SubLObject)module0035.$ic125$, Symbols.symbol_function((SubLObject)module0035.EQUALP), (SubLObject)module0035.UNPROVIDED));
        module0035.$g901$ = SubLFiles.deflexical("S#3828", Locks.make_lock((SubLObject)module0035.$ic126$));
        module0035.$g902$ = SubLFiles.deflexical("S#3829", Locks.make_lock((SubLObject)module0035.$ic127$));
        module0035.$g903$ = SubLFiles.deflexical("S#3830", Locks.make_lock((SubLObject)module0035.$ic128$));
        module0035.$g904$ = SubLFiles.deflexical("S#3831", Locks.make_lock((SubLObject)module0035.$ic129$));
        module0035.$g905$ = SubLFiles.defparameter("S#3832", (SubLObject)module0035.NIL);
        module0035.$g906$ = SubLFiles.defparameter("S#3833", (SubLObject)module0035.NIL);
        module0035.$g907$ = SubLFiles.defparameter("S#3834", (SubLObject)module0035.NIL);
        module0035.$g908$ = SubLFiles.defparameter("S#3835", (SubLObject)module0035.NIL);
        module0035.$g909$ = SubLFiles.defparameter("S#3836", (SubLObject)module0035.NIL);
        return (SubLObject)module0035.NIL;
    }
    
    public static SubLObject f2526() {
        module0034.f1909((SubLObject)module0035.$ic93$);
        module0027.f1449((SubLObject)module0035.$ic111$, (SubLObject)ConsesLow.list(new SubLObject[] { module0035.$ic112$, Symbols.symbol_function((SubLObject)module0035.EQUAL), module0035.$ic113$, module0035.NIL, module0035.$ic114$, module0035.NIL, module0035.$ic115$, module0035.$ic116$, module0035.$ic117$, module0035.T }), (SubLObject)module0035.$ic118$);
        module0002.f35((SubLObject)module0035.$ic184$, (SubLObject)module0035.$ic185$);
        return (SubLObject)module0035.NIL;
    }
    
    public void declareFunctions() {
        f2524();
    }
    
    public void initializeVariables() {
        f2525();
    }
    
    public void runTopLevelForms() {
        f2526();
    }
    
    static {
        me = (SubLFile)new module0035();
        module0035.$g892$ = null;
        module0035.$g893$ = null;
        module0035.$g894$ = null;
        module0035.$g895$ = null;
        module0035.$g896$ = null;
        module0035.$g897$ = null;
        module0035.$g898$ = null;
        module0035.$g899$ = null;
        module0035.$g900$ = null;
        module0035.$g901$ = null;
        module0035.$g902$ = null;
        module0035.$g903$ = null;
        module0035.$g904$ = null;
        module0035.$g905$ = null;
        module0035.$g906$ = null;
        module0035.$g907$ = null;
        module0035.$g908$ = null;
        module0035.$g909$ = null;
        $ic0$ = SubLObjectFactory.makeInteger(80);
        $ic1$ = SubLObjectFactory.makeString("nth-cycling: width must be greater than zero");
        $ic2$ = SubLObjectFactory.makeString("nth-cycling: width must be less than or equal to list length");
        $ic3$ = SubLObjectFactory.makeString("nth-cycling: width overruns offset");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"));
        $ic5$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic6$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic7$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic8$ = SubLObjectFactory.makeSymbol("CPOP");
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("CLET");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3837", "CYC"));
        $ic12$ = SubLObjectFactory.makeSymbol("CSETF");
        $ic13$ = SubLObjectFactory.makeSymbol("CONS");
        $ic14$ = SubLObjectFactory.makeSymbol("S#2532", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("-");
        $ic16$ = ConsesLow.list((SubLObject)module0035.ONE_INTEGER);
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#3838", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#140", "CYC"));
        $ic19$ = SubLObjectFactory.makeSymbol("CDR");
        $ic20$ = SubLObjectFactory.makeSymbol("CAR");
        $ic21$ = SubLObjectFactory.makeSymbol("NULL");
        $ic22$ = SubLObjectFactory.makeSymbol("CDO");
        $ic23$ = SubLObjectFactory.makeSymbol("CAND");
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#123", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#3838", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic25$ = ConsesLow.list((SubLObject)module0035.ZERO_INTEGER);
        $ic26$ = SubLObjectFactory.makeSymbol("S#3318", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("CINC");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#703", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#3838", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic29$ = SubLObjectFactory.makeString("Malformed csome-multiple -- ~S was not a variable");
        $ic30$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic31$ = SubLObjectFactory.makeSymbol("COR");
        $ic32$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3839", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#123", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#140", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic33$ = SubLObjectFactory.makeUninternedSymbol("US#713E610");
        $ic34$ = SubLObjectFactory.makeSymbol("+");
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#140", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic36$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic37$ = SubLObjectFactory.makeSymbol("REVERSE");
        $ic38$ = SubLObjectFactory.makeUninternedSymbol("US#713E610");
        $ic39$ = SubLObjectFactory.makeSymbol("1-");
        $ic40$ = SubLObjectFactory.makeSymbol("LENGTH");
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3839", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#123", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#140", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#703", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic42$ = SubLObjectFactory.makeUninternedSymbol("US#713E610");
        $ic43$ = SubLObjectFactory.makeSymbol("S#3325", "CYC");
        $ic44$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3838", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3840", "CYC"), (SubLObject)module0035.NIL)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic45$ = SubLObjectFactory.makeString("COUNTER");
        $ic46$ = SubLObjectFactory.makeString("-orig");
        $ic47$ = SubLObjectFactory.makeString("-cdr");
        $ic48$ = SubLObjectFactory.makeSymbol("S#3314", "CYC");
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3841", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#720", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3842", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP"))), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LIST-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic51$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic52$ = SubLObjectFactory.makeKeyword("LIST-TYPE");
        $ic53$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic54$ = SubLObjectFactory.makeKeyword("DONE");
        $ic55$ = SubLObjectFactory.makeUninternedSymbol("US#468E22C");
        $ic56$ = SubLObjectFactory.makeUninternedSymbol("US#398F89B");
        $ic57$ = SubLObjectFactory.makeUninternedSymbol("US#10BF604");
        $ic58$ = SubLObjectFactory.makeSymbol("LIST");
        $ic59$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic60$ = SubLObjectFactory.makeSymbol("PIF");
        $ic61$ = SubLObjectFactory.makeSymbol("CPUSH");
        $ic62$ = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $ic63$ = SubLObjectFactory.makeSymbol("SEQUENCEP");
        $ic64$ = SubLObjectFactory.makeString("");
        $ic65$ = SubLObjectFactory.makeKeyword("DOT-FOR-DOTTED-LIST");
        $ic66$ = SubLObjectFactory.makeSymbol("S#3286", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#3351", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#2028", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic71$ = SubLObjectFactory.makeKeyword("DELETED");
        $ic72$ = ConsesLow.list((SubLObject)module0035.NIL);
        $ic73$ = SubLObjectFactory.makeKeyword("DUMMY");
        $ic74$ = SubLObjectFactory.makeSymbol("S#3356", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#3355", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#3338", "CYC");
        $ic77$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3843", "CYC"));
        $ic78$ = SubLObjectFactory.makeString("The lists of keys and data are of unequal length.");
        $ic79$ = SubLObjectFactory.makeSymbol("DOUBLETON?");
        $ic80$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3844", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3845", "CYC"));
        $ic81$ = SubLObjectFactory.makeString("FIRST-OF will multiply evaluate ~s");
        $ic82$ = SubLObjectFactory.makeSymbol("FIF");
        $ic83$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic84$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic85$ = SubLObjectFactory.makeSymbol("NREVERSE");
        $ic86$ = SubLObjectFactory.makeSymbol("VECTORP");
        $ic87$ = SubLObjectFactory.makeString("~s was not a singleton");
        $ic88$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic89$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic90$ = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $ic91$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic92$ = SubLObjectFactory.makeString("Position is not valid for the size of list.");
        $ic93$ = SubLObjectFactory.makeSymbol("S#3477", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("S#3823", "CYC");
        $ic95$ = SubLObjectFactory.makeInteger(100);
        $ic96$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic97$ = SubLObjectFactory.makeSymbol("S#2879", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("<");
        $ic99$ = SubLObjectFactory.makeSymbol("<=");
        $ic100$ = SubLObjectFactory.makeString("Number of repetitions must be greater than 1. Got ~S");
        $ic101$ = SubLObjectFactory.makeKeyword("FAILED");
        $ic102$ = SubLObjectFactory.makeKeyword("SUCCEEDED");
        $ic103$ = SubLObjectFactory.makeKeyword("UPDATED");
        $ic104$ = SubLObjectFactory.makeSymbol("S#3519", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("S#73", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("S#3292", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic108$ = SubLObjectFactory.makeSymbol("STRING=");
        $ic109$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic110$ = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $ic111$ = SubLObjectFactory.makeSymbol("S#3550", "CYC");
        $ic112$ = SubLObjectFactory.makeKeyword("TEST");
        $ic113$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic114$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic115$ = SubLObjectFactory.makeKeyword("KB");
        $ic116$ = SubLObjectFactory.makeKeyword("TINY");
        $ic117$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic118$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0035.ONE_INTEGER, (SubLObject)module0035.NIL, (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)module0035.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0035.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)module0035.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)module0035.ONE_INTEGER, (SubLObject)module0035.TWO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0035.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)module0035.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)module0035.ONE_INTEGER, (SubLObject)module0035.TWO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0035.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)module0035.TWO_INTEGER, (SubLObject)module0035.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)module0035.ONE_INTEGER, (SubLObject)module0035.TWO_INTEGER, (SubLObject)module0035.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0035.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)module0035.ONE_INTEGER, (SubLObject)module0035.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)module0035.ONE_INTEGER, (SubLObject)module0035.TWO_INTEGER, (SubLObject)module0035.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0035.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)module0035.ONE_INTEGER, (SubLObject)module0035.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)module0035.ONE_INTEGER, (SubLObject)module0035.TWO_INTEGER, (SubLObject)module0035.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("xxx"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("x"), (SubLObject)SubLObjectFactory.makeString("xxxx")), (SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("x"), (SubLObject)SubLObjectFactory.makeString("xxx"), (SubLObject)SubLObjectFactory.makeString("xxxx"))));
        $ic119$ = SubLObjectFactory.makeSymbol("&REST");
        $ic120$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"));
        $ic121$ = (SubLList)ConsesLow.cons((SubLObject)module0035.T, (SubLObject)module0035.T);
        $ic122$ = SubLObjectFactory.makeSymbol("S#3558", "CYC");
        $ic123$ = SubLObjectFactory.makeString("~s = ~s");
        $ic124$ = SubLObjectFactory.makeKeyword("TEMP");
        $ic125$ = SubLObjectFactory.makeInteger(500);
        $ic126$ = SubLObjectFactory.makeString("remove-duplicates eq table lock");
        $ic127$ = SubLObjectFactory.makeString("remove-duplicates eql table lock");
        $ic128$ = SubLObjectFactory.makeString("remove-duplicates equal table lock");
        $ic129$ = SubLObjectFactory.makeString("remove-duplicates equalp table lock");
        $ic130$ = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $ic131$ = SubLObjectFactory.makeKeyword("NOT-UNIQUE");
        $ic132$ = SubLObjectFactory.makeKeyword("UNIQUE");
        $ic133$ = SubLObjectFactory.makeSymbol("S#3846", "CYC");
        $ic134$ = SubLObjectFactory.makeSymbol("S#3700", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#3593", "CYC");
        $ic136$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3847", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3848", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0035.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3849", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0035.EQL))));
        $ic137$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0035.EQL);
        $ic138$ = SubLObjectFactory.makeSymbol("S#3614", "CYC");
        $ic139$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3847", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3848", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0035.EQL))));
        $ic140$ = SubLObjectFactory.makeSymbol("S#3613", "CYC");
        $ic141$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3847", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0035.EQL))));
        $ic142$ = SubLObjectFactory.makeSymbol("ALIST-ENTER");
        $ic143$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic144$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3850", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic145$ = SubLObjectFactory.makeSymbol("PUTF");
        $ic146$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#135", "CYC"), (SubLObject)module0035.ONE_INTEGER));
        $ic147$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INCREMENT"));
        $ic148$ = SubLObjectFactory.makeKeyword("INCREMENT");
        $ic149$ = SubLObjectFactory.makeSymbol("S#3634", "CYC");
        $ic150$ = SubLObjectFactory.makeSymbol("S#3635", "CYC");
        $ic151$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic152$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic153$ = SubLObjectFactory.makeKeyword("NO-VALUE");
        $ic154$ = SubLObjectFactory.makeSymbol("S#3659", "CYC");
        $ic155$ = SubLObjectFactory.makeString("~A and ~A");
        $ic156$ = SubLObjectFactory.makeSymbol("PRINC-TO-STRING");
        $ic157$ = SubLObjectFactory.makeString(", ");
        $ic158$ = SubLObjectFactory.makeString(", and ");
        $ic159$ = SubLObjectFactory.makeString("~a -> ~a~%");
        $ic160$ = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $ic161$ = SubLObjectFactory.makeSymbol("S#3851", "CYC");
        $ic162$ = SubLObjectFactory.makeString("~a  ~4,2f~%");
        $ic163$ = SubLObjectFactory.makeString("~a  ~a~%");
        $ic164$ = SubLObjectFactory.makeSymbol("S#746", "CYC");
        $ic165$ = SubLObjectFactory.makeString(" | ");
        $ic166$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3852", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3853", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3854", "CYC"));
        $ic167$ = SubLObjectFactory.makeSymbol("PLUSP");
        $ic168$ = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $ic169$ = SubLObjectFactory.makeSymbol("S#3297", "CYC");
        $ic170$ = SubLObjectFactory.makeSymbol("S#3687", "CYC");
        $ic171$ = SubLObjectFactory.makeSymbol(">");
        $ic172$ = SubLObjectFactory.makeSymbol("S#3701", "CYC");
        $ic173$ = SubLObjectFactory.makeSymbol("S#3699", "CYC");
        $ic174$ = SubLObjectFactory.makeSymbol("S#3694", "CYC");
        $ic175$ = SubLObjectFactory.makeSymbol("S#3306", "CYC");
        $ic176$ = SubLObjectFactory.makeSymbol("S#3697", "CYC");
        $ic177$ = SubLObjectFactory.makeSymbol("FALSE");
        $ic178$ = SubLObjectFactory.makeSymbol("=");
        $ic179$ = SubLObjectFactory.makeKeyword("LESS");
        $ic180$ = SubLObjectFactory.makeKeyword("EQUAL");
        $ic181$ = SubLObjectFactory.makeKeyword("GREATER");
        $ic182$ = SubLObjectFactory.makeSymbol("MAPCAR");
        $ic183$ = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("S#3855", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3856", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3857", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $ic184$ = SubLObjectFactory.makeSymbol("S#3780", "CYC");
        $ic185$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#74", "CYC"));
        $ic186$ = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $ic187$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3267", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)SubLObjectFactory.makeSymbol("EXP"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic188$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic189$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic190$ = SubLObjectFactory.makeString("Expected ~S, got ~S");
        $ic191$ = SubLObjectFactory.makeString("~S was not a form with operator ~S");
        $ic192$ = SubLObjectFactory.makeSymbol("ATOM");
        $ic193$ = SubLObjectFactory.makeSymbol("ASSOC");
        $ic194$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic195$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic196$ = SubLObjectFactory.makeSymbol("NEW-DICTIONARY");
        $ic197$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FIRST"), SubLObjectFactory.makeSymbol("SECOND"), SubLObjectFactory.makeSymbol("THIRD"), SubLObjectFactory.makeSymbol("FOURTH"), SubLObjectFactory.makeSymbol("FIFTH"), SubLObjectFactory.makeSymbol("SIXTH"), SubLObjectFactory.makeSymbol("SEVENTH"), SubLObjectFactory.makeSymbol("EIGHTH"), SubLObjectFactory.makeSymbol("NINTH"), SubLObjectFactory.makeSymbol("TENTH") });
    }
    
    public static final class $cadar$UnaryFunction extends UnaryFunction
    {
        public $cadar$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CADAR"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return module0035.cadar(var10);
        }
    }
    
    public static final class $f1996$UnaryFunction extends UnaryFunction
    {
        public $f1996$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#3285"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return module0035.f1996(var10);
        }
    }
    
    public static final class $f2026$UnaryFunction extends UnaryFunction
    {
        public $f2026$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#3286"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return module0035.f2026(var10);
        }
    }
    
    public static final class $f2231$UnaryFunction extends UnaryFunction
    {
        public $f2231$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#3292"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return module0035.f2231(var10);
        }
    }
    
    public static final class $f2241$UnaryFunction extends UnaryFunction
    {
        public $f2241$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2613"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return module0035.f2241(var10);
        }
    }
    
    public static final class $f2387$BinaryFunction extends BinaryFunction
    {
        public $f2387$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#3297"));
        }
        
        public SubLObject processItem(final SubLObject var10, final SubLObject var143) {
            return module0035.f2387(var10, var143);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0035.class
	Total time: 2825 ms
	
	Decompiled with Procyon 0.5.32.
*/
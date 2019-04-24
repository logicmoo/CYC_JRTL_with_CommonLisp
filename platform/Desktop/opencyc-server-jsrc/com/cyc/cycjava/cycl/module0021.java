package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0021 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0021";
    public static final String myFingerPrint = "aa0383efe486a1476ef93ea66fa0e83f5a21a4c9f6739e5bc4b8b3c3c55264d2";
    public static SubLSymbol $g742$;
    private static SubLSymbol $g743$;
    public static SubLSymbol $g744$;
    public static SubLSymbol $g745$;
    public static SubLSymbol $g746$;
    public static SubLSymbol $g747$;
    public static SubLSymbol $g748$;
    public static SubLSymbol $g749$;
    public static SubLSymbol $g750$;
    private static SubLSymbol $g751$;
    private static SubLSymbol $g752$;
    public static SubLSymbol $g753$;
    public static SubLSymbol $g754$;
    private static SubLSymbol $g755$;
    private static SubLSymbol $g756$;
    private static SubLSymbol $g757$;
    private static SubLSymbol $g758$;
    private static SubLSymbol $g759$;
    private static SubLSymbol $g760$;
    private static SubLSymbol $g761$;
    private static SubLSymbol $g762$;
    private static SubLSymbol $g763$;
    private static SubLSymbol $g764$;
    private static SubLSymbol $g765$;
    private static SubLSymbol $g766$;
    private static SubLSymbol $g767$;
    private static SubLSymbol $g768$;
    private static SubLSymbol $g769$;
    private static SubLSymbol $g770$;
    private static SubLSymbol $g771$;
    private static SubLSymbol $g772$;
    private static SubLSymbol $g773$;
    private static SubLSymbol $g774$;
    private static SubLSymbol $g775$;
    private static SubLSymbol $g776$;
    public static SubLSymbol $g777$;
    private static SubLSymbol $g778$;
    private static SubLSymbol $g779$;
    private static SubLSymbol $g780$;
    private static SubLSymbol $g781$;
    private static SubLSymbol $g782$;
    private static SubLSymbol $g783$;
    private static SubLSymbol $g784$;
    private static SubLSymbol $g785$;
    private static SubLSymbol $g786$;
    private static SubLSymbol $g787$;
    private static SubLSymbol $g788$;
    public static SubLSymbol $g789$;
    private static SubLSymbol $g790$;
    private static SubLSymbol $g791$;
    private static SubLSymbol $g792$;
    public static SubLSymbol $g793$;
    private static SubLSymbol $g794$;
    private static SubLSymbol $g795$;
    private static SubLSymbol $g796$;
    private static SubLSymbol $g797$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
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
    private static final SubLList $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLInteger $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLInteger $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLList $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLInteger $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLInteger $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLInteger $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLInteger $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLInteger $ic126$;
    private static final SubLInteger $ic127$;
    private static final SubLInteger $ic128$;
    private static final SubLList $ic129$;
    private static final SubLList $ic130$;
    private static final SubLInteger $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLInteger $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLList $ic143$;
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLInteger $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLInteger $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLInteger $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLInteger $ic171$;
    private static final SubLList $ic172$;
    private static final SubLInteger $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLInteger $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLInteger $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLList $ic182$;
    private static final SubLString $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLInteger $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLString $ic188$;
    private static final SubLInteger $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLInteger $ic192$;
    private static final SubLList $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLList $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLList $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLString $ic204$;
    
    public static SubLObject f1017(final SubLObject var1) {
        return module0037.f2581(var1);
    }
    
    public static SubLObject f1018(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isStream() || module0021.NIL != f1019(var1));
    }
    
    public static SubLObject f1020(final SubLObject var2, final SubLObject var3) {
        compatibility.default_struct_print_function(var2, var3, (SubLObject)module0021.ZERO_INTEGER);
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1019(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX2002_native.class) ? module0021.T : module0021.NIL);
    }
    
    public static SubLObject f1021(final SubLObject var2) {
        assert module0021.NIL != f1019(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f1022(final SubLObject var2) {
        assert module0021.NIL != f1019(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f1023(final SubLObject var2, final SubLObject var5) {
        assert module0021.NIL != f1019(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f1024(final SubLObject var2, final SubLObject var5) {
        assert module0021.NIL != f1019(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f1025(SubLObject var6) {
        if (var6 == module0021.UNPROVIDED) {
            var6 = (SubLObject)module0021.NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX2002_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)module0021.NIL, var8 = var6; module0021.NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)module0021.$ic13$)) {
                f1023(var7, var10);
            }
            else if (var11.eql((SubLObject)module0021.$ic14$)) {
                f1024(var7, var10);
            }
            else {
                Errors.error((SubLObject)module0021.$ic15$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f1026(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)module0021.$ic16$, (SubLObject)module0021.$ic17$, (SubLObject)module0021.TWO_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)module0021.$ic18$, (SubLObject)module0021.$ic13$, f1021(var12));
        Functions.funcall(var13, var12, (SubLObject)module0021.$ic18$, (SubLObject)module0021.$ic14$, f1022(var12));
        Functions.funcall(var13, var12, (SubLObject)module0021.$ic19$, (SubLObject)module0021.$ic17$, (SubLObject)module0021.TWO_INTEGER);
        return var12;
    }
    
    public static SubLObject f1027(final SubLObject var12, final SubLObject var13) {
        return f1026(var12, var13);
    }
    
    public static SubLObject f1028(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic21$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)module0021.NIL;
        SubLObject var20 = (SubLObject)module0021.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic21$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic21$);
        var20 = var17.first();
        var17 = var17.rest();
        if (module0021.NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0021.$ic21$);
            return (SubLObject)module0021.NIL;
        }
        final SubLObject var21;
        var17 = (var21 = var18);
        assert module0021.NIL != Types.symbolp(var19) : var19;
        assert module0021.NIL != Types.symbolp(var20) : var20;
        return (SubLObject)ConsesLow.list((SubLObject)module0021.$ic23$, (SubLObject)ConsesLow.list(reader.bq_cons(var19, (SubLObject)module0021.$ic24$)), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic25$, reader.bq_cons((SubLObject)module0021.$ic26$, ConsesLow.append(var21, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0021.$ic27$, var20, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic28$, var19))))), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic29$, var19)));
    }
    
    public static SubLObject f1029(final SubLObject var21) {
        return streams_high.get_output_stream_string(f1021(var21));
    }
    
    public static SubLObject f1030(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic31$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)module0021.NIL;
        SubLObject var20 = (SubLObject)module0021.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic31$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic31$);
        var20 = var17.first();
        var17 = var17.rest();
        if (module0021.NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0021.$ic31$);
            return (SubLObject)module0021.NIL;
        }
        final SubLObject var21;
        var17 = (var21 = var18);
        assert module0021.NIL != Types.symbolp(var19) : var19;
        assert module0021.NIL != Types.symbolp(var20) : var20;
        return (SubLObject)ConsesLow.list((SubLObject)module0021.$ic23$, (SubLObject)ConsesLow.list(reader.bq_cons(var19, (SubLObject)module0021.$ic24$)), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic25$, reader.bq_cons((SubLObject)module0021.$ic26$, ConsesLow.append(var21, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0021.$ic27$, var20, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic32$, var19))))), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic29$, var19)));
    }
    
    public static SubLObject f1031() {
        final SubLObject var21 = f1025((SubLObject)module0021.UNPROVIDED);
        final SubLObject var22 = streams_high.make_private_string_output_stream();
        f1023(var21, var22);
        f1024(var21, (SubLObject)module0021.ZERO_INTEGER);
        return var21;
    }
    
    public static SubLObject f1032(final SubLObject var27, final SubLObject var21) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = f1021(var21);
        var28.resetMultipleValues();
        final SubLObject var30 = module0037.f2584(var27);
        final SubLObject var31 = var28.secondMultipleValue();
        var28.resetMultipleValues();
        streams_high.write_char(var30, var29);
        streams_high.write_char(var31, var29);
        f1024(var21, Numbers.add(f1022(var21), (SubLObject)module0021.TWO_INTEGER));
        return var27;
    }
    
    public static SubLObject f1033(final SubLObject var21) {
        assert module0021.NIL != f1019(var21) : var21;
        final SubLObject var22 = f1029(var21);
        final SubLObject var23 = module0037.f2587(var22);
        return var23;
    }
    
    public static SubLObject f1034(final SubLObject var21) {
        assert module0021.NIL != f1019(var21) : var21;
        return streams_high.close(f1021(var21), (SubLObject)module0021.UNPROVIDED);
    }
    
    public static SubLObject f1035(final SubLObject var21) {
        assert module0021.NIL != f1019(var21) : var21;
        final SubLObject var22 = f1021(var21);
        final SubLObject var23 = f1022(var21);
        return var23;
    }
    
    public static SubLObject f1036(final SubLObject var21) {
        return Numbers.integerDivide(f1035(var21), (SubLObject)module0021.TWO_INTEGER);
    }
    
    public static SubLObject f1037(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0021.NIL;
        final SubLObject var3 = f1031();
        try {
            f1038(var1, var3);
            var2 = f1033(var3);
        }
        finally {
            final SubLObject var4 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0021.T);
                f1034(var3);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var4);
            }
        }
        return var2;
    }
    
    public static SubLObject f1039(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0021.NIL;
        final SubLObject var3 = f1031();
        try {
            f1040(var1, var3);
            var2 = f1033(var3);
        }
        finally {
            final SubLObject var4 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0021.T);
                f1034(var3);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var4);
            }
        }
        return var2;
    }
    
    public static SubLObject f1041(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0021.NIL;
        final SubLObject var4 = module0021.$g743$.currentBinding(var2);
        try {
            module0021.$g743$.bind((SubLObject)((module0021.$g744$.getDynamicValue(var2) == module0021.$ic38$) ? module0021.T : module0021.$g744$.getDynamicValue(var2)), var2);
            final SubLObject var5 = f1031();
            try {
                f1040(var1, var5);
                var3 = f1033(var5);
            }
            finally {
                final SubLObject var35_36 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0021.T, var2);
                    f1034(var5);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var35_36, var2);
                }
            }
        }
        finally {
            module0021.$g743$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f1042(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isStream() || module0021.NIL != f1043(var1));
    }
    
    public static SubLObject f1044(final SubLObject var2, final SubLObject var3) {
        compatibility.default_struct_print_function(var2, var3, (SubLObject)module0021.ZERO_INTEGER);
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1043(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX2006_native.class) ? module0021.T : module0021.NIL);
    }
    
    public static SubLObject f1045(final SubLObject var2) {
        assert module0021.NIL != f1043(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f1046(final SubLObject var2) {
        assert module0021.NIL != f1043(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f1047(final SubLObject var2, final SubLObject var5) {
        assert module0021.NIL != f1043(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f1048(final SubLObject var2, final SubLObject var5) {
        assert module0021.NIL != f1043(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f1049(SubLObject var6) {
        if (var6 == module0021.UNPROVIDED) {
            var6 = (SubLObject)module0021.NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX2006_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)module0021.NIL, var8 = var6; module0021.NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)module0021.$ic13$)) {
                f1047(var7, var10);
            }
            else if (var11.eql((SubLObject)module0021.$ic51$)) {
                f1048(var7, var10);
            }
            else {
                Errors.error((SubLObject)module0021.$ic15$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f1050(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)module0021.$ic16$, (SubLObject)module0021.$ic52$, (SubLObject)module0021.TWO_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)module0021.$ic18$, (SubLObject)module0021.$ic13$, f1045(var12));
        Functions.funcall(var13, var12, (SubLObject)module0021.$ic18$, (SubLObject)module0021.$ic51$, f1046(var12));
        Functions.funcall(var13, var12, (SubLObject)module0021.$ic19$, (SubLObject)module0021.$ic52$, (SubLObject)module0021.TWO_INTEGER);
        return var12;
    }
    
    public static SubLObject f1051(final SubLObject var12, final SubLObject var13) {
        return f1050(var12, var13);
    }
    
    public static SubLObject f1052(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic21$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)module0021.NIL;
        SubLObject var20 = (SubLObject)module0021.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic21$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic21$);
        var20 = var17.first();
        var17 = var17.rest();
        if (module0021.NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0021.$ic21$);
            return (SubLObject)module0021.NIL;
        }
        final SubLObject var21;
        var17 = (var21 = var18);
        assert module0021.NIL != Types.symbolp(var19) : var19;
        return (SubLObject)ConsesLow.list((SubLObject)module0021.$ic23$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic54$, var20))), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic25$, reader.bq_cons((SubLObject)module0021.$ic26$, ConsesLow.append(var21, (SubLObject)module0021.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic55$, var19)));
    }
    
    public static SubLObject f1053(final SubLObject var32) {
        final SubLObject var33 = f1049((SubLObject)module0021.UNPROVIDED);
        final SubLObject var34 = streams_high.make_private_string_input_stream(var32, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
        f1047(var33, var34);
        f1048(var33, (SubLObject)module0021.ZERO_INTEGER);
        return var33;
    }
    
    public static SubLObject f1054(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic31$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)module0021.NIL;
        SubLObject var20 = (SubLObject)module0021.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic31$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic31$);
        var20 = var17.first();
        var17 = var17.rest();
        if (module0021.NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0021.$ic31$);
            return (SubLObject)module0021.NIL;
        }
        final SubLObject var21;
        var17 = (var21 = var18);
        assert module0021.NIL != Types.symbolp(var19) : var19;
        return (SubLObject)ConsesLow.list((SubLObject)module0021.$ic23$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic57$, var20))), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic25$, reader.bq_cons((SubLObject)module0021.$ic26$, ConsesLow.append(var21, (SubLObject)module0021.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic55$, var19)));
    }
    
    public static SubLObject f1055(final SubLObject var33) {
        assert module0021.NIL != f1017(var33) : var33;
        final SubLObject var34 = module0037.f2583(var33);
        return f1053(var34);
    }
    
    public static SubLObject f1056(final SubLObject var43, SubLObject var47, SubLObject var48) {
        if (var47 == module0021.UNPROVIDED) {
            var47 = (SubLObject)module0021.T;
        }
        if (var48 == module0021.UNPROVIDED) {
            var48 = (SubLObject)module0021.$ic61$;
        }
        final SubLObject var49 = f1045(var43);
        final SubLObject var50 = streams_high.read_char(var49, var47, var48, (SubLObject)module0021.UNPROVIDED);
        SubLObject var51 = (SubLObject)module0021.NIL;
        if (var48.eql(var50)) {
            return var48;
        }
        f1048(var43, Numbers.add(f1046(var43), (SubLObject)module0021.ONE_INTEGER));
        var51 = streams_high.read_char(var49, var47, var48, (SubLObject)module0021.UNPROVIDED);
        if (var48.eql(var51)) {
            return var48;
        }
        f1048(var43, Numbers.add(f1046(var43), (SubLObject)module0021.ONE_INTEGER));
        return module0037.f2588(var50, var51);
    }
    
    public static SubLObject f1057(final SubLObject var43) {
        assert module0021.NIL != f1043(var43) : var43;
        return streams_high.close(f1045(var43), (SubLObject)module0021.UNPROVIDED);
    }
    
    public static SubLObject f1058(final SubLObject var43) {
        return f1046(var43);
    }
    
    public static SubLObject f1059(final SubLObject var33) {
        assert module0021.NIL != f1017(var33) : var33;
        SubLObject var34 = (SubLObject)module0021.NIL;
        final SubLObject var35 = f1055(var33);
        try {
            var34 = f1060(var35, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
        }
        finally {
            final SubLObject var36 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0021.T);
                f1057(var35);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var36);
            }
        }
        return var34;
    }
    
    public static SubLObject f1061(final SubLObject var43) {
        return Numbers.integerDivide(f1058(var43), (SubLObject)module0021.TWO_INTEGER);
    }
    
    public static SubLObject f1062(final SubLObject var43) {
        return f1058(var43);
    }
    
    public static SubLObject f1063(final SubLObject var2, final SubLObject var3) {
        compatibility.default_struct_print_function(var2, var3, (SubLObject)module0021.ZERO_INTEGER);
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1064(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX2010_native.class) ? module0021.T : module0021.NIL);
    }
    
    public static SubLObject f1065(final SubLObject var2) {
        assert module0021.NIL != f1064(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f1066(final SubLObject var2, final SubLObject var5) {
        assert module0021.NIL != f1064(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f1067(SubLObject var6) {
        if (var6 == module0021.UNPROVIDED) {
            var6 = (SubLObject)module0021.NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX2010_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)module0021.NIL, var8 = var6; module0021.NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)module0021.$ic51$)) {
                f1066(var7, var10);
            }
            else {
                Errors.error((SubLObject)module0021.$ic15$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f1068(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)module0021.$ic16$, (SubLObject)module0021.$ic72$, (SubLObject)module0021.ONE_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)module0021.$ic18$, (SubLObject)module0021.$ic51$, f1065(var12));
        Functions.funcall(var13, var12, (SubLObject)module0021.$ic19$, (SubLObject)module0021.$ic72$, (SubLObject)module0021.ONE_INTEGER);
        return var12;
    }
    
    public static SubLObject f1069(final SubLObject var12, final SubLObject var13) {
        return f1068(var12, var13);
    }
    
    public static SubLObject f1070(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic74$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)module0021.NIL;
        SubLObject var20 = (SubLObject)module0021.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic74$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic74$);
        var20 = var17.first();
        var17 = var17.rest();
        if (module0021.NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0021.$ic74$);
            return (SubLObject)module0021.NIL;
        }
        final SubLObject var21;
        var17 = (var21 = var18);
        assert module0021.NIL != Types.symbolp(var19) : var19;
        assert module0021.NIL != Types.symbolp(var20) : var20;
        return (SubLObject)ConsesLow.list((SubLObject)module0021.$ic23$, (SubLObject)ConsesLow.list(reader.bq_cons(var19, (SubLObject)module0021.$ic75$)), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic25$, reader.bq_cons((SubLObject)module0021.$ic26$, ConsesLow.append(var21, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0021.$ic27$, var20, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic76$, var19))))), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic77$, var19)));
    }
    
    public static SubLObject f1071() {
        final SubLObject var3 = f1067((SubLObject)module0021.UNPROVIDED);
        f1066(var3, (SubLObject)module0021.ZERO_INTEGER);
        return var3;
    }
    
    public static SubLObject f1072(final SubLObject var27, final SubLObject var56) {
        f1066(var56, Numbers.add(f1065(var56), (SubLObject)module0021.ONE_INTEGER));
        return var27;
    }
    
    public static SubLObject f1073(final SubLObject var55, final SubLObject var56) {
        f1066(var56, Numbers.add(var55, f1065(var56)));
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1074(final SubLObject var56) {
        assert module0021.NIL != f1064(var56) : var56;
        return f1065(var56);
    }
    
    public static SubLObject f1075(final SubLObject var56) {
        assert module0021.NIL != f1064(var56) : var56;
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1076(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0021.NIL;
        final SubLObject var3 = f1071();
        try {
            f1038(var1, var3);
            var2 = f1074(var3);
        }
        finally {
            final SubLObject var4 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0021.T);
                f1075(var3);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var4);
            }
        }
        return var2;
    }
    
    public static SubLObject f1077(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0021.NIL;
        final SubLObject var3 = f1071();
        try {
            f1040(var1, var3);
            var2 = f1074(var3);
        }
        finally {
            final SubLObject var4 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0021.T);
                f1075(var3);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var4);
            }
        }
        return var2;
    }
    
    public static SubLObject f1078(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = var14.rest();
        final SubLObject var18;
        final SubLObject var17 = var18 = var16;
        return (SubLObject)ConsesLow.listS((SubLObject)module0021.$ic23$, (SubLObject)module0021.$ic78$, ConsesLow.append(var18, (SubLObject)module0021.NIL));
    }
    
    public static SubLObject f1038(final SubLObject var1, final SubLObject var3) {
        if (module0021.NIL != module0068.f4929(var1)) {
            return module0068.f4931(var1, var3);
        }
        return f1079(var1, var3);
    }
    
    public static SubLObject f1040(final SubLObject var1, final SubLObject var3) {
        return f1080(var1, var3);
    }
    
    public static SubLObject f1081(final SubLObject var1, final SubLObject var3, final SubLObject var60) {
        if (module0021.NIL != var60) {
            return f1040(var1, var3);
        }
        return f1038(var1, var3);
    }
    
    public static SubLObject f1079(final SubLObject var1, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = Structures.method_func(var1, module0021.$g749$.getGlobalValue());
        if (module0021.NIL != var5) {
            return Functions.funcall(var5, var1, var3);
        }
        if (module0021.NIL == f1082(var1, var3)) {
            SubLObject var6 = (SubLObject)module0021.NIL;
            try {
                var4.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var7 = Errors.$error_handler$.currentBinding(var4);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0021.$ic80$, var4);
                    try {
                        f1083(var1, var3);
                    }
                    catch (Throwable var8) {
                        Errors.handleThrowable(var8, (SubLObject)module0021.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var7, var4);
                }
            }
            catch (Throwable var9) {
                var6 = Errors.handleThrowable(var9, module0003.$g3$.getGlobalValue());
            }
            finally {
                var4.throwStack.pop();
            }
            if (var6.isString()) {
                f1084(var1, var3);
                return (SubLObject)module0021.NIL;
            }
        }
        return var1;
    }
    
    public static SubLObject f1084(final SubLObject var1, final SubLObject var3) {
        Errors.cerror((SubLObject)module0021.$ic81$, (SubLObject)module0021.$ic82$, var1);
        return f1085(var3);
    }
    
    public static SubLObject f1086(final SubLObject var27, final SubLObject var3) {
        if (module0021.NIL != f1064(var3)) {
            return f1072(var27, var3);
        }
        if (module0021.NIL != f1019(var3)) {
            return f1032(var27, var3);
        }
        return streams_high.write_byte(var27, var3);
    }
    
    public static SubLObject f1060(final SubLObject var3, SubLObject var47, SubLObject var48) {
        if (var47 == module0021.UNPROVIDED) {
            var47 = (SubLObject)module0021.T;
        }
        if (var48 == module0021.UNPROVIDED) {
            var48 = (SubLObject)module0021.$ic61$;
        }
        return f1087(var3, var47, var48);
    }
    
    public static SubLObject f1088(final SubLObject var3, SubLObject var47, SubLObject var48) {
        if (var47 == module0021.UNPROVIDED) {
            var47 = (SubLObject)module0021.T;
        }
        if (var48 == module0021.UNPROVIDED) {
            var48 = (SubLObject)module0021.$ic61$;
        }
        return f1089(var3, var47, var48);
    }
    
    public static SubLObject f1090(final SubLObject var3) {
        return f1087(var3, (SubLObject)module0021.NIL, (SubLObject)module0021.NIL);
    }
    
    public static SubLObject f1091(final SubLObject var3) {
        Errors.error((SubLObject)module0021.$ic83$, var3);
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1087(final SubLObject var3, final SubLObject var47, final SubLObject var48) {
        final SubLObject var49 = f1092(var3);
        if (module0021.NIL == var49) {
            if (module0021.NIL != var47) {
                Errors.error((SubLObject)module0021.$ic84$, var3);
            }
            return var48;
        }
        if (module0021.NIL != f1093(var49)) {
            return f1094(var49);
        }
        final SubLObject var50 = f1095(var49);
        if (module0021.$ic85$ == var50) {
            return Errors.error((SubLObject)module0021.$ic86$, var49, var3);
        }
        return Functions.funcall(var50, var3);
    }
    
    public static SubLObject f1089(final SubLObject var3, final SubLObject var47, final SubLObject var48) {
        final SubLObject var49 = f1096(var3);
        if (module0021.NIL == var49) {
            if (module0021.NIL != var47) {
                Errors.error((SubLObject)module0021.$ic84$, var3);
            }
            return var48;
        }
        return var49;
    }
    
    public static SubLObject f1095(final SubLObject var67) {
        return Vectors.aref(module0021.$g752$.getGlobalValue(), var67);
    }
    
    public static SubLObject f1097(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)module0021.NIL;
        SubLObject var19 = (SubLObject)module0021.NIL;
        SubLObject var20 = (SubLObject)module0021.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic89$);
        var18 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic89$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic89$);
        var20 = var17.first();
        var17 = var17.rest();
        if (module0021.NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0021.$ic89$);
            return (SubLObject)module0021.NIL;
        }
        assert module0021.NIL != Types.symbolp(var18) : var18;
        assert module0021.NIL != Types.integerp(var19) : var19;
        assert module0021.NIL != Types.symbolp(var20) : var20;
        return (SubLObject)ConsesLow.list((SubLObject)module0021.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic91$, var18, var19), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic92$, var18, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic93$, var20)));
    }
    
    public static SubLObject f1098(final SubLObject var67, final SubLObject var72) {
        Vectors.set_aref(module0021.$g752$.getGlobalValue(), var67, var72);
        return var72;
    }
    
    public static SubLObject f1096(final SubLObject var3) {
        final SubLObject var4 = f1092(var3);
        if (module0021.NIL != module0048.f3285(var4)) {
            streams_high.unread_byte(var4, var3);
        }
        return var4;
    }
    
    public static SubLObject f1092(final SubLObject var3) {
        if (module0021.NIL != f1043(var3)) {
            return f1056(var3, (SubLObject)module0021.NIL, (SubLObject)module0021.NIL);
        }
        return streams_high.read_byte(var3, (SubLObject)module0021.NIL, (SubLObject)module0021.NIL);
    }
    
    public static SubLObject f1099(final SubLObject var14, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = var14.rest();
        final SubLObject var19;
        final SubLObject var18 = var19 = var17;
        if (module0021.NIL != Sequences.find((SubLObject)module0021.$ic95$, reader.$features$.getDynamicValue(var16), (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED)) {
            return reader.bq_cons((SubLObject)module0021.$ic26$, ConsesLow.append(var19, (SubLObject)module0021.NIL));
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0021.$ic96$, (SubLObject)module0021.$ic97$, reader.bq_cons((SubLObject)module0021.$ic98$, ConsesLow.append(var19, (SubLObject)module0021.NIL)), reader.bq_cons((SubLObject)module0021.$ic26$, ConsesLow.append(var19, (SubLObject)module0021.NIL)));
    }
    
    public static SubLObject f1100(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = var14.rest();
        final SubLObject var18;
        final SubLObject var17 = var18 = var16;
        return (SubLObject)ConsesLow.listS((SubLObject)module0021.$ic23$, (SubLObject)module0021.$ic99$, ConsesLow.append(var18, (SubLObject)module0021.NIL));
    }
    
    public static SubLObject f1101(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = var14.rest();
        final SubLObject var18;
        final SubLObject var17 = var18 = var16;
        return (SubLObject)ConsesLow.listS((SubLObject)module0021.$ic23$, (SubLObject)module0021.$ic100$, ConsesLow.append(var18, (SubLObject)module0021.NIL));
    }
    
    public static SubLObject f1102() {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        return module0021.$g753$.getDynamicValue(var28);
    }
    
    public static SubLObject f1103(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = var14.rest();
        final SubLObject var18;
        final SubLObject var17 = var18 = var16;
        return (SubLObject)ConsesLow.listS((SubLObject)module0021.$ic23$, (SubLObject)module0021.$ic101$, ConsesLow.append(var18, (SubLObject)module0021.NIL));
    }
    
    public static SubLObject f1104() {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        return module0021.$g754$.getDynamicValue(var28);
    }
    
    public static SubLObject f1105(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)module0021.NIL;
        SubLObject var19 = (SubLObject)module0021.NIL;
        SubLObject var20 = (SubLObject)module0021.NIL;
        SubLObject var21 = (SubLObject)module0021.NIL;
        SubLObject var22 = (SubLObject)module0021.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic103$);
        var18 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic103$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic103$);
        var20 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic103$);
        var21 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic103$);
        var22 = var17.first();
        var17 = var17.rest();
        if (module0021.NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0021.$ic103$);
            return (SubLObject)module0021.NIL;
        }
        assert module0021.NIL != Types.symbolp(var18) : var18;
        assert module0021.NIL != Types.integerp(var19) : var19;
        assert module0021.NIL != Types.symbolp(var20) : var20;
        assert module0021.NIL != Types.symbolp(var21) : var21;
        assert module0021.NIL != Types.symbolp(var22) : var22;
        return (SubLObject)ConsesLow.list((SubLObject)module0021.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic94$, var18, var19, var22), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic104$, var18, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic93$, var20), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic93$, var21), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic93$, var22)));
    }
    
    public static SubLObject f1106(final SubLObject var86, final SubLObject var83, final SubLObject var84, final SubLObject var85) {
        SubLObject var87 = conses_high.assoc(var86, module0021.$g755$.getGlobalValue(), (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
        if (module0021.NIL == var87) {
            var87 = (SubLObject)ConsesLow.make_list((SubLObject)module0021.FOUR_INTEGER, var86);
            module0021.$g755$.setGlobalValue((SubLObject)ConsesLow.cons(var87, module0021.$g755$.getGlobalValue()));
        }
        ConsesLow.set_nth((SubLObject)module0021.ONE_INTEGER, var87, var83);
        ConsesLow.set_nth((SubLObject)module0021.TWO_INTEGER, var87, var84);
        ConsesLow.set_nth((SubLObject)module0021.THREE_INTEGER, var87, var85);
        return var86;
    }
    
    public static SubLObject f1082(final SubLObject var1, final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0021.NIL;
        if (module0021.NIL == var4) {
            SubLObject var5 = module0021.$g755$.getGlobalValue();
            SubLObject var6 = (SubLObject)module0021.NIL;
            var6 = var5.first();
            while (module0021.NIL == var4 && module0021.NIL != var5) {
                if (module0021.NIL != Functions.funcall(conses_high.second(var6), var1)) {
                    Functions.funcall(conses_high.third(var6), var1, var3);
                    var4 = (SubLObject)module0021.T;
                }
                var5 = var5.rest();
                var6 = var5.first();
            }
        }
        return var4;
    }
    
    public static SubLObject f1107(final SubLObject var65, final SubLObject var3) {
        f1086(var65, var3);
        return var65;
    }
    
    public static SubLObject f1108(final SubLObject var65, final SubLObject var3) {
        if (module0021.NIL != f1109(var65)) {
            f1107(var65, var3);
        }
        else {
            f1110(var65, var3);
        }
        return var65;
    }
    
    public static SubLObject f1080(final SubLObject var1, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        f1086(module0021.$g756$.getGlobalValue(), var3);
        SubLObject var5 = (SubLObject)module0021.NIL;
        final SubLObject var6 = module0021.$g753$.currentBinding(var4);
        try {
            module0021.$g753$.bind((SubLObject)module0021.T, var4);
            var5 = f1038(var1, var3);
        }
        finally {
            module0021.$g753$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f1111(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0021.NIL;
        final SubLObject var6 = module0021.$g753$.currentBinding(var4);
        try {
            module0021.$g753$.bind((SubLObject)module0021.T, var4);
            var5 = f1090(var3);
        }
        finally {
            module0021.$g753$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f1083(final SubLObject var1, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        f1108(module0021.$g758$.getGlobalValue(), var3);
        final SubLObject var5 = module0021.$g757$.currentBinding(var4);
        try {
            module0021.$g757$.bind(var3, var4);
            visitation.visit_defstruct(var1, Symbols.symbol_function((SubLObject)module0021.$ic110$));
        }
        finally {
            module0021.$g757$.rebind(var5, var4);
        }
        return var1;
    }
    
    public static SubLObject f1112(final SubLObject var92, final SubLObject var93, final SubLObject var94, final SubLObject var95) {
        final SubLThread var96 = SubLProcess.currentSubLThread();
        final SubLObject var97 = module0021.$g757$.getDynamicValue(var96);
        if (var93.eql((SubLObject)module0021.$ic16$)) {
            f1038(var94, var97);
            f1038(var95, var97);
        }
        else if (var93.eql((SubLObject)module0021.$ic18$)) {
            f1038(var94, var97);
            f1038(var95, var97);
        }
        else if (var93.eql((SubLObject)module0021.$ic19$)) {}
        return var92;
    }
    
    public static SubLObject f1113(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f1060(var3, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
        final SubLObject var6 = f1060(var3, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
        SubLObject var7 = (SubLObject)module0021.NIL;
        SubLObject var8 = (SubLObject)module0021.NIL;
        if (module0021.NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && !var5.isFunctionSpec()) {
            Errors.error((SubLObject)module0021.$ic111$, var5);
        }
        var7 = (var8 = (SubLObject)ConsesLow.make_list(Numbers.add(var6, var6), (SubLObject)module0021.UNPROVIDED));
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var9 = (SubLObject)module0021.NIL, var9 = (SubLObject)module0021.ZERO_INTEGER; var9.numL(var6); var9 = Numbers.add(var9, (SubLObject)module0021.ONE_INTEGER)) {
            var10 = f1060(var3, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
            var11 = f1060(var3, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
            if (module0021.NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && !var10.isKeyword()) {
                Errors.error((SubLObject)module0021.$ic112$, var9, var5, var10);
            }
            ConsesLow.set_nth((SubLObject)module0021.ZERO_INTEGER, var8, var10);
            ConsesLow.set_nth((SubLObject)module0021.ONE_INTEGER, var8, var11);
            var8 = conses_high.cddr(var8);
        }
        return Functions.funcall(var5, var7);
    }
    
    public static SubLObject f1114(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isFixnum() && var1.numGE((SubLObject)module0021.ZERO_INTEGER) && var1.numL(module0021.$g759$.getGlobalValue()));
    }
    
    public static SubLObject f1115(final SubLObject var1, final SubLObject var3) {
        f1086(Numbers.add(module0021.$g760$.getGlobalValue(), var1), var3);
        return var1;
    }
    
    public static SubLObject f1093(final SubLObject var65) {
        return Numbers.numGE(var65, module0021.$g760$.getGlobalValue());
    }
    
    public static SubLObject f1094(final SubLObject var65) {
        return Numbers.subtract(var65, module0021.$g760$.getGlobalValue());
    }
    
    public static SubLObject f1116(final SubLObject var1, final SubLObject var3) {
        return f1117(var1, var3);
    }
    
    public static SubLObject f1117(final SubLObject var103, final SubLObject var3) {
        if (module0021.NIL != f1114(var103)) {
            return f1115(var103, var3);
        }
        final SubLObject var104 = Numbers.plusp(var103);
        final SubLObject var105 = (module0021.NIL != var104) ? var103 : Numbers.abs(var103);
        if (var105.numL((SubLObject)module0021.$ic87$)) {
            if (module0021.NIL != var104) {
                f1086(module0021.$g761$.getGlobalValue(), var3);
            }
            else {
                f1086(module0021.$g762$.getGlobalValue(), var3);
            }
            f1118(var105, (SubLObject)module0021.ONE_INTEGER, var3);
        }
        else if (var105.numL((SubLObject)module0021.$ic126$)) {
            if (module0021.NIL != var104) {
                f1086(module0021.$g763$.getGlobalValue(), var3);
            }
            else {
                f1086(module0021.$g764$.getGlobalValue(), var3);
            }
            f1118(var105, (SubLObject)module0021.TWO_INTEGER, var3);
        }
        else if (var105.numL((SubLObject)module0021.$ic127$)) {
            if (module0021.NIL != var104) {
                f1086(module0021.$g765$.getGlobalValue(), var3);
            }
            else {
                f1086(module0021.$g766$.getGlobalValue(), var3);
            }
            f1118(var105, (SubLObject)module0021.THREE_INTEGER, var3);
        }
        else if (var105.numL((SubLObject)module0021.$ic128$)) {
            if (module0021.NIL != var104) {
                f1086(module0021.$g767$.getGlobalValue(), var3);
            }
            else {
                f1086(module0021.$g768$.getGlobalValue(), var3);
            }
            f1118(var105, (SubLObject)module0021.FOUR_INTEGER, var3);
        }
        else {
            final SubLObject var106 = Numbers.disassemble_integer_to_fixnums(var103);
            SubLObject var108;
            final SubLObject var107 = var108 = var106;
            SubLObject var109 = (SubLObject)module0021.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var108, var107, (SubLObject)module0021.$ic129$);
            var109 = var108.first();
            final SubLObject var110;
            var108 = (var110 = var108.rest());
            if (var109.isNegative()) {
                f1086(module0021.$g770$.getGlobalValue(), var3);
            }
            else {
                f1086(module0021.$g769$.getGlobalValue(), var3);
            }
            f1038(Sequences.length(var110), var3);
            SubLObject var111 = var110;
            SubLObject var112 = (SubLObject)module0021.NIL;
            var112 = var111.first();
            while (module0021.NIL != var111) {
                f1038(var112, var3);
                var111 = var111.rest();
                var112 = var111.first();
            }
        }
        return var103;
    }
    
    public static SubLObject f1118(final SubLObject var103, final SubLObject var113, final SubLObject var3) {
        if (module0021.NIL != f1019(var3) || !var113.numLE((SubLObject)module0021.EIGHT_INTEGER)) {
            if (var113.numE((SubLObject)module0021.ONE_INTEGER)) {
                f1086(var103, var3);
            }
            else {
                final SubLObject var114 = Numbers.mod(var103, (SubLObject)module0021.$ic79$);
                final SubLObject var115 = Numbers.integerDivide(Numbers.subtract(var103, var114), (SubLObject)module0021.$ic79$);
                f1086(var114, var3);
                f1118(var115, Numbers.subtract(var113, (SubLObject)module0021.ONE_INTEGER), var3);
            }
            return var103;
        }
        if (module0021.NIL != f1064(var3)) {
            f1073(var113, var3);
            return var103;
        }
        return streams_high.write_positive_integer_as_byte_sequence(var103, var113, var3, (SubLObject)module0021.UNPROVIDED);
    }
    
    public static SubLObject f1119(final SubLObject var3) {
        return f1120((SubLObject)module0021.ONE_INTEGER, var3);
    }
    
    public static SubLObject f1121(final SubLObject var3) {
        return Numbers.minus(f1120((SubLObject)module0021.ONE_INTEGER, var3));
    }
    
    public static SubLObject f1122(final SubLObject var3) {
        return f1120((SubLObject)module0021.TWO_INTEGER, var3);
    }
    
    public static SubLObject f1123(final SubLObject var3) {
        return Numbers.minus(f1120((SubLObject)module0021.TWO_INTEGER, var3));
    }
    
    public static SubLObject f1124(final SubLObject var3) {
        return f1120((SubLObject)module0021.THREE_INTEGER, var3);
    }
    
    public static SubLObject f1125(final SubLObject var3) {
        return Numbers.minus(f1120((SubLObject)module0021.THREE_INTEGER, var3));
    }
    
    public static SubLObject f1126(final SubLObject var3) {
        return f1120((SubLObject)module0021.FOUR_INTEGER, var3);
    }
    
    public static SubLObject f1127(final SubLObject var3) {
        return Numbers.minus(f1120((SubLObject)module0021.FOUR_INTEGER, var3));
    }
    
    public static SubLObject f1128(final SubLObject var116, final SubLObject var117) {
        return Numbers.add(var116, Numbers.ash(var117, (SubLObject)module0021.EIGHT_INTEGER));
    }
    
    public static SubLObject f1129(final SubLObject var116, final SubLObject var117, final SubLObject var118) {
        return Numbers.add(f1128(var116, var117), Numbers.ash(var118, (SubLObject)module0021.SIXTEEN_INTEGER));
    }
    
    public static SubLObject f1130(final SubLObject var116, final SubLObject var117, final SubLObject var118, final SubLObject var119) {
        return Numbers.add(f1129(var116, var117, var118), Numbers.ash(var119, (SubLObject)module0021.$ic123$));
    }
    
    public static SubLObject f1120(final SubLObject var113, final SubLObject var3) {
        if (module0021.NIL == f1043(var3)) {
            return streams_high.read_byte_sequence_to_positive_integer(var113, var3, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
        }
        if (var113.numG((SubLObject)module0021.FOUR_INTEGER)) {
            final SubLObject var114 = f1120(Numbers.subtract(var113, (SubLObject)module0021.FOUR_INTEGER), var3);
            final SubLObject var115 = f1120((SubLObject)module0021.FOUR_INTEGER, var3);
            return Numbers.add(Numbers.ash(var114, (SubLObject)module0021.$ic131$), var115);
        }
        if (var113.eql((SubLObject)module0021.FOUR_INTEGER)) {
            final SubLObject var116 = f1092(var3);
            final SubLObject var117 = f1092(var3);
            final SubLObject var118 = f1092(var3);
            final SubLObject var119 = f1092(var3);
            return f1130(var116, var117, var118, var119);
        }
        if (var113.eql((SubLObject)module0021.THREE_INTEGER)) {
            final SubLObject var116 = f1092(var3);
            final SubLObject var117 = f1092(var3);
            final SubLObject var118 = f1092(var3);
            return f1129(var116, var117, var118);
        }
        if (var113.eql((SubLObject)module0021.TWO_INTEGER)) {
            final SubLObject var116 = f1092(var3);
            final SubLObject var117 = f1092(var3);
            return f1128(var116, var117);
        }
        if (var113.eql((SubLObject)module0021.ONE_INTEGER)) {
            final SubLObject var116 = f1092(var3);
            return var116;
        }
        if (var113.eql((SubLObject)module0021.ZERO_INTEGER)) {
            return (SubLObject)module0021.ZERO_INTEGER;
        }
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1131(final SubLObject var3) {
        return f1132((SubLObject)module0021.ONE_INTEGER, var3);
    }
    
    public static SubLObject f1133(final SubLObject var3) {
        return f1132((SubLObject)module0021.MINUS_ONE_INTEGER, var3);
    }
    
    public static SubLObject f1132(final SubLObject var109, final SubLObject var3) {
        final SubLObject var110 = f1090(var3);
        final SubLObject var111 = (SubLObject)ConsesLow.make_list(Numbers.add(var110, (SubLObject)module0021.ONE_INTEGER), (SubLObject)module0021.ZERO_INTEGER);
        ConsesLow.rplaca(var111, var109);
        SubLObject var112;
        for (var112 = (SubLObject)module0021.NIL, var112 = var111.rest(); module0021.NIL != var112; var112 = var112.rest()) {
            ConsesLow.rplaca(var112, f1090(var3));
        }
        SubLObject var113 = (SubLObject)module0021.NIL;
        var113 = Functions.apply(Symbols.symbol_function((SubLObject)module0021.$ic132$), var111);
        return var113;
    }
    
    public static SubLObject f1134(final SubLObject var1, final SubLObject var3) {
        return f1135(var1, var3);
    }
    
    public static SubLObject f1135(final SubLObject var1, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = Numbers.integer_decode_float(var1);
        final SubLObject var6 = var4.secondMultipleValue();
        final SubLObject var7 = var4.thirdMultipleValue();
        var4.resetMultipleValues();
        if (var1.isNegative()) {
            f1086(module0021.$g772$.getGlobalValue(), var3);
        }
        else {
            f1086(module0021.$g771$.getGlobalValue(), var3);
        }
        f1117(var5, var3);
        f1117(var6, var3);
        return var1;
    }
    
    public static SubLObject f1136(final SubLObject var3) {
        return f1137(var3);
    }
    
    public static SubLObject f1138(final SubLObject var3) {
        return Numbers.minus(f1137(var3));
    }
    
    public static SubLObject f1137(final SubLObject var3) {
        final SubLObject var4 = f1090(var3);
        final SubLObject var5 = f1090(var3);
        return Numbers.scale_float(Numbers.sublisp_float(var4, (SubLObject)module0021.UNPROVIDED), var5);
    }
    
    public static SubLObject f1139(final SubLObject var1, final SubLObject var3) {
        if (module0021.NIL == var1) {
            return f1085(var3);
        }
        if (module0021.NIL != f1140(var1)) {
            return f1141(var1, var3);
        }
        if (var1.isKeyword()) {
            return f1142(var1, var3);
        }
        return f1143(var1, var3);
    }
    
    public static SubLObject f1142(final SubLObject var1, final SubLObject var3) {
        f1086(module0021.$g773$.getGlobalValue(), var3);
        f1144(Symbols.symbol_name(var1), var3);
        return var1;
    }
    
    public static SubLObject f1145(final SubLObject var3) {
        SubLObject var4 = f1090(var3);
        if (Characters.CHAR_colon.eql(Strings.sublisp_char(var4, (SubLObject)module0021.ZERO_INTEGER))) {
            var4 = Sequences.subseq(var4, (SubLObject)module0021.ONE_INTEGER, (SubLObject)module0021.UNPROVIDED);
        }
        return Symbols.make_keyword(var4);
    }
    
    public static SubLObject f1143(final SubLObject var1, final SubLObject var3) {
        f1086(module0021.$g774$.getGlobalValue(), var3);
        if (module0021.NIL == f1146(var1)) {
            final SubLObject var4 = Symbols.symbol_package(var1);
            f1038(var4, var3);
        }
        f1144(Symbols.symbol_name(var1), var3);
        return var1;
    }
    
    public static SubLObject f1146(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isSymbol() && !var1.isKeyword() && (module0018.$g577$.getGlobalValue().eql(Symbols.symbol_package(var1)) || var1.eql(Packages.find_symbol(Symbols.symbol_name(var1), module0018.$g577$.getGlobalValue()))));
    }
    
    public static SubLObject f1147(final SubLObject var3) {
        final SubLObject var4 = f1090(var3);
        if (var4.isString()) {
            final SubLObject var5 = var4;
            return Packages.intern(var5, module0018.$g577$.getGlobalValue());
        }
        final SubLObject var6 = var4;
        final SubLObject var7 = f1090(var3);
        if (module0021.NIL == var6) {
            return Symbols.make_symbol(var7);
        }
        return Packages.intern(var7, var6);
    }
    
    public static SubLObject f1085(final SubLObject var3) {
        f1086(module0021.$g775$.getGlobalValue(), var3);
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1148(final SubLObject var3) {
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1149(final SubLObject var129) {
        module0021.$g777$.setDynamicValue(Functions.apply(Symbols.symbol_function((SubLObject)module0021.$ic142$), var129));
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1150(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)module0021.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic143$);
        var18 = var17.first();
        final SubLObject var19;
        var17 = (var19 = var17.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0021.$ic23$, (SubLObject)module0021.$ic144$, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic145$, var18), ConsesLow.append(var19, (SubLObject)module0021.NIL));
    }
    
    public static SubLObject f1151(final SubLObject var129) {
        module0021.$g777$.setDynamicValue(var129);
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1152(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)module0021.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic143$);
        var18 = var17.first();
        final SubLObject var19;
        var17 = (var19 = var17.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0021.$ic23$, (SubLObject)module0021.$ic144$, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic146$, var18), ConsesLow.append(var19, (SubLObject)module0021.NIL));
    }
    
    public static SubLObject f1153() {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        if (module0021.$g777$.getDynamicValue(var28).isVector()) {
            return module0037.f2558(module0021.$g777$.getDynamicValue(var28), (SubLObject)module0021.UNPROVIDED);
        }
        return module0021.$g777$.getDynamicValue(var28);
    }
    
    public static SubLObject f1140(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0021.NIL != module0021.$g777$.getDynamicValue(var2) && var1.isSymbol() && module0021.NIL != Sequences.position(var1, module0021.$g777$.getDynamicValue(var2), Symbols.symbol_function((SubLObject)module0021.EQ), (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED));
    }
    
    public static SubLObject f1154(final SubLObject var134) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        return Sequences.position(var134, module0021.$g777$.getDynamicValue(var135), Symbols.symbol_function((SubLObject)module0021.EQ), (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
    }
    
    public static SubLObject f1155(final SubLObject var103) {
        final SubLThread var104 = SubLProcess.currentSubLThread();
        return module0021.$g777$.getDynamicValue(var104).isVector() ? Vectors.aref(module0021.$g777$.getDynamicValue(var104), var103) : ConsesLow.nth(var103, module0021.$g777$.getDynamicValue(var104));
    }
    
    public static SubLObject f1141(final SubLObject var134, final SubLObject var3) {
        final SubLObject var135 = f1154(var134);
        f1086(module0021.$g776$.getGlobalValue(), var3);
        f1117(var135, var3);
        return var134;
    }
    
    public static SubLObject f1156(final SubLObject var3) {
        final SubLObject var4 = f1090(var3);
        final SubLObject var5 = f1155(var4);
        if (module0021.NIL == var5) {
            Errors.cerror((SubLObject)module0021.$ic147$, (SubLObject)module0021.$ic148$, var4, (SubLObject)module0021.$ic149$);
        }
        return var5;
    }
    
    public static SubLObject f1157(final SubLObject var1, final SubLObject var3) {
        if (module0021.NIL != module0035.f2014(var1)) {
            return f1158(var1, var3);
        }
        return f1159(var1, var3);
    }
    
    public static SubLObject f1160(final SubLObject var135, final SubLObject var83, final SubLObject var84) {
        SubLObject var136 = conses_high.assoc(var135, module0021.$g778$.getGlobalValue(), (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
        if (module0021.NIL == var136) {
            var136 = (SubLObject)ConsesLow.make_list((SubLObject)module0021.THREE_INTEGER, var135);
            module0021.$g778$.setGlobalValue((SubLObject)ConsesLow.cons(var136, module0021.$g778$.getGlobalValue()));
        }
        ConsesLow.set_nth((SubLObject)module0021.ONE_INTEGER, var136, var83);
        ConsesLow.set_nth((SubLObject)module0021.TWO_INTEGER, var136, var84);
        return var135;
    }
    
    public static SubLObject f1161(final SubLObject var1, final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0021.NIL;
        if (module0021.NIL == var4) {
            SubLObject var5 = module0021.$g778$.getGlobalValue();
            SubLObject var6 = (SubLObject)module0021.NIL;
            var6 = var5.first();
            while (module0021.NIL == var4 && module0021.NIL != var5) {
                if (module0021.NIL != Functions.funcall(conses_high.second(var6), var1)) {
                    Functions.funcall(conses_high.third(var6), var1, var3);
                    var4 = (SubLObject)module0021.T;
                }
                var5 = var5.rest();
                var6 = var5.first();
            }
        }
        return var4;
    }
    
    public static SubLObject f1158(final SubLObject var137, final SubLObject var3) {
        final SubLObject var138 = conses_high.list_length(var137);
        if (module0021.NIL == var138) {
            Errors.cerror((SubLObject)module0021.$ic153$, (SubLObject)module0021.$ic154$);
            return f1085(var3);
        }
        if (var138.numE((SubLObject)module0021.ZERO_INTEGER)) {
            return f1085(var3);
        }
        if (module0021.NIL != module0021.$g778$.getGlobalValue() && module0021.NIL != f1161(var137, var3)) {
            return (SubLObject)module0021.NIL;
        }
        f1086(module0021.$g779$.getGlobalValue(), var3);
        f1117(var138, var3);
        SubLObject var139 = var137;
        SubLObject var140 = (SubLObject)module0021.NIL;
        var140 = var139.first();
        while (module0021.NIL != var139) {
            f1038(var140, var3);
            var139 = var139.rest();
            var140 = var139.first();
        }
        return var137;
    }
    
    public static SubLObject f1162(final SubLObject var3) {
        final SubLObject var4 = f1090(var3);
        SubLObject var5 = (SubLObject)module0021.NIL;
        SubLObject var6 = (SubLObject)module0021.NIL;
        var5 = (SubLObject)ConsesLow.make_list(var4, (SubLObject)module0021.UNPROVIDED);
        SubLObject var7;
        for (var7 = (SubLObject)module0021.NIL, var7 = var5; module0021.NIL != var7; var7 = var7.rest()) {
            var6 = f1090(var3);
            ConsesLow.rplaca(var7, var6);
        }
        return var5;
    }
    
    public static SubLObject f1159(final SubLObject var1, final SubLObject var3) {
        final SubLObject var4 = module0035.f2016(var1);
        f1086(module0021.$g780$.getGlobalValue(), var3);
        f1117(var4, var3);
        SubLObject var5;
        SubLObject var6;
        for (var5 = (SubLObject)module0021.NIL, var6 = (SubLObject)module0021.NIL, var5 = (SubLObject)module0021.ZERO_INTEGER, var6 = var1; !var5.numE(var4); var5 = Numbers.add(var5, (SubLObject)module0021.ONE_INTEGER), var6 = var6.rest()) {
            f1038(var6.first(), var3);
        }
        f1038(var6, var3);
        return var1;
    }
    
    public static SubLObject f1163(final SubLObject var3) {
        final SubLObject var4 = f1090(var3);
        SubLObject var5 = (SubLObject)module0021.NIL;
        if (var4.numE((SubLObject)module0021.ONE_INTEGER)) {
            var5 = (SubLObject)ConsesLow.cons((SubLObject)module0021.NIL, (SubLObject)module0021.NIL);
            ConsesLow.rplaca(var5, f1090(var3));
            ConsesLow.rplacd(var5, f1090(var3));
        }
        else {
            var5 = (SubLObject)ConsesLow.make_list(var4, (SubLObject)module0021.UNPROVIDED);
            SubLObject var6;
            for (var6 = (SubLObject)module0021.NIL, var6 = var5; module0021.NIL != var6.rest(); var6 = var6.rest()) {
                ConsesLow.rplaca(var6, f1090(var3));
            }
            ConsesLow.rplaca(var6, f1090(var3));
            ConsesLow.rplacd(var6, f1090(var3));
        }
        return var5;
    }
    
    public static SubLObject f1164(final SubLObject var1, final SubLObject var3) {
        if (module0021.NIL != module0037.f2581(var1)) {
            return f1165(var1, var3);
        }
        return f1166(var1, var3);
    }
    
    public static SubLObject f1166(final SubLObject var143, final SubLObject var3) {
        f1086(module0021.$g781$.getGlobalValue(), var3);
        final SubLObject var144 = Sequences.length(var143);
        f1117(var144, var3);
        SubLObject var145;
        for (var145 = (SubLObject)module0021.NIL, var145 = (SubLObject)module0021.ZERO_INTEGER; var145.numL(var144); var145 = Numbers.add(var145, (SubLObject)module0021.ONE_INTEGER)) {
            f1038(Vectors.aref(var143, var145), var3);
        }
        return var143;
    }
    
    public static SubLObject f1167(final SubLObject var3) {
        final SubLObject var4 = f1090(var3);
        SubLObject var5 = (SubLObject)module0021.NIL;
        var5 = Vectors.make_vector(var4, (SubLObject)module0021.UNPROVIDED);
        SubLObject var6;
        for (var6 = (SubLObject)module0021.NIL, var6 = (SubLObject)module0021.ZERO_INTEGER; var6.numL(var4); var6 = Numbers.add(var6, (SubLObject)module0021.ONE_INTEGER)) {
            Vectors.set_aref(var5, var6, f1090(var3));
        }
        return var5;
    }
    
    public static SubLObject f1165(final SubLObject var25, final SubLObject var3) {
        f1086(module0021.$g782$.getGlobalValue(), var3);
        final SubLObject var26 = Sequences.length(var25);
        f1117(var26, var3);
        SubLObject var27;
        for (var27 = (SubLObject)module0021.NIL, var27 = (SubLObject)module0021.ZERO_INTEGER; var27.numL(var26); var27 = Numbers.add(var27, (SubLObject)module0021.ONE_INTEGER)) {
            f1086(Vectors.aref(var25, var27), var3);
        }
        return var25;
    }
    
    public static SubLObject f1168(final SubLObject var3) {
        final SubLObject var4 = f1090(var3);
        SubLObject var5 = (SubLObject)module0021.NIL;
        var5 = Vectors.make_vector(var4, (SubLObject)module0021.UNPROVIDED);
        SubLObject var6;
        for (var6 = (SubLObject)module0021.NIL, var6 = (SubLObject)module0021.ZERO_INTEGER; var6.numL(var4); var6 = Numbers.add(var6, (SubLObject)module0021.ONE_INTEGER)) {
            Vectors.set_aref(var5, var6, f1092(var3));
        }
        return var5;
    }
    
    public static SubLObject f1169(final SubLObject var1, final SubLObject var3) {
        return f1144(var1, var3);
    }
    
    public static SubLObject f1144(final SubLObject var19, final SubLObject var3) {
        f1086(module0021.$g783$.getGlobalValue(), var3);
        final SubLObject var20 = Sequences.length(var19);
        f1117(var20, var3);
        if (module0021.NIL != f1019(var3)) {
            SubLObject var21;
            for (var21 = (SubLObject)module0021.NIL, var21 = (SubLObject)module0021.ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)module0021.ONE_INTEGER)) {
                f1086(Characters.char_code(Strings.sublisp_char(var19, var21)), var3);
            }
            return var19;
        }
        if (module0021.NIL != f1064(var3)) {
            f1073(var20, var3);
            return var19;
        }
        return streams_high.write_string_to_byte_sequence(var19, var3, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
    }
    
    public static SubLObject f1170(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f1090(var3);
        SubLObject var6 = (SubLObject)module0021.NIL;
        if (module0021.$g784$.getDynamicValue(var4).isString() && var5.numE(Sequences.length(module0021.$g784$.getDynamicValue(var4)))) {
            var6 = module0021.$g784$.getDynamicValue(var4);
        }
        else {
            var6 = Strings.make_string(var5, (SubLObject)module0021.UNPROVIDED);
        }
        if (module0021.NIL == f1043(var3)) {
            return streams_high.read_byte_sequence_into_string(var6, var3, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
        }
        SubLObject var7;
        for (var7 = (SubLObject)module0021.NIL, var7 = (SubLObject)module0021.ZERO_INTEGER; var7.numL(var5); var7 = Numbers.add(var7, (SubLObject)module0021.ONE_INTEGER)) {
            Strings.set_char(var6, var7, Characters.code_char(f1092(var3)));
        }
        return var6;
    }
    
    public static SubLObject f1171(final SubLObject var1, final SubLObject var3) {
        return f1172(var1, var3);
    }
    
    public static SubLObject f1172(final SubLObject var1, final SubLObject var3) {
        f1086(module0021.$g785$.getGlobalValue(), var3);
        f1086(Characters.char_code(var1), var3);
        return var1;
    }
    
    public static SubLObject f1173(final SubLObject var3) {
        return Characters.code_char(f1092(var3));
    }
    
    public static SubLObject f1174(final SubLObject var1, final SubLObject var3) {
        return f1175(var1, var3);
    }
    
    public static SubLObject f1175(final SubLObject var1, final SubLObject var3) {
        f1086(module0021.$g786$.getGlobalValue(), var3);
        final SubLObject var4 = module0030.f1592(Hashtables.hash_table_test(var1));
        final SubLObject var5 = Hashtables.hash_table_count(var1);
        f1038(var4, var3);
        f1117(var5, var3);
        SubLObject var6 = (SubLObject)module0021.NIL;
        SubLObject var7 = (SubLObject)module0021.NIL;
        final Iterator var8 = Hashtables.getEntrySetIterator(var1);
        try {
            while (Hashtables.iteratorHasNext(var8)) {
                final Map.Entry var9 = Hashtables.iteratorNextEntry(var8);
                var6 = Hashtables.getEntryKey(var9);
                var7 = Hashtables.getEntryValue(var9);
                f1038(var6, var3);
                f1038(var7, var3);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var8);
        }
        return var1;
    }
    
    public static SubLObject f1176(final SubLObject var3) {
        SubLObject var4 = f1090(var3);
        final SubLObject var5 = f1090(var3);
        SubLObject var6 = (SubLObject)module0021.NIL;
        final SubLObject var7 = var4;
        if (var7.eql((SubLObject)module0021.EQ) || var7.eql((SubLObject)module0021.EQL) || var7.eql((SubLObject)module0021.EQUAL) || var7.eql((SubLObject)module0021.EQUALP)) {
            var4 = Symbols.symbol_function(var4);
        }
        var6 = Hashtables.make_hash_table(var5, var4, (SubLObject)module0021.UNPROVIDED);
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var8 = (SubLObject)module0021.NIL, var8 = (SubLObject)module0021.ZERO_INTEGER; var8.numL(var5); var8 = Numbers.add(var8, (SubLObject)module0021.ONE_INTEGER)) {
            var9 = f1090(var3);
            var10 = f1090(var3);
            Hashtables.sethash(var9, var6, var10);
        }
        return var6;
    }
    
    public static SubLObject f1177(final SubLObject var1, final SubLObject var3) {
        return f1178(var1, var3);
    }
    
    public static SubLObject f1178(final SubLObject var149, final SubLObject var3) {
        final SubLThread var150 = SubLProcess.currentSubLThread();
        if (module0021.NIL == module0021.$g743$.getDynamicValue(var150)) {
            return f1179(var149, var3);
        }
        f1086(module0021.$g787$.getGlobalValue(), var3);
        final SubLObject var151 = Guids.disassemble_guid_to_fixnums(var149, (SubLObject)module0021.UNPROVIDED);
        SubLObject var152;
        for (var152 = (SubLObject)module0021.NIL, var152 = (SubLObject)module0021.ZERO_INTEGER; var152.numL((SubLObject)module0021.SIXTEEN_INTEGER); var152 = Numbers.add(var152, (SubLObject)module0021.ONE_INTEGER)) {
            f1086(Vectors.aref(var151, var152), var3);
        }
        return var149;
    }
    
    public static SubLObject f1180(final SubLObject var3) {
        final SubLObject var4 = f1181(var3);
        SubLObject var5 = (SubLObject)module0021.NIL;
        var5 = Guids.assemble_fixnums_to_guid(var4);
        return var5;
    }
    
    public static SubLObject f1181(final SubLObject var3) {
        final SubLObject var4 = Vectors.make_vector((SubLObject)module0021.SIXTEEN_INTEGER, (SubLObject)module0021.NIL);
        SubLObject var5;
        for (var5 = (SubLObject)module0021.NIL, var5 = (SubLObject)module0021.ZERO_INTEGER; var5.numL((SubLObject)module0021.SIXTEEN_INTEGER); var5 = Numbers.add(var5, (SubLObject)module0021.ONE_INTEGER)) {
            Vectors.set_aref(var4, var5, f1092(var3));
        }
        return var4;
    }
    
    public static SubLObject f1179(final SubLObject var149, final SubLObject var3) {
        f1086(module0021.$g788$.getGlobalValue(), var3);
        final SubLObject var150 = Guids.guid_to_string(var149);
        f1144(var150, var3);
        return var149;
    }
    
    public static SubLObject f1182(final SubLObject var3) {
        final SubLObject var4 = f1183(var3);
        SubLObject var5 = (SubLObject)module0021.NIL;
        var5 = Guids.string_to_guid(var4);
        return var5;
    }
    
    public static SubLObject f1183(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0021.NIL;
        final SubLObject var6 = module0021.$g784$.currentBinding(var4);
        try {
            module0021.$g784$.bind(module0021.$g789$.getDynamicValue(var4), var4);
            var5 = f1060(var3, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
        }
        finally {
            module0021.$g784$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f1184() {
        return Strings.make_string((SubLObject)module0021.$ic171$, (SubLObject)module0021.UNPROVIDED);
    }
    
    public static SubLObject f1185(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = var14.rest();
        final SubLObject var18;
        final SubLObject var17 = var18 = var16;
        return (SubLObject)ConsesLow.listS((SubLObject)module0021.$ic23$, (SubLObject)module0021.$ic172$, ConsesLow.append(var18, (SubLObject)module0021.NIL));
    }
    
    public static SubLObject f1186(final SubLObject var3) {
        final SubLObject var4 = f1090(var3);
        final SubLObject var5 = f1090(var3);
        final SubLObject var6 = f1090(var3);
        final SubLObject var7 = f1090(var3);
        final SubLObject var8 = Vectors.make_vector(var5, (SubLObject)module0021.UNPROVIDED);
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var9 = (SubLObject)module0021.NIL, var9 = (SubLObject)module0021.ZERO_INTEGER; var9.numL(var5); var9 = Numbers.add(var9, (SubLObject)module0021.ONE_INTEGER)) {
            var10 = Vectors.make_vector(var6, (SubLObject)module0021.UNPROVIDED);
            for (var11 = (SubLObject)module0021.NIL, var11 = (SubLObject)module0021.ZERO_INTEGER; var11.numL(var6); var11 = Numbers.add(var11, (SubLObject)module0021.ONE_INTEGER)) {
                Vectors.set_aref(var10, var11, f1090(var3));
            }
            Vectors.set_aref(var8, var9, var10);
        }
        return module0099.f7163(var7, var8, var4);
    }
    
    public static SubLObject f1187(final SubLObject var1, final SubLObject var3) {
        return f1188(var1, var3);
    }
    
    public static SubLObject f1188(final SubLObject var127, final SubLObject var3) {
        f1086(module0021.$g791$.getGlobalValue(), var3);
        f1144(Packages.package_name(var127), var3);
        return var127;
    }
    
    public static SubLObject f1189(final SubLObject var3) {
        final SubLObject var4 = f1090(var3);
        return Packages.find_package(var4);
    }
    
    public static SubLObject f1109(final SubLObject var65) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0021.NIL != module0004.f106(var65) && var65.numL(module0021.$g751$.getGlobalValue()));
    }
    
    public static SubLObject f1190(final SubLObject var160) {
        final SubLObject var161 = Hashtables.gethash(var160, module0021.$g794$.getGlobalValue(), (SubLObject)module0021.$ic181$);
        if (module0021.$ic181$ != var161) {
            return var161;
        }
        if (module0021.NIL != f1109(var160)) {
            return f1095(var160);
        }
        return (SubLObject)module0021.$ic85$;
    }
    
    public static SubLObject f1191(final SubLObject var3) {
        final SubLObject var4 = f1060(var3, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
        final SubLObject var5 = f1190(var4);
        return Functions.funcall(var5, var3);
    }
    
    public static SubLObject f1192(final SubLObject var14, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var18;
        final SubLObject var17 = var18 = var14.rest();
        SubLObject var19 = (SubLObject)module0021.NIL;
        SubLObject var20 = (SubLObject)module0021.NIL;
        SubLObject var21 = (SubLObject)module0021.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0021.$ic182$);
        var19 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0021.$ic182$);
        var20 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0021.$ic182$);
        var21 = var18.first();
        var18 = var18.rest();
        if (module0021.NIL != var18) {
            cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0021.$ic182$);
            return (SubLObject)module0021.NIL;
        }
        assert module0021.NIL != Types.symbolp(var19) : var19;
        assert module0021.NIL != Types.integerp(var20) : var20;
        assert module0021.NIL != Types.symbolp(var21) : var21;
        if (module0021.NIL == Errors.$ignore_mustsP$.getDynamicValue(var16) && !var20.numGE(module0021.$g793$.getGlobalValue())) {
            Errors.error((SubLObject)module0021.$ic183$, var20);
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0021.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic91$, var19, var20), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic184$, var19, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic93$, var21)));
    }
    
    public static SubLObject f1193(final SubLObject var166, final SubLObject var72) {
        Hashtables.sethash(var166, module0021.$g794$.getGlobalValue(), var72);
        return var72;
    }
    
    public static SubLObject f1110(final SubLObject var166, final SubLObject var3) {
        f1107(module0021.$g792$.getGlobalValue(), var3);
        f1038(var166, var3);
        return var166;
    }
    
    public static SubLObject f1194(final SubLObject var3) {
        Errors.error((SubLObject)module0021.$ic188$);
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1195(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)module0021.NIL;
        SubLObject var19 = (SubLObject)module0021.NIL;
        SubLObject var20 = (SubLObject)module0021.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic193$);
        var18 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic193$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic193$);
        var20 = var17.first();
        var17 = var17.rest();
        if (module0021.NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0021.$ic193$);
            return (SubLObject)module0021.NIL;
        }
        assert module0021.NIL != Types.symbolp(var18) : var18;
        assert module0021.NIL != Guids.guid_p(var19) : var19;
        assert module0021.NIL != Types.symbolp(var20) : var20;
        return (SubLObject)ConsesLow.list((SubLObject)module0021.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic195$, var18, var19), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic196$, var18, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic93$, var20)));
    }
    
    public static SubLObject f1196(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)module0021.NIL;
        SubLObject var19 = (SubLObject)module0021.NIL;
        SubLObject var20 = (SubLObject)module0021.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic197$);
        var18 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic197$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic197$);
        var20 = var17.first();
        var17 = var17.rest();
        if (module0021.NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0021.$ic197$);
            return (SubLObject)module0021.NIL;
        }
        assert module0021.NIL != Types.symbolp(var18) : var18;
        assert module0021.NIL != Guids.guid_string_p(var19) : var19;
        assert module0021.NIL != Types.symbolp(var20) : var20;
        return (SubLObject)ConsesLow.list((SubLObject)module0021.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic195$, var18, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic199$, var19)), (SubLObject)ConsesLow.list((SubLObject)module0021.$ic196$, var18, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic93$, var20)));
    }
    
    public static SubLObject f1197(final SubLObject var169, final SubLObject var72) {
        Hashtables.sethash(var169, module0021.$g797$.getGlobalValue(), var72);
        return var72;
    }
    
    public static SubLObject f1198(final SubLObject var3, final SubLObject var149) {
        f1086(module0021.$g796$.getGlobalValue(), var3);
        return f1038(var149, var3);
    }
    
    public static SubLObject f1199(final SubLObject var173) {
        return Hashtables.gethash(var173, module0021.$g797$.getGlobalValue(), (SubLObject)module0021.UNPROVIDED);
    }
    
    public static SubLObject f1200(final SubLObject var3) {
        final SubLObject var4 = f1060(var3, (SubLObject)module0021.UNPROVIDED, (SubLObject)module0021.UNPROVIDED);
        final SubLObject var5 = Functions.funcall(f1199(var4), var3);
        return var5;
    }
    
    public static SubLObject f1201(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic201$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)module0021.NIL;
        SubLObject var20 = (SubLObject)module0021.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic201$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0021.$ic201$);
        var20 = var17.first();
        var17 = var17.rest();
        if (module0021.NIL == var17) {
            final SubLObject var21;
            var17 = (var21 = var18);
            return (SubLObject)ConsesLow.listS((SubLObject)module0021.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0021.$ic202$, var20, var19), ConsesLow.append(var21, (SubLObject)module0021.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0021.$ic201$);
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1202(final SubLObject var1) {
        final SubLObject var2 = f1059(f1037(var1));
        return Values.values(var2, Equality.equalp(var2, var1));
    }
    
    public static SubLObject f1203(final SubLObject var1) {
        final SubLObject var2 = f1059(f1039(var1));
        return Values.values(var2, Equality.equalp(var2, var1));
    }
    
    public static SubLObject f1204(final SubLObject var178, SubLObject var3) {
        if (var3 == module0021.UNPROVIDED) {
            var3 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var179 = SubLProcess.currentSubLThread();
        SubLObject var179_180 = (SubLObject)module0021.NIL;
        try {
            final SubLObject var180 = stream_macros.$stream_requires_locking$.currentBinding(var179);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0021.NIL, var179);
                var179_180 = compatibility.open_binary(var178, (SubLObject)module0021.$ic203$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var180, var179);
            }
            if (!var179_180.isStream()) {
                Errors.error((SubLObject)module0021.$ic204$, var178);
            }
            SubLObject var181;
            SubLObject var182;
            for (var181 = var179_180, var182 = (SubLObject)module0021.NIL, var182 = f1060(var181, (SubLObject)module0021.NIL, (SubLObject)module0021.$ic61$); var182 != module0021.$ic61$; var182 = f1060(var181, (SubLObject)module0021.NIL, (SubLObject)module0021.$ic61$)) {
                print_high.print(var182, var3);
            }
        }
        finally {
            final SubLObject var183 = Threads.$is_thread_performing_cleanupP$.currentBinding(var179);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0021.T, var179);
                if (var179_180.isStream()) {
                    streams_high.close(var179_180, (SubLObject)module0021.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var183, var179);
            }
        }
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1205() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1017", "S#2038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1018", "S#2039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1020", "S#2040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1019", "S#2003", 1, 0, false);
        new $f1019$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1021", "S#2041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1022", "S#2042", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1023", "S#2043", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1024", "S#2044", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1025", "S#2045", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1026", "S#2046", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1027", "S#2047", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1028", "S#2048");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1029", "S#2049", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1030", "S#2050");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1031", "S#2051", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1032", "S#2052", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1033", "S#2053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1034", "S#2054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1035", "S#2055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1036", "S#2056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1037", "S#2057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1039", "S#2058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1041", "S#2059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1042", "S#2060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1044", "S#2061", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1043", "S#2007", 1, 0, false);
        new $f1043$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1045", "S#2062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1046", "S#2063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1047", "S#2064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1048", "S#2065", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1049", "S#2066", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1050", "S#2067", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1051", "S#2068", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1052", "S#2069");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1053", "S#2070", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1054", "S#2071");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1055", "S#2072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1056", "S#2073", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1057", "S#2074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1058", "S#2075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1059", "S#2076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1061", "S#2077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1062", "S#2078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1063", "S#2079", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1064", "S#2011", 1, 0, false);
        new $f1064$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1065", "S#2080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1066", "S#2081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1067", "S#2082", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1068", "S#2083", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1069", "S#2084", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1070", "S#2085");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1071", "S#2086", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1072", "S#2087", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1073", "S#2088", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1074", "S#2089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1075", "S#2090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1076", "S#2091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1077", "S#2092", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1078", "S#2093");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1038", "S#2094", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1040", "S#2095", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1081", "S#2096", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1079", "S#2097", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1084", "S#2098", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1086", "S#2099", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1060", "S#2100", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1088", "S#2101", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1090", "S#2102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1091", "S#2103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1087", "S#2104", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1089", "S#2105", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1095", "S#2106", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1097", "S#2107");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1098", "S#2108", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1096", "S#2109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1092", "S#2110", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1099", "S#2111");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1100", "S#2112");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1101", "S#2113");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1102", "S#2114", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1103", "S#2115");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1104", "S#2116", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1105", "S#2117");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1106", "S#2118", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1082", "S#2119", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1107", "S#2120", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1108", "S#2121", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1080", "S#2122", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1111", "S#2123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1083", "S#2124", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1112", "S#2125", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1113", "S#2126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1114", "S#2127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1115", "S#2128", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1093", "S#2129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1094", "S#2130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1116", "S#2131", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1117", "S#2132", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1118", "S#2133", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1119", "S#2134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1121", "S#2015", 1, 0, false);
        new $f1121$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1122", "S#2016", 1, 0, false);
        new $f1122$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1123", "S#2135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1124", "S#2017", 1, 0, false);
        new $f1124$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1125", "S#2018", 1, 0, false);
        new $f1125$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1126", "S#2019", 1, 0, false);
        new $f1126$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1127", "S#2136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1128", "S#2137", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1129", "S#2138", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1130", "S#2139", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1120", "S#2140", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1131", "S#2020", 1, 0, false);
        new $f1131$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1133", "S#2141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1132", "S#2142", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1134", "S#2143", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1135", "S#2144", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1136", "S#2021", 1, 0, false);
        new $f1136$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1138", "S#2022", 1, 0, false);
        new $f1138$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1137", "S#2145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1139", "S#2146", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1142", "S#2147", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1145", "S#2023", 1, 0, false);
        new $f1145$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1143", "S#2148", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1146", "S#2149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1147", "S#2024", 1, 0, false);
        new $f1147$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1085", "S#2150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1148", "S#2025", 1, 0, false);
        new $f1148$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1149", "S#2151", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1150", "S#2152");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1151", "S#2153", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1152", "S#2154");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1153", "S#2155", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1140", "S#2156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1154", "S#2157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1155", "S#2158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1141", "S#2159", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1156", "S#2027", 1, 0, false);
        new $f1156$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1157", "S#2160", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1160", "S#2161", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1161", "S#2162", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1158", "S#2163", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1162", "S#2029", 1, 0, false);
        new $f1162$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1159", "S#2164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1163", "S#2031", 1, 0, false);
        new $f1163$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1164", "S#2165", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1166", "S#2166", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1167", "S#2032", 1, 0, false);
        new $f1167$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1165", "S#2167", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1168", "S#2168", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1169", "S#2169", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1144", "S#2170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1170", "S#2033", 1, 0, false);
        new $f1170$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1171", "S#2171", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1172", "S#2172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1173", "S#2034", 1, 0, false);
        new $f1173$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1174", "S#2173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1175", "S#2174", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1176", "S#2175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1177", "S#2176", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1178", "S#2177", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1180", "S#2036", 1, 0, false);
        new $f1180$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1181", "S#2178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1179", "S#2179", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1182", "S#2180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1183", "S#2181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1184", "S#2182", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1185", "S#2183");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1186", "S#2184", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1187", "S#2185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1188", "S#2186", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1189", "S#2187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1109", "S#2188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1190", "S#2189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1191", "S#2190", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1192", "S#2191");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1193", "S#2192", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1110", "S#2193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1194", "S#2194", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1195", "S#2195");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1196", "S#2196");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1197", "S#2197", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1198", "S#2198", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1199", "S#2199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1200", "S#2200", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0021", "f1201", "S#2201");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1202", "S#2202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1203", "S#2203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0021", "f1204", "S#2204", 1, 1, false);
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1206() {
        module0021.$g742$ = SubLFiles.defconstant("S#2205", (SubLObject)module0021.$ic0$);
        module0021.$g743$ = SubLFiles.defparameter("S#2206", (SubLObject)module0021.NIL);
        module0021.$g744$ = SubLFiles.defparameter("S#2207", (SubLObject)module0021.$ic38$);
        module0021.$g745$ = SubLFiles.defconstant("S#2208", (SubLObject)module0021.$ic39$);
        module0021.$g746$ = SubLFiles.defconstant("S#2209", (SubLObject)module0021.$ic62$);
        module0021.$g747$ = SubLFiles.defparameter("S#2210", (SubLObject)module0021.NIL);
        module0021.$g748$ = SubLFiles.defparameter("S#2211", (SubLObject)module0021.NIL);
        module0021.$g749$ = SubLFiles.deflexical("S#2212", Vectors.make_vector((SubLObject)module0021.$ic79$, (SubLObject)module0021.NIL));
        module0021.$g750$ = SubLFiles.defparameter("S#2213", (SubLObject)module0021.NIL);
        module0021.$g751$ = SubLFiles.defconstant("S#2214", (SubLObject)module0021.$ic87$);
        module0021.$g752$ = SubLFiles.deflexical("S#2215", (module0021.NIL != Symbols.boundp((SubLObject)module0021.$ic88$)) ? module0021.$g752$.getGlobalValue() : Vectors.make_vector(module0021.$g751$.getGlobalValue(), (SubLObject)module0021.$ic85$));
        module0021.$g753$ = SubLFiles.defparameter("S#2216", (SubLObject)module0021.NIL);
        module0021.$g754$ = SubLFiles.defparameter("S#2217", (SubLObject)module0021.T);
        module0021.$g755$ = SubLFiles.deflexical("S#2218", (SubLObject)((module0021.NIL != Symbols.boundp((SubLObject)module0021.$ic102$)) ? module0021.$g755$.getGlobalValue() : module0021.NIL));
        module0021.$g756$ = SubLFiles.defconstant("S#2219", (SubLObject)module0021.$ic106$);
        module0021.$g757$ = SubLFiles.defparameter("S#2220", (SubLObject)module0021.NIL);
        module0021.$g758$ = SubLFiles.defconstant("S#2221", (SubLObject)module0021.$ic108$);
        module0021.$g759$ = SubLFiles.defconstant("S#2222", module0021.$g751$.getGlobalValue());
        module0021.$g760$ = SubLFiles.defconstant("S#2223", Numbers.subtract((SubLObject)module0021.$ic79$, module0021.$g759$.getGlobalValue()));
        module0021.$g761$ = SubLFiles.defconstant("S#2224", (SubLObject)module0021.ZERO_INTEGER);
        module0021.$g762$ = SubLFiles.defconstant("S#2225", (SubLObject)module0021.ONE_INTEGER);
        module0021.$g763$ = SubLFiles.defconstant("S#2226", (SubLObject)module0021.TWO_INTEGER);
        module0021.$g764$ = SubLFiles.defconstant("S#2227", (SubLObject)module0021.THREE_INTEGER);
        module0021.$g765$ = SubLFiles.defconstant("S#2228", (SubLObject)module0021.FOUR_INTEGER);
        module0021.$g766$ = SubLFiles.defconstant("S#2229", (SubLObject)module0021.FIVE_INTEGER);
        module0021.$g767$ = SubLFiles.defconstant("S#2230", (SubLObject)module0021.SIX_INTEGER);
        module0021.$g768$ = SubLFiles.defconstant("S#2231", (SubLObject)module0021.SEVEN_INTEGER);
        module0021.$g769$ = SubLFiles.defconstant("S#2232", (SubLObject)module0021.$ic121$);
        module0021.$g770$ = SubLFiles.defconstant("S#2233", (SubLObject)module0021.$ic123$);
        module0021.$g771$ = SubLFiles.defconstant("S#2234", (SubLObject)module0021.EIGHT_INTEGER);
        module0021.$g772$ = SubLFiles.defconstant("S#2235", (SubLObject)module0021.NINE_INTEGER);
        module0021.$g773$ = SubLFiles.defconstant("S#2236", (SubLObject)module0021.TEN_INTEGER);
        module0021.$g774$ = SubLFiles.defconstant("S#2237", (SubLObject)module0021.ELEVEN_INTEGER);
        module0021.$g775$ = SubLFiles.defconstant("S#2238", (SubLObject)module0021.TWELVE_INTEGER);
        module0021.$g776$ = SubLFiles.defconstant("S#2239", (SubLObject)module0021.$ic140$);
        module0021.$g777$ = SubLFiles.defparameter("S#2240", (SubLObject)module0021.NIL);
        module0021.$g778$ = SubLFiles.deflexical("S#2241", (SubLObject)((module0021.NIL != Symbols.boundp((SubLObject)module0021.$ic151$)) ? module0021.$g778$.getGlobalValue() : module0021.NIL));
        module0021.$g779$ = SubLFiles.defconstant("S#2242", (SubLObject)module0021.THIRTEEN_INTEGER);
        module0021.$g780$ = SubLFiles.defconstant("S#2243", (SubLObject)module0021.SEVENTEEN_INTEGER);
        module0021.$g781$ = SubLFiles.defconstant("S#2244", (SubLObject)module0021.FOURTEEN_INTEGER);
        module0021.$g782$ = SubLFiles.defconstant("S#2245", (SubLObject)module0021.$ic158$);
        module0021.$g783$ = SubLFiles.defconstant("S#2246", (SubLObject)module0021.FIFTEEN_INTEGER);
        module0021.$g784$ = SubLFiles.defparameter("S#2247", (SubLObject)module0021.NIL);
        module0021.$g785$ = SubLFiles.defconstant("S#2248", (SubLObject)module0021.SIXTEEN_INTEGER);
        module0021.$g786$ = SubLFiles.defconstant("S#2249", (SubLObject)module0021.EIGHTEEN_INTEGER);
        module0021.$g787$ = SubLFiles.defconstant("S#2250", (SubLObject)module0021.$ic166$);
        module0021.$g788$ = SubLFiles.defconstant("S#2251", (SubLObject)module0021.$ic169$);
        module0021.$g789$ = SubLFiles.defparameter("S#2252", (SubLObject)module0021.NIL);
        module0021.$g790$ = SubLFiles.defconstant("S#2253", (SubLObject)module0021.$ic173$);
        module0021.$g791$ = SubLFiles.defconstant("S#2254", (SubLObject)module0021.$ic175$);
        module0021.$g792$ = SubLFiles.defconstant("S#2255", (SubLObject)module0021.$ic178$);
        module0021.$g793$ = SubLFiles.defconstant("S#2256", module0021.$g751$.getGlobalValue());
        module0021.$g794$ = SubLFiles.deflexical("S#2257", (module0021.NIL != Symbols.boundp((SubLObject)module0021.$ic180$)) ? module0021.$g794$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0021.$ic131$, Symbols.symbol_function((SubLObject)module0021.EQL), (SubLObject)module0021.UNPROVIDED));
        module0021.$g795$ = SubLFiles.defconstant("S#2258", (SubLObject)module0021.$ic186$);
        module0021.$g796$ = SubLFiles.defconstant("S#2259", (SubLObject)module0021.$ic189$);
        module0021.$g797$ = SubLFiles.deflexical("S#2260", (module0021.NIL != Symbols.boundp((SubLObject)module0021.$ic191$)) ? module0021.$g797$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0021.$ic192$, Symbols.symbol_function((SubLObject)module0021.EQUALP), (SubLObject)module0021.UNPROVIDED));
        return (SubLObject)module0021.NIL;
    }
    
    public static SubLObject f1207() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0021.$g742$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0021.$ic8$);
        Structures.def_csetf((SubLObject)module0021.$ic9$, (SubLObject)module0021.$ic10$);
        Structures.def_csetf((SubLObject)module0021.$ic11$, (SubLObject)module0021.$ic12$);
        Equality.identity((SubLObject)module0021.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0021.$g742$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic20$));
        module0002.f50((SubLObject)module0021.$ic28$, (SubLObject)module0021.$ic30$);
        module0002.f50((SubLObject)module0021.$ic33$, (SubLObject)module0021.$ic34$);
        module0002.f50((SubLObject)module0021.$ic35$, (SubLObject)module0021.$ic34$);
        module0002.f50((SubLObject)module0021.$ic32$, (SubLObject)module0021.$ic34$);
        module0002.f50((SubLObject)module0021.$ic29$, (SubLObject)module0021.$ic34$);
        module0002.f50((SubLObject)module0021.$ic36$, (SubLObject)module0021.$ic30$);
        module0002.f50((SubLObject)module0021.$ic37$, (SubLObject)module0021.$ic30$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0021.$g745$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic45$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0021.$ic46$);
        Structures.def_csetf((SubLObject)module0021.$ic47$, (SubLObject)module0021.$ic48$);
        Structures.def_csetf((SubLObject)module0021.$ic49$, (SubLObject)module0021.$ic50$);
        Equality.identity((SubLObject)module0021.$ic39$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0021.$g745$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic53$));
        module0002.f50((SubLObject)module0021.$ic54$, (SubLObject)module0021.$ic56$);
        module0002.f50((SubLObject)module0021.$ic57$, (SubLObject)module0021.$ic58$);
        module0002.f50((SubLObject)module0021.$ic60$, (SubLObject)module0021.$ic58$);
        module0002.f50((SubLObject)module0021.$ic55$, (SubLObject)module0021.$ic58$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0021.$g746$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic68$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0021.$ic69$);
        Structures.def_csetf((SubLObject)module0021.$ic70$, (SubLObject)module0021.$ic71$);
        Equality.identity((SubLObject)module0021.$ic62$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0021.$g746$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic73$));
        module0003.f57((SubLObject)module0021.$ic88$);
        module0002.f50((SubLObject)module0021.$ic92$, (SubLObject)module0021.$ic94$);
        module0003.f57((SubLObject)module0021.$ic102$);
        module0002.f50((SubLObject)module0021.$ic104$, (SubLObject)module0021.$ic105$);
        f1098(module0021.$g756$.getGlobalValue(), (SubLObject)module0021.$ic107$);
        f1098(module0021.$g758$.getGlobalValue(), (SubLObject)module0021.$ic109$);
        f1098(module0021.$g761$.getGlobalValue(), (SubLObject)module0021.$ic113$);
        f1098(module0021.$g762$.getGlobalValue(), (SubLObject)module0021.$ic114$);
        f1098(module0021.$g763$.getGlobalValue(), (SubLObject)module0021.$ic115$);
        f1098(module0021.$g764$.getGlobalValue(), (SubLObject)module0021.$ic116$);
        f1098(module0021.$g765$.getGlobalValue(), (SubLObject)module0021.$ic117$);
        f1098(module0021.$g766$.getGlobalValue(), (SubLObject)module0021.$ic118$);
        f1098(module0021.$g767$.getGlobalValue(), (SubLObject)module0021.$ic119$);
        f1098(module0021.$g768$.getGlobalValue(), (SubLObject)module0021.$ic120$);
        f1098(module0021.$g769$.getGlobalValue(), (SubLObject)module0021.$ic122$);
        f1098(module0021.$g770$.getGlobalValue(), (SubLObject)module0021.$ic124$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), Types.$dtp_bignum$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic125$));
        Structures.register_method(module0021.$g749$.getGlobalValue(), Types.$dtp_fixnum$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic125$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0021.$ic130$);
        f1098(module0021.$g771$.getGlobalValue(), (SubLObject)module0021.$ic133$);
        f1098(module0021.$g772$.getGlobalValue(), (SubLObject)module0021.$ic134$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), Types.$dtp_float$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic135$));
        Structures.register_method(module0021.$g749$.getGlobalValue(), Types.$dtp_symbol$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic136$));
        f1098(module0021.$g773$.getGlobalValue(), (SubLObject)module0021.$ic137$);
        f1098(module0021.$g774$.getGlobalValue(), (SubLObject)module0021.$ic138$);
        f1098(module0021.$g775$.getGlobalValue(), (SubLObject)module0021.$ic139$);
        f1098(module0021.$g776$.getGlobalValue(), (SubLObject)module0021.$ic141$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic150$));
        module0003.f57((SubLObject)module0021.$ic151$);
        f1098(module0021.$g779$.getGlobalValue(), (SubLObject)module0021.$ic152$);
        f1098(module0021.$g780$.getGlobalValue(), (SubLObject)module0021.$ic155$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), Types.$dtp_vector$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic156$));
        f1098(module0021.$g781$.getGlobalValue(), (SubLObject)module0021.$ic157$);
        f1098(module0021.$g782$.getGlobalValue(), (SubLObject)module0021.$ic159$);
        f1098(module0021.$g783$.getGlobalValue(), (SubLObject)module0021.$ic160$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), Types.$dtp_string$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic161$));
        f1098(module0021.$g785$.getGlobalValue(), (SubLObject)module0021.$ic162$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), Types.$dtp_character$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic163$));
        f1098(module0021.$g786$.getGlobalValue(), (SubLObject)module0021.$ic164$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic165$));
        f1098(module0021.$g787$.getGlobalValue(), (SubLObject)module0021.$ic167$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), Guids.$dtp_guid$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic168$));
        f1098(module0021.$g788$.getGlobalValue(), (SubLObject)module0021.$ic170$);
        f1098(module0021.$g790$.getGlobalValue(), (SubLObject)module0021.$ic174$);
        f1098(module0021.$g791$.getGlobalValue(), (SubLObject)module0021.$ic176$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), Types.$dtp_package$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0021.$ic177$));
        f1098(module0021.$g792$.getGlobalValue(), (SubLObject)module0021.$ic179$);
        module0003.f57((SubLObject)module0021.$ic180$);
        module0002.f50((SubLObject)module0021.$ic184$, (SubLObject)module0021.$ic185$);
        f1098(module0021.$g795$.getGlobalValue(), (SubLObject)module0021.$ic187$);
        f1098(module0021.$g796$.getGlobalValue(), (SubLObject)module0021.$ic190$);
        module0003.f57((SubLObject)module0021.$ic191$);
        module0002.f50((SubLObject)module0021.$ic196$, (SubLObject)module0021.$ic200$);
        return (SubLObject)module0021.NIL;
    }
    
    public void declareFunctions() {
        f1205();
    }
    
    public void initializeVariables() {
        f1206();
    }
    
    public void runTopLevelForms() {
        f1207();
    }
    
    static {
        me = (SubLFile)new module0021();
        module0021.$g742$ = null;
        module0021.$g743$ = null;
        module0021.$g744$ = null;
        module0021.$g745$ = null;
        module0021.$g746$ = null;
        module0021.$g747$ = null;
        module0021.$g748$ = null;
        module0021.$g749$ = null;
        module0021.$g750$ = null;
        module0021.$g751$ = null;
        module0021.$g752$ = null;
        module0021.$g753$ = null;
        module0021.$g754$ = null;
        module0021.$g755$ = null;
        module0021.$g756$ = null;
        module0021.$g757$ = null;
        module0021.$g758$ = null;
        module0021.$g759$ = null;
        module0021.$g760$ = null;
        module0021.$g761$ = null;
        module0021.$g762$ = null;
        module0021.$g763$ = null;
        module0021.$g764$ = null;
        module0021.$g765$ = null;
        module0021.$g766$ = null;
        module0021.$g767$ = null;
        module0021.$g768$ = null;
        module0021.$g769$ = null;
        module0021.$g770$ = null;
        module0021.$g771$ = null;
        module0021.$g772$ = null;
        module0021.$g773$ = null;
        module0021.$g774$ = null;
        module0021.$g775$ = null;
        module0021.$g776$ = null;
        module0021.$g777$ = null;
        module0021.$g778$ = null;
        module0021.$g779$ = null;
        module0021.$g780$ = null;
        module0021.$g781$ = null;
        module0021.$g782$ = null;
        module0021.$g783$ = null;
        module0021.$g784$ = null;
        module0021.$g785$ = null;
        module0021.$g786$ = null;
        module0021.$g787$ = null;
        module0021.$g788$ = null;
        module0021.$g789$ = null;
        module0021.$g790$ = null;
        module0021.$g791$ = null;
        module0021.$g792$ = null;
        module0021.$g793$ = null;
        module0021.$g794$ = null;
        module0021.$g795$ = null;
        module0021.$g796$ = null;
        module0021.$g797$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#2002", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#2003", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2261", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERNAL-STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("COUNT"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2041", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2042", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2043", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2044", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = SubLObjectFactory.makeSymbol("S#2040", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#2003", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#2041", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#2043", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#2042", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#2044", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("INTERNAL-STREAM");
        $ic14$ = SubLObjectFactory.makeKeyword("COUNT");
        $ic15$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic16$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic17$ = SubLObjectFactory.makeSymbol("S#2045", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic19$ = SubLObjectFactory.makeKeyword("END");
        $ic20$ = SubLObjectFactory.makeSymbol("S#2047", "CYC");
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic22$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic23$ = SubLObjectFactory.makeSymbol("CLET");
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2051", "CYC")));
        $ic25$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic26$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic27$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic28$ = SubLObjectFactory.makeSymbol("S#2049", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#2054", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#2048", "CYC");
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("S#2262", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic32$ = SubLObjectFactory.makeSymbol("S#2053", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#2051", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#2050", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#2052", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#2055", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#2056", "CYC");
        $ic38$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic39$ = SubLObjectFactory.makeSymbol("S#2006", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#2007", "CYC");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2261", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"));
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERNAL-STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("POSITION"));
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2062", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2063", "CYC"));
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2064", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2065", "CYC"));
        $ic45$ = SubLObjectFactory.makeSymbol("S#2061", "CYC");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#2007", "CYC"));
        $ic47$ = SubLObjectFactory.makeSymbol("S#2062", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#2064", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#2063", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#2065", "CYC");
        $ic51$ = SubLObjectFactory.makeKeyword("POSITION");
        $ic52$ = SubLObjectFactory.makeSymbol("S#2066", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#2068", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#2070", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#2074", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#2069", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#2072", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#2071", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#2038", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#2073", "CYC");
        $ic61$ = SubLObjectFactory.makeKeyword("EOF");
        $ic62$ = SubLObjectFactory.makeSymbol("S#2010", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#2011", "CYC");
        $ic64$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITION"));
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POSITION"));
        $ic66$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2080", "CYC"));
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2081", "CYC"));
        $ic68$ = SubLObjectFactory.makeSymbol("S#2079", "CYC");
        $ic69$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#2011", "CYC"));
        $ic70$ = SubLObjectFactory.makeSymbol("S#2080", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#2081", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#2082", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#2084", "CYC");
        $ic74$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic75$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2086", "CYC")));
        $ic76$ = SubLObjectFactory.makeSymbol("S#2089", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("S#2090", "CYC");
        $ic78$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2210", "CYC"), (SubLObject)module0021.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2211", "CYC"), (SubLObject)module0021.NIL));
        $ic79$ = SubLObjectFactory.makeInteger(256);
        $ic80$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic81$ = SubLObjectFactory.makeString("Use NIL instead");
        $ic82$ = SubLObjectFactory.makeString("CFASL cannot handle : ~S");
        $ic83$ = SubLObjectFactory.makeString("Undefined cfasl opcode in ~S");
        $ic84$ = SubLObjectFactory.makeString("end-of-file on stream ~S");
        $ic85$ = SubLObjectFactory.makeSymbol("S#2103", "CYC");
        $ic86$ = SubLObjectFactory.makeString("Undefined cfasl opcode ~A in ~S");
        $ic87$ = SubLObjectFactory.makeInteger(128);
        $ic88$ = SubLObjectFactory.makeSymbol("S#2215", "CYC");
        $ic89$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2263", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2264", "CYC"));
        $ic90$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic91$ = SubLObjectFactory.makeSymbol("DEFCONSTANT-PRIVATE");
        $ic92$ = SubLObjectFactory.makeSymbol("S#2108", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic94$ = SubLObjectFactory.makeSymbol("S#2107", "CYC");
        $ic95$ = SubLObjectFactory.makeKeyword("SL2JAVA");
        $ic96$ = SubLObjectFactory.makeSymbol("PIF");
        $ic97$ = SubLObjectFactory.makeSymbol("S#2213", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("WITH-STATIC-AREA");
        $ic99$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2216", "CYC"), (SubLObject)module0021.T));
        $ic100$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2216", "CYC"), (SubLObject)module0021.NIL));
        $ic101$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2217", "CYC"), (SubLObject)module0021.NIL));
        $ic102$ = SubLObjectFactory.makeSymbol("S#2218", "CYC");
        $ic103$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2263", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2265", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2266", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2267", "CYC"));
        $ic104$ = SubLObjectFactory.makeSymbol("S#2118", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("S#2117", "CYC");
        $ic106$ = SubLObjectFactory.makeInteger(51);
        $ic107$ = SubLObjectFactory.makeSymbol("S#2123", "CYC");
        $ic108$ = SubLObjectFactory.makeInteger(44);
        $ic109$ = SubLObjectFactory.makeSymbol("S#2126", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("S#2125", "CYC");
        $ic111$ = SubLObjectFactory.makeString("Error, expected constructor for defstruct, got ~A.");
        $ic112$ = SubLObjectFactory.makeString("Expected keyword at slot #~A of structure with constructor ~A, got ~A.");
        $ic113$ = SubLObjectFactory.makeSymbol("S#2134", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("S#2015", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#2016", "CYC");
        $ic116$ = SubLObjectFactory.makeSymbol("S#2135", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("S#2017", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#2018", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("S#2019", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("S#2136", "CYC");
        $ic121$ = SubLObjectFactory.makeInteger(23);
        $ic122$ = SubLObjectFactory.makeSymbol("S#2020", "CYC");
        $ic123$ = SubLObjectFactory.makeInteger(24);
        $ic124$ = SubLObjectFactory.makeSymbol("S#2141", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("S#2131", "CYC");
        $ic126$ = SubLObjectFactory.makeInteger(32768);
        $ic127$ = SubLObjectFactory.makeInteger(8388608);
        $ic128$ = SubLObjectFactory.makeInteger("2147483648");
        $ic129$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#106", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#2268", "CYC"));
        $ic130$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2137", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2139", "CYC"));
        $ic131$ = SubLObjectFactory.makeInteger(32);
        $ic132$ = SubLObjectFactory.makeSymbol("ASSEMBLE-FIXNUMS-TO-INTEGER");
        $ic133$ = SubLObjectFactory.makeSymbol("S#2021", "CYC");
        $ic134$ = SubLObjectFactory.makeSymbol("S#2022", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#2143", "CYC");
        $ic136$ = SubLObjectFactory.makeSymbol("S#2146", "CYC");
        $ic137$ = SubLObjectFactory.makeSymbol("S#2023", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("S#2024", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("S#2025", "CYC");
        $ic140$ = SubLObjectFactory.makeInteger(50);
        $ic141$ = SubLObjectFactory.makeSymbol("S#2027", "CYC");
        $ic142$ = SubLObjectFactory.makeSymbol("VECTOR");
        $ic143$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2269", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic144$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2240", "CYC"), (SubLObject)module0021.NIL));
        $ic145$ = SubLObjectFactory.makeSymbol("S#2151", "CYC");
        $ic146$ = SubLObjectFactory.makeSymbol("S#2153", "CYC");
        $ic147$ = SubLObjectFactory.makeString("Use NIL.");
        $ic148$ = SubLObjectFactory.makeString("Common symbol at index ~D was not found in ~S.");
        $ic149$ = SubLObjectFactory.makeSymbol("S#2240", "CYC");
        $ic150$ = SubLObjectFactory.makeSymbol("S#2160", "CYC");
        $ic151$ = SubLObjectFactory.makeSymbol("S#2241", "CYC");
        $ic152$ = SubLObjectFactory.makeSymbol("S#2029", "CYC");
        $ic153$ = SubLObjectFactory.makeString("Output NIL instead");
        $ic154$ = SubLObjectFactory.makeString("Trying to output a circular list!");
        $ic155$ = SubLObjectFactory.makeSymbol("S#2031", "CYC");
        $ic156$ = SubLObjectFactory.makeSymbol("S#2165", "CYC");
        $ic157$ = SubLObjectFactory.makeSymbol("S#2032", "CYC");
        $ic158$ = SubLObjectFactory.makeInteger(26);
        $ic159$ = SubLObjectFactory.makeSymbol("S#2168", "CYC");
        $ic160$ = SubLObjectFactory.makeSymbol("S#2033", "CYC");
        $ic161$ = SubLObjectFactory.makeSymbol("S#2169", "CYC");
        $ic162$ = SubLObjectFactory.makeSymbol("S#2034", "CYC");
        $ic163$ = SubLObjectFactory.makeSymbol("S#2171", "CYC");
        $ic164$ = SubLObjectFactory.makeSymbol("S#2175", "CYC");
        $ic165$ = SubLObjectFactory.makeSymbol("S#2173", "CYC");
        $ic166$ = SubLObjectFactory.makeInteger(43);
        $ic167$ = SubLObjectFactory.makeSymbol("S#2036", "CYC");
        $ic168$ = SubLObjectFactory.makeSymbol("S#2176", "CYC");
        $ic169$ = SubLObjectFactory.makeInteger(25);
        $ic170$ = SubLObjectFactory.makeSymbol("S#2180", "CYC");
        $ic171$ = SubLObjectFactory.makeInteger(36);
        $ic172$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2252", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2182", "CYC"))));
        $ic173$ = SubLObjectFactory.makeInteger(27);
        $ic174$ = SubLObjectFactory.makeSymbol("S#2184", "CYC");
        $ic175$ = SubLObjectFactory.makeInteger(28);
        $ic176$ = SubLObjectFactory.makeSymbol("S#2187", "CYC");
        $ic177$ = SubLObjectFactory.makeSymbol("S#2185", "CYC");
        $ic178$ = SubLObjectFactory.makeInteger(29);
        $ic179$ = SubLObjectFactory.makeSymbol("S#2190", "CYC");
        $ic180$ = SubLObjectFactory.makeSymbol("S#2257", "CYC");
        $ic181$ = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $ic182$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2270", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2264", "CYC"));
        $ic183$ = SubLObjectFactory.makeString("~A is too small to be a wide opcode.");
        $ic184$ = SubLObjectFactory.makeSymbol("S#2192", "CYC");
        $ic185$ = SubLObjectFactory.makeSymbol("S#2191", "CYC");
        $ic186$ = SubLObjectFactory.makeInteger(124);
        $ic187$ = SubLObjectFactory.makeSymbol("S#2194", "CYC");
        $ic188$ = SubLObjectFactory.makeString("CFASL cannot read in the serialized SubLOOP instance because the :SUBLOOP feature is not present.");
        $ic189$ = SubLObjectFactory.makeInteger(126);
        $ic190$ = SubLObjectFactory.makeSymbol("S#2200", "CYC");
        $ic191$ = SubLObjectFactory.makeSymbol("S#2260", "CYC");
        $ic192$ = SubLObjectFactory.makeInteger(100);
        $ic193$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2271", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2264", "CYC"));
        $ic194$ = SubLObjectFactory.makeSymbol("GUID-P");
        $ic195$ = SubLObjectFactory.makeSymbol("DEFLEXICAL-PRIVATE");
        $ic196$ = SubLObjectFactory.makeSymbol("S#2197", "CYC");
        $ic197$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2272", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2264", "CYC"));
        $ic198$ = SubLObjectFactory.makeSymbol("GUID-STRING-P");
        $ic199$ = SubLObjectFactory.makeSymbol("STRING-TO-GUID");
        $ic200$ = SubLObjectFactory.makeSymbol("S#2195", "CYC");
        $ic201$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2273", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic202$ = SubLObjectFactory.makeSymbol("S#2198", "CYC");
        $ic203$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic204$ = SubLObjectFactory.makeString("Unable to open ~S");
    }
    
    public static final class $sX2002_native extends SubLStructNative
    {
        public SubLObject $internal_stream;
        public SubLObject $count;
        private static final SubLStructDeclNative structDecl;
        
        public $sX2002_native() {
            this.$internal_stream = (SubLObject)CommonSymbols.NIL;
            this.$count = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX2002_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$internal_stream;
        }
        
        public SubLObject getField3() {
            return this.$count;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$internal_stream = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$count = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX2002_native.class, module0021.$ic0$, module0021.$ic1$, module0021.$ic2$, module0021.$ic3$, new String[] { "$internal_stream", "$count" }, module0021.$ic4$, module0021.$ic5$, module0021.$ic6$);
        }
    }
    
    public static final class $f1019$UnaryFunction extends UnaryFunction
    {
        public $f1019$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2003"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1019(var4);
        }
    }
    
    public static final class $sX2006_native extends SubLStructNative
    {
        public SubLObject $internal_stream;
        public SubLObject $position;
        private static final SubLStructDeclNative structDecl;
        
        public $sX2006_native() {
            this.$internal_stream = (SubLObject)CommonSymbols.NIL;
            this.$position = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX2006_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$internal_stream;
        }
        
        public SubLObject getField3() {
            return this.$position;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$internal_stream = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$position = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX2006_native.class, module0021.$ic39$, module0021.$ic40$, module0021.$ic41$, module0021.$ic42$, new String[] { "$internal_stream", "$position" }, module0021.$ic43$, module0021.$ic44$, module0021.$ic6$);
        }
    }
    
    public static final class $f1043$UnaryFunction extends UnaryFunction
    {
        public $f1043$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2007"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1043(var4);
        }
    }
    
    public static final class $sX2010_native extends SubLStructNative
    {
        public SubLObject $position;
        private static final SubLStructDeclNative structDecl;
        
        public $sX2010_native() {
            this.$position = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX2010_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$position;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$position = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX2010_native.class, module0021.$ic62$, module0021.$ic63$, module0021.$ic64$, module0021.$ic65$, new String[] { "$position" }, module0021.$ic66$, module0021.$ic67$, module0021.$ic6$);
        }
    }
    
    public static final class $f1064$UnaryFunction extends UnaryFunction
    {
        public $f1064$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2011"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1064(var4);
        }
    }
    
    public static final class $f1121$UnaryFunction extends UnaryFunction
    {
        public $f1121$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2015"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1121(var4);
        }
    }
    
    public static final class $f1122$UnaryFunction extends UnaryFunction
    {
        public $f1122$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2016"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1122(var4);
        }
    }
    
    public static final class $f1124$UnaryFunction extends UnaryFunction
    {
        public $f1124$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2017"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1124(var4);
        }
    }
    
    public static final class $f1125$UnaryFunction extends UnaryFunction
    {
        public $f1125$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2018"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1125(var4);
        }
    }
    
    public static final class $f1126$UnaryFunction extends UnaryFunction
    {
        public $f1126$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2019"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1126(var4);
        }
    }
    
    public static final class $f1131$UnaryFunction extends UnaryFunction
    {
        public $f1131$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2020"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1131(var4);
        }
    }
    
    public static final class $f1136$UnaryFunction extends UnaryFunction
    {
        public $f1136$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2021"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1136(var4);
        }
    }
    
    public static final class $f1138$UnaryFunction extends UnaryFunction
    {
        public $f1138$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2022"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1138(var4);
        }
    }
    
    public static final class $f1145$UnaryFunction extends UnaryFunction
    {
        public $f1145$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2023"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1145(var4);
        }
    }
    
    public static final class $f1147$UnaryFunction extends UnaryFunction
    {
        public $f1147$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2024"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1147(var4);
        }
    }
    
    public static final class $f1148$UnaryFunction extends UnaryFunction
    {
        public $f1148$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2025"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1148(var4);
        }
    }
    
    public static final class $f1156$UnaryFunction extends UnaryFunction
    {
        public $f1156$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2027"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1156(var4);
        }
    }
    
    public static final class $f1162$UnaryFunction extends UnaryFunction
    {
        public $f1162$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2029"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1162(var4);
        }
    }
    
    public static final class $f1163$UnaryFunction extends UnaryFunction
    {
        public $f1163$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2031"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1163(var4);
        }
    }
    
    public static final class $f1167$UnaryFunction extends UnaryFunction
    {
        public $f1167$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2032"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1167(var4);
        }
    }
    
    public static final class $f1170$UnaryFunction extends UnaryFunction
    {
        public $f1170$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2033"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1170(var4);
        }
    }
    
    public static final class $f1173$UnaryFunction extends UnaryFunction
    {
        public $f1173$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2034"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1173(var4);
        }
    }
    
    public static final class $f1180$UnaryFunction extends UnaryFunction
    {
        public $f1180$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2036"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0021.f1180(var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0021.class
	Total time: 670 ms
	
	Decompiled with Procyon 0.5.32.
*/
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0699 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0699";
    public static final String myFingerPrint = "20428845eae8e4cc3aa65800cb001abda4ffd8a97dc6687caf54809dd16a9c9b";
    private static SubLSymbol $g5478$;
    private static SubLSymbol $g5479$;
    private static SubLSymbol $g5480$;
    private static SubLSymbol $g5481$;
    private static SubLSymbol $g5482$;
    private static SubLSymbol $g5483$;
    private static SubLSymbol $g5484$;
    private static SubLSymbol $g5485$;
    private static SubLSymbol $g5486$;
    private static SubLSymbol $g5487$;
    private static SubLSymbol $g5488$;
    private static SubLSymbol $g5489$;
    private static SubLSymbol $g5490$;
    private static SubLSymbol $g5491$;
    private static SubLSymbol $g5492$;
    private static SubLSymbol $g5493$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLString $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLList $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLInteger $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLList $ic84$;
    private static final SubLString $ic85$;
    private static final SubLList $ic86$;
    
    public static SubLObject f42527() {
        return module0699.$g5478$.getGlobalValue();
    }
    
    public static SubLObject f42528() {
        final SubLObject var1 = module0699.$g5479$.getGlobalValue();
        if (module0699.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42529(final SubLObject var2) {
        return module0034.f1829(module0699.$g5479$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42530(final SubLObject var2) {
        return Sequences.cconcatenate(module0699.$g5478$.getGlobalValue(), var2);
    }
    
    public static SubLObject f42531(final SubLObject var2) {
        SubLObject var3 = module0699.$g5479$.getGlobalValue();
        if (module0699.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0699.$ic1$, (SubLObject)module0699.$ic2$, (SubLObject)module0699.NIL, (SubLObject)module0699.EQUAL, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.ZERO_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)module0699.$ic3$);
        if (var4 == module0699.$ic3$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42530(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)module0699.UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f42532() {
        final SubLObject var1 = module0699.$g5480$.getGlobalValue();
        if (module0699.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42533(final SubLObject var2) {
        return module0034.f1829(module0699.$g5480$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42534(final SubLObject var2) {
        return Sequences.cconcatenate((SubLObject)module0699.$ic5$, var2);
    }
    
    public static SubLObject f42535(final SubLObject var2) {
        SubLObject var3 = module0699.$g5480$.getGlobalValue();
        if (module0699.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0699.$ic4$, (SubLObject)module0699.$ic6$, (SubLObject)module0699.NIL, (SubLObject)module0699.EQUAL, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.ZERO_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)module0699.$ic3$);
        if (var4 == module0699.$ic3$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42534(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)module0699.UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f42536(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0699.NIL != module0702.f42828(var5) && module0699.NIL != module0702.f42834(var5, f42527()));
    }
    
    public static SubLObject f42537() {
        return module0699.$g5481$.getGlobalValue();
    }
    
    public static SubLObject f42538() {
        final SubLObject var1 = module0699.$g5482$.getGlobalValue();
        if (module0699.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42539(final SubLObject var2) {
        return module0034.f1829(module0699.$g5482$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42540(final SubLObject var2) {
        return Sequences.cconcatenate(module0699.$g5481$.getGlobalValue(), var2);
    }
    
    public static SubLObject f42541(final SubLObject var2) {
        SubLObject var3 = module0699.$g5482$.getGlobalValue();
        if (module0699.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0699.$ic8$, (SubLObject)module0699.$ic9$, (SubLObject)module0699.NIL, (SubLObject)module0699.EQUAL, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.ZERO_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)module0699.$ic3$);
        if (var4 == module0699.$ic3$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42540(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)module0699.UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f42542() {
        final SubLObject var1 = module0699.$g5483$.getGlobalValue();
        if (module0699.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42543(final SubLObject var2) {
        return module0034.f1829(module0699.$g5483$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42544(final SubLObject var2) {
        return Sequences.cconcatenate((SubLObject)module0699.$ic11$, var2);
    }
    
    public static SubLObject f42545(final SubLObject var2) {
        SubLObject var3 = module0699.$g5483$.getGlobalValue();
        if (module0699.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0699.$ic10$, (SubLObject)module0699.$ic12$, (SubLObject)module0699.NIL, (SubLObject)module0699.EQUAL, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.ZERO_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)module0699.$ic3$);
        if (var4 == module0699.$ic3$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42544(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)module0699.UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f42546(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0699.NIL != module0702.f42828(var5) && module0699.NIL != module0702.f42834(var5, f42537()));
    }
    
    public static SubLObject f42547() {
        return module0699.$g5484$.getGlobalValue();
    }
    
    public static SubLObject f42548() {
        final SubLObject var1 = module0699.$g5485$.getGlobalValue();
        if (module0699.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42549(final SubLObject var2) {
        return module0034.f1829(module0699.$g5485$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42550(final SubLObject var2) {
        return Sequences.cconcatenate(module0699.$g5484$.getGlobalValue(), var2);
    }
    
    public static SubLObject f42551(final SubLObject var2) {
        SubLObject var3 = module0699.$g5485$.getGlobalValue();
        if (module0699.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0699.$ic14$, (SubLObject)module0699.$ic15$, (SubLObject)module0699.NIL, (SubLObject)module0699.EQUAL, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.ZERO_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)module0699.$ic3$);
        if (var4 == module0699.$ic3$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42550(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)module0699.UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f42552() {
        final SubLObject var1 = module0699.$g5486$.getGlobalValue();
        if (module0699.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42553(final SubLObject var2) {
        return module0034.f1829(module0699.$g5486$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42554(final SubLObject var2) {
        return Sequences.cconcatenate((SubLObject)module0699.$ic17$, var2);
    }
    
    public static SubLObject f42555(final SubLObject var2) {
        SubLObject var3 = module0699.$g5486$.getGlobalValue();
        if (module0699.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0699.$ic16$, (SubLObject)module0699.$ic18$, (SubLObject)module0699.NIL, (SubLObject)module0699.EQUAL, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.ZERO_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)module0699.$ic3$);
        if (var4 == module0699.$ic3$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42554(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)module0699.UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f42556(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0699.NIL != module0702.f42828(var5) && module0699.NIL != module0702.f42834(var5, f42547()));
    }
    
    public static SubLObject f42557() {
        return module0699.$g5487$.getGlobalValue();
    }
    
    public static SubLObject f42558() {
        final SubLObject var1 = module0699.$g5488$.getGlobalValue();
        if (module0699.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42559(final SubLObject var2) {
        return module0034.f1829(module0699.$g5488$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42560(final SubLObject var2) {
        return Sequences.cconcatenate(f42557(), var2);
    }
    
    public static SubLObject f42561(final SubLObject var2) {
        SubLObject var3 = module0699.$g5488$.getGlobalValue();
        if (module0699.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0699.$ic20$, (SubLObject)module0699.$ic21$, (SubLObject)module0699.NIL, (SubLObject)module0699.EQUAL, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.ZERO_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)module0699.$ic3$);
        if (var4 == module0699.$ic3$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42560(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)module0699.UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f42562() {
        final SubLObject var1 = module0699.$g5489$.getGlobalValue();
        if (module0699.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42563(final SubLObject var2) {
        return module0034.f1829(module0699.$g5489$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42564(final SubLObject var2) {
        return Sequences.cconcatenate((SubLObject)module0699.$ic23$, var2);
    }
    
    public static SubLObject f42565(final SubLObject var2) {
        SubLObject var3 = module0699.$g5489$.getGlobalValue();
        if (module0699.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0699.$ic22$, (SubLObject)module0699.$ic24$, (SubLObject)module0699.NIL, (SubLObject)module0699.EQUAL, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.ZERO_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)module0699.$ic3$);
        if (var4 == module0699.$ic3$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42564(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)module0699.UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f42566(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0699.NIL != module0702.f42828(var5) && module0699.NIL != module0702.f42834(var5, f42557()));
    }
    
    public static SubLObject f42567() {
        return module0699.$g5490$.getGlobalValue();
    }
    
    public static SubLObject f42568() {
        final SubLObject var1 = module0699.$g5491$.getGlobalValue();
        if (module0699.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42569(final SubLObject var2) {
        return module0034.f1829(module0699.$g5491$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42570(final SubLObject var2) {
        return Sequences.cconcatenate(f42567(), var2);
    }
    
    public static SubLObject f42571(final SubLObject var2) {
        SubLObject var3 = module0699.$g5491$.getGlobalValue();
        if (module0699.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0699.$ic26$, (SubLObject)module0699.$ic27$, (SubLObject)module0699.NIL, (SubLObject)module0699.EQUAL, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.ZERO_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)module0699.$ic3$);
        if (var4 == module0699.$ic3$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42570(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)module0699.UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f42572() {
        final SubLObject var1 = module0699.$g5492$.getGlobalValue();
        if (module0699.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42573(final SubLObject var2) {
        return module0034.f1829(module0699.$g5492$.getGlobalValue(), (SubLObject)ConsesLow.list(var2), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42574(final SubLObject var2) {
        return Sequences.cconcatenate((SubLObject)module0699.$ic29$, var2);
    }
    
    public static SubLObject f42575(final SubLObject var2) {
        SubLObject var3 = module0699.$g5492$.getGlobalValue();
        if (module0699.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0699.$ic28$, (SubLObject)module0699.$ic30$, (SubLObject)module0699.NIL, (SubLObject)module0699.EQUAL, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.ZERO_INTEGER);
        }
        SubLObject var4 = module0034.f1814(var3, var2, (SubLObject)module0699.$ic3$);
        if (var4 == module0699.$ic3$) {
            var4 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42574(var2)));
            module0034.f1816(var3, var2, var4, (SubLObject)module0699.UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f42576(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0699.NIL != module0702.f42828(var5) && module0699.NIL != module0702.f42834(var5, f42567()));
    }
    
    public static SubLObject f42577(SubLObject var6) {
        if (var6 == module0699.UNPROVIDED) {
            var6 = (SubLObject)module0699.NIL;
        }
        SubLObject var7 = (SubLObject)ConsesLow.list(f42571((SubLObject)module0699.$ic31$), f42561((SubLObject)module0699.$ic32$), f42551((SubLObject)module0699.$ic33$));
        SubLObject var8 = f42578();
        SubLObject var9 = (SubLObject)module0699.NIL;
        var9 = var8.first();
        while (module0699.NIL != var8) {
            var7 = module0035.f2084(var9, var7);
            var8 = var8.rest();
            var9 = var8.first();
        }
        if (module0699.NIL != var6) {
            var7 = module0035.f2084(f42561((SubLObject)module0699.$ic34$), var7);
        }
        return var7;
    }
    
    public static SubLObject f42578() {
        return f42579(module0699.$ic35$, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42580() {
        final SubLObject var1 = module0699.$g5493$.getGlobalValue();
        if (module0699.NIL != var1) {
            module0034.f1818(var1);
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42581(final SubLObject var10) {
        return module0034.f1829(module0699.$g5493$.getGlobalValue(), (SubLObject)ConsesLow.list(var10), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42582(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)module0699.NIL;
        if (module0699.NIL != module0018.f971()) {
            final SubLObject var13 = module0147.$g2094$.currentBinding(var11);
            final SubLObject var14 = module0147.$g2095$.currentBinding(var11);
            try {
                module0147.$g2094$.bind((SubLObject)module0699.$ic37$, var11);
                module0147.$g2095$.bind(module0699.$ic38$, var11);
                final SubLObject var15 = module0699.$ic39$;
                if (module0699.NIL != module0158.f10010(var10, (SubLObject)module0699.TWO_INTEGER, var15)) {
                    final SubLObject var16 = module0158.f10011(var10, (SubLObject)module0699.TWO_INTEGER, var15);
                    SubLObject var17 = var12;
                    final SubLObject var18 = (SubLObject)module0699.NIL;
                    while (module0699.NIL == var17) {
                        final SubLObject var19 = module0052.f3695(var16, var18);
                        final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                        if (module0699.NIL != var20) {
                            SubLObject var21 = (SubLObject)module0699.NIL;
                            try {
                                var21 = module0158.f10316(var19, (SubLObject)module0699.$ic40$, (SubLObject)module0699.$ic41$, (SubLObject)module0699.NIL);
                                SubLObject var17_22 = var12;
                                final SubLObject var18_23 = (SubLObject)module0699.NIL;
                                while (module0699.NIL == var17_22) {
                                    final SubLObject var22 = module0052.f3695(var21, var18_23);
                                    final SubLObject var20_25 = (SubLObject)SubLObjectFactory.makeBoolean(!var18_23.eql(var22));
                                    if (module0699.NIL != var20_25) {
                                        final SubLObject var23 = module0178.f11334(var22);
                                        var12 = module0220.f14553(var23, module0699.$ic42$, (SubLObject)module0699.TWO_INTEGER, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.UNPROVIDED);
                                    }
                                    var17_22 = (SubLObject)SubLObjectFactory.makeBoolean(module0699.NIL == var20_25 || module0699.NIL != var12);
                                }
                            }
                            finally {
                                final SubLObject var13_27 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0699.T, var11);
                                    if (module0699.NIL != var21) {
                                        module0158.f10319(var21);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var13_27, var11);
                                }
                            }
                        }
                        var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0699.NIL == var20 || module0699.NIL != var12);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var14, var11);
                module0147.$g2094$.rebind(var13, var11);
            }
        }
        return var12;
    }
    
    public static SubLObject f42583(final SubLObject var10) {
        SubLObject var11 = module0699.$g5493$.getGlobalValue();
        if (module0699.NIL == var11) {
            var11 = module0034.f1934((SubLObject)module0699.$ic36$, (SubLObject)module0699.$ic43$, (SubLObject)module0699.NIL, (SubLObject)module0699.EQUAL, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.ZERO_INTEGER);
        }
        SubLObject var12 = module0034.f1814(var11, var10, (SubLObject)module0699.$ic3$);
        if (var12 == module0699.$ic3$) {
            var12 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42582(var10)));
            module0034.f1816(var11, var10, var12, (SubLObject)module0699.UNPROVIDED);
        }
        return module0034.f1959(var12);
    }
    
    public static SubLObject f42584(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = module0590.f36050(var28, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
        SubLObject var31 = (SubLObject)module0699.NIL;
        while (module0699.NIL != module0035.f2013(var30)) {
            var29.resetMultipleValues();
            final SubLObject var32 = module0590.f36086(var30);
            final SubLObject var33 = var29.secondMultipleValue();
            var29.resetMultipleValues();
            var31 = (SubLObject)ConsesLow.cons(var32, var31);
            var30 = var33;
        }
        return f42585(Sequences.nreverse(var31), (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42585(final SubLObject var33, SubLObject var34) {
        if (var34 == module0699.UNPROVIDED) {
            var34 = (SubLObject)module0699.NIL;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0699.NIL != module0035.f1997(var33) && module0035.f2113(var33).isString()) {
            return module0035.f2113(var33);
        }
        SubLObject var36 = (SubLObject)module0699.NIL;
        SubLObject var37 = (SubLObject)module0699.NIL;
        try {
            var37 = streams_high.make_private_string_output_stream();
            final SubLObject var38 = module0587.$g4457$.currentBinding(var35);
            try {
                module0587.$g4457$.bind(var37, var35);
                SubLObject var39 = f42586(var33, var34);
                SubLObject var40 = (SubLObject)module0699.NIL;
                var40 = var39.first();
                while (module0699.NIL != var39) {
                    module0601.f36801(var40);
                    var39 = var39.rest();
                    var40 = var39.first();
                }
            }
            finally {
                module0587.$g4457$.rebind(var38, var35);
            }
            var36 = streams_high.get_output_stream_string(var37);
        }
        finally {
            final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var35);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0699.T, var35);
                streams_high.close(var37, (SubLObject)module0699.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var41, var35);
            }
        }
        return module0038.f2735(var36);
    }
    
    public static SubLObject f42586(final SubLObject var33, SubLObject var34) {
        if (var34 == module0699.UNPROVIDED) {
            var34 = (SubLObject)module0699.NIL;
        }
        SubLObject var35 = (SubLObject)module0699.NIL;
        SubLObject var36 = var33;
        SubLObject var37 = (SubLObject)module0699.NIL;
        var37 = var36.first();
        while (module0699.NIL != var36) {
            var35 = (SubLObject)ConsesLow.cons(f42587(var37, var34), var35);
            var36 = var36.rest();
            var37 = var36.first();
        }
        return Sequences.nreverse(var35);
    }
    
    public static SubLObject f42587(final SubLObject var31, SubLObject var34) {
        if (var34 == module0699.UNPROVIDED) {
            var34 = (SubLObject)module0699.NIL;
        }
        return var31.isList() ? f42588(conses_high.copy_tree(var31), var34) : var31;
    }
    
    public static SubLObject f42588(final SubLObject var31, final SubLObject var34) {
        if (var31.isList()) {
            final SubLObject var35 = f42589(module0590.f36092(var31));
            final SubLObject var36 = f42590(var35, var34);
            if (module0699.NIL != var36) {
                if (module0699.NIL == module0590.f36096(var31, var35)) {
                    module0590.f36097(var31, var35, var36);
                }
            }
            final SubLObject var37 = (SubLObject)ConsesLow.cons(module0590.f36095(var31), var34);
            SubLObject var38 = module0590.f36094(var31, (SubLObject)module0699.UNPROVIDED);
            SubLObject var39 = (SubLObject)module0699.NIL;
            var39 = var38.first();
            while (module0699.NIL != var38) {
                f42588(var39, var37);
                var38 = var38.rest();
                var39 = var38.first();
            }
        }
        return var31;
    }
    
    public static SubLObject f42589(final SubLObject var42) {
        final SubLObject var43 = Sequences.position((SubLObject)Characters.CHAR_colon, var42, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
        return (SubLObject)((module0699.NIL != var43) ? Sequences.cconcatenate((SubLObject)module0699.$ic44$, module0038.f2623(var42, (SubLObject)module0699.ZERO_INTEGER, var43)) : module0699.$ic45$);
    }
    
    public static SubLObject f42590(final SubLObject var38, final SubLObject var34) {
        SubLObject var39 = (SubLObject)module0699.NIL;
        if (module0699.NIL == var39) {
            SubLObject var40;
            SubLObject var41;
            for (var40 = var34, var41 = (SubLObject)module0699.NIL, var41 = var40.first(); module0699.NIL == var39 && module0699.NIL != var40; var39 = module0035.f2294(var41, var38, Symbols.symbol_function((SubLObject)module0699.$ic46$), (SubLObject)module0699.UNPROVIDED), var40 = var40.rest(), var41 = var40.first()) {}
        }
        return var39;
    }
    
    public static SubLObject f42591(final SubLObject var46, final SubLObject var47) {
        if (module0699.NIL != module0702.f42828(var46)) {
            return f42592(var46);
        }
        if (module0699.NIL != module0704.f42888(var46)) {
            return f42593(var46);
        }
        if (module0699.NIL != f42594(var46, var47)) {
            return f42595(var46, var47);
        }
        Errors.error((SubLObject)module0699.$ic47$, var46);
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42592(final SubLObject var48) {
        final SubLObject var49 = f42596(var48);
        return (module0699.NIL != module0173.f10955(var49)) ? var49 : module0285.f18993(module0202.f12643(module0699.$ic48$, module0702.f42830(var48)), (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42596(final SubLObject var48) {
        final SubLObject var49 = module0702.f42830(var48);
        if (var49.equal(f42531((SubLObject)module0699.$ic49$))) {
            return module0699.$ic50$;
        }
        return module0434.f30578((SubLObject)module0699.$ic51$, (SubLObject)ConsesLow.list(module0699.$ic52$, (SubLObject)module0699.$ic51$, var49), module0699.$ic53$, (SubLObject)module0699.$ic54$).first();
    }
    
    public static SubLObject f42593(final SubLObject var51) {
        if (module0699.NIL == module0704.f42883(var51)) {
            return module0704.f42881(var51);
        }
        if (module0699.NIL != module0704.f42904(var51)) {
            return module0704.f42881(var51);
        }
        if (module0699.NIL != module0704.f42905(var51)) {
            return reader.read_from_string_ignoring_errors(module0704.f42881(var51), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
        }
        if (module0699.NIL != module0704.f42906(var51)) {
            return reader.read_from_string_ignoring_errors(module0704.f42881(var51), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
        }
        if (module0699.NIL != module0704.f42907(var51) && module0699.NIL != module0589.f35907(module0704.f42881(var51), (SubLObject)module0699.UNPROVIDED)) {
            return f42592(module0702.f42814(module0704.f42881(var51), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED));
        }
        Errors.error((SubLObject)module0699.$ic47$, var51);
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42595(final SubLObject var52, final SubLObject var47) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        if (module0699.NIL == Errors.$ignore_mustsP$.getDynamicValue(var53) && module0699.NIL == f42594(var52, var47)) {
            Errors.error((SubLObject)module0699.$ic55$, var52);
        }
        if (module0699.NIL != module0702.f42828(var52) && module0699.NIL != module0702.f42832(var52, f42531((SubLObject)module0699.$ic56$))) {
            return module0699.$ic57$;
        }
        return module0285.f18875(module0202.f12683(module0699.$ic58$, f42597(var52, var47), (SubLObject)module0699.UNPROVIDED), (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42597(final SubLObject var46, final SubLObject var47) {
        if (module0699.NIL != module0702.f42828(var46) && module0699.NIL != module0702.f42832(var46, f42531((SubLObject)module0699.$ic56$))) {
            return (SubLObject)module0699.NIL;
        }
        final SubLObject var48 = module0701.f42651(var47, var46, (SubLObject)module0699.UNPROVIDED);
        final SubLObject var49 = Sequences.find(module0701.f42634(var47, f42531((SubLObject)module0699.$ic59$), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED), var48, (SubLObject)module0699.EQ, (SubLObject)module0699.$ic60$, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
        final SubLObject var50 = f42591(module0700.f42614(var49), var47);
        final SubLObject var51 = Sequences.find(module0701.f42634(var47, f42531((SubLObject)module0699.$ic61$), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED), var48, (SubLObject)module0699.EQ, (SubLObject)module0699.$ic60$, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
        final SubLObject var52 = f42597(module0700.f42614(var51), var47);
        return (SubLObject)ConsesLow.cons(var50, var52);
    }
    
    public static SubLObject f42598(final SubLObject var46, final SubLObject var47) {
        if (module0699.NIL != module0702.f42828(var46) && module0699.NIL != module0702.f42832(var46, f42531((SubLObject)module0699.$ic56$))) {
            return (SubLObject)module0699.NIL;
        }
        final SubLObject var48 = module0701.f42651(var47, var46, (SubLObject)module0699.UNPROVIDED);
        final SubLObject var49 = Sequences.find(module0701.f42634(var47, f42531((SubLObject)module0699.$ic59$), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED), var48, (SubLObject)module0699.EQ, (SubLObject)module0699.$ic60$, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
        final SubLObject var50 = module0700.f42614(var49);
        final SubLObject var51 = Sequences.find(module0701.f42634(var47, f42531((SubLObject)module0699.$ic61$), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED), var48, (SubLObject)module0699.EQ, (SubLObject)module0699.$ic60$, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
        final SubLObject var52 = f42598(module0700.f42614(var51), var47);
        return (SubLObject)ConsesLow.cons(var50, var52);
    }
    
    public static SubLObject f42594(final SubLObject var46, final SubLObject var47) {
        if (module0699.NIL != module0702.f42828(var46) && module0699.NIL != module0702.f42832(var46, f42531((SubLObject)module0699.$ic56$))) {
            return (SubLObject)module0699.T;
        }
        if (module0699.NIL == module0703.f42867(var46)) {
            return (SubLObject)module0699.NIL;
        }
        final SubLObject var48 = module0701.f42651(var47, var46, (SubLObject)module0699.UNPROVIDED);
        if ((module0699.NIL == module0035.f1998(var48) && module0699.NIL == module0035.f1999(var48)) || module0699.NIL == Sequences.find(module0701.f42634(var47, f42531((SubLObject)module0699.$ic59$), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED), var48, (SubLObject)module0699.EQ, (SubLObject)module0699.$ic60$, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED)) {
            return (SubLObject)module0699.NIL;
        }
        final SubLObject var49 = Sequences.find(module0701.f42634(var47, f42531((SubLObject)module0699.$ic61$), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED), var48, (SubLObject)module0699.EQ, (SubLObject)module0699.$ic60$, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0699.NIL != var49 && module0699.NIL != f42594(module0700.f42614(var49), var47));
    }
    
    public static SubLObject f42599(final SubLObject var47, final SubLObject var46) {
        if (module0699.NIL != module0701.f42629(var46)) {
            SubLObject var48 = module0701.f42651(var47, var46, (SubLObject)module0699.UNPROVIDED);
            SubLObject var49 = (SubLObject)module0699.NIL;
            var49 = var48.first();
            while (module0699.NIL != var48) {
                module0701.f42642(var47, module0700.f42612(var49), module0700.f42613(var49), module0700.f42614(var49));
                var48 = var48.rest();
                var49 = var48.first();
            }
        }
        if (module0699.NIL != module0701.f42630(var46)) {
            SubLObject var48 = module0701.f42659(var47, var46);
            SubLObject var49 = (SubLObject)module0699.NIL;
            var49 = var48.first();
            while (module0699.NIL != var48) {
                module0701.f42642(var47, module0700.f42612(var49), module0700.f42613(var49), module0700.f42614(var49));
                var48 = var48.rest();
                var49 = var48.first();
            }
        }
        if (module0699.NIL != module0701.f42631(var46)) {
            SubLObject var48 = module0701.f42662(var47, var46, (SubLObject)module0699.UNPROVIDED);
            SubLObject var49 = (SubLObject)module0699.NIL;
            var49 = var48.first();
            while (module0699.NIL != var48) {
                module0701.f42642(var47, module0700.f42612(var49), module0700.f42613(var49), module0700.f42614(var49));
                var48 = var48.rest();
                var49 = var48.first();
            }
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42600(final SubLObject var47, final SubLObject var61) {
        if (module0699.NIL != module0703.f42867(var61)) {
            final SubLObject var62 = module0701.f42651(var47, var61, module0701.f42634(var47, f42531((SubLObject)module0699.$ic59$), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED)).first();
            final SubLObject var63 = module0701.f42651(var47, var61, module0701.f42634(var47, f42531((SubLObject)module0699.$ic61$), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED)).first();
            if (module0699.NIL != module0700.f42611(var62, (SubLObject)module0699.UNPROVIDED) && module0699.NIL != module0700.f42611(var63, (SubLObject)module0699.UNPROVIDED)) {
                f42600(var47, module0700.f42614(var62));
                f42600(var47, module0700.f42614(var63));
                module0701.f42647(var47, var62);
                module0701.f42647(var47, var63);
                f42599(var47, var61);
            }
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42601(final SubLObject var64, SubLObject var65) {
        if (var65 == module0699.UNPROVIDED) {
            var65 = (SubLObject)module0699.NIL;
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        assert module0699.NIL != module0589.f35909(var64) : var64;
        if (module0699.NIL == var65) {
            var65 = module0075.f5184((SubLObject)module0699.UNPROVIDED);
        }
        SubLObject var67 = module0589.f35978(var64, var65, (SubLObject)module0699.$ic63$, (SubLObject)module0699.T);
        if (module0699.NIL == var67) {
            SubLObject var68 = (SubLObject)module0699.NIL;
            try {
                final SubLObject var69 = stream_macros.$stream_requires_locking$.currentBinding(var66);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0699.NIL, var66);
                    var68 = compatibility.open_text(var65, (SubLObject)module0699.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var69, var66);
                }
                if (!var68.isStream()) {
                    Errors.error((SubLObject)module0699.$ic65$, var65);
                }
                final SubLObject var70 = var68;
                if (streams_high.file_length(var70).numL((SubLObject)module0699.$ic66$)) {
                    final SubLObject var71 = module0038.f2953(var65, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
                    if (module0699.NIL != Sequences.search((SubLObject)module0699.$ic67$, var71, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED) && module0699.NIL != Sequences.search((SubLObject)module0699.$ic68$, var71, Symbols.symbol_function((SubLObject)module0699.EQUALP), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED)) {
                        var67 = (SubLObject)module0699.$ic69$;
                    }
                    else if (module0699.NIL != Sequences.search((SubLObject)module0699.$ic70$, var71, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED)) {
                        var67 = (SubLObject)module0699.$ic71$;
                    }
                    else if (module0699.NIL == module0038.f2675(var71, (SubLObject)module0699.$ic72$, Symbols.symbol_function((SubLObject)module0699.EQUALP))) {
                        final SubLObject var72 = Numbers.min((SubLObject)module0699.FIFTEEN_INTEGER, Sequences.length(var71));
                        final SubLObject var73 = module0038.f2623(var71, (SubLObject)module0699.ZERO_INTEGER, var72);
                        var67 = Sequences.cconcatenate((SubLObject)module0699.$ic73$, module0006.f205(var73));
                    }
                }
            }
            finally {
                final SubLObject var74 = Threads.$is_thread_performing_cleanupP$.currentBinding(var66);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0699.T, var66);
                    if (var68.isStream()) {
                        streams_high.close(var68, (SubLObject)module0699.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var74, var66);
                }
            }
        }
        if (module0699.NIL != var67) {
            Errors.error((SubLObject)module0699.$ic74$, var64, var67);
        }
        return var65;
    }
    
    public static SubLObject f42602(final SubLObject var72) {
        assert module0699.NIL != module0702.f42828(var72) : var72;
        final SubLObject var73 = module0702.f42837(var72);
        SubLObject var74 = (SubLObject)module0699.NIL;
        if (module0699.NIL != module0712.f43666(var72)) {
            var74 = f42603(var72);
        }
        else {
            var74 = f42604(var73);
        }
        if (module0699.NIL == var74) {
            var74 = module0202.f12643(module0699.$ic48$, var73);
        }
        return var74;
    }
    
    public static SubLObject f42605(final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)module0699.NIL;
        final SubLObject var51 = module0147.$g2094$.currentBinding(var49);
        final SubLObject var52 = module0147.$g2095$.currentBinding(var49);
        try {
            module0147.$g2094$.bind((SubLObject)module0699.$ic37$, var49);
            module0147.$g2095$.bind(module0699.$ic38$, var49);
            var50 = module0220.f14556(var48, module0699.$ic52$, (SubLObject)module0699.TWO_INTEGER, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var52, var49);
            module0147.$g2094$.rebind(var51, var49);
        }
        return var50;
    }
    
    public static SubLObject f42604(final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = module0034.$g879$.getDynamicValue(var49);
        SubLObject var51 = (SubLObject)module0699.NIL;
        if (module0699.NIL == var50) {
            return f42605(var48);
        }
        var51 = module0034.f1857(var50, (SubLObject)module0699.$ic76$, (SubLObject)module0699.UNPROVIDED);
        if (module0699.NIL == var51) {
            var51 = module0034.f1807(module0034.f1842(var50), (SubLObject)module0699.$ic76$, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.NIL, (SubLObject)module0699.EQUAL, (SubLObject)module0699.UNPROVIDED);
            module0034.f1860(var50, (SubLObject)module0699.$ic76$, var51);
        }
        SubLObject var52 = module0034.f1814(var51, var48, (SubLObject)module0699.$ic3$);
        if (var52 == module0699.$ic3$) {
            var52 = Values.arg2(var49.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42605(var48)));
            module0034.f1816(var51, var48, var52, (SubLObject)module0699.UNPROVIDED);
        }
        return module0034.f1959(var52);
    }
    
    public static SubLObject f42603(final SubLObject var78) {
        assert module0699.NIL != module0702.f42828(var78) : var78;
        final SubLObject var79 = f42606(module0702.f42840(var78));
        SubLObject var80 = module0166.f10737(var79);
        if (module0699.NIL == var80) {
            var80 = module0213.f13917(var79);
        }
        if (module0699.NIL != module0206.f13444(var80)) {
            return var80;
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42606(final SubLObject var48) {
        final SubLObject var49 = conses_high.last(module0038.f2689((SubLObject)module0699.$ic77$, var48, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED), (SubLObject)module0699.UNPROVIDED).first();
        final SubLObject var50 = module0038.f2623(var48, (SubLObject)((module0699.NIL != var49) ? var49 : module0699.ZERO_INTEGER), (SubLObject)module0699.UNPROVIDED);
        final SubLObject var51 = Strings.string_right_trim((SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_greater), var50);
        return var51;
    }
    
    public static SubLObject f42579(final SubLObject var49, SubLObject var10, SubLObject var83) {
        if (var10 == module0699.UNPROVIDED) {
            var10 = (SubLObject)module0699.NIL;
        }
        if (var83 == module0699.UNPROVIDED) {
            var83 = (SubLObject)module0699.NIL;
        }
        SubLObject var84 = (SubLObject)module0699.NIL;
        if (var49.eql(module0699.$ic78$)) {
            var84 = (SubLObject)ConsesLow.cons(f42531((SubLObject)module0699.$ic49$), var84);
        }
        if (module0699.NIL != module0212.f13762(var49)) {
            final SubLObject var85 = Sequences.remove((SubLObject)module0699.NIL, Mapping.mapcar((SubLObject)module0699.$ic79$, module0220.f14562(var49, module0699.$ic52$, (SubLObject)module0699.ONE_INTEGER, (SubLObject)module0699.TWO_INTEGER, (SubLObject)module0699.$ic41$)), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
            final SubLObject var86 = (module0699.NIL != var10) ? module0035.f2109(var10, var85, (SubLObject)module0699.$ic80$, (SubLObject)module0699.UNPROVIDED) : var85;
            if (var86.isVector()) {
                final SubLObject var87 = var86;
                final SubLObject var88 = (SubLObject)module0699.NIL;
                SubLObject var89;
                SubLObject var90;
                SubLObject var91;
                SubLObject var92;
                for (var89 = Sequences.length(var87), var90 = (SubLObject)module0699.NIL, var90 = (SubLObject)module0699.ZERO_INTEGER; var90.numL(var89); var90 = Numbers.add(var90, (SubLObject)module0699.ONE_INTEGER)) {
                    var91 = ((module0699.NIL != var88) ? Numbers.subtract(var89, var90, (SubLObject)module0699.ONE_INTEGER) : var90);
                    var92 = Vectors.aref(var87, var91);
                    var84 = (SubLObject)ConsesLow.cons(var92, var84);
                }
            }
            else {
                SubLObject var93 = var86;
                SubLObject var94 = (SubLObject)module0699.NIL;
                var94 = var93.first();
                while (module0699.NIL != var93) {
                    var84 = (SubLObject)ConsesLow.cons(var94, var84);
                    var93 = var93.rest();
                    var94 = var93.first();
                }
            }
        }
        if (module0699.NIL != module0337.f22630(var49, (SubLObject)module0699.$ic81$) && module0699.NIL != module0589.f35907(module0038.f2621(module0038.f2674(module0205.f13368(var49, (SubLObject)module0699.UNPROVIDED), (SubLObject)module0699.$ic82$, (SubLObject)module0699.UNPROVIDED), (SubLObject)module0699.$ic83$, (SubLObject)module0699.UNPROVIDED), (SubLObject)module0699.UNPROVIDED)) {
            var84 = (SubLObject)ConsesLow.cons(module0038.f2621(module0038.f2674(module0205.f13368(var49, (SubLObject)module0699.UNPROVIDED), (SubLObject)module0699.$ic82$, (SubLObject)module0699.UNPROVIDED), (SubLObject)module0699.$ic83$, (SubLObject)module0699.UNPROVIDED), var84);
        }
        if (module0699.NIL != module0337.f22630(var49, (SubLObject)module0699.$ic84$)) {
            var84 = (SubLObject)ConsesLow.cons(module0205.f13277(var49, (SubLObject)module0699.UNPROVIDED), var84);
        }
        if (module0699.NIL == var83 && module0699.NIL != module0173.f10955(var49) && (module0699.NIL == var10 || module0699.NIL != Sequences.search((SubLObject)module0699.$ic85$, var10, Symbols.symbol_function((SubLObject)module0699.EQUAL), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED))) {
            var84 = (SubLObject)ConsesLow.cons(module0712.f43674(var49), var84);
            var84 = (SubLObject)ConsesLow.cons(module0712.f43675(var49, (SubLObject)module0699.UNPROVIDED), var84);
            var84 = (SubLObject)ConsesLow.cons(module0712.f43676(var49, (SubLObject)module0699.UNPROVIDED), var84);
            if (module0699.NIL != var10) {
                var84 = module0035.f2109(var10, var84, Symbols.symbol_function((SubLObject)module0699.EQUAL), (SubLObject)module0699.UNPROVIDED);
            }
        }
        return Sequences.delete_duplicates(var84, Symbols.symbol_function((SubLObject)module0699.EQUAL), (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED);
    }
    
    public static SubLObject f42607(final SubLObject var78) {
        if (var78.isString()) {
            return var78;
        }
        if (module0699.NIL != conses_high.member(module0205.f13276(var78), (SubLObject)module0699.$ic86$, (SubLObject)module0699.UNPROVIDED, (SubLObject)module0699.UNPROVIDED)) {
            return f42607(module0205.f13277(var78, (SubLObject)module0699.UNPROVIDED));
        }
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42608() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42527", "S#46536", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42528", "S#46537", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42529", "S#46538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42530", "S#46539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42531", "S#46540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42532", "S#46541", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42533", "S#46542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42534", "S#46543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42535", "S#46544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42536", "S#46545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42537", "S#46546", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42538", "S#46547", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42539", "S#46548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42540", "S#46549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42541", "S#46550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42542", "S#46551", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42543", "S#46552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42544", "S#46553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42545", "S#46554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42546", "S#46555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42547", "S#46556", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42548", "S#46557", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42549", "S#46558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42550", "S#46559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42551", "S#46560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42552", "S#46561", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42553", "S#46562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42554", "S#46563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42555", "S#46564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42556", "S#46565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42557", "S#46566", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42558", "S#46567", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42559", "S#46568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42560", "S#46569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42561", "S#46570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42562", "S#46571", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42563", "S#46572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42564", "S#46573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42565", "S#46574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42566", "S#46575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42567", "S#46576", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42568", "S#46577", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42569", "S#46578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42570", "S#46579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42571", "S#46580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42572", "S#46581", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42573", "S#46582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42574", "S#46583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42575", "S#46584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42576", "S#46585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42577", "S#46586", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42578", "S#46587", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42580", "S#46588", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42581", "S#46589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42582", "S#46590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42583", "S#46591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42584", "S#46592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42585", "S#46593", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42586", "S#46594", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42587", "S#46595", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42588", "S#46596", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42589", "S#46597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42590", "S#46598", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42591", "S#46599", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42592", "S#46600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42596", "S#46601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42593", "S#46602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42595", "S#46603", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42597", "S#46604", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42598", "S#46605", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42594", "S#46606", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42599", "S#46607", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42600", "S#46608", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42601", "S#46609", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42602", "S#39906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42605", "S#46610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42604", "S#46611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42603", "S#46612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42606", "S#46613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42579", "S#46614", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0699", "f42607", "S#46615", 1, 0, false);
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42609() {
        module0699.$g5478$ = SubLFiles.deflexical("S#46616", (SubLObject)module0699.$ic0$);
        module0699.$g5479$ = SubLFiles.deflexical("S#46617", (SubLObject)module0699.NIL);
        module0699.$g5480$ = SubLFiles.deflexical("S#46618", (SubLObject)module0699.NIL);
        module0699.$g5481$ = SubLFiles.deflexical("S#46619", (SubLObject)module0699.$ic7$);
        module0699.$g5482$ = SubLFiles.deflexical("S#46620", (SubLObject)module0699.NIL);
        module0699.$g5483$ = SubLFiles.deflexical("S#46621", (SubLObject)module0699.NIL);
        module0699.$g5484$ = SubLFiles.deflexical("S#46622", (SubLObject)module0699.$ic13$);
        module0699.$g5485$ = SubLFiles.deflexical("S#46623", (SubLObject)module0699.NIL);
        module0699.$g5486$ = SubLFiles.deflexical("S#46624", (SubLObject)module0699.NIL);
        module0699.$g5487$ = SubLFiles.deflexical("S#46625", (SubLObject)module0699.$ic19$);
        module0699.$g5488$ = SubLFiles.deflexical("S#46626", (SubLObject)module0699.NIL);
        module0699.$g5489$ = SubLFiles.deflexical("S#46627", (SubLObject)module0699.NIL);
        module0699.$g5490$ = SubLFiles.deflexical("S#46628", (SubLObject)module0699.$ic25$);
        module0699.$g5491$ = SubLFiles.deflexical("S#46629", (SubLObject)module0699.NIL);
        module0699.$g5492$ = SubLFiles.deflexical("S#46630", (SubLObject)module0699.NIL);
        module0699.$g5493$ = SubLFiles.deflexical("S#46631", (SubLObject)module0699.NIL);
        return (SubLObject)module0699.NIL;
    }
    
    public static SubLObject f42610() {
        module0034.f1909((SubLObject)module0699.$ic1$);
        module0034.f1909((SubLObject)module0699.$ic4$);
        module0034.f1909((SubLObject)module0699.$ic8$);
        module0034.f1909((SubLObject)module0699.$ic10$);
        module0034.f1909((SubLObject)module0699.$ic14$);
        module0034.f1909((SubLObject)module0699.$ic16$);
        module0034.f1909((SubLObject)module0699.$ic20$);
        module0034.f1909((SubLObject)module0699.$ic22$);
        module0034.f1909((SubLObject)module0699.$ic26$);
        module0034.f1909((SubLObject)module0699.$ic28$);
        module0034.f1909((SubLObject)module0699.$ic36$);
        module0034.f1895((SubLObject)module0699.$ic76$);
        return (SubLObject)module0699.NIL;
    }
    
    public void declareFunctions() {
        f42608();
    }
    
    public void initializeVariables() {
        f42609();
    }
    
    public void runTopLevelForms() {
        f42610();
    }
    
    static {
        me = (SubLFile)new module0699();
        module0699.$g5478$ = null;
        module0699.$g5479$ = null;
        module0699.$g5480$ = null;
        module0699.$g5481$ = null;
        module0699.$g5482$ = null;
        module0699.$g5483$ = null;
        module0699.$g5484$ = null;
        module0699.$g5485$ = null;
        module0699.$g5486$ = null;
        module0699.$g5487$ = null;
        module0699.$g5488$ = null;
        module0699.$g5489$ = null;
        module0699.$g5490$ = null;
        module0699.$g5491$ = null;
        module0699.$g5492$ = null;
        module0699.$g5493$ = null;
        $ic0$ = SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        $ic1$ = SubLObjectFactory.makeSymbol("S#46540", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#46617", "CYC");
        $ic3$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic4$ = SubLObjectFactory.makeSymbol("S#46544", "CYC");
        $ic5$ = SubLObjectFactory.makeString("rdf:");
        $ic6$ = SubLObjectFactory.makeSymbol("S#46618", "CYC");
        $ic7$ = SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#");
        $ic8$ = SubLObjectFactory.makeSymbol("S#46550", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#46620", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#46554", "CYC");
        $ic11$ = SubLObjectFactory.makeString("xsd:");
        $ic12$ = SubLObjectFactory.makeSymbol("S#46621", "CYC");
        $ic13$ = SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#");
        $ic14$ = SubLObjectFactory.makeSymbol("S#46560", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#46623", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#46564", "CYC");
        $ic17$ = SubLObjectFactory.makeString("rdfs:");
        $ic18$ = SubLObjectFactory.makeSymbol("S#46624", "CYC");
        $ic19$ = SubLObjectFactory.makeString("http://www.w3.org/2004/02/skos/core#");
        $ic20$ = SubLObjectFactory.makeSymbol("S#46570", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#46626", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#46574", "CYC");
        $ic23$ = SubLObjectFactory.makeString("skos:");
        $ic24$ = SubLObjectFactory.makeSymbol("S#46627", "CYC");
        $ic25$ = SubLObjectFactory.makeString("http://xmlns.com/foaf/0.1/");
        $ic26$ = SubLObjectFactory.makeSymbol("S#46580", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#46629", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#46584", "CYC");
        $ic29$ = SubLObjectFactory.makeString("foaf:");
        $ic30$ = SubLObjectFactory.makeSymbol("S#46630", "CYC");
        $ic31$ = SubLObjectFactory.makeString("name");
        $ic32$ = SubLObjectFactory.makeString("prefLabel");
        $ic33$ = SubLObjectFactory.makeString("label");
        $ic34$ = SubLObjectFactory.makeString("altLabel");
        $ic35$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("prettyString"));
        $ic36$ = SubLObjectFactory.makeSymbol("S#46591", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic38$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic39$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("uriString"));
        $ic40$ = SubLObjectFactory.makeKeyword("GAF");
        $ic41$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic42$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("standardPrefixForURI"));
        $ic43$ = SubLObjectFactory.makeSymbol("S#46631", "CYC");
        $ic44$ = SubLObjectFactory.makeString("xmlns:");
        $ic45$ = SubLObjectFactory.makeString("xmlns");
        $ic46$ = SubLObjectFactory.makeSymbol("STRING=");
        $ic47$ = SubLObjectFactory.makeString("Can't find or create term for ~S");
        $ic48$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ResourceWithURIFn"));
        $ic49$ = SubLObjectFactory.makeString("type");
        $ic50$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic51$ = SubLObjectFactory.makeSymbol("?TERM");
        $ic52$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("rdfURI"));
        $ic53$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0699.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"));
        $ic55$ = SubLObjectFactory.makeString("~S is not a list node.");
        $ic56$ = SubLObjectFactory.makeString("nil");
        $ic57$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheEmptyList"));
        $ic58$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList"));
        $ic59$ = SubLObjectFactory.makeString("first");
        $ic60$ = SubLObjectFactory.makeSymbol("S#46526", "CYC");
        $ic61$ = SubLObjectFactory.makeString("rest");
        $ic62$ = SubLObjectFactory.makeSymbol("URL-P");
        $ic63$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application/rdf+xml"), (SubLObject)SubLObjectFactory.makeString("*/*;q=0.5"));
        $ic64$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic65$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic66$ = SubLObjectFactory.makeInteger(2000);
        $ic67$ = SubLObjectFactory.makeString("404");
        $ic68$ = SubLObjectFactory.makeString("Not Found");
        $ic69$ = SubLObjectFactory.makeString("Url not found.");
        $ic70$ = SubLObjectFactory.makeString("503 Service Temporarily Unavailable");
        $ic71$ = SubLObjectFactory.makeString("Server not available");
        $ic72$ = SubLObjectFactory.makeString("<?xml");
        $ic73$ = SubLObjectFactory.makeString("Not XML document. Starts with ");
        $ic74$ = SubLObjectFactory.makeString("Encountered error trying to download ~S:~% ~S");
        $ic75$ = SubLObjectFactory.makeSymbol("S#46508", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#46611", "CYC");
        $ic77$ = SubLObjectFactory.makeString("/");
        $ic78$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("rdf-type"));
        $ic79$ = SubLObjectFactory.makeSymbol("S#46615", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("STARTS-WITH");
        $ic81$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING"));
        $ic82$ = SubLObjectFactory.makeString("<");
        $ic83$ = SubLObjectFactory.makeString(">");
        $ic84$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ResourceWithURIFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#39641", "CYC")));
        $ic85$ = SubLObjectFactory.makeString("opencyc");
        $ic86$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("URLFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("URIFn")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0699.class
	Total time: 410 ms
	
	Decompiled with Procyon 0.5.32.
*/
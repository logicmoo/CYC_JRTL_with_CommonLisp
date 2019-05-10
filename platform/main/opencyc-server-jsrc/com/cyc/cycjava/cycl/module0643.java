package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0643 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0643";
    public static final String myFingerPrint = "ea02ff6d5c9ba41571b29f9e1e98badd263af772f09dcbfca8c8c675a5291858";
    public static SubLSymbol $g4986$;
    public static SubLSymbol $g4987$;
    public static SubLSymbol $g4988$;
    public static SubLSymbol $g4989$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    
    public static SubLObject f39160(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = $g4986$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = $g4986$.currentBinding(var3);
        try {
            $g4986$.bind(var2, var3);
            if (var1.isNumber()) {
                f39161(var1);
            }
            else if (var1.isString()) {
                f39162(var1);
            }
            else if (T.eql(var1)) {
                f39161((SubLObject)$ic0$);
            }
            else if (NIL.eql(var1)) {
                f39161((SubLObject)$ic1$);
            }
            else {
                Errors.error((SubLObject)$ic2$, var1);
            }
        }
        finally {
            $g4986$.rebind(var4, var3);
        }
        return var1;
    }
    
    public static SubLObject f39163(final SubLObject var5, final SubLObject var6) {
        final SubLObject var7 = var5.rest();
        final SubLObject var9;
        final SubLObject var8 = var9 = var7;
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic4$, (SubLObject)$ic5$, reader.bq_cons((SubLObject)$ic6$, ConsesLow.append(var9, (SubLObject)$ic7$)));
    }
    
    public static SubLObject f39164(final SubLObject var5, final SubLObject var6) {
        final SubLObject var7 = var5.rest();
        final SubLObject var9;
        final SubLObject var8 = var9 = var7;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic8$, ConsesLow.append(var9, (SubLObject)NIL));
    }
    
    public static SubLObject f39165(final SubLObject var5, final SubLObject var6) {
        final SubLObject var7 = var5.rest();
        final SubLObject var9;
        final SubLObject var8 = var9 = var7;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic9$, (SubLObject)$ic10$, (SubLObject)$ic11$, ConsesLow.append(var9, (SubLObject)$ic12$));
    }
    
    public static SubLObject f39166(final SubLObject var5, final SubLObject var6) {
        final SubLObject var7 = var5.rest();
        final SubLObject var9;
        final SubLObject var8 = var9 = var7;
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic13$, (SubLObject)$ic14$, reader.bq_cons((SubLObject)$ic6$, ConsesLow.append(var9, (SubLObject)$ic15$)));
    }
    
    public static SubLObject f39167(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic16$);
        var9 = var8.first();
        final SubLObject var10;
        var8 = (var10 = var8.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic9$, new SubLObject[] { ConsesLow.listS((SubLObject)$ic17$, var9, (SubLObject)$ic18$), $ic19$, $ic11$, ConsesLow.list((SubLObject)$ic20$, var9), $ic21$, ConsesLow.append(var10, (SubLObject)$ic22$) });
    }
    
    public static SubLObject f39168(final SubLObject var19, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = $g4986$.getDynamicValue();
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = $g4986$.currentBinding(var20);
        final SubLObject var22 = $g4987$.currentBinding(var20);
        try {
            $g4986$.bind(var2, var20);
            $g4987$.bind((SubLObject)NIL, var20);
            f39161((SubLObject)$ic23$);
            final SubLObject var4_21 = $g4988$.currentBinding(var20);
            try {
                $g4988$.bind(module0048.f_1X($g4988$.getDynamicValue(var20)), var20);
                for (SubLObject var23 = var19, var24 = (SubLObject)(var23.isList() ? NIL : Sequences.length(var23)), var25 = (SubLObject)ZERO_INTEGER, var26 = module0005.f149(var25, var24, var23); NIL == var26; var26 = module0005.f149(var25, var24, var23)) {
                    final SubLObject var27 = module0005.f150(var25, var23);
                    if (NIL != $g4987$.getDynamicValue(var20)) {
                        f39161((SubLObject)$ic24$);
                    }
                    f39169();
                    f39160(var27, (SubLObject)UNPROVIDED);
                    $g4987$.setDynamicValue((SubLObject)T, var20);
                    var23 = module0005.f151(var23);
                    var25 = Numbers.add(var25, (SubLObject)ONE_INTEGER);
                }
                f39161((SubLObject)$ic25$);
            }
            finally {
                $g4988$.rebind(var4_21, var20);
            }
        }
        finally {
            $g4987$.rebind(var22, var20);
            $g4986$.rebind(var21, var20);
        }
        return var19;
    }
    
    public static SubLObject f39161(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        return print_high.princ(var27, $g4986$.getDynamicValue(var28));
    }
    
    public static SubLObject f39162(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        return print_high.prin1(var27, $g4986$.getDynamicValue(var28));
    }
    
    public static SubLObject f39169() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        streams_high.terpri($g4986$.getDynamicValue(var3));
        f39170();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39170() {
        SubLThread var3;
        SubLObject var4;
        for (var3 = SubLProcess.currentSubLThread(), var4 = (SubLObject)NIL, var4 = (SubLObject)ZERO_INTEGER; var4.numL($g4988$.getDynamicValue(var3)); var4 = Numbers.add(var4, (SubLObject)ONE_INTEGER)) {
            f39161((SubLObject)Characters.CHAR_tab);
        }
        return $g4988$.getDynamicValue(var3);
    }
    
    public static SubLObject f39171() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0643", "f39160", "S#42902", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0643", "f39163", "S#42903");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0643", "f39164", "S#42904");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0643", "f39165", "S#42905");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0643", "f39166", "S#42906");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0643", "f39167", "S#42907");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0643", "f39168", "S#42908", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0643", "f39161", "S#42909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0643", "f39162", "S#42910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0643", "f39169", "S#42911", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0643", "f39170", "S#42912", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39172() {
        $g4986$ = SubLFiles.defparameter("S#42913", (SubLObject)T);
        $g4987$ = SubLFiles.defparameter("S#42914", (SubLObject)NIL);
        $g4988$ = SubLFiles.defparameter("S#42915", (SubLObject)ZERO_INTEGER);
        $g4989$ = SubLFiles.defparameter("S#42916", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39173() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f39171();
    }
    
    public void initializeVariables() {
        f39172();
    }
    
    public void runTopLevelForms() {
        f39173();
    }
    
    static {
        me = (SubLFile)new module0643();
        $g4986$ = null;
        $g4987$ = null;
        $g4988$ = null;
        $g4989$ = null;
        $ic0$ = makeString("true");
        $ic1$ = makeString("false");
        $ic2$ = makeString("Can't serialize ~S to JSON.");
        $ic3$ = makeSymbol("CLET");
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42914", "CYC"), (SubLObject)NIL));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#42909", "CYC"), (SubLObject)makeString("["));
        $ic6$ = makeSymbol("S#42904", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42909", "CYC"), (SubLObject)makeString("]")));
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42915", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("1+"), (SubLObject)makeSymbol("S#42915", "CYC"))));
        $ic9$ = makeSymbol("PROGN");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("PWHEN"), (SubLObject)makeSymbol("S#42914", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42909", "CYC"), (SubLObject)makeString(",")));
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#42911", "CYC"));
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#42914", "CYC"), (SubLObject)T));
        $ic13$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42916", "CYC"), (SubLObject)NIL));
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#42909", "CYC"), (SubLObject)makeString("{"));
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42909", "CYC"), (SubLObject)makeString("}")));
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic17$ = makeSymbol("CHECK-TYPE");
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("STRINGP"));
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("PWHEN"), (SubLObject)makeSymbol("S#42916", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42909", "CYC"), (SubLObject)makeString(",")));
        $ic20$ = makeSymbol("S#42910", "CYC");
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("S#42909", "CYC"), (SubLObject)makeString(": "));
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#42916", "CYC"), (SubLObject)T));
        $ic23$ = makeString("[");
        $ic24$ = makeString(",");
        $ic25$ = makeString("]");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 69 ms
	
	Decompiled with Procyon 0.5.32.
*/
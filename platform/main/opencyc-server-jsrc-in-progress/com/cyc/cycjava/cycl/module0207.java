package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0207 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0207";
    public static final String myFingerPrint = "9c6b172de675f1cda7b8e8735986fe64cb2b7072d1154ef8cdf656040ec1c6e8";
    
    public static SubLObject f13508(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var2.resetMultipleValues();
            final SubLObject var6 = module0206.f13502(var1);
            final SubLObject var7 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            var3 = var6;
            var4 = var7;
        }
        finally {
            module0206.$g2323$.rebind(var5, var2);
        }
        return Values.values(var3, var4);
    }
    
    public static SubLObject f13509(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13425(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13510(final SubLObject var9) {
        return (SubLObject)makeBoolean(NIL == module0202.f12590(var9) && NIL != f13509(var9));
    }
    
    public static SubLObject f13511(final SubLObject var9) {
        return (SubLObject)makeBoolean(NIL == module0202.f12590(var9) && NIL != module0206.f13425(var9));
    }
    
    public static SubLObject f13512(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13439(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13513(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13429(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13514(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13430(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13515(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13434(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13516(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13435(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13517(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13436(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13518(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13432(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13519(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13440(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13520(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13442(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13521(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13431(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13522(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13487(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13523(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13433(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13524(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13448(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13525(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13447(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13526(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13453(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13527(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13452(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13528(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13464(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13529(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13450(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13530(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13444(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13531(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0206.$g2323$.currentBinding(var2);
        try {
            module0206.$g2323$.bind((SubLObject)NIL, var2);
            var3 = module0206.f13451(var1);
        }
        finally {
            module0206.$g2323$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f13532() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13508", "S#16355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13509", "S#15496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13510", "S#16356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13511", "S#16357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13512", "S#16358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13513", "S#16359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13514", "S#16360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13515", "S#16361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13516", "S#16362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13517", "S#16363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13518", "S#16364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13519", "S#16365", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13520", "S#16366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13521", "S#16367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13522", "S#15513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13523", "S#16368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13524", "S#16369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13525", "S#16370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13526", "S#16371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13527", "S#16372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13528", "S#16373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13529", "S#16374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13530", "S#16375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0207", "f13531", "S#16376", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13533() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13534() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f13532();
    }
    
    public void initializeVariables() {
        f13533();
    }
    
    public void runTopLevelForms() {
        f13534();
    }
    
    static {
        me = (SubLFile)new module0207();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 68 ms
	
	Decompiled with Procyon 0.5.32.
*/
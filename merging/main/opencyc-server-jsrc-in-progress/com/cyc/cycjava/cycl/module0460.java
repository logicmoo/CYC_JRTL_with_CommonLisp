package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0460 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0460";
    public static final String myFingerPrint = "ed6b86ce3e1d3e01915f87c20021ad06596e92c67e903c1375a076228cf847cc";
    private static SubLSymbol $g3635$;
    private static SubLSymbol $g3636$;
    private static SubLSymbol $g3637$;
    private static SubLSymbol $g3638$;
    private static SubLSymbol $g3639$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLInteger $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLList $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLList $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLList $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLList $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLList $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLList $ic129$;
    private static final SubLObject $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLList $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLList $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLList $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLList $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLList $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLList $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLList $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLList $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLList $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLList $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLList $ic158$;
    private static final SubLObject $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLList $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLList $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLList $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLList $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLList $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLList $ic173$;
    private static final SubLObject $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLList $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLList $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLList $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLList $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLList $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLList $ic187$;
    private static final SubLObject $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLList $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLList $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLList $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLList $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLList $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLList $ic201$;
    private static final SubLObject $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLList $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLList $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLList $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLList $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLList $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLList $ic215$;
    private static final SubLObject $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLList $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLList $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLList $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLList $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLList $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLList $ic229$;
    private static final SubLObject $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLList $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLList $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLList $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLList $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLList $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLList $ic244$;
    private static final SubLObject $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLList $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLList $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLList $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLList $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLList $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLList $ic259$;
    private static final SubLObject $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLList $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLList $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLList $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLList $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLList $ic272$;
    private static final SubLSymbol $ic273$;
    private static final SubLList $ic274$;
    private static final SubLObject $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLList $ic277$;
    private static final SubLSymbol $ic278$;
    private static final SubLSymbol $ic279$;
    private static final SubLList $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLList $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLList $ic284$;
    private static final SubLObject $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLList $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLList $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLList $ic292$;
    private static final SubLSymbol $ic293$;
    private static final SubLList $ic294$;
    private static final SubLObject $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLList $ic297$;
    private static final SubLSymbol $ic298$;
    private static final SubLSymbol $ic299$;
    private static final SubLList $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLList $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLList $ic304$;
    private static final SubLObject $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLList $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLSymbol $ic309$;
    private static final SubLList $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLList $ic312$;
    private static final SubLSymbol $ic313$;
    private static final SubLList $ic314$;
    private static final SubLObject $ic315$;
    private static final SubLSymbol $ic316$;
    private static final SubLList $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLSymbol $ic319$;
    private static final SubLList $ic320$;
    private static final SubLSymbol $ic321$;
    private static final SubLList $ic322$;
    private static final SubLSymbol $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLList $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLList $ic327$;
    private static final SubLSymbol $ic328$;
    private static final SubLList $ic329$;
    private static final SubLObject $ic330$;
    private static final SubLSymbol $ic331$;
    private static final SubLList $ic332$;
    private static final SubLSymbol $ic333$;
    private static final SubLSymbol $ic334$;
    private static final SubLList $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLList $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLSymbol $ic339$;
    private static final SubLList $ic340$;
    private static final SubLSymbol $ic341$;
    private static final SubLList $ic342$;
    private static final SubLSymbol $ic343$;
    private static final SubLList $ic344$;
    private static final SubLObject $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLList $ic347$;
    private static final SubLSymbol $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLList $ic350$;
    private static final SubLSymbol $ic351$;
    private static final SubLList $ic352$;
    private static final SubLSymbol $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLList $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLList $ic357$;
    private static final SubLSymbol $ic358$;
    private static final SubLList $ic359$;
    
    public static SubLObject f31337(final SubLObject var1) {
        return module0052.f3709(module0328.f22178(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31338(final SubLObject var1) {
        return module0052.f3709(module0328.f22179(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31339(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22177(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22180(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31340(final SubLObject var1) {
        return module0052.f3709(module0328.f22185(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31341(final SubLObject var1) {
        return module0052.f3709(module0328.f22186(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31342(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22184(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22187(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31343(final SubLObject var1) {
        return module0052.f3709(module0328.f22192(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31344(final SubLObject var1) {
        return module0052.f3709(module0328.f22193(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31345(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22191(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22194(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31346(final SubLObject var1) {
        return module0052.f3709(module0328.f22199(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31347(final SubLObject var1) {
        return module0052.f3709(module0328.f22200(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31348(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22198(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22201(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31349(final SubLObject var1) {
        return module0052.f3709(module0328.f22206(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31350(final SubLObject var1) {
        return module0052.f3709(module0328.f22207(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31351(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22205(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22208(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31352(final SubLObject var1) {
        return module0052.f3709(module0328.f22213(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31353(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22212(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22214(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31354(final SubLObject var1) {
        return module0052.f3709(module0328.f22219(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31355(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22218(var5, var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0205.f13338(module0351.f23578($ic102$, (SubLObject)ConsesLow.list(var5, var6)));
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22220(var5, var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0205.f13338(module0351.f23578($ic102$, (SubLObject)ConsesLow.list(var5, var6)));
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31356(final SubLObject var1) {
        return module0052.f3709(module0328.f22225(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31357(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22224(var5, var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0205.f13338(module0351.f23578($ic116$, (SubLObject)ConsesLow.list(var5, var6)));
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22226(var5, var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0205.f13338(module0351.f23578($ic116$, (SubLObject)ConsesLow.list(var5, var6)));
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31358(final SubLObject var1) {
        return module0052.f3709(module0328.f22231(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31359(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22230(var5, var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0205.f13338(module0351.f23578($ic130$, (SubLObject)ConsesLow.list(var5, var6)));
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22232(var5, var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0205.f13338(module0351.f23578($ic130$, (SubLObject)ConsesLow.list(var5, var6)));
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31360(final SubLObject var1) {
        return module0052.f3709(module0328.f22237(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31361(final SubLObject var1) {
        return module0052.f3709(module0328.f22238(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31362(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22236(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22239(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31363(final SubLObject var1) {
        return module0052.f3709(module0328.f22245(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31364(final SubLObject var1) {
        return module0052.f3709(module0328.f22246(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31365(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22244(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22247(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31366(final SubLObject var1) {
        return module0052.f3709(module0328.f22252(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31367(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22251(var5, var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0205.f13338(module0351.f23578($ic174$, (SubLObject)ConsesLow.list(var5, var6)));
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22253(var5, var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0205.f13338(module0351.f23578($ic174$, (SubLObject)ConsesLow.list(var5, var6)));
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31368(final SubLObject var1) {
        return module0052.f3709(module0328.f22258(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31369(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22257(var5, var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0205.f13338(module0351.f23578($ic188$, (SubLObject)ConsesLow.list(var5, var6)));
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22259(var5, var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0205.f13338(module0351.f23578($ic188$, (SubLObject)ConsesLow.list(var5, var6)));
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31370(final SubLObject var1) {
        return module0052.f3709(module0328.f22264(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31371(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22263(var5, var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0205.f13338(module0351.f23578($ic202$, (SubLObject)ConsesLow.list(var5, var6)));
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22265(var5, var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0205.f13338(module0351.f23578($ic202$, (SubLObject)ConsesLow.list(var5, var6)));
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31372(final SubLObject var1) {
        return module0052.f3709(module0328.f22270(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31373(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22269(var5, var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0205.f13338(module0351.f23578($ic216$, (SubLObject)ConsesLow.list(var5, var6)));
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22271(var5, var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var7 = module0205.f13338(module0351.f23578($ic216$, (SubLObject)ConsesLow.list(var5, var6)));
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31374(final SubLObject var1) {
        return module0052.f3709(module0328.f22276(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31375(final SubLObject var1) {
        return module0052.f3709(module0328.f22277(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31376(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22275(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22278(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31377(final SubLObject var1) {
        return module0052.f3709(module0328.f22283(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31378(final SubLObject var1) {
        return module0052.f3709(module0328.f22284(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31379(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22282(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22285(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31380(final SubLObject var1) {
        return module0052.f3709(module0328.f22290(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31381(final SubLObject var1) {
        return module0052.f3709(module0328.f22291(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31382(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22289(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22292(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31383(final SubLObject var1) {
        return module0052.f3709(module0328.f22297(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31384(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22296(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22298(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31385(final SubLObject var1) {
        return module0052.f3709(module0328.f22303(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31386(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22302(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22304(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31387(final SubLObject var1) {
        return module0052.f3709(module0328.f22309(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31388(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22308(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22310(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31389(final SubLObject var1) {
        return module0052.f3709(module0328.f22315(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31390(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22314(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22316(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31391(final SubLObject var1) {
        return module0052.f3709(module0328.f22321(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31392(final SubLObject var1) {
        return module0052.f3709(module0328.f22322(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31393(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22320(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22323(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31394(final SubLObject var1) {
        return module0052.f3709(module0328.f22328(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31395(final SubLObject var1) {
        return module0052.f3709(module0328.f22329(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31396(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22327(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22330(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31397(final SubLObject var1) {
        return module0052.f3709(module0328.f22335(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31398(final SubLObject var1) {
        return module0052.f3709(module0328.f22336(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31399(final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = module0324.f21950(var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != module0018.$g646$.getDynamicValue(var4) && NIL == module0328.f22334(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic26$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0328.f22337(var5, var6, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic27$, module0205.f13338(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31400() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31337", "S#34636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31338", "S#34637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31339", "S#34638", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31340", "S#34639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31341", "S#34640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31342", "S#34641", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31343", "S#34642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31344", "S#34643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31345", "S#34644", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31346", "S#34645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31347", "S#34646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31348", "S#34647", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31349", "S#34648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31350", "S#34649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31351", "S#34650", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31352", "S#34651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31353", "S#34652", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31354", "S#34653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31355", "S#34654", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31356", "S#34655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31357", "S#34656", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31358", "S#34657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31359", "S#34658", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31360", "S#34659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31361", "S#34660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31362", "S#34661", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31363", "S#34662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31364", "S#34663", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31365", "S#34664", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31366", "S#34665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31367", "S#34666", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31368", "S#34667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31369", "S#34668", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31370", "S#34669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31371", "S#34670", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31372", "S#34671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31373", "S#34672", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31374", "S#34673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31375", "S#34674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31376", "S#34675", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31377", "S#34676", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31378", "S#34677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31379", "S#34678", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31380", "S#34679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31381", "S#34680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31382", "S#34681", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31383", "S#34682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31384", "S#34683", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31385", "S#34684", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31386", "S#34685", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31387", "S#34686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31388", "S#34687", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31389", "S#34688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31390", "S#34689", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31391", "S#34690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31392", "S#34691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31393", "S#34692", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31394", "S#34693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31395", "S#34694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31396", "S#34695", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31397", "S#34696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31398", "S#34697", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0460", "f31399", "S#34698", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31401() {
        $g3635$ = SubLFiles.deflexical("S#34699", (SubLObject)$ic0$);
        $g3636$ = SubLFiles.defparameter("S#34700", module0018.$g658$.getDynamicValue());
        $g3637$ = SubLFiles.defparameter("S#34701", (SubLObject)$ic12$);
        $g3638$ = SubLFiles.defparameter("S#34702", (SubLObject)$ic12$);
        $g3639$ = SubLFiles.defparameter("S#34703", (SubLObject)ONE_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31402() {
        module0340.f22941((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, new SubLObject[] { $ic3$, $ic4$, TWO_INTEGER, $ic5$, $ic6$, $ic7$, $ic8$, $ic9$, conses_high.copy_list($g3635$.getGlobalValue()), $ic10$ }));
        final SubLObject var8 = (SubLObject)$ic11$;
        final SubLObject var9 = $g3635$.getGlobalValue();
        SubLObject var10 = var8;
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            module0340.f22944(var11, (SubLObject)$ic1$);
            SubLObject var10_12 = var9;
            SubLObject var12 = (SubLObject)NIL;
            var12 = var10_12.first();
            while (NIL != var10_12) {
                module0340.f22944(var11, var12);
                var10_12 = var10_12.rest();
                var12 = var10_12.first();
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        module0340.f22938($ic13$);
        module0340.f22941((SubLObject)$ic14$, (SubLObject)$ic15$);
        module0012.f419((SubLObject)$ic16$);
        module0340.f22941((SubLObject)$ic17$, (SubLObject)$ic18$);
        module0358.f23730((SubLObject)$ic19$, (SubLObject)$ic20$);
        module0012.f419((SubLObject)$ic21$);
        module0340.f22941((SubLObject)$ic22$, (SubLObject)$ic23$);
        module0358.f23730((SubLObject)$ic24$, (SubLObject)$ic25$);
        module0340.f22941((SubLObject)$ic28$, (SubLObject)$ic29$);
        module0340.f22938($ic30$);
        module0340.f22941((SubLObject)$ic31$, (SubLObject)$ic32$);
        module0012.f419((SubLObject)$ic33$);
        module0340.f22941((SubLObject)$ic34$, (SubLObject)$ic35$);
        module0358.f23730((SubLObject)$ic36$, (SubLObject)$ic37$);
        module0012.f419((SubLObject)$ic38$);
        module0340.f22941((SubLObject)$ic39$, (SubLObject)$ic40$);
        module0358.f23730((SubLObject)$ic41$, (SubLObject)$ic42$);
        module0340.f22941((SubLObject)$ic43$, (SubLObject)$ic44$);
        module0340.f22938($ic45$);
        module0340.f22941((SubLObject)$ic46$, (SubLObject)$ic47$);
        module0012.f419((SubLObject)$ic48$);
        module0340.f22941((SubLObject)$ic49$, (SubLObject)$ic50$);
        module0358.f23730((SubLObject)$ic51$, (SubLObject)$ic52$);
        module0012.f419((SubLObject)$ic53$);
        module0340.f22941((SubLObject)$ic54$, (SubLObject)$ic55$);
        module0358.f23730((SubLObject)$ic56$, (SubLObject)$ic57$);
        module0340.f22941((SubLObject)$ic58$, (SubLObject)$ic59$);
        module0340.f22938($ic60$);
        module0340.f22941((SubLObject)$ic61$, (SubLObject)$ic62$);
        module0012.f419((SubLObject)$ic63$);
        module0340.f22941((SubLObject)$ic64$, (SubLObject)$ic65$);
        module0358.f23730((SubLObject)$ic66$, (SubLObject)$ic67$);
        module0012.f419((SubLObject)$ic68$);
        module0340.f22941((SubLObject)$ic69$, (SubLObject)$ic70$);
        module0358.f23730((SubLObject)$ic71$, (SubLObject)$ic72$);
        module0340.f22941((SubLObject)$ic73$, (SubLObject)$ic74$);
        module0340.f22938($ic75$);
        module0340.f22941((SubLObject)$ic76$, (SubLObject)$ic77$);
        module0012.f419((SubLObject)$ic78$);
        module0340.f22941((SubLObject)$ic79$, (SubLObject)$ic80$);
        module0358.f23730((SubLObject)$ic81$, (SubLObject)$ic82$);
        module0012.f419((SubLObject)$ic83$);
        module0340.f22941((SubLObject)$ic84$, (SubLObject)$ic85$);
        module0358.f23730((SubLObject)$ic86$, (SubLObject)$ic87$);
        module0340.f22941((SubLObject)$ic88$, (SubLObject)$ic89$);
        module0340.f22938($ic90$);
        module0358.f23774((SubLObject)$ic3$, $ic90$);
        module0340.f22941((SubLObject)$ic91$, (SubLObject)$ic92$);
        module0012.f419((SubLObject)$ic93$);
        module0340.f22941((SubLObject)$ic94$, (SubLObject)$ic95$);
        module0358.f23730((SubLObject)$ic96$, (SubLObject)$ic97$);
        module0340.f22941((SubLObject)$ic98$, (SubLObject)$ic99$);
        module0340.f22941((SubLObject)$ic100$, (SubLObject)$ic101$);
        module0340.f22938($ic102$);
        module0340.f22941((SubLObject)$ic103$, (SubLObject)$ic104$);
        module0012.f419((SubLObject)$ic105$);
        module0340.f22941((SubLObject)$ic106$, (SubLObject)$ic107$);
        module0358.f23730((SubLObject)$ic108$, (SubLObject)$ic109$);
        module0340.f22941((SubLObject)$ic110$, (SubLObject)$ic111$);
        module0358.f23730((SubLObject)$ic112$, (SubLObject)$ic113$);
        module0340.f22941((SubLObject)$ic114$, (SubLObject)$ic115$);
        module0340.f22938($ic116$);
        module0340.f22941((SubLObject)$ic117$, (SubLObject)$ic118$);
        module0012.f419((SubLObject)$ic119$);
        module0340.f22941((SubLObject)$ic120$, (SubLObject)$ic121$);
        module0358.f23730((SubLObject)$ic122$, (SubLObject)$ic123$);
        module0340.f22941((SubLObject)$ic124$, (SubLObject)$ic125$);
        module0358.f23730((SubLObject)$ic126$, (SubLObject)$ic127$);
        module0340.f22941((SubLObject)$ic128$, (SubLObject)$ic129$);
        module0340.f22938($ic130$);
        module0340.f22941((SubLObject)$ic131$, (SubLObject)$ic132$);
        module0012.f419((SubLObject)$ic133$);
        module0340.f22941((SubLObject)$ic134$, (SubLObject)$ic135$);
        module0358.f23730((SubLObject)$ic136$, (SubLObject)$ic137$);
        module0340.f22941((SubLObject)$ic138$, (SubLObject)$ic139$);
        module0358.f23730((SubLObject)$ic140$, (SubLObject)$ic141$);
        module0340.f22941((SubLObject)$ic142$, (SubLObject)$ic143$);
        module0340.f22938($ic144$);
        module0340.f22941((SubLObject)$ic145$, (SubLObject)$ic146$);
        module0012.f419((SubLObject)$ic147$);
        module0340.f22941((SubLObject)$ic148$, (SubLObject)$ic149$);
        module0358.f23730((SubLObject)$ic150$, (SubLObject)$ic151$);
        module0012.f419((SubLObject)$ic152$);
        module0340.f22941((SubLObject)$ic153$, (SubLObject)$ic154$);
        module0358.f23730((SubLObject)$ic155$, (SubLObject)$ic156$);
        module0340.f22941((SubLObject)$ic157$, (SubLObject)$ic158$);
        module0340.f22938($ic159$);
        module0340.f22941((SubLObject)$ic160$, (SubLObject)$ic161$);
        module0012.f419((SubLObject)$ic162$);
        module0340.f22941((SubLObject)$ic163$, (SubLObject)$ic164$);
        module0358.f23730((SubLObject)$ic165$, (SubLObject)$ic166$);
        module0012.f419((SubLObject)$ic167$);
        module0340.f22941((SubLObject)$ic168$, (SubLObject)$ic169$);
        module0358.f23730((SubLObject)$ic170$, (SubLObject)$ic171$);
        module0340.f22941((SubLObject)$ic172$, (SubLObject)$ic173$);
        module0340.f22938($ic174$);
        module0340.f22941((SubLObject)$ic175$, (SubLObject)$ic176$);
        module0012.f419((SubLObject)$ic177$);
        module0340.f22941((SubLObject)$ic178$, (SubLObject)$ic179$);
        module0358.f23730((SubLObject)$ic180$, (SubLObject)$ic181$);
        module0340.f22941((SubLObject)$ic182$, (SubLObject)$ic183$);
        module0358.f23730((SubLObject)$ic184$, (SubLObject)$ic185$);
        module0340.f22941((SubLObject)$ic186$, (SubLObject)$ic187$);
        module0340.f22938($ic188$);
        module0340.f22941((SubLObject)$ic189$, (SubLObject)$ic190$);
        module0012.f419((SubLObject)$ic191$);
        module0340.f22941((SubLObject)$ic192$, (SubLObject)$ic193$);
        module0358.f23730((SubLObject)$ic194$, (SubLObject)$ic195$);
        module0340.f22941((SubLObject)$ic196$, (SubLObject)$ic197$);
        module0358.f23730((SubLObject)$ic198$, (SubLObject)$ic199$);
        module0340.f22941((SubLObject)$ic200$, (SubLObject)$ic201$);
        module0340.f22938($ic202$);
        module0340.f22941((SubLObject)$ic203$, (SubLObject)$ic204$);
        module0012.f419((SubLObject)$ic205$);
        module0340.f22941((SubLObject)$ic206$, (SubLObject)$ic207$);
        module0358.f23730((SubLObject)$ic208$, (SubLObject)$ic209$);
        module0340.f22941((SubLObject)$ic210$, (SubLObject)$ic211$);
        module0358.f23730((SubLObject)$ic212$, (SubLObject)$ic213$);
        module0340.f22941((SubLObject)$ic214$, (SubLObject)$ic215$);
        module0340.f22938($ic216$);
        module0340.f22941((SubLObject)$ic217$, (SubLObject)$ic218$);
        module0012.f419((SubLObject)$ic219$);
        module0340.f22941((SubLObject)$ic220$, (SubLObject)$ic221$);
        module0358.f23730((SubLObject)$ic222$, (SubLObject)$ic223$);
        module0340.f22941((SubLObject)$ic224$, (SubLObject)$ic225$);
        module0358.f23730((SubLObject)$ic226$, (SubLObject)$ic227$);
        module0340.f22941((SubLObject)$ic228$, (SubLObject)$ic229$);
        module0340.f22938($ic230$);
        module0340.f22941((SubLObject)$ic231$, (SubLObject)$ic232$);
        module0012.f419((SubLObject)$ic233$);
        module0340.f22941((SubLObject)$ic234$, (SubLObject)$ic235$);
        module0358.f23730((SubLObject)$ic236$, (SubLObject)$ic237$);
        module0012.f419((SubLObject)$ic238$);
        module0340.f22941((SubLObject)$ic239$, (SubLObject)$ic240$);
        module0358.f23730((SubLObject)$ic241$, (SubLObject)$ic242$);
        module0340.f22941((SubLObject)$ic243$, (SubLObject)$ic244$);
        module0340.f22938($ic245$);
        module0340.f22941((SubLObject)$ic246$, (SubLObject)$ic247$);
        module0012.f419((SubLObject)$ic248$);
        module0340.f22941((SubLObject)$ic249$, (SubLObject)$ic250$);
        module0358.f23730((SubLObject)$ic251$, (SubLObject)$ic252$);
        module0012.f419((SubLObject)$ic253$);
        module0340.f22941((SubLObject)$ic254$, (SubLObject)$ic255$);
        module0358.f23730((SubLObject)$ic256$, (SubLObject)$ic257$);
        module0340.f22941((SubLObject)$ic258$, (SubLObject)$ic259$);
        module0340.f22938($ic260$);
        module0340.f22941((SubLObject)$ic261$, (SubLObject)$ic262$);
        module0012.f419((SubLObject)$ic263$);
        module0340.f22941((SubLObject)$ic264$, (SubLObject)$ic265$);
        module0358.f23730((SubLObject)$ic266$, (SubLObject)$ic267$);
        module0012.f419((SubLObject)$ic268$);
        module0340.f22941((SubLObject)$ic269$, (SubLObject)$ic270$);
        module0358.f23730((SubLObject)$ic271$, (SubLObject)$ic272$);
        module0340.f22941((SubLObject)$ic273$, (SubLObject)$ic274$);
        module0340.f22938($ic275$);
        module0340.f22941((SubLObject)$ic276$, (SubLObject)$ic277$);
        module0012.f419((SubLObject)$ic278$);
        module0340.f22941((SubLObject)$ic279$, (SubLObject)$ic280$);
        module0358.f23730((SubLObject)$ic281$, (SubLObject)$ic282$);
        module0340.f22941((SubLObject)$ic283$, (SubLObject)$ic284$);
        module0340.f22938($ic285$);
        module0340.f22941((SubLObject)$ic286$, (SubLObject)$ic287$);
        module0012.f419((SubLObject)$ic288$);
        module0340.f22941((SubLObject)$ic289$, (SubLObject)$ic290$);
        module0358.f23730((SubLObject)$ic291$, (SubLObject)$ic292$);
        module0340.f22941((SubLObject)$ic293$, (SubLObject)$ic294$);
        module0340.f22938($ic295$);
        module0340.f22941((SubLObject)$ic296$, (SubLObject)$ic297$);
        module0012.f419((SubLObject)$ic298$);
        module0340.f22941((SubLObject)$ic299$, (SubLObject)$ic300$);
        module0358.f23730((SubLObject)$ic301$, (SubLObject)$ic302$);
        module0340.f22941((SubLObject)$ic303$, (SubLObject)$ic304$);
        module0340.f22938($ic305$);
        module0340.f22941((SubLObject)$ic306$, (SubLObject)$ic307$);
        module0012.f419((SubLObject)$ic308$);
        module0340.f22941((SubLObject)$ic309$, (SubLObject)$ic310$);
        module0358.f23730((SubLObject)$ic311$, (SubLObject)$ic312$);
        module0340.f22941((SubLObject)$ic313$, (SubLObject)$ic314$);
        module0340.f22938($ic315$);
        module0340.f22941((SubLObject)$ic316$, (SubLObject)$ic317$);
        module0012.f419((SubLObject)$ic318$);
        module0340.f22941((SubLObject)$ic319$, (SubLObject)$ic320$);
        module0358.f23730((SubLObject)$ic321$, (SubLObject)$ic322$);
        module0012.f419((SubLObject)$ic323$);
        module0340.f22941((SubLObject)$ic324$, (SubLObject)$ic325$);
        module0358.f23730((SubLObject)$ic326$, (SubLObject)$ic327$);
        module0340.f22941((SubLObject)$ic328$, (SubLObject)$ic329$);
        module0340.f22938($ic330$);
        module0340.f22941((SubLObject)$ic331$, (SubLObject)$ic332$);
        module0012.f419((SubLObject)$ic333$);
        module0340.f22941((SubLObject)$ic334$, (SubLObject)$ic335$);
        module0358.f23730((SubLObject)$ic336$, (SubLObject)$ic337$);
        module0012.f419((SubLObject)$ic338$);
        module0340.f22941((SubLObject)$ic339$, (SubLObject)$ic340$);
        module0358.f23730((SubLObject)$ic341$, (SubLObject)$ic342$);
        module0340.f22941((SubLObject)$ic343$, (SubLObject)$ic344$);
        module0340.f22938($ic345$);
        module0340.f22941((SubLObject)$ic346$, (SubLObject)$ic347$);
        module0012.f419((SubLObject)$ic348$);
        module0340.f22941((SubLObject)$ic349$, (SubLObject)$ic350$);
        module0358.f23730((SubLObject)$ic351$, (SubLObject)$ic352$);
        module0012.f419((SubLObject)$ic353$);
        module0340.f22941((SubLObject)$ic354$, (SubLObject)$ic355$);
        module0358.f23730((SubLObject)$ic356$, (SubLObject)$ic357$);
        module0340.f22941((SubLObject)$ic358$, (SubLObject)$ic359$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31400();
    }
    
    public void initializeVariables() {
        f31401();
    }
    
    public void runTopLevelForms() {
        f31402();
    }
    
    static {
        me = (SubLFile)new module0460();
        $g3635$ = null;
        $g3636$ = null;
        $g3637$ = null;
        $g3638$ = null;
        $g3639$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { makeKeyword("REMOVAL-LOOKUP-POS"), makeKeyword("REMOVAL-LOOKUP-NEG"), makeKeyword("REMOVAL-GENLPREDS-LOOKUP-POS"), makeKeyword("REMOVAL-GENLPREDS-LOOKUP-NEG"), makeKeyword("REMOVAL-GENLPREDS-PRED-INDEX-POS"), makeKeyword("REMOVAL-GENLPREDS-PRED-INDEX-NEG"), makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-POS"), makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-NEG"), makeKeyword("REMOVAL-GENLINVERSE-PRED-INDEX-POS"), makeKeyword("REMOVAL-GENLINVERSE-PRED-INDEX-NEG"), makeKeyword("REMOVAL-NEGATIONPREDS-LOOKUP"), makeKeyword("REMOVAL-REFLEXIVE-MAP"), makeKeyword("REMOVAL-IRREFLEXIVE-ONE-ARG"), makeKeyword("REMOVAL-IRREFLEXIVE-MAP"), makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG"), makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-CHECK"), makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-UNIFY"), makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-CHECK"), makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-UNIFY"), makeKeyword("REMOVAL-REFLEXIVE-BOTH"), makeKeyword("REMOVAL-REFLEXIVE-ONE-ARG") });
        $ic1$ = makeKeyword("SBHL-TIME-TOTAL-EXCLUSIVITY-POS");
        $ic2$ = makeKeyword("SENSE");
        $ic3$ = makeKeyword("POS");
        $ic4$ = makeKeyword("ARITY");
        $ic5$ = makeKeyword("REQUIRED-PATTERN");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#18658", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")));
        $ic7$ = makeKeyword("EXCLUSIVE");
        $ic8$ = makeSymbol("TRUE");
        $ic9$ = makeKeyword("SUPPLANTS");
        $ic10$ = ConsesLow.list((SubLObject)makeKeyword("REQUIRED"), (SubLObject)makeSymbol("FALSE"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("An exclusivity module that identifies when SBHL time will totally handle a problem."));
        $ic11$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), constant_handles_oc.f8479((SubLObject)makeString("startingDate")), constant_handles_oc.f8479((SubLObject)makeString("endingDate")), constant_handles_oc.f8479((SubLObject)makeString("birthDate")), constant_handles_oc.f8479((SubLObject)makeString("dateOfDeath")), constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")) });
        $ic12$ = makeInteger(200);
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf"));
        $ic14$ = makeKeyword("REMOVAL-STARTS-AFTER-STARTING-OF");
        $ic15$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("STARTS-AFTER-STARTING-OF?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsAfterStartingOf <TemporalThing> <TemporalThing>)") });
        $ic16$ = makeSymbol("S#34636", "CYC");
        $ic17$ = makeKeyword("REMOVAL-ALL-STARTS-AFTER-STARTING-OF");
        $ic18$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34636", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsAfterStartingOf <TemporalThing> <not-fully-bound>)") });
        $ic19$ = makeKeyword("ALL-STARTS-AFTER-STARTING-OF-POS");
        $ic20$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic21$ = makeSymbol("S#34637", "CYC");
        $ic22$ = makeKeyword("REMOVAL-ALL-STARTS-AFTER-STARTING-OF-INVERSE");
        $ic23$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34637", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsAfterStartingOf <not-fully-bound> <TemporalThing>)") });
        $ic24$ = makeKeyword("ALL-STARTS-AFTER-STARTING-OF-INVERSE-POS");
        $ic25$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic26$ = makeKeyword("MINIMIZE");
        $ic27$ = makeKeyword("TIME");
        $ic28$ = makeKeyword("REMOVAL-NOT-STARTS-AFTER-STARTING-OF");
        $ic29$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterStartingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34638", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$startsAfterStartingOf <TemporalThing> <TemporalThing>))") });
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf"));
        $ic31$ = makeKeyword("REMOVAL-STARTS-AFTER-ENDING-OF");
        $ic32$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("STARTS-AFTER-ENDING-OF?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsAfterEndingOf <TemporalThing> <TemporalThing>)") });
        $ic33$ = makeSymbol("S#34639", "CYC");
        $ic34$ = makeKeyword("REMOVAL-ALL-STARTS-AFTER-ENDING-OF");
        $ic35$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34639", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsAfterEndingOf <TemporalThing> <not-fully-bound>)") });
        $ic36$ = makeKeyword("ALL-STARTS-AFTER-ENDING-OF-POS");
        $ic37$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic38$ = makeSymbol("S#34640", "CYC");
        $ic39$ = makeKeyword("REMOVAL-ALL-STARTS-AFTER-ENDING-OF-INVERSE");
        $ic40$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34640", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsAfterEndingOf <not-fully-bound> <TemporalThing>)") });
        $ic41$ = makeKeyword("ALL-STARTS-AFTER-ENDING-OF-INVERSE-POS");
        $ic42$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic43$ = makeKeyword("REMOVAL-NOT-STARTS-AFTER-ENDING-OF");
        $ic44$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34641", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$startsAfterEndingOf <TemporalThing> <TemporalThing>))") });
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf"));
        $ic46$ = makeKeyword("REMOVAL-ENDS-AFTER-STARTING-OF");
        $ic47$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ENDS-AFTER-STARTING-OF?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsAfterStartingOf <TemporalThing> <TemporalThing>)") });
        $ic48$ = makeSymbol("S#34642", "CYC");
        $ic49$ = makeKeyword("REMOVAL-ALL-ENDS-AFTER-STARTING-OF");
        $ic50$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34642", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsAfterStartingOf <TemporalThing> <not-fully-bound>)") });
        $ic51$ = makeKeyword("ALL-ENDS-AFTER-STARTING-OF-POS");
        $ic52$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic53$ = makeSymbol("S#34643", "CYC");
        $ic54$ = makeKeyword("REMOVAL-ALL-ENDS-AFTER-STARTING-OF-INVERSE");
        $ic55$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34643", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsAfterStartingOf <not-fully-bound> <TemporalThing>)") });
        $ic56$ = makeKeyword("ALL-ENDS-AFTER-STARTING-OF-INVERSE-POS");
        $ic57$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic58$ = makeKeyword("REMOVAL-NOT-ENDS-AFTER-STARTING-OF");
        $ic59$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterStartingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34644", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$endsAfterStartingOf <TemporalThing> <TemporalThing>))") });
        $ic60$ = constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf"));
        $ic61$ = makeKeyword("REMOVAL-ENDS-AFTER-ENDING-OF");
        $ic62$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ENDS-AFTER-ENDING-OF?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsAfterEndingOf <TemporalThing> <TemporalThing>)") });
        $ic63$ = makeSymbol("S#34645", "CYC");
        $ic64$ = makeKeyword("REMOVAL-ALL-ENDS-AFTER-ENDING-OF");
        $ic65$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34645", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsAfterEndingOf <TemporalThing> <not-fully-bound>)") });
        $ic66$ = makeKeyword("ALL-ENDS-AFTER-ENDING-OF-POS");
        $ic67$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic68$ = makeSymbol("S#34646", "CYC");
        $ic69$ = makeKeyword("REMOVAL-ALL-ENDS-AFTER-ENDING-OF-INVERSE");
        $ic70$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34646", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsAfterEndingOf <not-fully-bound> <TemporalThing>)") });
        $ic71$ = makeKeyword("ALL-ENDS-AFTER-ENDING-OF-INVERSE-POS");
        $ic72$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic73$ = makeKeyword("REMOVAL-NOT-ENDS-AFTER-ENDING-OF");
        $ic74$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsAfterEndingOf")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34647", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$endsAfterEndingOf <TemporalThing> <TemporalThing>))") });
        $ic75$ = constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes"));
        $ic76$ = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES");
        $ic77$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("TEMPORALLY-SUBSUMES?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes <TemporalThing> <TemporalThing>)") });
        $ic78$ = makeSymbol("S#34648", "CYC");
        $ic79$ = makeKeyword("REMOVAL-ALL-TEMPORALLY-SUBSUMES");
        $ic80$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34648", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes <TemporalThing> <not-fully-bound>)") });
        $ic81$ = makeKeyword("ALL-TEMPORALLY-SUBSUMES-POS");
        $ic82$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic83$ = makeSymbol("S#34649", "CYC");
        $ic84$ = makeKeyword("REMOVAL-ALL-TEMPORALLY-SUBSUMES-INVERSE");
        $ic85$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34649", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes <not-fully-bound> <TemporalThing>)") });
        $ic86$ = makeKeyword("ALL-TEMPORALLY-SUBSUMES-INVERSE-POS");
        $ic87$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic88$ = makeKeyword("REMOVAL-NOT-TEMPORALLY-SUBSUMES");
        $ic89$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34650", "CYC") });
        $ic90$ = constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent"));
        $ic91$ = makeKeyword("REMOVAL-DATE-OF-EVENT");
        $ic92$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#10058", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13151", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#10058", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10058", "CYC"), (SubLObject)makeSymbol("S#13151", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#10058", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10058", "CYC"), (SubLObject)makeSymbol("S#13151", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#24761", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#10058", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$dateOfEvent <Event> <Date>)") });
        $ic93$ = makeSymbol("S#34651", "CYC");
        $ic94$ = makeKeyword("REMOVAL-ALL-DATE-OF-EVENT-INVERSE");
        $ic95$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13151", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34651", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$dateOfEvent <not-fully-bound> <Date>)") });
        $ic96$ = makeKeyword("ALL-DATE-OF-EVENT-INVERSE-POS");
        $ic97$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic98$ = makeKeyword("REMOVAL-NOT-DATE-OF-EVENT");
        $ic99$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34652", "CYC") });
        $ic100$ = makeKeyword("REMOVAL-DATE-OF-EVENT-DELAY");
        $ic101$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeKeyword("VARIABLE")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("REQUIRED"), makeSymbol("FALSE"), makeKeyword("DOCUMENTATION"), makeString("Delay module that ensures that \n    (#$dateOfEvent <variable> <variable>)\n    is not worked on"), makeKeyword("EXAMPLE"), makeString("(#$dateOfEvent ?X ?Y)") });
        $ic102$ = constant_handles_oc.f8479((SubLObject)makeString("cotemporal"));
        $ic103$ = makeKeyword("REMOVAL-COTEMPORAL");
        $ic104$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("COTEMPORAL?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$cotemporal <TemporalThing> <TemporalThing>)") });
        $ic105$ = makeSymbol("S#34653", "CYC");
        $ic106$ = makeKeyword("REMOVAL-ALL-COTEMPORAL");
        $ic107$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34653", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$cotemporal <TemporalThing> <not-fully-bound>)") });
        $ic108$ = makeKeyword("ALL-COTEMPORAL-POS");
        $ic109$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic110$ = makeKeyword("REMOVAL-ALL-COTEMPORAL-INVERSE");
        $ic111$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34653", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$cotemporal <not-fully-bound> <TemporalThing>)") });
        $ic112$ = makeKeyword("ALL-COTEMPORAL-INVERSE-POS");
        $ic113$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic114$ = makeKeyword("REMOVAL-NOT-COTEMPORAL");
        $ic115$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cotemporal")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34654", "CYC") });
        $ic116$ = constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects"));
        $ic117$ = makeKeyword("REMOVAL-TEMPORALLY-INTERSECTS");
        $ic118$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#24773", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyIntersects <TemporalThing> <TemporalThing>)") });
        $ic119$ = makeSymbol("S#34655", "CYC");
        $ic120$ = makeKeyword("REMOVAL-ALL-TEMPORALLY-INTERSECTS");
        $ic121$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34655", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyIntersects <TemporalThing> <not-fully-bound>)") });
        $ic122$ = makeKeyword("ALL-TEMPORALLY-INTERSECTS-POS");
        $ic123$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic124$ = makeKeyword("REMOVAL-ALL-TEMPORALLY-INTERSECTS-INVERSE");
        $ic125$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34655", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyIntersects <not-fully-bound> <TemporalThing>)") });
        $ic126$ = makeKeyword("ALL-TEMPORALLY-INTERSECTS-INVERSE-POS");
        $ic127$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic128$ = makeKeyword("REMOVAL-NOT-TEMPORALLY-INTERSECTS");
        $ic129$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34656", "CYC") });
        $ic130$ = constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint"));
        $ic131$ = makeKeyword("REMOVAL-TEMPORALLY-DISJOINT");
        $ic132$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#23551", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyDisjoint <TemporalThing> <TemporalThing>)") });
        $ic133$ = makeSymbol("S#34657", "CYC");
        $ic134$ = makeKeyword("REMOVAL-ALL-TEMPORALLY-DISJOINT");
        $ic135$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34657", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyDisjoint <TemporalThing> <not-fully-bound>)") });
        $ic136$ = makeKeyword("ALL-TEMPORALLY-DISJOINT-POS");
        $ic137$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic138$ = makeKeyword("REMOVAL-ALL-TEMPORALLY-DISJOINT-INVERSE");
        $ic139$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34657", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyDisjoint <not-fully-bound> <TemporalThing>)") });
        $ic140$ = makeKeyword("ALL-TEMPORALLY-DISJOINT-INVERSE-POS");
        $ic141$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic142$ = makeKeyword("REMOVAL-NOT-TEMPORALLY-DISJOINT");
        $ic143$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyDisjoint")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34658", "CYC") });
        $ic144$ = constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain"));
        $ic145$ = makeKeyword("REMOVAL-TEMPORAL-BOUNDS-CONTAIN");
        $ic146$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("TEMPORAL-BOUNDS-CONTAIN?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsContain <TemporalThing> <TemporalThing>)") });
        $ic147$ = makeSymbol("S#34659", "CYC");
        $ic148$ = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN");
        $ic149$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34659", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsContain <TemporalThing> <not-fully-bound>)") });
        $ic150$ = makeKeyword("ALL-TEMPORAL-BOUNDS-CONTAIN-POS");
        $ic151$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic152$ = makeSymbol("S#34660", "CYC");
        $ic153$ = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE");
        $ic154$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34660", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsContain <not-fully-bound> <TemporalThing>)") });
        $ic155$ = makeKeyword("ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE-POS");
        $ic156$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic157$ = makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN");
        $ic158$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsContain")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34661", "CYC") });
        $ic159$ = constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume"));
        $ic160$ = makeKeyword("REMOVAL-TEMPORAL-BOUNDS-SUBSUME");
        $ic161$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#24790", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsSubsume <TemporalThing> <TemporalThing>)") });
        $ic162$ = makeSymbol("S#34662", "CYC");
        $ic163$ = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME");
        $ic164$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34662", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsSubsume <TemporalThing> <not-fully-bound>)") });
        $ic165$ = makeKeyword("ALL-TEMPORAL-BOUNDS-SUBSUME-POS");
        $ic166$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic167$ = makeSymbol("S#34663", "CYC");
        $ic168$ = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE");
        $ic169$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34663", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsSubsume <not-fully-bound> <TemporalThing>)") });
        $ic170$ = makeKeyword("ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE-POS");
        $ic171$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic172$ = makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME");
        $ic173$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsSubsume")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34664", "CYC") });
        $ic174$ = constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical"));
        $ic175$ = makeKeyword("REMOVAL-TEMPORAL-BOUNDS-IDENTICAL");
        $ic176$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("TEMPORAL-BOUNDS-IDENTICAL?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsIdentical <TemporalThing> <TemporalThing>)") });
        $ic177$ = makeSymbol("S#34665", "CYC");
        $ic178$ = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL");
        $ic179$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34665", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsIdentical <TemporalThing> <not-fully-bound>)") });
        $ic180$ = makeKeyword("ALL-TEMPORAL-BOUNDS-IDENTICAL-POS");
        $ic181$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic182$ = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-INVERSE");
        $ic183$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34665", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsIdentical <not-fully-bound> <TemporalThing>)") });
        $ic184$ = makeKeyword("ALL-TEMPORAL-BOUNDS-IDENTICAL-INVERSE-POS");
        $ic185$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic186$ = makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL");
        $ic187$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIdentical")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34666", "CYC") });
        $ic188$ = constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect"));
        $ic189$ = makeKeyword("REMOVAL-TEMPORAL-BOUNDS-INTERSECT");
        $ic190$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("TEMPORAL-BOUNDS-INTERSECT?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsIntersect <TemporalThing> <TemporalThing>)") });
        $ic191$ = makeSymbol("S#34667", "CYC");
        $ic192$ = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT");
        $ic193$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34667", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsIntersect <TemporalThing> <not-fully-bound>)") });
        $ic194$ = makeKeyword("ALL-TEMPORAL-BOUNDS-INTERSECT-POS");
        $ic195$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic196$ = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-INVERSE");
        $ic197$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34667", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsIntersect <not-fully-bound> <TemporalThing>)") });
        $ic198$ = makeKeyword("ALL-TEMPORAL-BOUNDS-INTERSECT-INVERSE-POS");
        $ic199$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic200$ = makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT");
        $ic201$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporalBoundsIntersect")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34668", "CYC") });
        $ic202$ = constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating"));
        $ic203$ = makeKeyword("REMOVAL-TEMPORALLY-COORIGINATING");
        $ic204$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("TEMPORALLY-COORIGINATING?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyCooriginating <TemporalThing> <TemporalThing>)") });
        $ic205$ = makeSymbol("S#34669", "CYC");
        $ic206$ = makeKeyword("REMOVAL-ALL-TEMPORALLY-COORIGINATING");
        $ic207$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34669", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyCooriginating <TemporalThing> <not-fully-bound>") });
        $ic208$ = makeKeyword("ALL-TEMPORALLY-COORIGINATING-POS");
        $ic209$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic210$ = makeKeyword("REMOVAL-ALL-TEMPORALLY-COORIGINATING-INVERSE");
        $ic211$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34669", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyCooriginating <not-fully-bound> <TemporalThing>)") });
        $ic212$ = makeKeyword("ALL-TEMPORALLY-COORIGINATING-INVERSE-POS");
        $ic213$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic214$ = makeKeyword("REMOVAL-NOT-TEMPORALLY-COORIGINATING");
        $ic215$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCooriginating")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34670", "CYC") });
        $ic216$ = constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal"));
        $ic217$ = makeKeyword("REMOVAL-TEMPORALLY-COTERMINAL");
        $ic218$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("TEMPORALLY-COTERMINAL?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyCoterminal <TemporalThing> <TemporalThing>)") });
        $ic219$ = makeSymbol("S#34671", "CYC");
        $ic220$ = makeKeyword("REMOVAL-ALL-TEMPORALLY-COTERMINAL");
        $ic221$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34671", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyCoterminal <TemporalThing> <not-fully-bound>") });
        $ic222$ = makeKeyword("ALL-TEMPORALLY-COTERMINAL-POS");
        $ic223$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic224$ = makeKeyword("REMOVAL-ALL-TEMPORALLY-COTERMINAL-INVERSE");
        $ic225$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34671", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyCoterminal <not-fully-bound> <TemporalThing>)") });
        $ic226$ = makeKeyword("ALL-TEMPORALLY-COTERMINAL-INVERSE-POS");
        $ic227$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic228$ = makeKeyword("REMOVAL-NOT-TEMPORALLY-COTERMINAL");
        $ic229$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyCoterminal")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34672", "CYC") });
        $ic230$ = constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter"));
        $ic231$ = makeKeyword("REMOVAL-CONTIGUOUS-AFTER");
        $ic232$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("CONTIGUOUS-AFTER?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$contiguousAfter <TemporalThing> <TemporalThing>)") });
        $ic233$ = makeSymbol("S#34673", "CYC");
        $ic234$ = makeKeyword("REMOVAL-ALL-CONTIGUOUS-AFTER");
        $ic235$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34673", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$contiguousAfter <TemporalThing> <not-fully-bound>)") });
        $ic236$ = makeKeyword("ALL-CONTIGUOUS-AFTER-POS");
        $ic237$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic238$ = makeSymbol("S#34674", "CYC");
        $ic239$ = makeKeyword("REMOVAL-ALL-CONTIGUOUS-AFTER-INVERSE");
        $ic240$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34674", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$contiguousAfter <not-fully-bound> <TemporalThing>)") });
        $ic241$ = makeKeyword("ALL-CONTIGUOUS-AFTER-INVERSE-POS");
        $ic242$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic243$ = makeKeyword("REMOVAL-NOT-CONTIGUOUS-AFTER");
        $ic244$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("contiguousAfter")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34675", "CYC") });
        $ic245$ = constant_handles_oc.f8479((SubLObject)makeString("startsDuring"));
        $ic246$ = makeKeyword("REMOVAL-STARTS-DURING");
        $ic247$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("STARTS-DURING?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsDuring <TemporalThing> <TemporalThing>)") });
        $ic248$ = makeSymbol("S#34676", "CYC");
        $ic249$ = makeKeyword("REMOVAL-ALL-STARTS-DURING");
        $ic250$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34676", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsDuring <TemporalThing> <not-fully-bound>)") });
        $ic251$ = makeKeyword("ALL-STARTS-DURING-POS");
        $ic252$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic253$ = makeSymbol("S#34677", "CYC");
        $ic254$ = makeKeyword("REMOVAL-ALL-STARTS-DURING-INVERSE");
        $ic255$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34677", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsDuring <not-fully-bound> <TemporalThing>)") });
        $ic256$ = makeKeyword("ALL-STARTS-DURING-INVERSE-POS");
        $ic257$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic258$ = makeKeyword("REMOVAL-NOT-STARTS-DURING");
        $ic259$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startsDuring")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34678", "CYC") });
        $ic260$ = constant_handles_oc.f8479((SubLObject)makeString("endsDuring"));
        $ic261$ = makeKeyword("REMOVAL-ENDS-DURING");
        $ic262$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ENDS-DURING?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsDuring <TemporalThing> <TemporalThing>)") });
        $ic263$ = makeSymbol("S#34679", "CYC");
        $ic264$ = makeKeyword("REMOVAL-ALL-ENDS-DURING");
        $ic265$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34679", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsDuring <TemporalThing> <not-fully-bound>)") });
        $ic266$ = makeKeyword("ALL-ENDS-DURING-POS");
        $ic267$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic268$ = makeSymbol("S#34680", "CYC");
        $ic269$ = makeKeyword("REMOVAL-ALL-ENDS-DURING-INVERSE");
        $ic270$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34680", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsDuring <not-fully-bound> <TemporalThing>)") });
        $ic271$ = makeKeyword("ALL-ENDS-DURING-INVERSE-POS");
        $ic272$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic273$ = makeKeyword("REMOVAL-NOT-ENDS-DURING");
        $ic274$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endsDuring")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34681", "CYC") });
        $ic275$ = constant_handles_oc.f8479((SubLObject)makeString("startingDate"));
        $ic276$ = makeKeyword("REMOVAL-STARTING-DATE");
        $ic277$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startingDate")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startingDate")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startingDate")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13151", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34706", "CYC"), (SubLObject)makeSymbol("S#13151", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34706", "CYC"), (SubLObject)makeSymbol("S#13151", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#24833", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startingDate <TemporalThing> <Date>)") });
        $ic278$ = makeSymbol("S#34682", "CYC");
        $ic279$ = makeKeyword("REMOVAL-ALL-STARTING-DATE-INVERSE");
        $ic280$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startingDate")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startingDate")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startingDate")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13151", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34682", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startingDate")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startingDate <not-fully-bound> <Date>)") });
        $ic281$ = makeKeyword("ALL-STARTING-DATE-INVERSE-POS");
        $ic282$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startingDate")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startingDate")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic283$ = makeKeyword("REMOVAL-NOT-STARTING-DATE");
        $ic284$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startingDate")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startingDate")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34683", "CYC") });
        $ic285$ = constant_handles_oc.f8479((SubLObject)makeString("endingDate"));
        $ic286$ = makeKeyword("REMOVAL-ENDING-DATE");
        $ic287$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endingDate")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endingDate")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endingDate")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13151", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34706", "CYC"), (SubLObject)makeSymbol("S#13151", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34706", "CYC"), (SubLObject)makeSymbol("S#13151", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#24840", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endingDate <TemporalThing> <Date>)") });
        $ic288$ = makeSymbol("S#34684", "CYC");
        $ic289$ = makeKeyword("REMOVAL-ALL-ENDING-DATE-INVERSE");
        $ic290$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endingDate")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endingDate")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endingDate")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13151", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34684", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endingDate")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endingDate <not-fully-bound> <Date>)") });
        $ic291$ = makeKeyword("ALL-ENDING-DATE-INVERSE-POS");
        $ic292$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endingDate")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endingDate")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic293$ = makeKeyword("REMOVAL-NOT-ENDING-DATE");
        $ic294$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endingDate")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endingDate")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34685", "CYC") });
        $ic295$ = constant_handles_oc.f8479((SubLObject)makeString("birthDate"));
        $ic296$ = makeKeyword("REMOVAL-BIRTH-DATE");
        $ic297$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("birthDate")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("birthDate")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("birthDate")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13151", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34706", "CYC"), (SubLObject)makeSymbol("S#13151", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34706", "CYC"), (SubLObject)makeSymbol("S#13151", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#24847", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$birthDate <TemporalThing> <Date>)") });
        $ic298$ = makeSymbol("S#34686", "CYC");
        $ic299$ = makeKeyword("REMOVAL-ALL-BIRTH-DATE-INVERSE");
        $ic300$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("birthDate")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("birthDate")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("birthDate")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13151", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34686", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("birthDate")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$birthDate <not-fully-bound> <Date>)") });
        $ic301$ = makeKeyword("ALL-BIRTH-DATE-INVERSE-POS");
        $ic302$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("birthDate")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("birthDate")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic303$ = makeKeyword("REMOVAL-NOT-BIRTH-DATE");
        $ic304$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("birthDate")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("birthDate")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34687", "CYC") });
        $ic305$ = constant_handles_oc.f8479((SubLObject)makeString("dateOfDeath"));
        $ic306$ = makeKeyword("REMOVAL-DATE-OF-DEATH");
        $ic307$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("dateOfDeath")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfDeath")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfDeath")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13151", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34706", "CYC"), (SubLObject)makeSymbol("S#13151", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34706", "CYC"), (SubLObject)makeSymbol("S#13151", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#24854", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$dateOfDeath <TemporalThing> <Date>)") });
        $ic308$ = makeSymbol("S#34688", "CYC");
        $ic309$ = makeKeyword("REMOVAL-ALL-DATE-OF-DEATH-INVERSE");
        $ic310$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("dateOfDeath")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfDeath")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfDeath")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13151", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34688", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfDeath")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13151", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$dateOfDeath <not-fully-bound> <Date>)") });
        $ic311$ = makeKeyword("ALL-DATE-OF-DEATH-INVERSE-POS");
        $ic312$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("dateOfDeath")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfDeath")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic313$ = makeKeyword("REMOVAL-NOT-DATE-OF-DEATH");
        $ic314$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("dateOfDeath")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfDeath")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34689", "CYC") });
        $ic315$ = constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy"));
        $ic316$ = makeKeyword("REMOVAL-TEMPORALLY-STARTED-BY");
        $ic317$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("TEMPORALLY-STARTED-BY?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyStartedBy <TemporalThing> <TemporalThing>)") });
        $ic318$ = makeSymbol("S#34690", "CYC");
        $ic319$ = makeKeyword("REMOVAL-ALL-TEMPORALLY-STARTED-BY");
        $ic320$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34690", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyStartedBy <TemporalThing> <not-fully-bound>)") });
        $ic321$ = makeKeyword("ALL-TEMPORALLY-STARTED-BY-POS");
        $ic322$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic323$ = makeSymbol("S#34691", "CYC");
        $ic324$ = makeKeyword("REMOVAL-ALL-TEMPORALLY-STARTED-BY-INVERSE");
        $ic325$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34691", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyStartedBy <not-fully-bound> <TemporalThing>)") });
        $ic326$ = makeKeyword("ALL-TEMPORALLY-STARTED-BY-INVERSE-POS");
        $ic327$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic328$ = makeKeyword("REMOVAL-NOT-TEMPORALLY-STARTED-BY");
        $ic329$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyStartedBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34692", "CYC") });
        $ic330$ = constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy"));
        $ic331$ = makeKeyword("REMOVAL-TEMPORALLY-FINISHED-BY");
        $ic332$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("TEMPORALLY-FINISHED-BY?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyFinishedBy <TemporalThing> <TemporalThing>)") });
        $ic333$ = makeSymbol("S#34693", "CYC");
        $ic334$ = makeKeyword("REMOVAL-ALL-TEMPORALLY-FINISHED-BY");
        $ic335$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34693", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyFinishedBy <TemporalThing> <not-fully-bound>)") });
        $ic336$ = makeKeyword("ALL-TEMPORALLY-FINISHED-BY-POS");
        $ic337$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic338$ = makeSymbol("S#34694", "CYC");
        $ic339$ = makeKeyword("REMOVAL-ALL-TEMPORALLY-FINISHED-BY-INVERSE");
        $ic340$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34694", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyFinishedBy <not-fully-bound> <TemporalThing>)") });
        $ic341$ = makeKeyword("ALL-TEMPORALLY-FINISHED-BY-INVERSE-POS");
        $ic342$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic343$ = makeKeyword("REMOVAL-NOT-TEMPORALLY-FINISHED-BY");
        $ic344$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("temporallyFinishedBy")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34695", "CYC") });
        $ic345$ = constant_handles_oc.f8479((SubLObject)makeString("overlapsStart"));
        $ic346$ = makeKeyword("REMOVAL-OVERLAPS-START");
        $ic347$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34700", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34705", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#34704", "CYC"), (SubLObject)makeSymbol("S#34705", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("OVERLAPS-START?"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34704", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34705", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$overlapsStart <TemporalThing> <TemporalThing>)") });
        $ic348$ = makeSymbol("S#34696", "CYC");
        $ic349$ = makeKeyword("REMOVAL-ALL-OVERLAPS-START");
        $ic350$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34701", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34696", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC")), (SubLObject)makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$overlapsStart <TemporalThing> <not-fully-bound>)") });
        $ic351$ = makeKeyword("ALL-OVERLAPS-START-POS");
        $ic352$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic353$ = makeSymbol("S#34697", "CYC");
        $ic354$ = makeKeyword("REMOVAL-ALL-OVERLAPS-START-INVERSE");
        $ic355$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34702", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#34706", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18223", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34697", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#34706", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$overlapsStart <not-fully-bound> <TemporalThing>)") });
        $ic356$ = makeKeyword("ALL-OVERLAPS-START-INVERSE-POS");
        $ic357$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic358$ = makeKeyword("REMOVAL-NOT-OVERLAPS-START");
        $ic359$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("overlapsStart")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24533", "CYC"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34703", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34698", "CYC") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2963 ms
	
	Decompiled with Procyon 0.5.32.
*/
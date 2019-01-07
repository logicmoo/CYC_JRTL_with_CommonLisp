package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;

public final class $assertion_native extends SubLStructNative
{
    public SubLObject $id;
    private static final SubLStructDeclNative structDecl;
    
    public $assertion_native() {
        this.$id = (SubLObject)CommonSymbols.NIL;
    }
    
    public SubLStructDecl getStructDecl() {
        return (SubLStructDecl)$assertion_native.structDecl;
    }
    
    public SubLObject getField2() {
        return this.$id;
    }
    
    public SubLObject setField2(final SubLObject value) {
        return this.$id = value;
    }
    
    static {
        structDecl = Structures.makeStructDeclNative((Class)$assertion_native.class, assertion_handles.$sym43$ASSERTION, assertion_handles.$sym44$ASSERTION_P, assertion_handles.$list46, assertion_handles.$list47, new String[] { "$id" }, assertion_handles.$list48, assertion_handles.$list49, assertion_handles.$sym50$PRINT_ASSERTION);
    }
}
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_class_properties extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.subloop_class_properties";
    public static final String myFingerPrint = "c10333a26b18a9c7e66868234699b9ee78d3be72af8d0972b0bfbac6c1dcaab4";
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-class-properties.lisp", position = 798L)
    public static SubLObject get_subloop_class_property_abstract_p(final SubLObject class_structure) {
        return classes.ldb_test(bytes.sublisp_byte((SubLObject)subloop_class_properties.ONE_INTEGER, (SubLObject)subloop_class_properties.ZERO_INTEGER), subloop_structures.class_class_properties(class_structure));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-class-properties.lisp", position = 798L)
    public static SubLObject set_subloop_class_property_abstract_p(final SubLObject class_structure, final SubLObject new_value) {
        subloop_structures._csetf_class_class_properties(class_structure, bytes.dpb((SubLObject)((subloop_class_properties.NIL != new_value) ? subloop_class_properties.ONE_INTEGER : subloop_class_properties.ZERO_INTEGER), bytes.sublisp_byte((SubLObject)subloop_class_properties.ONE_INTEGER, (SubLObject)subloop_class_properties.ZERO_INTEGER), subloop_structures.class_class_properties(class_structure)));
        return new_value;
    }
    
    public static SubLObject declare_subloop_class_properties_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_class_properties", "get_subloop_class_property_abstract_p", "GET-SUBLOOP-CLASS-PROPERTY-ABSTRACT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_class_properties", "set_subloop_class_property_abstract_p", "SET-SUBLOOP-CLASS-PROPERTY-ABSTRACT-P", 2, 0, false);
        return (SubLObject)subloop_class_properties.NIL;
    }
    
    public static SubLObject init_subloop_class_properties_file() {
        return (SubLObject)subloop_class_properties.NIL;
    }
    
    public static SubLObject setup_subloop_class_properties_file() {
        return (SubLObject)subloop_class_properties.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_subloop_class_properties_file();
    }
    
    @Override
	public void initializeVariables() {
        init_subloop_class_properties_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_subloop_class_properties_file();
    }
    
    static {
        me = (SubLFile)new subloop_class_properties();
    }
}

/*

	Total time: 82 ms
	
*/
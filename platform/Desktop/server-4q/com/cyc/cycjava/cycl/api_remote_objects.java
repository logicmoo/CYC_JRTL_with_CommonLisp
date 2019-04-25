package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class api_remote_objects extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.api_remote_objects";
    public static final String myFingerPrint = "553d504365e3375bba738135a9573b02e8693634cb17582c334dda80a3e71003";
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 1413L)
    private static SubLSymbol $remo_session_map$;
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 1471L)
    private static SubLSymbol $remo_session_id_generator$;
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 3792L)
    private static SubLSymbol $remo_object_not_found$;
    private static final SubLSymbol $sym0$_REMO_SESSION_MAP_;
    private static final SubLSymbol $sym1$_REMO_SESSION_ID_GENERATOR_;
    private static final SubLSymbol $kw2$ID_GENERATOR;
    private static final SubLSymbol $kw3$LEASE;
    private static final SubLSymbol $sym4$_REMO_OBJECT_NOT_FOUND_;
    private static final SubLString $str5$Remote_Object_Not_Found;
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 921L)
    public static SubLObject new_remote_object_session(SubLObject lease) {
        if (lease == api_remote_objects.UNPROVIDED) {
            lease = (SubLObject)api_remote_objects.NIL;
        }
        final SubLObject id = get_next_remo_session_id();
        allocate_new_remo_session_object(lease, id);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 1158L)
    public static SubLObject valid_remote_object_session_p(final SubLObject session_id) {
        return valid_remo_session_object_p(find_remo_session_object(session_id, (SubLObject)api_remote_objects.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 1304L)
    public static SubLObject delete_remote_object_session(final SubLObject session_id) {
        drop_remo_session_object(session_id);
        return (SubLObject)api_remote_objects.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 1552L)
    public static SubLObject clear_remo_session_id_generator() {
        return integer_sequence_generator.integer_sequence_generator_reset(api_remote_objects.$remo_session_id_generator$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 1676L)
    public static SubLObject get_next_remo_session_id() {
        return integer_sequence_generator.integer_sequence_generator_next(api_remote_objects.$remo_session_id_generator$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 1792L)
    public static SubLObject valid_remo_session_object_p(final SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 1877L)
    public static SubLObject allocate_new_remo_session_object(final SubLObject lease, final SubLObject id) {
        final SubLObject session = get_new_remo_session_object(lease);
        dictionary.dictionary_enter(api_remote_objects.$remo_session_map$.getGlobalValue(), id, session);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 2062L)
    public static SubLObject get_new_remo_session_object(final SubLObject lease) {
        final SubLObject id_generator = integer_sequence_generator.new_integer_sequence_generator((SubLObject)api_remote_objects.UNPROVIDED, (SubLObject)api_remote_objects.UNPROVIDED, (SubLObject)api_remote_objects.UNPROVIDED);
        final SubLObject session_information = dictionary.new_dictionary((SubLObject)api_remote_objects.UNPROVIDED, (SubLObject)api_remote_objects.UNPROVIDED);
        dictionary.dictionary_enter(session_information, (SubLObject)api_remote_objects.$kw2$ID_GENERATOR, id_generator);
        dictionary.dictionary_enter(session_information, (SubLObject)api_remote_objects.$kw3$LEASE, lease);
        return session_information;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 2383L)
    public static SubLObject find_remo_session_object(final SubLObject id, SubLObject not_found_value) {
        if (not_found_value == api_remote_objects.UNPROVIDED) {
            not_found_value = (SubLObject)api_remote_objects.NIL;
        }
        return dictionary.dictionary_lookup(api_remote_objects.$remo_session_map$.getGlobalValue(), id, not_found_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 2524L)
    public static SubLObject drop_remo_session_object(final SubLObject id) {
        return dictionary.dictionary_remove(api_remote_objects.$remo_session_map$.getGlobalValue(), id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 2622L)
    public static SubLObject valid_remote_object_p(final SubLObject session_id, final SubLObject object_id) {
        return (SubLObject)SubLObjectFactory.makeBoolean(api_remote_objects.NIL != valid_remote_object_session_p(session_id) && api_remote_objects.NIL != valid_remote_object_in_session_p(session_id, object_id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 2944L)
    public static SubLObject create_remote_object_id(final SubLObject session_id) {
        final SubLObject session_information = find_remo_session_object(session_id, (SubLObject)api_remote_objects.UNPROVIDED);
        return allocate_remo_in_session(session_information);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 3126L)
    public static SubLObject get_remote_object_value(final SubLObject session_id, final SubLObject object_id) {
        final SubLObject session_information = find_remo_session_object(session_id, (SubLObject)api_remote_objects.UNPROVIDED);
        final SubLObject v_object = find_remo_in_session(session_information, object_id);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 3350L)
    public static SubLObject set_remote_object_value(final SubLObject session_id, final SubLObject object_id, final SubLObject value) {
        final SubLObject session_information = find_remo_session_object(session_id, (SubLObject)api_remote_objects.UNPROVIDED);
        set_remo_in_session_value(session_information, object_id, value);
        return session_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 3579L)
    public static SubLObject delete_remote_object_id(final SubLObject session_id, final SubLObject object_id) {
        final SubLObject session_information = find_remo_session_object(session_id, (SubLObject)api_remote_objects.UNPROVIDED);
        clear_remo_in_session(session_information, object_id);
        return session_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 3879L)
    public static SubLObject valid_remote_object_in_session_p(final SubLObject session_id, final SubLObject object_id) {
        final SubLObject session_information = find_remo_session_object(session_id, (SubLObject)api_remote_objects.UNPROVIDED);
        if (api_remote_objects.NIL != valid_remo_session_object_p(session_information)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(!dictionary.dictionary_lookup(session_information, object_id, api_remote_objects.$remo_object_not_found$.getGlobalValue()).eql(api_remote_objects.$remo_object_not_found$.getGlobalValue()));
        }
        return (SubLObject)api_remote_objects.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 4264L)
    public static SubLObject find_remo_in_session(final SubLObject session_information, final SubLObject object_id) {
        if (api_remote_objects.NIL != valid_remo_session_object_p(session_information)) {
            return dictionary.dictionary_lookup(session_information, object_id, (SubLObject)api_remote_objects.UNPROVIDED);
        }
        return (SubLObject)api_remote_objects.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 4455L)
    public static SubLObject set_remo_in_session_value(final SubLObject session_information, final SubLObject object_id, final SubLObject value) {
        if (api_remote_objects.NIL != valid_remo_session_object_p(session_information)) {
            return dictionary.dictionary_enter(session_information, object_id, value);
        }
        return (SubLObject)api_remote_objects.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 4662L)
    public static SubLObject allocate_remo_in_session(final SubLObject session_information) {
        if (api_remote_objects.NIL != valid_remo_session_object_p(session_information)) {
            final SubLObject id_isg = dictionary.dictionary_lookup(session_information, (SubLObject)api_remote_objects.$kw2$ID_GENERATOR, (SubLObject)api_remote_objects.UNPROVIDED);
            if (api_remote_objects.NIL != integer_sequence_generator.integer_sequence_generator_p(id_isg)) {
                final SubLObject new_id = integer_sequence_generator.integer_sequence_generator_next(id_isg);
                return new_id;
            }
        }
        return (SubLObject)api_remote_objects.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/api-remote-objects.lisp", position = 5005L)
    public static SubLObject clear_remo_in_session(final SubLObject session_information, final SubLObject object_id) {
        if (api_remote_objects.NIL != dictionary.dictionary_p(session_information)) {
            return dictionary.dictionary_remove(session_information, object_id);
        }
        return (SubLObject)api_remote_objects.NIL;
    }
    
    public static SubLObject declare_api_remote_objects_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "new_remote_object_session", "NEW-REMOTE-OBJECT-SESSION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "valid_remote_object_session_p", "VALID-REMOTE-OBJECT-SESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "delete_remote_object_session", "DELETE-REMOTE-OBJECT-SESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "clear_remo_session_id_generator", "CLEAR-REMO-SESSION-ID-GENERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "get_next_remo_session_id", "GET-NEXT-REMO-SESSION-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "valid_remo_session_object_p", "VALID-REMO-SESSION-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "allocate_new_remo_session_object", "ALLOCATE-NEW-REMO-SESSION-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "get_new_remo_session_object", "GET-NEW-REMO-SESSION-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "find_remo_session_object", "FIND-REMO-SESSION-OBJECT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "drop_remo_session_object", "DROP-REMO-SESSION-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "valid_remote_object_p", "VALID-REMOTE-OBJECT-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "create_remote_object_id", "CREATE-REMOTE-OBJECT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "get_remote_object_value", "GET-REMOTE-OBJECT-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "set_remote_object_value", "SET-REMOTE-OBJECT-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "delete_remote_object_id", "DELETE-REMOTE-OBJECT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "valid_remote_object_in_session_p", "VALID-REMOTE-OBJECT-IN-SESSION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "find_remo_in_session", "FIND-REMO-IN-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "set_remo_in_session_value", "SET-REMO-IN-SESSION-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "allocate_remo_in_session", "ALLOCATE-REMO-IN-SESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.api_remote_objects", "clear_remo_in_session", "CLEAR-REMO-IN-SESSION", 2, 0, false);
        return (SubLObject)api_remote_objects.NIL;
    }
    
    public static SubLObject init_api_remote_objects_file() {
        api_remote_objects.$remo_session_map$ = SubLFiles.deflexical("*REMO-SESSION-MAP*", maybeDefault((SubLObject)api_remote_objects.$sym0$_REMO_SESSION_MAP_, api_remote_objects.$remo_session_map$, ()->(dictionary.new_dictionary((SubLObject)api_remote_objects.UNPROVIDED, (SubLObject)api_remote_objects.UNPROVIDED))));
        api_remote_objects.$remo_session_id_generator$ = SubLFiles.deflexical("*REMO-SESSION-ID-GENERATOR*", maybeDefault((SubLObject)api_remote_objects.$sym1$_REMO_SESSION_ID_GENERATOR_, api_remote_objects.$remo_session_id_generator$, ()->(integer_sequence_generator.new_integer_sequence_generator((SubLObject)api_remote_objects.UNPROVIDED, (SubLObject)api_remote_objects.UNPROVIDED, (SubLObject)api_remote_objects.UNPROVIDED))));
        api_remote_objects.$remo_object_not_found$ = SubLFiles.deflexical("*REMO-OBJECT-NOT-FOUND*", maybeDefault((SubLObject)api_remote_objects.$sym4$_REMO_OBJECT_NOT_FOUND_, api_remote_objects.$remo_object_not_found$, ()->(Symbols.make_symbol((SubLObject)api_remote_objects.$str5$Remote_Object_Not_Found))));
        return (SubLObject)api_remote_objects.NIL;
    }
    
    public static SubLObject setup_api_remote_objects_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)api_remote_objects.$sym0$_REMO_SESSION_MAP_);
        subl_macro_promotions.declare_defglobal((SubLObject)api_remote_objects.$sym1$_REMO_SESSION_ID_GENERATOR_);
        subl_macro_promotions.declare_defglobal((SubLObject)api_remote_objects.$sym4$_REMO_OBJECT_NOT_FOUND_);
        return (SubLObject)api_remote_objects.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_api_remote_objects_file();
    }
    
    @Override
	public void initializeVariables() {
        init_api_remote_objects_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_api_remote_objects_file();
    }
    
    static {
        me = (SubLFile)new api_remote_objects();
        api_remote_objects.$remo_session_map$ = null;
        api_remote_objects.$remo_session_id_generator$ = null;
        api_remote_objects.$remo_object_not_found$ = null;
        $sym0$_REMO_SESSION_MAP_ = SubLObjectFactory.makeSymbol("*REMO-SESSION-MAP*");
        $sym1$_REMO_SESSION_ID_GENERATOR_ = SubLObjectFactory.makeSymbol("*REMO-SESSION-ID-GENERATOR*");
        $kw2$ID_GENERATOR = SubLObjectFactory.makeKeyword("ID-GENERATOR");
        $kw3$LEASE = SubLObjectFactory.makeKeyword("LEASE");
        $sym4$_REMO_OBJECT_NOT_FOUND_ = SubLObjectFactory.makeSymbol("*REMO-OBJECT-NOT-FOUND*");
        $str5$Remote_Object_Not_Found = SubLObjectFactory.makeString("Remote Object Not Found");
    }
}

/*

	Total time: 35 ms
	
*/
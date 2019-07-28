package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_partitions;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_partitions.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cb_partitions extends SubLTranslatedFile {
    public static final SubLFile me = new cb_partitions();

    public static final String myName = "com.cyc.cycjava.cycl.cb_partitions";

    public static final String myFingerPrint = "219722b85db7e85fcfe5f437f9876d339a5672f9a321667cebc20199bef6b9d4";

    // deflexical
    // Definitions
    private static final SubLSymbol $cb_partition_extension$ = makeSymbol("*CB-PARTITION-EXTENSION*");

    // defconstant
    public static final SubLSymbol $dtp_cb_partition_save$ = makeSymbol("*DTP-CB-PARTITION-SAVE*");

    // deflexical
    private static final SubLSymbol $cb_partition_method_table$ = makeSymbol("*CB-PARTITION-METHOD-TABLE*");



    // Internal Constants
    public static final SubLString $$$cpart = makeString("cpart");

    public static final SubLString $str1$_ = makeString(".");



    private static final SubLSymbol CB_PARTITION_SAVE = makeSymbol("CB-PARTITION-SAVE");

    private static final SubLSymbol CB_PARTITION_SAVE_P = makeSymbol("CB-PARTITION-SAVE-P");

    private static final SubLList $list5 = list(makeSymbol("SPECIFIED-DIRECTORY"), makeSymbol("PERSONAL-DIRECTORY"), makeSymbol("PUBLIC-DIRECTORY"), makeSymbol("FILENAME"), makeSymbol("PREDEFINED-METHODS"), makeSymbol("ONTOLOGIES"), makeSymbol("QUOTED-ONTOLOGIES"), makeSymbol("TERMS"));

    private static final SubLList $list6 = list(makeKeyword("SPECIFIED-DIRECTORY"), makeKeyword("PERSONAL-DIRECTORY"), makeKeyword("PUBLIC-DIRECTORY"), makeKeyword("FILENAME"), makeKeyword("PREDEFINED-METHODS"), makeKeyword("ONTOLOGIES"), makeKeyword("QUOTED-ONTOLOGIES"), makeKeyword("TERMS"));

    public static final SubLList $list7 = list(makeSymbol("CB-PART-SAVE-SPECIFIED-DIRECTORY"), makeSymbol("CB-PART-SAVE-PERSONAL-DIRECTORY"), makeSymbol("CB-PART-SAVE-PUBLIC-DIRECTORY"), makeSymbol("CB-PART-SAVE-FILENAME"), makeSymbol("CB-PART-SAVE-PREDEFINED-METHODS"), makeSymbol("CB-PART-SAVE-ONTOLOGIES"), makeSymbol("CB-PART-SAVE-QUOTED-ONTOLOGIES"), makeSymbol("CB-PART-SAVE-TERMS"));

    public static final SubLList $list8 = list(makeSymbol("_CSETF-CB-PART-SAVE-SPECIFIED-DIRECTORY"), makeSymbol("_CSETF-CB-PART-SAVE-PERSONAL-DIRECTORY"), makeSymbol("_CSETF-CB-PART-SAVE-PUBLIC-DIRECTORY"), makeSymbol("_CSETF-CB-PART-SAVE-FILENAME"), makeSymbol("_CSETF-CB-PART-SAVE-PREDEFINED-METHODS"), makeSymbol("_CSETF-CB-PART-SAVE-ONTOLOGIES"), makeSymbol("_CSETF-CB-PART-SAVE-QUOTED-ONTOLOGIES"), makeSymbol("_CSETF-CB-PART-SAVE-TERMS"));



    private static final SubLSymbol CB_PARTITION_SAVE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CB-PARTITION-SAVE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list11 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CB-PARTITION-SAVE-P"));

    private static final SubLSymbol CB_PART_SAVE_SPECIFIED_DIRECTORY = makeSymbol("CB-PART-SAVE-SPECIFIED-DIRECTORY");

    private static final SubLSymbol _CSETF_CB_PART_SAVE_SPECIFIED_DIRECTORY = makeSymbol("_CSETF-CB-PART-SAVE-SPECIFIED-DIRECTORY");

    private static final SubLSymbol CB_PART_SAVE_PERSONAL_DIRECTORY = makeSymbol("CB-PART-SAVE-PERSONAL-DIRECTORY");

    private static final SubLSymbol _CSETF_CB_PART_SAVE_PERSONAL_DIRECTORY = makeSymbol("_CSETF-CB-PART-SAVE-PERSONAL-DIRECTORY");

    private static final SubLSymbol CB_PART_SAVE_PUBLIC_DIRECTORY = makeSymbol("CB-PART-SAVE-PUBLIC-DIRECTORY");

    private static final SubLSymbol _CSETF_CB_PART_SAVE_PUBLIC_DIRECTORY = makeSymbol("_CSETF-CB-PART-SAVE-PUBLIC-DIRECTORY");

    private static final SubLSymbol CB_PART_SAVE_FILENAME = makeSymbol("CB-PART-SAVE-FILENAME");

    private static final SubLSymbol _CSETF_CB_PART_SAVE_FILENAME = makeSymbol("_CSETF-CB-PART-SAVE-FILENAME");

    private static final SubLSymbol CB_PART_SAVE_PREDEFINED_METHODS = makeSymbol("CB-PART-SAVE-PREDEFINED-METHODS");

    private static final SubLSymbol _CSETF_CB_PART_SAVE_PREDEFINED_METHODS = makeSymbol("_CSETF-CB-PART-SAVE-PREDEFINED-METHODS");

    private static final SubLSymbol CB_PART_SAVE_ONTOLOGIES = makeSymbol("CB-PART-SAVE-ONTOLOGIES");

    private static final SubLSymbol _CSETF_CB_PART_SAVE_ONTOLOGIES = makeSymbol("_CSETF-CB-PART-SAVE-ONTOLOGIES");

    private static final SubLSymbol CB_PART_SAVE_QUOTED_ONTOLOGIES = makeSymbol("CB-PART-SAVE-QUOTED-ONTOLOGIES");

    private static final SubLSymbol _CSETF_CB_PART_SAVE_QUOTED_ONTOLOGIES = makeSymbol("_CSETF-CB-PART-SAVE-QUOTED-ONTOLOGIES");

    private static final SubLSymbol CB_PART_SAVE_TERMS = makeSymbol("CB-PART-SAVE-TERMS");

    private static final SubLSymbol _CSETF_CB_PART_SAVE_TERMS = makeSymbol("_CSETF-CB-PART-SAVE-TERMS");

















    private static final SubLString $str36$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_CB_PARTITION_SAVE = makeSymbol("MAKE-CB-PARTITION-SAVE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CB_PARTITION_SAVE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CB-PARTITION-SAVE-METHOD");















    private static final SubLString $str49$ = makeString("");

    private static final SubLList $list50 = list(list(makeSymbol("SCOPE-PARTITION-ALL-KB-ADDITIONS"), makeString("All additions to this KB since it was initially built.")), list(makeSymbol("SCOPE-PARTITION-ALL-ASSERTIONS-IN-HLMT-NAUT"), makeString("All assertions in MT space microtheories.")));



    private static final SubLSymbol SCOPE_PARTITION_ALL_KB_ADDITIONS = makeSymbol("SCOPE-PARTITION-ALL-KB-ADDITIONS");

    private static final SubLSymbol SCOPE_PARTITION_ALL_ASSERTIONS_IN_HLMT_NAUT = makeSymbol("SCOPE-PARTITION-ALL-ASSERTIONS-IN-HLMT-NAUT");

    private static final SubLString $str54$Scoping_assertions_in_microtheori = makeString("Scoping assertions in microtheories that are a HLMT NAUT.");



    private static final SubLSymbol $cb_current_partition_save$ = makeSymbol("*CB-CURRENT-PARTITION-SAVE*");





    private static final SubLString $str59$_Partition_Save_ = makeString("[Partition Save]");



    private static final SubLString $str61$cb_partition_save = makeString("cb-partition-save");



    private static final SubLSymbol CB_LINK_PARTITION_SAVE = makeSymbol("CB-LINK-PARTITION-SAVE");

    private static final SubLString $$$Partition_Save = makeString("Partition Save");

    private static final SubLString $$$PartSave = makeString("PartSave");

    private static final SubLString $$$Save_out_a_KB_partition = makeString("Save out a KB partition");

    private static final SubLString $str67$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str68$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str73$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str79$cb_handle_partition_save = makeString("cb-handle-partition-save");

    private static final SubLSymbol $CB_PARTITION_SAVE = makeKeyword("CB-PARTITION-SAVE");

    private static final SubLString $str81$cb_partition_save_html = makeString("cb-partition-save.html");

    private static final SubLString $$$Reset_Form = makeString("Reset Form");

    private static final SubLString $$$Update_Partition_Scope = makeString("Update Partition Scope");

    private static final SubLString $$$update = makeString("update");

    private static final SubLString $$$Save_Partition = makeString("Save Partition");

    private static final SubLString $$$save = makeString("save");

    private static final SubLString $$$Partition_Filename = makeString("Partition Filename");

    private static final SubLString $str88$Choose_or_specify_a_directory__ = makeString("Choose or specify a directory :");

    private static final SubLString $$$directory = makeString("directory");

    private static final SubLString $$$personal = makeString("personal");

    private static final SubLString $$$public = makeString("public");

    private static final SubLString $str92$specified_directory = makeString("specified_directory");

    private static final SubLString $$$specified = makeString("specified");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $$$Clear = makeString("Clear");



    private static final SubLString $str97$Specify_the_filename__ = makeString("Specify the filename :");

    private static final SubLString $$$Extension = makeString("Extension");

    private static final SubLString $str99$partition_filename = makeString("partition_filename");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLString $$$Partition_Scope = makeString("Partition Scope");

    private static final SubLString $$$Clear_Partition_Scope = makeString("Clear Partition Scope");

    private static final SubLString $str103$reset_scope = makeString("reset_scope");

    private static final SubLString $str104$Predefined_Methods___ = makeString("Predefined Methods : ");

    private static final SubLString $str105$method__A = makeString("method-~A");

    private static final SubLString $str106$Ontologies__instances_and_specs__ = makeString("Ontologies (instances and specs) : ");

    private static final SubLString $$$None = makeString("None");

    private static final SubLString $str108$ontology__A = makeString("ontology-~A");

    private static final SubLString $str109$Add_Ontology__ = makeString("Add Ontology :");

    private static final SubLString $$$ontology = makeString("ontology");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLString $str113$Quoted_Ontologies__quoted_instanc = makeString("Quoted Ontologies (quoted instances) : ");

    private static final SubLString $str114$quoted_ontology__A = makeString("quoted-ontology-~A");

    private static final SubLString $str115$Add_Quoted_Ontology__ = makeString("Add Quoted Ontology :");

    private static final SubLString $str116$quoted_ontology = makeString("quoted-ontology");

    private static final SubLString $str117$Terms___ = makeString("Terms : ");

    private static final SubLString $str118$term__A = makeString("term-~A");

    private static final SubLString $str119$Add_Term___ = makeString("Add Term : ");

    private static final SubLString $$$term = makeString("term");



    private static final SubLString $str122$_S_does_not_specify_a_Cyc_collect = makeString("~S does not specify a Cyc collection.");

    private static final SubLString $str123$Partition_has_been_saved_ = makeString("Partition has been saved.");

    private static final SubLSymbol CB_HANDLE_PARTITION_SAVE = makeSymbol("CB-HANDLE-PARTITION-SAVE");

    private static final SubLString $str125$method_ = makeString("method-");

    private static final SubLString $str126$ontology_ = makeString("ontology-");

    private static final SubLString $str127$quoted_ontology_ = makeString("quoted-ontology-");

    private static final SubLString $str128$term_ = makeString("term-");

    private static final SubLSymbol CB_PARTITION_LOAD = makeSymbol("CB-PARTITION-LOAD");

    private static final SubLString $str130$_Partition_Load_ = makeString("[Partition Load]");

    private static final SubLString $str131$cb_partition_load = makeString("cb-partition-load");



    private static final SubLSymbol CB_LINK_PARTITION_LOAD = makeSymbol("CB-LINK-PARTITION-LOAD");

    private static final SubLString $$$Partition_Load = makeString("Partition Load");

    private static final SubLString $$$PartLoad = makeString("PartLoad");

    private static final SubLString $$$Load_a_KB_partition = makeString("Load a KB partition");

    private static final SubLString $$$the_Partition_Load_page = makeString("the Partition Load page");

    private static final SubLString $str138$cb_handle_partition_load = makeString("cb-handle-partition-load");

    private static final SubLString $str139$Specify_or_select_one_or_more_par = makeString("Specify or select one or more partitions to load.");

    private static final SubLSymbol $CB_PARTITION_LOAD = makeKeyword("CB-PARTITION-LOAD");

    private static final SubLString $str141$cb_partition_load_html = makeString("cb-partition-load.html");

    private static final SubLString $$$Load_Partitions = makeString("Load Partitions");

    private static final SubLString $$$load = makeString("load");

    private static final SubLString $str144$Full_pathname_of_a_partition_file = makeString("Full pathname of a partition file to load :");

    private static final SubLString $str145$specified_filename = makeString("specified_filename");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $$$finalize = makeString("finalize");

    private static final SubLString $str148$_Clean_up_after_load____Only_unch = makeString(" Clean up after load.  (Only uncheck when more partitions will be loaded after these and those partitions depend on these.)");



    private static final SubLString $$$Personal_partitions_from = makeString("Personal partitions from");

    private static final SubLString $str151$personal__A = makeString("personal-~A");



    private static final SubLString $$$Public_partitions_from = makeString("Public partitions from");

    private static final SubLString $str154$public__A = makeString("public-~A");

    private static final SubLString $str155$The_specified_filename__S_could_n = makeString("The specified filename ~S could not be found.");

    private static final SubLString $str156$Partition_has_been_loaded_ = makeString("Partition has been loaded.");

    private static final SubLString $str157$Partition_files_have_been_loaded_ = makeString("Partition files have been loaded.");

    private static final SubLSymbol CB_HANDLE_PARTITION_LOAD = makeSymbol("CB-HANDLE-PARTITION-LOAD");

    private static final SubLList $list159 = list(makeSymbol("INPUT"), makeSymbol("VALUE"));

    private static final SubLString $str160$personal_ = makeString("personal-");

    private static final SubLString $str161$public_ = makeString("public-");

    public static SubLObject make_partition_filename(final SubLObject directory_string, final SubLObject filename, SubLObject extension) {
        if (extension == UNPROVIDED) {
            extension = NIL;
        }
        if (NIL == extension) {
            extension = $cb_partition_extension$.getGlobalValue();
        }
        return cconcatenate(directory_string, new SubLObject[]{ filename, $str1$_, extension });
    }

    public static SubLObject directory_partition_files(final SubLObject directory) {
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        SubLObject partition_files = NIL;
        SubLObject cdolist_list_var = Filesys.directory(directory, UNPROVIDED);
        SubLObject partition_file = NIL;
        partition_file = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != string_utilities.ends_with(partition_file, $cb_partition_extension$.getGlobalValue(), UNPROVIDED)) {
                partition_files = cons(partition_file, partition_files);
            }
            cdolist_list_var = cdolist_list_var.rest();
            partition_file = cdolist_list_var.first();
        } 
        return partition_files;
    }

    public static SubLObject cb_compute_partition_save_public_directory() {
        return NIL;
    }

    public static SubLObject cb_compute_partition_save_personal_directory() {
        return NIL;
    }

    public static SubLObject cb_compute_partition_load_public_directory() {
        return cb_compute_partition_save_public_directory();
    }

    public static SubLObject cb_compute_partition_load_personal_directory() {
        return cb_compute_partition_save_personal_directory();
    }

    public static SubLObject cb_partition_save_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cb_partition_save_p(final SubLObject v_object) {
        return v_object.getClass() == cb_partitions.$cb_partition_save_native.class ? T : NIL;
    }

    public static SubLObject cb_part_save_specified_directory(final SubLObject v_object) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject cb_part_save_personal_directory(final SubLObject v_object) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject cb_part_save_public_directory(final SubLObject v_object) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject cb_part_save_filename(final SubLObject v_object) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject cb_part_save_predefined_methods(final SubLObject v_object) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject cb_part_save_ontologies(final SubLObject v_object) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject cb_part_save_quoted_ontologies(final SubLObject v_object) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject cb_part_save_terms(final SubLObject v_object) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject _csetf_cb_part_save_specified_directory(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cb_part_save_personal_directory(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cb_part_save_public_directory(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_cb_part_save_filename(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_cb_part_save_predefined_methods(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_cb_part_save_ontologies(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_cb_part_save_quoted_ontologies(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_cb_part_save_terms(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_partition_save_p(v_object) : "cb_partitions.cb_partition_save_p(v_object) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject make_cb_partition_save(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new cb_partitions.$cb_partition_save_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SPECIFIED_DIRECTORY)) {
                _csetf_cb_part_save_specified_directory(v_new, current_value);
            } else
                if (pcase_var.eql($PERSONAL_DIRECTORY)) {
                    _csetf_cb_part_save_personal_directory(v_new, current_value);
                } else
                    if (pcase_var.eql($PUBLIC_DIRECTORY)) {
                        _csetf_cb_part_save_public_directory(v_new, current_value);
                    } else
                        if (pcase_var.eql($FILENAME)) {
                            _csetf_cb_part_save_filename(v_new, current_value);
                        } else
                            if (pcase_var.eql($PREDEFINED_METHODS)) {
                                _csetf_cb_part_save_predefined_methods(v_new, current_value);
                            } else
                                if (pcase_var.eql($ONTOLOGIES)) {
                                    _csetf_cb_part_save_ontologies(v_new, current_value);
                                } else
                                    if (pcase_var.eql($QUOTED_ONTOLOGIES)) {
                                        _csetf_cb_part_save_quoted_ontologies(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($TERMS)) {
                                            _csetf_cb_part_save_terms(v_new, current_value);
                                        } else {
                                            Errors.error($str36$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cb_partition_save(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CB_PARTITION_SAVE, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SPECIFIED_DIRECTORY, cb_part_save_specified_directory(obj));
        funcall(visitor_fn, obj, $SLOT, $PERSONAL_DIRECTORY, cb_part_save_personal_directory(obj));
        funcall(visitor_fn, obj, $SLOT, $PUBLIC_DIRECTORY, cb_part_save_public_directory(obj));
        funcall(visitor_fn, obj, $SLOT, $FILENAME, cb_part_save_filename(obj));
        funcall(visitor_fn, obj, $SLOT, $PREDEFINED_METHODS, cb_part_save_predefined_methods(obj));
        funcall(visitor_fn, obj, $SLOT, $ONTOLOGIES, cb_part_save_ontologies(obj));
        funcall(visitor_fn, obj, $SLOT, $QUOTED_ONTOLOGIES, cb_part_save_quoted_ontologies(obj));
        funcall(visitor_fn, obj, $SLOT, $TERMS, cb_part_save_terms(obj));
        funcall(visitor_fn, obj, $END, MAKE_CB_PARTITION_SAVE, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cb_partition_save_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cb_partition_save(obj, visitor_fn);
    }

    public static SubLObject new_cb_partition_save() {
        final SubLObject part_save = make_cb_partition_save(UNPROVIDED);
        cb_reset_partition_save_file_info(part_save);
        cb_reset_partition_save_scope_info(part_save);
        return part_save;
    }

    public static SubLObject cb_partition_save_specified_directory(final SubLObject part_save) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        return cb_part_save_specified_directory(part_save);
    }

    public static SubLObject cb_partition_save_personal_directory(final SubLObject part_save) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        return cb_part_save_personal_directory(part_save);
    }

    public static SubLObject cb_partition_save_public_directory(final SubLObject part_save) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        return cb_part_save_public_directory(part_save);
    }

    public static SubLObject cb_partition_save_filename(final SubLObject part_save) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        return cb_part_save_filename(part_save);
    }

    public static SubLObject cb_partition_save_predefined_methods(final SubLObject part_save) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        return cb_part_save_predefined_methods(part_save);
    }

    public static SubLObject cb_partition_save_ontologies(final SubLObject part_save) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        return cb_part_save_ontologies(part_save);
    }

    public static SubLObject cb_partition_save_quoted_ontologies(final SubLObject part_save) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        return cb_part_save_quoted_ontologies(part_save);
    }

    public static SubLObject cb_partition_save_terms(final SubLObject part_save) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        return cb_part_save_terms(part_save);
    }

    public static SubLObject cb_set_partition_save_specified_directory(final SubLObject part_save, final SubLObject directory) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        assert NIL != stringp(directory) : "Types.stringp(directory) " + "CommonSymbols.NIL != Types.stringp(directory) " + directory;
        _csetf_cb_part_save_specified_directory(part_save, directory);
        return part_save;
    }

    public static SubLObject cb_set_partition_save_personal_directory(final SubLObject part_save, final SubLObject directory) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        if (((NIL != directory) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(directory))) {
            throw new AssertionError(directory);
        }
        _csetf_cb_part_save_personal_directory(part_save, directory);
        return part_save;
    }

    public static SubLObject cb_set_partition_save_public_directory(final SubLObject part_save, final SubLObject directory) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        if (((NIL != directory) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(directory))) {
            throw new AssertionError(directory);
        }
        _csetf_cb_part_save_public_directory(part_save, directory);
        return part_save;
    }

    public static SubLObject cb_set_partition_save_filename(final SubLObject part_save, final SubLObject filename) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        _csetf_cb_part_save_filename(part_save, filename);
        return part_save;
    }

    public static SubLObject cb_set_partition_save_predefined_methods(final SubLObject part_save, final SubLObject v_methods) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        _csetf_cb_part_save_predefined_methods(part_save, v_methods);
        return part_save;
    }

    public static SubLObject cb_set_partition_save_ontologies(final SubLObject part_save, final SubLObject ontologies) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        assert NIL != listp(ontologies) : "Types.listp(ontologies) " + "CommonSymbols.NIL != Types.listp(ontologies) " + ontologies;
        _csetf_cb_part_save_ontologies(part_save, ontologies);
        return part_save;
    }

    public static SubLObject cb_set_partition_save_quoted_ontologies(final SubLObject part_save, final SubLObject quoted_ontologies) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        assert NIL != listp(quoted_ontologies) : "Types.listp(quoted_ontologies) " + "CommonSymbols.NIL != Types.listp(quoted_ontologies) " + quoted_ontologies;
        _csetf_cb_part_save_quoted_ontologies(part_save, quoted_ontologies);
        return part_save;
    }

    public static SubLObject cb_set_partition_save_terms(final SubLObject part_save, final SubLObject terms) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        assert NIL != listp(terms) : "Types.listp(terms) " + "CommonSymbols.NIL != Types.listp(terms) " + terms;
        _csetf_cb_part_save_terms(part_save, terms);
        return part_save;
    }

    public static SubLObject cb_partition_save_compute_partition(final SubLObject part_save) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        SubLObject partition = NIL;
        SubLObject cdolist_list_var = cb_partition_save_predefined_methods(part_save);
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            partition = cons(list($FUNCTION, method), partition);
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        cdolist_list_var = cb_partition_save_ontologies(part_save);
        SubLObject ontology = NIL;
        ontology = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            partition = cons(list($ONTOLOGY, ontology), partition);
            cdolist_list_var = cdolist_list_var.rest();
            ontology = cdolist_list_var.first();
        } 
        cdolist_list_var = cb_partition_save_quoted_ontologies(part_save);
        SubLObject quoted_ontology = NIL;
        quoted_ontology = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            partition = cons(list($QUOTED_ONTOLOGY, quoted_ontology), partition);
            cdolist_list_var = cdolist_list_var.rest();
            quoted_ontology = cdolist_list_var.first();
        } 
        cdolist_list_var = cb_partition_save_terms(part_save);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            partition = cons(list($TERM, v_term), partition);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        partition = nreverse(partition);
        return partition;
    }

    public static SubLObject cb_add_partition_save_ontology(final SubLObject part_save, final SubLObject ontology) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        assert NIL != forts.fort_p(ontology) : "forts.fort_p(ontology) " + "CommonSymbols.NIL != forts.fort_p(ontology) " + ontology;
        if (NIL == member(ontology, cb_part_save_ontologies(part_save), symbol_function(EQUAL), symbol_function(IDENTITY))) {
            final SubLObject new_cons = cons(ontology, NIL);
            final SubLObject list = cb_part_save_ontologies(part_save);
            if (NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            } else {
                _csetf_cb_part_save_ontologies(part_save, new_cons);
            }
        }
        return part_save;
    }

    public static SubLObject cb_add_partition_save_quoted_ontology(final SubLObject part_save, final SubLObject quoted_ontology) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        assert NIL != forts.fort_p(quoted_ontology) : "forts.fort_p(quoted_ontology) " + "CommonSymbols.NIL != forts.fort_p(quoted_ontology) " + quoted_ontology;
        if (NIL == member(quoted_ontology, cb_part_save_quoted_ontologies(part_save), symbol_function(EQUAL), symbol_function(IDENTITY))) {
            final SubLObject new_cons = cons(quoted_ontology, NIL);
            final SubLObject list = cb_part_save_quoted_ontologies(part_save);
            if (NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            } else {
                _csetf_cb_part_save_quoted_ontologies(part_save, new_cons);
            }
        }
        return part_save;
    }

    public static SubLObject cb_add_partition_save_term(final SubLObject part_save, final SubLObject v_term) {
        assert NIL != cb_partition_save_p(part_save) : "cb_partitions.cb_partition_save_p(part_save) " + "CommonSymbols.NIL != cb_partitions.cb_partition_save_p(part_save) " + part_save;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        if (NIL == member(v_term, cb_part_save_terms(part_save), symbol_function(EQUAL), symbol_function(IDENTITY))) {
            final SubLObject new_cons = cons(v_term, NIL);
            final SubLObject list = cb_part_save_terms(part_save);
            if (NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            } else {
                _csetf_cb_part_save_terms(part_save, new_cons);
            }
        }
        return part_save;
    }

    public static SubLObject cb_reset_partition_save_file_info(final SubLObject part_save) {
        cb_set_partition_save_specified_directory(part_save, $str49$);
        cb_set_partition_save_public_directory(part_save, cb_compute_partition_save_public_directory());
        cb_set_partition_save_personal_directory(part_save, cb_compute_partition_save_personal_directory());
        cb_set_partition_save_filename(part_save, $str49$);
        return part_save;
    }

    public static SubLObject cb_reset_partition_save_scope_info(final SubLObject part_save) {
        cb_set_partition_save_predefined_methods(part_save, NIL);
        cb_set_partition_save_ontologies(part_save, NIL);
        cb_set_partition_save_quoted_ontologies(part_save, NIL);
        cb_set_partition_save_terms(part_save, NIL);
        return part_save;
    }

    public static SubLObject cb_perform_partition_save(final SubLObject filename, final SubLObject part_save) {
        final SubLObject partition = cb_partition_save_compute_partition(part_save);
        partitions.save_partition(filename, partition);
        return NIL;
    }

    public static SubLObject cb_perform_partition_load(final SubLObject partition_files) {
        SubLObject cdolist_list_var = partition_files;
        SubLObject filename = NIL;
        filename = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            partitions.load_partition(filename, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            filename = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cb_all_partition_methods() {
        return Mapping.mapcar(symbol_function(FIRST), $cb_partition_method_table$.getGlobalValue());
    }

    public static SubLObject cb_partition_save_method_id(final SubLObject method) {
        return position(method, $cb_partition_method_table$.getGlobalValue(), symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_partition_save_method_description(final SubLObject method) {
        return second(find(method, $cb_partition_method_table$.getGlobalValue(), symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject scope_partition_all_kb_additions() {
        SubLObject start = new_constant_suid_threshold();
        SubLObject table_var = do_constants_table();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject constant;
        for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            constant = id_index_lookup(table_var, id, UNPROVIDED);
            if (NIL != constant) {
                partitions.scope_partition_term(constant);
            }
        }
        start = nart_handles.new_nart_id_threshold();
        table_var = nart_handles.do_narts_table();
        SubLObject nart;
        for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            nart = id_index_lookup(table_var, id, UNPROVIDED);
            if (NIL != nart) {
                partitions.scope_partition_term(nart);
            }
        }
        start = assertion_handles.get_file_backed_assertion_internal_id_threshold();
        table_var = assertion_handles.do_assertions_table();
        SubLObject assertion;
        for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            assertion = id_index_lookup(table_var, id, UNPROVIDED);
            if (NIL != assertion) {
                partitions.scope_partition_assertion(assertion);
            }
        }
        start = deduction_handles.get_file_backed_deduction_internal_id_threshold();
        table_var = deduction_handles.do_deductions_table();
        SubLObject deduction;
        for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            deduction = id_index_lookup(table_var, id, UNPROVIDED);
            if (NIL != deduction) {
                partitions.scope_partition_deduction(deduction);
            }
        }
        return NIL;
    }

    public static SubLObject scope_partition_all_assertions_in_hlmt_naut() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str54$Scoping_assertions_in_microtheori;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$1 = idx;
                if (NIL == id_index_objects_empty_p(idx_$1, $SKIP)) {
                    final SubLObject idx_$2 = idx_$1;
                    if (NIL == id_index_dense_objects_empty_p(idx_$2, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$2);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject assertion;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != assertion_in_hlmt_naut_p(assertion)) {
                                    partitions.scope_partition_assertion_and_meta_assertions(assertion);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$3 = idx_$1;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$3)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$3);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$3);
                        final SubLObject end_id = id_index_next_id(idx_$3);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != assertion_in_hlmt_naut_p(assertion2)) {
                                    partitions.scope_partition_assertion_and_meta_assertions(assertion2);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject assertion_in_hlmt_naut_p(final SubLObject v_object) {
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) && (NIL != hlmt.hlmt_naut_p(assertions_high.assertion_mt(v_object))));
    }

    public static SubLObject cb_current_partition_save() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_current_partition_save$.getDynamicValue(thread);
    }

    public static SubLObject cb_ensure_current_partition_save() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $cb_current_partition_save$.getDynamicValue(thread)) {
            $cb_current_partition_save$.setDynamicValue(new_cb_partition_save(), thread);
        }
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    cb_partition_save_terms($cb_current_partition_save$.getDynamicValue(thread));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            $cb_current_partition_save$.setDynamicValue(new_cb_partition_save(), thread);
        }
        return cb_current_partition_save();
    }

    public static SubLObject cb_partition_save(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_partition_save_guts();
    }

    public static SubLObject cb_link_partition_save(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str59$_Partition_Save_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str61$cb_partition_save);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_partition_save_guts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_ensure_current_partition_save();
        final SubLObject part_save = cb_current_partition_save();
        final SubLObject title_var = $$$Partition_Save;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str67$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str68$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str73$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str79$cb_handle_partition_save, T, UNPROVIDED);
                            cb_partition_save_header(part_save);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_partition_save_filename_section(part_save);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_partition_save_scope_section(part_save);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$6, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$5, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_partition_save_header(final SubLObject part_save) {
        cb_help_preamble($CB_PARTITION_SAVE, UNPROVIDED, UNPROVIDED);
        html_reset_input($$$Reset_Form);
        html_indent(UNPROVIDED);
        html_submit_input($$$Update_Partition_Scope, $$$update, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_submit_input($$$Save_Partition, $$$save, UNPROVIDED);
        html_indent(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_partition_save_filename_section(final SubLObject part_save) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_princ_strong($$$Partition_Filename);
        html_markup(html_macros.$html_big_tail$.getGlobalValue());
        final SubLObject personal_directory = cb_partition_save_personal_directory(part_save);
        final SubLObject public_directory = cb_partition_save_public_directory(part_save);
        final SubLObject specified_directory = cb_partition_save_specified_directory(part_save);
        html_newline(TWO_INTEGER);
        html_princ_strong($str88$Choose_or_specify_a_directory__);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != personal_directory) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_radio_input($$$directory, $$$personal, string_utilities.empty_string_p(specified_directory), UNPROVIDED);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                            html_princ(personal_directory);
                            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            if (NIL != public_directory) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_radio_input($$$directory, $$$public, makeBoolean((NIL != string_utilities.empty_string_p(specified_directory)) && (NIL == personal_directory)), UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                        html_princ(public_directory);
                        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_script_utilities.html_focus_radio_input($$$directory, $str92$specified_directory, $$$specified, makeBoolean(NIL == string_utilities.empty_string_p(specified_directory)), UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_text_input($str92$specified_directory, specified_directory, $int$60);
                    html_script_utilities.html_clear_input_button($str92$specified_directory, $$$Clear, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        final SubLObject filename = cb_partition_save_filename(part_save);
        final SubLObject extension = $cb_partition_extension$.getGlobalValue();
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($str97$Specify_the_filename__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$Extension);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_script_utilities.html_clear_input_button($str99$partition_filename, $$$Clear, UNPROVIDED);
                    html_text_input($str99$partition_filename, filename, $int$40);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                    html_princ($str1$_);
                    html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                    html_princ(extension);
                    html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_partition_save_scope_section(final SubLObject part_save) {
        html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_princ_strong($$$Partition_Scope);
        html_markup(html_macros.$html_big_tail$.getGlobalValue());
        html_indent(FOUR_INTEGER);
        html_submit_input($$$Clear_Partition_Scope, $str103$reset_scope, UNPROVIDED);
        html_newline(TWO_INTEGER);
        cb_partition_save_predefined_methods_section(part_save);
        html_newline(TWO_INTEGER);
        cb_partition_save_ontologies_section(part_save);
        html_newline(TWO_INTEGER);
        cb_partition_save_quoted_ontologies_section(part_save);
        html_newline(TWO_INTEGER);
        cb_partition_save_terms_section(part_save);
        return NIL;
    }

    public static SubLObject cb_partition_save_predefined_methods_section(final SubLObject part_save) {
        final SubLObject partition_methods = cb_partition_save_predefined_methods(part_save);
        final SubLObject all_partition_methods = cb_all_partition_methods();
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str104$Predefined_Methods___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        SubLObject cdolist_list_var = all_partition_methods;
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject currentP = subl_promotions.memberP(method, partition_methods, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
            cb_partition_save_method_checkbox(method, currentP);
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cb_partition_save_method_checkbox(final SubLObject method, final SubLObject checkedP) {
        final SubLObject id = cb_partition_save_method_id(method);
        final SubLObject description = cb_partition_save_method_description(method);
        final SubLObject name = format(NIL, $str105$method__A, id);
        html_checkbox_input(name, id, checkedP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_princ(description);
        return NIL;
    }

    public static SubLObject cb_partition_save_ontologies_section(final SubLObject part_save) {
        final SubLObject partition_ontologies = cb_partition_save_ontologies(part_save);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str106$Ontologies__instances_and_specs__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (NIL == partition_ontologies) {
            html_princ($$$None);
        } else {
            html_newline(UNPROVIDED);
            SubLObject list_var = NIL;
            SubLObject ontology = NIL;
            SubLObject index = NIL;
            list_var = partition_ontologies;
            ontology = list_var.first();
            for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , ontology = list_var.first() , index = add(ONE_INTEGER, index)) {
                final SubLObject id = cb_fort_identifier(ontology);
                final SubLObject name = format(NIL, $str108$ontology__A, index);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_checkbox_input(name, id, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cb_form(ontology, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                html_indent(TWO_INTEGER);
            }
        }
        html_newline(UNPROVIDED);
        html_princ_strong($str109$Add_Ontology__);
        html_indent(FOUR_INTEGER);
        html_submit_input($$$Update_Partition_Scope, $$$update, UNPROVIDED);
        html_newline(UNPROVIDED);
        html_complete.html_complete_button($$$ontology, $$$Complete, $$Collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_text_input($$$ontology, NIL, $int$40);
        return NIL;
    }

    public static SubLObject cb_partition_save_quoted_ontologies_section(final SubLObject part_save) {
        final SubLObject partition_quoted_ontologies = cb_partition_save_quoted_ontologies(part_save);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str113$Quoted_Ontologies__quoted_instanc);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (NIL == partition_quoted_ontologies) {
            html_princ($$$None);
        } else {
            html_newline(UNPROVIDED);
            SubLObject list_var = NIL;
            SubLObject quoted_ontology = NIL;
            SubLObject index = NIL;
            list_var = partition_quoted_ontologies;
            quoted_ontology = list_var.first();
            for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , quoted_ontology = list_var.first() , index = add(ONE_INTEGER, index)) {
                final SubLObject id = cb_fort_identifier(quoted_ontology);
                final SubLObject name = format(NIL, $str114$quoted_ontology__A, index);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_checkbox_input(name, id, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cb_form(quoted_ontology, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                html_indent(TWO_INTEGER);
            }
        }
        html_newline(UNPROVIDED);
        html_princ_strong($str115$Add_Quoted_Ontology__);
        html_indent(FOUR_INTEGER);
        html_submit_input($$$Update_Partition_Scope, $$$update, UNPROVIDED);
        html_newline(UNPROVIDED);
        html_complete.html_complete_button($str116$quoted_ontology, $$$Complete, $$Collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_text_input($str116$quoted_ontology, NIL, $int$40);
        return NIL;
    }

    public static SubLObject cb_partition_save_terms_section(final SubLObject part_save) {
        final SubLObject partition_terms = cb_partition_save_terms(part_save);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str117$Terms___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (NIL == partition_terms) {
            html_princ($$$None);
        } else {
            html_newline(UNPROVIDED);
            SubLObject list_var = NIL;
            SubLObject v_term = NIL;
            SubLObject index = NIL;
            list_var = partition_terms;
            v_term = list_var.first();
            for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , index = add(ONE_INTEGER, index)) {
                final SubLObject id = cb_fort_identifier(v_term);
                final SubLObject name = format(NIL, $str118$term__A, index);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_checkbox_input(name, id, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cb_form(v_term, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                html_indent(TWO_INTEGER);
            }
        }
        html_newline(UNPROVIDED);
        html_princ_strong($str119$Add_Term___);
        html_indent(FOUR_INTEGER);
        html_submit_input($$$Update_Partition_Scope, $$$update, UNPROVIDED);
        html_newline(UNPROVIDED);
        html_complete.html_complete_button($$$term, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_text_input($$$term, NIL, $int$40);
        return NIL;
    }

    public static SubLObject cb_handle_partition_save(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject part_save = cb_current_partition_save();
        SubLObject specified_directory = html_extract_input($str92$specified_directory, args);
        SubLObject filename = html_extract_input($str99$partition_filename, args);
        if (NIL != specified_directory) {
            specified_directory = string_utilities.trim_whitespace(specified_directory);
            cb_set_partition_save_specified_directory(part_save, specified_directory);
        } else {
            cb_set_partition_save_specified_directory(part_save, $str49$);
        }
        if (NIL != filename) {
            filename = string_utilities.trim_whitespace(filename);
            cb_set_partition_save_filename(part_save, filename);
        } else {
            cb_set_partition_save_filename(part_save, $str49$);
        }
        if (NIL != html_extract_input($str103$reset_scope, args)) {
            cb_reset_partition_save_scope_info(part_save);
            return cb_partition_save_guts();
        }
        final SubLObject v_methods = cb_extract_save_partition_methods(args);
        SubLObject preserved_ontologies = NIL;
        SubLObject new_ontology = NIL;
        SubLObject preserved_quoted_ontologies = NIL;
        SubLObject new_quoted_ontology = NIL;
        SubLObject preserved_terms = NIL;
        SubLObject new_term = NIL;
        thread.resetMultipleValues();
        final SubLObject preserved_ontologies_$27 = cb_extract_save_partition_ontologies(args);
        final SubLObject new_ontology_$28 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        preserved_ontologies = preserved_ontologies_$27;
        new_ontology = new_ontology_$28;
        if ($ERROR == new_ontology) {
            final SubLObject ontology_string = html_extract_input($$$ontology, args);
            return cb_error($str122$_S_does_not_specify_a_Cyc_collect, ontology_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject preserved_quoted_ontologies_$29 = cb_extract_save_partition_quoted_ontologies(args);
        final SubLObject new_quoted_ontology_$30 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        preserved_quoted_ontologies = preserved_quoted_ontologies_$29;
        new_quoted_ontology = new_quoted_ontology_$30;
        if ($ERROR == new_quoted_ontology) {
            final SubLObject quoted_ontology_string = html_extract_input($str116$quoted_ontology, args);
            return cb_error($str122$_S_does_not_specify_a_Cyc_collect, quoted_ontology_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject preserved_terms_$31 = cb_extract_save_partition_terms(args);
        final SubLObject new_term_$32 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        preserved_terms = preserved_terms_$31;
        new_term = new_term_$32;
        if ($ERROR == new_term) {
            final SubLObject term_string = html_extract_input($$$term, args);
            return cb_error($str122$_S_does_not_specify_a_Cyc_collect, term_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cb_set_partition_save_predefined_methods(part_save, v_methods);
        cb_set_partition_save_ontologies(part_save, preserved_ontologies);
        cb_set_partition_save_quoted_ontologies(part_save, preserved_quoted_ontologies);
        cb_set_partition_save_terms(part_save, preserved_terms);
        if (NIL != new_ontology) {
            cb_add_partition_save_ontology(part_save, new_ontology);
        }
        if (NIL != new_quoted_ontology) {
            cb_add_partition_save_quoted_ontology(part_save, new_quoted_ontology);
        }
        if (NIL != new_term) {
            cb_add_partition_save_term(part_save, new_term);
        }
        if (NIL != html_extract_input($$$update, args)) {
            return cb_partition_save_guts();
        }
        if (NIL != html_extract_input($$$save, args)) {
            final SubLObject filename2 = cb_partition_save_filename(part_save);
            final SubLObject destination_type = html_extract_input($$$directory, args);
            SubLObject destination_directory = NIL;
            if (destination_type.equal($$$personal)) {
                destination_directory = cb_partition_save_personal_directory(part_save);
            } else
                if (destination_type.equal($$$public)) {
                    destination_directory = cb_partition_save_public_directory(part_save);
                } else
                    if (destination_type.equal($$$specified)) {
                        destination_directory = cb_partition_save_specified_directory(part_save);
                    }


            final SubLObject full_filename = make_partition_filename(destination_directory, filename2, UNPROVIDED);
            cb_perform_partition_save(full_filename, part_save);
            return cb_message_page_with_history($str123$Partition_has_been_saved_, NIL);
        }
        return cb_partition_save_guts();
    }

    public static SubLObject cb_extract_save_partition_methods(final SubLObject args) {
        SubLObject method_ids = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isCons() && (NIL != string_utilities.starts_with(arg.first(), $str125$method_))) {
                final SubLObject method_id_string = second(arg);
                final SubLObject var = parse_integer(method_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != var) {
                    method_ids = cons(var, method_ids);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        SubLObject v_methods = NIL;
        SubLObject cdolist_list_var2 = cb_all_partition_methods();
        SubLObject method = NIL;
        method = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject method_id = cb_partition_save_method_id(method);
            if (NIL != subl_promotions.memberP(method_id, method_ids, UNPROVIDED, UNPROVIDED)) {
                v_methods = cons(method, v_methods);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            method = cdolist_list_var2.first();
        } 
        return nreverse(v_methods);
    }

    public static SubLObject cb_extract_save_partition_ontologies(final SubLObject args) {
        SubLObject preserved_ontologies = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isCons() && (NIL != string_utilities.starts_with(arg.first(), $str126$ontology_))) {
                final SubLObject id = second(arg);
                final SubLObject preserved_ontology = cb_guess_fort(id, UNPROVIDED);
                if (NIL != forts.fort_p(preserved_ontology)) {
                    preserved_ontologies = cons(preserved_ontology, preserved_ontologies);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        preserved_ontologies = nreverse(preserved_ontologies);
        SubLObject new_ontology_string = html_extract_input($$$ontology, args);
        SubLObject new_ontology = NIL;
        if (NIL != new_ontology_string) {
            new_ontology_string = string_utilities.trim_whitespace(new_ontology_string);
        }
        if (NIL == string_utilities.empty_stringP(new_ontology_string)) {
            new_ontology = cb_guess_fort(new_ontology_string, UNPROVIDED);
            if ((NIL == new_ontology) || (NIL == fort_types_interface.collectionP(new_ontology))) {
                new_ontology = $ERROR;
            }
        }
        return values(preserved_ontologies, new_ontology);
    }

    public static SubLObject cb_extract_save_partition_quoted_ontologies(final SubLObject args) {
        SubLObject preserved_quoted_ontologies = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isCons() && (NIL != string_utilities.starts_with(arg.first(), $str127$quoted_ontology_))) {
                final SubLObject id = second(arg);
                final SubLObject preserved_quoted_ontology = cb_guess_fort(id, UNPROVIDED);
                if (NIL != forts.fort_p(preserved_quoted_ontology)) {
                    preserved_quoted_ontologies = cons(preserved_quoted_ontology, preserved_quoted_ontologies);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        preserved_quoted_ontologies = nreverse(preserved_quoted_ontologies);
        SubLObject new_quoted_ontology_string = html_extract_input($str116$quoted_ontology, args);
        SubLObject new_quoted_ontology = NIL;
        if (NIL != new_quoted_ontology_string) {
            new_quoted_ontology_string = string_utilities.trim_whitespace(new_quoted_ontology_string);
        }
        if (NIL == string_utilities.empty_stringP(new_quoted_ontology_string)) {
            new_quoted_ontology = cb_guess_fort(new_quoted_ontology_string, UNPROVIDED);
            if ((NIL == new_quoted_ontology) || (NIL == fort_types_interface.collectionP(new_quoted_ontology))) {
                new_quoted_ontology = $ERROR;
            }
        }
        return values(preserved_quoted_ontologies, new_quoted_ontology);
    }

    public static SubLObject cb_extract_save_partition_terms(final SubLObject args) {
        SubLObject preserved_terms = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isCons() && (NIL != string_utilities.starts_with(arg.first(), $str128$term_))) {
                final SubLObject id = second(arg);
                final SubLObject preserved_term = cb_guess_fort(id, UNPROVIDED);
                if (NIL != forts.fort_p(preserved_term)) {
                    preserved_terms = cons(preserved_term, preserved_terms);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        preserved_terms = nreverse(preserved_terms);
        SubLObject new_term_string = html_extract_input($$$term, args);
        SubLObject new_term = NIL;
        if (NIL != new_term_string) {
            new_term_string = string_utilities.trim_whitespace(new_term_string);
        }
        if (NIL == string_utilities.empty_stringP(new_term_string)) {
            new_term = cb_guess_fort(new_term_string, UNPROVIDED);
            if (NIL == new_term) {
                new_term = $ERROR;
            }
        }
        return values(preserved_terms, new_term);
    }

    public static SubLObject cb_partition_load(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_partition_load_guts();
    }

    public static SubLObject cb_link_partition_load(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str130$_Partition_Load_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str131$cb_partition_load);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_partition_load_guts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn($$$the_Partition_Load_page);
        }
        final SubLObject title_var = $$$Partition_Load;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str67$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str68$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$33 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$34 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str73$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str138$cb_handle_partition_load, T, UNPROVIDED);
                            cb_partition_load_header();
                            html_newline(TWO_INTEGER);
                            html_princ_strong($str139$Specify_or_select_one_or_more_par);
                            html_newline(TWO_INTEGER);
                            cb_partition_load_filename_section();
                            html_newline(UNPROVIDED);
                            cb_partition_finalize_section();
                            html_newline(UNPROVIDED);
                            cb_partition_load_personal_section();
                            cb_partition_load_public_section();
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$34, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$33, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_partition_load_header() {
        cb_help_preamble($CB_PARTITION_LOAD, UNPROVIDED, UNPROVIDED);
        html_reset_input($$$Reset_Form);
        html_indent(UNPROVIDED);
        html_submit_input($$$Load_Partitions, $$$load, UNPROVIDED);
        html_indent(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_partition_load_filename_section() {
        html_princ($str144$Full_pathname_of_a_partition_file);
        html_newline(UNPROVIDED);
        html_filename_input($str145$specified_filename, $str49$, $int$80);
        return NIL;
    }

    public static SubLObject cb_partition_finalize_section() {
        html_checkbox_input($$$finalize, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_princ($str148$_Clean_up_after_load____Only_unch);
        return NIL;
    }

    public static SubLObject cb_partition_load_personal_section() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject personal_directory = cb_compute_partition_load_personal_directory();
        if ((NIL != personal_directory) && (NIL != Filesys.directory_p(personal_directory))) {
            final SubLObject partition_files = directory_partition_files(personal_directory);
            if (NIL != partition_files) {
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(FOUR_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($LEFT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ_strong($$$Personal_partitions_from);
                            html_indent(UNPROVIDED);
                            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                            html_princ(personal_directory);
                            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    SubLObject list_var = NIL;
                    SubLObject partition_file = NIL;
                    SubLObject index = NIL;
                    list_var = partition_files;
                    partition_file = list_var.first();
                    for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , partition_file = list_var.first() , index = add(ONE_INTEGER, index)) {
                        final SubLObject full_filename = cconcatenate(personal_directory, partition_file);
                        final SubLObject write_time = Filesys.file_write_date(full_filename);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                final SubLObject checkbox_name = format(NIL, $str151$personal__A, index);
                                html_checkbox_input(checkbox_name, index, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                html_princ(partition_file);
                                html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_indent(TWO_INTEGER);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($RIGHT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_small_head$.getGlobalValue());
                                html_princ(numeric_date_utilities.safe_timestring(write_time));
                                html_markup(html_macros.$html_small_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject cb_partition_load_public_section() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject public_directory = cb_compute_partition_load_public_directory();
        if ((NIL != public_directory) && (NIL != Filesys.directory_p(public_directory))) {
            final SubLObject partition_files = directory_partition_files(public_directory);
            if (NIL != partition_files) {
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(FOUR_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($LEFT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ_strong($$$Public_partitions_from);
                            html_indent(UNPROVIDED);
                            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                            html_princ(public_directory);
                            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    SubLObject list_var = NIL;
                    SubLObject partition_file = NIL;
                    SubLObject index = NIL;
                    list_var = partition_files;
                    partition_file = list_var.first();
                    for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , partition_file = list_var.first() , index = add(ONE_INTEGER, index)) {
                        final SubLObject full_filename = cconcatenate(public_directory, partition_file);
                        final SubLObject write_time = Filesys.file_write_date(full_filename);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                final SubLObject checkbox_name = format(NIL, $str154$public__A, index);
                                html_checkbox_input(checkbox_name, index, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                html_princ(partition_file);
                                html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_indent(TWO_INTEGER);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($RIGHT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_small_head$.getGlobalValue());
                                html_princ(numeric_date_utilities.safe_timestring(write_time));
                                html_markup(html_macros.$html_small_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject cb_handle_partition_load(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject partition_files = NIL;
        thread.resetMultipleValues();
        final SubLObject specified_filename = cb_partition_load_extract_specified_filename(args);
        final SubLObject non_existentP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != non_existentP) {
            return cb_error($str155$The_specified_filename__S_could_n, specified_filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != specified_filename) {
            partition_files = cons(specified_filename, partition_files);
        }
        SubLObject cdolist_list_var;
        final SubLObject personal_filenames = cdolist_list_var = cb_partition_load_extract_personal_filenames(args);
        SubLObject filename = NIL;
        filename = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            partition_files = cons(filename, partition_files);
            cdolist_list_var = cdolist_list_var.rest();
            filename = cdolist_list_var.first();
        } 
        final SubLObject public_filenames = cdolist_list_var = cb_partition_load_extract_public_filenames(args);
        filename = NIL;
        filename = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            partition_files = cons(filename, partition_files);
            cdolist_list_var = cdolist_list_var.rest();
            filename = cdolist_list_var.first();
        } 
        partition_files = nreverse(partition_files);
        if (NIL == partition_files) {
            return cb_partition_load_guts();
        }
        cb_perform_partition_load(partition_files);
        if (NIL != cb_partition_load_extract_finalize(args)) {
            partitions.partition_load_kb_cleanup();
        }
        if (NIL != list_utilities.singletonP(partition_files)) {
            return cb_message_page_with_history($str156$Partition_has_been_loaded_, NIL);
        }
        return cb_message_page_with_history($str157$Partition_files_have_been_loaded_, NIL);
    }

    public static SubLObject cb_partition_load_extract_specified_filename(final SubLObject args) {
        SubLObject specified_filename = html_extract_input($str145$specified_filename, args);
        SubLObject non_existentP = NIL;
        if (NIL != specified_filename) {
            specified_filename = string_utilities.trim_whitespace(specified_filename);
            if (NIL != string_utilities.empty_stringP(specified_filename)) {
                specified_filename = NIL;
            }
        }
        if (NIL != specified_filename) {
            non_existentP = makeBoolean(NIL == Filesys.probe_file(specified_filename));
        }
        return values(specified_filename, non_existentP);
    }

    public static SubLObject cb_partition_load_extract_finalize(final SubLObject args) {
        return html_extract_input($$$finalize, args);
    }

    public static SubLObject cb_partition_load_extract_personal_filenames(final SubLObject args) {
        final SubLObject personal_directory = cb_compute_partition_load_personal_directory();
        if ((NIL != personal_directory) && (NIL != Filesys.directory_p(personal_directory))) {
            final SubLObject partition_files = directory_partition_files(personal_directory);
            if (NIL != partition_files) {
                SubLObject selected_partitions = NIL;
                SubLObject cdolist_list_var = args;
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (arg.isCons()) {
                        SubLObject current;
                        final SubLObject datum = current = arg;
                        SubLObject input = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list159);
                        input = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list159);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != string_utilities.starts_with(input, $str160$personal_)) {
                                final SubLObject index = parse_integer(value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (index.isInteger()) {
                                    final SubLObject filename = nth(index, partition_files);
                                    if (NIL != filename) {
                                        final SubLObject full_filename = cconcatenate(personal_directory, filename);
                                        if (NIL != Filesys.probe_file(full_filename)) {
                                            selected_partitions = cons(full_filename, selected_partitions);
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list159);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
                return nreverse(selected_partitions);
            }
        }
        return NIL;
    }

    public static SubLObject cb_partition_load_extract_public_filenames(final SubLObject args) {
        final SubLObject public_directory = cb_compute_partition_load_public_directory();
        if ((NIL != public_directory) && (NIL != Filesys.directory_p(public_directory))) {
            final SubLObject partition_files = directory_partition_files(public_directory);
            if (NIL != partition_files) {
                SubLObject selected_partitions = NIL;
                SubLObject cdolist_list_var = args;
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (arg.isCons()) {
                        SubLObject current;
                        final SubLObject datum = current = arg;
                        SubLObject input = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list159);
                        input = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list159);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != string_utilities.starts_with(input, $str161$public_)) {
                                final SubLObject index = parse_integer(value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (index.isInteger()) {
                                    final SubLObject filename = nth(index, partition_files);
                                    if (NIL != filename) {
                                        final SubLObject full_filename = cconcatenate(public_directory, filename);
                                        if (NIL != Filesys.probe_file(full_filename)) {
                                            selected_partitions = cons(full_filename, selected_partitions);
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list159);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
                return nreverse(selected_partitions);
            }
        }
        return NIL;
    }

    public static SubLObject declare_cb_partitions_file() {
        declareFunction(me, "make_partition_filename", "MAKE-PARTITION-FILENAME", 2, 1, false);
        declareFunction(me, "directory_partition_files", "DIRECTORY-PARTITION-FILES", 1, 0, false);
        declareFunction(me, "cb_compute_partition_save_public_directory", "CB-COMPUTE-PARTITION-SAVE-PUBLIC-DIRECTORY", 0, 0, false);
        declareFunction(me, "cb_compute_partition_save_personal_directory", "CB-COMPUTE-PARTITION-SAVE-PERSONAL-DIRECTORY", 0, 0, false);
        declareFunction(me, "cb_compute_partition_load_public_directory", "CB-COMPUTE-PARTITION-LOAD-PUBLIC-DIRECTORY", 0, 0, false);
        declareFunction(me, "cb_compute_partition_load_personal_directory", "CB-COMPUTE-PARTITION-LOAD-PERSONAL-DIRECTORY", 0, 0, false);
        declareFunction(me, "cb_partition_save_print_function_trampoline", "CB-PARTITION-SAVE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "cb_partition_save_p", "CB-PARTITION-SAVE-P", 1, 0, false);
        new cb_partitions.$cb_partition_save_p$UnaryFunction();
        declareFunction(me, "cb_part_save_specified_directory", "CB-PART-SAVE-SPECIFIED-DIRECTORY", 1, 0, false);
        declareFunction(me, "cb_part_save_personal_directory", "CB-PART-SAVE-PERSONAL-DIRECTORY", 1, 0, false);
        declareFunction(me, "cb_part_save_public_directory", "CB-PART-SAVE-PUBLIC-DIRECTORY", 1, 0, false);
        declareFunction(me, "cb_part_save_filename", "CB-PART-SAVE-FILENAME", 1, 0, false);
        declareFunction(me, "cb_part_save_predefined_methods", "CB-PART-SAVE-PREDEFINED-METHODS", 1, 0, false);
        declareFunction(me, "cb_part_save_ontologies", "CB-PART-SAVE-ONTOLOGIES", 1, 0, false);
        declareFunction(me, "cb_part_save_quoted_ontologies", "CB-PART-SAVE-QUOTED-ONTOLOGIES", 1, 0, false);
        declareFunction(me, "cb_part_save_terms", "CB-PART-SAVE-TERMS", 1, 0, false);
        declareFunction(me, "_csetf_cb_part_save_specified_directory", "_CSETF-CB-PART-SAVE-SPECIFIED-DIRECTORY", 2, 0, false);
        declareFunction(me, "_csetf_cb_part_save_personal_directory", "_CSETF-CB-PART-SAVE-PERSONAL-DIRECTORY", 2, 0, false);
        declareFunction(me, "_csetf_cb_part_save_public_directory", "_CSETF-CB-PART-SAVE-PUBLIC-DIRECTORY", 2, 0, false);
        declareFunction(me, "_csetf_cb_part_save_filename", "_CSETF-CB-PART-SAVE-FILENAME", 2, 0, false);
        declareFunction(me, "_csetf_cb_part_save_predefined_methods", "_CSETF-CB-PART-SAVE-PREDEFINED-METHODS", 2, 0, false);
        declareFunction(me, "_csetf_cb_part_save_ontologies", "_CSETF-CB-PART-SAVE-ONTOLOGIES", 2, 0, false);
        declareFunction(me, "_csetf_cb_part_save_quoted_ontologies", "_CSETF-CB-PART-SAVE-QUOTED-ONTOLOGIES", 2, 0, false);
        declareFunction(me, "_csetf_cb_part_save_terms", "_CSETF-CB-PART-SAVE-TERMS", 2, 0, false);
        declareFunction(me, "make_cb_partition_save", "MAKE-CB-PARTITION-SAVE", 0, 1, false);
        declareFunction(me, "visit_defstruct_cb_partition_save", "VISIT-DEFSTRUCT-CB-PARTITION-SAVE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_cb_partition_save_method", "VISIT-DEFSTRUCT-OBJECT-CB-PARTITION-SAVE-METHOD", 2, 0, false);
        declareFunction(me, "new_cb_partition_save", "NEW-CB-PARTITION-SAVE", 0, 0, false);
        declareFunction(me, "cb_partition_save_specified_directory", "CB-PARTITION-SAVE-SPECIFIED-DIRECTORY", 1, 0, false);
        declareFunction(me, "cb_partition_save_personal_directory", "CB-PARTITION-SAVE-PERSONAL-DIRECTORY", 1, 0, false);
        declareFunction(me, "cb_partition_save_public_directory", "CB-PARTITION-SAVE-PUBLIC-DIRECTORY", 1, 0, false);
        declareFunction(me, "cb_partition_save_filename", "CB-PARTITION-SAVE-FILENAME", 1, 0, false);
        declareFunction(me, "cb_partition_save_predefined_methods", "CB-PARTITION-SAVE-PREDEFINED-METHODS", 1, 0, false);
        declareFunction(me, "cb_partition_save_ontologies", "CB-PARTITION-SAVE-ONTOLOGIES", 1, 0, false);
        declareFunction(me, "cb_partition_save_quoted_ontologies", "CB-PARTITION-SAVE-QUOTED-ONTOLOGIES", 1, 0, false);
        declareFunction(me, "cb_partition_save_terms", "CB-PARTITION-SAVE-TERMS", 1, 0, false);
        declareFunction(me, "cb_set_partition_save_specified_directory", "CB-SET-PARTITION-SAVE-SPECIFIED-DIRECTORY", 2, 0, false);
        declareFunction(me, "cb_set_partition_save_personal_directory", "CB-SET-PARTITION-SAVE-PERSONAL-DIRECTORY", 2, 0, false);
        declareFunction(me, "cb_set_partition_save_public_directory", "CB-SET-PARTITION-SAVE-PUBLIC-DIRECTORY", 2, 0, false);
        declareFunction(me, "cb_set_partition_save_filename", "CB-SET-PARTITION-SAVE-FILENAME", 2, 0, false);
        declareFunction(me, "cb_set_partition_save_predefined_methods", "CB-SET-PARTITION-SAVE-PREDEFINED-METHODS", 2, 0, false);
        declareFunction(me, "cb_set_partition_save_ontologies", "CB-SET-PARTITION-SAVE-ONTOLOGIES", 2, 0, false);
        declareFunction(me, "cb_set_partition_save_quoted_ontologies", "CB-SET-PARTITION-SAVE-QUOTED-ONTOLOGIES", 2, 0, false);
        declareFunction(me, "cb_set_partition_save_terms", "CB-SET-PARTITION-SAVE-TERMS", 2, 0, false);
        declareFunction(me, "cb_partition_save_compute_partition", "CB-PARTITION-SAVE-COMPUTE-PARTITION", 1, 0, false);
        declareFunction(me, "cb_add_partition_save_ontology", "CB-ADD-PARTITION-SAVE-ONTOLOGY", 2, 0, false);
        declareFunction(me, "cb_add_partition_save_quoted_ontology", "CB-ADD-PARTITION-SAVE-QUOTED-ONTOLOGY", 2, 0, false);
        declareFunction(me, "cb_add_partition_save_term", "CB-ADD-PARTITION-SAVE-TERM", 2, 0, false);
        declareFunction(me, "cb_reset_partition_save_file_info", "CB-RESET-PARTITION-SAVE-FILE-INFO", 1, 0, false);
        declareFunction(me, "cb_reset_partition_save_scope_info", "CB-RESET-PARTITION-SAVE-SCOPE-INFO", 1, 0, false);
        declareFunction(me, "cb_perform_partition_save", "CB-PERFORM-PARTITION-SAVE", 2, 0, false);
        declareFunction(me, "cb_perform_partition_load", "CB-PERFORM-PARTITION-LOAD", 1, 0, false);
        declareFunction(me, "cb_all_partition_methods", "CB-ALL-PARTITION-METHODS", 0, 0, false);
        declareFunction(me, "cb_partition_save_method_id", "CB-PARTITION-SAVE-METHOD-ID", 1, 0, false);
        declareFunction(me, "cb_partition_save_method_description", "CB-PARTITION-SAVE-METHOD-DESCRIPTION", 1, 0, false);
        declareFunction(me, "scope_partition_all_kb_additions", "SCOPE-PARTITION-ALL-KB-ADDITIONS", 0, 0, false);
        declareFunction(me, "scope_partition_all_assertions_in_hlmt_naut", "SCOPE-PARTITION-ALL-ASSERTIONS-IN-HLMT-NAUT", 0, 0, false);
        declareFunction(me, "assertion_in_hlmt_naut_p", "ASSERTION-IN-HLMT-NAUT-P", 1, 0, false);
        declareFunction(me, "cb_current_partition_save", "CB-CURRENT-PARTITION-SAVE", 0, 0, false);
        declareFunction(me, "cb_ensure_current_partition_save", "CB-ENSURE-CURRENT-PARTITION-SAVE", 0, 0, false);
        declareFunction(me, "cb_partition_save", "CB-PARTITION-SAVE", 0, 1, false);
        declareFunction(me, "cb_link_partition_save", "CB-LINK-PARTITION-SAVE", 0, 1, false);
        declareFunction(me, "cb_partition_save_guts", "CB-PARTITION-SAVE-GUTS", 0, 0, false);
        declareFunction(me, "cb_partition_save_header", "CB-PARTITION-SAVE-HEADER", 1, 0, false);
        declareFunction(me, "cb_partition_save_filename_section", "CB-PARTITION-SAVE-FILENAME-SECTION", 1, 0, false);
        declareFunction(me, "cb_partition_save_scope_section", "CB-PARTITION-SAVE-SCOPE-SECTION", 1, 0, false);
        declareFunction(me, "cb_partition_save_predefined_methods_section", "CB-PARTITION-SAVE-PREDEFINED-METHODS-SECTION", 1, 0, false);
        declareFunction(me, "cb_partition_save_method_checkbox", "CB-PARTITION-SAVE-METHOD-CHECKBOX", 2, 0, false);
        declareFunction(me, "cb_partition_save_ontologies_section", "CB-PARTITION-SAVE-ONTOLOGIES-SECTION", 1, 0, false);
        declareFunction(me, "cb_partition_save_quoted_ontologies_section", "CB-PARTITION-SAVE-QUOTED-ONTOLOGIES-SECTION", 1, 0, false);
        declareFunction(me, "cb_partition_save_terms_section", "CB-PARTITION-SAVE-TERMS-SECTION", 1, 0, false);
        declareFunction(me, "cb_handle_partition_save", "CB-HANDLE-PARTITION-SAVE", 1, 0, false);
        declareFunction(me, "cb_extract_save_partition_methods", "CB-EXTRACT-SAVE-PARTITION-METHODS", 1, 0, false);
        declareFunction(me, "cb_extract_save_partition_ontologies", "CB-EXTRACT-SAVE-PARTITION-ONTOLOGIES", 1, 0, false);
        declareFunction(me, "cb_extract_save_partition_quoted_ontologies", "CB-EXTRACT-SAVE-PARTITION-QUOTED-ONTOLOGIES", 1, 0, false);
        declareFunction(me, "cb_extract_save_partition_terms", "CB-EXTRACT-SAVE-PARTITION-TERMS", 1, 0, false);
        declareFunction(me, "cb_partition_load", "CB-PARTITION-LOAD", 0, 1, false);
        declareFunction(me, "cb_link_partition_load", "CB-LINK-PARTITION-LOAD", 0, 1, false);
        declareFunction(me, "cb_partition_load_guts", "CB-PARTITION-LOAD-GUTS", 0, 0, false);
        declareFunction(me, "cb_partition_load_header", "CB-PARTITION-LOAD-HEADER", 0, 0, false);
        declareFunction(me, "cb_partition_load_filename_section", "CB-PARTITION-LOAD-FILENAME-SECTION", 0, 0, false);
        declareFunction(me, "cb_partition_finalize_section", "CB-PARTITION-FINALIZE-SECTION", 0, 0, false);
        declareFunction(me, "cb_partition_load_personal_section", "CB-PARTITION-LOAD-PERSONAL-SECTION", 0, 0, false);
        declareFunction(me, "cb_partition_load_public_section", "CB-PARTITION-LOAD-PUBLIC-SECTION", 0, 0, false);
        declareFunction(me, "cb_handle_partition_load", "CB-HANDLE-PARTITION-LOAD", 1, 0, false);
        declareFunction(me, "cb_partition_load_extract_specified_filename", "CB-PARTITION-LOAD-EXTRACT-SPECIFIED-FILENAME", 1, 0, false);
        declareFunction(me, "cb_partition_load_extract_finalize", "CB-PARTITION-LOAD-EXTRACT-FINALIZE", 1, 0, false);
        declareFunction(me, "cb_partition_load_extract_personal_filenames", "CB-PARTITION-LOAD-EXTRACT-PERSONAL-FILENAMES", 1, 0, false);
        declareFunction(me, "cb_partition_load_extract_public_filenames", "CB-PARTITION-LOAD-EXTRACT-PUBLIC-FILENAMES", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_partitions_file() {
        deflexical("*CB-PARTITION-EXTENSION*", $$$cpart);
        defconstant("*DTP-CB-PARTITION-SAVE*", CB_PARTITION_SAVE);
        deflexical("*CB-PARTITION-METHOD-TABLE*", $list50);
        defvar("*CB-CURRENT-PARTITION-SAVE*", NIL);
        return NIL;
    }

    public static SubLObject setup_cb_partitions_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cb_partition_save$.getGlobalValue(), symbol_function(CB_PARTITION_SAVE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list11);
        def_csetf(CB_PART_SAVE_SPECIFIED_DIRECTORY, _CSETF_CB_PART_SAVE_SPECIFIED_DIRECTORY);
        def_csetf(CB_PART_SAVE_PERSONAL_DIRECTORY, _CSETF_CB_PART_SAVE_PERSONAL_DIRECTORY);
        def_csetf(CB_PART_SAVE_PUBLIC_DIRECTORY, _CSETF_CB_PART_SAVE_PUBLIC_DIRECTORY);
        def_csetf(CB_PART_SAVE_FILENAME, _CSETF_CB_PART_SAVE_FILENAME);
        def_csetf(CB_PART_SAVE_PREDEFINED_METHODS, _CSETF_CB_PART_SAVE_PREDEFINED_METHODS);
        def_csetf(CB_PART_SAVE_ONTOLOGIES, _CSETF_CB_PART_SAVE_ONTOLOGIES);
        def_csetf(CB_PART_SAVE_QUOTED_ONTOLOGIES, _CSETF_CB_PART_SAVE_QUOTED_ONTOLOGIES);
        def_csetf(CB_PART_SAVE_TERMS, _CSETF_CB_PART_SAVE_TERMS);
        identity(CB_PARTITION_SAVE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cb_partition_save$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CB_PARTITION_SAVE_METHOD));
        register_external_symbol(SCOPE_PARTITION_ALL_KB_ADDITIONS);
        register_external_symbol(SCOPE_PARTITION_ALL_ASSERTIONS_IN_HLMT_NAUT);
        register_html_state_variable($cb_current_partition_save$);
        html_macros.note_cgi_handler_function(CB_PARTITION_SAVE, $HTML_HANDLER);
        setup_cb_link_method($PARTITION_SAVE, CB_LINK_PARTITION_SAVE, ONE_INTEGER);
        declare_cb_tool($PARTITION_SAVE, $$$Partition_Save, $$$PartSave, $$$Save_out_a_KB_partition);
        sethash($CB_PARTITION_SAVE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str81$cb_partition_save_html, NIL));
        html_macros.note_cgi_handler_function(CB_HANDLE_PARTITION_SAVE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_PARTITION_LOAD, $HTML_HANDLER);
        setup_cb_link_method($PARTITION_LOAD, CB_LINK_PARTITION_LOAD, ONE_INTEGER);
        declare_cb_tool($PARTITION_LOAD, $$$Partition_Load, $$$PartLoad, $$$Load_a_KB_partition);
        sethash($CB_PARTITION_LOAD, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str141$cb_partition_load_html, NIL));
        html_macros.note_cgi_handler_function(CB_HANDLE_PARTITION_LOAD, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_partitions_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_partitions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_partitions_file();
    }

    static {







































































































































































    }

    public static final class $cb_partition_save_native extends SubLStructNative {
        public SubLObject $specified_directory;

        public SubLObject $personal_directory;

        public SubLObject $public_directory;

        public SubLObject $filename;

        public SubLObject $predefined_methods;

        public SubLObject $ontologies;

        public SubLObject $quoted_ontologies;

        public SubLObject $terms;

        private static final SubLStructDeclNative structDecl;

        public $cb_partition_save_native() {
            this.$specified_directory = Lisp.NIL;
            this.$personal_directory = Lisp.NIL;
            this.$public_directory = Lisp.NIL;
            this.$filename = Lisp.NIL;
            this.$predefined_methods = Lisp.NIL;
            this.$ontologies = Lisp.NIL;
            this.$quoted_ontologies = Lisp.NIL;
            this.$terms = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$specified_directory;
        }

        @Override
        public SubLObject getField3() {
            return this.$personal_directory;
        }

        @Override
        public SubLObject getField4() {
            return this.$public_directory;
        }

        @Override
        public SubLObject getField5() {
            return this.$filename;
        }

        @Override
        public SubLObject getField6() {
            return this.$predefined_methods;
        }

        @Override
        public SubLObject getField7() {
            return this.$ontologies;
        }

        @Override
        public SubLObject getField8() {
            return this.$quoted_ontologies;
        }

        @Override
        public SubLObject getField9() {
            return this.$terms;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$specified_directory = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$personal_directory = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$public_directory = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$filename = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$predefined_methods = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$ontologies = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$quoted_ontologies = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$terms = value;
        }

        static {
            structDecl = makeStructDeclNative(cb_partitions.$cb_partition_save_native.class, CB_PARTITION_SAVE, CB_PARTITION_SAVE_P, $list5, $list6, new String[]{ "$specified_directory", "$personal_directory", "$public_directory", "$filename", "$predefined_methods", "$ontologies", "$quoted_ontologies", "$terms" }, $list7, $list8, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $cb_partition_save_p$UnaryFunction extends UnaryFunction {
        public $cb_partition_save_p$UnaryFunction() {
            super(extractFunctionNamed("CB-PARTITION-SAVE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cb_partition_save_p(arg1);
        }
    }
}

/**
 * Total time: 809 ms synthetic
 */

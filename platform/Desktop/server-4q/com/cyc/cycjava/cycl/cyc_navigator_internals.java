package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_navigator_internals extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_navigator_internals";
    public static final String myFingerPrint = "e0833408bf582f1f82bdba5f7a6f9913c0f3965598e7b1d08bf520b8593c7e2d";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 498L)
    public static SubLSymbol $navigator_links_sorted$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 628L)
    public static SubLSymbol $navigator_columns$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 742L)
    public static SubLSymbol $navigator_column_padding$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 887L)
    public static SubLSymbol $columnize_by_category$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 1181L)
    public static SubLSymbol $navigator_line_spacing$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 1236L)
    public static SubLSymbol $navigator_table_border$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 1284L)
    public static SubLSymbol $navigator_vector_length$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 1494L)
    public static SubLSymbol $navigator_link_definition_table$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 1725L)
    public static SubLSymbol $navigator_link_category_table$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 2000L)
    public static SubLSymbol $navigator_link_types$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 2183L)
    public static SubLSymbol $navigator_link_categories$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 3249L)
    public static SubLSymbol $navigator_link_definition_keys$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 15892L)
    public static SubLSymbol $nav_link_method_table$;
    private static final SubLSymbol $sym0$_NAVIGATOR_COLUMNS_;
    private static final SubLSymbol $sym1$_NAVIGATOR_COLUMN_PADDING_;
    private static final SubLSymbol $sym2$_COLUMNIZE_BY_CATEGORY_;
    private static final SubLString $str3$single;
    private static final SubLSymbol $sym4$_NAVIGATOR_LINE_SPACING_;
    private static final SubLSymbol $sym5$_NAVIGATOR_TABLE_BORDER_;
    private static final SubLSymbol $sym6$_NAVIGATOR_LINK_DEFINITION_TABLE_;
    private static final SubLInteger $int7$100;
    private static final SubLSymbol $sym8$_NAVIGATOR_LINK_CATEGORY_TABLE_;
    private static final SubLInteger $int9$50;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$CAR;
    private static final SubLSymbol $kw14$REPLACE;
    private static final SubLString $str15$No_vector_in__s_for_the_link_key_;
    private static final SubLString $str16$No_index_in__s_for_the_definition;
    private static final SubLSymbol $sym17$_NAVIGATOR_LINK_DEFINITION_KEYS_;
    private static final SubLSymbol $kw18$CONS;
    private static final SubLSymbol $kw19$ADJOIN;
    private static final SubLSymbol $kw20$APPEND;
    private static final SubLSymbol $kw21$NCONC;
    private static final SubLSymbol $kw22$UNION;
    private static final SubLSymbol $kw23$INTERSECTION;
    private static final SubLString $str24$_s_is_not_a_supported_method_for_;
    private static final SubLSymbol $sym25$SET_LINK_VALUE;
    private static final SubLString $str26$_s;
    private static final SubLString $str27$___a_a____s;
    private static final SubLString $str28$in_def_navigator_link_for__s___s_;
    private static final SubLSymbol $sym29$LINK_TYPE;
    private static final SubLString $str30$in_def_navigator_link_for__s___s_;
    private static final SubLSymbol $sym31$CATEGORIES;
    private static final SubLString $str32$in_def_navigator_link_for__s___s_;
    private static final SubLSymbol $sym33$NUMBER_OF_ARGS;
    private static final SubLString $str34$in_def_navigator_link_for__s___s_;
    private static final SubLSymbol $sym35$HREF_BASE_STRING;
    private static final SubLSymbol $kw36$LINK_TYPE;
    private static final SubLSymbol $kw37$CATEGORIES;
    private static final SubLSymbol $kw38$HREF_BASE_STRING;
    private static final SubLSymbol $kw39$NUMBER_OF_ARGS;
    private static final SubLSymbol $kw40$TARGET;
    private static final SubLSymbol $kw41$LINK_TEXT;
    private static final SubLSymbol $kw42$HREF_TAGS;
    private static final SubLSymbol $kw43$IMAGE_SRC;
    private static final SubLSymbol $kw44$ISMAP;
    private static final SubLSymbol $kw45$ALT;
    private static final SubLSymbol $kw46$ALIGN;
    private static final SubLSymbol $kw47$BORDER;
    private static final SubLList $list48;
    private static final SubLString $str49$1;
    private static final SubLString $str50$_;
    private static final SubLSymbol $sym51$STRING_;
    private static final SubLSymbol $sym52$NAVIGATOR_CATEGORIES_SORT_KEY;
    private static final SubLSymbol $sym53$LINK_SORT_KEY;
    private static final SubLList $list54;
    private static final SubLString $str55$No_link_text_found_for__s_in_call;
    private static final SubLSymbol $sym56$NAV_LINK_FOR_TEXT;
    private static final SubLSymbol $kw57$TEXT;
    private static final SubLSymbol $kw58$IMAGE;
    private static final SubLSymbol $kw59$RED;
    private static final SubLString $str60$Error___a_must_be_one_of__s__but_;
    private static final SubLString $str61$Malformed_Navigator_Link;
    private static final SubLString $str62$The_navigator_link__s_is_malforme;
    private static final SubLSymbol $sym63$NAV_MALFORMED_LINK;
    private static final SubLSymbol $kw64$HTML_HANDLER;
    private static final SubLString $str65$;
    private static final SubLString $str66$_a_nav_malformed_link__s;
    private static final SubLSymbol $sym67$FORMAT;
    private static final SubLString $str68$_a__a;
    private static final SubLString $str69$cg;
    private static final SubLList $list70;
    private static final SubLString $str71$left;
    private static final SubLString $str72$top;
    private static final SubLString $str73$double;
    private static final SubLString $str74$Untitled_Category_;
    private static final SubLSymbol $sym75$VALID_NAVIGATOR_LINK_;
    private static final SubLSymbol $sym76$COLUMNIZE_BY_LINKS;
    private static final SubLSymbol $sym77$COLUMNIZE_BY_CATEGORIES;
    private static final SubLSymbol $sym78$THIRD;
    private static final SubLSymbol $sym79$CATEGORY_HAS_LINKS_;
    private static final SubLString $str80$Cyc_Navigator;
    private static final SubLString $str81$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str82$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw83$UNINITIALIZED;
    private static final SubLSymbol $kw84$CB_CYC;
    private static final SubLSymbol $kw85$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw86$SHA1;
    private static final SubLString $str87$yui_skin_sam;
    private static final SubLString $str88$reloadFrameButton;
    private static final SubLString $str89$button;
    private static final SubLString $str90$reload;
    private static final SubLString $str91$Refresh_Frames;
    private static final SubLSymbol $kw92$SELF;
    private static final SubLString $str93$Back;
    private static final SubLString $str94$There_are_no_Cyc_Navigator_links_;
    private static final SubLString $str95$Go_Back;
    private static final SubLSymbol $sym96$CYC_NAVIGATOR;
    private static final SubLString $str97$right;
    private static final SubLString $str98$Number_of_columns__;
    private static final SubLString $str99$column_number;
    private static final SubLString $str100$Width_between_columns__;
    private static final SubLString $str101$column_padding;
    private static final SubLString $str102$Link_category_arrangement__;
    private static final SubLString $str103$columnize_by_category;
    private static final SubLString $str104$yes;
    private static final SubLString $str105$_one_column_per_category;
    private static final SubLString $str106$no;
    private static final SubLString $str107$_multiple_columns_per_category;
    private static final SubLString $str108$Line_spacing__;
    private static final SubLString $str109$line_spacing;
    private static final SubLList $list110;
    private static final SubLSymbol $sym111$FORMAT_NAVIGATOR_PREFERENCES;
    private static final SubLString $str112$Cyc_Navigator_Preferences;
    private static final SubLString $str113$post;
    private static final SubLString $str114$handle_navigator_preferences;
    private static final SubLString $str115$middle;
    private static final SubLString $str116$Current_Values;
    private static final SubLString $str117$Update;
    private static final SubLSymbol $sym118$SET_NAVIGATOR_PREFERENCES;
    private static final SubLInteger $int119$200;
    private static final SubLSymbol $sym120$HANDLE_NAVIGATOR_PREFERENCES;
    private static final SubLObject $const121$Guest;
    private static final SubLString $str122$Please_Login_Now;
    private static final SubLSymbol $sym123$GUEST_WARN;
    private static final SubLString $str124$Sorry___a_cannot_be_used_by_peopl;
    private static final SubLString $str125$this_facility;
    private static final SubLString $str126$___Failure_to_login_using_your_un;
    private static final SubLSymbol $kw127$CB_LOGIN;
    private static final SubLString $str128$login;
    private static final SubLString $str129$_using_your_real_name_now_;
    private static final SubLString $str130$Sorry___a_cannot_be_used_by_peopl;
    private static final SubLString $str131$___Failure_to_login_using_your_un;
    private static final SubLSymbol $sym132$STRING_CAPITALIZE;
    private static final SubLString $str133$Load_Transcript;
    private static final SubLSymbol $kw134$MAIN;
    private static final SubLString $str135$cb_load_transcript;
    private static final SubLSymbol $kw136$LOAD_TRANSCRIPT;
    private static final SubLSymbol $sym137$CB_LINK_LOAD_TRANSCRIPT;
    private static final SubLString $str138$Transcript_Load;
    private static final SubLString $str139$TLoad;
    private static final SubLString $str140$Load_transcript_file;
    private static final SubLSymbol $sym141$HTML_LOAD_TRANSCRIPT;
    private static final SubLString $str142$the_Load_Transcript_File_page;
    private static final SubLString $str143$Load_Transcript_File;
    private static final SubLString $str144$handle_load_transcript;
    private static final SubLString $str145$center;
    private static final SubLString $str146$Pathname_;
    private static final SubLString $str147$load_file;
    private static final SubLInteger $int148$40;
    private static final SubLString $str149$Clear;
    private static final SubLString $str150$Load;
    private static final SubLString $str151$Destination_queue__;
    private static final SubLString $str152$queue;
    private static final SubLString $str153$_aux;
    private static final SubLString $str154$__AUXILIARY;
    private static final SubLString $str155$_local;
    private static final SubLString $str156$__LOCAL;
    private static final SubLString $str157$_none;
    private static final SubLString $str158$__NONE;
    private static final SubLString $str159$transcript;
    private static final SubLString $str160$_Transcript_unenqueued___NONE__op;
    private static final SubLString $str161$READ_THIS_BEFORE_LOADING_A_TRANSC;
    private static final SubLString $str162$The_possible_values_for_the_desti;
    private static final SubLString $str163$Loading_a_transcript_file_may_hav;
    private static final SubLSymbol $sym164$CB_LOAD_TRANSCRIPT;
    private static final SubLString $str165$Transcript_File_Loaded;
    private static final SubLString $str166$The_file__s_containing__s_operati;
    private static final SubLString $str167$Transcript_File_Problem;
    private static final SubLString $str168$The_file__s_exists__but_no_operat;
    private static final SubLString $str169$File_Not_Available;
    private static final SubLString $str170$The_file__s_cannot_be_accessed___;
    private static final SubLSymbol $sym171$HANDLE_LOAD_TRANSCRIPT;
    private static final SubLString $str172$The_file_;
    private static final SubLString $str173$_does_not_exist__or_cannot_be_acc;
    private static final SubLSymbol $sym174$REPORT_FILE_NOT_AVAILABLE;
    private static final SubLSymbol $kw175$CYCL;
    private static final SubLSymbol $kw176$NL;
    private static final SubLSymbol $sym177$MAYBE_USE_ENGLISH;
    private static final SubLString $str178$Show_Assertions_in_English;
    private static final SubLString $str179$Show_Assertions_in_CycL;
    private static final SubLSymbol $sym180$CLEAR_PG_CACHES;
    private static final SubLSymbol $sym181$CYC_NAV_CLEAR_EL_FORMULAS_CACHE;
    private static final SubLSymbol $sym182$HTML_START_AGENDA;
    private static final SubLSymbol $sym183$HTML_HALT_AGENDA;
    private static final SubLSymbol $sym184$HTML_RESTART_AGENDA;
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 5517L)
    public static SubLObject make_new_link_vector(SubLObject length) {
        if (length == cyc_navigator_internals.UNPROVIDED) {
            length = cyc_navigator_internals.$navigator_vector_length$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!length.isInteger()) {
            length = Sequences.length(cyc_navigator_internals.$navigator_link_definition_keys$.getDynamicValue(thread));
        }
        return Vectors.make_vector(length, (SubLObject)cyc_navigator_internals.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 5842L)
    public static SubLObject get_link_vector(final SubLObject link_key) {
        return Hashtables.gethash(link_key, cyc_navigator_internals.$navigator_link_definition_table$.getGlobalValue(), (SubLObject)cyc_navigator_internals.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 6024L)
    public static SubLObject navigator_link(final SubLObject keyword) {
        return get_link_vector(keyword);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 6093L)
    public static SubLObject navigator_links(SubLObject category_keyword) {
        if (category_keyword == cyc_navigator_internals.UNPROVIDED) {
            category_keyword = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (cyc_navigator_internals.NIL != category_keyword) {
            return Hashtables.gethash(category_keyword, cyc_navigator_internals.$navigator_link_category_table$.getGlobalValue(), (SubLObject)cyc_navigator_internals.UNPROVIDED);
        }
        SubLObject ans = (SubLObject)cyc_navigator_internals.NIL;
        SubLObject key = (SubLObject)cyc_navigator_internals.NIL;
        SubLObject val = (SubLObject)cyc_navigator_internals.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cyc_navigator_internals.$navigator_link_definition_table$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                val = Hashtables.getEntryValue(cdohash_entry);
                if (val.isVector()) {
                    ans = (SubLObject)ConsesLow.cons(key, ans);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 6376L)
    public static SubLObject navigator_link_categories() {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)cyc_navigator_internals.$sym13$CAR), cyc_navigator_internals.$navigator_link_categories$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 6466L)
    public static SubLObject navigator_link_categoryP(final SubLObject keyword) {
        return Sequences.find(keyword, navigator_link_categories(), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 6568L)
    public static SubLObject get_link_value(final SubLObject link_key, final SubLObject definition_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject vector = get_link_vector(link_key);
        final SubLObject index = conses_high.assoc(definition_key, cyc_navigator_internals.$navigator_link_definition_keys$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED).rest();
        final SubLObject value = (SubLObject)((vector.isVector() && index.isInteger()) ? Vectors.aref(vector, index) : cyc_navigator_internals.NIL);
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 7016L)
    public static SubLObject set_link_value(final SubLObject link_key, final SubLObject definition_key, final SubLObject v_new, SubLObject method, SubLObject test) {
        if (method == cyc_navigator_internals.UNPROVIDED) {
            method = (SubLObject)cyc_navigator_internals.$kw14$REPLACE;
        }
        if (test == cyc_navigator_internals.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cyc_navigator_internals.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject vector = get_link_vector(link_key);
        if (cyc_navigator_internals.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !vector.isVector()) {
            Errors.error((SubLObject)cyc_navigator_internals.$str15$No_vector_in__s_for_the_link_key_, (SubLObject)cyc_navigator_internals.$sym6$_NAVIGATOR_LINK_DEFINITION_TABLE_, link_key);
        }
        final SubLObject index = conses_high.assoc(definition_key, cyc_navigator_internals.$navigator_link_definition_keys$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED).rest();
        if (cyc_navigator_internals.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !index.isInteger()) {
            Errors.error((SubLObject)cyc_navigator_internals.$str16$No_index_in__s_for_the_definition, (SubLObject)cyc_navigator_internals.$sym17$_NAVIGATOR_LINK_DEFINITION_KEYS_, definition_key);
        }
        final SubLObject value = Vectors.aref(vector, index);
        final SubLObject pcase_var = method;
        if (pcase_var.eql((SubLObject)cyc_navigator_internals.$kw14$REPLACE)) {
            Vectors.set_aref(vector, index, v_new);
        }
        else if (pcase_var.eql((SubLObject)cyc_navigator_internals.$kw18$CONS)) {
            Vectors.set_aref(vector, index, (SubLObject)ConsesLow.cons(v_new, value));
        }
        else if (pcase_var.eql((SubLObject)cyc_navigator_internals.$kw19$ADJOIN)) {
            Vectors.set_aref(vector, index, conses_high.adjoin(v_new, value, test, (SubLObject)cyc_navigator_internals.UNPROVIDED));
        }
        else if (pcase_var.eql((SubLObject)cyc_navigator_internals.$kw20$APPEND)) {
            Vectors.set_aref(vector, index, ConsesLow.append(v_new, value));
        }
        else if (pcase_var.eql((SubLObject)cyc_navigator_internals.$kw21$NCONC)) {
            Vectors.set_aref(vector, index, ConsesLow.nconc(v_new, value));
        }
        else if (pcase_var.eql((SubLObject)cyc_navigator_internals.$kw22$UNION)) {
            Vectors.set_aref(vector, index, conses_high.union(v_new, value, test, (SubLObject)cyc_navigator_internals.UNPROVIDED));
        }
        else {
            if (!pcase_var.eql((SubLObject)cyc_navigator_internals.$kw23$INTERSECTION)) {
                Errors.error((SubLObject)cyc_navigator_internals.$str24$_s_is_not_a_supported_method_for_, method, (SubLObject)cyc_navigator_internals.$sym25$SET_LINK_VALUE);
                return (SubLObject)cyc_navigator_internals.NIL;
            }
            Vectors.set_aref(vector, index, conses_high.intersection(v_new, value, test, (SubLObject)cyc_navigator_internals.UNPROVIDED));
        }
        return Vectors.aref(vector, index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 8458L)
    public static SubLObject return_link_definition(final SubLObject link_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject vector = get_link_vector(link_key);
        SubLObject ans = (SubLObject)cyc_navigator_internals.NIL;
        if (vector.isVector()) {
            SubLObject cdolist_list_var = cyc_navigator_internals.$navigator_link_definition_keys$.getDynamicValue(thread);
            SubLObject pair = (SubLObject)cyc_navigator_internals.NIL;
            pair = cdolist_list_var.first();
            while (cyc_navigator_internals.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pair.first(), Vectors.aref(vector, pair.rest())), ans);
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 9046L)
    public static SubLObject print_link_definition(final SubLObject link_key) {
        final SubLObject result = return_link_definition(link_key);
        SubLObject longest = (SubLObject)cyc_navigator_internals.ZERO_INTEGER;
        SubLObject cdolist_list_var = result;
        SubLObject x = (SubLObject)cyc_navigator_internals.NIL;
        x = cdolist_list_var.first();
        while (cyc_navigator_internals.NIL != cdolist_list_var) {
            final SubLObject len1 = Sequences.length(PrintLow.format((SubLObject)cyc_navigator_internals.NIL, (SubLObject)cyc_navigator_internals.$str26$_s, x.first()));
            if (len1.numG(longest)) {
                longest = len1;
            }
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        }
        cdolist_list_var = result;
        x = (SubLObject)cyc_navigator_internals.NIL;
        x = cdolist_list_var.first();
        while (cyc_navigator_internals.NIL != cdolist_list_var) {
            final SubLObject key = PrintLow.format((SubLObject)cyc_navigator_internals.NIL, (SubLObject)cyc_navigator_internals.$str26$_s, x.first());
            final SubLObject len2 = Sequences.length(key);
            final SubLObject fill = Strings.make_string(Numbers.subtract(longest, len2), (SubLObject)cyc_navigator_internals.UNPROVIDED);
            PrintLow.format((SubLObject)cyc_navigator_internals.T, (SubLObject)cyc_navigator_internals.$str27$___a_a____s, new SubLObject[] { key, fill, conses_high.second(x) });
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        }
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 9489L)
    public static SubLObject def_navigator_link(final SubLObject link_key, final SubLObject link_type, final SubLObject categories, final SubLObject href_base_string, final SubLObject number_of_args, SubLObject target, SubLObject link_text, SubLObject href_tags, SubLObject image_src, SubLObject ismap, SubLObject alt, SubLObject align, SubLObject border) {
        if (target == cyc_navigator_internals.UNPROVIDED) {
            target = html_macros.$html_self_target$.getGlobalValue();
        }
        if (link_text == cyc_navigator_internals.UNPROVIDED) {
            link_text = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (href_tags == cyc_navigator_internals.UNPROVIDED) {
            href_tags = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (image_src == cyc_navigator_internals.UNPROVIDED) {
            image_src = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (ismap == cyc_navigator_internals.UNPROVIDED) {
            ismap = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (alt == cyc_navigator_internals.UNPROVIDED) {
            alt = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (align == cyc_navigator_internals.UNPROVIDED) {
            align = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (border == cyc_navigator_internals.UNPROVIDED) {
            border = (SubLObject)cyc_navigator_internals.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_navigator_internals.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && cyc_navigator_internals.NIL == Sequences.find(link_type, cyc_navigator_internals.$navigator_link_types$.getGlobalValue(), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED)) {
            Errors.error((SubLObject)cyc_navigator_internals.$str28$in_def_navigator_link_for__s___s_, new SubLObject[] { link_key, cyc_navigator_internals.$sym29$LINK_TYPE, cyc_navigator_internals.$navigator_link_types$.getGlobalValue(), link_type });
        }
        if (cyc_navigator_internals.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && cyc_navigator_internals.NIL == conses_high.intersection(categories, navigator_link_categories(), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED)) {
            Errors.error((SubLObject)cyc_navigator_internals.$str30$in_def_navigator_link_for__s___s_, link_key, (SubLObject)cyc_navigator_internals.$sym31$CATEGORIES, navigator_link_categories());
        }
        if (cyc_navigator_internals.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && cyc_navigator_internals.NIL == ((cyc_navigator_internals.NIL == href_tags) ? Types.integerp(number_of_args) : cyc_navigator_internals.T)) {
            Errors.error((SubLObject)cyc_navigator_internals.$str32$in_def_navigator_link_for__s___s_, link_key, (SubLObject)cyc_navigator_internals.$sym33$NUMBER_OF_ARGS, number_of_args);
        }
        if (cyc_navigator_internals.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && cyc_navigator_internals.NIL == href_base_string) {
            Errors.error((SubLObject)cyc_navigator_internals.$str34$in_def_navigator_link_for__s___s_, link_key, (SubLObject)cyc_navigator_internals.$sym35$HREF_BASE_STRING, href_base_string);
        }
        final SubLObject vector = get_link_vector(link_key);
        if (!vector.isVector() || !Sequences.length(vector).numGE(Sequences.length(cyc_navigator_internals.$navigator_link_definition_keys$.getDynamicValue(thread)))) {
            Hashtables.sethash(link_key, cyc_navigator_internals.$navigator_link_definition_table$.getGlobalValue(), make_new_link_vector((SubLObject)cyc_navigator_internals.UNPROVIDED));
        }
        set_link_value(link_key, (SubLObject)cyc_navigator_internals.$kw36$LINK_TYPE, link_type, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        set_link_value(link_key, (SubLObject)cyc_navigator_internals.$kw37$CATEGORIES, categories, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        set_link_value(link_key, (SubLObject)cyc_navigator_internals.$kw38$HREF_BASE_STRING, href_base_string, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        set_link_value(link_key, (SubLObject)cyc_navigator_internals.$kw39$NUMBER_OF_ARGS, number_of_args, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        set_link_value(link_key, (SubLObject)cyc_navigator_internals.$kw40$TARGET, target, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        set_link_value(link_key, (SubLObject)cyc_navigator_internals.$kw41$LINK_TEXT, link_text, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        set_link_value(link_key, (SubLObject)cyc_navigator_internals.$kw42$HREF_TAGS, href_tags, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        set_link_value(link_key, (SubLObject)cyc_navigator_internals.$kw43$IMAGE_SRC, image_src, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        set_link_value(link_key, (SubLObject)cyc_navigator_internals.$kw44$ISMAP, ismap, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        set_link_value(link_key, (SubLObject)cyc_navigator_internals.$kw45$ALT, alt, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        set_link_value(link_key, (SubLObject)cyc_navigator_internals.$kw46$ALIGN, align, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        set_link_value(link_key, (SubLObject)cyc_navigator_internals.$kw47$BORDER, border, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        SubLObject cdolist_list_var = categories;
        SubLObject category = (SubLObject)cyc_navigator_internals.NIL;
        category = cdolist_list_var.first();
        while (cyc_navigator_internals.NIL != cdolist_list_var) {
            final SubLObject value = Hashtables.gethash(category, cyc_navigator_internals.$navigator_link_category_table$.getGlobalValue(), (SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject v_new = conses_high.adjoin(link_key, value, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            Hashtables.sethash(category, cyc_navigator_internals.$navigator_link_category_table$.getGlobalValue(), v_new);
            cdolist_list_var = cdolist_list_var.rest();
            category = cdolist_list_var.first();
        }
        cyc_navigator_internals.$navigator_links_sorted$.setDynamicValue((SubLObject)cyc_navigator_internals.NIL, thread);
        return get_link_vector(link_key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 13969L)
    public static SubLObject remove_navigator_link(final SubLObject link_key) {
        final SubLObject value = Hashtables.gethash(link_key, cyc_navigator_internals.$navigator_link_definition_table$.getGlobalValue(), (SubLObject)cyc_navigator_internals.UNPROVIDED);
        if (cyc_navigator_internals.NIL != value) {
            SubLObject cdolist_list_var;
            final SubLObject categories = cdolist_list_var = get_link_value(link_key, (SubLObject)cyc_navigator_internals.$kw37$CATEGORIES);
            SubLObject c = (SubLObject)cyc_navigator_internals.NIL;
            c = cdolist_list_var.first();
            while (cyc_navigator_internals.NIL != cdolist_list_var) {
                final SubLObject keylist = Hashtables.gethash(c, cyc_navigator_internals.$navigator_link_category_table$.getGlobalValue(), (SubLObject)cyc_navigator_internals.UNPROVIDED);
                Hashtables.sethash(c, cyc_navigator_internals.$navigator_link_category_table$.getGlobalValue(), Sequences.remove(link_key, keylist, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                c = cdolist_list_var.first();
            }
        }
        Hashtables.sethash(link_key, cyc_navigator_internals.$navigator_link_definition_table$.getGlobalValue(), (SubLObject)cyc_navigator_internals.NIL);
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 14498L)
    public static SubLObject eval_link_sort_key(final SubLObject v_object) {
        SubLObject ans = (SubLObject)cyc_navigator_internals.NIL;
        ans = ((v_object.isSymbol() && cyc_navigator_internals.NIL != Symbols.fboundp(v_object)) ? Functions.funcall(v_object) : (v_object.isCons() ? Eval.eval(v_object) : v_object));
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 14702L)
    public static SubLObject link_sort_key(final SubLObject link_keyword) {
        SubLObject sort_key = (SubLObject)cyc_navigator_internals.NIL;
        if (cyc_navigator_internals.NIL == sort_key) {
            SubLObject csome_list_var;
            SubLObject definition_key;
            for (csome_list_var = (SubLObject)cyc_navigator_internals.$list48, definition_key = (SubLObject)cyc_navigator_internals.NIL, definition_key = csome_list_var.first(); cyc_navigator_internals.NIL == sort_key && cyc_navigator_internals.NIL != csome_list_var; sort_key = get_link_value(link_keyword, definition_key), csome_list_var = csome_list_var.rest(), definition_key = csome_list_var.first()) {}
        }
        if (cyc_navigator_internals.NIL == string_utilities.non_empty_stringP(sort_key)) {
            sort_key = eval_link_sort_key(sort_key);
        }
        if (cyc_navigator_internals.NIL == string_utilities.non_empty_stringP(sort_key)) {
            sort_key = (SubLObject)cyc_navigator_internals.$str49$1;
        }
        return sort_key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 15206L)
    public static SubLObject navigator_categories_sort_key(final SubLObject form) {
        SubLObject string = conses_high.second(form);
        if (cyc_navigator_internals.NIL == string_utilities.non_empty_stringP(string)) {
            string = (SubLObject)cyc_navigator_internals.$str50$_;
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 15370L)
    public static SubLObject sort_navigator_links() {
        cyc_navigator_internals.$navigator_link_categories$.setGlobalValue(Sort.sort(cyc_navigator_internals.$navigator_link_categories$.getGlobalValue(), Symbols.symbol_function((SubLObject)cyc_navigator_internals.$sym51$STRING_), Symbols.symbol_function((SubLObject)cyc_navigator_internals.$sym52$NAVIGATOR_CATEGORIES_SORT_KEY)));
        SubLObject cdolist_list_var = navigator_link_categories();
        SubLObject category = (SubLObject)cyc_navigator_internals.NIL;
        category = cdolist_list_var.first();
        while (cyc_navigator_internals.NIL != cdolist_list_var) {
            SubLObject value = Hashtables.gethash(category, cyc_navigator_internals.$navigator_link_category_table$.getGlobalValue(), (SubLObject)cyc_navigator_internals.UNPROVIDED);
            value = Sort.sort(value, Symbols.symbol_function((SubLObject)cyc_navigator_internals.$sym51$STRING_), Symbols.symbol_function((SubLObject)cyc_navigator_internals.$sym53$LINK_SORT_KEY));
            Hashtables.sethash(category, cyc_navigator_internals.$navigator_link_category_table$.getGlobalValue(), value);
            cdolist_list_var = cdolist_list_var.rest();
            category = cdolist_list_var.first();
        }
        cyc_navigator_internals.$navigator_links_sorted$.setDynamicValue((SubLObject)cyc_navigator_internals.T);
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 16196L)
    public static SubLObject splice_in_cgi_program(SubLObject arglist) {
        if (arglist == cyc_navigator_internals.UNPROVIDED) {
            arglist = (SubLObject)cyc_navigator_internals.NIL;
        }
        final SubLObject href_base_string = arglist.first();
        final SubLObject cgi_program = conses_high.second(arglist);
        return PrintLow.format((SubLObject)cyc_navigator_internals.NIL, href_base_string, cgi_program);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 16453L)
    public static SubLObject string_is_relative_url(SubLObject arglist) {
        if (arglist == cyc_navigator_internals.UNPROVIDED) {
            arglist = (SubLObject)cyc_navigator_internals.NIL;
        }
        final SubLObject href_base_string = arglist.first();
        return href_base_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 16647L)
    public static SubLObject href_is_base_string(SubLObject arglist) {
        if (arglist == cyc_navigator_internals.UNPROVIDED) {
            arglist = (SubLObject)cyc_navigator_internals.NIL;
        }
        final SubLObject href_base_string = arglist.first();
        return href_base_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 16847L)
    public static SubLObject set_link_text(final SubLObject cached_link_text_form) {
        SubLObject link_text = (SubLObject)cyc_navigator_internals.NIL;
        if (cached_link_text_form.isSymbol() && cyc_navigator_internals.NIL != Symbols.fboundp(cached_link_text_form)) {
            link_text = Functions.funcall(cached_link_text_form);
        }
        else if (cached_link_text_form.isCons()) {
            link_text = Eval.eval(cached_link_text_form);
        }
        else {
            link_text = cached_link_text_form;
        }
        return link_text;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 17386L)
    public static SubLObject nav_link_for_text(final SubLObject link_keyword, final SubLObject href, final SubLObject target, final SubLObject text_link_text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cached_link_text_form = get_link_value(link_keyword, (SubLObject)cyc_navigator_internals.$kw41$LINK_TEXT);
        final SubLObject cached_link_text = set_link_text(cached_link_text_form);
        final SubLObject link_text = (cyc_navigator_internals.NIL != string_utilities.non_empty_stringP(text_link_text)) ? text_link_text : ((cyc_navigator_internals.NIL != string_utilities.non_empty_stringP(cached_link_text)) ? cached_link_text : PrintLow.format((SubLObject)cyc_navigator_internals.NIL, (SubLObject)cyc_navigator_internals.$str55$No_link_text_found_for__s_in_call, link_keyword, (SubLObject)cyc_navigator_internals.$sym56$NAV_LINK_FOR_TEXT));
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        html_utilities.html_markup(href);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        if (cyc_navigator_internals.NIL != target) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(target);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
            html_utilities.html_princ(link_text);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 18018L)
    public static SubLObject set_image_src(final SubLObject image_src_form) {
        SubLObject image_src = (SubLObject)cyc_navigator_internals.NIL;
        if (image_src_form.isSymbol() && cyc_navigator_internals.NIL != Symbols.fboundp(image_src_form)) {
            image_src = Functions.funcall(image_src_form);
        }
        else if (image_src_form.isCons()) {
            image_src = Eval.eval(image_src_form);
        }
        else {
            image_src = image_src_form;
        }
        return image_src;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 18508L)
    public static SubLObject set_image_alt_text(final SubLObject cached_alt_form) {
        SubLObject alt_text = (SubLObject)cyc_navigator_internals.NIL;
        if (cached_alt_form.isSymbol() && cyc_navigator_internals.NIL != Symbols.fboundp(cached_alt_form)) {
            alt_text = Functions.funcall(cached_alt_form);
        }
        else if (cached_alt_form.isCons()) {
            alt_text = Eval.eval(cached_alt_form);
        }
        else {
            alt_text = cached_alt_form;
        }
        return alt_text;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 19072L)
    public static SubLObject nav_link_for_image(final SubLObject link_keyword, final SubLObject href, final SubLObject target, final SubLObject image_source, final SubLObject image_alt_text, final SubLObject image_align, final SubLObject image_border, final SubLObject image_ismap) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject image_src_form = get_link_value(link_keyword, (SubLObject)cyc_navigator_internals.$kw43$IMAGE_SRC);
        final SubLObject cached_image_src = set_image_src(image_src_form);
        final SubLObject cached_ismap = get_link_value(link_keyword, (SubLObject)cyc_navigator_internals.$kw44$ISMAP);
        final SubLObject cached_alt_form = get_link_value(link_keyword, (SubLObject)cyc_navigator_internals.$kw45$ALT);
        final SubLObject cached_alt = set_image_alt_text(cached_alt_form);
        final SubLObject cached_align = get_link_value(link_keyword, (SubLObject)cyc_navigator_internals.$kw46$ALIGN);
        final SubLObject cached_border = get_link_value(link_keyword, (SubLObject)cyc_navigator_internals.$kw47$BORDER);
        final SubLObject ismap = (cyc_navigator_internals.NIL != image_ismap) ? image_ismap : cached_ismap;
        final SubLObject image_src = (cyc_navigator_internals.NIL != image_source) ? image_source : cached_image_src;
        final SubLObject alt = (cyc_navigator_internals.NIL != image_alt_text) ? image_alt_text : cached_alt;
        final SubLObject align = (cyc_navigator_internals.NIL != image_align) ? image_align : cached_align;
        final SubLObject border = (cyc_navigator_internals.NIL != image_border) ? image_border : cached_border;
        final SubLObject image_source_url = image_src.isKeyword() ? Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.cb_icon_src(image_src)) : image_src;
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        html_utilities.html_markup(href);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        if (cyc_navigator_internals.NIL != target) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(target);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(image_source_url);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            if (cyc_navigator_internals.NIL != ismap) {
                html_utilities.html_simple_attribute(html_macros.$html_image_ismap$.getGlobalValue());
            }
            if (cyc_navigator_internals.NIL != alt) {
                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup(alt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            }
            if (cyc_navigator_internals.NIL != align) {
                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align(align));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            }
            if (cyc_navigator_internals.NIL != border) {
                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup(border);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 20442L)
    public static SubLObject nav_link_for_type(final SubLObject link_keyword, final SubLObject href, final SubLObject link_type, final SubLObject target, final SubLObject text_link_text, final SubLObject image_src, final SubLObject image_alt_text, final SubLObject image_align, final SubLObject image_border, final SubLObject image_ismap) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (link_type.eql((SubLObject)cyc_navigator_internals.$kw57$TEXT)) {
            nav_link_for_text(link_keyword, href, target, text_link_text);
        }
        else if (link_type.eql((SubLObject)cyc_navigator_internals.$kw58$IMAGE)) {
            nav_link_for_image(link_keyword, href, target, image_src, image_alt_text, image_align, image_border, image_ismap);
        }
        else {
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_color((SubLObject)cyc_navigator_internals.$kw59$RED));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str60$Error___a_must_be_one_of__s__but_, (SubLObject)cyc_navigator_internals.$sym29$LINK_TYPE, cyc_navigator_internals.$navigator_link_types$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 21101L)
    public static SubLObject nav_malformed_link(final SubLObject args) {
        final SubLObject keyword = reader.read_from_string_ignoring_errors(args.first(), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        generic_message_page((SubLObject)cyc_navigator_internals.$str61$Malformed_Navigator_Link, PrintLow.format((SubLObject)cyc_navigator_internals.NIL, (SubLObject)cyc_navigator_internals.$str62$The_navigator_link__s_is_malforme, keyword));
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 21354L)
    public static SubLObject set_navigator_href(final SubLObject link_keyword, final SubLObject arglist, SubLObject href_base_string, final SubLObject href_tags, final SubLObject number_of_args, final SubLObject cgi_program) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject href = (SubLObject)cyc_navigator_internals.$str65$;
        if (cyc_navigator_internals.NIL == href_tags && (cyc_navigator_internals.NIL == number_of_args || !Sequences.length(arglist).numE(number_of_args))) {
            href = PrintLow.format((SubLObject)cyc_navigator_internals.NIL, (SubLObject)cyc_navigator_internals.$str66$_a_nav_malformed_link__s, cgi_program, link_keyword);
        }
        else if (cyc_navigator_internals.NIL == href_tags) {
            href_base_string = Functions.apply(Symbols.symbol_function((SubLObject)cyc_navigator_internals.$sym67$FORMAT), (SubLObject)cyc_navigator_internals.NIL, new SubLObject[] { href_base_string, arglist });
            href = PrintLow.format((SubLObject)cyc_navigator_internals.NIL, (SubLObject)cyc_navigator_internals.$str68$_a__a, cgi_program, href_base_string);
        }
        else {
            SubLObject cdolist_list_var = href_tags;
            SubLObject tag = (SubLObject)cyc_navigator_internals.NIL;
            tag = cdolist_list_var.first();
            while (cyc_navigator_internals.NIL != cdolist_list_var) {
                final SubLObject args = (SubLObject)ConsesLow.list(href_base_string, cgi_program);
                final SubLObject function_symbol = conses_high.assoc(tag, cyc_navigator_internals.$nav_link_method_table$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED).rest();
                if (cyc_navigator_internals.NIL != Symbols.fboundp(function_symbol)) {
                    href = Functions.funcall(function_symbol, args);
                }
                else {
                    href = href_base_string;
                }
                cdolist_list_var = cdolist_list_var.rest();
                tag = cdolist_list_var.first();
            }
            if (cyc_navigator_internals.NIL == string_utilities.non_empty_stringP(href)) {
                href = href_base_string;
            }
        }
        return href;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 22287L)
    public static SubLObject set_href_base_string(final SubLObject href_base_string_form) {
        SubLObject href_base_string = (SubLObject)cyc_navigator_internals.NIL;
        if (href_base_string_form.isSymbol() && cyc_navigator_internals.NIL != Symbols.fboundp(href_base_string_form)) {
            href_base_string = Functions.funcall(href_base_string_form);
        }
        else if (href_base_string_form.isCons()) {
            href_base_string = Eval.eval(href_base_string_form);
        }
        else {
            href_base_string = href_base_string_form;
        }
        return href_base_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 22883L)
    public static SubLObject nav_link(final SubLObject link_keyword, SubLObject arglist, SubLObject target, SubLObject text_link_text, SubLObject image_src, SubLObject image_alt_text, SubLObject image_align, SubLObject image_border, SubLObject image_ismap) {
        if (arglist == cyc_navigator_internals.UNPROVIDED) {
            arglist = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (target == cyc_navigator_internals.UNPROVIDED) {
            target = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (text_link_text == cyc_navigator_internals.UNPROVIDED) {
            text_link_text = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (image_src == cyc_navigator_internals.UNPROVIDED) {
            image_src = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (image_alt_text == cyc_navigator_internals.UNPROVIDED) {
            image_alt_text = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (image_align == cyc_navigator_internals.UNPROVIDED) {
            image_align = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (image_border == cyc_navigator_internals.UNPROVIDED) {
            image_border = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (image_ismap == cyc_navigator_internals.UNPROVIDED) {
            image_ismap = (SubLObject)cyc_navigator_internals.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject link_type = get_link_value(link_keyword, (SubLObject)cyc_navigator_internals.$kw36$LINK_TYPE);
        final SubLObject href_base_string_form = get_link_value(link_keyword, (SubLObject)cyc_navigator_internals.$kw38$HREF_BASE_STRING);
        final SubLObject href_base_string = set_href_base_string(href_base_string_form);
        final SubLObject href_tags = get_link_value(link_keyword, (SubLObject)cyc_navigator_internals.$kw42$HREF_TAGS);
        final SubLObject number_of_args = get_link_value(link_keyword, (SubLObject)cyc_navigator_internals.$kw39$NUMBER_OF_ARGS);
        final SubLObject cached_target = get_link_value(link_keyword, (SubLObject)cyc_navigator_internals.$kw40$TARGET);
        final SubLObject cgi_program = (SubLObject)((cyc_navigator_internals.NIL != string_utilities.non_empty_stringP(system_parameters.$cyc_cgi_program$.getDynamicValue(thread))) ? system_parameters.$cyc_cgi_program$.getDynamicValue(thread) : cyc_navigator_internals.$str69$cg);
        final SubLObject href = set_navigator_href(link_keyword, arglist, href_base_string, href_tags, number_of_args, cgi_program);
        if (cyc_navigator_internals.NIL == target) {
            target = cached_target;
        }
        if (!target.isString()) {
            target = cb_utilities.cb_frame_name(target);
        }
        nav_link_for_type(link_keyword, href, link_type, target, text_link_text, image_src, image_alt_text, image_align, image_border, image_ismap);
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 24118L)
    public static SubLObject valid_navigator_linkP(final SubLObject keyword) {
        return Types.vectorp(Hashtables.gethash(keyword, cyc_navigator_internals.$navigator_link_definition_table$.getGlobalValue(), (SubLObject)cyc_navigator_internals.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 24230L)
    public static SubLObject category_has_linksP(final SubLObject category) {
        final SubLObject links = Hashtables.gethash(category, cyc_navigator_internals.$navigator_link_category_table$.getGlobalValue(), (SubLObject)cyc_navigator_internals.UNPROVIDED);
        SubLObject some_validP = (SubLObject)cyc_navigator_internals.NIL;
        if (cyc_navigator_internals.NIL == some_validP) {
            SubLObject csome_list_var;
            SubLObject link;
            for (csome_list_var = links, link = (SubLObject)cyc_navigator_internals.NIL, link = csome_list_var.first(); cyc_navigator_internals.NIL == some_validP && cyc_navigator_internals.NIL != csome_list_var; some_validP = valid_navigator_linkP(link), csome_list_var = csome_list_var.rest(), link = csome_list_var.first()) {}
        }
        return some_validP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 24537L)
    public static SubLObject fill_navigator_columns(final SubLObject sorted_link_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject no_of_cols = (SubLObject)((cyc_navigator_internals.NIL != Sequences.find(cyc_navigator_internals.$navigator_columns$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$list70, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED)) ? cyc_navigator_internals.$navigator_columns$.getDynamicValue(thread) : cyc_navigator_internals.THREE_INTEGER);
        SubLObject column1 = (SubLObject)cyc_navigator_internals.NIL;
        SubLObject column2 = (SubLObject)cyc_navigator_internals.NIL;
        SubLObject column3 = (SubLObject)cyc_navigator_internals.NIL;
        SubLObject column4 = (SubLObject)cyc_navigator_internals.NIL;
        final SubLObject len = Sequences.length(sorted_link_list);
        final SubLObject n_per_column1 = Numbers.ceiling(Numbers.divide(len, no_of_cols), (SubLObject)cyc_navigator_internals.UNPROVIDED);
        final SubLObject n_per_column2 = (SubLObject)(no_of_cols.numG((SubLObject)cyc_navigator_internals.ONE_INTEGER) ? Numbers.ceiling(Numbers.divide(Numbers.subtract(len, n_per_column1), Numbers.subtract(no_of_cols, (SubLObject)cyc_navigator_internals.ONE_INTEGER)), (SubLObject)cyc_navigator_internals.UNPROVIDED) : cyc_navigator_internals.ZERO_INTEGER);
        final SubLObject n_per_column3 = (SubLObject)(no_of_cols.numG((SubLObject)cyc_navigator_internals.TWO_INTEGER) ? Numbers.ceiling(Numbers.divide(Numbers.subtract(len, n_per_column2), Numbers.subtract(no_of_cols, (SubLObject)cyc_navigator_internals.ONE_INTEGER)), (SubLObject)cyc_navigator_internals.UNPROVIDED) : cyc_navigator_internals.ZERO_INTEGER);
        SubLObject count = (SubLObject)cyc_navigator_internals.ONE_INTEGER;
        SubLObject column_number = (SubLObject)cyc_navigator_internals.ONE_INTEGER;
        SubLObject cdolist_list_var = sorted_link_list;
        SubLObject link = (SubLObject)cyc_navigator_internals.NIL;
        link = cdolist_list_var.first();
        while (cyc_navigator_internals.NIL != cdolist_list_var) {
            final SubLObject pcase_var = column_number;
            if (pcase_var.eql((SubLObject)cyc_navigator_internals.ONE_INTEGER)) {
                column1 = (SubLObject)ConsesLow.cons(link, column1);
                if (count.numGE(n_per_column1)) {
                    count = (SubLObject)cyc_navigator_internals.ONE_INTEGER;
                    column_number = Numbers.add(column_number, (SubLObject)cyc_navigator_internals.ONE_INTEGER);
                }
                else {
                    count = Numbers.add(count, (SubLObject)cyc_navigator_internals.ONE_INTEGER);
                }
            }
            else if (pcase_var.eql((SubLObject)cyc_navigator_internals.TWO_INTEGER)) {
                column2 = (SubLObject)ConsesLow.cons(link, column2);
                if (count.numGE(n_per_column2)) {
                    count = (SubLObject)cyc_navigator_internals.ONE_INTEGER;
                    column_number = Numbers.add(column_number, (SubLObject)cyc_navigator_internals.ONE_INTEGER);
                }
                else {
                    count = Numbers.add(count, (SubLObject)cyc_navigator_internals.ONE_INTEGER);
                }
            }
            else if (pcase_var.eql((SubLObject)cyc_navigator_internals.THREE_INTEGER)) {
                column3 = (SubLObject)ConsesLow.cons(link, column3);
                if (count.numGE(n_per_column3)) {
                    count = (SubLObject)cyc_navigator_internals.ONE_INTEGER;
                    column_number = Numbers.add(column_number, (SubLObject)cyc_navigator_internals.ONE_INTEGER);
                }
                else {
                    count = Numbers.add(count, (SubLObject)cyc_navigator_internals.ONE_INTEGER);
                }
            }
            else if (pcase_var.eql((SubLObject)cyc_navigator_internals.FOUR_INTEGER)) {
                column4 = (SubLObject)ConsesLow.cons(link, column4);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        column1 = Sequences.nreverse(column1);
        column2 = Sequences.nreverse(column2);
        column3 = Sequences.nreverse(column3);
        column4 = Sequences.nreverse(column4);
        return (SubLObject)ConsesLow.list(column1, column2, column3, column4);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 25859L)
    public static SubLObject arrange_navigator_links(final SubLObject title, final SubLObject columns) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str71$left));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ(title);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_br();
                html_utilities.html_br();
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
        SubLObject column1;
        SubLObject column2;
        SubLObject column3;
        SubLObject column4;
        SubLObject key1;
        SubLObject key2;
        SubLObject key3;
        SubLObject key4;
        SubLObject _prev_bind_2;
        SubLObject _prev_bind_0_$3;
        SubLObject _prev_bind_0_$4;
        SubLObject _prev_bind_0_$5;
        SubLObject _prev_bind_0_$6;
        SubLObject _prev_bind_0_$7;
        SubLObject _prev_bind_0_$8;
        SubLObject _prev_bind_0_$9;
        for (column1 = (SubLObject)cyc_navigator_internals.NIL, column2 = (SubLObject)cyc_navigator_internals.NIL, column3 = (SubLObject)cyc_navigator_internals.NIL, column4 = (SubLObject)cyc_navigator_internals.NIL, column1 = columns.first(), column2 = conses_high.second(columns), column3 = conses_high.third(columns), column4 = conses_high.fourth(columns); cyc_navigator_internals.NIL != column1 || cyc_navigator_internals.NIL != column2 || cyc_navigator_internals.NIL != column3 || cyc_navigator_internals.NIL != column4; column1 = column1.rest(), column2 = column2.rest(), column3 = column3.rest(), column4 = column4.rest()) {
            key1 = column1.first();
            key2 = column2.first();
            key3 = column3.first();
            key4 = column4.first();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str71$left));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str72$top));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    nav_link(key1, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    if (cyc_navigator_internals.$navigator_line_spacing$.getDynamicValue(thread).equalp((SubLObject)cyc_navigator_internals.$str73$double)) {
                        html_utilities.html_br();
                        html_utilities.html_br();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                if (cyc_navigator_internals.NIL != key2) {
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_utilities.html_indent(cyc_navigator_internals.$navigator_column_padding$.getDynamicValue(thread));
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str71$left));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str72$top));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                        nav_link(key2, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    if (cyc_navigator_internals.NIL != key3) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            html_utilities.html_indent(cyc_navigator_internals.$navigator_column_padding$.getDynamicValue(thread));
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str71$left));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str72$top));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            nav_link(key3, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        if (cyc_navigator_internals.NIL != key4) {
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                html_utilities.html_indent(cyc_navigator_internals.$navigator_column_padding$.getDynamicValue(thread));
                                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str71$left));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str72$top));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                nav_link(key4, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    }
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
        }
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 27143L)
    public static SubLObject columnize_by_links(final SubLObject categories) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject first_category = categories.first();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        if (cyc_navigator_internals.NIL != cyc_navigator_internals.$navigator_table_border$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(cyc_navigator_internals.$navigator_table_border$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
            SubLObject cdolist_list_var = categories;
            SubLObject category = (SubLObject)cyc_navigator_internals.NIL;
            category = cdolist_list_var.first();
            while (cyc_navigator_internals.NIL != cdolist_list_var) {
                final SubLObject form = conses_high.assoc(category, cyc_navigator_internals.$navigator_link_categories$.getGlobalValue(), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                SubLObject title = conses_high.second(form);
                if (cyc_navigator_internals.NIL == title) {
                    title = (SubLObject)cyc_navigator_internals.$str74$Untitled_Category_;
                }
                if (cyc_navigator_internals.NIL != conses_high.third(form)) {
                    SubLObject links = Hashtables.gethash(category, cyc_navigator_internals.$navigator_link_category_table$.getGlobalValue(), (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    links = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)cyc_navigator_internals.$sym75$VALID_NAVIGATOR_LINK_), links, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    if (cyc_navigator_internals.NIL != links) {
                        if (!category.eql(first_category) && !cyc_navigator_internals.$navigator_line_spacing$.getDynamicValue(thread).equalp((SubLObject)cyc_navigator_internals.$str73$double)) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                    html_utilities.html_br();
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                        }
                        arrange_navigator_links(title, fill_navigator_columns(links));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                category = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 27996L)
    public static SubLObject columnize_by_categories(final SubLObject categories) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject no_of_cols = (SubLObject)((cyc_navigator_internals.NIL != Sequences.find(cyc_navigator_internals.$navigator_columns$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$list70, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED)) ? cyc_navigator_internals.$navigator_columns$.getDynamicValue(thread) : cyc_navigator_internals.THREE_INTEGER);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        if (cyc_navigator_internals.NIL != cyc_navigator_internals.$navigator_table_border$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(cyc_navigator_internals.$navigator_table_border$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
            SubLObject cats;
            SubLObject first_n_cats;
            SubLObject _prev_bind_0_$12;
            SubLObject cdolist_list_var;
            SubLObject category;
            SubLObject form;
            SubLObject title;
            SubLObject links;
            SubLObject _prev_bind_0_$13;
            SubLObject cdolist_list_var_$14;
            SubLObject link;
            SubLObject _prev_bind_0_$14;
            for (cats = (SubLObject)cyc_navigator_internals.NIL, first_n_cats = (SubLObject)cyc_navigator_internals.NIL, cats = categories, first_n_cats = list_utilities.first_n(no_of_cols, cats); cyc_navigator_internals.NIL != first_n_cats; first_n_cats = list_utilities.first_n(no_of_cols, cats)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    cdolist_list_var = first_n_cats;
                    category = (SubLObject)cyc_navigator_internals.NIL;
                    category = cdolist_list_var.first();
                    while (cyc_navigator_internals.NIL != cdolist_list_var) {
                        form = conses_high.assoc(category, cyc_navigator_internals.$navigator_link_categories$.getGlobalValue(), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        title = conses_high.second(form);
                        if (cyc_navigator_internals.NIL == title) {
                            title = (SubLObject)cyc_navigator_internals.$str74$Untitled_Category_;
                        }
                        if (cyc_navigator_internals.NIL != conses_high.third(form)) {
                            links = Hashtables.gethash(category, cyc_navigator_internals.$navigator_link_category_table$.getGlobalValue(), (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            links = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)cyc_navigator_internals.$sym75$VALID_NAVIGATOR_LINK_), links, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            if (cyc_navigator_internals.NIL != links) {
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str71$left));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str72$top));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), title);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_br();
                                    cdolist_list_var_$14 = links;
                                    link = (SubLObject)cyc_navigator_internals.NIL;
                                    link = cdolist_list_var_$14.first();
                                    while (cyc_navigator_internals.NIL != cdolist_list_var_$14) {
                                        html_utilities.html_br();
                                        nav_link(link, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                        if (cyc_navigator_internals.$navigator_line_spacing$.getDynamicValue(thread).equalp((SubLObject)cyc_navigator_internals.$str73$double)) {
                                            html_utilities.html_br();
                                        }
                                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                        link = cdolist_list_var_$14.first();
                                    }
                                    html_utilities.html_br();
                                    if (cyc_navigator_internals.$navigator_line_spacing$.getDynamicValue(thread).equalp((SubLObject)cyc_navigator_internals.$str3$single)) {
                                        html_utilities.html_br();
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                    html_utilities.html_newline((SubLObject)cyc_navigator_internals.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                    html_utilities.html_indent(cyc_navigator_internals.$navigator_column_padding$.getDynamicValue(thread));
                                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        category = cdolist_list_var.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                cats = conses_high.nthcdr(no_of_cols, cats);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 29308L)
    public static SubLObject navigator_categories_for_display() {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)cyc_navigator_internals.$sym13$CAR), list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)cyc_navigator_internals.$sym78$THIRD), cyc_navigator_internals.$navigator_link_categories$.getGlobalValue(), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 29429L)
    public static SubLObject cyc_navigator(SubLObject args) {
        if (args == cyc_navigator_internals.UNPROVIDED) {
            args = (SubLObject)cyc_navigator_internals.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_navigator_internals.NIL == cyc_navigator_internals.$navigator_links_sorted$.getDynamicValue(thread)) {
            sort_navigator_links();
        }
        SubLObject categories = navigator_categories_for_display();
        categories = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)cyc_navigator_internals.$sym79$CATEGORY_HAS_LINKS_), categories, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        final SubLObject title_var = (SubLObject)cyc_navigator_internals.$str80$Cyc_Navigator;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cyc_navigator_internals.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str81$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cyc_navigator_internals.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str82$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cyc_navigator_internals.$kw83$UNINITIALIZED) ? ConsesLow.list(cyc_navigator_internals.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cyc_navigator_internals.$kw84$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cyc_navigator_internals.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cyc_navigator_internals.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str87$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str88$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str89$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str90$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str91$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            if (cyc_navigator_internals.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cyc_navigator_internals.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_indent((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                            cb_utilities.cb_back_button((SubLObject)cyc_navigator_internals.$kw92$SELF, (SubLObject)cyc_navigator_internals.$str93$Back);
                            if (cyc_navigator_internals.NIL != categories) {
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cyc_navigator_internals.ZERO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str71$left));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                            if (cyc_navigator_internals.NIL != cyc_navigator_internals.$columnize_by_category$.getDynamicValue(thread)) {
                                                columnize_by_categories(categories);
                                            }
                                            else {
                                                columnize_by_links(categories);
                                            }
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
                            else {
                                html_utilities.html_br();
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str94$There_are_no_Cyc_Navigator_links_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                                cb_utilities.cb_back_button((SubLObject)cyc_navigator_internals.$kw92$SELF, (SubLObject)cyc_navigator_internals.$str95$Go_Back);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$17, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$16, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 30274L)
    public static SubLObject format_navigator_preferences(SubLObject args) {
        if (args == cyc_navigator_internals.UNPROVIDED) {
            args = (SubLObject)cyc_navigator_internals.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cyc_navigator_internals.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str50$_);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str97$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str98$Number_of_columns__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str71$left));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                    final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.NIL, thread);
                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str99$column_number);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            final SubLObject current = cyc_navigator_internals.$navigator_columns$.getDynamicValue(thread);
                            SubLObject cdolist_list_var = (SubLObject)cyc_navigator_internals.$list70;
                            SubLObject i = (SubLObject)cyc_navigator_internals.NIL;
                            i = cdolist_list_var.first();
                            while (cyc_navigator_internals.NIL != cdolist_list_var) {
                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.NIL, thread);
                                    if (i.equal(current)) {
                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                        html_utilities.html_princ(i);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                i = cdolist_list_var.first();
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str50$_);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str97$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str100$Width_between_columns__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str71$left));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    html_utilities.html_text_input((SubLObject)cyc_navigator_internals.$str101$column_padding, cyc_navigator_internals.$navigator_column_padding$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.THREE_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str50$_);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str97$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str102$Link_category_arrangement__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str71$left));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    html_utilities.html_radio_input((SubLObject)cyc_navigator_internals.$str103$columnize_by_category, (SubLObject)cyc_navigator_internals.$str104$yes, cyc_navigator_internals.$columnize_by_category$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str105$_one_column_per_category);
                    html_utilities.html_br();
                    html_utilities.html_radio_input((SubLObject)cyc_navigator_internals.$str103$columnize_by_category, (SubLObject)cyc_navigator_internals.$str106$no, (SubLObject)SubLObjectFactory.makeBoolean(cyc_navigator_internals.NIL == cyc_navigator_internals.$columnize_by_category$.getDynamicValue(thread)), (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str107$_multiple_columns_per_category);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str50$_);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str97$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str108$Line_spacing__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str71$left));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                    final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.NIL, thread);
                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str109$line_spacing);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            final SubLObject current = cyc_navigator_internals.$navigator_line_spacing$.getDynamicValue(thread);
                            SubLObject cdolist_list_var = (SubLObject)cyc_navigator_internals.$list110;
                            SubLObject string = (SubLObject)cyc_navigator_internals.NIL;
                            string = cdolist_list_var.first();
                            while (cyc_navigator_internals.NIL != cdolist_list_var) {
                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.NIL, thread);
                                    if (string.equalp(current)) {
                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                        html_utilities.html_princ(string);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                string = cdolist_list_var.first();
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 32237L)
    public static SubLObject set_navigator_preferences(SubLObject args) {
        if (args == cyc_navigator_internals.UNPROVIDED) {
            args = (SubLObject)cyc_navigator_internals.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cyc_navigator_internals.$str112$Cyc_Navigator_Preferences;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cyc_navigator_internals.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str81$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cyc_navigator_internals.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str82$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0_$52 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cyc_navigator_internals.$kw83$UNINITIALIZED) ? ConsesLow.list(cyc_navigator_internals.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cyc_navigator_internals.$kw84$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cyc_navigator_internals.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$53 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cyc_navigator_internals.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str87$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str88$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str89$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str90$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str91$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            if (cyc_navigator_internals.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cyc_navigator_internals.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str113$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        if (cyc_navigator_internals.NIL != html_macros.$html_self_target$.getGlobalValue()) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_self_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cyc_navigator_internals.$str114$handle_navigator_preferences, (SubLObject)cyc_navigator_internals.T, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str115$middle));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                        html_utilities.html_reset_input((SubLObject)cyc_navigator_internals.$str116$Current_Values);
                                        html_utilities.html_submit_input((SubLObject)cyc_navigator_internals.$str117$Update, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                        format_navigator_preferences((SubLObject)cyc_navigator_internals.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$53, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$52, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 32723L)
    public static SubLObject handle_navigator_preferences(SubLObject args) {
        if (args == cyc_navigator_internals.UNPROVIDED) {
            args = (SubLObject)cyc_navigator_internals.NIL;
        }
        final SubLObject column_number = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input((SubLObject)cyc_navigator_internals.$str99$column_number, args), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        SubLObject column_padding = html_utilities.html_extract_input((SubLObject)cyc_navigator_internals.$str101$column_padding, args);
        final SubLObject columnize_by_category = html_utilities.html_extract_input((SubLObject)cyc_navigator_internals.$str103$columnize_by_category, args);
        final SubLObject line_spacing = html_utilities.html_extract_input((SubLObject)cyc_navigator_internals.$str109$line_spacing, args);
        cyc_navigator_internals.$navigator_columns$.setDynamicValue(column_number);
        if (cyc_navigator_internals.NIL != string_utilities.non_empty_stringP(column_padding)) {
            column_padding = reader.read_from_string_ignoring_errors(column_padding, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        }
        if (!column_padding.isInteger() || !column_padding.numGE((SubLObject)cyc_navigator_internals.ZERO_INTEGER) || !column_padding.numLE((SubLObject)cyc_navigator_internals.$int119$200)) {
            column_padding = (SubLObject)cyc_navigator_internals.FIVE_INTEGER;
        }
        cyc_navigator_internals.$navigator_column_padding$.setDynamicValue(column_padding);
        cyc_navigator_internals.$columnize_by_category$.setDynamicValue(Equality.equalp(columnize_by_category, (SubLObject)cyc_navigator_internals.$str104$yes));
        if (cyc_navigator_internals.NIL != Sequences.find(line_spacing, (SubLObject)cyc_navigator_internals.$list110, Symbols.symbol_function((SubLObject)cyc_navigator_internals.EQUALP), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED)) {
            cyc_navigator_internals.$navigator_line_spacing$.setDynamicValue(line_spacing);
        }
        else {
            cyc_navigator_internals.$navigator_line_spacing$.setDynamicValue((SubLObject)cyc_navigator_internals.$str3$single);
        }
        return cyc_navigator((SubLObject)cyc_navigator_internals.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 33695L)
    public static SubLObject guest_warn(SubLObject facility_name) {
        if (facility_name == cyc_navigator_internals.UNPROVIDED) {
            facility_name = (SubLObject)cyc_navigator_internals.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_communication.the_cyclist().equal(cyc_navigator_internals.$const121$Guest)) {
            final SubLObject title_var = (SubLObject)cyc_navigator_internals.$str122$Please_Login_Now;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cyc_navigator_internals.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str81$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cyc_navigator_internals.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str82$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$60 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cyc_navigator_internals.$kw83$UNINITIALIZED) ? ConsesLow.list(cyc_navigator_internals.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cyc_navigator_internals.$kw84$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cyc_navigator_internals.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                    final SubLObject _prev_bind_0_$61 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cyc_navigator_internals.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cyc_navigator_internals.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str87$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str88$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str89$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str90$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str91$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                if (cyc_navigator_internals.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cyc_navigator_internals.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            }
                            guest_warn_int(facility_name);
                            html_utilities.html_br();
                            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$61, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$60, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 33911L)
    public static SubLObject guest_warn_int(SubLObject facility_name) {
        if (facility_name == cyc_navigator_internals.UNPROVIDED) {
            facility_name = (SubLObject)cyc_navigator_internals.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_communication.the_cyclist().equal(cyc_navigator_internals.$const121$Guest)) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str124$Sorry___a_cannot_be_used_by_peopl, (SubLObject)((cyc_navigator_internals.NIL != string_utilities.non_empty_stringP(facility_name)) ? facility_name : cyc_navigator_internals.$str125$this_facility));
            cb_utilities.cb_form(operation_communication.the_cyclist(), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str126$___Failure_to_login_using_your_un);
            nav_link((SubLObject)cyc_navigator_internals.$kw127$CB_LOGIN, (SubLObject)cyc_navigator_internals.NIL, (SubLObject)cyc_navigator_internals.NIL, (SubLObject)cyc_navigator_internals.$str128$login, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str129$_using_your_real_name_now_);
            html_utilities.html_br();
        }
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 34417L)
    public static SubLObject guest_warn_string(SubLObject facility_name) {
        if (facility_name == cyc_navigator_internals.UNPROVIDED) {
            facility_name = (SubLObject)cyc_navigator_internals.NIL;
        }
        if (operation_communication.the_cyclist().equal(cyc_navigator_internals.$const121$Guest)) {
            SubLObject result_str = (SubLObject)cyc_navigator_internals.NIL;
            SubLObject str = (SubLObject)cyc_navigator_internals.NIL;
            try {
                str = streams_high.make_private_string_output_stream();
                PrintLow.format(str, (SubLObject)cyc_navigator_internals.$str130$Sorry___a_cannot_be_used_by_peopl, (SubLObject)((cyc_navigator_internals.NIL != string_utilities.non_empty_stringP(facility_name)) ? facility_name : cyc_navigator_internals.$str125$this_facility), operation_communication.the_cyclist());
                PrintLow.format(str, (SubLObject)cyc_navigator_internals.$str131$___Failure_to_login_using_your_un);
                result_str = streams_high.get_output_stream_string(str);
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)cyc_navigator_internals.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(str, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            return result_str;
        }
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 35057L)
    public static SubLObject make_ok_cyclist_name(final SubLObject string) {
        return string_utilities.strcat(Mapping.mapcar(Symbols.symbol_function((SubLObject)cyc_navigator_internals.$sym132$STRING_CAPITALIZE), string_utilities.break_words(string, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 35164L)
    public static SubLObject cb_link_load_transcript(SubLObject linktext) {
        if (linktext == cyc_navigator_internals.UNPROVIDED) {
            linktext = (SubLObject)cyc_navigator_internals.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_navigator_internals.NIL == linktext) {
            linktext = (SubLObject)cyc_navigator_internals.$str133$Load_Transcript;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cyc_navigator_internals.$kw134$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str135$cb_load_transcript);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        if (cyc_navigator_internals.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 35495L)
    public static SubLObject html_load_transcript(SubLObject args) {
        if (args == cyc_navigator_internals.UNPROVIDED) {
            args = (SubLObject)cyc_navigator_internals.NIL;
        }
        return cb_load_transcript(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 35616L)
    public static SubLObject cb_load_transcript(SubLObject args) {
        if (args == cyc_navigator_internals.UNPROVIDED) {
            args = (SubLObject)cyc_navigator_internals.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_navigator_internals.NIL == control_vars.cyc_image_id()) {
            control_vars.set_cyc_image_id();
        }
        if (cyc_navigator_internals.NIL != ke.cyclist_is_guest()) {
            guest_warn((SubLObject)cyc_navigator_internals.$str142$the_Load_Transcript_File_page);
        }
        else {
            final SubLObject title_var = (SubLObject)cyc_navigator_internals.$str143$Load_Transcript_File;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cyc_navigator_internals.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str81$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cyc_navigator_internals.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str82$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cyc_navigator_internals.$kw83$UNINITIALIZED) ? ConsesLow.list(cyc_navigator_internals.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cyc_navigator_internals.$kw84$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cyc_navigator_internals.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                    final SubLObject _prev_bind_0_$65 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cyc_navigator_internals.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cyc_navigator_internals.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str87$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str88$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str89$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str90$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str91$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                if (cyc_navigator_internals.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cyc_navigator_internals.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str113$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            if (cyc_navigator_internals.NIL != html_macros.$html_self_target$.getGlobalValue()) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_self_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input((SubLObject)cyc_navigator_internals.$str144$handle_load_transcript, (SubLObject)cyc_navigator_internals.T, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cyc_navigator_internals.ZERO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str145$center));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.ZERO_INTEGER);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str71$left));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str146$Pathname_);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_utilities.html_br();
                                                        html_utilities.html_filename_input((SubLObject)cyc_navigator_internals.$str147$load_file, (SubLObject)cyc_navigator_internals.$str65$, (SubLObject)cyc_navigator_internals.$int148$40);
                                                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str50$_);
                                                        html_utilities.html_reset_input((SubLObject)cyc_navigator_internals.$str149$Clear);
                                                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str50$_);
                                                        html_utilities.html_submit_input((SubLObject)cyc_navigator_internals.$str150$Load, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.ZERO_INTEGER);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str97$right));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str151$Destination_queue__);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str71$left));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                                        html_utilities.html_radio_input((SubLObject)cyc_navigator_internals.$str152$queue, (SubLObject)cyc_navigator_internals.$str153$_aux, (SubLObject)cyc_navigator_internals.NIL, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                        html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str154$__AUXILIARY);
                                                        html_utilities.html_br();
                                                        html_utilities.html_radio_input((SubLObject)cyc_navigator_internals.$str152$queue, (SubLObject)cyc_navigator_internals.$str155$_local, (SubLObject)cyc_navigator_internals.T, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                        html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str156$__LOCAL);
                                                        html_utilities.html_br();
                                                        html_utilities.html_radio_input((SubLObject)cyc_navigator_internals.$str152$queue, (SubLObject)cyc_navigator_internals.$str157$_none, (SubLObject)cyc_navigator_internals.NIL, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                        html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str158$__NONE);
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.ZERO_INTEGER);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cyc_navigator_internals.$str71$left));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                                                        html_utilities.html_checkbox_input((SubLObject)cyc_navigator_internals.$str159$transcript, (SubLObject)cyc_navigator_internals.$str104$yes, control_vars.$use_transcriptP$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                                                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str160$_Transcript_unenqueued___NONE__op);
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_br();
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str161$READ_THIS_BEFORE_LOADING_A_TRANSC);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str162$The_possible_values_for_the_desti);
                                html_utilities.html_br();
                                html_utilities.html_br();
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cyc_navigator_internals.$str163$Loading_a_transcript_file_may_hav);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$65, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$64, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 38446L)
    public static SubLObject generic_message_page(final SubLObject title, final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cyc_navigator_internals.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str81$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cyc_navigator_internals.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str82$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0_$82 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cyc_navigator_internals.$kw83$UNINITIALIZED) ? ConsesLow.list(cyc_navigator_internals.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cyc_navigator_internals.$kw84$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cyc_navigator_internals.NIL != title) {
                    html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$83 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cyc_navigator_internals.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str87$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str88$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str89$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str90$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str91$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            if (cyc_navigator_internals.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cyc_navigator_internals.NIL != title) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_princ(title);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_back_button((SubLObject)cyc_navigator_internals.$kw92$SELF, (SubLObject)cyc_navigator_internals.$str93$Back);
                            html_utilities.html_princ(message);
                            html_utilities.html_newline((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$83, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$82, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 38649L)
    public static SubLObject handle_load_transcript(final SubLObject args) {
        final SubLObject pathname = string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)cyc_navigator_internals.$str147$load_file, args));
        final SubLObject use_transcriptP = Equality.equalp((SubLObject)cyc_navigator_internals.$str104$yes, html_utilities.html_extract_input((SubLObject)cyc_navigator_internals.$str159$transcript, args));
        final SubLObject queue = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input((SubLObject)cyc_navigator_internals.$str152$queue, args), (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        final SubLObject file_exists = Filesys.probe_file(pathname);
        if (cyc_navigator_internals.NIL != file_exists) {
            final SubLObject no_of_ops = operation_communication.load_transcript_file(pathname, use_transcriptP, queue, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
            if (no_of_ops.isInteger()) {
                generic_message_page((SubLObject)cyc_navigator_internals.$str165$Transcript_File_Loaded, PrintLow.format((SubLObject)cyc_navigator_internals.NIL, (SubLObject)cyc_navigator_internals.$str166$The_file__s_containing__s_operati, new SubLObject[] { pathname, no_of_ops, control_vars.cyc_image_id() }));
            }
            else {
                generic_message_page((SubLObject)cyc_navigator_internals.$str167$Transcript_File_Problem, PrintLow.format((SubLObject)cyc_navigator_internals.NIL, (SubLObject)cyc_navigator_internals.$str168$The_file__s_exists__but_no_operat, pathname, control_vars.cyc_image_id()));
            }
        }
        else {
            generic_message_page((SubLObject)cyc_navigator_internals.$str169$File_Not_Available, PrintLow.format((SubLObject)cyc_navigator_internals.NIL, (SubLObject)cyc_navigator_internals.$str170$The_file__s_cannot_be_accessed___, pathname));
        }
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 39695L)
    public static SubLObject report_file_not_available(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cyc_navigator_internals.$str169$File_Not_Available;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cyc_navigator_internals.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str81$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cyc_navigator_internals.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str82$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
            final SubLObject _prev_bind_0_$87 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cyc_navigator_internals.$kw83$UNINITIALIZED) ? ConsesLow.list(cyc_navigator_internals.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cyc_navigator_internals.$kw84$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cyc_navigator_internals.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                final SubLObject _prev_bind_0_$88 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cyc_navigator_internals.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cyc_navigator_internals.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str87$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                    final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str88$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cyc_navigator_internals.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str89$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.$str90$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str91$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            if (cyc_navigator_internals.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cyc_navigator_internals.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cyc_navigator_internals.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_navigator_internals.UNPROVIDED);
                        }
                        html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str172$The_file_);
                        html_utilities.html_princ(file);
                        html_utilities.html_princ((SubLObject)cyc_navigator_internals.$str173$_does_not_exist__or_cannot_be_acc);
                        html_utilities.html_br();
                        html_utilities.html_br();
                        html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$88, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$87, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cyc_navigator_internals.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 40089L)
    public static SubLObject maybe_use_english(SubLObject args) {
        if (args == cyc_navigator_internals.UNPROVIDED) {
            args = (SubLObject)cyc_navigator_internals.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_navigator_internals.$kw175$CYCL == control_vars.$cb_major_presentation_language$.getDynamicValue(thread)) {
            control_vars.$cb_major_presentation_language$.setDynamicValue((SubLObject)cyc_navigator_internals.$kw176$NL, thread);
        }
        else {
            control_vars.$cb_major_presentation_language$.setDynamicValue((SubLObject)cyc_navigator_internals.$kw175$CYCL, thread);
        }
        return cyc_navigator((SubLObject)cyc_navigator_internals.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 42783L)
    public static SubLObject maybe_use_english_text() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((cyc_navigator_internals.$kw175$CYCL == control_vars.$cb_major_presentation_language$.getDynamicValue(thread)) ? cyc_navigator_internals.$str178$Show_Assertions_in_English : cyc_navigator_internals.$str179$Show_Assertions_in_CycL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 42956L)
    public static SubLObject clear_pg_caches(SubLObject args) {
        if (args == cyc_navigator_internals.UNPROVIDED) {
            args = (SubLObject)cyc_navigator_internals.NIL;
        }
        pph_main.clear_paraphrase_caches((SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED);
        return cyc_navigator((SubLObject)cyc_navigator_internals.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 43094L)
    public static SubLObject cyc_nav_clear_el_formulas_cache(SubLObject args) {
        if (args == cyc_navigator_internals.UNPROVIDED) {
            args = (SubLObject)cyc_navigator_internals.NIL;
        }
        cb_clear_el_formulas_cache();
        return cyc_navigator((SubLObject)cyc_navigator_internals.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 43415L)
    public static SubLObject cb_clear_el_formulas_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_navigator_internals.NIL != dictionary.dictionary_p(cb_parameters.$cb_assertion_el_formula_cache$.getDynamicValue(thread))) {
            dictionary.clear_dictionary(cb_parameters.$cb_assertion_el_formula_cache$.getDynamicValue(thread));
        }
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 43684L)
    public static SubLObject html_start_agenda(SubLObject args) {
        if (args == cyc_navigator_internals.UNPROVIDED) {
            args = (SubLObject)cyc_navigator_internals.NIL;
        }
        agenda.start_agenda((SubLObject)cyc_navigator_internals.TWO_INTEGER);
        return cb_system_tools.cb_agenda((SubLObject)cyc_navigator_internals.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 43797L)
    public static SubLObject html_halt_agenda(SubLObject args) {
        if (args == cyc_navigator_internals.UNPROVIDED) {
            args = (SubLObject)cyc_navigator_internals.NIL;
        }
        agenda.halt_agenda((SubLObject)cyc_navigator_internals.TWO_INTEGER);
        return cb_system_tools.cb_agenda((SubLObject)cyc_navigator_internals.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-navigator-internals.lisp", position = 43908L)
    public static SubLObject html_restart_agenda(SubLObject args) {
        if (args == cyc_navigator_internals.UNPROVIDED) {
            args = (SubLObject)cyc_navigator_internals.NIL;
        }
        agenda.restart_agenda((SubLObject)cyc_navigator_internals.TWO_INTEGER);
        return cb_system_tools.cb_agenda((SubLObject)cyc_navigator_internals.UNPROVIDED);
    }
    
    public static SubLObject declare_cyc_navigator_internals_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "make_new_link_vector", "MAKE-NEW-LINK-VECTOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "get_link_vector", "GET-LINK-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "navigator_link", "NAVIGATOR-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "navigator_links", "NAVIGATOR-LINKS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "navigator_link_categories", "NAVIGATOR-LINK-CATEGORIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "navigator_link_categoryP", "NAVIGATOR-LINK-CATEGORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "get_link_value", "GET-LINK-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "set_link_value", "SET-LINK-VALUE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "return_link_definition", "RETURN-LINK-DEFINITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "print_link_definition", "PRINT-LINK-DEFINITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "def_navigator_link", "DEF-NAVIGATOR-LINK", 5, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "remove_navigator_link", "REMOVE-NAVIGATOR-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "eval_link_sort_key", "EVAL-LINK-SORT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "link_sort_key", "LINK-SORT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "navigator_categories_sort_key", "NAVIGATOR-CATEGORIES-SORT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "sort_navigator_links", "SORT-NAVIGATOR-LINKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "splice_in_cgi_program", "SPLICE-IN-CGI-PROGRAM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "string_is_relative_url", "STRING-IS-RELATIVE-URL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "href_is_base_string", "HREF-IS-BASE-STRING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "set_link_text", "SET-LINK-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "nav_link_for_text", "NAV-LINK-FOR-TEXT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "set_image_src", "SET-IMAGE-SRC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "set_image_alt_text", "SET-IMAGE-ALT-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "nav_link_for_image", "NAV-LINK-FOR-IMAGE", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "nav_link_for_type", "NAV-LINK-FOR-TYPE", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "nav_malformed_link", "NAV-MALFORMED-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "set_navigator_href", "SET-NAVIGATOR-HREF", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "set_href_base_string", "SET-HREF-BASE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "nav_link", "NAV-LINK", 1, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "valid_navigator_linkP", "VALID-NAVIGATOR-LINK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "category_has_linksP", "CATEGORY-HAS-LINKS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "fill_navigator_columns", "FILL-NAVIGATOR-COLUMNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "arrange_navigator_links", "ARRANGE-NAVIGATOR-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "columnize_by_links", "COLUMNIZE-BY-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "columnize_by_categories", "COLUMNIZE-BY-CATEGORIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "navigator_categories_for_display", "NAVIGATOR-CATEGORIES-FOR-DISPLAY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "cyc_navigator", "CYC-NAVIGATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "format_navigator_preferences", "FORMAT-NAVIGATOR-PREFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "set_navigator_preferences", "SET-NAVIGATOR-PREFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "handle_navigator_preferences", "HANDLE-NAVIGATOR-PREFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "guest_warn", "GUEST-WARN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "guest_warn_int", "GUEST-WARN-INT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "guest_warn_string", "GUEST-WARN-STRING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "make_ok_cyclist_name", "MAKE-OK-CYCLIST-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "cb_link_load_transcript", "CB-LINK-LOAD-TRANSCRIPT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "html_load_transcript", "HTML-LOAD-TRANSCRIPT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "cb_load_transcript", "CB-LOAD-TRANSCRIPT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "generic_message_page", "GENERIC-MESSAGE-PAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "handle_load_transcript", "HANDLE-LOAD-TRANSCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "report_file_not_available", "REPORT-FILE-NOT-AVAILABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "maybe_use_english", "MAYBE-USE-ENGLISH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "maybe_use_english_text", "MAYBE-USE-ENGLISH-TEXT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "clear_pg_caches", "CLEAR-PG-CACHES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "cyc_nav_clear_el_formulas_cache", "CYC-NAV-CLEAR-EL-FORMULAS-CACHE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "cb_clear_el_formulas_cache", "CB-CLEAR-EL-FORMULAS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "html_start_agenda", "HTML-START-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "html_halt_agenda", "HTML-HALT-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_navigator_internals", "html_restart_agenda", "HTML-RESTART-AGENDA", 0, 1, false);
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    public static SubLObject init_cyc_navigator_internals_file() {
        cyc_navigator_internals.$navigator_links_sorted$ = SubLFiles.defparameter("*NAVIGATOR-LINKS-SORTED*", (SubLObject)cyc_navigator_internals.NIL);
        cyc_navigator_internals.$navigator_columns$ = SubLFiles.defparameter("*NAVIGATOR-COLUMNS*", (SubLObject)cyc_navigator_internals.THREE_INTEGER);
        cyc_navigator_internals.$navigator_column_padding$ = SubLFiles.defparameter("*NAVIGATOR-COLUMN-PADDING*", (SubLObject)cyc_navigator_internals.FIVE_INTEGER);
        cyc_navigator_internals.$columnize_by_category$ = SubLFiles.defparameter("*COLUMNIZE-BY-CATEGORY*", (SubLObject)cyc_navigator_internals.T);
        cyc_navigator_internals.$navigator_line_spacing$ = SubLFiles.defparameter("*NAVIGATOR-LINE-SPACING*", (SubLObject)cyc_navigator_internals.$str3$single);
        cyc_navigator_internals.$navigator_table_border$ = SubLFiles.defparameter("*NAVIGATOR-TABLE-BORDER*", (SubLObject)cyc_navigator_internals.ZERO_INTEGER);
        cyc_navigator_internals.$navigator_vector_length$ = SubLFiles.deflexical("*NAVIGATOR-VECTOR-LENGTH*", (SubLObject)cyc_navigator_internals.TWENTY_INTEGER);
        cyc_navigator_internals.$navigator_link_definition_table$ = SubLFiles.deflexical("*NAVIGATOR-LINK-DEFINITION-TABLE*", maybeDefault((SubLObject)cyc_navigator_internals.$sym6$_NAVIGATOR_LINK_DEFINITION_TABLE_, cyc_navigator_internals.$navigator_link_definition_table$, ()->(Hashtables.make_hash_table((SubLObject)cyc_navigator_internals.$int7$100, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED))));
        cyc_navigator_internals.$navigator_link_category_table$ = SubLFiles.deflexical("*NAVIGATOR-LINK-CATEGORY-TABLE*", maybeDefault((SubLObject)cyc_navigator_internals.$sym8$_NAVIGATOR_LINK_CATEGORY_TABLE_, cyc_navigator_internals.$navigator_link_category_table$, ()->(Hashtables.make_hash_table((SubLObject)cyc_navigator_internals.$int9$50, (SubLObject)cyc_navigator_internals.UNPROVIDED, (SubLObject)cyc_navigator_internals.UNPROVIDED))));
        cyc_navigator_internals.$navigator_link_types$ = SubLFiles.deflexical("*NAVIGATOR-LINK-TYPES*", (SubLObject)cyc_navigator_internals.$list10);
        cyc_navigator_internals.$navigator_link_categories$ = SubLFiles.deflexical("*NAVIGATOR-LINK-CATEGORIES*", (SubLObject)cyc_navigator_internals.$list11);
        cyc_navigator_internals.$navigator_link_definition_keys$ = SubLFiles.defparameter("*NAVIGATOR-LINK-DEFINITION-KEYS*", (SubLObject)cyc_navigator_internals.$list12);
        cyc_navigator_internals.$nav_link_method_table$ = SubLFiles.defparameter("*NAV-LINK-METHOD-TABLE*", (SubLObject)cyc_navigator_internals.$list54);
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    public static SubLObject setup_cyc_navigator_internals_file() {
        utilities_macros.register_html_state_variable((SubLObject)cyc_navigator_internals.$sym0$_NAVIGATOR_COLUMNS_);
        utilities_macros.register_html_state_variable((SubLObject)cyc_navigator_internals.$sym1$_NAVIGATOR_COLUMN_PADDING_);
        utilities_macros.register_html_state_variable((SubLObject)cyc_navigator_internals.$sym2$_COLUMNIZE_BY_CATEGORY_);
        utilities_macros.register_html_state_variable((SubLObject)cyc_navigator_internals.$sym4$_NAVIGATOR_LINE_SPACING_);
        utilities_macros.register_html_state_variable((SubLObject)cyc_navigator_internals.$sym5$_NAVIGATOR_TABLE_BORDER_);
        subl_macro_promotions.declare_defglobal((SubLObject)cyc_navigator_internals.$sym6$_NAVIGATOR_LINK_DEFINITION_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)cyc_navigator_internals.$sym8$_NAVIGATOR_LINK_CATEGORY_TABLE_);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym63$NAV_MALFORMED_LINK, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym76$COLUMNIZE_BY_LINKS, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym77$COLUMNIZE_BY_CATEGORIES, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym96$CYC_NAVIGATOR, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym111$FORMAT_NAVIGATOR_PREFERENCES, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym118$SET_NAVIGATOR_PREFERENCES, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym120$HANDLE_NAVIGATOR_PREFERENCES, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym123$GUEST_WARN, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cyc_navigator_internals.$kw136$LOAD_TRANSCRIPT, (SubLObject)cyc_navigator_internals.$sym137$CB_LINK_LOAD_TRANSCRIPT, (SubLObject)cyc_navigator_internals.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cyc_navigator_internals.$kw136$LOAD_TRANSCRIPT, (SubLObject)cyc_navigator_internals.$str138$Transcript_Load, (SubLObject)cyc_navigator_internals.$str139$TLoad, (SubLObject)cyc_navigator_internals.$str140$Load_transcript_file);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym141$HTML_LOAD_TRANSCRIPT, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym164$CB_LOAD_TRANSCRIPT, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym171$HANDLE_LOAD_TRANSCRIPT, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym174$REPORT_FILE_NOT_AVAILABLE, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym177$MAYBE_USE_ENGLISH, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym180$CLEAR_PG_CACHES, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym181$CYC_NAV_CLEAR_EL_FORMULAS_CACHE, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym182$HTML_START_AGENDA, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym183$HTML_HALT_AGENDA, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cyc_navigator_internals.$sym184$HTML_RESTART_AGENDA, (SubLObject)cyc_navigator_internals.$kw64$HTML_HANDLER);
        return (SubLObject)cyc_navigator_internals.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cyc_navigator_internals_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cyc_navigator_internals_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cyc_navigator_internals_file();
    }
    
    static {
        me = (SubLFile)new cyc_navigator_internals();
        cyc_navigator_internals.$navigator_links_sorted$ = null;
        cyc_navigator_internals.$navigator_columns$ = null;
        cyc_navigator_internals.$navigator_column_padding$ = null;
        cyc_navigator_internals.$columnize_by_category$ = null;
        cyc_navigator_internals.$navigator_line_spacing$ = null;
        cyc_navigator_internals.$navigator_table_border$ = null;
        cyc_navigator_internals.$navigator_vector_length$ = null;
        cyc_navigator_internals.$navigator_link_definition_table$ = null;
        cyc_navigator_internals.$navigator_link_category_table$ = null;
        cyc_navigator_internals.$navigator_link_types$ = null;
        cyc_navigator_internals.$navigator_link_categories$ = null;
        cyc_navigator_internals.$navigator_link_definition_keys$ = null;
        cyc_navigator_internals.$nav_link_method_table$ = null;
        $sym0$_NAVIGATOR_COLUMNS_ = SubLObjectFactory.makeSymbol("*NAVIGATOR-COLUMNS*");
        $sym1$_NAVIGATOR_COLUMN_PADDING_ = SubLObjectFactory.makeSymbol("*NAVIGATOR-COLUMN-PADDING*");
        $sym2$_COLUMNIZE_BY_CATEGORY_ = SubLObjectFactory.makeSymbol("*COLUMNIZE-BY-CATEGORY*");
        $str3$single = SubLObjectFactory.makeString("single");
        $sym4$_NAVIGATOR_LINE_SPACING_ = SubLObjectFactory.makeSymbol("*NAVIGATOR-LINE-SPACING*");
        $sym5$_NAVIGATOR_TABLE_BORDER_ = SubLObjectFactory.makeSymbol("*NAVIGATOR-TABLE-BORDER*");
        $sym6$_NAVIGATOR_LINK_DEFINITION_TABLE_ = SubLObjectFactory.makeSymbol("*NAVIGATOR-LINK-DEFINITION-TABLE*");
        $int7$100 = SubLObjectFactory.makeInteger(100);
        $sym8$_NAVIGATOR_LINK_CATEGORY_TABLE_ = SubLObjectFactory.makeSymbol("*NAVIGATOR-LINK-CATEGORY-TABLE*");
        $int9$50 = SubLObjectFactory.makeInteger(50);
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("IMAGE"));
        $list11 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSING-AND-EDITING"), (SubLObject)SubLObjectFactory.makeString("Browsing and Editing"), (SubLObject)cyc_navigator_internals.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMMUNICATION-MODES"), (SubLObject)SubLObjectFactory.makeString("Communication Modes"), (SubLObject)cyc_navigator_internals.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-MAIN-MENU"), (SubLObject)SubLObjectFactory.makeString("Cyc Main Menu"), (SubLObject)cyc_navigator_internals.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-SYSTEM"), (SubLObject)SubLObjectFactory.makeString("Cyc System"), (SubLObject)cyc_navigator_internals.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FILE-HANDLING"), (SubLObject)SubLObjectFactory.makeString("File Handling"), (SubLObject)cyc_navigator_internals.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE"), (SubLObject)SubLObjectFactory.makeString("Inference"), (SubLObject)cyc_navigator_internals.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NL-TOOLS"), (SubLObject)SubLObjectFactory.makeString("NL Tools"), (SubLObject)cyc_navigator_internals.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFO-RETRIEVAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TELL-ASK")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OTHER")) });
        $list12 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LINK-TYPE"), (SubLObject)cyc_navigator_internals.ZERO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CATEGORIES"), (SubLObject)cyc_navigator_internals.ONE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("HREF-BASE-STRING"), (SubLObject)cyc_navigator_internals.TWO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NUMBER-OF-ARGS"), (SubLObject)cyc_navigator_internals.THREE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("HREF-TAGS"), (SubLObject)cyc_navigator_internals.FOUR_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TARGET"), (SubLObject)cyc_navigator_internals.FIVE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LINK-TEXT"), (SubLObject)cyc_navigator_internals.SIX_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("IMAGE-SRC"), (SubLObject)cyc_navigator_internals.SEVEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ISMAP"), (SubLObject)cyc_navigator_internals.EIGHT_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ALT"), (SubLObject)cyc_navigator_internals.NINE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)cyc_navigator_internals.TEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("BORDER"), (SubLObject)cyc_navigator_internals.ELEVEN_INTEGER) });
        $sym13$CAR = SubLObjectFactory.makeSymbol("CAR");
        $kw14$REPLACE = SubLObjectFactory.makeKeyword("REPLACE");
        $str15$No_vector_in__s_for_the_link_key_ = SubLObjectFactory.makeString("No vector in ~s for the link key ~s");
        $str16$No_index_in__s_for_the_definition = SubLObjectFactory.makeString("No index in ~s for the definition key ~s");
        $sym17$_NAVIGATOR_LINK_DEFINITION_KEYS_ = SubLObjectFactory.makeSymbol("*NAVIGATOR-LINK-DEFINITION-KEYS*");
        $kw18$CONS = SubLObjectFactory.makeKeyword("CONS");
        $kw19$ADJOIN = SubLObjectFactory.makeKeyword("ADJOIN");
        $kw20$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $kw21$NCONC = SubLObjectFactory.makeKeyword("NCONC");
        $kw22$UNION = SubLObjectFactory.makeKeyword("UNION");
        $kw23$INTERSECTION = SubLObjectFactory.makeKeyword("INTERSECTION");
        $str24$_s_is_not_a_supported_method_for_ = SubLObjectFactory.makeString("~s is not a supported method for ~s");
        $sym25$SET_LINK_VALUE = SubLObjectFactory.makeSymbol("SET-LINK-VALUE");
        $str26$_s = SubLObjectFactory.makeString("~s");
        $str27$___a_a____s = SubLObjectFactory.makeString("~%~a~a . ~s");
        $str28$in_def_navigator_link_for__s___s_ = SubLObjectFactory.makeString("in def-navigator-link for ~s: ~s must be one of these, ~s, but is this: ~s");
        $sym29$LINK_TYPE = SubLObjectFactory.makeSymbol("LINK-TYPE");
        $str30$in_def_navigator_link_for__s___s_ = SubLObjectFactory.makeString("in def-navigator-link for ~s: ~s must include one of these, and may include only these: ~s");
        $sym31$CATEGORIES = SubLObjectFactory.makeSymbol("CATEGORIES");
        $str32$in_def_navigator_link_for__s___s_ = SubLObjectFactory.makeString("in def-navigator-link for ~s: ~s must be an integer, but is ~s");
        $sym33$NUMBER_OF_ARGS = SubLObjectFactory.makeSymbol("NUMBER-OF-ARGS");
        $str34$in_def_navigator_link_for__s___s_ = SubLObjectFactory.makeString("in def-navigator-link for ~s: ~s must be a specified, and should be form which evaluates to a string, but is ~s");
        $sym35$HREF_BASE_STRING = SubLObjectFactory.makeSymbol("HREF-BASE-STRING");
        $kw36$LINK_TYPE = SubLObjectFactory.makeKeyword("LINK-TYPE");
        $kw37$CATEGORIES = SubLObjectFactory.makeKeyword("CATEGORIES");
        $kw38$HREF_BASE_STRING = SubLObjectFactory.makeKeyword("HREF-BASE-STRING");
        $kw39$NUMBER_OF_ARGS = SubLObjectFactory.makeKeyword("NUMBER-OF-ARGS");
        $kw40$TARGET = SubLObjectFactory.makeKeyword("TARGET");
        $kw41$LINK_TEXT = SubLObjectFactory.makeKeyword("LINK-TEXT");
        $kw42$HREF_TAGS = SubLObjectFactory.makeKeyword("HREF-TAGS");
        $kw43$IMAGE_SRC = SubLObjectFactory.makeKeyword("IMAGE-SRC");
        $kw44$ISMAP = SubLObjectFactory.makeKeyword("ISMAP");
        $kw45$ALT = SubLObjectFactory.makeKeyword("ALT");
        $kw46$ALIGN = SubLObjectFactory.makeKeyword("ALIGN");
        $kw47$BORDER = SubLObjectFactory.makeKeyword("BORDER");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK-TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("ALT"), (SubLObject)SubLObjectFactory.makeKeyword("HREF-BASE-STRING"));
        $str49$1 = SubLObjectFactory.makeString("1");
        $str50$_ = SubLObjectFactory.makeString(" ");
        $sym51$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym52$NAVIGATOR_CATEGORIES_SORT_KEY = SubLObjectFactory.makeSymbol("NAVIGATOR-CATEGORIES-SORT-KEY");
        $sym53$LINK_SORT_KEY = SubLObjectFactory.makeSymbol("LINK-SORT-KEY");
        $list54 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SPLICE-IN-CGI-PROGRAM"), (SubLObject)SubLObjectFactory.makeSymbol("SPLICE-IN-CGI-PROGRAM")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("STRING-IS-RELATIVE-URL"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-IS-RELATIVE-URL")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("HREF-IS-BASE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("HREF-IS-BASE-STRING")));
        $str55$No_link_text_found_for__s_in_call = SubLObjectFactory.makeString("No link text found for ~s in call to ~s");
        $sym56$NAV_LINK_FOR_TEXT = SubLObjectFactory.makeSymbol("NAV-LINK-FOR-TEXT");
        $kw57$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $kw58$IMAGE = SubLObjectFactory.makeKeyword("IMAGE");
        $kw59$RED = SubLObjectFactory.makeKeyword("RED");
        $str60$Error___a_must_be_one_of__s__but_ = SubLObjectFactory.makeString("Error: ~a must be one of ~s, but is not.");
        $str61$Malformed_Navigator_Link = SubLObjectFactory.makeString("Malformed Navigator Link");
        $str62$The_navigator_link__s_is_malforme = SubLObjectFactory.makeString("The navigator link ~s is malformed.");
        $sym63$NAV_MALFORMED_LINK = SubLObjectFactory.makeSymbol("NAV-MALFORMED-LINK");
        $kw64$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str65$ = SubLObjectFactory.makeString("");
        $str66$_a_nav_malformed_link__s = SubLObjectFactory.makeString("~a?nav-malformed-link&~s");
        $sym67$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $str68$_a__a = SubLObjectFactory.makeString("~a?~a");
        $str69$cg = SubLObjectFactory.makeString("cg");
        $list70 = ConsesLow.list((SubLObject)cyc_navigator_internals.ONE_INTEGER, (SubLObject)cyc_navigator_internals.TWO_INTEGER, (SubLObject)cyc_navigator_internals.THREE_INTEGER, (SubLObject)cyc_navigator_internals.FOUR_INTEGER);
        $str71$left = SubLObjectFactory.makeString("left");
        $str72$top = SubLObjectFactory.makeString("top");
        $str73$double = SubLObjectFactory.makeString("double");
        $str74$Untitled_Category_ = SubLObjectFactory.makeString("Untitled Category!");
        $sym75$VALID_NAVIGATOR_LINK_ = SubLObjectFactory.makeSymbol("VALID-NAVIGATOR-LINK?");
        $sym76$COLUMNIZE_BY_LINKS = SubLObjectFactory.makeSymbol("COLUMNIZE-BY-LINKS");
        $sym77$COLUMNIZE_BY_CATEGORIES = SubLObjectFactory.makeSymbol("COLUMNIZE-BY-CATEGORIES");
        $sym78$THIRD = SubLObjectFactory.makeSymbol("THIRD");
        $sym79$CATEGORY_HAS_LINKS_ = SubLObjectFactory.makeSymbol("CATEGORY-HAS-LINKS?");
        $str80$Cyc_Navigator = SubLObjectFactory.makeString("Cyc Navigator");
        $str81$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str82$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw83$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw84$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw85$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw86$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str87$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str88$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str89$button = SubLObjectFactory.makeString("button");
        $str90$reload = SubLObjectFactory.makeString("reload");
        $str91$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $kw92$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str93$Back = SubLObjectFactory.makeString("Back");
        $str94$There_are_no_Cyc_Navigator_links_ = SubLObjectFactory.makeString("There are no Cyc Navigator links to display.");
        $str95$Go_Back = SubLObjectFactory.makeString("Go Back");
        $sym96$CYC_NAVIGATOR = SubLObjectFactory.makeSymbol("CYC-NAVIGATOR");
        $str97$right = SubLObjectFactory.makeString("right");
        $str98$Number_of_columns__ = SubLObjectFactory.makeString("Number of columns: ");
        $str99$column_number = SubLObjectFactory.makeString("column-number");
        $str100$Width_between_columns__ = SubLObjectFactory.makeString("Width between columns: ");
        $str101$column_padding = SubLObjectFactory.makeString("column-padding");
        $str102$Link_category_arrangement__ = SubLObjectFactory.makeString("Link category arrangement: ");
        $str103$columnize_by_category = SubLObjectFactory.makeString("columnize-by-category");
        $str104$yes = SubLObjectFactory.makeString("yes");
        $str105$_one_column_per_category = SubLObjectFactory.makeString(" one column per category");
        $str106$no = SubLObjectFactory.makeString("no");
        $str107$_multiple_columns_per_category = SubLObjectFactory.makeString(" multiple columns per category");
        $str108$Line_spacing__ = SubLObjectFactory.makeString("Line spacing: ");
        $str109$line_spacing = SubLObjectFactory.makeString("line-spacing");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("single"), (SubLObject)SubLObjectFactory.makeString("double"));
        $sym111$FORMAT_NAVIGATOR_PREFERENCES = SubLObjectFactory.makeSymbol("FORMAT-NAVIGATOR-PREFERENCES");
        $str112$Cyc_Navigator_Preferences = SubLObjectFactory.makeString("Cyc Navigator Preferences");
        $str113$post = SubLObjectFactory.makeString("post");
        $str114$handle_navigator_preferences = SubLObjectFactory.makeString("handle-navigator-preferences");
        $str115$middle = SubLObjectFactory.makeString("middle");
        $str116$Current_Values = SubLObjectFactory.makeString("Current Values");
        $str117$Update = SubLObjectFactory.makeString("Update");
        $sym118$SET_NAVIGATOR_PREFERENCES = SubLObjectFactory.makeSymbol("SET-NAVIGATOR-PREFERENCES");
        $int119$200 = SubLObjectFactory.makeInteger(200);
        $sym120$HANDLE_NAVIGATOR_PREFERENCES = SubLObjectFactory.makeSymbol("HANDLE-NAVIGATOR-PREFERENCES");
        $const121$Guest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Guest"));
        $str122$Please_Login_Now = SubLObjectFactory.makeString("Please Login Now");
        $sym123$GUEST_WARN = SubLObjectFactory.makeSymbol("GUEST-WARN");
        $str124$Sorry___a_cannot_be_used_by_peopl = SubLObjectFactory.makeString("Sorry, ~a cannot be used by people logged in as ");
        $str125$this_facility = SubLObjectFactory.makeString("this facility");
        $str126$___Failure_to_login_using_your_un = SubLObjectFactory.makeString(".  Failure to login using your unique name might cause your actions to interfere with those of other users.  Please ");
        $kw127$CB_LOGIN = SubLObjectFactory.makeKeyword("CB-LOGIN");
        $str128$login = SubLObjectFactory.makeString("login");
        $str129$_using_your_real_name_now_ = SubLObjectFactory.makeString(" using your real name now.");
        $str130$Sorry___a_cannot_be_used_by_peopl = SubLObjectFactory.makeString("Sorry, ~a cannot be used by people logged in as ~S");
        $str131$___Failure_to_login_using_your_un = SubLObjectFactory.makeString(".  Failure to login using your unique name might cause your actions to interfere with those of other users.  Please login using your real name now.");
        $sym132$STRING_CAPITALIZE = SubLObjectFactory.makeSymbol("STRING-CAPITALIZE");
        $str133$Load_Transcript = SubLObjectFactory.makeString("Load Transcript");
        $kw134$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str135$cb_load_transcript = SubLObjectFactory.makeString("cb-load-transcript");
        $kw136$LOAD_TRANSCRIPT = SubLObjectFactory.makeKeyword("LOAD-TRANSCRIPT");
        $sym137$CB_LINK_LOAD_TRANSCRIPT = SubLObjectFactory.makeSymbol("CB-LINK-LOAD-TRANSCRIPT");
        $str138$Transcript_Load = SubLObjectFactory.makeString("Transcript Load");
        $str139$TLoad = SubLObjectFactory.makeString("TLoad");
        $str140$Load_transcript_file = SubLObjectFactory.makeString("Load transcript file");
        $sym141$HTML_LOAD_TRANSCRIPT = SubLObjectFactory.makeSymbol("HTML-LOAD-TRANSCRIPT");
        $str142$the_Load_Transcript_File_page = SubLObjectFactory.makeString("the Load Transcript File page");
        $str143$Load_Transcript_File = SubLObjectFactory.makeString("Load Transcript File");
        $str144$handle_load_transcript = SubLObjectFactory.makeString("handle-load-transcript");
        $str145$center = SubLObjectFactory.makeString("center");
        $str146$Pathname_ = SubLObjectFactory.makeString("Pathname:");
        $str147$load_file = SubLObjectFactory.makeString("load_file");
        $int148$40 = SubLObjectFactory.makeInteger(40);
        $str149$Clear = SubLObjectFactory.makeString("Clear");
        $str150$Load = SubLObjectFactory.makeString("Load");
        $str151$Destination_queue__ = SubLObjectFactory.makeString("Destination queue: ");
        $str152$queue = SubLObjectFactory.makeString("queue");
        $str153$_aux = SubLObjectFactory.makeString(":aux");
        $str154$__AUXILIARY = SubLObjectFactory.makeString(" :AUXILIARY");
        $str155$_local = SubLObjectFactory.makeString(":local");
        $str156$__LOCAL = SubLObjectFactory.makeString(" :LOCAL");
        $str157$_none = SubLObjectFactory.makeString(":none");
        $str158$__NONE = SubLObjectFactory.makeString(" :NONE");
        $str159$transcript = SubLObjectFactory.makeString("transcript");
        $str160$_Transcript_unenqueued___NONE__op = SubLObjectFactory.makeString(" Transcript unenqueued (:NONE) operations");
        $str161$READ_THIS_BEFORE_LOADING_A_TRANSC = SubLObjectFactory.makeString("READ THIS BEFORE LOADING A TRANSCRIPT FILE: ");
        $str162$The_possible_values_for_the_desti = SubLObjectFactory.makeString("The possible values for the destination queue -- the place newly-loaded transcript operations are to be put for processing -- are :AUXILIARY, :LOCAL, and :NONE.  If you choose :AUXILIARY (the default), newly-loaded operations will be put in the *auxiliary-queue* and processed.  They will not be put in a (new) transcript file after they are processed.  If you choose :LOCAL, newly-loaded operations will be put in the *local-queue* and processed.  They will be put on the *transcript-queue* after they are processed, and will be saved in a new transcript file if you are in a communication mode which allows this.  If you choose :NONE, operations will simply be unencapsulated and evaluated in your local Cyc image.  They will not be put in any queue.  If you choose :NONE, and you want to have the newly-loaded operations saved in a new trancsript file, select the option \"Transcript unenqueued (:NONE) operations\".");
        $str163$Loading_a_transcript_file_may_hav = SubLObjectFactory.makeString("Loading a transcript file may have unintended consequences if you do not understand what you are doing.  Please ask an experienced Cyclist for advice if you still do not understand what the choices above mean.");
        $sym164$CB_LOAD_TRANSCRIPT = SubLObjectFactory.makeSymbol("CB-LOAD-TRANSCRIPT");
        $str165$Transcript_File_Loaded = SubLObjectFactory.makeString("Transcript File Loaded");
        $str166$The_file__s_containing__s_operati = SubLObjectFactory.makeString("The file ~s containing ~s operations was successfully loaded into the Cyc image ~a.");
        $str167$Transcript_File_Problem = SubLObjectFactory.makeString("Transcript File Problem");
        $str168$The_file__s_exists__but_no_operat = SubLObjectFactory.makeString("The file ~s exists, but no operations were loaded into the Cyc image ~a.");
        $str169$File_Not_Available = SubLObjectFactory.makeString("File Not Available");
        $str170$The_file__s_cannot_be_accessed___ = SubLObjectFactory.makeString("The file ~s cannot be accessed.  Make sure that the file exists, or check to see if there is a file access permission problem.");
        $sym171$HANDLE_LOAD_TRANSCRIPT = SubLObjectFactory.makeSymbol("HANDLE-LOAD-TRANSCRIPT");
        $str172$The_file_ = SubLObjectFactory.makeString("The file ");
        $str173$_does_not_exist__or_cannot_be_acc = SubLObjectFactory.makeString(" does not exist, or cannot be accessed.  Make sure that the file exists, or check to see if there is a file access permission problem.");
        $sym174$REPORT_FILE_NOT_AVAILABLE = SubLObjectFactory.makeSymbol("REPORT-FILE-NOT-AVAILABLE");
        $kw175$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $kw176$NL = SubLObjectFactory.makeKeyword("NL");
        $sym177$MAYBE_USE_ENGLISH = SubLObjectFactory.makeSymbol("MAYBE-USE-ENGLISH");
        $str178$Show_Assertions_in_English = SubLObjectFactory.makeString("Show Assertions in English");
        $str179$Show_Assertions_in_CycL = SubLObjectFactory.makeString("Show Assertions in CycL");
        $sym180$CLEAR_PG_CACHES = SubLObjectFactory.makeSymbol("CLEAR-PG-CACHES");
        $sym181$CYC_NAV_CLEAR_EL_FORMULAS_CACHE = SubLObjectFactory.makeSymbol("CYC-NAV-CLEAR-EL-FORMULAS-CACHE");
        $sym182$HTML_START_AGENDA = SubLObjectFactory.makeSymbol("HTML-START-AGENDA");
        $sym183$HTML_HALT_AGENDA = SubLObjectFactory.makeSymbol("HTML-HALT-AGENDA");
        $sym184$HTML_RESTART_AGENDA = SubLObjectFactory.makeSymbol("HTML-RESTART-AGENDA");
    }
}

/*

	Total time: 1525 ms
	
*/
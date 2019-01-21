package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_modification_event_filters extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_modification_event_filters";
    public static final String myFingerPrint = "a45ea8585ac4898849f9a818387519f4c7aa47935f032157e989c1f268b86e04";
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 990L)
    private static SubLSymbol $kb_modification_filter_map$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 1285L)
    private static SubLSymbol $kb_modification_filter_event_equivalents$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 2948L)
    public static SubLSymbol $matched_kb_modification_event_filters$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 18195L)
    public static SubLSymbol $dtp_event_filter_description$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 19651L)
    private static SubLSymbol $event_filter_registration$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 19731L)
    private static SubLSymbol $event_filter_registration_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 19828L)
    private static SubLSymbol $event_filter_pattern_id$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 22261L)
    private static SubLSymbol $kb_modification_event_to_filter_mapping$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 22409L)
    private static SubLSymbol $kb_modification_event_to_filter_mapping_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 22534L)
    private static SubLSymbol $kb_modification_event_internal_listener_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 28293L)
    public static SubLSymbol $transmit_kb_modification_event_to_listener_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 28751L)
    private static SubLSymbol $kb_modification_filter_event_fired_listener$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 31713L)
    private static SubLSymbol $kb_modification_external_filter_delivery_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 32833L)
    private static SubLSymbol $event_filter_listener_registration$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 33142L)
    private static SubLSymbol $event_filter_listener_registration_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 33257L)
    private static SubLSymbol $event_filter_listener_id$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 34123L)
    public static SubLSymbol $compute_key_from_external_event_filter_listener_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 34375L)
    public static SubLSymbol $external_event_filter_listener_p_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 34556L)
    public static SubLSymbol $is_external_event_filter_listener_validP_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 34875L)
    public static SubLSymbol $invalidate_external_event_filter_listener_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 39386L)
    private static SubLSymbol $verbose_transmit_kb_modification_events$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 40472L)
    private static SubLSymbol $kb_modification_event_mailbox_suite$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 41122L)
    public static SubLSymbol $dtp_message_mailbox_listener$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 45506L)
    private static SubLSymbol $active_external_kb_modification_event_filters$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 45676L)
    private static SubLSymbol $external_kb_modification_event_listeners_for_filters$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 45782L)
    private static SubLSymbol $external_kb_modification_event_listeners_lock$;
    private static final SubLString $str0$Invalid_event_denotation__A_for_f;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$EVENT;
    private static final SubLString $str3$Arglist_must_start_with_event_par;
    private static final SubLSymbol $sym4$PROGN;
    private static final SubLSymbol $sym5$DEFINE_PRIVATE;
    private static final SubLSymbol $sym6$REGISTER_NEW_KB_MODIFICATION_FILTER;
    private static final SubLSymbol $sym7$QUOTE;
    private static final SubLSymbol $sym8$REGISTER_KB_MODIFICATION_FILTER_EVENT_EQUIVALENTS;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$CLET;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$CSETQ;
    private static final SubLList $list13;
    private static final SubLSymbol $kw14$AND;
    private static final SubLSymbol $sym15$SYMBOLIC_PLIST_P;
    private static final SubLSymbol $kw16$OR;
    private static final SubLSymbol $kw17$NOT;
    private static final SubLSymbol $kw18$DEFAULT_KB_MODIFICATION_EVENT_FILTER;
    private static final SubLSymbol $kw19$EVENT_CLASS;
    private static final SubLSymbol $sym20$DEFAULT_KB_MODIFICATION_EVENT_FILTER;
    private static final SubLList $list21;
    private static final SubLSymbol $kw22$FORT_FILTER;
    private static final SubLSymbol $kw23$CYCL_FORT_FILTER;
    private static final SubLSymbol $sym24$KB_MODIFICATION_EVENT_FORT_FILTER;
    private static final SubLList $list25;
    private static final SubLSymbol $kw26$COLLECTION_FILTER;
    private static final SubLSymbol $sym27$KB_MODIFICATION_EVENT_COLLECTION_FILTER;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$LEXICON_FORT_FILTER;
    private static final SubLSymbol $sym30$KB_MODIFICATION_EVENT_LEXICON_FORT_FILTER;
    private static final SubLSymbol $kw31$MT_FILTER;
    private static final SubLSymbol $sym32$KB_MODIFICATION_EVENT_MT_FILTER;
    private static final SubLSymbol $kw33$ANY_CHANGE;
    private static final SubLSymbol $kw34$KB_MODIFY_REMOVE_CONSTANT;
    private static final SubLSymbol $kw35$FORT_REMOVED;
    private static final SubLSymbol $kw36$EVENT_TYPE;
    private static final SubLSymbol $kw37$CYCL_FORT_EVENT;
    private static final SubLSymbol $kw38$EVENT_REASON;
    private static final SubLSymbol $kw39$ITEM_REMOVED;
    private static final SubLSymbol $kw40$FORT_MODIFIED;
    private static final SubLSymbol $kw41$REMOVED_VALUE;
    private static final SubLSymbol $kw42$KB_MODIFY_CREATE_ASSERTION;
    private static final SubLSymbol $kw43$FORT_ASSERTION_ADDED;
    private static final SubLSymbol $kw44$ITEM_ADDED;
    private static final SubLSymbol $kw45$ASSERTION_SENTENCE;
    private static final SubLSymbol $kw46$ASSERTION_MT;
    private static final SubLSymbol $kw47$KB_MODIFY_REMOVE_ASSERTION;
    private static final SubLSymbol $kw48$FORT_ASSERTION_REMOVED;
    private static final SubLSymbol $kw49$KB_MODIFY_REMOVE_NART;
    private static final SubLSymbol $kw50$ALL_INSTANTIATIONS;
    private static final SubLSymbol $kw51$INSTANCE_REMOVED;
    private static final SubLSymbol $kw52$CYCL_COLLECTION_EVENT;
    private static final SubLSymbol $kw53$COLLECTION_MODIFIED;
    private static final SubLSymbol $kw54$ADDED_VALUE;
    private static final SubLSymbol $kw55$INSTANCE_ADDED;
    private static final SubLObject $const56$isa;
    private static final SubLSymbol $kw57$IMMEDIATE_INSTANTIATIONS;
    private static final SubLSymbol $kw58$LOCAL_CHANGE;
    private static final SubLSymbol $kw59$ASSERTION_ADDED;
    private static final SubLSymbol $kw60$ASSERTION_REMOVED;
    private static final SubLSymbol $kw61$UPWARD_CLOSURE;
    private static final SubLSymbol $kw62$DOWNWARD_CLOSURE;
    private static final SubLSymbol $kw63$CYCL_MICROTHEORY_EVENT;
    private static final SubLSymbol $kw64$MICROTHEORY_MODIFIED;
    private static final SubLSymbol $sym65$EVENT_FILTER_DESCRIPTION;
    private static final SubLSymbol $sym66$EVENT_FILTER_DESCRIPTION_P;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLList $list69;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$PRINT_EVENT_FILTER_DESCRIPTION;
    private static final SubLSymbol $sym72$EVENT_FILTER_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list73;
    private static final SubLSymbol $sym74$EVENT_FILTER_DESCRIPTION_ID;
    private static final SubLSymbol $sym75$_CSETF_EVENT_FILTER_DESCRIPTION_ID;
    private static final SubLSymbol $sym76$EVENT_FILTER_DESCRIPTION_PATTERN;
    private static final SubLSymbol $sym77$_CSETF_EVENT_FILTER_DESCRIPTION_PATTERN;
    private static final SubLSymbol $kw78$ID;
    private static final SubLSymbol $kw79$PATTERN;
    private static final SubLString $str80$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw81$BEGIN;
    private static final SubLSymbol $sym82$MAKE_EVENT_FILTER_DESCRIPTION;
    private static final SubLSymbol $kw83$SLOT;
    private static final SubLSymbol $kw84$END;
    private static final SubLSymbol $sym85$VISIT_DEFSTRUCT_OBJECT_EVENT_FILTER_DESCRIPTION_METHOD;
    private static final SubLString $str86$_id__;
    private static final SubLString $str87$_pattern__;
    private static final SubLSymbol $sym88$_EVENT_FILTER_REGISTRATION_;
    private static final SubLSymbol $sym89$_EVENT_FILTER_REGISTRATION_LOCK_;
    private static final SubLString $str90$Event_Filter_Registration;
    private static final SubLSymbol $sym91$_EVENT_FILTER_PATTERN_ID_;
    private static final SubLString $str92$Current_KB_Modification_Event_Fil;
    private static final SubLSymbol $sym93$CREATE_KB_MODIFICATION_EVENT_FILTER;
    private static final SubLSymbol $sym94$DELETE_KB_MODIFICATION_EVENT_FILTER;
    private static final SubLSymbol $sym95$FIXNUMP;
    private static final SubLSymbol $sym96$_KB_MODIFICATION_EVENT_TO_FILTER_MAPPING_;
    private static final SubLSymbol $sym97$_KB_MODIFICATION_EVENT_TO_FILTER_MAPPING_LOCK_;
    private static final SubLString $str98$KB_Modification_Event_to_Filter_M;
    private static final SubLSymbol $sym99$_KB_MODIFICATION_EVENT_INTERNAL_LISTENER_TABLE_;
    private static final SubLString $str100$Current_KB_Modification_Event_To_;
    private static final SubLString $str101$Current_KB_Modification_Event_Int;
    private static final SubLSymbol $kw102$NOT_FOUND;
    private static final SubLSymbol $sym103$KB_MODIFICATION_EVENT_FILTER_GENERIC_EVENT_HANDLER;
    private static final SubLSymbol $kw104$LISTENER;
    private static final SubLSymbol $kw105$FILTERS;
    private static final SubLSymbol $kw106$FIRED;
    private static final SubLSymbol $kw107$DETAILS;
    private static final SubLSymbol $kw108$TRIGGER;
    private static final SubLSymbol $kw109$SUPPORTS;
    private static final SubLSymbol $kw110$KB_MODIFICATION_FILTER_FIRED;
    private static final SubLSymbol $sym111$EVENT_P;
    private static final SubLString $str112$Event__S_is_of_type__S__not__S_;
    private static final SubLInteger $int113$256;
    private static final SubLString $str114$Not_implemented_for_type__A;
    private static final SubLSymbol $kw115$KB_STORE_EVENT;
    private static final SubLSymbol $sym116$_KB_MODIFICATION_FILTER_EVENT_FIRED_LISTENER_;
    private static final SubLSymbol $sym117$HANDLE_KB_MODIFICATION_FILTER_FIRED;
    private static final SubLList $list118;
    private static final SubLSymbol $sym119$CCONCATENATE;
    private static final SubLString $str120$eventNotifications;
    private static final SubLString $str121$http___www_opencyc_org_xml_eventN;
    private static final SubLSymbol $kw122$UNINITIALIZED;
    private static final SubLString $str123$eventNotification;
    private static final SubLString $str124$kbModificationFilteredEvent;
    private static final SubLString $str125$filterList;
    private static final SubLString $str126$filterId;
    private static final SubLString $str127$timestamp;
    private static final SubLString $str128$kbEvents;
    private static final SubLString $str129$kbEvent;
    private static final SubLSymbol $kw130$HP;
    private static final SubLSymbol $sym131$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str132$KB_Modification_Filter_Fired__cou;
    private static final SubLSymbol $sym133$_EVENT_FILTER_LISTENER_REGISTRATION_;
    private static final SubLSymbol $sym134$_EVENT_FILTER_LISTENER_REGISTRATION_LOCK_;
    private static final SubLString $str135$Event_Filter_Listener_Registratio;
    private static final SubLSymbol $sym136$_EVENT_FILTER_LISTENER_ID_;
    private static final SubLString $str137$Current_External_KB_Modification_;
    private static final SubLSymbol $sym138$DELETE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER;
    private static final SubLSymbol $sym139$TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_SOCKET_INFO_METHOD;
    private static final SubLSymbol $sym140$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHO;
    private static final SubLSymbol $sym141$EXTERNAL_EVENT_FILTER_LISTENER_P_SOCKET_INFO_METHOD;
    private static final SubLSymbol $sym142$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__SOCKET_INFO_METHOD;
    private static final SubLSymbol $sym143$INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHOD;
    private static final SubLSymbol $kw144$PRIVATE;
    private static final SubLString $str145$_A__About_to_send_to__A__A____A__;
    private static final SubLSymbol $sym146$CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER;
    private static final SubLSymbol $sym147$STRINGP;
    private static final SubLSymbol $sym148$PLUSP;
    private static final SubLSymbol $sym149$_KB_MODIFICATION_EVENT_MAILBOX_SUITE_;
    private static final SubLSymbol $kw150$CLEARED;
    private static final SubLSymbol $sym151$WITH_MESSAGE_MAILBOX_SUITE;
    private static final SubLList $list152;
    private static final SubLSymbol $sym153$MESSAGE_MAILBOX_LISTENER;
    private static final SubLSymbol $sym154$MESSAGE_MAILBOX_LISTENER_P;
    private static final SubLList $list155;
    private static final SubLList $list156;
    private static final SubLList $list157;
    private static final SubLList $list158;
    private static final SubLSymbol $sym159$PRINT_MESSAGE_MAILBOX_LISTENER;
    private static final SubLSymbol $sym160$MESSAGE_MAILBOX_LISTENER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list161;
    private static final SubLSymbol $sym162$MMBOX_LISTENER_ADDRESS;
    private static final SubLSymbol $sym163$_CSETF_MMBOX_LISTENER_ADDRESS;
    private static final SubLSymbol $kw164$ADDRESS;
    private static final SubLSymbol $sym165$MAKE_MESSAGE_MAILBOX_LISTENER;
    private static final SubLSymbol $sym166$VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_LISTENER_METHOD;
    private static final SubLString $str167$_address__;
    private static final SubLSymbol $kw168$BLOCKING;
    private static final SubLSymbol $sym169$TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_MESSAGE_MAILBOX_LISTEN;
    private static final SubLSymbol $sym170$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_L;
    private static final SubLSymbol $sym171$EXTERNAL_EVENT_FILTER_LISTENER_P_MESSAGE_MAILBOX_LISTENER_METHOD;
    private static final SubLSymbol $sym172$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__MESSAGE_MAILBOX_LISTENER;
    private static final SubLSymbol $sym173$INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_LISTENE;
    private static final SubLString $str174$The_listener__S_is_no_longer_vali;
    private static final SubLSymbol $sym175$CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGE_MAILBOX_LIST;
    private static final SubLSymbol $sym176$ALL_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGES_FROM_MAILBOX;
    private static final SubLString $str177$Not_a_valid_external_event_filter;
    private static final SubLString $str178$Wrong_API_for_type____only_suitab;
    private static final SubLSymbol $sym179$_ACTIVE_EXTERNAL_KB_MODIFICATION_EVENT_FILTERS_;
    private static final SubLSymbol $sym180$_EXTERNAL_KB_MODIFICATION_EVENT_LISTENERS_FOR_FILTERS_;
    private static final SubLString $str181$External_KB_Modification_Event_Li;
    private static final SubLString $str182$Current_External_KB_Modification_;
    private static final SubLString $str183$_Active_Filters__;
    private static final SubLString $str184$_Listeners_for_Filters_Map__;
    private static final SubLSymbol $sym185$ADD_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER;
    private static final SubLSymbol $sym186$REMOVE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER;
    private static final SubLSymbol $kw187$EMPTY;
    private static final SubLString $str188$KB_Modification_Event_Filters;
    private static final SubLString $str189$KB_Modification_Event_Filters_Tes;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 1129L)
    public static SubLObject register_new_kb_modification_filter(final SubLObject filter, final SubLObject function_spec) {
        return dictionary.dictionary_enter(kb_modification_event_filters.$kb_modification_filter_map$.getGlobalValue(), filter, function_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 1372L)
    public static SubLObject register_kb_modification_filter_event_equivalents(final SubLObject filter, final SubLObject event_denotations) {
        SubLObject events = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject v_properties = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject cdolist_list_var = event_denotations;
        SubLObject event_denotation = (SubLObject)kb_modification_event_filters.NIL;
        event_denotation = cdolist_list_var.first();
        while (kb_modification_event_filters.NIL != cdolist_list_var) {
            if (kb_modification_event_filters.NIL != kb_modification_event_support.valid_kb_modification_event_class_p(event_denotation)) {
                final SubLObject item_var = event_denotation;
                if (kb_modification_event_filters.NIL == conses_high.member(item_var, events, Symbols.symbol_function((SubLObject)kb_modification_event_filters.EQL), Symbols.symbol_function((SubLObject)kb_modification_event_filters.IDENTITY))) {
                    events = (SubLObject)ConsesLow.cons(item_var, events);
                }
            }
            else if (kb_modification_event_filters.NIL != kb_modification_event_support.valid_kb_modification_event_property_p(event_denotation)) {
                v_properties = (SubLObject)ConsesLow.cons(event_denotation, v_properties);
            }
            else {
                Errors.error((SubLObject)kb_modification_event_filters.$str0$Invalid_event_denotation__A_for_f, event_denotation, filter);
            }
            cdolist_list_var = cdolist_list_var.rest();
            event_denotation = cdolist_list_var.first();
        }
        if (kb_modification_event_filters.NIL != v_properties) {
            cdolist_list_var = kb_modification_event_support.get_kb_modification_event_classes_with_all_properties(v_properties);
            SubLObject event = (SubLObject)kb_modification_event_filters.NIL;
            event = cdolist_list_var.first();
            while (kb_modification_event_filters.NIL != cdolist_list_var) {
                final SubLObject item_var = event;
                if (kb_modification_event_filters.NIL == conses_high.member(item_var, events, Symbols.symbol_function((SubLObject)kb_modification_event_filters.EQL), Symbols.symbol_function((SubLObject)kb_modification_event_filters.IDENTITY))) {
                    events = (SubLObject)ConsesLow.cons(item_var, events);
                }
                cdolist_list_var = cdolist_list_var.rest();
                event = cdolist_list_var.first();
            }
        }
        return dictionary.dictionary_enter(kb_modification_event_filters.$kb_modification_filter_event_equivalents$.getGlobalValue(), filter, events);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 2156L)
    public static SubLObject get_kb_modification_filter_event_equivalents(final SubLObject filter) {
        return dictionary.dictionary_lookup(kb_modification_event_filters.$kb_modification_filter_event_equivalents$.getGlobalValue(), filter, (SubLObject)kb_modification_event_filters.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 2310L)
    public static SubLObject define_kb_modification_event_filter(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject filter_token = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject events = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject name = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject arglist = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject docstring = (SubLObject)kb_modification_event_filters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_modification_event_filters.$list1);
        filter_token = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_modification_event_filters.$list1);
        events = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_modification_event_filters.$list1);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_modification_event_filters.$list1);
        arglist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_modification_event_filters.$list1);
        docstring = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (arglist.first() != kb_modification_event_filters.$sym2$EVENT) {
            Errors.error((SubLObject)kb_modification_event_filters.$str3$Arglist_must_start_with_event_par);
        }
        return (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_filters.$sym4$PROGN, (SubLObject)ConsesLow.listS((SubLObject)kb_modification_event_filters.$sym5$DEFINE_PRIVATE, name, arglist, docstring, ConsesLow.append(body, (SubLObject)kb_modification_event_filters.NIL)), (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_filters.$sym6$REGISTER_NEW_KB_MODIFICATION_FILTER, filter_token, (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_filters.$sym7$QUOTE, name)), (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_filters.$sym8$REGISTER_KB_MODIFICATION_FILTER_EVENT_EQUIVALENTS, filter_token, (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_filters.$sym7$QUOTE, events)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 2797L)
    public static SubLObject map_kb_modification_filter_to_function_spec(final SubLObject filter) {
        return dictionary.dictionary_lookup(kb_modification_event_filters.$kb_modification_filter_map$.getGlobalValue(), filter, Symbols.symbol_function((SubLObject)kb_modification_event_filters.IDENTITY));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 3131L)
    public static SubLObject with_matched_kb_modification_event_filters(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_modification_event_filters.$list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filters = (SubLObject)kb_modification_event_filters.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_modification_event_filters.$list9);
        filters = current.first();
        current = current.rest();
        if (kb_modification_event_filters.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)kb_modification_event_filters.$sym10$CLET, (SubLObject)kb_modification_event_filters.$list11, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)kb_modification_event_filters.$sym12$CSETQ, filters, (SubLObject)kb_modification_event_filters.$list13))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_modification_event_filters.$list9);
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 3368L)
    public static SubLObject apply_filter_to_kb_modification_event(final SubLObject event, final SubLObject filter_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject passed_filters = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject information_bundle = (SubLObject)kb_modification_event_filters.NIL;
        final SubLObject _prev_bind_0 = kb_modification_event_filters.$matched_kb_modification_event_filters$.currentBinding(thread);
        try {
            kb_modification_event_filters.$matched_kb_modification_event_filters$.bind((SubLObject)kb_modification_event_filters.NIL, thread);
            information_bundle = apply_filter_to_kb_modification_event_internal(event, filter_expression);
            passed_filters = kb_modification_event_filters.$matched_kb_modification_event_filters$.getDynamicValue(thread);
        }
        finally {
            kb_modification_event_filters.$matched_kb_modification_event_filters$.rebind(_prev_bind_0, thread);
        }
        return Values.values(information_bundle, passed_filters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 3923L)
    public static SubLObject apply_filter_to_kb_modification_event_internal(final SubLObject event, final SubLObject filter_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var;
        final SubLObject filter = pcase_var = filter_expression.first();
        if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw14$AND)) {
            SubLObject was_falseP = (SubLObject)kb_modification_event_filters.NIL;
            final SubLObject v_clauses = filter_expression.rest();
            SubLObject information_bundle = (SubLObject)kb_modification_event_filters.NIL;
            if (kb_modification_event_filters.NIL == was_falseP) {
                SubLObject csome_list_var = v_clauses;
                SubLObject expression = (SubLObject)kb_modification_event_filters.NIL;
                expression = csome_list_var.first();
                while (kb_modification_event_filters.NIL == was_falseP && kb_modification_event_filters.NIL != csome_list_var) {
                    final SubLObject result = apply_filter_to_kb_modification_event_internal(event, expression);
                    if (kb_modification_event_filters.NIL != list_utilities.sublisp_boolean(result)) {
                        if (kb_modification_event_filters.NIL != symbolic_plist_p(result)) {
                            information_bundle = (SubLObject)ConsesLow.cons(result, information_bundle);
                        }
                        else if (kb_modification_event_filters.NIL != list_utilities.list_of_type_p((SubLObject)kb_modification_event_filters.$sym15$SYMBOLIC_PLIST_P, result)) {
                            SubLObject cdolist_list_var = result;
                            SubLObject one_result = (SubLObject)kb_modification_event_filters.NIL;
                            one_result = cdolist_list_var.first();
                            while (kb_modification_event_filters.NIL != cdolist_list_var) {
                                information_bundle = (SubLObject)ConsesLow.cons(one_result, information_bundle);
                                cdolist_list_var = cdolist_list_var.rest();
                                one_result = cdolist_list_var.first();
                            }
                        }
                        else {
                            information_bundle = (SubLObject)ConsesLow.cons(result, information_bundle);
                        }
                    }
                    else {
                        was_falseP = (SubLObject)kb_modification_event_filters.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    expression = csome_list_var.first();
                }
            }
            return (SubLObject)((kb_modification_event_filters.NIL == was_falseP) ? Sequences.nreverse(information_bundle) : kb_modification_event_filters.NIL);
        }
        if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw16$OR)) {
            SubLObject was_trueP = (SubLObject)kb_modification_event_filters.NIL;
            final SubLObject v_clauses = filter_expression.rest();
            SubLObject information_bundle = (SubLObject)kb_modification_event_filters.NIL;
            if (kb_modification_event_filters.NIL == was_trueP) {
                SubLObject csome_list_var = v_clauses;
                SubLObject expression = (SubLObject)kb_modification_event_filters.NIL;
                expression = csome_list_var.first();
                while (kb_modification_event_filters.NIL == was_trueP && kb_modification_event_filters.NIL != csome_list_var) {
                    final SubLObject result = apply_filter_to_kb_modification_event_internal(event, expression);
                    if (kb_modification_event_filters.NIL != list_utilities.sublisp_boolean(result)) {
                        if (kb_modification_event_filters.NIL != symbolic_plist_p(result)) {
                            information_bundle = (SubLObject)ConsesLow.cons(result, information_bundle);
                        }
                        else if (kb_modification_event_filters.NIL != list_utilities.list_of_type_p((SubLObject)kb_modification_event_filters.$sym15$SYMBOLIC_PLIST_P, result)) {
                            SubLObject cdolist_list_var = result;
                            SubLObject one_result = (SubLObject)kb_modification_event_filters.NIL;
                            one_result = cdolist_list_var.first();
                            while (kb_modification_event_filters.NIL != cdolist_list_var) {
                                information_bundle = (SubLObject)ConsesLow.cons(one_result, information_bundle);
                                cdolist_list_var = cdolist_list_var.rest();
                                one_result = cdolist_list_var.first();
                            }
                        }
                        else {
                            information_bundle = (SubLObject)ConsesLow.cons(result, information_bundle);
                        }
                        was_trueP = (SubLObject)kb_modification_event_filters.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    expression = csome_list_var.first();
                }
            }
            return (SubLObject)((kb_modification_event_filters.NIL != was_trueP) ? Sequences.nreverse(information_bundle) : kb_modification_event_filters.NIL);
        }
        if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw17$NOT)) {
            SubLObject passedP = (SubLObject)kb_modification_event_filters.NIL;
            SubLObject passed_filters = (SubLObject)kb_modification_event_filters.NIL;
            final SubLObject _prev_bind_0 = kb_modification_event_filters.$matched_kb_modification_event_filters$.currentBinding(thread);
            try {
                kb_modification_event_filters.$matched_kb_modification_event_filters$.bind((SubLObject)kb_modification_event_filters.NIL, thread);
                passedP = apply_filter_to_kb_modification_event_internal(event, conses_high.second(filter_expression));
                passed_filters = kb_modification_event_filters.$matched_kb_modification_event_filters$.getDynamicValue(thread);
            }
            finally {
                kb_modification_event_filters.$matched_kb_modification_event_filters$.rebind(_prev_bind_0, thread);
            }
            if (kb_modification_event_filters.NIL == passedP) {
                kb_modification_event_filters.$matched_kb_modification_event_filters$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)kb_modification_event_filters.$kw17$NOT, passed_filters), kb_modification_event_filters.$matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_modification_event_filters.NIL == passedP);
        }
        final SubLObject function_spec = map_kb_modification_filter_to_function_spec(filter);
        return Functions.apply(function_spec, (SubLObject)ConsesLow.cons(event, filter_expression.rest().rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 6246L)
    public static SubLObject symbolic_plist_p(final SubLObject list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_modification_event_filters.NIL != list_utilities.property_list_p(list) && list.first().isSymbol());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 6379L)
    public static SubLObject extract_filters_from_kb_modification_filter_expression(final SubLObject filter_expression) {
        final SubLObject pcase_var;
        final SubLObject filter = pcase_var = filter_expression.first();
        if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw14$AND) || pcase_var.eql((SubLObject)kb_modification_event_filters.$kw16$OR)) {
            final SubLObject v_clauses = filter_expression.rest();
            SubLObject filters = (SubLObject)kb_modification_event_filters.NIL;
            SubLObject cdolist_list_var = v_clauses;
            SubLObject clause = (SubLObject)kb_modification_event_filters.NIL;
            clause = cdolist_list_var.first();
            while (kb_modification_event_filters.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$1;
                final SubLObject sub_filters = cdolist_list_var_$1 = extract_filters_from_kb_modification_filter_expression(clause);
                SubLObject sub_filter = (SubLObject)kb_modification_event_filters.NIL;
                sub_filter = cdolist_list_var_$1.first();
                while (kb_modification_event_filters.NIL != cdolist_list_var_$1) {
                    final SubLObject item_var = sub_filter;
                    if (kb_modification_event_filters.NIL == conses_high.member(item_var, filters, Symbols.symbol_function((SubLObject)kb_modification_event_filters.EQL), Symbols.symbol_function((SubLObject)kb_modification_event_filters.IDENTITY))) {
                        filters = (SubLObject)ConsesLow.cons(item_var, filters);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    sub_filter = cdolist_list_var_$1.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            }
            return filters;
        }
        if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw17$NOT)) {
            return extract_filters_from_kb_modification_filter_expression(conses_high.second(filter_expression));
        }
        return (SubLObject)ConsesLow.list(filter);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 7034L)
    public static SubLObject compute_implied_kb_modification_events_from_filter_expression(final SubLObject filter_expression) {
        final SubLObject filters = extract_filters_from_kb_modification_filter_expression(filter_expression);
        SubLObject events = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject cdolist_list_var = filters;
        SubLObject filter = (SubLObject)kb_modification_event_filters.NIL;
        filter = cdolist_list_var.first();
        while (kb_modification_event_filters.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject event_equivalents = cdolist_list_var_$2 = get_kb_modification_filter_event_equivalents(filter);
            SubLObject event = (SubLObject)kb_modification_event_filters.NIL;
            event = cdolist_list_var_$2.first();
            while (kb_modification_event_filters.NIL != cdolist_list_var_$2) {
                final SubLObject item_var = event;
                if (kb_modification_event_filters.NIL == conses_high.member(item_var, events, Symbols.symbol_function((SubLObject)kb_modification_event_filters.EQL), Symbols.symbol_function((SubLObject)kb_modification_event_filters.IDENTITY))) {
                    events = (SubLObject)ConsesLow.cons(item_var, events);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                event = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            filter = cdolist_list_var.first();
        }
        return events;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 7464L)
    public static SubLObject default_kb_modification_event_filter(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_modification_event_filters.$matched_kb_modification_event_filters$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)kb_modification_event_filters.$kw18$DEFAULT_KB_MODIFICATION_EVENT_FILTER, kb_modification_event_filters.$matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
        return ConsesLow.append((SubLObject)ConsesLow.list((SubLObject)kb_modification_event_filters.$kw19$EVENT_CLASS, event_model.event_class(event)), event_model.event_message(event));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 7926L)
    public static SubLObject kb_modification_event_fort_filter(final SubLObject event, final SubLObject fort, final SubLObject modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject details = kb_modification_event_mentions_fort(event, fort, modifier);
        if (kb_modification_event_filters.NIL != details) {
            kb_modification_event_filters.$matched_kb_modification_event_filters$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)kb_modification_event_filters.$kw22$FORT_FILTER, kb_modification_event_filters.$matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
            return details;
        }
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 8602L)
    public static SubLObject kb_modification_event_collection_filter(final SubLObject event, final SubLObject collection, final SubLObject modifier, final SubLObject subsumption) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject details = kb_modification_event_test_for_collection_assertions(event, collection, modifier, subsumption);
        if (kb_modification_event_filters.NIL != details) {
            kb_modification_event_filters.$matched_kb_modification_event_filters$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)kb_modification_event_filters.$kw26$COLLECTION_FILTER, kb_modification_event_filters.$matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
            return details;
        }
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 9506L)
    public static SubLObject kb_modification_event_lexicon_fort_filter(final SubLObject event, final SubLObject fort, final SubLObject modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_modification_event_filters.$matched_kb_modification_event_filters$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)kb_modification_event_filters.$kw29$LEXICON_FORT_FILTER, kb_modification_event_filters.$matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
        return event_model.event_message(event);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 10084L)
    public static SubLObject kb_modification_event_mt_filter(final SubLObject event, final SubLObject v_hlmt, final SubLObject modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject details = kb_modification_event_test_for_microtheory(event, v_hlmt, modifier);
        if (kb_modification_event_filters.NIL != details) {
            kb_modification_event_filters.$matched_kb_modification_event_filters$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)kb_modification_event_filters.$kw31$MT_FILTER, kb_modification_event_filters.$matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
            return details;
        }
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 10596L)
    public static SubLObject kb_modification_event_mentions_fort(final SubLObject event, SubLObject fort, SubLObject modifier) {
        if (modifier == kb_modification_event_filters.UNPROVIDED) {
            modifier = (SubLObject)kb_modification_event_filters.$kw33$ANY_CHANGE;
        }
        if (kb_modification_event_filters.NIL == forts.fort_p(fort)) {
            fort = narts_high.find_nart(fort);
            if (kb_modification_event_filters.NIL == forts.fort_p(fort)) {
                return (SubLObject)kb_modification_event_filters.NIL;
            }
        }
        final SubLObject pcase_var = event_model.event_class(event);
        if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw34$KB_MODIFY_REMOVE_CONSTANT)) {
            if ((kb_modification_event_filters.$kw33$ANY_CHANGE == modifier || kb_modification_event_filters.$kw35$FORT_REMOVED == modifier) && kb_modification_event_filters.NIL != constant_handles.constant_p(fort) && constants_high.constant_external_id(fort).equalp(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_constant_retrieve_external_id(event)))) {
                return (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_filters.$kw36$EVENT_TYPE, (SubLObject)kb_modification_event_filters.$kw37$CYCL_FORT_EVENT, (SubLObject)kb_modification_event_filters.$kw38$EVENT_REASON, (SubLObject)kb_modification_event_filters.$kw39$ITEM_REMOVED, (SubLObject)kb_modification_event_filters.$kw40$FORT_MODIFIED, fort, (SubLObject)kb_modification_event_filters.$kw41$REMOVED_VALUE, fort);
            }
        }
        else if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw42$KB_MODIFY_CREATE_ASSERTION)) {
            if (kb_modification_event_filters.$kw33$ANY_CHANGE == modifier || kb_modification_event_filters.$kw43$FORT_ASSERTION_ADDED == modifier) {
                final SubLObject cnf = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_cnf(event));
                final SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_mt(event));
                if (kb_modification_event_filters.NIL != cycl_utilities.expression_find(fort, cnf, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED) || fort.eql(mt)) {
                    return (SubLObject)ConsesLow.list(new SubLObject[] { kb_modification_event_filters.$kw36$EVENT_TYPE, kb_modification_event_filters.$kw37$CYCL_FORT_EVENT, kb_modification_event_filters.$kw38$EVENT_REASON, kb_modification_event_filters.$kw44$ITEM_ADDED, kb_modification_event_filters.$kw40$FORT_MODIFIED, fort, kb_modification_event_filters.$kw45$ASSERTION_SENTENCE, clauses.cnf_formula(cnf, (SubLObject)kb_modification_event_filters.UNPROVIDED), kb_modification_event_filters.$kw46$ASSERTION_MT, mt });
                }
            }
        }
        else if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw47$KB_MODIFY_REMOVE_ASSERTION)) {
            if (kb_modification_event_filters.$kw33$ANY_CHANGE == modifier || kb_modification_event_filters.$kw48$FORT_ASSERTION_REMOVED == modifier) {
                final SubLObject formula = encapsulation.unencapsulate_partial(kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event));
                final SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_assertion_retrieve_mt(event));
                if (kb_modification_event_filters.NIL != cycl_utilities.expression_find(fort, formula, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED) || fort.eql(mt)) {
                    return (SubLObject)ConsesLow.list(new SubLObject[] { kb_modification_event_filters.$kw36$EVENT_TYPE, kb_modification_event_filters.$kw37$CYCL_FORT_EVENT, kb_modification_event_filters.$kw38$EVENT_REASON, kb_modification_event_filters.$kw39$ITEM_REMOVED, kb_modification_event_filters.$kw40$FORT_MODIFIED, fort, kb_modification_event_filters.$kw45$ASSERTION_SENTENCE, kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event), kb_modification_event_filters.$kw46$ASSERTION_MT, mt });
                }
            }
        }
        else if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw49$KB_MODIFY_REMOVE_NART) && (kb_modification_event_filters.$kw33$ANY_CHANGE == modifier || kb_modification_event_filters.$kw35$FORT_REMOVED == modifier) && kb_modification_event_filters.NIL != nart_handles.nart_p(fort) && narts_high.nart_hl_formula(fort).equalp(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_nart_retrieve_nart_hl_formula(event)))) {
            return (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_filters.$kw36$EVENT_TYPE, (SubLObject)kb_modification_event_filters.$kw37$CYCL_FORT_EVENT, (SubLObject)kb_modification_event_filters.$kw38$EVENT_REASON, (SubLObject)kb_modification_event_filters.$kw39$ITEM_REMOVED, (SubLObject)kb_modification_event_filters.$kw40$FORT_MODIFIED, fort, (SubLObject)kb_modification_event_filters.$kw41$REMOVED_VALUE, fort);
        }
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 13856L)
    public static SubLObject kb_modification_event_test_for_collection_assertions(final SubLObject event, SubLObject collection, SubLObject modifier, SubLObject subsumption_modifier) {
        if (modifier == kb_modification_event_filters.UNPROVIDED) {
            modifier = (SubLObject)kb_modification_event_filters.$kw33$ANY_CHANGE;
        }
        if (subsumption_modifier == kb_modification_event_filters.UNPROVIDED) {
            subsumption_modifier = (SubLObject)kb_modification_event_filters.$kw50$ALL_INSTANTIATIONS;
        }
        if (kb_modification_event_filters.NIL == forts.fort_p(collection)) {
            collection = narts_high.find_nart(collection);
            if (kb_modification_event_filters.NIL == forts.fort_p(collection)) {
                return (SubLObject)kb_modification_event_filters.NIL;
            }
        }
        final SubLObject pcase_var = event_model.event_class(event);
        if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw42$KB_MODIFY_CREATE_ASSERTION)) {
            if (modifier == kb_modification_event_filters.$kw51$INSTANCE_REMOVED) {
                return (SubLObject)kb_modification_event_filters.NIL;
            }
            final SubLObject cnf = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_cnf(event));
            final SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_mt(event));
            final SubLObject positive = clauses.pos_lits(cnf);
            if (kb_modification_event_filters.NIL != list_utilities.singletonP(positive)) {
                final SubLObject clause = positive.first();
                if (kb_modification_event_filters.NIL != kb_modification_event_test_clause_for_collection_assertion(clause, collection, mt, subsumption_modifier)) {
                    final SubLObject v_term = cycl_utilities.formula_arg1(clause, (SubLObject)kb_modification_event_filters.UNPROVIDED);
                    return (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_filters.$kw36$EVENT_TYPE, (SubLObject)kb_modification_event_filters.$kw52$CYCL_COLLECTION_EVENT, (SubLObject)kb_modification_event_filters.$kw38$EVENT_REASON, (SubLObject)kb_modification_event_filters.$kw44$ITEM_ADDED, (SubLObject)kb_modification_event_filters.$kw53$COLLECTION_MODIFIED, collection, (SubLObject)kb_modification_event_filters.$kw54$ADDED_VALUE, v_term);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw47$KB_MODIFY_REMOVE_ASSERTION)) {
            if (modifier == kb_modification_event_filters.$kw55$INSTANCE_ADDED) {
                return (SubLObject)kb_modification_event_filters.NIL;
            }
            if (kb_modification_event_filters.NIL != kb_modification_event.kb_modify_remove_assertion_retrieve_gaf(event)) {
                final SubLObject sentence = encapsulation.unencapsulate_partial(kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event));
                final SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_assertion_retrieve_mt(event));
                if (kb_modification_event_filters.TWO_INTEGER.numE(el_utilities.formula_arity(sentence, (SubLObject)kb_modification_event_filters.UNPROVIDED)) && kb_modification_event_filters.NIL != kb_modification_event_test_clause_for_collection_assertion(sentence, collection, mt, subsumption_modifier)) {
                    final SubLObject v_term2 = cycl_utilities.formula_arg1(sentence, (SubLObject)kb_modification_event_filters.UNPROVIDED);
                    return (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_filters.$kw36$EVENT_TYPE, (SubLObject)kb_modification_event_filters.$kw52$CYCL_COLLECTION_EVENT, (SubLObject)kb_modification_event_filters.$kw38$EVENT_REASON, (SubLObject)kb_modification_event_filters.$kw39$ITEM_REMOVED, (SubLObject)kb_modification_event_filters.$kw53$COLLECTION_MODIFIED, collection, (SubLObject)kb_modification_event_filters.$kw41$REMOVED_VALUE, v_term2);
                }
            }
        }
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 16077L)
    public static SubLObject kb_modification_event_test_clause_for_collection_assertion(final SubLObject clause, final SubLObject collection, final SubLObject mt, final SubLObject subsumption_modifier) {
        if (kb_modification_event_filters.NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(clause), kb_modification_event_filters.$const56$isa, mt, (SubLObject)kb_modification_event_filters.UNPROVIDED)) {
            final SubLObject mentioned_collection = cycl_utilities.formula_arg2(clause, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            if (collection.eql(mentioned_collection)) {
                return (SubLObject)kb_modification_event_filters.T;
            }
            if (kb_modification_event_filters.$kw57$IMMEDIATE_INSTANTIATIONS != subsumption_modifier) {
                return genls.genlsP(cycl_utilities.formula_arg2(clause, (SubLObject)kb_modification_event_filters.UNPROVIDED), collection, mt, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            }
        }
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 16518L)
    public static SubLObject kb_modification_event_test_for_microtheory(final SubLObject event, final SubLObject the_test_mt, SubLObject modifier) {
        if (modifier == kb_modification_event_filters.UNPROVIDED) {
            modifier = (SubLObject)kb_modification_event_filters.$kw58$LOCAL_CHANGE;
        }
        final SubLObject test_mt = hlmt_czer.coerce_to_hlmt(the_test_mt);
        SubLObject assertion_mt = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject reason = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject sentence = (SubLObject)kb_modification_event_filters.NIL;
        final SubLObject pcase_var = event_model.event_class(event);
        if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw42$KB_MODIFY_CREATE_ASSERTION)) {
            assertion_mt = hlmt_czer.coerce_to_hlmt(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_mt(event)));
            sentence = clauses.cnf_formula(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_cnf(event)), (SubLObject)kb_modification_event_filters.UNPROVIDED);
            reason = (SubLObject)kb_modification_event_filters.$kw59$ASSERTION_ADDED;
        }
        else if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw47$KB_MODIFY_REMOVE_ASSERTION)) {
            assertion_mt = hlmt_czer.coerce_to_hlmt(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_assertion_retrieve_mt(event)));
            sentence = kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event);
            reason = (SubLObject)kb_modification_event_filters.$kw60$ASSERTION_REMOVED;
        }
        else {
            assertion_mt = (SubLObject)kb_modification_event_filters.NIL;
        }
        if (kb_modification_event_filters.NIL != hlmt.hlmtP(assertion_mt)) {
            SubLObject matchesP = (SubLObject)kb_modification_event_filters.NIL;
            final SubLObject pcase_var2 = modifier;
            if (pcase_var2.eql((SubLObject)kb_modification_event_filters.$kw58$LOCAL_CHANGE)) {
                matchesP = hlmt.hlmt_equalP(test_mt, assertion_mt);
            }
            else if (pcase_var2.eql((SubLObject)kb_modification_event_filters.$kw61$UPWARD_CLOSURE)) {
                matchesP = genl_mts.genl_mtP(test_mt, assertion_mt, test_mt, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            }
            else if (pcase_var2.eql((SubLObject)kb_modification_event_filters.$kw62$DOWNWARD_CLOSURE)) {
                matchesP = genl_mts.genl_mtP(assertion_mt, test_mt, assertion_mt, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            }
            if (kb_modification_event_filters.NIL != matchesP) {
                return (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_filters.$kw36$EVENT_TYPE, (SubLObject)kb_modification_event_filters.$kw63$CYCL_MICROTHEORY_EVENT, (SubLObject)kb_modification_event_filters.$kw38$EVENT_REASON, reason, (SubLObject)kb_modification_event_filters.$kw64$MICROTHEORY_MODIFIED, assertion_mt, (SubLObject)kb_modification_event_filters.$kw45$ASSERTION_SENTENCE, sentence);
            }
        }
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 18195L)
    public static SubLObject event_filter_description_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_event_filter_description(v_object, stream, (SubLObject)kb_modification_event_filters.ZERO_INTEGER);
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 18195L)
    public static SubLObject event_filter_description_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $event_filter_description_native.class) ? kb_modification_event_filters.T : kb_modification_event_filters.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 18195L)
    public static SubLObject event_filter_description_id(final SubLObject v_object) {
        assert kb_modification_event_filters.NIL != event_filter_description_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 18195L)
    public static SubLObject event_filter_description_pattern(final SubLObject v_object) {
        assert kb_modification_event_filters.NIL != event_filter_description_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 18195L)
    public static SubLObject _csetf_event_filter_description_id(final SubLObject v_object, final SubLObject value) {
        assert kb_modification_event_filters.NIL != event_filter_description_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 18195L)
    public static SubLObject _csetf_event_filter_description_pattern(final SubLObject v_object, final SubLObject value) {
        assert kb_modification_event_filters.NIL != event_filter_description_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 18195L)
    public static SubLObject make_event_filter_description(SubLObject arglist) {
        if (arglist == kb_modification_event_filters.UNPROVIDED) {
            arglist = (SubLObject)kb_modification_event_filters.NIL;
        }
        final SubLObject v_new = (SubLObject)new $event_filter_description_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)kb_modification_event_filters.NIL, next = arglist; kb_modification_event_filters.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw78$ID)) {
                _csetf_event_filter_description_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw79$PATTERN)) {
                _csetf_event_filter_description_pattern(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)kb_modification_event_filters.$str80$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 18195L)
    public static SubLObject visit_defstruct_event_filter_description(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_modification_event_filters.$kw81$BEGIN, (SubLObject)kb_modification_event_filters.$sym82$MAKE_EVENT_FILTER_DESCRIPTION, (SubLObject)kb_modification_event_filters.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_modification_event_filters.$kw83$SLOT, (SubLObject)kb_modification_event_filters.$kw78$ID, event_filter_description_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_modification_event_filters.$kw83$SLOT, (SubLObject)kb_modification_event_filters.$kw79$PATTERN, event_filter_description_pattern(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_modification_event_filters.$kw84$END, (SubLObject)kb_modification_event_filters.$sym82$MAKE_EVENT_FILTER_DESCRIPTION, (SubLObject)kb_modification_event_filters.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 18195L)
    public static SubLObject visit_defstruct_object_event_filter_description_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_event_filter_description(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 18701L)
    public static SubLObject print_event_filter_description(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_modification_event_filters.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)kb_modification_event_filters.T, (SubLObject)kb_modification_event_filters.T);
            streams_high.write_string((SubLObject)kb_modification_event_filters.$str86$_id__, stream, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            print_high.prin1(event_filter_description_id(v_object), stream);
            streams_high.write_string((SubLObject)kb_modification_event_filters.$str87$_pattern__, stream, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            print_high.prin1(event_filter_description_pattern(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)kb_modification_event_filters.T, (SubLObject)kb_modification_event_filters.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 19059L)
    public static SubLObject new_event_filter_description(final SubLObject id, final SubLObject pattern) {
        final SubLObject efdesc = make_event_filter_description((SubLObject)kb_modification_event_filters.UNPROVIDED);
        _csetf_event_filter_description_id(efdesc, id);
        _csetf_event_filter_description_pattern(efdesc, pattern);
        return efdesc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 19302L)
    public static SubLObject valid_event_filter_description_p(final SubLObject entitiy) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_modification_event_filters.NIL != event_filter_description_p(entitiy) && event_filter_description_id(entitiy).isPositive());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 19474L)
    public static SubLObject clear_event_filter_description(final SubLObject efdesc) {
        _csetf_event_filter_description_pattern(efdesc, (SubLObject)kb_modification_event_filters.NIL);
        _csetf_event_filter_description_id(efdesc, (SubLObject)kb_modification_event_filters.MINUS_ONE_INTEGER);
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 19913L)
    public static SubLObject display_current_kb_modification_event_filter_registration(SubLObject stream) {
        if (stream == kb_modification_event_filters.UNPROVIDED) {
            stream = (SubLObject)kb_modification_event_filters.T;
        }
        streams_high.terpri(stream);
        print_high.princ((SubLObject)kb_modification_event_filters.$str92$Current_KB_Modification_Event_Fil, stream);
        streams_high.terpri(stream);
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$event_filter_registration_lock$.getGlobalValue());
            dictionary_utilities.print_dictionary_contents(kb_modification_event_filters.$event_filter_registration$.getGlobalValue(), stream);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$event_filter_registration_lock$.getGlobalValue());
            }
        }
        return (SubLObject)kb_modification_event_filters.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 20248L)
    public static SubLObject reset_kb_modification_event_filter_registration() {
        kb_modification_event_filters.$event_filter_registration$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_modification_event_filters.EQUALP), (SubLObject)kb_modification_event_filters.UNPROVIDED));
        return (SubLObject)kb_modification_event_filters.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 20390L)
    public static SubLObject kb_modification_event_filter_id_to_filter_description(final SubLObject id) {
        SubLObject efdesc = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$event_filter_registration_lock$.getGlobalValue());
            efdesc = dictionary.dictionary_lookup(kb_modification_event_filters.$event_filter_registration$.getGlobalValue(), id, (SubLObject)kb_modification_event_filters.UNPROVIDED);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$event_filter_registration_lock$.getGlobalValue());
            }
        }
        return efdesc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 20630L)
    public static SubLObject valid_kb_modification_event_filter_id_p(final SubLObject id) {
        return (SubLObject)SubLObjectFactory.makeBoolean(id.isFixnum() && id.isPositive() && kb_modification_event_filters.NIL != event_filter_description_p(kb_modification_event_filter_id_to_filter_description(id)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 20865L)
    public static SubLObject kb_modification_event_filter_pattern_to_id(final SubLObject pattern) {
        SubLObject id = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$event_filter_registration_lock$.getGlobalValue());
            id = dictionary.dictionary_lookup(kb_modification_event_filters.$event_filter_registration$.getGlobalValue(), pattern, (SubLObject)kb_modification_event_filters.MINUS_ONE_INTEGER);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$event_filter_registration_lock$.getGlobalValue());
            }
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 21095L)
    public static SubLObject create_kb_modification_event_filter(final SubLObject pattern) {
        SubLObject id = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$event_filter_registration_lock$.getGlobalValue());
            id = kb_modification_event_filter_pattern_to_id(pattern);
            if (id.isNegative()) {
                id = integer_sequence_generator.integer_sequence_generator_next(kb_modification_event_filters.$event_filter_pattern_id$.getGlobalValue());
                dictionary.dictionary_enter(kb_modification_event_filters.$event_filter_registration$.getGlobalValue(), pattern, id);
                dictionary.dictionary_enter(kb_modification_event_filters.$event_filter_registration$.getGlobalValue(), id, new_event_filter_description(id, pattern));
            }
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$event_filter_registration_lock$.getGlobalValue());
            }
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 21584L)
    public static SubLObject delete_kb_modification_event_filter(final SubLObject filter_id) {
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$event_filter_registration_lock$.getGlobalValue());
            final SubLObject efdesc = dictionary.dictionary_lookup(kb_modification_event_filters.$event_filter_registration$.getGlobalValue(), filter_id, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            dictionary.dictionary_remove(kb_modification_event_filters.$event_filter_registration$.getGlobalValue(), event_filter_description_pattern(efdesc));
            dictionary.dictionary_remove(kb_modification_event_filters.$event_filter_registration$.getGlobalValue(), filter_id);
            clear_event_filter_description(efdesc);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$event_filter_registration_lock$.getGlobalValue());
            }
        }
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 22003L)
    public static SubLObject get_all_kb_modification_event_filter_ids() {
        SubLObject filter_ids = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$event_filter_registration_lock$.getGlobalValue());
            filter_ids = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym95$FIXNUMP), dictionary.dictionary_keys(kb_modification_event_filters.$event_filter_registration$.getGlobalValue()), (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$event_filter_registration_lock$.getGlobalValue());
            }
        }
        return filter_ids;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 22623L)
    public static SubLObject display_current_kb_modification_event_to_filter_mapping(SubLObject stream) {
        if (stream == kb_modification_event_filters.UNPROVIDED) {
            stream = (SubLObject)kb_modification_event_filters.T;
        }
        streams_high.terpri(stream);
        print_high.princ((SubLObject)kb_modification_event_filters.$str100$Current_KB_Modification_Event_To_, stream);
        streams_high.terpri(stream);
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            dictionary_utilities.print_dictionary_contents(kb_modification_event_filters.$kb_modification_event_to_filter_mapping$.getGlobalValue(), (SubLObject)kb_modification_event_filters.UNPROVIDED);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        print_high.princ((SubLObject)kb_modification_event_filters.$str101$Current_KB_Modification_Event_Int, stream);
        streams_high.terpri(stream);
        release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            dictionary_utilities.print_dictionary_contents(kb_modification_event_filters.$kb_modification_event_internal_listener_table$.getGlobalValue(), (SubLObject)kb_modification_event_filters.UNPROVIDED);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        return (SubLObject)kb_modification_event_filters.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 23214L)
    public static SubLObject note_interest_in_kb_modification_event_filter(final SubLObject filter) {
        assert kb_modification_event_filters.NIL != event_filter_description_p(filter) : filter;
        final SubLObject filter_pattern = event_filter_description_pattern(filter);
        final SubLObject events = compute_implied_kb_modification_events_from_filter_expression(filter_pattern);
        SubLObject registration_needed = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            dictionary.dictionary_enter(kb_modification_event_filters.$kb_modification_event_to_filter_mapping$.getGlobalValue(), event_filter_description_id(filter), events);
            SubLObject cdolist_list_var = events;
            SubLObject event = (SubLObject)kb_modification_event_filters.NIL;
            event = cdolist_list_var.first();
            while (kb_modification_event_filters.NIL != cdolist_list_var) {
                if (kb_modification_event_filters.$kw102$NOT_FOUND == dictionary.dictionary_lookup(kb_modification_event_filters.$kb_modification_event_to_filter_mapping$.getGlobalValue(), event, (SubLObject)kb_modification_event_filters.$kw102$NOT_FOUND)) {
                    registration_needed = (SubLObject)ConsesLow.cons(event, registration_needed);
                }
                dictionary_utilities.dictionary_push(kb_modification_event_filters.$kb_modification_event_to_filter_mapping$.getGlobalValue(), event, filter);
                cdolist_list_var = cdolist_list_var.rest();
                event = cdolist_list_var.first();
            }
            cdolist_list_var = registration_needed;
            SubLObject missing_event = (SubLObject)kb_modification_event_filters.NIL;
            missing_event = cdolist_list_var.first();
            while (kb_modification_event_filters.NIL != cdolist_list_var) {
                final SubLObject listener = event_broker.describe_funcall_listener(missing_event, (SubLObject)kb_modification_event_filters.$sym103$KB_MODIFICATION_EVENT_FILTER_GENERIC_EVENT_HANDLER, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED);
                kb_modification_event.register_listener_with_kb_modifications_event_dispatcher(listener);
                dictionary.dictionary_enter(kb_modification_event_filters.$kb_modification_event_internal_listener_table$.getGlobalValue(), missing_event, listener);
                cdolist_list_var = cdolist_list_var.rest();
                missing_event = cdolist_list_var.first();
            }
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        if (kb_modification_event_filters.NIL != registration_needed) {
            kb_modification_event.ensure_kb_modifications_event_dispatcher_running();
        }
        return registration_needed;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 24683L)
    public static SubLObject note_lack_of_interest_in_kb_modification_filter(final SubLObject filter) {
        assert kb_modification_event_filters.NIL != event_filter_description_p(filter) : filter;
        SubLObject deregistration_needed = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            final SubLObject events = dictionary.dictionary_lookup(kb_modification_event_filters.$kb_modification_event_to_filter_mapping$.getGlobalValue(), event_filter_description_id(filter), (SubLObject)kb_modification_event_filters.UNPROVIDED);
            dictionary.dictionary_remove(kb_modification_event_filters.$kb_modification_event_to_filter_mapping$.getGlobalValue(), event_filter_description_id(filter));
            SubLObject cdolist_list_var = events;
            SubLObject event = (SubLObject)kb_modification_event_filters.NIL;
            event = cdolist_list_var.first();
            while (kb_modification_event_filters.NIL != cdolist_list_var) {
                dictionary_utilities.dictionary_delete_from_value(kb_modification_event_filters.$kb_modification_event_to_filter_mapping$.getGlobalValue(), event, filter, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED);
                if (kb_modification_event_filters.NIL == dictionary.dictionary_lookup(kb_modification_event_filters.$kb_modification_event_to_filter_mapping$.getGlobalValue(), event, (SubLObject)kb_modification_event_filters.UNPROVIDED)) {
                    deregistration_needed = (SubLObject)ConsesLow.cons(event, deregistration_needed);
                }
                cdolist_list_var = cdolist_list_var.rest();
                event = cdolist_list_var.first();
            }
            cdolist_list_var = deregistration_needed;
            SubLObject extraneous_event = (SubLObject)kb_modification_event_filters.NIL;
            extraneous_event = cdolist_list_var.first();
            while (kb_modification_event_filters.NIL != cdolist_list_var) {
                final SubLObject listener = dictionary.dictionary_lookup(kb_modification_event_filters.$kb_modification_event_internal_listener_table$.getGlobalValue(), extraneous_event, (SubLObject)kb_modification_event_filters.$kw102$NOT_FOUND);
                dictionary.dictionary_remove(kb_modification_event_filters.$kb_modification_event_internal_listener_table$.getGlobalValue(), extraneous_event);
                if (kb_modification_event_filters.$kw102$NOT_FOUND != listener) {
                    kb_modification_event.deregister_listener_with_kb_modifications_event_dispatcher(listener);
                }
                cdolist_list_var = cdolist_list_var.rest();
                extraneous_event = cdolist_list_var.first();
            }
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        return deregistration_needed;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 26111L)
    public static SubLObject get_kb_modification_event_filters_from_mapping(final SubLObject event_class) {
        SubLObject filters = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            filters = dictionary.dictionary_lookup(kb_modification_event_filters.$kb_modification_event_to_filter_mapping$.getGlobalValue(), event_class, (SubLObject)kb_modification_event_filters.UNPROVIDED);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        return filters;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 26419L)
    public static SubLObject post_kb_modification_event_filter_fired(final SubLObject listener, final SubLObject filter, final SubLObject event, final SubLObject information_bundle, final SubLObject supports) {
        final SubLObject message = (SubLObject)ConsesLow.list(new SubLObject[] { kb_modification_event_filters.$kw104$LISTENER, listener, kb_modification_event_filters.$kw105$FILTERS, ConsesLow.list(filter), kb_modification_event_filters.$kw106$FIRED, event_model.event_timestamp(event), kb_modification_event_filters.$kw107$DETAILS, information_bundle, kb_modification_event_filters.$kw108$TRIGGER, event_model.event_class(event), kb_modification_event_filters.$kw109$SUPPORTS, supports });
        final SubLObject filter_event = event_model.new_event((SubLObject)kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED, message, event_model.event_source(event));
        return event_broker.post_event(filter_event, current_external_kb_modification_event_filter_broker());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 27018L)
    public static SubLObject kb_modification_filter_fired_retrieve_trigger(final SubLObject event) {
        assert kb_modification_event_filters.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED && kb_modification_event_filters.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)kb_modification_event_filters.$str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)kb_modification_event_filters.$kw108$TRIGGER, (SubLObject)kb_modification_event_filters.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 27018L)
    public static SubLObject kb_modification_filter_fired_retrieve_supports(final SubLObject event) {
        assert kb_modification_event_filters.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED && kb_modification_event_filters.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)kb_modification_event_filters.$str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)kb_modification_event_filters.$kw109$SUPPORTS, (SubLObject)kb_modification_event_filters.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 27018L)
    public static SubLObject kb_modification_filter_fired_retrieve_details(final SubLObject event) {
        assert kb_modification_event_filters.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED && kb_modification_event_filters.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)kb_modification_event_filters.$str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)kb_modification_event_filters.$kw107$DETAILS, (SubLObject)kb_modification_event_filters.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 27018L)
    public static SubLObject kb_modification_filter_fired_retrieve_fired(final SubLObject event) {
        assert kb_modification_event_filters.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED && kb_modification_event_filters.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)kb_modification_event_filters.$str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)kb_modification_event_filters.$kw106$FIRED, (SubLObject)kb_modification_event_filters.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 27018L)
    public static SubLObject kb_modification_filter_fired_retrieve_filters(final SubLObject event) {
        assert kb_modification_event_filters.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED && kb_modification_event_filters.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)kb_modification_event_filters.$str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)kb_modification_event_filters.$kw105$FILTERS, (SubLObject)kb_modification_event_filters.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 27018L)
    public static SubLObject kb_modification_filter_fired_retrieve_listener(final SubLObject event) {
        assert kb_modification_event_filters.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED && kb_modification_event_filters.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)kb_modification_event_filters.$str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)kb_modification_event_filters.$kw104$LISTENER, (SubLObject)kb_modification_event_filters.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 27179L)
    public static SubLObject kb_modification_event_filter_generic_event_handler(final SubLObject event, final SubLObject params) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_modification_event_filters.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            SubLObject cdolist_list_var = get_kb_modification_event_filters_from_mapping(event_model.event_class(event));
            SubLObject filter = (SubLObject)kb_modification_event_filters.NIL;
            filter = cdolist_list_var.first();
            while (kb_modification_event_filters.NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject information_bundle = apply_filter_to_kb_modification_event(event, event_filter_description_pattern(filter));
                final SubLObject supports = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (kb_modification_event_filters.NIL != information_bundle) {
                    final SubLObject id = event_filter_description_id(filter);
                    SubLObject cdolist_list_var_$3;
                    final SubLObject listeners = cdolist_list_var_$3 = get_all_external_kb_modification_event_filter_listeners_for_filter(id);
                    SubLObject listener = (SubLObject)kb_modification_event_filters.NIL;
                    listener = cdolist_list_var_$3.first();
                    while (kb_modification_event_filters.NIL != cdolist_list_var_$3) {
                        post_kb_modification_event_filter_fired(listener, filter, event, information_bundle, supports);
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        listener = cdolist_list_var_$3.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                filter = cdolist_list_var.first();
            }
        }
        return event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 28293L)
    public static SubLObject transmit_kb_modification_event_to_listener(final SubLObject listener, final SubLObject message, final SubLObject timeout) {
        final SubLObject method_function = Structures.method_func(listener, kb_modification_event_filters.$transmit_kb_modification_event_to_listener_method_table$.getGlobalValue());
        if (kb_modification_event_filters.NIL != method_function) {
            return Functions.funcall(method_function, listener, message, timeout);
        }
        return Errors.error((SubLObject)kb_modification_event_filters.$str114$Not_implemented_for_type__A, (SubLObject)Types.type_of(listener));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 28476L)
    public static SubLObject current_external_kb_modification_event_filter_broker() {
        return kb_modification_event.current_kb_modification_event_broker();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 29045L)
    public static SubLObject event_parameter_name_from_keyword(final SubLObject keyword) {
        final SubLObject adjusted_pieces = string_utilities.split_string(Strings.string_downcase(Symbols.symbol_name(keyword), (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED), (SubLObject)kb_modification_event_filters.$list118);
        if (kb_modification_event_filters.NIL != list_utilities.singletonP(adjusted_pieces)) {
            return adjusted_pieces.first();
        }
        SubLObject list_var = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject piece = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject counter = (SubLObject)kb_modification_event_filters.NIL;
        list_var = adjusted_pieces;
        piece = list_var.first();
        for (counter = (SubLObject)kb_modification_event_filters.ZERO_INTEGER; kb_modification_event_filters.NIL != list_var; list_var = list_var.rest(), piece = list_var.first(), counter = Numbers.add((SubLObject)kb_modification_event_filters.ONE_INTEGER, counter)) {
            if (!counter.isZero()) {
                Strings.set_char(piece, (SubLObject)kb_modification_event_filters.ZERO_INTEGER, Characters.char_upcase(Strings.sublisp_char(piece, (SubLObject)kb_modification_event_filters.ZERO_INTEGER)));
            }
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym119$CCONCATENATE), adjusted_pieces);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 29468L)
    public static SubLObject generate_xml_for_kb_modification_filter_fired_message(final SubLObject filters, final SubLObject event, final SubLObject stream, SubLObject verbose) {
        if (verbose == kb_modification_event_filters.UNPROVIDED) {
            verbose = (SubLObject)kb_modification_event_filters.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            final SubLObject details = kb_modification_filter_fired_retrieve_details(event);
            xml_utilities.generate_valid_xml_header(stream);
            xml_utilities.generate_xml_header_entry_for_dtd((SubLObject)kb_modification_event_filters.$str120$eventNotifications, (SubLObject)kb_modification_event_filters.$str121$http___www_opencyc_org_xml_eventN, stream);
            try {
                final SubLObject _prev_bind_0_$4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)kb_modification_event_filters.$str120$eventNotifications, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$5 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$6 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)kb_modification_event_filters.$str123$eventNotification, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED, thread);
                                    try {
                                        final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)kb_modification_event_filters.$str124$kbModificationFilteredEvent, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED, thread);
                                                try {
                                                    final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal((SubLObject)kb_modification_event_filters.$str125$filterList, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind((SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED, thread);
                                                            SubLObject cdolist_list_var = filters;
                                                            SubLObject filter = (SubLObject)kb_modification_event_filters.NIL;
                                                            filter = cdolist_list_var.first();
                                                            while (kb_modification_event_filters.NIL != cdolist_list_var) {
                                                                try {
                                                                    final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$10 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal((SubLObject)kb_modification_event_filters.$str126$filterId, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED);
                                                                        final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                        try {
                                                                            xml_vars.$xml_default_namespace$.bind((SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED, thread);
                                                                            print_high.princ(event_filter_description_id(filter), stream);
                                                                        }
                                                                        finally {
                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$10, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$12, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_modification_event_filters.T, thread);
                                                                        final SubLObject _values = Values.getValuesAsVector();
                                                                        xml_utilities.xml_terpri();
                                                                        xml_utilities.xml_end_tag_internal((SubLObject)kb_modification_event_filters.$str126$filterId);
                                                                        Values.restoreValuesFromVector(_values);
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                                                    }
                                                                }
                                                                cdolist_list_var = cdolist_list_var.rest();
                                                                filter = cdolist_list_var.first();
                                                            }
                                                        }
                                                        finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$11, thread);
                                                        }
                                                    }
                                                    finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$9, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$10, thread);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_modification_event_filters.T, thread);
                                                        final SubLObject _values2 = Values.getValuesAsVector();
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal((SubLObject)kb_modification_event_filters.$str125$filterList);
                                                        Values.restoreValuesFromVector(_values2);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                                                    }
                                                }
                                                final SubLObject attributes = (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_filters.$str127$timestamp, event_model.event_timestamp(event));
                                                if (details.first().isSymbol()) {
                                                    generate_xml_for_details_of_kb_modification_filter_fired_message(attributes, details);
                                                }
                                                else {
                                                    try {
                                                        final SubLObject _prev_bind_0_$16 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$11 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal((SubLObject)kb_modification_event_filters.$str128$kbEvents, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$17 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind((SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED, thread);
                                                                SubLObject cdolist_list_var2 = details;
                                                                SubLObject detail = (SubLObject)kb_modification_event_filters.NIL;
                                                                detail = cdolist_list_var2.first();
                                                                while (kb_modification_event_filters.NIL != cdolist_list_var2) {
                                                                    generate_xml_for_details_of_kb_modification_filter_fired_message(attributes, detail);
                                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                                    detail = cdolist_list_var2.first();
                                                                }
                                                            }
                                                            finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$17, thread);
                                                            }
                                                        }
                                                        finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$11, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$16, thread);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_modification_event_filters.T, thread);
                                                            final SubLObject _values3 = Values.getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal((SubLObject)kb_modification_event_filters.$str128$kbEvents);
                                                            Values.restoreValuesFromVector(_values3);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_modification_event_filters.T, thread);
                                            final SubLObject _values4 = Values.getValuesAsVector();
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal((SubLObject)kb_modification_event_filters.$str124$kbModificationFilteredEvent);
                                            Values.restoreValuesFromVector(_values4);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                        }
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$7, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_modification_event_filters.T, thread);
                                final SubLObject _values5 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)kb_modification_event_filters.$str123$eventNotification);
                                Values.restoreValuesFromVector(_values5);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$5, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$4, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_modification_event_filters.T, thread);
                    final SubLObject _values6 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)kb_modification_event_filters.$str120$eventNotifications);
                    Values.restoreValuesFromVector(_values6);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 30902L)
    public static SubLObject generate_xml_for_details_of_kb_modification_filter_fired_message(final SubLObject attributes, final SubLObject details) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)kb_modification_event_filters.$str129$kbEvent, attributes, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED);
                final SubLObject _prev_bind_0_$27 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED, thread);
                    SubLObject remainder;
                    SubLObject keyword;
                    SubLObject value;
                    SubLObject tag_name;
                    SubLObject _prev_bind_0_$28;
                    SubLObject _prev_bind_1_$29;
                    SubLObject _prev_bind_0_$29;
                    SubLObject value_tag_name;
                    SubLObject _prev_bind_0_$30;
                    SubLObject _prev_bind_1_$30;
                    SubLObject _prev_bind_0_$31;
                    SubLObject _prev_bind_0_$32;
                    SubLObject _values;
                    for (remainder = (SubLObject)kb_modification_event_filters.NIL, remainder = details; kb_modification_event_filters.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                        keyword = remainder.first();
                        value = conses_high.cadr(remainder);
                        tag_name = event_parameter_name_from_keyword(keyword);
                        try {
                            _prev_bind_0_$28 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            _prev_bind_1_$29 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal(tag_name, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED);
                                _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED, thread);
                                    if (value.isKeyword()) {
                                        value_tag_name = event_parameter_name_from_keyword(value);
                                        _prev_bind_0_$30 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        _prev_bind_1_$30 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal(value_tag_name, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.T, (SubLObject)kb_modification_event_filters.NIL, (SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED);
                                            _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)kb_modification_event_filters.$kw122$UNINITIALIZED, thread);
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$31, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$30, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$30, thread);
                                        }
                                    }
                                    else {
                                        generate_xml_for_kb_modification_filter_fired_detail(value);
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$29, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$29, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$28, thread);
                            }
                        }
                        finally {
                            _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_modification_event_filters.T, thread);
                                _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal(tag_name);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                            }
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$27, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_modification_event_filters.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)kb_modification_event_filters.$str129$kbEvent);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)kb_modification_event_filters.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 31456L)
    public static SubLObject generate_xml_for_kb_modification_filter_fired_detail(final SubLObject value) {
        if (kb_modification_event_filters.NIL != list_utilities.tree_find((SubLObject)kb_modification_event_filters.$kw130$HP, value, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED)) {
            cycml.cycml_serialize_encapsulated_el_formula(value);
        }
        else {
            cycml.cycml_serialize_term(value);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 31790L)
    public static SubLObject handle_kb_modification_filter_fired(final SubLObject event, final SubLObject params) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_modification_event_filters.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            final SubLObject listener = kb_modification_filter_fired_retrieve_listener(event);
            final SubLObject filters = kb_modification_filter_fired_retrieve_filters(event);
            SubLObject result = (SubLObject)kb_modification_event_filters.NIL;
            SubLObject xml_message = (SubLObject)kb_modification_event_filters.NIL;
            SubLObject string_stream = (SubLObject)kb_modification_event_filters.NIL;
            try {
                string_stream = streams_high.make_private_string_output_stream();
                generate_xml_for_kb_modification_filter_fired_message(filters, event, string_stream, (SubLObject)kb_modification_event_filters.UNPROVIDED);
                xml_message = streams_high.get_output_stream_string(string_stream);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_modification_event_filters.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(string_stream, (SubLObject)kb_modification_event_filters.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)kb_modification_event_filters.$sym131$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        transmit_kb_modification_event_to_listener(listener, xml_message, kb_modification_event_filters.$kb_modification_external_filter_delivery_timeout$.getGlobalValue());
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)kb_modification_event_filters.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                result = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (kb_modification_event_filters.NIL != result) {
                Errors.warn((SubLObject)kb_modification_event_filters.$str132$KB_Modification_Filter_Fired__cou, new SubLObject[] { event, listener, result, listener });
                delete_external_kb_modification_event_filter_listener(external_kb_modification_event_filter_listener_to_id(listener));
            }
        }
        return event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 33343L)
    public static SubLObject display_current_external_kb_modification_event_filter_listener_registration(SubLObject stream) {
        if (stream == kb_modification_event_filters.UNPROVIDED) {
            stream = (SubLObject)kb_modification_event_filters.T;
        }
        streams_high.terpri(stream);
        print_high.princ((SubLObject)kb_modification_event_filters.$str137$Current_External_KB_Modification_, (SubLObject)kb_modification_event_filters.UNPROVIDED);
        streams_high.terpri(stream);
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$event_filter_listener_registration_lock$.getGlobalValue());
            dictionary_utilities.print_dictionary_contents(kb_modification_event_filters.$event_filter_listener_registration$.getGlobalValue(), stream);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return (SubLObject)kb_modification_event_filters.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 33725L)
    public static SubLObject reset_external_kb_modification_event_filter_listener_registration() {
        kb_modification_event_filters.$event_filter_listener_registration$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_modification_event_filters.EQUALP), (SubLObject)kb_modification_event_filters.UNPROVIDED));
        return (SubLObject)kb_modification_event_filters.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 34123L)
    public static SubLObject compute_key_from_external_event_filter_listener(final SubLObject listener) {
        final SubLObject method_function = Structures.method_func(listener, kb_modification_event_filters.$compute_key_from_external_event_filter_listener_method_table$.getGlobalValue());
        if (kb_modification_event_filters.NIL != method_function) {
            return Functions.funcall(method_function, listener);
        }
        return listener;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 34375L)
    public static SubLObject external_event_filter_listener_p(final SubLObject listener) {
        final SubLObject method_function = Structures.method_func(listener, kb_modification_event_filters.$external_event_filter_listener_p_method_table$.getGlobalValue());
        if (kb_modification_event_filters.NIL != method_function) {
            return Functions.funcall(method_function, listener);
        }
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 34556L)
    public static SubLObject is_external_event_filter_listener_validP(final SubLObject listener) {
        final SubLObject method_function = Structures.method_func(listener, kb_modification_event_filters.$is_external_event_filter_listener_validP_method_table$.getGlobalValue());
        if (kb_modification_event_filters.NIL != method_function) {
            return Functions.funcall(method_function, listener);
        }
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 34875L)
    public static SubLObject invalidate_external_event_filter_listener(final SubLObject listener) {
        final SubLObject method_function = Structures.method_func(listener, kb_modification_event_filters.$invalidate_external_event_filter_listener_method_table$.getGlobalValue());
        if (kb_modification_event_filters.NIL != method_function) {
            return Functions.funcall(method_function, listener);
        }
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 35123L)
    public static SubLObject valid_external_event_filter_listener_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_modification_event_filters.NIL != external_event_filter_listener_p(v_object) && kb_modification_event_filters.NIL != is_external_event_filter_listener_validP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 35311L)
    public static SubLObject valid_external_kb_modification_event_filter_listener_id_p(final SubLObject id) {
        return (SubLObject)SubLObjectFactory.makeBoolean(id.isFixnum() && id.isPositive() && kb_modification_event_filters.NIL != external_event_filter_listener_p(external_kb_modification_event_filter_listener_id_to_listener(id)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 35573L)
    public static SubLObject new_external_kb_modification_event_filter_listener(final SubLObject listener) {
        SubLObject id = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$event_filter_listener_registration_lock$.getGlobalValue());
            final SubLObject key = compute_key_from_external_event_filter_listener(listener);
            id = dictionary.dictionary_lookup(kb_modification_event_filters.$event_filter_listener_registration$.getGlobalValue(), key, (SubLObject)kb_modification_event_filters.MINUS_ONE_INTEGER);
            if (!id.isNegative()) {
                delete_external_kb_modification_event_filter_listener(id);
            }
            id = integer_sequence_generator.integer_sequence_generator_next(kb_modification_event_filters.$event_filter_listener_id$.getGlobalValue());
            dictionary.dictionary_enter(kb_modification_event_filters.$event_filter_listener_registration$.getGlobalValue(), key, id);
            dictionary.dictionary_enter(kb_modification_event_filters.$event_filter_listener_registration$.getGlobalValue(), id, listener);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 36339L)
    public static SubLObject delete_external_kb_modification_event_filter_listener(final SubLObject listener_id) {
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$event_filter_listener_registration_lock$.getGlobalValue());
            SubLObject listener = dictionary.dictionary_lookup(kb_modification_event_filters.$event_filter_listener_registration$.getGlobalValue(), listener_id, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            if (kb_modification_event_filters.NIL != external_event_filter_listener_p(listener)) {
                remove_listener_from_all_external_kb_modification_event_filters_internal(listener);
                final SubLObject key = compute_key_from_external_event_filter_listener(listener);
                dictionary.dictionary_remove(kb_modification_event_filters.$event_filter_listener_registration$.getGlobalValue(), listener_id);
                dictionary.dictionary_remove(kb_modification_event_filters.$event_filter_listener_registration$.getGlobalValue(), key);
                listener = invalidate_external_event_filter_listener(listener);
            }
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 37059L)
    public static SubLObject get_all_external_kb_modification_event_filter_listener_ids() {
        SubLObject listeners = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$event_filter_listener_registration_lock$.getGlobalValue());
            listeners = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym95$FIXNUMP), dictionary.dictionary_keys(kb_modification_event_filters.$event_filter_listener_registration$.getGlobalValue()), (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return listeners;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 37350L)
    public static SubLObject external_kb_modification_event_filter_listener_id_to_listener(final SubLObject id) {
        SubLObject description = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$event_filter_listener_registration_lock$.getGlobalValue());
            description = dictionary.dictionary_lookup(kb_modification_event_filters.$event_filter_listener_registration$.getGlobalValue(), id, (SubLObject)kb_modification_event_filters.UNPROVIDED);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return description;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 37631L)
    public static SubLObject external_kb_modification_event_filter_listener_to_id(final SubLObject listener) {
        SubLObject id = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$event_filter_listener_registration_lock$.getGlobalValue());
            id = dictionary.dictionary_lookup(kb_modification_event_filters.$event_filter_listener_registration$.getGlobalValue(), compute_key_from_external_event_filter_listener(listener), (SubLObject)kb_modification_event_filters.UNPROVIDED);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 37973L)
    public static SubLObject transmit_kb_modification_event_to_listener_socket_info_method(final SubLObject listener, final SubLObject message, final SubLObject timeout) {
        return transmit_kb_modification_event_to_socket_info_listener(listener, message, timeout);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 38318L)
    public static SubLObject compute_key_from_external_event_filter_listener_socket_info_method(final SubLObject listener) {
        return compute_key_from_external_event_filter_socket_info_listener(listener);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 38487L)
    public static SubLObject external_event_filter_listener_p_socket_info_method(final SubLObject listener) {
        return (SubLObject)kb_modification_event_filters.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 38572L)
    public static SubLObject is_external_event_filter_listener_validP_socket_info_method(final SubLObject listener) {
        return is_external_event_socket_info_listener_validP(listener);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 38720L)
    public static SubLObject invalidate_external_event_filter_listener_socket_info_method(final SubLObject listener) {
        return invalidate_external_socket_info_event_listener(listener);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 38870L)
    public static SubLObject compute_key_from_external_event_filter_socket_info_listener(final SubLObject listener) {
        return (SubLObject)ConsesLow.cons(event_broker.socket_info_host(listener), event_broker.socket_info_port(listener));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 39030L)
    public static SubLObject is_external_event_socket_info_listener_validP(final SubLObject listener) {
        return (SubLObject)SubLObjectFactory.makeBoolean(event_broker.socket_info_host(listener).isString() && event_broker.socket_info_port(listener).isFixnum());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 39209L)
    public static SubLObject invalidate_external_socket_info_event_listener(final SubLObject listener) {
        event_broker._csetf_socket_info_host(listener, (SubLObject)kb_modification_event_filters.NIL);
        event_broker._csetf_socket_info_port(listener, (SubLObject)kb_modification_event_filters.NIL);
        return listener;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 39532L)
    public static SubLObject transmit_kb_modification_event_to_socket_info_listener(final SubLObject socket_info_listener, final SubLObject message, final SubLObject timeout) {
        final SubLObject host = event_broker.socket_info_host(socket_info_listener);
        final SubLObject port = event_broker.socket_info_port(socket_info_listener);
        SubLObject stream = (SubLObject)kb_modification_event_filters.NIL;
        try {
            stream = subl_promotions.open_tcp_stream_with_timeout(host, port, timeout, (SubLObject)kb_modification_event_filters.$kw144$PRIVATE);
            if (kb_modification_event_filters.NIL != subl_macro_promotions.validate_tcp_connection(stream, host, port)) {
                if (kb_modification_event_filters.NIL != kb_modification_event_filters.$verbose_transmit_kb_modification_events$.getGlobalValue()) {
                    Errors.warn((SubLObject)kb_modification_event_filters.$str145$_A__About_to_send_to__A__A____A__, new SubLObject[] { Threads.current_process(), host, port, message });
                }
                streams_high.write_string(message, stream, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED);
                streams_high.force_output(stream);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)kb_modification_event_filters.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (kb_modification_event_filters.NIL != stream) {
                    streams_high.close(stream, (SubLObject)kb_modification_event_filters.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return socket_info_listener;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 40133L)
    public static SubLObject create_external_kb_modification_event_filter_listener(final SubLObject host, final SubLObject port, SubLObject protocol) {
        if (protocol == kb_modification_event_filters.UNPROVIDED) {
            protocol = (SubLObject)kb_modification_event_filters.NIL;
        }
        assert kb_modification_event_filters.NIL != Types.stringp(host) : host;
        assert kb_modification_event_filters.NIL != Numbers.plusp(port) : port;
        return new_external_kb_modification_event_filter_listener(event_broker.new_socket_info(host, port, (SubLObject)kb_modification_event_filters.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 40686L)
    public static SubLObject clear_kb_modification_event_mailboxes() {
        kb_modification_event_filters.$kb_modification_event_mailbox_suite$.setGlobalValue(message_mailboxes.new_message_mailbox_suite());
        return (SubLObject)kb_modification_event_filters.$kw150$CLEARED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 40840L)
    public static SubLObject current_kb_modification_event_mailbox_suite() {
        return kb_modification_event_filters.$kb_modification_event_mailbox_suite$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 40953L)
    public static SubLObject with_kb_modification_event_mailbox_suite(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_modification_event_filters.$sym151$WITH_MESSAGE_MAILBOX_SUITE, (SubLObject)kb_modification_event_filters.$list152, ConsesLow.append(body, (SubLObject)kb_modification_event_filters.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 41122L)
    public static SubLObject message_mailbox_listener_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_message_mailbox_listener(v_object, stream, (SubLObject)kb_modification_event_filters.ZERO_INTEGER);
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 41122L)
    public static SubLObject message_mailbox_listener_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $message_mailbox_listener_native.class) ? kb_modification_event_filters.T : kb_modification_event_filters.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 41122L)
    public static SubLObject mmbox_listener_address(final SubLObject v_object) {
        assert kb_modification_event_filters.NIL != message_mailbox_listener_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 41122L)
    public static SubLObject _csetf_mmbox_listener_address(final SubLObject v_object, final SubLObject value) {
        assert kb_modification_event_filters.NIL != message_mailbox_listener_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 41122L)
    public static SubLObject make_message_mailbox_listener(SubLObject arglist) {
        if (arglist == kb_modification_event_filters.UNPROVIDED) {
            arglist = (SubLObject)kb_modification_event_filters.NIL;
        }
        final SubLObject v_new = (SubLObject)new $message_mailbox_listener_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)kb_modification_event_filters.NIL, next = arglist; kb_modification_event_filters.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)kb_modification_event_filters.$kw164$ADDRESS)) {
                _csetf_mmbox_listener_address(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)kb_modification_event_filters.$str80$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 41122L)
    public static SubLObject visit_defstruct_message_mailbox_listener(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_modification_event_filters.$kw81$BEGIN, (SubLObject)kb_modification_event_filters.$sym165$MAKE_MESSAGE_MAILBOX_LISTENER, (SubLObject)kb_modification_event_filters.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_modification_event_filters.$kw83$SLOT, (SubLObject)kb_modification_event_filters.$kw164$ADDRESS, mmbox_listener_address(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_modification_event_filters.$kw84$END, (SubLObject)kb_modification_event_filters.$sym165$MAKE_MESSAGE_MAILBOX_LISTENER, (SubLObject)kb_modification_event_filters.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 41122L)
    public static SubLObject visit_defstruct_object_message_mailbox_listener_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_message_mailbox_listener(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 41306L)
    public static SubLObject print_message_mailbox_listener(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_modification_event_filters.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)kb_modification_event_filters.T, (SubLObject)kb_modification_event_filters.T);
            streams_high.write_string((SubLObject)kb_modification_event_filters.$str167$_address__, stream, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            print_high.prin1(mmbox_listener_address(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)kb_modification_event_filters.T, (SubLObject)kb_modification_event_filters.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 41563L)
    public static SubLObject new_message_mailbox_listener(SubLObject mailbox_suite) {
        if (mailbox_suite == kb_modification_event_filters.UNPROVIDED) {
            mailbox_suite = (SubLObject)kb_modification_event_filters.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mmbox = make_message_mailbox_listener((SubLObject)kb_modification_event_filters.UNPROVIDED);
        final SubLObject address = Guids.guid_to_string(Guids.new_guid());
        _csetf_mmbox_listener_address(mmbox, address);
        if (kb_modification_event_filters.NIL != message_mailboxes.message_mailbox_suite_p(mailbox_suite)) {
            final SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
            try {
                message_mailboxes.$message_mailbox_style$.bind((SubLObject)kb_modification_event_filters.$kw168$BLOCKING, thread);
                message_mailboxes.ensure_message_mailbox_allocation(address, mailbox_suite);
            }
            finally {
                message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_0, thread);
            }
        }
        return mmbox;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 41971L)
    public static SubLObject transmit_kb_modification_event_to_listener_message_mailbox_listener_method(final SubLObject listener, final SubLObject message, final SubLObject timeout) {
        return transmit_kb_modification_event_to_message_mailbox_listener(listener, message, timeout);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 42180L)
    public static SubLObject compute_key_from_external_event_filter_listener_message_mailbox_listener_method(final SubLObject listener) {
        return compute_key_from_external_event_filter_message_mailbox_listener(listener);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 42366L)
    public static SubLObject external_event_filter_listener_p_message_mailbox_listener_method(final SubLObject listener) {
        return (SubLObject)kb_modification_event_filters.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 42464L)
    public static SubLObject is_external_event_filter_listener_validP_message_mailbox_listener_method(final SubLObject listener) {
        return is_external_event_message_mailbox_listener_validP(listener);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 42629L)
    public static SubLObject invalidate_external_event_filter_listener_message_mailbox_listener_method(final SubLObject listener) {
        return invalidate_external_message_mailbox_event_listener(listener);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 42796L)
    public static SubLObject compute_key_from_external_event_filter_message_mailbox_listener(final SubLObject listener) {
        return mmbox_listener_address(listener);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 42932L)
    public static SubLObject is_external_event_message_mailbox_listener_validP(final SubLObject listener) {
        return Guids.guid_string_p(mmbox_listener_address(listener));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 43069L)
    public static SubLObject invalidate_external_message_mailbox_event_listener(final SubLObject listener) {
        _csetf_mmbox_listener_address(listener, (SubLObject)kb_modification_event_filters.NIL);
        return listener;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 43214L)
    public static SubLObject transmit_kb_modification_event_to_message_mailbox_listener(final SubLObject listener, final SubLObject message, final SubLObject timeout) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject address = mmbox_listener_address(listener);
        SubLObject errorP = (SubLObject)kb_modification_event_filters.NIL;
        final SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_suite$.currentBinding(thread);
        final SubLObject _prev_bind_2 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
        try {
            message_mailboxes.$message_mailbox_suite$.bind(kb_modification_event_filters.$kb_modification_event_mailbox_suite$.getGlobalValue(), thread);
            message_mailboxes.$message_mailbox_style$.bind((SubLObject)kb_modification_event_filters.$kw168$BLOCKING, thread);
            if (kb_modification_event_filters.NIL != message_mailboxes.known_message_mailboxP(address)) {
                message_mailboxes.store_mail_in_message_mailbox(address, message, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            }
            else {
                errorP = (SubLObject)kb_modification_event_filters.T;
            }
        }
        finally {
            message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_2, thread);
            message_mailboxes.$message_mailbox_suite$.rebind(_prev_bind_0, thread);
        }
        if (kb_modification_event_filters.NIL != errorP) {
            Errors.error((SubLObject)kb_modification_event_filters.$str174$The_listener__S_is_no_longer_vali, listener);
        }
        return listener;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 43737L)
    public static SubLObject create_external_kb_modification_event_filter_message_mailbox_listener() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject listener = (SubLObject)kb_modification_event_filters.NIL;
        final SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
        try {
            message_mailboxes.$message_mailbox_style$.bind((SubLObject)kb_modification_event_filters.$kw168$BLOCKING, thread);
            listener = new_message_mailbox_listener(current_kb_modification_event_mailbox_suite());
        }
        finally {
            message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_0, thread);
        }
        return new_external_kb_modification_event_filter_listener(listener);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 44136L)
    public static SubLObject all_external_kb_modification_event_filter_messages_from_mailbox(final SubLObject listener_id, SubLObject cleanup_on_exitP) {
        if (cleanup_on_exitP == kb_modification_event_filters.UNPROVIDED) {
            cleanup_on_exitP = (SubLObject)kb_modification_event_filters.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        if (kb_modification_event_filters.NIL == valid_external_event_filter_listener_p(listener)) {
            Errors.error((SubLObject)kb_modification_event_filters.$str177$Not_a_valid_external_event_filter);
        }
        if (kb_modification_event_filters.NIL == message_mailbox_listener_p(listener)) {
            Errors.error((SubLObject)kb_modification_event_filters.$str178$Wrong_API_for_type____only_suitab);
        }
        final SubLObject address = mmbox_listener_address(listener);
        SubLObject event_counter = (SubLObject)kb_modification_event_filters.ZERO_INTEGER;
        try {
            while (true) {
                final SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_suite$.currentBinding(thread);
                final SubLObject _prev_bind_2 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
                try {
                    message_mailboxes.$message_mailbox_suite$.bind(kb_modification_event_filters.$kb_modification_event_mailbox_suite$.getGlobalValue(), thread);
                    message_mailboxes.$message_mailbox_style$.bind((SubLObject)kb_modification_event_filters.$kw168$BLOCKING, thread);
                    final SubLObject message = message_mailboxes.retrieve_mail_from_message_mailbox(address);
                    task_processor.post_task_info_processor_partial_results((SubLObject)ConsesLow.list(message));
                    event_counter = Numbers.add(event_counter, (SubLObject)kb_modification_event_filters.ONE_INTEGER);
                }
                finally {
                    message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_2, thread);
                    message_mailboxes.$message_mailbox_suite$.rebind(_prev_bind_0, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_modification_event_filters.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (kb_modification_event_filters.NIL != cleanup_on_exitP) {
                    final SubLObject _prev_bind_0_$35 = message_mailboxes.$message_mailbox_suite$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
                    try {
                        message_mailboxes.$message_mailbox_suite$.bind(kb_modification_event_filters.$kb_modification_event_mailbox_suite$.getGlobalValue(), thread);
                        message_mailboxes.$message_mailbox_style$.bind((SubLObject)kb_modification_event_filters.$kw168$BLOCKING, thread);
                        message_mailboxes.deallocate_message_mailbox(address, (SubLObject)kb_modification_event_filters.UNPROVIDED);
                    }
                    finally {
                        message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_4, thread);
                        message_mailboxes.$message_mailbox_suite$.rebind(_prev_bind_0_$35, thread);
                    }
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 45910L)
    public static SubLObject display_current_external_kb_modification_event_filters_and_listeners(SubLObject stream) {
        if (stream == kb_modification_event_filters.UNPROVIDED) {
            stream = (SubLObject)kb_modification_event_filters.T;
        }
        print_high.princ((SubLObject)kb_modification_event_filters.$str182$Current_External_KB_Modification_, stream);
        display_current_kb_modification_event_to_filter_mapping(stream);
        display_current_kb_modification_event_filter_registration(stream);
        display_current_external_kb_modification_event_filter_listener_registration(stream);
        streams_high.terpri(stream);
        print_high.princ((SubLObject)kb_modification_event_filters.$str183$_Active_Filters__, stream);
        streams_high.terpri(stream);
        dictionary_utilities.print_dictionary_contents(kb_modification_event_filters.$active_external_kb_modification_event_filters$.getGlobalValue(), stream);
        streams_high.terpri(stream);
        print_high.princ((SubLObject)kb_modification_event_filters.$str184$_Listeners_for_Filters_Map__, stream);
        streams_high.terpri(stream);
        dictionary_utilities.print_dictionary_contents(kb_modification_event_filters.$external_kb_modification_event_listeners_for_filters$.getGlobalValue(), (SubLObject)kb_modification_event_filters.UNPROVIDED);
        return (SubLObject)kb_modification_event_filters.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 46656L)
    public static SubLObject reset_external_kb_modification_event_filters_and_listeners() {
        reset_kb_modification_event_filter_registration();
        reset_external_kb_modification_event_filter_listener_registration();
        kb_modification_event_filters.$active_external_kb_modification_event_filters$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_modification_event_filters.EQUALP), (SubLObject)kb_modification_event_filters.UNPROVIDED));
        kb_modification_event_filters.$external_kb_modification_event_listeners_for_filters$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_modification_event_filters.EQUALP), (SubLObject)kb_modification_event_filters.UNPROVIDED));
        return (SubLObject)kb_modification_event_filters.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 47042L)
    public static SubLObject add_external_kb_modification_event_filter_listener(final SubLObject listener_id, final SubLObject filter_id) {
        final SubLObject filter = kb_modification_event_filter_id_to_filter_description(filter_id);
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        if (kb_modification_event_filters.NIL == valid_event_filter_description_p(filter) || kb_modification_event_filters.NIL == valid_external_event_filter_listener_p(listener)) {
            return (SubLObject)kb_modification_event_filters.NIL;
        }
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$external_kb_modification_event_listeners_lock$.getGlobalValue());
            final SubLObject not_foundP = Equality.eq((SubLObject)kb_modification_event_filters.$kw102$NOT_FOUND, dictionary.dictionary_lookup(kb_modification_event_filters.$active_external_kb_modification_event_filters$.getGlobalValue(), filter, (SubLObject)kb_modification_event_filters.$kw102$NOT_FOUND));
            dictionary_utilities.dictionary_increment(kb_modification_event_filters.$active_external_kb_modification_event_filters$.getGlobalValue(), filter, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            dictionary_utilities.dictionary_push(kb_modification_event_filters.$external_kb_modification_event_listeners_for_filters$.getGlobalValue(), filter, listener);
            dictionary_utilities.dictionary_push(kb_modification_event_filters.$external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, filter);
            if (kb_modification_event_filters.NIL != not_foundP) {
                note_interest_in_kb_modification_event_filter(filter);
            }
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return (SubLObject)kb_modification_event_filters.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 48149L)
    public static SubLObject get_active_external_kb_modification_event_filters() {
        SubLObject filters = (SubLObject)kb_modification_event_filters.NIL;
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$external_kb_modification_event_listeners_lock$.getGlobalValue());
            filters = dictionary.dictionary_keys(kb_modification_event_filters.$active_external_kb_modification_event_filters$.getGlobalValue());
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return filters;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 48416L)
    public static SubLObject get_all_external_kb_modification_event_filter_listeners_for_filter(final SubLObject filter_id) {
        final SubLObject filter = kb_modification_event_filter_id_to_filter_description(filter_id);
        SubLObject listeners = (SubLObject)kb_modification_event_filters.NIL;
        if (kb_modification_event_filters.NIL == valid_event_filter_description_p(filter)) {
            return (SubLObject)kb_modification_event_filters.NIL;
        }
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$external_kb_modification_event_listeners_lock$.getGlobalValue());
            listeners = dictionary.dictionary_lookup(kb_modification_event_filters.$external_kb_modification_event_listeners_for_filters$.getGlobalValue(), filter, (SubLObject)kb_modification_event_filters.UNPROVIDED);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return listeners;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 48941L)
    public static SubLObject get_all_filters_for_external_kb_modification_event_filter_listener(final SubLObject listener_id) {
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        SubLObject filters = (SubLObject)kb_modification_event_filters.NIL;
        if (kb_modification_event_filters.NIL == valid_external_event_filter_listener_p(listener)) {
            return (SubLObject)kb_modification_event_filters.NIL;
        }
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$external_kb_modification_event_listeners_lock$.getGlobalValue());
            filters = dictionary.dictionary_lookup(kb_modification_event_filters.$external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, (SubLObject)kb_modification_event_filters.UNPROVIDED);
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return filters;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 49459L)
    public static SubLObject remove_external_kb_modification_event_filter_listener(final SubLObject listener_id, final SubLObject filter_id) {
        final SubLObject filter = kb_modification_event_filter_id_to_filter_description(filter_id);
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        if (kb_modification_event_filters.NIL == valid_event_filter_description_p(filter) || kb_modification_event_filters.NIL == valid_external_event_filter_listener_p(listener)) {
            return (SubLObject)kb_modification_event_filters.NIL;
        }
        return remove_external_kb_modification_event_filter_listener_internal(listener, filter);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 50007L)
    public static SubLObject remove_external_kb_modification_event_filter_listener_internal(final SubLObject listener, final SubLObject filter) {
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$external_kb_modification_event_listeners_lock$.getGlobalValue());
            dictionary_utilities.dictionary_decrement_and_remove_if(kb_modification_event_filters.$active_external_kb_modification_event_filters$.getGlobalValue(), filter, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            dictionary_utilities.dictionary_delete_from_value(kb_modification_event_filters.$external_kb_modification_event_listeners_for_filters$.getGlobalValue(), filter, listener, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            dictionary_utilities.dictionary_delete_from_value(kb_modification_event_filters.$external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, filter, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            if (kb_modification_event_filters.$kw187$EMPTY == dictionary.dictionary_lookup(kb_modification_event_filters.$active_external_kb_modification_event_filters$.getGlobalValue(), filter, (SubLObject)kb_modification_event_filters.$kw187$EMPTY)) {
                note_lack_of_interest_in_kb_modification_filter(filter);
            }
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return (SubLObject)kb_modification_event_filters.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 50755L)
    public static SubLObject remove_listener_from_all_external_kb_modification_event_filters(final SubLObject listener_id) {
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        if (kb_modification_event_filters.NIL == valid_external_event_filter_listener_p(listener)) {
            return (SubLObject)kb_modification_event_filters.NIL;
        }
        return remove_listener_from_all_external_kb_modification_event_filters_internal(listener);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-filters.lisp", position = 51147L)
    public static SubLObject remove_listener_from_all_external_kb_modification_event_filters_internal(final SubLObject listener) {
        SubLObject release = (SubLObject)kb_modification_event_filters.NIL;
        try {
            release = Locks.seize_lock(kb_modification_event_filters.$external_kb_modification_event_listeners_lock$.getGlobalValue());
            SubLObject cdolist_list_var;
            final SubLObject filters = cdolist_list_var = dictionary.dictionary_lookup(kb_modification_event_filters.$external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, (SubLObject)kb_modification_event_filters.UNPROVIDED);
            SubLObject filter = (SubLObject)kb_modification_event_filters.NIL;
            filter = cdolist_list_var.first();
            while (kb_modification_event_filters.NIL != cdolist_list_var) {
                remove_external_kb_modification_event_filter_listener_internal(listener, filter);
                cdolist_list_var = cdolist_list_var.rest();
                filter = cdolist_list_var.first();
            }
        }
        finally {
            if (kb_modification_event_filters.NIL != release) {
                Locks.release_lock(kb_modification_event_filters.$external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return (SubLObject)kb_modification_event_filters.T;
    }
    
    public static SubLObject declare_kb_modification_event_filters_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "register_new_kb_modification_filter", "REGISTER-NEW-KB-MODIFICATION-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "register_kb_modification_filter_event_equivalents", "REGISTER-KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "get_kb_modification_filter_event_equivalents", "GET-KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_modification_event_filters", "define_kb_modification_event_filter", "DEFINE-KB-MODIFICATION-EVENT-FILTER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "map_kb_modification_filter_to_function_spec", "MAP-KB-MODIFICATION-FILTER-TO-FUNCTION-SPEC", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_modification_event_filters", "with_matched_kb_modification_event_filters", "WITH-MATCHED-KB-MODIFICATION-EVENT-FILTERS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "apply_filter_to_kb_modification_event", "APPLY-FILTER-TO-KB-MODIFICATION-EVENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "apply_filter_to_kb_modification_event_internal", "APPLY-FILTER-TO-KB-MODIFICATION-EVENT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "symbolic_plist_p", "SYMBOLIC-PLIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "extract_filters_from_kb_modification_filter_expression", "EXTRACT-FILTERS-FROM-KB-MODIFICATION-FILTER-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "compute_implied_kb_modification_events_from_filter_expression", "COMPUTE-IMPLIED-KB-MODIFICATION-EVENTS-FROM-FILTER-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "default_kb_modification_event_filter", "DEFAULT-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_event_fort_filter", "KB-MODIFICATION-EVENT-FORT-FILTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_event_collection_filter", "KB-MODIFICATION-EVENT-COLLECTION-FILTER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_event_lexicon_fort_filter", "KB-MODIFICATION-EVENT-LEXICON-FORT-FILTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_event_mt_filter", "KB-MODIFICATION-EVENT-MT-FILTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_event_mentions_fort", "KB-MODIFICATION-EVENT-MENTIONS-FORT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_event_test_for_collection_assertions", "KB-MODIFICATION-EVENT-TEST-FOR-COLLECTION-ASSERTIONS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_event_test_clause_for_collection_assertion", "KB-MODIFICATION-EVENT-TEST-CLAUSE-FOR-COLLECTION-ASSERTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_event_test_for_microtheory", "KB-MODIFICATION-EVENT-TEST-FOR-MICROTHEORY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "event_filter_description_print_function_trampoline", "EVENT-FILTER-DESCRIPTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "event_filter_description_p", "EVENT-FILTER-DESCRIPTION-P", 1, 0, false);
        new $event_filter_description_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "event_filter_description_id", "EVENT-FILTER-DESCRIPTION-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "event_filter_description_pattern", "EVENT-FILTER-DESCRIPTION-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "_csetf_event_filter_description_id", "_CSETF-EVENT-FILTER-DESCRIPTION-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "_csetf_event_filter_description_pattern", "_CSETF-EVENT-FILTER-DESCRIPTION-PATTERN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "make_event_filter_description", "MAKE-EVENT-FILTER-DESCRIPTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "visit_defstruct_event_filter_description", "VISIT-DEFSTRUCT-EVENT-FILTER-DESCRIPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "visit_defstruct_object_event_filter_description_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-FILTER-DESCRIPTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "print_event_filter_description", "PRINT-EVENT-FILTER-DESCRIPTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "new_event_filter_description", "NEW-EVENT-FILTER-DESCRIPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "valid_event_filter_description_p", "VALID-EVENT-FILTER-DESCRIPTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "clear_event_filter_description", "CLEAR-EVENT-FILTER-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "display_current_kb_modification_event_filter_registration", "DISPLAY-CURRENT-KB-MODIFICATION-EVENT-FILTER-REGISTRATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "reset_kb_modification_event_filter_registration", "RESET-KB-MODIFICATION-EVENT-FILTER-REGISTRATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_event_filter_id_to_filter_description", "KB-MODIFICATION-EVENT-FILTER-ID-TO-FILTER-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "valid_kb_modification_event_filter_id_p", "VALID-KB-MODIFICATION-EVENT-FILTER-ID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_event_filter_pattern_to_id", "KB-MODIFICATION-EVENT-FILTER-PATTERN-TO-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "create_kb_modification_event_filter", "CREATE-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "delete_kb_modification_event_filter", "DELETE-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "get_all_kb_modification_event_filter_ids", "GET-ALL-KB-MODIFICATION-EVENT-FILTER-IDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "display_current_kb_modification_event_to_filter_mapping", "DISPLAY-CURRENT-KB-MODIFICATION-EVENT-TO-FILTER-MAPPING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "note_interest_in_kb_modification_event_filter", "NOTE-INTEREST-IN-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "note_lack_of_interest_in_kb_modification_filter", "NOTE-LACK-OF-INTEREST-IN-KB-MODIFICATION-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "get_kb_modification_event_filters_from_mapping", "GET-KB-MODIFICATION-EVENT-FILTERS-FROM-MAPPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "post_kb_modification_event_filter_fired", "POST-KB-MODIFICATION-EVENT-FILTER-FIRED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_filter_fired_retrieve_trigger", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-TRIGGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_filter_fired_retrieve_supports", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_filter_fired_retrieve_details", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-DETAILS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_filter_fired_retrieve_fired", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-FIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_filter_fired_retrieve_filters", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_filter_fired_retrieve_listener", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-LISTENER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "kb_modification_event_filter_generic_event_handler", "KB-MODIFICATION-EVENT-FILTER-GENERIC-EVENT-HANDLER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "transmit_kb_modification_event_to_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "current_external_kb_modification_event_filter_broker", "CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-BROKER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "event_parameter_name_from_keyword", "EVENT-PARAMETER-NAME-FROM-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "generate_xml_for_kb_modification_filter_fired_message", "GENERATE-XML-FOR-KB-MODIFICATION-FILTER-FIRED-MESSAGE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "generate_xml_for_details_of_kb_modification_filter_fired_message", "GENERATE-XML-FOR-DETAILS-OF-KB-MODIFICATION-FILTER-FIRED-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "generate_xml_for_kb_modification_filter_fired_detail", "GENERATE-XML-FOR-KB-MODIFICATION-FILTER-FIRED-DETAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "handle_kb_modification_filter_fired", "HANDLE-KB-MODIFICATION-FILTER-FIRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "display_current_external_kb_modification_event_filter_listener_registration", "DISPLAY-CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-REGISTRATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "reset_external_kb_modification_event_filter_listener_registration", "RESET-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-REGISTRATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "compute_key_from_external_event_filter_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "external_event_filter_listener_p", "EXTERNAL-EVENT-FILTER-LISTENER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "is_external_event_filter_listener_validP", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "invalidate_external_event_filter_listener", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "valid_external_event_filter_listener_p", "VALID-EXTERNAL-EVENT-FILTER-LISTENER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "valid_external_kb_modification_event_filter_listener_id_p", "VALID-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-ID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "new_external_kb_modification_event_filter_listener", "NEW-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "delete_external_kb_modification_event_filter_listener", "DELETE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "get_all_external_kb_modification_event_filter_listener_ids", "GET-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-IDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "external_kb_modification_event_filter_listener_id_to_listener", "EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-ID-TO-LISTENER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "external_kb_modification_event_filter_listener_to_id", "EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-TO-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "transmit_kb_modification_event_to_listener_socket_info_method", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-SOCKET-INFO-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "compute_key_from_external_event_filter_listener_socket_info_method", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "external_event_filter_listener_p_socket_info_method", "EXTERNAL-EVENT-FILTER-LISTENER-P-SOCKET-INFO-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "is_external_event_filter_listener_validP_socket_info_method", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-SOCKET-INFO-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "invalidate_external_event_filter_listener_socket_info_method", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "compute_key_from_external_event_filter_socket_info_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-SOCKET-INFO-LISTENER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "is_external_event_socket_info_listener_validP", "IS-EXTERNAL-EVENT-SOCKET-INFO-LISTENER-VALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "invalidate_external_socket_info_event_listener", "INVALIDATE-EXTERNAL-SOCKET-INFO-EVENT-LISTENER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "transmit_kb_modification_event_to_socket_info_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-SOCKET-INFO-LISTENER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "create_external_kb_modification_event_filter_listener", "CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "clear_kb_modification_event_mailboxes", "CLEAR-KB-MODIFICATION-EVENT-MAILBOXES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "current_kb_modification_event_mailbox_suite", "CURRENT-KB-MODIFICATION-EVENT-MAILBOX-SUITE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_modification_event_filters", "with_kb_modification_event_mailbox_suite", "WITH-KB-MODIFICATION-EVENT-MAILBOX-SUITE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "message_mailbox_listener_print_function_trampoline", "MESSAGE-MAILBOX-LISTENER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "message_mailbox_listener_p", "MESSAGE-MAILBOX-LISTENER-P", 1, 0, false);
        new $message_mailbox_listener_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "mmbox_listener_address", "MMBOX-LISTENER-ADDRESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "_csetf_mmbox_listener_address", "_CSETF-MMBOX-LISTENER-ADDRESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "make_message_mailbox_listener", "MAKE-MESSAGE-MAILBOX-LISTENER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "visit_defstruct_message_mailbox_listener", "VISIT-DEFSTRUCT-MESSAGE-MAILBOX-LISTENER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "visit_defstruct_object_message_mailbox_listener_method", "VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-LISTENER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "print_message_mailbox_listener", "PRINT-MESSAGE-MAILBOX-LISTENER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "new_message_mailbox_listener", "NEW-MESSAGE-MAILBOX-LISTENER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "transmit_kb_modification_event_to_listener_message_mailbox_listener_method", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "compute_key_from_external_event_filter_listener_message_mailbox_listener_method", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "external_event_filter_listener_p_message_mailbox_listener_method", "EXTERNAL-EVENT-FILTER-LISTENER-P-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "is_external_event_filter_listener_validP_message_mailbox_listener_method", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "invalidate_external_event_filter_listener_message_mailbox_listener_method", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "compute_key_from_external_event_filter_message_mailbox_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "is_external_event_message_mailbox_listener_validP", "IS-EXTERNAL-EVENT-MESSAGE-MAILBOX-LISTENER-VALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "invalidate_external_message_mailbox_event_listener", "INVALIDATE-EXTERNAL-MESSAGE-MAILBOX-EVENT-LISTENER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "transmit_kb_modification_event_to_message_mailbox_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-MESSAGE-MAILBOX-LISTENER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "create_external_kb_modification_event_filter_message_mailbox_listener", "CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "all_external_kb_modification_event_filter_messages_from_mailbox", "ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGES-FROM-MAILBOX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "display_current_external_kb_modification_event_filters_and_listeners", "DISPLAY-CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-AND-LISTENERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "reset_external_kb_modification_event_filters_and_listeners", "RESET-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-AND-LISTENERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "add_external_kb_modification_event_filter_listener", "ADD-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "get_active_external_kb_modification_event_filters", "GET-ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "get_all_external_kb_modification_event_filter_listeners_for_filter", "GET-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENERS-FOR-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "get_all_filters_for_external_kb_modification_event_filter_listener", "GET-ALL-FILTERS-FOR-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "remove_external_kb_modification_event_filter_listener", "REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "remove_external_kb_modification_event_filter_listener_internal", "REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "remove_listener_from_all_external_kb_modification_event_filters", "REMOVE-LISTENER-FROM-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_filters", "remove_listener_from_all_external_kb_modification_event_filters_internal", "REMOVE-LISTENER-FROM-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-INTERNAL", 1, 0, false);
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    public static SubLObject init_kb_modification_event_filters_file() {
        kb_modification_event_filters.$kb_modification_filter_map$ = SubLFiles.deflexical("*KB-MODIFICATION-FILTER-MAP*", dictionary.new_dictionary((SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED));
        kb_modification_event_filters.$kb_modification_filter_event_equivalents$ = SubLFiles.deflexical("*KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS*", dictionary.new_dictionary((SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED));
        kb_modification_event_filters.$matched_kb_modification_event_filters$ = SubLFiles.defparameter("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*", (SubLObject)kb_modification_event_filters.NIL);
        kb_modification_event_filters.$dtp_event_filter_description$ = SubLFiles.defconstant("*DTP-EVENT-FILTER-DESCRIPTION*", (SubLObject)kb_modification_event_filters.$sym65$EVENT_FILTER_DESCRIPTION);
        kb_modification_event_filters.$event_filter_registration$ = SubLFiles.deflexical("*EVENT-FILTER-REGISTRATION*", (kb_modification_event_filters.NIL != Symbols.boundp((SubLObject)kb_modification_event_filters.$sym88$_EVENT_FILTER_REGISTRATION_)) ? kb_modification_event_filters.$event_filter_registration$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_modification_event_filters.EQUALP), (SubLObject)kb_modification_event_filters.UNPROVIDED));
        kb_modification_event_filters.$event_filter_registration_lock$ = SubLFiles.deflexical("*EVENT-FILTER-REGISTRATION-LOCK*", (kb_modification_event_filters.NIL != Symbols.boundp((SubLObject)kb_modification_event_filters.$sym89$_EVENT_FILTER_REGISTRATION_LOCK_)) ? kb_modification_event_filters.$event_filter_registration_lock$.getGlobalValue() : Locks.make_lock((SubLObject)kb_modification_event_filters.$str90$Event_Filter_Registration));
        kb_modification_event_filters.$event_filter_pattern_id$ = SubLFiles.deflexical("*EVENT-FILTER-PATTERN-ID*", (kb_modification_event_filters.NIL != Symbols.boundp((SubLObject)kb_modification_event_filters.$sym91$_EVENT_FILTER_PATTERN_ID_)) ? kb_modification_event_filters.$event_filter_pattern_id$.getGlobalValue() : integer_sequence_generator.new_integer_sequence_generator((SubLObject)kb_modification_event_filters.ONE_INTEGER, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED));
        kb_modification_event_filters.$kb_modification_event_to_filter_mapping$ = SubLFiles.deflexical("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING*", (kb_modification_event_filters.NIL != Symbols.boundp((SubLObject)kb_modification_event_filters.$sym96$_KB_MODIFICATION_EVENT_TO_FILTER_MAPPING_)) ? kb_modification_event_filters.$kb_modification_event_to_filter_mapping$.getGlobalValue() : dictionary.new_dictionary((SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED));
        kb_modification_event_filters.$kb_modification_event_to_filter_mapping_lock$ = SubLFiles.deflexical("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING-LOCK*", (kb_modification_event_filters.NIL != Symbols.boundp((SubLObject)kb_modification_event_filters.$sym97$_KB_MODIFICATION_EVENT_TO_FILTER_MAPPING_LOCK_)) ? kb_modification_event_filters.$kb_modification_event_to_filter_mapping_lock$.getGlobalValue() : Locks.make_lock((SubLObject)kb_modification_event_filters.$str98$KB_Modification_Event_to_Filter_M));
        kb_modification_event_filters.$kb_modification_event_internal_listener_table$ = SubLFiles.deflexical("*KB-MODIFICATION-EVENT-INTERNAL-LISTENER-TABLE*", (kb_modification_event_filters.NIL != Symbols.boundp((SubLObject)kb_modification_event_filters.$sym99$_KB_MODIFICATION_EVENT_INTERNAL_LISTENER_TABLE_)) ? kb_modification_event_filters.$kb_modification_event_internal_listener_table$.getGlobalValue() : dictionary.new_dictionary((SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED));
        kb_modification_event_filters.$transmit_kb_modification_event_to_listener_method_table$ = SubLFiles.deflexical("*TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-METHOD-TABLE*", Vectors.make_vector((SubLObject)kb_modification_event_filters.$int113$256, (SubLObject)kb_modification_event_filters.NIL));
        kb_modification_event_filters.$kb_modification_filter_event_fired_listener$ = SubLFiles.deflexical("*KB-MODIFICATION-FILTER-EVENT-FIRED-LISTENER*", (kb_modification_event_filters.NIL != Symbols.boundp((SubLObject)kb_modification_event_filters.$sym116$_KB_MODIFICATION_FILTER_EVENT_FIRED_LISTENER_)) ? kb_modification_event_filters.$kb_modification_filter_event_fired_listener$.getGlobalValue() : event_broker.describe_funcall_listener((SubLObject)kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED, (SubLObject)kb_modification_event_filters.$sym117$HANDLE_KB_MODIFICATION_FILTER_FIRED, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED));
        kb_modification_event_filters.$kb_modification_external_filter_delivery_timeout$ = SubLFiles.deflexical("*KB-MODIFICATION-EXTERNAL-FILTER-DELIVERY-TIMEOUT*", (SubLObject)kb_modification_event_filters.TWENTY_INTEGER);
        kb_modification_event_filters.$event_filter_listener_registration$ = SubLFiles.deflexical("*EVENT-FILTER-LISTENER-REGISTRATION*", (kb_modification_event_filters.NIL != Symbols.boundp((SubLObject)kb_modification_event_filters.$sym133$_EVENT_FILTER_LISTENER_REGISTRATION_)) ? kb_modification_event_filters.$event_filter_listener_registration$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_modification_event_filters.EQUALP), (SubLObject)kb_modification_event_filters.UNPROVIDED));
        kb_modification_event_filters.$event_filter_listener_registration_lock$ = SubLFiles.deflexical("*EVENT-FILTER-LISTENER-REGISTRATION-LOCK*", (kb_modification_event_filters.NIL != Symbols.boundp((SubLObject)kb_modification_event_filters.$sym134$_EVENT_FILTER_LISTENER_REGISTRATION_LOCK_)) ? kb_modification_event_filters.$event_filter_listener_registration_lock$.getGlobalValue() : Locks.make_lock((SubLObject)kb_modification_event_filters.$str135$Event_Filter_Listener_Registratio));
        kb_modification_event_filters.$event_filter_listener_id$ = SubLFiles.deflexical("*EVENT-FILTER-LISTENER-ID*", (kb_modification_event_filters.NIL != Symbols.boundp((SubLObject)kb_modification_event_filters.$sym136$_EVENT_FILTER_LISTENER_ID_)) ? kb_modification_event_filters.$event_filter_listener_id$.getGlobalValue() : integer_sequence_generator.new_integer_sequence_generator((SubLObject)kb_modification_event_filters.ONE_INTEGER, (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED));
        kb_modification_event_filters.$compute_key_from_external_event_filter_listener_method_table$ = SubLFiles.deflexical("*COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-METHOD-TABLE*", Vectors.make_vector((SubLObject)kb_modification_event_filters.$int113$256, (SubLObject)kb_modification_event_filters.NIL));
        kb_modification_event_filters.$external_event_filter_listener_p_method_table$ = SubLFiles.deflexical("*EXTERNAL-EVENT-FILTER-LISTENER-P-METHOD-TABLE*", Vectors.make_vector((SubLObject)kb_modification_event_filters.$int113$256, (SubLObject)kb_modification_event_filters.NIL));
        kb_modification_event_filters.$is_external_event_filter_listener_validP_method_table$ = SubLFiles.deflexical("*IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-METHOD-TABLE*", Vectors.make_vector((SubLObject)kb_modification_event_filters.$int113$256, (SubLObject)kb_modification_event_filters.NIL));
        kb_modification_event_filters.$invalidate_external_event_filter_listener_method_table$ = SubLFiles.deflexical("*INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-METHOD-TABLE*", Vectors.make_vector((SubLObject)kb_modification_event_filters.$int113$256, (SubLObject)kb_modification_event_filters.NIL));
        kb_modification_event_filters.$verbose_transmit_kb_modification_events$ = SubLFiles.deflexical("*VERBOSE-TRANSMIT-KB-MODIFICATION-EVENTS*", (SubLObject)kb_modification_event_filters.NIL);
        kb_modification_event_filters.$kb_modification_event_mailbox_suite$ = SubLFiles.deflexical("*KB-MODIFICATION-EVENT-MAILBOX-SUITE*", (kb_modification_event_filters.NIL != Symbols.boundp((SubLObject)kb_modification_event_filters.$sym149$_KB_MODIFICATION_EVENT_MAILBOX_SUITE_)) ? kb_modification_event_filters.$kb_modification_event_mailbox_suite$.getGlobalValue() : message_mailboxes.new_message_mailbox_suite());
        kb_modification_event_filters.$dtp_message_mailbox_listener$ = SubLFiles.defconstant("*DTP-MESSAGE-MAILBOX-LISTENER*", (SubLObject)kb_modification_event_filters.$sym153$MESSAGE_MAILBOX_LISTENER);
        kb_modification_event_filters.$active_external_kb_modification_event_filters$ = SubLFiles.deflexical("*ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS*", (kb_modification_event_filters.NIL != Symbols.boundp((SubLObject)kb_modification_event_filters.$sym179$_ACTIVE_EXTERNAL_KB_MODIFICATION_EVENT_FILTERS_)) ? kb_modification_event_filters.$active_external_kb_modification_event_filters$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_modification_event_filters.EQUALP), (SubLObject)kb_modification_event_filters.UNPROVIDED));
        kb_modification_event_filters.$external_kb_modification_event_listeners_for_filters$ = SubLFiles.deflexical("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-FOR-FILTERS*", (kb_modification_event_filters.NIL != Symbols.boundp((SubLObject)kb_modification_event_filters.$sym180$_EXTERNAL_KB_MODIFICATION_EVENT_LISTENERS_FOR_FILTERS_)) ? kb_modification_event_filters.$external_kb_modification_event_listeners_for_filters$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_modification_event_filters.EQUALP), (SubLObject)kb_modification_event_filters.UNPROVIDED));
        kb_modification_event_filters.$external_kb_modification_event_listeners_lock$ = SubLFiles.deflexical("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-LOCK*", Locks.make_lock((SubLObject)kb_modification_event_filters.$str181$External_KB_Modification_Event_Li));
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    public static SubLObject setup_kb_modification_event_filters_file() {
        register_new_kb_modification_filter((SubLObject)kb_modification_event_filters.$kw18$DEFAULT_KB_MODIFICATION_EVENT_FILTER, (SubLObject)kb_modification_event_filters.$sym20$DEFAULT_KB_MODIFICATION_EVENT_FILTER);
        register_kb_modification_filter_event_equivalents((SubLObject)kb_modification_event_filters.$kw18$DEFAULT_KB_MODIFICATION_EVENT_FILTER, (SubLObject)kb_modification_event_filters.$list21);
        register_new_kb_modification_filter((SubLObject)kb_modification_event_filters.$kw23$CYCL_FORT_FILTER, (SubLObject)kb_modification_event_filters.$sym24$KB_MODIFICATION_EVENT_FORT_FILTER);
        register_kb_modification_filter_event_equivalents((SubLObject)kb_modification_event_filters.$kw23$CYCL_FORT_FILTER, (SubLObject)kb_modification_event_filters.$list25);
        register_new_kb_modification_filter((SubLObject)kb_modification_event_filters.$kw26$COLLECTION_FILTER, (SubLObject)kb_modification_event_filters.$sym27$KB_MODIFICATION_EVENT_COLLECTION_FILTER);
        register_kb_modification_filter_event_equivalents((SubLObject)kb_modification_event_filters.$kw26$COLLECTION_FILTER, (SubLObject)kb_modification_event_filters.$list28);
        register_new_kb_modification_filter((SubLObject)kb_modification_event_filters.$kw29$LEXICON_FORT_FILTER, (SubLObject)kb_modification_event_filters.$sym30$KB_MODIFICATION_EVENT_LEXICON_FORT_FILTER);
        register_kb_modification_filter_event_equivalents((SubLObject)kb_modification_event_filters.$kw29$LEXICON_FORT_FILTER, (SubLObject)kb_modification_event_filters.$list25);
        register_new_kb_modification_filter((SubLObject)kb_modification_event_filters.$kw31$MT_FILTER, (SubLObject)kb_modification_event_filters.$sym32$KB_MODIFICATION_EVENT_MT_FILTER);
        register_kb_modification_filter_event_equivalents((SubLObject)kb_modification_event_filters.$kw31$MT_FILTER, (SubLObject)kb_modification_event_filters.$list28);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), kb_modification_event_filters.$dtp_event_filter_description$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym72$EVENT_FILTER_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)kb_modification_event_filters.$list73);
        Structures.def_csetf((SubLObject)kb_modification_event_filters.$sym74$EVENT_FILTER_DESCRIPTION_ID, (SubLObject)kb_modification_event_filters.$sym75$_CSETF_EVENT_FILTER_DESCRIPTION_ID);
        Structures.def_csetf((SubLObject)kb_modification_event_filters.$sym76$EVENT_FILTER_DESCRIPTION_PATTERN, (SubLObject)kb_modification_event_filters.$sym77$_CSETF_EVENT_FILTER_DESCRIPTION_PATTERN);
        Equality.identity((SubLObject)kb_modification_event_filters.$sym65$EVENT_FILTER_DESCRIPTION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), kb_modification_event_filters.$dtp_event_filter_description$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym85$VISIT_DEFSTRUCT_OBJECT_EVENT_FILTER_DESCRIPTION_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)kb_modification_event_filters.$sym88$_EVENT_FILTER_REGISTRATION_);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_modification_event_filters.$sym89$_EVENT_FILTER_REGISTRATION_LOCK_);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_modification_event_filters.$sym91$_EVENT_FILTER_PATTERN_ID_);
        access_macros.register_external_symbol((SubLObject)kb_modification_event_filters.$sym93$CREATE_KB_MODIFICATION_EVENT_FILTER);
        access_macros.register_external_symbol((SubLObject)kb_modification_event_filters.$sym94$DELETE_KB_MODIFICATION_EVENT_FILTER);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_modification_event_filters.$sym96$_KB_MODIFICATION_EVENT_TO_FILTER_MAPPING_);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_modification_event_filters.$sym97$_KB_MODIFICATION_EVENT_TO_FILTER_MAPPING_LOCK_);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_modification_event_filters.$sym99$_KB_MODIFICATION_EVENT_INTERNAL_LISTENER_TABLE_);
        event_model.register_event_class((SubLObject)kb_modification_event_filters.$kw110$KB_MODIFICATION_FILTER_FIRED, (SubLObject)kb_modification_event_filters.$kw115$KB_STORE_EVENT, (SubLObject)kb_modification_event_filters.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_modification_event_filters.$sym116$_KB_MODIFICATION_FILTER_EVENT_FIRED_LISTENER_);
        kb_modification_event.register_listener_with_kb_modifications_event_dispatcher(kb_modification_event_filters.$kb_modification_filter_event_fired_listener$.getGlobalValue());
        subl_macro_promotions.declare_defglobal((SubLObject)kb_modification_event_filters.$sym133$_EVENT_FILTER_LISTENER_REGISTRATION_);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_modification_event_filters.$sym134$_EVENT_FILTER_LISTENER_REGISTRATION_LOCK_);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_modification_event_filters.$sym136$_EVENT_FILTER_LISTENER_ID_);
        access_macros.register_external_symbol((SubLObject)kb_modification_event_filters.$sym138$DELETE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        Structures.register_method(kb_modification_event_filters.$transmit_kb_modification_event_to_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym139$TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_SOCKET_INFO_METHOD));
        Structures.register_method(kb_modification_event_filters.$compute_key_from_external_event_filter_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym140$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHO));
        Structures.register_method(kb_modification_event_filters.$external_event_filter_listener_p_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym141$EXTERNAL_EVENT_FILTER_LISTENER_P_SOCKET_INFO_METHOD));
        Structures.register_method(kb_modification_event_filters.$is_external_event_filter_listener_validP_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym142$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__SOCKET_INFO_METHOD));
        Structures.register_method(kb_modification_event_filters.$invalidate_external_event_filter_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym143$INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHOD));
        access_macros.register_external_symbol((SubLObject)kb_modification_event_filters.$sym146$CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_modification_event_filters.$sym149$_KB_MODIFICATION_EVENT_MAILBOX_SUITE_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), kb_modification_event_filters.$dtp_message_mailbox_listener$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym160$MESSAGE_MAILBOX_LISTENER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)kb_modification_event_filters.$list161);
        Structures.def_csetf((SubLObject)kb_modification_event_filters.$sym162$MMBOX_LISTENER_ADDRESS, (SubLObject)kb_modification_event_filters.$sym163$_CSETF_MMBOX_LISTENER_ADDRESS);
        Equality.identity((SubLObject)kb_modification_event_filters.$sym153$MESSAGE_MAILBOX_LISTENER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), kb_modification_event_filters.$dtp_message_mailbox_listener$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym166$VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_LISTENER_METHOD));
        Structures.register_method(kb_modification_event_filters.$transmit_kb_modification_event_to_listener_method_table$.getGlobalValue(), kb_modification_event_filters.$dtp_message_mailbox_listener$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym169$TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_MESSAGE_MAILBOX_LISTEN));
        Structures.register_method(kb_modification_event_filters.$compute_key_from_external_event_filter_listener_method_table$.getGlobalValue(), kb_modification_event_filters.$dtp_message_mailbox_listener$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym170$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_L));
        Structures.register_method(kb_modification_event_filters.$external_event_filter_listener_p_method_table$.getGlobalValue(), kb_modification_event_filters.$dtp_message_mailbox_listener$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym171$EXTERNAL_EVENT_FILTER_LISTENER_P_MESSAGE_MAILBOX_LISTENER_METHOD));
        Structures.register_method(kb_modification_event_filters.$is_external_event_filter_listener_validP_method_table$.getGlobalValue(), kb_modification_event_filters.$dtp_message_mailbox_listener$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym172$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__MESSAGE_MAILBOX_LISTENER));
        Structures.register_method(kb_modification_event_filters.$invalidate_external_event_filter_listener_method_table$.getGlobalValue(), kb_modification_event_filters.$dtp_message_mailbox_listener$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_modification_event_filters.$sym173$INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_LISTENE));
        access_macros.register_external_symbol((SubLObject)kb_modification_event_filters.$sym175$CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGE_MAILBOX_LIST);
        access_macros.register_external_symbol((SubLObject)kb_modification_event_filters.$sym176$ALL_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGES_FROM_MAILBOX);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_modification_event_filters.$sym179$_ACTIVE_EXTERNAL_KB_MODIFICATION_EVENT_FILTERS_);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_modification_event_filters.$sym180$_EXTERNAL_KB_MODIFICATION_EVENT_LISTENERS_FOR_FILTERS_);
        access_macros.register_external_symbol((SubLObject)kb_modification_event_filters.$sym185$ADD_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        access_macros.register_external_symbol((SubLObject)kb_modification_event_filters.$sym186$REMOVE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        sunit_external.define_test_category((SubLObject)kb_modification_event_filters.$str188$KB_Modification_Event_Filters, (SubLObject)kb_modification_event_filters.UNPROVIDED);
        sunit_external.define_test_suite((SubLObject)kb_modification_event_filters.$str189$KB_Modification_Event_Filters_Tes, (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_filters.$str188$KB_Modification_Event_Filters), (SubLObject)kb_modification_event_filters.UNPROVIDED, (SubLObject)kb_modification_event_filters.UNPROVIDED);
        return (SubLObject)kb_modification_event_filters.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_kb_modification_event_filters_file();
    }
    
    @Override
	public void initializeVariables() {
        init_kb_modification_event_filters_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_kb_modification_event_filters_file();
    }
    
    static {
        me = (SubLFile)new kb_modification_event_filters();
        kb_modification_event_filters.$kb_modification_filter_map$ = null;
        kb_modification_event_filters.$kb_modification_filter_event_equivalents$ = null;
        kb_modification_event_filters.$matched_kb_modification_event_filters$ = null;
        kb_modification_event_filters.$dtp_event_filter_description$ = null;
        kb_modification_event_filters.$event_filter_registration$ = null;
        kb_modification_event_filters.$event_filter_registration_lock$ = null;
        kb_modification_event_filters.$event_filter_pattern_id$ = null;
        kb_modification_event_filters.$kb_modification_event_to_filter_mapping$ = null;
        kb_modification_event_filters.$kb_modification_event_to_filter_mapping_lock$ = null;
        kb_modification_event_filters.$kb_modification_event_internal_listener_table$ = null;
        kb_modification_event_filters.$transmit_kb_modification_event_to_listener_method_table$ = null;
        kb_modification_event_filters.$kb_modification_filter_event_fired_listener$ = null;
        kb_modification_event_filters.$kb_modification_external_filter_delivery_timeout$ = null;
        kb_modification_event_filters.$event_filter_listener_registration$ = null;
        kb_modification_event_filters.$event_filter_listener_registration_lock$ = null;
        kb_modification_event_filters.$event_filter_listener_id$ = null;
        kb_modification_event_filters.$compute_key_from_external_event_filter_listener_method_table$ = null;
        kb_modification_event_filters.$external_event_filter_listener_p_method_table$ = null;
        kb_modification_event_filters.$is_external_event_filter_listener_validP_method_table$ = null;
        kb_modification_event_filters.$invalidate_external_event_filter_listener_method_table$ = null;
        kb_modification_event_filters.$verbose_transmit_kb_modification_events$ = null;
        kb_modification_event_filters.$kb_modification_event_mailbox_suite$ = null;
        kb_modification_event_filters.$dtp_message_mailbox_listener$ = null;
        kb_modification_event_filters.$active_external_kb_modification_event_filters$ = null;
        kb_modification_event_filters.$external_kb_modification_event_listeners_for_filters$ = null;
        kb_modification_event_filters.$external_kb_modification_event_listeners_lock$ = null;
        $str0$Invalid_event_denotation__A_for_f = SubLObjectFactory.makeString("Invalid event denotation ~A for filter ~A.");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTER-TOKEN"), (SubLObject)SubLObjectFactory.makeSymbol("EVENTS"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("DOCSTRING"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym2$EVENT = SubLObjectFactory.makeSymbol("EVENT");
        $str3$Arglist_must_start_with_event_par = SubLObjectFactory.makeString("Arglist must start with event parameter.");
        $sym4$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym5$DEFINE_PRIVATE = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE");
        $sym6$REGISTER_NEW_KB_MODIFICATION_FILTER = SubLObjectFactory.makeSymbol("REGISTER-NEW-KB-MODIFICATION-FILTER");
        $sym7$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym8$REGISTER_KB_MODIFICATION_FILTER_EVENT_EQUIVALENTS = SubLObjectFactory.makeSymbol("REGISTER-KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTERS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym10$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*"), (SubLObject)kb_modification_event_filters.NIL));
        $sym12$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*"));
        $kw14$AND = SubLObjectFactory.makeKeyword("AND");
        $sym15$SYMBOLIC_PLIST_P = SubLObjectFactory.makeSymbol("SYMBOLIC-PLIST-P");
        $kw16$OR = SubLObjectFactory.makeKeyword("OR");
        $kw17$NOT = SubLObjectFactory.makeKeyword("NOT");
        $kw18$DEFAULT_KB_MODIFICATION_EVENT_FILTER = SubLObjectFactory.makeKeyword("DEFAULT-KB-MODIFICATION-EVENT-FILTER");
        $kw19$EVENT_CLASS = SubLObjectFactory.makeKeyword("EVENT-CLASS");
        $sym20$DEFAULT_KB_MODIFICATION_EVENT_FILTER = SubLObjectFactory.makeSymbol("DEFAULT-KB-MODIFICATION-EVENT-FILTER");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $kw22$FORT_FILTER = SubLObjectFactory.makeKeyword("FORT-FILTER");
        $kw23$CYCL_FORT_FILTER = SubLObjectFactory.makeKeyword("CYCL-FORT-FILTER");
        $sym24$KB_MODIFICATION_EVENT_FORT_FILTER = SubLObjectFactory.makeSymbol("KB-MODIFICATION-EVENT-FORT-FILTER");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KB-MODIFY-REMOVE-CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("KB-MODIFY-REMOVE-NART"), (SubLObject)SubLObjectFactory.makeKeyword("KB-MODIFY-CREATE-ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("KB-MODIFY-REMOVE-ASSERTION"));
        $kw26$COLLECTION_FILTER = SubLObjectFactory.makeKeyword("COLLECTION-FILTER");
        $sym27$KB_MODIFICATION_EVENT_COLLECTION_FILTER = SubLObjectFactory.makeSymbol("KB-MODIFICATION-EVENT-COLLECTION-FILTER");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KB-MODIFY-CREATE-ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("KB-MODIFY-REMOVE-ASSERTION"));
        $kw29$LEXICON_FORT_FILTER = SubLObjectFactory.makeKeyword("LEXICON-FORT-FILTER");
        $sym30$KB_MODIFICATION_EVENT_LEXICON_FORT_FILTER = SubLObjectFactory.makeSymbol("KB-MODIFICATION-EVENT-LEXICON-FORT-FILTER");
        $kw31$MT_FILTER = SubLObjectFactory.makeKeyword("MT-FILTER");
        $sym32$KB_MODIFICATION_EVENT_MT_FILTER = SubLObjectFactory.makeSymbol("KB-MODIFICATION-EVENT-MT-FILTER");
        $kw33$ANY_CHANGE = SubLObjectFactory.makeKeyword("ANY-CHANGE");
        $kw34$KB_MODIFY_REMOVE_CONSTANT = SubLObjectFactory.makeKeyword("KB-MODIFY-REMOVE-CONSTANT");
        $kw35$FORT_REMOVED = SubLObjectFactory.makeKeyword("FORT-REMOVED");
        $kw36$EVENT_TYPE = SubLObjectFactory.makeKeyword("EVENT-TYPE");
        $kw37$CYCL_FORT_EVENT = SubLObjectFactory.makeKeyword("CYCL-FORT-EVENT");
        $kw38$EVENT_REASON = SubLObjectFactory.makeKeyword("EVENT-REASON");
        $kw39$ITEM_REMOVED = SubLObjectFactory.makeKeyword("ITEM-REMOVED");
        $kw40$FORT_MODIFIED = SubLObjectFactory.makeKeyword("FORT-MODIFIED");
        $kw41$REMOVED_VALUE = SubLObjectFactory.makeKeyword("REMOVED-VALUE");
        $kw42$KB_MODIFY_CREATE_ASSERTION = SubLObjectFactory.makeKeyword("KB-MODIFY-CREATE-ASSERTION");
        $kw43$FORT_ASSERTION_ADDED = SubLObjectFactory.makeKeyword("FORT-ASSERTION-ADDED");
        $kw44$ITEM_ADDED = SubLObjectFactory.makeKeyword("ITEM-ADDED");
        $kw45$ASSERTION_SENTENCE = SubLObjectFactory.makeKeyword("ASSERTION-SENTENCE");
        $kw46$ASSERTION_MT = SubLObjectFactory.makeKeyword("ASSERTION-MT");
        $kw47$KB_MODIFY_REMOVE_ASSERTION = SubLObjectFactory.makeKeyword("KB-MODIFY-REMOVE-ASSERTION");
        $kw48$FORT_ASSERTION_REMOVED = SubLObjectFactory.makeKeyword("FORT-ASSERTION-REMOVED");
        $kw49$KB_MODIFY_REMOVE_NART = SubLObjectFactory.makeKeyword("KB-MODIFY-REMOVE-NART");
        $kw50$ALL_INSTANTIATIONS = SubLObjectFactory.makeKeyword("ALL-INSTANTIATIONS");
        $kw51$INSTANCE_REMOVED = SubLObjectFactory.makeKeyword("INSTANCE-REMOVED");
        $kw52$CYCL_COLLECTION_EVENT = SubLObjectFactory.makeKeyword("CYCL-COLLECTION-EVENT");
        $kw53$COLLECTION_MODIFIED = SubLObjectFactory.makeKeyword("COLLECTION-MODIFIED");
        $kw54$ADDED_VALUE = SubLObjectFactory.makeKeyword("ADDED-VALUE");
        $kw55$INSTANCE_ADDED = SubLObjectFactory.makeKeyword("INSTANCE-ADDED");
        $const56$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw57$IMMEDIATE_INSTANTIATIONS = SubLObjectFactory.makeKeyword("IMMEDIATE-INSTANTIATIONS");
        $kw58$LOCAL_CHANGE = SubLObjectFactory.makeKeyword("LOCAL-CHANGE");
        $kw59$ASSERTION_ADDED = SubLObjectFactory.makeKeyword("ASSERTION-ADDED");
        $kw60$ASSERTION_REMOVED = SubLObjectFactory.makeKeyword("ASSERTION-REMOVED");
        $kw61$UPWARD_CLOSURE = SubLObjectFactory.makeKeyword("UPWARD-CLOSURE");
        $kw62$DOWNWARD_CLOSURE = SubLObjectFactory.makeKeyword("DOWNWARD-CLOSURE");
        $kw63$CYCL_MICROTHEORY_EVENT = SubLObjectFactory.makeKeyword("CYCL-MICROTHEORY-EVENT");
        $kw64$MICROTHEORY_MODIFIED = SubLObjectFactory.makeKeyword("MICROTHEORY-MODIFIED");
        $sym65$EVENT_FILTER_DESCRIPTION = SubLObjectFactory.makeSymbol("EVENT-FILTER-DESCRIPTION");
        $sym66$EVENT_FILTER_DESCRIPTION_P = SubLObjectFactory.makeSymbol("EVENT-FILTER-DESCRIPTION-P");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN"));
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("PATTERN"));
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENT-FILTER-DESCRIPTION-ID"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-FILTER-DESCRIPTION-PATTERN"));
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-FILTER-DESCRIPTION-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-FILTER-DESCRIPTION-PATTERN"));
        $sym71$PRINT_EVENT_FILTER_DESCRIPTION = SubLObjectFactory.makeSymbol("PRINT-EVENT-FILTER-DESCRIPTION");
        $sym72$EVENT_FILTER_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("EVENT-FILTER-DESCRIPTION-PRINT-FUNCTION-TRAMPOLINE");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-FILTER-DESCRIPTION-P"));
        $sym74$EVENT_FILTER_DESCRIPTION_ID = SubLObjectFactory.makeSymbol("EVENT-FILTER-DESCRIPTION-ID");
        $sym75$_CSETF_EVENT_FILTER_DESCRIPTION_ID = SubLObjectFactory.makeSymbol("_CSETF-EVENT-FILTER-DESCRIPTION-ID");
        $sym76$EVENT_FILTER_DESCRIPTION_PATTERN = SubLObjectFactory.makeSymbol("EVENT-FILTER-DESCRIPTION-PATTERN");
        $sym77$_CSETF_EVENT_FILTER_DESCRIPTION_PATTERN = SubLObjectFactory.makeSymbol("_CSETF-EVENT-FILTER-DESCRIPTION-PATTERN");
        $kw78$ID = SubLObjectFactory.makeKeyword("ID");
        $kw79$PATTERN = SubLObjectFactory.makeKeyword("PATTERN");
        $str80$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw81$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym82$MAKE_EVENT_FILTER_DESCRIPTION = SubLObjectFactory.makeSymbol("MAKE-EVENT-FILTER-DESCRIPTION");
        $kw83$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw84$END = SubLObjectFactory.makeKeyword("END");
        $sym85$VISIT_DEFSTRUCT_OBJECT_EVENT_FILTER_DESCRIPTION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-EVENT-FILTER-DESCRIPTION-METHOD");
        $str86$_id__ = SubLObjectFactory.makeString(" id: ");
        $str87$_pattern__ = SubLObjectFactory.makeString(" pattern: ");
        $sym88$_EVENT_FILTER_REGISTRATION_ = SubLObjectFactory.makeSymbol("*EVENT-FILTER-REGISTRATION*");
        $sym89$_EVENT_FILTER_REGISTRATION_LOCK_ = SubLObjectFactory.makeSymbol("*EVENT-FILTER-REGISTRATION-LOCK*");
        $str90$Event_Filter_Registration = SubLObjectFactory.makeString("Event Filter Registration");
        $sym91$_EVENT_FILTER_PATTERN_ID_ = SubLObjectFactory.makeSymbol("*EVENT-FILTER-PATTERN-ID*");
        $str92$Current_KB_Modification_Event_Fil = SubLObjectFactory.makeString("Current KB Modification Event Filter Registration");
        $sym93$CREATE_KB_MODIFICATION_EVENT_FILTER = SubLObjectFactory.makeSymbol("CREATE-KB-MODIFICATION-EVENT-FILTER");
        $sym94$DELETE_KB_MODIFICATION_EVENT_FILTER = SubLObjectFactory.makeSymbol("DELETE-KB-MODIFICATION-EVENT-FILTER");
        $sym95$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");
        $sym96$_KB_MODIFICATION_EVENT_TO_FILTER_MAPPING_ = SubLObjectFactory.makeSymbol("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING*");
        $sym97$_KB_MODIFICATION_EVENT_TO_FILTER_MAPPING_LOCK_ = SubLObjectFactory.makeSymbol("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING-LOCK*");
        $str98$KB_Modification_Event_to_Filter_M = SubLObjectFactory.makeString("KB Modification Event to Filter Mapping");
        $sym99$_KB_MODIFICATION_EVENT_INTERNAL_LISTENER_TABLE_ = SubLObjectFactory.makeSymbol("*KB-MODIFICATION-EVENT-INTERNAL-LISTENER-TABLE*");
        $str100$Current_KB_Modification_Event_To_ = SubLObjectFactory.makeString("Current KB Modification Event To Filter Mapping");
        $str101$Current_KB_Modification_Event_Int = SubLObjectFactory.makeString("Current KB Modification Event Internal Listener Table");
        $kw102$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $sym103$KB_MODIFICATION_EVENT_FILTER_GENERIC_EVENT_HANDLER = SubLObjectFactory.makeSymbol("KB-MODIFICATION-EVENT-FILTER-GENERIC-EVENT-HANDLER");
        $kw104$LISTENER = SubLObjectFactory.makeKeyword("LISTENER");
        $kw105$FILTERS = SubLObjectFactory.makeKeyword("FILTERS");
        $kw106$FIRED = SubLObjectFactory.makeKeyword("FIRED");
        $kw107$DETAILS = SubLObjectFactory.makeKeyword("DETAILS");
        $kw108$TRIGGER = SubLObjectFactory.makeKeyword("TRIGGER");
        $kw109$SUPPORTS = SubLObjectFactory.makeKeyword("SUPPORTS");
        $kw110$KB_MODIFICATION_FILTER_FIRED = SubLObjectFactory.makeKeyword("KB-MODIFICATION-FILTER-FIRED");
        $sym111$EVENT_P = SubLObjectFactory.makeSymbol("EVENT-P");
        $str112$Event__S_is_of_type__S__not__S_ = SubLObjectFactory.makeString("Event ~S is of type ~S, not ~S.");
        $int113$256 = SubLObjectFactory.makeInteger(256);
        $str114$Not_implemented_for_type__A = SubLObjectFactory.makeString("Not implemented for type ~A");
        $kw115$KB_STORE_EVENT = SubLObjectFactory.makeKeyword("KB-STORE-EVENT");
        $sym116$_KB_MODIFICATION_FILTER_EVENT_FIRED_LISTENER_ = SubLObjectFactory.makeSymbol("*KB-MODIFICATION-FILTER-EVENT-FIRED-LISTENER*");
        $sym117$HANDLE_KB_MODIFICATION_FILTER_FIRED = SubLObjectFactory.makeSymbol("HANDLE-KB-MODIFICATION-FILTER-FIRED");
        $list118 = ConsesLow.list((SubLObject)Characters.CHAR_hyphen);
        $sym119$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $str120$eventNotifications = SubLObjectFactory.makeString("eventNotifications");
        $str121$http___www_opencyc_org_xml_eventN = SubLObjectFactory.makeString("http://www.opencyc.org/xml/eventNotifications.dtd");
        $kw122$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str123$eventNotification = SubLObjectFactory.makeString("eventNotification");
        $str124$kbModificationFilteredEvent = SubLObjectFactory.makeString("kbModificationFilteredEvent");
        $str125$filterList = SubLObjectFactory.makeString("filterList");
        $str126$filterId = SubLObjectFactory.makeString("filterId");
        $str127$timestamp = SubLObjectFactory.makeString("timestamp");
        $str128$kbEvents = SubLObjectFactory.makeString("kbEvents");
        $str129$kbEvent = SubLObjectFactory.makeString("kbEvent");
        $kw130$HP = SubLObjectFactory.makeKeyword("HP");
        $sym131$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str132$KB_Modification_Filter_Fired__cou = SubLObjectFactory.makeString("KB Modification Filter Fired: could not report event ~S to listener ~A -> error ~A.~%Deregistering listener ~A");
        $sym133$_EVENT_FILTER_LISTENER_REGISTRATION_ = SubLObjectFactory.makeSymbol("*EVENT-FILTER-LISTENER-REGISTRATION*");
        $sym134$_EVENT_FILTER_LISTENER_REGISTRATION_LOCK_ = SubLObjectFactory.makeSymbol("*EVENT-FILTER-LISTENER-REGISTRATION-LOCK*");
        $str135$Event_Filter_Listener_Registratio = SubLObjectFactory.makeString("Event Filter Listener Registration");
        $sym136$_EVENT_FILTER_LISTENER_ID_ = SubLObjectFactory.makeSymbol("*EVENT-FILTER-LISTENER-ID*");
        $str137$Current_External_KB_Modification_ = SubLObjectFactory.makeString("Current External KB Modification Event Filter Listener Registration");
        $sym138$DELETE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER = SubLObjectFactory.makeSymbol("DELETE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");
        $sym139$TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_SOCKET_INFO_METHOD = SubLObjectFactory.makeSymbol("TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-SOCKET-INFO-METHOD");
        $sym140$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHO = SubLObjectFactory.makeSymbol("COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD");
        $sym141$EXTERNAL_EVENT_FILTER_LISTENER_P_SOCKET_INFO_METHOD = SubLObjectFactory.makeSymbol("EXTERNAL-EVENT-FILTER-LISTENER-P-SOCKET-INFO-METHOD");
        $sym142$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__SOCKET_INFO_METHOD = SubLObjectFactory.makeSymbol("IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-SOCKET-INFO-METHOD");
        $sym143$INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHOD = SubLObjectFactory.makeSymbol("INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD");
        $kw144$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $str145$_A__About_to_send_to__A__A____A__ = SubLObjectFactory.makeString("~A: About to send to ~A:~A:~%~A~%");
        $sym146$CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER = SubLObjectFactory.makeSymbol("CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");
        $sym147$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym148$PLUSP = SubLObjectFactory.makeSymbol("PLUSP");
        $sym149$_KB_MODIFICATION_EVENT_MAILBOX_SUITE_ = SubLObjectFactory.makeSymbol("*KB-MODIFICATION-EVENT-MAILBOX-SUITE*");
        $kw150$CLEARED = SubLObjectFactory.makeKeyword("CLEARED");
        $sym151$WITH_MESSAGE_MAILBOX_SUITE = SubLObjectFactory.makeSymbol("WITH-MESSAGE-MAILBOX-SUITE");
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*KB-MODIFICATION-EVENT-MAILBOX-SUITE*"));
        $sym153$MESSAGE_MAILBOX_LISTENER = SubLObjectFactory.makeSymbol("MESSAGE-MAILBOX-LISTENER");
        $sym154$MESSAGE_MAILBOX_LISTENER_P = SubLObjectFactory.makeSymbol("MESSAGE-MAILBOX-LISTENER-P");
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADDRESS"));
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ADDRESS"));
        $list157 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MMBOX-LISTENER-ADDRESS"));
        $list158 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MMBOX-LISTENER-ADDRESS"));
        $sym159$PRINT_MESSAGE_MAILBOX_LISTENER = SubLObjectFactory.makeSymbol("PRINT-MESSAGE-MAILBOX-LISTENER");
        $sym160$MESSAGE_MAILBOX_LISTENER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("MESSAGE-MAILBOX-LISTENER-PRINT-FUNCTION-TRAMPOLINE");
        $list161 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE-MAILBOX-LISTENER-P"));
        $sym162$MMBOX_LISTENER_ADDRESS = SubLObjectFactory.makeSymbol("MMBOX-LISTENER-ADDRESS");
        $sym163$_CSETF_MMBOX_LISTENER_ADDRESS = SubLObjectFactory.makeSymbol("_CSETF-MMBOX-LISTENER-ADDRESS");
        $kw164$ADDRESS = SubLObjectFactory.makeKeyword("ADDRESS");
        $sym165$MAKE_MESSAGE_MAILBOX_LISTENER = SubLObjectFactory.makeSymbol("MAKE-MESSAGE-MAILBOX-LISTENER");
        $sym166$VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_LISTENER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-LISTENER-METHOD");
        $str167$_address__ = SubLObjectFactory.makeString(" address: ");
        $kw168$BLOCKING = SubLObjectFactory.makeKeyword("BLOCKING");
        $sym169$TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_MESSAGE_MAILBOX_LISTEN = SubLObjectFactory.makeSymbol("TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD");
        $sym170$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_L = SubLObjectFactory.makeSymbol("COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD");
        $sym171$EXTERNAL_EVENT_FILTER_LISTENER_P_MESSAGE_MAILBOX_LISTENER_METHOD = SubLObjectFactory.makeSymbol("EXTERNAL-EVENT-FILTER-LISTENER-P-MESSAGE-MAILBOX-LISTENER-METHOD");
        $sym172$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__MESSAGE_MAILBOX_LISTENER = SubLObjectFactory.makeSymbol("IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-MESSAGE-MAILBOX-LISTENER-METHOD");
        $sym173$INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_LISTENE = SubLObjectFactory.makeSymbol("INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD");
        $str174$The_listener__S_is_no_longer_vali = SubLObjectFactory.makeString("The listener ~S is no longer valid.");
        $sym175$CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGE_MAILBOX_LIST = SubLObjectFactory.makeSymbol("CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER");
        $sym176$ALL_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGES_FROM_MAILBOX = SubLObjectFactory.makeSymbol("ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGES-FROM-MAILBOX");
        $str177$Not_a_valid_external_event_filter = SubLObjectFactory.makeString("Not a valid external event filter listener ID.");
        $str178$Wrong_API_for_type____only_suitab = SubLObjectFactory.makeString("Wrong API for type -- only suitable for message mailbox listeners.");
        $sym179$_ACTIVE_EXTERNAL_KB_MODIFICATION_EVENT_FILTERS_ = SubLObjectFactory.makeSymbol("*ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS*");
        $sym180$_EXTERNAL_KB_MODIFICATION_EVENT_LISTENERS_FOR_FILTERS_ = SubLObjectFactory.makeSymbol("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-FOR-FILTERS*");
        $str181$External_KB_Modification_Event_Li = SubLObjectFactory.makeString("External KB Modification Event Listeners");
        $str182$Current_External_KB_Modification_ = SubLObjectFactory.makeString("Current External KB Modification Event Filters & Listeners");
        $str183$_Active_Filters__ = SubLObjectFactory.makeString(" Active Filters: ");
        $str184$_Listeners_for_Filters_Map__ = SubLObjectFactory.makeString(" Listeners for Filters Map: ");
        $sym185$ADD_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER = SubLObjectFactory.makeSymbol("ADD-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");
        $sym186$REMOVE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER = SubLObjectFactory.makeSymbol("REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");
        $kw187$EMPTY = SubLObjectFactory.makeKeyword("EMPTY");
        $str188$KB_Modification_Event_Filters = SubLObjectFactory.makeString("KB Modification Event Filters");
        $str189$KB_Modification_Event_Filters_Tes = SubLObjectFactory.makeString("KB Modification Event Filters Test Suite");
    }
    
    public static final class $event_filter_description_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $pattern;
        private static final SubLStructDeclNative structDecl;
        
        public $event_filter_description_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$pattern = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$event_filter_description_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$pattern;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$pattern = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$event_filter_description_native.class, kb_modification_event_filters.$sym65$EVENT_FILTER_DESCRIPTION, kb_modification_event_filters.$sym66$EVENT_FILTER_DESCRIPTION_P, kb_modification_event_filters.$list67, kb_modification_event_filters.$list68, new String[] { "$id", "$pattern" }, kb_modification_event_filters.$list69, kb_modification_event_filters.$list70, kb_modification_event_filters.$sym71$PRINT_EVENT_FILTER_DESCRIPTION);
        }
    }
    
    public static final class $event_filter_description_p$UnaryFunction extends UnaryFunction
    {
        public $event_filter_description_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EVENT-FILTER-DESCRIPTION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return kb_modification_event_filters.event_filter_description_p(arg1);
        }
    }
    
    public static final class $message_mailbox_listener_native extends SubLStructNative
    {
        public SubLObject $address;
        private static final SubLStructDeclNative structDecl;
        
        public $message_mailbox_listener_native() {
            this.$address = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$message_mailbox_listener_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$address;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$address = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$message_mailbox_listener_native.class, kb_modification_event_filters.$sym153$MESSAGE_MAILBOX_LISTENER, kb_modification_event_filters.$sym154$MESSAGE_MAILBOX_LISTENER_P, kb_modification_event_filters.$list155, kb_modification_event_filters.$list156, new String[] { "$address" }, kb_modification_event_filters.$list157, kb_modification_event_filters.$list158, kb_modification_event_filters.$sym159$PRINT_MESSAGE_MAILBOX_LISTENER);
        }
    }
    
    public static final class $message_mailbox_listener_p$UnaryFunction extends UnaryFunction
    {
        public $message_mailbox_listener_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MESSAGE-MAILBOX-LISTENER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return kb_modification_event_filters.message_mailbox_listener_p(arg1);
        }
    }
}

/*

	Total time: 1042 ms
	
*/
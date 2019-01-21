package com.cyc.cycjava.cycl.quirk;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class wordnet_proxy extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.wordnet_proxy";
    public static final String myFingerPrint = "5258b0770107295d06e9b904c875b792da1d19e588b20b927bc5fed59248f6c8";
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$DEF_INSTANCE_METHOD;
    private static final SubLSymbol $sym2$INITIALIZE;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$DEFAULT_INITIALIZER;
    private static final SubLSymbol $sym6$PROGN;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$DEFINE_PUBLIC;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$RET;
    private static final SubLSymbol $sym11$FIM;
    private static final SubLSymbol $sym12$PROXY;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$WORDNET_PROXY;
    private static final SubLSymbol $sym15$OBJECT;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$INSTANCE_COUNT;
    private static final SubLSymbol $sym18$SUBLOOP_RESERVED_INITIALIZE_WORDNET_PROXY_CLASS;
    private static final SubLSymbol $sym19$ISOLATED_P;
    private static final SubLSymbol $sym20$INSTANCE_NUMBER;
    private static final SubLSymbol $sym21$SUBLOOP_RESERVED_INITIALIZE_WORDNET_PROXY_INSTANCE;
    private static final SubLSymbol $sym22$ABSOLUTE_KEY;
    private static final SubLList $list23;
    private static final SubLString $str24$class;
    private static final SubLSymbol $sym25$WN_CLASS;
    private static final SubLSymbol $sym26$RELATIVE_KEY;
    private static final SubLSymbol $sym27$WORDNET_PROXY_ABSOLUTE_KEY_METHOD;
    private static final SubLSymbol $sym28$SENSES;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$INVOKE;
    private static final SubLString $str31$getSenses;
    private static final SubLSymbol $sym32$WORDNET_PROXY_SENSES_METHOD;
    private static final SubLSymbol $sym33$SYNSETS;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$SYNSET;
    private static final SubLSymbol $sym36$WORDNET_PROXY_SYNSETS_METHOD;
    private static final SubLSymbol $sym37$LINKS;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLString $str40$getPointerTargets;
    private static final SubLString $str41$pointerType;
    private static final SubLSymbol $sym42$WORDNET_PROXY_LINKS_METHOD;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLString $str45$method;
    private static final SubLSymbol $sym46$WORDNET_PROXY_INVOKE_METHOD;
    private static final SubLSymbol $sym47$WORD_PROXY;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$POS;
    private static final SubLSymbol $sym50$FORM;
    private static final SubLSymbol $sym51$SUBLOOP_RESERVED_INITIALIZE_WORD_PROXY_CLASS;
    private static final SubLSymbol $sym52$SUBLOOP_RESERVED_INITIALIZE_WORD_PROXY_INSTANCE;
    private static final SubLList $list53;
    private static final SubLString $str54$word;
    private static final SubLSymbol $sym55$WORD_PROXY_WN_CLASS_METHOD;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$OUTER_CATCH_FOR_WORD_PROXY_METHOD;
    private static final SubLString $str58$pos;
    private static final SubLString $str59$form;
    private static final SubLSymbol $sym60$WORD_PROXY_RELATIVE_KEY_METHOD;
    private static final SubLSymbol $sym61$PRINT;
    private static final SubLList $list62;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$OUTER_CATCH_FOR_WORD_PROXY_METHOD;
    private static final SubLString $str65$__WORD_PROXY_;
    private static final SubLString $str66$_;
    private static final SubLSymbol $sym67$WORD_PROXY_PRINT_METHOD;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$WORD_PROXY_LINKS_METHOD;
    private static final SubLList $list70;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$OUTER_CATCH_FOR_WORD_PROXY_METHOD;
    private static final SubLSymbol $sym73$WORD_PROXY_POS_METHOD;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$OUTER_CATCH_FOR_WORD_PROXY_METHOD;
    private static final SubLSymbol $sym76$WORD_PROXY_FORM_METHOD;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$OUTER_CATCH_FOR_WORD_PROXY_METHOD;
    private static final SubLSymbol $sym80$WORD_PROXY_EQUAL_METHOD;
    private static final SubLSymbol $sym81$SYNSET_PROXY;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$GLOSS;
    private static final SubLSymbol $sym84$OFFSET;
    private static final SubLSymbol $sym85$SUBLOOP_RESERVED_INITIALIZE_SYNSET_PROXY_CLASS;
    private static final SubLSymbol $sym86$SUBLOOP_RESERVED_INITIALIZE_SYNSET_PROXY_INSTANCE;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD;
    private static final SubLString $str89$__SYNSET_PROXY_;
    private static final SubLString $str90$_;
    private static final SubLSymbol $sym91$SYNSET_PROXY_PRINT_METHOD;
    private static final SubLList $list92;
    private static final SubLString $str93$synset;
    private static final SubLSymbol $sym94$SYNSET_PROXY_WN_CLASS_METHOD;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD;
    private static final SubLString $str97$offset;
    private static final SubLSymbol $sym98$SYNSET_PROXY_RELATIVE_KEY_METHOD;
    private static final SubLSymbol $sym99$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD;
    private static final SubLSymbol $sym100$SYNSET_PROXY_POS_METHOD;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD;
    private static final SubLSymbol $sym103$SYNSET_PROXY_OFFSET_METHOD;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD;
    private static final SubLSymbol $sym106$SYNSET_PROXY_GLOSS_METHOD;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD;
    private static final SubLSymbol $sym109$SYNSET_PROXY_EQUAL_METHOD;
    private static final SubLSymbol $sym110$SENSE_PROXY;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$SUBLOOP_RESERVED_INITIALIZE_SENSE_PROXY_CLASS;
    private static final SubLSymbol $sym113$SUBLOOP_RESERVED_INITIALIZE_SENSE_PROXY_INSTANCE;
    private static final SubLSymbol $sym114$SENSE_PROXY_P;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$OUTER_CATCH_FOR_SENSE_PROXY_METHOD;
    private static final SubLString $str117$__SENSE_PROXY_;
    private static final SubLSymbol $sym118$SENSE_PROXY_PRINT_METHOD;
    private static final SubLList $list119;
    private static final SubLString $str120$sense;
    private static final SubLSymbol $sym121$SENSE_PROXY_WN_CLASS_METHOD;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$OUTER_CATCH_FOR_SENSE_PROXY_METHOD;
    private static final SubLSymbol $sym124$SENSE_PROXY_RELATIVE_KEY_METHOD;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$SENSE_PROXY_SENSES_METHOD;
    private static final SubLSymbol $sym127$OUTER_CATCH_FOR_SENSE_PROXY_METHOD;
    private static final SubLSymbol $sym128$SENSE_PROXY_FORM_METHOD;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$OUTER_CATCH_FOR_SENSE_PROXY_METHOD;
    private static final SubLSymbol $sym131$SENSE_PROXY_POS_METHOD;
    private static final SubLSymbol $sym132$WORD;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$OUTER_CATCH_FOR_SENSE_PROXY_METHOD;
    private static final SubLSymbol $sym135$SENSE_PROXY_WORD_METHOD;
    private static final SubLSymbol $sym136$NUM;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$SENSE_PROXY_NUM_METHOD;
    private static final SubLList $list139;
    private static final SubLSymbol $sym140$OUTER_CATCH_FOR_SENSE_PROXY_METHOD;
    private static final SubLSymbol $sym141$SENSE_PROXY_EQUAL_METHOD;
    private static final SubLList $list142;
    private static final SubLSymbol $sym143$SYNSET_PROXY_INITIALIZE_METHOD;
    private static final SubLSymbol $sym144$SENSE_PROXY_INITIALIZE_METHOD;
    private static final SubLSymbol $sym145$WORD_PROXY_INITIALIZE_METHOD;
    private static final SubLSymbol $sym146$WORDNET_PROXY_INITIALIZE_METHOD;
    private static final SubLString $str147$gloss;
    private static final SubLString $str148$adjective;
    private static final SubLString $str149$noun;
    private static final SubLString $str150$verb;
    private static final SubLString $str151$adverb;
    private static final SubLString $str152$antonym;
    private static final SubLString $str153$hypernym;
    private static final SubLString $str154$hyponym;
    private static final SubLString $str155$attribute;
    private static final SubLString $str156$also_see;
    private static final SubLString $str157$entailment;
    private static final SubLString $str158$cause;
    private static final SubLString $str159$verb_group;
    private static final SubLString $str160$member_meronym;
    private static final SubLString $str161$substance_meronym;
    private static final SubLString $str162$part_meronym;
    private static final SubLString $str163$member_holonym;
    private static final SubLString $str164$substance_holonym;
    private static final SubLString $str165$part_holonym;
    private static final SubLString $str166$similar;
    private static final SubLString $str167$participle_of;
    private static final SubLString $str168$pertainym;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 1964L)
    public static SubLObject default_initializer(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)wordnet_proxy.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wordnet_proxy.$list0);
        v_class = current.first();
        current = current.rest();
        if (wordnet_proxy.NIL == current) {
            return (SubLObject)ConsesLow.listS((SubLObject)wordnet_proxy.$sym1$DEF_INSTANCE_METHOD, (SubLObject)ConsesLow.listS((SubLObject)wordnet_proxy.$sym2$INITIALIZE, v_class, (SubLObject)wordnet_proxy.$list3), (SubLObject)wordnet_proxy.$list4);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wordnet_proxy.$list0);
        return (SubLObject)wordnet_proxy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 2134L)
    public static SubLObject default_initializers(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject v_classes;
        final SubLObject current = v_classes = datum;
        SubLObject defs = (SubLObject)wordnet_proxy.NIL;
        SubLObject cdolist_list_var = v_classes;
        SubLObject v_class = (SubLObject)wordnet_proxy.NIL;
        v_class = cdolist_list_var.first();
        while (wordnet_proxy.NIL != cdolist_list_var) {
            defs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.$sym5$DEFAULT_INITIALIZER, v_class), defs);
            cdolist_list_var = cdolist_list_var.rest();
            v_class = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.cons((SubLObject)wordnet_proxy.$sym6$PROGN, defs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 2312L)
    public static SubLObject deflink(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = (SubLObject)wordnet_proxy.NIL;
        SubLObject link = (SubLObject)wordnet_proxy.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wordnet_proxy.$list7);
        function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wordnet_proxy.$list7);
        link = current.first();
        current = current.rest();
        if (wordnet_proxy.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.$sym8$DEFINE_PUBLIC, function, (SubLObject)wordnet_proxy.$list9, (SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.$sym10$RET, (SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.$sym11$FIM, (SubLObject)wordnet_proxy.$sym12$PROXY, (SubLObject)wordnet_proxy.$list13, link)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wordnet_proxy.$list7);
        return (SubLObject)wordnet_proxy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 2425L)
    public static SubLObject subloop_reserved_initialize_wordnet_proxy_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym15$OBJECT, (SubLObject)wordnet_proxy.$sym17$INSTANCE_COUNT, (SubLObject)wordnet_proxy.ZERO_INTEGER);
        return (SubLObject)wordnet_proxy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 2425L)
    public static SubLObject subloop_reserved_initialize_wordnet_proxy_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym15$OBJECT, (SubLObject)wordnet_proxy.$sym19$ISOLATED_P, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym15$OBJECT, (SubLObject)wordnet_proxy.$sym20$INSTANCE_NUMBER, (SubLObject)wordnet_proxy.NIL);
        return (SubLObject)wordnet_proxy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 2425L)
    public static SubLObject wordnet_proxy_p(final SubLObject v_wordnet_proxy) {
        return classes.subloop_instanceof_class(v_wordnet_proxy, (SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 3117L)
    public static SubLObject wordnet_proxy_absolute_key_method(final SubLObject self) {
        return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.$str24$class, methods.funcall_instance_method_with_0_args(self, (SubLObject)wordnet_proxy.$sym25$WN_CLASS)), methods.funcall_instance_method_with_0_args(self, (SubLObject)wordnet_proxy.$sym26$RELATIVE_KEY));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 3264L)
    public static SubLObject wordnet_proxy_senses_method(final SubLObject self) {
        return methods.funcall_instance_method_with_1_args(self, (SubLObject)wordnet_proxy.$sym30$INVOKE, (SubLObject)wordnet_proxy.$str31$getSenses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 3363L)
    public static SubLObject wordnet_proxy_synsets_method(final SubLObject self) {
        SubLObject synsets = (SubLObject)wordnet_proxy.NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)wordnet_proxy.$sym28$SENSES);
        SubLObject sense = (SubLObject)wordnet_proxy.NIL;
        sense = cdolist_list_var.first();
        while (wordnet_proxy.NIL != cdolist_list_var) {
            synsets = (SubLObject)ConsesLow.cons(instances.get_slot(sense, (SubLObject)wordnet_proxy.$sym35$SYNSET), synsets);
            cdolist_list_var = cdolist_list_var.rest();
            sense = cdolist_list_var.first();
        }
        return synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 3675L)
    public static SubLObject wordnet_proxy_links_method(final SubLObject self, final SubLObject type) {
        return methods.funcall_instance_method_with_2_args(self, (SubLObject)wordnet_proxy.$sym30$INVOKE, (SubLObject)wordnet_proxy.$str40$getPointerTargets, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.$str41$pointerType, type)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 3810L)
    public static SubLObject wordnet_proxy_invoke_method(final SubLObject self, final SubLObject method, SubLObject params) {
        if (params == wordnet_proxy.UNPROVIDED) {
            params = (SubLObject)wordnet_proxy.NIL;
        }
        return Eval.eval(external_interfaces.invoke_wordnet(ConsesLow.append(methods.funcall_instance_method_with_0_args(self, (SubLObject)wordnet_proxy.$sym22$ABSOLUTE_KEY), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.$str45$method, method)), params), (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4009L)
    public static SubLObject get_word_proxy_pos(final SubLObject word_proxy) {
        return classes.subloop_get_access_protected_instance_slot(word_proxy, (SubLObject)wordnet_proxy.TWO_INTEGER, (SubLObject)wordnet_proxy.$sym49$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4009L)
    public static SubLObject set_word_proxy_pos(final SubLObject word_proxy, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_proxy, value, (SubLObject)wordnet_proxy.TWO_INTEGER, (SubLObject)wordnet_proxy.$sym49$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4009L)
    public static SubLObject get_word_proxy_form(final SubLObject word_proxy) {
        return classes.subloop_get_access_protected_instance_slot(word_proxy, (SubLObject)wordnet_proxy.ONE_INTEGER, (SubLObject)wordnet_proxy.$sym50$FORM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4009L)
    public static SubLObject set_word_proxy_form(final SubLObject word_proxy, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_proxy, value, (SubLObject)wordnet_proxy.ONE_INTEGER, (SubLObject)wordnet_proxy.$sym50$FORM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4009L)
    public static SubLObject subloop_reserved_initialize_word_proxy_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym15$OBJECT, (SubLObject)wordnet_proxy.$sym17$INSTANCE_COUNT, (SubLObject)wordnet_proxy.ZERO_INTEGER);
        return (SubLObject)wordnet_proxy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4009L)
    public static SubLObject subloop_reserved_initialize_word_proxy_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym15$OBJECT, (SubLObject)wordnet_proxy.$sym19$ISOLATED_P, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym15$OBJECT, (SubLObject)wordnet_proxy.$sym20$INSTANCE_NUMBER, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$sym50$FORM, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$sym49$POS, (SubLObject)wordnet_proxy.NIL);
        return (SubLObject)wordnet_proxy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4009L)
    public static SubLObject word_proxy_p(final SubLObject word_proxy) {
        return classes.subloop_instanceof_class(word_proxy, (SubLObject)wordnet_proxy.$sym47$WORD_PROXY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4430L)
    public static SubLObject word_proxy_wn_class_method(final SubLObject self) {
        return (SubLObject)wordnet_proxy.$str54$word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4504L)
    public static SubLObject word_proxy_relative_key_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject pos = get_word_proxy_pos(self);
        final SubLObject form = get_word_proxy_form(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym57$OUTER_CATCH_FOR_WORD_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym57$OUTER_CATCH_FOR_WORD_PROXY_METHOD, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.$str58$pos, pos), (SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.$str59$form, form)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_proxy_pos(self, pos);
                    set_word_proxy_form(self, form);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym57$OUTER_CATCH_FOR_WORD_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4606L)
    public static SubLObject word_proxy_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject form = get_word_proxy_form(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym64$OUTER_CATCH_FOR_WORD_PROXY_METHOD);
            try {
                streams_high.write_string((SubLObject)wordnet_proxy.$str65$__WORD_PROXY_, stream, (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED);
                streams_high.write_string(form, stream, (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED);
                streams_high.write_string((SubLObject)wordnet_proxy.$str66$_, stream, (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym64$OUTER_CATCH_FOR_WORD_PROXY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_proxy_form(self, form);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym64$OUTER_CATCH_FOR_WORD_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 4801L)
    public static SubLObject word_proxy_links_method(final SubLObject self, final SubLObject type) {
        SubLObject res = (SubLObject)wordnet_proxy.NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)wordnet_proxy.$sym28$SENSES);
        SubLObject sense = (SubLObject)wordnet_proxy.NIL;
        sense = cdolist_list_var.first();
        while (wordnet_proxy.NIL != cdolist_list_var) {
            res = ConsesLow.append(methods.funcall_instance_method_with_1_args(sense, (SubLObject)wordnet_proxy.$sym37$LINKS, type), res);
            cdolist_list_var = cdolist_list_var.rest();
            sense = cdolist_list_var.first();
        }
        return res;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5006L)
    public static SubLObject word_proxy_pos_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject pos = get_word_proxy_pos(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym72$OUTER_CATCH_FOR_WORD_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym72$OUTER_CATCH_FOR_WORD_PROXY_METHOD, pos);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_proxy_pos(self, pos);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym72$OUTER_CATCH_FOR_WORD_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5069L)
    public static SubLObject word_proxy_form_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject form = get_word_proxy_form(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym75$OUTER_CATCH_FOR_WORD_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym75$OUTER_CATCH_FOR_WORD_PROXY_METHOD, form);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_proxy_form(self, form);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym75$OUTER_CATCH_FOR_WORD_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5134L)
    public static SubLObject word_proxy_equal_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject pos = get_word_proxy_pos(self);
        final SubLObject form = get_word_proxy_form(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym79$OUTER_CATCH_FOR_WORD_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym79$OUTER_CATCH_FOR_WORD_PROXY_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(wordnet_proxy.NIL != word_proxy_p(v_object) && form.equal(methods.funcall_instance_method_with_0_args(v_object, (SubLObject)wordnet_proxy.$sym50$FORM)) && pos.equal(methods.funcall_instance_method_with_0_args(v_object, (SubLObject)wordnet_proxy.$sym49$POS))));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_word_proxy_pos(self, pos);
                    set_word_proxy_form(self, form);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym79$OUTER_CATCH_FOR_WORD_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
    public static SubLObject get_synset_proxy_gloss(final SubLObject synset_proxy) {
        return classes.subloop_get_access_protected_instance_slot(synset_proxy, (SubLObject)wordnet_proxy.THREE_INTEGER, (SubLObject)wordnet_proxy.$sym83$GLOSS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
    public static SubLObject set_synset_proxy_gloss(final SubLObject synset_proxy, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(synset_proxy, value, (SubLObject)wordnet_proxy.THREE_INTEGER, (SubLObject)wordnet_proxy.$sym83$GLOSS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
    public static SubLObject get_synset_proxy_offset(final SubLObject synset_proxy) {
        return classes.subloop_get_access_protected_instance_slot(synset_proxy, (SubLObject)wordnet_proxy.TWO_INTEGER, (SubLObject)wordnet_proxy.$sym84$OFFSET);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
    public static SubLObject set_synset_proxy_offset(final SubLObject synset_proxy, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(synset_proxy, value, (SubLObject)wordnet_proxy.TWO_INTEGER, (SubLObject)wordnet_proxy.$sym84$OFFSET);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
    public static SubLObject get_synset_proxy_pos(final SubLObject synset_proxy) {
        return classes.subloop_get_access_protected_instance_slot(synset_proxy, (SubLObject)wordnet_proxy.ONE_INTEGER, (SubLObject)wordnet_proxy.$sym49$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
    public static SubLObject set_synset_proxy_pos(final SubLObject synset_proxy, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(synset_proxy, value, (SubLObject)wordnet_proxy.ONE_INTEGER, (SubLObject)wordnet_proxy.$sym49$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
    public static SubLObject subloop_reserved_initialize_synset_proxy_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym15$OBJECT, (SubLObject)wordnet_proxy.$sym17$INSTANCE_COUNT, (SubLObject)wordnet_proxy.ZERO_INTEGER);
        return (SubLObject)wordnet_proxy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
    public static SubLObject subloop_reserved_initialize_synset_proxy_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym15$OBJECT, (SubLObject)wordnet_proxy.$sym19$ISOLATED_P, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym15$OBJECT, (SubLObject)wordnet_proxy.$sym20$INSTANCE_NUMBER, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$sym49$POS, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$sym84$OFFSET, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$sym83$GLOSS, (SubLObject)wordnet_proxy.NIL);
        return (SubLObject)wordnet_proxy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5304L)
    public static SubLObject synset_proxy_p(final SubLObject synset_proxy) {
        return classes.subloop_instanceof_class(synset_proxy, (SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 5760L)
    public static SubLObject synset_proxy_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_synset_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject offset = get_synset_proxy_offset(self);
        final SubLObject pos = get_synset_proxy_pos(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym88$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD);
            try {
                streams_high.write_string((SubLObject)wordnet_proxy.$str89$__SYNSET_PROXY_, stream, (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED);
                streams_high.write_string(pos, stream, (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED);
                streams_high.write_string((SubLObject)wordnet_proxy.$str90$_, stream, (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED);
                print_high.princ(offset, stream);
                streams_high.write_string((SubLObject)wordnet_proxy.$str66$_, stream, (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym88$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_synset_proxy_offset(self, offset);
                    set_synset_proxy_pos(self, pos);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_synset_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym88$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_synset_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6010L)
    public static SubLObject synset_proxy_wn_class_method(final SubLObject self) {
        return (SubLObject)wordnet_proxy.$str93$synset;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6088L)
    public static SubLObject synset_proxy_relative_key_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_synset_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject offset = get_synset_proxy_offset(self);
        final SubLObject pos = get_synset_proxy_pos(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym96$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym96$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.$str58$pos, pos), (SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.$str97$offset, offset)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_synset_proxy_offset(self, offset);
                    set_synset_proxy_pos(self, pos);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_synset_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym96$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_synset_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6196L)
    public static SubLObject synset_proxy_pos_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_synset_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject pos = get_synset_proxy_pos(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym99$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym99$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD, pos);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_synset_proxy_pos(self, pos);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_synset_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym99$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_synset_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6261L)
    public static SubLObject synset_proxy_offset_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_synset_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject offset = get_synset_proxy_offset(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym102$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym102$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD, offset);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_synset_proxy_offset(self, offset);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_synset_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym102$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_synset_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6332L)
    public static SubLObject synset_proxy_gloss_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_synset_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject gloss = get_synset_proxy_gloss(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym105$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym105$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD, gloss);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_synset_proxy_gloss(self, gloss);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_synset_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym105$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_synset_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6401L)
    public static SubLObject synset_proxy_equal_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_synset_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject offset = get_synset_proxy_offset(self);
        final SubLObject pos = get_synset_proxy_pos(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym108$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym108$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(wordnet_proxy.NIL != synset_proxy_p(v_object) && offset.numE(methods.funcall_instance_method_with_0_args(v_object, (SubLObject)wordnet_proxy.$sym84$OFFSET)) && pos.equal(methods.funcall_instance_method_with_0_args(v_object, (SubLObject)wordnet_proxy.$sym49$POS))));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_synset_proxy_offset(self, offset);
                    set_synset_proxy_pos(self, pos);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_synset_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym108$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_synset_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6575L)
    public static SubLObject get_sense_proxy_form(final SubLObject sense_proxy) {
        return classes.subloop_get_access_protected_instance_slot(sense_proxy, (SubLObject)wordnet_proxy.TWO_INTEGER, (SubLObject)wordnet_proxy.$sym50$FORM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6575L)
    public static SubLObject set_sense_proxy_form(final SubLObject sense_proxy, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sense_proxy, value, (SubLObject)wordnet_proxy.TWO_INTEGER, (SubLObject)wordnet_proxy.$sym50$FORM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6575L)
    public static SubLObject get_sense_proxy_synset(final SubLObject sense_proxy) {
        return classes.subloop_get_access_protected_instance_slot(sense_proxy, (SubLObject)wordnet_proxy.ONE_INTEGER, (SubLObject)wordnet_proxy.$sym35$SYNSET);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6575L)
    public static SubLObject set_sense_proxy_synset(final SubLObject sense_proxy, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sense_proxy, value, (SubLObject)wordnet_proxy.ONE_INTEGER, (SubLObject)wordnet_proxy.$sym35$SYNSET);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6575L)
    public static SubLObject subloop_reserved_initialize_sense_proxy_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym15$OBJECT, (SubLObject)wordnet_proxy.$sym17$INSTANCE_COUNT, (SubLObject)wordnet_proxy.ZERO_INTEGER);
        return (SubLObject)wordnet_proxy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6575L)
    public static SubLObject subloop_reserved_initialize_sense_proxy_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym15$OBJECT, (SubLObject)wordnet_proxy.$sym19$ISOLATED_P, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym15$OBJECT, (SubLObject)wordnet_proxy.$sym20$INSTANCE_NUMBER, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$sym35$SYNSET, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$sym50$FORM, (SubLObject)wordnet_proxy.NIL);
        return (SubLObject)wordnet_proxy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 6575L)
    public static SubLObject sense_proxy_p(final SubLObject sense_proxy) {
        return classes.subloop_instanceof_class(sense_proxy, (SubLObject)wordnet_proxy.$sym110$SENSE_PROXY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 7095L)
    public static SubLObject sense_proxy_equal(final SubLObject sense1, final SubLObject sense2) {
        assert wordnet_proxy.NIL != sense_proxy_p(sense1) : sense1;
        return methods.funcall_instance_method_with_1_args(sense1, (SubLObject)wordnet_proxy.EQUAL, sense2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 7346L)
    public static SubLObject sense_proxy_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sense_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject form = get_sense_proxy_form(self);
        final SubLObject synset = get_sense_proxy_synset(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym116$OUTER_CATCH_FOR_SENSE_PROXY_METHOD);
            try {
                streams_high.write_string((SubLObject)wordnet_proxy.$str117$__SENSE_PROXY_, stream, (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED);
                streams_high.write_string(methods.funcall_instance_method_with_0_args(self, (SubLObject)wordnet_proxy.$sym50$FORM), stream, (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED);
                streams_high.write_string((SubLObject)wordnet_proxy.$str90$_, stream, (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED);
                print_high.princ(synset, stream);
                streams_high.write_string((SubLObject)wordnet_proxy.$str66$_, stream, (SubLObject)wordnet_proxy.UNPROVIDED, (SubLObject)wordnet_proxy.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym116$OUTER_CATCH_FOR_SENSE_PROXY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sense_proxy_form(self, form);
                    set_sense_proxy_synset(self, synset);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sense_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym116$OUTER_CATCH_FOR_SENSE_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sense_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 7607L)
    public static SubLObject sense_proxy_wn_class_method(final SubLObject self) {
        return (SubLObject)wordnet_proxy.$str120$sense;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 7683L)
    public static SubLObject sense_proxy_relative_key_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sense_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject form = get_sense_proxy_form(self);
        final SubLObject synset = get_sense_proxy_synset(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym123$OUTER_CATCH_FOR_SENSE_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym123$OUTER_CATCH_FOR_SENSE_PROXY_METHOD, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.$str59$form, form), methods.funcall_instance_method_with_0_args(synset, (SubLObject)wordnet_proxy.$sym26$RELATIVE_KEY)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sense_proxy_form(self, form);
                    set_sense_proxy_synset(self, synset);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sense_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym123$OUTER_CATCH_FOR_SENSE_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sense_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 7812L)
    public static SubLObject sense_proxy_senses_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 7890L)
    public static SubLObject sense_proxy_form_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sense_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject form = get_sense_proxy_form(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym127$OUTER_CATCH_FOR_SENSE_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym127$OUTER_CATCH_FOR_SENSE_PROXY_METHOD, form);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sense_proxy_form(self, form);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sense_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym127$OUTER_CATCH_FOR_SENSE_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sense_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 7956L)
    public static SubLObject sense_proxy_pos_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sense_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject synset = get_sense_proxy_synset(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym130$OUTER_CATCH_FOR_SENSE_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym130$OUTER_CATCH_FOR_SENSE_PROXY_METHOD, methods.funcall_instance_method_with_0_args(synset, (SubLObject)wordnet_proxy.$sym49$POS));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sense_proxy_synset(self, synset);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sense_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym130$OUTER_CATCH_FOR_SENSE_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sense_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8034L)
    public static SubLObject sense_proxy_word_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sense_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject form = get_sense_proxy_form(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym134$OUTER_CATCH_FOR_SENSE_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym134$OUTER_CATCH_FOR_SENSE_PROXY_METHOD, new_word_proxy(form, methods.funcall_instance_method_with_0_args(self, (SubLObject)wordnet_proxy.$sym49$POS)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sense_proxy_form(self, form);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sense_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym134$OUTER_CATCH_FOR_SENSE_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sense_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8133L)
    public static SubLObject sense_proxy_num_method(final SubLObject self) {
        SubLObject i = (SubLObject)wordnet_proxy.ZERO_INTEGER;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(self, (SubLObject)wordnet_proxy.$sym132$WORD), (SubLObject)wordnet_proxy.$sym28$SENSES);
        SubLObject sense = (SubLObject)wordnet_proxy.NIL;
        sense = cdolist_list_var.first();
        while (wordnet_proxy.NIL != cdolist_list_var) {
            i = Numbers.add(i, (SubLObject)wordnet_proxy.ONE_INTEGER);
            if (wordnet_proxy.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)wordnet_proxy.EQUAL, sense)) {
                return i;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sense = cdolist_list_var.first();
        }
        return (SubLObject)wordnet_proxy.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8316L)
    public static SubLObject sense_proxy_equal_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sense_proxy_method = (SubLObject)wordnet_proxy.NIL;
        final SubLObject synset = get_sense_proxy_synset(self);
        try {
            thread.throwStack.push(wordnet_proxy.$sym140$OUTER_CATCH_FOR_SENSE_PROXY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wordnet_proxy.$sym140$OUTER_CATCH_FOR_SENSE_PROXY_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(wordnet_proxy.NIL != sense_proxy_p(v_object) && wordnet_proxy.NIL != methods.funcall_instance_method_with_1_args(synset, (SubLObject)wordnet_proxy.EQUAL, methods.funcall_instance_method_with_0_args(v_object, (SubLObject)wordnet_proxy.$sym33$SYNSETS).first())));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_proxy.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sense_proxy_synset(self, synset);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sense_proxy_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wordnet_proxy.$sym140$OUTER_CATCH_FOR_SENSE_PROXY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sense_proxy_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8470L)
    public static SubLObject synset_proxy_initialize_method(final SubLObject self) {
        wordnet_proxy_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8470L)
    public static SubLObject sense_proxy_initialize_method(final SubLObject self) {
        wordnet_proxy_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8470L)
    public static SubLObject word_proxy_initialize_method(final SubLObject self) {
        wordnet_proxy_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8470L)
    public static SubLObject wordnet_proxy_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8583L)
    public static SubLObject new_word_proxy(final SubLObject form, final SubLObject pos) {
        final SubLObject proxy = object.new_class_instance((SubLObject)wordnet_proxy.$sym47$WORD_PROXY);
        set_word_proxy_form(proxy, form);
        set_word_proxy_pos(proxy, pos);
        return proxy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 8827L)
    public static SubLObject new_sense_proxy(final SubLObject synset, final SubLObject form) {
        final SubLObject proxy = object.new_class_instance((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY);
        set_sense_proxy_synset(proxy, synset);
        set_sense_proxy_form(proxy, form);
        return proxy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9026L)
    public static SubLObject new_synset_proxy(final SubLObject pos, final SubLObject offset, SubLObject gloss) {
        if (gloss == wordnet_proxy.UNPROVIDED) {
            gloss = (SubLObject)wordnet_proxy.NIL;
        }
        final SubLObject proxy = object.new_class_instance((SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY);
        set_synset_proxy_pos(proxy, pos);
        set_synset_proxy_offset(proxy, offset);
        if (wordnet_proxy.NIL == gloss) {
            gloss = methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym30$INVOKE, (SubLObject)wordnet_proxy.$str147$gloss);
        }
        set_synset_proxy_gloss(proxy, gloss);
        return proxy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9351L)
    public static SubLObject new_synset(final SubLObject pos, final SubLObject offset) {
        return new_synset_proxy(pos, offset, (SubLObject)wordnet_proxy.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9431L)
    public static SubLObject new_adjective(final SubLObject form) {
        return new_word_proxy(form, (SubLObject)wordnet_proxy.$str148$adjective);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9511L)
    public static SubLObject new_noun(final SubLObject form) {
        return new_word_proxy(form, (SubLObject)wordnet_proxy.$str149$noun);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9581L)
    public static SubLObject new_verb(final SubLObject form) {
        return new_word_proxy(form, (SubLObject)wordnet_proxy.$str150$verb);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9651L)
    public static SubLObject new_adverb(final SubLObject form) {
        return new_word_proxy(form, (SubLObject)wordnet_proxy.$str151$adverb);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9725L)
    public static SubLObject antonyms(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str152$antonym);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9755L)
    public static SubLObject hypernyms(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str153$hypernym);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9786L)
    public static SubLObject hyponyms(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str154$hyponym);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9815L)
    public static SubLObject attributes(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str155$attribute);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9848L)
    public static SubLObject also_see(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str156$also_see);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9878L)
    public static SubLObject entailments(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str157$entailment);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9914L)
    public static SubLObject causes(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str158$cause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9940L)
    public static SubLObject verb_groups(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str159$verb_group);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 9976L)
    public static SubLObject member_meronyms(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str160$member_meronym);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10020L)
    public static SubLObject substance_meronyms(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str161$substance_meronym);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10070L)
    public static SubLObject part_meronyms(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str162$part_meronym);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10110L)
    public static SubLObject member_holonyms(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str163$member_holonym);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10154L)
    public static SubLObject substance_holonyms(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str164$substance_holonym);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10204L)
    public static SubLObject part_holonyms(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str165$part_holonym);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10244L)
    public static SubLObject similar(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str166$similar);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10273L)
    public static SubLObject participle_of(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str167$participle_of);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wordnet-proxy.lisp", position = 10314L)
    public static SubLObject pertainyms(final SubLObject proxy) {
        return methods.funcall_instance_method_with_1_args(proxy, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$str168$pertainym);
    }
    
    public static SubLObject declare_wordnet_proxy_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "default_initializer", "DEFAULT-INITIALIZER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "default_initializers", "DEFAULT-INITIALIZERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "deflink", "DEFLINK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "subloop_reserved_initialize_wordnet_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-PROXY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "subloop_reserved_initialize_wordnet_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-PROXY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "wordnet_proxy_p", "WORDNET-PROXY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "wordnet_proxy_absolute_key_method", "WORDNET-PROXY-ABSOLUTE-KEY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "wordnet_proxy_senses_method", "WORDNET-PROXY-SENSES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "wordnet_proxy_synsets_method", "WORDNET-PROXY-SYNSETS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "wordnet_proxy_links_method", "WORDNET-PROXY-LINKS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "wordnet_proxy_invoke_method", "WORDNET-PROXY-INVOKE-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "get_word_proxy_pos", "GET-WORD-PROXY-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "set_word_proxy_pos", "SET-WORD-PROXY-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "get_word_proxy_form", "GET-WORD-PROXY-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "set_word_proxy_form", "SET-WORD-PROXY-FORM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "subloop_reserved_initialize_word_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-WORD-PROXY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "subloop_reserved_initialize_word_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-WORD-PROXY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "word_proxy_p", "WORD-PROXY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "word_proxy_wn_class_method", "WORD-PROXY-WN-CLASS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "word_proxy_relative_key_method", "WORD-PROXY-RELATIVE-KEY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "word_proxy_print_method", "WORD-PROXY-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "word_proxy_links_method", "WORD-PROXY-LINKS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "word_proxy_pos_method", "WORD-PROXY-POS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "word_proxy_form_method", "WORD-PROXY-FORM-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "word_proxy_equal_method", "WORD-PROXY-EQUAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "get_synset_proxy_gloss", "GET-SYNSET-PROXY-GLOSS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "set_synset_proxy_gloss", "SET-SYNSET-PROXY-GLOSS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "get_synset_proxy_offset", "GET-SYNSET-PROXY-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "set_synset_proxy_offset", "SET-SYNSET-PROXY-OFFSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "get_synset_proxy_pos", "GET-SYNSET-PROXY-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "set_synset_proxy_pos", "SET-SYNSET-PROXY-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "subloop_reserved_initialize_synset_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-SYNSET-PROXY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "subloop_reserved_initialize_synset_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-SYNSET-PROXY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "synset_proxy_p", "SYNSET-PROXY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "synset_proxy_print_method", "SYNSET-PROXY-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "synset_proxy_wn_class_method", "SYNSET-PROXY-WN-CLASS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "synset_proxy_relative_key_method", "SYNSET-PROXY-RELATIVE-KEY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "synset_proxy_pos_method", "SYNSET-PROXY-POS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "synset_proxy_offset_method", "SYNSET-PROXY-OFFSET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "synset_proxy_gloss_method", "SYNSET-PROXY-GLOSS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "synset_proxy_equal_method", "SYNSET-PROXY-EQUAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "get_sense_proxy_form", "GET-SENSE-PROXY-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "set_sense_proxy_form", "SET-SENSE-PROXY-FORM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "get_sense_proxy_synset", "GET-SENSE-PROXY-SYNSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "set_sense_proxy_synset", "SET-SENSE-PROXY-SYNSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "subloop_reserved_initialize_sense_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-SENSE-PROXY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "subloop_reserved_initialize_sense_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-SENSE-PROXY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "sense_proxy_p", "SENSE-PROXY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "sense_proxy_equal", "SENSE-PROXY-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "sense_proxy_print_method", "SENSE-PROXY-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "sense_proxy_wn_class_method", "SENSE-PROXY-WN-CLASS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "sense_proxy_relative_key_method", "SENSE-PROXY-RELATIVE-KEY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "sense_proxy_senses_method", "SENSE-PROXY-SENSES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "sense_proxy_form_method", "SENSE-PROXY-FORM-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "sense_proxy_pos_method", "SENSE-PROXY-POS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "sense_proxy_word_method", "SENSE-PROXY-WORD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "sense_proxy_num_method", "SENSE-PROXY-NUM-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "sense_proxy_equal_method", "SENSE-PROXY-EQUAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "synset_proxy_initialize_method", "SYNSET-PROXY-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "sense_proxy_initialize_method", "SENSE-PROXY-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "word_proxy_initialize_method", "WORD-PROXY-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "wordnet_proxy_initialize_method", "WORDNET-PROXY-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "new_word_proxy", "NEW-WORD-PROXY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "new_sense_proxy", "NEW-SENSE-PROXY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "new_synset_proxy", "NEW-SYNSET-PROXY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "new_synset", "NEW-SYNSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "new_adjective", "NEW-ADJECTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "new_noun", "NEW-NOUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "new_verb", "NEW-VERB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "new_adverb", "NEW-ADVERB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "antonyms", "ANTONYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "hypernyms", "HYPERNYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "hyponyms", "HYPONYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "attributes", "ATTRIBUTES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "also_see", "ALSO-SEE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "entailments", "ENTAILMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "causes", "CAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "verb_groups", "VERB-GROUPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "member_meronyms", "MEMBER-MERONYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "substance_meronyms", "SUBSTANCE-MERONYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "part_meronyms", "PART-MERONYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "member_holonyms", "MEMBER-HOLONYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "substance_holonyms", "SUBSTANCE-HOLONYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "part_holonyms", "PART-HOLONYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "similar", "SIMILAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "participle_of", "PARTICIPLE-OF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wordnet_proxy", "pertainyms", "PERTAINYMS", 1, 0, false);
        return (SubLObject)wordnet_proxy.NIL;
    }
    
    public static SubLObject init_wordnet_proxy_file() {
        return (SubLObject)wordnet_proxy.NIL;
    }
    
    public static SubLObject setup_wordnet_proxy_file() {
        classes.subloop_new_class((SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$sym15$OBJECT, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.T, (SubLObject)wordnet_proxy.$list16);
        classes.class_set_implements_slot_listeners((SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$sym18$SUBLOOP_RESERVED_INITIALIZE_WORDNET_PROXY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$sym21$SUBLOOP_RESERVED_INITIALIZE_WORDNET_PROXY_INSTANCE);
        subloop_reserved_initialize_wordnet_proxy_class((SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym22$ABSOLUTE_KEY, (SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list23);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$sym22$ABSOLUTE_KEY, (SubLObject)wordnet_proxy.$sym27$WORDNET_PROXY_ABSOLUTE_KEY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym28$SENSES, (SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list29);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$sym28$SENSES, (SubLObject)wordnet_proxy.$sym32$WORDNET_PROXY_SENSES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym33$SYNSETS, (SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list34);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$sym33$SYNSETS, (SubLObject)wordnet_proxy.$sym36$WORDNET_PROXY_SYNSETS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.$list38, (SubLObject)wordnet_proxy.$list39);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$sym42$WORDNET_PROXY_LINKS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym30$INVOKE, (SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.$list43, (SubLObject)wordnet_proxy.$list44);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$sym30$INVOKE, (SubLObject)wordnet_proxy.$sym46$WORDNET_PROXY_INVOKE_METHOD);
        classes.subloop_new_class((SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list48);
        classes.class_set_implements_slot_listeners((SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$sym51$SUBLOOP_RESERVED_INITIALIZE_WORD_PROXY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$sym52$SUBLOOP_RESERVED_INITIALIZE_WORD_PROXY_INSTANCE);
        subloop_reserved_initialize_word_proxy_class((SubLObject)wordnet_proxy.$sym47$WORD_PROXY);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym25$WN_CLASS, (SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list53);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$sym25$WN_CLASS, (SubLObject)wordnet_proxy.$sym55$WORD_PROXY_WN_CLASS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym26$RELATIVE_KEY, (SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list56);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$sym26$RELATIVE_KEY, (SubLObject)wordnet_proxy.$sym60$WORD_PROXY_RELATIVE_KEY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym61$PRINT, (SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.$list62, (SubLObject)wordnet_proxy.$list63);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$sym61$PRINT, (SubLObject)wordnet_proxy.$sym67$WORD_PROXY_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.$list38, (SubLObject)wordnet_proxy.$list68);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$sym37$LINKS, (SubLObject)wordnet_proxy.$sym69$WORD_PROXY_LINKS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym49$POS, (SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$list70, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list71);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$sym49$POS, (SubLObject)wordnet_proxy.$sym73$WORD_PROXY_POS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym50$FORM, (SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$list70, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list74);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$sym50$FORM, (SubLObject)wordnet_proxy.$sym76$WORD_PROXY_FORM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.EQUAL, (SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$list70, (SubLObject)wordnet_proxy.$list77, (SubLObject)wordnet_proxy.$list78);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.EQUAL, (SubLObject)wordnet_proxy.$sym80$WORD_PROXY_EQUAL_METHOD);
        classes.subloop_new_class((SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list82);
        classes.class_set_implements_slot_listeners((SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$sym85$SUBLOOP_RESERVED_INITIALIZE_SYNSET_PROXY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$sym86$SUBLOOP_RESERVED_INITIALIZE_SYNSET_PROXY_INSTANCE);
        subloop_reserved_initialize_synset_proxy_class((SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym61$PRINT, (SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.$list62, (SubLObject)wordnet_proxy.$list87);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$sym61$PRINT, (SubLObject)wordnet_proxy.$sym91$SYNSET_PROXY_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym25$WN_CLASS, (SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list92);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$sym25$WN_CLASS, (SubLObject)wordnet_proxy.$sym94$SYNSET_PROXY_WN_CLASS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym26$RELATIVE_KEY, (SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list95);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$sym26$RELATIVE_KEY, (SubLObject)wordnet_proxy.$sym98$SYNSET_PROXY_RELATIVE_KEY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym49$POS, (SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$list70, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list71);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$sym49$POS, (SubLObject)wordnet_proxy.$sym100$SYNSET_PROXY_POS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym84$OFFSET, (SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$list70, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list101);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$sym84$OFFSET, (SubLObject)wordnet_proxy.$sym103$SYNSET_PROXY_OFFSET_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym83$GLOSS, (SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$list70, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list104);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$sym83$GLOSS, (SubLObject)wordnet_proxy.$sym106$SYNSET_PROXY_GLOSS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.EQUAL, (SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$list70, (SubLObject)wordnet_proxy.$list77, (SubLObject)wordnet_proxy.$list107);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.EQUAL, (SubLObject)wordnet_proxy.$sym109$SYNSET_PROXY_EQUAL_METHOD);
        classes.subloop_new_class((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list111);
        classes.class_set_implements_slot_listeners((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$sym112$SUBLOOP_RESERVED_INITIALIZE_SENSE_PROXY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$sym113$SUBLOOP_RESERVED_INITIALIZE_SENSE_PROXY_INSTANCE);
        subloop_reserved_initialize_sense_proxy_class((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym61$PRINT, (SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.$list62, (SubLObject)wordnet_proxy.$list115);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$sym61$PRINT, (SubLObject)wordnet_proxy.$sym118$SENSE_PROXY_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym25$WN_CLASS, (SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list119);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$sym25$WN_CLASS, (SubLObject)wordnet_proxy.$sym121$SENSE_PROXY_WN_CLASS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym26$RELATIVE_KEY, (SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list122);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$sym26$RELATIVE_KEY, (SubLObject)wordnet_proxy.$sym124$SENSE_PROXY_RELATIVE_KEY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym28$SENSES, (SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list125);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$sym28$SENSES, (SubLObject)wordnet_proxy.$sym126$SENSE_PROXY_SENSES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym50$FORM, (SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$list70, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list74);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$sym50$FORM, (SubLObject)wordnet_proxy.$sym128$SENSE_PROXY_FORM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym49$POS, (SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$list70, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list129);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$sym49$POS, (SubLObject)wordnet_proxy.$sym131$SENSE_PROXY_POS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym132$WORD, (SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$list70, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list133);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$sym132$WORD, (SubLObject)wordnet_proxy.$sym135$SENSE_PROXY_WORD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym136$NUM, (SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$list70, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list137);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$sym136$NUM, (SubLObject)wordnet_proxy.$sym138$SENSE_PROXY_NUM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.EQUAL, (SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$list70, (SubLObject)wordnet_proxy.$list77, (SubLObject)wordnet_proxy.$list139);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.EQUAL, (SubLObject)wordnet_proxy.$sym141$SENSE_PROXY_EQUAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym2$INITIALIZE, (SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list142);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym81$SYNSET_PROXY, (SubLObject)wordnet_proxy.$sym2$INITIALIZE, (SubLObject)wordnet_proxy.$sym143$SYNSET_PROXY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym2$INITIALIZE, (SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list142);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym110$SENSE_PROXY, (SubLObject)wordnet_proxy.$sym2$INITIALIZE, (SubLObject)wordnet_proxy.$sym144$SENSE_PROXY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym2$INITIALIZE, (SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list142);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym47$WORD_PROXY, (SubLObject)wordnet_proxy.$sym2$INITIALIZE, (SubLObject)wordnet_proxy.$sym145$WORD_PROXY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wordnet_proxy.$sym2$INITIALIZE, (SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$list3, (SubLObject)wordnet_proxy.NIL, (SubLObject)wordnet_proxy.$list142);
        methods.subloop_register_instance_method((SubLObject)wordnet_proxy.$sym14$WORDNET_PROXY, (SubLObject)wordnet_proxy.$sym2$INITIALIZE, (SubLObject)wordnet_proxy.$sym146$WORDNET_PROXY_INITIALIZE_METHOD);
        return (SubLObject)wordnet_proxy.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_wordnet_proxy_file();
    }
    
    @Override
	public void initializeVariables() {
        init_wordnet_proxy_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_wordnet_proxy_file();
    }
    
    static {
        me = (SubLFile)new wordnet_proxy();
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"));
        $sym1$DEF_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD");
        $sym2$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list4 = ConsesLow.list((SubLObject)wordnet_proxy.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym5$DEFAULT_INITIALIZER = SubLObjectFactory.makeSymbol("DEFAULT-INITIALIZER");
        $sym6$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"));
        $sym8$DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROXY"));
        $sym10$RET = SubLObjectFactory.makeSymbol("RET");
        $sym11$FIM = SubLObjectFactory.makeSymbol("FIM");
        $sym12$PROXY = SubLObjectFactory.makeSymbol("PROXY");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LINKS"));
        $sym14$WORDNET_PROXY = SubLObjectFactory.makeSymbol("WORDNET-PROXY");
        $sym15$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list16 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RELATIVE-KEY"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ABSOLUTE-KEY"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("WN-CLASS"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INVOKE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("PARAMS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SENSES"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SYNSETS"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym17$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym18$SUBLOOP_RESERVED_INITIALIZE_WORDNET_PROXY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORDNET-PROXY-CLASS");
        $sym19$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym20$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym21$SUBLOOP_RESERVED_INITIALIZE_WORDNET_PROXY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORDNET-PROXY-INSTANCE");
        $sym22$ABSOLUTE_KEY = SubLObjectFactory.makeSymbol("ABSOLUTE-KEY");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeString("class"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WN-CLASS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATIVE-KEY"))))));
        $str24$class = SubLObjectFactory.makeString("class");
        $sym25$WN_CLASS = SubLObjectFactory.makeSymbol("WN-CLASS");
        $sym26$RELATIVE_KEY = SubLObjectFactory.makeSymbol("RELATIVE-KEY");
        $sym27$WORDNET_PROXY_ABSOLUTE_KEY_METHOD = SubLObjectFactory.makeSymbol("WORDNET-PROXY-ABSOLUTE-KEY-METHOD");
        $sym28$SENSES = SubLObjectFactory.makeSymbol("SENSES");
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INVOKE")), (SubLObject)SubLObjectFactory.makeString("getSenses"))));
        $sym30$INVOKE = SubLObjectFactory.makeSymbol("INVOKE");
        $str31$getSenses = SubLObjectFactory.makeString("getSenses");
        $sym32$WORDNET_PROXY_SENSES_METHOD = SubLObjectFactory.makeSymbol("WORDNET-PROXY-SENSES-METHOD");
        $sym33$SYNSETS = SubLObjectFactory.makeSymbol("SYNSETS");
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYNSETS"), (SubLObject)wordnet_proxy.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SENSES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SYNSET"))), (SubLObject)SubLObjectFactory.makeSymbol("SYNSETS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SYNSETS"))));
        $sym35$SYNSET = SubLObjectFactory.makeSymbol("SYNSET");
        $sym36$WORDNET_PROXY_SYNSETS_METHOD = SubLObjectFactory.makeSymbol("WORDNET-PROXY-SYNSETS-METHOD");
        $sym37$LINKS = SubLObjectFactory.makeSymbol("LINKS");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INVOKE")), (SubLObject)SubLObjectFactory.makeString("getPointerTargets"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeString("pointerType"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))))));
        $str40$getPointerTargets = SubLObjectFactory.makeString("getPointerTargets");
        $str41$pointerType = SubLObjectFactory.makeString("pointerType");
        $sym42$WORDNET_PROXY_LINKS_METHOD = SubLObjectFactory.makeSymbol("WORDNET-PROXY-LINKS-METHOD");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("PARAMS"));
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INVOKE-WORDNET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ABSOLUTE-KEY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeString("method"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"))), (SubLObject)SubLObjectFactory.makeSymbol("PARAMS"))))));
        $str45$method = SubLObjectFactory.makeString("method");
        $sym46$WORDNET_PROXY_INVOKE_METHOD = SubLObjectFactory.makeSymbol("WORDNET-PROXY-INVOKE-METHOD");
        $sym47$WORD_PROXY = SubLObjectFactory.makeSymbol("WORD-PROXY");
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RELATIVE-KEY"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)wordnet_proxy.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym49$POS = SubLObjectFactory.makeSymbol("POS");
        $sym50$FORM = SubLObjectFactory.makeSymbol("FORM");
        $sym51$SUBLOOP_RESERVED_INITIALIZE_WORD_PROXY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORD-PROXY-CLASS");
        $sym52$SUBLOOP_RESERVED_INITIALIZE_WORD_PROXY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORD-PROXY-INSTANCE");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeString("word")));
        $str54$word = SubLObjectFactory.makeString("word");
        $sym55$WORD_PROXY_WN_CLASS_METHOD = SubLObjectFactory.makeSymbol("WORD-PROXY-WN-CLASS-METHOD");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeString("pos"), (SubLObject)SubLObjectFactory.makeSymbol("POS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeString("form"), (SubLObject)SubLObjectFactory.makeSymbol("FORM")))));
        $sym57$OUTER_CATCH_FOR_WORD_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-PROXY-METHOD");
        $str58$pos = SubLObjectFactory.makeString("pos");
        $str59$form = SubLObjectFactory.makeString("form");
        $sym60$WORD_PROXY_RELATIVE_KEY_METHOD = SubLObjectFactory.makeSymbol("WORD-PROXY-RELATIVE-KEY-METHOD");
        $sym61$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list63 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<WORD-PROXY "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym64$OUTER_CATCH_FOR_WORD_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-PROXY-METHOD");
        $str65$__WORD_PROXY_ = SubLObjectFactory.makeString("#<WORD-PROXY ");
        $str66$_ = SubLObjectFactory.makeString(">");
        $sym67$WORD_PROXY_PRINT_METHOD = SubLObjectFactory.makeSymbol("WORD-PROXY-PRINT-METHOD");
        $list68 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RES"), (SubLObject)wordnet_proxy.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SENSES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)SubLObjectFactory.makeSymbol("RES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LINKS")), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("RES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RES"))));
        $sym69$WORD_PROXY_LINKS_METHOD = SubLObjectFactory.makeSymbol("WORD-PROXY-LINKS-METHOD");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("POS")));
        $sym72$OUTER_CATCH_FOR_WORD_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-PROXY-METHOD");
        $sym73$WORD_PROXY_POS_METHOD = SubLObjectFactory.makeSymbol("WORD-PROXY-POS-METHOD");
        $list74 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("FORM")));
        $sym75$OUTER_CATCH_FOR_WORD_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-PROXY-METHOD");
        $sym76$WORD_PROXY_FORM_METHOD = SubLObjectFactory.makeSymbol("WORD-PROXY-FORM-METHOD");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $list78 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-PROXY-P"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORM")))), (SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("POS")))))));
        $sym79$OUTER_CATCH_FOR_WORD_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-PROXY-METHOD");
        $sym80$WORD_PROXY_EQUAL_METHOD = SubLObjectFactory.makeSymbol("WORD-PROXY-EQUAL-METHOD");
        $sym81$SYNSET_PROXY = SubLObjectFactory.makeSymbol("SYNSET-PROXY");
        $list82 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OFFSET"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GLOSS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RELATIVE-KEY"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GLOSS"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)wordnet_proxy.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym83$GLOSS = SubLObjectFactory.makeSymbol("GLOSS");
        $sym84$OFFSET = SubLObjectFactory.makeSymbol("OFFSET");
        $sym85$SUBLOOP_RESERVED_INITIALIZE_SYNSET_PROXY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SYNSET-PROXY-CLASS");
        $sym86$SUBLOOP_RESERVED_INITIALIZE_SYNSET_PROXY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SYNSET-PROXY-INSTANCE");
        $list87 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<SYNSET-PROXY "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(" "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym88$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SYNSET-PROXY-METHOD");
        $str89$__SYNSET_PROXY_ = SubLObjectFactory.makeString("#<SYNSET-PROXY ");
        $str90$_ = SubLObjectFactory.makeString(" ");
        $sym91$SYNSET_PROXY_PRINT_METHOD = SubLObjectFactory.makeSymbol("SYNSET-PROXY-PRINT-METHOD");
        $list92 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeString("synset")));
        $str93$synset = SubLObjectFactory.makeString("synset");
        $sym94$SYNSET_PROXY_WN_CLASS_METHOD = SubLObjectFactory.makeSymbol("SYNSET-PROXY-WN-CLASS-METHOD");
        $list95 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeString("pos"), (SubLObject)SubLObjectFactory.makeSymbol("POS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeString("offset"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET")))));
        $sym96$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SYNSET-PROXY-METHOD");
        $str97$offset = SubLObjectFactory.makeString("offset");
        $sym98$SYNSET_PROXY_RELATIVE_KEY_METHOD = SubLObjectFactory.makeSymbol("SYNSET-PROXY-RELATIVE-KEY-METHOD");
        $sym99$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SYNSET-PROXY-METHOD");
        $sym100$SYNSET_PROXY_POS_METHOD = SubLObjectFactory.makeSymbol("SYNSET-PROXY-POS-METHOD");
        $list101 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET")));
        $sym102$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SYNSET-PROXY-METHOD");
        $sym103$SYNSET_PROXY_OFFSET_METHOD = SubLObjectFactory.makeSymbol("SYNSET-PROXY-OFFSET-METHOD");
        $list104 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("GLOSS")));
        $sym105$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SYNSET-PROXY-METHOD");
        $sym106$SYNSET_PROXY_GLOSS_METHOD = SubLObjectFactory.makeSymbol("SYNSET-PROXY-GLOSS-METHOD");
        $list107 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYNSET-PROXY-P"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET")))), (SubLObject)ConsesLow.list((SubLObject)wordnet_proxy.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("POS")))))));
        $sym108$OUTER_CATCH_FOR_SYNSET_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SYNSET-PROXY-METHOD");
        $sym109$SYNSET_PROXY_EQUAL_METHOD = SubLObjectFactory.makeSymbol("SYNSET-PROXY-EQUAL-METHOD");
        $sym110$SENSE_PROXY = SubLObjectFactory.makeSymbol("SENSE-PROXY");
        $list111 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYNSET"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RELATIVE-KEY"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)wordnet_proxy.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)wordnet_proxy.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym112$SUBLOOP_RESERVED_INITIALIZE_SENSE_PROXY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SENSE-PROXY-CLASS");
        $sym113$SUBLOOP_RESERVED_INITIALIZE_SENSE_PROXY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SENSE-PROXY-INSTANCE");
        $sym114$SENSE_PROXY_P = SubLObjectFactory.makeSymbol("SENSE-PROXY-P");
        $list115 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<SENSE-PROXY "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORM"))), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(" "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("SYNSET"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym116$OUTER_CATCH_FOR_SENSE_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SENSE-PROXY-METHOD");
        $str117$__SENSE_PROXY_ = SubLObjectFactory.makeString("#<SENSE-PROXY ");
        $sym118$SENSE_PROXY_PRINT_METHOD = SubLObjectFactory.makeSymbol("SENSE-PROXY-PRINT-METHOD");
        $list119 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeString("sense")));
        $str120$sense = SubLObjectFactory.makeString("sense");
        $sym121$SENSE_PROXY_WN_CLASS_METHOD = SubLObjectFactory.makeSymbol("SENSE-PROXY-WN-CLASS-METHOD");
        $list122 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeString("form"), (SubLObject)SubLObjectFactory.makeSymbol("FORM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SYNSET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATIVE-KEY"))))));
        $sym123$OUTER_CATCH_FOR_SENSE_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SENSE-PROXY-METHOD");
        $sym124$SENSE_PROXY_RELATIVE_KEY_METHOD = SubLObjectFactory.makeSymbol("SENSE-PROXY-RELATIVE-KEY-METHOD");
        $list125 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym126$SENSE_PROXY_SENSES_METHOD = SubLObjectFactory.makeSymbol("SENSE-PROXY-SENSES-METHOD");
        $sym127$OUTER_CATCH_FOR_SENSE_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SENSE-PROXY-METHOD");
        $sym128$SENSE_PROXY_FORM_METHOD = SubLObjectFactory.makeSymbol("SENSE-PROXY-FORM-METHOD");
        $list129 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SYNSET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("POS")))));
        $sym130$OUTER_CATCH_FOR_SENSE_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SENSE-PROXY-METHOD");
        $sym131$SENSE_PROXY_POS_METHOD = SubLObjectFactory.makeSymbol("SENSE-PROXY-POS-METHOD");
        $sym132$WORD = SubLObjectFactory.makeSymbol("WORD");
        $list133 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-WORD-PROXY"), (SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("POS"))))));
        $sym134$OUTER_CATCH_FOR_SENSE_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SENSE-PROXY-METHOD");
        $sym135$SENSE_PROXY_WORD_METHOD = SubLObjectFactory.makeSymbol("SENSE-PROXY-WORD-METHOD");
        $sym136$NUM = SubLObjectFactory.makeSymbol("NUM");
        $list137 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)wordnet_proxy.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SENSES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)wordnet_proxy.EQUAL), (SubLObject)SubLObjectFactory.makeSymbol("SENSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("I"))))));
        $sym138$SENSE_PROXY_NUM_METHOD = SubLObjectFactory.makeSymbol("SENSE-PROXY-NUM-METHOD");
        $list139 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENSE-PROXY-P"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SYNSET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)wordnet_proxy.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SYNSETS"))))))));
        $sym140$OUTER_CATCH_FOR_SENSE_PROXY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SENSE-PROXY-METHOD");
        $sym141$SENSE_PROXY_EQUAL_METHOD = SubLObjectFactory.makeSymbol("SENSE-PROXY-EQUAL-METHOD");
        $list142 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym143$SYNSET_PROXY_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SYNSET-PROXY-INITIALIZE-METHOD");
        $sym144$SENSE_PROXY_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SENSE-PROXY-INITIALIZE-METHOD");
        $sym145$WORD_PROXY_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("WORD-PROXY-INITIALIZE-METHOD");
        $sym146$WORDNET_PROXY_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("WORDNET-PROXY-INITIALIZE-METHOD");
        $str147$gloss = SubLObjectFactory.makeString("gloss");
        $str148$adjective = SubLObjectFactory.makeString("adjective");
        $str149$noun = SubLObjectFactory.makeString("noun");
        $str150$verb = SubLObjectFactory.makeString("verb");
        $str151$adverb = SubLObjectFactory.makeString("adverb");
        $str152$antonym = SubLObjectFactory.makeString("antonym");
        $str153$hypernym = SubLObjectFactory.makeString("hypernym");
        $str154$hyponym = SubLObjectFactory.makeString("hyponym");
        $str155$attribute = SubLObjectFactory.makeString("attribute");
        $str156$also_see = SubLObjectFactory.makeString("also see");
        $str157$entailment = SubLObjectFactory.makeString("entailment");
        $str158$cause = SubLObjectFactory.makeString("cause");
        $str159$verb_group = SubLObjectFactory.makeString("verb group");
        $str160$member_meronym = SubLObjectFactory.makeString("member meronym");
        $str161$substance_meronym = SubLObjectFactory.makeString("substance meronym");
        $str162$part_meronym = SubLObjectFactory.makeString("part meronym");
        $str163$member_holonym = SubLObjectFactory.makeString("member holonym");
        $str164$substance_holonym = SubLObjectFactory.makeString("substance holonym");
        $str165$part_holonym = SubLObjectFactory.makeString("part holonym");
        $str166$similar = SubLObjectFactory.makeString("similar");
        $str167$participle_of = SubLObjectFactory.makeString("participle of");
        $str168$pertainym = SubLObjectFactory.makeString("pertainym");
    }
}

/*

	Total time: 451 ms
	
*/
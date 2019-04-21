package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_file_dependencies extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_file_dependencies";
    public static final String myFingerPrint = "c94368c3693b993a2d27cc91c79752e6b2254374653110a2fc6fc8cd82fb7237";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 1281L)
    public static SubLSymbol $external_file_definitions$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 1281L)
    public static SubLSymbol $html_emitted_file_dependencies$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 10470L)
    private static SubLSymbol $java_default_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 11990L)
    public static SubLSymbol $html_icon_definitions$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 13066L)
    private static SubLSymbol $html_icon_default_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 13199L)
    private static SubLSymbol $html_missing_icon$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLSymbol $cb_help_definitions$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    private static SubLSymbol $cb_help_default_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLSymbol $cb_icon_definitions$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    private static SubLSymbol $cb_icon_default_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    private static SubLSymbol $cb_missing_icon$;
    private static final SubLSymbol $sym0$_EXTERNAL_FILE_DEFINITIONS_;
    private static final SubLInteger $int1$64;
    private static final SubLSymbol $kw2$UNINITIALIZED;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$DEF_EXTERNAL_FILE;
    private static final SubLSymbol $kw8$BUNDLE;
    private static final SubLSymbol $kw9$DEPENDENCIES;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw13$PATH;
    private static final SubLString $str14$js;
    private static final SubLSymbol $sym15$PROGN;
    private static final SubLSymbol $sym16$PUNLESS;
    private static final SubLSymbol $sym17$EXT_DEP_ENDS_WITH;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$WARN;
    private static final SubLString $str20$Defining_javascript_file__S_witho;
    private static final SubLSymbol $kw21$JS;
    private static final SubLList $list22;
    private static final SubLString $str23$css;
    private static final SubLList $list24;
    private static final SubLString $str25$Defining_CSS_file__S_without___cs;
    private static final SubLSymbol $kw26$CSS;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$CHECK_EXTERNAL_FILE_DEFINITION;
    private static final SubLSymbol $sym30$SETHASH;
    private static final SubLSymbol $sym31$LIST;
    private static final SubLSymbol $kw32$FILENAME;
    private static final SubLSymbol $kw33$TYPE;
    private static final SubLString $str34$Unable_to_define__S_because_of_un;
    private static final SubLString $str35$Redefinition_of_external_file__S_;
    private static final SubLString $str36$Emitting__S_with_no_html_file_dep;
    private static final SubLString $str37$text_javascript;
    private static final SubLString $str38$stylesheet;
    private static final SubLString $str39$text_css;
    private static final SubLString $str40$Unable_to_emit_file__S___S__of_ty;
    private static final SubLSymbol $sym41$UNDEFINED_EXTERNAL_DEPENDENCIES;
    private static final SubLSymbol $sym42$REDUNDANT_DEPENDENCY_;
    private static final SubLList $list43;
    private static final SubLString $str44$java_;
    private static final SubLString $str45$_;
    private static final SubLString $str46$_lib_;
    private static final SubLString $str47$jar;
    private static final SubLString $str48$lib_;
    private static final SubLSymbol $sym49$_HTML_ICON_DEFINITIONS_;
    private static final SubLInteger $int50$32;
    private static final SubLList $list51;
    private static final SubLString $str52$;
    private static final SubLString $str53$missing_gif;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLSymbol $kw56$ID;
    private static final SubLSymbol $kw57$NAME;
    private static final SubLSymbol $kw58$ISMAP;
    private static final SubLSymbol $kw59$HEIGHT;
    private static final SubLSymbol $kw60$WIDTH;
    private static final SubLSymbol $kw61$ALT_OVERRIDE;
    private static final SubLSymbol $kw62$ALIGN_OVERRIDE;
    private static final SubLSymbol $kw63$BORDER_OVERRIDE;
    private static final SubLSymbol $sym64$IMAGE_SRC;
    private static final SubLSymbol $sym65$ALIGN;
    private static final SubLSymbol $sym66$ALT;
    private static final SubLSymbol $sym67$BORDER;
    private static final SubLSymbol $sym68$CCONCATENATE;
    private static final SubLSymbol $sym69$_HTML_IMAGE_DIRECTORY_;
    private static final SubLSymbol $sym70$HTML_ICON_SRC;
    private static final SubLSymbol $sym71$FIF;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$GET_HTML_ICON_ALT_STRING;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$HTML_FANCY_IMAGE;
    private static final SubLSymbol $kw76$ALT;
    private static final SubLSymbol $kw77$ALIGN;
    private static final SubLSymbol $kw78$BORDER;
    private static final SubLSymbol $sym79$_CB_HELP_DEFINITIONS_;
    private static final SubLList $list80;
    private static final SubLString $str81$help_;
    private static final SubLString $str82$Help_file_not_found_for__A;
    private static final SubLSymbol $sym83$_CB_ICON_DEFINITIONS_;
    private static final SubLString $str84$cb_;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$IMAGE_SRC;
    private static final SubLSymbol $sym88$ALIGN;
    private static final SubLSymbol $sym89$ALT;
    private static final SubLSymbol $sym90$BORDER;
    private static final SubLSymbol $sym91$CB_ICON_FILE_PATH;
    private static final SubLList $list92;
    private static final SubLSymbol $sym93$CB_GET_ICON_ALT_STRING;
    private static final SubLSymbol $sym94$COMPILE_CB_BROWSER_DEPENDENCIES;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$JAVASCRIPT_KEYWORDS;
    private static final SubLSymbol $sym97$JAVASCRIPT_FILE_PATH;
    private static final SubLSymbol $sym98$HTML_ICON_KEYWORDS;
    private static final SubLSymbol $sym99$HTML_ICON_FILE_PATH;
    private static final SubLSymbol $sym100$CB_HELP_KEYWORDS;
    private static final SubLSymbol $sym101$CB_HELP_FILE_PATH;
    private static final SubLSymbol $sym102$CB_ICON_KEYWORDS;
    private static final SubLSymbol $sym103$CSS_KEYWORDS;
    private static final SubLSymbol $sym104$CSS_FILE_PATH;
    private static final SubLSymbol $sym105$CB_BROWSER_DEPENDENCY_MANIFEST;
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 1281L)
    public static SubLObject with_new_html_file_dependency_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cyc_file_dependencies.$sym3$CLET, (SubLObject)cyc_file_dependencies.$list4, ConsesLow.append(body, (SubLObject)cyc_file_dependencies.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 1281L)
    public static SubLObject with_possibly_new_html_file_dependency_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cyc_file_dependencies.$sym3$CLET, (SubLObject)cyc_file_dependencies.$list5, ConsesLow.append(body, (SubLObject)cyc_file_dependencies.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 2193L)
    public static SubLObject web_bundle(final SubLObject keyword) {
        return emit_external_file_with_dependencies(keyword);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 2193L)
    public static SubLObject def_web_bundle(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject file_keyword = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject dependencies = (SubLObject)cyc_file_dependencies.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list6);
        file_keyword = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list6);
        dependencies = current.first();
        current = current.rest();
        if (cyc_file_dependencies.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym7$DEF_EXTERNAL_FILE, file_keyword, (SubLObject)cyc_file_dependencies.NIL, (SubLObject)cyc_file_dependencies.NIL, (SubLObject)cyc_file_dependencies.$kw8$BUNDLE, (SubLObject)cyc_file_dependencies.$kw9$DEPENDENCIES, dependencies);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_file_dependencies.$list6);
        return (SubLObject)cyc_file_dependencies.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 3090L)
    public static SubLObject javascript(final SubLObject keyword) {
        return emit_external_file_with_dependencies(keyword);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 3090L)
    public static SubLObject def_javascript(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject file_keyword = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject filename = (SubLObject)cyc_file_dependencies.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list10);
        file_keyword = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list10);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject current_$1 = (SubLObject)cyc_file_dependencies.NIL;
        while (cyc_file_dependencies.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_file_dependencies.$list10);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_file_dependencies.$list10);
            if (cyc_file_dependencies.NIL == conses_high.member(current_$1, (SubLObject)cyc_file_dependencies.$list11, (SubLObject)cyc_file_dependencies.UNPROVIDED, (SubLObject)cyc_file_dependencies.UNPROVIDED)) {
                bad = (SubLObject)cyc_file_dependencies.T;
            }
            if (current_$1 == cyc_file_dependencies.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cyc_file_dependencies.NIL != bad && cyc_file_dependencies.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_file_dependencies.$list10);
        }
        final SubLObject path_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw13$PATH, current);
        final SubLObject path = (SubLObject)((cyc_file_dependencies.NIL != path_tail) ? conses_high.cadr(path_tail) : cyc_file_dependencies.$str14$js);
        final SubLObject dependencies_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw9$DEPENDENCIES, current);
        final SubLObject dependencies = (SubLObject)((cyc_file_dependencies.NIL != dependencies_tail) ? conses_high.cadr(dependencies_tail) : cyc_file_dependencies.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym15$PROGN, (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym16$PUNLESS, (SubLObject)ConsesLow.listS((SubLObject)cyc_file_dependencies.$sym17$EXT_DEP_ENDS_WITH, filename, (SubLObject)cyc_file_dependencies.$list18), (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym19$WARN, (SubLObject)cyc_file_dependencies.$str20$Defining_javascript_file__S_witho, filename)), (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym7$DEF_EXTERNAL_FILE, file_keyword, path, filename, (SubLObject)cyc_file_dependencies.$kw21$JS, (SubLObject)cyc_file_dependencies.$kw9$DEPENDENCIES, dependencies));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 3090L)
    public static SubLObject javascript_keywords() {
        return external_dependencies_of_type((SubLObject)cyc_file_dependencies.$kw21$JS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 3090L)
    public static SubLObject get_javascript_filename(final SubLObject keyword) {
        return get_external_dependency_filename(keyword);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 3090L)
    public static SubLObject javascript_file_path(final SubLObject keyword) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)cyc_file_dependencies.ZERO_INTEGER), get_external_dependency_data(keyword));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 4620L)
    public static SubLObject css(final SubLObject keyword) {
        return emit_external_file_with_dependencies(keyword);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 4620L)
    public static SubLObject def_css(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject file_keyword = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject filename = (SubLObject)cyc_file_dependencies.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list22);
        file_keyword = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list22);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject current_$2 = (SubLObject)cyc_file_dependencies.NIL;
        while (cyc_file_dependencies.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_file_dependencies.$list22);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_file_dependencies.$list22);
            if (cyc_file_dependencies.NIL == conses_high.member(current_$2, (SubLObject)cyc_file_dependencies.$list11, (SubLObject)cyc_file_dependencies.UNPROVIDED, (SubLObject)cyc_file_dependencies.UNPROVIDED)) {
                bad = (SubLObject)cyc_file_dependencies.T;
            }
            if (current_$2 == cyc_file_dependencies.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cyc_file_dependencies.NIL != bad && cyc_file_dependencies.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_file_dependencies.$list22);
        }
        final SubLObject path_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw13$PATH, current);
        final SubLObject path = (SubLObject)((cyc_file_dependencies.NIL != path_tail) ? conses_high.cadr(path_tail) : cyc_file_dependencies.$str23$css);
        final SubLObject dependencies_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw9$DEPENDENCIES, current);
        final SubLObject dependencies = (SubLObject)((cyc_file_dependencies.NIL != dependencies_tail) ? conses_high.cadr(dependencies_tail) : cyc_file_dependencies.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym15$PROGN, (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym16$PUNLESS, (SubLObject)ConsesLow.listS((SubLObject)cyc_file_dependencies.$sym17$EXT_DEP_ENDS_WITH, filename, (SubLObject)cyc_file_dependencies.$list24), (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym19$WARN, (SubLObject)cyc_file_dependencies.$str25$Defining_CSS_file__S_without___cs, filename)), (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym7$DEF_EXTERNAL_FILE, file_keyword, path, filename, (SubLObject)cyc_file_dependencies.$kw26$CSS, (SubLObject)cyc_file_dependencies.$kw9$DEPENDENCIES, dependencies));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 4620L)
    public static SubLObject css_keywords() {
        return external_dependencies_of_type((SubLObject)cyc_file_dependencies.$kw26$CSS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 4620L)
    public static SubLObject get_css_filename(final SubLObject keyword) {
        return get_external_dependency_filename(keyword);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 4620L)
    public static SubLObject css_file_path(final SubLObject keyword) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)cyc_file_dependencies.ZERO_INTEGER), get_external_dependency_data(keyword));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
    public static SubLObject def_external_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject file_keyword = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject path = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject filename = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject file_type = (SubLObject)cyc_file_dependencies.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list27);
        file_keyword = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list27);
        path = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list27);
        filename = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list27);
        file_type = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject current_$3 = (SubLObject)cyc_file_dependencies.NIL;
        while (cyc_file_dependencies.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_file_dependencies.$list27);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_file_dependencies.$list27);
            if (cyc_file_dependencies.NIL == conses_high.member(current_$3, (SubLObject)cyc_file_dependencies.$list28, (SubLObject)cyc_file_dependencies.UNPROVIDED, (SubLObject)cyc_file_dependencies.UNPROVIDED)) {
                bad = (SubLObject)cyc_file_dependencies.T;
            }
            if (current_$3 == cyc_file_dependencies.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cyc_file_dependencies.NIL != bad && cyc_file_dependencies.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_file_dependencies.$list27);
        }
        final SubLObject dependencies_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw9$DEPENDENCIES, current);
        final SubLObject dependencies = (SubLObject)((cyc_file_dependencies.NIL != dependencies_tail) ? conses_high.cadr(dependencies_tail) : cyc_file_dependencies.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym15$PROGN, (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym29$CHECK_EXTERNAL_FILE_DEFINITION, file_keyword, path, filename, file_type, dependencies), (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym30$SETHASH, file_keyword, (SubLObject)cyc_file_dependencies.$sym0$_EXTERNAL_FILE_DEFINITIONS_, (SubLObject)ConsesLow.list(new SubLObject[] { cyc_file_dependencies.$sym31$LIST, cyc_file_dependencies.$kw13$PATH, path, cyc_file_dependencies.$kw32$FILENAME, filename, cyc_file_dependencies.$kw9$DEPENDENCIES, dependencies, cyc_file_dependencies.$kw33$TYPE, file_type })));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
    public static SubLObject check_external_file_definition(final SubLObject file_keyword, final SubLObject path, final SubLObject filename, final SubLObject file_type, final SubLObject dependencies) {
        if (cyc_file_dependencies.NIL != undefined_external_dependencies(dependencies)) {
            Errors.error((SubLObject)cyc_file_dependencies.$str34$Unable_to_define__S_because_of_un, file_keyword, undefined_external_dependencies(dependencies));
        }
        else if (cyc_file_dependencies.NIL != Hashtables.gethash(file_keyword, cyc_file_dependencies.$external_file_definitions$.getGlobalValue(), (SubLObject)cyc_file_dependencies.UNPROVIDED) && cyc_file_dependencies.NIL == redundant_dependencyP(path, filename, dependencies, Hashtables.gethash(file_keyword, cyc_file_dependencies.$external_file_definitions$.getGlobalValue(), (SubLObject)cyc_file_dependencies.UNPROVIDED))) {
            Errors.warn((SubLObject)cyc_file_dependencies.$str35$Redefinition_of_external_file__S_, new SubLObject[] { file_keyword, Hashtables.gethash(file_keyword, cyc_file_dependencies.$external_file_definitions$.getGlobalValue(), (SubLObject)cyc_file_dependencies.UNPROVIDED), filename, path, file_type, dependencies });
        }
        return (SubLObject)cyc_file_dependencies.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
    public static SubLObject emit_external_file_with_dependencies(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) != cyc_file_dependencies.$kw2$UNINITIALIZED && cyc_file_dependencies.NIL != subl_promotions.memberP(keyword, cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)cyc_file_dependencies.EQ), (SubLObject)cyc_file_dependencies.UNPROVIDED)) {
            return (SubLObject)cyc_file_dependencies.NIL;
        }
        if (cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cyc_file_dependencies.$kw2$UNINITIALIZED) {
            Errors.warn((SubLObject)cyc_file_dependencies.$str36$Emitting__S_with_no_html_file_dep, keyword);
        }
        thread.resetMultipleValues();
        final SubLObject file_path = get_external_dependency_data(keyword);
        final SubLObject file_type = thread.secondMultipleValue();
        final SubLObject dependencies = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = dependencies;
        SubLObject d = (SubLObject)cyc_file_dependencies.NIL;
        d = cdolist_list_var.first();
        while (cyc_file_dependencies.NIL != cdolist_list_var) {
            emit_external_file_with_dependencies(d);
            cdolist_list_var = cdolist_list_var.rest();
            d = cdolist_list_var.first();
        }
        final SubLObject _prev_bind_0 = html_macros.$suppress_html_source_readability_terpriP$.currentBinding(thread);
        try {
            html_macros.$suppress_html_source_readability_terpriP$.bind((SubLObject)cyc_file_dependencies.T, thread);
            final SubLObject pcase_var = file_type;
            if (pcase_var.eql((SubLObject)cyc_file_dependencies.$kw21$JS)) {
                html_utilities.html_source_readability_terpri((SubLObject)cyc_file_dependencies.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_script_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_file_dependencies.UNPROVIDED);
                html_utilities.html_markup(file_path);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_file_dependencies.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_script_type$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_file_dependencies.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cyc_file_dependencies.$str37$text_javascript);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_file_dependencies.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_file_dependencies.UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cyc_file_dependencies.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
            }
            else if (pcase_var.eql((SubLObject)cyc_file_dependencies.$kw26$CSS)) {
                html_utilities.html_source_readability_terpri((SubLObject)cyc_file_dependencies.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_link_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_link_rel$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_file_dependencies.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cyc_file_dependencies.$str38$stylesheet);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_file_dependencies.UNPROVIDED);
                if (cyc_file_dependencies.NIL != file_path) {
                    html_utilities.html_markup(html_macros.$html_link_href$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_file_dependencies.UNPROVIDED);
                    html_utilities.html_markup(file_path);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_file_dependencies.UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_link_type$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_file_dependencies.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cyc_file_dependencies.$str39$text_css);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cyc_file_dependencies.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cyc_file_dependencies.UNPROVIDED);
            }
            else if (!pcase_var.eql((SubLObject)cyc_file_dependencies.$kw8$BUNDLE)) {
                Errors.error((SubLObject)cyc_file_dependencies.$str40$Unable_to_emit_file__S___S__of_ty, keyword, file_path, file_type);
            }
        }
        finally {
            html_macros.$suppress_html_source_readability_terpriP$.rebind(_prev_bind_0, thread);
        }
        if (cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) != cyc_file_dependencies.$kw2$UNINITIALIZED) {
            cyc_file_dependencies.$html_emitted_file_dependencies$.setDynamicValue((SubLObject)ConsesLow.cons(keyword, cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)cyc_file_dependencies.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
    public static SubLObject external_dependencies_of_type(final SubLObject type) {
        SubLObject keywords = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject key = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject val = (SubLObject)cyc_file_dependencies.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cyc_file_dependencies.$external_file_definitions$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                val = Hashtables.getEntryValue(cdohash_entry);
                if (conses_high.getf(val, (SubLObject)cyc_file_dependencies.$kw33$TYPE, (SubLObject)cyc_file_dependencies.UNPROVIDED).eql(type)) {
                    keywords = (SubLObject)ConsesLow.cons(key, keywords);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return keywords;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
    public static SubLObject get_external_dependency_filename(final SubLObject keyword) {
        return conses_high.getf(Hashtables.gethash(keyword, cyc_file_dependencies.$external_file_definitions$.getGlobalValue(), (SubLObject)cyc_file_dependencies.UNPROVIDED), (SubLObject)cyc_file_dependencies.$kw32$FILENAME, (SubLObject)cyc_file_dependencies.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
    public static SubLObject undefined_external_dependencies(final SubLObject dependency_list) {
        SubLObject undefined = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject cdolist_list_var = dependency_list;
        SubLObject dependency_keyword = (SubLObject)cyc_file_dependencies.NIL;
        dependency_keyword = cdolist_list_var.first();
        while (cyc_file_dependencies.NIL != cdolist_list_var) {
            if (cyc_file_dependencies.NIL == external_dependency_definedP(dependency_keyword)) {
                undefined = (SubLObject)ConsesLow.cons(dependency_keyword, undefined);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dependency_keyword = cdolist_list_var.first();
        }
        return undefined;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
    public static SubLObject external_dependency_definedP(final SubLObject keyword) {
        return Hashtables.gethash(keyword, cyc_file_dependencies.$external_file_definitions$.getGlobalValue(), (SubLObject)cyc_file_dependencies.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
    public static SubLObject redundant_dependencyP(final SubLObject path, final SubLObject filename, final SubLObject dependencies, final SubLObject existing_definition) {
        return (SubLObject)SubLObjectFactory.makeBoolean(conses_high.getf(existing_definition, (SubLObject)cyc_file_dependencies.$kw32$FILENAME, (SubLObject)cyc_file_dependencies.UNPROVIDED).equal(filename) && conses_high.getf(existing_definition, (SubLObject)cyc_file_dependencies.$kw13$PATH, (SubLObject)cyc_file_dependencies.UNPROVIDED).equal(path) && conses_high.getf(existing_definition, (SubLObject)cyc_file_dependencies.$kw9$DEPENDENCIES, (SubLObject)cyc_file_dependencies.UNPROVIDED).equal(dependencies));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
    public static SubLObject get_external_dependency_data(final SubLObject keyword) {
        final SubLObject file_def = Hashtables.gethash(keyword, cyc_file_dependencies.$external_file_definitions$.getGlobalValue(), (SubLObject)cyc_file_dependencies.UNPROVIDED);
        final SubLObject path = conses_high.getf(file_def, (SubLObject)cyc_file_dependencies.$kw13$PATH, (SubLObject)cyc_file_dependencies.UNPROVIDED);
        final SubLObject filename = conses_high.getf(file_def, (SubLObject)cyc_file_dependencies.$kw32$FILENAME, (SubLObject)cyc_file_dependencies.UNPROVIDED);
        final SubLObject type = conses_high.getf(file_def, (SubLObject)cyc_file_dependencies.$kw33$TYPE, (SubLObject)cyc_file_dependencies.UNPROVIDED);
        final SubLObject dependencies = conses_high.getf(file_def, (SubLObject)cyc_file_dependencies.$kw9$DEPENDENCIES, (SubLObject)cyc_file_dependencies.UNPROVIDED);
        return Values.values(doc_filepath(path, filename), type, dependencies);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
    public static SubLObject doc_filepath(final SubLObject relative_path, final SubLObject filename) {
        if (!relative_path.isString() || !filename.isString()) {
            return (SubLObject)cyc_file_dependencies.NIL;
        }
        return file_utilities.relative_filename(Sequences.cconcatenate(file_utilities.possibly_append_path_separator_char(system_parameters.cyc_documentation_url()), file_utilities.possibly_append_path_separator_char(relative_path)), filename, (SubLObject)cyc_file_dependencies.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
    public static SubLObject ext_dep_ends_with(final SubLObject string, final SubLObject suffix) {
        final SubLObject str_length = Sequences.length(string);
        final SubLObject suff_length = Sequences.length(suffix);
        return (SubLObject)SubLObjectFactory.makeBoolean(str_length.numGE(suff_length) && Sequences.subseq(string, Numbers.subtract(str_length, suff_length), (SubLObject)cyc_file_dependencies.UNPROVIDED).equal(suffix));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 10470L)
    public static SubLObject java_applet_lib_file_path(final SubLObject java_applet_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.cconcatenate(system_parameters.$http_htdocs_directory$.getDynamicValue(thread), new SubLObject[] { cyc_file_dependencies.$str45$_, cyc_file_dependencies.$java_default_directory$.getGlobalValue(), java_applet_name, cyc_file_dependencies.$str46$_lib_ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 10470L)
    public static SubLObject java_applet_archive_string(final SubLObject java_applet_name) {
        final SubLObject jar_directory = java_applet_lib_file_path(java_applet_name);
        final SubLObject filenames = Filesys.directory(jar_directory, (SubLObject)cyc_file_dependencies.UNPROVIDED);
        SubLObject lib_filenames = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject cdolist_list_var = filenames;
        SubLObject filename = (SubLObject)cyc_file_dependencies.NIL;
        filename = cdolist_list_var.first();
        while (cyc_file_dependencies.NIL != cdolist_list_var) {
            if (cyc_file_dependencies.NIL != string_utilities.ends_with(filename, (SubLObject)cyc_file_dependencies.$str47$jar, (SubLObject)cyc_file_dependencies.UNPROVIDED)) {
                lib_filenames = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)cyc_file_dependencies.$str48$lib_, filename), lib_filenames);
            }
            cdolist_list_var = cdolist_list_var.rest();
            filename = cdolist_list_var.first();
        }
        return string_utilities.bunge(lib_filenames, (SubLObject)Characters.CHAR_comma);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 12191L)
    public static SubLObject html_icon_keywords() {
        return hash_table_utilities.hash_table_keys(cyc_file_dependencies.$html_icon_definitions$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 12281L)
    public static SubLObject def_html_icon(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject icon_keyword = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject filename = (SubLObject)cyc_file_dependencies.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list51);
        icon_keyword = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list51);
        filename = current.first();
        current = current.rest();
        final SubLObject alt_string = (SubLObject)(current.isCons() ? current.first() : cyc_file_dependencies.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cyc_file_dependencies.$list51);
        current = current.rest();
        if (cyc_file_dependencies.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym30$SETHASH, icon_keyword, (SubLObject)cyc_file_dependencies.$sym49$_HTML_ICON_DEFINITIONS_, (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym31$LIST, filename, alt_string));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_file_dependencies.$list51);
        return (SubLObject)cyc_file_dependencies.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 12702L)
    public static SubLObject get_html_icon_filename(final SubLObject icon_keyword) {
        return Hashtables.gethash(icon_keyword, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)cyc_file_dependencies.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 12823L)
    public static SubLObject get_html_icon_alt_string(final SubLObject icon_keyword) {
        return conses_high.second(Hashtables.gethash(icon_keyword, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)cyc_file_dependencies.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 12947L)
    public static SubLObject html_icon_existsP(final SubLObject icon_keyword) {
        return string_utilities.non_empty_stringP(get_html_icon_filename(icon_keyword));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 13367L)
    public static SubLObject html_missing_icon() {
        return cyc_file_dependencies.$html_missing_icon$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 13436L)
    public static SubLObject html_icon_file_path(final SubLObject icon_keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject icon_filename = get_html_icon_filename(icon_keyword);
        return Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), new SubLObject[] { cyc_file_dependencies.$html_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename : html_missing_icon() });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 13722L)
    public static SubLObject html_icon_src(final SubLObject icon_keyword) {
        final SubLObject icon_filename = get_html_icon_filename(icon_keyword);
        return Sequences.cconcatenate(cyc_file_dependencies.$html_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename : html_missing_icon());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14097L)
    public static SubLObject html_icon(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject icon_keyword = (SubLObject)cyc_file_dependencies.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list54);
        icon_keyword = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject current_$5 = (SubLObject)cyc_file_dependencies.NIL;
        while (cyc_file_dependencies.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_file_dependencies.$list54);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_file_dependencies.$list54);
            if (cyc_file_dependencies.NIL == conses_high.member(current_$5, (SubLObject)cyc_file_dependencies.$list55, (SubLObject)cyc_file_dependencies.UNPROVIDED, (SubLObject)cyc_file_dependencies.UNPROVIDED)) {
                bad = (SubLObject)cyc_file_dependencies.T;
            }
            if (current_$5 == cyc_file_dependencies.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cyc_file_dependencies.NIL != bad && cyc_file_dependencies.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_file_dependencies.$list54);
        }
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw56$ID, current);
        final SubLObject id = (SubLObject)((cyc_file_dependencies.NIL != id_tail) ? conses_high.cadr(id_tail) : cyc_file_dependencies.NIL);
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw57$NAME, current);
        final SubLObject name = (SubLObject)((cyc_file_dependencies.NIL != name_tail) ? conses_high.cadr(name_tail) : cyc_file_dependencies.NIL);
        final SubLObject ismap_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw58$ISMAP, current);
        final SubLObject ismap = (SubLObject)((cyc_file_dependencies.NIL != ismap_tail) ? conses_high.cadr(ismap_tail) : cyc_file_dependencies.NIL);
        final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw59$HEIGHT, current);
        final SubLObject height = (SubLObject)((cyc_file_dependencies.NIL != height_tail) ? conses_high.cadr(height_tail) : cyc_file_dependencies.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw60$WIDTH, current);
        final SubLObject width = (SubLObject)((cyc_file_dependencies.NIL != width_tail) ? conses_high.cadr(width_tail) : cyc_file_dependencies.NIL);
        final SubLObject alt_override_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw61$ALT_OVERRIDE, current);
        final SubLObject alt_override = (SubLObject)((cyc_file_dependencies.NIL != alt_override_tail) ? conses_high.cadr(alt_override_tail) : cyc_file_dependencies.NIL);
        final SubLObject align_override_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw62$ALIGN_OVERRIDE, current);
        final SubLObject align_override = (SubLObject)((cyc_file_dependencies.NIL != align_override_tail) ? conses_high.cadr(align_override_tail) : cyc_file_dependencies.NIL);
        final SubLObject border_override_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw63$BORDER_OVERRIDE, current);
        final SubLObject border_override = (SubLObject)((cyc_file_dependencies.NIL != border_override_tail) ? conses_high.cadr(border_override_tail) : cyc_file_dependencies.NIL);
        final SubLObject image_src = (SubLObject)cyc_file_dependencies.$sym64$IMAGE_SRC;
        final SubLObject align = (SubLObject)cyc_file_dependencies.$sym65$ALIGN;
        final SubLObject alt = (SubLObject)cyc_file_dependencies.$sym66$ALT;
        final SubLObject border = (SubLObject)cyc_file_dependencies.$sym67$BORDER;
        return (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(image_src, (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym68$CCONCATENATE, (SubLObject)cyc_file_dependencies.$sym69$_HTML_IMAGE_DIRECTORY_, (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym70$HTML_ICON_SRC, icon_keyword))), (SubLObject)ConsesLow.list(align, (SubLObject)ConsesLow.listS((SubLObject)cyc_file_dependencies.$sym71$FIF, align_override, align_override, (SubLObject)cyc_file_dependencies.$list72)), (SubLObject)ConsesLow.list(alt, (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym71$FIF, alt_override, alt_override, (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym73$GET_HTML_ICON_ALT_STRING, icon_keyword))), (SubLObject)ConsesLow.list(border, (SubLObject)ConsesLow.listS((SubLObject)cyc_file_dependencies.$sym71$FIF, border_override, border_override, (SubLObject)cyc_file_dependencies.$list74))), (SubLObject)ConsesLow.list(new SubLObject[] { cyc_file_dependencies.$sym75$HTML_FANCY_IMAGE, image_src, cyc_file_dependencies.$kw56$ID, id, cyc_file_dependencies.$kw57$NAME, name, cyc_file_dependencies.$kw58$ISMAP, ismap, cyc_file_dependencies.$kw59$HEIGHT, height, cyc_file_dependencies.$kw60$WIDTH, width, cyc_file_dependencies.$kw76$ALT, alt, cyc_file_dependencies.$kw77$ALIGN, align, cyc_file_dependencies.$kw78$BORDER, border }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject cb_help_keywords() {
        return hash_table_utilities.hash_table_keys(cyc_file_dependencies.$cb_help_definitions$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject def_cb_help(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject help_keyword = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject filename = (SubLObject)cyc_file_dependencies.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list80);
        help_keyword = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list80);
        filename = current.first();
        current = current.rest();
        final SubLObject desc_string = (SubLObject)(current.isCons() ? current.first() : cyc_file_dependencies.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cyc_file_dependencies.$list80);
        current = current.rest();
        if (cyc_file_dependencies.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym30$SETHASH, help_keyword, (SubLObject)cyc_file_dependencies.$sym79$_CB_HELP_DEFINITIONS_, (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym31$LIST, filename, desc_string));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_file_dependencies.$list80);
        return (SubLObject)cyc_file_dependencies.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject cb_get_help_filename(final SubLObject help_keyword) {
        return Hashtables.gethash(help_keyword, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)cyc_file_dependencies.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject cb_get_help_desc_string(final SubLObject help_keyword) {
        return conses_high.second(Hashtables.gethash(help_keyword, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)cyc_file_dependencies.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject cb_help_existsP(final SubLObject help_keyword) {
        return string_utilities.non_empty_stringP(cb_get_help_filename(help_keyword));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject cb_help_file_path(final SubLObject help_keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject help_filename = cb_get_help_filename(help_keyword);
        if (!help_filename.isString()) {
            Errors.warn((SubLObject)cyc_file_dependencies.$str82$Help_file_not_found_for__A, help_keyword);
        }
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(system_parameters.$cyc_documentation_url$.getDynamicValue(thread)), new SubLObject[] { cyc_file_dependencies.$str81$help_, format_nil.format_nil_a_no_copy(help_filename) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject cb_icon_keywords() {
        return hash_table_utilities.hash_table_keys(cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject def_cb_icon(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject icon_keyword = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject filename = (SubLObject)cyc_file_dependencies.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list51);
        icon_keyword = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list51);
        filename = current.first();
        current = current.rest();
        final SubLObject alt_string = (SubLObject)(current.isCons() ? current.first() : cyc_file_dependencies.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cyc_file_dependencies.$list51);
        current = current.rest();
        if (cyc_file_dependencies.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym30$SETHASH, icon_keyword, (SubLObject)cyc_file_dependencies.$sym83$_CB_ICON_DEFINITIONS_, (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym31$LIST, filename, alt_string));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_file_dependencies.$list51);
        return (SubLObject)cyc_file_dependencies.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject cb_get_icon_filename(final SubLObject icon_keyword) {
        return Hashtables.gethash(icon_keyword, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)cyc_file_dependencies.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject cb_get_icon_alt_string(final SubLObject icon_keyword) {
        return conses_high.second(Hashtables.gethash(icon_keyword, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)cyc_file_dependencies.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject cb_icon_existsP(final SubLObject icon_keyword) {
        return string_utilities.non_empty_stringP(cb_get_icon_filename(icon_keyword));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject cb_missing_icon() {
        return cyc_file_dependencies.$cb_missing_icon$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject cb_icon_file_path(final SubLObject icon_keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject icon_filename = cb_get_icon_filename(icon_keyword);
        return Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), new SubLObject[] { cyc_file_dependencies.$cb_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename : cyc_file_dependencies.$cb_missing_icon$.getGlobalValue() });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject cb_icon_src(final SubLObject icon_keyword) {
        final SubLObject icon_filename = cb_get_icon_filename(icon_keyword);
        return Sequences.cconcatenate(cyc_file_dependencies.$cb_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename : cyc_file_dependencies.$cb_missing_icon$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
    public static SubLObject cb_icon(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject icon_keyword = (SubLObject)cyc_file_dependencies.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list85);
        icon_keyword = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject current_$6 = (SubLObject)cyc_file_dependencies.NIL;
        while (cyc_file_dependencies.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_file_dependencies.$list85);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_file_dependencies.$list85);
            if (cyc_file_dependencies.NIL == conses_high.member(current_$6, (SubLObject)cyc_file_dependencies.$list86, (SubLObject)cyc_file_dependencies.UNPROVIDED, (SubLObject)cyc_file_dependencies.UNPROVIDED)) {
                bad = (SubLObject)cyc_file_dependencies.T;
            }
            if (current_$6 == cyc_file_dependencies.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cyc_file_dependencies.NIL != bad && cyc_file_dependencies.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_file_dependencies.$list85);
        }
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw57$NAME, current);
        final SubLObject name = (SubLObject)((cyc_file_dependencies.NIL != name_tail) ? conses_high.cadr(name_tail) : cyc_file_dependencies.NIL);
        final SubLObject ismap_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw58$ISMAP, current);
        final SubLObject ismap = (SubLObject)((cyc_file_dependencies.NIL != ismap_tail) ? conses_high.cadr(ismap_tail) : cyc_file_dependencies.NIL);
        final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw59$HEIGHT, current);
        final SubLObject height = (SubLObject)((cyc_file_dependencies.NIL != height_tail) ? conses_high.cadr(height_tail) : cyc_file_dependencies.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw60$WIDTH, current);
        final SubLObject width = (SubLObject)((cyc_file_dependencies.NIL != width_tail) ? conses_high.cadr(width_tail) : cyc_file_dependencies.NIL);
        final SubLObject alt_override_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw61$ALT_OVERRIDE, current);
        final SubLObject alt_override = (SubLObject)((cyc_file_dependencies.NIL != alt_override_tail) ? conses_high.cadr(alt_override_tail) : cyc_file_dependencies.NIL);
        final SubLObject align_override_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw62$ALIGN_OVERRIDE, current);
        final SubLObject align_override = (SubLObject)((cyc_file_dependencies.NIL != align_override_tail) ? conses_high.cadr(align_override_tail) : cyc_file_dependencies.NIL);
        final SubLObject border_override_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_file_dependencies.$kw63$BORDER_OVERRIDE, current);
        final SubLObject border_override = (SubLObject)((cyc_file_dependencies.NIL != border_override_tail) ? conses_high.cadr(border_override_tail) : cyc_file_dependencies.NIL);
        final SubLObject image_src = (SubLObject)cyc_file_dependencies.$sym87$IMAGE_SRC;
        final SubLObject align = (SubLObject)cyc_file_dependencies.$sym88$ALIGN;
        final SubLObject alt = (SubLObject)cyc_file_dependencies.$sym89$ALT;
        final SubLObject border = (SubLObject)cyc_file_dependencies.$sym90$BORDER;
        return (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(image_src, (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym91$CB_ICON_FILE_PATH, icon_keyword)), (SubLObject)ConsesLow.list(align, (SubLObject)ConsesLow.listS((SubLObject)cyc_file_dependencies.$sym71$FIF, align_override, align_override, (SubLObject)cyc_file_dependencies.$list92)), (SubLObject)ConsesLow.list(alt, (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym71$FIF, alt_override, alt_override, (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym93$CB_GET_ICON_ALT_STRING, icon_keyword))), (SubLObject)ConsesLow.list(border, (SubLObject)ConsesLow.listS((SubLObject)cyc_file_dependencies.$sym71$FIF, border_override, border_override, (SubLObject)cyc_file_dependencies.$list74))), (SubLObject)ConsesLow.list(new SubLObject[] { cyc_file_dependencies.$sym75$HTML_FANCY_IMAGE, image_src, cyc_file_dependencies.$kw57$NAME, name, cyc_file_dependencies.$kw58$ISMAP, ismap, cyc_file_dependencies.$kw59$HEIGHT, height, cyc_file_dependencies.$kw60$WIDTH, width, cyc_file_dependencies.$kw76$ALT, alt, cyc_file_dependencies.$kw77$ALIGN, align, cyc_file_dependencies.$kw78$BORDER, border }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 18419L)
    public static SubLObject compile_cb_browser_dependencies(SubLObject justify) {
        if (justify == cyc_file_dependencies.UNPROVIDED) {
            justify = (SubLObject)cyc_file_dependencies.NIL;
        }
        final SubLObject keyword_definitions = compile_cb_browser_dependency_definitions();
        SubLObject paths = (SubLObject)cyc_file_dependencies.NIL;
        SubLObject cdolist_list_var = keyword_definitions;
        SubLObject keyword_definition = (SubLObject)cyc_file_dependencies.NIL;
        keyword_definition = cdolist_list_var.first();
        while (cyc_file_dependencies.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = keyword_definition;
            SubLObject keyword_producer = (SubLObject)cyc_file_dependencies.NIL;
            SubLObject keyword_mapping_fn = (SubLObject)cyc_file_dependencies.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list95);
            keyword_producer = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_file_dependencies.$list95);
            keyword_mapping_fn = current.first();
            current = current.rest();
            if (cyc_file_dependencies.NIL == current) {
                SubLObject cdolist_list_var_$7;
                final SubLObject keywords = cdolist_list_var_$7 = Functions.funcall(keyword_producer);
                SubLObject keyword = (SubLObject)cyc_file_dependencies.NIL;
                keyword = cdolist_list_var_$7.first();
                while (cyc_file_dependencies.NIL != cdolist_list_var_$7) {
                    final SubLObject file_path = cb_browser_dependency_map_keyword_to_path(keyword, keyword_mapping_fn);
                    final SubLObject datum_$8 = (SubLObject)((cyc_file_dependencies.NIL != justify) ? ConsesLow.list(file_path, keyword, keyword_producer) : file_path);
                    paths = (SubLObject)ConsesLow.cons(datum_$8, paths);
                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                    keyword = cdolist_list_var_$7.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_file_dependencies.$list95);
            }
            cdolist_list_var = cdolist_list_var.rest();
            keyword_definition = cdolist_list_var.first();
        }
        return Sequences.nreverse(paths);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 19423L)
    public static SubLObject compile_cb_browser_dependency_definitions() {
        SubLObject keyword_definitions = (SubLObject)cyc_file_dependencies.NIL;
        keyword_definitions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym96$JAVASCRIPT_KEYWORDS, (SubLObject)cyc_file_dependencies.$sym97$JAVASCRIPT_FILE_PATH), keyword_definitions);
        keyword_definitions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym98$HTML_ICON_KEYWORDS, (SubLObject)cyc_file_dependencies.$sym99$HTML_ICON_FILE_PATH), keyword_definitions);
        keyword_definitions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym100$CB_HELP_KEYWORDS, (SubLObject)cyc_file_dependencies.$sym101$CB_HELP_FILE_PATH), keyword_definitions);
        keyword_definitions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym102$CB_ICON_KEYWORDS, (SubLObject)cyc_file_dependencies.$sym91$CB_ICON_FILE_PATH), keyword_definitions);
        keyword_definitions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.$sym103$CSS_KEYWORDS, (SubLObject)cyc_file_dependencies.$sym104$CSS_FILE_PATH), keyword_definitions);
        return Sequences.nreverse(keyword_definitions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 20010L)
    public static SubLObject cb_browser_dependency_map_keyword_to_path(final SubLObject keyword, final SubLObject mapping_fn) {
        SubLObject file_path = Functions.funcall(mapping_fn, keyword);
        if (cyc_file_dependencies.NIL != Characters.charE((SubLObject)Characters.CHAR_slash, string_utilities.first_char(file_path))) {
            file_path = string_utilities.strip_first(file_path);
        }
        return file_path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 20284L)
    public static SubLObject cb_browser_dependency_manifest(SubLObject stream) {
        if (stream == cyc_file_dependencies.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = compile_cb_browser_dependencies((SubLObject)cyc_file_dependencies.UNPROVIDED);
        SubLObject path = (SubLObject)cyc_file_dependencies.NIL;
        path = cdolist_list_var.first();
        while (cyc_file_dependencies.NIL != cdolist_list_var) {
            streams_high.write_string(path, stream, (SubLObject)cyc_file_dependencies.UNPROVIDED, (SubLObject)cyc_file_dependencies.UNPROVIDED);
            streams_high.terpri(stream);
            cdolist_list_var = cdolist_list_var.rest();
            path = cdolist_list_var.first();
        }
        return (SubLObject)cyc_file_dependencies.NIL;
    }
    
    public static SubLObject declare_cyc_file_dependencies_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_file_dependencies", "with_new_html_file_dependency_space", "WITH-NEW-HTML-FILE-DEPENDENCY-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_file_dependencies", "with_possibly_new_html_file_dependency_space", "WITH-POSSIBLY-NEW-HTML-FILE-DEPENDENCY-SPACE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "web_bundle", "WEB-BUNDLE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_file_dependencies", "def_web_bundle", "DEF-WEB-BUNDLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "javascript", "JAVASCRIPT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_file_dependencies", "def_javascript", "DEF-JAVASCRIPT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "javascript_keywords", "JAVASCRIPT-KEYWORDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "get_javascript_filename", "GET-JAVASCRIPT-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "javascript_file_path", "JAVASCRIPT-FILE-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "css", "CSS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_file_dependencies", "def_css", "DEF-CSS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "css_keywords", "CSS-KEYWORDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "get_css_filename", "GET-CSS-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "css_file_path", "CSS-FILE-PATH", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_file_dependencies", "def_external_file", "DEF-EXTERNAL-FILE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "check_external_file_definition", "CHECK-EXTERNAL-FILE-DEFINITION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "emit_external_file_with_dependencies", "EMIT-EXTERNAL-FILE-WITH-DEPENDENCIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "external_dependencies_of_type", "EXTERNAL-DEPENDENCIES-OF-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "get_external_dependency_filename", "GET-EXTERNAL-DEPENDENCY-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "undefined_external_dependencies", "UNDEFINED-EXTERNAL-DEPENDENCIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "external_dependency_definedP", "EXTERNAL-DEPENDENCY-DEFINED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "redundant_dependencyP", "REDUNDANT-DEPENDENCY?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "get_external_dependency_data", "GET-EXTERNAL-DEPENDENCY-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "doc_filepath", "DOC-FILEPATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "ext_dep_ends_with", "EXT-DEP-ENDS-WITH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "java_applet_lib_file_path", "JAVA-APPLET-LIB-FILE-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "java_applet_archive_string", "JAVA-APPLET-ARCHIVE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "html_icon_keywords", "HTML-ICON-KEYWORDS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_file_dependencies", "def_html_icon", "DEF-HTML-ICON");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "get_html_icon_filename", "GET-HTML-ICON-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "get_html_icon_alt_string", "GET-HTML-ICON-ALT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "html_icon_existsP", "HTML-ICON-EXISTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "html_missing_icon", "HTML-MISSING-ICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "html_icon_file_path", "HTML-ICON-FILE-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "html_icon_src", "HTML-ICON-SRC", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_file_dependencies", "html_icon", "HTML-ICON");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_help_keywords", "CB-HELP-KEYWORDS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_file_dependencies", "def_cb_help", "DEF-CB-HELP");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_get_help_filename", "CB-GET-HELP-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_get_help_desc_string", "CB-GET-HELP-DESC-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_help_existsP", "CB-HELP-EXISTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_help_file_path", "CB-HELP-FILE-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_icon_keywords", "CB-ICON-KEYWORDS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_file_dependencies", "def_cb_icon", "DEF-CB-ICON");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_get_icon_filename", "CB-GET-ICON-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_get_icon_alt_string", "CB-GET-ICON-ALT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_icon_existsP", "CB-ICON-EXISTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_missing_icon", "CB-MISSING-ICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_icon_file_path", "CB-ICON-FILE-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_icon_src", "CB-ICON-SRC", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_icon", "CB-ICON");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "compile_cb_browser_dependencies", "COMPILE-CB-BROWSER-DEPENDENCIES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "compile_cb_browser_dependency_definitions", "COMPILE-CB-BROWSER-DEPENDENCY-DEFINITIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_browser_dependency_map_keyword_to_path", "CB-BROWSER-DEPENDENCY-MAP-KEYWORD-TO-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_file_dependencies", "cb_browser_dependency_manifest", "CB-BROWSER-DEPENDENCY-MANIFEST", 0, 1, false);
        return (SubLObject)cyc_file_dependencies.NIL;
    }
    
    public static SubLObject init_cyc_file_dependencies_file() {
        cyc_file_dependencies.$external_file_definitions$ = SubLFiles.deflexical("*EXTERNAL-FILE-DEFINITIONS*", maybeDefault((SubLObject)cyc_file_dependencies.$sym0$_EXTERNAL_FILE_DEFINITIONS_, cyc_file_dependencies.$external_file_definitions$, ()->(Hashtables.make_hash_table((SubLObject)cyc_file_dependencies.$int1$64, (SubLObject)cyc_file_dependencies.UNPROVIDED, (SubLObject)cyc_file_dependencies.UNPROVIDED))));
        cyc_file_dependencies.$html_emitted_file_dependencies$ = SubLFiles.defparameter("*HTML-EMITTED-FILE-DEPENDENCIES*", (SubLObject)cyc_file_dependencies.$kw2$UNINITIALIZED);
        cyc_file_dependencies.$java_default_directory$ = SubLFiles.deflexical("*JAVA-DEFAULT-DIRECTORY*", (SubLObject)cyc_file_dependencies.$str44$java_);
        cyc_file_dependencies.$html_icon_definitions$ = SubLFiles.deflexical("*HTML-ICON-DEFINITIONS*", maybeDefault((SubLObject)cyc_file_dependencies.$sym49$_HTML_ICON_DEFINITIONS_, cyc_file_dependencies.$html_icon_definitions$, ()->(Hashtables.make_hash_table((SubLObject)cyc_file_dependencies.$int50$32, (SubLObject)cyc_file_dependencies.UNPROVIDED, (SubLObject)cyc_file_dependencies.UNPROVIDED))));
        cyc_file_dependencies.$html_icon_default_directory$ = SubLFiles.deflexical("*HTML-ICON-DEFAULT-DIRECTORY*", (SubLObject)cyc_file_dependencies.$str52$);
        cyc_file_dependencies.$html_missing_icon$ = SubLFiles.deflexical("*HTML-MISSING-ICON*", (SubLObject)cyc_file_dependencies.$str53$missing_gif);
        cyc_file_dependencies.$cb_help_definitions$ = SubLFiles.deflexical("*CB-HELP-DEFINITIONS*", maybeDefault((SubLObject)cyc_file_dependencies.$sym79$_CB_HELP_DEFINITIONS_, cyc_file_dependencies.$cb_help_definitions$, ()->(Hashtables.make_hash_table((SubLObject)cyc_file_dependencies.$int50$32, (SubLObject)cyc_file_dependencies.UNPROVIDED, (SubLObject)cyc_file_dependencies.UNPROVIDED))));
        cyc_file_dependencies.$cb_help_default_directory$ = SubLFiles.deflexical("*CB-HELP-DEFAULT-DIRECTORY*", (SubLObject)cyc_file_dependencies.$str81$help_);
        cyc_file_dependencies.$cb_icon_definitions$ = SubLFiles.deflexical("*CB-ICON-DEFINITIONS*", maybeDefault((SubLObject)cyc_file_dependencies.$sym83$_CB_ICON_DEFINITIONS_, cyc_file_dependencies.$cb_icon_definitions$, ()->(Hashtables.make_hash_table((SubLObject)cyc_file_dependencies.$int50$32, (SubLObject)cyc_file_dependencies.UNPROVIDED, (SubLObject)cyc_file_dependencies.UNPROVIDED))));
        cyc_file_dependencies.$cb_icon_default_directory$ = SubLFiles.deflexical("*CB-ICON-DEFAULT-DIRECTORY*", (SubLObject)cyc_file_dependencies.$str84$cb_);
        cyc_file_dependencies.$cb_missing_icon$ = SubLFiles.deflexical("*CB-MISSING-ICON*", (SubLObject)cyc_file_dependencies.$str53$missing_gif);
        return (SubLObject)cyc_file_dependencies.NIL;
    }
    
    public static SubLObject setup_cyc_file_dependencies_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)cyc_file_dependencies.$sym0$_EXTERNAL_FILE_DEFINITIONS_);
        access_macros.register_macro_helper((SubLObject)cyc_file_dependencies.$sym29$CHECK_EXTERNAL_FILE_DEFINITION, (SubLObject)cyc_file_dependencies.$sym7$DEF_EXTERNAL_FILE);
        access_macros.register_macro_helper((SubLObject)cyc_file_dependencies.$sym41$UNDEFINED_EXTERNAL_DEPENDENCIES, (SubLObject)cyc_file_dependencies.$sym7$DEF_EXTERNAL_FILE);
        access_macros.register_macro_helper((SubLObject)cyc_file_dependencies.$sym42$REDUNDANT_DEPENDENCY_, (SubLObject)cyc_file_dependencies.$sym7$DEF_EXTERNAL_FILE);
        access_macros.register_macro_helper((SubLObject)cyc_file_dependencies.$sym17$EXT_DEP_ENDS_WITH, (SubLObject)cyc_file_dependencies.$list43);
        subl_macro_promotions.declare_defglobal((SubLObject)cyc_file_dependencies.$sym49$_HTML_ICON_DEFINITIONS_);
        subl_macro_promotions.declare_defglobal((SubLObject)cyc_file_dependencies.$sym79$_CB_HELP_DEFINITIONS_);
        subl_macro_promotions.declare_defglobal((SubLObject)cyc_file_dependencies.$sym83$_CB_ICON_DEFINITIONS_);
        access_macros.register_external_symbol((SubLObject)cyc_file_dependencies.$sym94$COMPILE_CB_BROWSER_DEPENDENCIES);
        access_macros.register_external_symbol((SubLObject)cyc_file_dependencies.$sym105$CB_BROWSER_DEPENDENCY_MANIFEST);
        return (SubLObject)cyc_file_dependencies.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cyc_file_dependencies_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cyc_file_dependencies_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cyc_file_dependencies_file();
    }
    
    static {
        me = (SubLFile)new cyc_file_dependencies();
        cyc_file_dependencies.$external_file_definitions$ = null;
        cyc_file_dependencies.$html_emitted_file_dependencies$ = null;
        cyc_file_dependencies.$java_default_directory$ = null;
        cyc_file_dependencies.$html_icon_definitions$ = null;
        cyc_file_dependencies.$html_icon_default_directory$ = null;
        cyc_file_dependencies.$html_missing_icon$ = null;
        cyc_file_dependencies.$cb_help_definitions$ = null;
        cyc_file_dependencies.$cb_help_default_directory$ = null;
        cyc_file_dependencies.$cb_icon_definitions$ = null;
        cyc_file_dependencies.$cb_icon_default_directory$ = null;
        cyc_file_dependencies.$cb_missing_icon$ = null;
        $sym0$_EXTERNAL_FILE_DEFINITIONS_ = SubLObjectFactory.makeSymbol("*EXTERNAL-FILE-DEFINITIONS*");
        $int1$64 = SubLObjectFactory.makeInteger(64);
        $kw2$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-EMITTED-FILE-DEPENDENCIES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"))));
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-EMITTED-FILE-DEPENDENCIES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)cyc_file_dependencies.EQ, (SubLObject)SubLObjectFactory.makeSymbol("*HTML-EMITTED-FILE-DEPENDENCIES*"), (SubLObject)SubLObjectFactory.makeKeyword("UNINITIALIZED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-EMITTED-FILE-DEPENDENCIES*"))));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILE-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENCIES"));
        $sym7$DEF_EXTERNAL_FILE = SubLObjectFactory.makeSymbol("DEF-EXTERNAL-FILE");
        $kw8$BUNDLE = SubLObjectFactory.makeKeyword("BUNDLE");
        $kw9$DEPENDENCIES = SubLObjectFactory.makeKeyword("DEPENDENCIES");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILE-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATH"), (SubLObject)SubLObjectFactory.makeString("js")), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENCIES"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PATH"), (SubLObject)SubLObjectFactory.makeKeyword("DEPENDENCIES"));
        $kw12$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw13$PATH = SubLObjectFactory.makeKeyword("PATH");
        $str14$js = SubLObjectFactory.makeString("js");
        $sym15$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym16$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym17$EXT_DEP_ENDS_WITH = SubLObjectFactory.makeSymbol("EXT-DEP-ENDS-WITH");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(".js"));
        $sym19$WARN = SubLObjectFactory.makeSymbol("WARN");
        $str20$Defining_javascript_file__S_witho = SubLObjectFactory.makeString("Defining javascript file ~S without '.js' as the suffix.");
        $kw21$JS = SubLObjectFactory.makeKeyword("JS");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILE-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATH"), (SubLObject)SubLObjectFactory.makeString("css")), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENCIES"));
        $str23$css = SubLObjectFactory.makeString("css");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(".css"));
        $str25$Defining_CSS_file__S_without___cs = SubLObjectFactory.makeString("Defining CSS file ~S without '.css' as the suffix.");
        $kw26$CSS = SubLObjectFactory.makeKeyword("CSS");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILE-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("PATH"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DEPENDENCIES"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEPENDENCIES"));
        $sym29$CHECK_EXTERNAL_FILE_DEFINITION = SubLObjectFactory.makeSymbol("CHECK-EXTERNAL-FILE-DEFINITION");
        $sym30$SETHASH = SubLObjectFactory.makeSymbol("SETHASH");
        $sym31$LIST = SubLObjectFactory.makeSymbol("LIST");
        $kw32$FILENAME = SubLObjectFactory.makeKeyword("FILENAME");
        $kw33$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $str34$Unable_to_define__S_because_of_un = SubLObjectFactory.makeString("Unable to define ~S because of undefined dependencies ~S");
        $str35$Redefinition_of_external_file__S_ = SubLObjectFactory.makeString("Redefinition of external file ~S from ~S to ~S (in ~S) of type ~S with dependencies ~S");
        $str36$Emitting__S_with_no_html_file_dep = SubLObjectFactory.makeString("Emitting ~S with no html-file-dependency-space.");
        $str37$text_javascript = SubLObjectFactory.makeString("text/javascript");
        $str38$stylesheet = SubLObjectFactory.makeString("stylesheet");
        $str39$text_css = SubLObjectFactory.makeString("text/css");
        $str40$Unable_to_emit_file__S___S__of_ty = SubLObjectFactory.makeString("Unable to emit file ~S (~S) of type ~S");
        $sym41$UNDEFINED_EXTERNAL_DEPENDENCIES = SubLObjectFactory.makeSymbol("UNDEFINED-EXTERNAL-DEPENDENCIES");
        $sym42$REDUNDANT_DEPENDENCY_ = SubLObjectFactory.makeSymbol("REDUNDANT-DEPENDENCY?");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CSS-2"), (SubLObject)SubLObjectFactory.makeSymbol("DEF-JAVASCRIPT-2"));
        $str44$java_ = SubLObjectFactory.makeString("java/");
        $str45$_ = SubLObjectFactory.makeString("/");
        $str46$_lib_ = SubLObjectFactory.makeString("/lib/");
        $str47$jar = SubLObjectFactory.makeString("jar");
        $str48$lib_ = SubLObjectFactory.makeString("lib/");
        $sym49$_HTML_ICON_DEFINITIONS_ = SubLObjectFactory.makeSymbol("*HTML-ICON-DEFINITIONS*");
        $int50$32 = SubLObjectFactory.makeInteger(32);
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ICON-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ALT-STRING"));
        $str52$ = SubLObjectFactory.makeString("");
        $str53$missing_gif = SubLObjectFactory.makeString("missing.gif");
        $list54 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ICON-KEYWORD"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("ISMAP"), SubLObjectFactory.makeSymbol("HEIGHT"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("ALT-OVERRIDE"), SubLObjectFactory.makeSymbol("ALIGN-OVERRIDE"), SubLObjectFactory.makeSymbol("BORDER-OVERRIDE") });
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("ISMAP"), (SubLObject)SubLObjectFactory.makeKeyword("HEIGHT"), (SubLObject)SubLObjectFactory.makeKeyword("WIDTH"), (SubLObject)SubLObjectFactory.makeKeyword("ALT-OVERRIDE"), (SubLObject)SubLObjectFactory.makeKeyword("ALIGN-OVERRIDE"), (SubLObject)SubLObjectFactory.makeKeyword("BORDER-OVERRIDE"));
        $kw56$ID = SubLObjectFactory.makeKeyword("ID");
        $kw57$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw58$ISMAP = SubLObjectFactory.makeKeyword("ISMAP");
        $kw59$HEIGHT = SubLObjectFactory.makeKeyword("HEIGHT");
        $kw60$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $kw61$ALT_OVERRIDE = SubLObjectFactory.makeKeyword("ALT-OVERRIDE");
        $kw62$ALIGN_OVERRIDE = SubLObjectFactory.makeKeyword("ALIGN-OVERRIDE");
        $kw63$BORDER_OVERRIDE = SubLObjectFactory.makeKeyword("BORDER-OVERRIDE");
        $sym64$IMAGE_SRC = SubLObjectFactory.makeUninternedSymbol("IMAGE-SRC");
        $sym65$ALIGN = SubLObjectFactory.makeUninternedSymbol("ALIGN");
        $sym66$ALT = SubLObjectFactory.makeUninternedSymbol("ALT");
        $sym67$BORDER = SubLObjectFactory.makeUninternedSymbol("BORDER");
        $sym68$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $sym69$_HTML_IMAGE_DIRECTORY_ = SubLObjectFactory.makeSymbol("*HTML-IMAGE-DIRECTORY*");
        $sym70$HTML_ICON_SRC = SubLObjectFactory.makeSymbol("HTML-ICON-SRC");
        $sym71$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CENTER"));
        $sym73$GET_HTML_ICON_ALT_STRING = SubLObjectFactory.makeSymbol("GET-HTML-ICON-ALT-STRING");
        $list74 = ConsesLow.list((SubLObject)cyc_file_dependencies.ZERO_INTEGER);
        $sym75$HTML_FANCY_IMAGE = SubLObjectFactory.makeSymbol("HTML-FANCY-IMAGE");
        $kw76$ALT = SubLObjectFactory.makeKeyword("ALT");
        $kw77$ALIGN = SubLObjectFactory.makeKeyword("ALIGN");
        $kw78$BORDER = SubLObjectFactory.makeKeyword("BORDER");
        $sym79$_CB_HELP_DEFINITIONS_ = SubLObjectFactory.makeSymbol("*CB-HELP-DEFINITIONS*");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HELP-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DESC-STRING"));
        $str81$help_ = SubLObjectFactory.makeString("help/");
        $str82$Help_file_not_found_for__A = SubLObjectFactory.makeString("Help file not found for ~A");
        $sym83$_CB_ICON_DEFINITIONS_ = SubLObjectFactory.makeSymbol("*CB-ICON-DEFINITIONS*");
        $str84$cb_ = SubLObjectFactory.makeString("cb/");
        $list85 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ICON-KEYWORD"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("ISMAP"), SubLObjectFactory.makeSymbol("HEIGHT"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("ALT-OVERRIDE"), SubLObjectFactory.makeSymbol("ALIGN-OVERRIDE"), SubLObjectFactory.makeSymbol("BORDER-OVERRIDE") });
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("ISMAP"), (SubLObject)SubLObjectFactory.makeKeyword("HEIGHT"), (SubLObject)SubLObjectFactory.makeKeyword("WIDTH"), (SubLObject)SubLObjectFactory.makeKeyword("ALT-OVERRIDE"), (SubLObject)SubLObjectFactory.makeKeyword("ALIGN-OVERRIDE"), (SubLObject)SubLObjectFactory.makeKeyword("BORDER-OVERRIDE"));
        $sym87$IMAGE_SRC = SubLObjectFactory.makeUninternedSymbol("IMAGE-SRC");
        $sym88$ALIGN = SubLObjectFactory.makeUninternedSymbol("ALIGN");
        $sym89$ALT = SubLObjectFactory.makeUninternedSymbol("ALT");
        $sym90$BORDER = SubLObjectFactory.makeUninternedSymbol("BORDER");
        $sym91$CB_ICON_FILE_PATH = SubLObjectFactory.makeSymbol("CB-ICON-FILE-PATH");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOP"));
        $sym93$CB_GET_ICON_ALT_STRING = SubLObjectFactory.makeSymbol("CB-GET-ICON-ALT-STRING");
        $sym94$COMPILE_CB_BROWSER_DEPENDENCIES = SubLObjectFactory.makeSymbol("COMPILE-CB-BROWSER-DEPENDENCIES");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-PRODUCER"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-MAPPING-FN"));
        $sym96$JAVASCRIPT_KEYWORDS = SubLObjectFactory.makeSymbol("JAVASCRIPT-KEYWORDS");
        $sym97$JAVASCRIPT_FILE_PATH = SubLObjectFactory.makeSymbol("JAVASCRIPT-FILE-PATH");
        $sym98$HTML_ICON_KEYWORDS = SubLObjectFactory.makeSymbol("HTML-ICON-KEYWORDS");
        $sym99$HTML_ICON_FILE_PATH = SubLObjectFactory.makeSymbol("HTML-ICON-FILE-PATH");
        $sym100$CB_HELP_KEYWORDS = SubLObjectFactory.makeSymbol("CB-HELP-KEYWORDS");
        $sym101$CB_HELP_FILE_PATH = SubLObjectFactory.makeSymbol("CB-HELP-FILE-PATH");
        $sym102$CB_ICON_KEYWORDS = SubLObjectFactory.makeSymbol("CB-ICON-KEYWORDS");
        $sym103$CSS_KEYWORDS = SubLObjectFactory.makeSymbol("CSS-KEYWORDS");
        $sym104$CSS_FILE_PATH = SubLObjectFactory.makeSymbol("CSS-FILE-PATH");
        $sym105$CB_BROWSER_DEPENDENCY_MANIFEST = SubLObjectFactory.makeSymbol("CB-BROWSER-DEPENDENCY-MANIFEST");
    }
}

/*

	Total time: 256 ms
	
*/
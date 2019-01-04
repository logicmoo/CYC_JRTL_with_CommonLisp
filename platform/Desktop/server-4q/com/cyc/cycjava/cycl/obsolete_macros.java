package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class obsolete_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.obsolete_macros";
    public static final String myFingerPrint = "e50e4d64f3f3c35f003e4fc623b37b2e482f37b96303cb18c4d72edea69aa80d";
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PROGN;
    private static final SubLSymbol $sym2$HTML_MARKUP;
    private static final SubLSymbol $sym3$HTML_MARKUP_WRAPPER;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$CLET;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$HTML_ATTRIBUTE;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$HTML_MARKUP_BODY;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$MAP_AS;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$DO_GAF_ARG_INDEX;
    private static final SubLSymbol $kw41$PREDICATE;
    private static final SubLSymbol $kw42$INDEX;
    private static final SubLSymbol $kw43$TRUTH;
    private static final SubLSymbol $kw44$DONE;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$MAP_AS_IN_MT;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$WITH_JUST_MT;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$MAP_AS_IN_MTS;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$WITH_MT_LIST;
    private static final SubLSymbol $sym53$MAP_AS_IN_ANY_MT;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$WITH_ALL_MTS;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$MAP_AS_IN_RELEVANT_MTS;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$POSSIBLY_IN_MT;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$MAP_US;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$DO_GAF_ARG_INDEX_VALUES;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$MAP_US_IN_MT;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$MAP_US_IN_MTS;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$MAP_US_IN_ANY_MT;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$MAP_US_IN_RELEVANT_MTS;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$DO_ARG_INDEX;
    private static final SubLSymbol $sym76$DO_ARG_INDEX_IN_MT;
    private static final SubLSymbol $sym77$DO_ARG_INDEX_IN_MTS;
    private static final SubLSymbol $sym78$DO_ARG_INDEX_IN_ANY_MT;
    private static final SubLSymbol $sym79$DO_ARG_INDEX_IN_RELEVANT_MTS;
    private static final SubLSymbol $sym80$DO_ARG_INDEX_VALUES;
    private static final SubLSymbol $sym81$DO_ARG_INDEX_VALUES_IN_MT;
    private static final SubLSymbol $sym82$DO_ARG_INDEX_VALUES_IN_MTS;
    private static final SubLSymbol $sym83$DO_ARG_INDEX_VALUES_IN_ANY_MT;
    private static final SubLSymbol $sym84$DO_ARG_INDEX_VALUES_IN_RELEVANT_MTS;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$DO_PRED_INDEX;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$DO_PREDICATE_EXTENT_INDEX;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$DO_PRED_INDEX_IN_MT;
    private static final SubLList $list91;
    private static final SubLList $list92;
    private static final SubLSymbol $sym93$DO_PRED_INDEX_IN_MTS;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$DO_PRED_INDEX_IN_ANY_MT;
    private static final SubLList $list96;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$DO_PRED_INDEX_IN_RELEVANT_MTS;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$RELEVANT_PRED_MAP_AS;
    private static final SubLList $list102;
    private static final SubLList $list103;
    private static final SubLSymbol $kw104$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw105$DIRECTION;
    private static final SubLSymbol $sym106$DO_GAF_ARG_INDEX_RELEVANT_PRED;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$GP_MAP_AS;
    private static final SubLList $list109;
    private static final SubLSymbol $sym110$DO_GAF_ARG_INDEX_GP;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$GP_MAP_AS_IN_MT;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$WITH_MT;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$GP_MAP_AS_IN_MTS;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$GP_MAP_AS_IN_ANY_MT;
    private static final SubLList $list119;
    private static final SubLSymbol $sym120$GP_MAP_AS_IN_RELEVANT_MTS;
    private static final SubLList $list121;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$GP_MAP_US;
    private static final SubLList $list124;
    private static final SubLSymbol $sym125$DO_GAF_ARG_INDEX_VALUES_GP;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$GP_MAP_US_IN_MT;
    private static final SubLList $list128;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$GP_MAP_US_IN_MTS;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$GP_MAP_US_IN_ANY_MT;
    private static final SubLList $list133;
    private static final SubLList $list134;
    private static final SubLSymbol $sym135$GP_MAP_US_IN_RELEVANT_MTS;
    private static final SubLList $list136;
    private static final SubLList $list137;
    private static final SubLString $str138$mapping_Cyc_NATs;
    private static final SubLSymbol $sym139$DO_NATS;
    private static final SubLList $list140;
    private static final SubLSymbol $sym141$DO_NARTS;
    private static final SubLList $list142;
    private static final SubLSymbol $sym143$WITH_PRIVATE_TCP_CONNECTION;
    private static final SubLList $list144;
    private static final SubLSymbol $sym145$WITH_TCP_CONNECTION;
    private static final SubLList $list146;
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_attribute(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject att = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list0);
        att = current.first();
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym2$HTML_MARKUP, att), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list0);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_form(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym3$HTML_MARKUP_WRAPPER, (SubLObject)obsolete_macros.$list4, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym5$CLET, (SubLObject)obsolete_macros.$list6, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_form_url(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list8, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_form_method(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list9, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_form_body(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym10$HTML_MARKUP_BODY, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym5$CLET, (SubLObject)obsolete_macros.$list11, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_input(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym1$PROGN, (SubLObject)obsolete_macros.$list12, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym5$CLET, (SubLObject)obsolete_macros.$list6, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)), (SubLObject)obsolete_macros.$list13);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_input_type(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list14, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_input_name(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list15, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_input_value(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list16, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym5$CLET, (SubLObject)obsolete_macros.$list17, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_input_size(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list18, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_input_checked(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        if (obsolete_macros.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.NIL);
        }
        return (SubLObject)obsolete_macros.$list19;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_select(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym3$HTML_MARKUP_WRAPPER, (SubLObject)obsolete_macros.$list20, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym5$CLET, (SubLObject)obsolete_macros.$list6, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_select_name(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list21, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_select_size(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list22, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_select_multiple(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        if (obsolete_macros.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.NIL);
        }
        return (SubLObject)obsolete_macros.$list23;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_select_body(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return reader.bq_cons((SubLObject)obsolete_macros.$sym10$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_option(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym3$HTML_MARKUP_WRAPPER, (SubLObject)obsolete_macros.$list24, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym5$CLET, (SubLObject)obsolete_macros.$list6, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_option_selected(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        if (obsolete_macros.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.NIL);
        }
        return (SubLObject)obsolete_macros.$list25;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_option_body(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return reader.bq_cons((SubLObject)obsolete_macros.$sym10$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_textarea(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym3$HTML_MARKUP_WRAPPER, (SubLObject)obsolete_macros.$list26, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym5$CLET, (SubLObject)obsolete_macros.$list6, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_textarea_name(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list27, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_textarea_cols(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list28, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_textarea_rows(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list29, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_textarea_body(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return reader.bq_cons((SubLObject)obsolete_macros.$sym10$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_anchor(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym3$HTML_MARKUP_WRAPPER, (SubLObject)obsolete_macros.$list30, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym5$CLET, (SubLObject)obsolete_macros.$list6, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_anchor_href(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list31, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_anchor_name(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list32, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_anchor_linktext(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return reader.bq_cons((SubLObject)obsolete_macros.$sym10$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_image(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym1$PROGN, (SubLObject)obsolete_macros.$list33, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym5$CLET, (SubLObject)obsolete_macros.$list6, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)), (SubLObject)obsolete_macros.$list13);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_image_url(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list34, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_image_alt(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list35, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
    public static SubLObject html_image_border(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym7$HTML_ATTRIBUTE, (SubLObject)obsolete_macros.$list36, ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 6575L)
    public static SubLObject map_as(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        done = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list37);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list37);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym38$MAP_AS, (SubLObject)obsolete_macros.$list39);
            return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym40$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list37);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 6908L)
    public static SubLObject map_as_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mt = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list45);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list45);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list45);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list45);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list45);
        mt = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list45);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list45);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym46$MAP_AS_IN_MT, (SubLObject)obsolete_macros.$list47);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym48$WITH_JUST_MT, mt, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym40$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list45);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 7194L)
    public static SubLObject map_as_in_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mts = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list49);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list49);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list49);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list49);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list49);
        mts = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list49);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list49);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym50$MAP_AS_IN_MTS, (SubLObject)obsolete_macros.$list51);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym52$WITH_MT_LIST, mts, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym40$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list49);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 7483L)
    public static SubLObject map_as_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        done = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list37);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list37);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym53$MAP_AS_IN_ANY_MT, (SubLObject)obsolete_macros.$list54);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym55$WITH_ALL_MTS, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym40$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list37);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 7766L)
    public static SubLObject map_as_in_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list56);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list56);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list56);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list56);
        done = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list56);
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list56);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list56);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym57$MAP_AS_IN_RELEVANT_MTS, (SubLObject)obsolete_macros.$list58);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym59$POSSIBLY_IN_MT, mt, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym40$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list56);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 8066L)
    public static SubLObject map_us(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        done = current.first();
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list60);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list60);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list60);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym61$MAP_US, (SubLObject)obsolete_macros.$list62);
            return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym63$DO_GAF_ARG_INDEX_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, gather_arg, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index_arg, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list60);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 8373L)
    public static SubLObject map_us_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list64);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mt = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list64);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list64);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list64);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list64);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list64);
        mt = current.first();
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list64);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list64);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list64);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym65$MAP_US_IN_MT, (SubLObject)obsolete_macros.$list66);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym48$WITH_JUST_MT, mt, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym63$DO_GAF_ARG_INDEX_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, gather_arg, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index_arg, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list64);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 8714L)
    public static SubLObject map_us_in_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list67);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mts = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list67);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list67);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list67);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list67);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list67);
        mts = current.first();
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list67);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list67);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list67);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym68$MAP_US_IN_MTS, (SubLObject)obsolete_macros.$list69);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym52$WITH_MT_LIST, mts, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym63$DO_GAF_ARG_INDEX_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, gather_arg, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index_arg, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list67);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 9058L)
    public static SubLObject map_us_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        done = current.first();
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list60);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list60);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list60);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym70$MAP_US_IN_ANY_MT, (SubLObject)obsolete_macros.$list71);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym55$WITH_ALL_MTS, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym63$DO_GAF_ARG_INDEX_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, gather_arg, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index_arg, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list60);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 9396L)
    public static SubLObject map_us_in_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list72);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list72);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list72);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list72);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list72);
        done = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list72);
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list72);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list72);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list72);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym73$MAP_US_IN_RELEVANT_MTS, (SubLObject)obsolete_macros.$list74);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym59$POSSIBLY_IN_MT, mt, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym63$DO_GAF_ARG_INDEX_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, gather_arg, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index_arg, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list72);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 9751L)
    public static SubLObject do_arg_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        done = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list37);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list37);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym75$DO_ARG_INDEX, (SubLObject)obsolete_macros.$list39);
            return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym40$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list37);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 10012L)
    public static SubLObject do_arg_index_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mt = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list45);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list45);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list45);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list45);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list45);
        mt = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list45);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list45);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym76$DO_ARG_INDEX_IN_MT, (SubLObject)obsolete_macros.$list47);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym48$WITH_JUST_MT, mt, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym40$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list45);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 10297L)
    public static SubLObject do_arg_index_in_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mts = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list49);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list49);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list49);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list49);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list49);
        mts = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list49);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list49);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym77$DO_ARG_INDEX_IN_MTS, (SubLObject)obsolete_macros.$list51);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym52$WITH_MT_LIST, mts, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym40$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list49);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 10585L)
    public static SubLObject do_arg_index_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list37);
        done = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list37);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list37);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym78$DO_ARG_INDEX_IN_ANY_MT, (SubLObject)obsolete_macros.$list54);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym55$WITH_ALL_MTS, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym40$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list37);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 10867L)
    public static SubLObject do_arg_index_in_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list56);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list56);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list56);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list56);
        done = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list56);
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list56);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list56);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym79$DO_ARG_INDEX_IN_RELEVANT_MTS, (SubLObject)obsolete_macros.$list58);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym59$POSSIBLY_IN_MT, mt, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym40$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list56);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 11166L)
    public static SubLObject do_arg_index_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        done = current.first();
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list60);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list60);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list60);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym80$DO_ARG_INDEX_VALUES, (SubLObject)obsolete_macros.$list62);
            return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym63$DO_GAF_ARG_INDEX_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, gather_arg, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index_arg, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list60);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 11499L)
    public static SubLObject do_arg_index_values_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list64);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mt = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list64);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list64);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list64);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list64);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list64);
        mt = current.first();
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list64);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list64);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list64);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym81$DO_ARG_INDEX_VALUES_IN_MT, (SubLObject)obsolete_macros.$list66);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym48$WITH_JUST_MT, mt, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym63$DO_GAF_ARG_INDEX_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, gather_arg, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index_arg, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list64);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 11853L)
    public static SubLObject do_arg_index_values_in_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list67);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mts = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list67);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list67);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list67);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list67);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list67);
        mts = current.first();
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list67);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list67);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list67);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym82$DO_ARG_INDEX_VALUES_IN_MTS, (SubLObject)obsolete_macros.$list69);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym52$WITH_MT_LIST, mts, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym63$DO_GAF_ARG_INDEX_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, gather_arg, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index_arg, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list67);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 12210L)
    public static SubLObject do_arg_index_values_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list60);
        done = current.first();
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list60);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list60);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list60);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym83$DO_ARG_INDEX_VALUES_IN_ANY_MT, (SubLObject)obsolete_macros.$list71);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym55$WITH_ALL_MTS, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym63$DO_GAF_ARG_INDEX_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, gather_arg, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index_arg, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list60);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 12561L)
    public static SubLObject do_arg_index_values_in_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list72);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list72);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list72);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list72);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list72);
        done = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list72);
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list72);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list72);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list72);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym84$DO_ARG_INDEX_VALUES_IN_RELEVANT_MTS, (SubLObject)obsolete_macros.$list74);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym59$POSSIBLY_IN_MT, mt, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym63$DO_GAF_ARG_INDEX_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, gather_arg, obsolete_macros.$kw41$PREDICATE, pred, obsolete_macros.$kw42$INDEX, index_arg, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list72);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 12929L)
    public static SubLObject do_pred_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list85);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list85);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list85);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list85);
        done = current.first();
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list85);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym86$DO_PRED_INDEX, (SubLObject)obsolete_macros.$list87);
            return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym88$DO_PREDICATE_EXTENT_INDEX, (SubLObject)ConsesLow.list(var, pred, (SubLObject)obsolete_macros.$kw43$TRUTH, truth, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list85);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 13164L)
    public static SubLObject do_pred_index_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list89);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mt = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list89);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list89);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list89);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list89);
        mt = current.first();
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list89);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym90$DO_PRED_INDEX_IN_MT, (SubLObject)obsolete_macros.$list91);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym48$WITH_JUST_MT, mt, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym88$DO_PREDICATE_EXTENT_INDEX, (SubLObject)ConsesLow.list(var, pred, (SubLObject)obsolete_macros.$kw43$TRUTH, truth, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list89);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 13422L)
    public static SubLObject do_pred_index_in_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list92);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mts = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list92);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list92);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list92);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list92);
        mts = current.first();
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list92);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym93$DO_PRED_INDEX_IN_MTS, (SubLObject)obsolete_macros.$list94);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym52$WITH_MT_LIST, mts, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym88$DO_PREDICATE_EXTENT_INDEX, (SubLObject)ConsesLow.list(var, pred, (SubLObject)obsolete_macros.$kw43$TRUTH, truth, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list92);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 13683L)
    public static SubLObject do_pred_index_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list85);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list85);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list85);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list85);
        done = current.first();
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list85);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym95$DO_PRED_INDEX_IN_ANY_MT, (SubLObject)obsolete_macros.$list96);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym55$WITH_ALL_MTS, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym88$DO_PREDICATE_EXTENT_INDEX, (SubLObject)ConsesLow.list(var, pred, (SubLObject)obsolete_macros.$kw43$TRUTH, truth, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list85);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 13938L)
    public static SubLObject do_pred_index_in_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list97);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list97);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list97);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list97);
        done = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list97);
        current = current.rest();
        final SubLObject truth = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list97);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym98$DO_PRED_INDEX_IN_RELEVANT_MTS, (SubLObject)obsolete_macros.$list99);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym59$POSSIBLY_IN_MT, mt, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym88$DO_PREDICATE_EXTENT_INDEX, (SubLObject)ConsesLow.list(var, pred, (SubLObject)obsolete_macros.$kw43$TRUTH, truth, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list97);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 14210L)
    public static SubLObject relevant_pred_map_as(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list100);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list100);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list100);
        done = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list100);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym101$RELEVANT_PRED_MAP_AS, (SubLObject)obsolete_macros.$list39);
            return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym40$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(var, v_term, (SubLObject)obsolete_macros.$kw42$INDEX, index, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list100);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 14480L)
    public static SubLObject do_gaf_arg_index_relevant_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list102);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list102);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list102);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)obsolete_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)obsolete_macros.NIL;
        SubLObject current_$1 = (SubLObject)obsolete_macros.NIL;
        while (obsolete_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)obsolete_macros.$list102);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)obsolete_macros.$list102);
            if (obsolete_macros.NIL == conses_high.member(current_$1, (SubLObject)obsolete_macros.$list103, (SubLObject)obsolete_macros.UNPROVIDED, (SubLObject)obsolete_macros.UNPROVIDED)) {
                bad = (SubLObject)obsolete_macros.T;
            }
            if (current_$1 == obsolete_macros.$kw104$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (obsolete_macros.NIL != bad && obsolete_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list102);
        }
        final SubLObject index_tail = cdestructuring_bind.property_list_member((SubLObject)obsolete_macros.$kw42$INDEX, current);
        final SubLObject index = (SubLObject)((obsolete_macros.NIL != index_tail) ? conses_high.cadr(index_tail) : obsolete_macros.NIL);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)obsolete_macros.$kw43$TRUTH, current);
        final SubLObject truth = (SubLObject)((obsolete_macros.NIL != truth_tail) ? conses_high.cadr(truth_tail) : obsolete_macros.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)obsolete_macros.$kw105$DIRECTION, current);
        final SubLObject direction = (SubLObject)((obsolete_macros.NIL != direction_tail) ? conses_high.cadr(direction_tail) : obsolete_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)obsolete_macros.$kw44$DONE, current);
        final SubLObject done = (SubLObject)((obsolete_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : obsolete_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym106$DO_GAF_ARG_INDEX_RELEVANT_PRED, (SubLObject)obsolete_macros.$list39);
        return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym40$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { assertion_var, v_term, obsolete_macros.$kw42$INDEX, index, obsolete_macros.$kw43$TRUTH, truth, obsolete_macros.$kw105$DIRECTION, direction, obsolete_macros.$kw44$DONE, done }), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 14756L)
    public static SubLObject gp_map_as(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list107);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list107);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list107);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list107);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list107);
        done = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list107);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym108$GP_MAP_AS, (SubLObject)obsolete_macros.$list109);
            return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym110$DO_GAF_ARG_INDEX_GP, (SubLObject)ConsesLow.list(var, v_term, pred, (SubLObject)obsolete_macros.$kw42$INDEX, index, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list107);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 14986L)
    public static SubLObject gp_map_as_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list111);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mt = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list111);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list111);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list111);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list111);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list111);
        mt = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list111);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym112$GP_MAP_AS_IN_MT, (SubLObject)obsolete_macros.$list113);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym114$WITH_MT, mt, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym110$DO_GAF_ARG_INDEX_GP, (SubLObject)ConsesLow.list(var, v_term, pred, (SubLObject)obsolete_macros.$kw42$INDEX, index, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list111);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 15233L)
    public static SubLObject gp_map_as_in_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mts = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list115);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list115);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list115);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list115);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list115);
        mts = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list115);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym116$GP_MAP_AS_IN_MTS, (SubLObject)obsolete_macros.$list117);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym52$WITH_MT_LIST, mts, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym110$DO_GAF_ARG_INDEX_GP, (SubLObject)ConsesLow.list(var, v_term, pred, (SubLObject)obsolete_macros.$kw42$INDEX, index, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list115);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 15493L)
    public static SubLObject gp_map_as_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list107);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list107);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list107);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list107);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list107);
        done = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list107);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym118$GP_MAP_AS_IN_ANY_MT, (SubLObject)obsolete_macros.$list119);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym55$WITH_ALL_MTS, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym110$DO_GAF_ARG_INDEX_GP, (SubLObject)ConsesLow.list(var, v_term, pred, (SubLObject)obsolete_macros.$kw42$INDEX, index, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list107);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 15747L)
    public static SubLObject gp_map_as_in_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list111);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mt = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list111);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list111);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list111);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list111);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list111);
        mt = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list111);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym120$GP_MAP_AS_IN_RELEVANT_MTS, (SubLObject)obsolete_macros.$list121);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym59$POSSIBLY_IN_MT, mt, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym110$DO_GAF_ARG_INDEX_GP, (SubLObject)ConsesLow.list(var, v_term, pred, (SubLObject)obsolete_macros.$kw42$INDEX, index, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list111);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 16018L)
    public static SubLObject gp_map_us(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list122);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list122);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list122);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list122);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list122);
        done = current.first();
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list122);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list122);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym123$GP_MAP_US, (SubLObject)obsolete_macros.$list124);
            return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym125$DO_GAF_ARG_INDEX_VALUES_GP, (SubLObject)ConsesLow.list(var, v_term, gather_arg, pred, (SubLObject)obsolete_macros.$kw42$INDEX, index_arg, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list122);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 16297L)
    public static SubLObject gp_map_us_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list126);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mt = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list126);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list126);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list126);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list126);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list126);
        mt = current.first();
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list126);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list126);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym127$GP_MAP_US_IN_MT, (SubLObject)obsolete_macros.$list128);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym114$WITH_MT, mt, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym125$DO_GAF_ARG_INDEX_VALUES_GP, (SubLObject)ConsesLow.list(var, v_term, gather_arg, pred, (SubLObject)obsolete_macros.$kw42$INDEX, index_arg, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list126);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 16593L)
    public static SubLObject gp_map_us_in_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list129);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        SubLObject mts = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list129);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list129);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list129);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list129);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list129);
        mts = current.first();
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list129);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list129);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym130$GP_MAP_US_IN_MTS, (SubLObject)obsolete_macros.$list131);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym52$WITH_MT_LIST, mts, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym125$DO_GAF_ARG_INDEX_VALUES_GP, (SubLObject)ConsesLow.list(var, v_term, gather_arg, pred, (SubLObject)obsolete_macros.$kw42$INDEX, index_arg, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list129);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 16902L)
    public static SubLObject gp_map_us_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list122);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list122);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list122);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list122);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list122);
        done = current.first();
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list122);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list122);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym132$GP_MAP_US_IN_ANY_MT, (SubLObject)obsolete_macros.$list133);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym55$WITH_ALL_MTS, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym125$DO_GAF_ARG_INDEX_VALUES_GP, (SubLObject)ConsesLow.list(var, v_term, gather_arg, pred, (SubLObject)obsolete_macros.$kw42$INDEX, index_arg, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list122);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 17205L)
    public static SubLObject gp_map_us_in_relevant_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list134);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        SubLObject v_term = (SubLObject)obsolete_macros.NIL;
        SubLObject pred = (SubLObject)obsolete_macros.NIL;
        SubLObject done = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list134);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list134);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list134);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list134);
        done = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list134);
        current = current.rest();
        final SubLObject index_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list134);
        current = current.rest();
        final SubLObject gather_arg = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list134);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym135$GP_MAP_US_IN_RELEVANT_MTS, (SubLObject)obsolete_macros.$list136);
            return (SubLObject)ConsesLow.list((SubLObject)obsolete_macros.$sym59$POSSIBLY_IN_MT, mt, (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym125$DO_GAF_ARG_INDEX_VALUES_GP, (SubLObject)ConsesLow.list(var, v_term, gather_arg, pred, (SubLObject)obsolete_macros.$kw42$INDEX, index_arg, (SubLObject)obsolete_macros.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list134);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 17525L)
    public static SubLObject do_nats(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list137);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list137);
        var = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : obsolete_macros.$str138$mapping_Cyc_NATs);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)obsolete_macros.$list137);
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym139$DO_NATS, (SubLObject)obsolete_macros.$list140);
            return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym141$DO_NARTS, (SubLObject)ConsesLow.list(var, message), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list137);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 17847L)
    public static SubLObject with_private_tcp_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list142);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bi_stream = (SubLObject)obsolete_macros.NIL;
        SubLObject host = (SubLObject)obsolete_macros.NIL;
        SubLObject port = (SubLObject)obsolete_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list142);
        bi_stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list142);
        host = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)obsolete_macros.$list142);
        port = current.first();
        current = current.rest();
        if (obsolete_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)obsolete_macros.$sym143$WITH_PRIVATE_TCP_CONNECTION, (SubLObject)obsolete_macros.$list144);
            return (SubLObject)ConsesLow.listS((SubLObject)obsolete_macros.$sym145$WITH_TCP_CONNECTION, (SubLObject)ConsesLow.listS(bi_stream, host, port, (SubLObject)obsolete_macros.$list146), ConsesLow.append(body, (SubLObject)obsolete_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)obsolete_macros.$list142);
        return (SubLObject)obsolete_macros.NIL;
    }
    
    public static SubLObject declare_obsolete_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_attribute", "HTML-ATTRIBUTE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_form", "HTML-FORM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_form_url", "HTML-FORM-URL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_form_method", "HTML-FORM-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_form_body", "HTML-FORM-BODY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_input", "HTML-INPUT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_input_type", "HTML-INPUT-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_input_name", "HTML-INPUT-NAME");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_input_value", "HTML-INPUT-VALUE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_input_size", "HTML-INPUT-SIZE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_input_checked", "HTML-INPUT-CHECKED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_select", "HTML-SELECT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_select_name", "HTML-SELECT-NAME");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_select_size", "HTML-SELECT-SIZE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_select_multiple", "HTML-SELECT-MULTIPLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_select_body", "HTML-SELECT-BODY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_option", "HTML-OPTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_option_selected", "HTML-OPTION-SELECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_option_body", "HTML-OPTION-BODY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_textarea", "HTML-TEXTAREA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_textarea_name", "HTML-TEXTAREA-NAME");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_textarea_cols", "HTML-TEXTAREA-COLS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_textarea_rows", "HTML-TEXTAREA-ROWS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_textarea_body", "HTML-TEXTAREA-BODY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_anchor", "HTML-ANCHOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_anchor_href", "HTML-ANCHOR-HREF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_anchor_name", "HTML-ANCHOR-NAME");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_anchor_linktext", "HTML-ANCHOR-LINKTEXT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_image", "HTML-IMAGE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_image_url", "HTML-IMAGE-URL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_image_alt", "HTML-IMAGE-ALT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "html_image_border", "HTML-IMAGE-BORDER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "map_as", "MAP-AS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "map_as_in_mt", "MAP-AS-IN-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "map_as_in_mts", "MAP-AS-IN-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "map_as_in_any_mt", "MAP-AS-IN-ANY-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "map_as_in_relevant_mts", "MAP-AS-IN-RELEVANT-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "map_us", "MAP-US");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "map_us_in_mt", "MAP-US-IN-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "map_us_in_mts", "MAP-US-IN-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "map_us_in_any_mt", "MAP-US-IN-ANY-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "map_us_in_relevant_mts", "MAP-US-IN-RELEVANT-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_arg_index", "DO-ARG-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_arg_index_in_mt", "DO-ARG-INDEX-IN-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_arg_index_in_mts", "DO-ARG-INDEX-IN-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_arg_index_in_any_mt", "DO-ARG-INDEX-IN-ANY-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_arg_index_in_relevant_mts", "DO-ARG-INDEX-IN-RELEVANT-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_arg_index_values", "DO-ARG-INDEX-VALUES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_arg_index_values_in_mt", "DO-ARG-INDEX-VALUES-IN-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_arg_index_values_in_mts", "DO-ARG-INDEX-VALUES-IN-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_arg_index_values_in_any_mt", "DO-ARG-INDEX-VALUES-IN-ANY-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_arg_index_values_in_relevant_mts", "DO-ARG-INDEX-VALUES-IN-RELEVANT-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_pred_index", "DO-PRED-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_pred_index_in_mt", "DO-PRED-INDEX-IN-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_pred_index_in_mts", "DO-PRED-INDEX-IN-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_pred_index_in_any_mt", "DO-PRED-INDEX-IN-ANY-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_pred_index_in_relevant_mts", "DO-PRED-INDEX-IN-RELEVANT-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "relevant_pred_map_as", "RELEVANT-PRED-MAP-AS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_gaf_arg_index_relevant_pred", "DO-GAF-ARG-INDEX-RELEVANT-PRED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "gp_map_as", "GP-MAP-AS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "gp_map_as_in_mt", "GP-MAP-AS-IN-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "gp_map_as_in_mts", "GP-MAP-AS-IN-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "gp_map_as_in_any_mt", "GP-MAP-AS-IN-ANY-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "gp_map_as_in_relevant_mts", "GP-MAP-AS-IN-RELEVANT-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "gp_map_us", "GP-MAP-US");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "gp_map_us_in_mt", "GP-MAP-US-IN-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "gp_map_us_in_mts", "GP-MAP-US-IN-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "gp_map_us_in_any_mt", "GP-MAP-US-IN-ANY-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "gp_map_us_in_relevant_mts", "GP-MAP-US-IN-RELEVANT-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "do_nats", "DO-NATS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.obsolete_macros", "with_private_tcp_connection", "WITH-PRIVATE-TCP-CONNECTION");
        return (SubLObject)obsolete_macros.NIL;
    }
    
    public static SubLObject init_obsolete_macros_file() {
        return (SubLObject)obsolete_macros.NIL;
    }
    
    public static SubLObject setup_obsolete_macros_file() {
        return (SubLObject)obsolete_macros.NIL;
    }
    
    public void declareFunctions() {
        declare_obsolete_macros_file();
    }
    
    public void initializeVariables() {
        init_obsolete_macros_file();
    }
    
    public void runTopLevelForms() {
        setup_obsolete_macros_file();
    }
    
    static {
        me = (SubLFile)new obsolete_macros();
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ATT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym2$HTML_MARKUP = SubLObjectFactory.makeSymbol("HTML-MARKUP");
        $sym3$HTML_MARKUP_WRAPPER = SubLObjectFactory.makeSymbol("HTML-MARKUP-WRAPPER");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-TAIL*"));
        $sym5$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SAFE-PRINT*"), (SubLObject)obsolete_macros.NIL));
        $sym7$HTML_ATTRIBUTE = SubLObjectFactory.makeSymbol("HTML-ATTRIBUTE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-ACTION*"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-METHOD*"));
        $sym10$HTML_MARKUP_BODY = SubLObjectFactory.makeSymbol("HTML-MARKUP-BODY");
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-HTML-FORM*"), (SubLObject)obsolete_macros.T));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-MARKUP"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-HEAD*"));
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-CHAR"), (SubLObject)Characters.CHAR_greater));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-TYPE*"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-NAME*"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-VALUE*"));
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SAFE-PRINT*"), (SubLObject)obsolete_macros.T));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-SIZE*"));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-MARKUP"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-CHECKED*"));
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SELECT-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-SELECT-TAIL*"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SELECT-NAME*"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SELECT-SIZE*"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-SELECT-MULTIPLE*"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OPTION-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-OPTION-TAIL*"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-OPTION-SELECTED*"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TEXTAREA-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-TEXTAREA-TAIL*"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TEXTAREA-NAME*"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TEXTAREA-COLS*"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TEXTAREA-ROWS*"));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-TAIL*"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-HREF*"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-NAME*"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-MARKUP"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-HEAD*"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-SRC*"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-ALT*"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-BORDER*"));
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)obsolete_macros.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym38$MAP_AS = SubLObjectFactory.makeSymbol("MAP-AS");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX"));
        $sym40$DO_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX");
        $kw41$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw42$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw43$TRUTH = SubLObjectFactory.makeKeyword("TRUTH");
        $kw44$DONE = SubLObjectFactory.makeKeyword("DONE");
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)obsolete_macros.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym46$MAP_AS_IN_MT = SubLObjectFactory.makeSymbol("MAP-AS-IN-MT");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-JUST-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX"));
        $sym48$WITH_JUST_MT = SubLObjectFactory.makeSymbol("WITH-JUST-MT");
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)obsolete_macros.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym50$MAP_AS_IN_MTS = SubLObjectFactory.makeSymbol("MAP-AS-IN-MTS");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-MT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX"));
        $sym52$WITH_MT_LIST = SubLObjectFactory.makeSymbol("WITH-MT-LIST");
        $sym53$MAP_AS_IN_ANY_MT = SubLObjectFactory.makeSymbol("MAP-AS-IN-ANY-MT");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX"));
        $sym55$WITH_ALL_MTS = SubLObjectFactory.makeSymbol("WITH-ALL-MTS");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)obsolete_macros.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym57$MAP_AS_IN_RELEVANT_MTS = SubLObjectFactory.makeSymbol("MAP-AS-IN-RELEVANT-MTS");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-IN-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX"));
        $sym59$POSSIBLY_IN_MT = SubLObjectFactory.makeSymbol("POSSIBLY-IN-MT");
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)obsolete_macros.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)obsolete_macros.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym61$MAP_US = SubLObjectFactory.makeSymbol("MAP-US");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-VALUES"));
        $sym63$DO_GAF_ARG_INDEX_VALUES = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-VALUES");
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("VAR"), SubLObjectFactory.makeSymbol("TERM"), SubLObjectFactory.makeSymbol("PRED"), SubLObjectFactory.makeSymbol("DONE"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)obsolete_macros.ONE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)obsolete_macros.TWO_INTEGER), SubLObjectFactory.makeSymbol("TRUTH") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym65$MAP_US_IN_MT = SubLObjectFactory.makeSymbol("MAP-US-IN-MT");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-JUST-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-VALUES"));
        $list67 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("VAR"), SubLObjectFactory.makeSymbol("TERM"), SubLObjectFactory.makeSymbol("PRED"), SubLObjectFactory.makeSymbol("DONE"), SubLObjectFactory.makeSymbol("MTS"), SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)obsolete_macros.ONE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)obsolete_macros.TWO_INTEGER), SubLObjectFactory.makeSymbol("TRUTH") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym68$MAP_US_IN_MTS = SubLObjectFactory.makeSymbol("MAP-US-IN-MTS");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-MT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-VALUES"));
        $sym70$MAP_US_IN_ANY_MT = SubLObjectFactory.makeSymbol("MAP-US-IN-ANY-MT");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-VALUES"));
        $list72 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("VAR"), SubLObjectFactory.makeSymbol("TERM"), SubLObjectFactory.makeSymbol("PRED"), SubLObjectFactory.makeSymbol("DONE"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("MT"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)obsolete_macros.ONE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)obsolete_macros.TWO_INTEGER), SubLObjectFactory.makeSymbol("TRUTH") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym73$MAP_US_IN_RELEVANT_MTS = SubLObjectFactory.makeSymbol("MAP-US-IN-RELEVANT-MTS");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-IN-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-VALUES"));
        $sym75$DO_ARG_INDEX = SubLObjectFactory.makeSymbol("DO-ARG-INDEX");
        $sym76$DO_ARG_INDEX_IN_MT = SubLObjectFactory.makeSymbol("DO-ARG-INDEX-IN-MT");
        $sym77$DO_ARG_INDEX_IN_MTS = SubLObjectFactory.makeSymbol("DO-ARG-INDEX-IN-MTS");
        $sym78$DO_ARG_INDEX_IN_ANY_MT = SubLObjectFactory.makeSymbol("DO-ARG-INDEX-IN-ANY-MT");
        $sym79$DO_ARG_INDEX_IN_RELEVANT_MTS = SubLObjectFactory.makeSymbol("DO-ARG-INDEX-IN-RELEVANT-MTS");
        $sym80$DO_ARG_INDEX_VALUES = SubLObjectFactory.makeSymbol("DO-ARG-INDEX-VALUES");
        $sym81$DO_ARG_INDEX_VALUES_IN_MT = SubLObjectFactory.makeSymbol("DO-ARG-INDEX-VALUES-IN-MT");
        $sym82$DO_ARG_INDEX_VALUES_IN_MTS = SubLObjectFactory.makeSymbol("DO-ARG-INDEX-VALUES-IN-MTS");
        $sym83$DO_ARG_INDEX_VALUES_IN_ANY_MT = SubLObjectFactory.makeSymbol("DO-ARG-INDEX-VALUES-IN-ANY-MT");
        $sym84$DO_ARG_INDEX_VALUES_IN_RELEVANT_MTS = SubLObjectFactory.makeSymbol("DO-ARG-INDEX-VALUES-IN-RELEVANT-MTS");
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym86$DO_PRED_INDEX = SubLObjectFactory.makeSymbol("DO-PRED-INDEX");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX"));
        $sym88$DO_PREDICATE_EXTENT_INDEX = SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX");
        $list89 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym90$DO_PRED_INDEX_IN_MT = SubLObjectFactory.makeSymbol("DO-PRED-INDEX-IN-MT");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-JUST-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX"));
        $list92 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym93$DO_PRED_INDEX_IN_MTS = SubLObjectFactory.makeSymbol("DO-PRED-INDEX-IN-MTS");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-MT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX"));
        $sym95$DO_PRED_INDEX_IN_ANY_MT = SubLObjectFactory.makeSymbol("DO-PRED-INDEX-IN-ANY-MT");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX"));
        $list97 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym98$DO_PRED_INDEX_IN_RELEVANT_MTS = SubLObjectFactory.makeSymbol("DO-PRED-INDEX-IN-RELEVANT-MTS");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-IN-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX"));
        $list100 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)obsolete_macros.ONE_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym101$RELEVANT_PRED_MAP_AS = SubLObjectFactory.makeSymbol("RELEVANT-PRED-MAP-AS");
        $list102 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw104$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw105$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $sym106$DO_GAF_ARG_INDEX_RELEVANT_PRED = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-RELEVANT-PRED");
        $list107 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)obsolete_macros.ONE_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym108$GP_MAP_AS = SubLObjectFactory.makeSymbol("GP-MAP-AS");
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-GP"));
        $sym110$DO_GAF_ARG_INDEX_GP = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-GP");
        $list111 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)obsolete_macros.ONE_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym112$GP_MAP_AS_IN_MT = SubLObjectFactory.makeSymbol("GP-MAP-AS-IN-MT");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-GP"));
        $sym114$WITH_MT = SubLObjectFactory.makeSymbol("WITH-MT");
        $list115 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)obsolete_macros.ONE_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym116$GP_MAP_AS_IN_MTS = SubLObjectFactory.makeSymbol("GP-MAP-AS-IN-MTS");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-MT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-GP"));
        $sym118$GP_MAP_AS_IN_ANY_MT = SubLObjectFactory.makeSymbol("GP-MAP-AS-IN-ANY-MT");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-GP"));
        $sym120$GP_MAP_AS_IN_RELEVANT_MTS = SubLObjectFactory.makeSymbol("GP-MAP-AS-IN-RELEVANT-MTS");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-IN-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-GP"));
        $list122 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)obsolete_macros.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)obsolete_macros.TWO_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym123$GP_MAP_US = SubLObjectFactory.makeSymbol("GP-MAP-US");
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-VALUES-GP"));
        $sym125$DO_GAF_ARG_INDEX_VALUES_GP = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-VALUES-GP");
        $list126 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)obsolete_macros.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)obsolete_macros.TWO_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym127$GP_MAP_US_IN_MT = SubLObjectFactory.makeSymbol("GP-MAP-US-IN-MT");
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-VALUES-GP"));
        $list129 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)obsolete_macros.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)obsolete_macros.TWO_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym130$GP_MAP_US_IN_MTS = SubLObjectFactory.makeSymbol("GP-MAP-US-IN-MTS");
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-MT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-VALUES-GP"));
        $sym132$GP_MAP_US_IN_ANY_MT = SubLObjectFactory.makeSymbol("GP-MAP-US-IN-ANY-MT");
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-VALUES-GP"));
        $list134 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)obsolete_macros.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)obsolete_macros.TWO_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym135$GP_MAP_US_IN_RELEVANT_MTS = SubLObjectFactory.makeSymbol("GP-MAP-US-IN-RELEVANT-MTS");
        $list136 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-IN-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-VALUES-GP"));
        $list137 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc NATs"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str138$mapping_Cyc_NATs = SubLObjectFactory.makeString("mapping Cyc NATs");
        $sym139$DO_NATS = SubLObjectFactory.makeSymbol("DO-NATS");
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-NARTS"));
        $sym141$DO_NARTS = SubLObjectFactory.makeSymbol("DO-NARTS");
        $list142 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BI-STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("HOST"), (SubLObject)SubLObjectFactory.makeSymbol("PORT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym143$WITH_PRIVATE_TCP_CONNECTION = SubLObjectFactory.makeSymbol("WITH-PRIVATE-TCP-CONNECTION");
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-TCP-CONNECTION"));
        $sym145$WITH_TCP_CONNECTION = SubLObjectFactory.makeSymbol("WITH-TCP-CONNECTION");
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACCESS-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
    }
}

/*

	Total time: 480 ms
	
*/
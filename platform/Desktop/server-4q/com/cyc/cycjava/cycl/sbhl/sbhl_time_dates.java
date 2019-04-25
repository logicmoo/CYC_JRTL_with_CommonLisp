package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.hlmt_relevance;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.binary_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_time_dates extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_dates";
    public static final String myFingerPrint = "ffaadcfaf842ea9e9be460e34674ce126560956e45960ed4bad079068ae6b107";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 2443L)
    public static SubLSymbol $sbhl_time_date_graph$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 5325L)
    public static SubLSymbol $sbhl_time_date_object_predicate_links$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 5514L)
    public static SubLSymbol $sbhl_time_date_object_inverse_links$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 5604L)
    public static SubLSymbol $sbhl_time_object_date_predicate_links$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 5695L)
    public static SubLSymbol $sbhl_time_object_date_inverse_links$;
    private static final SubLSymbol $sym0$_SBHL_TIME_DATE_GRAPH_;
    private static final SubLSymbol $sym1$SBHL_DATE_;
    private static final SubLSymbol $sym2$SBHL_DATE_P;
    private static final SubLSymbol $kw3$FORWARD;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw7$EARLIEST;
    private static final SubLSymbol $kw8$LATEST;
    private static final SubLSymbol $kw9$DIRECTION;
    private static final SubLSymbol $kw10$DONE;
    private static final SubLSymbol $sym11$ITERATOR;
    private static final SubLSymbol $sym12$CLET;
    private static final SubLSymbol $sym13$NEW_SBHL_TIME_DATE_ITERATOR;
    private static final SubLSymbol $sym14$DO_SBHL_ITERATOR;
    private static final SubLSymbol $sym15$_SBHL_TIME_DATE_OBJECT_PREDICATE_LINKS_;
    private static final SubLInteger $int16$1000;
    private static final SubLSymbol $sym17$_SBHL_TIME_DATE_OBJECT_INVERSE_LINKS_;
    private static final SubLSymbol $sym18$_SBHL_TIME_OBJECT_DATE_PREDICATE_LINKS_;
    private static final SubLSymbol $sym19$_SBHL_TIME_OBJECT_DATE_INVERSE_LINKS_;
    private static final SubLSymbol $kw20$WEAK;
    private static final SubLSymbol $sym21$INTEGERP;
    private static final SubLObject $const22$weak_HL_TimePrecedence;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$LINK_SUPPORTS;
    private static final SubLSymbol $sym25$DESTRUCTURE_SBHL_TIME_DATE_LINK;
    private static final SubLSymbol $sym26$IGNORE;
    private static final SubLSymbol $sym27$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym28$_OPTIONAL;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLSymbol $kw31$DATE_LOWER_BOUND;
    private static final SubLSymbol $kw32$DATE_UPPER_BOUND;
    private static final SubLSymbol $sym33$ITERATOR;
    private static final SubLSymbol $sym34$RAW_LINKS;
    private static final SubLSymbol $sym35$NEW_SBHL_TIME_DATE_LINK_ITERATOR;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$ITERATOR;
    private static final SubLSymbol $sym40$RAW_LINKS;
    private static final SubLSymbol $sym41$NEW_SBHL_TIME_DATE_DATE_LINK_ITERATOR;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$DATE0;
    private static final SubLSymbol $sym45$DATE1;
    private static final SubLSymbol $sym46$PIF;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$CSETQ;
    private static final SubLSymbol $sym49$FIF;
    private static final SubLSymbol $sym50$CAND;
    private static final SubLSymbol $sym51$SBHL_DATE_;
    private static final SubLSymbol $sym52$DO_SBHL_TIME_DATE_LINKS_BETWEEN_DATES;
    private static final SubLSymbol $sym53$SBHL_TIME_DATE_LINK_ITERATOR_DONE;
    private static final SubLSymbol $sym54$SBHL_TIME_DATE_LINK_ITERATOR_NEXT;
    private static final SubLSymbol $sym55$SBHL_TIME_DATE_LINK_ITERATOR_FINALIZE;
    private static final SubLSymbol $sym56$SBHL_TIME_DATE_DATE_LINK_ITERATOR_DONE;
    private static final SubLSymbol $sym57$SBHL_TIME_DATE_DATE_LINK_ITERATOR_NEXT;
    private static final SubLSymbol $sym58$SBHL_TIME_DATE_DATE_LINK_ITERATOR_FINALIZE;
    private static final SubLSymbol $kw59$BACKWARD;
    private static final SubLSymbol $sym60$SBHL_TIME_DATE_LINK_TAG_ITERATOR_DONE;
    private static final SubLSymbol $sym61$SBHL_TIME_DATE_LINK_TAG_ITERATOR_NEXT;
    private static final SubLSymbol $sym62$SBHL_TIME_DATE_LINK_TAG_ITERATOR_FINALIZE;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$SBHL_TIME_DATE_MT_LINK_ITERATOR_DONE;
    private static final SubLSymbol $sym65$SBHL_TIME_DATE_MT_LINK_ITERATOR_NEXT;
    private static final SubLSymbol $sym66$SBHL_TIME_DATE_MT_LINK_ITERATOR_FINALIZE;
    private static final SubLList $list67;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 964L)
    public static SubLObject sbhl_date_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_dates.NIL != numeric_date_utilities.extended_universal_date_p(v_object) || sbhl_time_dates.NIL != date_utilities.beginning_of_timeP(v_object) || sbhl_time_dates.NIL != date_utilities.end_of_timeP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 1382L)
    public static SubLObject sbhl_dateE(final SubLObject sbhl_date1, final SubLObject sbhl_date2) {
        return Equality.eql(sbhl_date1, sbhl_date2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 1470L)
    public static SubLObject sbhl_dateL(final SubLObject sbhl_date1, final SubLObject sbhl_date2) {
        if (sbhl_time_dates.NIL != date_utilities.beginning_of_timeP(sbhl_date2)) {
            return (SubLObject)sbhl_time_dates.NIL;
        }
        if (sbhl_time_dates.NIL != date_utilities.beginning_of_timeP(sbhl_date1)) {
            return (SubLObject)sbhl_time_dates.T;
        }
        if (sbhl_time_dates.NIL != date_utilities.end_of_timeP(sbhl_date1)) {
            return (SubLObject)sbhl_time_dates.NIL;
        }
        if (sbhl_time_dates.NIL != date_utilities.end_of_timeP(sbhl_date2)) {
            return (SubLObject)sbhl_time_dates.T;
        }
        return numeric_date_utilities.extended_universal_dateL(sbhl_date1, sbhl_date2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 1872L)
    public static SubLObject sbhl_dateLE(final SubLObject sbhl_date1, final SubLObject sbhl_date2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_dates.NIL != sbhl_dateE(sbhl_date1, sbhl_date2) || sbhl_time_dates.NIL != sbhl_dateL(sbhl_date1, sbhl_date2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 2014L)
    public static SubLObject sbhl_dateG(final SubLObject sbhl_date1, final SubLObject sbhl_date2) {
        return sbhl_dateL(sbhl_date2, sbhl_date1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 2109L)
    public static SubLObject sbhl_dateGE(final SubLObject sbhl_date1, final SubLObject sbhl_date2) {
        return sbhl_dateLE(sbhl_date2, sbhl_date1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 2206L)
    public static SubLObject sbhl_date_betweenP(final SubLObject between, final SubLObject early, final SubLObject late, SubLObject strictP) {
        if (strictP == sbhl_time_dates.UNPROVIDED) {
            strictP = (SubLObject)sbhl_time_dates.NIL;
        }
        return (SubLObject)((sbhl_time_dates.NIL != strictP) ? SubLObjectFactory.makeBoolean(sbhl_time_dates.NIL != sbhl_dateL(early, between) && sbhl_time_dates.NIL != sbhl_dateL(between, late)) : SubLObjectFactory.makeBoolean(sbhl_time_dates.NIL != sbhl_dateLE(early, between) && sbhl_time_dates.NIL != sbhl_dateLE(between, late)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 2614L)
    public static SubLObject sbhl_time_find_earliest_date(SubLObject sbhl_date, SubLObject strictP) {
        if (sbhl_date == sbhl_time_dates.UNPROVIDED) {
            sbhl_date = (SubLObject)sbhl_time_dates.NIL;
        }
        if (strictP == sbhl_time_dates.UNPROVIDED) {
            strictP = (SubLObject)sbhl_time_dates.NIL;
        }
        return binary_tree.avl_tree_find_least(sbhl_time_dates.$sbhl_time_date_graph$.getGlobalValue(), sbhl_date, strictP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 3053L)
    public static SubLObject sbhl_time_find_latest_date(SubLObject sbhl_date, SubLObject strictP) {
        if (sbhl_date == sbhl_time_dates.UNPROVIDED) {
            sbhl_date = (SubLObject)sbhl_time_dates.NIL;
        }
        if (strictP == sbhl_time_dates.UNPROVIDED) {
            strictP = (SubLObject)sbhl_time_dates.NIL;
        }
        return binary_tree.avl_tree_find_greatest(sbhl_time_dates.$sbhl_time_date_graph$.getGlobalValue(), sbhl_date, strictP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 3447L)
    public static SubLObject sbhl_time_add_date(final SubLObject sbhl_date) {
        assert sbhl_time_dates.NIL != sbhl_date_p(sbhl_date) : sbhl_date;
        binary_tree.avl_tree_insert(sbhl_time_dates.$sbhl_time_date_graph$.getGlobalValue(), sbhl_date);
        return (SubLObject)sbhl_time_dates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 3687L)
    public static SubLObject sbhl_time_remove_date(final SubLObject sbhl_date) {
        assert sbhl_time_dates.NIL != sbhl_date_p(sbhl_date) : sbhl_date;
        binary_tree.avl_tree_remove(sbhl_time_dates.$sbhl_time_date_graph$.getGlobalValue(), sbhl_date);
        return (SubLObject)sbhl_time_dates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 3895L)
    public static SubLObject clear_sbhl_time_dates() {
        binary_tree.clear_avl_tree(sbhl_time_dates.$sbhl_time_date_graph$.getGlobalValue());
        return (SubLObject)sbhl_time_dates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 4030L)
    public static SubLObject new_sbhl_time_date_iterator(SubLObject earliest, SubLObject latest, SubLObject direction) {
        if (earliest == sbhl_time_dates.UNPROVIDED) {
            earliest = (SubLObject)sbhl_time_dates.NIL;
        }
        if (latest == sbhl_time_dates.UNPROVIDED) {
            latest = (SubLObject)sbhl_time_dates.NIL;
        }
        if (direction == sbhl_time_dates.UNPROVIDED) {
            direction = (SubLObject)sbhl_time_dates.$kw3$FORWARD;
        }
        return binary_tree.new_avl_tree_sbhl_iterator(sbhl_time_dates.$sbhl_time_date_graph$.getGlobalValue(), earliest, latest, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 4675L)
    public static SubLObject do_sbhl_time_dates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject date = (SubLObject)sbhl_time_dates.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list4);
        date = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sbhl_time_dates.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sbhl_time_dates.NIL;
        SubLObject current_$1 = (SubLObject)sbhl_time_dates.NIL;
        while (sbhl_time_dates.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_time_dates.$list4);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_time_dates.$list4);
            if (sbhl_time_dates.NIL == conses_high.member(current_$1, (SubLObject)sbhl_time_dates.$list5, (SubLObject)sbhl_time_dates.UNPROVIDED, (SubLObject)sbhl_time_dates.UNPROVIDED)) {
                bad = (SubLObject)sbhl_time_dates.T;
            }
            if (current_$1 == sbhl_time_dates.$kw6$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sbhl_time_dates.NIL != bad && sbhl_time_dates.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_time_dates.$list4);
        }
        final SubLObject earliest_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_time_dates.$kw7$EARLIEST, current);
        final SubLObject earliest = (SubLObject)((sbhl_time_dates.NIL != earliest_tail) ? conses_high.cadr(earliest_tail) : sbhl_time_dates.NIL);
        final SubLObject latest_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_time_dates.$kw8$LATEST, current);
        final SubLObject latest = (SubLObject)((sbhl_time_dates.NIL != latest_tail) ? conses_high.cadr(latest_tail) : sbhl_time_dates.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_time_dates.$kw9$DIRECTION, current);
        final SubLObject direction = (SubLObject)((sbhl_time_dates.NIL != direction_tail) ? conses_high.cadr(direction_tail) : sbhl_time_dates.$kw3$FORWARD);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_time_dates.$kw10$DONE, current);
        final SubLObject done = (SubLObject)((sbhl_time_dates.NIL != done_tail) ? conses_high.cadr(done_tail) : sbhl_time_dates.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject iterator = (SubLObject)sbhl_time_dates.$sym11$ITERATOR;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator, (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym13$NEW_SBHL_TIME_DATE_ITERATOR, earliest, latest, direction))), (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_dates.$sym14$DO_SBHL_ITERATOR, (SubLObject)ConsesLow.list(date, iterator, (SubLObject)sbhl_time_dates.$kw10$DONE, done), ConsesLow.append(body, (SubLObject)sbhl_time_dates.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 5786L)
    public static SubLObject sbhl_time_date_min_linked_date(final SubLObject node, SubLObject mt) {
        if (mt == sbhl_time_dates.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_dates.NIL;
        }
        if (sbhl_time_dates.NIL != sbhl_date_p(node)) {
            return Values.values(node, (SubLObject)sbhl_time_dates.$kw20$WEAK, (SubLObject)sbhl_time_dates.NIL);
        }
        if (sbhl_time_dates.NIL != sbhl_time_utilities.hl_date_point_p(node)) {
            return Values.values(sbhl_time_utilities.hl_interval_of_endpoint(node), (SubLObject)sbhl_time_dates.$kw20$WEAK, (SubLObject)sbhl_time_dates.NIL);
        }
        if (sbhl_time_dates.NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) {
            return sbhl_time_date_min_linked_date_int(sbhl_time_dates.$sbhl_time_object_date_predicate_links$.getGlobalValue(), node, mt);
        }
        return sbhl_time_date_min_linked_date_int(sbhl_time_dates.$sbhl_time_object_date_inverse_links$.getGlobalValue(), node, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 6470L)
    public static SubLObject sbhl_time_date_min_linked_date_int(final SubLObject link_table, final SubLObject node, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node_entry = dictionary.dictionary_lookup_without_values(link_table, node, (SubLObject)sbhl_time_dates.UNPROVIDED);
        SubLObject min_date = (SubLObject)sbhl_time_dates.NIL;
        SubLObject min_date_tag = (SubLObject)sbhl_time_dates.NIL;
        SubLObject min_date_supports = (SubLObject)sbhl_time_dates.NIL;
        if (sbhl_time_dates.NIL != node_entry) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(node_entry)); sbhl_time_dates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject tag = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject tag_entry = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject iteration_state_$2;
                    for (iteration_state_$2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tag_entry)); sbhl_time_dates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$2); iteration_state_$2 = dictionary_contents.do_dictionary_contents_next(iteration_state_$2)) {
                        thread.resetMultipleValues();
                        final SubLObject mt_$3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$2);
                        final SubLObject mt_entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (sbhl_time_dates.NIL != mt_relevance_macros.relevant_mtP(mt_$3)) {
                            SubLObject iteration_state_$3;
                            for (iteration_state_$3 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_entry)); sbhl_time_dates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$3); iteration_state_$3 = dictionary_contents.do_dictionary_contents_next(iteration_state_$3)) {
                                thread.resetMultipleValues();
                                final SubLObject date = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$3);
                                final SubLObject supports = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (sbhl_time_dates.NIL == min_date || sbhl_time_dates.NIL != sbhl_dateL(date, min_date)) {
                                    min_date = date;
                                    min_date_tag = tag;
                                    min_date_supports = supports;
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$3);
                        }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$2);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(min_date, min_date_tag, min_date_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 7114L)
    public static SubLObject sbhl_time_date_max_linked_date(final SubLObject node, SubLObject mt) {
        if (mt == sbhl_time_dates.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_dates.NIL;
        }
        if (sbhl_time_dates.NIL != sbhl_date_p(node)) {
            return Values.values(node, (SubLObject)sbhl_time_dates.$kw20$WEAK, (SubLObject)sbhl_time_dates.NIL);
        }
        if (sbhl_time_dates.NIL != sbhl_time_utilities.hl_date_point_p(node)) {
            return Values.values(sbhl_time_utilities.hl_interval_of_endpoint(node), (SubLObject)sbhl_time_dates.$kw20$WEAK, (SubLObject)sbhl_time_dates.NIL);
        }
        if (sbhl_time_dates.NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) {
            return sbhl_time_date_max_linked_date_int(sbhl_time_dates.$sbhl_time_object_date_predicate_links$.getGlobalValue(), node, mt);
        }
        return sbhl_time_date_max_linked_date_int(sbhl_time_dates.$sbhl_time_object_date_inverse_links$.getGlobalValue(), node, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 7766L)
    public static SubLObject sbhl_time_date_max_linked_date_int(final SubLObject link_table, final SubLObject node, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node_entry = dictionary.dictionary_lookup_without_values(link_table, node, (SubLObject)sbhl_time_dates.UNPROVIDED);
        SubLObject max_date = (SubLObject)sbhl_time_dates.NIL;
        SubLObject max_date_tag = (SubLObject)sbhl_time_dates.NIL;
        SubLObject max_date_supports = (SubLObject)sbhl_time_dates.NIL;
        if (sbhl_time_dates.NIL != node_entry) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(node_entry)); sbhl_time_dates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject tag = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject tag_entry = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject iteration_state_$5;
                    for (iteration_state_$5 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tag_entry)); sbhl_time_dates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$5); iteration_state_$5 = dictionary_contents.do_dictionary_contents_next(iteration_state_$5)) {
                        thread.resetMultipleValues();
                        final SubLObject mt_$6 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$5);
                        final SubLObject mt_entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (sbhl_time_dates.NIL != mt_relevance_macros.relevant_mtP(mt_$6)) {
                            SubLObject iteration_state_$6;
                            for (iteration_state_$6 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_entry)); sbhl_time_dates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$6); iteration_state_$6 = dictionary_contents.do_dictionary_contents_next(iteration_state_$6)) {
                                thread.resetMultipleValues();
                                final SubLObject date = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$6);
                                final SubLObject supports = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (sbhl_time_dates.NIL == max_date || sbhl_time_dates.NIL != sbhl_dateG(date, max_date)) {
                                    max_date = date;
                                    max_date_tag = tag;
                                    max_date_supports = supports;
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$6);
                        }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$5);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(max_date, max_date_tag, max_date_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 8410L)
    public static SubLObject sbhl_time_date_relevant_linked_date(final SubLObject node, SubLObject mt) {
        if (mt == sbhl_time_dates.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_dates.NIL;
        }
        return (sbhl_time_dates.NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) ? sbhl_time_date_min_linked_date(node, mt) : sbhl_time_date_max_linked_date(node, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 8745L)
    public static SubLObject sbhl_time_date_node_links_to_dateP(final SubLObject node, SubLObject mt) {
        if (mt == sbhl_time_dates.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_dates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)sbhl_time_dates.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            successP = ((sbhl_time_dates.NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) ? sbhl_time_dates_link_existsP(sbhl_time_dates.$sbhl_time_object_date_predicate_links$.getGlobalValue(), node) : sbhl_time_dates_link_existsP(sbhl_time_dates.$sbhl_time_object_date_inverse_links$.getGlobalValue(), node));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 9215L)
    public static SubLObject sbhl_time_date_date_links_to_nodeP(final SubLObject date, SubLObject mt) {
        if (mt == sbhl_time_dates.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_dates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)sbhl_time_dates.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            successP = ((sbhl_time_dates.NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) ? sbhl_time_dates_link_existsP(sbhl_time_dates.$sbhl_time_date_object_predicate_links$.getGlobalValue(), date) : sbhl_time_dates_link_existsP(sbhl_time_dates.$sbhl_time_date_object_inverse_links$.getGlobalValue(), date));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 9684L)
    public static SubLObject sbhl_time_dates_link_existsP(final SubLObject link_table, final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject obj_entry = dictionary.dictionary_lookup_without_values(link_table, obj, (SubLObject)sbhl_time_dates.UNPROVIDED);
        SubLObject linkP = (SubLObject)sbhl_time_dates.NIL;
        if (sbhl_time_dates.NIL != obj_entry) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(obj_entry)); sbhl_time_dates.NIL == linkP && sbhl_time_dates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject tag_entry = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject iteration_state_$8;
                for (iteration_state_$8 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tag_entry)); sbhl_time_dates.NIL == linkP && sbhl_time_dates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$8); iteration_state_$8 = dictionary_contents.do_dictionary_contents_next(iteration_state_$8)) {
                    thread.resetMultipleValues();
                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$8);
                    final SubLObject mt_entry = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (sbhl_time_dates.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                        linkP = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_dates.NIL == dictionary.dictionary_empty_p(mt_entry));
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$8);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return linkP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 10062L)
    public static SubLObject sbhl_time_date_node_date_link_supports(final SubLObject node, final SubLObject tag, final SubLObject date, SubLObject mt) {
        if (mt == sbhl_time_dates.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_dates.NIL;
        }
        return (sbhl_time_dates.NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) ? sbhl_time_date_link_supports_int(sbhl_time_dates.$sbhl_time_object_date_predicate_links$.getGlobalValue(), node, tag, date, mt) : sbhl_time_date_link_supports_int(sbhl_time_dates.$sbhl_time_object_date_inverse_links$.getGlobalValue(), node, tag, date, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 10418L)
    public static SubLObject sbhl_time_date_date_node_link_supports(final SubLObject date, final SubLObject tag, final SubLObject node, SubLObject mt) {
        if (mt == sbhl_time_dates.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_dates.NIL;
        }
        return (sbhl_time_dates.NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) ? sbhl_time_date_link_supports_int(sbhl_time_dates.$sbhl_time_date_object_predicate_links$.getGlobalValue(), date, tag, node, mt) : sbhl_time_date_link_supports_int(sbhl_time_dates.$sbhl_time_date_object_inverse_links$.getGlobalValue(), date, tag, node, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 10774L)
    public static SubLObject sbhl_time_date_link_supports_int(final SubLObject link_table, final SubLObject obj1, final SubLObject tag, final SubLObject obj2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject obj1_entry = dictionary.dictionary_lookup_without_values(link_table, obj1, (SubLObject)sbhl_time_dates.UNPROVIDED);
        SubLObject supports = (SubLObject)sbhl_time_dates.NIL;
        if (sbhl_time_dates.NIL != obj1_entry) {
            final SubLObject tag_entry = dictionary.dictionary_lookup_without_values(obj1_entry, tag, (SubLObject)sbhl_time_dates.UNPROVIDED);
            if (sbhl_time_dates.NIL != tag_entry) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                    SubLObject iteration_state;
                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tag_entry)); sbhl_time_dates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                        thread.resetMultipleValues();
                        final SubLObject mt_$9 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        final SubLObject mt_entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (sbhl_time_dates.NIL != mt_relevance_macros.relevant_mtP(mt_$9)) {
                            supports = ConsesLow.append(supports, dictionary.dictionary_lookup_without_values(mt_entry, obj2, (SubLObject)sbhl_time_dates.UNPROVIDED));
                        }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 11283L)
    public static SubLObject clear_sbhl_time_date_link_tables() {
        dictionary.clear_dictionary(sbhl_time_dates.$sbhl_time_date_object_predicate_links$.getGlobalValue());
        dictionary.clear_dictionary(sbhl_time_dates.$sbhl_time_date_object_inverse_links$.getGlobalValue());
        dictionary.clear_dictionary(sbhl_time_dates.$sbhl_time_object_date_predicate_links$.getGlobalValue());
        dictionary.clear_dictionary(sbhl_time_dates.$sbhl_time_object_date_inverse_links$.getGlobalValue());
        return (SubLObject)sbhl_time_dates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 11632L)
    public static SubLObject sbhl_time_dates_add_link_support(final SubLObject support, final SubLObject link_tag, final SubLObject obj1, final SubLObject obj2, final SubLObject mt) {
        final SubLObject interval1 = sbhl_time_utilities.hl_interval_of_endpoint(obj1);
        final SubLObject interval2 = sbhl_time_utilities.hl_interval_of_endpoint(obj2);
        SubLObject link_addedP = (SubLObject)sbhl_time_dates.NIL;
        if (sbhl_time_dates.NIL != sbhl_date_p(interval1) && sbhl_time_dates.NIL == sbhl_date_p(interval2)) {
            link_addedP = sbhl_time_dates_add_link_support_int(sbhl_time_dates.$sbhl_time_date_object_predicate_links$.getGlobalValue(), support, link_tag, interval1, obj2, mt);
            sbhl_time_dates_add_link_support_int(sbhl_time_dates.$sbhl_time_object_date_inverse_links$.getGlobalValue(), support, link_tag, obj2, interval1, mt);
            sbhl_time_add_date(interval1);
        }
        else if (sbhl_time_dates.NIL == sbhl_date_p(interval1) && sbhl_time_dates.NIL != sbhl_date_p(interval2)) {
            link_addedP = sbhl_time_dates_add_link_support_int(sbhl_time_dates.$sbhl_time_object_date_predicate_links$.getGlobalValue(), support, link_tag, obj1, interval2, mt);
            sbhl_time_dates_add_link_support_int(sbhl_time_dates.$sbhl_time_date_object_inverse_links$.getGlobalValue(), support, link_tag, interval2, obj1, mt);
            sbhl_time_add_date(interval2);
        }
        return link_addedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 12683L)
    public static SubLObject sbhl_time_dates_add_link_support_int(final SubLObject link_table, final SubLObject support, final SubLObject link_tag, final SubLObject key, final SubLObject value, final SubLObject mt) {
        SubLObject key_entry = dictionary.dictionary_lookup_without_values(link_table, key, (SubLObject)sbhl_time_dates.UNPROVIDED);
        SubLObject link_addedP = (SubLObject)sbhl_time_dates.NIL;
        if (sbhl_time_dates.NIL == key_entry) {
            key_entry = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sbhl_time_dates.EQL), (SubLObject)sbhl_time_dates.UNPROVIDED);
            dictionary.dictionary_enter(link_table, key, key_entry);
        }
        SubLObject tag_entry = dictionary.dictionary_lookup_without_values(key_entry, link_tag, (SubLObject)sbhl_time_dates.UNPROVIDED);
        if (sbhl_time_dates.NIL == tag_entry) {
            tag_entry = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sbhl_time_dates.EQUAL), (SubLObject)sbhl_time_dates.UNPROVIDED);
            dictionary.dictionary_enter(key_entry, link_tag, tag_entry);
        }
        SubLObject mt_entry = dictionary.dictionary_lookup_without_values(tag_entry, mt, (SubLObject)sbhl_time_dates.UNPROVIDED);
        if (sbhl_time_dates.NIL == mt_entry) {
            mt_entry = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sbhl_time_dates.EQL), (SubLObject)sbhl_time_dates.UNPROVIDED);
            dictionary.dictionary_enter(tag_entry, mt, mt_entry);
        }
        final SubLObject value_entry = dictionary.dictionary_lookup_without_values(mt_entry, value, (SubLObject)sbhl_time_dates.UNPROVIDED);
        if (sbhl_time_dates.NIL == value_entry) {
            link_addedP = (SubLObject)sbhl_time_dates.T;
        }
        if (sbhl_time_dates.NIL == subl_promotions.memberP(support, value_entry, Symbols.symbol_function((SubLObject)sbhl_time_dates.EQUAL), (SubLObject)sbhl_time_dates.UNPROVIDED)) {
            dictionary_utilities.dictionary_push(mt_entry, value, support);
        }
        return link_addedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 13613L)
    public static SubLObject sbhl_time_dates_remove_link_support(final SubLObject support, final SubLObject link_tag, final SubLObject obj1, final SubLObject obj2, final SubLObject mt) {
        final SubLObject interval1 = sbhl_time_utilities.hl_interval_of_endpoint(obj1);
        final SubLObject interval2 = sbhl_time_utilities.hl_interval_of_endpoint(obj2);
        if (sbhl_time_dates.NIL != sbhl_date_p(interval1) && sbhl_time_dates.NIL == sbhl_date_p(interval2)) {
            sbhl_time_dates_remove_link_support_int(sbhl_time_dates.$sbhl_time_date_object_predicate_links$.getGlobalValue(), support, link_tag, interval1, obj2, mt);
            sbhl_time_dates_remove_link_support_int(sbhl_time_dates.$sbhl_time_object_date_inverse_links$.getGlobalValue(), support, link_tag, obj2, interval1, mt);
            if (sbhl_time_dates.NIL == dictionary.dictionary_lookup_without_values(sbhl_time_dates.$sbhl_time_date_object_predicate_links$.getGlobalValue(), interval1, (SubLObject)sbhl_time_dates.UNPROVIDED) && sbhl_time_dates.NIL == dictionary.dictionary_lookup_without_values(sbhl_time_dates.$sbhl_time_date_object_inverse_links$.getGlobalValue(), interval1, (SubLObject)sbhl_time_dates.UNPROVIDED)) {
                sbhl_time_remove_date(interval1);
            }
        }
        else if (sbhl_time_dates.NIL == sbhl_date_p(interval1) && sbhl_time_dates.NIL != sbhl_date_p(interval2)) {
            sbhl_time_dates_remove_link_support_int(sbhl_time_dates.$sbhl_time_object_date_predicate_links$.getGlobalValue(), support, link_tag, obj1, interval2, mt);
            sbhl_time_dates_remove_link_support_int(sbhl_time_dates.$sbhl_time_date_object_inverse_links$.getGlobalValue(), support, link_tag, interval2, obj1, mt);
            if (sbhl_time_dates.NIL == dictionary.dictionary_lookup_without_values(sbhl_time_dates.$sbhl_time_date_object_predicate_links$.getGlobalValue(), interval2, (SubLObject)sbhl_time_dates.UNPROVIDED) && sbhl_time_dates.NIL == dictionary.dictionary_lookup_without_values(sbhl_time_dates.$sbhl_time_date_object_inverse_links$.getGlobalValue(), interval2, (SubLObject)sbhl_time_dates.UNPROVIDED)) {
                sbhl_time_remove_date(interval2);
            }
        }
        return (SubLObject)sbhl_time_dates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 15058L)
    public static SubLObject sbhl_time_dates_remove_link_support_int(final SubLObject link_table, final SubLObject support, final SubLObject link_tag, final SubLObject key, final SubLObject value, final SubLObject mt) {
        final SubLObject key_entry = dictionary.dictionary_lookup_without_values(link_table, key, (SubLObject)sbhl_time_dates.UNPROVIDED);
        if (sbhl_time_dates.NIL != key_entry) {
            final SubLObject tag_entry = dictionary.dictionary_lookup_without_values(key_entry, link_tag, (SubLObject)sbhl_time_dates.UNPROVIDED);
            if (sbhl_time_dates.NIL != tag_entry) {
                final SubLObject mt_entry = dictionary.dictionary_lookup_without_values(tag_entry, mt, (SubLObject)sbhl_time_dates.UNPROVIDED);
                if (sbhl_time_dates.NIL != mt_entry) {
                    dictionary_utilities.dictionary_delete_from_value(mt_entry, value, support, (SubLObject)sbhl_time_dates.UNPROVIDED, (SubLObject)sbhl_time_dates.UNPROVIDED);
                    if (sbhl_time_dates.NIL != dictionary.dictionary_empty_p(mt_entry)) {
                        dictionary.dictionary_remove(tag_entry, mt);
                        if (sbhl_time_dates.NIL != dictionary.dictionary_empty_p(tag_entry)) {
                            dictionary.dictionary_remove(key_entry, link_tag);
                            if (sbhl_time_dates.NIL != dictionary.dictionary_empty_p(key_entry)) {
                                dictionary.dictionary_remove(key_entry, mt);
                            }
                        }
                    }
                }
            }
        }
        return (SubLObject)sbhl_time_dates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 15766L)
    public static SubLObject sbhl_time_date_node_with_min_date_link(final SubLObject nodes, SubLObject mt) {
        if (mt == sbhl_time_dates.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_dates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_time_dates.NIL != list_utilities.singletonP(nodes)) {
            final SubLObject node = nodes.first();
            thread.resetMultipleValues();
            final SubLObject date = sbhl_time_date_min_linked_date(node, mt);
            final SubLObject tag = thread.secondMultipleValue();
            final SubLObject supports = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return (sbhl_time_dates.NIL != date) ? Values.values(node, date, tag) : Values.values((SubLObject)sbhl_time_dates.NIL, (SubLObject)sbhl_time_dates.NIL, (SubLObject)sbhl_time_dates.NIL);
        }
        SubLObject min_node = (SubLObject)sbhl_time_dates.NIL;
        SubLObject min_date = (SubLObject)sbhl_time_dates.NIL;
        SubLObject min_tag = (SubLObject)sbhl_time_dates.NIL;
        SubLObject cdolist_list_var = nodes;
        SubLObject node2 = (SubLObject)sbhl_time_dates.NIL;
        node2 = cdolist_list_var.first();
        while (sbhl_time_dates.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject node_min_date = sbhl_time_date_min_linked_date(node2, mt);
            final SubLObject node_min_date_tag = thread.secondMultipleValue();
            final SubLObject node_min_date_supports = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (sbhl_time_dates.NIL != node_min_date && (sbhl_time_dates.NIL == min_date || sbhl_time_dates.NIL != sbhl_dateL(node_min_date, min_date))) {
                min_node = node2;
                min_date = node_min_date;
                min_tag = node_min_date_tag;
            }
            cdolist_list_var = cdolist_list_var.rest();
            node2 = cdolist_list_var.first();
        }
        return Values.values(min_node, min_date, min_tag);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 16792L)
    public static SubLObject sbhl_time_date_node_with_max_date_link(final SubLObject nodes, SubLObject mt) {
        if (mt == sbhl_time_dates.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_dates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_time_dates.NIL != list_utilities.singletonP(nodes)) {
            final SubLObject node = nodes.first();
            thread.resetMultipleValues();
            final SubLObject date = sbhl_time_date_max_linked_date(node, mt);
            final SubLObject tag = thread.secondMultipleValue();
            final SubLObject supports = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return (sbhl_time_dates.NIL != date) ? Values.values(node, date, tag) : Values.values((SubLObject)sbhl_time_dates.NIL, (SubLObject)sbhl_time_dates.NIL, (SubLObject)sbhl_time_dates.NIL);
        }
        SubLObject max_node = (SubLObject)sbhl_time_dates.NIL;
        SubLObject max_date = (SubLObject)sbhl_time_dates.NIL;
        SubLObject max_tag = (SubLObject)sbhl_time_dates.NIL;
        SubLObject cdolist_list_var = nodes;
        SubLObject node2 = (SubLObject)sbhl_time_dates.NIL;
        node2 = cdolist_list_var.first();
        while (sbhl_time_dates.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject node_max_date = sbhl_time_date_max_linked_date(node2, mt);
            final SubLObject node_max_date_tag = thread.secondMultipleValue();
            final SubLObject node_max_date_supports = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (sbhl_time_dates.NIL != node_max_date && (sbhl_time_dates.NIL == max_date || sbhl_time_dates.NIL != sbhl_dateG(node_max_date, max_date))) {
                max_node = node2;
                max_date = node_max_date;
                max_tag = node_max_date_tag;
            }
            cdolist_list_var = cdolist_list_var.rest();
            node2 = cdolist_list_var.first();
        }
        return Values.values(max_node, max_date, max_tag);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 17778L)
    public static SubLObject sbhl_time_date_find_search_node(final SubLObject node, SubLObject mt, SubLObject depth) {
        if (mt == sbhl_time_dates.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_dates.NIL;
        }
        if (depth == sbhl_time_dates.UNPROVIDED) {
            depth = (SubLObject)sbhl_time_dates.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject search_node = (SubLObject)sbhl_time_dates.NIL;
        SubLObject search_date = (SubLObject)sbhl_time_dates.NIL;
        SubLObject search_tag = (SubLObject)sbhl_time_dates.NIL;
        assert sbhl_time_dates.NIL != Types.integerp(depth) : depth;
        final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding(thread);
        try {
            sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(depth, thread);
            sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind((SubLObject)sbhl_time_dates.NIL, thread);
            if (sbhl_time_dates.NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) {
                thread.resetMultipleValues();
                final SubLObject search_node_$10 = sbhl_time_date_node_with_min_date_link(sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(sbhl_time_dates.$const22$weak_HL_TimePrecedence), node, mt, (SubLObject)sbhl_time_dates.UNPROVIDED), mt);
                final SubLObject search_date_$11 = thread.secondMultipleValue();
                final SubLObject search_tag_$12 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                search_node = search_node_$10;
                search_date = search_date_$11;
                search_tag = search_tag_$12;
            }
            else {
                thread.resetMultipleValues();
                final SubLObject search_node_$11 = sbhl_time_date_node_with_max_date_link(sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(sbhl_time_dates.$const22$weak_HL_TimePrecedence), node, mt, (SubLObject)sbhl_time_dates.UNPROVIDED), mt);
                final SubLObject search_date_$12 = thread.secondMultipleValue();
                final SubLObject search_tag_$13 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                search_node = search_node_$11;
                search_date = search_date_$12;
                search_tag = search_tag_$13;
            }
        }
        finally {
            sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind(_prev_bind_2, thread);
            sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0, thread);
        }
        return Values.values(search_node, search_date, search_tag);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 18604L)
    public static SubLObject destructure_sbhl_time_date_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list23);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_tag = (SubLObject)sbhl_time_dates.NIL;
        SubLObject link_mt = (SubLObject)sbhl_time_dates.NIL;
        SubLObject link_node = (SubLObject)sbhl_time_dates.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list23);
        link_tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list23);
        link_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list23);
        link_node = current.first();
        current = current.rest();
        final SubLObject link_supports = (SubLObject)(current.isCons() ? current.first() : sbhl_time_dates.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_time_dates.$list23);
        current = current.rest();
        if (sbhl_time_dates.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_time_dates.$list23);
            return (SubLObject)sbhl_time_dates.NIL;
        }
        current = temp;
        SubLObject link = (SubLObject)sbhl_time_dates.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list23);
        link = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (sbhl_time_dates.NIL == link_supports) {
            final SubLObject link_supports_$16 = (SubLObject)sbhl_time_dates.$sym24$LINK_SUPPORTS;
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_dates.$sym25$DESTRUCTURE_SBHL_TIME_DATE_LINK, (SubLObject)ConsesLow.list(link_tag, link_mt, link_node, link_supports_$16), link, (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym26$IGNORE, link_supports_$16), ConsesLow.append(body, (SubLObject)sbhl_time_dates.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_dates.$sym27$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(link_tag, link_mt, link_node, (SubLObject)sbhl_time_dates.$sym28$_OPTIONAL, link_supports), link, ConsesLow.append(body, (SubLObject)sbhl_time_dates.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 19076L)
    public static SubLObject do_sbhl_time_date_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link0 = (SubLObject)sbhl_time_dates.NIL;
        SubLObject link2 = (SubLObject)sbhl_time_dates.NIL;
        SubLObject link3 = (SubLObject)sbhl_time_dates.NIL;
        SubLObject node = (SubLObject)sbhl_time_dates.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list29);
        link0 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list29);
        link2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list29);
        link3 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list29);
        node = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sbhl_time_dates.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sbhl_time_dates.NIL;
        SubLObject current_$17 = (SubLObject)sbhl_time_dates.NIL;
        while (sbhl_time_dates.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_time_dates.$list29);
            current_$17 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_time_dates.$list29);
            if (sbhl_time_dates.NIL == conses_high.member(current_$17, (SubLObject)sbhl_time_dates.$list30, (SubLObject)sbhl_time_dates.UNPROVIDED, (SubLObject)sbhl_time_dates.UNPROVIDED)) {
                bad = (SubLObject)sbhl_time_dates.T;
            }
            if (current_$17 == sbhl_time_dates.$kw6$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sbhl_time_dates.NIL != bad && sbhl_time_dates.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_time_dates.$list29);
        }
        final SubLObject date_lower_bound_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_time_dates.$kw31$DATE_LOWER_BOUND, current);
        final SubLObject date_lower_bound = (SubLObject)((sbhl_time_dates.NIL != date_lower_bound_tail) ? conses_high.cadr(date_lower_bound_tail) : sbhl_time_dates.NIL);
        final SubLObject date_upper_bound_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_time_dates.$kw32$DATE_UPPER_BOUND, current);
        final SubLObject date_upper_bound = (SubLObject)((sbhl_time_dates.NIL != date_upper_bound_tail) ? conses_high.cadr(date_upper_bound_tail) : sbhl_time_dates.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_time_dates.$kw10$DONE, current);
        final SubLObject done = (SubLObject)((sbhl_time_dates.NIL != done_tail) ? conses_high.cadr(done_tail) : sbhl_time_dates.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject iterator = (SubLObject)sbhl_time_dates.$sym33$ITERATOR;
        final SubLObject raw_links = (SubLObject)sbhl_time_dates.$sym34$RAW_LINKS;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator, (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym35$NEW_SBHL_TIME_DATE_LINK_ITERATOR, node, (SubLObject)sbhl_time_dates.$list36, date_lower_bound, date_upper_bound))), (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym14$DO_SBHL_ITERATOR, (SubLObject)ConsesLow.list(raw_links, iterator, (SubLObject)sbhl_time_dates.$kw10$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_dates.$sym27$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(link0, link2, link3), raw_links, ConsesLow.append(body, (SubLObject)sbhl_time_dates.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 19510L)
    public static SubLObject do_sbhl_time_date_links_between_dates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link0 = (SubLObject)sbhl_time_dates.NIL;
        SubLObject link2 = (SubLObject)sbhl_time_dates.NIL;
        SubLObject date0 = (SubLObject)sbhl_time_dates.NIL;
        SubLObject date2 = (SubLObject)sbhl_time_dates.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list37);
        link0 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list37);
        link2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list37);
        date0 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list37);
        date2 = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sbhl_time_dates.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sbhl_time_dates.NIL;
        SubLObject current_$18 = (SubLObject)sbhl_time_dates.NIL;
        while (sbhl_time_dates.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_time_dates.$list37);
            current_$18 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_time_dates.$list37);
            if (sbhl_time_dates.NIL == conses_high.member(current_$18, (SubLObject)sbhl_time_dates.$list38, (SubLObject)sbhl_time_dates.UNPROVIDED, (SubLObject)sbhl_time_dates.UNPROVIDED)) {
                bad = (SubLObject)sbhl_time_dates.T;
            }
            if (current_$18 == sbhl_time_dates.$kw6$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sbhl_time_dates.NIL != bad && sbhl_time_dates.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_time_dates.$list37);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_time_dates.$kw10$DONE, current);
        final SubLObject done = (SubLObject)((sbhl_time_dates.NIL != done_tail) ? conses_high.cadr(done_tail) : sbhl_time_dates.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject iterator = (SubLObject)sbhl_time_dates.$sym39$ITERATOR;
        final SubLObject raw_links = (SubLObject)sbhl_time_dates.$sym40$RAW_LINKS;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator, (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_dates.$sym41$NEW_SBHL_TIME_DATE_DATE_LINK_ITERATOR, date0, date2, (SubLObject)sbhl_time_dates.$list42))), (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym14$DO_SBHL_ITERATOR, (SubLObject)ConsesLow.list(raw_links, iterator, (SubLObject)sbhl_time_dates.$kw10$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_dates.$sym27$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(link0, link2), raw_links, ConsesLow.append(body, (SubLObject)sbhl_time_dates.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 19895L)
    public static SubLObject do_sbhl_time_date_date_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list43);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link0 = (SubLObject)sbhl_time_dates.NIL;
        SubLObject link2 = (SubLObject)sbhl_time_dates.NIL;
        SubLObject date = (SubLObject)sbhl_time_dates.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list43);
        link0 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list43);
        link2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list43);
        date = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sbhl_time_dates.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sbhl_time_dates.NIL;
        SubLObject current_$19 = (SubLObject)sbhl_time_dates.NIL;
        while (sbhl_time_dates.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_time_dates.$list43);
            current_$19 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_time_dates.$list43);
            if (sbhl_time_dates.NIL == conses_high.member(current_$19, (SubLObject)sbhl_time_dates.$list30, (SubLObject)sbhl_time_dates.UNPROVIDED, (SubLObject)sbhl_time_dates.UNPROVIDED)) {
                bad = (SubLObject)sbhl_time_dates.T;
            }
            if (current_$19 == sbhl_time_dates.$kw6$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sbhl_time_dates.NIL != bad && sbhl_time_dates.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_time_dates.$list43);
        }
        final SubLObject date_lower_bound_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_time_dates.$kw31$DATE_LOWER_BOUND, current);
        final SubLObject date_lower_bound = (SubLObject)((sbhl_time_dates.NIL != date_lower_bound_tail) ? conses_high.cadr(date_lower_bound_tail) : sbhl_time_dates.NIL);
        final SubLObject date_upper_bound_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_time_dates.$kw32$DATE_UPPER_BOUND, current);
        final SubLObject date_upper_bound = (SubLObject)((sbhl_time_dates.NIL != date_upper_bound_tail) ? conses_high.cadr(date_upper_bound_tail) : sbhl_time_dates.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_time_dates.$kw10$DONE, current);
        final SubLObject done = (SubLObject)((sbhl_time_dates.NIL != done_tail) ? conses_high.cadr(done_tail) : sbhl_time_dates.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject date2 = (SubLObject)sbhl_time_dates.$sym44$DATE0;
        final SubLObject date3 = (SubLObject)sbhl_time_dates.$sym45$DATE1;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym12$CLET, (SubLObject)ConsesLow.list(date2, date3), (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym46$PIF, (SubLObject)sbhl_time_dates.$list47, (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym48$CSETQ, date2, (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym49$FIF, (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym50$CAND, date_lower_bound, (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym1$SBHL_DATE_, date, date_lower_bound)), date_lower_bound, date), date3, date_upper_bound), (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym48$CSETQ, date2, date_lower_bound, date3, (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym49$FIF, (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym50$CAND, date_upper_bound, (SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$sym51$SBHL_DATE_, date, date_upper_bound)), date_upper_bound, date))), (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_dates.$sym52$DO_SBHL_TIME_DATE_LINKS_BETWEEN_DATES, (SubLObject)ConsesLow.list(link0, link2, date2, date3, (SubLObject)sbhl_time_dates.$kw10$DONE, done), ConsesLow.append(body, (SubLObject)sbhl_time_dates.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 20588L)
    public static SubLObject new_sbhl_time_date_link_iterator(final SubLObject node, SubLObject direction, SubLObject date_lower_bound, SubLObject date_upper_bound) {
        if (direction == sbhl_time_dates.UNPROVIDED) {
            direction = sbhl_link_vars.get_sbhl_link_direction();
        }
        if (date_lower_bound == sbhl_time_dates.UNPROVIDED) {
            date_lower_bound = (SubLObject)sbhl_time_dates.NIL;
        }
        if (date_upper_bound == sbhl_time_dates.UNPROVIDED) {
            date_upper_bound = (SubLObject)sbhl_time_dates.NIL;
        }
        final SubLObject tag_link_table = (sbhl_time_dates.NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction)) ? dictionary.dictionary_lookup_without_values(sbhl_time_dates.$sbhl_time_object_date_predicate_links$.getGlobalValue(), node, (SubLObject)sbhl_time_dates.UNPROVIDED) : dictionary.dictionary_lookup_without_values(sbhl_time_dates.$sbhl_time_object_date_inverse_links$.getGlobalValue(), node, (SubLObject)sbhl_time_dates.UNPROVIDED);
        SubLObject state = (SubLObject)sbhl_time_dates.NIL;
        if (sbhl_time_dates.NIL != tag_link_table && (sbhl_time_dates.NIL == date_lower_bound || sbhl_time_dates.NIL == date_upper_bound || sbhl_time_dates.NIL == sbhl_dateG(date_lower_bound, date_upper_bound))) {
            state = sbhl_time_date_link_iterator_state(tag_link_table, direction, date_lower_bound, date_upper_bound);
        }
        return (sbhl_time_dates.NIL != state) ? sbhl_iteration.new_sbhl_iterator(state, (SubLObject)sbhl_time_dates.$sym53$SBHL_TIME_DATE_LINK_ITERATOR_DONE, (SubLObject)sbhl_time_dates.$sym54$SBHL_TIME_DATE_LINK_ITERATOR_NEXT, (SubLObject)sbhl_time_dates.$sym55$SBHL_TIME_DATE_LINK_ITERATOR_FINALIZE) : sbhl_iteration.new_sbhl_null_iterator();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 21519L)
    public static SubLObject sbhl_time_date_link_iterator_state(final SubLObject tag_link_table, final SubLObject direction, final SubLObject date_lower_bound, final SubLObject date_upper_bound) {
        final SubLObject generating_iterator = new_sbhl_time_date_link_tag_iterator(tag_link_table);
        final SubLObject link_to_optimal_date = sbhl_iteration.sbhl_iteration_next(generating_iterator);
        return (SubLObject)((sbhl_time_dates.NIL != link_to_optimal_date) ? sbhl_time_date_link_iterator_state_int(link_to_optimal_date, generating_iterator, direction, date_lower_bound, date_upper_bound) : sbhl_time_dates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 21961L)
    public static SubLObject sbhl_time_date_link_iterator_state_int(SubLObject link_to_optimal_date, final SubLObject generating_iterator, final SubLObject direction, final SubLObject date_lower_bound, final SubLObject date_upper_bound) {
        final SubLObject state = Vectors.make_vector((SubLObject)sbhl_time_dates.TWO_INTEGER, (SubLObject)sbhl_time_dates.UNPROVIDED);
        SubLObject optimal_date = conses_high.third(link_to_optimal_date);
        if (sbhl_time_dates.NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction)) {
            SubLObject link_to_date;
            for (SubLObject done_var = (SubLObject)sbhl_time_dates.NIL; sbhl_time_dates.NIL == done_var; done_var = Types.sublisp_null(link_to_date)) {
                link_to_date = sbhl_iteration.sbhl_iteration_next(generating_iterator);
                if (sbhl_time_dates.NIL != link_to_date) {
                    final SubLObject date = conses_high.third(link_to_date);
                    if (sbhl_time_dates.NIL != sbhl_dateL(date, optimal_date)) {
                        link_to_optimal_date = link_to_date;
                        optimal_date = date;
                    }
                }
            }
            final SubLObject iterator_lower_bound = (sbhl_time_dates.NIL != date_lower_bound && sbhl_time_dates.NIL != sbhl_dateL(optimal_date, date_lower_bound)) ? date_lower_bound : optimal_date;
            Vectors.set_aref(state, (SubLObject)sbhl_time_dates.ZERO_INTEGER, link_to_optimal_date);
            Vectors.set_aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER, new_sbhl_time_date_date_link_iterator(iterator_lower_bound, date_upper_bound, direction));
        }
        else {
            SubLObject link_to_date;
            for (SubLObject done_var = (SubLObject)sbhl_time_dates.NIL; sbhl_time_dates.NIL == done_var; done_var = Types.sublisp_null(link_to_date)) {
                link_to_date = sbhl_iteration.sbhl_iteration_next(generating_iterator);
                if (sbhl_time_dates.NIL != link_to_date) {
                    final SubLObject date = conses_high.third(link_to_date);
                    if (sbhl_time_dates.NIL != sbhl_dateG(date, optimal_date)) {
                        link_to_optimal_date = link_to_date;
                        optimal_date = date;
                    }
                }
            }
            final SubLObject iterator_upper_bound = (sbhl_time_dates.NIL != date_upper_bound && sbhl_time_dates.NIL != sbhl_dateG(optimal_date, date_upper_bound)) ? date_upper_bound : optimal_date;
            Vectors.set_aref(state, (SubLObject)sbhl_time_dates.ZERO_INTEGER, link_to_optimal_date);
            Vectors.set_aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER, new_sbhl_time_date_date_link_iterator(date_lower_bound, iterator_upper_bound, direction));
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 23491L)
    public static SubLObject sbhl_time_date_link_iterator_done(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_dates.NIL == Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER) || sbhl_time_dates.NIL != sbhl_iteration.sbhl_iteration_doneP(Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 23632L)
    public static SubLObject sbhl_time_date_link_iterator_next(final SubLObject state) {
        final SubLObject result = sbhl_iteration.sbhl_iteration_next(Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER));
        return (SubLObject)((sbhl_time_dates.NIL != result) ? ConsesLow.cons(Vectors.aref(state, (SubLObject)sbhl_time_dates.ZERO_INTEGER), result) : sbhl_time_dates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 23809L)
    public static SubLObject sbhl_time_date_link_iterator_finalize(final SubLObject state) {
        return (SubLObject)((sbhl_time_dates.NIL != Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER)) ? sbhl_iteration.sbhl_iteration_finalize(Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER)) : sbhl_time_dates.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 23957L)
    public static SubLObject new_sbhl_time_date_link_to_date_iterator(final SubLObject node, SubLObject direction) {
        if (direction == sbhl_time_dates.UNPROVIDED) {
            direction = sbhl_link_vars.get_sbhl_link_direction();
        }
        final SubLObject tag_link_table = (sbhl_time_dates.NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction)) ? dictionary.dictionary_lookup_without_values(sbhl_time_dates.$sbhl_time_object_date_predicate_links$.getGlobalValue(), node, (SubLObject)sbhl_time_dates.UNPROVIDED) : dictionary.dictionary_lookup_without_values(sbhl_time_dates.$sbhl_time_object_date_inverse_links$.getGlobalValue(), node, (SubLObject)sbhl_time_dates.UNPROVIDED);
        return (sbhl_time_dates.NIL != tag_link_table) ? new_sbhl_time_date_link_tag_iterator(tag_link_table) : sbhl_iteration.new_sbhl_null_iterator();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 24480L)
    public static SubLObject new_sbhl_time_date_date_link_iterator(final SubLObject earliest, final SubLObject latest, final SubLObject direction) {
        return sbhl_iteration.new_sbhl_iterator(sbhl_time_date_date_link_iterator_state(earliest, latest, direction), (SubLObject)sbhl_time_dates.$sym56$SBHL_TIME_DATE_DATE_LINK_ITERATOR_DONE, (SubLObject)sbhl_time_dates.$sym57$SBHL_TIME_DATE_DATE_LINK_ITERATOR_NEXT, (SubLObject)sbhl_time_dates.$sym58$SBHL_TIME_DATE_DATE_LINK_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 24825L)
    public static SubLObject sbhl_time_date_date_link_iterator_state(final SubLObject earliest, final SubLObject latest, final SubLObject direction) {
        final SubLObject state = Vectors.make_vector((SubLObject)sbhl_time_dates.FOUR_INTEGER, (SubLObject)sbhl_time_dates.UNPROVIDED);
        Vectors.set_aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER, direction);
        Vectors.set_aref(state, (SubLObject)sbhl_time_dates.THREE_INTEGER, (sbhl_time_dates.NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction)) ? new_sbhl_time_date_iterator(earliest, latest, (SubLObject)sbhl_time_dates.$kw3$FORWARD) : new_sbhl_time_date_iterator(earliest, latest, (SubLObject)sbhl_time_dates.$kw59$BACKWARD));
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 25302L)
    public static SubLObject sbhl_time_date_date_link_iterator_done(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean((sbhl_time_dates.NIL == Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER) || sbhl_time_dates.NIL != sbhl_iteration.sbhl_iteration_doneP(Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER))) && (sbhl_time_dates.NIL == Vectors.aref(state, (SubLObject)sbhl_time_dates.THREE_INTEGER) || sbhl_time_dates.NIL != sbhl_iteration.sbhl_iteration_doneP(Vectors.aref(state, (SubLObject)sbhl_time_dates.THREE_INTEGER))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 25530L)
    public static SubLObject sbhl_time_date_date_link_iterator_next(final SubLObject state) {
        SubLObject iterator = Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER);
        SubLObject result = (SubLObject)sbhl_time_dates.NIL;
        SubLObject doneP = (SubLObject)sbhl_time_dates.NIL;
        while (sbhl_time_dates.NIL == result && sbhl_time_dates.NIL == doneP) {
            if (sbhl_time_dates.NIL == iterator) {
                final SubLObject date_iterator = Vectors.aref(state, (SubLObject)sbhl_time_dates.THREE_INTEGER);
                if (sbhl_time_dates.NIL == date_iterator) {
                    doneP = (SubLObject)sbhl_time_dates.T;
                }
                else if (sbhl_time_dates.NIL != sbhl_iteration.sbhl_iteration_doneP(date_iterator)) {
                    sbhl_iteration.sbhl_iteration_finalize(date_iterator);
                    Vectors.set_aref(state, (SubLObject)sbhl_time_dates.THREE_INTEGER, (SubLObject)sbhl_time_dates.NIL);
                    doneP = (SubLObject)sbhl_time_dates.T;
                }
                else {
                    final SubLObject next_date = sbhl_iteration.sbhl_iteration_next(date_iterator);
                    if (sbhl_time_dates.NIL != next_date) {
                        final SubLObject tag_table = (sbhl_time_dates.NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER))) ? dictionary.dictionary_lookup_without_values(sbhl_time_dates.$sbhl_time_date_object_predicate_links$.getGlobalValue(), next_date, (SubLObject)sbhl_time_dates.UNPROVIDED) : dictionary.dictionary_lookup_without_values(sbhl_time_dates.$sbhl_time_date_object_inverse_links$.getGlobalValue(), next_date, (SubLObject)sbhl_time_dates.UNPROVIDED);
                        if (sbhl_time_dates.NIL == tag_table) {
                            continue;
                        }
                        iterator = new_sbhl_time_date_link_tag_iterator(tag_table);
                        Vectors.set_aref(state, (SubLObject)sbhl_time_dates.ZERO_INTEGER, next_date);
                        Vectors.set_aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER, iterator);
                    }
                    else {
                        sbhl_iteration.sbhl_iteration_finalize(date_iterator);
                        Vectors.set_aref(state, (SubLObject)sbhl_time_dates.THREE_INTEGER, (SubLObject)sbhl_time_dates.NIL);
                        doneP = (SubLObject)sbhl_time_dates.T;
                    }
                }
            }
            else if (sbhl_time_dates.NIL != sbhl_iteration.sbhl_iteration_doneP(iterator)) {
                sbhl_iteration.sbhl_iteration_finalize(iterator);
                iterator = (SubLObject)sbhl_time_dates.NIL;
                Vectors.set_aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER, (SubLObject)sbhl_time_dates.NIL);
            }
            else {
                result = sbhl_iteration.sbhl_iteration_next(iterator);
            }
        }
        return (SubLObject)((sbhl_time_dates.NIL != result) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_time_dates.$kw20$WEAK, hlmt_relevance.$time_inference_mt$.getGlobalValue(), Vectors.aref(state, (SubLObject)sbhl_time_dates.ZERO_INTEGER)), result) : sbhl_time_dates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 26894L)
    public static SubLObject sbhl_time_date_date_link_iterator_finalize(final SubLObject state) {
        if (sbhl_time_dates.NIL != Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER)) {
            sbhl_iteration.sbhl_iteration_finalize(Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER));
        }
        if (sbhl_time_dates.NIL != Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER)) {
            sbhl_iteration.sbhl_iteration_finalize(Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER));
        }
        return (SubLObject)sbhl_time_dates.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 27115L)
    public static SubLObject new_sbhl_time_date_link_tag_iterator(final SubLObject link_tag_table) {
        return sbhl_iteration.new_sbhl_iterator(sbhl_time_date_link_tag_iterator_state(link_tag_table), (SubLObject)sbhl_time_dates.$sym60$SBHL_TIME_DATE_LINK_TAG_ITERATOR_DONE, (SubLObject)sbhl_time_dates.$sym61$SBHL_TIME_DATE_LINK_TAG_ITERATOR_NEXT, (SubLObject)sbhl_time_dates.$sym62$SBHL_TIME_DATE_LINK_TAG_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 27429L)
    public static SubLObject sbhl_time_date_link_tag_iterator_state(final SubLObject link_tag_table) {
        final SubLObject state = Vectors.make_vector((SubLObject)sbhl_time_dates.THREE_INTEGER, (SubLObject)sbhl_time_dates.UNPROVIDED);
        Vectors.set_aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER, sbhl_iteration.new_sbhl_dictionary_iterator(link_tag_table));
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 27712L)
    public static SubLObject sbhl_time_date_link_tag_iterator_done(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean((sbhl_time_dates.NIL == Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER) || sbhl_time_dates.NIL != sbhl_iteration.sbhl_iteration_doneP(Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER))) && (sbhl_time_dates.NIL == Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER) || sbhl_time_dates.NIL != sbhl_iteration.sbhl_iteration_doneP(Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 27939L)
    public static SubLObject sbhl_time_date_link_tag_iterator_next(final SubLObject state) {
        SubLObject iterator = Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER);
        SubLObject result = (SubLObject)sbhl_time_dates.NIL;
        SubLObject doneP = (SubLObject)sbhl_time_dates.NIL;
        while (sbhl_time_dates.NIL == result && sbhl_time_dates.NIL == doneP) {
            if (sbhl_time_dates.NIL == iterator) {
                final SubLObject generating_iterator = Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER);
                if (sbhl_time_dates.NIL == generating_iterator) {
                    doneP = (SubLObject)sbhl_time_dates.T;
                }
                else if (sbhl_time_dates.NIL != sbhl_iteration.sbhl_iteration_doneP(generating_iterator)) {
                    sbhl_iteration.sbhl_iteration_finalize(generating_iterator);
                    Vectors.set_aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER, (SubLObject)sbhl_time_dates.NIL);
                    doneP = (SubLObject)sbhl_time_dates.T;
                }
                else {
                    final SubLObject tag_link = sbhl_iteration.sbhl_iteration_next(generating_iterator);
                    if (sbhl_time_dates.NIL != tag_link) {
                        SubLObject current;
                        final SubLObject datum = current = tag_link;
                        SubLObject tag = (SubLObject)sbhl_time_dates.NIL;
                        SubLObject tag_table = (SubLObject)sbhl_time_dates.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list63);
                        tag = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list63);
                        tag_table = current.first();
                        current = current.rest();
                        if (sbhl_time_dates.NIL == current) {
                            iterator = new_sbhl_time_date_mt_link_iterator(tag_table);
                            Vectors.set_aref(state, (SubLObject)sbhl_time_dates.ZERO_INTEGER, tag);
                            Vectors.set_aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER, iterator);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_time_dates.$list63);
                        }
                    }
                    else {
                        sbhl_iteration.sbhl_iteration_finalize(generating_iterator);
                        Vectors.set_aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER, (SubLObject)sbhl_time_dates.NIL);
                        doneP = (SubLObject)sbhl_time_dates.T;
                    }
                }
            }
            else if (sbhl_time_dates.NIL != sbhl_iteration.sbhl_iteration_doneP(iterator)) {
                sbhl_iteration.sbhl_iteration_finalize(iterator);
                iterator = (SubLObject)sbhl_time_dates.NIL;
                Vectors.set_aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER, (SubLObject)sbhl_time_dates.NIL);
            }
            else {
                result = sbhl_iteration.sbhl_iteration_next(iterator);
            }
        }
        return (SubLObject)((sbhl_time_dates.NIL != result) ? ConsesLow.cons(Vectors.aref(state, (SubLObject)sbhl_time_dates.ZERO_INTEGER), result) : sbhl_time_dates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 29046L)
    public static SubLObject sbhl_time_date_link_tag_iterator_finalize(final SubLObject state) {
        if (sbhl_time_dates.NIL != Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER)) {
            sbhl_iteration.sbhl_iteration_finalize(Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER));
        }
        if (sbhl_time_dates.NIL != Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER)) {
            sbhl_iteration.sbhl_iteration_finalize(Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER));
        }
        return (SubLObject)sbhl_time_dates.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 29266L)
    public static SubLObject new_sbhl_time_date_mt_link_iterator(final SubLObject mt_link_table) {
        return sbhl_iteration.new_sbhl_iterator(sbhl_time_date_mt_link_iterator_state(mt_link_table), (SubLObject)sbhl_time_dates.$sym64$SBHL_TIME_DATE_MT_LINK_ITERATOR_DONE, (SubLObject)sbhl_time_dates.$sym65$SBHL_TIME_DATE_MT_LINK_ITERATOR_NEXT, (SubLObject)sbhl_time_dates.$sym66$SBHL_TIME_DATE_MT_LINK_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 29572L)
    public static SubLObject sbhl_time_date_mt_link_iterator_state(final SubLObject mt_link_table) {
        final SubLObject state = Vectors.make_vector((SubLObject)sbhl_time_dates.THREE_INTEGER, (SubLObject)sbhl_time_dates.UNPROVIDED);
        Vectors.set_aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER, sbhl_iteration.new_sbhl_dictionary_iterator(mt_link_table));
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 29853L)
    public static SubLObject sbhl_time_date_mt_link_iterator_done(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean((sbhl_time_dates.NIL == Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER) || sbhl_time_dates.NIL != sbhl_iteration.sbhl_iteration_doneP(Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER))) && (sbhl_time_dates.NIL == Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER) || sbhl_time_dates.NIL != sbhl_iteration.sbhl_iteration_doneP(Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 30079L)
    public static SubLObject sbhl_time_date_mt_link_iterator_next(final SubLObject state) {
        SubLObject iterator = Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER);
        SubLObject result = (SubLObject)sbhl_time_dates.NIL;
        SubLObject doneP = (SubLObject)sbhl_time_dates.NIL;
        while (sbhl_time_dates.NIL == result && sbhl_time_dates.NIL == doneP) {
            if (sbhl_time_dates.NIL == iterator) {
                final SubLObject generating_iterator = Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER);
                if (sbhl_time_dates.NIL == generating_iterator) {
                    doneP = (SubLObject)sbhl_time_dates.T;
                }
                else if (sbhl_time_dates.NIL != sbhl_iteration.sbhl_iteration_doneP(generating_iterator)) {
                    sbhl_iteration.sbhl_iteration_finalize(generating_iterator);
                    Vectors.set_aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER, (SubLObject)sbhl_time_dates.NIL);
                    doneP = (SubLObject)sbhl_time_dates.T;
                }
                else {
                    final SubLObject mt_link = sbhl_iteration.sbhl_iteration_next(generating_iterator);
                    if (sbhl_time_dates.NIL != mt_link) {
                        SubLObject current;
                        final SubLObject datum = current = mt_link;
                        SubLObject mt = (SubLObject)sbhl_time_dates.NIL;
                        SubLObject mt_table = (SubLObject)sbhl_time_dates.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list67);
                        mt = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_dates.$list67);
                        mt_table = current.first();
                        current = current.rest();
                        if (sbhl_time_dates.NIL == current) {
                            if (sbhl_time_dates.NIL == mt_relevance_macros.relevant_mtP(mt)) {
                                continue;
                            }
                            iterator = sbhl_iteration.new_sbhl_dictionary_iterator(mt_table);
                            Vectors.set_aref(state, (SubLObject)sbhl_time_dates.ZERO_INTEGER, mt);
                            Vectors.set_aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER, iterator);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_time_dates.$list67);
                        }
                    }
                    else {
                        sbhl_iteration.sbhl_iteration_finalize(generating_iterator);
                        Vectors.set_aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER, (SubLObject)sbhl_time_dates.NIL);
                        doneP = (SubLObject)sbhl_time_dates.T;
                    }
                }
            }
            else if (sbhl_time_dates.NIL != sbhl_iteration.sbhl_iteration_doneP(iterator)) {
                sbhl_iteration.sbhl_iteration_finalize(iterator);
                iterator = (SubLObject)sbhl_time_dates.NIL;
                Vectors.set_aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER, (SubLObject)sbhl_time_dates.NIL);
            }
            else {
                result = sbhl_iteration.sbhl_iteration_next(iterator);
            }
        }
        return (SubLObject)((sbhl_time_dates.NIL != result) ? ConsesLow.cons(Vectors.aref(state, (SubLObject)sbhl_time_dates.ZERO_INTEGER), result) : sbhl_time_dates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-dates.lisp", position = 31208L)
    public static SubLObject sbhl_time_date_mt_link_iterator_finalize(final SubLObject state) {
        if (sbhl_time_dates.NIL != Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER)) {
            sbhl_iteration.sbhl_iteration_finalize(Vectors.aref(state, (SubLObject)sbhl_time_dates.ONE_INTEGER));
        }
        if (sbhl_time_dates.NIL != Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER)) {
            sbhl_iteration.sbhl_iteration_finalize(Vectors.aref(state, (SubLObject)sbhl_time_dates.TWO_INTEGER));
        }
        return (SubLObject)sbhl_time_dates.T;
    }
    
    public static SubLObject declare_sbhl_time_dates_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_date_p", "SBHL-DATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_dateE", "SBHL-DATE=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_dateL", "SBHL-DATE<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_dateLE", "SBHL-DATE<=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_dateG", "SBHL-DATE>", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_dateGE", "SBHL-DATE>=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_date_betweenP", "SBHL-DATE-BETWEEN?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_find_earliest_date", "SBHL-TIME-FIND-EARLIEST-DATE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_find_latest_date", "SBHL-TIME-FIND-LATEST-DATE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_add_date", "SBHL-TIME-ADD-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_remove_date", "SBHL-TIME-REMOVE-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "clear_sbhl_time_dates", "CLEAR-SBHL-TIME-DATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "new_sbhl_time_date_iterator", "NEW-SBHL-TIME-DATE-ITERATOR", 0, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "do_sbhl_time_dates", "DO-SBHL-TIME-DATES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_min_linked_date", "SBHL-TIME-DATE-MIN-LINKED-DATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_min_linked_date_int", "SBHL-TIME-DATE-MIN-LINKED-DATE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_max_linked_date", "SBHL-TIME-DATE-MAX-LINKED-DATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_max_linked_date_int", "SBHL-TIME-DATE-MAX-LINKED-DATE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_relevant_linked_date", "SBHL-TIME-DATE-RELEVANT-LINKED-DATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_node_links_to_dateP", "SBHL-TIME-DATE-NODE-LINKS-TO-DATE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_date_links_to_nodeP", "SBHL-TIME-DATE-DATE-LINKS-TO-NODE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_dates_link_existsP", "SBHL-TIME-DATES-LINK-EXISTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_node_date_link_supports", "SBHL-TIME-DATE-NODE-DATE-LINK-SUPPORTS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_date_node_link_supports", "SBHL-TIME-DATE-DATE-NODE-LINK-SUPPORTS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_link_supports_int", "SBHL-TIME-DATE-LINK-SUPPORTS-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "clear_sbhl_time_date_link_tables", "CLEAR-SBHL-TIME-DATE-LINK-TABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_dates_add_link_support", "SBHL-TIME-DATES-ADD-LINK-SUPPORT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_dates_add_link_support_int", "SBHL-TIME-DATES-ADD-LINK-SUPPORT-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_dates_remove_link_support", "SBHL-TIME-DATES-REMOVE-LINK-SUPPORT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_dates_remove_link_support_int", "SBHL-TIME-DATES-REMOVE-LINK-SUPPORT-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_node_with_min_date_link", "SBHL-TIME-DATE-NODE-WITH-MIN-DATE-LINK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_node_with_max_date_link", "SBHL-TIME-DATE-NODE-WITH-MAX-DATE-LINK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_find_search_node", "SBHL-TIME-DATE-FIND-SEARCH-NODE", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "destructure_sbhl_time_date_link", "DESTRUCTURE-SBHL-TIME-DATE-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "do_sbhl_time_date_links", "DO-SBHL-TIME-DATE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "do_sbhl_time_date_links_between_dates", "DO-SBHL-TIME-DATE-LINKS-BETWEEN-DATES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "do_sbhl_time_date_date_links", "DO-SBHL-TIME-DATE-DATE-LINKS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "new_sbhl_time_date_link_iterator", "NEW-SBHL-TIME-DATE-LINK-ITERATOR", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_link_iterator_state", "SBHL-TIME-DATE-LINK-ITERATOR-STATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_link_iterator_state_int", "SBHL-TIME-DATE-LINK-ITERATOR-STATE-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_link_iterator_done", "SBHL-TIME-DATE-LINK-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_link_iterator_next", "SBHL-TIME-DATE-LINK-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_link_iterator_finalize", "SBHL-TIME-DATE-LINK-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "new_sbhl_time_date_link_to_date_iterator", "NEW-SBHL-TIME-DATE-LINK-TO-DATE-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "new_sbhl_time_date_date_link_iterator", "NEW-SBHL-TIME-DATE-DATE-LINK-ITERATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_date_link_iterator_state", "SBHL-TIME-DATE-DATE-LINK-ITERATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_date_link_iterator_done", "SBHL-TIME-DATE-DATE-LINK-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_date_link_iterator_next", "SBHL-TIME-DATE-DATE-LINK-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_date_link_iterator_finalize", "SBHL-TIME-DATE-DATE-LINK-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "new_sbhl_time_date_link_tag_iterator", "NEW-SBHL-TIME-DATE-LINK-TAG-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_link_tag_iterator_state", "SBHL-TIME-DATE-LINK-TAG-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_link_tag_iterator_done", "SBHL-TIME-DATE-LINK-TAG-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_link_tag_iterator_next", "SBHL-TIME-DATE-LINK-TAG-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_link_tag_iterator_finalize", "SBHL-TIME-DATE-LINK-TAG-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "new_sbhl_time_date_mt_link_iterator", "NEW-SBHL-TIME-DATE-MT-LINK-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_mt_link_iterator_state", "SBHL-TIME-DATE-MT-LINK-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_mt_link_iterator_done", "SBHL-TIME-DATE-MT-LINK-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_mt_link_iterator_next", "SBHL-TIME-DATE-MT-LINK-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_dates", "sbhl_time_date_mt_link_iterator_finalize", "SBHL-TIME-DATE-MT-LINK-ITERATOR-FINALIZE", 1, 0, false);
        return (SubLObject)sbhl_time_dates.NIL;
    }
    
    public static SubLObject init_sbhl_time_dates_file() {
        sbhl_time_dates.$sbhl_time_date_graph$ = SubLFiles.deflexical("*SBHL-TIME-DATE-GRAPH*", maybeDefault((SubLObject)sbhl_time_dates.$sym0$_SBHL_TIME_DATE_GRAPH_, sbhl_time_dates.$sbhl_time_date_graph$, ()->(binary_tree.new_avl_tree((SubLObject)sbhl_time_dates.$sym1$SBHL_DATE_))));
        sbhl_time_dates.$sbhl_time_date_object_predicate_links$ = SubLFiles.deflexical("*SBHL-TIME-DATE-OBJECT-PREDICATE-LINKS*", maybeDefault((SubLObject)sbhl_time_dates.$sym15$_SBHL_TIME_DATE_OBJECT_PREDICATE_LINKS_, sbhl_time_dates.$sbhl_time_date_object_predicate_links$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sbhl_time_dates.EQL), (SubLObject)sbhl_time_dates.$int16$1000))));
        sbhl_time_dates.$sbhl_time_date_object_inverse_links$ = SubLFiles.deflexical("*SBHL-TIME-DATE-OBJECT-INVERSE-LINKS*", maybeDefault((SubLObject)sbhl_time_dates.$sym17$_SBHL_TIME_DATE_OBJECT_INVERSE_LINKS_, sbhl_time_dates.$sbhl_time_date_object_inverse_links$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sbhl_time_dates.EQL), (SubLObject)sbhl_time_dates.$int16$1000))));
        sbhl_time_dates.$sbhl_time_object_date_predicate_links$ = SubLFiles.deflexical("*SBHL-TIME-OBJECT-DATE-PREDICATE-LINKS*", maybeDefault((SubLObject)sbhl_time_dates.$sym18$_SBHL_TIME_OBJECT_DATE_PREDICATE_LINKS_, sbhl_time_dates.$sbhl_time_object_date_predicate_links$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sbhl_time_dates.EQL), (SubLObject)sbhl_time_dates.$int16$1000))));
        sbhl_time_dates.$sbhl_time_object_date_inverse_links$ = SubLFiles.deflexical("*SBHL-TIME-OBJECT-DATE-INVERSE-LINKS*", maybeDefault((SubLObject)sbhl_time_dates.$sym19$_SBHL_TIME_OBJECT_DATE_INVERSE_LINKS_, sbhl_time_dates.$sbhl_time_object_date_inverse_links$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sbhl_time_dates.EQL), (SubLObject)sbhl_time_dates.$int16$1000))));
        return (SubLObject)sbhl_time_dates.NIL;
    }
    
    public static SubLObject setup_sbhl_time_dates_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_dates.$sym0$_SBHL_TIME_DATE_GRAPH_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_dates.$sym15$_SBHL_TIME_DATE_OBJECT_PREDICATE_LINKS_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_dates.$sym17$_SBHL_TIME_DATE_OBJECT_INVERSE_LINKS_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_dates.$sym18$_SBHL_TIME_OBJECT_DATE_PREDICATE_LINKS_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_dates.$sym19$_SBHL_TIME_OBJECT_DATE_INVERSE_LINKS_);
        return (SubLObject)sbhl_time_dates.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sbhl_time_dates_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sbhl_time_dates_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sbhl_time_dates_file();
    }
    
    static {
        me = (SubLFile)new sbhl_time_dates();
        sbhl_time_dates.$sbhl_time_date_graph$ = null;
        sbhl_time_dates.$sbhl_time_date_object_predicate_links$ = null;
        sbhl_time_dates.$sbhl_time_date_object_inverse_links$ = null;
        sbhl_time_dates.$sbhl_time_object_date_predicate_links$ = null;
        sbhl_time_dates.$sbhl_time_object_date_inverse_links$ = null;
        $sym0$_SBHL_TIME_DATE_GRAPH_ = SubLObjectFactory.makeSymbol("*SBHL-TIME-DATE-GRAPH*");
        $sym1$SBHL_DATE_ = SubLObjectFactory.makeSymbol("SBHL-DATE<");
        $sym2$SBHL_DATE_P = SubLObjectFactory.makeSymbol("SBHL-DATE-P");
        $kw3$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("EARLIEST"), (SubLObject)SubLObjectFactory.makeSymbol("LATEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EARLIEST"), (SubLObject)SubLObjectFactory.makeKeyword("LATEST"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw6$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw7$EARLIEST = SubLObjectFactory.makeKeyword("EARLIEST");
        $kw8$LATEST = SubLObjectFactory.makeKeyword("LATEST");
        $kw9$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw10$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym11$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
        $sym12$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym13$NEW_SBHL_TIME_DATE_ITERATOR = SubLObjectFactory.makeSymbol("NEW-SBHL-TIME-DATE-ITERATOR");
        $sym14$DO_SBHL_ITERATOR = SubLObjectFactory.makeSymbol("DO-SBHL-ITERATOR");
        $sym15$_SBHL_TIME_DATE_OBJECT_PREDICATE_LINKS_ = SubLObjectFactory.makeSymbol("*SBHL-TIME-DATE-OBJECT-PREDICATE-LINKS*");
        $int16$1000 = SubLObjectFactory.makeInteger(1000);
        $sym17$_SBHL_TIME_DATE_OBJECT_INVERSE_LINKS_ = SubLObjectFactory.makeSymbol("*SBHL-TIME-DATE-OBJECT-INVERSE-LINKS*");
        $sym18$_SBHL_TIME_OBJECT_DATE_PREDICATE_LINKS_ = SubLObjectFactory.makeSymbol("*SBHL-TIME-OBJECT-DATE-PREDICATE-LINKS*");
        $sym19$_SBHL_TIME_OBJECT_DATE_INVERSE_LINKS_ = SubLObjectFactory.makeSymbol("*SBHL-TIME-OBJECT-DATE-INVERSE-LINKS*");
        $kw20$WEAK = SubLObjectFactory.makeKeyword("WEAK");
        $sym21$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $const22$weak_HL_TimePrecedence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("weak-HL-TimePrecedence"));
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-MT"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-SUPPORTS")), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym24$LINK_SUPPORTS = SubLObjectFactory.makeUninternedSymbol("LINK-SUPPORTS");
        $sym25$DESTRUCTURE_SBHL_TIME_DATE_LINK = SubLObjectFactory.makeSymbol("DESTRUCTURE-SBHL-TIME-DATE-LINK");
        $sym26$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym27$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym28$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK0"), (SubLObject)SubLObjectFactory.makeSymbol("LINK1"), (SubLObject)SubLObjectFactory.makeSymbol("LINK2"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-LOWER-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-UPPER-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DATE-LOWER-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("DATE-UPPER-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw31$DATE_LOWER_BOUND = SubLObjectFactory.makeKeyword("DATE-LOWER-BOUND");
        $kw32$DATE_UPPER_BOUND = SubLObjectFactory.makeKeyword("DATE-UPPER-BOUND");
        $sym33$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
        $sym34$RAW_LINKS = SubLObjectFactory.makeUninternedSymbol("RAW-LINKS");
        $sym35$NEW_SBHL_TIME_DATE_LINK_ITERATOR = SubLObjectFactory.makeSymbol("NEW-SBHL-TIME-DATE-LINK-ITERATOR");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-LINK-DIRECTION"));
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK0"), (SubLObject)SubLObjectFactory.makeSymbol("LINK1"), (SubLObject)SubLObjectFactory.makeSymbol("DATE0"), (SubLObject)SubLObjectFactory.makeSymbol("DATE1"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym39$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
        $sym40$RAW_LINKS = SubLObjectFactory.makeUninternedSymbol("RAW-LINKS");
        $sym41$NEW_SBHL_TIME_DATE_DATE_LINK_ITERATOR = SubLObjectFactory.makeSymbol("NEW-SBHL-TIME-DATE-DATE-LINK-ITERATOR");
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-LINK-DIRECTION")));
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK0"), (SubLObject)SubLObjectFactory.makeSymbol("LINK1"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-LOWER-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-UPPER-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym44$DATE0 = SubLObjectFactory.makeUninternedSymbol("DATE0");
        $sym45$DATE1 = SubLObjectFactory.makeUninternedSymbol("DATE1");
        $sym46$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-FORWARD-DIRECTED-DIRECTION-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-LINK-DIRECTION")));
        $sym48$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym49$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym50$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym51$SBHL_DATE_ = SubLObjectFactory.makeSymbol("SBHL-DATE>");
        $sym52$DO_SBHL_TIME_DATE_LINKS_BETWEEN_DATES = SubLObjectFactory.makeSymbol("DO-SBHL-TIME-DATE-LINKS-BETWEEN-DATES");
        $sym53$SBHL_TIME_DATE_LINK_ITERATOR_DONE = SubLObjectFactory.makeSymbol("SBHL-TIME-DATE-LINK-ITERATOR-DONE");
        $sym54$SBHL_TIME_DATE_LINK_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("SBHL-TIME-DATE-LINK-ITERATOR-NEXT");
        $sym55$SBHL_TIME_DATE_LINK_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("SBHL-TIME-DATE-LINK-ITERATOR-FINALIZE");
        $sym56$SBHL_TIME_DATE_DATE_LINK_ITERATOR_DONE = SubLObjectFactory.makeSymbol("SBHL-TIME-DATE-DATE-LINK-ITERATOR-DONE");
        $sym57$SBHL_TIME_DATE_DATE_LINK_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("SBHL-TIME-DATE-DATE-LINK-ITERATOR-NEXT");
        $sym58$SBHL_TIME_DATE_DATE_LINK_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("SBHL-TIME-DATE-DATE-LINK-ITERATOR-FINALIZE");
        $kw59$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $sym60$SBHL_TIME_DATE_LINK_TAG_ITERATOR_DONE = SubLObjectFactory.makeSymbol("SBHL-TIME-DATE-LINK-TAG-ITERATOR-DONE");
        $sym61$SBHL_TIME_DATE_LINK_TAG_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("SBHL-TIME-DATE-LINK-TAG-ITERATOR-NEXT");
        $sym62$SBHL_TIME_DATE_LINK_TAG_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("SBHL-TIME-DATE-LINK-TAG-ITERATOR-FINALIZE");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAG"), (SubLObject)SubLObjectFactory.makeSymbol("TAG-TABLE"));
        $sym64$SBHL_TIME_DATE_MT_LINK_ITERATOR_DONE = SubLObjectFactory.makeSymbol("SBHL-TIME-DATE-MT-LINK-ITERATOR-DONE");
        $sym65$SBHL_TIME_DATE_MT_LINK_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("SBHL-TIME-DATE-MT-LINK-ITERATOR-NEXT");
        $sym66$SBHL_TIME_DATE_MT_LINK_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("SBHL-TIME-DATE-MT-LINK-ITERATOR-FINALIZE");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("MT-TABLE"));
    }
}

/*

	Total time: 336 ms
	
*/
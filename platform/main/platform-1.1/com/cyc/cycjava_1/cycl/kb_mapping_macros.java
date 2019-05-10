/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.cycjava_1.cycl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.assertion_handles;
import com.cyc.cycjava_1.cycl.assertion_utilities;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.auxiliary_indexing;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.enumeration_types;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.function_terms;
import com.cyc.cycjava_1.cycl.hl_interface_infrastructure;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.mt_vars;
import com.cyc.cycjava_1.cycl.pred_relevance_macros;
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.simple_indexing;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.variables;

public  final class kb_mapping_macros extends SubLTranslatedFile {

  //// Constructor

  private kb_mapping_macros() {}
  public static final SubLFile me = new kb_mapping_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_mapping_macros";

  //// Definitions

  /** Return T iff TERM, ARGNUM and PREDICATE are valid keys for DO-GAF-ARG-INDEX. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 7230) 
  public static final SubLObject do_gaf_arg_index_key_validator(SubLObject v_term, SubLObject argnum, SubLObject predicate) {
    return kb_indexing.gaf_arg_index_key_validator(v_term, argnum, predicate, UNPROVIDED);
  }

  /** Makes an iterator which spits out final-index-specs, each of which is a
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 7477) 
  public static final SubLObject new_gaf_arg_final_index_spec_iterator(SubLObject v_term, SubLObject argnum, SubLObject predicate) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((predicate == UNPROVIDED)) {
      predicate = NIL;
    }
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
      return iteration.new_singleton_iterator(new_gaf_simple_final_index_spec(v_term, ((NIL != argnum) ? ((SubLObject) argnum) : $kw66$ANY), predicate, NIL));
    } else {
      {
        SubLObject state = initialize_gaf_arg_final_index_spec_iterator_state(v_term, argnum, predicate);
        return iteration.new_iterator(state, $sym67$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym68$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 8206) 
  public static final SubLObject initialize_gaf_arg_final_index_spec_iterator_state(SubLObject v_term, SubLObject argnum, SubLObject predicate) {
    {
      SubLObject state = Vectors.make_vector(SIX_INTEGER, NIL);
      Vectors.set_aref(state, ZERO_INTEGER, v_term);
      Vectors.set_aref(state, ONE_INTEGER, predicate);
      Vectors.set_aref(state, TWO_INTEGER, $kw69$ARGNUM_KEYS_ARE_FRESH);
      Vectors.set_aref(state, THREE_INTEGER, ((NIL != argnum) ? ((SubLObject) list(argnum)) : kb_indexing.key_gaf_arg_index_cached(v_term, UNPROVIDED, UNPROVIDED)));
      Vectors.set_aref(state, FOUR_INTEGER, NIL);
      Vectors.set_aref(state, FIVE_INTEGER, NIL);
      return state;
    }
  }

  /** The input term */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 8859) 
  public static final SubLObject gaf_arg_final_index_spec_iterator_state_term(SubLObject state) {
    return Vectors.aref(state, ZERO_INTEGER);
  }

  /** The input predicate */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 8984) 
  public static final SubLObject gaf_arg_final_index_spec_iterator_state_predicate(SubLObject state) {
    return Vectors.aref(state, ONE_INTEGER);
  }

  /** A note containing information about the state of the keys,
used to control code flow */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 9107) 
  public static final SubLObject gaf_arg_final_index_spec_iterator_state_note(SubLObject state) {
    return Vectors.aref(state, TWO_INTEGER);
  }

  /** The remaining argnums to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 9290) 
  public static final SubLObject gaf_arg_final_index_spec_iterator_state_argnum_keys(SubLObject state) {
    return Vectors.aref(state, THREE_INTEGER);
  }

  /** The remaining predicates left to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 9433) 
  public static final SubLObject gaf_arg_final_index_spec_iterator_state_predicate_keys(SubLObject state) {
    return Vectors.aref(state, FOUR_INTEGER);
  }

  /** The remaining mts left to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 9587) 
  public static final SubLObject gaf_arg_final_index_spec_iterator_state_mt_keys(SubLObject state) {
    return Vectors.aref(state, FIVE_INTEGER);
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 9727) 
  public static final SubLObject set_gaf_arg_final_index_spec_iterator_state_note(SubLObject state, SubLObject note) {
    Vectors.set_aref(state, TWO_INTEGER, note);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 9863) 
  public static final SubLObject set_gaf_arg_final_index_spec_iterator_state_argnum_keys(SubLObject state, SubLObject new_keys) {
    Vectors.set_aref(state, THREE_INTEGER, new_keys);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 10002) 
  public static final SubLObject set_gaf_arg_final_index_spec_iterator_state_predicate_keys(SubLObject state, SubLObject new_keys) {
    Vectors.set_aref(state, FOUR_INTEGER, new_keys);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 10144) 
  public static final SubLObject set_gaf_arg_final_index_spec_iterator_state_mt_keys(SubLObject state, SubLObject new_keys) {
    Vectors.set_aref(state, FIVE_INTEGER, new_keys);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 11088) 
  public static final SubLObject gaf_arg_final_index_spec_iterator_doneP(SubLObject state) {
    {
      SubLObject note = gaf_arg_final_index_spec_iterator_state_note(state);
      SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
      SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys(state);
      SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys(state);
      return makeBoolean(((NIL == argnum_keys)
            || ((NIL == note)
               && (NIL != list_utilities.lengthE(argnum_keys, ONE_INTEGER, UNPROVIDED))
               && (NIL != list_utilities.lengthLE(predicate_keys, ONE_INTEGER, UNPROVIDED))
               && (NIL == mt_keys))));
    }
  }

  public static final class $gaf_arg_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction {
    public $gaf_arg_final_index_spec_iterator_doneP$UnaryFunction() { super(extractFunctionNamed("GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?")); }
    public SubLObject processItem(SubLObject arg1) { return gaf_arg_final_index_spec_iterator_doneP(arg1); }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 11704) 
  public static final SubLObject gaf_arg_final_index_spec_iterator_next(SubLObject state) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject final_index_spec = gaf_arg_final_index_spec_iterator_quiesce(state);
        SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        gaf_arg_final_index_spec_iterator_next_mt_key(state);
        return Values.values(final_index_spec, state, doneP);
      }
    }
  }

  public static final class $gaf_arg_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction {
    public $gaf_arg_final_index_spec_iterator_next$UnaryFunction() { super(extractFunctionNamed("GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT")); }
    public SubLObject processItem(SubLObject arg1) { return gaf_arg_final_index_spec_iterator_next(arg1); }
  }

  /** Iterates over the keys in STATE until it ends up with its current keylist
   (@see gaf-arg-current-keylist) being valid and relevant, with validity and relevance being
   determined by @xref gaf-arg-current-relevant-keylist.
   It may not need to iterate over any keys in STATE, in which case STATE is left unchanged.
   @return 0 listp; the relevant final-index-spec thus formed, if any
   @return 1 booleanp; whether quiescence terminated early due to running out of keys */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 11981) 
  public static final SubLObject gaf_arg_final_index_spec_iterator_quiesce(SubLObject state) {
    {
      SubLObject result = NIL;
      SubLObject doneP = NIL;
      while ((!(((NIL != result)
            || (NIL != doneP))))) {
        {
          SubLObject keylist = gaf_arg_current_relevant_keylist(state);
          if ((NIL != keylist)) {
            {
              SubLObject v_term = gaf_arg_final_index_spec_iterator_state_term(state);
              result = gaf_arg_keylist_to_final_index_spec(v_term, keylist);
            }
          } else {
            doneP = gaf_arg_final_index_spec_iterator_quiesce_one_step(state);
          }
        }
      }
      return Values.values(result, doneP);
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 12925) 
  public static final SubLObject gaf_arg_keylist_to_final_index_spec(SubLObject v_term, SubLObject keylist) {
    return listS(v_term, $kw70$GAF_ARG, ConsesLow.append(keylist, NIL));
  }

  /** If STATE's current keylist is valid and relevant, returns it.
   Otherwise returns NIL.
   Valid means that none of its current keys are null.
   Relevant means that all of its current keys (mt and predicate) are deemed relevant
   (relevance is established from outside)
   @see gaf-arg-current-keylist */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 13112) 
  public static final SubLObject gaf_arg_current_relevant_keylist(SubLObject state) {
    {
      SubLObject input_predicate = gaf_arg_final_index_spec_iterator_state_predicate(state);
      SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
      SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys(state);
      SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys(state);
      SubLObject argnum = argnum_keys.first();
      SubLObject predicate = predicate_keys.first();
      SubLObject mt = mt_keys.first();
      if (((NIL != argnum)
           && (NIL != predicate)
           && (NIL != mt))) {
        if (((NIL == input_predicate)
             && (NIL == pred_relevance_macros.relevant_predP(predicate)))) {
          set_gaf_arg_final_index_spec_iterator_state_mt_keys(state, NIL);
          set_gaf_arg_final_index_spec_iterator_state_note(state, NIL);
        } else {
          if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
            return list(argnum, predicate, mt);
          }
        }
      }
    }
    return NIL;
  }

  /** STATE is assumed to be invalid or irrelevant.
   This function fixes one cause of invalidity or irrelevance.
   Invalidity is caused by having no more pending keys in a slot -- refill them.
   Irrelevance is caused by having the current mt key be irrelevant -- pop it.
   @return booleanp; whether we failed to quiesce because we ran out of keys */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 14542) 
  public static final SubLObject gaf_arg_final_index_spec_iterator_quiesce_one_step(SubLObject state) {
    {
      SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
      SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys(state);
      SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys(state);
      if ((NIL == argnum_keys)) {
        return T;
      } else if ((NIL == predicate_keys)) {
        gaf_arg_final_index_spec_iterator_refill_predicate_keys(state);
      } else if ((NIL == mt_keys)) {
        gaf_arg_final_index_spec_iterator_refill_mt_keys(state);
      } else {
        gaf_arg_final_index_spec_iterator_next_mt_key(state);
      }
    }
    return NIL;
  }

  /** refill the predicate-keys by popping an argnum
   but don't actually pop the argnum if it's fresh, just note that it's unfresh now */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 15742) 
  public static final SubLObject gaf_arg_final_index_spec_iterator_refill_predicate_keys(SubLObject state) {
    {
      SubLObject v_term = gaf_arg_final_index_spec_iterator_state_term(state);
      SubLObject predicate = gaf_arg_final_index_spec_iterator_state_predicate(state);
      SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
      if (($kw69$ARGNUM_KEYS_ARE_FRESH == gaf_arg_final_index_spec_iterator_state_note(state))) {
        set_gaf_arg_final_index_spec_iterator_state_note(state, NIL);
      } else {
        argnum_keys = argnum_keys.rest();
        set_gaf_arg_final_index_spec_iterator_state_argnum_keys(state, argnum_keys);
      }
      {
        SubLObject argnum_key = argnum_keys.first();
        if ((NIL != argnum_key)) {
          if ((NIL != predicate)) {
            set_gaf_arg_final_index_spec_iterator_state_predicate_keys(state, list(predicate));
          } else {
            set_gaf_arg_final_index_spec_iterator_state_predicate_keys(state, kb_indexing.key_gaf_arg_index_cached(v_term, argnum_key, UNPROVIDED));
          }
          set_gaf_arg_final_index_spec_iterator_state_note(state, $kw71$PREDICATE_KEYS_ARE_FRESH);
        }
      }
    }
    return state;
  }

  /** refill the mt-keys by popping a predicate
   but don't actually pop the predicate if it's fresh, just note that it's unfresh now */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 17071) 
  public static final SubLObject gaf_arg_final_index_spec_iterator_refill_mt_keys(SubLObject state) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_term = gaf_arg_final_index_spec_iterator_state_term(state);
        SubLObject argnum_keys = gaf_arg_final_index_spec_iterator_state_argnum_keys(state);
        SubLObject predicate_keys = gaf_arg_final_index_spec_iterator_state_predicate_keys(state);
        if (($kw71$PREDICATE_KEYS_ARE_FRESH == gaf_arg_final_index_spec_iterator_state_note(state))) {
          set_gaf_arg_final_index_spec_iterator_state_note(state, NIL);
        } else {
          predicate_keys = predicate_keys.rest();
          set_gaf_arg_final_index_spec_iterator_state_predicate_keys(state, predicate_keys);
        }
        {
          SubLObject predicate_key = predicate_keys.first();
          if ((NIL != predicate_key)) {
            if ((NIL != mt_relevance_macros.only_specified_mt_is_relevantP())) {
              set_gaf_arg_final_index_spec_iterator_state_mt_keys(state, list(mt_relevance_macros.$mt$.getDynamicValue(thread)));
            } else {
              {
                SubLObject argnum_key = argnum_keys.first();
                set_gaf_arg_final_index_spec_iterator_state_mt_keys(state, kb_indexing.key_gaf_arg_index_cached(v_term, argnum_key, predicate_key));
              }
            }
          }
        }
      }
      return state;
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 18548) 
  public static final SubLObject gaf_arg_final_index_spec_iterator_next_mt_key(SubLObject state) {
    {
      SubLObject mt_keys = gaf_arg_final_index_spec_iterator_state_mt_keys(state);
      set_gaf_arg_final_index_spec_iterator_state_mt_keys(state, mt_keys.rest());
    }
    return state;
  }

  /** Return T iff PREDICATE is a valid key for DO-PREDICATE-EXTENT-INDEX. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 19809) 
  public static final SubLObject do_predicate_extent_index_key_validator(SubLObject predicate) {
    return forts.fort_p(predicate);
  }

  /** Makes an iterator which spits out final-index-specs, each of which is a
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 20021) 
  public static final SubLObject new_predicate_extent_final_index_spec_iterator(SubLObject predicate) {
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(predicate))) {
      return iteration.new_singleton_iterator(new_gaf_simple_final_index_spec(predicate, NIL, predicate, NIL));
    } else {
      {
        SubLObject state = initialize_predicate_extent_final_index_spec_iterator_state(predicate);
        return iteration.new_iterator(state, $sym78$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym79$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 20761) 
  public static final SubLObject initialize_predicate_extent_final_index_spec_iterator_state(SubLObject predicate) {
    {
      SubLObject state = Vectors.make_vector(TWO_INTEGER, NIL);
      Vectors.set_aref(state, ZERO_INTEGER, predicate);
      Vectors.set_aref(state, ONE_INTEGER, kb_indexing.key_predicate_extent_index(predicate));
      return state;
    }
  }

  /** The input predicate */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 21107) 
  public static final SubLObject predicate_extent_final_index_spec_iterator_state_predicate(SubLObject state) {
    return Vectors.aref(state, ZERO_INTEGER);
  }

  /** The remaining mts left to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 21251) 
  public static final SubLObject predicate_extent_final_index_spec_iterator_state_mt_keys(SubLObject state) {
    return Vectors.aref(state, ONE_INTEGER);
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 21400) 
  public static final SubLObject set_predicate_extent_final_index_spec_iterator_state_mt_keys(SubLObject state, SubLObject new_keys) {
    Vectors.set_aref(state, ONE_INTEGER, new_keys);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 21934) 
  public static final SubLObject predicate_extent_final_index_spec_iterator_doneP(SubLObject state) {
    {
      SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys(state);
      return Types.sublisp_null(mt_keys);
    }
  }

  public static final class $predicate_extent_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction {
    public $predicate_extent_final_index_spec_iterator_doneP$UnaryFunction() { super(extractFunctionNamed("PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-DONE?")); }
    public SubLObject processItem(SubLObject arg1) { return predicate_extent_final_index_spec_iterator_doneP(arg1); }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 22220) 
  public static final SubLObject predicate_extent_final_index_spec_iterator_next(SubLObject state) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject final_index_spec = predicate_extent_final_index_spec_iterator_quiesce(state);
        SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        predicate_extent_final_index_spec_iterator_next_mt_key(state);
        return Values.values(final_index_spec, state, doneP);
      }
    }
  }

  public static final class $predicate_extent_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction {
    public $predicate_extent_final_index_spec_iterator_next$UnaryFunction() { super(extractFunctionNamed("PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT")); }
    public SubLObject processItem(SubLObject arg1) { return predicate_extent_final_index_spec_iterator_next(arg1); }
  }

  /** Iterates over the keys in STATE until it ends up with its current keylist
   (@see predicate-extent-current-keylist) being valid and relevant, with validity and relevance being
   determined by @xref predicate-extent-current-relevant-keylist.
   It may not need to iterate over any keys in STATE, in which case STATE is left unchanged.
   @return 0 listp; the relevant final-index-spec thus formed, if any
   @return 1 booleanp; whether quiescence terminated early due to running out of keys */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 22524) 
  public static final SubLObject predicate_extent_final_index_spec_iterator_quiesce(SubLObject state) {
    {
      SubLObject result = NIL;
      SubLObject doneP = NIL;
      while ((!(((NIL != result)
            || (NIL != doneP))))) {
        {
          SubLObject keylist = predicate_extent_current_relevant_keylist(state);
          if ((NIL != keylist)) {
            {
              SubLObject pred = predicate_extent_final_index_spec_iterator_state_predicate(state);
              result = predicate_extent_keylist_to_final_index_spec(pred, keylist);
            }
          } else {
            doneP = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30414");
          }
        }
      }
      return Values.values(result, doneP);
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 23536) 
  public static final SubLObject predicate_extent_keylist_to_final_index_spec(SubLObject v_term, SubLObject keylist) {
    return listS(v_term, $kw80$PREDICATE_EXTENT, ConsesLow.append(keylist, NIL));
  }

  /** If STATE's current keylist is valid and relevant, returns it.
   Otherwise returns NIL.
   Valid means that none of its current keys are null.
   Relevant means that its mt is deemed relevant
   (relevance is established from outside)
   @see predicate-extent-current-keylist */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 23750) 
  public static final SubLObject predicate_extent_current_relevant_keylist(SubLObject state) {
    {
      SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys(state);
      SubLObject mt = mt_keys.first();
      if ((NIL != mt)) {
        if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
          return list(mt);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 25079) 
  public static final SubLObject predicate_extent_final_index_spec_iterator_next_mt_key(SubLObject state) {
    {
      SubLObject mt_keys = predicate_extent_final_index_spec_iterator_state_mt_keys(state);
      set_predicate_extent_final_index_spec_iterator_state_mt_keys(state, mt_keys.rest());
    }
    return state;
  }

  /** Return T iff TERM, INDEX and FUNCTION are valid keys for DO-NART-ARG-INDEX. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 26367) 
  public static final SubLObject do_nart_arg_index_key_validator(SubLObject v_term, SubLObject index, SubLObject function) {
    return makeBoolean(((NIL != kb_indexing_datastructures.indexed_term_p(v_term))
           && ((NIL == index)
            || (NIL != subl_promotions.positive_integer_p(index)))
           && ((NIL == function)
            || (NIL != forts.fort_p(function)))));
  }

  /** Makes an iterator which spits out final-index-specs, each of which is a
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 26696) 
  public static final SubLObject new_nart_arg_final_index_spec_iterator(SubLObject v_term, SubLObject argnum, SubLObject function) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((function == UNPROVIDED)) {
      function = NIL;
    }
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
      return iteration.new_singleton_iterator(new_nart_simple_final_index_spec(v_term, ((NIL != argnum) ? ((SubLObject) argnum) : $kw66$ANY), function));
    } else {
      {
        SubLObject state = initialize_nart_arg_final_index_spec_iterator_state(v_term, argnum, function);
        return iteration.new_iterator(state, $sym88$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym89$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 27434) 
  public static final SubLObject initialize_nart_arg_final_index_spec_iterator_state(SubLObject v_term, SubLObject argnum, SubLObject function) {
    {
      SubLObject state = Vectors.make_vector(FIVE_INTEGER, NIL);
      Vectors.set_aref(state, ZERO_INTEGER, v_term);
      Vectors.set_aref(state, ONE_INTEGER, function);
      Vectors.set_aref(state, TWO_INTEGER, $kw69$ARGNUM_KEYS_ARE_FRESH);
      Vectors.set_aref(state, THREE_INTEGER, ((NIL != argnum) ? ((SubLObject) list(argnum)) : kb_indexing.key_nart_arg_index(v_term, UNPROVIDED, UNPROVIDED)));
      Vectors.set_aref(state, FOUR_INTEGER, NIL);
      return state;
    }
  }

  /** A note containing information about the state of the keys,
used to control code flow */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 28283) 
  public static final SubLObject nart_arg_final_index_spec_iterator_state_note(SubLObject state) {
    return Vectors.aref(state, TWO_INTEGER);
  }

  /** The remaining argnums to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 28467) 
  public static final SubLObject nart_arg_final_index_spec_iterator_state_argnum_keys(SubLObject state) {
    return Vectors.aref(state, THREE_INTEGER);
  }

  /** The remaining functions left to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 28611) 
  public static final SubLObject nart_arg_final_index_spec_iterator_state_function_keys(SubLObject state) {
    return Vectors.aref(state, FOUR_INTEGER);
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 29779) 
  public static final SubLObject nart_arg_final_index_spec_iterator_doneP(SubLObject state) {
    {
      SubLObject note = nart_arg_final_index_spec_iterator_state_note(state);
      SubLObject argnum_keys = nart_arg_final_index_spec_iterator_state_argnum_keys(state);
      SubLObject function_keys = nart_arg_final_index_spec_iterator_state_function_keys(state);
      return makeBoolean(((NIL == argnum_keys)
            || ((NIL == note)
               && (NIL != list_utilities.lengthE(argnum_keys, ONE_INTEGER, UNPROVIDED))
               && (NIL == function_keys))));
    }
  }

  public static final class $nart_arg_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction {
    public $nart_arg_final_index_spec_iterator_doneP$UnaryFunction() { super(extractFunctionNamed("NART-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?")); }
    public SubLObject processItem(SubLObject arg1) { return nart_arg_final_index_spec_iterator_doneP(arg1); }
  }

  public static final class $nart_arg_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction {
    public $nart_arg_final_index_spec_iterator_next$UnaryFunction() { super(extractFunctionNamed("NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30408"); }
  }

  /** Return T iff FUNCTION is a valid key for DO-FUNCTION-EXTENT-INDEX. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 35791) 
  public static final SubLObject do_function_extent_index_key_validator(SubLObject function) {
    return forts.fort_p(function);
  }

  /** Makes the single final-index-spec for FUNCTION.  This is the only
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 36419) 
  public static final SubLObject function_extent_final_index_spec(SubLObject function) {
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(function))) {
      return new_gaf_simple_final_index_spec(function, $list102, $const103$termOfUnit, mt_vars.$tou_mt$.getGlobalValue());
    } else {
      return reader.bq_cons(function, $list104);
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 38956) 
  public static final SubLObject do_predicate_rule_index_key_validator(SubLObject predicate, SubLObject sense, SubLObject direction) {
    return makeBoolean(((NIL != forts.fort_p(predicate))
           && ((NIL == sense)
            || (NIL != enumeration_types.sense_p(sense)))
           && ((NIL == direction)
            || (NIL != enumeration_types.direction_p(direction)))));
  }

  /** Makes an iterator which spits out final-index-specs, each of which is a
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 39216) 
  public static final SubLObject new_predicate_rule_final_index_spec_iterator(SubLObject predicate, SubLObject sense, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(predicate))) {
      return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(predicate, sense, $sym116$PREDICATE_RULE_INDEX_ASENT_MATCH_P));
    } else {
      {
        SubLObject state = initialize_predicate_rule_final_index_spec_iterator_state(predicate, sense, direction);
        return iteration.new_iterator(state, $sym117$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym118$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 40011) 
  public static final SubLObject initialize_predicate_rule_final_index_spec_iterator_state(SubLObject predicate, SubLObject sense, SubLObject direction) {
    {
      SubLObject state = Vectors.make_vector(SIX_INTEGER, NIL);
      Vectors.set_aref(state, ZERO_INTEGER, predicate);
      Vectors.set_aref(state, ONE_INTEGER, direction);
      Vectors.set_aref(state, TWO_INTEGER, $kw119$SENSE_KEYS_ARE_FRESH);
      Vectors.set_aref(state, THREE_INTEGER, ((NIL != sense) ? ((SubLObject) list(sense)) : kb_indexing.key_predicate_rule_index(predicate, UNPROVIDED, UNPROVIDED)));
      Vectors.set_aref(state, FOUR_INTEGER, NIL);
      Vectors.set_aref(state, FIVE_INTEGER, NIL);
      return state;
    }
  }

  /** The input predicate */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 40681) 
  public static final SubLObject predicate_rule_final_index_spec_iterator_state_predicate(SubLObject state) {
    return Vectors.aref(state, ZERO_INTEGER);
  }

  /** The input direction */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 40823) 
  public static final SubLObject predicate_rule_final_index_spec_iterator_state_direction(SubLObject state) {
    return Vectors.aref(state, ONE_INTEGER);
  }

  /** A note containing information about the state of the keys,
used to control code flow */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 40953) 
  public static final SubLObject predicate_rule_final_index_spec_iterator_state_note(SubLObject state) {
    return Vectors.aref(state, TWO_INTEGER);
  }

  /** The remaining senses to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 41143) 
  public static final SubLObject predicate_rule_final_index_spec_iterator_state_sense_keys(SubLObject state) {
    return Vectors.aref(state, THREE_INTEGER);
  }

  /** The remaining mts left to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 41291) 
  public static final SubLObject predicate_rule_final_index_spec_iterator_state_mt_keys(SubLObject state) {
    return Vectors.aref(state, FOUR_INTEGER);
  }

  /** The remaining directions left to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 41438) 
  public static final SubLObject predicate_rule_final_index_spec_iterator_state_direction_keys(SubLObject state) {
    return Vectors.aref(state, FIVE_INTEGER);
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 41599) 
  public static final SubLObject set_predicate_rule_final_index_spec_iterator_state_note(SubLObject state, SubLObject note) {
    Vectors.set_aref(state, TWO_INTEGER, note);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 41742) 
  public static final SubLObject set_predicate_rule_final_index_spec_iterator_state_sense_keys(SubLObject state, SubLObject new_keys) {
    Vectors.set_aref(state, THREE_INTEGER, new_keys);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 41887) 
  public static final SubLObject set_predicate_rule_final_index_spec_iterator_state_mt_keys(SubLObject state, SubLObject new_keys) {
    Vectors.set_aref(state, FOUR_INTEGER, new_keys);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 42029) 
  public static final SubLObject set_predicate_rule_final_index_spec_iterator_state_direction_keys(SubLObject state, SubLObject new_keys) {
    Vectors.set_aref(state, FIVE_INTEGER, new_keys);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 43054) 
  public static final SubLObject predicate_rule_final_index_spec_iterator_doneP(SubLObject state) {
    {
      SubLObject note = predicate_rule_final_index_spec_iterator_state_note(state);
      SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
      SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys(state);
      SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys(state);
      return makeBoolean(((NIL == sense_keys)
            || ((NIL == note)
               && (NIL != list_utilities.lengthE(sense_keys, ONE_INTEGER, UNPROVIDED))
               && (NIL != list_utilities.lengthLE(mt_keys, ONE_INTEGER, UNPROVIDED))
               && (NIL == direction_keys))));
    }
  }

  public static final class $predicate_rule_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction {
    public $predicate_rule_final_index_spec_iterator_doneP$UnaryFunction() { super(extractFunctionNamed("PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?")); }
    public SubLObject processItem(SubLObject arg1) { return predicate_rule_final_index_spec_iterator_doneP(arg1); }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 43709) 
  public static final SubLObject predicate_rule_final_index_spec_iterator_next(SubLObject state) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject final_index_spec = predicate_rule_final_index_spec_iterator_quiesce(state);
        SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        predicate_rule_final_index_spec_iterator_next_direction_key(state);
        return Values.values(final_index_spec, state, doneP);
      }
    }
  }

  public static final class $predicate_rule_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction {
    public $predicate_rule_final_index_spec_iterator_next$UnaryFunction() { super(extractFunctionNamed("PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT")); }
    public SubLObject processItem(SubLObject arg1) { return predicate_rule_final_index_spec_iterator_next(arg1); }
  }

  /** Iterates over the keys in STATE until it ends up with its current keylist
   (@see predicate-rule-current-keylist) being valid and relevant, with validity and relevance being
   determined by @xref predicate-rule-current-relevant-keylist.
   It may not need to iterate over any keys in STATE, in which case STATE is left unchanged.
   @return 0 listp; the relevant final-index-spec thus formed, if any
   @return 1 booleanp; whether quiescence terminated early due to running out of keys */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 44014) 
  public static final SubLObject predicate_rule_final_index_spec_iterator_quiesce(SubLObject state) {
    {
      SubLObject result = NIL;
      SubLObject doneP = NIL;
      while ((!(((NIL != result)
            || (NIL != doneP))))) {
        {
          SubLObject keylist = predicate_rule_current_relevant_keylist(state);
          if ((NIL != keylist)) {
            {
              SubLObject predicate = predicate_rule_final_index_spec_iterator_state_predicate(state);
              result = predicate_rule_keylist_to_final_index_spec(predicate, keylist);
            }
          } else {
            doneP = predicate_rule_final_index_spec_iterator_quiesce_one_step(state);
          }
        }
      }
      return Values.values(result, doneP);
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 45022) 
  public static final SubLObject predicate_rule_keylist_to_final_index_spec(SubLObject pred, SubLObject keylist) {
    return listS(pred, $kw120$PREDICATE_RULE, ConsesLow.append(keylist, NIL));
  }

  /** If STATE's current keylist is valid and relevant, returns it.
   Otherwise returns NIL.
   Valid means that none of its current keys are null.
   Relevant means that its mt is deemed relevant
   (relevance is established from outside)
   @see predicate-rule-current-keylist */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 45230) 
  public static final SubLObject predicate_rule_current_relevant_keylist(SubLObject state) {
    {
      SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
      SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys(state);
      SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys(state);
      SubLObject sense = sense_keys.first();
      SubLObject mt = mt_keys.first();
      SubLObject direction = direction_keys.first();
      if (((NIL != sense)
           && (NIL != mt)
           && (NIL != direction))) {
        if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
          return list(sense, mt, direction);
        } else {
          set_predicate_rule_final_index_spec_iterator_state_direction_keys(state, NIL);
        }
      }
    }
    return NIL;
  }

  /** STATE is assumed to be invalid or irrelevant.
   This function fixes one cause of invalidity or irrelevance.
   Invalidity is caused by having no more pending keys in a slot -- refill them.
   Irrelevance is caused by having the current mt key be irrelevant -- pop it.
   @return booleanp; whether we failed to quiesce because we ran out of keys */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 46282) 
  public static final SubLObject predicate_rule_final_index_spec_iterator_quiesce_one_step(SubLObject state) {
    {
      SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
      SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys(state);
      SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys(state);
      if ((NIL == sense_keys)) {
        return T;
      } else if ((NIL == mt_keys)) {
        predicate_rule_final_index_spec_iterator_refill_mt_keys(state);
      } else if ((NIL == direction_keys)) {
        predicate_rule_final_index_spec_iterator_refill_direction_keys(state);
      } else {
        Errors.error($str121$predicate_rule_iterator_quiescens, state);
      }
    }
    return NIL;
  }

  /** refill the mt-keys by popping a sense
   but don't actually pop the sense if it's fresh, just note that it's unfresh now */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 47477) 
  public static final SubLObject predicate_rule_final_index_spec_iterator_refill_mt_keys(SubLObject state) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject predicate = predicate_rule_final_index_spec_iterator_state_predicate(state);
        SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
        if (($kw119$SENSE_KEYS_ARE_FRESH == predicate_rule_final_index_spec_iterator_state_note(state))) {
          set_predicate_rule_final_index_spec_iterator_state_note(state, NIL);
        } else {
          sense_keys = sense_keys.rest();
          set_predicate_rule_final_index_spec_iterator_state_sense_keys(state, sense_keys);
        }
        {
          SubLObject sense_key = sense_keys.first();
          if ((NIL != sense_key)) {
            if ((NIL != mt_relevance_macros.only_specified_mt_is_relevantP())) {
              set_predicate_rule_final_index_spec_iterator_state_mt_keys(state, list(mt_relevance_macros.$mt$.getDynamicValue(thread)));
            } else {
              set_predicate_rule_final_index_spec_iterator_state_mt_keys(state, kb_indexing.key_predicate_rule_index(predicate, sense_key, UNPROVIDED));
            }
            set_predicate_rule_final_index_spec_iterator_state_note(state, $kw122$MT_KEYS_ARE_FRESH);
          }
        }
      }
      return state;
    }
  }

  /** refill the direction-keys by popping an mt
   but don't actually pop the mt if it's fresh, just note that it's unfresh now */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 48771) 
  public static final SubLObject predicate_rule_final_index_spec_iterator_refill_direction_keys(SubLObject state) {
    {
      SubLObject predicate = predicate_rule_final_index_spec_iterator_state_predicate(state);
      SubLObject direction = predicate_rule_final_index_spec_iterator_state_direction(state);
      SubLObject sense_keys = predicate_rule_final_index_spec_iterator_state_sense_keys(state);
      SubLObject mt_keys = predicate_rule_final_index_spec_iterator_state_mt_keys(state);
      if (($kw122$MT_KEYS_ARE_FRESH == predicate_rule_final_index_spec_iterator_state_note(state))) {
        set_predicate_rule_final_index_spec_iterator_state_note(state, NIL);
      } else {
        mt_keys = mt_keys.rest();
        set_predicate_rule_final_index_spec_iterator_state_mt_keys(state, mt_keys);
      }
      {
        SubLObject mt_key = mt_keys.first();
        if ((NIL != mt_key)) {
          if ((NIL != direction)) {
            set_predicate_rule_final_index_spec_iterator_state_direction_keys(state, list(direction));
          } else {
            {
              SubLObject sense_key = sense_keys.first();
              set_predicate_rule_final_index_spec_iterator_state_direction_keys(state, kb_indexing.key_predicate_rule_index(predicate, sense_key, mt_key));
            }
          }
        }
      }
    }
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 50221) 
  public static final SubLObject predicate_rule_final_index_spec_iterator_next_direction_key(SubLObject state) {
    {
      SubLObject direction_keys = predicate_rule_final_index_spec_iterator_state_direction_keys(state);
      set_predicate_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
    }
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 51867) 
  public static final SubLObject do_decontextualized_ist_predicate_rule_index_key_validator(SubLObject predicate, SubLObject sense, SubLObject direction) {
    return makeBoolean(((NIL != forts.fort_p(predicate))
           && ((NIL == sense)
            || (NIL != enumeration_types.sense_p(sense)))
           && ((NIL == direction)
            || (NIL != enumeration_types.direction_p(direction)))));
  }

  /** Makes an iterator which spits out final-index-specs, each of which is a
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 52169) 
  public static final SubLObject new_decontextualized_ist_predicate_rule_final_index_spec_iterator(SubLObject predicate, SubLObject sense, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(predicate))) {
      return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(predicate, sense, $sym127$DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_ASENT_MATCH_P));
    } else {
      {
        SubLObject state = initialize_decontextualized_ist_predicate_rule_final_index_spec_iterator_state(predicate, sense, direction);
        return iteration.new_iterator(state, $sym128$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DON, $sym129$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEX, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 53111) 
  public static final SubLObject initialize_decontextualized_ist_predicate_rule_final_index_spec_iterator_state(SubLObject predicate, SubLObject sense, SubLObject direction) {
    {
      SubLObject state = Vectors.make_vector(SIX_INTEGER, NIL);
      Vectors.set_aref(state, ZERO_INTEGER, predicate);
      Vectors.set_aref(state, ONE_INTEGER, direction);
      Vectors.set_aref(state, TWO_INTEGER, $kw119$SENSE_KEYS_ARE_FRESH);
      Vectors.set_aref(state, THREE_INTEGER, ((NIL != sense) ? ((SubLObject) list(sense)) : kb_indexing.key_decontextualized_ist_predicate_rule_index(predicate, UNPROVIDED)));
      Vectors.set_aref(state, FOUR_INTEGER, NIL);
      return state;
    }
  }

  /** The input predicate */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 53807) 
  public static final SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate(SubLObject state) {
    return Vectors.aref(state, ZERO_INTEGER);
  }

  /** The input direction */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 53970) 
  public static final SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction(SubLObject state) {
    return Vectors.aref(state, ONE_INTEGER);
  }

  /** A note containing information about the state of the keys, used to control code flow */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 54121) 
  public static final SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(SubLObject state) {
    return Vectors.aref(state, TWO_INTEGER);
  }

  /** The remaining senses to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 54332) 
  public static final SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(SubLObject state) {
    return Vectors.aref(state, THREE_INTEGER);
  }

  /** The remaining directions left to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 54501) 
  public static final SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(SubLObject state) {
    return Vectors.aref(state, FOUR_INTEGER);
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 54683) 
  public static final SubLObject set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(SubLObject state, SubLObject note) {
    Vectors.set_aref(state, TWO_INTEGER, note);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 55013) 
  public static final SubLObject set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(SubLObject state, SubLObject new_keys) {
    Vectors.set_aref(state, FOUR_INTEGER, new_keys);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 55968) 
  public static final SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP(SubLObject state) {
    {
      SubLObject note = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(state);
      SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
      SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
      return makeBoolean(((NIL == sense_keys)
            || ((NIL == note)
               && (NIL != list_utilities.lengthE(sense_keys, ONE_INTEGER, UNPROVIDED))
               && (NIL == direction_keys))));
    }
  }

  public static final class $decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction {
    public $decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP$UnaryFunction() { super(extractFunctionNamed("DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?")); }
    public SubLObject processItem(SubLObject arg1) { return decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP(arg1); }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 56616) 
  public static final SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_next(SubLObject state) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject final_index_spec = decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce(state);
        SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        decontextualized_ist_predicate_rule_final_index_spec_iterator_next_direction_key(state);
        return Values.values(final_index_spec, state, doneP);
      }
    }
  }

  public static final class $decontextualized_ist_predicate_rule_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction {
    public $decontextualized_ist_predicate_rule_final_index_spec_iterator_next$UnaryFunction() { super(extractFunctionNamed("DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT")); }
    public SubLObject processItem(SubLObject arg1) { return decontextualized_ist_predicate_rule_final_index_spec_iterator_next(arg1); }
  }

  /** Iterates over the keys in STATE until it ends up with its current keylist
   (@see decontextualized-ist-predicate-rule-current-keylist) being valid and relevant, with validity and relevance being
   determined by @xref decontextualized-ist-predicate-rule-current-relevant-keylist.
   It may not need to iterate over any keys in STATE, in which case STATE is left unchanged.
   @return 0 listp; the relevant final-index-spec thus formed, if any
   @return 1 booleanp; whether quiescence terminated early due to running out of keys */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 56984) 
  public static final SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce(SubLObject state) {
    {
      SubLObject result = NIL;
      SubLObject doneP = NIL;
      while ((!(((NIL != result)
            || (NIL != doneP))))) {
        {
          SubLObject keylist = decontextualized_ist_predicate_rule_current_relevant_keylist(state);
          if ((NIL != keylist)) {
            {
              SubLObject predicate = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate(state);
              result = decontextualized_ist_predicate_rule_keylist_to_final_index_spec(predicate, keylist);
            }
          } else {
            doneP = decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce_one_step(state);
          }
        }
      }
      return Values.values(result, doneP);
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 58139) 
  public static final SubLObject decontextualized_ist_predicate_rule_keylist_to_final_index_spec(SubLObject pred, SubLObject keylist) {
    return listS(pred, $kw130$DECONTEXTUALIZED_IST_PREDICATE_RULE, ConsesLow.append(keylist, NIL));
  }

  /** If STATE's current keylist is valid, returns it.
   Otherwise returns NIL.
   Valid means that none of its current keys are null.
   @see decontextualized-ist-predicate-rule-current-keylist */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 58410) 
  public static final SubLObject decontextualized_ist_predicate_rule_current_relevant_keylist(SubLObject state) {
    {
      SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
      SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
      SubLObject sense = sense_keys.first();
      SubLObject direction = direction_keys.first();
      if (((NIL != sense)
           && (NIL != direction))) {
        return list(sense, direction);
      }
    }
    return NIL;
  }

  /** STATE is assumed to be invalid.
   This function fixes one cause of invalidity.
   Invalidity is caused by having no more pending keys in a slot -- refill them.
   @return booleanp; whether we failed to quiesce because we ran out of keys */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 59113) 
  public static final SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce_one_step(SubLObject state) {
    {
      SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
      SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
      if ((NIL == sense_keys)) {
        return T;
      } else if ((NIL == direction_keys)) {
        decontextualized_ist_predicate_rule_final_index_spec_iterator_refill_direction_keys(state);
      } else {
        Errors.error($str131$ist_predicate_rule_iterator_quies, state);
      }
    }
    return NIL;
  }

  /** refill the direction-keys by popping a sense
   but don't actually pop the sense if it's fresh, just note that it's unfresh now */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 60072) 
  public static final SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_refill_direction_keys(SubLObject state) {
    {
      SubLObject predicate = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate(state);
      SubLObject direction = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction(state);
      SubLObject sense_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys(state);
      if (($kw119$SENSE_KEYS_ARE_FRESH == decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(state))) {
        set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note(state, NIL);
      } else {
        sense_keys = sense_keys.rest();
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30415");
      }
      {
        SubLObject sense_key = sense_keys.first();
        if ((NIL != sense_key)) {
          if ((NIL != direction)) {
            set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state, list(direction));
          } else {
            set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state, kb_indexing.key_decontextualized_ist_predicate_rule_index(predicate, sense_key));
          }
        }
      }
    }
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 61623) 
  public static final SubLObject decontextualized_ist_predicate_rule_final_index_spec_iterator_next_direction_key(SubLObject state) {
    {
      SubLObject direction_keys = decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state);
      set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
    }
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 63232) 
  public static final SubLObject do_isa_rule_index_key_validator(SubLObject collection, SubLObject sense, SubLObject direction) {
    return do_pred_arg2_rule_index_key_validator(collection, sense, direction);
  }

  /** Makes an iterator which spits out final-index-specs, each of which is a
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 63422) 
  public static final SubLObject new_isa_rule_final_index_spec_iterator(SubLObject collection, SubLObject sense, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(collection))) {
      return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(collection, sense, $sym137$ISA_RULE_INDEX_ASENT_MATCH_P));
    } else {
      {
        SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state($const138$isa, $kw139$ISA_RULE, collection, sense, direction);
        return iteration.new_iterator(state, $sym140$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym141$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 65482) 
  public static final SubLObject do_quoted_isa_rule_index_key_validator(SubLObject collection, SubLObject sense, SubLObject direction) {
    return do_pred_arg2_rule_index_key_validator(collection, sense, direction);
  }

  /** Makes an iterator which spits out final-index-specs, each of which is a
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 65686) 
  public static final SubLObject new_quoted_isa_rule_final_index_spec_iterator(SubLObject collection, SubLObject sense, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(collection))) {
      return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(collection, sense, $sym146$QUOTED_ISA_RULE_INDEX_ASENT_MATCH_P));
    } else {
      {
        SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state($const147$quotedIsa, $kw148$QUOTED_ISA_RULE, collection, sense, direction);
        return iteration.new_iterator(state, $sym140$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym141$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 67734) 
  public static final SubLObject do_genls_rule_index_key_validator(SubLObject collection, SubLObject sense, SubLObject direction) {
    return do_pred_arg2_rule_index_key_validator(collection, sense, direction);
  }

  /** Makes an iterator which spits out final-index-specs, each of which is a
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 67928) 
  public static final SubLObject new_genls_rule_final_index_spec_iterator(SubLObject collection, SubLObject sense, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(collection))) {
      return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(collection, sense, $sym153$GENLS_RULE_INDEX_ASENT_MATCH_P));
    } else {
      {
        SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state($const154$genls, $kw155$GENLS_RULE, collection, sense, direction);
        return iteration.new_iterator(state, $sym140$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym141$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 69953) 
  public static final SubLObject do_genl_mt_rule_index_key_validator(SubLObject genl_mt, SubLObject sense, SubLObject direction) {
    return do_pred_arg2_rule_index_key_validator(genl_mt, sense, direction);
  }

  /** Makes an iterator which spits out final-index-specs, each of which is a
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 70143) 
  public static final SubLObject new_genl_mt_rule_final_index_spec_iterator(SubLObject genl_mt, SubLObject sense, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(genl_mt))) {
      return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(genl_mt, sense, $sym161$GENL_MT_RULE_INDEX_ASENT_MATCH_P));
    } else {
      {
        SubLObject state = initialize_pred_arg2_rule_final_index_spec_iterator_state($const162$genlMt, $kw163$GENL_MT_RULE, genl_mt, sense, direction);
        return iteration.new_iterator(state, $sym140$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym141$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 70896) 
  public static final SubLObject do_pred_arg2_rule_index_key_validator(SubLObject arg2, SubLObject sense, SubLObject direction) {
    return makeBoolean(((NIL != forts.fort_p(arg2))
           && ((NIL == sense)
            || (NIL != enumeration_types.sense_p(sense)))
           && ((NIL == direction)
            || (NIL != enumeration_types.direction_p(direction)))));
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 71363) 
  public static final SubLObject initialize_pred_arg2_rule_final_index_spec_iterator_state(SubLObject pred, SubLObject top_level_key, SubLObject arg2, SubLObject sense, SubLObject direction) {
    {
      SubLObject state = Vectors.make_vector(EIGHT_INTEGER, NIL);
      Vectors.set_aref(state, ZERO_INTEGER, arg2);
      Vectors.set_aref(state, ONE_INTEGER, direction);
      Vectors.set_aref(state, TWO_INTEGER, $kw119$SENSE_KEYS_ARE_FRESH);
      Vectors.set_aref(state, THREE_INTEGER, ((NIL != sense) ? ((SubLObject) list(sense)) : key_pred_arg2_rule_index(pred, arg2, UNPROVIDED, UNPROVIDED)));
      Vectors.set_aref(state, FOUR_INTEGER, NIL);
      Vectors.set_aref(state, FIVE_INTEGER, NIL);
      Vectors.set_aref(state, SIX_INTEGER, pred);
      Vectors.set_aref(state, SEVEN_INTEGER, top_level_key);
      return state;
    }
  }

  /** The input arg2 */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 72131) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_state_arg2(SubLObject state) {
    return Vectors.aref(state, ZERO_INTEGER);
  }

  /** The input direction */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 72263) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_state_direction(SubLObject state) {
    return Vectors.aref(state, ONE_INTEGER);
  }

  /** A note containing information about the state of the keys,
used to control code flow */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 72393) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_state_note(SubLObject state) {
    return Vectors.aref(state, TWO_INTEGER);
  }

  /** The remaining senses to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 72583) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_state_sense_keys(SubLObject state) {
    return Vectors.aref(state, THREE_INTEGER);
  }

  /** The remaining mts left to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 72731) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_state_mt_keys(SubLObject state) {
    return Vectors.aref(state, FOUR_INTEGER);
  }

  /** The remaining directions left to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 72878) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_state_direction_keys(SubLObject state) {
    return Vectors.aref(state, FIVE_INTEGER);
  }

  /** The input pred */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 73039) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_state_pred(SubLObject state) {
    return Vectors.aref(state, SIX_INTEGER);
  }

  /** The top-level key to the final index, used for subclassing */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 73159) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_state_top_level_key(SubLObject state) {
    return Vectors.aref(state, SEVEN_INTEGER);
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 73332) 
  public static final SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_note(SubLObject state, SubLObject note) {
    Vectors.set_aref(state, TWO_INTEGER, note);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 73475) 
  public static final SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_sense_keys(SubLObject state, SubLObject new_keys) {
    Vectors.set_aref(state, THREE_INTEGER, new_keys);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 73620) 
  public static final SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys(SubLObject state, SubLObject new_keys) {
    Vectors.set_aref(state, FOUR_INTEGER, new_keys);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 73762) 
  public static final SubLObject set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(SubLObject state, SubLObject new_keys) {
    Vectors.set_aref(state, FIVE_INTEGER, new_keys);
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 74787) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_doneP(SubLObject state) {
    {
      SubLObject note = pred_arg2_rule_final_index_spec_iterator_state_note(state);
      SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
      SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state);
      SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state);
      return makeBoolean(((NIL == sense_keys)
            || ((NIL == note)
               && (NIL != list_utilities.lengthE(sense_keys, ONE_INTEGER, UNPROVIDED))
               && (NIL != list_utilities.lengthLE(mt_keys, ONE_INTEGER, UNPROVIDED))
               && (NIL == direction_keys))));
    }
  }

  public static final class $pred_arg2_rule_final_index_spec_iterator_doneP$UnaryFunction extends UnaryFunction {
    public $pred_arg2_rule_final_index_spec_iterator_doneP$UnaryFunction() { super(extractFunctionNamed("PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?")); }
    public SubLObject processItem(SubLObject arg1) { return pred_arg2_rule_final_index_spec_iterator_doneP(arg1); }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 75442) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_next(SubLObject state) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject final_index_spec = pred_arg2_rule_final_index_spec_iterator_quiesce(state);
        SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        pred_arg2_rule_final_index_spec_iterator_next_direction_key(state);
        return Values.values(final_index_spec, state, doneP);
      }
    }
  }

  public static final class $pred_arg2_rule_final_index_spec_iterator_next$UnaryFunction extends UnaryFunction {
    public $pred_arg2_rule_final_index_spec_iterator_next$UnaryFunction() { super(extractFunctionNamed("PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT")); }
    public SubLObject processItem(SubLObject arg1) { return pred_arg2_rule_final_index_spec_iterator_next(arg1); }
  }

  /** Iterates over the keys in STATE until it ends up with its current keylist
   (@see pred-arg2-rule-current-keylist) being valid and relevant, with validity and relevance being
   determined by @xref pred-arg2-rule-current-relevant-keylist.
   It may not need to iterate over any keys in STATE, in which case STATE is left unchanged.
   @return 0 listp; the relevant final-index-spec thus formed, if any
   @return 1 booleanp; whether quiescence terminated early due to running out of keys */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 75747) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_quiesce(SubLObject state) {
    {
      SubLObject result = NIL;
      SubLObject doneP = NIL;
      while ((!(((NIL != result)
            || (NIL != doneP))))) {
        {
          SubLObject keylist = pred_arg2_rule_current_relevant_keylist(state);
          if ((NIL != keylist)) {
            {
              SubLObject arg2 = pred_arg2_rule_final_index_spec_iterator_state_arg2(state);
              SubLObject top_level_key = pred_arg2_rule_final_index_spec_iterator_state_top_level_key(state);
              result = pred_arg2_rule_keylist_to_final_index_spec(arg2, top_level_key, keylist);
            }
          } else {
            doneP = pred_arg2_rule_final_index_spec_iterator_quiesce_one_step(state);
          }
        }
      }
      return Values.values(result, doneP);
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 76845) 
  public static final SubLObject pred_arg2_rule_keylist_to_final_index_spec(SubLObject pred, SubLObject top_level_key, SubLObject keylist) {
    return listS(pred, top_level_key, ConsesLow.append(keylist, NIL));
  }

  /** If STATE's current keylist is valid and relevant, returns it.
   Otherwise returns NIL.
   Valid means that none of its current keys are null.
   Relevant means that its mt is deemed relevant
   (relevance is established from outside)
   @see pred-arg2-rule-current-keylist */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 77066) 
  public static final SubLObject pred_arg2_rule_current_relevant_keylist(SubLObject state) {
    {
      SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
      SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state);
      SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state);
      SubLObject sense = sense_keys.first();
      SubLObject mt = mt_keys.first();
      SubLObject direction = direction_keys.first();
      if (((NIL != sense)
           && (NIL != mt)
           && (NIL != direction))) {
        if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
          return list(sense, mt, direction);
        } else {
          set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state, NIL);
        }
      }
    }
    return NIL;
  }

  /** STATE is assumed to be invalid or irrelevant.
   This function fixes one cause of invalidity or irrelevance.
   Invalidity is caused by having no more pending keys in a slot -- refill them.
   Irrelevance is caused by having the current mt key be irrelevant -- pop it.
   @return booleanp; whether we failed to quiesce because we ran out of keys */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 78118) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_quiesce_one_step(SubLObject state) {
    {
      SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
      SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state);
      SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state);
      if ((NIL == sense_keys)) {
        return T;
      } else if ((NIL == mt_keys)) {
        pred_arg2_rule_final_index_spec_iterator_refill_mt_keys(state);
      } else if ((NIL == direction_keys)) {
        pred_arg2_rule_final_index_spec_iterator_refill_direction_keys(state);
      } else {
        Errors.error($str164$pred_arg2_rule_iterator_quiescens, state);
      }
    }
    return NIL;
  }

  /** refill the mt-keys by popping a sense
   but don't actually pop the sense if it's fresh, just note that it's unfresh now */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 79313) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_refill_mt_keys(SubLObject state) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pred = pred_arg2_rule_final_index_spec_iterator_state_pred(state);
        SubLObject arg2 = pred_arg2_rule_final_index_spec_iterator_state_arg2(state);
        SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
        if (($kw119$SENSE_KEYS_ARE_FRESH == pred_arg2_rule_final_index_spec_iterator_state_note(state))) {
          set_pred_arg2_rule_final_index_spec_iterator_state_note(state, NIL);
        } else {
          sense_keys = sense_keys.rest();
          set_pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state, sense_keys);
        }
        {
          SubLObject sense_key = sense_keys.first();
          if ((NIL != sense_key)) {
            if ((NIL != mt_relevance_macros.only_specified_mt_is_relevantP())) {
              set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state, list(mt_relevance_macros.$mt$.getDynamicValue(thread)));
            } else {
              set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state, key_pred_arg2_rule_index(pred, arg2, sense_key, UNPROVIDED));
            }
            set_pred_arg2_rule_final_index_spec_iterator_state_note(state, $kw122$MT_KEYS_ARE_FRESH);
          }
        }
      }
      return state;
    }
  }

  /** refill the direction-keys by popping an mt
   but don't actually pop the mt if it's fresh, just note that it's unfresh now */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 80671) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_refill_direction_keys(SubLObject state) {
    {
      SubLObject pred = pred_arg2_rule_final_index_spec_iterator_state_pred(state);
      SubLObject arg2 = pred_arg2_rule_final_index_spec_iterator_state_arg2(state);
      SubLObject direction = pred_arg2_rule_final_index_spec_iterator_state_direction(state);
      SubLObject sense_keys = pred_arg2_rule_final_index_spec_iterator_state_sense_keys(state);
      SubLObject mt_keys = pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state);
      if (($kw122$MT_KEYS_ARE_FRESH == pred_arg2_rule_final_index_spec_iterator_state_note(state))) {
        set_pred_arg2_rule_final_index_spec_iterator_state_note(state, NIL);
      } else {
        mt_keys = mt_keys.rest();
        set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys(state, mt_keys);
      }
      {
        SubLObject mt_key = mt_keys.first();
        if ((NIL != mt_key)) {
          if ((NIL != direction)) {
            set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state, list(direction));
          } else {
            {
              SubLObject sense_key = sense_keys.first();
              set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state, key_pred_arg2_rule_index(pred, arg2, sense_key, mt_key));
            }
          }
        }
      }
    }
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 82185) 
  public static final SubLObject pred_arg2_rule_final_index_spec_iterator_next_direction_key(SubLObject state) {
    {
      SubLObject direction_keys = pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state);
      set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys(state, direction_keys.rest());
    }
    return state;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 82483) 
  public static final SubLObject key_pred_arg2_rule_index(SubLObject pred, SubLObject arg2, SubLObject sense, SubLObject mt) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject pcase_var = pred;
      if (pcase_var.eql($const138$isa)) {
        return kb_indexing.key_isa_rule_index(arg2, sense, mt);
      } else if (pcase_var.eql($const147$quotedIsa)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12753");
      } else if (pcase_var.eql($const154$genls)) {
        return kb_indexing.key_genls_rule_index(arg2, sense, mt);
      } else if (pcase_var.eql($const162$genlMt)) {
        return kb_indexing.key_genl_mt_rule_index(arg2, sense, mt);
      } else {
        Errors.error($str165$unexpected_pred_in_pred_arg2_inde, pred);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 83892) 
  public static final SubLObject do_function_rule_index_key_validator(SubLObject function, SubLObject direction) {
    return makeBoolean(((NIL != forts.fort_p(function))
           && ((NIL == direction)
            || (NIL != enumeration_types.direction_p(direction)))));
  }

  /** Makes an iterator which spits out final-index-specs, each of which is a
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 84097) 
  public static final SubLObject new_function_rule_final_index_spec_iterator(SubLObject function, SubLObject direction) {
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(function))) {
      return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(function, $kw110$NEG, $sym171$FUNCTION_RULE_INDEX_ASENT_MATCH_P));
    } else {
      {
        SubLObject state = initialize_function_rule_final_index_spec_iterator_state(function, direction);
        return iteration.new_iterator(state, $sym172$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym173$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 84868) 
  public static final SubLObject initialize_function_rule_final_index_spec_iterator_state(SubLObject func, SubLObject direction) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject state = Vectors.make_vector(FIVE_INTEGER, NIL);
        Vectors.set_aref(state, ZERO_INTEGER, func);
        Vectors.set_aref(state, ONE_INTEGER, direction);
        Vectors.set_aref(state, TWO_INTEGER, $kw122$MT_KEYS_ARE_FRESH);
        Vectors.set_aref(state, THREE_INTEGER, ((NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) ? ((SubLObject) list(mt_relevance_macros.$mt$.getDynamicValue(thread))) : kb_indexing.key_function_rule_index(func, UNPROVIDED)));
        Vectors.set_aref(state, FOUR_INTEGER, NIL);
        return state;
      }
    }
  }

  /** A note containing information about the state of the keys,
used to control code flow */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 85753) 
  public static final SubLObject function_rule_final_index_spec_iterator_state_note(SubLObject state) {
    return Vectors.aref(state, TWO_INTEGER);
  }

  /** The remaining mts left to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 85942) 
  public static final SubLObject function_rule_final_index_spec_iterator_state_mt_keys(SubLObject state) {
    return Vectors.aref(state, THREE_INTEGER);
  }

  /** The remaining directions left to iterate over */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 86088) 
  public static final SubLObject function_rule_final_index_spec_iterator_state_direction_keys(SubLObject state) {
    return Vectors.aref(state, FOUR_INTEGER);
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 87301) 
  public static final SubLObject function_rule_final_index_spec_iterator_doneP(SubLObject state) {
    {
      SubLObject note = function_rule_final_index_spec_iterator_state_note(state);
      SubLObject mt_keys = function_rule_final_index_spec_iterator_state_mt_keys(state);
      SubLObject direction_keys = function_rule_final_index_spec_iterator_state_direction_keys(state);
      return makeBoolean(((NIL == mt_keys)
            || ((NIL == note)
               && (NIL != list_utilities.lengthE(mt_keys, ONE_INTEGER, UNPROVIDED))
               && (NIL == direction_keys))));
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 93721) 
  public static final SubLObject do_exception_rule_index_key_validator(SubLObject rule, SubLObject direction) {
    return makeBoolean(((NIL != assertions_high.rule_assertionP(rule))
           && ((NIL == direction)
            || (NIL != enumeration_types.direction_p(direction)))));
  }

  /** Makes an iterator which spits out final-index-specs, each of which is a
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 93941) 
  public static final SubLObject new_exception_rule_final_index_spec_iterator(SubLObject rule, SubLObject direction) {
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(rule))) {
      return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(rule, $kw109$POS, $sym181$EXCEPTION_RULE_INDEX_ASENT_MATCH_P));
    } else {
      {
        SubLObject state = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30402");
        return iteration.new_iterator(state, $sym182$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym183$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 103671) 
  public static final SubLObject do_pragma_rule_index_key_validator(SubLObject rule, SubLObject direction) {
    return makeBoolean(((NIL != assertions_high.rule_assertionP(rule))
           && ((NIL == direction)
            || (NIL != enumeration_types.direction_p(direction)))));
  }

  /** Makes an iterator which spits out final-index-specs, each of which is a
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 103873) 
  public static final SubLObject new_pragma_rule_final_index_spec_iterator(SubLObject rule, SubLObject direction) {
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(rule))) {
      return iteration.new_singleton_iterator(new_rule_simple_final_index_spec(rule, $kw109$POS, $sym190$PRAGMA_RULE_INDEX_ASENT_MATCH_P));
    } else {
      {
        SubLObject state = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30403");
        return iteration.new_iterator(state, $sym191$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_, $sym192$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 126441) 
  public static final SubLObject do_mt_index_key_validator(SubLObject mt, SubLObject type) {
    return makeBoolean(((NIL != forts.fort_p(mt))
           && (NIL == kb_indexing.broad_mtP(mt))
           && ((NIL == type)
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32091")))));
  }

  /** Makes the single final-index-spec for MT.  This is the only
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 126688) 
  public static final SubLObject mt_final_index_spec(SubLObject mt) {
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(mt))) {
      return new_assertion_simple_final_index_spec(mt, $sym211$MT_INDEX_ASSERTION_MATCH_P);
    } else {
      return reader.bq_cons(mt, $list212);
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 128145) 
  public static final SubLObject do_other_index_key_validator(SubLObject v_term, SubLObject type) {
    return makeBoolean(((NIL != kb_indexing_datastructures.indexed_term_p(v_term))
           && ((NIL == type)
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32092")))));
  }

  /** Makes the single final-index-spec for TERM.  This is the only
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 128320) 
  public static final SubLObject other_final_index_spec(SubLObject v_term) {
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
      return new_assertion_simple_final_index_spec(v_term, $sym219$OTHER_INDEX_ASSERTION_MATCH_P);
    } else {
      return reader.bq_cons(v_term, $list220);
    }
  }

  /** The other index is the only one that needs to do post-hoc semantic filtering.
It's not only redundant for other indexes, it's INCORRECT in the case of the mt-index.
The mt-index needs to NOT do post-hoc semantic filtering, but the other index requires it.
Therefore, we need to gate it based on whether these assertions came from the other index. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 128713) 
  public static final SubLObject other_final_index_spec_p(SubLObject final_index_spec) {
    return makeBoolean(((NIL != other_simple_final_index_spec_p(final_index_spec))
          || (NIL != other_complex_final_index_spec_p(final_index_spec))));
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 129278) 
  public static final SubLObject other_simple_final_index_spec_p(SubLObject object) {
    return makeBoolean(((object.first() == $kw223$SIMPLE)
           && (conses_high.fourth(object) == $sym219$OTHER_INDEX_ASSERTION_MATCH_P)));
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 129439) 
  public static final SubLObject other_complex_final_index_spec_p(SubLObject object) {
    return Equality.eq($kw224$OTHER, conses_high.second(object));
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 129535) 
  public static final SubLObject other_index_assertion_match_p(SubLObject assertion, SubLObject v_term) {
    return simple_indexing.matches_other_index(assertion, v_term);
  }

  public static final class $other_index_assertion_match_p$BinaryFunction extends BinaryFunction {
    public $other_index_assertion_match_p$BinaryFunction() { super(extractFunctionNamed("OTHER-INDEX-ASSERTION-MATCH-P")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return other_index_assertion_match_p(arg1, arg2); }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 131125) 
  public static final SubLObject do_term_index_key_validator(SubLObject v_term, SubLObject type) {
    return makeBoolean(((NIL != kb_indexing_datastructures.indexed_term_p(v_term))
           && ((NIL == type)
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32093")))));
  }

  /** Makes an iterator which spits out final-index-specs, each of which is a
   complete path (i.e. a list of keys) leading down to a final index (a list) of assertions. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 131302) 
  public static final SubLObject new_term_final_index_spec_iterator(SubLObject v_term, SubLObject type) {
    {
      SubLObject iterators = NIL;
      if (((NIL == type)
          || ($kw28$GAF == type))) {
        if ((NIL != do_gaf_arg_index_key_validator(v_term, NIL, NIL))) {
          iterators = cons(new_gaf_arg_final_index_spec_iterator(v_term, UNPROVIDED, UNPROVIDED), iterators);
        }
        if ((NIL != do_predicate_extent_index_key_validator(v_term))) {
          iterators = cons(new_predicate_extent_final_index_spec_iterator(v_term), iterators);
        }
        if ((NIL != do_nart_arg_index_key_validator(v_term, NIL, NIL))) {
          iterators = cons(new_nart_arg_final_index_spec_iterator(v_term, UNPROVIDED, UNPROVIDED), iterators);
        }
        if ((NIL != do_function_extent_index_key_validator(v_term))) {
          iterators = cons(iteration.new_singleton_iterator(function_extent_final_index_spec(v_term)), iterators);
        }
      }
      if (((NIL == type)
          || ($kw30$RULE == type))) {
        if ((NIL != do_predicate_rule_index_key_validator(v_term, NIL, NIL))) {
          iterators = cons(new_predicate_rule_final_index_spec_iterator(v_term, UNPROVIDED, UNPROVIDED), iterators);
        }
        if ((NIL != do_isa_rule_index_key_validator(v_term, NIL, NIL))) {
          iterators = cons(new_isa_rule_final_index_spec_iterator(v_term, UNPROVIDED, UNPROVIDED), iterators);
        }
        if ((NIL != do_genls_rule_index_key_validator(v_term, NIL, NIL))) {
          iterators = cons(new_genls_rule_final_index_spec_iterator(v_term, UNPROVIDED, UNPROVIDED), iterators);
        }
        if ((NIL != do_genl_mt_rule_index_key_validator(v_term, NIL, NIL))) {
          iterators = cons(new_genl_mt_rule_final_index_spec_iterator(v_term, UNPROVIDED, UNPROVIDED), iterators);
        }
        if ((NIL != do_function_rule_index_key_validator(v_term, NIL))) {
          iterators = cons(new_function_rule_final_index_spec_iterator(v_term, UNPROVIDED), iterators);
        }
        if ((NIL != do_exception_rule_index_key_validator(v_term, NIL))) {
          iterators = cons(new_exception_rule_final_index_spec_iterator(v_term, UNPROVIDED), iterators);
        }
        if ((NIL != do_pragma_rule_index_key_validator(v_term, NIL))) {
          iterators = cons(new_pragma_rule_final_index_spec_iterator(v_term, UNPROVIDED), iterators);
        }
      }
      if ((NIL != do_mt_index_key_validator(v_term, NIL))) {
        iterators = cons(iteration.new_singleton_iterator(mt_final_index_spec(v_term)), iterators);
      }
      if ((NIL != do_other_index_key_validator(v_term, NIL))) {
        iterators = cons(iteration.new_singleton_iterator(other_final_index_spec(v_term)), iterators);
      }
      return iteration.new_iterator_iterator(Sequences.nreverse(iterators));
    }
  }

  /** The :other index is the only one that needs this post-hoc semantic filtering. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 133495) 
  public static final SubLObject do_term_index_assertion_match_p(SubLObject assertion, SubLObject final_index_spec) {
    if ((NIL != other_final_index_spec_p(final_index_spec))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31124");
    } else {
      return T;
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 138040) 
  public static final SubLObject do_gli_extract_method(SubLObject lookup_index) {
    return kb_indexing.lookup_index_get_property(lookup_index, $kw261$INDEX_TYPE, UNPROVIDED);
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 139313) 
  public static final SubLObject do_gli_vga_extract_keys(SubLObject lookup_index) {
    return Values.values(kb_indexing.lookup_index_get_property(lookup_index, $kw270$TERM, UNPROVIDED), kb_indexing.lookup_index_get_property(lookup_index, $kw271$ARGNUM, UNPROVIDED), kb_indexing.lookup_index_get_property(lookup_index, $kw56$PREDICATE, UNPROVIDED));
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 139888) 
  public static final SubLObject do_gli_vpe_extract_key(SubLObject lookup_index) {
    return kb_indexing.lookup_index_get_property(lookup_index, $kw56$PREDICATE, UNPROVIDED);
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 144140) 
  public static final SubLObject simple_final_index_spec_p(SubLObject final_index_spec) {
    return Equality.eq($kw223$SIMPLE, final_index_spec.first());
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 144775) 
  public static final SubLObject simple_final_index_spec_term(SubLObject final_index_spec) {
    return conses_high.second(final_index_spec);
  }

  /** If FINAL-INDEX-SPEC is simple, then get the syntactically filtered list from the other side,
   then wrap it with a filter iterator to do the semantic filtering on this side.
   If FINAL-INDEX-SPEC is complex, then get the list from the other side.
   This list is already filtered by type, truth, and direction, and the keys in FINAL-INDEX-SPEC have already
   been filtered by mt and predicate relevance, so we don't need a filter. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 144875) 
  public static final SubLObject new_final_index_iterator(SubLObject final_index_spec, SubLObject type, SubLObject truth, SubLObject direction) {
    if ((type == UNPROVIDED)) {
      type = NIL;
    }
    if ((truth == UNPROVIDED)) {
      truth = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    if ((NIL != simple_final_index_spec_p(final_index_spec))) {
      {
        SubLObject assertions = simple_term_assertion_list_filtered(final_index_spec, type, truth, direction);
        SubLObject syntactic_iterator = iteration.new_list_iterator(assertions);
        SubLObject semantic_iterator = iteration.new_filter_iterator_without_values(syntactic_iterator, $sym297$ASSERTION_SEMANTICALLY_MATCHES_SIMPLE_FINAL_INDEX_SPEC_, list(final_index_spec), UNPROVIDED);
        return semantic_iterator;
      }
    } else {
      {
        SubLObject iterator = hl_interface_infrastructure.new_hl_store_iterator(list($sym298$FINAL_INDEX_ITERATOR_FILTERED, list($sym299$QUOTE, final_index_spec), type, truth, direction), ONE_INTEGER);
        return iterator;
      }
    }
  }

  /** Assumes that ASSERTION syntactically matches SIMPLE-FINAL-INDEX-SPEC */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 146030) 
  public static final SubLObject assertion_semantically_matches_simple_final_index_specP(SubLObject assertion, SubLObject simple_final_index_spec) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = simple_final_index_spec;
        SubLObject current = datum;
        SubLObject simple = NIL;
        SubLObject v_term = NIL;
        SubLObject type = NIL;
        SubLObject rest = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list300);
        simple = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list300);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list300);
        type = current.first();
        current = current.rest();
        rest = current;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if (($kw223$SIMPLE != simple)) {
            Errors.error($str301$Unexpected_non_simple_index__s, simple_final_index_spec);
          }
        }
        if (($kw28$GAF == type)) {
          {
            SubLObject datum_39 = rest;
            SubLObject current_40 = datum_39;
            SubLObject argnum_spec = NIL;
            SubLObject pred_spec = NIL;
            SubLObject mt_spec = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_40, datum_39, $list302);
            argnum_spec = current_40.first();
            current_40 = current_40.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_40, datum_39, $list302);
            pred_spec = current_40.first();
            current_40 = current_40.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_40, datum_39, $list302);
            mt_spec = current_40.first();
            current_40 = current_40.rest();
            if ((NIL == current_40)) {
              if ((NIL == mt_spec)) {
                if ((NIL == assertion_utilities.assertion_matches_mtP(assertion))) {
                  return NIL;
                }
              }
              if ((NIL == pred_spec)) {
                if ((NIL == pred_relevance_macros.all_preds_are_relevantP())) {
                  {
                    SubLObject pred = assertions_high.gaf_predicate(assertion);
                    if ((NIL == pred_relevance_macros.relevant_predP(pred))) {
                      return NIL;
                    }
                  }
                }
              }
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum_39, $list302);
            }
          }
        } else if (($kw303$NART == type)) {
          return T;
        } else if (($kw30$RULE == type)) {
          if ((NIL == assertion_utilities.assertion_matches_mtP(assertion))) {
            return NIL;
          }
        } else if ((NIL == type)) {
          {
            SubLObject datum_41 = rest;
            SubLObject current_42 = datum_41;
            SubLObject assertion_func = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_42, datum_41, $list304);
            assertion_func = current_42.first();
            current_42 = current_42.rest();
            if ((NIL == current_42)) {
              if (($sym211$MT_INDEX_ASSERTION_MATCH_P == assertion_func)) {
                return T;
              }
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum_41, $list304);
            }
          }
          if ((NIL == assertion_utilities.assertion_matches_mtP(assertion))) {
            return NIL;
          }
        } else {
          Errors.error($str305$unexpected_type__s_in_simple_fina, type, simple_final_index_spec);
        }
      }
      return T;
    }
  }

  public static final class $assertion_semantically_matches_simple_final_index_specP$BinaryFunction extends BinaryFunction {
    public $assertion_semantically_matches_simple_final_index_specP$BinaryFunction() { super(extractFunctionNamed("ASSERTION-SEMANTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return assertion_semantically_matches_simple_final_index_specP(arg1, arg2); }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 147543) 
  public static final SubLObject destroy_final_index_iterator(SubLObject final_index_iterator) {
    return iteration.iteration_finalize(final_index_iterator);
  }

  /** Gets the index of TERM, then follows each key in KEYS in succession.
   It must end up at NIL or a final index or it will signal an error.
   Then it turns the final index into an iterator and filters it by TYPE-SPEC, TRUTH-SPEC and DIRECTION-SPEC. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 147781) 
  public static final SubLObject final_index_iterator_filtered(SubLObject final_index_spec, SubLObject type_spec, SubLObject truth_spec, SubLObject direction_spec) {
    {
      SubLObject datum = final_index_spec;
      SubLObject current = datum;
      SubLObject v_term = NIL;
      SubLObject keys = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list306);
      v_term = current.first();
      current = current.rest();
      keys = current;
      {
        SubLObject final_index = kb_indexing.get_subindex(v_term, keys);
        if ((NIL != final_index)) {
          checkType(final_index, $sym307$FINAL_INDEX_P);
          {
            SubLObject raw_iterator = set.new_set_iterator(final_index);
            SubLObject filtered_iterator = iteration.new_filter_iterator_without_values(raw_iterator, $sym308$ASSERTION_MATCHES_TYPE_TRUTH_AND_DIRECTION_, list(type_spec, truth_spec, direction_spec), UNPROVIDED);
            return filtered_iterator;
          }
        }
      }
    }
    return NIL;
  }

  /** Returns a 'gaf simple final index spec' -- a constraint object used to filter gafs.
   @param TERM; the simply indexed term from which to get the unfiltered list of gafs.
   @param ARGNUM-SPEC; @see gaf-matches-simple-argnum-spec?
   @param PREDICATE-SPEC nil or predicate-p; the predicate of the gaf
   @param MT-SPEC nil or hlmt-p; the mt of the gaf */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 148852) 
  public static final SubLObject new_gaf_simple_final_index_spec(SubLObject v_term, SubLObject argnum_spec, SubLObject predicate_spec, SubLObject mt_spec) {
    return list($kw223$SIMPLE, v_term, $kw28$GAF, argnum_spec, predicate_spec, mt_spec);
  }

  /** Returns a 'nart simple final index spec' -- a constraint object used to filter narts.
   @param TERM; the simply indexed term from which to get the unfiltered list of narts.
   @param ARGNUM-SPEC; @see tou-syntactically-matches-simple-nart-final-index-spec?
   @param FUNCTOR-SPEC nil or functor-p; the functor of the nart */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 149379) 
  public static final SubLObject new_nart_simple_final_index_spec(SubLObject v_term, SubLObject argnum_spec, SubLObject functor_spec) {
    return list($kw223$SIMPLE, v_term, $kw303$NART, argnum_spec, functor_spec);
  }

  /** Returns a 'rule simple final index spec' -- a constraint object used to filter rules.
   @param TERM; the simply indexed term from which to get the unfiltered list of rules.
   @param SENSE-SPEC nil or sense-p; the sense of the literal we're looking for
   @param ASENT-FUNC; we will (funcall ASENT-FUNC ASENT TERM) for each ASENT with sense SENSE-SPEC,
   and the rule is admitted iff there is such a literal. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 149847) 
  public static final SubLObject new_rule_simple_final_index_spec(SubLObject v_term, SubLObject sense_spec, SubLObject asent_func) {
    return list($kw223$SIMPLE, v_term, $kw30$RULE, sense_spec, asent_func);
  }

  /** Returns a 'simple final index spec' -- a constraint object used to filter assertions.
   @param ASSERTION-FUNC; we will (funcall ASSERTION-FUNC ASSERTION TERM), and the assertion
   is admitted iff it returns true. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 150397) 
  public static final SubLObject new_assertion_simple_final_index_spec(SubLObject v_term, SubLObject assertion_func) {
    return list($kw223$SIMPLE, v_term, NIL, assertion_func);
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 150739) 
  private static SubLSymbol $simple_term_assertion_list_filtered_caching_state$ = null;

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 150739) 
  public static final SubLObject clear_simple_term_assertion_list_filtered() {
    {
      SubLObject cs = $simple_term_assertion_list_filtered_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  public static final class $clear_simple_term_assertion_list_filtered$ZeroArityFunction extends ZeroArityFunction {
    public $clear_simple_term_assertion_list_filtered$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-SIMPLE-TERM-ASSERTION-LIST-FILTERED")); }
    public SubLObject processItem() { return clear_simple_term_assertion_list_filtered(); }
  }

  /** @return listp; the list of all assertions referencing the TERM in FINAL-INDEX-SPEC
   which match TYPE, TRUTH, DIRECTION, and the syntactic constraints expressed in FINAL-INDEX-SPEC. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 150739) 
  public static final SubLObject simple_term_assertion_list_filtered_internal(SubLObject simple_final_index_spec, SubLObject type, SubLObject truth, SubLObject direction) {
    {
      SubLObject result = NIL;
      SubLObject v_term = simple_final_index_spec_term(simple_final_index_spec);
      SubLObject cdolist_list_var = kb_indexing_datastructures.simple_term_assertion_list(v_term);
      SubLObject assertion = NIL;
      for (assertion = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
        if ((NIL != assertion_syntactically_matches_simple_final_index_specP(assertion, simple_final_index_spec))) {
          if ((NIL != assertion_utilities.assertion_matches_type_truth_and_directionP(assertion, type, truth, direction))) {
            result = cons(assertion, result);
          }
        }
      }
      return Sequences.nreverse(result);
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 150739) 
  public static final SubLObject simple_term_assertion_list_filtered(SubLObject simple_final_index_spec, SubLObject type, SubLObject truth, SubLObject direction) {
    {
      SubLObject caching_state = $simple_term_assertion_list_filtered_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym309$SIMPLE_TERM_ASSERTION_LIST_FILTERED, $sym310$_SIMPLE_TERM_ASSERTION_LIST_FILTERED_CACHING_STATE_, $int311$512, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
        memoization_state.register_hl_store_cache_clear_callback($sym312$CLEAR_SIMPLE_TERM_ASSERTION_LIST_FILTERED);
      }
      {
        SubLObject sxhash = memoization_state.sxhash_calc_4(simple_final_index_spec, type, truth, direction);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if ((collisions != $kw313$_MEMOIZED_ITEM_NOT_FOUND_)) {
          {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
              {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (simple_final_index_spec.equal(cached_args.first())) {
                  cached_args = cached_args.rest();
                  if (type.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (truth.equal(cached_args.first())) {
                      cached_args = cached_args.rest();
                      if (((NIL != cached_args)
                           && (NIL == cached_args.rest())
                           && direction.equal(cached_args.first()))) {
                        return memoization_state.caching_results(results2);
                      }
                    }
                  }
                }
              }
            }
          }
        }
        {
          SubLObject results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(simple_term_assertion_list_filtered_internal(simple_final_index_spec, type, truth, direction)));
          memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(simple_final_index_spec, type, truth, direction));
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  /** @note assumes all simple final-index-specs are of one of three forms:
     (:simple term :gaf  argnum-spec predicate mt)
     (:simple term :nart argnum-spec functor)
     (:simple term :rule sense       asent-func)     
     (:simple term nil   assertion-func) */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 151604) 
  public static final SubLObject assertion_syntactically_matches_simple_final_index_specP(SubLObject assertion, SubLObject simple_final_index_spec) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = simple_final_index_spec;
        SubLObject current = datum;
        SubLObject simple = NIL;
        SubLObject v_term = NIL;
        SubLObject type = NIL;
        SubLObject rest = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list300);
        simple = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list300);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list300);
        type = current.first();
        current = current.rest();
        rest = current;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if (($kw223$SIMPLE != simple)) {
            Errors.error($str301$Unexpected_non_simple_index__s, simple_final_index_spec);
          }
        }
        if ((NIL != assertion_matches_syntactic_indexing_typeP(assertion, type))) {
          if (($kw28$GAF == type)) {
            return gaf_syntactically_matches_simple_gaf_final_index_specP(assertion, v_term, rest);
          } else if (($kw303$NART == type)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30427");
          } else if (($kw30$RULE == type)) {
            return rule_syntactically_matches_simple_rule_final_index_specP(assertion, v_term, rest);
          } else if ((NIL == type)) {
            return assertion_syntactically_matches_simple_assertion_final_index_specP(assertion, v_term, rest);
          } else {
            Errors.error($str305$unexpected_type__s_in_simple_fina, type, simple_final_index_spec);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 152851) 
  public static final SubLObject assertion_matches_syntactic_indexing_typeP(SubLObject assertion, SubLObject type) {
    if (($kw303$NART == type)) {
      return function_terms.term_of_unit_assertion_p(assertion);
    } else {
      return assertion_utilities.assertion_matches_typeP(assertion, type);
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 153057) 
  public static final SubLObject gaf_syntactically_matches_simple_gaf_final_index_specP(SubLObject gaf, SubLObject v_term, SubLObject gaf_final_index_spec) {
    {
      SubLObject datum = gaf_final_index_spec;
      SubLObject current = datum;
      SubLObject argnum_spec = NIL;
      SubLObject predicate_spec = NIL;
      SubLObject mt_spec = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list314);
      argnum_spec = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list314);
      predicate_spec = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list314);
      mt_spec = current.first();
      current = current.rest();
      if ((NIL == current)) {
        if (((NIL == predicate_spec)
            || (NIL != assertion_utilities.gaf_assertion_has_pred_p(gaf, predicate_spec)))) {
          if ((NIL != gaf_matches_simple_argnum_specP(gaf, v_term, argnum_spec))) {
            if (((NIL == mt_spec)
                || (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31008")))) {
              return T;
            }
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list314);
      }
    }
    return NIL;
  }

  /** @param ARGNUM-SPEC a specification for how TERM must appear in some argument position of GAF.
   NIL          means that it doesn't matter.
   an integer N means that TERM must appear as the Nth argument in GAF.
   :any         means that TERM must appear as a top-level argument in GAF.
   (N M)        means that TERM must appear as the Mth argument in the formula that is the Nth argument of GAF.
   (N :any)     means that TERM must appear as a top-level argument in the formula that is the Nth argument of GAF. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 153480) 
  public static final SubLObject gaf_matches_simple_argnum_specP(SubLObject gaf, SubLObject v_term, SubLObject argnum_spec) {
    if ((NIL == argnum_spec)) {
      return T;
    } else if (($kw66$ANY == argnum_spec)) {
      return assertion_utilities.gaf_has_term_in_some_argnumP(gaf, v_term);
    } else if (argnum_spec.isInteger()) {
      return assertion_utilities.gaf_has_term_in_argnumP(gaf, v_term, argnum_spec);
    } else if ((argnum_spec.isCons()
         && (NIL != list_utilities.lengthE(argnum_spec, TWO_INTEGER, UNPROVIDED))
         && argnum_spec.first().isInteger())) {
      {
        SubLObject datum = argnum_spec;
        SubLObject current = datum;
        SubLObject n = NIL;
        SubLObject m = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list315);
        n = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list315);
        m = current.first();
        current = current.rest();
        if ((NIL == current)) {
          {
            SubLObject subformula = assertions_high.gaf_arg(gaf, n);
            checkType(subformula, $sym316$EL_FORMULA_P);
            if ((m == $kw66$ANY)) {
              return el_utilities.term_is_one_of_argsP(v_term, subformula);
            } else {
              return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30563");
            }
          }
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list315);
        }
      }
    } else {
      return NIL;
    }
    return NIL;
  }

  /** @param RULE-FINAL-INDEX-SPEC; a (SENSE ASENT-FUNC) pair.
   @return booleanp; whether RULE has a SENSE-lit ASENT such that (funcall ASENT-FUNC ASENT TERM) holds. */
  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 154935) 
  public static final SubLObject rule_syntactically_matches_simple_rule_final_index_specP(SubLObject rule, SubLObject v_term, SubLObject rule_final_index_spec) {
    {
      SubLObject datum = rule_final_index_spec;
      SubLObject current = datum;
      SubLObject sense = NIL;
      SubLObject asent_func = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list318);
      sense = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list318);
      asent_func = current.first();
      current = current.rest();
      if ((NIL == current)) {
        if ((NIL != rule_syntactically_matches_simple_rule_final_index_spec_intP(rule, sense, v_term, asent_func))) {
          return T;
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list318);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 155391) 
  public static final SubLObject rule_syntactically_matches_simple_rule_final_index_spec_intP(SubLObject rule, SubLObject sense, SubLObject v_term, SubLObject asent_func) {
    if ((NIL == sense)) {
      return makeBoolean(((NIL != rule_syntactically_matches_simple_rule_final_index_spec_intP(rule, $kw110$NEG, v_term, asent_func))
            || (NIL != rule_syntactically_matches_simple_rule_final_index_spec_intP(rule, $kw109$POS, v_term, asent_func))));
    } else {
      if ((NIL != assertion_handles.valid_assertion_handleP(rule))) {
        {
          SubLObject asents = clauses.clause_sense_lits(assertions_high.assertion_cnf(rule), sense);
          SubLObject match = NIL;
          if ((NIL == match)) {
            {
              SubLObject csome_list_var = asents;
              SubLObject asent = NIL;
              for (asent = csome_list_var.first(); (!(((NIL != match)
                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), asent = csome_list_var.first()) {
                match = asent_syntactically_matches_simple_rule_final_index_specP(asent, v_term, asent_func);
              }
            }
          }
          return match;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 155992) 
  public static final SubLObject asent_syntactically_matches_simple_rule_final_index_specP(SubLObject asent, SubLObject v_term, SubLObject asent_func) {
    {
      SubLObject result = NIL;
      SubLObject pcase_var = asent_func;
      if (pcase_var.eql($sym116$PREDICATE_RULE_INDEX_ASENT_MATCH_P)) {
        result = predicate_rule_index_asent_match_p(asent, v_term);
      } else if (pcase_var.eql($sym137$ISA_RULE_INDEX_ASENT_MATCH_P)) {
        result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30405");
      } else if (pcase_var.eql($sym153$GENLS_RULE_INDEX_ASENT_MATCH_P)) {
        result = genls_rule_index_asent_match_p(asent, v_term);
      } else if (pcase_var.eql($sym161$GENL_MT_RULE_INDEX_ASENT_MATCH_P)) {
        result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30400");
      } else if (pcase_var.eql($sym171$FUNCTION_RULE_INDEX_ASENT_MATCH_P)) {
        result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30398");
      } else if (pcase_var.eql($sym181$EXCEPTION_RULE_INDEX_ASENT_MATCH_P)) {
        result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30395");
      } else if (pcase_var.eql($sym190$PRAGMA_RULE_INDEX_ASENT_MATCH_P)) {
        result = pragma_rule_index_asent_match_p(asent, v_term);
      } else {
        result = Functions.funcall(asent_func, asent, v_term);
      }
      return result;
    }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 156411) 
  public static final SubLObject assertion_syntactically_matches_simple_assertion_final_index_specP(SubLObject assertion, SubLObject v_term, SubLObject assertion_final_index_spec) {
    {
      SubLObject datum = assertion_final_index_spec;
      SubLObject current = datum;
      SubLObject assertion_func = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list304);
      assertion_func = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject result = NIL;
          SubLObject pcase_var = assertion_func;
          if (pcase_var.eql($sym211$MT_INDEX_ASSERTION_MATCH_P)) {
            result = mt_index_assertion_match_p(assertion, v_term);
          } else {
            result = Functions.funcall(assertion_func, assertion, v_term);
          }
          return result;
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list304);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 156739) 
  public static final SubLObject predicate_rule_index_asent_match_p(SubLObject asent, SubLObject predicate) {
    return makeBoolean(((predicate == cycl_utilities.atomic_sentence_predicate(asent))
           && (NIL != predicate_rule_index_asent_p(asent))));
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 156988) 
  public static final SubLObject predicate_rule_index_asent_p(SubLObject asent) {
    if ((NIL != forts.fort_p(cycl_utilities.atomic_sentence_predicate(asent)))) {
      {
        SubLObject pcase_var = cycl_utilities.atomic_sentence_predicate(asent);
        if (pcase_var.eql($const138$isa)) {
          return makeBoolean((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30406")));
        } else if (pcase_var.eql($const154$genls)) {
          return makeBoolean((NIL == genls_rule_index_asent_p(asent)));
        } else if (pcase_var.eql($const162$genlMt)) {
          return makeBoolean((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30401")));
        } else if (pcase_var.eql($const103$termOfUnit)) {
          return makeBoolean((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30399")));
        } else if (pcase_var.eql($const319$abnormal)) {
          return makeBoolean((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30396")));
        } else if (pcase_var.eql($const320$meetsPragmaticRequirement)) {
          return makeBoolean((NIL == pragma_rule_index_asent_p(asent)));
        } else {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 157991) 
  public static final SubLObject decontextualized_ist_predicate_rule_index_asent_match_p(SubLObject asent, SubLObject predicate) {
    return makeBoolean((($const321$ist == cycl_utilities.atomic_sentence_predicate(asent))
           && (predicate == el_utilities.literal_predicate(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30350"))));
  }

  public static final class $decontextualized_ist_predicate_rule_index_asent_match_p$BinaryFunction extends BinaryFunction {
    public $decontextualized_ist_predicate_rule_index_asent_match_p$BinaryFunction() { super(extractFunctionNamed("DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-MATCH-P")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return decontextualized_ist_predicate_rule_index_asent_match_p(arg1, arg2); }
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 160245) 
  public static final SubLObject genls_rule_index_asent_match_p(SubLObject asent, SubLObject collection) {
    return makeBoolean(((NIL != genls_rule_index_asent_p(asent))
           && (collection == cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))));
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 160451) 
  public static final SubLObject genls_rule_index_asent_p(SubLObject asent) {
    return makeBoolean((($const154$genls == cycl_utilities.atomic_sentence_predicate(asent))
           && (NIL != el_utilities.formula_arityE(asent, TWO_INTEGER, UNPROVIDED))
           && (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)))));
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 162254) 
  public static final SubLObject pragma_rule_index_asent_match_p(SubLObject asent, SubLObject rule) {
    return makeBoolean(((NIL != pragma_rule_index_asent_p(asent))
           && (rule == cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))));
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 162464) 
  public static final SubLObject pragma_rule_index_asent_p(SubLObject asent) {
    return makeBoolean((($const320$meetsPragmaticRequirement == cycl_utilities.atomic_sentence_predicate(asent))
           && (NIL != el_utilities.formula_arityE(asent, TWO_INTEGER, UNPROVIDED))
           && (NIL != assertion_handles.assertion_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)))));
  }

  @SubL(source = "cycl/kb-mapping-macros.lisp", position = 163082) 
  public static final SubLObject mt_index_assertion_match_p(SubLObject assertion, SubLObject mt) {
    return hlmt.hlmt_equalP(mt, assertions_high.assertion_mt(assertion));
  }

  public static final SubLObject declare_kb_mapping_macros_file() {
    declareMacro(myName, "pwhen_predicate_is_relevant", "PWHEN-PREDICATE-IS-RELEVANT");
    declareMacro(myName, "pwhen_mt_is_relevant", "PWHEN-MT-IS-RELEVANT");
    declareMacro(myName, "pwhen_truth_relevant", "PWHEN-TRUTH-RELEVANT");
    declareFunction(myName, "truth_relevant_p", "TRUTH-RELEVANT-P", 2, 0, false);
    declareMacro(myName, "pwhen_assertion_has_truth", "PWHEN-ASSERTION-HAS-TRUTH");
    declareMacro(myName, "pwhen_assertion_has_direction_spec", "PWHEN-ASSERTION-HAS-DIRECTION-SPEC");
    declareFunction(myName, "direction_spec_p", "DIRECTION-SPEC-P", 1, 0, false);
    declareFunction(myName, "assertion_has_direction_spec", "ASSERTION-HAS-DIRECTION-SPEC", 2, 0, false);
    declareMacro(myName, "do_assertion_list", "DO-ASSERTION-LIST");
    declareMacro(myName, "do_simple_index", "DO-SIMPLE-INDEX");
    declareMacro(myName, "pwhen_assertion_has_type", "PWHEN-ASSERTION-HAS-TYPE");
    declareMacro(myName, "some_assertions", "SOME-ASSERTIONS");
    declareMacro(myName, "some_assertions_internal", "SOME-ASSERTIONS-INTERNAL");
    declareMacro(myName, "do_final_index_from_spec", "DO-FINAL-INDEX-FROM-SPEC");
    declareMacro(myName, "do_gaf_arg_index", "DO-GAF-ARG-INDEX");
    declareMacro(myName, "do_gaf_arg_index_values", "DO-GAF-ARG-INDEX-VALUES");
    declareFunction(myName, "do_gaf_arg_index_key_validator", "DO-GAF-ARG-INDEX-KEY-VALIDATOR", 3, 0, false);
    declareFunction(myName, "new_gaf_arg_final_index_spec_iterator", "NEW-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
    declareFunction(myName, "initialize_gaf_arg_final_index_spec_iterator_state", "INITIALIZE-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false);
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_state_term", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-TERM", 1, 0, false);
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_state_predicate", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false);
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_state_note", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_state_argnum_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 1, 0, false);
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_state_predicate_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE-KEYS", 1, 0, false);
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_state_mt_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
    declareFunction(myName, "set_gaf_arg_final_index_spec_iterator_state_note", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
    declareFunction(myName, "set_gaf_arg_final_index_spec_iterator_state_argnum_keys", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 2, 0, false);
    declareFunction(myName, "set_gaf_arg_final_index_spec_iterator_state_predicate_keys", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE-KEYS", 2, 0, false);
    declareFunction(myName, "set_gaf_arg_final_index_spec_iterator_state_mt_keys", "SET-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_state_current_argnum_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-ARGNUM-KEY", 1, 0, false);
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_state_current_predicate_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-PREDICATE-KEY", 1, 0, false);
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_state_current_mt_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
    declareFunction(myName, "gaf_arg_current_keylist", "GAF-ARG-CURRENT-KEYLIST", 1, 0, false);
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_doneP", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false); new $gaf_arg_final_index_spec_iterator_doneP$UnaryFunction();
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_next", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false); new $gaf_arg_final_index_spec_iterator_next$UnaryFunction();
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_quiesce", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
    declareFunction(myName, "gaf_arg_keylist_to_final_index_spec", "GAF-ARG-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
    declareFunction(myName, "gaf_arg_current_relevant_keylist", "GAF-ARG-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_quiesce_one_step", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_refill_predicate_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-REFILL-PREDICATE-KEYS", 1, 0, false);
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_refill_mt_keys", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false);
    declareFunction(myName, "gaf_arg_final_index_spec_iterator_next_mt_key", "GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT-MT-KEY", 1, 0, false);
    declareMacro(myName, "do_predicate_extent_index", "DO-PREDICATE-EXTENT-INDEX");
    declareFunction(myName, "do_predicate_extent_index_key_validator", "DO-PREDICATE-EXTENT-INDEX-KEY-VALIDATOR", 1, 0, false);
    declareFunction(myName, "new_predicate_extent_final_index_spec_iterator", "NEW-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR", 1, 0, false);
    declareFunction(myName, "initialize_predicate_extent_final_index_spec_iterator_state", "INITIALIZE-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE", 1, 0, false);
    declareFunction(myName, "predicate_extent_final_index_spec_iterator_state_predicate", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false);
    declareFunction(myName, "predicate_extent_final_index_spec_iterator_state_mt_keys", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
    declareFunction(myName, "set_predicate_extent_final_index_spec_iterator_state_mt_keys", "SET-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
    declareFunction(myName, "predicate_extent_final_index_spec_iterator_state_current_mt_key", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
    declareFunction(myName, "predicate_extent_current_keylist", "PREDICATE-EXTENT-CURRENT-KEYLIST", 1, 0, false);
    declareFunction(myName, "predicate_extent_final_index_spec_iterator_doneP", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false); new $predicate_extent_final_index_spec_iterator_doneP$UnaryFunction();
    declareFunction(myName, "predicate_extent_final_index_spec_iterator_next", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false); new $predicate_extent_final_index_spec_iterator_next$UnaryFunction();
    declareFunction(myName, "predicate_extent_final_index_spec_iterator_quiesce", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
    declareFunction(myName, "predicate_extent_keylist_to_final_index_spec", "PREDICATE-EXTENT-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
    declareFunction(myName, "predicate_extent_current_relevant_keylist", "PREDICATE-EXTENT-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
    declareFunction(myName, "predicate_extent_final_index_spec_iterator_quiesce_one_step", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
    declareFunction(myName, "predicate_extent_final_index_spec_iterator_next_mt_key", "PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT-MT-KEY", 1, 0, false);
    declareMacro(myName, "do_nart_arg_index", "DO-NART-ARG-INDEX");
    declareFunction(myName, "do_nart_arg_index_key_validator", "DO-NART-ARG-INDEX-KEY-VALIDATOR", 3, 0, false);
    declareFunction(myName, "new_nart_arg_final_index_spec_iterator", "NEW-NART-ARG-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
    declareFunction(myName, "initialize_nart_arg_final_index_spec_iterator_state", "INITIALIZE-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false);
    declareFunction(myName, "nart_arg_final_index_spec_iterator_state_term", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-TERM", 1, 0, false);
    declareFunction(myName, "nart_arg_final_index_spec_iterator_state_function", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNCTION", 1, 0, false);
    declareFunction(myName, "nart_arg_final_index_spec_iterator_state_note", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
    declareFunction(myName, "nart_arg_final_index_spec_iterator_state_argnum_keys", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 1, 0, false);
    declareFunction(myName, "nart_arg_final_index_spec_iterator_state_function_keys", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNCTION-KEYS", 1, 0, false);
    declareFunction(myName, "set_nart_arg_final_index_spec_iterator_state_note", "SET-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
    declareFunction(myName, "set_nart_arg_final_index_spec_iterator_state_argnum_keys", "SET-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-ARGNUM-KEYS", 2, 0, false);
    declareFunction(myName, "set_nart_arg_final_index_spec_iterator_state_function_keys", "SET-NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNCTION-KEYS", 2, 0, false);
    declareFunction(myName, "nart_arg_final_index_spec_iterator_state_current_argnum_key", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-ARGNUM-KEY", 1, 0, false);
    declareFunction(myName, "nart_arg_final_index_spec_iterator_state_current_function_key", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-FUNCTION-KEY", 1, 0, false);
    declareFunction(myName, "nart_arg_current_keylist", "NART-ARG-CURRENT-KEYLIST", 1, 0, false);
    declareFunction(myName, "nart_arg_final_index_spec_iterator_doneP", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false); new $nart_arg_final_index_spec_iterator_doneP$UnaryFunction();
    declareFunction(myName, "nart_arg_final_index_spec_iterator_next", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false); new $nart_arg_final_index_spec_iterator_next$UnaryFunction();
    declareFunction(myName, "nart_arg_final_index_spec_iterator_quiesce", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
    declareFunction(myName, "nart_arg_keylist_to_final_index_spec", "NART-ARG-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
    declareFunction(myName, "nart_arg_current_relevant_keylist", "NART-ARG-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
    declareFunction(myName, "nart_arg_final_index_spec_iterator_quiesce_one_step", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
    declareFunction(myName, "nart_arg_final_index_spec_iterator_refill_function_keys", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-REFILL-FUNCTION-KEYS", 1, 0, false);
    declareFunction(myName, "nart_arg_final_index_spec_iterator_next_function_key", "NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT-FUNCTION-KEY", 1, 0, false);
    declareMacro(myName, "do_function_extent_index", "DO-FUNCTION-EXTENT-INDEX");
    declareFunction(myName, "do_function_extent_index_key_validator", "DO-FUNCTION-EXTENT-INDEX-KEY-VALIDATOR", 1, 0, false);
    declareMacro(myName, "do_function_narts", "DO-FUNCTION-NARTS");
    declareFunction(myName, "function_extent_final_index_spec", "FUNCTION-EXTENT-FINAL-INDEX-SPEC", 1, 0, false);
    declareMacro(myName, "do_consequent_rules", "DO-CONSEQUENT-RULES");
    declareMacro(myName, "do_antecedent_rules", "DO-ANTECEDENT-RULES");
    declareMacro(myName, "do_predicate_rule_index", "DO-PREDICATE-RULE-INDEX");
    declareFunction(myName, "do_predicate_rule_index_key_validator", "DO-PREDICATE-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
    declareFunction(myName, "new_predicate_rule_final_index_spec_iterator", "NEW-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
    declareFunction(myName, "initialize_predicate_rule_final_index_spec_iterator_state", "INITIALIZE-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false);
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_state_predicate", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false);
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_state_direction", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_state_note", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_state_sense_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false);
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_state_mt_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_state_direction_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
    declareFunction(myName, "set_predicate_rule_final_index_spec_iterator_state_note", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
    declareFunction(myName, "set_predicate_rule_final_index_spec_iterator_state_sense_keys", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false);
    declareFunction(myName, "set_predicate_rule_final_index_spec_iterator_state_mt_keys", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
    declareFunction(myName, "set_predicate_rule_final_index_spec_iterator_state_direction_keys", "SET-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_state_current_sense_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false);
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_state_current_mt_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_state_current_direction_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
    declareFunction(myName, "predicate_rule_current_keylist", "PREDICATE-RULE-CURRENT-KEYLIST", 1, 0, false);
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_doneP", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false); new $predicate_rule_final_index_spec_iterator_doneP$UnaryFunction();
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_next", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false); new $predicate_rule_final_index_spec_iterator_next$UnaryFunction();
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_quiesce", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
    declareFunction(myName, "predicate_rule_keylist_to_final_index_spec", "PREDICATE-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
    declareFunction(myName, "predicate_rule_current_relevant_keylist", "PREDICATE-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_quiesce_one_step", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_refill_mt_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false);
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_refill_direction_keys", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
    declareFunction(myName, "predicate_rule_final_index_spec_iterator_next_direction_key", "PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
    declareMacro(myName, "do_decontextualized_ist_predicate_rule_index", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
    declareFunction(myName, "do_decontextualized_ist_predicate_rule_index_key_validator", "DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
    declareFunction(myName, "new_decontextualized_ist_predicate_rule_final_index_spec_iterator", "NEW-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
    declareFunction(myName, "initialize_decontextualized_ist_predicate_rule_final_index_spec_iterator_state", "INITIALIZE-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 3, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_predicate", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-PREDICATE", 1, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
    declareFunction(myName, "set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_note", "SET-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
    declareFunction(myName, "set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_sense_keys", "SET-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false);
    declareFunction(myName, "set_decontextualized_ist_predicate_rule_final_index_spec_iterator_state_direction_keys", "SET-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_sense_key", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_final_index_spec_iterator_state_current_direction_key", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_current_keylist", "DECONTEXTUALIZED-IST-PREDICATE-RULE-CURRENT-KEYLIST", 1, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false); new $decontextualized_ist_predicate_rule_final_index_spec_iterator_doneP$UnaryFunction();
    declareFunction(myName, "decontextualized_ist_predicate_rule_final_index_spec_iterator_next", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false); new $decontextualized_ist_predicate_rule_final_index_spec_iterator_next$UnaryFunction();
    declareFunction(myName, "decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_keylist_to_final_index_spec", "DECONTEXTUALIZED-IST-PREDICATE-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_current_relevant_keylist", "DECONTEXTUALIZED-IST-PREDICATE-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_final_index_spec_iterator_quiesce_one_step", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_final_index_spec_iterator_refill_direction_keys", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_final_index_spec_iterator_next_direction_key", "DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
    declareMacro(myName, "do_isa_rule_index", "DO-ISA-RULE-INDEX");
    declareFunction(myName, "do_isa_rule_index_key_validator", "DO-ISA-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
    declareFunction(myName, "new_isa_rule_final_index_spec_iterator", "NEW-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
    declareMacro(myName, "do_quoted_isa_rule_index", "DO-QUOTED-ISA-RULE-INDEX");
    declareFunction(myName, "do_quoted_isa_rule_index_key_validator", "DO-QUOTED-ISA-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
    declareFunction(myName, "new_quoted_isa_rule_final_index_spec_iterator", "NEW-QUOTED-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
    declareMacro(myName, "do_genls_rule_index", "DO-GENLS-RULE-INDEX");
    declareFunction(myName, "do_genls_rule_index_key_validator", "DO-GENLS-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
    declareFunction(myName, "new_genls_rule_final_index_spec_iterator", "NEW-GENLS-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
    declareMacro(myName, "do_genl_mt_rule_index", "DO-GENL-MT-RULE-INDEX");
    declareFunction(myName, "do_genl_mt_rule_index_key_validator", "DO-GENL-MT-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
    declareFunction(myName, "new_genl_mt_rule_final_index_spec_iterator", "NEW-GENL-MT-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 2, false);
    declareFunction(myName, "do_pred_arg2_rule_index_key_validator", "DO-PRED-ARG2-RULE-INDEX-KEY-VALIDATOR", 3, 0, false);
    declareFunction(myName, "initialize_pred_arg2_rule_final_index_spec_iterator_state", "INITIALIZE-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 5, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_state_arg2", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-ARG2", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_state_direction", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_state_note", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_state_sense_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_state_mt_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_state_direction_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_state_pred", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-PRED", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_state_top_level_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-TOP-LEVEL-KEY", 1, 0, false);
    declareFunction(myName, "set_pred_arg2_rule_final_index_spec_iterator_state_note", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
    declareFunction(myName, "set_pred_arg2_rule_final_index_spec_iterator_state_sense_keys", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false);
    declareFunction(myName, "set_pred_arg2_rule_final_index_spec_iterator_state_mt_keys", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
    declareFunction(myName, "set_pred_arg2_rule_final_index_spec_iterator_state_direction_keys", "SET-PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_state_current_sense_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_state_current_mt_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_state_current_direction_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_current_keylist", "PRED-ARG2-RULE-CURRENT-KEYLIST", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_doneP", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false); new $pred_arg2_rule_final_index_spec_iterator_doneP$UnaryFunction();
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_next", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false); new $pred_arg2_rule_final_index_spec_iterator_next$UnaryFunction();
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_quiesce", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_keylist_to_final_index_spec", "PRED-ARG2-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 3, 0, false);
    declareFunction(myName, "pred_arg2_rule_current_relevant_keylist", "PRED-ARG2-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_quiesce_one_step", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_refill_mt_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_refill_direction_keys", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
    declareFunction(myName, "pred_arg2_rule_final_index_spec_iterator_next_direction_key", "PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
    declareFunction(myName, "key_pred_arg2_rule_index", "KEY-PRED-ARG2-RULE-INDEX", 2, 2, false);
    declareMacro(myName, "do_function_rule_index", "DO-FUNCTION-RULE-INDEX");
    declareFunction(myName, "do_function_rule_index_key_validator", "DO-FUNCTION-RULE-INDEX-KEY-VALIDATOR", 2, 0, false);
    declareFunction(myName, "new_function_rule_final_index_spec_iterator", "NEW-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 1, false);
    declareFunction(myName, "initialize_function_rule_final_index_spec_iterator_state", "INITIALIZE-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false);
    declareFunction(myName, "function_rule_final_index_spec_iterator_state_func", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-FUNC", 1, 0, false);
    declareFunction(myName, "function_rule_final_index_spec_iterator_state_direction", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
    declareFunction(myName, "function_rule_final_index_spec_iterator_state_note", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
    declareFunction(myName, "function_rule_final_index_spec_iterator_state_mt_keys", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
    declareFunction(myName, "function_rule_final_index_spec_iterator_state_direction_keys", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
    declareFunction(myName, "set_function_rule_final_index_spec_iterator_state_note", "SET-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
    declareFunction(myName, "set_function_rule_final_index_spec_iterator_state_mt_keys", "SET-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
    declareFunction(myName, "set_function_rule_final_index_spec_iterator_state_direction_keys", "SET-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
    declareFunction(myName, "function_rule_final_index_spec_iterator_state_current_mt_key", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
    declareFunction(myName, "function_rule_final_index_spec_iterator_state_current_direction_key", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
    declareFunction(myName, "function_rule_current_keylist", "FUNCTION-RULE-CURRENT-KEYLIST", 1, 0, false);
    declareFunction(myName, "function_rule_final_index_spec_iterator_doneP", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
    declareFunction(myName, "function_rule_final_index_spec_iterator_next", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "function_rule_final_index_spec_iterator_quiesce", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
    declareFunction(myName, "function_rule_keylist_to_final_index_spec", "FUNCTION-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
    declareFunction(myName, "function_rule_current_relevant_keylist", "FUNCTION-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
    declareFunction(myName, "function_rule_final_index_spec_iterator_quiesce_one_step", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
    declareFunction(myName, "function_rule_final_index_spec_iterator_refill_direction_keys", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
    declareFunction(myName, "function_rule_final_index_spec_iterator_next_direction_key", "FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
    declareMacro(myName, "do_exception_rule_index", "DO-EXCEPTION-RULE-INDEX");
    declareFunction(myName, "do_exception_rule_index_key_validator", "DO-EXCEPTION-RULE-INDEX-KEY-VALIDATOR", 2, 0, false);
    declareFunction(myName, "new_exception_rule_final_index_spec_iterator", "NEW-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 1, false);
    declareFunction(myName, "initialize_exception_rule_final_index_spec_iterator_state", "INITIALIZE-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false);
    declareFunction(myName, "exception_rule_final_index_spec_iterator_state_rule", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-RULE", 1, 0, false);
    declareFunction(myName, "exception_rule_final_index_spec_iterator_state_direction", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
    declareFunction(myName, "exception_rule_final_index_spec_iterator_state_note", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
    declareFunction(myName, "exception_rule_final_index_spec_iterator_state_mt_keys", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
    declareFunction(myName, "exception_rule_final_index_spec_iterator_state_direction_keys", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
    declareFunction(myName, "set_exception_rule_final_index_spec_iterator_state_note", "SET-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
    declareFunction(myName, "set_exception_rule_final_index_spec_iterator_state_mt_keys", "SET-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
    declareFunction(myName, "set_exception_rule_final_index_spec_iterator_state_direction_keys", "SET-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
    declareFunction(myName, "exception_rule_final_index_spec_iterator_state_current_mt_key", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
    declareFunction(myName, "exception_rule_final_index_spec_iterator_state_current_direction_key", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
    declareFunction(myName, "exception_rule_current_keylist", "EXCEPTION-RULE-CURRENT-KEYLIST", 1, 0, false);
    declareFunction(myName, "exception_rule_final_index_spec_iterator_doneP", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
    declareFunction(myName, "exception_rule_final_index_spec_iterator_next", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "exception_rule_final_index_spec_iterator_quiesce", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
    declareFunction(myName, "exception_rule_keylist_to_final_index_spec", "EXCEPTION-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
    declareFunction(myName, "exception_rule_current_relevant_keylist", "EXCEPTION-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
    declareFunction(myName, "exception_rule_final_index_spec_iterator_quiesce_one_step", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
    declareFunction(myName, "exception_rule_final_index_spec_iterator_refill_direction_keys", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
    declareFunction(myName, "exception_rule_final_index_spec_iterator_next_direction_key", "EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
    declareMacro(myName, "do_pragma_rule_index", "DO-PRAGMA-RULE-INDEX");
    declareFunction(myName, "do_pragma_rule_index_key_validator", "DO-PRAGMA-RULE-INDEX-KEY-VALIDATOR", 2, 0, false);
    declareFunction(myName, "new_pragma_rule_final_index_spec_iterator", "NEW-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR", 1, 1, false);
    declareFunction(myName, "initialize_pragma_rule_final_index_spec_iterator_state", "INITIALIZE-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false);
    declareFunction(myName, "pragma_rule_final_index_spec_iterator_state_rule", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-RULE", 1, 0, false);
    declareFunction(myName, "pragma_rule_final_index_spec_iterator_state_direction", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
    declareFunction(myName, "pragma_rule_final_index_spec_iterator_state_note", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
    declareFunction(myName, "pragma_rule_final_index_spec_iterator_state_mt_keys", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
    declareFunction(myName, "pragma_rule_final_index_spec_iterator_state_direction_keys", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
    declareFunction(myName, "set_pragma_rule_final_index_spec_iterator_state_note", "SET-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
    declareFunction(myName, "set_pragma_rule_final_index_spec_iterator_state_mt_keys", "SET-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
    declareFunction(myName, "set_pragma_rule_final_index_spec_iterator_state_direction_keys", "SET-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
    declareFunction(myName, "pragma_rule_final_index_spec_iterator_state_current_mt_key", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
    declareFunction(myName, "pragma_rule_final_index_spec_iterator_state_current_direction_key", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
    declareFunction(myName, "pragma_rule_current_keylist", "PRAGMA-RULE-CURRENT-KEYLIST", 1, 0, false);
    declareFunction(myName, "pragma_rule_final_index_spec_iterator_doneP", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
    declareFunction(myName, "pragma_rule_final_index_spec_iterator_next", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "pragma_rule_final_index_spec_iterator_quiesce", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
    declareFunction(myName, "pragma_rule_keylist_to_final_index_spec", "PRAGMA-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 2, 0, false);
    declareFunction(myName, "pragma_rule_current_relevant_keylist", "PRAGMA-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
    declareFunction(myName, "pragma_rule_final_index_spec_iterator_quiesce_one_step", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
    declareFunction(myName, "pragma_rule_final_index_spec_iterator_refill_direction_keys", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
    declareFunction(myName, "pragma_rule_final_index_spec_iterator_next_direction_key", "PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
    declareMacro(myName, "do_unbound_predicate_rule_index", "DO-UNBOUND-PREDICATE-RULE-INDEX");
    declareFunction(myName, "do_unbound_predicate_rule_index_key_validator", "DO-UNBOUND-PREDICATE-RULE-INDEX-KEY-VALIDATOR", 2, 0, false);
    declareFunction(myName, "new_unbound_predicate_rule_final_index_spec_iterator", "NEW-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR", 0, 2, false);
    declareFunction(myName, "initialize_unbound_predicate_rule_final_index_spec_iterator_state", "INITIALIZE-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE", 2, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_state_direction", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_state_note", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_state_sense_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_state_mt_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_state_direction_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 1, 0, false);
    declareFunction(myName, "set_unbound_predicate_rule_final_index_spec_iterator_state_note", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-NOTE", 2, 0, false);
    declareFunction(myName, "set_unbound_predicate_rule_final_index_spec_iterator_state_sense_keys", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-SENSE-KEYS", 2, 0, false);
    declareFunction(myName, "set_unbound_predicate_rule_final_index_spec_iterator_state_mt_keys", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-MT-KEYS", 2, 0, false);
    declareFunction(myName, "set_unbound_predicate_rule_final_index_spec_iterator_state_direction_keys", "SET-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-DIRECTION-KEYS", 2, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_state_current_sense_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-SENSE-KEY", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_state_current_mt_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-MT-KEY", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_state_current_direction_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-STATE-CURRENT-DIRECTION-KEY", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_current_keylist", "UNBOUND-PREDICATE-RULE-CURRENT-KEYLIST", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_doneP", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_next", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_quiesce", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_keylist_to_final_index_spec", "UNBOUND-PREDICATE-RULE-KEYLIST-TO-FINAL-INDEX-SPEC", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_current_relevant_keylist", "UNBOUND-PREDICATE-RULE-CURRENT-RELEVANT-KEYLIST", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_quiesce_one_step", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-QUIESCE-ONE-STEP", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_refill_mt_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-MT-KEYS", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_refill_direction_keys", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-REFILL-DIRECTION-KEYS", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_final_index_spec_iterator_next_direction_key", "UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT-DIRECTION-KEY", 1, 0, false);
    declareMacro(myName, "do_mt_index", "DO-MT-INDEX");
    declareFunction(myName, "do_mt_index_key_validator", "DO-MT-INDEX-KEY-VALIDATOR", 2, 0, false);
    declareFunction(myName, "mt_final_index_spec", "MT-FINAL-INDEX-SPEC", 1, 0, false);
    declareMacro(myName, "do_other_index", "DO-OTHER-INDEX");
    declareFunction(myName, "do_other_index_key_validator", "DO-OTHER-INDEX-KEY-VALIDATOR", 2, 0, false);
    declareFunction(myName, "other_final_index_spec", "OTHER-FINAL-INDEX-SPEC", 1, 0, false);
    declareFunction(myName, "other_final_index_spec_p", "OTHER-FINAL-INDEX-SPEC-P", 1, 0, false);
    declareFunction(myName, "other_simple_final_index_spec_p", "OTHER-SIMPLE-FINAL-INDEX-SPEC-P", 1, 0, false);
    declareFunction(myName, "other_complex_final_index_spec_p", "OTHER-COMPLEX-FINAL-INDEX-SPEC-P", 1, 0, false);
    declareFunction(myName, "other_index_assertion_match_p", "OTHER-INDEX-ASSERTION-MATCH-P", 2, 0, false); new $other_index_assertion_match_p$BinaryFunction();
    declareFunction(myName, "do_other_index_assertion_match_p", "DO-OTHER-INDEX-ASSERTION-MATCH-P", 1, 0, false);
    declareMacro(myName, "do_term_index", "DO-TERM-INDEX");
    declareFunction(myName, "do_term_index_key_validator", "DO-TERM-INDEX-KEY-VALIDATOR", 2, 0, false);
    declareFunction(myName, "new_term_final_index_spec_iterator", "NEW-TERM-FINAL-INDEX-SPEC-ITERATOR", 2, 0, false);
    declareFunction(myName, "do_term_index_assertion_match_p", "DO-TERM-INDEX-ASSERTION-MATCH-P", 2, 0, false);
    declareMacro(myName, "do_broad_mt_index", "DO-BROAD-MT-INDEX");
    declareFunction(myName, "do_broad_mt_index_key_validator", "DO-BROAD-MT-INDEX-KEY-VALIDATOR", 2, 0, false);
    declareFunction(myName, "do_broad_mt_index_match_p", "DO-BROAD-MT-INDEX-MATCH-P", 4, 0, false);
    declareMacro(myName, "do_mt_contents", "DO-MT-CONTENTS");
    declareFunction(myName, "do_mt_contents_method", "DO-MT-CONTENTS-METHOD", 1, 0, false);
    declareMacro(myName, "do_overlap_index", "DO-OVERLAP-INDEX");
    declareMacro(myName, "do_best_gaf_lookup_index", "DO-BEST-GAF-LOOKUP-INDEX");
    declareMacro(myName, "do_gaf_lookup_index", "DO-GAF-LOOKUP-INDEX");
    declareFunction(myName, "do_gli_extract_method", "DO-GLI-EXTRACT-METHOD", 1, 0, false);
    declareFunction(myName, "do_gli_method_error", "DO-GLI-METHOD-ERROR", 2, 0, false);
    declareMacro(myName, "do_gli_via_gaf_arg", "DO-GLI-VIA-GAF-ARG");
    declareFunction(myName, "do_gli_vga_extract_keys", "DO-GLI-VGA-EXTRACT-KEYS", 1, 0, false);
    declareMacro(myName, "do_gli_via_predicate_extent", "DO-GLI-VIA-PREDICATE-EXTENT");
    declareFunction(myName, "do_gli_vpe_extract_key", "DO-GLI-VPE-EXTRACT-KEY", 1, 0, false);
    declareMacro(myName, "do_gli_via_overlap", "DO-GLI-VIA-OVERLAP");
    declareFunction(myName, "do_gli_vo_extract_key", "DO-GLI-VO-EXTRACT-KEY", 1, 0, false);
    declareMacro(myName, "do_best_nat_lookup_index", "DO-BEST-NAT-LOOKUP-INDEX");
    declareMacro(myName, "do_nat_lookup_index", "DO-NAT-LOOKUP-INDEX");
    declareFunction(myName, "do_nli_extract_method", "DO-NLI-EXTRACT-METHOD", 1, 0, false);
    declareFunction(myName, "do_nli_method_error", "DO-NLI-METHOD-ERROR", 2, 0, false);
    declareMacro(myName, "do_nli_via_nart_arg", "DO-NLI-VIA-NART-ARG");
    declareFunction(myName, "do_nli_vna_extract_keys", "DO-NLI-VNA-EXTRACT-KEYS", 1, 0, false);
    declareMacro(myName, "do_nli_via_function_extent", "DO-NLI-VIA-FUNCTION-EXTENT");
    declareFunction(myName, "do_nli_vfe_extract_key", "DO-NLI-VFE-EXTRACT-KEY", 1, 0, false);
    declareMacro(myName, "do_nli_via_overlap", "DO-NLI-VIA-OVERLAP");
    declareFunction(myName, "do_nli_vo_extract_key", "DO-NLI-VO-EXTRACT-KEY", 1, 0, false);
    declareFunction(myName, "simple_final_index_spec_p", "SIMPLE-FINAL-INDEX-SPEC-P", 1, 0, false);
    declareFunction(myName, "simple_final_index_spec_term", "SIMPLE-FINAL-INDEX-SPEC-TERM", 1, 0, false);
    declareFunction(myName, "new_final_index_iterator", "NEW-FINAL-INDEX-ITERATOR", 1, 3, false);
    declareFunction(myName, "assertion_semantically_matches_simple_final_index_specP", "ASSERTION-SEMANTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?", 2, 0, false); new $assertion_semantically_matches_simple_final_index_specP$BinaryFunction();
    declareFunction(myName, "destroy_final_index_iterator", "DESTROY-FINAL-INDEX-ITERATOR", 1, 0, false);
    declareFunction(myName, "final_index_iterator_filtered", "FINAL-INDEX-ITERATOR-FILTERED", 4, 0, false);
    declareFunction(myName, "new_gaf_simple_final_index_spec", "NEW-GAF-SIMPLE-FINAL-INDEX-SPEC", 4, 0, false);
    declareFunction(myName, "new_nart_simple_final_index_spec", "NEW-NART-SIMPLE-FINAL-INDEX-SPEC", 3, 0, false);
    declareFunction(myName, "new_rule_simple_final_index_spec", "NEW-RULE-SIMPLE-FINAL-INDEX-SPEC", 3, 0, false);
    declareFunction(myName, "new_assertion_simple_final_index_spec", "NEW-ASSERTION-SIMPLE-FINAL-INDEX-SPEC", 2, 0, false);
    declareFunction(myName, "clear_simple_term_assertion_list_filtered", "CLEAR-SIMPLE-TERM-ASSERTION-LIST-FILTERED", 0, 0, false); new $clear_simple_term_assertion_list_filtered$ZeroArityFunction();
    declareFunction(myName, "remove_simple_term_assertion_list_filtered", "REMOVE-SIMPLE-TERM-ASSERTION-LIST-FILTERED", 4, 0, false);
    declareFunction(myName, "simple_term_assertion_list_filtered_internal", "SIMPLE-TERM-ASSERTION-LIST-FILTERED-INTERNAL", 4, 0, false);
    declareFunction(myName, "simple_term_assertion_list_filtered", "SIMPLE-TERM-ASSERTION-LIST-FILTERED", 4, 0, false);
    declareFunction(myName, "assertion_syntactically_matches_simple_final_index_specP", "ASSERTION-SYNTACTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?", 2, 0, false);
    declareFunction(myName, "assertion_matches_syntactic_indexing_typeP", "ASSERTION-MATCHES-SYNTACTIC-INDEXING-TYPE?", 2, 0, false);
    declareFunction(myName, "gaf_syntactically_matches_simple_gaf_final_index_specP", "GAF-SYNTACTICALLY-MATCHES-SIMPLE-GAF-FINAL-INDEX-SPEC?", 3, 0, false);
    declareFunction(myName, "gaf_matches_simple_argnum_specP", "GAF-MATCHES-SIMPLE-ARGNUM-SPEC?", 3, 0, false);
    declareFunction(myName, "tou_syntactically_matches_simple_nart_final_index_specP", "TOU-SYNTACTICALLY-MATCHES-SIMPLE-NART-FINAL-INDEX-SPEC?", 3, 0, false);
    declareFunction(myName, "rule_syntactically_matches_simple_rule_final_index_specP", "RULE-SYNTACTICALLY-MATCHES-SIMPLE-RULE-FINAL-INDEX-SPEC?", 3, 0, false);
    declareFunction(myName, "rule_syntactically_matches_simple_rule_final_index_spec_intP", "RULE-SYNTACTICALLY-MATCHES-SIMPLE-RULE-FINAL-INDEX-SPEC-INT?", 4, 0, false);
    declareFunction(myName, "asent_syntactically_matches_simple_rule_final_index_specP", "ASENT-SYNTACTICALLY-MATCHES-SIMPLE-RULE-FINAL-INDEX-SPEC?", 3, 0, false);
    declareFunction(myName, "assertion_syntactically_matches_simple_assertion_final_index_specP", "ASSERTION-SYNTACTICALLY-MATCHES-SIMPLE-ASSERTION-FINAL-INDEX-SPEC?", 3, 0, false);
    declareFunction(myName, "predicate_rule_index_asent_match_p", "PREDICATE-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
    declareFunction(myName, "predicate_rule_index_asent_p", "PREDICATE-RULE-INDEX-ASENT-P", 1, 0, false);
    declareFunction(myName, "decontextualized_ist_predicate_rule_index_asent_match_p", "DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-MATCH-P", 2, 0, false); new $decontextualized_ist_predicate_rule_index_asent_match_p$BinaryFunction();
    declareFunction(myName, "decontextualized_ist_predicate_rule_index_asent_p", "DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-P", 1, 0, false);
    declareFunction(myName, "isa_rule_index_asent_match_p", "ISA-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
    declareFunction(myName, "quoted_isa_rule_index_asent_match_p", "QUOTED-ISA-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
    declareFunction(myName, "isa_rule_index_asent_p", "ISA-RULE-INDEX-ASENT-P", 1, 0, false);
    declareFunction(myName, "quoted_isa_rule_index_asent_p", "QUOTED-ISA-RULE-INDEX-ASENT-P", 1, 0, false);
    declareFunction(myName, "genls_rule_index_asent_match_p", "GENLS-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
    declareFunction(myName, "genls_rule_index_asent_p", "GENLS-RULE-INDEX-ASENT-P", 1, 0, false);
    declareFunction(myName, "genl_mt_rule_index_asent_match_p", "GENL-MT-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
    declareFunction(myName, "genl_mt_rule_index_asent_p", "GENL-MT-RULE-INDEX-ASENT-P", 1, 0, false);
    declareFunction(myName, "function_rule_index_asent_match_p", "FUNCTION-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
    declareFunction(myName, "function_rule_index_asent_p", "FUNCTION-RULE-INDEX-ASENT-P", 1, 0, false);
    declareFunction(myName, "exception_rule_index_asent_match_p", "EXCEPTION-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
    declareFunction(myName, "exception_rule_index_asent_p", "EXCEPTION-RULE-INDEX-ASENT-P", 1, 0, false);
    declareFunction(myName, "pragma_rule_index_asent_match_p", "PRAGMA-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
    declareFunction(myName, "pragma_rule_index_asent_p", "PRAGMA-RULE-INDEX-ASENT-P", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_index_asent_match_p", "UNBOUND-PREDICATE-RULE-INDEX-ASENT-MATCH-P", 2, 0, false);
    declareFunction(myName, "unbound_predicate_rule_index_asent_p", "UNBOUND-PREDICATE-RULE-INDEX-ASENT-P", 1, 0, false);
    declareFunction(myName, "mt_index_assertion_match_p", "MT-INDEX-ASSERTION-MATCH-P", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_kb_mapping_macros_file() {
    $simple_term_assertion_list_filtered_caching_state$ = deflexical("*SIMPLE-TERM-ASSERTION-LIST-FILTERED-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_kb_mapping_macros_file() {
    // CVS_ID("Id: kb-mapping-macros.lisp 127378 2009-03-13 17:56:45Z daves ");
    access_macros.register_macro_helper($sym7$TRUTH_RELEVANT_P, $sym8$PWHEN_TRUTH_RELEVANT);
    access_macros.register_macro_helper($sym37$SOME_ASSERTIONS_INTERNAL, $sym39$SOME_ASSERTIONS);
    access_macros.register_macro_helper($sym43$DO_FINAL_INDEX_FROM_SPEC, $list44);
    utilities_macros.register_cyc_api_macro($sym61$DO_GAF_ARG_INDEX, $list53, $str62$Iterate_over_an_index_of_gaf_asse);
    access_macros.register_macro_helper($sym59$DO_GAF_ARG_INDEX_KEY_VALIDATOR, $sym61$DO_GAF_ARG_INDEX);
    access_macros.register_macro_helper($sym60$NEW_GAF_ARG_FINAL_INDEX_SPEC_ITERATOR, $sym61$DO_GAF_ARG_INDEX);
    access_macros.register_macro_helper($sym75$DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR, $sym77$DO_PREDICATE_EXTENT_INDEX);
    access_macros.register_macro_helper($sym76$NEW_PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR, $sym77$DO_PREDICATE_EXTENT_INDEX);
    access_macros.register_macro_helper($sym85$DO_NART_ARG_INDEX_KEY_VALIDATOR, $sym87$DO_NART_ARG_INDEX);
    access_macros.register_macro_helper($sym86$NEW_NART_ARG_FINAL_INDEX_SPEC_ITERATOR, $sym87$DO_NART_ARG_INDEX);
    access_macros.register_macro_helper($sym95$DO_FUNCTION_EXTENT_INDEX_KEY_VALIDATOR, $sym97$DO_FUNCTION_EXTENT_INDEX);
    access_macros.register_macro_helper($sym96$FUNCTION_EXTENT_FINAL_INDEX_SPEC, $sym97$DO_FUNCTION_EXTENT_INDEX);
    access_macros.register_macro_helper($sym114$DO_PREDICATE_RULE_INDEX_KEY_VALIDATOR, $sym107$DO_PREDICATE_RULE_INDEX);
    access_macros.register_macro_helper($sym115$NEW_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym107$DO_PREDICATE_RULE_INDEX);
    access_macros.register_macro_helper($sym124$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_VALIDATOR, $sym126$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX);
    access_macros.register_macro_helper($sym125$NEW_DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym126$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX);
    access_macros.register_macro_helper($sym134$DO_ISA_RULE_INDEX_KEY_VALIDATOR, $sym136$DO_ISA_RULE_INDEX);
    access_macros.register_macro_helper($sym135$NEW_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym136$DO_ISA_RULE_INDEX);
    access_macros.register_macro_helper($sym143$DO_QUOTED_ISA_RULE_INDEX_KEY_VALIDATOR, $sym145$DO_QUOTED_ISA_RULE_INDEX);
    access_macros.register_macro_helper($sym144$NEW_QUOTED_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym145$DO_QUOTED_ISA_RULE_INDEX);
    access_macros.register_macro_helper($sym150$DO_GENLS_RULE_INDEX_KEY_VALIDATOR, $sym152$DO_GENLS_RULE_INDEX);
    access_macros.register_macro_helper($sym151$NEW_GENLS_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym152$DO_GENLS_RULE_INDEX);
    access_macros.register_macro_helper($sym158$DO_GENL_MT_RULE_INDEX_KEY_VALIDATOR, $sym160$DO_GENL_MT_RULE_INDEX);
    access_macros.register_macro_helper($sym159$NEW_GENL_MT_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym160$DO_GENL_MT_RULE_INDEX);
    access_macros.register_macro_helper($sym168$DO_FUNCTION_RULE_INDEX_KEY_VALIDATOR, $sym170$DO_FUNCTION_RULE_INDEX);
    access_macros.register_macro_helper($sym169$NEW_FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym170$DO_FUNCTION_RULE_INDEX);
    access_macros.register_macro_helper($sym178$DO_EXCEPTION_RULE_INDEX_KEY_VALIDATOR, $sym180$DO_EXCEPTION_RULE_INDEX);
    access_macros.register_macro_helper($sym179$NEW_EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym180$DO_EXCEPTION_RULE_INDEX);
    access_macros.register_macro_helper($sym187$DO_PRAGMA_RULE_INDEX_KEY_VALIDATOR, $sym189$DO_PRAGMA_RULE_INDEX);
    access_macros.register_macro_helper($sym188$NEW_PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym189$DO_PRAGMA_RULE_INDEX);
    access_macros.register_macro_helper($sym197$DO_UNBOUND_PREDICATE_RULE_INDEX_KEY_VALIDATOR, $sym199$DO_UNBOUND_PREDICATE_RULE_INDEX);
    access_macros.register_macro_helper($sym198$NEW_UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR, $sym199$DO_UNBOUND_PREDICATE_RULE_INDEX);
    access_macros.register_macro_helper($sym208$DO_MT_INDEX_KEY_VALIDATOR, $sym210$DO_MT_INDEX);
    access_macros.register_macro_helper($sym209$MT_FINAL_INDEX_SPEC, $sym210$DO_MT_INDEX);
    access_macros.register_macro_helper($sym215$DO_OTHER_INDEX_KEY_VALIDATOR, $sym218$DO_OTHER_INDEX);
    access_macros.register_macro_helper($sym216$OTHER_FINAL_INDEX_SPEC, $sym218$DO_OTHER_INDEX);
    access_macros.register_macro_helper($sym221$OTHER_FINAL_INDEX_SPEC_P, $sym222$DO_TERM_INDEX);
    access_macros.register_macro_helper($sym217$DO_OTHER_INDEX_ASSERTION_MATCH_P, $sym218$DO_OTHER_INDEX);
    utilities_macros.register_cyc_api_macro($sym222$DO_TERM_INDEX, $list213, $str229$Iterate_over_all_assertions_index);
    access_macros.register_macro_helper($sym226$DO_TERM_INDEX_KEY_VALIDATOR, $sym222$DO_TERM_INDEX);
    access_macros.register_macro_helper($sym227$NEW_TERM_FINAL_INDEX_SPEC_ITERATOR, $sym222$DO_TERM_INDEX);
    access_macros.register_macro_helper($sym228$DO_TERM_INDEX_ASSERTION_MATCH_P, $sym222$DO_TERM_INDEX);
    access_macros.register_macro_helper($sym232$DO_BROAD_MT_INDEX_KEY_VALIDATOR, $sym235$DO_BROAD_MT_INDEX);
    access_macros.register_macro_helper($sym234$DO_BROAD_MT_INDEX_MATCH_P, $sym235$DO_BROAD_MT_INDEX);
    access_macros.register_macro_helper($sym237$DO_MT_CONTENTS_METHOD, $sym241$DO_MT_CONTENTS);
    access_macros.register_macro_helper($sym254$DO_GLI_EXTRACT_METHOD, $sym249$DO_GAF_LOOKUP_INDEX);
    access_macros.register_macro_helper($sym260$DO_GLI_METHOD_ERROR, $sym249$DO_GAF_LOOKUP_INDEX);
    access_macros.register_macro_helper($sym255$DO_GLI_VIA_GAF_ARG, $sym249$DO_GAF_LOOKUP_INDEX);
    access_macros.register_macro_helper($sym268$DO_GLI_VGA_EXTRACT_KEYS, $sym255$DO_GLI_VIA_GAF_ARG);
    access_macros.register_macro_helper($sym256$DO_GLI_VIA_PREDICATE_EXTENT, $sym249$DO_GAF_LOOKUP_INDEX);
    access_macros.register_macro_helper($sym272$DO_GLI_VPE_EXTRACT_KEY, $sym256$DO_GLI_VIA_PREDICATE_EXTENT);
    access_macros.register_macro_helper($sym258$DO_GLI_VIA_OVERLAP, $sym249$DO_GAF_LOOKUP_INDEX);
    access_macros.register_macro_helper($sym274$DO_GLI_VO_EXTRACT_KEY, $sym258$DO_GLI_VIA_OVERLAP);
    access_macros.register_macro_helper($sym283$DO_NLI_EXTRACT_METHOD, $sym278$DO_NAT_LOOKUP_INDEX);
    access_macros.register_macro_helper($sym288$DO_NLI_METHOD_ERROR, $sym278$DO_NAT_LOOKUP_INDEX);
    access_macros.register_macro_helper($sym284$DO_NLI_VIA_NART_ARG, $sym278$DO_NAT_LOOKUP_INDEX);
    access_macros.register_macro_helper($sym293$DO_NLI_VNA_EXTRACT_KEYS, $sym284$DO_NLI_VIA_NART_ARG);
    access_macros.register_macro_helper($sym286$DO_NLI_VIA_FUNCTION_EXTENT, $sym278$DO_NAT_LOOKUP_INDEX);
    access_macros.register_macro_helper($sym295$DO_NLI_VFE_EXTRACT_KEY, $sym286$DO_NLI_VIA_FUNCTION_EXTENT);
    access_macros.register_macro_helper($sym287$DO_NLI_VIA_OVERLAP, $sym278$DO_NAT_LOOKUP_INDEX);
    access_macros.register_macro_helper($sym296$DO_NLI_VO_EXTRACT_KEY, $sym287$DO_NLI_VIA_OVERLAP);
    access_macros.register_macro_helper($sym50$NEW_FINAL_INDEX_ITERATOR, $sym43$DO_FINAL_INDEX_FROM_SPEC);
    access_macros.register_macro_helper($sym52$DESTROY_FINAL_INDEX_ITERATOR, $sym43$DO_FINAL_INDEX_FROM_SPEC);
    memoization_state.note_globally_cached_function($sym309$SIMPLE_TERM_ASSERTION_LIST_FILTERED);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("PREDICATE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym2$RELEVANT_PRED_ = makeSymbol("RELEVANT-PRED?");
  public static final SubLList $list3 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym4$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");
  public static final SubLList $list5 = list(makeSymbol("TRUTH"), makeSymbol("TRUTH-SPEC"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym6$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym7$TRUTH_RELEVANT_P = makeSymbol("TRUTH-RELEVANT-P");
  public static final SubLSymbol $sym8$PWHEN_TRUTH_RELEVANT = makeSymbol("PWHEN-TRUTH-RELEVANT");
  public static final SubLList $list9 = list(makeSymbol("ASSERTION"), makeSymbol("TRUTH"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym10$ASSERTION_HAS_TRUTH = makeSymbol("ASSERTION-HAS-TRUTH");
  public static final SubLSymbol $sym11$COR = makeSymbol("COR");
  public static final SubLSymbol $sym12$NULL = makeSymbol("NULL");
  public static final SubLList $list13 = list(makeSymbol("ASSERTION"), makeSymbol("DIRECTION-SPEC"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym14$ASSERTION_HAS_DIRECTION_SPEC = makeSymbol("ASSERTION-HAS-DIRECTION-SPEC");
  public static final SubLList $list15 = list(list(makeSymbol("VAR"), makeSymbol("ASSERTIONS"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list16 = list(makeKeyword("TRUTH"), makeKeyword("DIRECTION"), makeKeyword("DONE"));
  public static final SubLSymbol $kw17$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw18$TRUTH = makeKeyword("TRUTH");
  public static final SubLSymbol $kw19$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw20$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym21$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym22$PWHEN_ASSERTION_HAS_TRUTH = makeSymbol("PWHEN-ASSERTION-HAS-TRUTH");
  public static final SubLSymbol $sym23$PWHEN_ASSERTION_HAS_DIRECTION_SPEC = makeSymbol("PWHEN-ASSERTION-HAS-DIRECTION-SPEC");
  public static final SubLList $list24 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym25$DO_ASSERTION_LIST = makeSymbol("DO-ASSERTION-LIST");
  public static final SubLSymbol $sym26$DO_SIMPLE_INDEX_TERM_ASSERTION_LIST = makeSymbol("DO-SIMPLE-INDEX-TERM-ASSERTION-LIST");
  public static final SubLList $list27 = list(makeSymbol("ASSERTION"), makeSymbol("TYPE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $kw28$GAF = makeKeyword("GAF");
  public static final SubLSymbol $sym29$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");
  public static final SubLSymbol $kw30$RULE = makeKeyword("RULE");
  public static final SubLSymbol $sym31$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
  public static final SubLSymbol $sym32$ASSERTION_HAS_TYPE = makeSymbol("ASSERTION-HAS-TYPE");
  public static final SubLList $list33 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list34 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw35$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLSymbol $sym36$UNTIL_MAPPING_FINISHED = makeSymbol("UNTIL-MAPPING-FINISHED");
  public static final SubLSymbol $sym37$SOME_ASSERTIONS_INTERNAL = makeSymbol("SOME-ASSERTIONS-INTERNAL");
  public static final SubLList $list38 = list(list(makeSymbol("MAPPING-FINISHED")));
  public static final SubLSymbol $sym39$SOME_ASSERTIONS = makeSymbol("SOME-ASSERTIONS");
  public static final SubLList $list40 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list41 = list(makeKeyword("PROGRESS-MESSAGE"));
  public static final SubLSymbol $sym42$DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");
  public static final SubLSymbol $sym43$DO_FINAL_INDEX_FROM_SPEC = makeSymbol("DO-FINAL-INDEX-FROM-SPEC");
  public static final SubLList $list44 = list(new SubLObject[] {makeSymbol("DO-GAF-ARG-INDEX"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"), makeSymbol("DO-NART-ARG-INDEX"), makeSymbol("DO-FUNCTION-EXTENT-INDEX"), makeSymbol("DO-PREDICATE-RULE-INDEX"), makeSymbol("DO-ISA-RULE-INDEX"), makeSymbol("DO-QUOTED-ISA-RULE-INDEX"), makeSymbol("DO-GENLS-RULE-INDEX"), makeSymbol("DO-GENL-MT-RULE-INDEX"), makeSymbol("DO-FUNCTION-RULE-INDEX"), makeSymbol("DO-EXCEPTION-RULE-INDEX"), makeSymbol("DO-PRAGMA-RULE-INDEX"), makeSymbol("DO-UNBOUND-PREDICATE-RULE-INDEX"), makeSymbol("DO-MT-INDEX"), makeSymbol("DO-OTHER-INDEX"), makeSymbol("DO-TERM-INDEX")});
  public static final SubLList $list45 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("FINAL-INDEX-SPEC"), makeSymbol("TYPE"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym46$FINAL_INDEX_ITERATOR = makeUninternedSymbol("FINAL-INDEX-ITERATOR");
  public static final SubLSymbol $sym47$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym48$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym49$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym50$NEW_FINAL_INDEX_ITERATOR = makeSymbol("NEW-FINAL-INDEX-ITERATOR");
  public static final SubLSymbol $sym51$DO_ITERATOR_WITHOUT_VALUES_INTERNAL = makeSymbol("DO-ITERATOR-WITHOUT-VALUES-INTERNAL");
  public static final SubLSymbol $sym52$DESTROY_FINAL_INDEX_ITERATOR = makeSymbol("DESTROY-FINAL-INDEX-ITERATOR");
  public static final SubLList $list53 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("PREDICATE"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list54 = list(makeKeyword("INDEX"), makeKeyword("PREDICATE"), makeKeyword("TRUTH"), makeKeyword("DIRECTION"), makeKeyword("DONE"));
  public static final SubLSymbol $kw55$INDEX = makeKeyword("INDEX");
  public static final SubLSymbol $kw56$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $sym57$PRED_VAR = makeUninternedSymbol("PRED-VAR");
  public static final SubLSymbol $sym58$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym59$DO_GAF_ARG_INDEX_KEY_VALIDATOR = makeSymbol("DO-GAF-ARG-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym60$NEW_GAF_ARG_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-GAF-ARG-FINAL-INDEX-SPEC-ITERATOR");
  public static final SubLSymbol $sym61$DO_GAF_ARG_INDEX = makeSymbol("DO-GAF-ARG-INDEX");
  public static final SubLString $str62$Iterate_over_an_index_of_gaf_asse = makeString("Iterate over an index of gaf assertions executing BODY within the scope of VAR.\nVAR is bound to each assertion in the iteration such that:\nThe assertion is in a relevant microtheory (relevance is established outside).\nIf INDEX is non-nil and positive, TERM is the INDEX argument of the assertion,\nelse TERM is some nonzero argument of the assertion.\nIf PREDICATE is non-nil, PREDICATE is the predicate of the assertion.\nIf TRUTH is non-nil, the assertion has TRUTH as its truth value.\nIf DIRECTION is non-nil, the assertion has DIRECTION as its direction.\nIteration is halted as soon as DONE becomes non-nil.\n@note VAR may be bound to the same assertion twice, if it exists in multiple indexing leaf sets,\nfor example if TERM appears in more than one non-zero argnum of VAR.");
  public static final SubLList $list63 = list(list(new SubLObject[] {makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("GATHER-INDEX"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("PREDICATE"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym64$ASSERTION = makeUninternedSymbol("ASSERTION");
  public static final SubLSymbol $sym65$GAF_ARG = makeSymbol("GAF-ARG");
  public static final SubLSymbol $kw66$ANY = makeKeyword("ANY");
  public static final SubLSymbol $sym67$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?");
  public static final SubLSymbol $sym68$GAF_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("GAF-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT");
  public static final SubLSymbol $kw69$ARGNUM_KEYS_ARE_FRESH = makeKeyword("ARGNUM-KEYS-ARE-FRESH");
  public static final SubLSymbol $kw70$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLSymbol $kw71$PREDICATE_KEYS_ARE_FRESH = makeKeyword("PREDICATE-KEYS-ARE-FRESH");
  public static final SubLList $list72 = list(list(makeSymbol("VAR"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym73$PRED_VAR = makeUninternedSymbol("PRED-VAR");
  public static final SubLSymbol $sym74$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym75$DO_PREDICATE_EXTENT_INDEX_KEY_VALIDATOR = makeSymbol("DO-PREDICATE-EXTENT-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym76$NEW_PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR");
  public static final SubLSymbol $sym77$DO_PREDICATE_EXTENT_INDEX = makeSymbol("DO-PREDICATE-EXTENT-INDEX");
  public static final SubLSymbol $sym78$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-DONE?");
  public static final SubLSymbol $sym79$PREDICATE_EXTENT_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("PREDICATE-EXTENT-FINAL-INDEX-SPEC-ITERATOR-NEXT");
  public static final SubLSymbol $kw80$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLList $list81 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("FUNCTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list82 = list(makeKeyword("INDEX"), makeKeyword("FUNCTION"), makeKeyword("DONE"));
  public static final SubLSymbol $kw83$FUNCTION = makeKeyword("FUNCTION");
  public static final SubLSymbol $sym84$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym85$DO_NART_ARG_INDEX_KEY_VALIDATOR = makeSymbol("DO-NART-ARG-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym86$NEW_NART_ARG_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-NART-ARG-FINAL-INDEX-SPEC-ITERATOR");
  public static final SubLSymbol $sym87$DO_NART_ARG_INDEX = makeSymbol("DO-NART-ARG-INDEX");
  public static final SubLSymbol $sym88$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("NART-ARG-FINAL-INDEX-SPEC-ITERATOR-DONE?");
  public static final SubLSymbol $sym89$NART_ARG_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("NART-ARG-FINAL-INDEX-SPEC-ITERATOR-NEXT");
  public static final SubLSymbol $kw90$NART_ARG = makeKeyword("NART-ARG");
  public static final SubLString $str91$nart_arg_keys_should_never_be_irr = makeString("nart arg keys should never be irrelevant: ~s ~s");
  public static final SubLSymbol $kw92$FUNCTION_KEYS_ARE_FRESH = makeKeyword("FUNCTION-KEYS-ARE-FRESH");
  public static final SubLList $list93 = list(list(makeSymbol("VAR"), makeSymbol("FUNCTION"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym94$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym95$DO_FUNCTION_EXTENT_INDEX_KEY_VALIDATOR = makeSymbol("DO-FUNCTION-EXTENT-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym96$FUNCTION_EXTENT_FINAL_INDEX_SPEC = makeSymbol("FUNCTION-EXTENT-FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym97$DO_FUNCTION_EXTENT_INDEX = makeSymbol("DO-FUNCTION-EXTENT-INDEX");
  public static final SubLList $list98 = list(list(makeSymbol("VAR"), makeSymbol("FUNCTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list99 = list(makeKeyword("DONE"));
  public static final SubLSymbol $sym100$TOU = makeUninternedSymbol("TOU");
  public static final SubLSymbol $sym101$GAF_ARG1 = makeSymbol("GAF-ARG1");
  public static final SubLList $list102 = list(TWO_INTEGER, ZERO_INTEGER);
  public static final SubLObject $const103$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLList $list104 = list(makeKeyword("FUNCTION-EXTENT"));
  public static final SubLList $list105 = list(list(makeSymbol("VAR"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list106 = list(makeKeyword("DIRECTION"), makeKeyword("DONE"));
  public static final SubLSymbol $sym107$DO_PREDICATE_RULE_INDEX = makeSymbol("DO-PREDICATE-RULE-INDEX");
  public static final SubLSymbol $kw108$SENSE = makeKeyword("SENSE");
  public static final SubLSymbol $kw109$POS = makeKeyword("POS");
  public static final SubLSymbol $kw110$NEG = makeKeyword("NEG");
  public static final SubLList $list111 = list(list(makeSymbol("VAR"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("SENSE"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list112 = list(makeKeyword("SENSE"), makeKeyword("DIRECTION"), makeKeyword("DONE"));
  public static final SubLSymbol $sym113$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym114$DO_PREDICATE_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-PREDICATE-RULE-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym115$NEW_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR");
  public static final SubLSymbol $sym116$PREDICATE_RULE_INDEX_ASENT_MATCH_P = makeSymbol("PREDICATE-RULE-INDEX-ASENT-MATCH-P");
  public static final SubLSymbol $sym117$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");
  public static final SubLSymbol $sym118$PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");
  public static final SubLSymbol $kw119$SENSE_KEYS_ARE_FRESH = makeKeyword("SENSE-KEYS-ARE-FRESH");
  public static final SubLSymbol $kw120$PREDICATE_RULE = makeKeyword("PREDICATE-RULE");
  public static final SubLString $str121$predicate_rule_iterator_quiescens = makeString("predicate-rule iterator quiescense failed with ~s");
  public static final SubLSymbol $kw122$MT_KEYS_ARE_FRESH = makeKeyword("MT-KEYS-ARE-FRESH");
  public static final SubLSymbol $sym123$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym124$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym125$NEW_DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR");
  public static final SubLSymbol $sym126$DO_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = makeSymbol("DO-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
  public static final SubLSymbol $sym127$DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_ASENT_MATCH_P = makeSymbol("DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-ASENT-MATCH-P");
  public static final SubLSymbol $sym128$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DON = makeSymbol("DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");
  public static final SubLSymbol $sym129$DECONTEXTUALIZED_IST_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEX = makeSymbol("DECONTEXTUALIZED-IST-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");
  public static final SubLSymbol $kw130$DECONTEXTUALIZED_IST_PREDICATE_RULE = makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
  public static final SubLString $str131$ist_predicate_rule_iterator_quies = makeString("ist-predicate-rule iterator quiescense failed with ~s");
  public static final SubLList $list132 = list(list(makeSymbol("VAR"), makeSymbol("COLLECTION"), makeSymbol("&KEY"), makeSymbol("SENSE"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym133$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym134$DO_ISA_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-ISA-RULE-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym135$NEW_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR");
  public static final SubLSymbol $sym136$DO_ISA_RULE_INDEX = makeSymbol("DO-ISA-RULE-INDEX");
  public static final SubLSymbol $sym137$ISA_RULE_INDEX_ASENT_MATCH_P = makeSymbol("ISA-RULE-INDEX-ASENT-MATCH-P");
  public static final SubLObject $const138$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $kw139$ISA_RULE = makeKeyword("ISA-RULE");
  public static final SubLSymbol $sym140$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");
  public static final SubLSymbol $sym141$PRED_ARG2_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("PRED-ARG2-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");
  public static final SubLSymbol $sym142$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym143$DO_QUOTED_ISA_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-QUOTED-ISA-RULE-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym144$NEW_QUOTED_ISA_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-QUOTED-ISA-RULE-FINAL-INDEX-SPEC-ITERATOR");
  public static final SubLSymbol $sym145$DO_QUOTED_ISA_RULE_INDEX = makeSymbol("DO-QUOTED-ISA-RULE-INDEX");
  public static final SubLSymbol $sym146$QUOTED_ISA_RULE_INDEX_ASENT_MATCH_P = makeSymbol("QUOTED-ISA-RULE-INDEX-ASENT-MATCH-P");
  public static final SubLObject $const147$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLSymbol $kw148$QUOTED_ISA_RULE = makeKeyword("QUOTED-ISA-RULE");
  public static final SubLSymbol $sym149$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym150$DO_GENLS_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-GENLS-RULE-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym151$NEW_GENLS_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-GENLS-RULE-FINAL-INDEX-SPEC-ITERATOR");
  public static final SubLSymbol $sym152$DO_GENLS_RULE_INDEX = makeSymbol("DO-GENLS-RULE-INDEX");
  public static final SubLSymbol $sym153$GENLS_RULE_INDEX_ASENT_MATCH_P = makeSymbol("GENLS-RULE-INDEX-ASENT-MATCH-P");
  public static final SubLObject $const154$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $kw155$GENLS_RULE = makeKeyword("GENLS-RULE");
  public static final SubLList $list156 = list(list(makeSymbol("VAR"), makeSymbol("GENL-MT"), makeSymbol("&KEY"), makeSymbol("SENSE"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym157$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym158$DO_GENL_MT_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-GENL-MT-RULE-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym159$NEW_GENL_MT_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-GENL-MT-RULE-FINAL-INDEX-SPEC-ITERATOR");
  public static final SubLSymbol $sym160$DO_GENL_MT_RULE_INDEX = makeSymbol("DO-GENL-MT-RULE-INDEX");
  public static final SubLSymbol $sym161$GENL_MT_RULE_INDEX_ASENT_MATCH_P = makeSymbol("GENL-MT-RULE-INDEX-ASENT-MATCH-P");
  public static final SubLObject $const162$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLSymbol $kw163$GENL_MT_RULE = makeKeyword("GENL-MT-RULE");
  public static final SubLString $str164$pred_arg2_rule_iterator_quiescens = makeString("pred-arg2-rule iterator quiescense failed with ~s");
  public static final SubLString $str165$unexpected_pred_in_pred_arg2_inde = makeString("unexpected pred in pred-arg2 indexing: ~s");
  public static final SubLList $list166 = list(list(makeSymbol("VAR"), makeSymbol("FUNCTION"), makeSymbol("&KEY"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym167$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym168$DO_FUNCTION_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-FUNCTION-RULE-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym169$NEW_FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR");
  public static final SubLSymbol $sym170$DO_FUNCTION_RULE_INDEX = makeSymbol("DO-FUNCTION-RULE-INDEX");
  public static final SubLSymbol $sym171$FUNCTION_RULE_INDEX_ASENT_MATCH_P = makeSymbol("FUNCTION-RULE-INDEX-ASENT-MATCH-P");
  public static final SubLSymbol $sym172$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");
  public static final SubLSymbol $sym173$FUNCTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("FUNCTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");
  public static final SubLSymbol $kw174$FUNCTION_RULE = makeKeyword("FUNCTION-RULE");
  public static final SubLString $str175$function_rule_iterator_quiescense = makeString("function-rule iterator quiescense failed with ~s");
  public static final SubLList $list176 = list(list(makeSymbol("VAR"), makeSymbol("RULE"), makeSymbol("&KEY"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym177$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym178$DO_EXCEPTION_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-EXCEPTION-RULE-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym179$NEW_EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR");
  public static final SubLSymbol $sym180$DO_EXCEPTION_RULE_INDEX = makeSymbol("DO-EXCEPTION-RULE-INDEX");
  public static final SubLSymbol $sym181$EXCEPTION_RULE_INDEX_ASENT_MATCH_P = makeSymbol("EXCEPTION-RULE-INDEX-ASENT-MATCH-P");
  public static final SubLSymbol $sym182$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");
  public static final SubLSymbol $sym183$EXCEPTION_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("EXCEPTION-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");
  public static final SubLSymbol $kw184$EXCEPTION_RULE = makeKeyword("EXCEPTION-RULE");
  public static final SubLString $str185$exception_rule_iterator_quiescens = makeString("exception-rule iterator quiescense failed with ~s");
  public static final SubLSymbol $sym186$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym187$DO_PRAGMA_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-PRAGMA-RULE-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym188$NEW_PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR");
  public static final SubLSymbol $sym189$DO_PRAGMA_RULE_INDEX = makeSymbol("DO-PRAGMA-RULE-INDEX");
  public static final SubLSymbol $sym190$PRAGMA_RULE_INDEX_ASENT_MATCH_P = makeSymbol("PRAGMA-RULE-INDEX-ASENT-MATCH-P");
  public static final SubLSymbol $sym191$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");
  public static final SubLSymbol $sym192$PRAGMA_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("PRAGMA-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");
  public static final SubLSymbol $kw193$PRAGMA_RULE = makeKeyword("PRAGMA-RULE");
  public static final SubLString $str194$pragma_rule_iterator_quiescense_f = makeString("pragma-rule iterator quiescense failed with ~s");
  public static final SubLList $list195 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("SENSE"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym196$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym197$DO_UNBOUND_PREDICATE_RULE_INDEX_KEY_VALIDATOR = makeSymbol("DO-UNBOUND-PREDICATE-RULE-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym198$NEW_UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR");
  public static final SubLSymbol $sym199$DO_UNBOUND_PREDICATE_RULE_INDEX = makeSymbol("DO-UNBOUND-PREDICATE-RULE-INDEX");
  public static final SubLSymbol $sym200$UNBOUND_PREDICATE_RULE_INDEX_ASENT_MATCH_P = makeSymbol("UNBOUND-PREDICATE-RULE-INDEX-ASENT-MATCH-P");
  public static final SubLSymbol $sym201$UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_DONE_ = makeSymbol("UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-DONE?");
  public static final SubLSymbol $sym202$UNBOUND_PREDICATE_RULE_FINAL_INDEX_SPEC_ITERATOR_NEXT = makeSymbol("UNBOUND-PREDICATE-RULE-FINAL-INDEX-SPEC-ITERATOR-NEXT");
  public static final SubLString $str203$unbound_predicate_rule_iterator_q = makeString("unbound-predicate-rule iterator quiescense failed with ~s");
  public static final SubLList $list204 = list(list(makeSymbol("VAR"), makeSymbol("MT"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list205 = list(makeKeyword("TYPE"), makeKeyword("TRUTH"), makeKeyword("DIRECTION"), makeKeyword("DONE"));
  public static final SubLSymbol $kw206$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $sym207$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym208$DO_MT_INDEX_KEY_VALIDATOR = makeSymbol("DO-MT-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym209$MT_FINAL_INDEX_SPEC = makeSymbol("MT-FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym210$DO_MT_INDEX = makeSymbol("DO-MT-INDEX");
  public static final SubLSymbol $sym211$MT_INDEX_ASSERTION_MATCH_P = makeSymbol("MT-INDEX-ASSERTION-MATCH-P");
  public static final SubLList $list212 = list(makeKeyword("IST"));
  public static final SubLList $list213 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym214$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym215$DO_OTHER_INDEX_KEY_VALIDATOR = makeSymbol("DO-OTHER-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym216$OTHER_FINAL_INDEX_SPEC = makeSymbol("OTHER-FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym217$DO_OTHER_INDEX_ASSERTION_MATCH_P = makeSymbol("DO-OTHER-INDEX-ASSERTION-MATCH-P");
  public static final SubLSymbol $sym218$DO_OTHER_INDEX = makeSymbol("DO-OTHER-INDEX");
  public static final SubLSymbol $sym219$OTHER_INDEX_ASSERTION_MATCH_P = makeSymbol("OTHER-INDEX-ASSERTION-MATCH-P");
  public static final SubLList $list220 = list(makeKeyword("OTHER"));
  public static final SubLSymbol $sym221$OTHER_FINAL_INDEX_SPEC_P = makeSymbol("OTHER-FINAL-INDEX-SPEC-P");
  public static final SubLSymbol $sym222$DO_TERM_INDEX = makeSymbol("DO-TERM-INDEX");
  public static final SubLSymbol $kw223$SIMPLE = makeKeyword("SIMPLE");
  public static final SubLSymbol $kw224$OTHER = makeKeyword("OTHER");
  public static final SubLSymbol $sym225$FINAL_INDEX_SPEC = makeUninternedSymbol("FINAL-INDEX-SPEC");
  public static final SubLSymbol $sym226$DO_TERM_INDEX_KEY_VALIDATOR = makeSymbol("DO-TERM-INDEX-KEY-VALIDATOR");
  public static final SubLSymbol $sym227$NEW_TERM_FINAL_INDEX_SPEC_ITERATOR = makeSymbol("NEW-TERM-FINAL-INDEX-SPEC-ITERATOR");
  public static final SubLSymbol $sym228$DO_TERM_INDEX_ASSERTION_MATCH_P = makeSymbol("DO-TERM-INDEX-ASSERTION-MATCH-P");
  public static final SubLString $str229$Iterate_over_all_assertions_index = makeString("Iterate over all assertions indexed from TERM executing BODY within the scope of VAR.\nVAR is bound to each assertion in the iteration such that:\nThe assertion is indexed from TERM.\nThe assertion is in a relevant microtheory (relevance is established outside).\nIf the assertion is a gaf, then its predicate is relevant (relevance is established outside).\nIf TYPE is non-nil, then assertion has TYPE as its type.\nIf TRUTH is non-nil, the assertion has TRUTH as its truth value.\nIf DIRECTION is non-nil, the assertion has DIRECTION as its direction.\nIteration is halted as soon as DONE becomes non-nil.\n@note VAR may be bound to the same assertion twice, if it exists in multiple indexing leaf sets.\nSee other indexing macros for examples of how this could happen.");
  public static final SubLList $list230 = list(list(makeSymbol("VAR"), makeSymbol("MT"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list231 = list(makeKeyword("TYPE"), makeKeyword("TRUTH"), makeKeyword("DONE"));
  public static final SubLSymbol $sym232$DO_BROAD_MT_INDEX_KEY_VALIDATOR = makeSymbol("DO-BROAD-MT-INDEX-KEY-VALIDATOR");
  public static final SubLString $str233$do_broad_mt_index = makeString("do-broad-mt-index");
  public static final SubLSymbol $sym234$DO_BROAD_MT_INDEX_MATCH_P = makeSymbol("DO-BROAD-MT-INDEX-MATCH-P");
  public static final SubLSymbol $sym235$DO_BROAD_MT_INDEX = makeSymbol("DO-BROAD-MT-INDEX");
  public static final SubLSymbol $sym236$PCASE = makeSymbol("PCASE");
  public static final SubLSymbol $sym237$DO_MT_CONTENTS_METHOD = makeSymbol("DO-MT-CONTENTS-METHOD");
  public static final SubLSymbol $kw238$MT = makeKeyword("MT");
  public static final SubLSymbol $kw239$BROAD_MT = makeKeyword("BROAD-MT");
  public static final SubLList $list240 = list(list(makeSymbol("OTHERWISE")));
  public static final SubLSymbol $sym241$DO_MT_CONTENTS = makeSymbol("DO-MT-CONTENTS");
  public static final SubLSymbol $sym242$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLList $list243 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("TERMS"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list244 = list(makeKeyword("TRUTH"), makeKeyword("DONE"));
  public static final SubLSymbol $sym245$GATHER_OVERLAP_INDEX = makeSymbol("GATHER-OVERLAP-INDEX");
  public static final SubLList $list246 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("ASENT"), makeSymbol("&KEY"), makeSymbol("METHODS"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list247 = list(makeKeyword("METHODS"), makeKeyword("TRUTH"), makeKeyword("DONE"));
  public static final SubLSymbol $kw248$METHODS = makeKeyword("METHODS");
  public static final SubLSymbol $sym249$DO_GAF_LOOKUP_INDEX = makeSymbol("DO-GAF-LOOKUP-INDEX");
  public static final SubLSymbol $sym250$BEST_GAF_LOOKUP_INDEX = makeSymbol("BEST-GAF-LOOKUP-INDEX");
  public static final SubLList $list251 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("LOOKUP-INDEX"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym252$L_INDEX = makeUninternedSymbol("L-INDEX");
  public static final SubLSymbol $sym253$METHOD = makeUninternedSymbol("METHOD");
  public static final SubLSymbol $sym254$DO_GLI_EXTRACT_METHOD = makeSymbol("DO-GLI-EXTRACT-METHOD");
  public static final SubLSymbol $sym255$DO_GLI_VIA_GAF_ARG = makeSymbol("DO-GLI-VIA-GAF-ARG");
  public static final SubLSymbol $sym256$DO_GLI_VIA_PREDICATE_EXTENT = makeSymbol("DO-GLI-VIA-PREDICATE-EXTENT");
  public static final SubLSymbol $kw257$OVERLAP = makeKeyword("OVERLAP");
  public static final SubLSymbol $sym258$DO_GLI_VIA_OVERLAP = makeSymbol("DO-GLI-VIA-OVERLAP");
  public static final SubLSymbol $sym259$OTHERWISE = makeSymbol("OTHERWISE");
  public static final SubLSymbol $sym260$DO_GLI_METHOD_ERROR = makeSymbol("DO-GLI-METHOD-ERROR");
  public static final SubLSymbol $kw261$INDEX_TYPE = makeKeyword("INDEX-TYPE");
  public static final SubLString $str262$Skip_iteration = makeString("Skip iteration");
  public static final SubLString $str263$Unsupported_method__S_in__S_in_DO = makeString("Unsupported method ~S in ~S in DO-GAF-LOOKUP-INDEX");
  public static final SubLSymbol $sym264$TERM = makeUninternedSymbol("TERM");
  public static final SubLSymbol $sym265$ARGNUM = makeUninternedSymbol("ARGNUM");
  public static final SubLSymbol $sym266$PREDICATE = makeUninternedSymbol("PREDICATE");
  public static final SubLSymbol $sym267$CMULTIPLE_VALUE_BIND = makeSymbol("CMULTIPLE-VALUE-BIND");
  public static final SubLSymbol $sym268$DO_GLI_VGA_EXTRACT_KEYS = makeSymbol("DO-GLI-VGA-EXTRACT-KEYS");
  public static final SubLSymbol $sym269$PIF = makeSymbol("PIF");
  public static final SubLSymbol $kw270$TERM = makeKeyword("TERM");
  public static final SubLSymbol $kw271$ARGNUM = makeKeyword("ARGNUM");
  public static final SubLSymbol $sym272$DO_GLI_VPE_EXTRACT_KEY = makeSymbol("DO-GLI-VPE-EXTRACT-KEY");
  public static final SubLSymbol $sym273$DO_OVERLAP_INDEX = makeSymbol("DO-OVERLAP-INDEX");
  public static final SubLSymbol $sym274$DO_GLI_VO_EXTRACT_KEY = makeSymbol("DO-GLI-VO-EXTRACT-KEY");
  public static final SubLSymbol $kw275$TERMS = makeKeyword("TERMS");
  public static final SubLList $list276 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("NART-HL-FORMULA"), makeSymbol("&KEY"), makeSymbol("METHODS"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list277 = list(makeKeyword("METHODS"), makeKeyword("DONE"));
  public static final SubLSymbol $sym278$DO_NAT_LOOKUP_INDEX = makeSymbol("DO-NAT-LOOKUP-INDEX");
  public static final SubLSymbol $sym279$BEST_NAT_LOOKUP_INDEX = makeSymbol("BEST-NAT-LOOKUP-INDEX");
  public static final SubLList $list280 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("LOOKUP-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym281$L_INDEX = makeUninternedSymbol("L-INDEX");
  public static final SubLSymbol $sym282$METHOD = makeUninternedSymbol("METHOD");
  public static final SubLSymbol $sym283$DO_NLI_EXTRACT_METHOD = makeSymbol("DO-NLI-EXTRACT-METHOD");
  public static final SubLSymbol $sym284$DO_NLI_VIA_NART_ARG = makeSymbol("DO-NLI-VIA-NART-ARG");
  public static final SubLSymbol $kw285$FUNCTION_EXTENT = makeKeyword("FUNCTION-EXTENT");
  public static final SubLSymbol $sym286$DO_NLI_VIA_FUNCTION_EXTENT = makeSymbol("DO-NLI-VIA-FUNCTION-EXTENT");
  public static final SubLSymbol $sym287$DO_NLI_VIA_OVERLAP = makeSymbol("DO-NLI-VIA-OVERLAP");
  public static final SubLSymbol $sym288$DO_NLI_METHOD_ERROR = makeSymbol("DO-NLI-METHOD-ERROR");
  public static final SubLString $str289$Unsupported_method__S_in__S_in_DO = makeString("Unsupported method ~S in ~S in DO-NAT-LOOKUP-INDEX");
  public static final SubLSymbol $sym290$TERM = makeUninternedSymbol("TERM");
  public static final SubLSymbol $sym291$ARGNUM = makeUninternedSymbol("ARGNUM");
  public static final SubLSymbol $sym292$FUNCTOR = makeUninternedSymbol("FUNCTOR");
  public static final SubLSymbol $sym293$DO_NLI_VNA_EXTRACT_KEYS = makeSymbol("DO-NLI-VNA-EXTRACT-KEYS");
  public static final SubLSymbol $kw294$FUNCTOR = makeKeyword("FUNCTOR");
  public static final SubLSymbol $sym295$DO_NLI_VFE_EXTRACT_KEY = makeSymbol("DO-NLI-VFE-EXTRACT-KEY");
  public static final SubLSymbol $sym296$DO_NLI_VO_EXTRACT_KEY = makeSymbol("DO-NLI-VO-EXTRACT-KEY");
  public static final SubLSymbol $sym297$ASSERTION_SEMANTICALLY_MATCHES_SIMPLE_FINAL_INDEX_SPEC_ = makeSymbol("ASSERTION-SEMANTICALLY-MATCHES-SIMPLE-FINAL-INDEX-SPEC?");
  public static final SubLSymbol $sym298$FINAL_INDEX_ITERATOR_FILTERED = makeSymbol("FINAL-INDEX-ITERATOR-FILTERED");
  public static final SubLSymbol $sym299$QUOTE = makeSymbol("QUOTE");
  public static final SubLList $list300 = listS(makeSymbol("SIMPLE"), makeSymbol("TERM"), makeSymbol("TYPE"), makeSymbol("REST"));
  public static final SubLString $str301$Unexpected_non_simple_index__s = makeString("Unexpected non-simple index ~s");
  public static final SubLList $list302 = list(makeSymbol("ARGNUM-SPEC"), makeSymbol("PRED-SPEC"), makeSymbol("MT-SPEC"));
  public static final SubLSymbol $kw303$NART = makeKeyword("NART");
  public static final SubLList $list304 = list(makeSymbol("ASSERTION-FUNC"));
  public static final SubLString $str305$unexpected_type__s_in_simple_fina = makeString("unexpected type ~s in simple final index spec ~s");
  public static final SubLList $list306 = cons(makeSymbol("TERM"), makeSymbol("KEYS"));
  public static final SubLSymbol $sym307$FINAL_INDEX_P = makeSymbol("FINAL-INDEX-P");
  public static final SubLSymbol $sym308$ASSERTION_MATCHES_TYPE_TRUTH_AND_DIRECTION_ = makeSymbol("ASSERTION-MATCHES-TYPE-TRUTH-AND-DIRECTION?");
  public static final SubLSymbol $sym309$SIMPLE_TERM_ASSERTION_LIST_FILTERED = makeSymbol("SIMPLE-TERM-ASSERTION-LIST-FILTERED");
  public static final SubLSymbol $sym310$_SIMPLE_TERM_ASSERTION_LIST_FILTERED_CACHING_STATE_ = makeSymbol("*SIMPLE-TERM-ASSERTION-LIST-FILTERED-CACHING-STATE*");
  public static final SubLInteger $int311$512 = makeInteger(512);
  public static final SubLSymbol $sym312$CLEAR_SIMPLE_TERM_ASSERTION_LIST_FILTERED = makeSymbol("CLEAR-SIMPLE-TERM-ASSERTION-LIST-FILTERED");
  public static final SubLSymbol $kw313$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLList $list314 = list(makeSymbol("ARGNUM-SPEC"), makeSymbol("PREDICATE-SPEC"), makeSymbol("MT-SPEC"));
  public static final SubLList $list315 = list(makeSymbol("N"), makeSymbol("M"));
  public static final SubLSymbol $sym316$EL_FORMULA_P = makeSymbol("EL-FORMULA-P");
  public static final SubLList $list317 = list(makeSymbol("ARGNUM-SPEC"), makeSymbol("FUNCTOR-SPEC"));
  public static final SubLList $list318 = list(makeSymbol("SENSE"), makeSymbol("ASENT-FUNC"));
  public static final SubLObject $const319$abnormal = constant_handles.reader_make_constant_shell(makeString("abnormal"));
  public static final SubLObject $const320$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell(makeString("meetsPragmaticRequirement"));
  public static final SubLObject $const321$ist = constant_handles.reader_make_constant_shell(makeString("ist"));

  //// Initializers

  public void declareFunctions() {
    declare_kb_mapping_macros_file();
  }

  public void initializeVariables() {
    init_kb_mapping_macros_file();
  }

  public void runTopLevelForms() {
    setup_kb_mapping_macros_file();
  }

}

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

package  com.cyc.cycjava_1.cycl.sbhl;

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
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.hash_table_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;

public  final class sbhl_marking_vars extends SubLTranslatedFile {

  //// Constructor

  private sbhl_marking_vars() {}
  public static final SubLFile me = new sbhl_marking_vars();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars";

  //// Definitions

  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 511) 
  public static SubLSymbol $debug_sbhl_marking_spacesP$ = null;

  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 570) 
  public static final SubLObject average_genl_cardinality(SubLObject module) {
    if ((module == UNPROVIDED)) {
      module = NIL;
    }
    return $int0$100;
  }

  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 758) 
  public static final SubLObject average_spec_cardinality(SubLObject module) {
    if ((module == UNPROVIDED)) {
      module = NIL;
    }
    return $int1$3000;
  }

  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 853) 
  public static final SubLObject get_sbhl_marking_space() {
    if ((NIL != resourcing_sbhl_marking_spaces_p())) {
      return get_sbhl_resourced_marking_space();
    } else {
      return instantiate_sbhl_marking_space();
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 1036) 
  public static final SubLObject free_sbhl_marking_space(SubLObject space) {
    if ((NIL != resourcing_sbhl_marking_spaces_p())) {
      update_sbhl_resourced_spaces(space);
    }
    return NIL;
  }

  /** Creates an sbhl-space-p */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 1186) 
  public static final SubLObject instantiate_sbhl_marking_space() {
    if ((NIL != sbhl_search_vars.sbhl_forward_search_p())) {
      return Hashtables.make_hash_table(average_genl_cardinality(UNPROVIDED), Symbols.symbol_function(EQUAL), UNPROVIDED);
    } else if ((NIL != sbhl_search_vars.sbhl_backward_search_p())) {
      return Hashtables.make_hash_table(average_spec_cardinality(UNPROVIDED), Symbols.symbol_function(EQUAL), UNPROVIDED);
    } else {
      return Hashtables.make_hash_table(average_genl_cardinality(UNPROVIDED), Symbols.symbol_function(EQUAL), UNPROVIDED);
    }
  }

  /** Flag parameter to determine whether to resource sbhl spaces */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 2168) 
  public static SubLSymbol $resourcing_sbhl_marking_spaces_p$ = null;

  /** The maximal number of spaces to resource. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 2318) 
  public static SubLSymbol $resourced_sbhl_marking_space_limit$ = null;

  /** The store of spaces that are being resourced. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 2428) 
  public static SubLSymbol $resourced_sbhl_marking_spaces$ = null;

  /** The default number of spaces to resource. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 2537) 
  private static SubLSymbol $default_resourced_sbhl_space_limit$ = null;

  /** Accessor. Determines whether to resource sbhl marking spaces. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 2641) 
  public static final SubLObject resourcing_sbhl_marking_spaces_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 3355) 
  public static final SubLObject determine_resource_limit(SubLObject resourcing_p, SubLObject num) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != resourcing_p)) {
        return Numbers.max($resourced_sbhl_marking_space_limit$.getDynamicValue(thread), num);
      }
      return num;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 3560) 
  public static final SubLObject possibly_new_marking_resource(SubLObject resourcing_p) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != resourcing_p)) {
        return $resourced_sbhl_marking_spaces$.getDynamicValue(thread);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 4185) 
  private static SubLSymbol $within_new_sbhl_marking_space_resource$ = null;

  /** Returns a resource of sbhl marking spaces. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 4254) 
  public static final SubLObject new_sbhl_marking_space_resource(SubLObject num) {
    if ((num == UNPROVIDED)) {
      num = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject default_num = ((NIL != num) ? ((SubLObject) num) : ZERO_INTEGER);
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = $within_new_sbhl_marking_space_resource$.currentBinding(thread);
          try {
            $within_new_sbhl_marking_space_resource$.bind(T, thread);
            {
              SubLObject i = NIL;
              for (i = ZERO_INTEGER; i.numL(default_num); i = Numbers.add(i, ONE_INTEGER)) {
                result = cons(instantiate_sbhl_marking_space(), result);
              }
            }
          } finally {
            $within_new_sbhl_marking_space_resource$.rebind(_prev_bind_0, thread);
          }
        }
        return Sequences.nreverse(result);
      }
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 5652) 
  public static final SubLObject determine_marking_space_limit(SubLObject marking_resource) {
    {
      SubLObject length = Sequences.length(marking_resource);
      if ((length == ZERO_INTEGER)) {
        return $default_resourced_sbhl_space_limit$.getGlobalValue();
      } else {
        return length;
      }
    }
  }

  /** Accessor. @return sbhl-space-p. Gets an available resourced sbhl-marking-space, if one exists.  If not, it creates one. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 5857) 
  public static final SubLObject get_sbhl_resourced_marking_space() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        result = $resourced_sbhl_marking_spaces$.getDynamicValue(thread).first();
        if ((NIL != result)) {
          if ((NIL != $debug_sbhl_marking_spacesP$.getDynamicValue(thread))) {
            if ((NIL == hash_table_utilities.hash_table_empty_p(result))) {
              Errors.warn($str30$Dirty_resourced_marking_space_bei, result);
            }
          }
          $resourced_sbhl_marking_spaces$.setDynamicValue($resourced_sbhl_marking_spaces$.getDynamicValue(thread).rest(), thread);
        } else {
          result = instantiate_sbhl_marking_space();
        }
        return result;
      }
    }
  }

  /** Modifier. pushes SPACE onto resourced spaces, unless they are over the limit. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 6407) 
  public static final SubLObject update_sbhl_resourced_spaces(SubLObject space) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != list_utilities.lengthGE($resourced_sbhl_marking_spaces$.getDynamicValue(thread), $resourced_sbhl_marking_space_limit$.getDynamicValue(thread), UNPROVIDED))) {
        if ((NIL != $debug_sbhl_marking_spacesP$.getDynamicValue(thread))) {
          Errors.warn($str31$Need_more_than_the_limit_of__A_ma, $resourced_sbhl_marking_space_limit$.getDynamicValue(thread));
        }
      } else {
        sbhl_marking_utilities.clear_sbhl_space(space);
        $resourced_sbhl_marking_spaces$.setDynamicValue(cons(space, $resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
      }
      return NIL;
    }
  }

  /** the current context for marking */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7169) 
  public static SubLSymbol $sbhl_space$ = null;

  /** the context used for gathering valid results in 3 part searches. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7273) 
  public static SubLSymbol $sbhl_gather_space$ = null;

  /** a context name used for marking disjoins */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7390) 
  public static SubLSymbol $sbhl_disjoins_space$ = null;

  /** a variable to use for sbhl spaces */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7485) 
  public static SubLSymbol $sbhl_space_0$ = null;

  /** a variable to use for sbhl spaces */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7566) 
  public static SubLSymbol $sbhl_space_1$ = null;

  /** a variable to use for sbhl spaces */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7646) 
  public static SubLSymbol $sbhl_space_2$ = null;

  /** a variable to use for sbhl spaces */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7726) 
  public static SubLSymbol $sbhl_space_3$ = null;

  /** a variable to use for sbhl spaces */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7806) 
  public static SubLSymbol $sbhl_space_4$ = null;

  /** a variable to use for sbhl spaces */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7886) 
  public static SubLSymbol $sbhl_space_5$ = null;

  /** Determine whether and where to get new spaces from. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 10483) 
  public static final SubLObject sbhl_new_space_source() {
    if ((NIL != sbhl_suspend_new_spacesP())) {
      return $kw53$OLD;
    } else if ((NIL != resourcing_sbhl_marking_spaces_p())) {
      return $kw54$RESOURCE;
    } else {
      return $kw55$NEW;
    }
  }

  /** Get a new SBHL marking space from SOURCE. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 10767) 
  public static final SubLObject sbhl_get_new_space(SubLObject source) {
    {
      SubLObject pcase_var = source;
      if (pcase_var.eql($kw54$RESOURCE)) {
        return get_sbhl_resourced_marking_space();
      } else {
        return instantiate_sbhl_marking_space();
      }
    }
  }

  /** Toggle variable to suspend creation of new spaces during search. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 12307) 
  public static SubLSymbol $sbhl_suspend_new_spacesP$ = null;

  /** Accessor. @return booleanp; whether to suspend creation of new spaces during search. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 12455) 
  public static final SubLObject sbhl_suspend_new_spacesP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_suspend_new_spacesP$.getDynamicValue(thread);
    }
  }

  /** The space var used when goal nodes are premarked. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 13044) 
  public static SubLSymbol $sbhl_goal_space$ = null;

  /** Accessor: @return sbhl-space-object-p; @see *sbhl-goal-space* */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 13159) 
  public static final SubLObject get_sbhl_goal_space() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_goal_space$.getDynamicValue(thread);
    }
  }

  /** The space used when we want independent searches to make cross references. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 13448) 
  public static SubLSymbol $sbhl_target_space$ = null;

  /** The space used when we want independent searches to make cross references. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 13593) 
  public static SubLSymbol $sbhl_target_gather_space$ = null;

  /** The space var used to indicate where the marking of result nodes occurs. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 15909) 
  public static SubLSymbol $sbhl_terminating_marking_space$ = null;

  /** Accessor: @return sbhl-space-object-p; @see *sbhl-goal-space* */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 16077) 
  public static final SubLObject get_sbhl_terminating_marking_space() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_terminating_marking_space$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 16641) 
  public static SubLSymbol $sbhl_apply_marking_space$ = null;

  /** The marking for nodes only accessed in predicate mode during search */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 16876) 
  public static SubLSymbol $sbhl_genl_preds_marking$ = null;

  /** The marking for nodes only accessed in argument-flipped mode during search */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 17125) 
  public static SubLSymbol $sbhl_genl_inverse_marking$ = null;

  /** The marking for nodes accessed in both predicate argument-flipped modes and during search */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 17271) 
  public static SubLSymbol $sbhl_genl_preds_and_genl_inverse_marking$ = null;

  /** The marking for nodes accessed in both predicate argument-flipped modes and during search */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 17459) 
  public static SubLSymbol $sbhl_genl_inverse_and_genl_preds_marking$ = null;

  /** Accessor: @return booleanp; whether MARKING indicates access only in predicate mode. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 17647) 
  public static final SubLObject genl_preds_marking_p(SubLObject marking) {
    return Equality.eq(marking, $sbhl_genl_preds_marking$.getGlobalValue());
  }

  /** Accessor: @return booleanp; whether MARKING indicates access only in argument-flipped mode. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 17835) 
  public static final SubLObject genl_inverse_marking_p(SubLObject marking) {
    return Equality.eq(marking, $sbhl_genl_inverse_marking$.getGlobalValue());
  }

  /** Accessor: @return booleanp; whether MARKING indicates access in both predicate and argument-flipped mode. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 18033) 
  public static final SubLObject genl_preds_and_genl_inverse_marking_p(SubLObject marking) {
    return makeBoolean(((marking == $sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())
          || (marking == $sbhl_genl_inverse_and_genl_preds_marking$.getGlobalValue())));
  }

  /** The current marking generation. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 18724) 
  public static SubLSymbol $sbhl_marking_generation$ = null;

  /** Toggle parameter for whether to suspend the creation of new search spaces during mapping. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 19397) 
  public static SubLSymbol $sbhl_suspend_new_spaces_during_mappingP$ = null;

  /** Accessor: @return booleanp; whether to suspend the creation of new search spaces during mapping. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 19633) 
  public static final SubLObject sbhl_suspend_new_spaces_during_mappingP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_suspend_new_spaces_during_mappingP$.getDynamicValue(thread);
    }
  }

  /** Space nameholder for marking during mapping */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 19847) 
  public static SubLSymbol $sbhl_mapping_marking_space$ = null;

  /** Space nameholder for marking during mapping */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 19952) 
  public static SubLSymbol $sbhl_mapping_gather_marking_space$ = null;

  /** Parameter determining whether a time search checks markings in target space (for searching marked nodes) */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 21837) 
  public static SubLSymbol $sbhl_temporality_search_checks_nodes_in_target_space_p$ = null;

  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 22618) 
  public static SubLSymbol $sbhl_table$ = null;

  /** The table var used when goal nodes are premarked. */
  @SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 24658) 
  public static SubLSymbol $sbhl_goal_table$ = null;

  public static final SubLObject declare_sbhl_marking_vars_file() {
    declareFunction(myName, "average_genl_cardinality", "AVERAGE-GENL-CARDINALITY", 0, 1, false);
    declareFunction(myName, "average_spec_cardinality", "AVERAGE-SPEC-CARDINALITY", 0, 1, false);
    declareFunction(myName, "get_sbhl_marking_space", "GET-SBHL-MARKING-SPACE", 0, 0, false);
    declareFunction(myName, "free_sbhl_marking_space", "FREE-SBHL-MARKING-SPACE", 1, 0, false);
    declareFunction(myName, "instantiate_sbhl_marking_space", "INSTANTIATE-SBHL-MARKING-SPACE", 0, 0, false);
    //declareMacro(myName, "instantiate_sbhl_marking_space_for", "INSTANTIATE-SBHL-MARKING-SPACE-FOR");
    declareFunction(myName, "resourcing_sbhl_marking_spaces_p", "RESOURCING-SBHL-MARKING-SPACES-P", 0, 0, false);
    //declareMacro(myName, "with_sbhl_resourced_marking_spaces", "WITH-SBHL-RESOURCED-MARKING-SPACES");
    declareFunction(myName, "determine_resource_limit", "DETERMINE-RESOURCE-LIMIT", 2, 0, false);
    declareFunction(myName, "possibly_new_marking_resource", "POSSIBLY-NEW-MARKING-RESOURCE", 1, 0, false);
    //declareMacro(myName, "without_sbhl_resourced_marking_spaces", "WITHOUT-SBHL-RESOURCED-MARKING-SPACES");
    //declareMacro(myName, "toggle_sbhl_resourced_marking_spaces", "TOGGLE-SBHL-RESOURCED-MARKING-SPACES");
    declareFunction(myName, "new_sbhl_marking_space_resource", "NEW-SBHL-MARKING-SPACE-RESOURCE", 0, 1, false);
    //declareFunction(myName, "current_sbhl_marking_space_resource", "CURRENT-SBHL-MARKING-SPACE-RESOURCE", 0, 0, false);
    //declareMacro(myName, "with_sbhl_marking_space_resource", "WITH-SBHL-MARKING-SPACE-RESOURCE");
    //declareMacro(myName, "with_new_sbhl_marking_space_resource", "WITH-NEW-SBHL-MARKING-SPACE-RESOURCE");
    declareFunction(myName, "determine_marking_space_limit", "DETERMINE-MARKING-SPACE-LIMIT", 1, 0, false);
    declareFunction(myName, "get_sbhl_resourced_marking_space", "GET-SBHL-RESOURCED-MARKING-SPACE", 0, 0, false);
    declareFunction(myName, "update_sbhl_resourced_spaces", "UPDATE-SBHL-RESOURCED-SPACES", 1, 0, false);
    //declareFunction(myName, "clear_recourced_sbhl_spaces", "CLEAR-RECOURCED-SBHL-SPACES", 0, 0, false);
    //declareFunction(myName, "sbhl_space_obect_p", "SBHL-SPACE-OBECT-P", 1, 0, false);
    //declareFunction(myName, "get_sbhl_space", "GET-SBHL-SPACE", 0, 0, false);
    //declareFunction(myName, "get_sbhl_gather_space", "GET-SBHL-GATHER-SPACE", 0, 0, false);
    //declareMacro(myName, "with_new_sbhl_space", "WITH-NEW-SBHL-SPACE");
    //declareMacro(myName, "with_new_sbhl_space_named", "WITH-NEW-SBHL-SPACE-NAMED");
    //declareMacro(myName, "with_new_sbhl_gather_space", "WITH-NEW-SBHL-GATHER-SPACE");
    //declareMacro(myName, "with_new_sbhl_spaces", "WITH-NEW-SBHL-SPACES");
    //declareMacro(myName, "with_new_sbhl_spaces_used_repeatedly", "WITH-NEW-SBHL-SPACES-USED-REPEATEDLY");
    //declareMacro(myName, "with_new_sbhl_space_used_repeatedly", "WITH-NEW-SBHL-SPACE-USED-REPEATEDLY");
    //declareMacro(myName, "possibly_with_new_sbhl_spaces", "POSSIBLY-WITH-NEW-SBHL-SPACES");
    //declareMacro(myName, "possibly_with_new_sbhl_space", "POSSIBLY-WITH-NEW-SBHL-SPACE");
    declareFunction(myName, "sbhl_new_space_source", "SBHL-NEW-SPACE-SOURCE", 0, 0, false);
    declareFunction(myName, "sbhl_get_new_space", "SBHL-GET-NEW-SPACE", 1, 0, false);
    //declareMacro(myName, "with_sbhl_space_var", "WITH-SBHL-SPACE-VAR");
    //declareMacro(myName, "with_sbhl_gather_space_var", "WITH-SBHL-GATHER-SPACE-VAR");
    //declareMacro(myName, "within_sbhl_space", "WITHIN-SBHL-SPACE");
    //declareMacro(myName, "within_sbhl_gather_space", "WITHIN-SBHL-GATHER-SPACE");
    //declareMacro(myName, "do_sbhl_space", "DO-SBHL-SPACE");
    //declareMacro(myName, "map_sbhl_space", "MAP-SBHL-SPACE");
    declareFunction(myName, "sbhl_suspend_new_spacesP", "SBHL-SUSPEND-NEW-SPACES?", 0, 0, false);
    //declareMacro(myName, "with_same_sbhl_spaces", "WITH-SAME-SBHL-SPACES");
    //declareMacro(myName, "without_suspending_new_sbhl_spaces", "WITHOUT-SUSPENDING-NEW-SBHL-SPACES");
    declareFunction(myName, "get_sbhl_goal_space", "GET-SBHL-GOAL-SPACE", 0, 0, false);
    //declareMacro(myName, "with_sbhl_goal_space", "WITH-SBHL-GOAL-SPACE");
    //declareMacro(myName, "with_sbhl_target_spaces", "WITH-SBHL-TARGET-SPACES");
    //declareMacro(myName, "with_new_sbhl_target_spaces", "WITH-NEW-SBHL-TARGET-SPACES");
    //declareMacro(myName, "with_new_sbhl_target_space", "WITH-NEW-SBHL-TARGET-SPACE");
    //declareMacro(myName, "with_new_sbhl_target_gather_space", "WITH-NEW-SBHL-TARGET-GATHER-SPACE");
    //declareMacro(myName, "within_sbhl_target_spaces", "WITHIN-SBHL-TARGET-SPACES");
    //declareMacro(myName, "within_sbhl_target_space", "WITHIN-SBHL-TARGET-SPACE");
    //declareMacro(myName, "within_new_sbhl_target_space", "WITHIN-NEW-SBHL-TARGET-SPACE");
    //declareMacro(myName, "with_sbhl_target_space_named", "WITH-SBHL-TARGET-SPACE-NAMED");
    //declareFunction(myName, "clear_sbhl_target_spaces", "CLEAR-SBHL-TARGET-SPACES", 0, 0, false);
    //declareFunction(myName, "clear_sbhl_target_space", "CLEAR-SBHL-TARGET-SPACE", 0, 0, false);
    declareFunction(myName, "get_sbhl_terminating_marking_space", "GET-SBHL-TERMINATING-MARKING-SPACE", 0, 0, false);
    //declareMacro(myName, "with_sbhl_terminating_space", "WITH-SBHL-TERMINATING-SPACE");
    //declareMacro(myName, "within_sbhl_terminating_marking_space", "WITHIN-SBHL-TERMINATING-MARKING-SPACE");
    //declareMacro(myName, "with_sbhl_apply_marking_space", "WITH-SBHL-APPLY-MARKING-SPACE");
    declareFunction(myName, "genl_preds_marking_p", "GENL-PREDS-MARKING-P", 1, 0, false);
    declareFunction(myName, "genl_inverse_marking_p", "GENL-INVERSE-MARKING-P", 1, 0, false);
    declareFunction(myName, "genl_preds_and_genl_inverse_marking_p", "GENL-PREDS-AND-GENL-INVERSE-MARKING-P", 1, 0, false);
    //declareFunction(myName, "genl_preds_opposite_marking", "GENL-PREDS-OPPOSITE-MARKING", 1, 0, false);
    //declareFunction(myName, "increment_sbhl_marking_generation", "INCREMENT-SBHL-MARKING-GENERATION", 0, 0, false);
    //declareFunction(myName, "get_sbhl_marking_generation", "GET-SBHL-MARKING-GENERATION", 0, 0, false);
    //declareMacro(myName, "with_new_sbhl_marking_generation", "WITH-NEW-SBHL-MARKING-GENERATION");
    declareFunction(myName, "sbhl_suspend_new_spaces_during_mappingP", "SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?", 0, 0, false);
    //declareMacro(myName, "with_sbhl_mapping_marking_space", "WITH-SBHL-MAPPING-MARKING-SPACE");
    //declareMacro(myName, "with_sbhl_mapping_gather_marking_space", "WITH-SBHL-MAPPING-GATHER-MARKING-SPACE");
    //declareMacro(myName, "within_sbhl_mapping_marking_spaces", "WITHIN-SBHL-MAPPING-MARKING-SPACES");
    //declareMacro(myName, "sbhl_mark_mapping_fn_in_new_target_spaces", "SBHL-MARK-MAPPING-FN-IN-NEW-TARGET-SPACES");
    //declareMacro(myName, "sbhl_mark_mapping_fn_within_space", "SBHL-MARK-MAPPING-FN-WITHIN-SPACE");
    //declareMacro(myName, "sbhl_mark_gather_mapping_fn_within_gather_space", "SBHL-MARK-GATHER-MAPPING-FN-WITHIN-GATHER-SPACE");
    //declareFunction(myName, "sbhl_temporality_search_checks_nodes_in_target_space_p", "SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P", 0, 0, false);
    //declareMacro(myName, "with_sbhl_temporality_search_checks_nodes_in_target_space", "WITH-SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE");
    //declareFunction(myName, "sbhl_table_p", "SBHL-TABLE-P", 1, 0, false);
    //declareMacro(myName, "with_new_sbhl_table", "WITH-NEW-SBHL-TABLE");
    //declareMacro(myName, "with_sbhl_table_var", "WITH-SBHL-TABLE-VAR");
    //declareMacro(myName, "with_new_sbhl_table_named", "WITH-NEW-SBHL-TABLE-NAMED");
    //declareMacro(myName, "within_sbhl_table", "WITHIN-SBHL-TABLE");
    //declareMacro(myName, "do_sbhl_table", "DO-SBHL-TABLE");
    //declareMacro(myName, "map_sbhl_table", "MAP-SBHL-TABLE");
    //declareMacro(myName, "mark_in_sbhl_table", "MARK-IN-SBHL-TABLE");
    //declareFunction(myName, "get_sbhl_goal_table", "GET-SBHL-GOAL-TABLE", 0, 0, false);
    //declareMacro(myName, "with_sbhl_goal_table", "WITH-SBHL-GOAL-TABLE");
    return NIL;
  }

  public static final SubLObject init_sbhl_marking_vars_file() {
    $debug_sbhl_marking_spacesP$ = defparameter("*DEBUG-SBHL-MARKING-SPACES?*", NIL);
    $resourcing_sbhl_marking_spaces_p$ = defparameter("*RESOURCING-SBHL-MARKING-SPACES-P*", NIL);
    $resourced_sbhl_marking_space_limit$ = defparameter("*RESOURCED-SBHL-MARKING-SPACE-LIMIT*", NIL);
    $resourced_sbhl_marking_spaces$ = defparameter("*RESOURCED-SBHL-MARKING-SPACES*", NIL);
    $default_resourced_sbhl_space_limit$ = deflexical("*DEFAULT-RESOURCED-SBHL-SPACE-LIMIT*", FOUR_INTEGER);
    $within_new_sbhl_marking_space_resource$ = defparameter("*WITHIN-NEW-SBHL-MARKING-SPACE-RESOURCE*", NIL);
    $sbhl_space$ = defparameter("*SBHL-SPACE*", NIL);
    $sbhl_gather_space$ = defparameter("*SBHL-GATHER-SPACE*", NIL);
    $sbhl_disjoins_space$ = defparameter("*SBHL-DISJOINS-SPACE*", NIL);
    $sbhl_space_0$ = defparameter("*SBHL-SPACE-0*", NIL);
    $sbhl_space_1$ = defparameter("*SBHL-SPACE-1*", NIL);
    $sbhl_space_2$ = defparameter("*SBHL-SPACE-2*", NIL);
    $sbhl_space_3$ = defparameter("*SBHL-SPACE-3*", NIL);
    $sbhl_space_4$ = defparameter("*SBHL-SPACE-4*", NIL);
    $sbhl_space_5$ = defparameter("*SBHL-SPACE-5*", NIL);
    $sbhl_suspend_new_spacesP$ = defparameter("*SBHL-SUSPEND-NEW-SPACES?*", NIL);
    $sbhl_goal_space$ = defparameter("*SBHL-GOAL-SPACE*", NIL);
    $sbhl_target_space$ = defparameter("*SBHL-TARGET-SPACE*", NIL);
    $sbhl_target_gather_space$ = defparameter("*SBHL-TARGET-GATHER-SPACE*", NIL);
    $sbhl_terminating_marking_space$ = defparameter("*SBHL-TERMINATING-MARKING-SPACE*", NIL);
    $sbhl_apply_marking_space$ = defparameter("*SBHL-APPLY-MARKING-SPACE*", NIL);
    $sbhl_genl_preds_marking$ = deflexical("*SBHL-GENL-PREDS-MARKING*", $list86);
    $sbhl_genl_inverse_marking$ = deflexical("*SBHL-GENL-INVERSE-MARKING*", $list87);
    $sbhl_genl_preds_and_genl_inverse_marking$ = deflexical("*SBHL-GENL-PREDS-AND-GENL-INVERSE-MARKING*", $list88);
    $sbhl_genl_inverse_and_genl_preds_marking$ = deflexical("*SBHL-GENL-INVERSE-AND-GENL-PREDS-MARKING*", $list89);
    $sbhl_marking_generation$ = defparameter("*SBHL-MARKING-GENERATION*", NIL);
    $sbhl_suspend_new_spaces_during_mappingP$ = defparameter("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*", NIL);
    $sbhl_mapping_marking_space$ = defparameter("*SBHL-MAPPING-MARKING-SPACE*", NIL);
    $sbhl_mapping_gather_marking_space$ = defparameter("*SBHL-MAPPING-GATHER-MARKING-SPACE*", NIL);
    $sbhl_temporality_search_checks_nodes_in_target_space_p$ = defparameter("*SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P*", NIL);
    $sbhl_table$ = defparameter("*SBHL-TABLE*", $str97$Table_used_for_public_marking_int);
    $sbhl_goal_table$ = defparameter("*SBHL-GOAL-TABLE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_sbhl_marking_vars_file() {
    // CVS_ID("Id: sbhl-marking-vars.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.register_macro_helper($sym10$DETERMINE_RESOURCE_LIMIT, $sym14$WITH_SBHL_RESOURCED_MARKING_SPACES);
    access_macros.register_macro_helper($sym12$POSSIBLY_NEW_MARKING_RESOURCE, $sym14$WITH_SBHL_RESOURCED_MARKING_SPACES);
    access_macros.register_macro_helper($sym29$DETERMINE_MARKING_SPACE_LIMIT, NIL);
    access_macros.register_macro_helper($sym43$POSSIBLY_WITH_NEW_SBHL_SPACE, $sym44$POSSIBLY_WITH_NEW_SBHL_SPACES);
    access_macros.register_macro_helper($sym52$SBHL_NEW_SPACE_SOURCE, $sym44$POSSIBLY_WITH_NEW_SBHL_SPACES);
    access_macros.register_macro_helper($sym48$SBHL_GET_NEW_SPACE, $sym44$POSSIBLY_WITH_NEW_SBHL_SPACES);
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$100 = makeInteger(100);
  public static final SubLInteger $int1$3000 = makeInteger(3000);
  public static final SubLList $list2 = list(makeSymbol("SPACE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym3$CLET = makeSymbol("CLET");
  public static final SubLList $list4 = list(list(makeSymbol("GET-SBHL-MARKING-SPACE")));
  public static final SubLSymbol $sym5$FREE_SBHL_MARKING_SPACE = makeSymbol("FREE-SBHL-MARKING-SPACE");
  public static final SubLList $list6 = list(makeSymbol("NUM"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym7$ALREADY_RESOURCING_P = makeUninternedSymbol("ALREADY-RESOURCING-P");
  public static final SubLList $list8 = list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"));
  public static final SubLSymbol $sym9$_RESOURCED_SBHL_MARKING_SPACE_LIMIT_ = makeSymbol("*RESOURCED-SBHL-MARKING-SPACE-LIMIT*");
  public static final SubLSymbol $sym10$DETERMINE_RESOURCE_LIMIT = makeSymbol("DETERMINE-RESOURCE-LIMIT");
  public static final SubLSymbol $sym11$_RESOURCED_SBHL_MARKING_SPACES_ = makeSymbol("*RESOURCED-SBHL-MARKING-SPACES*");
  public static final SubLSymbol $sym12$POSSIBLY_NEW_MARKING_RESOURCE = makeSymbol("POSSIBLY-NEW-MARKING-RESOURCE");
  public static final SubLList $list13 = list(list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), T));
  public static final SubLSymbol $sym14$WITH_SBHL_RESOURCED_MARKING_SPACES = makeSymbol("WITH-SBHL-RESOURCED-MARKING-SPACES");
  public static final SubLList $list15 = list(list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), NIL));
  public static final SubLList $list16 = list(makeSymbol("RESOURCING-P"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym17$_RESOURCING_SBHL_MARKING_SPACES_P_ = makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*");
  public static final SubLList $list18 = list(makeSymbol("SBHL-MS-RESOURCE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list19 = list(list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), T), list(makeSymbol("*RESOURCED-SBHL-MARKING-SPACE-LIMIT*"), list(makeSymbol("DETERMINE-MARKING-SPACE-LIMIT"), makeSymbol("*RESOURCED-SBHL-MARKING-SPACES*"))));
  public static final SubLSymbol $sym20$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list21 = list(makeSymbol("*RESOURCED-SBHL-MARKING-SPACES*"));
  public static final SubLList $list22 = list(list(makeSymbol("&KEY"), makeSymbol("NUM")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list23 = list(makeKeyword("NUM"));
  public static final SubLSymbol $kw24$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw25$NUM = makeKeyword("NUM");
  public static final SubLSymbol $sym26$SBHL_MS_RESOURCE = makeUninternedSymbol("SBHL-MS-RESOURCE");
  public static final SubLSymbol $sym27$NEW_SBHL_MARKING_SPACE_RESOURCE = makeSymbol("NEW-SBHL-MARKING-SPACE-RESOURCE");
  public static final SubLSymbol $sym28$WITH_SBHL_MARKING_SPACE_RESOURCE = makeSymbol("WITH-SBHL-MARKING-SPACE-RESOURCE");
  public static final SubLSymbol $sym29$DETERMINE_MARKING_SPACE_LIMIT = makeSymbol("DETERMINE-MARKING-SPACE-LIMIT");
  public static final SubLString $str30$Dirty_resourced_marking_space_bei = makeString("Dirty resourced marking space being reused ~A!");
  public static final SubLString $str31$Need_more_than_the_limit_of__A_ma = makeString("Need more than the limit of ~A marking spaces.");
  public static final SubLSymbol $sym32$INSTANTIATE_SBHL_MARKING_SPACE_FOR = makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE-FOR");
  public static final SubLSymbol $sym33$_SBHL_SPACE_ = makeSymbol("*SBHL-SPACE*");
  public static final SubLList $list34 = list(makeSymbol("NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym35$WITH_NEW_SBHL_SPACE = makeSymbol("WITH-NEW-SBHL-SPACE");
  public static final SubLSymbol $sym36$WITH_SBHL_SPACE_VAR = makeSymbol("WITH-SBHL-SPACE-VAR");
  public static final SubLSymbol $sym37$_SBHL_GATHER_SPACE_ = makeSymbol("*SBHL-GATHER-SPACE*");
  public static final SubLSymbol $sym38$WITH_NEW_SBHL_GATHER_SPACE = makeSymbol("WITH-NEW-SBHL-GATHER-SPACE");
  public static final SubLSymbol $sym39$WITH_NEW_SBHL_SPACES = makeSymbol("WITH-NEW-SBHL-SPACES");
  public static final SubLSymbol $sym40$WITH_SAME_SBHL_SPACES = makeSymbol("WITH-SAME-SBHL-SPACES");
  public static final SubLSymbol $sym41$SOURCE = makeUninternedSymbol("SOURCE");
  public static final SubLList $list42 = list(list(makeSymbol("SBHL-NEW-SPACE-SOURCE")));
  public static final SubLSymbol $sym43$POSSIBLY_WITH_NEW_SBHL_SPACE = makeSymbol("POSSIBLY-WITH-NEW-SBHL-SPACE");
  public static final SubLSymbol $sym44$POSSIBLY_WITH_NEW_SBHL_SPACES = makeSymbol("POSSIBLY-WITH-NEW-SBHL-SPACES");
  public static final SubLList $list45 = list(list(makeSymbol("SPACE"), makeSymbol("SOURCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym46$FIF = makeSymbol("FIF");
  public static final SubLList $list47 = list(makeKeyword("OLD"));
  public static final SubLSymbol $sym48$SBHL_GET_NEW_SPACE = makeSymbol("SBHL-GET-NEW-SPACE");
  public static final SubLSymbol $sym49$PWHEN = makeSymbol("PWHEN");
  public static final SubLList $list50 = list(makeKeyword("RESOURCE"));
  public static final SubLSymbol $sym51$UPDATE_SBHL_RESOURCED_SPACES = makeSymbol("UPDATE-SBHL-RESOURCED-SPACES");
  public static final SubLSymbol $sym52$SBHL_NEW_SPACE_SOURCE = makeSymbol("SBHL-NEW-SPACE-SOURCE");
  public static final SubLSymbol $kw53$OLD = makeKeyword("OLD");
  public static final SubLSymbol $kw54$RESOURCE = makeKeyword("RESOURCE");
  public static final SubLSymbol $kw55$NEW = makeKeyword("NEW");
  public static final SubLList $list56 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list57 = list(makeSymbol("*SBHL-SPACE*"));
  public static final SubLList $list58 = list(makeSymbol("*SBHL-GATHER-SPACE*"));
  public static final SubLList $list59 = list(list(makeSymbol("NODE-VAR"), makeSymbol("MARKING-VAR"), makeSymbol("SBHL-SPACE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym60$DO_HASH_TABLE = makeSymbol("DO-HASH-TABLE");
  public static final SubLSymbol $kw61$DONE = makeKeyword("DONE");
  public static final SubLList $list62 = list(makeSymbol("FUNCTION"), makeSymbol("SBHL-SPACE"));
  public static final SubLSymbol $sym63$NODE = makeUninternedSymbol("NODE");
  public static final SubLSymbol $sym64$TAG = makeUninternedSymbol("TAG");
  public static final SubLSymbol $sym65$PCOND = makeSymbol("PCOND");
  public static final SubLSymbol $sym66$HASH_TABLE_P = makeSymbol("HASH-TABLE-P");
  public static final SubLSymbol $sym67$CDOHASH = makeSymbol("CDOHASH");
  public static final SubLSymbol $sym68$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym69$FUNCALL = makeSymbol("FUNCALL");
  public static final SubLSymbol $sym70$SBHL_ERROR = makeSymbol("SBHL-ERROR");
  public static final SubLString $str71$no_mapping_method_defiend_for_sbh = makeString("no mapping method defiend for sbhl-space ~s");
  public static final SubLList $list72 = list(list(makeSymbol("*SBHL-SUSPEND-NEW-SPACES?*"), T));
  public static final SubLList $list73 = list(list(makeSymbol("*SBHL-SUSPEND-NEW-SPACES?*"), NIL));
  public static final SubLSymbol $sym74$_SBHL_GOAL_SPACE_ = makeSymbol("*SBHL-GOAL-SPACE*");
  public static final SubLSymbol $sym75$WITH_NEW_SBHL_TARGET_SPACES = makeSymbol("WITH-NEW-SBHL-TARGET-SPACES");
  public static final SubLList $list76 = list(list(makeSymbol("*SBHL-SPACE*"), makeSymbol("*SBHL-TARGET-SPACE*")), list(makeSymbol("*SBHL-GATHER-SPACE*"), makeSymbol("*SBHL-TARGET-GATHER-SPACE*")));
  public static final SubLSymbol $sym77$_SBHL_TARGET_SPACE_ = makeSymbol("*SBHL-TARGET-SPACE*");
  public static final SubLSymbol $sym78$_SBHL_TARGET_GATHER_SPACE_ = makeSymbol("*SBHL-TARGET-GATHER-SPACE*");
  public static final SubLList $list79 = list(list(makeSymbol("*SBHL-SPACE*"), makeSymbol("*SBHL-TARGET-SPACE*")));
  public static final SubLSymbol $sym80$WITH_NEW_SBHL_TARGET_SPACE = makeSymbol("WITH-NEW-SBHL-TARGET-SPACE");
  public static final SubLSymbol $sym81$WITHIN_SBHL_TARGET_SPACE = makeSymbol("WITHIN-SBHL-TARGET-SPACE");
  public static final SubLList $list82 = list(makeSymbol("SPACE-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym83$_SBHL_TERMINATING_MARKING_SPACE_ = makeSymbol("*SBHL-TERMINATING-MARKING-SPACE*");
  public static final SubLList $list84 = list(list(makeSymbol("*SBHL-SPACE*"), makeSymbol("*SBHL-TERMINATING-MARKING-SPACE*")));
  public static final SubLSymbol $sym85$_SBHL_APPLY_MARKING_SPACE_ = makeSymbol("*SBHL-APPLY-MARKING-SPACE*");
  public static final SubLList $list86 = list(constant_handles.reader_make_constant_shell(makeString("genlPreds")));
  public static final SubLList $list87 = list(constant_handles.reader_make_constant_shell(makeString("genlInverse")));
  public static final SubLList $list88 = list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), constant_handles.reader_make_constant_shell(makeString("genlInverse")));
  public static final SubLList $list89 = list(constant_handles.reader_make_constant_shell(makeString("genlInverse")), constant_handles.reader_make_constant_shell(makeString("genlPreds")));
  public static final SubLList $list90 = list(list(makeSymbol("*SBHL-MARKING-GENERATION*"), ZERO_INTEGER));
  public static final SubLSymbol $sym91$_SBHL_MAPPING_MARKING_SPACE_ = makeSymbol("*SBHL-MAPPING-MARKING-SPACE*");
  public static final SubLSymbol $sym92$_SBHL_MAPPING_GATHER_MARKING_SPACE_ = makeSymbol("*SBHL-MAPPING-GATHER-MARKING-SPACE*");
  public static final SubLList $list93 = list(list(makeSymbol("*SBHL-SPACE*"), makeSymbol("*SBHL-MAPPING-MARKING-SPACE*")), list(makeSymbol("*SBHL-GATHER-SPACE*"), makeSymbol("*SBHL-MAPPING-GATHER-MARKING-SPACE*")));
  public static final SubLList $list94 = list(list(makeSymbol("*SBHL-MAPPING-MARKING-SPACE*"), makeSymbol("*SBHL-TARGET-SPACE*")), list(makeSymbol("*SBHL-MAPPING-GATHER-MARKING-SPACE*"), makeSymbol("*SBHL-TARGET-GATHER-SPACE*")), list(makeSymbol("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*"), T));
  public static final SubLList $list95 = list(list(makeSymbol("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*"), T));
  public static final SubLList $list96 = list(list(makeSymbol("*SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P*"), T));
  public static final SubLString $str97$Table_used_for_public_marking_int = makeString("Table used for public marking interface");
  public static final SubLSymbol $sym98$_SBHL_TABLE_ = makeSymbol("*SBHL-TABLE*");
  public static final SubLList $list99 = list(makeSymbol("*SBHL-TABLE*"));
  public static final SubLSymbol $sym100$RESOURCING_P = makeUninternedSymbol("RESOURCING-P");
  public static final SubLList $list101 = list(list(makeSymbol("RESOURCING-SBHL-MARKING-SPACES-P")));
  public static final SubLSymbol $sym102$WITHOUT_SBHL_RESOURCED_MARKING_SPACES = makeSymbol("WITHOUT-SBHL-RESOURCED-MARKING-SPACES");
  public static final SubLSymbol $sym103$WITH_NEW_SBHL_TABLE = makeSymbol("WITH-NEW-SBHL-TABLE");
  public static final SubLSymbol $sym104$WITH_SBHL_TABLE_VAR = makeSymbol("WITH-SBHL-TABLE-VAR");
  public static final SubLSymbol $sym105$TOGGLE_SBHL_RESOURCED_MARKING_SPACES = makeSymbol("TOGGLE-SBHL-RESOURCED-MARKING-SPACES");
  public static final SubLList $list106 = list(list(makeSymbol("NODE-VAR"), makeSymbol("MARKING-VAR"), makeSymbol("SBHL-TABLE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list107 = list(makeSymbol("FUNCTION"), makeSymbol("SBHL-TABLE"));
  public static final SubLSymbol $sym108$NODE = makeUninternedSymbol("NODE");
  public static final SubLSymbol $sym109$TAG = makeUninternedSymbol("TAG");
  public static final SubLString $str110$no_mapping_method_defiend_for_sbh = makeString("no mapping method defiend for sbhl-table ~s");
  public static final SubLSymbol $sym111$WITHIN_SBHL_SPACE = makeSymbol("WITHIN-SBHL-SPACE");
  public static final SubLList $list112 = list(makeSymbol("TABLE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym113$_SBHL_GOAL_TABLE_ = makeSymbol("*SBHL-GOAL-TABLE*");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_marking_vars_file();
  }

  public void initializeVariables() {
    init_sbhl_marking_vars_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_marking_vars_file();
  }

}

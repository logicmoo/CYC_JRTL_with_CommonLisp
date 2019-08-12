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

package com.cyc.cycjava_1.cycl.sbhl;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.file_vector_utilities;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.map_utilities;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class sbhl_link_utilities extends SubLTranslatedFile {

  //// Constructor

  private sbhl_link_utilities() {}
  public static final SubLFile me = new sbhl_link_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_link_utilities";

  //// Definitions

  /** Accessor: determines if the tv-link in TV-LINKS associated with TV is empty */
  @SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 1256) 
  public static final SubLObject empty_tv_link_p(SubLObject tv, SubLObject tv_links) {
    return Types.sublisp_null(sbhl_links.get_sbhl_link_nodes(tv_links, tv));
  }

  /** Accessor: determines if all truth value fields of TV-LINK are NIL. */
  @SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 1862) 
  public static final SubLObject empty_tv_links_p(SubLObject tv_links) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = T;
        SubLObject not_emptyP = NIL;
        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
        while ((!(((NIL != not_emptyP)
              || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
          thread.resetMultipleValues();
          {
            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject links = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != links)) {
              not_emptyP = T;
              result = NIL;
            }
            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
          }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
      }
    }
  }

  /** Accessor: takes MT and MT-LINKS and determines if all tv-link substructures are empty. */
  @SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 2168) 
  public static final SubLObject empty_mt_link_p(SubLObject mt, SubLObject mt_links) {
    {
      SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
      if ((NIL != tv_links)) {
        return empty_tv_links_p(tv_links);
      } else {
        return T;
      }
    }
  }

  /** Accessor: determines if the MT-LINKS structure has completely empty substructures */
  @SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 2428) 
  public static final SubLObject empty_mt_links_p(SubLObject mt_links) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = T;
        SubLObject not_emptyP = NIL;
        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
        while ((!(((NIL != not_emptyP)
              || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
          thread.resetMultipleValues();
          {
            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject tv_links = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == empty_tv_links_p(tv_links))) {
              not_emptyP = T;
              result = NIL;
            }
            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
          }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
      }
    }
  }

  /** Accessor: takes direction-link D-LINK and determines if all substructures are empty. */
  @SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 2775) 
  public static final SubLObject empty_direction_link_p(SubLObject direction, SubLObject d_link) {
    {
      SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
      if ((NIL != mt_links)) {
        return empty_mt_links_p(mt_links);
      } else {
        return T;
      }
    }
  }

  /** Accessor: takes NODE and determines emptiness of the fields of the direction link that NODE and that MODULE / *sbhl-module* specify. */
  @SubL(source = "cycl/sbhl/sbhl-link-utilities.lisp", position = 3068) 
  public static final SubLObject empty_graph_link_p(SubLObject node, SubLObject module) {
    checkType(module, $sym1$SBHL_MODULE_P);
    {
      SubLObject result = T;
      SubLObject not_emptyP = NIL;
      SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
      if ((NIL != d_link)) {
        {
          SubLObject rest = NIL;
          for (rest = sbhl_module_utilities.get_relevant_sbhl_directions(module); (!(((NIL != not_emptyP)
                || (NIL == rest)))); rest = rest.rest()) {
            {
              SubLObject direction = rest.first();
              SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
              if ((NIL != mt_links)) {
                if ((NIL == empty_mt_links_p(mt_links))) {
                  not_emptyP = T;
                  result = NIL;
                }
              }
            }
          }
        }
      }
      return result;
    }
  }

  public static final SubLObject declare_sbhl_link_utilities_file() {
    //declareFunction(myName, "print_sbhl_direction_link", "PRINT-SBHL-DIRECTION-LINK", 2, 0, false);
    declareFunction(myName, "empty_tv_link_p", "EMPTY-TV-LINK-P", 2, 0, false);
    declareFunction(myName, "empty_tv_links_p", "EMPTY-TV-LINKS-P", 1, 0, false);
    declareFunction(myName, "empty_mt_link_p", "EMPTY-MT-LINK-P", 2, 0, false);
    declareFunction(myName, "empty_mt_links_p", "EMPTY-MT-LINKS-P", 1, 0, false);
    declareFunction(myName, "empty_direction_link_p", "EMPTY-DIRECTION-LINK-P", 2, 0, false);
    declareFunction(myName, "empty_graph_link_p", "EMPTY-GRAPH-LINK-P", 2, 0, false);
    //declareFunction(myName, "valid_sbhl_graph_link_p", "VALID-SBHL-GRAPH-LINK-P", 2, 0, false);
    //declareFunction(myName, "valid_sbhl_module_p", "VALID-SBHL-MODULE-P", 1, 0, false);
    //declareFunction(myName, "valid_sbhl_links_p", "VALID-SBHL-LINKS-P", 1, 0, false);
    //declareFunction(myName, "valid_sbhl_p", "VALID-SBHL-P", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_link_utilities_file() {
    return NIL;
  }

  public static final SubLObject setup_sbhl_link_utilities_file() {
        return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$Direction__a__Mt__a__Tv__a___a__ = makeString("Direction ~a, Mt ~a, Tv ~a: ~a~%");
  public static final SubLSymbol $sym1$SBHL_MODULE_P = makeSymbol("SBHL-MODULE-P");
  public static final SubLList $list2 = list(makeSymbol("NODE"), makeUninternedSymbol("IMPL-VALUE"));

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_link_utilities_file();
  }

  public void initializeVariables() {
    init_sbhl_link_utilities_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_link_utilities_file();
  }

}

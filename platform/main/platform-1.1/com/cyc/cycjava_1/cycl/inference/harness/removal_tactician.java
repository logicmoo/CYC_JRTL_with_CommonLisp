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

package com.cyc.cycjava_1.cycl.inference.harness;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.stacks;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class removal_tactician extends SubLTranslatedFile {

  //// Constructor

  private removal_tactician() {}
  public static final SubLFile me = new removal_tactician();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.removal_tactician";

  //// Definitions

  @SubL(source = "cycl/inference/harness/removal-tactician.lisp", position = 2891) 
  public static final SubLObject removal_strategy_initialize(SubLObject strategy) {
    {
      SubLObject removal_index = stacks.create_stack();
      SubLObject data = removal_tactician_datastructures.new_removal_strategy_data(removal_index);
      inference_datastructures_strategy.set_strategy_data(strategy, data);
    }
    return strategy;
  }

  public static final SubLObject declare_removal_tactician_file() {
    declareFunction(myName, "removal_strategy_p", "REMOVAL-STRATEGY-P", 1, 0, false);
    declareFunction(myName, "removal_strategy_initialize", "REMOVAL-STRATEGY-INITIALIZE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_tactician_file() {
    return NIL;
  }

  public static final SubLObject setup_removal_tactician_file() {
        inference_tactician.inference_strategy_type($kw0$REMOVAL, $list1);
    utilities_macros.note_funcall_helper_function($sym2$REMOVAL_STRATEGY_INITIALIZE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLList $list1 = list(new SubLObject[] {makeKeyword("NAME"), makeString("The REMOVAL Tactician"), makeKeyword("COMMENT"), makeString("The REMOVAL Tactician needs no introduction."), makeKeyword("CONSTRUCTOR"), makeSymbol("REMOVAL-STRATEGY-INITIALIZE"), makeKeyword("DONE?"), makeSymbol("REMOVAL-STRATEGY-DONE?"), makeKeyword("DO-ONE-STEP"), makeSymbol("REMOVAL-STRATEGY-DO-ONE-STEP"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("REMOVAL-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("SELECT-BEST-STRATEGEM"), makeSymbol("REMOVAL-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM"), makeKeyword("RECONSIDER-SET-ASIDES"), makeSymbol("REMOVAL-STRATEGY-RECONSIDER-SET-ASIDES"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("REMOVAL-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeKeyword("QUIESCE"), makeSymbol("REMOVAL-STRATEGY-QUIESCE"), makeKeyword("NEW-TACTIC"), makeSymbol("REMOVAL-STRATEGY-NOTE-NEW-TACTIC"), makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), makeSymbol("REMOVAL-STRATEGY-CATEGORIZE-STRATEGEMS"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("REMOVAL-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("REMOVAL-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("REMOVAL-STRATEGY-PROBLEM-PENDING?"), makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("IGNORE"), makeKeyword("MOTIVATE-STRATEGEM"), makeSymbol("REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("REMOVAL-STRATEGY-LINK-HEAD-MOTIVATED?"), makeKeyword("RECONSIDER-SPLIT-SET-ASIDES"), makeSymbol("REMOVAL-STRATEGY-POSSIBLY-RECONSIDER-SPLIT-SET-ASIDES")});
  public static final SubLSymbol $sym2$REMOVAL_STRATEGY_INITIALIZE = makeSymbol("REMOVAL-STRATEGY-INITIALIZE");

  //// Initializers

  public void declareFunctions() {
    declare_removal_tactician_file();
  }

  public void initializeVariables() {
    init_removal_tactician_file();
  }

  public void runTopLevelForms() {
    setup_removal_tactician_file();
  }

}

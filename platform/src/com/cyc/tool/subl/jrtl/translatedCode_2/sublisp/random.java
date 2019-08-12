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

package  com.cyc.tool.subl.jrtl.translatedCode_2.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import java.util.Random;

//// Internal Imports

//// External Imports

public  class random extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of random. */
  public random() {}
  public static final SubLFile me = new random();
  
  //// Public Area
  public static final SubLInteger RAND_MAX = SubLNumberFactory.makeInteger(Integer.MAX_VALUE);
  public static SubLSymbol $rand_max$;
  
  public static final SubLObject seed_random(SubLObject seed) {
    if (seed == UNPROVIDED) { seed = NIL; }
    if (seed == NIL)  {
      randomState.setSeed(Time.get_internal_real_time().longValue() % Long.MAX_VALUE);
    } else {
      randomState.setSeed(seed.longValue());
    }
    return seed;   
  }
  
  public static final SubLObject random(SubLObject limit) {
    int randomInt = randomState.nextInt(limit.intValue());
    return SubLNumberFactory.makeInteger(randomInt);
  }
  
  //// Initializers

  public void declareFunctions() {
   SubLFiles.declareFunction(me, "random",      "RANDOM",      1, 0, false);
   SubLFiles.declareFunction(me, "seed_random", "SEED-RANDOM", 0, 1, false);
  }

  public void initializeVariables() {
    $rand_max$  = SubLFiles.defconstant(me, "*RAND-MAX*",  RAND_MAX);
  }

  public void runTopLevelForms() {
    randomState.setSeed(System.currentTimeMillis());
  }
  
  //// Protected Area
  
  //// Private Area
  
  private static final Random randomState = new Random();
  
  //// Internal Rep
  
  //// Main
  
}

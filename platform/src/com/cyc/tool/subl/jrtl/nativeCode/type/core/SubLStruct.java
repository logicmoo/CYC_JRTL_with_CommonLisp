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

package  com.cyc.tool.subl.jrtl.nativeCode.type.core;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public  interface SubLStruct extends SubLObject {
  
  SubLObject getField(int fieldNum);
  
  void setField(int fieldNum, SubLObject value);
  
  SubLObject getField(SubLSymbol fieldNum);
  
  void setField(SubLSymbol fieldNum, SubLObject value);
  
  void clear();
  
  int getFieldCount();
  
  SubLSymbol getName();
  
  void setName(SubLSymbol name);
  
  SubLStructDecl getStructDecl();
  
  int id();
  
}

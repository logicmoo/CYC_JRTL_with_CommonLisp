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

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

//// Internal Imports
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;

//// External Imports
import java.util.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLBoolean;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;

public  final class FunctionArgListDescription implements CommonSymbols {
  
  //// Constructors
  
  /**
   * Creates a new instance of FunctionArgListDescription.
   */
  public FunctionArgListDescription(SubLObject args) {
    this(args, "");
  }
  
  /**
   * Creates a new instance of FunctionArgListDescription.
   */
  public FunctionArgListDescription(SubLObject args, String docString) {
    if (docString != null) {
      this.docString = docString;
    }
    parseFormalArgs(args);
  }
  
  //// Public Area
  
  public int getRequiredArgCount() {
    return args.size();
  }
  
  public int getOptionalArgCount() {
    return optionals.size();
  }
  
  public boolean allowsRest() {
    return (rest != null);
  }
  
  /* Returns a list of symbols */
  public List getRequiredVariableSymbols() {
    return args;
  }
  
  /* Returns a list of OptionalArgDescriptions */
  public List getOptionalVariableSymbols() {
    return optionals;
  }
  
  public SubLSymbol getRestSymbol() {
    return rest;
  }
  
  public static class OptionalArgDescription {
    
    public OptionalArgDescription(SubLObject desc) {
      if (desc.isSymbol()) {
        init(desc, NIL, NIL);
        return;
      }
      if (desc.isCons()) {
        SubLCons advancedDesc = desc.toCons();
        SubLObject name = NIL;
        SubLObject defaultValue = NIL;
        SubLObject wasSetArgName = NIL;
        if (advancedDesc.size() >= 1) {
          name = (SubLObject)advancedDesc.get(0);
        }
        if (advancedDesc.size() >= 2) {
          defaultValue = (SubLObject)advancedDesc.get(1);
        }
        if (advancedDesc.size() >= 3) {
          wasSetArgName = (SubLObject)advancedDesc.get(2);
        }
        if (advancedDesc.size() > 3) {
          Errors.error("Too many arguments for optional argument: " + advancedDesc);
        }
        init(name, defaultValue, wasSetArgName);
        return;
      }
      Errors.error("Got invalid type for optional argument: "
          + desc.toTypeName() + "\nValue: " + desc);
    }
    
    public void init(SubLObject argName, SubLObject defaultValue, SubLObject wasSetArgName) {
      if (!isAllowableArgSymbol(argName)) {
        Errors.error("Formal optional argument name expected type SYMBOL, got: " + argName.toTypeName());
      }
      if ((!isAllowableArgSymbol(wasSetArgName)) && (NIL != wasSetArgName)) {
        Errors.error("Formal optional argument name expected type SYMBOL, got: " + argName.toTypeName());
      }
      this.argName = (SubLSymbol)argName;
      this.wasSetArgName = (SubLSymbol)wasSetArgName;
      this.defaultValue = defaultValue;
    }
    
    public SubLSymbol getArgName() { return argName; }
    
    public SubLSymbol getWasSetArgName() { return wasSetArgName; }
    
    public SubLObject getDefaultValue() { return defaultValue; }
    
    private SubLSymbol argName;
    
    private SubLSymbol wasSetArgName;
    
    private SubLObject defaultValue;
  }
  
  public ArrayList expandArgBindings(Object[] actualArgs, SubLEnvironment newEnv) {
    Stack<Object> argsStack = new Stack<Object>();
    for (int i = actualArgs.length - 1; i >=  0; i--) { argsStack.push(actualArgs[i]); }
    ArrayList oldDynamicValues = null;
    expandRequired(argsStack, newEnv, oldDynamicValues);
    expandOptional(argsStack, newEnv, oldDynamicValues);
    expandRest(argsStack, newEnv, oldDynamicValues);
    if (!argsStack.isEmpty()) {
      throw new InvalidSubLExpressionException("Not enough arguments supplied to function.");
    }
    return oldDynamicValues;
  }
  
  //// Protected Area
  
  //// Private Area
  
  private ArrayList expandRequired(Stack argsStack, SubLEnvironment env, ArrayList oldDynamicValues) {
    for (Iterator iter = args.iterator(); iter.hasNext(); ) {
      if (argsStack.isEmpty()) {
        throw new InvalidSubLExpressionException("Function passed too few arguments.");
      }
      SubLSymbol requiredVariable = (SubLSymbol) iter.next();
      SubLObject actualArg = (SubLObject) argsStack.pop();
      SubLObject oldDynamicValue = env.noteBinding(requiredVariable, actualArg);
      oldDynamicValues = SubLSpecialOperatorDeclarations.
        possiblyNoteOldDynamicValue(requiredVariable, oldDynamicValue, oldDynamicValues);
    }
    return oldDynamicValues;
  }
  
  private ArrayList expandOptional(Stack argsStack, SubLEnvironment env, ArrayList oldDynamicValues) {
    OptionalArgDescription opd = null;
    boolean wasSet = false;
    for (Iterator iter = optionals.iterator(); iter.hasNext(); ) {
      opd = (OptionalArgDescription)iter.next();
      SubLSymbol optionalVariable = (SubLSymbol) opd.getArgName();
      SubLObject actualValue = null;
      if (argsStack.isEmpty()) {
        SubLObject optionalDefaultForm = opd.getDefaultValue();
        actualValue = optionalDefaultForm.eval(env);
        wasSet = false;
      } else {
        actualValue = (SubLObject) argsStack.pop();
        if (actualValue == UNPROVIDED) {
          SubLObject optionalDefaultForm = opd.getDefaultValue();
          actualValue = optionalDefaultForm.eval(env);
          wasSet = false;
        } else {
          wasSet = true;
        }
      }
      SubLObject oldDynamicValue = env.noteBinding(optionalVariable, actualValue);
      oldDynamicValues = SubLSpecialOperatorDeclarations.
        possiblyNoteOldDynamicValue(optionalVariable, oldDynamicValue, oldDynamicValues);
      SubLSymbol providedVariable = opd.getWasSetArgName();
      if (providedVariable != NIL) {
        oldDynamicValue = env.noteBinding(providedVariable, SubLObjectFactory.makeBoolean(wasSet));
        oldDynamicValues = SubLSpecialOperatorDeclarations.
          possiblyNoteOldDynamicValue(providedVariable, oldDynamicValue, oldDynamicValues);
      }
    }
    return oldDynamicValues;
  }
  
  private ArrayList expandRest(Stack argsStack, SubLEnvironment env, ArrayList oldDynamicValues) {
    if (!allowsRest()) { return oldDynamicValues; }
    SubLObject[] actualRestArgs = (SubLObject[]) argsStack.pop();
    int size = actualRestArgs.length;
    SubLList restList = SubLNil.NIL;  
    for (int i = size -1; i >= 0; i-- ) { 
      SubLObject actualArg = actualRestArgs[i];
      restList = restList.push(actualArg);      // @note try to get rid of consing here
    }
    SubLObject oldDynamicValue = env.noteBinding(rest, restList);
    oldDynamicValues = SubLSpecialOperatorDeclarations.
      possiblyNoteOldDynamicValue(rest, oldDynamicValue, oldDynamicValues);
    return oldDynamicValues;
  }
  
  private void parseFormalArgs(SubLObject args) {
    if (!args.isList()) {
      Errors.error("Invalid formal argument list type.\n"
          + "Wanted type " + AbstractSubLList.LIST_TYPE_NAME + " got type: " + args.toTypeName()
          + "\nValue: " + args);
    }
    if (args == NIL) { return; }
    SubLObject[] argArray = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      argArray = resourcer.acquireSubLObjectArray(args.toList());
      int i = 0, size = argArray.length, curArg = 0;
      while ((i < size) && isAllowableArgSymbol(argArray[i])) {
        addRequiredArg(argArray[curArg = i++]);
      }
      if ((i < size) && isOptionalSymbol(argArray[i])) {
        curArg = i++;
        if ((i < size) && isOptionalDeclaration(argArray[i])) {
          OptionalArgDescription optionDesc = new OptionalArgDescription(argArray[curArg = i++]);
          addOptionalArg(optionDesc);
        } else {
          Errors.error("&OPTIONAL present but no optional arguments given.\nValue: " + args);
        }
        while ((i < size) && isOptionalDeclaration(argArray[i])) {
          OptionalArgDescription optionDesc = new OptionalArgDescription(argArray[curArg = i++]);
          addOptionalArg(optionDesc);
        }
      }
      if ((i < size) && isRestSymbol(argArray[i])) {
        curArg = i++;
        if ((i < size) && isAllowableArgSymbol(argArray[i])) {
          setRestSymbol(argArray[curArg = i++]);
        } else {
          Errors.error("&REST present but no variable given.\nValue: " + args);
        }
      }
      if (curArg == (size - 1)) { return; }
      Errors.error("Invalid formal argument list: " + args);
    } finally {
      resourcer.releaseSubLObjectArray(argArray);
    }
  }
  
  private static boolean isRestSymbol(SubLObject obj) {
    return obj == CommonSymbols.REST_SYMBOL;
  }
  
  private static boolean isOptionalSymbol(SubLObject obj) {
    return obj == CommonSymbols.OPTIONAL_SYMBOL;
  }
  
  private static boolean isOptionalDeclaration(SubLObject obj) {
    return (isAllowableArgSymbol(obj) || (obj.isCons()));
  }
  
  private static boolean isAllowableArgSymbol(SubLObject obj) {
    if (!obj.isSymbol()) { return false; }
    if (isOptionalSymbol(obj)) { return false; }
    if (isRestSymbol(obj)) { return false; }
    if (obj.isBoolean()) { return false; }
    if (obj.isKeyword()) { return false; }
    return true;
  }
  
  private static boolean isBody(SubLObject obj) {
    return true;
  }
  
  private void addRequiredArg(SubLObject symbol) {
    if (!isAllowableArgSymbol(symbol)) {
      Errors.error("Formal required argument name expected type SYMBOL, got: " + symbol.getClass());
    }
    args.add(symbol.toSymbol());
  }
  
  private void addOptionalArg(OptionalArgDescription desc) {
    optionals.add(desc);
  }
  
  private void setRestSymbol(SubLObject symbol) {
    if (!isAllowableArgSymbol(symbol)) {
      Errors.error("Formal rest argument name expected type SYMBOL, got: " + symbol.getClass());
    }
    rest = (SubLSymbol)symbol;
  }
  
  private String expandRequired(Stack argsStack) {
    StringBuilder buf = new StringBuilder();
    for (Iterator iter = args.iterator(); iter.hasNext(); ) {
      if (argsStack.isEmpty()) {
        throw new InvalidSubLExpressionException("Function passed too few arguments.");
      }
      buf.append("(").append(SubLString.convertSubLStringToJavaString("" + iter.next())).
          append(" ").append(SubLString.convertSubLStringToJavaString("" + argsStack.pop())).append(") ");
    }
    return buf.toString();
  }
  
  private String expandOptional(Stack argsStack) {
    StringBuilder buf = new StringBuilder();
    OptionalArgDescription opd = null;
    boolean wasSet = false;
    for (Iterator iter = optionals.iterator(); iter.hasNext(); ) {
      opd = (OptionalArgDescription)iter.next();
      buf.append("(").append(SubLString.convertSubLStringToJavaString("" + opd.getArgName())).append(" ");
      if (argsStack.isEmpty()) {
        buf.append(SubLString.convertSubLStringToJavaString("" + opd.getDefaultValue()));
        wasSet = false;
      } else {
        buf.append(SubLString.convertSubLStringToJavaString("" + argsStack.pop()));
        wasSet = true;
      }
      buf.append(") ");
      if (opd.getWasSetArgName() != NIL) {
        buf.append("(").append(SubLString.convertSubLStringToJavaString("" + opd.getWasSetArgName())).append(" ");
        buf.append(wasSet ? (SubLBoolean)T : (SubLBoolean)NIL).append(") ");
      }
    }
    return buf.toString();
  }
  
  private String expandRest(Stack argsStack) {
    if (!allowsRest()) { return ""; }
    StringBuilder buf = new StringBuilder();
    Object val = NIL;
    if (!argsStack.isEmpty()) {
      StringBuilder restBuf = new StringBuilder("'(");
      val = restBuf;
      while(!argsStack.isEmpty()) {
        restBuf.append(SubLString.convertSubLStringToJavaString("" + argsStack.pop())).append(" ");
      }
      restBuf.append(")");
    }
    buf.append("(").append(SubLString.convertSubLStringToJavaString("" + rest)).append(" ").append(val).append(") ");
    return buf.toString();
  }
  
  //// Internal Rep
  
  private List<SubLSymbol> args = new ArrayList<SubLSymbol>();
  private List<OptionalArgDescription> optionals = new ArrayList<OptionalArgDescription>();
  private SubLSymbol rest = null;
  private String docString = "";
  
  //// Main
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  }
  
}

/* $Id: SubLSymbolKeyword.java 2061 2008-04-18 16:02:57Z tbrussea $
 *
 * Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */

package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.armedbear.lisp.Java;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.util.SubLFiles.*;

///import dmiles.TranStruct;
//import dmiles.JavaAlienMethods;

//// External Imports

/**
 * <P>SubLSymbolField is designed to wrap a java Field
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 *
 * @author tbrussea
 * @version $Id: SubLSymbolKeyword.java 2061 2008-04-18 16:02:57Z tbrussea $
 * @date December 10, 2005, 7:28 PM
 */
public final class SubLSymbolField extends Symbol implements SubLSymbol {

  /* (non-Javadoc)
   * @see dmiles.JavaAlien.IJavaAlien#javaInstance()
   */
  @Override
  public Object javaInstance() {
    return field;
  }

  //// Constructors
  Field field;
  Class type;
 public Object obj;
  /** Creates a new instance of SubLSymbol.
   * symbolName must already be canonicalized before calling this constructor
   * SubLPackage are allowed to use this constructor.
   */
  public SubLSymbolField(SubLString symbolName,Field f,Object o) {
    super(symbolName, SubLPackage.getCurrentPackage());
    field = f;
    f.setAccessible(true);
    type = f.getType();
    obj = o;
    //this.setProperty(, symbolName);
  }
//
//  /** Creates a new instance of SubLSymbol.
//   * symbolName must already be canonicalized before calling this constructor
//   * SubLPackage are allowed to use this constructor.
//   */
//  SubLSymbolKeyword(String symbolName) {
//    super(SubLObjectFactory.makeString(symbolName), SubLPackage.KEYWORD_PACKAGE);
//  }
//
  //// Public Area

  /** Method created to avoid casting */
  public final SubLSymbol toSymbol() {
    return this;
  }

  public final int getBindingId() {
    return INVALID_BINDING_INDEX;
  }

  public SubLObject getValue() {
    try {
      return org.armedbear.lisp.JavaObject.getInstance(field.get(obj),type);
    } catch (IllegalArgumentException e) {
      Errors.error("getValue"+field,e);
    } catch (IllegalAccessException e) {
      Errors.error("getValue"+field,e);
    }
    return this;
  }

  public void setValue(SubLObject value) {
    try {
        field.set(obj,((LispObject)value).javaInstance(type));
    } catch (IllegalArgumentException e) {
      Errors.error("setValue"+field,e);
    } catch (IllegalAccessException e) {
      Errors.error("setValue"+field,e);
    }
  }

  public final SubLObject getDynamicValue(SubLObject[] bindings) {
    return getValue();
  }

  public final void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
    Errors.error("Can't change the value of field-as-symbol: " + this);
  }

  public final SubLObject getDynamicValue(SubLThread thread) {
    return getValue();// Errors.error(this + " is not boundp.");
  }

  public final void setDynamicValue(SubLObject newValue, SubLThread thread) {
    Errors.error("Can't change the value of field-as-symbol symbol: " + this);
  }

  public SubLObject getDynamicValue() {
  //  Errors.error(this + " is not boundp.");
    return getValue();
  }

  public void setDynamicValue(SubLObject value) {
    Errors.error("Can't change the value of field-as-symbol symbol: " + this);
  }

  public SubLObject getGlobalValue() {
   // Errors.error(this + " is not boundp.");
    return getValue();
  }

  public void setGlobalValue(SubLObject value) {
    //Errors.error("Can't change the value of field-as-symbol symbol: " + this);
    setValue(value);
  }

  public final SubLObject currentBinding(SubLObject[] bindings) {
    if (true)  return getValue();
    return Errors.error("field-as-symbol: " + this + " does not have a dynamic binding.");
  }

  public final void bind(SubLObject newValue, SubLObject[] bindings) {
    Errors.error("field-as-symbol: " + this + " cannot be dynamically bound.");
    setValue(newValue);
  }

  public final void rebind(SubLObject oldValue, SubLObject[] bindings) {
    Errors.error("field-as-symbol: " + this + " cannot be dynamically rebound.");
    setValue(oldValue);
  }

  public final SubLObject currentBinding(SubLThread thread) {
    Errors.warn("field-as-symbol: " + this + " does not have a dynamic binding.");
    return getValue();
  }

  public final void bind(SubLObject newValue, SubLThread thread) {
    Errors.warn("field-as-symbol: " + this + " cannot be dynamically bound.");
    setValue(newValue);
  }

  public final void rebind(SubLObject oldValue, SubLThread thread) {
    Errors.warn("field-as-symbol: " + this + " cannot be dynamically rebound.");
    setValue(oldValue);
  }

  public boolean isDynamic() {
    return false;
  }

  public boolean isGlobal() {
    return true;
  }

  public boolean isUndeclared() {
    return false;
  }

  public final boolean isConstantSymbol() {
    return  Modifier.isFinal(field.getModifiers());
  }

  public SubLObject eval(SubLEnvironment env)
  throws InvalidSubLExpressionException {
    return getValue();
  }

  public static String SYMBOL_TYPE_NAME = "SYMBOL";

  public String toTypeName() {
    return SYMBOL_TYPE_NAME;
  }

  public void forceGlobalValue(SubLObject newValue) {
   // throw new SubLException("Cannot set the value of keyword: " + this + ".");
    setValue(newValue);
  }

  public void setAccessMode(VariableAccessMode accessMode) {}

  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return true; }
 // public final boolean isKeyword() { return false; }
  public final boolean isAtom() { return true; }
  public final boolean isCons() { return false; }
  public final boolean isList() { return false; }
  public final boolean isSequence() { return false; }
  public final boolean isNumber() { return false; }
  public final boolean isFixnum() { return false; }
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return false; }
  public final boolean isDouble() { return false; }
  public final boolean isChar() { return false; }
  public final boolean isString() { return false; }
  public final boolean isVector() { return false; }
  public final boolean isFunction() { return false; }
  public final boolean isFunctionSpec() { return false; }
  public final boolean isMacroOperator() { return false; }
  public final boolean isHashtable() { return false; }
  public final boolean isProcess() { return false; }
  public final boolean isLock() { return false; }
  public final boolean isReadWriteLock() { return false; }
  public final boolean isStructure() { return false; }
  public final boolean isStream() { return false; }
  public final boolean isPackage() { return false; }
  public final boolean isError() { return false; }
  public final boolean isGuid() { return false; }
  public final boolean isSemaphore() { return false; }
  public final boolean isEnvironment() { return false; }
  public final boolean isHashtableIterator() { return false; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }

  //// Protected Area

  //// Private Area

  //// Internal Rep

}
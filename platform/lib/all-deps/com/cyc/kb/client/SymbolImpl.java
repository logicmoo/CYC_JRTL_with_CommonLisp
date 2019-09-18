/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.kb.client;

/*
 * #%L
 * KBAPI
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import com.cyc.base.cycobject.CycObject;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.kb.Symbol;
import com.cyc.kb.exception.KBTypeException;



/**
 * A <code>Symbol</code> object is a facade for a quoted instance of
 * <code>#$CycLSubLSymbol</code> in Cyc KB.
 * 
 * This class of objects are used in construction of sentences with replacement
 * arguments, for example in stored queries for testing. The usage of this is 
 * rare, but the API supports for completeness. 
 * 
 * @author Vijay Raj
 * @version $Id: SymbolImpl.java 151340 2014-05-19 15:55:29Z vijay $  
 */
  // @todo DaveS review documentation
public class SymbolImpl extends StandardKBObject implements Symbol {

  /**
   * Not part of the KB API. This default constructor only has the effect of
   * ensuring that there is access to a Cyc server.
   */
  SymbolImpl() {
    super();
  }

  /**
   * An implementation-dependent constructor. Symbol does not have factory
   * methods in the current version of the API
   * <p>
   *
   * @param cycObject the CycObject wrapped by <code>Symbol</code>. The constructor
   * verifies that the CycObject is an instance of CycSymbol
   * 
   * @throws KBTypeException if it is not an instance of CycSymbol
   */
  @Deprecated
  public SymbolImpl(CycObject cycObject) throws KBTypeException {
    super(cycObject);
  }

  /**
   * Creates an instance of #$CycLSubLSymbol represented
   * by symStr in the underlying KB
   * <p>
   *
   * @param symStr  the string representing an #$CycLSubLSymbol in the KB
   *  
   * @throws KBTypeException Symbols are created on demand and are not expected to throw
   * any exception 
   */
  // TODO: verify what kind of exception is thrown for invalid name
  public SymbolImpl(String symStr) throws KBTypeException {
    super(new CycSymbol(symStr));
  }

  /**
   * This is not part of the KB API. Check that the candidate core
   * object is a valid CycSymbol.
   * 
   * Example: ":PERSON" 
   * 
   * @see {@link StandardKBObject#isValidCore(CycObject)} for more comments
   */
  @Override
  protected boolean isValidCore(CycObject tempCore) {
    if (tempCore instanceof CycSymbol) {
      return true;
    } else {
      return false;
    }
  }
    
  /**
   * Get the string representation of the KB type that this class corresponds
   * to.
   *
   * @return "#$CycLSubLSymbol"
   */
  @Override
  protected String getTypeString() {
    return "#$CycLSubLSymbol";
  }
}

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
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.kb.Variable;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBTypeException;



/**
 * A <code>Variable</code> object is a facade for a <code>#$CycLVariable</code>
 * in Cyc KB.
 * 
 * A character strings starting with a ? followed by one or more alpha numeric 
 * characters. This is used to represent a variable in a sentence. 
 * 
 * @author Vijay Raj
 * @version $Id: VariableImpl.java 151340 2014-05-19 15:55:29Z vijay $
 */
// @todo DaveS review documentation
public class VariableImpl extends StandardKBObject implements Variable {

  /**
   * Not part of the KB API. This default constructor only has the effect of
   * ensuring that there is access to a Cyc server.
   */
  VariableImpl() {
    super();
  }

  /**
   * An implementation-dependent constructor. Variable does not have factory
   * methods in the current version of the API
   * <p>
   *
   * @param cycObject the CycObject wrapped by <code>Variable</code>. The constructor
   * verifies that the CycObject is an instance of CycVariable
   * 
   * @throws KBTypeException if it is not an instance of CycVariable
   */
  @Deprecated
  public VariableImpl(CycObject cycVar) throws KBTypeException {
    super(cycVar);
  }

  /**
   * Creates an instance of #$CycLVariable represented
   * by varStr in the underlying KB
   * <p>
   *
   * @param varStr  the string representing an #$CycLVariable in the KB
   * 
   * @throws KBTypeException if the term represented by varStr is not an instance
   * of #$CycLVariable and cannot be made into one. 
   *  
   * Symbols are created on demand and are not expected to throw
   * any exception 
   */
  // TODO: verify what kind of exception is thrown for invalid name
  public VariableImpl(String varStr) throws KBApiException {
    super(CycObjectFactory.makeCycVariable(varStr));
  }

  /**
   * This is not part of the KB API. Check that the candidate core
   * object is a valid CycVariable.
   * 
   * @see {@link StandardKBObject#isValidCore(CycObject)} for more comments
   * 
   * Example: "?X", "??PER"
   */
  @Override
  protected boolean isValidCore(CycObject cycObject) {
    if (cycObject instanceof CycVariableI) {
      return true;
    } else {
      return false;
    }
  }
    
  /**
   * Get the string representation of the KB type that this class corresponds
   * to.
   *
   * @return "#$CycLVariable"
   */
  @Override
  protected String getTypeString() {
    return "#$CycLVariable";
  }
}

package com.cyc.kb.quant;

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
import com.cyc.kb.KBCollection;
import com.cyc.kb.client.ContextImpl;
import com.cyc.kb.client.QuantifierImpl;
import com.cyc.kb.exception.KBApiException;


/**
 *
 * @author vijay
 */
public class QuantifiedInstanceRestrictedVariable extends QuantifiedRestrictedVariable {

  private KBCollection collection;
  
  protected QuantifiedInstanceRestrictedVariable(CycObject core) throws KBApiException {
    super(core);
    // Should we attempt to set quantifier and collection from
    // the CycFormulaSentence.
  }
  
  /**
   *
   * @param ctx
   * @param col
   */
  public QuantifiedInstanceRestrictedVariable (QuantifierImpl q, KBCollection col) throws KBApiException {
    super(q, col.toInstanceRestrictedVariable());
    this.setCollection(col);
  }

  public KBCollection getCollection() {
    return collection;
  }

  private void setCollection(KBCollection collection) {
    this.collection = collection;
  }
  
  @Override
  public InstanceRestrictedVariable getRestrictedVariable() {
    return InstanceRestrictedVariable.class.cast(super.getRestrictedVariable());
  }
}

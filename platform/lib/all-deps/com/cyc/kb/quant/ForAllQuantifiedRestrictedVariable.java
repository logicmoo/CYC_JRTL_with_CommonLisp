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

import com.cyc.kb.client.QuantifierImpl;
import com.cyc.kb.exception.KBApiException;

/**
 *
 * @author vijay
 */
class ForAllQuantifiedRestrictedVariable extends QuantifiedRestrictedVariable {

  public ForAllQuantifiedRestrictedVariable(RestrictedVariable ul) throws KBApiException {
    super(new QuantifierImpl("forAll"), ul);
  }
  
  /**
   * @todo
   */
  
  
  
}

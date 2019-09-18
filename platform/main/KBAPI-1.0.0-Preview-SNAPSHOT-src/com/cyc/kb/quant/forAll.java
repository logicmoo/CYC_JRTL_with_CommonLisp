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

import com.cyc.kb.KBCollection;
import com.cyc.kb.client.QuantifierImpl;
import com.cyc.kb.exception.KBApiException;

/**
 *
 * @author vijay
 */
public class forAll {
  
  /*
  private static Quantifier core = null;
  
  public forAll () throws KBApiException {
    if (core == null){
      core = new Quantifier("forAll");
    }
  }
  */
  
  /**
   * UNDER DEVELOPMENT - DO NOT USE
   * @param c
   * @return
   * @throws KBApiException 
   */
  public static QuantifiedRestrictedVariable quantifiedInstanceOf (KBCollection c) throws KBApiException {
    return new ForAllQuantifiedInstanceRestrictedVariable (c);
  }
  /**
   * UNDER DEVELOPMENT - DO NOT USE
   * @param ul
   * @return
   * @throws KBApiException 
   */
  public static QuantifiedRestrictedVariable quantified (RestrictedVariable ul) throws KBApiException {
    return new ForAllQuantifiedRestrictedVariable (ul);
  }
}

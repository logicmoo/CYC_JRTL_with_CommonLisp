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
import com.cyc.kb.client.KBPredicateImpl;
import com.cyc.kb.client.QuantifierImpl;
import com.cyc.kb.client.VariableImpl;
import com.cyc.kb.exception.KBApiException;


/**
 *
 * @author vijay
 */
public class ForAllQuantifiedInstanceRestrictedVariable extends QuantifiedInstanceRestrictedVariable {

  public ForAllQuantifiedInstanceRestrictedVariable(KBCollection c) throws KBApiException {
    //super(doSomething(new Quantifier("forAll"), c));
    super(new QuantifierImpl("forAll"), c);
  }
  /*
  private static CycFormulaSentence doSomething(Quantifier q, KBCollection c) throws KBApiException {
    CycFormulaSentence cfs = c.toSentence();
    return CycFormulaSentence.makeCycFormulaSentence(q.getCore(), c.getVariable().getCore(), cfs);
  }
  */
}

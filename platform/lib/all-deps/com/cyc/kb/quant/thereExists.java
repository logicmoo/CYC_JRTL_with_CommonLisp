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

import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.kb.KBCollection;
import com.cyc.kb.Quantifier;
import com.cyc.kb.Sentence;
import com.cyc.kb.client.QuantifierImpl;
import com.cyc.kb.client.SentenceImpl;
import com.cyc.kb.exception.KBApiException;

/**
 *
 * @author vijay
 */
public class thereExists {
  private static Quantifier core = null;

  public thereExists() throws KBApiException {
    if (core == null) {
      core = new QuantifierImpl("thereExists");
    }
  }

  public static QuantifiedRestrictedVariable quantified(KBCollection c) throws KBApiException {
    return new ThereExistsQuantifiedInstanceRestrictedVariable(c);
  }

  public static QuantifiedRestrictedVariable quantified(RestrictedVariable ul) throws KBApiException {
    return new ThereExistsQuantifiedRestrictedVariable(ul);
  }

  public static Sentence quantified(SentenceImpl s, RestrictedVariable rv) throws KBApiException {
    FormulaSentence cfs = ((FormulaSentence) s.getCore());
    cfs.existentiallyBind((CycVariableI) rv.getVariable().getCore());
    return new SentenceImpl(cfs);
  }

}

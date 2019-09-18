/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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

import com.cyc.kb.Context;
import com.cyc.kb.KBCollection;
import com.cyc.kb.Variable;
import com.cyc.kb.client.KBPredicateImpl;
import com.cyc.kb.exception.KBApiException;

/**
 *
 * @author vijay
 */
public class SpecializationRestrictedVariable extends RestrictedVariable {

  private KBCollection collection;

  public SpecializationRestrictedVariable(Context ctx, KBCollection c) throws KBApiException {
    super(ctx, c.getVariable(), new Object[]{KBPredicateImpl.get("genls"), c.getVariable(), c});
    this.setCollection(c);
  }
  
  public SpecializationRestrictedVariable(Context ctx, KBCollection c, Variable v) throws KBApiException {
    super(ctx, v, new Object[]{KBPredicateImpl.get("genls"), v, c});
    this.setCollection(c);
  }

  public KBCollection getCollection() {
    return collection;
  }

  public void setCollection(KBCollection collection) {
    this.collection = collection;
  }
}
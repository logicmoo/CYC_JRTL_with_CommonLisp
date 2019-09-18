/* $Id: CycConstantSentence.java 150536 2014-04-15 20:54:59Z nwinant $
 *
 * Copyright (c) 2008 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package com.cyc.baseclient.cycobject;

//// External Imports

import com.cyc.base.cycobject.CycSentence;


/** 
 * <P>CycConstantSentence is designed to be an object that represents Sentences that
 * are single terms (the only known instance of this is #$False.
 *
 * <P>Copyright (c) 2011 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * Created on : March 3, 2011, 10:05:43 AM
 * Author     : daves
 * @version $Id: CycConstantSentence.java 150536 2014-04-15 20:54:59Z nwinant $
 *
 */
public class CycConstantSentence extends CycConstant implements CycSentence {

  /**
   * Create and return a new CycConstantSentence from constant
   * @param constant
   */
  public CycConstantSentence(CycConstant constant) {
    super(constant.getName(), constant.getGuid());
    //@todo should this throw an exception if it's not #$False?
  }


  @Override
  public boolean isConditionalSentence() {
    return false;
  }


  @Override
  public boolean isNegated() {
    return false;
  }

  public boolean isConjunction() {
    return false;
  }
 
  @Override
  public boolean isLogicalConnectorSentence() {
    return false;
  }

  @Override
  public boolean isExistential() {
    return false;
  }

  @Override
  public boolean isUniversal() {
    return false;
  }

}

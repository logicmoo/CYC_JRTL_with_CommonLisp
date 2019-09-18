package com.cyc.base.cycobject;

/**
 *
 * @author baxter
 */
public interface CycSentence extends CycObject {

  boolean isConditionalSentence();

  boolean isConjunction();

  boolean isLogicalConnectorSentence();

  boolean isExistential();

  boolean isUniversal();

  boolean isNegated();
}

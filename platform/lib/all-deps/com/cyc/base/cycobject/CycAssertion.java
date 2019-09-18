package com.cyc.base.cycobject;

import com.cyc.base.CycAccess;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;

/**
 *
 * @author nwinant
 */
public interface CycAssertion extends CycObject {

  public Object getArg(int argNum, CycAccess cycAccess) throws CycApiException, CycConnectionException;

  public CycObject getArg0(CycAccess cycAccess) throws CycApiException, CycConnectionException;
  
  /**
   * Returns the EL formula for this assertion.
   *
   * @return the EL formula for this assertion
   */
  public FormulaSentence getELFormula(CycAccess access) throws CycApiException, CycConnectionException;
  
  /**
   * Returns the HL formula (in conjunctive normal form) for this assertion.
   *
   * @return the HL formula for this assertion
   */
  public CycList getFormula();

  /**
   * Returns the Ground Atomic Formula (gaf) for this assertion.
   *
   * @return the Ground Atomic Formula (gaf) for this assertion
   */
  public FormulaSentence getGaf();

  /**
   * Returns the Ground Atomic Formula (gaf) for this assertion.
   *
   * @param cycAccess the Cyc communications object
   * @return the Ground Atomic Formula (gaf) for this assertion
   * @ deprecated cycAccess is not necessary.
   */
//  public FormulaSentence getGaf(final CycAccess cycAccess);

  /**
   * Returns the microtheory for this assertion.
   *
   * @return the microtheory for this assertion
   */
  public CycObject getMt();

  /** @return true iff this assertion's formula is both ground and atomic. */
  public boolean isGaf();
}

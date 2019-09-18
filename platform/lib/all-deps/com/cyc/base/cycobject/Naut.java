package com.cyc.base.cycobject;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 *
 * @author nwinant
 */
public interface Naut extends DenotationalTerm, NonAtomicTerm, Formula {

  /** @return the Date denoted by this term in the default time zone, if it denotes a Date, null otherwise. */
  Date asDate();

  /** @return the Date denoted by this term in <code>timeZone</code>, if it denotes a Date, null otherwise. */
  Date asDate(final TimeZone timeZone);

  Naut deepCopy();

  /**
   * Returns <tt>true</tt> some object equals this <tt>CycNaut</tt>
   *
   * @param object the <tt>Object</tt> for equality comparison
   * @return equals <tt>boolean</tt> value indicating equality or non-equality.
   */
//  boolean equalsAtEL(Object object);

//  Object getArgument(int argnum);

  /**
   * Get the arguments of this non-atomic term, not including the functor,
   * or arg0.
   * @see com.cyc.base.cycobject.CycFormulaI#getArgs()forversion that includes the functor.
   * @return the list of arguments.
   */
//  List getArguments();
  
  /** @return true iff this CycNaut is a standard CycL date. */
  boolean isDate();

  /** @return true iff this CycNaut is a standard CycL quantity. */
  boolean isQuantity();

  /**
   * Returns a list representation of the Cyc NAT.
   *
   * @return a <tt>CycList</tt> representation of the Cyc NART.
   */
//  CycList toCycList();

  /**
   * Returns a list representation of the Cyc NART and expands any embedded NARTs as well.
   *
   * @return a <tt>CycList</tt> representation of the Cyc NART.
   */
//  CycList toDeepCycList();
  
}

package com.cyc.base.cycobject;

import java.util.List;

/** 
 * <P>NonAtomicTerm is designed to...

 <P>Copyright (c) 2008 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * Created on : Jul 6, 2009, 10:05:43 AM
 * Author     : baxter
 * @version $Id: NonAtomicTerm.java 150786 2014-04-26 01:40:34Z nwinant $
 */
public interface NonAtomicTerm extends DenotationalTerm {
  
  Fort getFunctor();
  /**
   * Get the arguments of this non-atomic term, not including the functor,
   * or arg0.
   * @return the list of arguments.
   */
  List getArguments();
  Naut getFormula();
  Object getArgument(final int argnum);

  /**
   * Returns a list representation of the Cyc NART.
   *
   * @return a <tt>CycList</tt> representation of the Cyc NART.
   */
  CycList toCycList();

  /**
   * Returns a list representation of the Cyc NART and expands any embedded NARTs as well.
   *
   * @return a <tt>CycList</tt> representation of the Cyc NART.
   */
  CycList toDeepCycList();

  public int getArity();
}

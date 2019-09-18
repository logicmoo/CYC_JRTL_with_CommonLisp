/* $Id: CycNaut.java 150771 2014-04-25 22:35:15Z nwinant $
 *
 * Copyright (c) 2008 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package com.cyc.baseclient.cycobject;
//// External Imports
import com.cyc.base.cycobject.NonAtomicTerm;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.cycobject.Naut;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

//// Internal Imports
import com.cyc.baseclient.datatype.DateConverter;

/** 
 * <P>CycNaut is designed to...
 *
 * <P>Copyright (c) 2008 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * Created on : Jul 6, 2009, 10:05:20 AM
 * Author     : baxter
 * @version $Id: CycNaut.java 150771 2014-04-25 22:35:15Z nwinant $
 */
public class CycNaut extends CycFormula implements NonAtomicTerm, DenotationalTerm, Naut {

  //// Constructors
  /** Creates a new instance of CycNaut. */
  public CycNaut(final Iterable<Object> terms) {
    super(terms);
  }

  public CycNaut(final DenotationalTerm functor, final Object... args) {
    super(functor, args);
  }

  /** Convert term to a CycNaut if it looks like it ought to be one. */
  static public Object convertIfPromising(final Object term) {
    if (term instanceof List && !(term instanceof CycNaut)) {
      final List<Object> termAsList = (List) term;
      if (!termAsList.isEmpty() && termAsList.get(0) instanceof CycConstant) {
        final CycConstant arg0 = (CycConstant) termAsList.get(0);
        if (Character.isUpperCase(arg0.getName().charAt(0))) {
          return new CycNaut(termAsList);
        }
      }
    }
    return term;
  }

  //// Public Area
  public CycFort getFunctor() {
    return (CycFort) getOperator();
  }

  public CycNaut getFormula() {
    return this;
  }

  
  /**
   * Get the arguments of this non-atomic term, not including the functor,
   * or arg0.
   * @see com.cyc.baseclient.cycobject.CycFormula#getArgs()forversionthatincludesthe functor.
   * @return the list of arguments.
   */
  @Override
  public List getArguments() {
    return getArgsUnmodifiable().subList(1, getArity() + 1);
  }

  @Override
  public CycNaut deepCopy() {
    return new CycNaut(super.deepCopy().getArgsUnmodifiable());
  }

  /**
   * Returns <tt>true</tt> some object equals this <tt>CycNaut</tt>
   *
   * @param object the <tt>Object</tt> for equality comparison
   * @return equals <tt>boolean</tt> value indicating equality or non-equality.
   */
  @Override
  public boolean equalsAtEL(Object object) {
    if (!(object instanceof NonAtomicTerm)) {
      return false;
    }
    NonAtomicTerm thatNAT = (NonAtomicTerm) object;
    if (getFunctor().equalsAtEL(thatNAT.getFunctor())
            && getArity() == thatNAT.getArity()) {
      for (int argNum = 1; argNum <= getArity(); argNum++) {
        final Object arg = getArgument(argNum);
        final Object thatArg = thatNAT.getArgument(argNum);
        if (arg.equals(thatArg)) {
          continue;
        } else if (arg instanceof CycFormula
                && ((CycFormula) arg).equalsAtEL(thatArg)) {
          continue;
        } else if (arg instanceof DenotationalTerm
                && ((DenotationalTerm) arg).equalsAtEL(thatArg)) {
          continue;
        } else {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  /**
   * Returns a list representation of the OpenCyc NAT.
   *
   * @return a <tt>CycArrayList</tt> representation of the OpenCyc NART.
   */
  @Override
  public CycArrayList toCycList() {
    CycArrayList cycList = new CycArrayList();
    final CycFort functor = getFunctor();
    if (functor instanceof NonAtomicTerm) {
      cycList.add(((NonAtomicTerm) functor).toCycList());
    } else {
      cycList.add(functor);
    }
    for (final Object argument : this.getArguments()) {
      cycList.add(argument);
    }
    return cycList;
  }

  /**
   * Returns a list representation of the OpenCyc NART and expands any embedded NARTs as well.
   *
   * @return a <tt>CycArrayList</tt> representation of the OpenCyc NART.
   */
  @Override
  public CycArrayList toDeepCycList() {
    CycArrayList cycList = new CycArrayList();
    final CycFort functor = getFunctor();
    if (functor instanceof NonAtomicTerm) {
      cycList.add(((NonAtomicTerm) functor).toDeepCycList());
    } else {
      cycList.add(functor);
    }
    getArguments();
    for (final Object argument : this.getArguments()) {
      if (argument instanceof NonAtomicTerm) {
        cycList.add(((NonAtomicTerm) argument).toDeepCycList());
      } else {
        cycList.add(argument);
      }
    }
    return cycList;
  }

  public Object getArgument(int argnum) {
    return getArg(argnum);
  }

  @Override
  public Object cycListApiValue() {
    return super.cycListApiValue();
  }

  /** @return the Date denoted by this term in the default time zone, if it denotes a Date, null otherwise. */
  public Date asDate() {
    return asDate(TimeZone.getDefault());
  }

  /** @return the Date denoted by this term in <code>timeZone</code>, if it denotes a Date, null otherwise. */
  public Date asDate(final TimeZone timeZone) {
    return (isDate()) ? lookupOrComputeDate(timeZone) : null;
  }

  /** @return true iff this CycNaut is a standard CycL date. */
  public boolean isDate() {
    if (dateStatus == null) {
      computeDateStatus();
    }
    return dateStatus;
  }

  /** @return the Quantity denoted by this term, if it denotes a Quantity, null otherwise. */
  public CycQuantity asQuantity() {
    return (isQuantity()) ? quantity : null;
  }

  /** @return true iff this CycNaut is a standard CycL quantity. */
  public boolean isQuantity() {
    if (quantityStatus == null) {
      computeQuantityStatus();
    }
    return quantityStatus;
  }

  //// Private Area
  private Date lookupOrComputeDate(final TimeZone timeZone) {
    if (dates != null && dates.containsKey(timeZone)) {
      return dates.get(timeZone);
    } else {
      final Date date = DateConverter.parseCycDate(this, timeZone, false);
      if (date != null) {
        if (dates == null) {
          dates = new HashMap<TimeZone, Date>();
        }
        dates.put(timeZone, date);
      }
      return date;
    }
  }

  private void computeDateStatus() {
    lookupOrComputeDate(TimeZone.getDefault());
    dateStatus = (dates != null);
  }
  private Map<TimeZone, Date> dates = null;
  private Boolean dateStatus = null;

  private void computeQuantity() {
    quantity = CycQuantity.valueOf(this);
  }

  private void computeQuantityStatus() {
    computeQuantity();
    quantityStatus = (quantity != null);
  }
  private CycQuantity quantity = null;
  private Boolean quantityStatus = null;
  //// Protected Area
  //// Internal Rep
  //// Main
}

package com.cyc.baseclient.inference;

//// External Imports
import com.cyc.base.CycAccess;
import com.cyc.base.inference.InferenceWorkerSynch;
import com.cyc.base.inference.InferenceWorker;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.inference.InferenceIdentifier;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import com.cyc.baseclient.CommonConstants;
import com.cyc.baseclient.CycClientManager;
import com.cyc.base.CycApiException;
import com.cyc.base.inference.InferenceResultSet;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycFort;
import com.cyc.baseclient.cycobject.CycNart;
import com.cyc.baseclient.cycobject.CycNaut;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.cycobject.CycVariable;

/**
 * <P>DefaultResultSet provides a class for easy access and manipulation
 of inference results. It tries to closely mimic the java.sql.ResultSet class.
 One difference between java.sql.ResultSet and DefaultResultSet is that
 DefaultResultSet is zero-based while java.sql.ResultSet is one-based. Example:

 <code><pre>
  System.out.println("Starting");
  CycAccess access = null;
  try {
    access = new CycClient("localhost", 3660);
    ELMt inferencePSC = access.makeELMt("#$InferencePSC");
    String query = "(#$isa ?X #$Dog)";
    InferenceWorkerSynch worker = new DefaultInferenceWorkerSynch(query,
      inferencePSC, null, access, 500000);
    DefaultResultSet rs = worker.executeQuery();
    try {
      int indexOfX = rs.findColumn("?X");
      while (rs.next()) {
        CycObject curDog = rs.getCycObject(indexOfX);
        System.out.println("Got dog: " + curDog.cyclify());
      }
    } finally {
      rs.close();
    }
  } catch (Exception e) {
    e.printStackTrace();
  } finally {
    if (access != null) {
      access.close();
    }
  }
  System.out.println("Finished");
  System.out.flush();
 </pre></code>
 * <p>
 * @author tbrussea
 * @date Mar 22, 2010, 11:55 AM
 * @version $Id: DefaultResultSet.java 150783 2014-04-26 00:53:01Z nwinant $
 */
@SuppressWarnings("deprecation")
public final class DefaultResultSet extends AbstractResultSet {

  //// Constructors

  /**
   * Creates a new <code>InferenceResultSet</code>.
   *
   * @param results The inference results as returned by "new-cyc-query".
   * @param inferenceWorker The inference worker that produced this result set.
   */
  public DefaultResultSet(List<Object> results, InferenceWorker inferenceWorker) {
    calcRows(results);
    this.inferenceWorker = inferenceWorker;
  }

  /**
   * Creates a new <code>InferenceResultSet</code>.
   *
   * @param results The inference results as returned by "new-cyc-query".
   */
  public DefaultResultSet(List<Object> results) {
    calcRows(results);
    this.inferenceWorker = null;
  }

  //// Public Area

  /**
   * Returns whether the <code>InferenceWorker</code> associated with this
   * <code>DefaultResultSet</code> object is finished working. Will return
   * <code>true</code> if there is no <code>InferenceWorker</code>.
   *
   * @return <code>true</code> if the <code>InferenceWorker</code> associated with this
   * <code>DefaultResultSet</code> or if the <code>InferenceWorker</code> is not set;
   * <code>false</code> if the <code>InferenceWorker</code> associated with this
   * <code>DefaultResultSet</code> might possibly produce more results.
   */
  public boolean isInferenceComplete() {
    if (inferenceWorker != null) {
      return inferenceWorker.isDone();
    }
    return true;
  }

  public InferenceIdentifier getInferenceIdentifier() {
    if (inferenceWorker != null) {
      return inferenceWorker.getInferenceIdentifier();
    }
    return null;
  }

  /**
   * Releases this <code>DefaultResultSet</code> object's server side
   * inference resources. Failure to close a result set may leave significant
   * resources hanging around the server until the client <code>CycClient</code>
   * object is closed.
   * <P>
   * Calling the method <code>close</code> on a <code>DefaultResultSet</code>
   * object that is already closed is a no-op.
   *
   * @throws IOException if a communication error occurs
   * @throws TimeOutException if doesn't get a response from
            the server before an excessive amount of time has elapsed
   * @throws CycApiException if an internal server error occurs
   */
  @Override
  public synchronized void close() {
    if (isClosed()) {
      return;
    }
    setIsClosed(true);
    if (inferenceWorker != null) {
      try {
        inferenceWorker.releaseInferenceResources(MSECS_TO_WAIT_FOR_CLOSE);
      } catch (CycConnectionException ioe) {
        throw new RuntimeException(ioe.getMessage(), ioe);
      }
    }
  }

  /**
   * Returns, as an <code>Object</code>, the value at the current row and at the 
   * column identified by <code>col</code> which should be a 
   * <code>CycVariable</code> in the original query. Returns <code>null</code> 
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as an <code>Object</code>, at the current row and 
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   */
  public Object getObject(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException {
    return getObject(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>DenotationalTerm</code>, the value at the current row and at the
   * column identified by <code>col</code> which should be a 
   * <code>CycVariable</code> in the original query. Returns <code>null</code> 
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>DenotationalTerm</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>DenotationalTerm</code>
   */
  public DenotationalTerm getDenotationalTerm(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getDenotationalTerm(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>String</code>, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>String</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>String</code>
   */
  public String getString(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getString(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>long</code>, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>long</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>long</code>
   */
  public long getLong(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getLong(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>int</code>, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>int</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>int</code>
   */
  public int getInt(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getInt(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>double</code>, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>double</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>double</code>
   */
  public double getDouble(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getDouble(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>float</code>, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>float</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>float</code>
   */
  public float getFloat(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getFloat(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>boolean</code>, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>boolean</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>boolean</code>
   */
  public boolean getBoolean(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getBoolean(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>CycConstant</code>, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>CycConstant</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycConstant</code>
   */
  public CycConstant getConstant(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getConstant(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>CycObject</code>, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>CycObject</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycObject</code>
   */
  public CycObject getCycObject(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getCycObject(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>CycFort</code>, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>CycFort</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycFort</code>
   */
  public CycFort getFort(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getFort(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>CycArrayList</code>, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>CycArrayList</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycArrayList</code>
   */
  public CycArrayList<Object> getList(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getList(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>v</code>, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>CycNart</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycNart</code>
   */
  public CycNart getNart(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getNart(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>CycNaut</code>, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>CycNaut</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycNaut</code>
   */
  public CycNaut getNaut(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getNaut(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>java.util.Date</code> object, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)</code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>java.util.Date</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns <code>null</code>,
   * if no value is set for the current row and given column.
   * @note Fails on dates that are not CycNauts using #$YearFn (i.e. it will not
   * work on skolemized dates, or other forms of dates that don't use the #$YearFn vocabulary).
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>java.util.Date</code>
   */
  public Date getDate(CycVariableI col)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getDate(findColumnStrict(col));
  }

  
  
  /**
   * Returns the one-based column index for <code>col</code>.
   *
   * @param col the column variable to look up
   * @return the column index for the given <code>col</code> variable.
   * @throws IllegalArgumentException if called with an invalid <code>col</code>
   */
  public int findColumn(CycVariableI col) throws IllegalArgumentException {
    return findColumn(col.toString());
  }

  //// Protected Area

  /**
   * Returns the one-based column index for the given <code>col</code>. This version differs
   * from the non-strict version in that it throws detailed error messages.
   *
   * @param col the index name to look up
   * @return the column index for the given <code>col</code>
   * @throws IllegalArgumentException if called with an invalid <code>col</code>
   */
  protected int findColumnStrict(CycVariableI col) throws IllegalArgumentException {
    if (col == null) {
      throw new IllegalArgumentException("Got null column name.");
    }
    return findColumnStrict(col.toString());
  }

  /**
   * Processes the results from "new-cyc-query" to store them conveniently in
 this DefaultResultSet.
   *
   * @param results the results from "new-cyc-query"
   */
  @SuppressWarnings("unchecked")
  protected void calcRows(List results) {
    if (results.size() == 0){
      setTruthValue(Boolean.FALSE);
      return;
    }
    if (results.size() == 1) {
      Object val = results.get(0);
      if ((val instanceof CycSymbol) && (((CycSymbol)val).toString().equalsIgnoreCase("nil"))) {
        setTruthValue(Boolean.TRUE);
        return;
      }
    }
    for (List<CycArrayList> bindingSet : (List<List>)results) {
      List<Object> row = addEmptyRow();
      for (CycArrayList binding : bindingSet) {
        CycVariable colVar = (CycVariable)binding.get(0);
        int colIndex = possiblyAddColVar(colVar);
        String col = colVar.toString();
        Object val = binding.rest();
        row.set(colIndex, val);
      }
    }
  }

  /**
   * If the given column name isn't known, add it and make sure
   * current results have an extra column added. Return the new
   * (or existing) column index for the <code>colVar</code>.
   *
   * @return the column index of <code>colVar</code>
   * @param colVar the CycVariable which represents the column to add
   */
  protected int possiblyAddColVar(CycVariableI colVar) {
    String col = colVar.toString();
    int colIndex = -1;
    List<String> columnNames = getColumnNamesUnsafe();
    if ((colIndex = columnNames.indexOf(col)) < 0) {
      columnNames.add(col);
      for (List<Object> row : getRS()) {
        row.add(null);
      }
      return columnNames.size() - 1;
    }
    return colIndex;
  }

  /**
   * Wait until the inference work completes.
   */
  @Override
  protected void waitTillProcessingDone() {
    if (inferenceWorker == null) {
      return;
    }
    if (inferenceWorker.isDone()) {
      return;
    }
    while (true) {
      synchronized (inferenceWorker) {
        try {
          inferenceWorker.wait(10);
        } catch (InterruptedException ie) {
          // @todo set warning
          return;
        }
        if (inferenceWorker.isDone()) {
          return;
        }
      }
    }
  }

  //// Private Area

  //// Internal Rep

  /** Maximum time to wait in milliseconds when closing the inference worker. */
  private static final long MSECS_TO_WAIT_FOR_CLOSE = 10000;

  /** The inference worker for whose results this DefaultResultSet represents.
   * The value may be null
   */
  private final InferenceWorker inferenceWorker;

  //// Main
  
  /**
   * Provides a working demonstration and sanity check main method.
   *
   * @param args the command line arguments (ignored)
   */
  public static void main(String[] args) {
    System.out.println("Starting");
    CycAccess access = null;
    try {
      access = CycClientManager.get().getAccess("public1", 3660);
      String query = "(#$and (#$isa ?X #$Dog) (#$isa ?Y #$Cat))";
      InferenceWorkerSynch worker = new DefaultInferenceWorkerSynch(query,
        CommonConstants.inferencePSC, null, access, 50000);
      InferenceResultSet rs = worker.executeQuery();
      try {
        int indexOfX = rs.findColumn("?X");
        int indexOfY = rs.findColumn("?Y");
        while (rs.next()) {
          CycObject curDog = rs.getCycObject(indexOfX);
          CycObject curCat = rs.getCycObject(indexOfY);
          System.out.println("Got dog/cat pair: " + curDog.cyclify() + " " + curCat.cyclify());
        }
        System.out.println("Result Set: " + rs);
      } finally {
        rs.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (access != null) {
        access.close();
      }
    }
    System.out.println("Finished");
    System.out.flush();
    System.exit(0);
  }

  public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}

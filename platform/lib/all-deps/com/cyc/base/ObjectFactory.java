package com.cyc.base;

//// External Imports
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.CycNumberI;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.cycobject.Guid;
import java.util.Collection;
import java.util.regex.Pattern;

/**
 * Provides the way to create cyc objects and reuse previously cached instances.<br>
 *
 * All methods are static.<p>
 *
 * Collaborates with the <tt>CycConnection</tt> class which manages the api connections.
 *
 * @version $Id: ObjectFactory.java 150784 2014-04-26 01:02:19Z nwinant $
 * @author Stephen L. Reed
 */
public interface ObjectFactory {

  /**
   * Least Recently Used Cache of CycSymbols, so that a reference to an existing <tt>CycSymbol</tt>
   * is returned instead of constructing a duplicate.
   */
//   final static LRUCache cycSymbolCache = new LRUCache(500, 500, true);
  /**
   * Built in CycSymbols.
   */

  /**
   * The api command which is intercepted by the CycProxy agent to close the CycAccess object
   * associated with the connection between this agent and the particular cyc image.
   */

  /**
   * the default size of the constant cache by name
   */
  public static final int CONSTANT_CACHE_BY_NAME_SIZE = 10000;
  /**
   * Least Recently Used Cache of CycConstantIs, so that a reference to an existing <tt>CycConstantI</tt>
   * is returned instead of constructing a duplicate. Indexed via the name, so is optimised for the ascii api.
   */
//   static LRUCache cycConstantCacheByName = new LRUCache(1000,
//          CONSTANT_CACHE_BY_NAME_SIZE, true);
  /**
   * the default size of the constant cache by GUID
   */
  public static final int CONSTANT_CACHE_BY_GUID_SIZE = 10000;
  /**
   * Least Recently Used Cache of CycConstantIs, so that a reference to an existing <tt>CycConstantI</tt>
   * is returned instead of constructing a duplicate. Indexed via the guid.
   */
//   static LRUCache cycConstantCacheByGuid = new LRUCache(
//          CONSTANT_CACHE_BY_GUID_SIZE, CONSTANT_CACHE_BY_GUID_SIZE, true);
  /**
   * the default size of the CycNumberI cache
   */
  public static final int NUMBER_CACHE_SIZE = 500;
  /**
   * Least Recently Used Cache of CycNumberIs, so that a reference to an existing <tt>CycNumberI</tt>
   * is returned instead of constructing a duplicate.
   */
//   static LRUCache<Number, CycNumberI> cycNumberCache =
//          new LRUCache<Number, CycNumberI>(NUMBER_CACHE_SIZE, NUMBER_CACHE_SIZE,
//          true);
  /**
   * Least Recently Used Cache of guids, so that a reference to an existing <tt>Guid</tt>
   * is returned instead of constructing a duplicate.
   */
//   static LRUCache guidCache = new LRUCache(500, 500, true);
  /**
   * the default size of the variable cache
   */
  public static final int VARIABLE_CACHE_SIZE = 500;
  /**
   * A variable name suffix used to make unique names.
   */
   static int suffix = 1;

  /**
   * Constructs a new <tt>CycSymbol</tt> object.
   *
   * @param symbolNameAnyCase a <tt>String</tt> name.
   */
  public CycSymbolI makeCycSymbol2(String symbolNameAnyCase);

  public CycSymbolI makeCycSymbol2(String packageNameCaseSensitive,
          String symbolNameCaseSensitive);

  /**
   * Constructs a new <tt>CycSymbol</tt> object.
   *
   * @param symbolNameAnyCase a <tt>String</tt> name.
   * @see com.cyc.base.cycobject.CycSymbolI
   */
  public  CycSymbolI makeCycSymbol2(String symbolNameAnyCase,
          boolean shouldQuote);

  public CycSymbolI makeCycBoolean(final boolean b);

  /**
   * Resets the <tt>CycSymbol</tt> cache.
   */
  public void resetCycSymbolCache();
  /** The number of symbols that should be in a freshly reset cache. */
  public static final int RESET_SYMBOL_CACHE_SIZE = 7;

  /** Return the :FREE constant (a singleton).
   *
   * @return the :FREE constant (a singleton)
   */
  public CycConstantI getFreeConstant();

  /**
   * Retrieves the <tt>CycSymbol</tt> with <tt>symbolName</tt>,
   * returning null if not found in the cache.
   *
   * @return a <tt>CycSymbol</tt> if found in the cache, otherwise <tt>null</tt>
   */
  public CycSymbolI getCycSymbolCache(String symbolName);

  /**
   * Removes the <tt>CycSymbol</tt> from the cache if it is contained within.
   */
  public void removeCycSymbolCache(CycSymbolI cycSymbol);

  /**
   * Returns the size of the <tt>Guid</tt> object cache.
   *
   * @return an <tt>int</tt> indicating the number of <tt>CycSymbol</tt> objects in the cache
   */
  public  int getCycSymbolCacheSize();

  /**
   * Resets all the caches.
   */
  public void resetCaches();

  /**
   * Resets the Cyc constant caches.
   */
  public void resetCycConstantCaches();

  /**
   * Adds the <tt>CycConstantI</tt> to the cache by name and by guid
   *
   * @param cycConstant the Cyc constant to be added to the cache
   */
  public void addCycConstantCache(final CycConstantI cycConstant);

  /**
   * Retrieves the <tt>CycConstantI</tt> with name, returning null if not found in the cache.
   */
  public CycConstantI getCycConstantICacheByName(String name);

  /**
   * Retrieves the <tt>CycConstantI</tt> with guid, returning null if not found in the cache.
   */
  public CycConstantI getCycConstantICacheByGuid(Guid guid);

  /**
   * Removes the <tt>CycConstantI</tt> from the caches if it is contained within.
   *
   * @param cycConstant the Cyc constant
   */
  public void removeCaches(final CycConstantI cycConstant);

  /**
   * Returns the size of the <tt>CycConstantI</tt> object cache by id.
   *
   * @return an <tt>int</tt> indicating the number of <tt>CycConstantI</tt> objects in the cache by id
   */
  public int getCycConstantICacheByNameSize();
  
  /**
   * Constructs a new <tt>CycVariableI</tt> object using the variable name.
   *
   * @param name a <tt>String</tt> name.
   */
  public  CycVariableI makeCycVariable(String name);

  /**
   * Constructs a new <tt>CycVariableI</tt> object by suffixing the given
   * variable.
   *
   * @param modelCycVariableI a <tt>CycVariableI</tt> to suffix
   */
  public  CycVariableI makeUniqueCycVariable(CycVariableI modelCycVariableI);
  static Pattern variableNumericSuffixPattern = Pattern.compile(
          "-([0-9]*)$");

  /**
   * Return a CycVariableI that is guaranteed to be different from all the
   * variables in existingVariables. If
   * <code>modelCycVariableI</code> is already
   * different from those in
   * <code>existingVariables</code>, it may be returned.
   *
   * @param modelCycVariableI
   * @param existingVariables
   * @return the new variable
   */
  public  CycVariableI makeUniqueCycVariable(CycVariableI modelCycVariableI,
          Collection<CycObject> existingVariables);

  /**
   * Returns the size of the <tt>CycVariableI</tt> object cache.
   *
   * @return an <tt>int</tt> indicating the number of <tt>CycVariableI</tt>
   * objects in the cache
   */
  public  int getCycVariableICacheSize();

  /**
   * Constructs a new <tt>CycNumberI</tt> object from a <tt>Number</tt>.
   *
   * @param num a <tt>Number</tt> number.
   * @see java.lang.Number
   */
  public CycNumberI makeCycNumber(Number num);

  /**
   * Resets the <tt>CycNumberI</tt> cache.
   */
  public  void resetCycNumberICache();
  /**
   * Adds the <tt>CycNumberI</tt> to the cache.
   */
  public  void addCycNumberICache(CycNumberI cycNumber);

  /**
   * Retrieves the <tt>CycNumberI</tt> with <tt>num</tt>,
   * returning null if not found in the cache.
   *
   * @return a <tt>CycVariableI</tt> if found in the cache, otherwise
   * <tt>null</tt>
   */
  public  CycNumberI getCycNumberICache(Double num);

  /**
   * Removes the <tt>CycVariableI</tt> from the cache if it is contained within.
   */
  public void removeCycNumberICache(CycNumberI cycNumber);

  /**
   * Returns the size of the <tt>CycNumberI</tt> object cache.
   *
   * @return an <tt>int</tt> indicating the number of <tt>CycVariableI</tt> objects in the cache
   */
  public int getCycNumberICacheSize();

  /**
   * Returns a cached <tt>Guid</tt> object or construct a new
   * Guid object from a guid string if the guid is not found in the cache.
   *
   * @param guidString a <tt>String</tt> form of a GUID.
   */
  public  Guid makeGuid(String guidString);

  public Guid makeGuid(byte[] data);

  /**
   * Adds the <tt>Guid</tt> to the cache.
   */
  public void addGuidCache(Guid guid);

  /**
   * Resets the <tt>Guid</tt> cache.
   */
  public void resetGuidCache();

  /**
   * Retrieves the <tt>Guid</tt> with <tt>guidName</tt>,
   * returning null if not found in the cache.
   *
   * @return the <tt>Guid</tt> if it is found in the cache, otherwise
   * <tt>null</tt>
   */
  public Guid getGuidCache(String guidName);

  /**
   * Removes the <tt>Guid</tt> from the cache if it is contained within.
   */
  public  void removeGuidCache(Guid guid);

  /**
   * Returns the size of the <tt>Guid</tt> object cache.
   *
   * @return an <tt>int</tt> indicating the number of <tt>Guid</tt> objects in the cache
   */
  public  int getGuidCacheSize();
}

package com.cyc.kb;

import com.cyc.kb.KBObject.LookupType;
import com.cyc.kb.exception.KBTypeException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBObjectNotFoundException;
import com.cyc.kb.exception.KBTypeConflictException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opencyc.api.CycAccess;
import org.opencyc.api.CycApiException;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycAssertion;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.DefaultCycObject;

/**
 *
 * @author baxter
 * @todo add documentation
 * @todo DaveS review documentation
 */
public class KBObjectFactory {

  private static Map<String, Map<Class, KBObject>> stringCache = new HashMap<String, Map<Class, KBObject>>();  // a cache from the cyclified names/ids/non-cyclified names to classes to KBObjects
  static private KBObjectFactory me = new KBObjectFactory();
  private static final List<Class<? extends KBObject>> KB_OBJECT_TYPES = Arrays.asList(Assertion.class,
          BinaryPredicate.class,
          Context.class,
          Fact.class,
          FirstOrderCollection.class,
          Function.class,
          KBCollection.class,
          KBIndividual.class,
          KBObject.class,
          KBTerm.class,
          Predicate.class,
          //Quantifier.class,
          Relation.class,
          SecondOrderCollection.class,
          Sentence.class,
          Variable.class);

  /**
   * This is not part of the KB API. Use {@link Function.getFactory()}.
   *
   * @return
   */
  public static KBObjectFactory getInstance() {
    return me;
  }

  @Deprecated //use get(o) instead.
  public static <O> O getKBObject(CycObject o, Class<O> retType) throws KBApiException {
    O retValue;

    if (Predicate.class.isAssignableFrom(retType)) {
      retValue = retType.cast(new Predicate(o));
    } else if (Context.class.isAssignableFrom(retType)) {
      retValue = retType.cast(new Context(o));
    } else if (KBIndividual.class.isAssignableFrom(retType)) {
      retValue = retType.cast(new KBIndividual(o));
    } else if (KBCollection.class.isAssignableFrom(retType)) {
      retValue = retType.cast(new KBCollection(o));
    } else if (TypeFact.class.isAssignableFrom(retType)) {
      retValue = retType.cast(new TypeFact(o));
    } else if (KBObject.class.isAssignableFrom(retType)) {
      retValue = retType.cast(new KBObject(o));
    } else {
      throw new KBApiException("Return type: " + retType + " is not supported.");
    }

    return retValue;
  }

  static <O extends KBObject> O get(String nameOrId, Class<O> c) throws KBTypeException, KBApiException {
    return KBObjectFactory.<O>find(nameOrId, c);
  }

  private static <O extends KBObject> O find(String nameOrId, Class<O> c) throws KBApiException {
    O kbObj = KBObjectFactory.<O>getCached(nameOrId, c);
    if (kbObj != null) {
      return kbObj;
    }
    // Try subclasses of c, using most specific that works.
    Class<? extends KBObject> bestClass = c;
    kbObj = (O) getAsInstanceOfSpecifiedClass(nameOrId, bestClass, LookupType.FIND);
    if (kbObj != null) {
      bestClass = kbObj.getClass();
    }
    for (final Class<? extends KBObject> subclass : KB_OBJECT_TYPES) {
      if (bestClass.isAssignableFrom(subclass) && !bestClass.equals(subclass)) {
        try {
          final O asSubclass = (O) getAsInstanceOfSpecifiedClass(nameOrId, subclass, LookupType.FIND);
          if (asSubclass != null) {
            kbObj = (O) cacheKBObject(asSubclass, nameOrId, subclass);
            bestClass = subclass;
          }
        } catch (Exception ex) {
          // Guess it's not one of those.
        } catch (Throwable t) {
        }
      }
    }
    if (kbObj == null) {
      throw new KBObjectNotFoundException("No KB object " + nameOrId + " as " + c.getSimpleName() + ".");
    } else {
      return (O) cacheKBObject(kbObj, nameOrId, c);
    }
  }

  private static <O extends KBObject> O getAsInstanceOfSpecifiedClass(String nameOrId,
          Class<O> c, LookupType l) throws IllegalArgumentException, SecurityException, KBApiException {
    O kbObj = null;
    try {
      kbObj = (O) c.getDeclaredConstructor(String.class, LookupType.class).newInstance(nameOrId, l);
      kbObj = cacheKBObject(kbObj, nameOrId, c);
    } catch (InvocationTargetException ex) {
      if (ex.getCause() instanceof KBApiException) {
        throw (KBApiException) ex.getCause();
      } else {
        Logger.getLogger(KBObjectFactory.class.getName()).log(Level.SEVERE, null, ex);
      }
    } catch (NoSuchMethodException ex) {
      Logger.getLogger(KBObjectFactory.class.getName()).log(Level.FINER, null, ex);
    } catch (InstantiationException ex) {
      Logger.getLogger(KBObjectFactory.class.getName()).log(Level.FINER, null, ex);
    } catch (IllegalAccessException ex) {
      Logger.getLogger(KBObjectFactory.class.getName()).log(Level.SEVERE, null, ex);
    }
    return kbObj;
  }

  /**
   * Get a KBObject with the specified core CycObject.
   *
   * @param obj the core of the KBObject
   * @return the KBObject
   * @throws KBTypeException
   * @throws KBApiException
   */
  public static KBObject get(CycObject obj) throws KBTypeException, KBApiException {
    return get(obj, KBObject.class);
  }

  /**
   * Get a KBObject with the specified core CycObject.
   *
   * @param obj the core of the KBObject
   * @return the KBObject
   * @throws KBTypeException
   * @throws KBApiException
   */
  public static KBObject get(String nameOrId) throws KBTypeException, KBApiException {
    return get(nameOrId, KBObject.class);
  }

  //if there's already a CycObject, then just assume that it's a FIND, not a FIND_OR_CREATE
  //@todo document
  static <O extends KBObject> O get(CycObject cycObj, Class<O> c) throws KBTypeException, KBApiException {
    O kbObj = KBObjectFactory.<O>getCached(cycObj, c);
    if (kbObj != null) {
      return kbObj;
    }
    Class<? extends O> bestClass = c;
    for (final Class<? extends KBObject> subClass : KB_OBJECT_TYPES) {
      if (bestClass.isAssignableFrom(subClass)) {
        try {
          kbObj = (O) subClass.getConstructor(CycObject.class).newInstance(cycObj);
          kbObj = cacheKBObject(kbObj, getCacheKey(cycObj), c);
          bestClass = (Class<? extends O>) subClass;
        } catch (Exception e) {
        }
      }
    }
    if (kbObj == null) {
      return get(cycObj.cyclify(), c);
    } else {
      return kbObj;
    }
  }

  /**
   * Clear all caches relating
   * <code>KBObject</code>s to objects on the Cyc server. In most applications, this will not be
   * needed. However, it can be helpful in applications where the KB is modified externally. For
   * example, if a Cyc term is deleted and then recreated with the same name by some external
   * process, the KBAPI will still have the id information from the old constant, and will retrieve
   * the new constant. A call to
   * <code>clearKBObjectCache</code> will clear the cache and allow the KBAPI to successfully
   * retrieve the newly created constant.
   */
  public static void clearKBObjectCache() {
    stringCache.clear();
    CycObjectFactory.resetCycConstantCaches();
  }
  
  private static <O extends KBObject> O getCached(CycObject obj, Class<O> c) {
    return getCached(getCacheKey(obj), c);
  }

  /**
   *
   * @param <O>
   * @param nameOrId
   * @param c
   * @return the cached KBObject, or null if there is no cached value.
   */
  private static <O extends KBObject> O getCached(String nameOrId, Class<O> c) {
    O returnValue = null;
    List<String> invalidKeys = new ArrayList<String>();
    if (stringCache.containsKey(nameOrId)) {
      //if we find something that could be a c, return it.  It might be a subclass, but that's OK.
      for (Map.Entry<Class, KBObject> e : stringCache.get(nameOrId).entrySet()) {
        if (c.isAssignableFrom(e.getValue().getClass()) && e.getValue().isValid()) {
          returnValue = (O) e.getValue();
        } else if (!e.getValue().isValid()) {
          invalidKeys.add(nameOrId);
          invalidKeys.add(e.getValue().getCore().cyclify());
          invalidKeys.add(e.getValue().getCore().toString());
        }
      }
    }
    if (!invalidKeys.isEmpty()) {
      for (String key : invalidKeys) {
        stringCache.remove(key);
      }
    }
    return returnValue;
  }

  private static <O extends KBObject> O cacheKBObject(KBObject kbObj, String nameOrId, Class<O> c) {
    CycObject core = kbObj.getCore();
    String cyclifiedCore = core.cyclify();
    if (stringCache.containsKey(cyclifiedCore)
            && stringCache.get(cyclifiedCore).containsKey(c)) {
      //if this is already in the cache, but not by the ID, use the existing one.
      if (!stringCache.containsKey(nameOrId)) {
        kbObj = stringCache.get(cyclifiedCore).get(c);
      }
    }
    String coreString = getCacheKey(core);
    cacheAs(nameOrId, c, kbObj);
    cacheAs(cyclifiedCore, c, kbObj);
    cacheAs(coreString, c, kbObj);
    return (O) kbObj;
  }

  private static <O extends KBObject> void cacheAs(String key, Class<O> c, KBObject kbObj) {
    if (!stringCache.containsKey(key)) {
      stringCache.put(key, new HashMap<Class, KBObject>());
    }
    KBObject bestKBObject = kbObj;
    final Map<Class, KBObject> cacheForKey = stringCache.get(key);
    // Ensure the most specific KBObject is used for all classes:
    for (final KBObject maybeBest : cacheForKey.values()) {
      if (bestKBObject != maybeBest
              && bestKBObject.getClass().isAssignableFrom(maybeBest.getClass())) {
        bestKBObject = maybeBest;
      }
    }
    cacheForKey.put(c, bestKBObject);
    for (final Class<O> oneClass : cacheForKey.keySet()) {
      cacheForKey.put(oneClass, bestKBObject);
    }
  }

  static <O extends KBObject> O findOrCreate(String nameOrId, Class<O> c) throws KBApiException {
    try {
      return (O) find(nameOrId, c);
    } catch (KBObjectNotFoundException ex) {
      return getAsInstanceOfSpecifiedClass(nameOrId, c, LookupType.FIND_OR_CREATE);
    } catch (KBTypeConflictException ex) {
      throw ex;
    } catch (KBTypeException ex) {
      // Coerce to desired type:
      return getAsInstanceOfSpecifiedClass(nameOrId, c, LookupType.FIND_OR_CREATE);
    } catch (Exception ex) {
      throw new KBApiException(ex);
    }
  }

  static <O extends KBObject> O findOrCreate(CycObject object, Class<O> c) throws KBApiException {
    return findOrCreate(object.cyclify(), c);
  }

  private static Context getUniversalVocabularyMtContext() throws KBApiException {
    return KBObjectFactory.<Context>get(CycAccess.universalVocabularyMt, Context.class);
  }

  private static Predicate getIsaPredicate() throws KBApiException {
    return KBObjectFactory.<Predicate>get(CycAccess.isa, Predicate.class);
  }

  static <O extends KBObject> O findOrCreate(String nameOrId,
          KBCollection constrainingCollection, Class<O> c) throws KBApiException {
    O KBObject = findOrCreate(nameOrId, c);
    Fact f = new Fact(getUniversalVocabularyMtContext(),
            getIsaPredicate(), KBObject, constrainingCollection);
    return KBObject;
  }

  static <O extends KBObject> O findOrCreate(String nameOrId, String constrainingCollection,
          Class<O> c) throws KBApiException {
    O KBObject = findOrCreate(nameOrId, c);
    Fact f = new Fact(getUniversalVocabularyMtContext(),
            getIsaPredicate(),
            KBObject, constrainingCollection);
    return KBObject;
  }

  static <O extends KBObject> O findOrCreate(String nameOrId,
          KBCollection constrainingCollection, Context ctx, Class<O> c) throws KBApiException {
    O kbObject = findOrCreate(nameOrId, c);
    Fact f = new Fact(ctx, getIsaPredicate(), kbObject, constrainingCollection);
    return kbObject;
  }

  static <O extends KBObject> O findOrCreate(String nameOrId, String constrainingCollection,
          String ctx, Class<O> c) throws KBApiException {
    O KBObject = findOrCreate(nameOrId, c);
    Fact f = new Fact(Context.get(ctx), getIsaPredicate(), KBObject,
            KBCollection.get(constrainingCollection));
    return KBObject;
  }

  public static KBStatus getStatus(String nameOrId, Class c) throws KBApiException {
    CycAccess cyc = CycAccess.getCurrent();
    try {
      CycObject cycObject = (CycObject) DefaultCycObject.fromPossibleCompactExternalId(nameOrId, cyc); //also check from names
      if (cycObject == null) {
        String cyclifiedIndStr = cyc.cyclifyString(nameOrId);
        try {
          cycObject = cyc.getKnownFortByName(cyclifiedIndStr);
        } catch (CycApiException ex) {
          //do nothing, since this exception indicates that it couldn't find a fort by that name
        }
      }
      if (cycObject == null) {
        return KBStatus.DOES_NOT_EXIST;
      }
      return getStatus(cycObject, c);
    } catch (IOException ex) {
      throw new KBApiException(ex);
    }
  }

  public static KBStatus getStatus(CycObject cycObject, Class c) throws KBApiException {
    CycAccess cyc = CycAccess.getCurrent();
    try {
      final CycObject baseCycTypeCore = KBObject.getBaseCycTypeCore(c);
      if (cyc.isa(cycObject, baseCycTypeCore, cyc.makeELMt(CycAccess.inferencePSC))) {
        return KBStatus.EXISTS_AS_TYPE;
      }
      if (cyc.provablyNotIsa(cycObject, baseCycTypeCore, cyc.makeELMt(CycAccess.inferencePSC))) { //this won't work for NAUT collections, but we shouldn't ever need those...
        return KBStatus.EXISTS_WITH_TYPE_CONFLICT;
      } else {
        return KBStatus.EXISTS_WITH_COMPATIBLE_TYPE;
      }
    } catch (IOException ex) {
      throw new KBApiException(ex);
    }
  }

  private static String getCacheKey(CycObject obj) {
    return (obj instanceof CycAssertion) ? String.valueOf(obj.hashCode()) : obj.toString();
  }
}

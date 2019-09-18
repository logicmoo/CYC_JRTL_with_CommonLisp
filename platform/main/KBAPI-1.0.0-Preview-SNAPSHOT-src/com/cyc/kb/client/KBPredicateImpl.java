package com.cyc.kb.client;

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

import com.cyc.base.CycAccessManager;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.Guid;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.kb.Context;
import com.cyc.kb.KBAPIEnums;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBPredicate;
import com.cyc.kb.KBStatus;
import com.cyc.kb.KBAPIEnums.LookupType;
import com.cyc.kb.config.KBAPIDefaultContext;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBApiRuntimeException;
import com.cyc.kb.exception.KBObjectNotFoundException;
import com.cyc.kb.exception.KBTypeConflictException;
import com.cyc.kb.exception.KBTypeException;
import com.cyc.kb.exception.KBApiException;

import java.io.IOException;
import java.util.Collection;
import java.util.logging.Logger;


/**
 * A <code>KBPredicate</code> object is a facade for a <code>#$Predicate</code> 
 * in Cyc KB.
 * 
 * A predicate represents the property of a thing or the relationship between
 * two or more things. Predicates are used to form #$CycLAtomicSentence and are
 * in the 0th argument position. Well-formed (based on predicate arguments) and
 * closed sentences can either be true or false. 
 * 
 * @author Vijay Raj
 * @version $Id: KBPredicateImpl.java 151340 2014-05-19 15:55:29Z vijay $
 */
public class KBPredicateImpl extends RelationImpl implements KBPredicate {

  static final Logger log = Logger.getLogger(KBPredicateImpl.class.getName());
  private static final DenotationalTerm TYPE_CORE =
          new CycConstant("Predicate", new Guid("bd5880d6-9c29-11b1-9dad-c379636f7270"));

  static DenotationalTerm getClassTypeCore() {
    return TYPE_CORE;
  }

  /**
   * Not part of the KB API. This default constructor only has the effect of
   * ensuring that there is access to a Cyc server.
   */
  KBPredicateImpl() {
    super();
  }

  /**
   * Not part of the KB API. An implementation-dependent constructor.
   * <p>
   * It is used when the result of query is a CycObject and is known to be or
   * requested to be cast as an intance of KBPredicate.
   *
   * @param cycObject the CycObject wrapped by <code>KBPredicate</code>. The constructor
   * verifies that the CycObject is an instance of #$Predicate
   * 
   * @throws KBTypeException if cycObject is not or could not be made 
   * an instance of #$Predicate
   */
  KBPredicateImpl(CycObject cycObject) throws KBTypeException {
    super(cycObject);
  }

  /**
   * This is not part of the KB API. finds or creates an instance of #$Predicate represented
   * by predStr in the underlying KB
   * <p>
   *
   * @param predStr  the string representing an instance of #$Predicate in the KB
   * 
   * @throws CreateException if the #$Predicate represented by predStr is not found
   * and could not be created 
   * @throws KBTypeException if the term represented by predStr is not an instance
   * of #$Predicate and cannot be made into one. 
   */
  KBPredicateImpl(String predStr) throws KBTypeException, CreateException {
    super(predStr);
  }

  /**
   * This is not part of the KB API. finds or creates; or finds an instance of #$Predicate
   * represented by predStr in the underlying KB based on input ENUM
   * <p>
   *
   * @param predStr  the string representing an instance of #$Predicate in the KB
   * @param lookup the enum to specify LookupType: FIND or FIND_OR_CREATE
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   *
   * @throws KBObjectNotFoundException  if the #$Predicate represented by predStr
   * is not found and could not be created
   * @throws InvalidNameException if the string predStr does not conform to Cyc constant-naming
   * conventions
   * 
   * @throws KBTypeException  if the term represented by predStr is not an instance of #$Predicate and lookup is
   * set to find only {@link LookupType#FIND}
   * @throws KBTypeConflictException if the term represented by predStr is not an instance of #$Predicate,
   * and lookup is set to find or create; and if the term cannot be made an instance #$Predicate by asserting
   * new knowledge.
   */
  KBPredicateImpl(String predStr, LookupType lookup) throws KBTypeException, CreateException {
    super(predStr, lookup);
  }

  /**
   * Get the
   * <code>KBPredicate</code> with the name
   * <code>nameOrId</code>. Throws exceptions if there is no KB term by that
   * name, or if it is not already an instance of #$Predicate.
   *
   * @param nameOrId the string representation or the HLID of the #$Predicate
   * 
   * @return  a new KBPredicate
   * 
   * @throws KBTypeException
   * @throws CreateException 
   */
  public static KBPredicateImpl get(String nameOrId) throws KBTypeException, CreateException {
    return KBObjectFactory.get(nameOrId, KBPredicateImpl.class);
  }

  /**
   * Get the
   * <code>KBPredicate</code> object that corresponds to
   * <code>cycObject</code>. Throws exceptions if the object isn't in the KB, or if
   * it's not already an instance of
   * <code>#$Predicate</code>.
   *
   * @param cycObject the CycObject wrapped by KBPredicate. The method
   * verifies that the CycObject is an instance of #$Predicate
   * 
   * @return a new KBPredicate 
   * 
   * @throws CreateException 
   * @throws KBTypeException
   */
  @Deprecated
  public static KBPredicateImpl get(CycObject cycObject) throws KBTypeException, CreateException {
    return KBObjectFactory.get(cycObject, KBPredicateImpl.class);
  }

  /**
   * Find or create a
   * <code>KBPredicate</code> object named
   * <code>nameOrId</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of
   * <code>#$Predicate</code>. If there is already an object in the KB called
   * <code>nameOrId</code>, and it is already a
   * <code>#$Predicate</code>, it will be returned. If it is not already a
   * <code>#$Predicate</code>, but can be made into one by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into a
   * <code>#$Predicate</code> by adding assertions (i.e. some existing
   * assertion prevents it from being a
   * <code>#$Predicate</code>), a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$Predicate
   * 
   * @return a new KBPredicate
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static KBPredicateImpl findOrCreate(String nameOrId) throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(nameOrId, KBPredicateImpl.class);
  }

  /**
   * Find or create a KBPredicate object from
   * <code>cycObject</code>. If
   * <code>cycObject</code> is already a
   * <code>#$Predicate</code>, an appropriate
   * <code>KBPredicate</code> object will be returned. If
   * <code>object</code> is not already a
   * <code>#$Predicate</code>, but can be made into one by addition of
   * assertions to the KB, such assertions will be made, and the relevant object
   * will be returned. If
   * <code>cycObject</code> cannot be turned into a
   * <code>#$Predicate</code> by adding assertions (i.e. some existing
   * assertion prevents it from being a
   * <code>#$Predicate</code>, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param cycObject the CycObject wrapped by KBPredicate. The method
   * verifies that the CycObject is an #$Predicate
   * 
   * @return a new KBPredicate
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  @Deprecated
  public static KBPredicateImpl findOrCreate(CycObject cycObject) throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(cycObject, KBPredicateImpl.class);
  }

  /**
   * Find or create a
   * <code>KBPredicate</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in the default context specified by
   * {@link KBAPIDefaultContext#forAssertion()}. If no object
   * exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Predicate</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Predicate</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$Predicate</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Predicate</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$Predicate
   * @param constraintCol the collection that this #$Predicate will instantiate
   * 
   * @return a new KBPredicate
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static KBPredicateImpl findOrCreate(String nameOrId, KBCollection constraintCol) throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(nameOrId, constraintCol, KBPredicateImpl.class);
  }

  /**
   * Find or create a
   * <code>KBPredicate</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in the default context specified by
   * {@link KBAPIDefaultContext#forAssertion()}. If no object
   * exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Predicate</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Predicate</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$Predicate</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Predicate</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$Predicate
   * @param constraintColStr the string representation of the collection that 
   * this #$Predicate will instantiate
   * 
   * @return a new KBPredicate
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static KBPredicateImpl findOrCreate(String nameOrId, String constraintColStr) throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(nameOrId, constraintColStr, KBPredicateImpl.class);
  }

  /**
   * Find or create a
   * <code>KBPredicate</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in
   * <code>ctx</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Predicate</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Predicate</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$Predicate</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Predicate</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$Predicate
   * @param constraintCol the collection that this #$Predicate will instantiate
   * @param ctx the context in which the resulting object must be an instance of
   * constraintCol
   * 
   * @return a new KBPredicate
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static KBPredicateImpl findOrCreate(String nameOrId, KBCollection constraintCol, ContextImpl ctx) 
      throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(nameOrId, constraintCol, ctx, KBPredicateImpl.class);
  }

  /**
   * Find or create a
   * <code>KBPredicate</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in
   * <code>ctx</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Predicate</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Predicate</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$Predicate</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Predicate</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId the string representation or the HLID of the term
   * @param constraintColStr the string representation of the collection that 
   * this #$Predicate will instantiate
   * @param ctxStr the context in which the resulting object must be an instance of
   * constraintCol
   * 
   * @return a new KBPredicate 
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static KBPredicateImpl findOrCreate(String nameOrId, String constraintColStr, String ctx) throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(nameOrId, constraintColStr, ctx, KBPredicateImpl.class);
  }

  /**
   * Checks whether entity exists in KB and is an instance of #$Predicate. If
   * false, {@link #getStatus(String)} may yield more information. This method
   * is equivalent to
   * <code>getStatus(nameOrId).equals(KBStatus.EXISTS_AS_TYPE)</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return <code>true</code> if entity exists in KB and is an instance of
   * #$Predicate
   */
  public static boolean existsAsType(String nameOrId) {
    return getStatus(nameOrId).equals(KBStatus.EXISTS_AS_TYPE);
  }

  /**
   * Checks whether entity exists in KB and is an instance of #$Predicate. If
   * false, {@link #getStatus(CycObject)} may yield more information. This
   * method is equivalent to
   * <code>getStatus(object).equals(KBStatus.EXISTS_AS_TYPE)</code>.
   *
   * @param cycObject the CycObject representation of a KB entity
   * @return <code>true</code> if entity exists in KB and is an instance of
   * #$Predicate
   */
  public static boolean existsAsType(CycObject object) {
    return getStatus(object).equals(KBStatus.EXISTS_AS_TYPE);
  }

  /**
   * Returns an KBStatus enum which describes whether
   * <code>nameOrId</code> exists in the KB and is an instance of
   * <code>#$Predicate</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return an enum describing the existential status of the entity in the KB
   */
  public static KBStatus getStatus(String nameOrId) {
    return KBObjectFactory.getStatus(nameOrId, KBPredicateImpl.class);

  }

  /**
   * Returns an KBStatus enum which describes whether
   * <code>cycObject</code> exists in the KB and is an instance of
   * <code>#$Predicate</code>.
   *
   * @param cycObject the CycObject representation of a KB entity
   * @return an enum describing the existential status of the entity in the KB
   */
  public static KBStatus getStatus(CycObject object) {
    return KBObjectFactory.getStatus(object, KBPredicateImpl.class);
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Predicate#getSpecializations()
   */
  @Override
  public Collection<KBPredicate> getSpecializations() {
    return getSpecializations("");
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Predicate#getSpecializations(java.lang.String)
   */
  @Override
  public Collection<KBPredicate> getSpecializations(String ctxStr) {
    return (this.<KBPredicate>getValues("genlPreds", 2, 1, ctxStr));
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Predicate#getSpecializations(com.cyc.kb.ContextImpl)
   */
  @Override
  public java.util.Collection<KBPredicate> getSpecializations(Context ctx) {
    return (this.<KBPredicate>getValues(Constants.genlPreds(), 2, 1, ctx));
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Predicate#addSpecialization(java.lang.String, java.lang.String)
   */
  @Override
  public KBPredicate addSpecialization(String moreSpecificStr, String ctxStr) throws KBTypeException, CreateException {
    KBPredicate p = KBPredicateImpl.get(moreSpecificStr);
    return addSpecialization(p, ContextImpl.get(ctxStr));
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Predicate#addSpecialization(com.cyc.kb.Predicate, com.cyc.kb.ContextImpl)
   */
  @Override
  public KBPredicate addSpecialization(KBPredicate moreSpecific, Context ctx) throws KBTypeException, CreateException {
    addFact(ctx, Constants.genlPreds(), 2, (Object) moreSpecific);
    return this;
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Predicate#getGeneralizations()
   */
  @Override
  public Collection<KBPredicate> getGeneralizations() throws KBApiException {
    return getGeneralizations("");
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Predicate#getGeneralizations(java.lang.String)
   */
  @Override
  public Collection<KBPredicate> getGeneralizations(String ctxStr) {
    return (this.<KBPredicate>getValues("genlPreds", 1, 2, ctxStr));
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Predicate#getGeneralizations(com.cyc.kb.ContextImpl)
   */
  @Override
  public Collection<KBPredicate> getGeneralizations(Context ctx) {
    return (this.<KBPredicate>getValues(Constants.genlPreds(), 1, 2, ctx));
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Predicate#addGeneralization(java.lang.String, java.lang.String)
   */
  @Override
  public KBPredicate addGeneralization(String moreGeneralStr, String ctxStr) throws KBTypeException, CreateException {
    KBPredicate p = KBPredicateImpl.get(moreGeneralStr);
    return addGeneralization(p, ContextImpl.get(ctxStr));
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Predicate#addGeneralization(com.cyc.kb.Predicate, com.cyc.kb.ContextImpl)
   */
  @Override
  public KBPredicate addGeneralization(KBPredicate moreGeneral, Context ctx) throws KBTypeException, CreateException {
    addFact(ctx, Constants.genlPreds(), 1, (Object) moreGeneral);
    return this;
  }
  
  /* (non-Javadoc)
   * @see com.cyc.kb.Predicate#isGeneralizationOf(com.cyc.kb.KBPredicateImpl, com.cyc.kb.ContextImpl)
   */
  @Override
  public boolean isGeneralizationOf(KBPredicate moreSpecific, Context ctx) {
    try {
      return CycAccessManager.get().getCurrentAccess().getInspectorTool().isGenlPredOf((Fort)core, (Fort)moreSpecific.getCore(), ctx.getCore());
    } catch (CycConnectionException e) {
      throw new KBApiRuntimeException(e);
    }
  }
  
  @Override
  String getTypeString() {
    return getClassTypeString();
  }

  /**
   * Get the string representation of the KB type that this class corresponds
   * to.
   *
   * @return "#$Predicate"
   */
  public static String getClassTypeString() {
    return "#$Predicate";
  }
}

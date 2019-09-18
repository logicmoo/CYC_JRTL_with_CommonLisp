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

import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.cycobject.Guid;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.kb.KBAPIEnums;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBStatus;
import com.cyc.kb.SecondOrderCollection;
import com.cyc.kb.KBAPIEnums.LookupType;
import com.cyc.kb.config.KBAPIDefaultContext;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBObjectNotFoundException;
import com.cyc.kb.exception.KBTypeConflictException;
import com.cyc.kb.exception.KBTypeException;


/**
 * A <code>SecondOrderCollection</code> object is a facade for a 
 * <code>#$SecondOrderCollection</code> in Cyc KB.
 * 
 * A #$SecondOrderCollection is a specialization of #$Collection. It is a collection of
 * collections that have only #$FirstOrderCollection as its instances. The higher level APIs that use 
 * the KB API utilize this subclass (specialization) of KBCollection (#$Collection.)
 * So we have a class to support strongly typing such collections. 
 * 
 * @author Vijay Raj
 * @version $Id: SecondOrderCollectionImpl.java 151340 2014-05-19 15:55:29Z vijay $
 */
public class SecondOrderCollectionImpl extends FirstOrderCollectionImpl implements SecondOrderCollection {

  private static final DenotationalTerm TYPE_CORE =
          new CycConstant("SecondOrderCollection", new Guid("1d075598-1fd3-11d6-8000-0050dab92c2f"));

  static DenotationalTerm getClassTypeCore() {
    return TYPE_CORE;
  }
  
  /**
   * Not part of the KB API. This default constructor only has the effect of
   * ensuring that there is access to a Cyc server.
   */
  SecondOrderCollectionImpl() {
    super();
  }

  /**
   * Not part of the KB API. An implementation-dependent constructor.
   * <p>
   * It is used when the result of query is a CycObject and is known to be or
   * requested to be cast as an intance of SecondOrderCollection.
   *
   * @param cycObject the CycObject wrapped by <code>SecondOrderCollection</code>. The constructor
   * verifies that the CycObject is an instance of #$SecondOrderCollection
   * 
   * @throws KBTypeException if cycObject is not or could not be made 
   * an instance of #$SecondOrderCollection
   */
  SecondOrderCollectionImpl(CycObject cycObject) throws KBTypeException {
    super(cycObject);
  }

  /**
   * This is not part of the KB API. finds or creates an instance of #$SecondOrderCollection represented
   * by soColStr in the underlying KB
   * <p>
   *
   * @param soColStr  the string representing an instance of #$SecondOrderCollection in the KB
   * 
   * @throws CreateException if the #$SecondOrderCollection represented by soColStr is not found
   * and could not be created 
   * @throws KBTypeException if the term represented by soColStr is not an instance
   * of #$SecondOrderCollection and cannot be made into one. 
   */
  SecondOrderCollectionImpl(String soColStr) throws KBTypeException, CreateException {
    super(soColStr);
  }

  /**
   * This is not part of the KB API. finds or creates; or finds an instance of #$SecondOrderCollection
   * represented by soColStr in the underlying KB based on input ENUM
   * <p>
   *
   * @param soColStr  the string representing an instance of #$SecondOrderCollection in the KB
   * @param lookup the enum to specify LookupType: FIND or FIND_OR_CREATE
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   *
   * @throws KBObjectNotFoundException  if the #$SecondOrderCollection represented by soColStr
   * is not found and could not be created
   * @throws InvalidNameException if the string soColStr does not conform to Cyc constant-naming
   * conventions
   * 
   * @throws KBTypeException  if the term represented by soColStr is not an instance of #$SecondOrderCollection and lookup is
   * set to find only {@link LookupType#FIND}
   * @throws KBTypeConflictException if the term represented by soColStr is not an instance of #$SecondOrderCollection,
   * and lookup is set to find or create; and if the term cannot be made an instance #$SecondOrderCollection by asserting
   * new knowledge.
   */
  SecondOrderCollectionImpl(String soColStr, LookupType lookup) throws KBTypeException, CreateException {
    super(soColStr, lookup);
  }

  /**
   * Get the
   * <code>SecondOrderCollection</code> with the name
   * <code>nameOrId</code>. Throws exceptions if there is no KB term by that
   * name, or if it is not already an instance of #$SecondOrderCollection.
   *
   * @param nameOrId the string representation or the HLID of the #$SecondOrderCollection
   * 
   * @return  a new SecondOrderCollection
   * 
   * @throws KBTypeException
   * @throws CreateException 
   */
  public static SecondOrderCollectionImpl get(String nameOrId) throws KBTypeException, CreateException  {
    return KBObjectFactory.get(nameOrId, SecondOrderCollectionImpl.class);
  }

  /**
   * Get the
   * <code>SecondOrderCollection</code> object that corresponds to
   * <code>cycObject</code>. Throws exceptions if the object isn't in the KB, or if
   * it's not already an instance of
   * <code>#$SecondOrderCollection</code>.
   *
   * @param cycObject the CycObject wrapped by SecondOrderCollection. The method
   * verifies that the CycObject is an instance of #$SecondOrderCollection
   * 
   * @return a new SecondOrderCollection 
   * 
   * @throws CreateException 
   * @throws KBTypeException
   */
  @Deprecated
  public static SecondOrderCollectionImpl get(CycObject cycObject) throws KBTypeException, CreateException {
    return KBObjectFactory.get(cycObject, SecondOrderCollectionImpl.class);
  }

  /**
   * Find or create a
   * <code>SecondOrderCollection</code> object named
   * <code>nameOrId</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of
   * <code>#$SecondOrderCollection</code>. If there is already an object in the KB called
   * <code>nameOrId</code>, and it is already a
   * <code>#$SecondOrderCollection</code>, it will be returned. If it is not already a
   * <code>#$SecondOrderCollection</code>, but can be made into one by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into a
   * <code>#$SecondOrderCollection</code> by adding assertions (i.e. some existing
   * assertion prevents it from being a
   * <code>#$SecondOrderCollection</code>), a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$SecondOrderCollection
   * 
   * @return a new SecondOrderCollection
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static SecondOrderCollectionImpl findOrCreate(String nameOrId) throws CreateException, KBTypeException  {
    return KBObjectFactory.findOrCreate(nameOrId, SecondOrderCollectionImpl.class);
  }

  /**
   * Find or create a SecondOrderCollection object from
   * <code>cycObject</code>. If
   * <code>cycObject</code> is already a
   * <code>#$SecondOrderCollection</code>, an appropriate
   * <code>SecondOrderCollection</code> object will be returned. If
   * <code>object</code> is not already a
   * <code>#$SecondOrderCollection</code>, but can be made into one by addition of
   * assertions to the KB, such assertions will be made, and the relevant object
   * will be returned. If
   * <code>cycObject</code> cannot be turned into a
   * <code>#$SecondOrderCollection</code> by adding assertions (i.e. some existing
   * assertion prevents it from being a
   * <code>#$SecondOrderCollection</code>, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param cycObject the CycObject wrapped by SecondOrderCollection. The method
   * verifies that the CycObject is an #$SecondOrderCollection
   * 
   * @return a new SecondOrderCollection
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  @Deprecated
  public static SecondOrderCollectionImpl findOrCreate(CycObject cycObject) throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(cycObject, SecondOrderCollectionImpl.class);
  }

  /**
   * Find or create a
   * <code>SecondOrderCollection</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in the default context specified by
   * {@link KBAPIDefaultContext#forAssertion()}. If no object
   * exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$SecondOrderCollection</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$SecondOrderCollection</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$SecondOrderCollection</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$SecondOrderCollection</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$SecondOrderCollection
   * @param constraintCol the collection that this #$SecondOrderCollection will instantiate
   * 
   * @return a new SecondOrderCollection
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static SecondOrderCollectionImpl findOrCreate(String nameOrId, KBCollection constraintCol) throws CreateException, KBTypeException  {
    return KBObjectFactory.findOrCreate(nameOrId, constraintCol, SecondOrderCollectionImpl.class);
  }

  /**
   * Find or create a
   * <code>SecondOrderCollection</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in the default context specified by
   * {@link KBAPIDefaultContext#forAssertion()}. If no object
   * exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$SecondOrderCollection</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$SecondOrderCollection</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$SecondOrderCollection</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$SecondOrderCollection</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$SecondOrderCollection
   * @param constraintColStr the string representation of the collection that 
   * this #$SecondOrderCollection will instantiate
   * 
   * @return a new SecondOrderCollection
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static SecondOrderCollectionImpl findOrCreate(String nameOrId, String constraintColStr) throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(nameOrId, constraintColStr, SecondOrderCollectionImpl.class);
  }

  /**
   * Find or create a
   * <code>SecondOrderCollection</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in
   * <code>ctx</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$SecondOrderCollection</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$SecondOrderCollection</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$SecondOrderCollection</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$SecondOrderCollection</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$SecondOrderCollection
   * @param constraintCol the collection that this #$SecondOrderCollection will instantiate
   * @param ctx the context in which the resulting object must be an instance of
   * constraintCol
   * 
   * @return a new SecondOrderCollection
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static SecondOrderCollectionImpl findOrCreate(String nameOrId, KBCollection constraintCol, ContextImpl ctx) 
      throws CreateException, KBTypeException  {
    return KBObjectFactory.findOrCreate(nameOrId, constraintCol, ctx, SecondOrderCollectionImpl.class);
  }

  /**
   * Find or create a
   * <code>SecondOrderCollection</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in
   * <code>ctx</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$SecondOrderCollection</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$SecondOrderCollection</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$SecondOrderCollection</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$SecondOrderCollection</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId the string representation or the HLID of the term
   * @param constraintColStr the string representation of the collection that 
   * this #$SecondOrderCollection will instantiate
   * @param ctxStr the context in which the resulting object must be an instance of
   * constraintCol
   * 
   * @return a new SecondOrderCollection 
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static SecondOrderCollectionImpl findOrCreate(String nameOrId, String constraintColStr, String ctxStr) 
      throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(nameOrId, constraintColStr, ctxStr, SecondOrderCollectionImpl.class);
  }

  /**
   * Checks whether entity exists in KB and is an instance of #$SecondOrderCollection. If
   * false, {@link #getStatus(String)} may yield more information. This method
   * is equivalent to
   * <code>getStatus(nameOrId).equals(KBStatus.EXISTS_AS_TYPE)</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return <code>true</code> if entity exists in KB and is an instance of
   * #$SecondOrderCollection
   */
  public static boolean existsAsType(String nameOrId) {
    return getStatus(nameOrId).equals(KBStatus.EXISTS_AS_TYPE);
  }

  /**
   * Checks whether entity exists in KB and is an instance of #$SecondOrderCollection. If
   * false, {@link #getStatus(CycObject)} may yield more information. This
   * method is equivalent to
   * <code>getStatus(object).equals(KBStatus.EXISTS_AS_TYPE)</code>.
   *
   * @param cycObject the CycObject representation of a KB entity
   * @return <code>true</code> if entity exists in KB and is an instance of
   * #$SecondOrderCollection
   */
  public static boolean existsAsType(CycObject object) {
    return getStatus(object).equals(KBStatus.EXISTS_AS_TYPE);
  }

  /**
   * Returns an KBStatus enum which describes whether
   * <code>nameOrId</code> exists in the KB and is an instance of
   * <code>#$SecondOrderCollection</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return an enum describing the existential status of the entity in the KB
   */
  public static KBStatus getStatus(String nameOrId) {
    return KBObjectFactory.getStatus(nameOrId, SecondOrderCollectionImpl.class);

  }

  /**
   * Returns an KBStatus enum which describes whether
   * <code>cycObject</code> exists in the KB and is an instance of
   * <code>#$SecondOrderCollection</code>.
   *
   * @param cycObject the CycObject representation of a KB entity
   * @return an enum describing the existential status of the entity in the KB
   */
  public static KBStatus getStatus(CycObject object) {
    return KBObjectFactory.getStatus(object, SecondOrderCollectionImpl.class);
  }

  /**
   * This is not part of the KB API.
   *
   * @return
   */
  @Override
  protected String getTypeString() {
    return getClassTypeString();
  }

  /**
   * Get the string representation of the KB type that this class corresponds
   * to.
   *
   * @return "#$SecondOrderCollection"
   */
  public static String getClassTypeString() {
    return "#$SecondOrderCollection";
  }
}

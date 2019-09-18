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
import com.cyc.kb.KBStatus;
import com.cyc.kb.Quantifier;
import com.cyc.kb.KBAPIEnums.LookupType;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBTypeConflictException;
import com.cyc.kb.exception.KBTypeException;


/**
 *
 * @author vijay
 */
public class QuantifierImpl extends ScopingRelationImpl implements Quantifier {

    private static final DenotationalTerm TYPE_CORE =
          new CycConstant("Quantifier", new Guid("bd58c271-9c29-11b1-9dad-c379636f7270"));

  static DenotationalTerm getClassTypeCore() {
    return TYPE_CORE;
  }
  
  /**
   * default constructor, calls the default super constructor
   *
   * @throws Exception
   */
  @SuppressWarnings("unused")
private QuantifierImpl() {
    super();
  }

  /**
   * Return a new
   * <code>Quantifier</code> based on the existing predicate
   * <code>cycBinPred</code>. The KB term underlying
   * <code>cycBinPred</code> must already be an instance of #$Quantifier.
   *
   * @param cycQuantifier	the CycObject wrapped by Quantifier. The constructor verifies that the
   * CycObject is a #$Quantifier
   * @throws KBTypeException if cycBinPred is not a #$Quantifier
   */
  protected QuantifierImpl(CycObject cycQuantifier) throws KBTypeException {
    super(cycQuantifier);
  }

  /**
   * finds or creates a Quantifier represented by binPredStr in the underlying KB
   * <p>
   *
   * @param quantifierStr	the string representing a Quantifier in the KB
   * @throws CreateException if the Quantifier represented by predStr is not found and could not be
   * created
   * @throws KBTypeException 
   */
  public QuantifierImpl(String quantifierStr) throws KBTypeException, CreateException {
    super(quantifierStr);
  }

    
  protected QuantifierImpl (String quantifierStr, LookupType lookup) throws KBTypeException, CreateException {
    super(quantifierStr, lookup);
  }
  /**
   * Get the
   * <code>Relation</code> with the name
   * <code>nameOrId</code>. Throws exceptions if there is no KB term by that name, or if it is not
   * already an instance of #$Relation.
   *
   * @param nameOrId
   * @return
   * @throws CreateException 
   * @throws KBTypeException
   */
  public static QuantifierImpl get(String nameOrId) throws KBTypeException, CreateException {
    return KBObjectFactory.get(nameOrId, QuantifierImpl.class);
  }

  /**
   * Get the
   * <code>Relation</code> object that corresponds to
   * <code>object</code>. Throws exceptions if the object isn't in the KB, or if it's not already an
   * instance of
   * <code>#$Relation</code>.
   *
   * @param object
   * @return
   * @throws CreateException 
   * @throws KBTypeException
   */
  @SuppressWarnings("deprecation")
public static QuantifierImpl get(CycObject object) throws KBTypeException, CreateException {
    return KBObjectFactory.get(object, QuantifierImpl.class);
  }

  /**
   * The KBAPI does not support the creation of new quantifiers. The
   * <code>get</code> methods on quantifiers should be used to retrieve existing quantifiers.
   *
   * @param nameOrId
   * @return
   * @throws KBTypeConflictException
   * @throws InvalidNameException
   * @throws KBApiException
   * @deprecated Creation of new quantifiers is not supported in the KBAPI.
   */
  public static QuantifierImpl findOrCreate(String nameOrId) {
    throw new UnsupportedOperationException("Creation of new Quantifiers is not allowed.  Please use a get method.");
  }

  /**
   * The KBAPI does not support the creation of new quantifiers. The
   * <code>get</code> methods on quantifiers should be used to retrieve existing quantifiers.
   *
   * @param object
   * @return
   * @throws KBTypeConflictException
   * @throws InvalidNameException
   * @throws KBApiException
   * @deprecated Creation of new quantifiers is not supported in the KBAPI.
   */
  public static QuantifierImpl findOrCreate(CycObject object) {
    throw new UnsupportedOperationException("Creation of new Quantifiers is not allowed.  Please use a get method.");
  }

  /**
   * Checks whether entity exists in KB and is an instance of #$Individual. If false,
   * {@link #getStatus(String)} may yield more information. This method is equivalent to
   * <code>getStatus(nameOrId).equals(KBStatus.EXISTS_AS_TYPE)</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return <code>true</code> if entity exists in KB and is an instance of #$Individual
   * @throws KBApiException
   */
  public static boolean existsAsType(String nameOrId) {
    return getStatus(nameOrId).equals(KBStatus.EXISTS_AS_TYPE);
  }

  /**
   * Checks whether entity exists in KB and is an instance of #$Individual. If false,
   * {@link #getStatus(CycObject)} may yield more information. This method is equivalent to
   * <code>getStatus(object).equals(KBStatus.EXISTS_AS_TYPE)</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return <code>true</code> if entity exists in KB and is an instance of #$Individual
   * @throws KBApiException
   */
  public static boolean existsAsType(CycObject object) {
    return getStatus(object).equals(KBStatus.EXISTS_AS_TYPE);
  }

  /**
   * Returns an KBStatus enum which describes whether
   * <code>nameOrId</code> exists in the KB and is an instance of
   * <code>#$Individual</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return an enum describing the existential status of the entity in the KB
   * @throws KBApiException if the status can not be determined.
   */
  public static KBStatus getStatus(String nameOrId)  {
    return KBObjectFactory.getStatus(nameOrId, QuantifierImpl.class);

  }

  /**
   * Returns an KBStatus enum which describes whether
   * <code>object</code> exists in the KB and is an instance of
   * <code>#$Individual</code>.
   *
   * @param object the CycObject representation of a KB entity
   * @return an enum describing the existential status of the entity in the KB
   * @throws KBApiException if the status can not be determined.
   */
  public static KBStatus getStatus(CycObject object) {
    return KBObjectFactory.getStatus(object, QuantifierImpl.class);
  }

  @Override
  protected String getTypeString() {
    return "#$Quantifier";
  }
}

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
import com.cyc.base.cycobject.Guid;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.api.SubLAPIHelper;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.kb.Context;
import com.cyc.kb.KBAPIEnums;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBStatus;
import com.cyc.kb.Relation;
import com.cyc.kb.KBAPIEnums.LookupType;
import com.cyc.kb.config.KBAPIDefaultContext;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBApiRuntimeException;
import com.cyc.kb.exception.KBObjectNotFoundException;
import com.cyc.kb.exception.VariableArityException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBTypeConflictException;
import com.cyc.kb.exception.KBTypeException;

import java.io.IOException;
import java.util.Collection;


/**
 * A <code>Relation</code> object is a facade for a <code>#$Relation</code> in Cyc KB.
 * 
 * A relation relates one or more things. Relations can be used to construct formulas. 
 * Relations can be used to construct atomic or non-atomic sentences and non-atomic terms.
 * A well formed formula has a relation in 0th argument position and the other 
 * arguments satisfy the semantic constraints of the relation. This class will be rarely, 
 * if ever, used by itself. Instead, it's subclasses {@link KBPredicateImpl} and {@link KBFunctionImpl}
 * should be used in virtually all cases.
 * 
 * @author Vijay Raj
 * @version $Id: RelationImpl.java 151340 2014-05-19 15:55:29Z vijay $
 */
public class RelationImpl extends KBIndividualImpl implements Relation {

  private static final DenotationalTerm TYPE_CORE =
          new CycConstant("Relation", new Guid("bd5880cd-9c29-11b1-9dad-c379636f7270"));

  static DenotationalTerm getClassTypeCore() {
    return TYPE_CORE;
  }
  private static final CycSymbol WITH_MT = CycObjectFactory.makeCycSymbol("with-mt");

  /**
   * Not part of the KB API. This default constructor only has the effect of
   * ensuring that there is access to a Cyc server.
   */
  RelationImpl() {
    super();
  }

  /**
   * Not part of the KB API. An implementation-dependent constructor.
   * <p>
   * It is used when the result of query is a CycObject and is known to be or
   * requested to be cast as an intance of Relation.
   *
   * @param cycObject the CycObject wrapped by <code>Relation</code>. The constructor
   * verifies that the CycObject is an instance of #$Relation
   * 
   * @throws KBTypeException if cycObject is not or could not be made 
   * an instance of #$Relation
   */
  RelationImpl(CycObject cycObject) throws KBTypeException {
    super(cycObject);
  }

  /**
   * This is not part of the KB API. finds or creates an instance of CYC_NAME_OF_THE_CLASS represented
   * by relStr in the underlying KB
   * <p>
   *
   * @param relStr  the string representing an #$Relation in the KB
   * 
   * @throws CreateException if the #$Relation represented by relStr is not found
   * and could not be created 
   * @throws KBTypeException if the term represented by relStr is not an instance
   * of #$Relation and cannot be made into one. 
   */
  RelationImpl(String relStr) throws KBTypeException, CreateException {
    super(relStr);
  }

  /**
   * This is not part of the KB API. finds or creates; or finds an instance of #$Relation
   * represented by relStr in the underlying KB based on input ENUM
   * <p>
   *
   * @param relStr  the string representing an instance of #$Relation in the KB
   * @param lookup the enum to specify LookupType: FIND or FIND_OR_CREATE
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   *
   * @throws KBObjectNotFoundException  if the #$Relation represented by relStr
   * is not found and could not be created
   * @throws InvalidNameException if the string relStr does not conform to Cyc constant-naming
   * conventions
   * 
   * @throws KBTypeException  if the term represented by relStr is not an instance of #$Relation and lookup is
   * set to find only {@link LookupType#FIND}
   * @throws KBTypeConflictException if the term represented by relStr is not an instance of #$Relation,
   * and lookup is set to find or create; and if the term cannot be made an instance #$Relation by asserting
   * new knowledge.
   */
  RelationImpl(String relStr, LookupType lookup) throws KBTypeException, CreateException {
    super(relStr, lookup);
  }

  /**
   * Get the
   * <code>Relation</code> with the name
   * <code>nameOrId</code>. Throws exceptions if there is no KB term by that
   * name, or if it is not already an instance of #$Relation.
   *
   * @param nameOrId the string representation or the HLID of the #$Relation
   * 
   * @return  a new Relation
   * 
   * @throws KBTypeException
   * @throws CreateException 
   */
  public static RelationImpl get(String nameOrId) throws KBTypeException, CreateException {
    return KBObjectFactory.get(nameOrId, RelationImpl.class);
  }

  /**
   * Get the
   * <code>Relation</code> object that corresponds to
   * <code>cycObject</code>. Throws exceptions if the object isn't in the KB, or if
   * it's not already an instance of
   * <code>#$Relation</code>.
   *
   * @param cycObject the CycObject wrapped by Relation. The method
   * verifies that the CycObject is an instance of #$Relation
   * 
   * @return a new Relation 
   * 
   * @throws CreateException 
   * @throws KBTypeException
   */
  @Deprecated
  public static RelationImpl get(CycObject cycObject) throws KBTypeException, CreateException {
    return KBObjectFactory.get(cycObject, RelationImpl.class);
  }

  /**
   * Find or create a
   * <code>Relation</code> object named
   * <code>nameOrId</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of
   * <code>#$Relation</code>. If there is already an object in the KB called
   * <code>nameOrId</code>, and it is already a
   * <code>#$Relation</code>, it will be returned. If it is not already a
   * <code>#$Relation</code>, but can be made into one by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into a
   * <code>#$Relation</code> by adding assertions (i.e. some existing
   * assertion prevents it from being a
   * <code>#$Relation</code>), a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$Relation
   * 
   * @return a new Relation
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static RelationImpl findOrCreate(String nameOrId) throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(nameOrId, RelationImpl.class);
  }

  /**
   * Find or create a Relation object from
   * <code>cycObject</code>. If
   * <code>cycObject</code> is already a
   * <code>#$Relation</code>, an appropriate
   * <code>Relation</code> object will be returned. If
   * <code>object</code> is not already a
   * <code>#$Relation</code>, but can be made into one by addition of
   * assertions to the KB, such assertions will be made, and the relevant object
   * will be returned. If
   * <code>cycObject</code> cannot be turned into a
   * <code>#$Relation</code> by adding assertions (i.e. some existing
   * assertion prevents it from being a
   * <code>#$Relation</code>, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param cycObject the CycObject wrapped by Relation. The method
   * verifies that the CycObject is an #$Relation
   * 
   * @return a new Relation
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  @Deprecated
  public static RelationImpl findOrCreate(CycObject cycObject) throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(cycObject, RelationImpl.class);
  }

  /**
   * Find or create a
   * <code>Relation</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in the default context specified by
   * {@link KBAPIDefaultContext#forAssertion()}. If no object
   * exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Relation</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Relation</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$Relation</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Relation</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$Relation
   * @param constraintCol the collection that this #$Relation will instantiate
   * 
   * @return a new Relation
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static RelationImpl findOrCreate(String nameOrId, KBCollection constraitCol) throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(nameOrId, constraitCol, RelationImpl.class);
  }

  /**
   * Find or create a
   * <code>Relation</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in the default context specified by
   * {@link KBAPIDefaultContext#forAssertion()}. If no object
   * exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Relation</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Relation</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$Relation</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Relation</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$Relation
   * @param constraintColStr the string representation of the collection that 
   * this #$Relation will instantiate
   * 
   * @return a new Relation
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static RelationImpl findOrCreate(String nameOrId, String constratCollectionStr) throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(nameOrId, constratCollectionStr, RelationImpl.class);
  }

  /**
   * Find or create a
   * <code>Relation</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in
   * <code>ctx</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Relation</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Relation</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$Relation</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Relation</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$Relation
   * @param constraintCol the collection that this #$Relation will instantiate
   * @param ctx the context in which the resulting object must be an instance of
   * constraintCol
   * 
   * @return a new Relation
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static RelationImpl findOrCreate(String nameOrId, KBCollection constraintCol, ContextImpl ctx) 
      throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(nameOrId, constraintCol, ctx, RelationImpl.class);
  }

  /**
   * Find or create a
   * <code>Relation</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in
   * <code>ctx</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Relation</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Relation</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$Relation</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Relation</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId the string representation or the HLID of the term
   * @param constraintColStr the string representation of the collection that 
   * this #$Relation will instantiate
   * @param ctxStr the context in which the resulting object must be an instance of
   * constraintCol
   * 
   * @return a new Relation 
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static RelationImpl findOrCreate(String nameOrId, String constraintColStr, String ctxStr) 
      throws CreateException, KBTypeException {
    return KBObjectFactory.findOrCreate(nameOrId, constraintColStr, ctxStr, RelationImpl.class);
  }

  /**
   * Checks whether entity exists in KB and is an instance of #$Relation. If
   * false, {@link #getStatus(String)} may yield more information. This method
   * is equivalent to
   * <code>getStatus(nameOrId).equals(KBStatus.EXISTS_AS_TYPE)</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return <code>true</code> if entity exists in KB and is an instance of
   * #$Relation
   */
  public static boolean existsAsType(String nameOrId) {
    return getStatus(nameOrId).equals(KBStatus.EXISTS_AS_TYPE);
  }

  /**
   * Checks whether entity exists in KB and is an instance of #$Relation. If
   * false, {@link #getStatus(CycObject)} may yield more information. This
   * method is equivalent to
   * <code>getStatus(object).equals(KBStatus.EXISTS_AS_TYPE)</code>.
   *
   * @param cycObject the CycObject representation of a KB entity
   * @return <code>true</code> if entity exists in KB and is an instance of
   * #$Relation
   */
  public static boolean existsAsType(CycObject cycObject) {
    return getStatus(cycObject).equals(KBStatus.EXISTS_AS_TYPE);
  }

  /**
   * Returns an KBStatus enum which describes whether
   * <code>nameOrId</code> exists in the KB and is an instance of
   * <code>#$Relation</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return an enum describing the existential status of the entity in the KB
   */
  public static KBStatus getStatus(String nameOrId) {
    return KBObjectFactory.getStatus(nameOrId, RelationImpl.class);

  }

  /**
   * Returns an KBStatus enum which describes whether
   * <code>cycObject</code> exists in the KB and is an instance of
   * <code>#$Relation</code>.
   *
   * @param cycObject the CycObject representation of a KB entity
   * @return an enum describing the existential status of the entity in the KB
   */
  public static KBStatus getStatus(CycObject cycObject) {
    return KBObjectFactory.getStatus(cycObject, RelationImpl.class);
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Relation#getArgIsa(int)
   */
  @Override
  public Collection<KBCollection> getArgIsa(int argPos) {
    return getArgIsa(argPos, "");
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Relation#getArgIsa(int, java.lang.String)
   */
  @Override
  public Collection<KBCollection> getArgIsa(int argPos, String ctxStr) {
    ContextImpl ctx;
    try {
      ctx = ContextImpl.get(ctxStr);
    } catch (Exception e){
      throw new IllegalArgumentException(e.getMessage(), e);
    }
    return getArgIsa(argPos, ctx);
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Relation#getArgIsa(int, com.cyc.kb.ContextImpl)
   */
  @Override
  public Collection<KBCollection> getArgIsa(int argPos, Context ctx) {
    int getPos = 3;
    int filter = argPos;
    int filtPos = 2;
    return this.<KBCollection>getValues(Constants.argIsa(), 1, getPos, filter, filtPos, ctx);
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Relation#addArgIsa(int, java.lang.String, java.lang.String)
   */
  @Override
  public Relation addArgIsa(int argPos, String colStr, String ctxStr) throws KBTypeException, CreateException {
    return addArgIsa(argPos, KBCollectionImpl.get(colStr), ContextImpl.get(ctxStr));
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Relation#addArgIsa(int, com.cyc.kb.KBCollection, com.cyc.kb.ContextImpl)
   */
  @Override
  public Relation addArgIsa(int argPos, KBCollection col, Context ctx) throws KBTypeException, CreateException {
    addFact(ctx, Constants.argIsa(), 1, (Object) argPos, (Object) col);
    return this;
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Relation#getArgGenl(int)
   */
  @Override
  public Collection<KBCollection> getArgGenl(int argPos) {
    return getArgGenl(argPos, "");
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Relation#getArgGenl(int, java.lang.String)
   */
  @Override
  public Collection<KBCollection> getArgGenl(int argPos, String ctxStr) {
    ContextImpl ctx;
    try {
      ctx = ContextImpl.get(ctxStr);
    } catch (Exception e){
      throw new IllegalArgumentException(e.getMessage(), e);
    }
    return getArgGenl(argPos, ctx);
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Relation#getArgGenl(int, com.cyc.kb.ContextImpl)
   */
  @Override
  public Collection<KBCollection> getArgGenl(int argPos, Context ctx) {
    int getPos = 3;
    int filter = argPos;
    int filtPos = 2;
    return this.<KBCollection>getValues(Constants.argGenl(), 1, getPos, filter, filtPos, ctx);
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Relation#addArgGenl(int, java.lang.String, java.lang.String)
   */
  @Override
  public Relation addArgGenl(int argPos, String colStr, String ctxStr) throws KBTypeException, CreateException {
    KBCollection c;
    try {
      c = KBCollectionImpl.get(colStr);
    } catch (KBApiException e){
      throw new IllegalArgumentException(e.getMessage(), e);
    }
    return addArgGenl(argPos, c, ContextImpl.get(ctxStr));
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Relation#addArgGenl(int, com.cyc.kb.KBCollection, com.cyc.kb.ContextImpl)
   */
  @Override
  public Relation addArgGenl(int argPos, KBCollection col, Context ctx) throws KBTypeException, CreateException {
    addFact(ctx, Constants.argGenl(), 1, (Object) argPos, (Object) col);
    return this;
  }

  //TODO: Add get/addInterArgIsa, get/addInterArgGenl
    
  /* (non-Javadoc)
   * @see com.cyc.kb.Relation#getArity()
   */
  @Override
  public Integer getArity() throws VariableArityException {
    Context ctx = Constants.uvMt();
    Collection<Integer> arityValues;
    try {
      arityValues = this.<Integer>getValues(Constants.arity(), 1, 2, ctx);
    } catch (IllegalArgumentException e) {
      throw new VariableArityException(this + " do not have an Integer arity.  Try using minArity and maxArity instead.", e);
    }
    if (arityValues == null || arityValues.isEmpty()) {
      throw new IllegalArgumentException("There is no asserted arity for " + this);
    }
    return (Integer) arityValues.iterator().next();
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Relation#getArityMin()
   */
  @Override
  public Integer getArityMin() {
    try {
      Context ctx = Constants.uvMt();
      String command = SubLAPIHelper.makeSubLStmt(WITH_MT, ctx.getCore(),
              SubLAPIHelper.makeNestedSubLStmt("min-arity", this.getCore()));
      Object object = CycAccessManager.get().getCurrentAccess().converse().converseObject(command);
      if (object == null || object.equals(CycObjectFactory.nil)) {
        throw new IllegalArgumentException("No known min-arity for " + this);
      } else {
        return (Integer) object;
      }
    } catch (CycConnectionException e) {
      throw new KBApiRuntimeException(e.getMessage(), e);
    }
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Relation#getArityMax()
   */
  @Override
  public Integer getArityMax() {
    try {
      Context ctx = Constants.uvMt();
      String command = SubLAPIHelper.makeSubLStmt(WITH_MT, ctx.getCore(),
              SubLAPIHelper.makeNestedSubLStmt("max-arity", this.getCore()));
      Object object = CycAccessManager.get().getCurrentAccess().converse().converseObject(command);
      if (object == null || object.equals(CycObjectFactory.nil)) {
        throw new IllegalArgumentException("No known max-arity for " + this);
      } else {
        return (Integer) object;
      }
    } catch (CycConnectionException e) {
      throw new KBApiRuntimeException(e.getMessage(), e);
    }
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Relation#setArity(int)
   */
  @Override
  public Relation setArity(int arityValue) throws KBTypeException, CreateException {
    addFact(Constants.uvMt(), Constants.arity(), 1, arityValue);
    return this;
  }

  /**
   * This is not part of the KB API.
   *
   * @return
   */
  @Override
  String getTypeString() {
    return getClassTypeString();
  }

  /**
   * Get the string representation of the KB type that this class corresponds
   * to.
   *
   * @return
   */
  public static String getClassTypeString() {
    return "#$Relation";
  }
}

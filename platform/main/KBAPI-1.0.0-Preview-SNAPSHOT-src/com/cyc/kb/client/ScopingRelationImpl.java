/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
import com.cyc.kb.ScopingRelation;
import com.cyc.kb.KBAPIEnums.LookupType;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KBTypeException;



/**
 *
 * @author vijay
 */
public class ScopingRelationImpl extends RelationImpl implements ScopingRelation {
  
    private static final DenotationalTerm TYPE_CORE =
          new CycConstant("LogicalConnective", new Guid("bd58b9f9-9c29-11b1-9dad-c379636f7270"));

  static DenotationalTerm getClassTypeCore() {
    return TYPE_CORE;
  }
  
  /**
   * default constructor, calls the default super constructor
   *
   * @throws Exception
   */
  protected ScopingRelationImpl() {
    super();
  }

  
  protected ScopingRelationImpl(CycObject cycScopingRel) throws KBTypeException {
    super(cycScopingRel);
  }

  
  public ScopingRelationImpl(String scopingRelStr) throws KBTypeException, CreateException {
    super(scopingRelStr);
  }

  
  public ScopingRelationImpl (String scopingRelStr, LookupType lookup) throws KBTypeException, CreateException {
    super(scopingRelStr, lookup);
  }
  
  
  public static ScopingRelationImpl get(String nameOrId) throws KBTypeException, CreateException {
    return KBObjectFactory.get(nameOrId, ScopingRelationImpl.class);
  }

  
  @SuppressWarnings("deprecation")
public static ScopingRelationImpl get(CycObject object) throws KBTypeException, CreateException {
    return KBObjectFactory.get(object, ScopingRelationImpl.class);
  }

  
  public static ScopingRelationImpl findOrCreate(String nameOrId) {
    throw new UnsupportedOperationException("Creation of new Quantifiers is not allowed.  Please use a get method.");
  }

  /**
   * The KBAPI does not support the creation of new quantifiers. The
   * <code>get</code> methods on quantifiers should be used to retrieve existing quantifiers.
   * @deprecated Creation of new quantifiers is not supported in the KBAPI.
   */
  public static ScopingRelationImpl findOrCreate(CycObject object) {
    throw new UnsupportedOperationException("Creation of new Quantifiers is not allowed.  Please use a get method.");
  }

  
  public static boolean existsAsType(String nameOrId) {
    return getStatus(nameOrId).equals(KBStatus.EXISTS_AS_TYPE);
  }

  
  public static boolean existsAsType(CycObject object) {
    return getStatus(object).equals(KBStatus.EXISTS_AS_TYPE);
  }

  
  public static KBStatus getStatus(String nameOrId) {
    return KBObjectFactory.getStatus(nameOrId, ScopingRelationImpl.class);

  }

  
  public static KBStatus getStatus(CycObject object) {
    return KBObjectFactory.getStatus(object, ScopingRelationImpl.class);
  }

  @Override
  protected String getTypeString() {
    return "#$ScopingRelation";
  }
}

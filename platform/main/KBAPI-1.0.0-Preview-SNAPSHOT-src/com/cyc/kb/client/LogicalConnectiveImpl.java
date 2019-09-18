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

import com.cyc.base.cycobject.Guid;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.kb.KBAPIEnums;
import com.cyc.kb.KBStatus;
import com.cyc.kb.LogicalConnective;
import com.cyc.kb.KBAPIEnums.LookupType;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KBTypeException;


/**
 *
 * @author vijay
 */
public class LogicalConnectiveImpl extends RelationImpl implements LogicalConnective {
  
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
  @SuppressWarnings("unused")
private LogicalConnectiveImpl() {
    super();
  }

  
  protected LogicalConnectiveImpl(CycObject cycLogicalConn) throws KBTypeException {
    super(cycLogicalConn);
  }

  
  public LogicalConnectiveImpl(String logicalConnStr) throws KBTypeException, CreateException {
    super(logicalConnStr);
  }

  
  public LogicalConnectiveImpl (String logicalConnStr, LookupType lookup) throws KBTypeException, CreateException {
    super(logicalConnStr, lookup);
  }
  
  public static LogicalConnectiveImpl get(String nameOrId) throws KBTypeException, CreateException {
    return KBObjectFactory.get(nameOrId, LogicalConnectiveImpl.class);
  }

  @SuppressWarnings("deprecation")
public static LogicalConnectiveImpl get(CycObject object) throws KBTypeException, CreateException {
    return KBObjectFactory.get(object, LogicalConnectiveImpl.class);
  }

  @Deprecated
  public static LogicalConnectiveImpl findOrCreate(String nameOrId) {
    throw new UnsupportedOperationException("Creation of new Quantifiers is not allowed.  Please use a get method.");
  }

  @Deprecated
  public static LogicalConnectiveImpl findOrCreate(CycObject object) {
    throw new UnsupportedOperationException("Creation of new Quantifiers is not allowed.  Please use a get method.");
  }

  public static boolean existsAsType(String nameOrId) {
    return getStatus(nameOrId).equals(KBStatus.EXISTS_AS_TYPE);
  }

  public static boolean existsAsType(CycObject object) {
    return getStatus(object).equals(KBStatus.EXISTS_AS_TYPE);
  }

  public static KBStatus getStatus(String nameOrId) {
    return KBObjectFactory.getStatus(nameOrId, LogicalConnectiveImpl.class);

  }

  public static KBStatus getStatus(CycObject object) {
    return KBObjectFactory.getStatus(object, LogicalConnectiveImpl.class);
  }

  @Override
  protected String getTypeString() {
    return "#$LogicalConnective";
  }
}

package com.cyc.kb;

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

/**
 * An enumeration describing the existential status of a KB entity, and its
 * compatibility with a particular semantic object type.
 * 
 * @author nwinant
 */
public enum KBStatus {
  EXISTS_AS_TYPE, 
  EXISTS_WITH_COMPATIBLE_TYPE, 
  EXISTS_WITH_TYPE_CONFLICT,
  DOES_NOT_EXIST;
}

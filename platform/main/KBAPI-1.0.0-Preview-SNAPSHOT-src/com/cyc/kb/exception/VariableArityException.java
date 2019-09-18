package com.cyc.kb.exception;

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

import com.cyc.kb.client.RelationImpl;

/**
 * Thrown when the arity a Relation having multiple arity is requested.
 * For multi-arity relations, {@link RelationImpl#getArityMin()} and {@link RelationImpl#getArityMax()}
 * methods should be used. 
 * 
 * @author Dave Schneider
 * @version $Id: VariableArityException.java 151340 2014-05-19 15:55:29Z vijay $
 */
public class VariableArityException extends KBApiRuntimeException {

    public VariableArityException(String message) {
        super(message);
    }

    public VariableArityException(String message, Throwable cause) {
        super(message, cause);
    }
    
}

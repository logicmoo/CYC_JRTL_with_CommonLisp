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

/**
 * Thrown when an entity exists in the KB, but is incompatible with a particular
 * semantic object type. The difference between this exception and
 * <code>KBTypeException</code> is that in this case, the KB entity cannot be
 * turned into the expected by addition of assertions--instead, there is an
 * existing assertion on the KB entity that specifically conflicts with the
 * desired type. In contrast, a
 * <code>KBTypeException</code> signals that the KB entity is not of the desired
 * type, but does not signal that there is a conflict between some existing
 * assertion and the desired type. For a simple
 * <code>KBTypeException</code>, it is possible that simply adding more
 * assertions will turn the KB entity into the desired type of entity.
 *
 * @author Nathan Winant
 * @version $Id: KBTypeConflictException.java 150832 2014-04-30 16:02:51Z jmoszko $
 */
public class KBTypeConflictException extends KBTypeException {

    public KBTypeConflictException(Throwable cause) {
        super(cause);
    }

    public KBTypeConflictException(String msg) {
        super(msg);
    }

    public KBTypeConflictException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

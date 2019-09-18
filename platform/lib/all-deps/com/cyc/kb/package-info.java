/**
 * Provides basic functionality for manipulating CycL-based java objects, both
 * for the purpose of making assertions and for running queries.
 *
 * To use the KB API, you first need to ensure access to a Cyc server,
 * which is done by calling
 * {@link org.opencyc.api.CycAccess#setCurrent(org.opencyc.api.CycAccess)} with
 * a
 * <code>CycAccess</code> pointing to a live Cyc server. Because
 * <code>setCurrent</code> sets a thread-local variable, any threads using the KB API
 * need to call
 * <code>setCurrent</code> before doing anything that might need to access a Cyc
 * server. In practice, this means that any non-UI threads spawned in a KB API
 * application need to call
 * <code>setCurrent</code> before anything else happens in the thread. Because
 * methods accessing a Cyc server may not return instantaneously, developers are
 * strongly advised to avoid using KB API methods inside AWT threads (or
 * any threads on which a UI is critically dependent).
 * <p>
 * The underlying API throws IOException and UnknownHostExeception to indicate
 * some arbitrary IO issue and Cyc server not being at the specified location
 * respectively. In the KB API both of these exceptions are wrapped under 
 * KBAPIRuntimeException throughout the API and the cause field is set appropriately.
 * 
 * <p>
 * The main uses of the KB API fall into two broad categories: (a) making
 * terms and assertions, and (b) running queries. In order to get the terms
 * needed for making either assertions or queries, the static factory methods
 * (<code>get</code> and <code>findOrCreate</code>) for the relevant classes
 * should be called. These factory methods will retrieve the relevant object from the
 * KB, and can be set to create the object on the Cyc server if it doesn't
 * already exist on the server.
 * <p>
 * Once the objects exists, constructors for {@link com.cyc.kb.client.FactImpl} and
 * {@link com.cyc.kb.client.AssertionImpl} can be used to create the actual
 * assertions. The KB API generally allow the creation and retrieval of Cyc
 * KB objects (KBIndividuals, KBCollections, Facts, etc.) from a variety of forms
 * including their string representations, their IDs, and from the objects that
 * will comprise them. In many cases there are additional deprecated
 * methods that accept objects from the
 * {@link org.opencyc.cycobject} class hierarchy. The string-based constructors
 * for
 * <code>Assertion</code> and <Query> and their subclasses are a convenient way
 * to create assertions and queries without needing to first create the
 * <code>KBCollection</code> and
 * <code>KBIndividual</code> objects, but they do require correct syntax, and the
 * terms must already exist on the Cyc server.
 * <p>
 * The API provides many methods that take String as inputs. This leads to most
 * methods having CreateException and KBTypeException. To limit the exceptions on
 * method signature, we wrap them in IllegalArgumentException. This is done only to
 * the methods where to focus is not the creation of a new term. 
 * <p>
 * All factory methods throw some exception under CreateException and KBTypeException.
 * To see the possible exceptions under the above exceptions, see {@link com.cyc.kb.client.StandardKBObject}
 * or the description of subclasses of the exceptions. 
 * <p>
 * The {@link com.cyc.kb.Query} class provides the main functionality for
 * running queries. Additional query-related functionality (e.g. constructing
 * queries from natural language, exporting results to different formats, etc.)
 * is available in the {@link com.cyc.km.query} package.
 * <p>
 * In most cases, the KB API includes methods that specify a context and
 * similar methods that don't require a context parameter. The KB API will
 * use a sensible default when no context parameter is specified
 * (typically, <code>#$InferencePSC</code> for queries). Future version of the
 * API will include methods to specify default contexts.
 * <p>
 * The current implementation of the KB API stores {@link org.opencyc.cycobject.CycObject}s
 * as the core of each <code>KBObject</code>.  The <code>CycObject</code>
 * can generally be retrieved from each <code>KBObject</code> via the <code>getCore()</code> method.
 * This is useful for cases where lower-level APIs are necessary (e.g. using methods from the
 * {@link org.opencyc.api.CycAccess} class directly).
 *
 *
 * 
 */
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

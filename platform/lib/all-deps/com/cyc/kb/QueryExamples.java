package com.cyc.kb;

/*
 * #%L
 * Query API
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import com.cyc.base.CycAccessManager;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.cycobject.ArgPosition;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.inference.InferenceAnswer;
import com.cyc.base.inference.InferenceStatus;
import com.cyc.base.inference.InferenceSuspendReason;
import com.cyc.base.inference.InferenceWorker;
import com.cyc.base.inference.InferenceWorkerListener;
import com.cyc.base.justification.Justification;
import com.cyc.base.justification.Justification.Node;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycGuid;
import com.cyc.baseclient.inference.DefaultInferenceStatus;
import com.cyc.baseclient.justification.JustificationWalker;
import com.cyc.baseclient.ui.InteractiveCycAccessProvider;
import com.cyc.kb.config.KBAPIConfiguration;
import com.cyc.km.query.construction.QuerySearchExamples;
import com.cyc.km.query.construction.QuerySearch;
import com.cyc.km.modeling.task.CycBasedTask;
import com.cyc.xml.query.ProofViewJustification;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.bind.JAXBException;

import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.TextExtractor;

//import org.opencyc.api.CycAccess;
//import org.opencyc.cycobject.ArgPosition;
//import org.opencyc.cycobject.CycConstant;
//import org.opencyc.cycobject.CycDenotationalTerm;
//import org.opencyc.cycobject.CycFormulaSentence;
//import org.opencyc.cycobject.CycVariable;
//import org.opencyc.cycobject.Guid;
//import org.opencyc.inference.InferenceAnswer;
//import org.opencyc.inference.InferenceStatus;
//import org.opencyc.inference.InferenceSuspendReason;
//import org.opencyc.inference.InferenceWorker;
//import org.opencyc.inference.InferenceWorkerListener;
//import org.opencyc.justification.Justification;
//import org.opencyc.justification.Justification.Node;
//import org.opencyc.justification.JustificationWalker;
//import org.opencyc.util.Hierarchy;
//import org.opencyc.util.Hierarchy.HierarchyComparator;

/**
 * Sample code for working with queries. Builds on query search in
 * {@link QuerySearchExamples}.
 *
 * @author baxter
 * @todo figure out if these should be excluded from the JavaDoc and instead
 * made available some other way. They're not really part of the API, so having
 * them in the JavaDoc and the JAR is a little strange.
 */
public class QueryExamples {

    public static void main(String[] args) {
        final Set<Query> queriesToClose = new HashSet<Query>();
        int exitStatus = 0;
        try {
            KBAPIConfiguration.setShouldTranscriptOperations(false);
            queriesToClose.add(demonstrateIncrementalResultsQuery());
            querySearch = QuerySearchExamples.getQuerySearch();
            final Set<Query> fragments = getFragments();
            final Query combinedQuery = combineFragments(fragments);
            combinedQuery.retainInference();//So we can display justification.
            queriesToClose.add(combinedQuery);//To free inference resources afterwards.
            getAndDisplayCandidateReplacements(combinedQuery, termToReplace);
            displayQueryBindings(combinedQuery);
            displayAnswerJustification(combinedQuery);
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
            exitStatus = -1;
        } finally {
            for (final Query query : queriesToClose) {
                try {
                    query.close();
                } catch (Exception ex) {
                    ex.printStackTrace(System.err);
                    continue;
                }
            }
        }
        System.exit(exitStatus);
    }

    /**
     * Get the query fragments we want to work with.
     *
     * @return the query fragments
     * @throws Exception
     * @throws JAXBException
     */
    public static Set<Query> getFragments() throws Exception, JAXBException {
        final Set<Query> fragments = new HashSet<Query>();
//        queryParaphraser.setBlanksForVars(true);
        for (final Query query : querySearch.getQueries()) {
//            final String queryString = queryParaphraser.paraphrase(query).getString();
            for (final String fragmentString : fragmentStrings) {
                if (true) {
//                if (queryString.contains(fragmentString)) {
                    System.out.println("Found " + query);
                    fragments.add(query);
                    break;
                }
            }
        }
        if (fragments.size() != expectedFragmentCount) {
            throw new RuntimeException(
                    "Expected " + expectedFragmentCount + " query fragments, got " + fragments);
        }
        return fragments;
    }

    /**
     * Combine multiple query fragments into a conjunctive query.
     *
     * @param fragments
     * @return the new query
     * @throws Exception
     */
    public static Query combineFragments(final Set<Query> fragments) throws Exception {
        Query combinedQuery = null;
        for (final Query query : fragments) {
            if (combinedQuery == null) {
                combinedQuery = query;
            } else {
                combinedQuery = combinedQuery.merge(query);
            }
        }
        System.out.println("Combined query:\n " + combinedQuery.toString());
        return combinedQuery;
    }

    /**
     * Show candidate replacements for the specified term.
     *
     * @param query a query in which the term occurs
     * @param term the term to replace
     * @throws Exception
     */
    public static void getAndDisplayCandidateReplacements(final Query query,
            final Object term) throws Exception {
        final FormulaSentence querySentence = query.getQuerySentenceCyc();
        final ArgPosition argPosition = querySentence.getFirstArgPositionForTerm(
                term);
        final CycBasedTask task = querySearch.getTask();
        final List<Object> candidateReplacements =
                task.getCandidateReplacements(querySentence, argPosition);
        System.out.println("Found " + candidateReplacements.size() + " candidate replacements for "
               + termToReplace + ":");


        System.out.println("=========== Building Hierarchy ==============");

    }


    /**
     * Display the variable bindings found for the specified query.
     *
     * @param query
     * @throws IOException
     * @throws CycConnectionException 
     */
    public static void displayQueryBindings(final Query query) throws IOException, CycConnectionException {
        System.out.println("Combined query answers:\n ");
        final Collection<CycVariableI> queryVars = query.getQueryVariablesCyc();
        System.out.print("Variables:");
        for (final CycVariableI var : queryVars) {
            System.out.print("\t" + var);
        }
        System.out.println();
        for (int i = 0; i < query.getAnswerCount(); i++) {
            final InferenceAnswer answer = query.getAnswer(i);
            final Map<CycVariableI, Object> bindings = answer.getBindings();
            System.out.print("Answer " + i + ": ");
            for (final CycVariableI var : queryVars) {
                final Object value = bindings.get(var);
//                final Paraphrase<? extends Object> paraphrase = termParaphraser.paraphrase(
//                        value);
                System.out.print("\t" + value);
            }
            System.out.println();
        }
    }

    /**
     * Display a justification for one answer.
     *
     * @param query
     * @throws CycConnectionException 
     * @throws CycTimeOutException 
     * @throws CycApiException 
     * @throws IOException
     * @throws JAXBException
     */
    public static void displayAnswerJustification(final Query query) 
    		throws CycApiException, CycTimeOutException, CycConnectionException, IOException {
        final Justification justification = new ProofViewJustification(query.getAnswer(
                0));
        justification.populate();
        displayJustification(justification);
    }

    /**
     * Display one node in the justification tree.
     *
     * @param node
     * @throws IOException
     */
    public static void displayJustificationNode(final Node node) throws IOException {
        final StringBuilder renderer = new StringBuilder();
        // Indent according to node's depth:
        for (int i = 0; i < node.getDepth(); i++) {
            renderer.append(' ');
        }
        // Render initially hidden nodes with parens:
        final boolean expandInitially = node.isExpandInitially();
        if (!expandInitially) {
            renderer.append('(');
        }
        // Render the node's HTML, or the label:
        final String html = node.getHTML();
        if (html == null || html.isEmpty()) {
            final String label = node.getLabel();
            if (label != null) {
                renderer.append(label);
            }
        } else {
            // Render HTML as text:
            new TextExtractor(new Source(html)).appendTo(renderer);
        }
        if (!expandInitially) {
            renderer.append(')');
        }
        System.out.println(renderer);
    }

    public static void displayJustification(final Justification justification) throws IOException {
        System.out.println("\n============= Justification ================");
        for (final JustificationWalker walker = new JustificationWalker(
                justification); walker.hasNext();) {
            displayJustificationNode(walker.next());
        }
    }

    /**
     * Demonstrate handling of incremental query results.
     *
     * @return the query
     * @throws IOException
     * @throws CycConnectionException 
     * @throws CycApiException 
     * @throws CycTimeOutException 
     */
    private static Query demonstrateIncrementalResultsQuery() throws IOException, CycTimeOutException, CycApiException, CycConnectionException {
        // A query that should get lots of results, not all at once:
        final Query query = new Query("(#$and \n"
                + "(#$integerBetween 1 ?N 10000) \n"
                + "(#$isa ?N #$PrimeNumber))");
        query.setMaxTime(30);
        query.setMaxNumber(null);
        // Add a listener that will handle important inference events:
        query.addListener(new InferenceWorkerListener() {
            @Override
            public void notifyInferenceCreated(InferenceWorker inferenceWorker) {
                System.out.println("Created " + query);
            }

            @Override
            public void notifyInferenceStatusChanged(InferenceStatus oldStatus, InferenceStatus newStatus, InferenceSuspendReason suspendReason, InferenceWorker inferenceWorker) {
                System.out.println("Inference status changed from " + oldStatus + " to " + newStatus);
                if (DefaultInferenceStatus.SUSPENDED.equals(newStatus)) {
                    System.out.println("Suspend reason: " + suspendReason);
                }
            }

            @Override
            public void notifyInferenceAnswersAvailable(InferenceWorker inferenceWorker, List newAnswers) {
                int answerCount = 0;
				try {
					answerCount = query.getAnswerCount();
				} catch (CycApiException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (CycTimeOutException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (CycConnectionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("New answers! Query now has " + answerCount + " answers.");
				if (answerCount >= 1000) {
				    System.out.println("Got enough answers. Terminating query.");
				    query.stop(null);
				}
            }

            @Override
            public void notifyInferenceTerminated(InferenceWorker inferenceWorker, Exception e) {
                System.out.println("Query terminated.");
            }

        });
        // Start the inference. This won't return until the inference terminates:
        query.performInference();
        return query;
    }

    /**
     * Helper class that organizes paraphrases of Cyc terms into hierarchies
     * according to genls.
     */

    static {
        CycAccessManager.get().setCurrentAccess(
        		InteractiveCycAccessProvider.get().getAccess("localhost", 3600));
    }
    private static QuerySearch querySearch = null;
    private static final int expectedFragmentCount = 3;
    private static final String[] fragmentStrings = {"Natural gas is sold by",
        "sells natural gas", "The ticker symbol for", "is a publicly held corporation"};
    static CycConstantI termToReplace = new CycConstant("NaturalGas", new CycGuid(
            "bd59004a-9c29-11b1-9dad-c379636f7270"));
}

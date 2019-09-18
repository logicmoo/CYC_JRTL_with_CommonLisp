package com.cyc.km.modeling.task;

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

import com.cyc.base.CycAccess;
import com.cyc.base.CycAccessManager;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.ArgPosition;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.Naut;
import com.cyc.kb.client.Constants;
import com.cyc.kb.Fact;
import com.cyc.kb.KBObject;
import com.cyc.kb.KBIndividual;
import com.cyc.kb.Query;
import com.cyc.kb.client.KBCollectionImpl;
import com.cyc.kb.client.KBIndividualImpl;
import com.cyc.kb.client.KBPredicateImpl;
import com.cyc.kb.exception.KBApiException;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;

/**
 * A class to represent tasks that involve interaction with Cyc.
 *
 * @author baxter
 * @todo consider adding a way to make up a new task
 * @todo explain what pieces of information need to be asserted on a task for it
 * to be useful (e.g. via sharedNotes in KB).
 * @todo consider adding assignCyclist to add a cyclist to a task (and reflect
 * immediately into the KB).
 * @todo how do I find out what tasks a user is assigned to? That should perhaps
 * be a static method on this class.
 */
public class CycBasedTask {

    /**
     * Returns a collection of all known Cyc-based tasks.
     *
     * @return the collection of tasks.
     * @throws Exception if something goes wrong.
     */
    static public Collection<CycBasedTask> getAll() throws Exception {
        final Collection<CycBasedTask> tasks = new HashSet<CycBasedTask>();
        for (final KBIndividual task : KBCollectionImpl.get("CAEAnalysisTask").
                <KBIndividual>getInstances(EVERYTHING_PSC)) {
            tasks.add(new CycBasedTask(task));
        }
        return tasks;
    }

    /**
     * Constructs a new task, backed by the specified term. Note that this does
     * not create a new task in the KB, but just creates a new CycBasedTask
     * object based on an existing <code>KBIndividual</code> in the Knowledge Base.
     *
     * @param taskTerm the KBIndividual representing this task.
     */
    public CycBasedTask(KBIndividual taskTerm) {
        this.taskTerm = taskTerm;
        try {
            initializeConstants();
        } catch (Exception ex) {
            throw new RuntimeException("Failed to initialize task constants.", ex);
        }
    }

    /**
     * Returns the KBIndividual representing this task.
     *
     * @return the KBIndividual representing this task.
     */
    public KBIndividual getTaskTerm() {
        return taskTerm;
    }

    @Override
    public String toString() {
        return "TASK " + getTaskTerm();
    }

    /**
     * Returns a text description of the task. This description, derived from the KB <Individual> underlying the task,
     * is typically about one sentence, but may be arbitrarily long.
     *
     * @return the description, or null if there is no description available from Cyc.
     * @throws KBApiException 
     */
    public String getDescription() throws KBApiException {
        final Collection<Fact> facts = taskTerm.getFacts(KBPredicateImpl.get("specificationDescription"), 
            1, Constants.everythingPSCMt());
        if (facts != null && !facts.isEmpty()) {
            return facts.iterator().next().<String>getArgument(2);
        } else {
            return null;
        }
    }

    /**
     * Returns a brief (typically less than one sentence) description of the task.
     *
     * @return the summary
     * @throws Exception 
     */
    public String getSummary() throws Exception {
        return taskTerm.toNLString();
    }

    /**
     * Returns a collection of Cyclists assigned to this task
     *
     * @return the collection of Cyclists
     * @throws KBApiException
     */
    public Collection<KBIndividual> getAssignedCyclists() throws KBApiException  {
        synchronized (cyclists) {
            if (cyclists.contains(null)) {
                cyclists.clear();
                for (final Fact fact : taskTerm.getFacts(KBPredicateImpl.get("allottedAgents"), 1, Constants.everythingPSCMt())) {
                    cyclists.add(fact.<KBIndividual>getArgument(2));
                }
            }
        }
        return cyclists;
    }

    /**
     * Returns a collection of concepts particularly relevant to this task
     *
     * @return the collection of key concepts.
     * @throws Exception if something goes wrong.
     */
    public Collection<KBObject> getKeyConcepts() throws Exception {
        synchronized (concepts) {
            if (concepts.contains(null)) {
                for (final Fact fact : taskTerm.getFacts(KBPredicateImpl.get("topicOfIndividual"), 1, Constants.everythingPSCMt())) {
                    final KBObject concept = fact.getArgument(2);
                    if (!(concept instanceof KBIndividual && getAssignedCyclists().contains(
                            (KBIndividual) concept))) {
                        concepts.add(concept);
                    }
                }
            }
        }
        return concepts;
    }

    /**
     * Returns a list of task-relevant candidate replacement terms.
     *
     * @param querySentence - The sentence in which the focal term appears.
     * @param argPosition - The arg position of the focal term in the sentence.
     * @return KBCollection of candidate replacement terms.
     * @throws IOException if there is a problem talking to Cyc
     * @throws CycApiException if Cyc has a problem computing the result
     * @throws RuntimeException if there is some other kind of problem
     * @throws CycConnectionException 
     * @todo consider moving this to the Query class, since the Query is the
     * more focal
     */
    public List<Object> getCandidateReplacements(
            FormulaSentence querySentence,
            ArgPosition argPosition) throws IOException, CycApiException, RuntimeException, CycConnectionException {
        try {
            return querySentence.getCandidateReplacements(argPosition, getGuidanceMt(),
                    getCyc());
        } catch (KBApiException ex) {
            throw new RuntimeException(ex);
        } catch (JAXBException ex) {
            throw new RuntimeException(ex);
        }
    }

    static private CycAccess getCyc() {
        return CycAccessManager.get().getCurrentAccess();
    }

    private Fort getFort() throws CycApiException, IOException, CycConnectionException {
        return getCyc().getLookupTool().getKnownFortByName(
                getTaskTerm().toString());
    }

    private Object getSingleAnswerQueryValue(final String queryName,
            final Object defaultAnswer) throws KBApiException, IOException,
            CycApiException, JAXBException, CycConnectionException {
        final Query query = Query.load(KBIndividualImpl.get(queryName));
        Map<CycObject, Object> substitutions = new HashMap<CycObject, Object>();
        final Fort taskTermFort = getFort();
        substitutions.put(taskIndexical, taskTermFort);
        query.substituteTermsWithCycObject(substitutions);
        query.setMaxNumber(1);
        return query.getAnswerCount() >= 1
                ? query.getAnswer(0).getBindings().values().iterator().next()
                : defaultAnswer;
    }

    private synchronized ELMt getGuidanceMt() throws IOException, KBApiException,
            CycApiException, JAXBException, CycConnectionException {
        if (guidanceMt == null) {
            guidanceMt = getCyc().getObjectTool().makeELMt(getSingleAnswerQueryValue(
                    "CAEGuidanceMtQuery", defaultInferenceMt));
        }
        return guidanceMt;
    }

    private static synchronized void initializeConstants() throws IOException, CycApiException, CycConnectionException {
        if (defaultInferenceMt == null) {
            defaultInferenceMt = getCyc().getObjectTool().makeELMt(getCyc().getLookupTool().getKnownConstantByName(
                    "CurrentWorldDataCollectorMt-NonHomocentric"));
        }
    }
    private final KBIndividual taskTerm;
    private final Collection<KBIndividual> cyclists = new HashSet<KBIndividual>(Arrays.asList(
            (KBIndividual) null));
    private final Collection<KBObject> concepts = new HashSet<KBObject>(Arrays.asList(
            (KBObject) null));
    private static final String EVERYTHING_PSC = "EverythingPSC";
    static private final Naut taskIndexical = getCyc().getObjectTool().makeCycNaut(
            "(#$IndexicalReferentFn #$CAETask-Indexical)");
    static private ELMt defaultInferenceMt = null;
    private ELMt guidanceMt = null;
}

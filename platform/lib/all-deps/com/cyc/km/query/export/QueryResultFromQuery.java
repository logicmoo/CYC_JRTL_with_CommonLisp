/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.km.query.export;

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

import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.cycobject.CycVariableI;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.inference.InferenceAnswer;
import com.cyc.base.inference.InferenceIdentifier;
import com.cyc.baseclient.nl.Paraphrase;
import com.cyc.baseclient.nl.Paraphraser;
import com.cyc.kb.Query;
import com.cyc.xml.Answer;
import com.cyc.xml.Answers;
import com.cyc.xml.Binding;
import com.cyc.xml.Bindings;
import com.cyc.xml.QueryResult;
import com.cyc.xml.Value;

import java.math.BigInteger;

//import org.opencyc.cycobject.CycFormulaSentence;
//import org.opencyc.cycobject.CycVariable;
//import org.opencyc.inference.InferenceAnswer;
//import org.opencyc.inference.InferenceIdentifier;
//import org.opencyc.nl.Paraphrase;
//import org.opencyc.nl.Paraphraser;

/**
 *
 * @author baxter
 */
class QueryResultFromQuery extends QueryResult {

    public QueryResultFromQuery(final Query query) throws CycApiException, CycTimeOutException, CycConnectionException {
        this(query, Paraphraser.getInstance(Paraphraser.ParaphrasableType.KBOBJECT));
    }
    
     public QueryResultFromQuery(final Query query, final Paraphraser<Object> termParaphraser) 
    		 throws CycApiException, CycTimeOutException, CycConnectionException {
	        this.query = query;
	        this.termParaphraser = termParaphraser;
	        setAnswers(new Answers());
	    }
     
    private final Query query;
    private Paraphraser<Object> termParaphraser = Paraphraser.getInstance(Paraphraser.ParaphrasableType.DEFAULT);
    private Paraphraser sentenceParaphraser = Paraphraser.getInstance(Paraphraser.ParaphrasableType.FORMULA);

    protected void addAnswer(final InferenceAnswer answer) {
        getAnswers().getAnswer().add(new AnswerFromInferenceAnswer(answer));
    }

    private class AnswerFromInferenceAnswer extends Answer {

        public AnswerFromInferenceAnswer(final InferenceAnswer inferenceAnswer) {
            this.inferenceAnswer = inferenceAnswer;
            try {
	        final InferenceIdentifier inferenceIdentifier = query.getInferenceIdentifier();
	        setInference(BigInteger.valueOf(inferenceIdentifier.getInferenceID()));
	        setStore(BigInteger.valueOf(inferenceIdentifier.getProblemStoreID()));
	        setStatus(query.getStatus().toString());
                setId(BigInteger.valueOf(inferenceAnswer.getAnswerID()));
                final FormulaSentence answerSentence = query.getAnswerSentenceCyc(inferenceAnswer);
                setCycl(answerSentence.toString());
                final Paraphrase paraphrase = sentenceParaphraser.paraphrase((FormulaSentence) answerSentence);
                setNl((paraphrase == null) ? "NL not available" : paraphrase.getString());
                setBindings(new Bindings());
                for (final CycVariableI var : query.getQueryVariablesCyc()) {
                    getBindings().getBinding().add(new BindingFromInferenceAnswer(var));
                }
            } catch (Exception ex) {
                System.err.println("Caught exception creating answer for export:");
                ex.printStackTrace(System.err);
                throw new RuntimeException(ex);
            }
        }
        private final InferenceAnswer inferenceAnswer;

        private class BindingFromInferenceAnswer extends Binding {

            public BindingFromInferenceAnswer(final CycVariableI var) throws CycConnectionException {
                setVariable(var.toCanonicalString());
                final Object cycl = inferenceAnswer.getBinding(var);
                final Paraphrase paraphrase = termParaphraser.paraphrase(cycl);
                setValue(new Value());
                value.setCycl(cycl.toString());
                value.setNl((paraphrase == null) ? "NL not available" : paraphrase.getString());
            }
        }
    }
    
}

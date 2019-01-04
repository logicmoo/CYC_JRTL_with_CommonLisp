package org.appdapter.bind.rdf.jena.reason;

import java.util.Iterator;
import com.hp.hpl.jena.query.DatasetFactory;
import com.hp.hpl.jena.query.Dataset;
import java.util.List;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.StringReader;
import com.hp.hpl.jena.reasoner.Reasoner;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.reasoner.rulesys.GenericRuleReasoner;
import com.hp.hpl.jena.reasoner.rulesys.Rule;
import com.hp.hpl.jena.rdf.model.InfModel;
import com.hp.hpl.jena.rdf.model.Model;

public class JenaReasonerUtils
{
    public static InfModel createInferenceModelUsingGenericRules(final Model baseModel, final String ruleSet) {
        final Reasoner reasoner = (Reasoner)new GenericRuleReasoner(Rule.parseRules(ruleSet));
        final InfModel infModel = ModelFactory.createInfModel(reasoner, baseModel);
        return infModel;
    }

    public static InfModel createInferenceModelUsingGenericRulesWithMacros(final Model baseModel, final String ruleSetWithMacros) {
        final StringReader ruleStringReader = new StringReader(ruleSetWithMacros);
        final BufferedReader ruleBufferedReader = new BufferedReader(ruleStringReader);
        final Rule.Parser ruleParser = Rule.rulesParserFromReader(ruleBufferedReader);
        final List<Rule> ruleList = (List<Rule>)Rule.parseRules(ruleParser);
        final Reasoner reasoner = (Reasoner)new GenericRuleReasoner((List)ruleList);
        final InfModel infModel = ModelFactory.createInfModel(reasoner, baseModel);
        return infModel;
    }

    public static List parseRulesListAtURL(final String url) throws Throwable {
        return Rule.rulesFromURL(url);
    }

    public static Reasoner buildReasonerFromRulesAtURL(final String url) throws Throwable {
        final List ruleList = parseRulesListAtURL(url);
        final Reasoner reasoner = (Reasoner)new GenericRuleReasoner(ruleList);
        return reasoner;
    }

    public static InfModel makeInferredModel(final Model underModel, final Reasoner reasoner) {
        final InfModel infModel = ModelFactory.createInfModel(reasoner, underModel);
        return infModel;
    }

    public static Dataset makeInferredDataset(final Dataset underlyingDataset, final Reasoner reasoner) {
        final Dataset inferredDataset = DatasetFactory.create();
        final Model defModel = underlyingDataset.getDefaultModel();
        if (defModel != null) {
            final Model infDefModel = (Model)makeInferredModel(defModel, reasoner);
            inferredDataset.setDefaultModel(infDefModel);
        }
        final Iterator dni = underlyingDataset.listNames();
        while (dni.hasNext()) {
            final String name = (String) dni.next();
            final Model underModel = underlyingDataset.getNamedModel(name);
            final Model infModel = (Model)makeInferredModel(underModel, reasoner);
            inferredDataset.addNamedModel(name, infModel);
        }
        return inferredDataset;
    }
}

/*

	Total time: 14 ms

*/
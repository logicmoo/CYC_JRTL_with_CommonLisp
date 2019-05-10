
package eu.larkc.plugin.identify;

//import de.mpb.mpib.larkc.airhead.tools;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.ucla.sspace.common.DocumentVectorBuilder;
import edu.ucla.sspace.common.SemanticSpace;
import edu.ucla.sspace.common.SemanticSpaceIO;
import edu.ucla.sspace.common.Similarity;
import edu.ucla.sspace.text.StringDocument;
import edu.ucla.sspace.vector.DoubleVector;
import edu.ucla.sspace.vector.Vector;
import edu.ucla.sspace.vector.Vectors;

import eu.larkc.core.data.DataFactoryImpl;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.identify.Identifier;
import java.util.StringTokenizer;
import org.tartarus.snowball.ext.englishStemmer;
import java.util.Iterator;

public class LDSRIdentifier implements Identifier {

    private static Logger _log = LoggerFactory.getLogger(LDSRIdentifier.class);
    private boolean _hasIdentified = false;

    public LDSRIdentifier() {
    }

    @Override
    public Context createContext() {
        return null;
    }

    @Override
    public void initialise() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public URI getIdentifier() {
        return new URIImpl("urn:" + this.getClass().getName());
    }

    @Override
    public QoSInformation getQoSInformation() {
        // TODO Auto-generated method stub
        return null;
    }


    public static DoubleVector getQueryAsVector(String query, SemanticSpace termsSpace) {
        StringDocument sd = new StringDocument(query);
        DocumentVectorBuilder db = new DocumentVectorBuilder(termsSpace);
        double[] array = new double[termsSpace.getVectorLength()];
        DoubleVector queryAsVector = db.buildVector(sd.reader(), Vectors.asVector(array));
        return queryAsVector;
    }


    public static Map getSimilarities(DoubleVector queryAsVector, SemanticSpace docsSpace, String queryAsString) {

        Set alldocNames = docsSpace.getWords();
        Map cosinesMap = new LinkedHashMap();
        Iterator allDocsIterator = alldocNames.iterator();
        while (allDocsIterator.hasNext()) {
            String docName = (String) allDocsIterator.next();
            Vector oneDocumentInDocSpace = docsSpace.getVector(docName);
            double similarity = Similarity.cosineSimilarity(queryAsVector, oneDocumentInDocSpace);
            cosinesMap.put(docName, similarity);
        }
        allDocsIterator = null;
        alldocNames = null;
        return cosinesMap;
    }
 


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        _log.info("Starting Idenifier...");
        LDSRIdentifier identifier = new LDSRIdentifier();

        String sparqlQuery = "PREFIX dbp-ont: <http://dbpedia.org/ontology/> "
                + "PREFIX dbp-prop: <http://dbpedia.org/property/> "
                + "PREFIX skos: <http://www.w3.org/2004/02/skos/core#> "
                + "PREFIX dbpedia: <http://dbpedia.org/resource/> "
                + "PREFIX dbp-cat: <http://dbpedia.org/resource/Category:> "
                + "SELECT distinct ?Country ?City "
                + "WHERE {   ?Country dbp-ont:capital ?City . "
                + "?City skos:subject dbp-cat:Capitals_in_Europe . "
                + "?Country dbp-ont:governmenttype dbpedia:Parliamentary_republic .}";

        _log.info("Using '" + sparqlQuery + "' as input");

        SPARQLQuery inputQuery = DataFactoryImpl.INSTANCE.createSPARQLQuery(sparqlQuery);

        _log.info("Beginning identification...");

        Collection<InformationSet> results = identifier.identify(inputQuery, null, null);

        if (results != null) {
            for (InformationSet set : results) {
                _log.info(set.toString());
            }
        }

        System.out.println("Finished in " + (System.currentTimeMillis() - startTime) + " ms");
    }

    @Override
    public Collection<InformationSet> identify(Query theQuery,
            Contract contract, Context context) {

        if (_hasIdentified) {
            return null;
        }

        Collection<InformationSet> result = new HashSet<InformationSet>();

        if (!(theQuery instanceof SPARQLQuery)) {
            return result;
        }

        String queryAsString = theQuery.toString();
        queryAsString = QueryProcessor.getKeywordsFromQuery(queryAsString);
        queryAsString = stemmQueryTokens(queryAsString);
        _log.error("Stemmed query: " + queryAsString);


/// Ralph's code

	try {
            queryAsString = "anarch polit london";
            long start = System.currentTimeMillis();
            // load the terms space
            SemanticSpace termsSpace = SemanticSpaceIO.load("/lustre/ws2/ws/larkques-mpi-ri-0/spacesplitbinary/convertedterms1000.sspace_1_of_1.bin");
            long elapsedTimeMillis = System.currentTimeMillis() - start;
            float elapsedTimeSec = elapsedTimeMillis / 1000F;
            System.out.println("--Took " + elapsedTimeSec + " seconds to load terms file convertedterms1000.sspace_1_of_1.bin");
            DoubleVector queryAsVector = /*CosinesSimilaritiesForAirhead.*/getQueryAsVector(queryAsString, termsSpace);

            // map to hold all part maps:
            Map finalMap = new LinkedHashMap();

            // get the doc files in the split space directory:
            // File dir = new File("/media/1TBextension/ralph/ri/airhead/spacesforalex/sspace");
            File dir = new File("/lustre/ws2/ws/larkques-mpi-ri-0/spacesplitbinary");
            FilenameFilter filter = new FilenameFilter() {

                public boolean accept(File dir, String name) {
                    return name.startsWith("converteddoc");
                }
            };
            String[] children = dir.list(filter);
            for (Object o : children) {
                System.out.println("Loading " + (String) o);
                // load the documents space
                start = System.currentTimeMillis();
                SemanticSpace docsSpace = SemanticSpaceIO.load("/lustre/ws2/ws/larkques-mpi-ri-0/spacesplitbinary/" + ((String) o));
                elapsedTimeMillis = System.currentTimeMillis() - start;
                elapsedTimeSec = elapsedTimeMillis / 1000F;
                System.out.println("Took " + elapsedTimeSec + " seconds to load " + (String) o);
                start = System.currentTimeMillis();
                finalMap.putAll(/*CosinesSimilaritiesForAirhead.*/getSimilarities(queryAsVector, docsSpace, queryAsString));
                elapsedTimeMillis = System.currentTimeMillis() - start;
                elapsedTimeSec = elapsedTimeMillis / 1000F;
                System.out.println("--Took " + elapsedTimeSec + " seconds to get the cosines for " + (String) o);

                docsSpace = null;
                //System.out.println("Processed  " + (String) o);
            }
            System.out.println("Final map has " + finalMap.size() + " entries ...");
        } catch (IOException ex) {
	        System.out.println(ex);
        }

/// Ralph's code



        _hasIdentified = true;

        return result;
    }

    public static String stemmQueryTokens(String tokens) {
        String[] tokenizedSentence = tokens.split("\\s+");
        StringBuffer sb = new StringBuffer();
        englishStemmer english = new englishStemmer();
        // check if we have just one tokens or a sentence ...
        if (tokenizedSentence.length > 1) {
            for (int i = 0; i < tokenizedSentence.length; i++) {
                english.setCurrent(tokenizedSentence[i]);
                english.stem();
                sb.append(english.getCurrent() + " ");
            }
            tokens = sb.toString().trim();
        } else {
            english.setCurrent(tokens);
            english.stem();
            tokens = english.getCurrent();
        }



        return tokens;
    }

    /**
     *  Converts a String query into an Object (DoubleVector) suitable for
     * further processing using the Airhead API;
     *
     * @param query   the string to be converted
     * @param termsSpace the sspace file containing the term vectors
     *
     * @return an Object of type DoubleVector;
     */

}

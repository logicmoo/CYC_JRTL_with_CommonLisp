/*
   This file is part of the LarKC platform
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package eu.larkc.core.orchestrator;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static org.armedbear.lisp.Lisp.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import org.openrdf.model.Statement;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.rio.RDFHandlerException;
import org.openrdf.rio.RDFParseException;
import org.openrdf.rio.RDFParser;
import org.openrdf.rio.turtle.TurtleParserFactory;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constant_handles.$constant_native;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;

import eu.larkc.core.data.iterator.RDFHandlerIterator;

public class CycUtil {
    // private static Logger log = LoggerFactory.getLogger(CycUtil.class);
    private static Logger logger = Logger.getLogger(CycUtil.class.getCanonicalName());

    private static final OwlToCycMapping owlToCycMapping = new OwlToCycMapping();
    public static String mtStr = "BaseKB";
    // private static String uriFnStr = "LarkcURIFn";

    public static final void loadRdfTurtle(InputStream inputStream) throws RDFParseException, RDFHandlerException, IOException {
	// prepare infrastructure for storing URIs
	/*
	 * addConst(uriFnStr); addAssertion(CycUtil.toAssertion("isa", uriFnStr,
	 * "UnaryFunction"), mtStr); addAssertion(CycUtil.toAssertion("isa", uriFnStr,
	 * "ReifiableFunction"), mtStr); addAssertion(CycUtil.toAssertion("isa",
	 * uriFnStr, "IndividualDenotingFunction"), mtStr);
	 * addAssertion(CycUtil.toAssertion("arg1Isa", uriFnStr, "CharacterString"),
	 * mtStr);
	 */

	/*
	 * addConst("wsl-NonFunctionalParameter");
	 * addAssertion(CycUtil.toAssertion("isa", "wsl-NonFunctionalParameter",
	 * "Collection"), "UniversalVocabularyMt"); addConst("larkc-Scalability");
	 * addAssertion(CycUtil.toAssertion("isa", "larkc-Scalability", "Collection"),
	 * "UniversalVocabularyMt"); addConst("larkc-Scalability");
	 * addConst("wsl-NonFunctionalProperty");
	 * addAssertion(CycUtil.toAssertion("genls", "larkc-Scalability",
	 * "wsl-NonFunctionalProperty"), "UniversalVocabularyMt");
	 */

	// prepare turtle RDF format parser
	RDFParser parser = new TurtleParserFactory().getParser();
	RDFHandlerIterator iter = new RDFHandlerIterator(new URIImpl("http://larkc.cyc/")) {

	    @Override
	    public void handleStatement(Statement st) throws RDFHandlerException {
		// make it into cyc assertion
		if (!addRdfTriple(st)) {
		    throw new RDFHandlerException("Error adding this statement to Plug-in registry KB: " + st);
		}
	    }

	};
	parser.setRDFHandler(iter);

	// start the parser
	parser.parse(inputStream, "http://larkc.cyc/");
    }

    public static final boolean addRdfTriple(Statement st) throws RDFHandlerException {
	// parse all three terms
	SubLObject subjectCycL = addRdfTerm(st.getSubject().toString());
	SubLObject predicateCycL = addRdfTerm(st.getPredicate().toString());
	SubLObject objectCycL = addRdfTerm(st.getObject().toString());
	// add it to the KB
	SubLObject cycAssertion = list(predicateCycL, subjectCycL, objectCycL);
	return addAssertion(cycAssertion, mtStr);
    }

    public static final SubLObject addRdfTerm(String rdfTerm) {
	if (owlToCycMapping.isCycEquivalent(rdfTerm)) {
	    // there is corresponding cyc term, we replace it
	    return toConst(owlToCycMapping.getCycEquivalent(rdfTerm));
	} // else {
	  // no corresponding cyc term, we add it to the KB using uriFn function
	  // SubLObject nart = list(toConst(uriFnStr), makeString(rdfTerm));
	  // System.out.println(nart);
	  // addAssertion(nart, mtStr);
	  // return nart;

	String cycConst = owlToCycMapping.toCycConst(rdfTerm);
	addConst(cycConst);
	return toConst(cycConst);
	// }
    }

    /**
     * Adds the new constant to the kb. The constant name have to be the correct
     * Cycl string TODO: Change to proper call, which checks if constant already
     * there.
     * 
     * @param constStr
     */
    public static final void addConst(String constStr) {
	// TODO: ask Tony if this is a good and/or faster way to add
	// constants when you're not sure it exists

	SubLObject constSubL = toConst(constStr);
	if (constSubL instanceof $constant_native) {
	    $constant_native constant = ($constant_native) constSubL;
	    if (constant.$suid == SubLNil.NIL) {
		logger.fine("adding constant: " + constStr);
		ke.ke_create_now(makeString(constStr), UNPROVIDED);
	    }
	}
    }

    public static final boolean addAssertion(String assertionStr, String _mtStr) {
	SubLObject mt = CycUtil.toConst(_mtStr);
	return addAssertion(CycUtil.toAssertion(assertionStr), mt);
    }

    public static final boolean addAssertion(String assertionStr, SubLObject mt) {
	return addAssertion(CycUtil.toAssertion(assertionStr), mt);
    }

    public static final boolean addAssertion(SubLObject assertion, String _mtStr) {
	SubLObject mt = CycUtil.toConst(_mtStr);
	return addAssertion(assertion, mt);
    }

    public static final boolean addAssertion(SubLObject assertion, SubLObject mt) {
	logger.fine("adding assertion: " + assertion + " MT: " + mt);
	SubLObject res = ke.ke_assert_now(assertion, mt, UNPROVIDED, UNPROVIDED);
	if (res.isNil()) {
	    logger.warning("The assertion was not asserted. It violates the KB consistency!");
	    return false;
	}
	return true;
    }

    public static final void addForwardRule(String forwardRuleStr, String _mtStr) {
	SubLObject mt = CycUtil.toConst(_mtStr);
	addForwardRule(forwardRuleStr, mt);
    }

    public static final void addForwardRule(String forwardRuleStr, SubLObject mt) {
	// TODO: this rule only works if added after plug-ins' info already in the KB!
	ke.ke_assert_now(CycUtil.toAssertion(forwardRuleStr), mt, UNPROVIDED, makeKeyword("FORWARD"));
    }

    public static final SubLObject askQuery(String queryStr) {
	return askQuery(queryStr, false);
    }

    public static final SubLObject askQuery(String queryStr, boolean browsable) {
	SubLObject parameters = SubLNil.NIL;
	if (browsable) {
	    parameters = SubLObjectFactory.makeList(new SubLObject[] { makeKeyword("BROWSABLE?"), T });
	}
	// prepare the query
	SubLObject cycQuery = reader.read_from_string(makeString(queryStr), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	// execute the query
	return inference_kernel.new_cyc_query(cycQuery, constant_handles.reader_make_constant_shell(makeString("InferencePSC")), parameters);
    }

    // Platform code beautifier
    public static final SubLObject toConst(String s) {
	return constant_handles.reader_make_constant_shell(makeString(s));
    }

    // Platform code beautifier
    public static final SubLObject toAssertion(String s1, String s2, String s3) {
	return list(toConst(s1), toConst(s2), toConst(s3));
    }

    // platform code beautifier
    public static final SubLObject toAssertion(String s1, String s2, int i3, String s4) {
	return list(toConst(s1), toConst(s2), SubLNumberFactory.makeInteger(i3), toConst(s4));
    }

    // platform code beautifier
    public static final SubLObject toAssertion(String sentence) {
	return reader.read_from_string(makeString(sentence), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

}

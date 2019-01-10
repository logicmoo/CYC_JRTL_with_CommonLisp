package org.opencyc.kif;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;

import org.opencyc.api.*;
import org.opencyc.cycobject.*;
import org.opencyc.util.*;
//import org.apache.oro.util.*;
import ViolinStrings.*;

/**
 * Provides wrappers for the OpenCyc API.
 * <p>
 * 
 * Extends the <tt>CycAccess</tt> class.
 * 
 * @version $Id$
 * @author Douglas R. Miles
 * 
 * <p>
 * Copyright 2001 Cycorp, Inc., license is open source GNU LGPL.
 * <p>
 * <a href="http://www.opencyc.org/license.txt">the license</a>
 * <p>
 * <a href="http://www.opencyc.org">www.opencyc.org</a>
 * <p>
 * <a href="http://www.sourceforge.net/projects/opencyc">OpenCyc at SourceForge</a>
 * <p>
 * THIS SOFTWARE AND KNOWLEDGE BASE CONTENT ARE PROVIDED ``AS IS'' AND ANY
 * EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE OPENCYC ORGANIZATION OR ITS CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE AND KNOWLEDGE BASE
 * CONTENT, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
public class CycAssertionsFactory extends CycAccess {

	/**
	 * Constructs a new CycAssertionsFactory object.
	 */
	public CycAssertionsFactory() throws IOException, UnknownHostException,
			CycApiException {
		super();
		cycAccessInit();
	}


	/**
	 * Constructs a new CycAssertionsFactory object given a host name, port,
	 * communication mode and persistence indicator.
	 * 
	 * @param hostName
	 *            the host name
	 * @param basePort
	 *            the base (HTML serving) TCP socket port number
	 * @param communicationMode
	 *            either ASCII_MODE or BINARY_MODE
	 * @param persistentConnection
	 *            when <tt>true</tt> keep a persistent socket connection with
	 *            the OpenCyc server
	 */
	public CycAssertionsFactory(String hostName, int basePort,
			int communicationMode, boolean persistentConnection)
			throws IOException, UnknownHostException, CycApiException {
		super(hostName, basePort); // , communicationMode, persistentConnection
		cycAccessInit();
	}

	public ArrayList getMts() throws Exception {
		return (ArrayList) getAllInstances(microtheory);
	}

	public ArrayList getCollections() throws Exception {
		return (ArrayList) getAllInstances(collection);
	}

	private void cycAccessInit() throws CycApiException {
		try {
			argIsa = getConstantByName("#$argIsa");
			argGenl = getConstantByName("#$argGenl");
			resultIsa = getConstantByName("#$resultIsa");
			resultGenl = getConstantByName("#$resultGenl");
			predicate = getConstantByName("#$Predicate");
			relation = getConstantByName("#$Relation");
			functionalRelation = getConstantByName("#$FunctionalRelation");
			microtheory = getConstantByName("#$Microtheory");
			cyclist = getConstantByName("#$Cyclist");
			predarity = getConstantByName("#$arity");
			genlpreds = getConstantByName("#$genlPreds");
			cycadministrator = getConstantByName("#$CycAdministrator");
			opencycproject = getConstantByName("#$OpenCycProject");
			cyclistDefinitionalMt = getConstantByName("#$CyclistDefinitionalMt");
			cycBasedProject = getConstantByName("#$Cyc-BasedProject");
			metaRelation = getConstantByName("#$MetaRelation");
			cycTrue = getConstantByName("#$True");
			cycFalse = getConstantByName("#$False");
		} catch (Exception e) {
			throw new CycApiException("" + e);
		}

	}

	/**
	 * Returns a with-bookkeeping-info macro expresssion.
	 */
	public String withBookkeepingInfo() {
		try {
			return "(with-bookkeeping-info (new-bookkeeping-info "
					+ cycadministrator.stringApiValue() + " (the-date) "
					+ opencycproject.stringApiValue() + " (the-second)) ";
		} catch (Exception e) {
			return "(with-bookkeeping-info (new-bookkeeping-info #$CycAdministrator (the-date) #$OpenCycProject (the-second)) ";
		}
	}

	/**
	 * Asserts a genlMt formula in BaseKB. The operation will be added to the KB
	 * transcript for replication and archive.
	 * 
	 * @param <tt>CycFort</tt> mt1 the child Microtheory that inherits from mt2
	 * @param <tt>CycFort</tt> mt2 the parent Microtheory that lends it's
	 *            assertions to the child
	 */
	public void assertGenlMt(CycFort mt1, CycFort mt2) throws IOException,
			CycApiException {
		assertGafNoWff((CycFort) baseKB, genlMt, mt1, mt2);
	}

	/**
	 * Asserts a genlMt formula in BaseKB. The operation will be added to the KB
	 * transcript for replication and archive.
	 * 
	 * @param <tt>CycFort</tt> mt1 the child Microtheory that inherits from mt2
	 * @param <tt>String</tt> mt2 the parent Microtheory that lends it's
	 *            assertions to the child
	 */

	public void assertGenlMt(CycFort mt1, String mt2) throws IOException,
			CycApiException {
		assertGafNoWff((CycFort) baseKB, genlMt, mt1, makeCycConstant(mt2));
	}

	/**
	 * Override of <tt>CycAccess</tt> Constructs a new <tt>CycConstant</tt>
	 * object using the constant name.
	 * 
	 * @param name
	 *            Name of the constant. If prefixed with "#$", then the prefix
	 *            is removed for canonical representation. SPECIAL: If the name
	 *            is not considered makeable it appends "Logic" to the end. If
	 *            it still fails, it returns the #$MakeCycConstantErrorFn
	 *            (public CycConstant makeCycConstantError)
	 */

	public CycConstant makeCycConstant(String name) {

		String tryName = name;
		if (name.startsWith("#$"))
			tryName = name.substring(2);

		tryName = Strings.change(tryName, '$', '_');
		tryName = Strings.change(tryName, ')', '_');
		tryName = Strings.change(tryName, '(', '_');
		tryName = Strings.change(tryName, ' ', '_');
		tryName = Strings.change(tryName, '.', '_');
		tryName = Strings.change(tryName, '@', '_');
		try {
			if (isValidConstantName(tryName))
				try {
					return super.makeCycConstant(tryName);
				} catch (Exception e) {
					return super.makeCycConstant(tryName + "Logic");
				}
			else
				System.out.println("!isValidConstantName='" + name + "' ("
						+ tryName + ")");
			return null;
			// throw new CycApiException("makeCycConstant:
			// !isValidConstantName='"+name+"'");
		} catch (Exception ee) {
			ee.printStackTrace();
			System.out.println("!makeCycConstant: " + ee + "='" + name + "'");
			return null;
		}
	}

	/**
	 * Returns true if cycPredicate is a MetaRelation.
	 * 
	 * @param cycPredicate
	 *            the predicate for determination as a MetaRelation
	 * @return <tt>true</tt> iff cycPredicate is a MetaRelation,
	 */

	public boolean isMetaRelation(CycFort cycPredicate) throws IOException,
			CycApiException {
		return isa(cycPredicate, metaRelation);
	}

	/**
	 * Constructs a new <tt>CycList</tt> object representing a Gaf using the
	 * the three parameters
	 * 
	 * @param <tt>CycConstant</tt> cycPredicate of the Gaf
	 * @param <tt>CycConstant</tt> arg1 of the Gaf
	 * @param <tt>CycConstant</tt> arg2 of the Gaf
	 * 
	 * @return new <tt>CycList</tt> that represents the new Gaf
	 */

	public static CycList makeGaf(CycConstant cycPredicate, CycConstant arg1,
			CycConstant arg2) {
		CycList cycList = new CycList(cycPredicate);
		cycList.add(arg1);
		cycList.add(arg2);
		return cycList;
	}

	/**
	 * Constructs a new <tt>CycList</tt> object representing a Isa based Gaf
	 * using the the two parameters
	 * 
	 * @param <tt>CycConstant</tt> term of the Gaf
	 * @param <tt>String</tt> type the Collections name
	 * 
	 * @return new <tt>CycList</tt> that represents the new Gaf
	 */

	public CycList makeIsa(CycConstant term, String type) {
		return makeGaf(isa, term, makeCycConstant(type));
	}

	/**
	 * Constructs a new <tt>CycList</tt> object representing a Isa based Gaf
	 * using the the two parameters
	 * 
	 * @param <tt>CycConstant</tt> term of the Gaf
	 * @param <tt>CycConstant</tt> type Collection
	 * 
	 * @return new <tt>CycList</tt> that represents the new Gaf
	 */

	public CycList makeIsa(CycConstant term, CycConstant type) {
		return makeGaf(isa, term, type);
	}

	public void createPredicate(String microtheoryname, String username,
			String predicatename, ArrayList genlpredss, String arityname,
			String commentname, ArrayList isas, String[] arg, String[] isagenl)
			throws CycApiException {
		try {
			setCyclist(username);
			String realarityname = aryFromString(arityname);
			int arityN = arityFromString(realarityname).intValue();
			CycConstant usernameC = makeCycConstant(username);
			CycConstant microtheoryC = makeCycConstant(microtheoryname);
			CycConstant predicatenameC = makeCycConstant(predicatename);
			CycConstant realaritynameC = makeCycConstant(realarityname);

			Iterator iterator = null;

			assertIsa(predicatenameC, predicate, microtheoryC);
			assertIsa(predicatenameC, realaritynameC, microtheoryC);
			assertGafNoWff(microtheoryC, predarity, predicatenameC,
					new Integer(arityN));

			iterator = genlpredss.iterator();
			while (iterator.hasNext())
				assertGafNoWff(microtheoryC, genlpreds, predicatenameC,
						makeCycConstant("" + iterator.next()));

			iterator = isas.iterator();
			while (iterator.hasNext())
				assertGafNoWff(microtheoryC, isa, predicatenameC,
						makeCycConstant("" + iterator.next()));

			if (commentname.length() > 3)
				assertComment(predicatenameC, commentname, microtheoryC);

			for (int i = 1; i <= arityN; i++) {
				if (isagenl[i].startsWith("G")) {
					assertGafNoWff(microtheoryC, argGenl, predicatenameC,
							new Integer(i), makeCycConstant(arg[i]));
				} else {
					assertGafNoWff(microtheoryC, argIsa, predicatenameC,
							new Integer(i), makeCycConstant(arg[i]));
				}
			}

		} catch (Exception e) {
			throw new CycApiException("createPredicate: " + e);
		}

	}

	public void createFunction(String microtheoryname, String username,
			String functionname, String genlpredsname, String arityname,
			String commentname, String categoryname, String resultisaname,
			String resultisagenlname, String[] arg, String[] isagenl)
			throws CycApiException {
		try {
			setCyclist(username);
			CycConstant microtheorynameC = makeCycConstantOrNull(microtheoryname);
			CycConstant usernameC = makeCycConstantOrNull(username);
			CycConstant microtheoryC = makeCycConstantOrNull(microtheoryname);
			CycConstant functionnameC = makeCycConstantOrNull(functionname);
			CycConstant genlpredsnameC = makeCycConstantOrNull(genlpredsname);
			CycConstant categorynameC = makeCycConstantOrNull(categoryname);
			CycConstant resultisanameC = makeCycConstantOrNull(resultisaname);
			int arityN = Integer.parseInt(arityname);

			if (microtheoryname != null && functionname != null) {
				assertIsa(functionnameC, functionalRelation, microtheoryC);
				assertGafNoWff(microtheoryC, predarity, functionnameC,
						new Integer(arityN));
				if (genlpredsnameC != null) {
					assertGafNoWff(microtheoryC, genlpreds, functionnameC,
							genlpredsnameC);
				}
				if (categorynameC != null) {
					assertIsa(functionnameC, categorynameC, microtheoryC);
				}
				if (resultisanameC != null) {
					if (resultisagenlname.startsWith("G"))
						assertGafNoWff(microtheoryC, resultGenl, functionnameC,
								resultisanameC);
					else
						assertGafNoWff(microtheoryC, resultIsa, functionnameC,
								resultisanameC);
				}
				if (commentname.length() > 3) {
					assertComment(functionnameC, commentname, microtheoryC);
				}
				for (int i = 1; i <= arityN; i++) {
					if (isagenl[i].startsWith("G")) {
						assertGafNoWff(microtheoryC, argGenl, functionnameC,
								new Integer(i), makeCycConstant(arg[i]));
					} else {
						assertGafNoWff(microtheoryC, argIsa, functionnameC,
								new Integer(i), makeCycConstant(arg[i]));
					}
				}
			}

		} catch (Exception e) {
			throw new CycApiException("createPredicate: " + e);
		}
	}

	public ArrayList getArrayList(String mt, String collectionname) {
		try {
			CycList query = new CycList(isa);
			CycVariable variable = new CycVariable("?INST");
			query.add(variable);
			query.add(makeCycConstant(collectionname));
			return (ArrayList) askWithVariable(query, variable,
					makeCycConstant(mt));
		} catch (Exception e) {
			return new ArrayList();
		}
	}

	/**
	 * Returns a list of bindings for a query with a single unbound variable.
	 * 
	 * @param query
	 *            the query to be asked in the knowledge base
	 * @param variable
	 *            the single unbound variable in the query for which bindings
	 *            are sought
	 * @param mt
	 *            the microtheory in which the query is asked
	 * @return a list of bindings for the query
	 */

	public ArrayList queryArrayListSEL(String mt, String query) {
		return queryArrayListSEL(mt, query, "0 nil nil nil");
	}

	public ArrayList queryArrayListSEL(String mt, String query, String params) {
		try {
			StringBuffer queryBuffer = new StringBuffer();
			queryBuffer.append("(clet ((*cache-inference-results* t) ");
			queryBuffer.append("       (*compute-inference-results* nil) ");
			queryBuffer
					.append("       (*unique-inference-result-bindings* t) ");
			queryBuffer.append("       (*generate-readable-fi-results* t)) ");
			queryBuffer.append("  (without-wff-semantics ");
			queryBuffer.append("    (ask-template '?SEL '" + query + " ");
			queryBuffer.append("                  #$" + mt + " ");
			queryBuffer.append("                 " + params + " )))");
			// System.out.println(queryBuffer.toString());
			CycList answerList = converseList(queryBuffer.toString());
			if (answerList == null)
				return new ArrayList();
			return ((ArrayList) answerList);
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList();
		}
	}

	public static Integer arityFromString(String term) {
		switch (term.charAt(0)) {
		case 'V':
			return new Integer(0);
		case 'U':
			return new Integer(1);
		case 'B':
			return new Integer(2);
		case 'T':
			return new Integer(3);
		case 'Q':
			if (term.charAt(2) == 'a')
				return new Integer(4);
			else
				return new Integer(5);
		}
		return null;
	}

	public static String aryFromString(String term) {
		return term;
	}

	public static String aryFromInt(int term) {

		switch (term) {
		case 0:
			return "VariableArity";
		case 1:
			return "Unary";
		case 2:
			return "Binary";
		case 3:
			return "Ternary";
		case 4:
			return "Quaternary";
		case 5:
			return "Quintary";
		}
		return null;
	}

	/**
	 * Asserts the given sentence and also places it on the transcript queue
	 * with default strength and direction. However, no WFF checks are performed
	 * 
	 * @param <tt>String</tt> sentence the given sentence for assertion
	 * @param <tt>CycFort</tt> mt the microtheory in which the assertion is
	 *            placed
	 */

	public void assertWithTranscriptNoWffCheck(String sentence, CycFort mt)
			throws IOException, UnknownHostException, CycApiException {

		String command = "(clet ((*the-cyclist* " + cyclist.cyclify() + "))\n"
				+ "   (without-wff-semantics (ke-assert-now\n" + "    '"
				+ sentence + "\n" + "    " + mt.cyclify() + ")))";

		// System.out.println("assertWithTranscript: " + command);
		converseVoid(command);
	}

	/**
	 * Asserts the given sentence and also places it on the transcript queue
	 * with default strength and direction. However, no WFF checks are performed
	 * 
	 * @param <tt>CycList</tt> sentence the given sentence for assertion
	 * @param <tt>CycFort</tt> mt the microtheory in which the assertion is
	 *            placed
	 */

	public void assertWithTranscriptNoWffCheck(CycList sentence, CycFort mt)
			throws IOException, UnknownHostException, CycApiException {
		if (sentence == null)
			throw new CycApiException(
					"assertWithTranscriptNoWFFCheck: sentence==null");
		if (mt == null)
			throw new CycApiException(
					"assertWithTranscriptNoWFFCheck: mt==null "
							+ sentence.cyclify());
		if (cyclist == null)
			throw new CycApiException(
					"assertWithTranscriptNoWFFCheck: cyclist==null"
							+ sentence.cyclify());

		String command = "(clet ((*the-cyclist* " + cyclist.cyclify() + "))\n"
				+ "   (without-wff-semantics (ke-assert-now\n" + "    '"
				+ sentence.cyclify() + "\n" + "    " + mt.cyclify() + ")))";

		// System.out.println("assertWithTranscript: " + command);
		converseVoid(command);
	}

	/**
	 * Asserts a ground atomic formula (gaf) in the specified microtheory MT.
	 * The operation will be added to the KB transcript for replication and
	 * archive.
	 * 
	 * @param mt
	 *            the microtheory in which the assertion is made
	 * @param predicate
	 *            the binary predicate of the assertion
	 * @param arg1
	 *            the first argument of the predicate
	 * @param arg2
	 *            the second argument of the predicate
	 * @param arg3
	 *            the third argument of the predicate
	 */
	public void assertGafNoWff(CycFort mt, CycConstant predicate, Object arg1,
			Object arg2, Object arg3) {
		CycList sentence = new CycList(predicate);
		sentence.add(arg1);
		sentence.add(arg2);
		sentence.add(arg3);
		try {
			assertWithTranscriptNoWffCheck(sentence, mt);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	/**
	 * Asserts a ground atomic formula (gaf) in the specified microtheory MT.
	 * The operation will be added to the KB transcript for replication and
	 * archive.
	 * 
	 * @param mt
	 *            the microtheory in which the assertion is made
	 * @param predicate
	 *            the binary predicate of the assertion
	 * @param arg1
	 *            the first argument of the predicate
	 * @param arg2
	 *            the second argument of the predicate
	 */
	public void assertGafNoWff(CycFort mt, CycConstant predicate, Object arg1,
			Object arg2) {
		CycList sentence = new CycList(predicate);
		sentence.add(arg1);
		sentence.add(arg2);
		try {
			assertWithTranscriptNoWffCheck(sentence, mt);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	public boolean deleteGaf(CycList sentence, CycFort mt) {
		try {
			return converseBoolean("   (without-wff-semantics (CYC-UNASSERT\n"
					+ "    '" + sentence.cyclify() + "\n" + "    "
					+ mt.cyclify() + "))");
		} catch (Exception e) {
			e.printStackTrace(System.out);
			return false;
		}
	}

	public CycConstant makeCycConstantOrNull(String name) {
		if (name == null)
			return null;
		if (name.length() < 2)
			return null;
		if (name.startsWith("<"))
			return null;
		if (name.startsWith("*"))
			return null;
		return makeCycConstant(name);
	}

	public static CycConstant argIsa = null;

	public static CycConstant argGenl = null;

	public static CycConstant resultIsa = null;

	public static CycConstant resultGenl = null;

	public static CycConstant predicate = null;

	public static CycConstant relation = null;

	public static CycConstant microtheory = null;

	public static CycConstant cyclist = null;

	public static CycConstant predarity = null;

	public static CycConstant genlpreds = null;

	public static CycConstant cyclistDefinitionalMt = null;

	public static CycConstant cycBasedProject = null;

	public static CycConstant metaRelation = null;

	public static CycConstant makeCycConstantError = null;

	public static CycConstant cycadministrator = null;

	public static CycConstant opencycproject = null;

	public static CycConstant functionalRelation = null;

	public static CycConstant cycTrue = null;

	public static CycConstant cycFalse = null;

	public static CycConstant cycVoid = null;

	public static CycConstant cycNull = null;

}

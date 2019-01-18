package org.opencyc.kif;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;

import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycFort;
import org.opencyc.cycobject.CycList;

import ViolinStrings.Strings;


/**
 * Provides the behavior and attributes of OpenCyc CycBulkAssertions.<p>
 * 
 * @version $Id$
 * @author Douglas R. Miles
 *
 */

public class CycBulkAssertions {

    /**
     * Cyc api support.
     */
    protected CycAssertionsFactory cycAccess;
    protected CycConstant defaultCyclist = null;
    protected CycConstant defaultProject = null;
    protected CycFort defaultMt = null;     
    /*
     *  Assertion SubCollections
     */

    protected ArrayList cycAssertionsForBaseKB;
    protected ArrayList cycOrderedAssertions;
    private int numberText = 0;
    public boolean isTestedClean = false;

    /**
     * Verbosity indicator <tt>0</tt> indicates quiet on a range of
     * <tt>0</tt> ... <tt>10</tt>
     */
    public static int verbosity = 0;

    /**
     * Constructs a new CycBulkAssertions.
     *
     * @param ca the cycAccess for this CycBulkAssertions
     */

    public CycBulkAssertions(CycAssertionsFactory ca) throws Exception {
	cycAccess = ca;
	if ( cycAccess == null ) throw new Exception("CycAssertionsFactory is null");
	resetAll();
    }

    public void resetAll() {
	cycOrderedAssertions = new ArrayList();
	cycAssertionsForBaseKB = new ArrayList();
    }


    /**
     * Returns the defaultMt for this CycBulkAssertions.
     *
     * @return the defaultMt for this CycBulkAssertions
     */

    public CycFort getDefaultMt() {
	return defaultMt;
    }

    /**
     * Sets the defaultMt for this CycBulkAssertions.
     */
    public CycFort setDefaultMt(String mt) throws Exception {
	return setDefaultMt(cycAccess.makeCycConstant("#$" + mt));
    }

    /**
     * Sets the defaultMt for this CycBulkAssertions.
     */
    public CycFort setDefaultMt(CycFort mt) throws Exception {
	cycAccess.assertIsa(mt,cycAccess.microtheory,cycAccess.baseKB);
	defaultMt=mt;
	return defaultMt;
    }

    /**
     * Returns the defaultProject for this CycBulkAssertions.
     *
     * @return the defaultProject for this CycBulkAssertions
     */

    public CycConstant getDefaultProject() {
	return defaultProject;
    }

    /**
     * Sets the defaultProject for this CycBulkAssertions.
     */
    public void setDefaultProject(String project) throws Exception {
	setDefaultProject(cycAccess.makeCycConstant("#$" + project));
    }

    /**
     * Sets the defaultProject for this CycBulkAssertions.
     */
    public void setDefaultProject(CycConstant project) throws Exception {
	cycAccess.setKePurpose("OpenCycProject");
	cycAccess.setCyclist("#$CycAdministrator");
	cycAccess.assertIsa(project,cycAccess.cycBasedProject,CycAccess.baseKB);
	defaultProject=project;
	cycAccess.setKePurpose(defaultProject);
    }


    public CycConstant getDefaultCyclist() {
	return defaultCyclist;
    }

    /**
     * Sets the defaultCyclist for this CycBulkAssertions.
     */
    public void setDefaultCyclist(String cyclist) throws Exception {
	setDefaultCyclist(cycAccess.makeCycConstant("#$" + cyclist));
    }

    /**
     * Sets the defaultCyclist for this CycBulkAssertions.
     */
    public void setDefaultCyclist(CycConstant cyclist) throws Exception {
	cycAccess.setKePurpose("OpenCycProject");
	cycAccess.setCyclist("#$CycAdministrator");
	cycAccess.assertIsa(cyclist,cycAccess.cyclist,cycAccess.cyclistDefinitionalMt);
	defaultCyclist=cyclist;
	cycAccess.setCyclist(defaultCyclist);
    }


    /**
     * Indicates whether the object is equal to this object.
     *
     * @return <tt>true</tt> if the object is equal to this object, otherwise
     * returns <tt>false</tt>
     */
    public boolean equals (Object object) {
	if ( !(object instanceof CycBulkAssertions) )
	    return  false;
	return(this == (CycBulkAssertions) object);
    }

    /**
     * Returns a <tt>String</tt> representation of the <tt>CycBulkAssertions</tt>.
     *
     * @return a <tt>String</tt> representation of the <tt>CycBulkAssertions</tt>
     */
    public String toString () {
	StringWriter sr = new StringWriter(255);
	PrintWriter pw = new PrintWriter(sr);
	pw.println("; CycBulkAssertions: " + defaultMt + ": " + this.hashCode() );
	writeAssertions(pw);
	return sr.toString();
    }

    /**
     * Returns a cyclified <tt>String</tt> representation of the <tt>CycBulkAssertions</tt>.
     *
     * @return a cyclified <tt>String</tt> representation of the <tt>CycBulkAssertions</tt>
     */
    public String cyclify () {
	StringWriter sr = new StringWriter(255);
	PrintWriter pw = new PrintWriter(sr);
	pw.println("; CycBulkAssertions: " + defaultMt.cyclify() + ": " + this.hashCode() );
	writeAssertions(pw);
	return sr.toString();
    }


    /**
     * Adds the sentence (String) to this AssertionCollection.
     *
     * @param String of the sentence for this CycBulkAssertions
     */
    public boolean addSentence(CycList sentence) {
	if ( sentence==null ) return false;
	cycOrderedAssertions.add(sentence);
	return true;
    }

    /**
     * Tests this AssertionCollection per defaultMt
     *
     */
    
    public boolean testAssertions() {
	return testAssertionsHtml(null);
    }

    /**
     * Adds the AssertionCollection to defaultMt
     *
     */

    public void commitAssertions(Writer feedbackMl)  throws Exception  {
	PrintWriter pw;

      //  if ( !isTestedClean ) throw new Exception("Assertions not tested as clean.");

	if ( feedbackMl == null )
	    pw = new PrintWriter(System.out);
	else
	    pw = new PrintWriter(feedbackMl);
	commitArrayList(false, pw,cycAssertionsForBaseKB,(CycFort) cycAccess.baseKB);
	commitArrayList(false, pw,cycOrderedAssertions, defaultMt);
    }

    public void commitAssertions(boolean b, Writer feedbackMl)  throws Exception  {
	PrintWriter pw;

      //  if ( !isTestedClean ) throw new Exception("Assertions not tested as clean.");

	if ( feedbackMl == null )
	    pw = new PrintWriter(System.out);
	else
	    pw = new PrintWriter(feedbackMl);
	commitArrayList(b, pw,cycAssertionsForBaseKB,(CycFort) cycAccess.baseKB);
	commitArrayList(b, pw,cycOrderedAssertions, defaultMt);
    }

    private void commitArrayList(boolean b, PrintWriter pw, ArrayList cycArrayList , CycFort mt) {
	Iterator forms;
	forms = cycArrayList.iterator();

	while ( forms.hasNext() ) {
	    try {
		CycList form = (CycList) forms.next();
		cycAccess.assertWithTranscriptNoWffCheck(form,mt);
		if (b) {
		    pw.println("<font color=green>"+form+"</font>");
		}
	    } catch ( Exception e ) {
		pw.println("<pre><font color=red>"+e+"</font></pre>");
	    }
	}
    }


    public void writeAssertions(Writer feedbackMl) {
	writeAssertions(feedbackMl,cycAssertionsForBaseKB);
	writeAssertions(feedbackMl,cycOrderedAssertions);
    }

    public void writeAssertionsCycL(Writer feedbackMl) {
	writeAssertionsCycL(feedbackMl,cycAssertionsForBaseKB);
	writeAssertionsCycL(feedbackMl,cycOrderedAssertions);
    }

    /**
     * Displays the cycArrayList to Mt
     *
     * @param mt for sentences for this CycBulkAssertions
     */
    public void writeAssertions(Writer feedbackMl,ArrayList cycArrayList) {
	PrintWriter pw = new PrintWriter(feedbackMl);
	try {
	    Iterator forms = cycArrayList.iterator();
	    while ( forms.hasNext() )
		pw.println(((CycList)forms.next()).toString());
	} catch ( Exception e ) {
	    pw.println("; exception: " + e);
	}
    }

    /**
     * Displays the cycArrayList to Mt
     *
     * @param mt for sentences for this CycBulkAssertions
     */
    public void writeAssertionsCycL(Writer feedbackMl,ArrayList cycArrayList) {
	PrintWriter pw = new PrintWriter(feedbackMl);
	try {
	    Iterator forms = cycArrayList.iterator();
	    while ( forms.hasNext() )
		pw.println(((CycList)forms.next()).cyclify());
	} catch ( Exception e ) {
	    pw.println("; exception: " + e);
	}
    }

    public boolean testAssertionsHtml(Writer feedbackMl) {
	PrintWriter pw ;

	if ( feedbackMl == null )
	    pw = new PrintWriter(System.out);
	else
	    pw = new PrintWriter(feedbackMl);

	numberText = 0;
	pw.println("<h2>;  Testing Assertions...  </h2>");
	startTextMicrotheory(pw,20);

	CycFort saveMt = defaultMt;
	isTestedClean = true;
	CycConstant hypMt = null;
	try {
	    setDefaultMt("TestLoad" + this.hashCode() + "Mt");
	    hypMt = (CycConstant) defaultMt;
	    cycAccess.assertGenlMt(hypMt,saveMt);
	    setDefaultCyclist("CycAdministrator");
	    setDefaultProject("OpenCycProject");
	    testArrayList(pw,cycAssertionsForBaseKB, (CycFort) cycAccess.baseKB);
	    testArrayList(pw,cycOrderedAssertions , hypMt);
	    try {
		// pw.println("Killing hypothetical Mt: " + hypMt.cyclify());
		cycAccess.kill(hypMt);
	    } catch ( Exception e ) {
		pw.println(e);
	    }
	    setDefaultMt(saveMt);
	} catch (Exception ee) {
	}
	endTextMicrotheory(pw);

	if ( isTestedClean ) {
	    pw.println("<br><h2>; Assertions Consistant</h2>");
	} else {
	    pw.println("<br><h2>;  Assertions Inconsistant </h2>");
	}
	return isTestedClean;
    }

    private void startTextMicrotheory(PrintWriter pw ,int rows) {
	pw.println("<p><textarea cols=89 rows=" + rows + " name=ta"+numberText+">");
	numberText++;
    }

    private void endTextMicrotheory(PrintWriter pw) {
	pw.println("</textarea>");
    }

    private void testArrayList(PrintWriter pw, ArrayList cycArrayList , CycFort mt ) {
	String pretty = "(error)";
	int prettyLines=2;
	Iterator forms;
	CycList cycList = null;
	int assertN = 0;
	forms = cycArrayList.iterator();

	while ( forms.hasNext() ) {
	    try {
		assertN++;
		cycList = (CycList) forms.next();
		pretty = cycList.toPrettyString("   ");
		prettyLines = Strings.occurrencesOf(pretty,"\n");
		cycAccess.assertWithTranscript(cycList,mt);
		pw.println("; " + assertN + "\n" + cycList.toPrettyString("   ") +"\n");
	    } catch ( Exception e ) {
		isTestedClean = false;
		pw.println("</textarea><pre><font color=red>"+e+"</font></pred>");
		startTextMicrotheory(pw,prettyLines + 5);
		pw.println("; " + assertN +"\n" + pretty);
	    }
	}

    }

}



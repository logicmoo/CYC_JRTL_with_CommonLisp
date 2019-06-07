package org.opencyc.inferencesupport;

import java.util.*;
import java.io.*;
import junit.framework.*;
import org.opencyc.cycobject.*;
import org.opencyc.api.*;

/**
 * Provides a suite of JUnit test cases for the <tt>org.opencyc.inferencesupport</tt> package.<p>
 *
 * @version $Id$
 * @author Stephen L. Reed
 *
 * <p>Copyright 2001 Cycorp, Inc., license is open source GNU LGPL.
 * <p><a href="http://www.opencyc.org/license.txt">the license</a>
 * <p><a href="http://www.opencyc.org">www.opencyc.org</a>
 * <p><a href="http://www.sourceforge.net/projects/opencyc">OpenCyc at SourceForge</a>
 * <p>
 * THIS SOFTWARE AND KNOWLEDGE BASE CONTENT ARE PROVIDED ``AS IS'' AND
 * ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE OPENCYC
 * ORGANIZATION OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE AND KNOWLEDGE
 * BASE CONTENT, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
public class UnitTest extends TestCase {

    /**
     * Constructs a new UnitTest object.
     * @param name the test case name.
     */
    public UnitTest(String name) {
        super(name);
    }

    /**
     * Main method in case tracing is prefered over running JUnit GUI.
     */
    public static void main(String[] args) {
        //boolean allTests = false;
        boolean allTests = true;
        runTests(allTests);
    }

    /**
     * Returns the test suite.
     *
     * @return the test suite
     */
    public static Test suite() {
        TestSuite testSuite = new TestSuite();
        testSuite.addTest(new UnitTest("testBinding"));
        testSuite.addTest(new UnitTest("testBindingSet"));
        testSuite.addTest(new UnitTest("testConstraintRule"));
        testSuite.addTest(new UnitTest("testQueryLiteral"));
        testSuite.addTest(new UnitTest("testHornClause"));
        testSuite.addTest(new UnitTest("testSolution"));
        testSuite.addTest(new UnitTest("testUnifier"));
        testSuite.addTest(new UnitTest("testBackchainer"));
        return testSuite;
    }

    /**
     * Runs the unit tests
     */
    public static void runTests(boolean allTests) {
        TestSuite testSuite;
        if (allTests) {
            junit.textui.TestRunner.run(suite());
        }
        else {
            testSuite = new TestSuite();
            testSuite.addTest(new UnitTest("testBinding"));
            testSuite.addTest(new UnitTest("testBindingSet"));
            testSuite.addTest(new UnitTest("testConstraintRule"));
            testSuite.addTest(new UnitTest("testQueryLiteral"));
            testSuite.addTest(new UnitTest("testHornClause"));
            testSuite.addTest(new UnitTest("testSolution"));
            testSuite.addTest(new UnitTest("testUnifier"));
            testSuite.addTest(new UnitTest("testBackchainer"));
            TestResult testResult = new TestResult();
            testSuite.run(testResult);
        }
    }

    /**
     * Tests the <tt>Binding</tt> class.
     */
    public void testBinding() {
        System.out.println("** testBinding **");

        Binding binding1 = new Binding(CycObjectFactory.makeCycVariable("?x"), "abc");
        Assert.assertNotNull(binding1);
        Assert.assertEquals(CycObjectFactory.makeCycVariable("?x"), binding1.getCycVariable());
        Assert.assertEquals("abc", binding1.getValue());
        Assert.assertEquals("?x = \"abc\"", binding1.toString());

        System.out.println("** testBinding OK **");
    }

    /**
     * Tests the <tt>BindingSet</tt> class.
     */
    public void testBindingSet() {
        System.out.println("** testBindingSet **");

        CycAccess cycAccess = null;
        try {
            cycAccess = new CycAccess();
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        QueryLiteral queryLiteral1 = null;
        CycFort mt = null;
        BindingSet bindingSet1 = null;
        BindingSet bindingSet2 = null;
        try {
            String queryLiteralAsString = "(#$isa ?x #$Cathedral)";
            queryLiteral1 = new QueryLiteral(cycAccess.makeCycList(queryLiteralAsString));
            Assert.assertNotNull(queryLiteral1);
            Assert.assertNotNull(queryLiteral1.getFormula());
            CycList cycList = queryLiteral1.getFormula();
            Assert.assertEquals(queryLiteralAsString, cycList.cyclify());
            Assert.assertEquals(queryLiteralAsString, queryLiteral1.cyclify());
            mt = (CycFort) CycAccess.baseKB;
            bindingSet1 = new BindingSet(queryLiteral1, mt);
            bindingSet2 = new BindingSet(queryLiteral1, mt);
        }
        catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
        Assert.assertEquals(bindingSet1, bindingSet2);

        try {
            cycAccess.close();
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        System.out.println("** testBindingSet OK **");
    }

    /**
     * Tests the <tt>ConstraintRule</tt> class.
     */
    public void testConstraintRule() {
        System.out.println("** testConstraintRule **");

        CycAccess cycAccess = null;
        try {
            cycAccess = new CycAccess();
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // Construction
        String ruleAsString = null;
        ConstraintRule rule1 = null;
        try {
            ruleAsString = "(#$isa ?x #$Cathedral)";
            rule1 = new ConstraintRule (cycAccess.makeCycList(ruleAsString));
            Assert.assertNotNull(rule1);
            Assert.assertNotNull(rule1.getFormula());
            CycList cycList = rule1.getFormula();
            Assert.assertEquals(ruleAsString, cycList.cyclify());
            Assert.assertEquals(ruleAsString, rule1.cyclify());
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // Equality
        try {
            ConstraintRule rule2 = new ConstraintRule (cycAccess.makeCycList(ruleAsString));
            Assert.assertEquals(rule1.toString(), rule2.toString());
            Assert.assertEquals(rule1.cyclify(), rule2.cyclify());
            Assert.assertEquals(rule1, rule2);
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // gatherVariables and arity.
        Assert.assertEquals(1, rule1.getArity());
        Assert.assertTrue(rule1.getVariables().contains(CycObjectFactory.makeCycVariable("?x")));

        // simplifyRuleExpression
        try {
            CycList ruleExpression = cycAccess.makeCycList("(isa ?x Cathedral)");
            ArrayList rules = ConstraintRule.simplifyConstraintRuleExpression(ruleExpression);
            Assert.assertNotNull(rules);
            Assert.assertEquals(1, rules.size());
            Assert.assertTrue(rules.get(0) instanceof ConstraintRule);
            ConstraintRule rule3 = (ConstraintRule) rules.get(0);
            Assert.assertEquals(ruleExpression.cyclify(), rule3.cyclify());
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // instantiate
        ConstraintRule rule5 = null;
        try {
            //cycAccess.traceOn();
            ConstraintRule rule4 = new ConstraintRule("(#$isa ?x #$Cathedral)");
            rule5 = rule4.instantiate(CycObjectFactory.makeCycVariable("?x"),
                                      cycAccess.makeCycConstant("NotreDame"));
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        Assert.assertEquals("(#$isa #$NotreDame #$Cathedral)", rule5.cyclify());


        // isDifferent
        try {
            ConstraintRule rule6 = new ConstraintRule("(#$isa ?x #$Cathedral)");
            Assert.assertTrue(! rule6.isAllDifferent());
            ConstraintRule rule7 = new ConstraintRule("(#$different ?x ?y)");
            Assert.assertTrue(rule7.isAllDifferent());
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // isEvaluatable
        try {
            ConstraintRule rule8 = new ConstraintRule("(#$isa ?x #$Cathedral)");
            Assert.assertTrue(! rule8.isEvaluatable());
            ConstraintRule rule9 = new ConstraintRule("(#$numericallyEqual ?x 1)");
            Assert.assertTrue(rule9.isEvaluatable());
            ConstraintRule rule10 = new ConstraintRule("(#$and (#$isa ?x #$Cathedral) (#$numericallyEqual ?x 2))");
            Assert.assertTrue(! rule10.isEvaluatable());
            ConstraintRule rule11 = new ConstraintRule("(#$and (#$numericallyEqual 1 (#$PlusFn ?x)) (#$numericallyEqual ?x 2))");
            Assert.assertTrue(rule11.isEvaluatable());
            ConstraintRule rule12 = new ConstraintRule("(#$or (#$numericallyEqual 1 (#$PlusFn ?x)) (#$numericallyEqual ?x 2))");
            Assert.assertTrue(rule11.isEvaluatable());
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // evaluateConstraintRule
        try {
            CycList cycList13 = cycAccess.makeCycList("(#$numericallyEqual 0 0)");
            Assert.assertTrue(ConstraintRule.evaluateConstraintRule(cycList13));
            CycList cycList14 = cycAccess.makeCycList("(#$numericallyEqual 1 0)");
            Assert.assertTrue(! ConstraintRule.evaluateConstraintRule(cycList14));
            CycList cycList15 = cycAccess.makeCycList("(#$numericallyEqual 0 1)");
            Assert.assertTrue(! ConstraintRule.evaluateConstraintRule(cycList15));
            CycList cycList16 = cycAccess.makeCycList("(#$numericallyEqual (#$PlusFn 0) 1)");
            Assert.assertTrue(ConstraintRule.evaluateConstraintRule(cycList16));
            CycList cycList17 = cycAccess.makeCycList("(#$numericallyEqual (#$PlusFn 3) 1)");
            Assert.assertTrue(! ConstraintRule.evaluateConstraintRule(cycList17));
            CycList cycList18 = cycAccess.makeCycList("(#$or (#$numericallyEqual (#$PlusFn 3) 1) " +
                                                      "      (#$numericallyEqual 4 (#$PlusFn 3)))");
            Assert.assertTrue(ConstraintRule.evaluateConstraintRule(cycList18));
            CycList cycList19 = cycAccess.makeCycList("(#$or (#$numericallyEqual (#$PlusFn 3) 1) " +
                                                      "      (#$numericallyEqual 4 (#$PlusFn 7)))");
            Assert.assertTrue(! ConstraintRule.evaluateConstraintRule(cycList19));
            CycList cycList20 = cycAccess.makeCycList("(#$and (#$numericallyEqual (#$PlusFn 3) 4) " +
                                                      "       (#$numericallyEqual 4 (#$PlusFn 3)))");
            Assert.assertTrue(ConstraintRule.evaluateConstraintRule(cycList20));
            CycList cycList21 = cycAccess.makeCycList("(#$and (#$numericallyEqual (#$PlusFn 3) 1) " +
                                                      "       (#$numericallyEqual 4 (#$PlusFn 7)))");
            Assert.assertTrue(! ConstraintRule.evaluateConstraintRule(cycList21));
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // substituteVariable
        try {
            ConstraintRule rule22 = new ConstraintRule("(#$isa ?x #$Cathedral)");
            rule22.substituteVariable(CycObjectFactory.makeCycVariable("?x"),
                                      CycObjectFactory.makeCycVariable("?cathedral"));
            Assert.assertEquals("(#$isa ?cathedral #$Cathedral)", rule22.cyclify());
            ConstraintRule rule23 = new ConstraintRule("(#$isa ?x #$Cathedral)");
            rule23.substituteVariable(CycObjectFactory.makeCycVariable("?x"),
                                      cycAccess.makeCycConstant("NotreDameCathedral"));
            Assert.assertEquals("(#$isa #$NotreDameCathedral #$Cathedral)", rule23.cyclify());
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        //Zebra Puzzle rules
        String zebraPuzzleString =
            "(#$and " +
            "  (#$or " +
            "    (#$numericallyEqual ?norwegian (#$PlusFn ?blue 1)) " +
            "    (#$numericallyEqual ?blue (#$PlusFn ?norwegian 1))) " +
            "  (#$numericallyEqual ?japanese ?volkswagen) " +
            "  (#$numericallyEqual ?mercedes-benz ?orange-juice) " +
            "  (#$or " +
            "    (#$numericallyEqual ?ford (#$PlusFn ?horse 1)) " +
            "    (#$numericallyEqual ?horse (#$PlusFn ?ford 1))) " +
            "  (#$or " +
            "    (#$numericallyEqual ?chevrolet (#$PlusFn ?fox 1)) " +
            "    (#$numericallyEqual ?fox (#$PlusFn ?chevrolet 1))) " +
            "  (#$numericallyEqual ?norwegian 1) " +
            "  (#$numericallyEqual ?milk 3) " +
            "  (#$numericallyEqual ?ford ?yellow) " +
            "  (#$numericallyEqual ?oldsmobile ?snails) " +
            "  (#$numericallyEqual ?green (#$PlusFn ?ivory 1)) " +
            "  (#$numericallyEqual ?ukranian ?eggnog) " +
            "  (#$numericallyEqual ?cocoa ?green) " +
            "  (#$numericallyEqual ?spaniard ?dog) " +
            "  (#$numericallyEqual ?english ?red) " +
            "  (#$different ?ford ?chevrolet ?oldsmobile ?mercedes-benz ?volkswagen) " +
            "  (#$different ?orange-juice ?cocoa ?eggnog ?milk ?water) " +
            "  (#$different ?dog ?snails ?horse ?fox ?zebra) " +
            "  (#$different ?english ?spaniard ?norwegian ?japanese ?ukranian) " +
            "  (#$different ?blue ?red ?green ?yellow ?ivory) " +
            "  (#$elementOf ?blue (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?chevrolet (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?cocoa (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?dog (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?eggnog (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?english (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?ford (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?fox (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?green (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?horse (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?ivory (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?japanese (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?mercedes-benz (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?milk (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?norwegian (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?oldsmobile (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?orange-juice (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?red (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?snails (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?spaniard (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?ukranian (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?volkswagen (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?water (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?yellow (#$TheSet 1 2 3 4 5)) " +
            "  (#$elementOf ?zebra (#$TheSet 1 2 3 4 5))) ";
        CycList zebraPuzzleCycList = null;
        try {
            zebraPuzzleCycList = cycAccess.makeCycList(zebraPuzzleString);
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        ArrayList zebraPuzzleRules = null;
        try {
            zebraPuzzleRules = ConstraintRule.simplifyConstraintRuleExpression(zebraPuzzleCycList);
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("unit-test-output.txt");
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int i = 0; i < zebraPuzzleRules.size(); i++) {
            //System.out.println(((ConstraintRule) zebraPuzzleRules.get(i)).cyclify());
            printWriter.println(((ConstraintRule) zebraPuzzleRules.get(i)).cyclify());
        }
        printWriter.close();

        // subsumes
        ConstraintRule rule31 = null;
        ConstraintRule rule32 = null;
        ConstraintRule rule33 = null;
        ConstraintRule rule34 = null;
        ConstraintRule rule35 = null;
        ConstraintRule rule36 = null;
        try {
            rule31 = new ConstraintRule("(#$isa ?country #$WesternEuropeanCountry)");
            rule32 = new ConstraintRule("(#$isa ?cathedral #$Cathedral)");
            rule33 = new ConstraintRule("(#$countryOfCity ?country ?city)");
            rule34 = new ConstraintRule("(#$objectFoundInLocation ?cathedral ?city)");
            rule35 = new ConstraintRule("(#$isa ?city #$City)");
            rule36 = new ConstraintRule("(#$isa ?country #$Country)");
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        try {
            Assert.assertEquals(ConstraintRule.SUBSUMES, rule31.determineSubsumption(rule31));
            Assert.assertTrue(rule31.subsumes(rule31));
            Assert.assertTrue(rule31.isSubsumedBy(rule31));
            Assert.assertEquals(ConstraintRule.NO_SUBSUMPTION, rule31.determineSubsumption(rule32));
            Assert.assertTrue(! rule31.subsumes(rule32));
            Assert.assertTrue(! rule31.isSubsumedBy(rule32));
            Assert.assertEquals(ConstraintRule.NO_SUBSUMPTION, rule31.determineSubsumption(rule33));
            Assert.assertEquals(ConstraintRule.NO_SUBSUMPTION, rule31.determineSubsumption(rule34));
            Assert.assertEquals(ConstraintRule.NO_SUBSUMPTION, rule31.determineSubsumption(rule35));
            Assert.assertEquals(ConstraintRule.SUBSUMED_BY, rule31.determineSubsumption(rule36));
            Assert.assertTrue(rule31.isSubsumedBy(rule36));
            Assert.assertTrue(! (rule31.subsumes(rule36)));
            Assert.assertEquals(ConstraintRule.SUBSUMES, rule36.determineSubsumption(rule31));
            Assert.assertTrue(rule36.subsumes(rule31));
            Assert.assertTrue(! (rule36.isSubsumedBy(rule31)));
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // isValidRuleExpression
        try {
            Assert.assertTrue(ConstraintRule.isValidConstraintRuleExpression(cycAccess.makeCycList("(#$isa ?country #$Country)")));
            Assert.assertTrue(! ConstraintRule.isValidConstraintRuleExpression(cycAccess.makeCycList("(?pred ?country #$Country)")));
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        try {
            cycAccess.close();
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        System.out.println("** testConstraintRule OK **");
    }

    /**
     * Tests the <tt>QueryLiteral</tt> class.
     */
    public void testQueryLiteral() {
        System.out.println("** testQueryLiteral **");

        CycAccess cycAccess = null;
        try {
            cycAccess = new CycAccess();
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // Construction
        String queryLiteralAsString = null;
        QueryLiteral queryLiteral1 = null;
        try {
            queryLiteralAsString = "(#$isa ?x #$Cathedral)";
            queryLiteral1 = new QueryLiteral(cycAccess.makeCycList(queryLiteralAsString));
            Assert.assertNotNull(queryLiteral1);
            Assert.assertNotNull(queryLiteral1.getFormula());
            CycList cycList = queryLiteral1.getFormula();
            Assert.assertEquals(queryLiteralAsString, cycList.cyclify());
            Assert.assertEquals(queryLiteralAsString, queryLiteral1.cyclify());
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // Equality
        try {
            QueryLiteral queryLiteral2 = new QueryLiteral (cycAccess.makeCycList(queryLiteralAsString));
            Assert.assertEquals(queryLiteral1.toString(), queryLiteral2.toString());
            Assert.assertEquals(queryLiteral1.cyclify(), queryLiteral2.cyclify());
            Assert.assertEquals(queryLiteral1, queryLiteral2);
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // gatherVariables and arity.
        Assert.assertEquals(1, queryLiteral1.getArity());
        Assert.assertTrue(queryLiteral1.getVariables().contains(CycObjectFactory.makeCycVariable("?x")));

        // simplifyQueryLiteralExpression
        try {
            CycList queryLiteralExpression = cycAccess.makeCycList("(isa ?x Cathedral)");
            ArrayList queryLiterals = QueryLiteral.simplifyQueryLiteralExpression(queryLiteralExpression);
            Assert.assertNotNull(queryLiterals);
            Assert.assertEquals(1, queryLiterals.size());
            Assert.assertTrue(queryLiterals.get(0) instanceof QueryLiteral);
            QueryLiteral queryLiteral3 = (QueryLiteral) queryLiterals.get(0);
            Assert.assertEquals(queryLiteralExpression.cyclify(), queryLiteral3.cyclify());
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // instantiate
        QueryLiteral queryLiteral5 = null;
        try {
            //cycAccess.traceOn();
            QueryLiteral queryLiteral4 = new QueryLiteral("(#$isa ?x #$Cathedral)");
            queryLiteral5 = queryLiteral4.instantiate(CycObjectFactory.makeCycVariable("?x"),
                                      cycAccess.makeCycConstant("NotreDame"));
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        Assert.assertEquals("(#$isa #$NotreDame #$Cathedral)", queryLiteral5.cyclify());


        // isDifferent
        try {
            QueryLiteral queryLiteral6 = new QueryLiteral("(#$isa ?x #$Cathedral)");
            Assert.assertTrue(! queryLiteral6.isAllDifferent());
            QueryLiteral queryLiteral7 = new QueryLiteral("(#$different ?x ?y)");
            Assert.assertTrue(queryLiteral7.isAllDifferent());
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // isEvaluatable
        try {
            QueryLiteral queryLiteral8 = new QueryLiteral("(#$isa ?x #$Cathedral)");
            Assert.assertTrue(! queryLiteral8.isEvaluatable());
            QueryLiteral queryLiteral9 = new QueryLiteral("(#$numericallyEqual ?x 1)");
            Assert.assertTrue(queryLiteral9.isEvaluatable());
            QueryLiteral queryLiteral10 = new QueryLiteral("(#$and (#$isa ?x #$Cathedral) (#$numericallyEqual ?x 2))");
            Assert.assertTrue(! queryLiteral10.isEvaluatable());
            QueryLiteral queryLiteral11 = new QueryLiteral("(#$and (#$numericallyEqual 1 (#$PlusFn ?x)) (#$numericallyEqual ?x 2))");
            Assert.assertTrue(queryLiteral11.isEvaluatable());
            QueryLiteral queryLiteral12 = new QueryLiteral("(#$or (#$numericallyEqual 1 (#$PlusFn ?x)) (#$numericallyEqual ?x 2))");
            Assert.assertTrue(queryLiteral11.isEvaluatable());
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // substituteVariable
        try {
            QueryLiteral queryLiteral22 = new QueryLiteral("(#$isa ?x #$Cathedral)");
            queryLiteral22.substituteVariable(CycObjectFactory.makeCycVariable("?x"),
                                      CycObjectFactory.makeCycVariable("?cathedral"));
            Assert.assertEquals("(#$isa ?cathedral #$Cathedral)", queryLiteral22.cyclify());
            QueryLiteral queryLiteral23 = new QueryLiteral("(#$isa ?x #$Cathedral)");
            queryLiteral23.substituteVariable(CycObjectFactory.makeCycVariable("?x"),
                                      cycAccess.makeCycConstant("NotreDameCathedral"));
            Assert.assertEquals("(#$isa #$NotreDameCathedral #$Cathedral)", queryLiteral23.cyclify());
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // subsumes
        QueryLiteral queryLiteral31 = null;
        QueryLiteral queryLiteral32 = null;
        QueryLiteral queryLiteral33 = null;
        QueryLiteral queryLiteral34 = null;
        QueryLiteral queryLiteral35 = null;
        QueryLiteral queryLiteral36 = null;
        try {
            queryLiteral31 = new QueryLiteral("(#$isa ?country #$WesternEuropeanCountry)");
            queryLiteral32 = new QueryLiteral("(#$isa ?cathedral #$Cathedral)");
            queryLiteral33 = new QueryLiteral("(#$countryOfCity ?country ?city)");
            queryLiteral34 = new QueryLiteral("(#$objectFoundInLocation ?cathedral ?city)");
            queryLiteral35 = new QueryLiteral("(#$isa ?city #$City)");
            queryLiteral36 = new QueryLiteral("(#$isa ?country #$Country)");
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        try {
            Assert.assertEquals(QueryLiteral.SUBSUMES, queryLiteral31.determineSubsumption(queryLiteral31));
            Assert.assertTrue(queryLiteral31.subsumes(queryLiteral31));
            Assert.assertTrue(queryLiteral31.isSubsumedBy(queryLiteral31));
            Assert.assertEquals(QueryLiteral.NO_SUBSUMPTION, queryLiteral31.determineSubsumption(queryLiteral32));
            Assert.assertTrue(! queryLiteral31.subsumes(queryLiteral32));
            Assert.assertTrue(! queryLiteral31.isSubsumedBy(queryLiteral32));
            Assert.assertEquals(QueryLiteral.NO_SUBSUMPTION, queryLiteral31.determineSubsumption(queryLiteral33));
            Assert.assertEquals(QueryLiteral.NO_SUBSUMPTION, queryLiteral31.determineSubsumption(queryLiteral34));
            Assert.assertEquals(QueryLiteral.NO_SUBSUMPTION, queryLiteral31.determineSubsumption(queryLiteral35));
            Assert.assertEquals(QueryLiteral.SUBSUMED_BY, queryLiteral31.determineSubsumption(queryLiteral36));
            Assert.assertTrue(queryLiteral31.isSubsumedBy(queryLiteral36));
            Assert.assertTrue(! (queryLiteral31.subsumes(queryLiteral36)));
            Assert.assertEquals(QueryLiteral.SUBSUMES, queryLiteral36.determineSubsumption(queryLiteral31));
            Assert.assertTrue(queryLiteral36.subsumes(queryLiteral31));
            Assert.assertTrue(! (queryLiteral36.isSubsumedBy(queryLiteral31)));
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // conjoin.
        QueryLiteral queryLiteral41 = null;
        QueryLiteral queryLiteral42 = null;
        QueryLiteral queryLiteral44 = null;
        try {
            queryLiteral41 = new QueryLiteral("(#$isa ?country #$WesternEuropeanCountry)");
            queryLiteral42 = new QueryLiteral("(#$isa ?cathedral #$Cathedral)");
            queryLiteral44 = new QueryLiteral("(#$countryOfCity ?country ?city)");
       }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        try {
            CycList conjoinedFormula = cycAccess.makeCycList("(#$and (#$isa ?country #$WesternEuropeanCountry) " +
                                                 "(#$isa ?cathedral #$Cathedral))");
            CycListVisitor cycListVisitor = new CycListVisitor(conjoinedFormula);
            Assert.assertEquals(CycAccess.and, cycListVisitor.nextElement());
            Assert.assertEquals(CycAccess.isa, cycListVisitor.nextElement());
            Assert.assertEquals(CycObjectFactory.makeCycVariable("?country"), cycListVisitor.nextElement());

            QueryLiteral queryLiteral43 = QueryLiteral.conjoin(queryLiteral41, queryLiteral42);
            Assert.assertNotNull(queryLiteral43);
            Assert.assertTrue(queryLiteral43 instanceof QueryLiteral);
            Assert.assertEquals(CycAccess.and, queryLiteral43.getFormula().first());
            Assert.assertEquals(new QueryLiteral("(#$and (#$isa ?country #$WesternEuropeanCountry) " +
                                                 "(#$isa ?cathedral #$Cathedral))"),
                                                 queryLiteral43);
            Assert.assertEquals(2, queryLiteral43.getVariables().size());
            QueryLiteral queryLiteral45 = QueryLiteral.conjoin(queryLiteral43, queryLiteral44);
            Assert.assertEquals(3, queryLiteral45.getVariables().size());
            Assert.assertEquals(new QueryLiteral("(#$and (#$isa ?country #$WesternEuropeanCountry) " +
                                                 "(#$isa ?cathedral #$Cathedral) " +
                                                 "(#$countryOfCity ?country ?city))"),
                                                 queryLiteral45);
        }
        catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }

        try {
            cycAccess.close();
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        System.out.println("** testQueryLiteral OK **");
    }

    /**
     * Tests the <tt>HornClause</tt> class.
     */
    public void testHornClause() {
        System.out.println("** testHornClause **");

        CycAccess cycAccess = null;
        try {
            cycAccess = new CycAccess();
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        // constructor
        HornClause hornClause1 = null;
        try {
            //cycAccess.traceOn();
            String hornClauseString =
                "(#$implies " +
                " (#$and " +
                "  (#$isa ?BOAT #$Watercraft-Surface) " +
                "  (#$isa ?WATER #$BodyOfWater) " +
                "  (#$objectFoundInLocation ?BOAT ?WATER)) " +
                " (#$in-Floating ?BOAT ?WATER))";
            hornClause1 = new HornClause(hornClauseString);
            Assert.assertEquals("(#$in-Floating ?BOAT ?WATER)",
                                hornClause1.consequent.cyclify());
            Assert.assertEquals(3, hornClause1.getAntecedantConjuncts().size());
            Assert.assertEquals(2, hornClause1.getVariables().size());
            Assert.assertTrue(
                hornClause1.getVariables().contains(CycObjectFactory.makeCycVariable("?BOAT")));
            Assert.assertTrue(
                hornClause1.getVariables().contains(CycObjectFactory.makeCycVariable("?WATER")));
            Assert.assertTrue(
                hornClause1.getAntecedantConjuncts().contains(
                    new ConstraintRule("(#$isa ?BOAT #$Watercraft-Surface)")));
            Assert.assertTrue(
                hornClause1.getAntecedantConjuncts().contains(
                    new ConstraintRule("(#$isa ?WATER #$BodyOfWater)")));
            Assert.assertTrue(
                hornClause1.getAntecedantConjuncts().contains(
                    new ConstraintRule("(#$objectFoundInLocation ?BOAT ?WATER)")));
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // clone()
        HornClause hornClause2 = (HornClause) hornClause1.clone();
        Assert.assertEquals(hornClause1.toString(), hornClause2.toString());
        Assert.assertEquals(hornClause1.cyclify(), hornClause2.cyclify());
        Assert.assertEquals(hornClause1, hornClause2);
        Assert.assertTrue(hornClause1 != hornClause2);

        // substituteVariable
        try {
            HornClause hornClause3 = (HornClause) hornClause1.clone();
            hornClause3.substituteVariable(
                CycObjectFactory.makeCycVariable("?BOAT"),
                CycObjectFactory.makeCycVariable("?waterCraft"),
                0);
            Assert.assertTrue(
                ! (hornClause3.getVariables().contains(CycObjectFactory.makeCycVariable("?BOAT"))));
            Assert.assertTrue(
                hornClause3.getVariables().contains(CycObjectFactory.makeCycVariable("?waterCraft")));
            Assert.assertEquals(3, hornClause3.getAntecedantConjuncts().size());
            Assert.assertEquals(2, hornClause3.getVariables().size());
            Assert.assertTrue(
                hornClause3.getVariables().contains(CycObjectFactory.makeCycVariable("?WATER")));
            Assert.assertTrue(
                hornClause3.getAntecedantConjuncts().contains(
                    new ConstraintRule("(#$isa ?waterCraft #$Watercraft-Surface)")));
            Assert.assertTrue(
                hornClause3.getAntecedantConjuncts().contains(
                    new ConstraintRule("(#$isa ?WATER #$BodyOfWater)")));
            Assert.assertTrue(
                hornClause3.getAntecedantConjuncts().contains(
                    new ConstraintRule("(#$objectFoundInLocation ?waterCraft ?WATER)")));

            HornClause hornClause4 = (HornClause) hornClause1.clone();
            hornClause4.substituteVariable(
                CycObjectFactory.makeCycVariable("?BOAT"),
                cycAccess.makeCycConstant("#$Motorboat"),
                0);
            Assert.assertTrue(
                ! (hornClause4.getVariables().contains(CycObjectFactory.makeCycVariable("?BOAT"))));
            Assert.assertEquals(3, hornClause4.getAntecedantConjuncts().size());
            Assert.assertEquals(1, hornClause4.getVariables().size());
            Assert.assertTrue(
                hornClause4.getVariables().contains(CycObjectFactory.makeCycVariable("?WATER")));
            Assert.assertTrue(
                hornClause4.getAntecedantConjuncts().contains(
                    new ConstraintRule("(#$isa #$Motorboat #$Watercraft-Surface)")));
            Assert.assertTrue(
                hornClause4.getAntecedantConjuncts().contains(
                    new ConstraintRule("(#$isa ?WATER #$BodyOfWater)")));
            Assert.assertTrue(
                hornClause4.getAntecedantConjuncts().contains(
                    new ConstraintRule("(#$objectFoundInLocation #$Motorboat ?WATER)")));
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // renameVariables
        try {
            HornClause hornClause5 = (HornClause) hornClause1.clone();
            ArrayList otherVariables = new ArrayList();
            Assert.assertTrue(hornClause5.equals(hornClause1));
            int verbosity = 3;
            hornClause5.renameVariables(otherVariables, verbosity);
            Assert.assertTrue(hornClause5.equals(hornClause1));

            otherVariables.add(CycObjectFactory.makeCycVariable("?animal"));
            hornClause5.renameVariables(otherVariables, verbosity);
            Assert.assertTrue(hornClause5.equals(hornClause1));

            otherVariables.add(CycObjectFactory.makeCycVariable("?BOAT"));
            hornClause5.renameVariables(otherVariables, verbosity);
            Assert.assertEquals("(#$in-Floating ?BOAT_1 ?WATER)",
                                hornClause5.consequent.cyclify());
            Assert.assertEquals(3, hornClause5.getAntecedantConjuncts().size());
            Assert.assertEquals(2, hornClause5.getVariables().size());
            Assert.assertTrue(
                ! (hornClause5.getVariables().contains(CycObjectFactory.makeCycVariable("?BOAT"))));
            Assert.assertTrue(
                hornClause5.getVariables().contains(CycObjectFactory.makeCycVariable("?WATER")));
            Assert.assertTrue(
                ! (hornClause5.getAntecedantConjuncts().contains(
                    new ConstraintRule("(#$isa ?BOAT #$Watercraft-Surface)"))));
            Assert.assertTrue(
                hornClause5.getAntecedantConjuncts().contains(
                    new ConstraintRule("(#$isa ?WATER #$BodyOfWater)")));
            Assert.assertTrue(
                ! (hornClause5.getAntecedantConjuncts().contains(
                    new ConstraintRule("(#$objectFoundInLocation ?BOAT ?WATER)"))));
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        // isValidHornExpression
        try {
            String hornClauseString6 =
                "(#$implies " +
                " (#$and " +
                "  (#$isa ?BOAT #$Watercraft-Surface) " +
                "  (#$isa ?WATER #$BodyOfWater) " +
                "  (#$objectFoundInLocation ?BOAT ?WATER)) " +
                " (#$in-Floating ?BOAT ?WATER))";
            Assert.assertTrue(HornClause.isValidHornExpression(hornClauseString6));
            String hornClauseString7 =
                "()";
            Assert.assertTrue(! HornClause.isValidHornExpression(hornClauseString7));
            String hornClauseString8 =
                "(#$xor " +
                " (#$and " +
                "  (#$isa ?BOAT #$Watercraft-Surface) " +
                "  (#$isa ?WATER #$BodyOfWater) " +
                "  (#$objectFoundInLocation ?BOAT ?WATER)) " +
                " (#$in-Floating ?BOAT ?WATER))";
            Assert.assertTrue(! HornClause.isValidHornExpression(hornClauseString8));
            String hornClauseString9 =
                "(#$implies " +
                " (#$and " +
                "  (#$?pred ?BOAT #$Watercraft-Surface) " +
                "  (#$isa ?WATER #$BodyOfWater) " +
                "  (#$objectFoundInLocation ?BOAT ?WATER)) " +
                " (#$in-Floating ?BOAT ?WATER))";
            Assert.assertTrue(HornClause.isValidHornExpression(hornClauseString9));
            String hornClauseString10 =
                "(#$implies " +
                " (#$and " +
                "  (#$isa ?BOAT #$Watercraft-Surface) " +
                "  (#$isa ?WATER #$BodyOfWater) " +
                "  (#$objectFoundInLocation ?BOAT ?WATER)) " +
                " (#$?pred ?BOAT ?WATER))";
            Assert.assertTrue(HornClause.isValidHornExpression(hornClauseString10));
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        try {
            cycAccess.close();
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        System.out.println("** testHornClause OK **");
    }

    /**
     * Tests the <tt>Solution</tt> class.
     */
    public void testSolution() {
        System.out.println("** testSolution **");

        // constructor
        int verbosity = 3;
        Solution solution = new Solution(null, verbosity);

        // getCurrentSolution
        Assert.assertTrue(solution.getCurrentSolution().size() == 0);

        // getSolutions
        Assert.assertTrue(solution.getSolutions().size() == 1);
        Binding binding1 = new Binding(CycObjectFactory.makeCycVariable("?x"), new Integer(1));

        // addBindingToCurrentSolution
        solution.addBindingToCurrentSolution(binding1);
        Assert.assertTrue(solution.getCurrentSolution().size() == 1);
        Assert.assertTrue(solution.getCurrentSolution().contains(binding1));

        // removeBindingFromCurrentSolution
        solution.removeBindingFromCurrentSolution(binding1);
        Assert.assertTrue(solution.getCurrentSolution().size() == 0);

        // addBindingToCurrentSolution
        Binding binding2 = new Binding(CycObjectFactory.makeCycVariable("?y"), new Integer(2));
        Binding binding3 = new Binding(CycObjectFactory.makeCycVariable("?z"), new Integer(3));
        solution.addBindingToCurrentSolution(binding2);
        solution.addBindingToCurrentSolution(binding3);
        Assert.assertTrue(solution.getCurrentSolution().size() == 2);

        // addSolution
        solution.addSolution(new ArrayList());
        Assert.assertTrue(solution.getSolutions().size() == 2);
        Assert.assertTrue(solution.getCurrentSolution().size() == 0);
        solution.addBindingToCurrentSolution(binding1);
        Assert.assertTrue(solution.getCurrentSolution().size() == 1);
        Assert.assertTrue(solution.getCurrentSolution().contains(binding1));

        // recordNewSolution
        solution.addBindingToCurrentSolution(binding2);
        solution.addBindingToCurrentSolution(binding3);
        Assert.assertTrue(solution.getCurrentSolution().size() == 3);
        Assert.assertTrue(solution.getCurrentSolution().contains(binding2));
        solution.recordNewSolution(binding2);
        Assert.assertTrue(solution.getSolutions().size() == 3);
        Assert.assertTrue(solution.getCurrentSolution().size() == 2);
        Assert.assertTrue(! solution.getCurrentSolution().contains(binding2));

        // finalizeAllSolutions
        solution.addSolution(new ArrayList());
        Assert.assertTrue(solution.getSolutions().size() == 4);
        Assert.assertTrue(solution.getCurrentSolution().size() == 0);
        solution.nbrSolutionsRequested = null;
        solution.nbrSolutionsFound = 3;
        solution.finalizeAllSolutions();
        Assert.assertTrue(solution.getSolutions().size() == 3);
        Assert.assertTrue(solution.getCurrentSolution().size() == 2);

        System.out.println("** testSolution OK **");
    }

}
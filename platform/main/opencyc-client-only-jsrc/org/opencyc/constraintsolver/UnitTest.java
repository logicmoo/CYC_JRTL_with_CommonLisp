package org.opencyc.constraintsolver;

import java.util.*;
import java.io.*;
import junit.framework.*;
import org.opencyc.cycobject.*;
import org.opencyc.inferencesupport.*;
import org.opencyc.api.*;

/**
 * Provides a suite of JUnit test cases for the <tt>org.opencyc.constraintsolver</tt> package.<p>
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
        boolean allTests = false;
        //boolean allTests = true;
        runTests(allTests);
    }

    /**
     * Runs the unit tests
     */
    public static void runTests(boolean allTests) {
        TestSuite testSuite;
        if (allTests)
            testSuite = new TestSuite(UnitTest.class);
        else {
            testSuite = new TestSuite();
            testSuite.addTest(new UnitTest("testHelloWorld"));
            testSuite.addTest(new UnitTest("testRuleEvaluator"));
            testSuite.addTest(new UnitTest("testArgumentTypeConstrainer"));
            testSuite.addTest(new UnitTest("testProblemParser"));
            testSuite.addTest(new UnitTest("testConstraintProblem1"));
            testSuite.addTest(new UnitTest("testConstraintProblem2"));
        }
        TestResult testResult = new TestResult();
        testSuite.run(testResult);
    }

    /**
     * Tests the test harness itself.
     */
    public void testHelloWorld() {
        System.out.println("** testHelloWorld **");
        Assert.assertTrue(true);
        System.out.println("** testHelloWorld OK **");
    }

    /**
     * Tests the <tt>ProblemParser</tt> class.
     */
    public void testProblemParser() {
        System.out.println("** testProblemParser **");

        ConstraintProblem constraintProblem = new ConstraintProblem();
        String problemString1 =
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
        ConstraintRule rule1 = null;
        ConstraintRule rule2 = null;
        ConstraintRule rule3 = null;
        ConstraintRule rule4 = null;
        try {
            CycList problem1 = CycAccess.current().makeCycList(problemString1);
            constraintProblem.problem = problem1;
            constraintProblem.simplifiedRules = ConstraintRule.simplifyConstraintRuleExpression(problem1);
            ProblemParser problemParser = constraintProblem.problemParser;
            constraintProblem.setVerbosity(9);
            problemParser.extractRulesAndDomains();
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        Assert.assertNotNull(constraintProblem.constraintRules);
        Assert.assertNotNull(constraintProblem.domainPopulationRules);
        try {
            rule1 = new ConstraintRule("(#$elementOf ?yellow (#$TheSet 1 2 3 4 5))");
            rule2 = new ConstraintRule("(#$elementOf ?english (#$TheSet 1 2 3 4 5))");
            rule3 = new ConstraintRule("(#$different ?ford ?chevrolet ?oldsmobile ?mercedes-benz ?volkswagen)");
            rule4 = new ConstraintRule("(#$numericallyEqual ?english ?red)");
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        System.out.println("domainPopulationRules\n" + constraintProblem.domainPopulationRules);
        Assert.assertEquals(25, constraintProblem.domainPopulationRules.size());
        Assert.assertTrue(constraintProblem.domainPopulationRules.contains(rule1));
        Assert.assertTrue(constraintProblem.domainPopulationRules.contains(rule2));
        System.out.println("constraintRules\n" + constraintProblem.constraintRules);
        Assert.assertEquals(19, constraintProblem.constraintRules.size());
        Assert.assertTrue(constraintProblem.constraintRules.contains(rule3));
        Assert.assertTrue(constraintProblem.constraintRules.contains(rule4));

        System.out.println("** testProblemParser OK **");
    }

    /**
     * Tests the <tt>RuleEvaluator</tt> class.
     */
    public void testRuleEvaluator() {
        System.out.println("** testRuleEvaluator **");

        ConstraintProblem constraintProblem = new ConstraintProblem();
        RuleEvaluator ruleEvaluator = constraintProblem.ruleEvaluator;
        try {
            Assert.assertTrue(ruleEvaluator.ask(new ConstraintRule("(#$numericallyEqual 1 1)")));
            Assert.assertTrue(! ruleEvaluator.ask(new ConstraintRule("(#$numericallyEqual 2 1)")));
            Assert.assertTrue(ruleEvaluator.ask(new ConstraintRule("(#$different 2 1)")));
            Assert.assertTrue(! ruleEvaluator.ask(new ConstraintRule("(#$different 2 2)")));
            Assert.assertTrue(ruleEvaluator.ask(new ConstraintRule("(#$different \"a\" \"b\")")));
            Assert.assertTrue(! ruleEvaluator.ask(new ConstraintRule("(#$different \"a\" \"a\")")));
            Assert.assertTrue(ruleEvaluator.ask(new ConstraintRule("(#$not (#$different 1 1))")));
            Assert.assertTrue(! ruleEvaluator.ask(new ConstraintRule("(#$not (#$not (#$different 1 1)))")));
            Assert.assertTrue(ruleEvaluator.ask(new ConstraintRule("(#$and (#$numericallyEqual 1 1) (#$numericallyEqual 3 3))")));
            Assert.assertTrue(! ruleEvaluator.ask(new ConstraintRule("(#$and (#$numericallyEqual 1 2) (#$numericallyEqual 3 3))")));
            Assert.assertTrue(! ruleEvaluator.ask(new ConstraintRule("(#$and (#$numericallyEqual 1 1) (#$numericallyEqual 3 4))")));
            Assert.assertTrue(ruleEvaluator.ask(new ConstraintRule("(#$and (#$numericallyEqual 1 1) (#$numericallyEqual 3 3) (#$numericallyEqual 4 4))")));
            Assert.assertTrue(ruleEvaluator.ask(new ConstraintRule("(#$or (#$numericallyEqual 1 2) (#$numericallyEqual 3 3))")));
            Assert.assertTrue(! ruleEvaluator.ask(new ConstraintRule("(#$or (#$numericallyEqual 1 2) (#$numericallyEqual 3 4))")));
            Assert.assertTrue(ruleEvaluator.ask(new ConstraintRule("(#$numericallyEqual 2 (#$PlusFn 1))")));
            Assert.assertTrue(ruleEvaluator.ask(new ConstraintRule("(#$numericallyEqual (#$PlusFn 1) 2)")));
            Assert.assertTrue(! ruleEvaluator.ask(new ConstraintRule("(#$numericallyEqual (#$PlusFn 1) 5)")));
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        System.out.println("** testRuleEvaluator OK **");
    }

    /**
     * Tests the <tt>ArgumentTypeConstrainer</tt> class.
     */
    public void testArgumentTypeConstrainer() {
        System.out.println("** testArgumentTypeConstrainer **");

        ConstraintProblem constraintProblem = null;
        try {
            constraintProblem = new ConstraintProblem();
        }
        catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }

        try{
            ConstraintRule rule1 = new ConstraintRule("(#$holdsIn (#$YearFn 1993) (#$totalDebt ?X (#$BillionDollars 7)))");
            ArrayList argConstraints =
                constraintProblem.argumentTypeConstrainer.retrieveArgumentTypeConstraintRules(rule1);
            ConstraintRule rule2 = new ConstraintRule ("(#$isa ?X #$GeographicalRegion)");
            Assert.assertNotNull(argConstraints);
            Assert.assertEquals(1, argConstraints.size());
            Assert.assertTrue(argConstraints.contains(rule2));
        }
        catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
        try{
            ConstraintRule rule1 = new ConstraintRule("(#$countryOfCity ?country ?city)");
            ArrayList argConstraints =
                constraintProblem.argumentTypeConstrainer.retrieveArgumentTypeConstraintRules(rule1);
            ConstraintRule rule2 = new ConstraintRule ("(#$isa ?country #$Country)");
            ConstraintRule rule3 = new ConstraintRule ("(#$isa ?city #$City)");
            Assert.assertNotNull(argConstraints);
            Assert.assertEquals(2, argConstraints.size());
            Assert.assertTrue(argConstraints.contains(rule2));
            Assert.assertTrue(argConstraints.contains(rule3));
        }
        catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }

        try {
            CycAccess.current().close();
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        System.out.println("** testArgumentTypeConstrainer OK **");
    }

    /**
     * Tests the <tt>ConstraintProblem</tt> class.
     */
    public void testConstraintProblem1() {
        System.out.println("** testConstraintProblem1 **");

        //Zebra Puzzle
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
        ConstraintProblem zebraProblem = new ConstraintProblem();
        CycAccess cycAccess = zebraProblem.cycAccess;
        try {
            CycList zebraPuzzleCycList = cycAccess.makeCycList(zebraPuzzleString);
            ArrayList zebraPuzzleRules = ConstraintRule.simplifyConstraintRuleExpression(zebraPuzzleCycList);

            zebraProblem.setVerbosity(3);
            ArrayList solutions = null;
            solutions = zebraProblem.solve(zebraPuzzleCycList);
            Assert.assertNotNull(solutions);

            // test extractRulesAndDomains()
            zebraProblem.displayConstraintRules();
            Assert.assertEquals(17, zebraProblem.getNbrConstraintRules());
            Assert.assertEquals(25, zebraProblem.getNbrDomainPopulationRules());

            // test gatherVariables()
            Assert.assertEquals(25, zebraProblem.getNbrVariables());

            // test ValueDomains.initializeDomains()
            Assert.assertEquals(25, zebraProblem.valueDomains.domains.size());
            Assert.assertEquals(25, zebraProblem.valueDomains.varsDictionary.size());
            CycVariable blue = CycObjectFactory.makeCycVariable("?blue");
            Assert.assertNotNull(zebraProblem.valueDomains.varsDictionary.get(blue));
            Assert.assertTrue(zebraProblem.valueDomains.varsDictionary.get(blue) instanceof ArrayList);
            ArrayList domainValues = (ArrayList) zebraProblem.valueDomains.varsDictionary.get(blue);
            Assert.assertEquals(5, domainValues.size());
            Assert.assertTrue(domainValues.contains(new Integer(1)));
            Assert.assertTrue(domainValues.contains(new Integer(2)));
            Assert.assertTrue(domainValues.contains(new Integer(3)));
            Assert.assertTrue(domainValues.contains(new Integer(4)));
            Assert.assertTrue(domainValues.contains(new Integer(5)));

            // test ValueDomains.domainHasValue(CycVariable cycVariable, Object value)
            Assert.assertTrue(zebraProblem.valueDomains.domainHasValue(blue, new Integer(1)));
            Assert.assertTrue(! (zebraProblem.valueDomains.domainHasValue(blue, new Integer(6))));

            // test ValueDomains.getDomainValues(CycVariable cycVariable)
            ArrayList domainValues2 = zebraProblem.valueDomains.getDomainValues(blue);
            Assert.assertEquals(domainValues, domainValues2);

            // test ValueDomains.initializeDomainValueMarking()
            Assert.assertNotNull(zebraProblem.valueDomains.domains.get(blue));
            Assert.assertTrue((zebraProblem.valueDomains.domains.get(blue)) instanceof HashMap);
            HashMap domainValueMarks = (HashMap) zebraProblem.valueDomains.domains.get(blue);
            Assert.assertTrue(domainValueMarks.containsKey(new Integer(1)));
            Assert.assertNotNull(domainValueMarks.get(new Integer(1)));

            // test NodeConsistencyAchiever.applyUnaryRulesAndPropagate()
            Assert.assertEquals(2, zebraProblem.nodeConsistencyAchiever.unaryConstraintRules.size());
            Assert.assertTrue(zebraProblem.nodeConsistencyAchiever.affectedVariables.contains(CycObjectFactory.makeCycVariable("?milk")));
            Assert.assertTrue(zebraProblem.nodeConsistencyAchiever.affectedVariables.contains(CycObjectFactory.makeCycVariable("?norwegian")));
            Assert.assertEquals(5, zebraProblem.nodeConsistencyAchiever.allDifferentRules.size());
            Assert.assertTrue(zebraProblem.nodeConsistencyAchiever.singletons.contains(CycObjectFactory.makeCycVariable("milk")));
            Assert.assertTrue(zebraProblem.nodeConsistencyAchiever.singletons.contains(CycObjectFactory.makeCycVariable("norwegian")));
        }
        catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }

        System.out.println("** testConstraintProblem1 OK **");
    }

    /**
     * Tests the <tt>ConstraintProblem</tt> class.
     */
    public void testConstraintProblem2() {
        System.out.println("** testConstraintProblem2 **");

        //Zebra Puzzle
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
        ConstraintProblem zebraProblem = new ConstraintProblem();
        CycAccess cycAccess = zebraProblem.cycAccess;
        try {
            zebraProblem.setVerbosity(9);
            ArrayList solution = zebraProblem.solve(cycAccess.makeCycList(zebraPuzzleString));
            System.out.println(solution);
        }
        catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }

        System.out.println("** testConstraintProblem2 OK **");
    }



}
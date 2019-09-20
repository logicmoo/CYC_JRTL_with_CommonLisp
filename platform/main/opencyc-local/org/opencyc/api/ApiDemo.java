package org.opencyc.api;

import org.opencyc.inference.params.InferenceParameters;
import org.opencyc.inference.params.DefaultInferenceParameters;
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.CycFormulaSentence;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.Guid;
import java.net.UnknownHostException;
import java.io.IOException;
import org.opencyc.cycobject.CycFort;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.opencyc.util.Log;

public class ApiDemo
{
    protected CycAccess cycAccess;
    
    public ApiDemo() {
        Log.makeLog();
        Log.current.println("Initializing Cyc server connection, and caching frequently used terms.");
        try {
            this.cycAccess = new CycAccess();
        }
        catch (Exception e) {
            Log.current.errorPrintln(e.getMessage());
            Log.current.printStackTrace(e);
        }
        this.cycAccess.traceOn();
        Log.current.println("Now tracing Cyc server messages");
    }
    
    protected void demoInteraction() {
        Log.current.println("Ready.  Enter demo number 1 ... 17, or exit");
        final BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                System.out.print("> ");
                final String userDemoCommand = stdin.readLine();
                if (userDemoCommand.equals("exit")) {
                    break;
                }
                int demoNbr = 0;
                try {
                    demoNbr = Integer.parseInt(userDemoCommand);
                }
                catch (NumberFormatException e2) {
                    Log.current.println("Not a valid demo number");
                    continue;
                }
                switch (demoNbr) {
                    case 1: {
                        this.demo1();
                        continue;
                    }
                    case 2: {
                        this.demo2();
                        continue;
                    }
                    case 3: {
                        this.demo3();
                        continue;
                    }
                    case 4: {
                        this.demo4();
                        continue;
                    }
                    case 5: {
                        this.demo5();
                        continue;
                    }
                    case 6: {
                        this.demo6();
                        continue;
                    }
                    case 7: {
                        this.demo7();
                        continue;
                    }
                    case 8: {
                        this.demo8();
                        continue;
                    }
                    case 9: {
                        this.demo9();
                        continue;
                    }
                    case 10: {
                        this.demo10();
                        continue;
                    }
                    case 11: {
                        this.demo11();
                        continue;
                    }
                    case 12: {
                        this.demo12();
                        continue;
                    }
                    case 13: {
                        this.demo13();
                        continue;
                    }
                    case 14: {
                        this.demo14();
                        continue;
                    }
                    case 15: {
                        this.demo15();
                        continue;
                    }
                    case 16: {
                        this.demo16();
                        continue;
                    }
                    case 17: {
                        this.demo17();
                        continue;
                    }
                    default: {
                        Log.current.println("Not a valid demo number");
                        continue;
                    }
                }
            }
        }
        catch (Exception e) {
            Log.current.errorPrintln(e.getMessage());
            Log.current.printStackTrace(e);
        }
    }
    
    public static void main(final String[] args) {
        final ApiDemo apiDemo = new ApiDemo();
        apiDemo.demoInteraction();
        System.exit(0);
    }
    
    protected void demo1() throws IOException, UnknownHostException, CycApiException {
        Log.current.println("Demonstrating getKnownConstantByName api function.\n");
        final CycFort snowSkiing = (CycFort)this.cycAccess.getKnownConstantByName("SnowSkiing");
        Log.current.println("\nThe obtained constant is " + snowSkiing.cyclify());
    }
    
    protected void demo2() throws IOException, UnknownHostException, CycApiException {
        Log.current.println("Demonstrating getConstantGuid api function.\n");
        final Guid unitedStatesOfAmericaGuid = this.cycAccess.getConstantGuid("UnitedStatesOfAmerica");
        Log.current.println("\nThe obtained guid is " + unitedStatesOfAmericaGuid);
    }
    
    protected void demo3() throws IOException, UnknownHostException, CycApiException {
        Log.current.println("Demonstrating getComment api function.\n");
        final String comment = this.cycAccess.getComment((CycObject)this.cycAccess.getKnownConstantByName("bordersOn"));
        Log.current.println("\nThe obtained comment is:\n" + comment);
    }
    
    protected void demo4() throws IOException, UnknownHostException, CycApiException {
        Log.current.println("Demonstrating getIsas api function.\n");
        final CycList isas = this.cycAccess.getIsas((CycObject)this.cycAccess.getKnownConstantByName("BillClinton"));
        Log.current.println("\nThe obtained isas are:\n" + isas.cyclify());
    }
    
    protected void demo5() throws IOException, UnknownHostException, CycApiException {
        Log.current.println("Demonstrating getGenls api function.\n");
        final CycList genls = this.cycAccess.getGenls((CycObject)this.cycAccess.getKnownConstantByName("Dog"));
        Log.current.println("\nThe obtained direct genls are:\n" + genls.cyclify());
    }
    
    protected void demo6() throws IOException, UnknownHostException, CycApiException {
        Log.current.println("Demonstrating getArity api function.\n");
        final int arity = this.cycAccess.getArity((CycFort)this.cycAccess.getKnownConstantByName("likesAsFriend"));
        Log.current.println("\nThe obtained arity is " + arity);
    }
    
    protected void demo7() throws IOException, UnknownHostException, CycApiException {
        Log.current.println("Demonstrating arg1Isas api function.\n");
        final CycList arg1Isas = this.cycAccess.getArg1Isas((CycObject)this.cycAccess.getKnownConstantByName("performedBy"));
        Log.current.println("\nThe obtained arg1Isas are:\n" + arg1Isas.cyclify());
    }
    
    protected void demo8() throws IOException, UnknownHostException, CycApiException {
        Log.current.println("Demonstrating getArgNGenls api function.\n");
        final CycList argNGenls = this.cycAccess.getArgNGenls((CycFort)this.cycAccess.getKnownConstantByName("skillCapableOf"), 2);
        Log.current.println("\nThe obtained getArgNGenls are:\n" + argNGenls.cyclify());
    }
    
    protected void demo9() throws IOException, UnknownHostException, CycApiException {
        Log.current.println("Demonstrating getParaphrase api function.\n");
        final CycFormulaSentence formula = this.cycAccess.makeCycSentence("(#$forAll ?THING (#$isa ?Thing #$Thing))");
        final String paraphrase = this.cycAccess.getParaphrase(formula);
        Log.current.println("\nThe obtained paraphrase for\n" + formula + "\nis:\n" + paraphrase);
    }
    
    protected void demo10() throws IOException, UnknownHostException, CycApiException {
        if (this.cycAccess.isOpenCyc()) {
            Log.current.println("\nThis demo is not available in OpenCyc");
        }
        else {
            Log.current.println("Demonstrating getParaphrase api function.\n");
            final CycFormulaSentence formula = this.cycAccess.makeCycSentence("(#$thereExists ?PLANET\n  (#$and\n    (#$isa ?PLANET #$Planet)\n    (#$orbits ?PLANET #$Sun)))");
            final String paraphrase = this.cycAccess.getParaphrase(formula);
            Log.current.println("\nThe obtained paraphrase for\n" + formula + "\nis:\n" + paraphrase);
        }
    }
    
    protected void demo11() throws IOException, UnknownHostException, CycApiException {
        if (this.cycAccess.isOpenCyc()) {
            Log.current.println("\nThis demo is not available in OpenCyc");
        }
        else {
            Log.current.println("Demonstrating getImpreciseParaphrase api function.\n");
            final CycFormulaSentence formula = this.cycAccess.makeCycSentence("(#$forAll ?PERSON1\n  (#$implies\n    (#$isa ?PERSON1 #$Person)\n    (#$thereExists ?PERSON\n      (#$and\n        (#$isa ?PERSON2 #$Person)\n        (#$loves ?PERSON1 ?PERSON2)))))");
            final String paraphrase = this.cycAccess.getImpreciseParaphrase(formula);
            Log.current.println("\nThe obtained imprecise paraphrase for\n" + formula + "\nis:\n" + paraphrase);
        }
    }
    
    protected void demo12() throws IOException, UnknownHostException, CycApiException {
        Log.current.println("Demonstrating CycNart and getInstanceSiblings api function.\n");
        final CycNart usGovernment = new CycNart((CycFort)this.cycAccess.getKnownConstantByName("GovernmentFn"), new Object[] { this.cycAccess.getKnownConstantByName("UnitedStatesOfAmerica") });
        final CycList siblings = this.cycAccess.getInstanceSiblings((CycObject)usGovernment);
        Log.current.println("\nThe obtained instance sibling terms of " + usGovernment + "\nare:\n" + siblings.cyclify());
    }
    
    protected void demo13() throws IOException, UnknownHostException, CycApiException {
        Log.current.println("Demonstrating isQueryTrue api function.\n");
        final CycFormulaSentence gaf = this.cycAccess.makeCycSentence("(#$likesAsFriend #$BillClinton #$JimmyCarter)");
        final CycFort mt = (CycFort)this.cycAccess.getKnownConstantByName("PeopleDataMt");
        final InferenceParameters queryProperties = (InferenceParameters)new DefaultInferenceParameters(this.cycAccess);
        final boolean isQueryTrue = this.cycAccess.isQueryTrue(gaf, (CycObject)mt, queryProperties);
        if (isQueryTrue) {
            Log.current.println("\nThe assertion\n" + gaf + "\nis true in the " + mt.cyclify());
        }
        else {
            Log.current.println("\nThe assertion\n" + gaf + "\nis not known to be true in the " + mt.cyclify());
        }
    }
    
    protected void demo14() throws IOException, UnknownHostException, CycApiException {
        Log.current.println("Demonstrating usage of the assertGaf api function.\n");
        final CycFort mt = (CycFort)this.cycAccess.getKnownConstantByName("PeopleDataMt");
        final CycFormulaSentence gaf = this.cycAccess.makeCycSentence("(#$likesAsFriend #$BillClinton #$JimmyCarter)");
        this.cycAccess.assertGaf(gaf, (CycObject)mt);
    }
    
    protected void demo15() throws IOException, UnknownHostException, CycApiException {
        Log.current.println("Demonstrating usage of the unassertGaf api function.\n");
        final CycFort mt = (CycFort)this.cycAccess.getKnownConstantByName("PeopleDataMt");
        final CycFormulaSentence gaf = this.cycAccess.makeCycSentence("(#$likesAsFriend #$BillClinton #$JimmyCarter)");
        this.cycAccess.unassertGaf(gaf, (CycObject)mt);
    }
    
    protected void demo16() throws IOException, UnknownHostException, CycApiException {
        if (this.cycAccess.isOpenCyc()) {
            Log.current.println("\nThis demo is not available in OpenCyc");
        }
        else {
            Log.current.println("Demonstrating usage of the rkfPhraseReader api function.\n");
            final String phrase = "penguins";
            final CycFort inferencePsc = (CycFort)this.cycAccess.getKnownConstantByGuid("bd58915a-9c29-11b1-9dad-c379636f7270");
            final CycFort rkfEnglishLexicalMicrotheoryPsc = (CycFort)this.cycAccess.getKnownConstantByGuid("bf6df6e3-9c29-11b1-9dad-c379636f7270");
            final CycList parsingExpression = this.cycAccess.rkfPhraseReader(phrase, rkfEnglishLexicalMicrotheoryPsc, inferencePsc);
            Log.current.println("the result of parsing the phrase \"" + phrase + "\" is\n" + parsingExpression);
        }
    }
    
    protected void demo17() throws IOException, UnknownHostException, CycApiException {
        if (this.cycAccess.isOpenCyc()) {
            Log.current.println("\nThis demo is not available in OpenCyc");
        }
        else {
            Log.current.println("Demonstrating usage of the generateDisambiguationPhraseAndTypes api function.\n");
            final CycFort mt = (CycFort)this.cycAccess.getKnownConstantByName("PeopleDataMt");
            final CycList objects = this.cycAccess.makeCycList("(#$Penguin #$PittsburghPenguins)");
            final CycList disambiguationExpression = this.cycAccess.generateDisambiguationPhraseAndTypes(objects);
            Log.current.println("the result of disambiguating the objects \"" + objects.cyclify() + "\" is\n" + disambiguationExpression);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 88 ms
	
	Decompiled with Procyon 0.5.32.
*/
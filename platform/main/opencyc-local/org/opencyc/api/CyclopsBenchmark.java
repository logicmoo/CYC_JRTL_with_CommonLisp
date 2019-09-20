package org.opencyc.api;

public class CyclopsBenchmark
{
    public String benchmarkFilePath;
    
    public CyclopsBenchmark() {
        this.benchmarkFilePath = "benchmarks.lisp";
    }
    
    public static void main(final String[] args) {
        final CyclopsBenchmark cyclopsBenchmark = new CyclopsBenchmark();
        cyclopsBenchmark.execute();
    }
    
    public void execute() {
        Double cyclops = null;
        try {
            final CycAccess cycAccess = new CycAccess();
            System.out.println("Loading benchmarks.lisp");
            String script = "(load \"" + this.benchmarkFilePath + "\")";
            cycAccess.converseVoid((Object)script);
            script = "(benchmark-cyclops)";
            System.out.println("Running Cyclops benchmark");
            cyclops = (Double)cycAccess.converseObject((Object)script);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println(cyclops + " Cyclops (Cyc Logical Operations Per Second)");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 36 ms
	
	Decompiled with Procyon 0.5.32.
*/
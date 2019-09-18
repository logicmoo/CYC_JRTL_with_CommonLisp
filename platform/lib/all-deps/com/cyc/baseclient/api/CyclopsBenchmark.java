package com.cyc.baseclient.api;

import com.cyc.baseclient.CycClient;
import java.net.*;
import java.io.*;

/**
 * Loads and executes the Cyclops (Cyc Logical Operations) benchmark.<p>
 * @version $Id: CyclopsBenchmark.java 150938 2014-05-02 21:39:12Z nwinant $
 * @author Stephen L. Reed
 */
public class CyclopsBenchmark {

    /**
     * Constructs a new CyclopsBenchmark object.
     */
    public CyclopsBenchmark() {
    }

    /**
     * Path to benchmark the subl file.
     */
    public String benchmarkFilePath = "benchmarks.lisp";

    /**
     * Main method to load and execute the Cyclops benchmark.
     */
    public static void main(String[] args) {
        CyclopsBenchmark cyclopsBenchmark = new CyclopsBenchmark();
        cyclopsBenchmark.execute();
    }

    public void execute () {
        Double cyclops = null;
        try {
            CycClient cycAccess = new CycClient();
            System.out.println("Loading benchmarks.lisp");
            String script = "(load \"" + benchmarkFilePath + "\")";
            cycAccess.converse().converseVoid(script);
            script = "(benchmark-cyclops)";
            System.out.println("Running Cyclops benchmark");
            cyclops = (Double) cycAccess.converse().converseObject(script);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println(cyclops + " Cyclops (Cyc Logical Operations Per Second)");
    }

}

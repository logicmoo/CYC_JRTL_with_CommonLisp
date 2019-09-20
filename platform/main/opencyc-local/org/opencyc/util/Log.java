package org.opencyc.util;

import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class Log
{
    public static volatile Log current;
    protected boolean writeToFile;
    protected boolean writeToOut;
    protected String logFilePath;
    protected PrintWriter printWriter;
    protected BufferedWriter writer;
    protected static final String DEFAULT_LOG_FILENAME = "cyc-api.log";
    
    public static void makeLog() {
        makeLog("cyc-api.log");
    }
    
    public static void makeLog(final String logName) {
        if (Log.current != null) {
            return;
        }
        boolean writeToFile = false;
        final boolean writeToOut = true;
        try {
            final String logProperty = System.getProperty("org.opencyc.util.log", "default");
            if (logProperty.equalsIgnoreCase("file")) {
                writeToFile = true;
            }
            else if (!logProperty.equalsIgnoreCase("default")) {
                System.err.println("Invalid value for property org.opencyc.util.log " + logProperty + " substituting default");
            }
        }
        catch (SecurityException e) {
            writeToFile = false;
        }
        Log.current = new Log(logName, writeToFile, writeToOut);
    }
    
    public Log() {
        this("cyc-api.log", false, false);
    }
    
    public Log(final String logFilePath) {
        this(logFilePath, false, true);
    }
    
    public Log(final String logFilePath, final boolean writeToFile, final boolean writeToOut) {
        this.logFilePath = logFilePath;
        this.writeToFile = writeToFile;
        this.writeToOut = writeToOut;
        this.printWriter = null;
    }
    
    public void setStorageLocation(final String location) throws IOException {
        if (this.printWriter != null) {
            this.close();
        }
        this.logFilePath = location;
    }
    
    public String getStorageLocation() {
        return this.logFilePath;
    }
    
    public void println(final int message) {
        this.println(Integer.toString(message));
    }
    
    public void println() {
        if (this.writeToOut) {
            System.out.print("\n");
        }
        if (this.writeToFile) {
            this.checkLogFile();
            this.printWriter.print("\n");
            this.printWriter.flush();
        }
    }
    
    public void print(final char c) {
        if (this.writeToOut) {
            System.out.print(c);
        }
        if (this.writeToFile) {
            this.checkLogFile();
            this.printWriter.print(c);
            this.printWriter.flush();
        }
    }
    
    public void print(final Object object) {
        this.print(object.toString());
    }
    
    public void print(final String message) {
        if (this.writeToOut) {
            System.out.print(message);
        }
        if (this.writeToFile) {
            this.checkLogFile();
            this.printWriter.print(message);
            this.printWriter.flush();
        }
    }
    
    public void println(final Object object) {
        this.println(object.toString());
    }
    
    public void println(final String message) {
        if (this.writeToOut) {
            System.out.println(message);
        }
        if (this.writeToFile) {
            this.checkLogFile();
            this.printWriter.println(message);
            this.printWriter.flush();
        }
    }
    
    public void errorPrintln(final String errorMessage) {
        System.err.println(errorMessage);
        if (this.writeToFile) {
            this.checkLogFile();
            this.printWriter.println(errorMessage);
            this.printWriter.flush();
        }
    }
    
    public void printStackTrace(final Exception exception) {
        exception.printStackTrace();
        if (this.writeToFile) {
            this.checkLogFile();
            exception.printStackTrace(this.printWriter);
            this.printWriter.flush();
        }
    }
    
    public void close() {
        if (this.writeToFile && this.printWriter != null) {
            this.printWriter.close();
            this.printWriter = null;
        }
    }
    
    public static void setCurrent(final Log log) {
        Log.current = log;
    }
    
    protected void checkLogFile() {
        if (this.printWriter != null) {
            return;
        }
        try {
            this.printWriter = new PrintWriter(new BufferedWriter(new FileWriter(this.logFilePath)));
        }
        catch (IOException e) {
            System.err.println("Error creating log file " + this.logFilePath);
            System.err.println(e);
        }
        catch (SecurityException e2) {
            System.out.println("Security policy does not permit a log file.");
            this.writeToFile = false;
        }
    }
    
    static {
        Log.current = null;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 57 ms
	
	Decompiled with Procyon 0.5.32.
*/
package org.opencyc.util;

public class DefaultCancelable implements Cancelable
{
    String taskName;
    
    public DefaultCancelable(final String name) {
        this.taskName = name;
    }
    
    public void cancelTask() {
        System.out.println("Task " + this.taskName + " canceled!");
    }
    
    @Override
    public String toString() {
        return this.taskName;
    }
    
    public static void main(final String[] args) {
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 29 ms
	
	Decompiled with Procyon 0.5.32.
*/
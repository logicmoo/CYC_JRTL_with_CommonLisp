package org.opencyc.api;

public class CloseTest
{
    public static void main(final String[] args) {
        System.out.println("Starting");
        System.out.flush();
        CycAccess access = null;
        try {
            access = new CycAccess("localhost", 3660);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                access.close();
            }
            catch (Exception ex) {}
            System.out.println("Finished.");
            System.out.flush();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 16 ms
	
	Decompiled with Procyon 0.5.32.
*/
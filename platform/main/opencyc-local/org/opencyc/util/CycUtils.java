package org.opencyc.util;

import java.util.Calendar;
import java.net.UnknownHostException;
import org.opencyc.cycobject.CycObject;
import java.util.Date;
import org.opencyc.api.CycApiException;
import org.opencyc.api.SubLWorkerSynch;
import org.opencyc.api.DefaultSubLWorkerSynch;
import java.io.IOException;
import org.opencyc.api.CycIOException;
import org.opencyc.api.CycConnection;
import org.opencyc.api.CycAccess;

public class CycUtils
{
    private static boolean useTiming;
    private static long SUBL_TIME_OFFSET;
    
    public static synchronized Object evalSubL(final CycAccess connection, final String subl) {
        Object result = null;
        try {
            if (CycConnection.inAWTEventThread()) {
                throw new RuntimeException("Unable to communicate with Cyc from the AWT event dispatch thread.");
            }
            long resultMsecs = 0L;
            if (CycUtils.useTiming) {
                resultMsecs = System.currentTimeMillis();
            }
            result = connection.converseObject((Object)subl);
            if (CycUtils.useTiming) {
                System.out.println("Finished call: " + subl);
                resultMsecs = System.currentTimeMillis() - resultMsecs;
                System.out.println("Call took: " + resultMsecs + " msecs.");
            }
        }
        catch (IOException e) {
            throw new CycIOException((Throwable)e);
        }
        return result;
    }
    
    public static synchronized Object evalSubLWithWorker(final CycAccess connection, final String subl) throws IOException, TimeOutException, CycApiException {
        final SubLWorkerSynch worker = (SubLWorkerSynch)new DefaultSubLWorkerSynch(subl, connection);
        return worker.getWork();
    }
    
    public static Object getSymbolValue(final CycAccess connection, final String symbol) {
        Object result = null;
        result = evalSubL(connection, "(SYMBOL-VALUE (QUOTE " + symbol + "))");
        return result;
    }
    
    public static CycWorker evalSubLInBackground(final CycAccess conn, final String subl, final CycWorkerListener cwl) {
        final CycWorker worker = new CycWorker() {
            public Object construct() throws Exception {
                return CycUtils.evalSubL(conn, subl);
            }
        };
        if (cwl != null) {
            worker.addListener(cwl);
        }
        worker.start();
        return worker;
    }
    
    public static Date convertSubLTimeStampToDate(final long timeStamp) {
        return new Date(timeStamp * 1000L - CycUtils.SUBL_TIME_OFFSET + 3600000L);
    }
    
    @Deprecated
    public static String getCBFormString(final CycObject elem, final CycAccess cyc) throws UnknownHostException, IOException {
        final String command = "(cb-form-string '" + elem.cyclify() + " :cb)";
        return cyc.converseString((Object)command);
    }
    
    static {
        CycUtils.useTiming = false;
        final Calendar cal = Calendar.getInstance();
        cal.set(1900, 0, 1);
        final long time = cal.getTime().getTime();
        cal.set(1970, 0, 1);
        CycUtils.SUBL_TIME_OFFSET = cal.getTime().getTime() - time;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 65 ms
	
	Decompiled with Procyon 0.5.32.
*/
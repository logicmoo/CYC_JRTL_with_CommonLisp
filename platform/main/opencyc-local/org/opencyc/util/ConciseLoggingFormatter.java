package org.opencyc.util;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class ConciseLoggingFormatter extends SimpleFormatter
{
    @Override
    public String format(final LogRecord logRecord) {
        final StringBuffer stringBuffer = new StringBuffer();
        if (logRecord == null) {
            stringBuffer.append("null logRecord received by ConciseLoggingFormatter");
        }
        else if (logRecord.getMessage() == null) {
            stringBuffer.append("null logRecord message received by ConciseLoggingFormatter");
        }
        else {
            stringBuffer.append(logRecord.getMessage());
        }
        stringBuffer.append('\n');
        return stringBuffer.toString();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 36 ms
	
	Decompiled with Procyon 0.5.32.
*/
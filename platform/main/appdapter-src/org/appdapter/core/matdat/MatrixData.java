package org.appdapter.core.matdat;

import org.slf4j.Logger;
import scala.runtime.BoxedUnit;
import scala.Function1;
import java.util.Map;
import java.io.Reader;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "M<Q!\t-\t!\"T1ue&DH);b\tA!nCR$\r\tAaY8sK*qC\nCBH-9uKJT!C_J<7\t5iA\tA\ta$(/=ECR\f7CA!\t\tB#D\tB!Am_L!!\n\t7/[2EK\n,xmZ3s9R\"aN\\5u}Q\t1C1$qe>Wm]:TQ,GFE-\"!\byQaHg\fG.YCyA!8ji\")1%aIQO7BcBA'\t9c$Qe$WMZS)aa;sS:<'BAa1.%(o\\2fgN|']AbBA%1UO\\2uS>t\rc%!G\n$(/=S_^DQNU\nQ:pG8o5fKRFc7\")qg\raqI!/Y<SK$WM\tsyjAwq\n!![8u\nAA[1wC&qH%\fG-:\t1A\t\tkAA\")I,\r&bml\r$s_6.Z3u)!%\nT)T!)\n\nS!a\tU$\\1!T1qY\t1%!\b.Z3u+JcbB'B!\rAT\nQ\fG-:D]R\"!H(\nAs\"aA%oi\"9!+Iq!C6fs{G.3y!\t%AA9B7D_2LE\r-6!\taVe\fGMS1wC6O:p[NCW-;S)!,.\\9T19iU%AA9CqAU+a\nCU+B\t(\tuk!C=y\"/Z1e4-T1q\rJ|Wn5fKRFZ3gCVdG\n}S#A1,\"AY4\rT!Z3Ut7\r[3dW$'B4)\tgN\\8uCRLwN\\Q#8dQ7.3WCJLM\\2fQW\"%AyqD]3bI*g/Y'bax.\\*iK$(\n3fM,H4aW\"%AyqD]3bI*g/Y'bax.\\*iK$(\n3fM,H5qW\"%AyaD]3bI*g/Y'bax.\\*iK$HZ3gCVdG\n\tAl!C=q\"/Z1e4-T1q\rJ|Wn5fKR$C-4bk2$He\r\be6\t\n\"_yX-3KCZ\fW*9Ge>l7[3fi\"WMZ1vYR$C")
public final class MatrixData
{
    public static int readJavaMapFromSheet$default$4() {
        return MatrixData$.MODULE$.readJavaMapFromSheet$default$4();
    }
    
    public static int readJavaMapFromSheet$default$3() {
        return MatrixData$.MODULE$.readJavaMapFromSheet$default$3();
    }
    
    public static int readJavaMapFromSheet$default$2() {
        return MatrixData$.MODULE$.readJavaMapFromSheet$default$2();
    }
    
    public static int readJavaMapFromSheetR$default$4() {
        return MatrixData$.MODULE$.readJavaMapFromSheetR$default$4();
    }
    
    public static int readJavaMapFromSheetR$default$3() {
        return MatrixData$.MODULE$.readJavaMapFromSheetR$default$3();
    }
    
    public static int readJavaMapFromSheetR$default$2() {
        return MatrixData$.MODULE$.readJavaMapFromSheetR$default$2();
    }
    
    public static Map<String, String> readJavaMapFromSheetR(final Reader rawReader, final int headerCnt, final int keyColIdx, final int vlColIdx) {
        return MatrixData$.MODULE$.readJavaMapFromSheetR(rawReader, headerCnt, keyColIdx, vlColIdx);
    }
    
    public static Map<String, String> readJavaMapFromSheet(final String sheetURL, final int headerCnt, final int keyColIdx, final int vlColIdx) {
        return MatrixData$.MODULE$.readJavaMapFromSheet(sheetURL, headerCnt, keyColIdx, vlColIdx);
    }
    
    public static void processSheetR(final Reader rawReader, final Function1<MatrixRow, BoxedUnit> processor) {
        MatrixData$.MODULE$.processSheetR(rawReader, processor);
    }
    
    public static void processSheet(final String url, final Function1<MatrixRow, BoxedUnit> processor) {
        MatrixData$.MODULE$.processSheet(url, processor);
    }
    
    public static void logDebug(final String s) {
        MatrixData$.MODULE$.logDebug(s);
    }
    
    public static void logWarning(final String s) {
        MatrixData$.MODULE$.logWarning(s);
    }
    
    public static void logError(final String s) {
        MatrixData$.MODULE$.logError(s);
    }
    
    public static void logWarning(final String s, final Throwable t) {
        MatrixData$.MODULE$.logWarning(s, t);
    }
    
    public static void logError(final String s, final Throwable t) {
        MatrixData$.MODULE$.logError(s, t);
    }
    
    public static void logInfo(final String s) {
        MatrixData$.MODULE$.logInfo(s);
    }
    
    public static void logInfo(final int n, final String s) {
        MatrixData$.MODULE$.logInfo(n, s);
    }
    
    public static Long logInfoEvent(final int n, final boolean b, final Long n2, final String s, final Object[] array) {
        return MatrixData$.MODULE$.logInfoEvent(n, b, n2, s, array);
    }
    
    public static boolean checkDebugImportance(final int n) {
        return MatrixData$.MODULE$.checkDebugImportance(n);
    }
    
    public static void setDebugImportanceThreshold(final int debugImportanceThreshold) {
        MatrixData$.MODULE$.setDebugImportanceThreshold(debugImportanceThreshold);
    }
    
    public static void setLogger(final Logger logger) {
        MatrixData$.MODULE$.setLogger(logger);
    }
    
    public static void useLoggerForClass(final Class clazz) {
        MatrixData$.MODULE$.useLoggerForClass(clazz);
    }
}

/*

	Total time: 31 ms
	
*/
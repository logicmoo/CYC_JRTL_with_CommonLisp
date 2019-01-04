package org.appdapter.core.matdat;

import org.slf4j.Logger;
import org.appdapter.core.name.Ident;
import org.appdapter.help.repo.RepoClient;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "q:Q!\t-\tA#T8eK2&o<jIh)Y2u_JL(BAi\r3bi*QABG>XM\bI\r9eCB$XMqN]4AA\"D)aBE\t!Rj3fYBxN^5eKJ4m;pef\"!\tE!R\"\nM!a7pO&QCn#fEV<w-:\t]iA\r\rqJg.;?)Y\"\tYAG7bW|e.#jeG/T8eK2&o<jIHc SAA\"H=\t!CQ8v]luZ3m!J|g/3fe\")%aC!o\tEja\tI\nAA]3q_*aEBQd/)G\tQ!+9p2LWM;\t)JA\r5J\tBAfL[)aB]lW-1[\t)\nZ3oi\")!'CgYR.Y6f:,G):jm$Wj3fYBxN^5eKJ$B\b6u!)%\raC!)a'\rao/]:1ABAE]3mS:,+^3ssNXmwE\raK_V$xI]1qQ&#")
public final class ModelProviderFactory
{
    public static BoundModelProvider makeOneDerivedModelProvider(final RepoClient rc, final PipelineQuerySpec pqs, final Ident outGraphID) {
        return ModelProviderFactory$.MODULE$.makeOneDerivedModelProvider(rc, pqs, outGraphID);
    }
    
    public static BoundModelProvider makeOneDirectModelProvider(final RepoClient rc, final Ident graphID) {
        return ModelProviderFactory$.MODULE$.makeOneDirectModelProvider(rc, graphID);
    }
    
    public static void logDebug(final String s) {
        ModelProviderFactory$.MODULE$.logDebug(s);
    }
    
    public static void logWarning(final String s) {
        ModelProviderFactory$.MODULE$.logWarning(s);
    }
    
    public static void logError(final String s) {
        ModelProviderFactory$.MODULE$.logError(s);
    }
    
    public static void logWarning(final String s, final Throwable t) {
        ModelProviderFactory$.MODULE$.logWarning(s, t);
    }
    
    public static void logError(final String s, final Throwable t) {
        ModelProviderFactory$.MODULE$.logError(s, t);
    }
    
    public static void logInfo(final String s) {
        ModelProviderFactory$.MODULE$.logInfo(s);
    }
    
    public static void logInfo(final int n, final String s) {
        ModelProviderFactory$.MODULE$.logInfo(n, s);
    }
    
    public static Long logInfoEvent(final int n, final boolean b, final Long n2, final String s, final Object[] array) {
        return ModelProviderFactory$.MODULE$.logInfoEvent(n, b, n2, s, array);
    }
    
    public static boolean checkDebugImportance(final int n) {
        return ModelProviderFactory$.MODULE$.checkDebugImportance(n);
    }
    
    public static void setDebugImportanceThreshold(final int debugImportanceThreshold) {
        ModelProviderFactory$.MODULE$.setDebugImportanceThreshold(debugImportanceThreshold);
    }
    
    public static void setLogger(final Logger logger) {
        ModelProviderFactory$.MODULE$.setLogger(logger);
    }
    
    public static void useLoggerForClass(final Class clazz) {
        ModelProviderFactory$.MODULE$.useLoggerForClass(clazz);
    }
}

/*

	Total time: 24 ms
	
*/
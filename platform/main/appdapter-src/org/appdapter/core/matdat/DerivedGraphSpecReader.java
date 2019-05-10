package org.appdapter.core.matdat;

import org.slf4j.Logger;
import org.appdapter.core.name.Ident;
import scala.collection.immutable.Set;
import org.appdapter.help.repo.RepoClient;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "9;Q!\t-\taR3sSZ,Gm:ba\"/Z2SK$WM\ta!\\1uI$(BAwN]3A!C1qa\f^3sIaA8sOCa!\by!A#fe&4X\rZ$sCBD7]3d%\fG-:5CA\t\"BA\n\rawnZ+IQBQ1tS$UMY;hO\b\"B\f\tAAj]&$h\bF\fQR\"]1N3P]$UM]5wK<%/9i'B,7\r?%rC\tq\"A\tEKJLg/3He\bn9fG\")%aC!o\tEja\tI\nAA]3q_*aEBQd/)G\tQ!+9p2LWM;\t)JAA\f8\rY%QF!&X\r\\5oKF+XM]=Ta\"BAC8vi\r5J\tBNe)1B]lW-6e\t)\nZ3oi\")q'CqaR.Y6f2dG):jm$Wj3fYBxN^5eKJHcAGB!\bQ\"mrT\"u\nQa]2bYL!a\rAX\rZ3g\t\t%IATKRT!a1!BA#Iu.8e>$W\r)s_ZLG-:\t2A\t)2A\t%kA&-E,XM]=EKJLg/3He\bn9fGN$2a'N!\rQ\t\bA!\r!\tU!\ra")
public final class DerivedGraphSpecReader
{
    public static Set<DerivedGraphSpec> queryDerivedGraphSpecs(final RepoClient rc, final PipelineQuerySpec pqs) {
        return DerivedGraphSpecReader$.MODULE$.queryDerivedGraphSpecs(rc, pqs);
    }
    
    public static Set<BoundModelProvider> makeAllDerivedModelProviders(final RepoClient rc, final PipelineQuerySpec pqs) {
        return DerivedGraphSpecReader$.MODULE$.makeAllDerivedModelProviders(rc, pqs);
    }
    
    public static DerivedGraphSpec findOneDerivedGraphSpec(final RepoClient rc, final PipelineQuerySpec pqs, final Ident outGraphID) {
        return DerivedGraphSpecReader$.MODULE$.findOneDerivedGraphSpec(rc, pqs, outGraphID);
    }
    
    public static void logDebug(final String s) {
        DerivedGraphSpecReader$.MODULE$.logDebug(s);
    }
    
    public static void logWarning(final String s) {
        DerivedGraphSpecReader$.MODULE$.logWarning(s);
    }
    
    public static void logError(final String s) {
        DerivedGraphSpecReader$.MODULE$.logError(s);
    }
    
    public static void logWarning(final String s, final Throwable t) {
        DerivedGraphSpecReader$.MODULE$.logWarning(s, t);
    }
    
    public static void logError(final String s, final Throwable t) {
        DerivedGraphSpecReader$.MODULE$.logError(s, t);
    }
    
    public static void logInfo(final String s) {
        DerivedGraphSpecReader$.MODULE$.logInfo(s);
    }
    
    public static void logInfo(final int n, final String s) {
        DerivedGraphSpecReader$.MODULE$.logInfo(n, s);
    }
    
    public static Long logInfoEvent(final int n, final boolean b, final Long n2, final String s, final Object[] array) {
        return DerivedGraphSpecReader$.MODULE$.logInfoEvent(n, b, n2, s, array);
    }
    
    public static boolean checkDebugImportance(final int n) {
        return DerivedGraphSpecReader$.MODULE$.checkDebugImportance(n);
    }
    
    public static void setDebugImportanceThreshold(final int debugImportanceThreshold) {
        DerivedGraphSpecReader$.MODULE$.setDebugImportanceThreshold(debugImportanceThreshold);
    }
    
    public static void setLogger(final Logger logger) {
        DerivedGraphSpecReader$.MODULE$.setLogger(logger);
    }
    
    public static void useLoggerForClass(final Class clazz) {
        DerivedGraphSpecReader$.MODULE$.useLoggerForClass(clazz);
    }
}

/*

	Total time: 25 ms
	
*/
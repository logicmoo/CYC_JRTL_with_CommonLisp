package org.appdapter.core.matdat;

import org.slf4j.Logger;
import org.appdapter.core.store.ModelClient;
import scala.collection.immutable.Set;
import org.appdapter.core.name.Ident;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "m:Q!\t-\tV=qKVm:d\rGo:z\tA!nCR$\r\tAaY8sK*qC\nCBH-9uKJT!C_J<7\t5iA\tA\ta)fX\r*fgJg)Y2u_JL8CA!\t\tB#D\tB!Am_L!!\n\t7/[2EK\n,xmZ3s9R\"aN\\5u}Q\t1C1$\tfqB|7/+za$'+Z:sGR!AdH4!\taQ$\tQA+9fIJ+7O]2\tJAt0#\t*S\"A\"8b[L!AJ%#WM;\t!JA-twn8UsB,\nR:)E,]5\tAFC.8-7b\tyC&Qe$WMZcI1aU3u\tyCC53Q'n_,Gn7j!\t1(D8\tAD!Ati>X-;o\tYQj3fYc.8u")
public final class TypedResrcFactory
{
    public static TypedResrc exposeTypedResrc(final Ident anyID, final Set<Ident> knownTypeIDs, final ModelClient modelCli) {
        return TypedResrcFactory$.MODULE$.exposeTypedResrc(anyID, knownTypeIDs, modelCli);
    }
    
    public static void logDebug(final String s) {
        TypedResrcFactory$.MODULE$.logDebug(s);
    }
    
    public static void logWarning(final String s) {
        TypedResrcFactory$.MODULE$.logWarning(s);
    }
    
    public static void logError(final String s) {
        TypedResrcFactory$.MODULE$.logError(s);
    }
    
    public static void logWarning(final String s, final Throwable t) {
        TypedResrcFactory$.MODULE$.logWarning(s, t);
    }
    
    public static void logError(final String s, final Throwable t) {
        TypedResrcFactory$.MODULE$.logError(s, t);
    }
    
    public static void logInfo(final String s) {
        TypedResrcFactory$.MODULE$.logInfo(s);
    }
    
    public static void logInfo(final int n, final String s) {
        TypedResrcFactory$.MODULE$.logInfo(n, s);
    }
    
    public static Long logInfoEvent(final int n, final boolean b, final Long n2, final String s, final Object[] array) {
        return TypedResrcFactory$.MODULE$.logInfoEvent(n, b, n2, s, array);
    }
    
    public static boolean checkDebugImportance(final int n) {
        return TypedResrcFactory$.MODULE$.checkDebugImportance(n);
    }
    
    public static void setDebugImportanceThreshold(final int debugImportanceThreshold) {
        TypedResrcFactory$.MODULE$.setDebugImportanceThreshold(debugImportanceThreshold);
    }
    
    public static void setLogger(final Logger logger) {
        TypedResrcFactory$.MODULE$.setLogger(logger);
    }
    
    public static void useLoggerForClass(final Class clazz) {
        TypedResrcFactory$.MODULE$.useLoggerForClass(clazz);
    }
}

/*

	Total time: 23 ms
	
*/
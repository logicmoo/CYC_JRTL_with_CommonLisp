package org.appdapter.core.matdat;

import org.slf4j.Logger;
import java.util.List;
import org.appdapter.impl.store.DatabaseRepo;
import org.appdapter.core.name.Ident;
import org.appdapter.core.store.Repo;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "q<Q!\t-\tQCU3q_R+7^3s?R+5V*`:cL\t1Q.;eCRT!!\t\r|'/!\t\"9qIH/:%\t1a:h\"D\t1QA\t=QCU3q_R+7^3s?R+5V*`:cl!AF%)1BY><BA5m]5d\tWoZ4fe\")q#C11A(8jiz\"a55!\taGY>\fGmR8pONCW-;SKB|G# WAC\tq\"AATQ,GOU3q_\")%aCA1[3fi.+#Q91EJI)\tQ%AtGd-(I1K]3eKL!!\rM#(/8h\t9CC-3Q&A\toC6,7]1dKNCW-;Ok6\"a\t\n=\"#aA%oi\")'a[YA-:TQ,GOT;n1511\\3N_,Gn't!\r)$\bPm)qOkRLGNC:QM^1\nm2$'jgR\"!!yR!a\t1\fgnZz1b7bgNdu.3fe\")1)C\t\tBn\\1e12l5fKRV\r]8q)u)S&\tAMDW-;M_\fG/[8oA%\t1\"Iq-\\3taWm5fKRt-\\3\t)AL'o5fKRt-\\3\tM\t5kA(!1|\r#bim]3SKB|GB(X3n\"U+ES!AU*M$xN]3Q3B5na2L!AV)G/2bgV\r]8\tacA\r|gNZ5h!$\bC[A(\npaRuN4jOJ+7o7wKc\"/MiA3je\r5J\tBa,Y?*\rB]lW-c?\n)\nZ3oi\")A-CKqA/Z:u%xR5sK$HC4jiZD($O&\n+:LGCkG1.sKB|C7r\tiw.Do\tF!q]!!+9p\t8OAXSRDG):fGR|'/a:DQ!^2A\nq\"];fef.Z3u#:W.o\r!IcV,'/_)OC6,\"B=d\t;hi\r5Ta,OY8\r1\"5!x\r^$sCBDKT1nK")
public final class RepoTester_TESTS_ONLY
{
    public static void testRepoDirect(final Repo.WithDirectory repo, final String querySheetQName, final String queryQName, final String tgtGraphSparqlVN, final String tgtGraphQName) {
        RepoTester_TESTS_ONLY$.MODULE$.testRepoDirect(repo, querySheetQName, queryQName, tgtGraphSparqlVN, tgtGraphQName);
    }
    
    public static DatabaseRepo loadDatabaseRepo(final String configPath, final ClassLoader optConfigResolveCL, final Ident dirGraphID) {
        return RepoTester_TESTS_ONLY$.MODULE$.loadDatabaseRepo(configPath, optConfigResolveCL, dirGraphID);
    }
    
    public static SheetRepo loadXLSXSheetRepo(final String sheetLocation, final String namespaceSheetName, final String dirSheetName, final List<ClassLoader> fileModelCLs) {
        return RepoTester_TESTS_ONLY$.MODULE$.loadXLSXSheetRepo(sheetLocation, namespaceSheetName, dirSheetName, fileModelCLs);
    }
    
    public static SheetRepo loadGoogSheetRepo(final String sheetKey, final int namespaceSheetNum, final int dirSheetNum, final List<ClassLoader> fileModelCLs) {
        return RepoTester_TESTS_ONLY$.MODULE$.loadGoogSheetRepo(sheetKey, namespaceSheetNum, dirSheetNum, fileModelCLs);
    }
    
    public static void logDebug(final String s) {
        RepoTester_TESTS_ONLY$.MODULE$.logDebug(s);
    }
    
    public static void logWarning(final String s) {
        RepoTester_TESTS_ONLY$.MODULE$.logWarning(s);
    }
    
    public static void logError(final String s) {
        RepoTester_TESTS_ONLY$.MODULE$.logError(s);
    }
    
    public static void logWarning(final String s, final Throwable t) {
        RepoTester_TESTS_ONLY$.MODULE$.logWarning(s, t);
    }
    
    public static void logError(final String s, final Throwable t) {
        RepoTester_TESTS_ONLY$.MODULE$.logError(s, t);
    }
    
    public static void logInfo(final String s) {
        RepoTester_TESTS_ONLY$.MODULE$.logInfo(s);
    }
    
    public static void logInfo(final int n, final String s) {
        RepoTester_TESTS_ONLY$.MODULE$.logInfo(n, s);
    }
    
    public static Long logInfoEvent(final int n, final boolean b, final Long n2, final String s, final Object[] array) {
        return RepoTester_TESTS_ONLY$.MODULE$.logInfoEvent(n, b, n2, s, array);
    }
    
    public static boolean checkDebugImportance(final int n) {
        return RepoTester_TESTS_ONLY$.MODULE$.checkDebugImportance(n);
    }
    
    public static void setDebugImportanceThreshold(final int debugImportanceThreshold) {
        RepoTester_TESTS_ONLY$.MODULE$.setDebugImportanceThreshold(debugImportanceThreshold);
    }
    
    public static void setLogger(final Logger logger) {
        RepoTester_TESTS_ONLY$.MODULE$.setLogger(logger);
    }
    
    public static void useLoggerForClass(final Class clazz) {
        RepoTester_TESTS_ONLY$.MODULE$.useLoggerForClass(clazz);
    }
}

/*

	Total time: 26 ms
	
*/
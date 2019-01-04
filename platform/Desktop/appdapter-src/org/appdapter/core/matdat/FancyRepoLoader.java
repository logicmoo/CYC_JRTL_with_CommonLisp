package org.appdapter.core.matdat;

import org.slf4j.Logger;
import org.appdapter.impl.store.DatabaseRepo;
import org.appdapter.core.store.Repo;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Model;
import java.util.Map;
import java.util.List;
import org.appdapter.core.name.Ident;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "eu!BYa$b]L(+9p>\fG-:\r!AB7bi\fGO\r!1m:f\t9\"AbaB$\r;fe*\t\"Ape\r5\t!AB!qBA\bGC:PU3q_2{\rZ3s'\ti)5\t!C\tAn\\4\nU\"!\"bg&G)2vO,'C$=S:LGO!)!$C7y\r3J]ZL7O7f:4wM!RCA$\tq%D !B:dC2\fB &/3fM&A%\n'RN\\4\tz\"BaAA5oI1Y\"Ba!<\t5jA+5\f7.*fa><5ESJ,7\r^8ssR)qFMJ3BAMc\tabT7oS2{\rZ3s%xC4YA'taC6\t1$ASKB|7]3dAD1:!!N]'pIdCHY$B>iwZ3m\tqt(AsIT!Q!\t),g.19m\t!U)ia*\ta)Ad_6L!S5{G-7\t)c!aaa-7f>$W\r\\\"MgBA*U*5S!AT(\tU$!!!.<b\tVJMSN$\bC+X)&B,PaM\\4\na+&aC\"mCNHj\\1eKJDqA1,eSJ<%/9i\"X0uS!A\t9\fW.ZAvQ!3f]RDQAY\r\f\\8bIG/2bgV\r]8\tdg\tK*lAO\"\fQa;peT!!\t%l\\WAR1uC\n\f7/*fa>DQ!\\1Aq\t!bY8oM&<+;iy\r1TIy^\"p]LwMU3t_24Xm'\tiA.\tIlAA:Q,7*fa>$N]3diRQAo^A\ti!!y)B< )f.;\ta\f\bA=\tI,o\tu~t!a_?qT!a\nyd*fa>LA!!\tiq+;i\t&Xm;pefT!A ?\t\r1=\tX/:z'\",W\r^)OC6,BBAcA$rk0(b[Da!ara;hi\r5Ta,O\t\"a9iAo;He\b.(b[Dq!a\t\tI\"\bsKBdmY3PeVsn8Q\fY\"a6eCA+\r!a\b5\fN#tKRB!!\t(51Ky!B9vKJLBAGqR1uCN,G.UAAE)h.[8oJV\r7bGVm\tuEbAAw\tA!+Z:pkJW\rC8U\r5V%&Cq!a(tQ,G/T8eK2Dq!a\t\t\t%A\rsK$G):fGR|'/_'pIdgI]8n+JcEcBD\b\ni1HMZ+S\"AJA\tY%Aog*g/Y'baB)A*!9%qJ'5K{\ra\b+jAAA,UX-3N_,Gn5fKR4%o\\7V%2#r!OA-7\niCFM\t%1aBq!aT1*dY2K7\bGjAAA3eaw.3EKR,7\r^3e\r&dWm5fKRV\r]8QNA8c\n\bE\rSJ1!a%.Z3u%xCF\t%\raBaASA1YbBA;C\rN\texn9fG\"IP1P [\\WMU3q_^KG#jeGo:zI,g-Y;miTCAA?U\rYqPB!a!6QI)Av]DWmY6fI*1Rtgn;bi&|g.%!E;oG\",7m[3e-.8dK\"I1SQS [\\WMU3q_^KG#jeGo:zI,g-Y;mi\"TCAALU\rYq")
public final class FancyRepoLoader
{
    public static Ident makeRepoWithDirectory$default$4() {
        return FancyRepoLoader$.MODULE$.makeRepoWithDirectory$default$4();
    }
    
    public static List<ClassLoader> makeRepoWithDirectory$default$3() {
        return FancyRepoLoader$.MODULE$.makeRepoWithDirectory$default$3();
    }
    
    public static SheetRepo loadDetectedFileSheetRepo(final String rdfURL, final Map<String, String> nsJavaMap, final List<ClassLoader> fileModelCLs, final RepoSpec repoSpec) {
        return FancyRepoLoader$.MODULE$.loadDetectedFileSheetRepo(rdfURL, nsJavaMap, fileModelCLs, repoSpec);
    }
    
    public static Model readModelSheetFromURL(final String rdfURL, final Map<String, String> nsJavaMap, final List<ClassLoader> clList) {
        return FancyRepoLoader$.MODULE$.readModelSheetFromURL(rdfURL, nsJavaMap, clList);
    }
    
    public static Model readDirectoryModelFromURL(final String rdfURL, final Map<String, String> nsJavaMap, final List<ClassLoader> fileModelCLs) {
        return FancyRepoLoader$.MODULE$.readDirectoryModelFromURL(rdfURL, nsJavaMap, fileModelCLs);
    }
    
    public static void replaceOrUnion(final Dataset mainDset, final Resource unionOrReplaceRes, final String graphURI, final Model sheetModel) {
        FancyRepoLoader$.MODULE$.replaceOrUnion(mainDset, unionOrReplaceRes, graphURI, sheetModel);
    }
    
    public static void testRepoDirect(final Repo.WithDirectory repo, final String querySheetQName, final String queryQName, final String tgtGraphSparqlVN, final String tgtGraphQName) {
        FancyRepoLoader$.MODULE$.testRepoDirect(repo, querySheetQName, queryQName, tgtGraphSparqlVN, tgtGraphQName);
    }
    
    public static DatabaseRepo loadDatabaseRepo(final String configPath, final ClassLoader optConfigResolveCL, final Ident dirGraphID) {
        return FancyRepoLoader$.MODULE$.loadDatabaseRepo(configPath, optConfigResolveCL, dirGraphID);
    }
    
    public static OmniLoaderRepo makeRepoWithDirectory(final RepoSpec spec, final Model dirModel, final List<ClassLoader> fileModelCLs, final Ident dirGraphID) {
        return FancyRepoLoader$.MODULE$.makeRepoWithDirectory(spec, dirModel, fileModelCLs, dirGraphID);
    }
    
    public static String addInvisbleInfo(final String in, final String k, final String v) {
        return FancyRepoLoader$.MODULE$.addInvisbleInfo(in, k, v);
    }
    
    public static void logDebug(final String s) {
        FancyRepoLoader$.MODULE$.logDebug(s);
    }
    
    public static void logWarning(final String s) {
        FancyRepoLoader$.MODULE$.logWarning(s);
    }
    
    public static void logError(final String s) {
        FancyRepoLoader$.MODULE$.logError(s);
    }
    
    public static void logWarning(final String s, final Throwable t) {
        FancyRepoLoader$.MODULE$.logWarning(s, t);
    }
    
    public static void logError(final String s, final Throwable t) {
        FancyRepoLoader$.MODULE$.logError(s, t);
    }
    
    public static void logInfo(final String s) {
        FancyRepoLoader$.MODULE$.logInfo(s);
    }
    
    public static void logInfo(final int n, final String s) {
        FancyRepoLoader$.MODULE$.logInfo(n, s);
    }
    
    public static Long logInfoEvent(final int n, final boolean b, final Long n2, final String s, final Object[] array) {
        return FancyRepoLoader$.MODULE$.logInfoEvent(n, b, n2, s, array);
    }
    
    public static boolean checkDebugImportance(final int n) {
        return FancyRepoLoader$.MODULE$.checkDebugImportance(n);
    }
    
    public static void setDebugImportanceThreshold(final int debugImportanceThreshold) {
        FancyRepoLoader$.MODULE$.setDebugImportanceThreshold(debugImportanceThreshold);
    }
    
    public static void setLogger(final Logger logger) {
        FancyRepoLoader$.MODULE$.setLogger(logger);
    }
    
    public static void useLoggerForClass(final Class clazz) {
        FancyRepoLoader$.MODULE$.useLoggerForClass(clazz);
    }
}

/*

	Total time: 31 ms
	
*/
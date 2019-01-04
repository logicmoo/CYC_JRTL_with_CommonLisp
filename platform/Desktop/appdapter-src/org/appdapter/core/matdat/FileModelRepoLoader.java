package org.appdapter.core.matdat;

import java.util.List;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.query.Dataset;
import org.appdapter.core.store.dataset.SpecialRepoLoader;
import org.slf4j.Logger;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "bB-1CR5mK6{G-7SKB|Gj\\1eKJT!a\r5\fGZ1u\t)a!d_J,'BA\t%\t3baR,'OC\n\ry'oZ'\tA5\t!!\t)J\\:uC2dM7f%xNU3bI\b\"B\t\tAj]&$h\bF!\tiCc#nC.,'+9p'B,7\r5ZCA\tI\"AA\nV%2#N]'pId'+9p'B,7\rC)A$qCRDCA$\tq%D !B:dC2\fB &/3fM&A%\n'RN\\4\tz\"BAB1sON2AH\tQsDABeJ\fC-)Q&AdN2AL6y#B2)H/7I\nAA[1wC&Ag\f&H7s5\tqG9c!A.8h\tQtGADY8T8bI\b\"\tjAB4fiCHF?!\t1t(%o!)\tC!{r-;D_:$-8feRK\b/!\t%P\rO$8[3fiRK\b/!\tERY>\fG-T8eK2J;p)x-;ECR\f7/;SE8yABA% )f.;\t-#'\tI,o\tJkABqZ1uCN,GOR\t)1^8sK&1K'B,7-[1m%xT8bI\b\"B+E1C7bS:$5/;]W\"-eS!B9vKJL(BA.]QWM\\1usa5qY*q\fYQBT!YG>lBA2Y!\r^1tKRDQ!#A\fZ5s>$W\r\tO2lS*\fQ!\\8eK2T!a.I$g-nQ\n)Qj3fY\")qa[aa-7f>$W\r\\\"Mg)OEeb)7f>$W\r*fa>du.3feBQb\tA\t^\ngV\"A^=]T!1|w-{o\ni!)Y:jG+'-^4hKJDQ!E:q$A}N$\ta`!Y>\fGm5fKRluZ3mg&sGo+be,GR1uCN,GFH\t!!\n!)1* a\")Q+ a-\"1qA?A\f#\\=ESJ,7\r^8ss6{G-7\t\r-Q1.GT5ti\"9qB:Ea9s_R,7\r^3eI,GT8hOHBA\nC!\"!!\t]QD3Q1!a\tHNk\ty\"!\r1{wmZ3s)\t#!QEq\ndBAq")
public class FileModelRepoLoader extends InstallableRepoReader
{
    public static Logger protected$getLogger(final FileModelRepoLoader$ x$1) {
        return FileModelRepoLoader$.MODULE$.protected$getLogger(x$1);
    }
    
    public static void loadSheetModelsIntoTargetDataset(final SpecialRepoLoader repo, final Dataset mainDset, final Model myDirectoryModel, final List<ClassLoader> clList) {
        FileModelRepoLoader$.MODULE$.loadSheetModelsIntoTargetDataset(repo, mainDset, myDirectoryModel, clList);
    }
    
    public static void logDebug(final String s) {
        FileModelRepoLoader$.MODULE$.logDebug(s);
    }
    
    public static void logWarning(final String s) {
        FileModelRepoLoader$.MODULE$.logWarning(s);
    }
    
    public static void logError(final String s) {
        FileModelRepoLoader$.MODULE$.logError(s);
    }
    
    public static void logWarning(final String s, final Throwable t) {
        FileModelRepoLoader$.MODULE$.logWarning(s, t);
    }
    
    public static void logError(final String s, final Throwable t) {
        FileModelRepoLoader$.MODULE$.logError(s, t);
    }
    
    public static void logInfo(final String s) {
        FileModelRepoLoader$.MODULE$.logInfo(s);
    }
    
    public static void logInfo(final int n, final String s) {
        FileModelRepoLoader$.MODULE$.logInfo(n, s);
    }
    
    public static Long logInfoEvent(final int n, final boolean b, final Long n2, final String s, final Object[] array) {
        return FileModelRepoLoader$.MODULE$.logInfoEvent(n, b, n2, s, array);
    }
    
    public static boolean checkDebugImportance(final int n) {
        return FileModelRepoLoader$.MODULE$.checkDebugImportance(n);
    }
    
    public static void setDebugImportanceThreshold(final int debugImportanceThreshold) {
        FileModelRepoLoader$.MODULE$.setDebugImportanceThreshold(debugImportanceThreshold);
    }
    
    public static void setLogger(final Logger logger) {
        FileModelRepoLoader$.MODULE$.setLogger(logger);
    }
    
    public static void useLoggerForClass(final Class clazz) {
        FileModelRepoLoader$.MODULE$.useLoggerForClass(clazz);
    }
    
    public URLDirModelRepoSpec makeRepoSpec(final String path, final String[] args, final List<ClassLoader> cLs) {
        return new URLDirModelRepoSpec(path, (List)cLs);
    }
    
    public String getExt() {
        return "ttl";
    }
    
    public String getContainerType() {
        return "ccrt:FileRepo";
    }
    
    public String getSheetType() {
        return "ccrt:FileModel";
    }
    
    public void loadModelsIntoTargetDataset(final SpecialRepoLoader repo, final Dataset mainDset, final Model dirModel, final List<ClassLoader> fileModelCLs) {
        FileModelRepoLoader$.MODULE$.loadSheetModelsIntoTargetDataset(repo, mainDset, dirModel, fileModelCLs);
    }
}

/*

	Total time: 32 ms
	
*/
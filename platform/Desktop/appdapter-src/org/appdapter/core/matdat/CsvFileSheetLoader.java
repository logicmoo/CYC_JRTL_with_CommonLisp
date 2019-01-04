package org.appdapter.core.matdat;

import com.hp.hpl.jena.query.Dataset;
import org.appdapter.core.store.dataset.SpecialRepoLoader;
import java.io.Reader;
import java.util.Map;
import com.hp.hpl.jena.rdf.model.Model;
import java.util.List;
import org.slf4j.Logger;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "EfB-!cQ:w\r&dWm5fKRdu.3fe*1B[$H-;1B2peT!a\bZ1qi(\"A=xmaCABA\bUIen;bY2\f'\r\\3SKB|'+Z1eKJDQ!I\taP5oSRtD#A\n5\"B\t2D7bWV\r]8TaGB\fM-\"!\r\ne!aD\"T-KG.*fa>/Z2\tm!\tA\fG\t;\rr!AH}QIg\fG.YE}\ta:fI4B&FO]5oO*!e\bOQ\rKCJ<7ESqI!AK(/Y=\t1\"A\rd5E/gUja\faE\nA!;jY*\t!'kCZ\fB0an;YJT\"Aa\n7b]L!AO\rcm]:M_$WMy!\t%PO$X\t;y\"AN \n:\"B!\tjE4fi{g^1j]H+9f\">19W\r^*iK$H+9f)\"Gmaw.3N_,Gn]%oi>$M]4fiG/Y:fiR)qI+e]BaS~A!8ji\")1\na!!/9p!\ti%+DO\ty+AeCR\f7/;E#!B:u_J,BA*OE/Z2jC2V\r]8M_$WM+\rAV\t[LgR:fiBqKY1*LWcV,'/7rAA[3oC*QLXQBd'BA0a\tAOCb\rw.\\GbqR1uCN,GCf\ta-eSJluZ3m!\t9G.Di\tI'.An_,GNl5!4\n5D'!B'pId\"B8Ei4jYluZ3m2x!B9AE\"tmKG.Z*iK$Hj\\1eKJ\"!D:;M,\bC<z9(B=\rawnZu^QBQ1tS$UMY;hO\b\"B\tt\taH#:\tyHA@A1|\rZ*iK$Xj3fYNLe^8UCJ<W\r#biX\r\n1AAAQaS?A1CQ!V?AYCa!a~1E7z\t&Xm;pefluZ3m\tY! a[11\r'jgRDq!at\t\t\t\"\bhKR5O*fC,'/;\rMqDA!\t)\"a]!bAA\rcn\\;\t9BSK$WM\bC\ti1!!N]*iK$\bBB8QC(M$\t!!I,\rZ'pId7[3fiR9a-a.]bBAK\r\b\t_\t)12Ian&bml\r\t]MBHky#aA'ba\"1q.!\nA5Bq!at\t\ti$AsK$G):fGR|'/_'pIdgI]8nN4h)7f)1qHA!Bq!!\t:Aps\r!\f\n\nI%AAq\tqB\\:TQ,GT8dCRLwN\n(!C\n1B\\:TQ,GU1uQV\ta\bCPM 98[3fiBG\tM3O1A-3jeNCW-;QCRDbBA,gIAPI&8[3fiBG\tm3O1A-E9vKJLWm]*iK$\b+;i\tyfQ\ny\n#];fe&,7o5fKR\r5!\tgCK\n\\8bIR+7^\"tmKG.Z*iK$(+9p)\t\t9ESJ1!a%.Z3u%xCpM$\t!!\t5\fNMBBnCxM$\t!!Q,7^*f[NCW-;Y\b(k\r\n!CqE]3bIK'/Z2u_JLXj3fYx.\\\"tmKG.eK\fW;%gU195FAAD!\tI)a%-%BAG\"8dQ7.3Eu$b]:|G/;j_:LA!!&\f\n\tRO\\2iK\\W\r,be&\fgnY3\te5\"O]8uK$X\rhKRdunZ4feR!QTAV)\t\ty\n\"VBAAR\r\t)Cg24GG[SKM_<WM[9*!AA=a=%c9Q")
public class CsvFileSheetLoader extends InstallableRepoReader
{
    public static Logger protected$getLogger(final CsvFileSheetLoader$ x$1) {
        return CsvFileSheetLoader$.MODULE$.protected$getLogger(x$1);
    }
    
    public static String readDirectoryModelFromCsvFile$default$3() {
        return CsvFileSheetLoader$.MODULE$.readDirectoryModelFromCsvFile$default$3();
    }
    
    public static void testSemSheet(final String[] args) {
        CsvFileSheetLoader$.MODULE$.testSemSheet(args);
    }
    
    public static void main(final String[] args) {
        CsvFileSheetLoader$.MODULE$.main(args);
    }
    
    public static String queriesSheetPath() {
        return CsvFileSheetLoader$.MODULE$.queriesSheetPath();
    }
    
    public static String dirSheetPath() {
        return CsvFileSheetLoader$.MODULE$.dirSheetPath();
    }
    
    public static String nsSheetPath() {
        return CsvFileSheetLoader$.MODULE$.nsSheetPath();
    }
    
    public static Model readDirectoryModelFromCsvFile(final String dirSheet, final List<ClassLoader> fileModelCLs, final String nsSheetLocation) {
        return CsvFileSheetLoader$.MODULE$.readDirectoryModelFromCsvFile(dirSheet, fileModelCLs, nsSheetLocation);
    }
    
    public static Model readModelSheet(final String dirSheet, final Map<String, String> nsJavaMap, final List<ClassLoader> fileModelCLs) {
        return CsvFileSheetLoader$.MODULE$.readModelSheet(dirSheet, nsJavaMap, fileModelCLs);
    }
    
    public static Reader getCsvReaderAt(final String dirSheet, final List<ClassLoader> fileModelCLs) {
        return CsvFileSheetLoader$.MODULE$.getCsvReaderAt(dirSheet, fileModelCLs);
    }
    
    public static void loadSheetModelsIntoTargetDataset(final SpecialRepoLoader repo, final Dataset mainDset, final Model myDirectoryModel, final List<ClassLoader> clList) {
        CsvFileSheetLoader$.MODULE$.loadSheetModelsIntoTargetDataset(repo, mainDset, myDirectoryModel, clList);
    }
    
    public static void logDebug(final String s) {
        CsvFileSheetLoader$.MODULE$.logDebug(s);
    }
    
    public static void logWarning(final String s) {
        CsvFileSheetLoader$.MODULE$.logWarning(s);
    }
    
    public static void logError(final String s) {
        CsvFileSheetLoader$.MODULE$.logError(s);
    }
    
    public static void logWarning(final String s, final Throwable t) {
        CsvFileSheetLoader$.MODULE$.logWarning(s, t);
    }
    
    public static void logError(final String s, final Throwable t) {
        CsvFileSheetLoader$.MODULE$.logError(s, t);
    }
    
    public static void logInfo(final String s) {
        CsvFileSheetLoader$.MODULE$.logInfo(s);
    }
    
    public static void logInfo(final int n, final String s) {
        CsvFileSheetLoader$.MODULE$.logInfo(n, s);
    }
    
    public static Long logInfoEvent(final int n, final boolean b, final Long n2, final String s, final Object[] array) {
        return CsvFileSheetLoader$.MODULE$.logInfoEvent(n, b, n2, s, array);
    }
    
    public static boolean checkDebugImportance(final int n) {
        return CsvFileSheetLoader$.MODULE$.checkDebugImportance(n);
    }
    
    public static void setDebugImportanceThreshold(final int debugImportanceThreshold) {
        CsvFileSheetLoader$.MODULE$.setDebugImportanceThreshold(debugImportanceThreshold);
    }
    
    public static void setLogger(final Logger logger) {
        CsvFileSheetLoader$.MODULE$.setLogger(logger);
    }
    
    public static void useLoggerForClass(final Class clazz) {
        CsvFileSheetLoader$.MODULE$.useLoggerForClass(clazz);
    }
    
    public CSVFileRepoSpec makeRepoSpec(final String path, final String[] args, final List<ClassLoader> cLs) {
        return new CSVFileRepoSpec(args[0], args[1], (List)cLs);
    }
    
    public String getExt() {
        return "csv";
    }
    
    public String getContainerType() {
        return "ccrt:CsvFileRepo";
    }
    
    public String getSheetType() {
        return "ccrt:CsvFileSheet";
    }
    
    public void loadModelsIntoTargetDataset(final SpecialRepoLoader repo, final Dataset mainDset, final Model dirModel, final List<ClassLoader> fileModelCLs) {
        CsvFileSheetLoader$.MODULE$.loadSheetModelsIntoTargetDataset(repo, mainDset, dirModel, fileModelCLs);
    }
}

/*

	Total time: 34 ms
	
*/
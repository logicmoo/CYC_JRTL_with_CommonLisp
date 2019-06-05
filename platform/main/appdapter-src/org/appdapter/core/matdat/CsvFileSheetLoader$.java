package org.appdapter.core.matdat;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFactory;
import com.hp.hpl.jena.query.ResultSetRewindable;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.appdapter.core.log.BasicDebugger;
import org.appdapter.core.matdat.CsvFileSheetLoader;
import org.appdapter.core.matdat.SemSheet.ModelInsertSheetProc;
import org.appdapter.core.store.ExtendedFileStreamUtils;
import org.appdapter.core.store.InitialBinding;
import org.appdapter.core.store.dataset.RepoDatasetFactory;
import org.appdapter.core.store.dataset.SpecialRepoLoader;
import org.appdapter.impl.store.QueryHelper;
import org.slf4j.Logger;
import scala.collection.mutable.StringBuilder;

public final class CsvFileSheetLoader$ extends BasicDebugger {
   public static CsvFileSheetLoader$ MODULE$;
   private final String nsSheetPath;
   private final String dirSheetPath;
   private final String queriesSheetPath;

   static {
      new CsvFileSheetLoader$();
   }

   public Logger protected$getLogger(CsvFileSheetLoader$ x$1) {
      return x$1.getLogger();
   }

   public void loadSheetModelsIntoTargetDataset(SpecialRepoLoader repo, Dataset mainDset, Model myDirectoryModel, List<ClassLoader> clList) {
      Map nsJavaMap = myDirectoryModel.getNsPrefixMap();
      String msqText = "\r\n\t\t\tselect ?repo ?repoPath ?model ?modelPath ?unionOrReplace\r\n\t\t\t\t{\r\n\t\t\t\t\t?repo  a ccrt:CsvFileRepo; ccrt:sourcePath ?repoPath.\r\n\t\t\t\t\t?model a ccrt:CsvFileSheet; ccrt:sourcePath ?modelPath; ccrt:repo ?repo.\r\n      \t\t\t\tOPTIONAL { ?model a ?unionOrReplace. FILTER (?unionOrReplace = ccrt:UnionModel) }\r\n\t\t\t\t}\r\n\t\t";
      ResultSet msRset = QueryHelper.execModelQueryWithPrefixHelp(myDirectoryModel, msqText);

      while(msRset.hasNext()) {
         QuerySolution qSoln = msRset.next();
         Resource repoRes = qSoln.getResource("repo");
         Resource modelRes = qSoln.getResource("model");
         Resource unionOrReplaceRes = qSoln.getResource("unionOrReplace");
         Literal repoPath_Lit = qSoln.getLiteral("repoPath");
         Literal modelPath_Lit = qSoln.getLiteral("modelPath");
         Object[] dbgArray = (Object[])(new Object[]{repoRes, repoPath_Lit, modelRes, modelPath_Lit});
         this.getLogger().info("repo={}, repoPath={}, model={}, modelPath={}", new Object[]{dbgArray});
         String rPath = repoPath_Lit.getString();
         String mPath = modelPath_Lit.getString();
         this.getLogger().info("Ready to read from [{}] / [{}]", new Object[]{new Object[]{rPath, mPath}});
         String rdfURL = (new StringBuilder()).append(rPath).append(mPath).toString();
         repo.addLoadTask(rdfURL, new 1(mainDset, clList, nsJavaMap, modelRes, unionOrReplaceRes, rdfURL));
      }

   }

   public Reader getCsvReaderAt(String dirSheet, List<ClassLoader> fileModelCLs) {
      ExtendedFileStreamUtils efsu = new ExtendedFileStreamUtils();
      InputStream is = efsu.openInputStreamOrNull(dirSheet, fileModelCLs);
      if (is == null) {
         this.getLogger().error((new StringBuilder()).append("Cant get getCsvReaderAt =").append(dirSheet).toString());
         Object var10000 = null;
         return null;
      } else {
         return new InputStreamReader(is);
      }
   }

   public Model readModelSheet(String dirSheet, Map<String, String> nsJavaMap, List<ClassLoader> fileModelCLs) {
      Model tgtModel = RepoDatasetFactory.createPrivateMemModel();
      tgtModel.setNsPrefixes(nsJavaMap);
      ModelInsertSheetProc modelInsertProc = new ModelInsertSheetProc(tgtModel);
      Reader reader = this.getCsvReaderAt(dirSheet, fileModelCLs);
      final org.appdapter.core.matdat.CsvFileSheetLoader$.anonfun.readModelSheet processor = new org.appdapter.core.matdat.CsvFileSheetLoader$.anonfun.readModelSheet.1(modelInsertProc);
	org.appdapter.core.matdat.MatrixData.processSheetR(reader, new org.appdapter.core.matdat.CsvFileSheetLoader$.anonfun.readModelSheet.1(modelInsertProc));
      this.getLogger().debug((new StringBuilder()).append("tgtModel=").append(tgtModel).toString());
      return tgtModel;
   }

   public Model readDirectoryModelFromCsvFile(String dirSheet, List<ClassLoader> fileModelCLs, String nsSheetLocation) {
      this.getLogger().debug("readDirectoryModelFromCsvFile - start");
      Map nsJavaMap = new HashMap();
      if (nsSheetLocation != null) {
         Reader nsSheetReader = this.getCsvReaderAt(nsSheetLocation, fileModelCLs);
         nsJavaMap.putAll(org.appdapter.core.matdat.MatrixData.readJavaMapFromSheetR(nsSheetReader, org.appdapter.core.matdat.MatrixData.readJavaMapFromSheetR$default$2(), org.appdapter.core.matdat.MatrixData.readJavaMapFromSheetR$default$3(), org.appdapter.core.matdat.MatrixData.readJavaMapFromSheetR$default$4()));
         this.getLogger().debug((new StringBuilder()).append("Got NS map: ").append(nsJavaMap).toString());
      }

      Model dirModel = this.readModelSheet(dirSheet, nsJavaMap, fileModelCLs);
      return dirModel;
   }

   public String readDirectoryModelFromCsvFile$default$3() {
      Object var10000 = null;
      return null;
   }

   public String nsSheetPath() {
      return this.nsSheetPath;
   }

   public String dirSheetPath() {
      return this.dirSheetPath;
   }

   public String queriesSheetPath() {
      return this.queriesSheetPath;
   }

   private SheetRepo loadTestCsvFileSheetRepo() {
      ArrayList clList = null;
      CSVFileRepoSpec spec = new CSVFileRepoSpec(this.dirSheetPath(), this.nsSheetPath(), (List)clList);
      SheetRepo sr = spec.makeRepo();
      sr.getMainQueryDataset();
      return sr;
   }

   public void main(String[] args) {
      String querySheetQName = "ccrt:qry_sheet_22";
      String queryQName = "ccrt:find_lights_99";
      String lightsGraphVarName = "qGraph";
      String lightsGraphQName = "ccrt:lights_camera_sheet_22";
      SheetRepo sr = this.loadTestCsvFileSheetRepo();
      InitialBinding qib = sr.makeInitialBinding();
      qib.bindQName(lightsGraphVarName, lightsGraphQName);
      List solnJavaList = sr.queryIndirectForAllSolutions(querySheetQName, queryQName, qib.getQSMap());
      scala.Predef.println((new StringBuilder()).append("Found solutions: ").append(solnJavaList).toString());
   }

   public void testSemSheet(String[] args) {
      scala.Predef.println("SemSheet test ");
      String nsSheetURL = this.nsSheetPath();
      scala.Predef.println((new StringBuilder()).append("Made Namespace Sheet URL: ").append(nsSheetURL).toString());
      Map nsJavaMap = org.appdapter.core.matdat.MatrixData.readJavaMapFromSheet(nsSheetURL, org.appdapter.core.matdat.MatrixData.readJavaMapFromSheet$default$2(), org.appdapter.core.matdat.MatrixData.readJavaMapFromSheet$default$3(), org.appdapter.core.matdat.MatrixData.readJavaMapFromSheet$default$4());
      scala.Predef.println((new StringBuilder()).append("Got NS map: ").append(nsJavaMap).toString());
      ArrayList fileModelCLs = new ArrayList();
      Model dirModel = this.readModelSheet(this.dirSheetPath(), nsJavaMap, fileModelCLs);
      String queriesSheetPath = "Qry";
      Model queriesModel = this.readModelSheet(queriesSheetPath, nsJavaMap, fileModelCLs);
      String tqText = "select ?sheet { ?sheet a ccrt:CsvFileSheet }";
      ResultSet trset = QueryHelper.execModelQueryWithPrefixHelp(dirModel, tqText);
      String trxml = QueryHelper.buildQueryResultXML(trset);
      scala.Predef.println((new StringBuilder()).append("Got repo-query-test result-XML: \n").append(trxml).toString());
      String qqText = "select ?qres ?qtxt { ?qres a ccrt:SparqlQuery; ccrt:queryText ?qtxt}";
      ResultSet qqrset = QueryHelper.execModelQueryWithPrefixHelp(queriesModel, qqText);
      ResultSetRewindable qqrsrw = ResultSetFactory.makeRewindable(qqrset);
      String qqrxml = QueryHelper.buildQueryResultXML(qqrsrw);
      scala.Predef.println((new StringBuilder()).append("Got query-query-test result-XML: \n").append(qqrxml).toString());
      qqrsrw.reset();
      List allVarNames = qqrsrw.getResultVars();
      scala.Predef.println((new StringBuilder()).append("Got all-vars java-list: ").append(allVarNames).toString());

      while(qqrsrw.hasNext()) {
         QuerySolution qSoln = qqrsrw.next();
         scala.Predef.refArrayOps(allVarNames.toArray((Object[])(new String[0]))).withFilter(new org.appdapter.core.matdat.CsvFileSheetLoader.anonfun.testSemSheet.1()).foreach(new 2(qSoln));
         Literal qtxtLit = qSoln.getLiteral("qtxt");
         String qtxtString = qtxtLit.getString();
         ResultSet zzRset =QueryHelper.execModelQueryWithPrefixHelp(dirModel, qtxtString);
         String zzRSxml =QueryHelper.buildQueryResultXML(zzRset);
         scala.Predef.println((new StringBuilder()).append("Query using qTxt got: ").append(zzRSxml).toString());
      }

   }

   private CsvFileSheetLoader$() {
      MODULE$ = this;
      this.nsSheetPath = "Nspc.Csv";
      this.dirSheetPath = "Dir.Csv";
      this.queriesSheetPath = "Qry.Csv";
   }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\org.appdapter.bundle.core-1.1.6-SNAPSHOT.jar
	Total time: 80 ms
	
	Decompiled with FernFlower.
*/


package org.appdapter.core.matdat;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import java.util.List;
import java.util.Map;
import org.appdapter.core.log.BasicDebugger;
import org.appdapter.core.matdat.FancyRepoLoader;
import org.appdapter.core.matdat.GoogSheetRepoLoader;//..anon.1;
import org.appdapter.core.matdat.SemSheet.ModelInsertSheetProc;
import org.appdapter.core.store.dataset.RepoDatasetFactory;
import org.appdapter.core.store.dataset.SpecialRepoLoader;
import org.slf4j.Logger;
import scala.collection.mutable.StringBuilder;

public final class GoogSheetRepoLoader$ extends BasicDebugger {
   public static GoogSheetRepoLoader$ MODULE$;

   static {
      new GoogSheetRepoLoader$();
   }

   public Logger protected$getLogger(GoogSheetRepoLoader$ x$1) {
      return x$1.getLogger();
   }

   public SheetRepo makeGoogSheetRepo(String sheetLocation, int namespaceSheetName, int dirSheetName, List<ClassLoader> fileModelCLs, RepoSpec repoSpec) {
      Model dirModel = this.readModelFromGoog(sheetLocation, namespaceSheetName, dirSheetName);
      return FancyRepoLoader.makeRepoWithDirectory(repoSpec, dirModel, FancyRepoLoader.makeRepoWithDirectory$default$3(),FancyRepoLoader.makeRepoWithDirectory$default$4());
   }

   public Model readDirectoryModelFromGoog(String sheetLocation, int namespaceSheet, int dirSheet) {
      return this.readModelFromGoog(sheetLocation, namespaceSheet, dirSheet);
   }

   public void loadSheetModelsIntoTargetDataset(SpecialRepoLoader repo, Dataset mainDset, Model dirModel, List<ClassLoader> fileModelCLs) {
      Map nsJavaMap = dirModel.getNsPrefixMap();
      String msqText = "\n\t\t\tselect ?container ?key ?sheet ?num ?unionOrReplace\n\t\t\t\t{\n\t\t\t\t\t?container  a ccrt:GoogSheetRepo; ccrt:key ?key.\n\t\t\t\t\t?sheet a ccrt:GoogSheet; ccrt:sheetNumber ?num; ccrt:repo ?container.\n         \t\t\tOPTIONAL { ?sheet a ?unionOrReplace. FILTER (?unionOrReplace = ccrt:UnionModel) }\n\t\t\t\t}\n\t\t";
      ResultSet msRset = org.appdapter.impl.store.QueryHelper.execModelQueryWithPrefixHelp(dirModel, msqText);

      while(msRset.hasNext()) {
         QuerySolution qSoln = msRset.next();
         Resource containerRes = qSoln.getResource("container");
         Resource sheetRes = qSoln.getResource("sheet");
         Literal sheetNum_Lit = qSoln.getLiteral("num");
         Literal sheetKey_Lit = qSoln.getLiteral("key");
         Resource unionOrReplaceRes = qSoln.getResource("unionOrReplace");
         this.getLogger().warn((new StringBuilder()).append("Loading containerRes=").append(containerRes).append(", sheetRes=").append(sheetRes).append(", num=").append(sheetNum_Lit).append(", key=").append(sheetKey_Lit).toString());
         int sheetNum = sheetNum_Lit.getInt();
         String sheetKey = sheetKey_Lit.getString();
         String graphURI = sheetRes.getURI();
         repo.addLoadTask(graphURI, new 1(mainDset, nsJavaMap, unionOrReplaceRes, sheetNum, sheetKey, graphURI));
      }

   }

   public Model readModelSheet(String sheetKey, int sheetNum, Map<String, String> nsJavaMap) {
      Model tgtModel = RepoDatasetFactory.createPrivateMemModel();
      tgtModel.setNsPrefixes(nsJavaMap);
      ModelInsertSheetProc modelInsertProc = new ModelInsertSheetProc(tgtModel);
      String sheetURL = org.appdapter.core.matdat.WebSheet.makeGdocSheetQueryURL(sheetKey, sheetNum, null);
      org.appdapter.core.matdat.MatrixData.processSheet(sheetURL, new org.appdapter.core.matdat.GoogSheetRepoLoader..anonfun.readModelSheet.1(modelInsertProc));
      this.getLogger().debug((new StringBuilder()).append("tgtModel=").append(tgtModel).toString());
      return tgtModel;
   }

   public Map<String, String> readModelSheet$default$3() {
      Object var10000 = null;
      return null;
   }

   public Model readModelFromGoog(String sheetKey, int namespaceSheetNum, int dirSheetNum) {
      this.getLogger().debug("readDirectoryModelFromGoog - start");
      String namespaceSheetURL = org.appdapter.core.matdat.WebSheet.makeGdocSheetQueryURL(sheetKey, namespaceSheetNum, null);
      this.getLogger().debug((new StringBuilder()).append("Made Namespace Sheet URL: ").append(namespaceSheetURL).toString());
      Map nsJavaMap = org.appdapter.core.matdat.MatrixData.readJavaMapFromSheet(namespaceSheetURL, org.appdapter.core.matdat.MatrixData.readJavaMapFromSheet$default$2(), org.appdapter.core.matdat.MatrixData.readJavaMapFromSheet$default$3(), org.appdapter.core.matdat.MatrixData.readJavaMapFromSheet$default$4());
      this.getLogger().debug((new StringBuilder()).append("Got NS map: ").append(nsJavaMap).toString());
      Model dirModel = this.readModelSheet(sheetKey, dirSheetNum, nsJavaMap);
      return dirModel;
   }

   private GoogSheetRepoLoader$() {
      MODULE$ = this;
   }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\org.appdapter.bundle.core-1.1.6-SNAPSHOT.jar
	Total time: 59 ms
	
	Decompiled with FernFlower.
*/


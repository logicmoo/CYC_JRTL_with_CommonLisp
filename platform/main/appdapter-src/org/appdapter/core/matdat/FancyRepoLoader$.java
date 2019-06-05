package org.appdapter.core.matdat;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.util.FileManager;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.appdapter.bind.rdf.jena.model.JenaFileManagerUtils;
import org.appdapter.core.log.BasicDebugger;
import org.appdapter.core.name.Ident;
import org.appdapter.core.store.ExtendedFileStreamUtils;
import org.appdapter.core.store.InitialBinding;
import org.appdapter.core.store.RepoOper;
import org.appdapter.core.store.Repo.WithDirectory;
import org.appdapter.fileconv.FileStreamUtils;
import org.appdapter.impl.store.DatabaseRepo;
import org.appdapter.impl.store.DatabaseRepoLoader;

import scala.collection.mutable.StringBuilder;

public final class FancyRepoLoader$ extends BasicDebugger {
   public static FancyRepoLoader$ MODULE$;

   static {
      new FancyRepoLoader$();
   }

   public String addInvisbleInfo(String in, String k, String v) {
      return (new StringBuilder()).append(in).append("").toString();
   }

   public OmniLoaderRepo makeRepoWithDirectory(RepoSpec spec, Model dirModel, List<ClassLoader> fileModelCLs, Ident dirGraphID) {
      String specURI = spec.toString();
      int serial = System.identityHashCode(this);
      String myDebugName = this.addInvisbleInfo(specURI, "time", String.valueOf(new Date()));
      if (dirGraphID != null) {
         myDebugName = this.addInvisbleInfo(myDebugName, "id", String.valueOf(dirGraphID));
      }

      OmniLoaderRepo shRepo = new OmniLoaderRepo(spec, specURI, myDebugName, dirModel, fileModelCLs);
      return shRepo;
   }

   public List<ClassLoader> makeRepoWithDirectory$default$3() {
      Object var10000 = null;
      return null;
   }

   public Ident makeRepoWithDirectory$default$4() {
      Object var10000 = null;
      return null;
   }

   public DatabaseRepo loadDatabaseRepo(String configPath, ClassLoader optConfigResolveCL, Ident dirGraphID) {
      DatabaseRepo dbRepo = DatabaseRepoLoader.makeDatabaseRepo(configPath, optConfigResolveCL, dirGraphID);
      return dbRepo;
   }

   public void testRepoDirect(WithDirectory repo, String querySheetQName, String queryQName, String tgtGraphSparqlVN, String tgtGraphQName) {
      InitialBinding qib = repo.makeInitialBinding();
      qib.bindQName(tgtGraphSparqlVN, tgtGraphQName);
      List solnJavaList = repo.queryIndirectForAllSolutions(querySheetQName, queryQName, qib.getQSMap());
      scala.Predef.println((new StringBuilder()).append("Found solutions for ").append(queryQName).append(" in ").append(tgtGraphQName).append(" : ").append(solnJavaList).toString());
   }

   public void replaceOrUnion(Dataset mainDset, Resource unionOrReplaceRes, String graphURI, Model sheetModel) {
      RepoOper.putNamedModel(mainDset, graphURI, sheetModel, unionOrReplaceRes);
   }

   public Model readDirectoryModelFromURL(String rdfURL, Map<String, String> nsJavaMap, List<ClassLoader> fileModelCLs) {
      try {
         this.getLogger().debug("readDirectoryModelFromURL - start {}", new Object[]{rdfURL});
         String ext = FileStreamUtils.getFileExt(rdfURL);
         return ext != null && (ext.equals("xlsx") || ext.equals("xls")) ? org.appdapter.core.matdat.XLSXSheetRepoLoader.readDirectoryModelFromXLSX(rdfURL, "Nspc", "Dir", fileModelCLs) : (ext != null && ext.equals("csv") ? org.appdapter.core.matdat.CsvFileSheetLoader.readModelSheet(rdfURL, nsJavaMap, fileModelCLs) : this.readModelSheetFromURL(rdfURL, nsJavaMap, fileModelCLs));
      } catch (Throwable var7) {
         this.getLogger().error("Caught error loading file {}", new Object[]{new Object[]{rdfURL, var7}});
         throw var7;
      }
   }

   public Model readModelSheetFromURL(String rdfURL, Map<String, String> nsJavaMap, List<ClassLoader> clList) {
      try {
         new ExtendedFileStreamUtils();
         String ext = FileStreamUtils.getFileExt(rdfURL);
         Model var10000;
         if (ext != null && (ext.equals("xlsx") || ext.equals("xls"))) {
            Object var10005 = null;
            var10000 = org.appdapter.core.matdat.XLSXSheetRepoLoader$.MODULE$.loadXLSXSheetRepo(rdfURL, "Nspc", "Dir", clList, (RepoSpec)null).getMainQueryDataset().getDefaultModel();
         } else if (ext != null && ext.equals("csv")) {
            var10000 = org.appdapter.core.matdat.CsvFileSheetLoader.readModelSheet(rdfURL, nsJavaMap, clList);
         } else {
            FileManager jenaFileMgr = JenaFileManagerUtils.getDefaultJenaFM();
            JenaFileManagerUtils.ensureClassLoadersRegisteredWithJenaFM(jenaFileMgr, clList);
            var10000 = jenaFileMgr.loadModel(rdfURL);
         }

         return var10000;
      } catch (Throwable var9) {
         this.getLogger().error("Caught error loading file {}", new Object[]{new Object[]{rdfURL, var9}});
         throw var9;
      }
   }

   public SheetRepo loadDetectedFileSheetRepo(String rdfURL, Map<String, String> nsJavaMap, List<ClassLoader> fileModelCLs, RepoSpec repoSpec) {
      Model dirModel = this.readDirectoryModelFromURL(rdfURL, nsJavaMap, fileModelCLs);
      OmniLoaderRepo shRepo = this.makeRepoWithDirectory(repoSpec, dirModel, fileModelCLs, this.makeRepoWithDirectory$default$4());
      return shRepo;
   }

   private FancyRepoLoader$() {
      MODULE$ = this;
   }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\org.appdapter.bundle.core-1.1.6-SNAPSHOT.jar
	Total time: 108 ms
	").append(k).append("=").append(v).append("
	Decompiled with FernFlower.
*/


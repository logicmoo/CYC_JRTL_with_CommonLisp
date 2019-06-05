package org.appdapter.core.matdat;

import org.appdapter.demo.DemoBrowserCtrl;
import org.appdapter.demo.DemoBrowserUI;
import scala.Predef;

public final class OmniLoaderRepoTest$ {
   public static OmniLoaderRepoTest$ MODULE$;
//   private final String BMC_SHEET_KEY;
//   private final int BMC_NAMESPACE_SHEET_NUM;
//   private final int BMC_DIRECTORY_SHEET_NUM;
//   private final String BMC_WORKBOOK_PATH;
//   private final String BMC_NAMESPACE_SHEET_NAME;
//   private final String BMC_DIRECTORY_SHEET_NAME;
//   private final String CHAN_BIND_GRAPH_QN;
//   private final String GROUP_KEY_CHAN_BIND;
//   private final String CHAN_GROUP_QN;
//   private final String DIRECT_BEHAV_GRAPH_QN;
//   private final String BEHAV_STEP_GRAPH_QN;
//   private final String BEHAV_SCENE_GRAPH_QN;
//   private final String DERIVED_BEHAV_GRAPH_QN;
//   private final String QUERY_SOURCE_GRAPH_QN_FOR_TEST;
//   private final String PIPELINE_GRAPH_QN_FOR_TEST;
//   private final String PIPELINE_QUERY_QN_FOR_TEST;
//   private final String GROUP_KEY_SCENE_SPEC;
//   private final String SCENE_GROUP_QN;
//   private final String GROUP_KEY_THEATER;
//   private final String THEATER_GROUP_QN;

   static {
      new OmniLoaderRepoTest$();
   }

   public final String BMC_SHEET_KEY() {
      return "0AlpQRNQ-L8QUdFh5YWswSzdYZFJMb1N6aEhJVWwtR3c";
   }

   public final int BMC_NAMESPACE_SHEET_NUM() {
      return 4;
   }

   public final int BMC_DIRECTORY_SHEET_NUM() {
      return 3;
   }

   public final String BMC_WORKBOOK_PATH() {
      return "GluePuma_BehavMasterDemo.xlsx";
   }

   public final String BMC_NAMESPACE_SHEET_NAME() {
      return "Nspc";
   }

   public final String BMC_DIRECTORY_SHEET_NAME() {
      return "Dir";
   }

   public final String CHAN_BIND_GRAPH_QN() {
      return "csi:chan_sheet_77";
   }

   public final String GROUP_KEY_CHAN_BIND() {
      return "ChannelBindingGroupId";
   }

   public final String CHAN_GROUP_QN() {
      return "csi:dm_chan_group_22";
   }

   public final String DIRECT_BEHAV_GRAPH_QN() {
      return "csi:behav_file_82";
   }

   public final String BEHAV_STEP_GRAPH_QN() {
      return "csi:behavStep_sheet_77";
   }

   public final String BEHAV_SCENE_GRAPH_QN() {
      return "csi:behavScene_sheet_77";
   }

   public final String DERIVED_BEHAV_GRAPH_QN() {
      return "csi:merged_model_5001";
   }

   public final String QUERY_SOURCE_GRAPH_QN_FOR_TEST() {
      return "ccrt:qry_sheet_77";
   }

   public final String PIPELINE_GRAPH_QN_FOR_TEST() {
      return "csi:pipeline_sheet_77";
   }

   public final String PIPELINE_QUERY_QN_FOR_TEST() {
      return "ccrt:find_pipes_77";
   }

   public final String GROUP_KEY_SCENE_SPEC() {
      return "SceneSpecGroupId";
   }

   public final String SCENE_GROUP_QN() {
      return "csi:scene_group_33";
   }

   public final String GROUP_KEY_THEATER() {
      return "TheaterGroupId";
   }

   public final String THEATER_GROUP_QN() {
      return "csi:theater_group_44";
   }

   public void main(String[] args) {
	   System.out.print("Start Whackamole");
      DemoBrowserCtrl repoNav = DemoBrowserUI.makeDemoNavigatorCtrl(args);
      System.out.print("Create a Goog Sheet Spec");
      GoogSheetRepoSpec repoSpec = new GoogSheetRepoSpec("0AlpQRNQ-L8QUdFh5YWswSzdYZFJMb1N6aEhJVWwtR3c", 4, 3);
      SheetRepo repo = repoSpec.makeRepo();
      repoNav.addObject(repo.toString(), repo, true, false);
   }

   private OmniLoaderRepoTest$() {
      MODULE$ = this;
   }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\org.appdapter.bundle.core-1.1.6-SNAPSHOT.jar
	Total time: 39 ms
	
	Decompiled with FernFlower.
*/
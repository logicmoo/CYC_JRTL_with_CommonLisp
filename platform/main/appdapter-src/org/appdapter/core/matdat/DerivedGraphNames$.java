package org.appdapter.core.matdat;

import org.appdapter.core.matdat.RepoSpecDefaultNames;
import org.appdapter.core.name.FreeIdent;
import scala.collection.mutable.StringBuilder;

public final class DerivedGraphNames$ {
   public static DerivedGraphNames$ MODULE$;
   private final String V_pipeID;
   private final String V_typeID;
   private final FreeIdent T_union;
   private final FreeIdent P_sourceModel;

   static {
      new DerivedGraphNames$();
   }

   public String V_pipeID() {
      return this.V_pipeID;
   }

   public String V_typeID() {
      return this.V_typeID;
   }

   public FreeIdent T_union() {
      return this.T_union;
   }

   public FreeIdent P_sourceModel() {
      return this.P_sourceModel;
   }

   private DerivedGraphNames$() {
      MODULE$ = this;
      this.V_pipeID = "pipeID";
      this.V_typeID = "typeID";
      this.T_union = new FreeIdent((new StringBuilder()).append(RepoSpecDefaultNames.NS_CCRT_RT()).append("UnionModel").toString());
      this.P_sourceModel = new FreeIdent((new StringBuilder()).append(RepoSpecDefaultNames.NS_CCRT_RT()).append("sourceModel").toString());
   }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\org.appdapter.bundle.core-1.1.6-SNAPSHOT.jar
	Total time: 11 ms
	
	Decompiled with FernFlower.
*/
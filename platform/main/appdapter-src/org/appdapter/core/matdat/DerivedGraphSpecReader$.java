package org.appdapter.core.matdat;

import com.hp.hpl.jena.rdf.model.Model;
import java.util.List;
import org.appdapter.core.log.BasicDebugger;
//import org.appdapter.core.matdat.DerivedGraphSpecReader..anonfun.findOneDerivedGraphSpec.1;
//import org.appdapter.core.matdat.DerivedGraphSpecReader..anonfun.queryDerivedGraphSpecs.2;
//import org.appdapter.core.matdat.DerivedGraphSpecReader..anonfun.queryDerivedGraphSpecs.3;
import org.appdapter.core.name.Ident;
import org.appdapter.help.repo.RepoClient;
import org.appdapter.help.repo.SolutionList;
import scala.collection.immutable.Set;
import scala.collection.immutable.Set;
import scala.collection.mutable.HashMap;
import scala.runtime.ObjectRef;

public final class DerivedGraphSpecReader$ extends BasicDebugger {
   public static DerivedGraphSpecReader$ MODULE$;

   static {
      new DerivedGraphSpecReader$();
   }

   public DerivedGraphSpec findOneDerivedGraphSpec(RepoClient rc, PipelineQuerySpec pqs, Ident outGraphID) {
      Set dgSpecSet = this.queryDerivedGraphSpecs(rc, pqs);
      return (DerivedGraphSpec)dgSpecSet.find(new 1(outGraphID)).get();
   }

   public Set<BoundModelProvider> makeAllDerivedModelProviders(RepoClient rc, PipelineQuerySpec pqs) {
      Set dgSpecSet = this.queryDerivedGraphSpecs(rc, pqs);
      return (Set)dgSpecSet.map(new org.appdapter.core.matdat.DerivedGraphSpecReader..anonfun.makeAllDerivedModelProviders.1(rc), .MODULE$.canBuildFrom());
   }

   public Set<DerivedGraphSpec> queryDerivedGraphSpecs(RepoClient rc, PipelineQuerySpec pqs) {
      SolutionList pipeAttrSL = null;

      try {
         pipeAttrSL = rc.queryIndirectForAllSolutions(pqs.pplnAttrQueryQN(), pqs.pplnGraphQN());
      } catch (Throwable var12) {
         this.getLogger().error("Problem executing querySpec {} on repoClient {} ", new Object[]{new Object[]{pqs, rc}});
         this.getLogger().error("Stack trace: ", var12);
         return (Set)scala.Predef.Set().apply(scala.collection.immutable.Nil.seq());
      }

      HashMap outPipeTypeSetsByID = new HashMap();
      List pjl = pipeAttrSL.javaList();
      this.getLogger().info("Got pipeAttribute list : {}", new Object[]{pjl});
      scala.collection.JavaConversions..MODULE$.asScalaBuffer(pjl).foreach(new org.appdapter.core.matdat.DerivedGraphSpecReader$.anonfun.queryDerivedGraphSpecs.1(outPipeTypeSetsByID));
      new HashMap();
      Ident pipeSpecGraphID = rc.getRepo().makeIdentForQName(pqs.pplnGraphQN());
      Model pipeSpecModel = rc.getRepo().getNamedModel(pipeSpecGraphID);
      ObjectRef dgSpecSet = new ObjectRef((Set)scala.Predef..MODULE$.Set().apply(scala.collection.immutable.Nil..MODULE$));
      outPipeTypeSetsByID.withFilter(new 2()).foreach(new 3(pipeSpecModel, dgSpecSet));
      return (Set)dgSpecSet.elem;
   }

   private DerivedGraphSpecReader$() {
      MODULE$ = this;
   }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\org.appdapter.bundle.core-1.1.6-SNAPSHOT.jar
	Total time: 19 ms
	
	Decompiled with FernFlower.
*/
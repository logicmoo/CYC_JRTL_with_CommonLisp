package org.appdapter.core.matdat;

import scala.Option;
import scala.Serializable;
import scala.Some;
import scala.Tuple2;
import scala.None;
import scala.runtime.AbstractFunction2;

public final class DirectRepoGraph$ extends AbstractFunction2<TypedResrc, NamedModelProvider, DirectRepoGraph> implements Serializable {
   public static DirectRepoGraph$ MODULE$;

   static {
      new DirectRepoGraph$();
   }

   @Override
public final String toString() {
      return "DirectRepoGraph";
   }

   @Override
public DirectRepoGraph apply(TypedResrc myUpstreamGraphID, NamedModelProvider myUpstreamNMP) {
      return new DirectRepoGraph(myUpstreamGraphID, myUpstreamNMP);
   }

   public Option<Tuple2<TypedResrc, NamedModelProvider>> unapply(DirectRepoGraph x$0) {
      return (Option)(x$0 == null ? MODULE$ : new Some(new Tuple2(x$0.myUpstreamGraphID(), x$0.myUpstreamNMP())));
   }

   private Object readResolve() {
      return MODULE$;
   }

   private DirectRepoGraph$() {
      MODULE$ = this;
   }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\org.appdapter.bundle.core-1.1.6-SNAPSHOT.jar
	Total time: 34 ms
	
	Decompiled with FernFlower.
*/
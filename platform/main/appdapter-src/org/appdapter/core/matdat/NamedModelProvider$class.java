package org.appdapter.core.matdat;

import org.appdapter.core.matdat.TypedResrcFactory;
import org.appdapter.core.name.Ident;
import org.appdapter.core.store.ModelClient;

import scala.collection.Seq;
import scala.collection.immutable.Set;

public abstract class NamedModelProvider$class {
   public static BoundModelProvider makeDirectBoundModelProvider(NamedModelProvider $this, Ident graphID, ModelClient dirModelClient) {
	   Seq<?> NIL = scala.collection.immutable.Nil.seq();
      TypedResrc typedGraphID = TypedResrcFactory.exposeTypedResrc(graphID, (Set)scala.Predef.Set().apply((Seq<?>) NIL), dirModelClient);
      return new DirectRepoGraph(typedGraphID, $this);
   }

   public static void $init$(NamedModelProvider $this) {
   }
}

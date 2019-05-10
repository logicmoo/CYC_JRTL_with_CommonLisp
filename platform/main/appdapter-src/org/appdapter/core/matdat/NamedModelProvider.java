package org.appdapter.core.matdat;

import org.appdapter.core.store.ModelClient;
import com.hp.hpl.jena.rdf.model.Model;
import org.appdapter.core.name.Ident;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "3q!1B\nOC6,G-T8eK2&o<jI(BAi\r3bi*QABG>XM\bI\r9eCB$XMqN]4M\tAiA)1oY1mC&C:L(+4\tMA\rJg.;%))CA\t9bBV]&$\b\"B\r\rQ!D4fi:W.3N_,GWAA$K;)adH[>$W\rA\n1A3g\t3%kK:\f'B&\rAM\n!9!\n1aY8n\tQSDAN_,GC-1Q&Ahe\bNT1nK&#C2y#Bq-\\3\nIz#!B%eK:$\b\"\r)H7bW$N]3di\n{WO3N_,G:pm&$WMmi\"a\tI!!%\t{WO3N_,G:pm&$WMwM\r!L\bOJ\f[%E!\">)\r1dhwq\r!\fr\r!QI&Xj3fYc.8u!\tU)DD\t!E!Ati>X-G\nYQj3fYc.8u")
public interface NamedModelProvider
{
    Model getNamedModel(final Ident p0);
    
    BoundModelProvider makeDirectBoundModelProvider(final Ident p0);
    
    BoundModelProvider makeDirectBoundModelProvider(final Ident p0, final ModelClient p1);
}

/*

	Total time: 5 ms
	
*/
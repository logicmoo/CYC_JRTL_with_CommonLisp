package org.appdapter.core.matdat;

import java.util.Set;
import com.hp.hpl.jena.rdf.model.Model;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\r3q!1B\nC_VtG-T8eK2&o<jI(BAi\r3bi*QABG>XM\bI\r9eCB$XMqN]4M\tAiA)1oY1mC&C:L(+4\tMA\rJg.;%))CA\t9bBV]&$\b\"B\r\rQD4fiRK\b/3OC6,G#AqiR\"\ny!A+za$'+Z:sG\")DCAq-;N_,GF#!\t'D%\t)c%An_,GN(Q!4%R6f]T!a!HN.]_1m\\7\nE\"#!B'pId\"B\t!AE1tgl'\r\\3N_,GNU8piN$!\tmmjT\"AaJB;uS2TAOU4-=o\t1+;y\nU\"A K7b]L!AQ \r='.Z2u")
public interface BoundModelProvider
{
    TypedResrc getTypedName();
    
    Model getModel();
    
    Set<Object> assembleModelRoots();
}

/*

	Total time: 6 ms
	
*/
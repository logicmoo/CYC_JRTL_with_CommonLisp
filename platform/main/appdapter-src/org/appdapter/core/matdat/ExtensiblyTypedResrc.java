package org.appdapter.core.matdat;

import org.appdapter.core.name.Ident;
import scala.collection.immutable.Set;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "52q!G1BFqR,gn]5cYf$]3e%(o\ta!\\1uI$(BAwN]3A!C1qa\f^3sIaA8sO1c\r)AQBE)qEYtwMCQM^1\nMq!AB(cUG-5\t!!\tQA+9fIJ+7O]2\tea$G\rV=qK6'o[5oON$\"F\tqAA5|'/+zalM]6t!\rqBe\n\b?\tj\tC)1oY1mC&1I!J,G-4\n2#aA*fi*1\t\tQ-j!U\tAA\\1nK&A&,g")
public interface ExtensiblyTypedResrc extends TypedResrc
{
    TypedResrc addTypeMarkings(final Set<Ident> p0);
}

/*

	Total time: 4 ms
	
*/
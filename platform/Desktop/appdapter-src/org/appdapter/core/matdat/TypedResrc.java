package org.appdapter.core.matdat;

import scala.collection.immutable.Set;
import scala.reflect.ScalaSignature;
import org.appdapter.core.item.Item;
import org.appdapter.core.name.Ident;

@ScalaSignature(bytes = "m2q!1BUsB,GMU3teT!a\r5\fGZ1u\t)a!d_J,'BA\t%\t3baR,'OC\n\ry'oZ'A5R\"\b=7b]T!EU4-\t1qJ6fGR\"!\rYQ!a\t9\fW.Z3YQ!3f]R\"aqQ!!\b\t%$X-\\?qA!;f[\")CE1A%8ji\"a\t\tIj!\nM)1oY1mC&&\n+:LGC+1&AiCN$]3NCJ\\GC0!\t!S&/K\t9!i\\8mKt\"*!A;zaLE\tC31'AhKR$]3JItGo]iAQ2BA&&/3fM&H'$(BA&")
public interface TypedResrc extends Ident, Item
{
    boolean hasTypeMark(final Ident p0);
    
    Set<Ident> getTypeIdents();
}

/*

	Total time: 4 ms
	
*/
package org.appdapter.trigger.scafun;

import org.appdapter.api.trigger.Box;
import scala.collection.mutable.StringBuilder;
import scala.Predef$;
import scala.reflect.ScalaSignature;
import org.appdapter.trigger.bind.jena.FullTrigger;
import org.appdapter.trigger.bind.jena.TriggerImpl;

@ScalaSignature(bytes = ")2A!\tQAK]5hOxJ\\3\r!AB:dC,hN\r9AO]5hO(BA\t%\t3baR,'OC\n\ry'oZ'\rA\tI!R\"\b=6f]T!!\t\tLgZ'91:jO,'/S7qYBQCF%qC>DxJ\\35IB#\tYa)7m)JLwmZ3sa\"aN\\5u}Q\ta!)C!C!a-:f)\t$M5\tAEC&8-7b\t9CEV]&$\b\"B !a2pq")
public class TriggerOne extends TriggerImpl<BoxOne> implements FullTrigger<BoxOne>
{
    public void fire(final BoxOne box) {
        Predef$.MODULE$.println((Object)new StringBuilder().append((Object)this.toString()).append((Object)" firing on ").append((Object)box.toString()).toString());
    }
}

/*

	Total time: 7 ms
	
*/
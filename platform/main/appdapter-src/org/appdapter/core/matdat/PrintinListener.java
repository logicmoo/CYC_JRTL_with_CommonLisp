package org.appdapter.core.matdat;

import scala.collection.mutable.StringBuilder;
import scala.Predef$;
import scala.reflect.ScalaSignature;
import com.hp.hpl.jena.rdf.listeners.ObjectListener;

@ScalaSignature(bytes = "3A!\tyK]5oi&tG*[:uK:,'O\t1Q.;eCRT!!\t\r|'/!\t\"9qIH/:%\t1a:h\"5QR\"\b=!7jgR,g.:t\t\t\"#AsIT!a\t),g.+Y\t19m\t9$ia*\t$Ad_6L!a\b='.Z2u&H/8fe\"AQBCa$qe4_?AE\n\bCjA\tG)1oY1mC&QEI!J,G-4\nB#AB*ue&twM&E!A!BB%q$Aqe4\t1AA\rqJg.;?)\tq05\t!CWqC33'AbI,G\r5oA%Nm\tA!8ji\")(\ras\t;5\t1H={!A.8hq6bmL!Q\r='.Z2u\"DX-\\8wK$\"#\ta\nA")
public class PrintinListener extends ObjectListener
{
    private final String prefix;
    
    public String prefix() {
        return this.prefix;
    }
    
    @Override
	public void added(final Object x) {
        Predef$.MODULE$.println((Object)new StringBuilder().append((Object)this.prefix()).append((Object)" added: ").append(x).toString());
    }
    
    @Override
	public void removed(final Object x) {
        Predef$.MODULE$.println((Object)new StringBuilder().append((Object)this.prefix()).append((Object)" removed: ").append(x).toString());
    }
    
    public PrintinListener(final String prefix) {
        this.prefix = prefix;
    }
}

/*

	Total time: 7 ms
	
*/
package org.appdapter.help.repo;

import scala.collection.JavaConversions$;
import java.util.Iterator;
import scala.collection.mutable.HashMap;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "y2A!\tY1k7vi&|g.T1q\tA!sKB|'BAAW\r9A!C1qa\f^3sIaA8sOQC'\tQ#5\tqBC8-7b\trBB]fVM)!\t!Fy%t Y2aCA\r!QaCqV\t;\"A\n}y!a(pi\"Lgn\tJ!AI\bsC%\tIA5\f/F'!9C!R!!5,H/2mK*1fDG>dG.Z2uS>tBA)Am5NCB\"aF\nA!C*pYV$n8\t\rI!'i\r\tQAA,GOS1wC&#XM]1u_J,A\toqBR\"eRB;uS2TaOU4->q\tA\n^3sCR|'")
public class SolutionMap<T>
{
    private final HashMap<T, Solution> map;
    
    public HashMap<T, Solution> map() {
        return this.map;
    }
    
    public Iterator<T> getJavaIterator() {
        return (Iterator<T>)JavaConversions$.MODULE$.asJavaIterator(this.map().keysIterator());
    }
    
    public SolutionMap() {
        this.map = (scala.collection.mutable.HashMap<T, Solution>)new HashMap();
    }
}

/*

	Total time: 7 ms
	
*/
package org.appdapter.core.matdat;

import scala.Product$class;
import scala.runtime.ScalaRunTime$;
import scala.collection.Iterator;
import scala.runtime.BoxesRunTime;
import org.appdapter.core.name.Ident;
import com.hp.hpl.jena.rdf.model.Model;
import java.util.Set;
import scala.Tuple2;
import scala.Function1;
import scala.reflect.ScalaSignature;
import scala.Serializable;
import scala.Product;

@ScalaSignature(bytes = "-dB.qR5sK$(+9pJ\f\ta!\\1uI$(BAwN]3A!C1qa\f^3sIaA8sO1#\r%YICAq!\"A\bM\r\\1\nEq!AB!osJ+g\r)5\t!!\t\"i\\;oI6{G-7Qe>4Z3s!\tiq#\t9K]8ek$\bCA\tYbBTKJL\r\\5{C\ndW\r\tU\r\"Ei09tiJ,-\\$sCBD\nR?A1IC\t!V=qKVm:d!A!E!yAE7z+BHO]3b[\r5J\tB\"\n%\tAJ[f,o;sKlg*)\"a\n%!A(b[$Wj3fYBxN^5eKJDbIaJ[f,o;sKlg*)!i\"/aN\\5u}QqMM\"B-y\"B-9\"B\t\"C4fi6{G-7U\"AN\"]R!O5|G-7iZa:eM*A(PUtM?7A5qaA2p[&Ai>$W\r\r!\teR\rO$H+9fI:W.?!9\nAA\nQB2paf$2aL&Mi\n%AA}Aq!\n%qCOEIA(\r|/eK\fW;%cU\tK #.\n!T16\tAKV-IQO\\2iK\\W\r/:\t!\"8o_R\fG/[8o\tIFKA\tv]DWmY6fIZ'/[1oGDqaA,\bd_BLHZ3gCVdG\nuS#aJ)\t}!C!AiO]8ek$\bK]3gSb,!\tElaI\fA\\1oO*\ta-kCZ\fB5dFO]5oO\"9!AA\nY9s_,8\r^!sSRLX#75iB8\rIe\ba\t\t\"r9(o3vGR,E.Z7f]R$\"A];5B;\r\te.\bm>\f\t1m\rAH%\r\bq\t\t\"z=(o3vGRLE/:bi>X#>mt(/D}\tih\"d_2dWm;j_:L!a ?%#XM]1u_JD\"a%\t!!\r\fg.R9vC2$B!aAQ\"!\n-aBAC_>dW-8\tY\f\t!!AAID\"!%\t%a!\f7[\"pI$\n/!C!3\t^8TiJLgnC\"IQqDKF,\r\\:\t\tmm!aeIQ#qE\t&Xm;SKB|wI]1qQB1#!!EWR!!.er!a\f6}9s&2)1\bI,h^5nK&!qGAE\t%m;sC$h)8di&|gN\r\b[%BAA)\t\t9%!C#3A!\"!*IQA\"\t7z)yQIA$iq\ba?!1Q%aAB!\"a*IQA')h.9qYf$B!a\\A)Q\"!V%1\b\r=H/[8o!iqK(\r\tIF)VH.\tuJAya=%a!QMA%I!aI,\r*fg>dg/K2AYA4\r\tIg\nTWm;")
public class DirectRepoGraph implements BoundModelProvider, Product, Serializable
{
    private final TypedResrc myUpstreamGraphID;
    private final NamedModelProvider myUpstreamNMP;
    
    public static Function1<Tuple2<TypedResrc, NamedModelProvider>, DirectRepoGraph> tupled() {
        return (Function1<Tuple2<TypedResrc, NamedModelProvider>, DirectRepoGraph>)DirectRepoGraph$.MODULE$.tupled();
    }
    
    public static Function1<TypedResrc, Function1<NamedModelProvider, DirectRepoGraph>> curried() {
        return (Function1<TypedResrc, Function1<NamedModelProvider, DirectRepoGraph>>)DirectRepoGraph$.MODULE$.curried();
    }
    
    public Set<Object> assembleModelRoots() {
        return (Set<Object>)BoundModelProvider$class.assembleModelRoots((BoundModelProvider)this);
    }
    
    public TypedResrc myUpstreamGraphID() {
        return this.myUpstreamGraphID;
    }
    
    public NamedModelProvider myUpstreamNMP() {
        return this.myUpstreamNMP;
    }
    
    public Model getModel() {
        return this.myUpstreamNMP().getNamedModel((Ident)this.myUpstreamGraphID());
    }
    
    public TypedResrc getTypedName() {
        return this.myUpstreamGraphID();
    }
    
    public DirectRepoGraph copy(final TypedResrc myUpstreamGraphID, final NamedModelProvider myUpstreamNMP) {
        return new DirectRepoGraph(myUpstreamGraphID, myUpstreamNMP);
    }
    
    public TypedResrc copy$default$1() {
        return this.myUpstreamGraphID();
    }
    
    public NamedModelProvider copy$default$2() {
        return this.myUpstreamNMP();
    }
    
    public String productPrefix() {
        return "DirectRepoGraph";
    }
    
    public int productArity() {
        return 2;
    }
    
    public Object productElement(final int x$1) {
        Object o = null;
        switch (x$1) {
            default: {
                throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger(x$1).toString());
            }
            case 1: {
                o = this.myUpstreamNMP();
                break;
            }
            case 0: {
                o = this.myUpstreamGraphID();
                break;
            }
        }
        return o;
    }
    
    public Iterator<Object> productIterator() {
        return (Iterator<Object>)ScalaRunTime$.MODULE$.typedProductIterator((Product)this);
    }
    
    public boolean canEqual(final Object x$1) {
        return x$1 instanceof DirectRepoGraph;
    }
    
    @Override
    public int hashCode() {
        return ScalaRunTime$.MODULE$._hashCode((Product)this);
    }
    
    @Override
    public String toString() {
        return ScalaRunTime$.MODULE$._toString((Product)this);
    }
    
    @Override
    public boolean equals(final Object x$1) {
        if (this != x$1) {
            if (x$1 instanceof DirectRepoGraph) {
                final DirectRepoGraph directRepoGraph = (DirectRepoGraph)x$1;
                final TypedResrc myUpstreamGraphID = this.myUpstreamGraphID();
                final TypedResrc myUpstreamGraphID2 = directRepoGraph.myUpstreamGraphID();
                boolean b = false;
                Label_0109: {
                    Label_0108: {
                        if (myUpstreamGraphID == null) {
                            if (myUpstreamGraphID2 != null) {
                                break Label_0108;
                            }
                        }
                        else if (!myUpstreamGraphID.equals(myUpstreamGraphID2)) {
                            break Label_0108;
                        }
                        final NamedModelProvider myUpstreamNMP = this.myUpstreamNMP();
                        final NamedModelProvider myUpstreamNMP2 = directRepoGraph.myUpstreamNMP();
                        if (myUpstreamNMP == null) {
                            if (myUpstreamNMP2 != null) {
                                break Label_0108;
                            }
                        }
                        else if (!myUpstreamNMP.equals(myUpstreamNMP2)) {
                            break Label_0108;
                        }
                        if (directRepoGraph.canEqual(this)) {
                            b = true;
                            break Label_0109;
                        }
                    }
                    b = false;
                }
                if (b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public DirectRepoGraph(final TypedResrc myUpstreamGraphID, final NamedModelProvider myUpstreamNMP) {
        this.myUpstreamGraphID = myUpstreamGraphID;
        this.myUpstreamNMP = myUpstreamNMP;
        BoundModelProvider$class.$init$((BoundModelProvider)this);
        Product$class.$init$((Product)this);
    }
}

/*

	Total time: 21 ms
	
*/
package org.appdapter.core.matdat;

import org.appdapter.core.store.Repo;
import org.appdapter.help.repo.RepoClient;
import scala.collection.mutable.StringBuilder;
import org.appdapter.core.name.Ident;
import scala.collection.immutable.Set;
import scala.reflect.ScalaSignature;
import org.appdapter.core.log.BasicDebugger;

@ScalaSignature(bytes = "-4A!\tB):jm$wI]1qQNXm\ta!\\1uI$(BAwN]3A!C1qa\f^3sIaA8sO1C\r!\ti#D\tyA!Am_L!!\b\t7/[2EK\n,xmZ3s!A!b\n!aD7z)x-;He\b*U\"AF\f\tI!QK\b/3SKN8\r\t\t!AiV1sO$xI]1qQR\t\r\"1i08He\b.#t+qcA&Q9eIC)\t!%AtGd-%C1K]3eKL!AJM+GO%CALU)1B]lW-.U\t)\nZ3oi\"AqBA'\tns&swI]1qQ&#5ofcR\tAIJ!aM\tUs\bk9\n\t1\rAH%\r\to\t)Q=iQ._%oJ\f[%EgBQ!i\naP5oSRtDcA={Aa'a\r!9a\rA\b!\tQ\ti>FO]5oOR\t\t &1i\n'RN\\4\tA$%XK\\5p]R\tq\t!&*\t\b>|G.Z1oY\"MI9W\r^*ueVG/:f)fX-#!BQA=$\\1lK+'/<fI6{G-7Qe>4Z3s)\t6#&!K>,hZ'pIdK]8wS,'CUQ+t_V8-*D!\t16,DX\tA,sKB|'B.AW\r9\nq;&A*fa>E.[3oi\")a\nC=RkAv\r!Y\bgJ'+9p!\tNdM6\tAMf\t)1^8sK&q\rZ%x.jU\niq+;i\t&Xm;pefT!a3")
public class DerivedGraphSpec extends BasicDebugger
{
    private final TypedResrc myTargetGraphTR;
    private Set<Ident> myInGraphIDs;
    
    public TypedResrc myTargetGraphTR() {
        return this.myTargetGraphTR;
    }
    
    public Set<Ident> myInGraphIDs() {
        return this.myInGraphIDs;
    }
    
    public void myInGraphIDs_$eq(final Set<Ident> x$1) {
        this.myInGraphIDs = x$1;
    }
    
    public String toString() {
        return new StringBuilder().append((Object)"DerivedGraphSpec[targetTR=").append((Object)this.myTargetGraphTR()).append((Object)", inGraphs=").append((Object)this.myInGraphIDs()).append((Object)"]").toString();
    }
    
    public boolean isUnion() {
        return this.myTargetGraphTR().hasTypeMark((Ident)DerivedGraphNames$.MODULE$.T_union());
    }
    
    public Ident getStructureTypeID() {
        return (Ident)(this.isUnion() ? DerivedGraphNames$.MODULE$.T_union() : DerivedGraphNames$.MODULE$.T_union());
    }
    
    public BoundModelProvider makeDerivedModelProvider(final RepoClient sourceRC) {
        return (BoundModelProvider)new DirectDerivedGraph(this, (NamedModelProvider)new ClientModelProvider(sourceRC));
    }
    
    public BoundModelProvider makeDerivedModelProvider(final Repo.WithDirectory srcRepo) {
        return (BoundModelProvider)new DirectDerivedGraph(this, (NamedModelProvider)new ServerModelProvider(srcRepo));
    }
    
    public DerivedGraphSpec(final TypedResrc myTargetGraphTR, final Set<Ident> myInGraphIDs) {
        this.myTargetGraphTR = myTargetGraphTR;
        this.myInGraphIDs = myInGraphIDs;
    }
}

/*

	Total time: 13 ms
	
*/
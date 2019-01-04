package org.appdapter.core.matdat;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.query.Dataset;
import java.util.List;
import scala.reflect.ScalaSignature;
import org.appdapter.core.store.RepoOper;

@ScalaSignature(bytes = "bB-abT7oS2{\rZ3s%xN\t1Q.;eCRT!!\t\r|'/!\t\"9qIH/:%\t1a:h2!\tia\"D\ty!AATQ,GOU3q_Bc\b%Uia)\tQa;peL!AF\nI+o\\(qKJL!G\r#I+Gn\\1eC\ndW\rR1uCN,GO'!A1BB%A$A\bnsJ+o\\*qKF/:u!\tiQ$\tA!+9p'B,7\r!\t\t!\"5iR3ckt-\\3J]B!\bGj\nK)1oY1mC&qJ!J,G-4\n%R#AB*ue&twM(I!AABB%%ns\n7/)bi\"Le/\t\t!09!N]3di>0T8eK2\"MER!AM5|G-7Q*a:eM*agNUtM9s7iZA5qaaA2p[&a(\r>$W\r\t\t)A)a-\\2mgB!iR%\rS!R#\tU$\r!!.<b\tA5IMSN$\bC&NY%B'FaM\\4\n9[%aC\"mCNHj\\1eKJDQEaP5oSRtDC*T)V3v!)1da9!)eaC!)AfaC!)afa_!9iI\t\")\tIFC*[q\f10\"])\rVL]m\ra\fn\r!!!\t%7\r7}\r\bA}\r!\t]}\ra\f~\r!M!\taZedw.3BY2luZ3mgR\t$S&!\n+:LGCmQ.A\tsK2|\rZ*j]dW-T8eK2$\"8\t=\\A9DQ!BI\f1cZ3uLg.U;fef$\r^1tKR$a\ti^l!mV\nQ!];fefL!_;G/Y:fi9!PAAYAD(n]&du.3feJ+o\tq4q!#Qp}}B1e`!#AB!osJ+g\rQyQw\"I?1BI1,7o]5oSR$sM]3biHZ3gCVdGJ5!fA!-\t'\ti\")!qCA\r%)hn5fG.,GMC\n!\"8o_R\fG/[8o\ty\"!#Ut7\r[3dW$g+:jC:W\r")
public class OmniLoaderRepo extends SheetRepo implements RepoOper.ReloadableDataset
{
    public static List<ClassLoader> $lessinit$greater$default$5() {
        return OmniLoaderRepo$.MODULE$.$lessinit$greater$default$5();
    }
    
    public void reloadAllModels() {
        this.reloadAllModelsFromDir();
    }
    
    public void reloadSingleModel(final String n) {
        this.reloadSingleModelByName(n);
    }
    
    public Dataset getMainQueryDataset() {
        this.ensureUpdated();
        return super.getMainQueryDataset();
    }
    
    public OmniLoaderRepo(final RepoSpec myRepoSpecStart, final String myDebugNameIn, final String myBasePathIn, final Model directoryModel, final List<ClassLoader> fmcls) {
        super(directoryModel, (List)fmcls);
        this.myRepoSpecForRef_$eq(myRepoSpecStart);
        this.myDebugNameToStr_$eq(myDebugNameIn);
    }
    
    public OmniLoaderRepo(final Model directoryModel) {
        this(null, null, null, directoryModel, null);
    }
    
    public OmniLoaderRepo(final Model directoryModel, final List<ClassLoader> fmcls) {
        this(null, null, null, directoryModel, fmcls);
    }
    
    public OmniLoaderRepo(final RepoSpec myRepoSpecStart, final String myDebugNameIn, final Model directoryModel, final List<ClassLoader> fmcls) {
        this(myRepoSpecStart, myDebugNameIn, myDebugNameIn, directoryModel, fmcls);
    }
}

/*

	Total time: 11 ms
	
*/
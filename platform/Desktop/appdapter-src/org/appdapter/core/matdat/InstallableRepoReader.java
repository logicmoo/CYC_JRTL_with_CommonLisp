package org.appdapter.core.matdat;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.query.Dataset;
import org.appdapter.core.store.dataset.SpecialRepoLoader;
import java.util.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "Q4Q!-Q#8tidG.2mKJ+o*fC,'O\t1Q.;eCRT!!\t\r|'/!\t\"9qIH/:%\t1a:h\"5qQ\"\n=!!F%ogR\fG\\1cY/Z2SK$WM#!\tAEy%t M\"!\tUA\t\f\r,G/=u)9C\r\tIB$DY!B:dC2\fBA&/3fM&q\t'RN\\4uQ\"\tD7bWV\r]8TaG(S9\"!D\n!*fa>/Z2\t!\nA\f\tA\fGU\raKCJ<7EY]I!!\f(/Y=\t=\n\rd5E2majA\rgQ\nA!;jY*\tQ'kCZ\fBA3an;ebT\"m\"7b]L!!\rcm]:M_$WM1\tAFO$8i8uC&tWM+zaDQ!Y\tAbZ3u'\",W\r+zaDQaq\"[:EKJLg/3M_$WMBDRjqAQ8pY\fgCJ!*Am_$Wj3fYNLe^8UCJ<W\r#biX\r:CN\t31K!!\tUs\"\rUexR-6\t!KT)9A-;bg$(BA+Ho:f\t9&KA\tTa.7SKB|Gj\\1eKJDQ!%Ai\"\\1j]X\r\t7l;zQ!];fefT!a1\t),g.C\n\f19m\tG-ia*\tQ-Ad_6L!a/G/Y:fi\")aUAA-:N_,Gla6\tANn])Qn3fY*qNXe4BA9miuZ3m\b\n1111\\3N_,Gn't")
public abstract class InstallableRepoReader extends InstallableSpecReader
{
    public String getExt() {
        return null;
    }
    
    public RepoSpec makeRepoSpec(final String path, final String[] args, final List<ClassLoader> cLs) {
        return null;
    }
    
    public abstract String getContainerType();
    
    public abstract String getSheetType();
    
    public boolean isDerivedLoader() {
        return false;
    }
    
    public abstract void loadModelsIntoTargetDataset(final SpecialRepoLoader p0, final Dataset p1, final Model p2, final List<ClassLoader> p3);
}

/*

	Total time: 13 ms
	
*/
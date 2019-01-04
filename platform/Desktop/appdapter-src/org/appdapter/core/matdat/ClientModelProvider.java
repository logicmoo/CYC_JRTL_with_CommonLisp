package org.appdapter.core.matdat;

import com.hp.hpl.jena.rdf.model.Model;
import org.appdapter.core.store.ModelClient;
import org.appdapter.core.name.Ident;
import org.appdapter.help.repo.RepoClient;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "3A!\t2\t\\5f]RluZ3m!J|g/3fe*1B[$H-;1B2peT!a\bZ1qi(\"A=xma!!5\taBC8-7b\t\tbBB]fVM\t'QiAA+\t!CT1nKluZ3m!J|g/3fe\"AqBB%$nsJ+o\\\"mStG=5\t!D9!!/9p\tib!iK2BA)V\r]8DY&,gC!\tAIy%t \r\"CA\n911\"(59W\r(b[$Wj3fYR\tSYjAW1\nQ!\\8eK2T!!\fI$gM0a!!.8b\t\t$'Aia2T!a\r!(\"A\r|W.8U\t)Qj3fY\")(\nau9qM]1qQ&#CA?a$BAq-\\3\n}b$!B%eK:$\b\"B!\tH7bW$N]3di\n{WO3N_,G:pm&$WM\"a#\n!A\"pk:$Wj3fYBxN^5eKJDQ!!Ai")
public class ClientModelProvider implements NamedModelProvider
{
    private final RepoClient myRepoClient;
    
    public BoundModelProvider makeDirectBoundModelProvider(final Ident graphID, final ModelClient dirModelClient) {
        return NamedModelProvider$class.makeDirectBoundModelProvider((NamedModelProvider)this, graphID, dirModelClient);
    }
    
    public Model getNamedModel(final Ident graphID) {
        return this.myRepoClient.getRepo().getNamedModel(graphID);
    }
    
    public BoundModelProvider makeDirectBoundModelProvider(final Ident graphID) {
        final ModelClient dirModelClient = this.myRepoClient.getRepo().getDirectoryModelClient();
        return this.makeDirectBoundModelProvider(graphID, dirModelClient);
    }
    
    public ClientModelProvider(final RepoClient myRepoClient) {
        this.myRepoClient = myRepoClient;
        NamedModelProvider$class.$init$((NamedModelProvider)this);
    }
}

/*

	Total time: 9 ms
	
*/
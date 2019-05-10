package org.appdapter.core.matdat;

import com.hp.hpl.jena.rdf.model.Model;
import org.appdapter.core.store.ModelClient;
import org.appdapter.core.name.Ident;
import org.appdapter.core.store.Repo;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "%3A!\t2+:wKJluZ3m!J|g/3fe*1B[$H-;1B2peT!a\bZ1qi(\"A=xma!!5\taBC8-7b\t\tbBB]fVM\t'QiAA+\t!CT1nKluZ3m!J|g/3fe\"AqBB%$AnsN8MU3q_Bd\b\b5uia9\tQa;peL!AH\tI+o\\AQbV5uQK'/Z2u_JL(B\"%aN\\5u}QQE\n\t'AQaAaAQB%\nQbZ3ulW\rZ'pIdGC;!\tY(D-\tic&An_,GN0a!4E6f]T!a\r!HN6mo1m\\7\neb#!B'pId\"B(aaB4sCBD\n\t{kA\tAA\\1nK&I,g!\tR[\\W\rR5sK$(i\\;oI6{G-7Qe>4Z3s)\t)\n\r&qI>,hZ'pIdK]8wS,'C<A\b")
public class ServerModelProvider implements NamedModelProvider
{
    private final Repo.WithDirectory mySrcRepo;
    
    @Override
	public BoundModelProvider makeDirectBoundModelProvider(final Ident graphID, final ModelClient dirModelClient) {
        return NamedModelProvider$class.makeDirectBoundModelProvider((NamedModelProvider)this, graphID, dirModelClient);
    }
    
    @Override
	public Model getNamedModel(final Ident graphID) {
        return this.mySrcRepo.getNamedModel(graphID);
    }
    
    @Override
	public BoundModelProvider makeDirectBoundModelProvider(final Ident graphID) {
        final ModelClient dirModelClient = this.mySrcRepo.getDirectoryModelClient();
        return this.makeDirectBoundModelProvider(graphID, dirModelClient);
    }
    
    public ServerModelProvider(final Repo.WithDirectory mySrcRepo) {
        this.mySrcRepo = mySrcRepo;
        NamedModelProvider$class.$init$((NamedModelProvider)this);
    }
}

/*

	Total time: 7 ms
	
*/
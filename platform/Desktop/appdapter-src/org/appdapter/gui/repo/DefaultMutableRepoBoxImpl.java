package org.appdapter.gui.repo;

import java.util.ArrayList;
import java.util.List;

import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.BoxContext;
import org.appdapter.api.trigger.Trigger;
import org.appdapter.core.name.FreeIdent;
import org.appdapter.core.store.Repo;
import org.appdapter.core.store.Repo.WithDirectory;
import org.appdapter.gui.api.WrapperValue;
import org.appdapter.gui.demo.DemoBrowser;
import org.appdapter.gui.demo.DemoBrowser.RepoSubBoxFinder;
import org.slf4j.Logger;

import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.rdf.model.Model;

public class DefaultMutableRepoBoxImpl<TT extends Trigger<? extends RepoBoxImpl<TT>>> extends RepoBoxImpl<TT> implements MutableRepoBox<TT>, WrapperValue {

	RepoSubBoxFinder myRSBF;

	public Box superfindGraphBox(String graphURI) {
		if (myRSBF == null) {
			myRSBF = DemoBrowser.theRSBF;
		}
		return myRSBF.findGraphBox(this, graphURI);
	}

	//Repo.WithDirectory myRepoWD;
	String myDebugName;
	public List<MutableRepoBox> childBoxes = new ArrayList<MutableRepoBox>();

	public DefaultMutableRepoBoxImpl() {

	}

	public DefaultMutableRepoBoxImpl(String myDebugNym, Repo.WithDirectory repo) {
		myDebugName = myDebugNym;
		super.setRepo(repo);
		// resyncChildrenToTree();
	}

	void resyncChildrenToTree() {
		BoxContext ctx = getBoxContext();
		List<Repo.GraphStat> graphStats = getAllGraphStats();
		Repo.WithDirectory repo = getRepoWD();

		// OmniLoaderRepo fr = (OmniLoaderRepo) repo;//
		// repo.getDirectoryModelClient();
		QuerySolution qInitBinding = null;
		String qText = "";
		/*ResultSet rset = QueryHelper.execModelQueryWithPrefixHelp(repo.getDirectoryModel(), "select distinct ?s ?o {?s a ?o}");

		// cp to list (since will be doing this differntly later)
		List<QuerySolution> solnList = new ArrayList<QuerySolution>();
		while (rset.hasNext()) {
			QuerySolution qsoln = rset.next();
			solnList.add(qsoln);
		}

		for (QuerySolution gs : solnList) {
			String constituentRepoName = gs.getResource("s").asNode().getURI();
			ScreenModelBox graphBox = new ScreenModelBox(constituentRepoName);
			ScreenGraphTrigger gt = new ScreenGraphTrigger(constituentRepoName);
			gt.setShortLabel("have-some-fun with Repo " + constituentRepoName + " type " + gs.get("o"));
			graphBox.attachTrigger(gt);
			ctx.contextualizeAndAttachChildBox(this, graphBox);
		}

		for (Repo.GraphStat gs : graphStats) {
			ScreenModelBox graphBox = new ScreenModelBox(gs.graphURI);
			ScreenGraphTrigger gt = new ScreenGraphTrigger("graph=" + gs.graphURI);
			gt.setShortLabel("have-some-fun with uri=" + gs);
			graphBox.attachTrigger(gt);
			ctx.contextualizeAndAttachChildBox(this, graphBox);
		}*/
	}

	@Override final public Repo getValue() {
		return getRepo();
	}

	@Override public List getAllGraphStats() {
		Repo myRepo = getValue();
		if (myRepo == null)
			return null;
		return myRepo.getGraphStats();
	}

	@Override public Box findGraphBox(String graphURI) {
		Logger logger = DemoBrowser.theLogger;

		Box fnd = superfindGraphBox(graphURI);
		boolean madeAlready = false;
		if (fnd != null) {
			logger.trace("Found graphURI=" + graphURI + " on super.findGraphBox" + fnd);
			madeAlready = true;
		}

		Repo.WithDirectory myRepoWD = getRepoWD();
		BoxContext ctx = getBoxContext();
		List<Repo.GraphStat> graphStats = getAllGraphStats();
		Model m = myRepoWD.getNamedModel(new FreeIdent(graphURI));

		for (Repo.GraphStat gs : graphStats) {
			if (gs.graphURI.equals(graphURI)) {
				ScreenModelBox graphBox = new ScreenModelBox(gs.graphURI, m);
				ScreenGraphTrigger gt = new ScreenGraphTrigger(gs.graphURI);
				graphBox.attachTrigger(gt);
				if (!madeAlready) {
					ctx.contextualizeAndAttachChildBox(this, graphBox);
				}
				return (Box) graphBox;
			}
		}

		fnd = superfindGraphBox(graphURI);

		if (fnd != null) {
			logger.trace("Wierdly!?! Found graphURI=" + graphURI + " on super.findGraphBox " + fnd);
			return fnd;
		}

		logger.trace("NOT FOUND graphURI=" + graphURI + " on findGraphBox");
		return null;
	}

	@Override public void mount(String configPath) {
		super.mount(configPath);
	}

	@Override public void formatStoreIfNeeded() {
		super.formatStoreIfNeeded();
	}

	@Override public void importGraphFromURL(String tgtGraphName, String sourceURL, boolean replaceTgtFlag) {
		super.importGraphFromURL(tgtGraphName, sourceURL, replaceTgtFlag);
	}

	@Override public String getUploadHomePath() {
		return super.getUploadHomePath();
	}

	@Override public Object reallyGetValue() {
		if (true) return getValue();
		Repo.WithDirectory myRepoWD = getRepoWD();
		return myRepoWD;
	}

	@Override public void reallySetValue(Object newObject) throws UnsupportedOperationException {
		if (newObject instanceof String) {
			mount(newObject.toString());
			return;
		}
		Repo.WithDirectory myRepoWD = getRepoWD();
		myRepoWD = (WithDirectory) newObject;
	}

}
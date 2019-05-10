package eu.larkc.plugin.identify;

import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.NumericLiteralImpl;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.iterator.SimpleCloseableIterator;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.transform.GWASQuery;
import gate.lifesci.scoring.SNPKnowledge;
import gate.lifesci.scoring.gwas.KeywordPriorScoreForService;

public class GWASIdentifier implements Identifier {

	@Override
	public Context createContext() {
		return null;
	}

	@Override
	public void initialise() {
	}

	@Override
	public void shutdown() {
	}
	
	private synchronized String getNextSNP(Iterator<String> it) {
		try {
			if (!it.hasNext()) return null;
			return it.next();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private synchronized void store(HashSetOfStatements statements, String snp, double score) {
		statements.add(new StatementImpl(new URIImpl("http://linkedlifedata.com/resource/hapmap/snp/"+snp), new URIImpl(
		"urn:snpHasScore"), new NumericLiteralImpl(score)));
	}
	
	private static class HashSetOfStatements extends HashSet<Statement> implements SetOfStatements {

		@Override
		public CloseableIterator<Statement> getStatements() {
			return new SimpleCloseableIterator<Statement>(iterator());
		}
		
	}
	
	public Collection<InformationSet> identify(Query theQuery,
			Contract contract, Context context) {

    String mimirDir = System.getProperty("mimir.index.dir", "/data/lld/mimir-indices");
		
		System.out.println(theQuery);
		
		Collection<InformationSet> result = new HashSet<InformationSet>();

		if (!(theQuery instanceof GWASQuery))
			return result;

		final GWASQuery query = (GWASQuery)theQuery;
		
		System.out.println("About to process: "+query.snpIDs.size());
		
		final HashSetOfStatements statements = new HashSetOfStatements();

		try {
			final KeywordPriorScoreForService kpsfs = new KeywordPriorScoreForService(
					query.keywords.toArray(new String[] {}), true,
					query.searchMode, query.dateConstraint);

			int threads = Math.max(2, Runtime.getRuntime().availableProcessors()) - 1;
			System.err.println("Using " + threads + " Threads");
			final CountDownLatch ct = new CountDownLatch(threads);
			
			long startTime = System.currentTimeMillis();
			
			File snpIndexDir = new File(mimirDir, "snp-index");
			final Iterator<String> it = (query.snpIDs.size() != 0 ? query.snpIDs.iterator() : new LineIterator((new File(snpIndexDir,"indexedSnps.txt")).toURI().toURL()));
			
			for (int i = 0; i < threads ; ++i) {
				new Thread(){
					public void run(){
						SNPKnowledge bk = new SNPKnowledge(query.searchInRIF);
						try {
							String snp = getNextSNP(it);
							while (snp != null) {
								try {
																		
									System.out.println("Processing snp with id: " + snp);
									
									bk.search(snp.substring(snp.lastIndexOf("/")+1), false, true, 0, -1, query.searchMode, query.dateConstraint);

									double score = kpsfs.score(bk);

									store(statements,snp,score);
									
									snp = getNextSNP(it);

								}
								catch (Exception e)
								{
									e.printStackTrace();
								}
							}
						}
						finally {
							ct.countDown();
						}
					}					
				}.start();
			}
			
			ct.await();
			
			System.err.println("Finished " + statements.size() + " SNPs in " + (System.currentTimeMillis()-startTime) + " ms");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		result.add(statements);

		return result;
	}

	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}
}

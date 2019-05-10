/*
 *  Copyright 2011 by The Appdapter Project (www.appdapter.org).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.appdapter.gui.repo;

import java.util.List;

import org.appdapter.trigger.bind.jena.TriggerImpl;
import org.appdapter.core.store.Repo.GraphStat;
import org.appdapter.core.store.dataset.RepoDatasetFactory;
import org.appdapter.core.store.RepoBox;
import org.appdapter.demo.DemoResources;
import org.appdapter.gui.browse.Utility;

/**
 * @author Stu B. <www.texpedient.com>
 */
public class RepoTriggers {

	public static class OpenTrigger<MRB extends MutableRepoBox<TriggerImpl<MRB>>> extends TriggerImpl<MRB> {
		String storeConfigResolvedPath = RepoDatasetFactory.STORE_CONFIG_PATH; // DemoResources.resolveResourcePathToURL_WhichJenaCantUseInCaseOfJarFileRes(DemoResources.STORE_CONFIG_PATH);

		@Override public void fire(MRB targetBox) {
			// Model data = FileManager.get().loadModel(dataPath.toString());
			targetBox.mount(storeConfigResolvedPath);
		}
	}

	public static class InitTrigger<MRB extends MutableRepoBox<TriggerImpl<MRB>>> extends TriggerImpl<MRB> {
		@Override public void fire(MRB targetBox) {
			targetBox.formatStoreIfNeeded();
		}
	}

	public static class DumpStatsTrigger<RB extends org.appdapter.core.store.RepoBox<RBT>, RBT extends TriggerImpl<RB>> extends TriggerImpl<RB> {
		@Override public void fire(RB targetBox) {
			List<GraphStat> stats = targetBox.getAllGraphStats();
			Utility.attachTo(targetBox, "stats", stats);
		}
	}

	public static class QueryTrigger<RB extends RepoBox<TriggerImpl<RB>>> extends TriggerImpl<RB> {

		String resolvedQueryURL = DemoResources.QUERY_PATH;

		@Override public void fire(RB targetBox) {
			ClassLoader optCL = DemoResources.class.getClassLoader();
			String resultXML = targetBox.processQueryAtUrlAndProduceXml(resolvedQueryURL, optCL);
			logInfo("ResultXML\n-----------------------------------" + resultXML + "\n---------------------------------");
		}
	}

	public static class UploadTrigger<MRB extends MutableRepoBox<TriggerImpl<MRB>>> extends TriggerImpl<MRB> {
		// ModGraph modGraph = new ModGraph();

		// Want contravariance?
		@Override public void fire(MRB targetBox) {
			try {
				String tgtGraphName = "yowza";

				// TODO - check on DemoResources.OPTIONAL_ABSOLUTE_ROOT_PATH
				String absolutePathInNeigborClassSpace = "/" + DemoResources.DATA_PATH;
				String dataSourceURL = DemoResources.makeURLforClassNeighborResPath_JenaFMCantUseButModelReaderCan(getClass(), absolutePathInNeigborClassSpace);

				targetBox.importGraphFromURL(tgtGraphName, dataSourceURL, true);
			} catch (Throwable t) {
				logError("problem in UploadTrigger", t);
			}
		}
	}
}

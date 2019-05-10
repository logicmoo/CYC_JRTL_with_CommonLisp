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

/*
 * ModelMatrixPanel.java
 *
 * Created on Oct 25, 2010, 8:12:03 PM
 */

package org.appdapter.gui.repo;

import java.beans.Customizer;
import java.io.File;
import java.lang.reflect.Type;
import java.util.List;

import javax.swing.JFileChooser;

import org.appdapter.api.trigger.Box;
import org.appdapter.core.jvm.GetObject;
import org.appdapter.core.debug.UIAnnotations.UISalient;
import org.appdapter.core.debug.UIAnnotations.UtilClass;
import org.appdapter.core.convert.ToFromKeyConverter;
import org.appdapter.core.matdat.OmniLoaderRepo;
import org.appdapter.core.name.Ident;
import org.appdapter.core.store.Repo;
import org.appdapter.core.store.dataset.RepoDatasetFactory;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.editors.ObjectPanel;
import org.appdapter.gui.swing.CantankerousJob;
import org.appdapter.gui.swing.ScreenBoxPanel;
import org.appdapter.gui.table.GenericBeansPanel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.graph.Graph;
//package org.protege.owl.jena;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.DatasetFactory;
import com.hp.hpl.jena.rdf.listeners.StatementListener;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Statement;

public class RepoOntologyPanel extends ScreenBoxPanel<MutableRepoBox> implements Customizer, UtilClass, ObjectPanel {
	static Logger theLogger = LoggerFactory.getLogger(RepoOntologyPanel.class);

	@UISalient(IsPanel = true) static public RepoOntologyPanel showOWLOntologyMatrixPanel(final Repo repo) {
		RepoOntologyPanel rp = new RepoOntologyPanel();
		rp.setObject(repo);
		return rp;
	}

	@UISalient(IsPanel = true) static public RepoOntologyPanel showOWLOntologyMatrixPanel(final Model m) {
		RepoOntologyPanel rp = new RepoOntologyPanel();
		rp.setDataset(DatasetFactory.create(m));
		return rp;
	}

	private void setDataset(Dataset repo) {
		// TODO Auto-generated method stub

	}

	@UISalient(IsPanel = true) static public RepoOntologyPanel showOWLOntologyMatrixPanel(final Dataset repo) {
		RepoOntologyPanel rp = new RepoOntologyPanel();
		rp.setDataset(repo);
		return rp;
	}

	@UISalient static public Repo.WithDirectory createNewRepoWithModelForDirectory(final Model repo) {
		return new OmniLoaderRepo(repo);
	}

	@UISalient(IsFactoryMethod = true)//
	static public Repo.WithDirectory createNewRepoWithBlankModelForDirectory() {
		return new OmniLoaderRepo(RepoDatasetFactory.createPrivateMemModel());
	}

	public static Type[] EDITTYPE = new Type[] { Repo.class, mapOf(Ident.class, makeParameterizedType(GetObject.class, Model.class)) };

	@Override protected void initSubclassGUI() throws Throwable {
		initComponents();
	}

	@Override protected void completeSubClassGUI() {
	}

	@Override public boolean isObjectBoundGUI() {
		return false;
	}

	@Override public Class<MutableRepoBox> getClassOfBox() {
		return MutableRepoBox.class;
	}

	Dataset dataset;
	private MutableRepoBox myFocusBox;

	/** Creates new form OWLOntologyMatrixPanel */
	public RepoOntologyPanel() {
		if (!java.beans.Beans.isDesignTime()) {
			//	Utility.makeTablePopupHandler(myGraphTable);
		}
	}

	private void initComponents() {

	}

	@Override public void focusOnBox(MutableRepoBox b) {
		if (b == myFocusBox)
			return;
		myFocusBox = b;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables

	// End of variables declaration//GEN-END:variables

	@Override public Object getValue() {
		if (myFocusBox != null)
			return myFocusBox.getValue();
		return this;
	}

	@Override public void objectValueChanged(Object oldValue, Object newValue) {
		if (newValue == null)
			return;
		reloadObjectGUI(newValue);
	}

	protected Dataset getDataset() {
		if (dataset == null) {
			return myFocusBox.getValue().getMainQueryDataset();
		}
		return dataset;

	}

	@Override protected boolean reloadObjectGUI(Object newValue) throws ClassCastException {
		MutableRepoBox mrb = null;
		if (newValue instanceof MutableRepoBox) {
			mrb = (MutableRepoBox) newValue;
		} else {
			mrb = new DefaultMutableRepoBoxImpl(Utility.getUniqueNameForKey(newValue), Utility.recastCC(newValue, Repo.WithDirectory.class));
		}
		focusOnBox((MutableRepoBox) mrb);
		return true;
	}

	ToFromKeyConverter mapping;

	private StatementListener listener;

	private Model getJenaModel() {
		Object o = getValue();
		if (o == null)
			return null;
		return Utility.recastCC(o, Model.class);
	}

	public void objectValueChangedOneModel(Object oval, Object bean) {
		if (oval != bean) {
			if (oval instanceof Model) {
				final Model boundModel = (Model) oval;
				boundModel.unregister(this.listener);
			}
			if (bean instanceof Model) {
				final Model boundModel = (Model) bean;
				Utility.addShutdownHook(new Runnable() {
					@Override public void run() {
						boundModel.unregister(listener);
					}
				});

				// Add listener to the model
				this.listener = new StatementListener() {
					@Override
					public void addedStatement(Statement s) {
						notifyConcurrentChange();
					}

					@Override
					public void removedStatement(Statement s) {
						notifyConcurrentChange();
					}
				};
				boundModel.register(this.listener);
			}

			try {
				notifyConcurrentChange();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}


	CantankerousJob cj = new CantankerousJob("reloadObjectGUI ", this, true) {
		@Override public void run() {

				reloadObjectGUI(getDataset());
		}
	};

	protected void notifyConcurrentChange() {
		cj.attempt();
	}
}

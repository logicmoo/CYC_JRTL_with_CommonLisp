package org.appdapter.gui.repo;

import org.appdapter.api.trigger.Trigger;
import org.appdapter.gui.box.ScreenBoxImpl;

import com.hp.hpl.jena.rdf.model.Model;

public class ScreenModelBox<TrigType extends Trigger<? extends ScreenBoxImpl<TrigType>>> extends ScreenBoxImpl<TrigType> {

	@Override public String getShortLabel() {
		return myURI;
	}

	final String myURI;
	private Model myModel;

	public ScreenModelBox(String uri, Model model) {
		//super(uri, model);
		myURI = uri;
		myModel = model;
	}

	@Override public String toString() {
		return getClass().getName() + "[uri=" + myURI + "model=" + myModel + "]";
	}

	// setShortLabel("tweak-" + myURI);
	public void setModel(Model m) {
		this.myModel = m;
	}

	@Override public Object getValue() {
		return myModel;
	}

	@Override
	public void reallySetValue(Object newObject) throws UnsupportedOperationException {
		myModel = (Model) newObject;
	}

}
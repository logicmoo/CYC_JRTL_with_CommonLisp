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

import java.lang.reflect.Type;
import java.util.List;

import org.appdapter.api.trigger.Box;
import org.appdapter.core.convert.ToFromKeyConverter;
import org.appdapter.core.jvm.CallableWithParameters;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.CantankerousJob;
import org.appdapter.gui.table.GenericBeansPanel;
import org.armedbear.lisp.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.rdf.listeners.StatementListener;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Statement;

/**
 * @author Stu B. <www.texpedient.com>
 */
public class ModelMatrixPanel<BoxType extends Box> extends GenericBeansPanel
{
	static Logger theLogger = LoggerFactory.getLogger(ModelMatrixPanel.class);

	@UISalient
	static public ModelMatrixPanel showModelMatrixPanel(final Model obj)
	{
		ModelMatrixPanel matrixPanel = new ModelMatrixPanel();
		matrixPanel.setObject(obj);
		return matrixPanel;
	}

	public static Type[] EDITTYPE = new Type[] { Model.class, Graph.class, collectionOf(Statement.class) };

	static String[] columnNames = new String[] { "Subject", "Predicate", "Object" };//, "Model" };

	public ModelMatrixPanel() {
		super(Model.class, Statement.class, null, columnNames);
	}

	ToFromKeyConverter mapping;

	private StatementListener listener;

	private Model getJenaModel()
	{
		Object o = getValue();
		if (o == null)
			return null;
		return Utility.recastCC(o, Model.class);
	}

	@Override
	public void populateActionPanel(Object object, Class rowClass2)
	{
		addAction("add", new CallableWithParameters()
		{

			@Override
			public Object call(Object box, Object... params)
			{
				// TODO Auto-generated method stub
				return null;
			}
		});
		addAction("Remove selected", new CallableWithParameters()
		{

			@Override
			public Object call(Object box, Object... params)
			{
				// TODO Auto-generated method stub
				return null;
			}
		});
		addAction("Query", new CallableWithParameters()
		{
			@Override
			public Object call(Object box, Object... params)
			{
				// TODO Auto-generated method stub
				return null;
			}
		});
		super.populateActionPanel(object, rowClass2);
	}

	@Override
	public void objectValueChanged(Object oval, Object bean)
	{
		if (oval != bean)
		{
			if (oval instanceof Model)
			{
				final Model boundModel = (Model) oval;
				boundModel.unregister(this.listener);
			}
			if (bean instanceof Model)
			{
				final Model boundModel = (Model) bean;
				Utility.addShutdownHook(new Runnable()
				{
					@Override
					public void run()
					{
						boundModel.unregister(listener);
					}
				});

				// Add listener to the model
				this.listener = new StatementListener()
				{
					@Override
					public void addedStatement(Statement s)
					{
						notifyConcurrentChange();
					}

					@Override
					public void removedStatement(Statement s)
					{
						notifyConcurrentChange();
					}
				};
				boundModel.register(this.listener);
			}

			try
			{
				notifyConcurrentChange();
			} catch (Throwable e)
			{
				e.printStackTrace();
			}
		}
	}

	CantankerousJob cj = new CantankerousJob("reloadObjectGUI ", this, true)
	{

		@Override
		public void run()
		{
				try {
					reloadObjectGUI(getJenaModel());
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	};

	protected void notifyConcurrentChange()
	{
		cj.attempt();
	}

	@Override
	public List listFromHolder(Object o)
	{
		if (o == null)
			return null;
		Model model = Utility.recastCC(o, Model.class);
		return model.listStatements().toList();
	}

	@Override
	public ToFromKeyConverter getCellConverter(Class valueClazz)
	{
		if (RDFNode.class.isAssignableFrom(valueClazz))
		{
			if (mapping == null)
			{
				mapping = Utility.RESOURCE_TO_FROM_STRING;
			}
			return mapping;
		}
		return Utility.getToFromStringConverter(valueClazz);
	}
}

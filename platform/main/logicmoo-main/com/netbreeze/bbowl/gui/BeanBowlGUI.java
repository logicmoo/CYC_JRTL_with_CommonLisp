package com.netbreeze.bbowl.gui;

//import static org.appdapter.core.log.Debuggable.printStackTrace;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.NotSerializableException;
import java.net.URL;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

//import org.apache.log4j.Category;
//import org.appdapter.gui.demo.DemoBrowser;
import org.logicmoo.bb.TrackedObjects;
import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.Startup;
import org.logicmoo.system.ToplevelMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netbreeze.bbowl.Settings;
import com.netbreeze.swing.BeanMenu;
import com.netbreeze.swing.SplashWindow;
import com.netbreeze.swing.SwingEnvironment;

/**
 * The top-level GUI for the BeanBowl application.
 * It also contains the main(...) method.
 *
 * @author Henrik Kniberg
 */
public class BeanBowlGUI extends JFrame implements PropertyChangeListener {
//==== Static variables ===========
  static BeanBowlGUI defaultFrame = null;
private static Logger theLogger;
 // private static Category cat = Category.getInstance(BeanBowlGUI.class);

//==== Instance variables ==========
  public TrackedObjects bowl;
  public BeanBowlContext context;


//==== added for external code ==========
  public static boolean addObject(Object obj) {
	  getStaticBowl().addBean(obj);
	  return true;
  }
  public static boolean addObject(String named, Object obj) {
	  obj.getClass();
	  getStaticBowl().addBean(named, obj);
	  return true;
  }
  public static TrackedObjects getStaticBowl() {
	  if(defaultFrame==null) {
		  startBeanBowl(new TrackedObjects());
	  }
	  TrackedObjects v = defaultFrame.getBowl();
	  return v;
  }


  //The currently opened bean bowl file (may be null)
  File file = null;

//==== GUI elements ===================
  JMenuBar menuBar;
  FileMenu fileMenu;
  BeanBowlPanel panel;
  JToolBar toolbar;
  //JButton aboutButton;
  BeanMenu selectedMenu;


//==== Actions =============================
  Action saveAction = new SaveAction();
  Action openAction = new OpenAction();
  Action saveAsAction = new SaveAsAction();
  Action newAction = new NewAction();
  Action aboutAction = new AboutAction();


  @ToplevelMethod
  public static void startBeanBowl( TrackedObjects bb ) {
	 // org.apache.log4j.Category.class.getName();
	  if(defaultFrame!=null) {
		  defaultFrame.show(true);
		  return;
	  }
    LogManager.initLog4J();
    getLogger().info("Starting bean bowl...");

    SplashWindow splash = new SplashWindow(Icons.loadIcon("splash.jpg"));
    splash.show();

    try {
      defaultFrame = new BeanBowlGUI(bb);
      SwingEnvironment.setBeansContext(defaultFrame.getContext());
      //frame.pack();

      defaultFrame.setSize(800, 600);
      com.netbreeze.util.Utility.centerWindow(defaultFrame);
      defaultFrame.show();
      defaultFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      getLogger().info("Bean bowl is now running!");
    } catch (Exception err) {
      getLogger().error("Bean bowl could not be started", err);
    }

    splash.dispose();
  }

//==== Main method ==========================
  public static void main(String[] args0) {
	startBeanBowl(new TrackedObjects());
  }

//======== Constructors =============================0

  /**
   * Creates a new BeanBowlGUI that shows the given bowl
   */
  public BeanBowlGUI(TrackedObjects bowl) {
    String version = BeanBowlGUI.class.getPackage().getImplementationVersion();
    if (version == null) {
      setTitle("Bean bowl");
    } else {
      setTitle("Bean bowl version " + version);
    }

    try {
      setIconImage(Icons.loadImage("mainFrame.gif"));
    } catch (Throwable err) {
    }
    this.context = new BeanBowlContext(this);
    setBowl(bowl);
	BeanShellCntrl.addSingleton(this);
  }

  /**
   * Creates a new BeanBowlGUI that shows a new BeanBowl
   */
  public BeanBowlGUI() {
    this(BeanShellCntrl.getBowl());
  }

//====== Property getters ==============

  public BeanBowlPanel getBeanBowlPanel() {
    return panel;
  }

  public JDesktopPane getDesk() {
    return panel.getDesk();
  }

  public static BeanBowlGUI getDefaultFrame() {
    return defaultFrame;
  }

  public BeanBowlContext getContext() {
    return context;
  }

  /**
   * The current bean bowl being displayed
   */
  public TrackedObjects getBowl() {
    return bowl;
  }

  /**
   * Sets the bowl to be displayed
   */
  private void setBowl(TrackedObjects newBowl) {
    TrackedObjects oldBowl = bowl;
    if (newBowl != oldBowl) {
      this.bowl = newBowl;
      this.panel = new BeanBowlPanel(context);
      getContentPane().removeAll();
      initGUI();
      invalidate();
      validate();
      if (oldBowl != null)
        oldBowl.removePropertyChangeListener(this);
      if (newBowl != null)
        newBowl.addPropertyChangeListener(this);
      updateSelectedMenu();
    }
  }

//==== Property notification methods ===============

  @Override
public void propertyChange(PropertyChangeEvent evt) {
    if (evt.getSource() == bowl) {
      if (evt.getPropertyName().equals("selected")) {
        updateSelectedMenu();
      }
    }
  }

  @Override
protected void processEvent(AWTEvent e) {
    if (e.getID() == Event.WINDOW_DESTROY) {
      getLogger().info("Shutting down bean bowl...");
      try {
        Settings.saveToFile();
      } catch (Exception err) {
        getLogger().warn("Warning - failed to save settings: " + err.getMessage(), err);
      }
      removeAll();
      dispose();
      getLogger().info("Bean bowl is now shut down!");
    }
    super.processEvent(e);
  }

//==== Action execution methods =======================

  void openBowl() {
    FileDialog dialog = new FileDialog(this, "Load bean bowl", FileDialog.LOAD);
    dialog.show();
    String fileName = dialog.getFile();
    String directory = dialog.getDirectory();
    if (fileName != null) {
      openBowl(new File(directory, fileName));
    }
  }

  void openBowl(File file) {
    if (file.exists()) {
      try {
        setBowl(TrackedObjects.load(file));
        Settings.addRecentFile(file);
        fileMenu.refreshRecentFileList();
      } catch (Exception err) {
        context.showError("Opening failed", err);
      }
    } else {
      context.showError("File does not exist: " + file.getPath(), null);
    }
  }

  void newBowl() {
    //@feature ask save changes?
    setBowl(new TrackedObjects());
    file = null;
    checkControls();
  }

  void saveBowl() {
    if (file == null) {
      saveBowlAs();
    } else {
      saveBowl(file);
    }
  }

  void saveBowlAs() {
    FileDialog dialog = new FileDialog(this, "Save bean bowl", FileDialog.SAVE);
    dialog.setFile("mybowl.ser");
    dialog.show();
    String fileName = dialog.getFile();
    String directory = dialog.getDirectory();
    getLogger().debug("fileName = " + fileName);
    getLogger().debug("directory = " + directory);
    if (fileName != null) {
      saveBowl(new File(directory, fileName));
    }
  }

  void saveBowl(File file) {
    getLogger().debug("saveBowl(" + file.getAbsoluteFile() + ")");
    //if (file.exists()) {
      this.file = file;
      try {
        bowl.save(file);
      } catch (NotSerializableException err) {
        context.showError("This bowl contains an unserializable object", err);
      } catch (Exception err) {
        context.showError("Saving failed", err);
      }
    checkControls();
    //} else {
    //  showError("File does not exist: " + file.getPath());
    //}
  }



//==== Private methods ===================

  private void updateSelectedMenu() {
    if (selectedMenu != null) {
      menuBar.remove(selectedMenu);
      selectedMenu = null;
    }

    Object selected = bowl.getSelectedBean();
    if (selected != null) {
      selectedMenu = new BeanMenu(selected);
      menuBar.add(selectedMenu);
    }
    invalidate();
    validate();
    repaint();
  }

  void checkControls() {
    saveAction.setEnabled(file != null);
  }

  /**
   * Creates and initialized the GUI components
   * within the BeanBowlGUI. Should only be called once.
   */
  private void initGUI() {
    if (defaultFrame == null) {
      defaultFrame = this;
    }
    getContentPane().setLayout(new BorderLayout());
    panel = new BeanBowlPanel(context);

    menuBar = new JMenuBar();
    fileMenu = new FileMenu();
    menuBar.add(fileMenu);
    setJMenuBar(menuBar);

    toolbar = new MyToolBar();
    toolbar.setFloatable(true);

    //JPanel northPanel = new JPanel();
    //northPanel.setLayout(new BorderLayout());
    //northPanel.add("Center", toolbar);

    //aboutButton = new ActionButton(aboutAction);
    //northPanel.add("East", aboutButton);

    getContentPane().add("Center", panel);
    getContentPane().add("North", toolbar);
    checkControls();
  }

//==== Action classes =================================

	public static Logger getLogger() {
		try {
			if (theLogger == null) {
				//System.setProperty("log4j.defaultInitOverride", "true");
				System.setProperty("log4j.debug", "true");
				String loc = "mylog4j.properties";
				URL url = TrackedObjects.class.getResource("mylog4j.properties");
				if (url != null) {
					loc = url.toExternalForm();
				}
				System.setProperty("log4j.configuration", loc);
				theLogger = LoggerFactory.getLogger(TrackedObjects.class);
			}
		} catch (Throwable t) {
			t.printStackTrace();
			//Startup.printStackTrace(t);
		}
		return theLogger;
	}

class SaveAction extends AbstractAction {
    SaveAction() {
      super("Save", Icons.saveBowl);
    }
    @Override
	public void actionPerformed(ActionEvent evt) {
      saveBowl();
    }
  }

  class SaveAsAction extends AbstractAction {
    SaveAsAction() {
      super("Save as...", Icons.saveBowlAs);
    }
    @Override
	public void actionPerformed(ActionEvent evt) {
      saveBowlAs();
    }
  }

  class NewAction extends AbstractAction {
    NewAction() {
      super("New", Icons.newBowl);
    }
    @Override
	public void actionPerformed(ActionEvent evt) {
      newBowl();
    }
  }

  class OpenAction extends AbstractAction {
    OpenAction() {
      super("Open", Icons.openBowl);
    }
    @Override
	public void actionPerformed(ActionEvent evt) {
      openBowl();
    }
  }

  class AboutAction extends AbstractAction {
    AboutAction() {
      super("About Bean Bowl...", Icons.about);
    }
    @Override
	public void actionPerformed(ActionEvent evt) {
      setEnabled(false);
      SplashWindow splash = new SplashWindow(Icons.loadIcon("splash.jpg"), true);
      splash.show();
      splash.addWindowListener(
        new WindowAdapter() {
          @Override
		public void windowClosed(WindowEvent e) {
            setEnabled(true);
          }
        }
      );
    }
  }

  class RecentFileAction extends AbstractAction {
    File recentFile;

    RecentFileAction(File file) {
      super(file.getName(), Icons.recentFile);
      this.recentFile = file;
    }
    @Override
	public void actionPerformed(ActionEvent evt) {
      openBowl(recentFile);
    }
  }

//==== GUI component inner classes ===========

  class FileMenu extends JMenu {
    Vector recentFiles = new Vector();

    FileMenu() {
      super("File");
      addItems();
    }

    private void addItems() {
      add(newAction);
      add(openAction);
      addSeparator();
      add(saveAction);
      add(saveAsAction);
      addSeparator();

      recentFiles = new Vector();
      Iterator it = Settings.getRecentFiles();
      while (it.hasNext()) {
        File file = (File) it.next();
        Action a = new RecentFileAction(file);
        recentFiles.addElement(a);
        add(a);
      }
    }

    public void refreshRecentFileList() {
      removeAll();
      addItems();
    }
  }

  class MyToolBar extends JToolBar {
    MyToolBar() {
      super();
      add(newAction);
      add(openAction);
      addSeparator();
      add(saveAction);
      add(saveAsAction);
      addSeparator();
      add(aboutAction);
    }
  }
}

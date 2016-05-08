package joint.xplor.gui;

import joint.xplor.log.Log;
import joint.xplor.sim.Simulation;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

/**
 * GUI.java
 *
 * This class represents the GUI that will always appear for main project,
 * offering core features to the main program. The core approach to this class
 * is that it should be small, light and effective. Only core, non-specialised
 * code will be supported here.
 *
 * From a structural perspective, this class serves as a wrapper for the system
 * core functionality rather than being the system's core functionality. The
 * simulation should run effectively if this class was to be removed.
 **/
public class GUI implements Runnable{
  
  private Simulation sim;

  private final JFrame window;
  private final Draw drawPnl;
  private final JMenuBar topMBr;
  private final JMenu fileMnu; 
  private final JMenu viewMnu;
  private final JMenuItem openItm;
  private final JMenuItem aboutItm;
  private final JMenuItem exitItm;

  /* TODO: Migrate to a config file. */
  private final static int SIZE_X = 800;
  private final static int SIZE_Y = 600;

  /* TODO: Migrate to strings file. */
  private static String NAME_STR = "Xplor";
  private static String FILE_STR = "File";
  private static String VIEW_STR = "View";
  private static String OPEN_STR = "Open";
  private static String ABOUT_STR = "About";
  private static String EXIT_STR = "Exit";

  /**
   * GUI()
   *
   * This method is responsible for initialising the GUI class that wraps
   * around and serves the simulation.
   *
   * @param sim The instance of the simulation to be wrapped by this GUI class.
   * This value must not be NULL.
   **/
  public GUI(Simulation sim){
    this.sim = sim;
    this.drawPnl = new Draw(sim);

    /* Setup the window */
    window = new JFrame(NAME_STR);
    window.setSize(SIZE_X,SIZE_Y);
    window.setResizable(true);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(new BorderLayout());

    /* Setup menu bar */
    topMBr = new JMenuBar();
    fileMnu = new JMenu(FILE_STR);
    viewMnu = new JMenu(VIEW_STR);
    openItm = new JMenuItem(OPEN_STR);
    aboutItm = new JMenuItem(ABOUT_STR);
    exitItm = new JMenuItem(EXIT_STR);
    fileMnu.add(openItm);
    fileMnu.add(exitItm);
    viewMnu.add(aboutItm);
    topMBr.add(fileMnu);
    topMBr.add(viewMnu);

    /* Add components to window*/
    window.setJMenuBar(topMBr);
    window.add(drawPnl, BorderLayout.CENTER); 
  }

  /* TODO: Comment this code. */
  public void show() throws Exception{
    SwingUtilities.invokeLater((Runnable) this);
    window.setVisible(true);
  }

  /* TODO: Comment this code. */
  @Override
  public void run(){
    /* TODO: Write this code. */
  }

  /**
   * menuCallback()
   *
   * This method is responsible for handling the callback from events on the
   * menu for the GUI.
   *
   * @param s The identifier for the callback.
   * @param e The event that occurred to trigger the event.
   **/
  private void menuCallback(String s, ActionEvent e){
    /* TODO: Handle menu callback. */
    Log.dbg("Menu item clicked -> " + s); // TODO: Remove this line.
  }
}

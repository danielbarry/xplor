package joint.xplor.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import joint.xplor.log.Log;
import joint.xplor.sim.Simulation;

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

  /* TODO: Migrate to strings file. */
  private final static String NAME_STR = "Xplor";
  private final static String FILE_STR = "File";
  private final static String VIEW_STR = "View";
  private final static String OPEN_STR = "Open";
  private final static String ABOUT_STR = "About";
  private final static String EXIT_STR = "Exit";

  /* TODO: Migrate to a config file. */
  private static int SIZE_X = 800;
  private static int SIZE_Y = 600;

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
    JMenuBar topMBr = new JMenuBar();
    JMenu fileMnu = new JMenu(FILE_STR);
    JMenu viewMnu = new JMenu(VIEW_STR);
    JMenuItem openItm = new JMenuItem(OPEN_STR);
    JMenuItem aboutItm = new JMenuItem(ABOUT_STR);
    JMenuItem exitItm = new JMenuItem(EXIT_STR);
    fileMnu.add(openItm);
    fileMnu.add(exitItm);
    viewMnu.add(aboutItm);
    topMBr.add(fileMnu);
    topMBr.add(viewMnu);

    /* Add components to window */
    window.setJMenuBar(topMBr);
    window.add(drawPnl, BorderLayout.CENTER);

    /* Add listeners to menu items */
    for(JMenuItem mi : new JMenuItem[]{openItm, exitItm, aboutItm}){
      mi.addActionListener(
        new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
            menuCallback(mi.getText(), e);
          }
        }
      );
    }
  }

  /**
   * show()
   *
   * Asks the system politely to launches and display the GUI.
   *
   **/
  public void show() throws Exception{
    SwingUtilities.invokeLater((Runnable) this);
  }

  /**
   * run()
   *
   * Shows the GUI.
   */
  @Override
  public void run(){
    window.setVisible(true);
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
    switch(s){
      case "Exit" :
        /* TODO: Exit more gracefully. */
        System.exit(0);
        break;
      default :
        Log.dbg("Menu item clicked -> " + s); // TODO: Remove this line.
        break;
    }
  }
}

package joint.xplor;

import joint.xplor.gui.GUI;
import joint.xplor.log.Log;

/**
 * Main.java
 *
 * Entry class into the main system. The responsibility of this class is to
 * handle all input from the command line if any and start the program
 * appropriately.
 **/
public class Main{
  /**
   * main()
   *
   * The main entry method into the program. This method is expected to parse
   * the command line inputs, handle the programs safety and begin the main
   * execution of the program.
   *
   * @param args The arguments given to this program from the command line.
   **/
  public static void main(String[] args){
    /* TODO: Write this section. */
    Log.dbg("Program started");

    /* TODO: GUI will need a reference to logic */
    GUI gui = new GUI(null);
    try{
      gui.show();
    }catch(Exception ex){
      Log.err("Failed to start GUI");
    }
  }
}

package joint.xplor.gui;

import joint.xplor.sim.Simulation;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Draw.java
 *
 * This class visualises the simulation. The core approach to this class
 * is that it should easy to add to.
 *
 * This class extends a JPanel so it can easily added to the GUI along
 * with other components.
 **/
public class Draw extends JPanel{
  private Simulation sim;

  /**
   * Draw()
   *
   * This method is responsible for initialising the GUI class that wraps
   * around and serves the simulation.
   *
   * @param sim The instance of the simulation to render.
   * This value must not be NULL.
   **/
  public Draw(Simulation sim){
    this.sim = sim;
  }

  /* TODO: Comment this. */
  @Override
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    this.setBackground(Color.BLACK);
    /* TODO: Using g paint the world in sim */
  }

  /* TODO: Comment this. */
  public void setSim(Simulation sim){
    this.sim = sim;
  }
}

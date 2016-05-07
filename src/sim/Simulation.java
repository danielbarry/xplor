package joint.xplor.sim;

import joint.xplor.log.Log;
import joint.xplor.sim.env.Environment;
import joint.xplor.sim.ctrl.Controller;

/**
 * Simulation.java
 *
 * This class is fully responsible for the entire simulation and allows for
 * external objects to request information about the internal simulation.
 * Requests are likely to be from other threads so this class must be thread
 * safe for any information it discloses publicly.
 **/
public class Simulation implements Runnable{
  /**
   * Simulation()
   *
   * This method initialises the simulation and sets up each aspect, including
   * the environment, controllers and any other aspects that are required for
   * the test.
   *
   * @param env An environment object that defines where the experiment will
   * takes place for the agents.
   * @param ctrls The controllers, a.k.a the agents that will be in the
   * experiment.
   **/
  public Simulation(Environment env, Controller[] ctrls){
    /* TODO: Write this code. */
  }

  /**
   * run()
   *
   * The main thread for the simulation.
   **/
  @Override
  public void run(){
    /* TODO: Write the simulation loop. */
    Log.dbg("Hello from a new Thread"); // TODO: Remove me.
  }
}

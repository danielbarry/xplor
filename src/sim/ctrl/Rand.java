package joint.xplor.sim.ctrl;

import java.util.Random;
import joint.xplor.sim.ctrl.Move;

/**
 * Rand.java
 *
 * A random move based controller that ignores any sensory information passed
 * to it.
 **/
public class Rand implements Controller{
  private static int moveLength;
  private Random rand;

  /* Initialise static variables in a static block */
  static{
    moveLength = Move.values().length;
  }

  /**
   * Rand()
   *
   * Initialises the random agent.
   **/
  public Rand(){
    /* Initialise the random variable */
    rand = new Random();
  }

  /**
   * getMove()
   *
   * Gets the next agent move for the given raw input.
   *
   * NOTE: This method puts direct delay into the number of updates the program
   *       is capable of running. Heavy code here may significantly slow down
   *       the system.
   *
   * @param input The raw sensory input for the environment.
   * @return The move in which the agent decides to use.
   **/
  @Override
  public Move getMove(byte[] input){
    /* Get a random move position regardless of input */
    return Move.values()[rand.nextInt(moveLength)];
  }

  /**
   * getKnowledge()
   *
   * Gets the agent's knowledge in raw format.
   *
   * @return The raw knowledge of length defined by the agent.
   **/
  @Override
  public byte[] getKnowledge(){
    /* TODO: Implement this method correctly. */
    return new byte[]{};
  }
}

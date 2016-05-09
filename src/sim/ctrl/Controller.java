package joint.xplor.sim.ctrl;

/**
 * Controller.java
 *
 * This is a simple interface that defines how an agent will be interacted
 * with.
 **/
public interface Controller{
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
  public Move getMove(byte[] input);

  /**
   * getKnowledge()
   *
   * Gets the agent's knowledge in raw format.
   *
   * @return The raw knowledge of length defined by the agent.
   **/
  public byte[] getKnowledge();
}

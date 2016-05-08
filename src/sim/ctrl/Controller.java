package joint.xplor.sim.ctrl;

/**
 * Controller.java
 *
 * This is a simple interface that defines how an agent will be interacted
 * with.
 **/
public interface Controller{
  public Move getMove(byte[] input);
  public byte[] getKnowledge();
}

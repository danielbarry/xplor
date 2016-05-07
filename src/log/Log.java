package joint.xplor.log;

/**
 * Log.java
 *
 * A simple logging class that handles where and how information is saved and
 * displayed from the program.
 **/
public abstract class Log{
  private static final int STK_DEPTH = 3;
  private static final char[] VOWELS = new char[]{'a', 'e', 'i', 'o', 'u'};

  /**
   * err()
   *
   * Outputs an error on the correct streams.
   *
   * @param msg The message to be displayed.
   **/
  public static void err(String msg){
    /* Display the message to the terminal time stamped and logged */
    System.out.println("[!!] " + stamp() + " " + msg);
    /* TODO: Errors should also be displayed to the terminal. */
  }

  /**
   * dbg()
   *
   * Outputs a debug message on the correct streams.
   *
   * @param msg The message to be displayed.
   **/
  public static void dbg(String msg){
    /* Display the message to the terminal time stamped and logged */
    System.out.println("[??] " + stamp() + " " + msg);
  }

  /**
   * stamp()
   *
   * Generates a time, position and file stamp for the current system state and
   * returns as a string.
   **/
  private static String stamp(){
    /* Get the current information at the correct stack depth and store it */
    StackTraceElement ste = Thread.currentThread().getStackTrace()[STK_DEPTH];
    /* Get the system current time */
    return System.currentTimeMillis() +
      ":" + strMin(ste.getFileName(), 3) +
      "-" + strLeftPad('0', 4, Integer.toString(ste.getLineNumber()));
  }

  /**
   * strMin()
   *
   * Minify a String value by keeps the minimal important describing data,
   * reducing it down to a 3 letter word.
   *
   * @param s The String to be minified.
   * @param l The length to minify the String to.
   * @return The minified String.
   **/
  private static String strMin(String s, int l){
    /* Make sure the String is not NULL */
    if(s != null){
      /* Make sure the String has at least one character */
      if(s.length() >= 1){
        /* Store temporary variable */
        String t = "";
        /* Try to remove extension */
        if(s.lastIndexOf(".") >= 0){
          /* Remove extension */
          s = s.substring(0, s.lastIndexOf("."));
        }
        /* Try to remove lower case values */
        if(s.length() > l){
          /* Clear temporary variable */
          t = "";
          /* Iterate over characters and remove lower case values */
          for(int x = 0; x < s.length(); x++){
            if((int)(s.charAt(x)) < 97){
              t += s.charAt(x);
            }
          }
          /* Check if value is still large enough to be used */
          if(t.length() >= l){
            s = t;
          }
        }
        /* Try to remove vowels */
        if(s.length() > l){
          /* Clear temporary variable */
          t = "";
          /* Iterate over characters and remove vowels values */
          for(int x = 0; x < s.length(); x++){
            boolean vowel = false;
            for(int y = 0; y < VOWELS.length; y++){
              if(s.charAt(x) == VOWELS[y]){
                vowel = true;
                break;
              }
            }
            if(!vowel){
              t += s.charAt(x);
            }
          }
          /* Check if value is still large enough to be used */
          if(t.length() >= l){
            s = t;
          }
        }
        /* Lastly, pick the best of what is left */
        t = "";
        for(int x = 0; x < l; x++){
          t += s.charAt(x * (s.length() / l));
        }
        return t;
      }else{
        /* Indicate there was a failure */
        return "";
      }
    }else{
      /* Indicate there was a failure */
      return "";
    }
  }

  /**
   * strLeftPad()
   *
   * Pads the left hand side of the String with a given character value.
   *
   * @param c Character to pad the String out with.
   * @param l The ideal length of the final String.
   * @param s The String to be padded.
   **/
  private static String strLeftPad(char c, int l, String s){
    /* TODO: Write code. */
    return s;
  }
}

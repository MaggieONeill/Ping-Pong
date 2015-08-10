import java.util.ArrayList;
import java.io.Console;

public class PingPong {
    public static void main(String[] args) {
      Console myConsole = System.console();

      System.out.println("Please enter a number greater than 0!");
      String stringNumber = myConsole.readLine();
      Integer number = Integer.parseInt(stringNumber);

      ArrayList<String> allEntries = new ArrayList<String>();

      for (Integer i = 1; i <= number; i++ ) {

        String currentEntry = pingPongMethod(i);
        allEntries.add(currentEntry);

        //
        //
        // if(i % 3 == 0 && i % 5 == 0) {
        //   allEntries.add("ping-pong");
        // } else if (i % 3 == 0) {
        //   allEntries.add("ping");
        // } else if (i % 5 == 0 ) {
        //     allEntries.add("pong");
        // } else {
        //     String numbers = Integer.toString(i);
        //     allEntries.add(numbers);
        //     }
        //
        //
        //   }
        //   System.out.println(allEntries);
    }
  }

    public static String pingPongMethod(Integer number) {
        if (number % 15 == 0)  {
          return "ping-pong";
        }
        else if (number % 3 == 0) {
          return "ping";
        }  else if (number % 5 == 0) {
            return "pong";
          }
        else {
         return number.toString();
        }

    }
    }

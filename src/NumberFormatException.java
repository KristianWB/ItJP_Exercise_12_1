import java.util.Scanner;

public class NumberFormatException {


            /** Main method */
        public static void main(String[] args)   {

            //Building a scanner object
            Scanner input = new Scanner(System.in);

            // Prompting for input
            System.out.print(
                    "Please input three elements: a ciffer between 0 and 9, then an operand, and then a new ciffer " +
                            "between 0 and 9"
            );
            String expression = input.next();

            // Check number of strings passed
            if (args.length != 3) {
                throw new StringIndexOutOfBoundsException(
                        "Usage; Java calculator operand1 operator operand2"
                );

            }
            // The result of the operation
            int result = 0;

            // Determine the operator
            switch (args[1].charAt(0))   {
                case '+': result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                    break;
                case '-': result = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
                    break;
                case '.': result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                    break;
                case '/': result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
            }

            // Display result
            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
        }
    }

}

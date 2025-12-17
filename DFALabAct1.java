import java.util.Scanner;

public class DFALabAct1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary string: ");
        String input = scanner.nextLine();

        // Start state
        String state = "q0";

        for (char symbol : input.toCharArray()) {
            switch (state) {
                case "q0":
                    if (symbol == '0') {
                        state = "q1";
                    } else if (symbol == '1') {
                        state = "q0";
                    } else {
                        System.out.println("Invalid input. Only binary digits allowed.");
                        return;
                    }
                    break;

                case "q1":
                    if (symbol == '0') {
                        state = "q1";
                    } else if (symbol == '1') {
                        state = "q2";
                    }
                    break;

                case "q2":
                    if (symbol == '0') {
                        state = "q1";
                    } else if (symbol == '1') {
                        state = "q0";
                    }
                    break;
            }
        }

        // Check acceptance
        if (state.equals("q2")) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        String response;

        System.out.println("Hello! I am a simple chatbot. Type 'exit' to end the chat.");

        while (true) {
            System.out.print("You: ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            response = getResponse(userInput);
            System.out.println("Chatbot: " + response);
        }

        scanner.close();
    }

    public static String getResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I assist you today?";
        } else if (input.contains("how are you")) {
            return "I'm just a bot, but I'm doing well. How about you?";
        } else if (input.contains("what is your name")) {
            return "I am a simple chatbot created in Java.";
        } else if (input.contains("bye")) {
            return "Goodbye! Have a great day!";
        }else if (input.contains("good")) {
            return "How can i help you.";
        }
        else if (input.contains("how can i get addmission in Apex University")) {
            return "By qualifying CUET exam and filling the registration form of university if you are alligible to our criteria you can get a call from our college.";
        }
        else {
            return "Sorry, I don't understand that.";
        } 
    }
}
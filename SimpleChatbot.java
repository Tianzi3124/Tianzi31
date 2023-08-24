import java.util.Scanner;
import java.util.Random;
public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] response = {
            "Hello! User can I help you on something?",
            "Good Morning! User how can I help you for today?",
            "Good Afternoon! User how can I help you for today?",
            "Good Evening! User how can I help you for today?",
            "Whats on your mind?"
        };
        System.out.println("Welcome to SimpleChatbot!");
        while(true) {
            System.out.print("You: ");
            String userMessage = scanner.nextLine();
            if (userMessage.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }
            int randomIndex = random.nextInt(response.length);
            String chatbotResponse = response[randomIndex];
            System.out.println("Chatbot: " + chatbotResponse);
        }
        scanner.close();
    }
}

    
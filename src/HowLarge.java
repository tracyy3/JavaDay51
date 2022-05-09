import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word");
        ArrayList<String> WordsList = new ArrayList<String>();

        while (true) {
        String itemInput = scanner.nextLine();
            WordsList.add(itemInput);
                int arrayCount = WordsList.size() - 1;
                if (itemInput.isEmpty()) {
            System.out.println("The total amount of items in the list was: " + arrayCount);
                break;
}
}
}
}
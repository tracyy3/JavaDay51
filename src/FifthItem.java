import java.util.Scanner;
import java.util.ArrayList;


public class FifthItem {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter word:" );
        ArrayList<String> WordsList = new ArrayList<String>();

    while (true) {
    String itemInput = scanner.nextLine();
        WordsList.add(itemInput);
            if (itemInput.isEmpty()) {
        System.out.println("The fifth item in the list is: " + WordsList.get(4));
            break;
}
}
}
}
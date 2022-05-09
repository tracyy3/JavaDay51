import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfWords = new ArrayList<String>();
        System.out.println("Enter a word");

        while (true) {
            String itemInput = scanner.nextLine();
        listOfWords.add(itemInput);
            if (itemInput.isEmpty()) {
        System.out.println("The last item in the list is: " + listOfWords.get(listOfWords.size()-2));
            break; 
}
}    
}
}
import java.util.Scanner;

public class Adventure {
    public Adventure(String[] args) {
        System.out.println("WELCOME TEXTADVENTURE");
        System.out.println("You wake up in an unfamiliar room in an unfamiliar apartment with an unfamiliar note in your pocket. WHAT DO YOU DO?! ");
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 to read the note");

        int choice = sc.nextInt();

        if (choice == 1); {
            System.out.println("the note says hello");
        }




    }




}

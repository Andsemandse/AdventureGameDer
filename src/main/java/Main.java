import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO TEXTADVENTURE, TYPE YOUR CHARACTER'S NAME");
        Scanner sc = new Scanner(System.in);
        String playername = sc.nextLine();
        System.out.println("your name is" + " " + playername);




        System.out.println("You wake up in an unfamiliar room in an unfamiliar apartment with an unfamiliar note in your pocket. WHAT DO YOU DO?! ");

        System.out.println("press 1 to read the note");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1);{
            System.out.println("the note says" + " " + playername + " " + ",you won't remember anything from last night. But today you'll meet a man named Eovad Erkenheim, he's gonna seem nice, but for your own good STAY AWAY FROM HIM");
            System.out.println("After reading the note you look up, and you see three doors in front of you");
            System.out.println("Door furthest to the left says DAMNATION ");
            System.out.println("Door in the middle says ATTONEMENT");
            System.out.println("Door furthest to the right says SALVATION");
            System.out.println("what door do you choose?");

            String doorChoice = sc.nextLine();
            if (doorChoice == "damnation");{
                System.out.println("You enter the damnation door");
            }
            if (doorChoice == "attonement");{
                System.out.println("You enter the attonement door");
            }
            if (doorChoice == "salvation");{
                System.out.println("You enter the salvation door");
            }



        }




    }

}

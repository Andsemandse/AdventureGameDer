import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO TEXTADVENTURE, TYPE YOUR CHARACTER'S NAME");
        Scanner sc = new Scanner(System.in);
        String playername = sc.nextLine();
        System.out.println("your name is" + " " + playername);

        System.out.println("You wake up in an unfamiliar room, in an unfamiliar apartment with an unfamiliar note in your pocket. WHAT DO YOU DO?! ");

        System.out.println("press 1 to read the note");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("the note says" + " " + playername + " " + ",you won't remember anything from last night. But today you'll meet a man named Eovad Erkenheim, he's gonna seem nice, but for your own good STAY AWAY FROM HIM");
                System.out.println("After reading the note you look up, and you see three doors in front of you");
                System.out.println("Door furthest to the left says DAMNATION ");
                System.out.println("Door in the middle says ATONEMENT");
                System.out.println("Door furthest to the right says SALVATION");
                System.out.println("Type the name of the door you wish to enter");

                String doorChoice = sc.nextLine();


                /*if (doorChoice == ("Damnation")) {
                    System.out.println("You enter Damnation door");
                }*/


                switch (doorChoice) {
                    case "Damnation":
                        System.out.println("you enter the damnation door\n" +
                                "After entering the room, a voice tells you welcome" + " " + playername + " " + "whatever you search for, you shall find inside this room.\n" +
                                "You need only visualize the item you desire, and you shall find it in front of you.\n" +
                                "what do you desire? ");
                        String desire = sc.nextLine();
                        System.out.println("you close your eyes and visualize your wish, and once opening your eyes you find" + " "  + desire + " "+ "\n" +
                        "in front of you");

                        break;
                }

                        while (doorChoice != "Damnation");{
                System.out.println("this door is locked. Try another one");

                    /*case "Atonement":
                        System.out.println("you enter the Atonement door");
                        break;
                    case "Salvation":
                        System.out.println("you enter the Salvation door");

                    default:
                        System.out.println("not a valid door. You died");*/


                }


        }


    }
}



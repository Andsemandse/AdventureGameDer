import java.util.Objects;
import java.util.Scanner;

public class UserInter
{
    Scanner sc = new Scanner(System.in);
    Adventure ad = new Adventure();

    public void start()
    {
        System.out.println ("Velkommen!!! sådan virker det: vest med w, nord med n, syd med s, øst med ø. Exit. look. Help.");

        String userChoice = null;

        while (!Objects.equals(userChoice, "exit"))
        {
            userChoice = sc.nextLine();

            switch (userChoice)
            {
                case "north", "n", "go north":
                    boolean willGoNorth = ad.goNorth();
                    if (willGoNorth)
                    {
                        System.out.println("Nu valgte du North.");
                        ad.goNorth();
                        System.out.println(ad.look());
                    } else
                        System.out.println("Du kan ikke gå denne vej");
                    break;

                case "south", "s", "go south":
                    boolean willGoSouth = ad.goSouth();
                    if (willGoSouth)
                    {
                        System.out.println("Du har valgt south");
                        ad.goSouth();
                        System.out.println(ad.look());
                    } else
                        System.out.println("Du kan ikke gå denne vej");
                    break;

                case "west", "w", "go west":
                    boolean willGoWest = ad.goWest();
                    if (willGoWest)
                    {
                        System.out.println("Du valgte west.");
                        ad.goWest();
                        System.out.println(ad.look());
                    } else
                        System.out.println("Du kan ikke gå denne vej");
                    break;

                case "east", "e", "go east":
                    boolean willGoEast = ad.goEast();
                    if (willGoEast)
                    {
                        System.out.println("Du går east.");
                        ad.goEast();
                        System.out.println(ad.look());
                    } else
                        System.out.println("Du kan ikke gå denne vej");
                    break;

                case "look":
                    System.out.println(ad.look());
                    break;

                case "exit":
                    System.out.println("Farvel du");
                    System.exit(0);
            }
        }
    }
}
public class Adventure
{
    Room currentRoom = null;

    public Adventure()
    {
        Room room1 = new Room(1, "Room1");
        Room room2 = new Room(2, "Room2");
        Room room3 = new Room(3, "Room3");
        Room room4 = new Room(4, "Room4");
        Room room5 = new Room(5, "Room5");
        Room room6 = new Room(6, "Room6");
        Room room7 = new Room(7, "Room7");
        Room room8 = new Room(8, "Room8");
        Room room9 = new Room(9, "Room9");

        //Room1
        room1.setEast(room2);
        room1.setSouth(room4);

        //Room2
        room2.setEast(room3);
        room2.setWest(room1);

        //Room3
        room3.setWest(room2);
        room3.setSouth(room6);

        //Room4
        room4.setSouth(room7);
        room4.setNorth(room1);

        //Room5
        room5.setSouth(room8);

        //Room6
        room6.setNorth(room3);
        room6.setSouth(room9);

        //Room7
        room7.setNorth(room4);
        room7.setEast(room8);

        //Room8
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setEast(room7);

        //Room9
        room9.setNorth(room6);
        room9.setWest(room8);

        currentRoom = room1;
    }
    public boolean goEast()
    {
        if (currentRoom.getEast() == null)
        {


//Boolean fis skal på plads


    public String look()
    {
        return currentRoom.getRoomInfo();
    }
}
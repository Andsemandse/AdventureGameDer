public class Room
{
    private int RoomNumber;
    private String RoomDescription;

    public Room(int RoomNumber, String RoomDescription)
    {
        this.RoomNumber = RoomNumber;
        this.RoomDescription = RoomDescription;
    }
    //East
    private Room roomEast;
    public void setEast(Room room)
    {
        this.roomEast = room;
    }
    public Room getEast()
    {
        return roomEast;
    }

    //West
    private Room roomWest;
    public void setWest(Room room)
    {
        this.roomWest = room;
    }
    public Room getWest()
    {
        return roomWest;
    }

    //North
    private Room roomNorth;
    public void setNorth(Room room)
    {
        this.roomNorth = room;
    }
    public Room getNorth()
    {
        return roomNorth;
    }

    //South
    private Room roomSouth;
    public void setSouth(Room room)
    {
        this.roomSouth = room;
    }
    public Room getSouth()
    {
        return roomSouth;
    }



    public String getRoomInfo()
    {
        return RoomDescription;
    }
}


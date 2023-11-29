//Damian Kos

public class Club {
    private int clubId;
    private String clubName;
    private String description;
    private String location;

    public Club(int clubId, String clubName, String description, String location) {
        this.clubId = clubId;
        this.clubName = clubName;
        this.description = description;
        this.location = location;
    }
    
    public void create() {
        // Logic to store club data in a database
    }
}

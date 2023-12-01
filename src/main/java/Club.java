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

    public int getClubId() {
        return clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public boolean create() {
        return true;
    }
}   

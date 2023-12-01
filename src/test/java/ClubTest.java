import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClubTest {

    @Test
    void CreateClub() {
        // Arrange
        int clubId = 1;
        String clubName = "Donegal Club";
        String description = "This is a test club.";
        String location = "Donegal, IE";

        // Act
        Club club = new Club(clubId, clubName, description, location);
        assertTrue(club.create()); // Verify club creation

        // Assert
        assertEquals(clubId, club.getClubId());
        assertEquals(clubName, club.getClubName());
        assertEquals(description, club.getDescription());
        assertEquals(location, club.getLocation());
    }
}

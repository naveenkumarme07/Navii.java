

public class Cricket {
	static String defaultFormat = "test";
    static int totalPlayers = 11;
    static String country = "india";

    String playername;
    int jerseyNumber;
    boolean isCaptain;

    public Cricket(String playername, int jerseyNumber, boolean isCaptain) {
        this.playername = playername;
        this.jerseyNumber = jerseyNumber;
        this.isCaptain = isCaptain;
    }

    public void displayDetails() {
        System.out.println("Player Name: " + playername);
        System.out.println("Jersey Number: " + jerseyNumber);
        System.out.println("Is Captain: " + (isCaptain ? "Yes" : "No"));
        System.out.println("Default Format: " + defaultFormat);
        System.out.println("Total Players: " + totalPlayers);
        System.out.println("Country: " + country);
        System.out.println("----------------------------");
    }

}

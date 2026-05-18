
public class PoliceOfficer extends Person {

    private String stationName;

    public PoliceOfficer(String name, String badgeNumber, String stationName) {
        super(name, badgeNumber);
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public String getRole() {
        return "Police Officer";
    }
}

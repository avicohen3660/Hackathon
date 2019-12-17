import java.util.List;

public class Data {
    private List<Soldier> soldiers;

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public void addSoldier(Soldier s) {
        this.soldiers.add(s);
    }

    Data()
    {

    }

}

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable {
    private List<Soldier> soldiers;
    private int num;

    public int getNum()
    {
        return num;
    }

    public Data(int num)
    {
        this.num = num;
    }
//
}

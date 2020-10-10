import java.util.HashMap;

public class Kobold extends Monster{
    public Kobold(int maxHp, int hp, HashMap<String, Integer> items) {

        super(maxHp, hp, items);
    }

    @Override
    public String toString() {
        return "Kabold has : " + super.toString();
    }
}
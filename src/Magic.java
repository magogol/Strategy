import java.util.ArrayList;
import java.util.List;

public class Magic {
    private final String type;
    private final Double power;

    public Magic(String type, Double power) {
        this.type = type;
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public Double getPower() {
        return power;
    }
}
class MagicType{
    private final List<Magic> mags;

    public MagicType() {
        mags = new ArrayList<Magic>();
    }

    public void addMagic(Magic mag) {
        mags.add(mag);
    }

    public double countPower() {
        double pow = 0.0;
        for (Magic mag : mags) {
            pow += mag.getPower();
        }

        return pow;
    }

    public boolean conjure(UseMagic use) {

        double resPower = countPower();
        return use.conjure(resPower);
    }
}
 interface UseMagic {
    public boolean conjure(double pow);

}
 class AirMagic implements UseMagic {

    private final String color;
    private final Double amount;

    public AirMagic(String color, Double amount) {
        super();
        this.color = color;
        this.amount = amount;
    }

    @Override
    public boolean conjure(double pow) {
        return true;
    }

}
 class FireMagic implements UseMagic {

    private final String color;
    private final Double amount;

    public FireMagic(String color, Double amount) {
        super();
        this.color = color;
        this.amount = amount;
    }

    @Override
    public boolean conjure(double pow) {
        return true;
    }

}
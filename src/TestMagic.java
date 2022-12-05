import org.testng.annotations.Test;
import static org.junit.Assert.assertTrue;

public class TestMagic {
    @Test
    public void conjureUsingAir() {

        MagicType type = new MagicType();

        Magic a = new Magic("air", 100.5);
        type.addMagic(a);

        Magic b = new Magic("fire", 99.3);
        type.addMagic(b);

        UseMagic airMag = new AirMagic("Blue", 123.0);

        boolean res = type.conjure(airMag);
        assertTrue(res);

    }
}

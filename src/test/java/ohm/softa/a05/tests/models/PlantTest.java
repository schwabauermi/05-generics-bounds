package ohm.softa.a05.tests.models;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import org.junit.jupiter.api.Test;

public class PlantTest {
    @Test
    void testCreateGreenFlower(){
        try{
            new Flower(0.5, "Rosa", "Abra", PlantColor.GREEN);
            throw new RuntimeException();
        }catch(IllegalArgumentException e){
            return;
        }
    }
}

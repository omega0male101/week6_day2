import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{

  AnalogCamera analogCamera;
    DigitalCamera digitalCamera;
    Photographer photographer;
    Printable printable;

  @Before
  public void before();{
    photographer = new Photographer();
    analogCamera = new AnalogCamera("Sony");
    digitalCamera = new DigitalCamera("Nikon");
  }

  @Test
  public void cameraStartsEmpty(){
    assertEquals(0, photographer.cameraCount());
  }




}
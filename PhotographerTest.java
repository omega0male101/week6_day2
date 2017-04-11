import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{

  AnalogCamera analogCamera;
    DigitalCamera digitalCamera;
    Photographer photographer;
    Printable printable;

  @Before
  public void before(){
    photographer = new Photographer();
    analogCamera = new AnalogCamera("Sony");
    digitalCamera = new DigitalCamera("Nikon");
  }

  @Test
  public void cameraStartsEmpty(){
    assertEquals(0, photographer.cameraCount());
  }

  @Test
   public void canAddCamera() {
     photographer.addCamera(printable);
     assertEquals(1, photographer.cameraCount());
   }

   @Test
   public void canRemoveCamera() {
     photographer.addCamera(digitalCamera);
     photographer.addCamera(analogCamera);
     photographer.removeCamera(analogCamera);
     assertEquals(1, photographer.cameraCount());
   }

   @Test
     public void cameraCanPrintDetails() {
       assertEquals("Nikon", digitalCamera.printDetails());
     }




}
import java.util.*;

public class Photographer {

  private ArrayList<Printable> cameras;

  public int cameraCount(){
    return cameras.size();
  }

  public Photographer() {
      this.cameras = new ArrayList<Printable>();
    }

  public void addCamera(Printable camera) {
    cameras.add(camera);
  }

   public void removeCamera(Printable camera) {
     cameras.remove(camera);
   }

}
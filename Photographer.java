import java.util.*;

public class Photographer {

  private ArrayList<Printable> cameras;

  public int cameraCount(){
    return cameras.size();
  }

  public Photographer() {
      this.cameraList = new ArrayList<Printable>();
    }

  public void addCamera(Printable camera) {
    cameraList.add(camera);
  }

 

}
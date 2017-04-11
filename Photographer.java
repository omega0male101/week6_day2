import java.util.*;

public class Photographer {

  private String name;
  private ArrayList<Printable> cameras;

  public addCamera(String name){
    this.name = name;
    this.cameras = new ArrayList<Printable>();
  }

  public void removeCamera(){
    cameras.clear();
  }

}
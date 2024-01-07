package at.mes.basic.oop.Handy;

public class Phonefile {
     private double size;
     private String name;
     private String extension;

     public Phonefile(double size, String name, String extension) {
          this.size = size;
          this.name = name;
          this.extension = extension;
     }

     public double getSize() {
          return size;
     }

     public void setSize(double size) {
          this.size = size;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getExtension() {
          return extension;
     }

     public void setExtension(String extension) {
          this.extension = extension;
     }
}

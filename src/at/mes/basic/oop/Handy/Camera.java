package at.mes.basic.oop.Handy;

public class Camera {
    private double resolution;

    public Camera(double resolution) {
        this.resolution = resolution;
    }

    public Phonefile makePicture(String extension, String name){
        double size = resolution * 2;
        Phonefile file = new Phonefile(size,name,extension);
        return file;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }
}

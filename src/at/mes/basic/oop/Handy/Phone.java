package at.mes.basic.oop.Handy;

public class Phone {

    private String color;
    private SIM sim;
    private Camera camera;
    private SDCard sdcard;

    public Phone(String color, SIM sim, Camera camera, SDCard sdcard) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sdcard = sdcard;
    }

    public void makeCall(String callnumber){
        if(sim==null){
            System.out.println("Keine SIM-Karte");
        }
        else{
            sim.doCall(callnumber);
        }
    }

    public void getFreeSpace(){
        System.out.println("Du hast " + sdcard.getFreeSpace() + "MB Speicherplatz frei");
    }

    public void printAllFiles(){
        sdcard.getAllFiles();
    }
    public void takePicture(){
        Phonefile file = camera.makePicture();
        sdcard.saveFile(file);
    }

    public void switchCamera(Camera camera){
        System.out.println("Du hast eine neue Kamera erhalten.");
        this.camera = camera;
    };

    public void switchSim(SIM sim){
        System.out.println("Du hast eine neue SIM-Karte erhalten.");
        this.sim = sim;
    };

    public void switchSDCard(SDCard sdcard){
        System.out.println("Du hast eine neue SDCard erhalten.");
        this.sdcard = sdcard;
    };

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public SDCard getSdcard() {
        return sdcard;
    }

    public void setSdcard(SDCard sdcard) {
        this.sdcard = sdcard;
    }
}

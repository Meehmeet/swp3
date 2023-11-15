package at.mes.basic.oop;

public class Battery {
    private double charging_status;

    public Battery(double charging_status) {
        this.charging_status = charging_status;
    }

    public void chargingverbrauch() {
        charging_status -= 5.0;
    }

    public double getCharging_status() {

        return charging_status;
    }

    public void setCharging_status(double charging_status) {
        this.charging_status = charging_status;
    }
}

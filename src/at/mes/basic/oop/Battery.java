package at.mes.basic.oop;

public class Battery {
    private double charging_status;

    public Battery(int charging_status) {
        this.charging_status = charging_status;
    }

    public void chargingverbrauch() {
        if (charging_status >= 5.0) {
            charging_status -= 5.0;
        } else {
            charging_status = 0.0;
        }
    }

    public double getCharging_status() {
        return charging_status;
    }

    public void setCharging_status(int charging_status) {
        this.charging_status = charging_status;
    }
}

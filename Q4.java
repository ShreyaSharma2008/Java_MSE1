// A smart EV charging station wants to develop a system to keep track of electric
// vehicles using its charging facility. Each vehicle has a registration number, vehicle
// model and battery percentage. The station wants to prevent direct access to vehicle
// information, maintain the total number of vehicles registered, and ensure that every
// vehicle has a unique registration number.
// a) Create a class EVVehicle and declare registrationNo, model and
// batteryPercentage as private data members. Provide appropriate getter and setter
// methods to ensure controlled access to the data.
// b) Create a parameterized constructor to initialize all vehicle details when an object is
// created.
// c) Declare a static variable vehicleCount that keeps track of the total number of
// EVVehicle objects created.
// d) Declare a final variable stationName and initialize it with "GreenCharge EV
// Station".


// Answer:
public class Main {
    public static void main(String[] args) {
        EVVehicle v1 = new EVVehicle(1, "Nexon", 78);
        EVVehicle e2 = new EVVehicle(2, "Brezza", 50);
        
        System.out.println("Station: " + EVVehicle.stationName);
        System.out.println(v1.getRegistrationNo() + " " + " " + v1.getModel() + " " + v1.getBatteryPercentage());
        System.out.println("Total Vehicles: " + EVVehicle.vehicleCount);
    }
}
class EVVehicle {
    private int registrationNo;
    private String model;
    private int batteryPercentage;
    public static int vehicleCount = 0;
    public static final String stationName = "GreenCharge EV Station";
    public EVVehicle(int registrationNo, String model, int batteryPercentage) {
        this.registrationNo = registrationNo;
        this.model = model;
        this.batteryPercentage = batteryPercentage;
        vehicleCount++; 
    }
    public int getRegistrationNo() {
        return registrationNo;
    }
    public void setRegistrationNo(int registrationNo) {
        this.registrationNo = registrationNo;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getBatteryPercentage() {
        return batteryPercentage;
    }
    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
}

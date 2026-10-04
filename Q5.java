// A Smart Home System uses a smart device that can perform both security 7.5 1
// monitoring and energy monitoring.
// 3
// (a) Create an interface SecuritySystem with a method monitorSecurity().
// (b) Create another interface EnergySystem with a method checkEnergyUsage().
// (c) Create a class SmartHome that implements both SecuritySystem and
// EnergySystem. Override both methods with a customize message as follows:
// "Security is monitored"
// "Energy check done"


// Answer:
public class Main {
    public static void main(String[] args) {
        SmartHome sh = new SmartHome();
        sh.monitorSecurity();
        sh.checkEnergyUsage();
    }
}
interface SecuritySystem {
    void monitorSecurity();
}
interface EnergySystem {
    void checkEnergyUsage();
}
class SmartHome implements SecuritySystem, EnergySystem {
    @Override
    public void monitorSecurity() {
        System.out.println("Security is monitored");
    }
    @Override
    public void checkEnergyUsage() {
        System.out.println("Energy check done");
    }
}

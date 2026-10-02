// A space mission system calculates the required fuel for a spacecraft. The required 5 1 3
// fuel is calculated as:
// Required Fuel = Distance / Fuel Efficiency
// (a) Create a class Spacecraft with distance and fuelEfficiency as data members.
// (b) Create a method calculateFuel() that calculates the required fuel. If fuelEfficiency
// is 0, handle the exception using try-catch and display message "Invalid fuel
// efficiency!".
// Driver code:
// public class Main{
// public static void main(String[] args) {
// Spacecraft s = new Spacecraft();
// s.distance=10;
// s.fuelEfficiency=0;
// s.calculateFuel();
// }
// }
// class Spacecraft{
// //Write your code here
// }

// ANSWER
public class Main{
    public static void main(String[]args){
        Spacecraft s = new Spacecraft();
        s.distance = 10;
        s.FuelEfficiency = 0;
        s.calculateFuel();
    }
    }
class Spacecraft{
        int distance;
        int FuelEfficiency;
        Spacecraft(){
            this.distance = distance;
            this.FuelEfficiency = FuelEfficiency;
        }
        void calculateFuel(){
            try{
                int RequiredFuel = distance/FuelEfficiency;
                System.out.println("Required Fuel : "+ RequiredFuel);
            }
            catch(ArithmeticException e){
                System.out.println("Invalid fuel efficiency.\n");
            }
        }
}

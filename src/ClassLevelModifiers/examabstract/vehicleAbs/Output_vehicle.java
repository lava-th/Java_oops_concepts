package ClassLevelModifiers.examabstract.vehicleAbs;

public class Output_vehicle {
    public static void main (String[] args){
        Bus b1=new Bus();
        System.out.println("Number of bus wheels are"+b1.getNoOfWheels());
        Auto a1=new Auto();
        System.out.println("Number of auto wheels are"+a1.getNoOfWheels());



    }
}

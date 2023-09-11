package udemyOcaOne;

interface Engine {

 public void setEngine();
 public void setPower();

}
 class Vehicle {
  private String fuel = "gasoline";
  public Vehicle() {};
  public String getFuel() {
   return fuel;
  }
  public void setFuel(String fuel) {
   this.fuel = fuel;
  }
  public Vehicle(String fuel) {
   this.fuel = fuel;
  }

 }
class Car extends Vehicle implements Engine{
  int numberOfDoors;
  String color;
  public Car() {};
  public Car(int numberOfDoors) {
   this.numberOfDoors = numberOfDoors;
  }
  public Car(String color) {
   this.color=color;
  }

  public Car(int numberOfDoors, String color) {
   this.numberOfDoors=numberOfDoors;
   this.color=color;
  }
  public void setColor(String color) {
   System.out.println(color);
  }

 public int getNumberOfDoors() {
  return numberOfDoors;
 }

 public void setNumberOfDoors(int numberOfDoors) {
  this.numberOfDoors = numberOfDoors;
 }

 public String getColor() {
   return this.color=color;
  }

  public void setEngine() {
   String engine = "V10";
  }
  public void setPower() {
   String power = "500HP";
  }
}
public class Transportation {

 public static void main(String[] args) {
  int doors =4;
  String color = "black";
  Car car = new Car(doors, color);
  car.setFuel("diesel");
  System.out.println(car.getFuel());
 }

}

public class Car {
    String brandname;
    int cost;
    int speed;
    String colour;
    int milage;
    boolean havingac;
    byte topspeed;
    int engaincapacity;
    int noOfAirbags;
    Car(String brandname, int cost, int speed, String colour, int milage, boolean havingac, byte topspeed, int engaincapacity,int noOfAirbags) {
        this.brandname = brandname;
        this.cost = cost;
        this.speed = speed;
        this.colour = colour;
        this.milage = milage;
        this.havingac = havingac;
        this.topspeed = topspeed;
        this.engaincapacity = engaincapacity;
        this.noOfAirbags=noOfAirbags;
    }

    public static void main(String[] args) {
        Car obj = new Car("maruthi", 525252, 120, "red", 45, false, (byte) 780, 250,6);

        System.out.println("Brand Name: " + obj.brandname);
        System.out.println("Cost: " + obj.cost);
        System.out.println(" Speed: " + obj.topspeed);
        System.out.println("colour: " + obj.topspeed);
        System.out.println("Milage: " + obj.milage);
        System.out.println("Having AC: " + obj.havingac);
        System.out.println("Engine Capacity: " + obj.engaincapacity);
        System.out.println("Top Speed: " + obj.topspeed);
        System.out.println(":noOfAirbags " + obj.milage);
        
        // object car2
        Car obj2 = new Car("sonet", 518185, 140, "green", 45, true, (byte) 890, 200,8);

        System.out.println("Brand Name: " + obj2.brandname);
        System.out.println("Cost: " + obj2.cost);
        System.out.println(" Speed: " + obj2.topspeed);
        System.out.println("colour: " + obj2.topspeed);
        System.out.println("Milage: " + obj2.milage);
        System.out.println("Having AC: " + obj2.havingac);
        System.out.println("Engine Capacity: " + obj2.engaincapacity);
        System.out.println("Top Speed: " + obj2.topspeed);
        System.out.println(":noOfAirbags " + obj2.milage);
          //
        
        Car obj3 = new Car("rolla royce", 565518185, 140, "yellow", 45, false, (byte) 890, 200,8);

        System.out.println("Brand Name: " + obj3.brandname);
        System.out.println("Cost: " + obj3.cost);
        System.out.println(" Speed: " + obj3.topspeed);
        System.out.println("colour: " + obj3.topspeed);
        System.out.println("Milage: " + obj3.milage);
        System.out.println("Having AC: " + obj3.havingac);
        System.out.println("Engine Capacity: " + obj3.engaincapacity);
        System.out.println("Top Speed: " + obj3.topspeed);
        System.out.println(":noOfAirbags " + obj3.milage);
        
        //carobject4
        Car obj4 = new Car("bugatti", 518185, 140, "green", 45, true, (byte) 890, 200,8);

        System.out.println("Brand Name: " + obj4.brandname);
        System.out.println("Cost: " + obj4.cost);
        System.out.println(" Speed: " + obj4.topspeed);
        System.out.println("colour: " + obj4.topspeed);
        System.out.println("Milage: " + obj4.milage);
        System.out.println("Having AC: " + obj4.havingac);
        System.out.println("Engine Capacity: " + obj4.engaincapacity);
        System.out.println("Top Speed: " + obj4.topspeed);
        System.out.println(":noOfAirbags " + obj4.milage);
        
        
     //   carobject5
        Car obj5 = new Car("nano", 518185, 140, "green", 45, true, (byte) 890, 200,4);

        System.out.println("Brand Name: " + obj5.brandname);
        System.out.println("Cost: " + obj5.cost);
        System.out.println(" Speed: " + obj5.topspeed);
        System.out.println("colour: " + obj5.topspeed);
        System.out.println("Milage: " + obj5.milage);
        System.out.println("Having AC: " + obj5.havingac);
        System.out.println("Engine Capacity: " + obj5.engaincapacity);
        System.out.println("Top Speed: " + obj5.topspeed);
        System.out.println(":noOfAirbags " + obj5.milage);
        
        
        
        
        

    }
}
public class interface_hw {
    public static void main(String[] args) {
       Bicycle s1=new Bicycle();
       s1.gearchange();
       Bike s2=new Bike();
       s2.gearchange();
       car s3=new car();
       s3.gearchange();
    }
}

interface Vechical{
     void gearchange();
}

class Bicycle implements Vechical{
     public void gearchange(){
        System.out.println("max gear is 2");

     }
}

class Bike implements Vechical{
   public void gearchange(){
    System.out.println("max gear is 3");
   }
}


class car implements Vechical{
    public void gearchange(){
        System.out.println("max gear is 5");
    }

}

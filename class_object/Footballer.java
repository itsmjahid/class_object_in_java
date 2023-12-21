
package class_object;


public class Footballer {
    public static void main(String[] args) {
        Athlete athlete_1;
        athlete_1 = new Athlete();
      
        athlete_1.name = "Messi";
        athlete_1.age = 36;
        athlete_1.country = "Argentina";
        
        System.out.println("Name    : "+athlete_1.name);
        System.out.println("Age     : "+athlete_1.age);
        System.out.println("Country : "+athlete_1.country);
        
    }
}

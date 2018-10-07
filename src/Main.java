
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        Random random = new Random();
        Queue<String> vaccine_app = new LinkedList<>();
        vaccine_app.offer("First student John");
        vaccine_app.offer("Second student Marry");
        vaccine_app.offer("Third student Petek");
        vaccine_app.offer("Forth student Ali");
        vaccine_app.offer("Fift student Math");
        vaccine_app.offer("Sixth student Ferec");
        vaccine_app.offer("Seventh student Elias");
        vaccine_app.offer("Eightth student Alex");
        vaccine_app.offer("Nineth student Mehmet");
        vaccine_app.offer("Tenth student Defne");
        
        int vaccine_number = 1 + random.nextInt(10);
        System.out.println("Welcome To Student's Vaccine Day. Please stay calm kids..");
        System.out.println("*********************************************************");
        System.out.println("Number of vaccines are : " + vaccine_number);
        Thread.sleep(3000);
        while (vaccine_number != 0 ) {
            System.out.println(vaccine_app.poll() + " is vaccinated.");
            vaccine_number--;
            Thread.sleep(1000);
        }
        System.out.println("All vaccines are finished. Be stay healthy .. :)");
        
        
        
    }
}

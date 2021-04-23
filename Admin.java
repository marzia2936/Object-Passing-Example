package package1;
public class Admin {
  //Here admin will give waiver student
    void waiver_calculation(Student s1){ //Here Student s1 is reference variable;
        if(s1.cgpa>=3.80){
            System.out.println("You will got 20% waiver");
        }
        else
            System.out.println("Sorry!You won't get any Waiver");
    }
}

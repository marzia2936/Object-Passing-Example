package package1;
public class Main {
public static void main(String[] args) {
     Student object1 = new Student(121,3.80);
     Student object11 = new Student(121,3.70);
     Admin object2 = new Admin();
     object2.waiver_calculation(object1);
     object2.waiver_calculation(object11);
    }
    
}

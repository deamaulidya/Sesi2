import java.util.Scanner;
public class LearnScanner {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("hi!");
        System.out.println("what is your name?");
        String name=input.nextLine();
        double height=input.nextDouble();
        System.out.println("Hello " + name +"height"+ height);
    }
}

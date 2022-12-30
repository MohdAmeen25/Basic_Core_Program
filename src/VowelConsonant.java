import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String ch=sc.next();

        switch (ch){
            case "a":
                System.out.println("A is vowel");
                break;
            case "e":
                System.out.println("E is vowel");
                break;
            case "i":
                System.out.println("I is vowel");
                break;
            case "o":
                System.out.println("O is vowel");
                break;
            case "u":
                System.out.println("U is vowel");
                break;
            default:
                System.out.println(ch+ " is consonant");
        }


    }
}

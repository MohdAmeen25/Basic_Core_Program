public class SwapTwoNumber {
    public static void main(String[] args) {
        int a=2;
        int b=6;
        int temp = 0;
//   before swapping
        System.out.println("before swapping a = "+ a);
        System.out.println("before swapping b = "+ b);
//   after swapping
        temp=a;
        a=b;
        b=temp;

        System.out.println("after swapping a = "+a);
        System.out.println("after swapping b = "+b);

    }
}

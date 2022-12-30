public class CoinFlip {
    public static void main(String[] args) {
        double ra=Math.random();
        String coin="";
        System.out.println(ra);
        if(ra < 0.5)
            coin="Head";
        else
            coin="Tail";

        System.out.println(coin);
    }
}

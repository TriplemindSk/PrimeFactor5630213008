//5630213008 SUMITTA KLANGNURAK
import java.util.ArrayList;


import java.util.Scanner;

public class Prime {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> factor = new ArrayList<Integer>();

    public void PrimeNumber(int number) {

        for (int i = 2; i <= number / i; i++) {

            while (number % i == 0) {
                factor.add(i);
                number = number / i;
            }

        }
        if (number > 1) {
            factor.add(number);

        }

    }

    public String getPrime(int num) {
        int number = num;
        String prime = "";
        while (number != 1) {
            for (int k = 0; k < factor.size(); k++) {
                if (number % factor.get(k) == 0) {
                    number = number / factor.get(k);
                    prime = prime + factor.get(k) + "";
                    break;

                }
            }
            if (number > 1) {
                prime = prime + "x";
            }
        }
        return prime;

    }

    public static void main(String[] args) {
        Prime p = new Prime();
        int number = Integer.parseInt(args[0]);      
        p.PrimeNumber(number);
        System.out.println("Prime Factor : " + number );
        System.out.println("  >>  " + p.getPrime(number));

    }
}

package lt.Imones.SaleProcessor;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Armagedonas on 1/10/2017.
 */
public class Pajamos {

    public void Pajamos1() {
        System.out.println("Kiek įrašų darysite?");
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        System.out.println("Įveskite sumą ir spauskite ENTER");
        int[] Pajamos1 = new int[h];
        for (int i = 0; i < Pajamos1.length; i++) {
            Pajamos1[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(Pajamos1));
        int sum = IntStream.of(Pajamos1).sum();
        System.out.println("Pajamų suma " + sum);


        try
        {
            PrintWriter pr = new PrintWriter("F://txt/text.txt");

            for (int i=0; i<Pajamos1.length ; i++)
            {
                pr.println(Pajamos1[i]);
            }
            pr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("No such file exists.");
        }

    }

    public void Pajamos2() {
        System.out.println("Kiek įrašų darysite?");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        System.out.println("Įveskite sumą ir spauskite ENTER");
        int[] Pajamos2 = new int[j];
        for (int i = 0; i < Pajamos2.length; i++) {
            Pajamos2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(Pajamos2));
        int sum = IntStream.of(Pajamos2).sum();
        System.out.println("Pajamų suma " + sum);
    }

    public void Pajamos3() {
        System.out.println("Kiek įrašų darysite?");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println("Įveskite sumą ir spauskite ENTER");
        int[] Pajamos3 = new int[k];
        for (int i = 0; i < Pajamos3.length; i++) {
            Pajamos3[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(Pajamos3));
        int sum = IntStream.of(Pajamos3).sum();
        System.out.println("Pajamų suma " + sum);
    }
    public void Pajamos4() {
        System.out.println("Kiek įrašų darysite?");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        System.out.println("Įveskite sumą ir spauskite ENTER");
        int[] Pajamos4 = new int[l];
        for (int i = 0; i < Pajamos4.length; i++) {
            Pajamos4[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(Pajamos4));
        int sum = IntStream.of(Pajamos4).sum();
        System.out.println("Pajamų suma " + sum);
    }
}

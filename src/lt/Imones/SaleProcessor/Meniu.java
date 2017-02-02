package lt.Imones.SaleProcessor;

import java.util.Scanner;

/**
 * Created by Armagedonas on 1/10/2017.
 */
public class Meniu {

     public void Meniu() {
       System.out.println(
               "Pasirinkite kąąąąąąąąą:\n" +
                       "1.Pajamų įvedimas\n" +
                       "2.Išlaidų įvedimas\n" +
                       "3.Įvestų duomenų ataskaitos\n" +
                       "4.Baigti darbą");
       Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        switch (x) {
            case 1:
                System.out.println(
                        "1 Darbo užmokestis\n" +
                                "2 Individuali veikla\n" +
                                "3 Stipendija\n" +
                                "4 Kitos\n" +
                                "5 Grįžti į pagrindinį meniu");

            int y = scanner.nextInt();
            switch (y){
                case 1:
                    Pajamos pajamos1=new Pajamos();
                    pajamos1.Pajamos1();
                    break;

                case 2:
                    Pajamos pajamos2=new Pajamos();
                    pajamos2.Pajamos2();
                    break;
                case 3:
                    Pajamos pajamos3=new Pajamos();
                    pajamos3.Pajamos3();
                    break;
                case 4:
                    Pajamos pajamos4=new Pajamos();
                    pajamos4.Pajamos4();
                    break;
                case 5:
                    Meniu();
                    break;
            }
                System.out.println("1");
            Meniu();
            case 2:
                System.out.println(
                        "1 Maistas\n" +
                                "2 Mokslas\n" +
                                "3 Būstas\n" +
                                "4 Transportas\n" +
                                "5 Kitos\n" +
                                "6 Grįžti į pagrindinį meniu");
                int z = scanner.nextInt();
                switch (z){
                    case 1:
                        System.out.println("Įveskite maiso išlaidas");
                        break;
                    case 2:
                        System.out.println("Įveskite mokslo išlaidas");
                        break;
                    case 3:
                        System.out.println("Įveskite būsto išlaidas");
                        break;
                    case 4:
                        System.out.println("Įveskite transporto išlaidas");
                        break;
                    case 5:
                        System.out.println("Įveskite kitas išlaidas");
                        break;
                    case 6:
                        Meniu();
                        break;
               }
                System.out.println("");
               Meniu();
            case 3:
                System.out.println("Pildoma");

                break;
            case 4:
                System.exit(4);
                break;

          }
        }
    }




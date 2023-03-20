import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int sportart = hauptmenu();
        int zeit = zeiterfassung(sportart);
        int gewicht = gewichtsErfassung();
        tabelle(sportart, zeit, gewicht);
    }

    public static int hauptmenu() {
        System.out.println("Hauptmenü");
        System.out.println("-------------------------");
        System.out.println("(1) Fahrrad fahren");
        System.out.println("(2) Joggen");
        System.out.println("(3) Walken");
        System.out.println("(4) Programm verlassen");
        int menuEingabe;
        while (true) {
            try {
                menuEingabe = scanner.nextInt();
                if (menuEingabe == 1) {
                    //zeiterfassung(menuEingabe);
                    return menuEingabe;
                } else if (menuEingabe == 2) {
                    //zeiterfassung(menuEingabe);
                    return menuEingabe;
                } else if (menuEingabe == 3) {
                    //zeiterfassung(menuEingabe);
                    return menuEingabe;
                } else if (menuEingabe == 4) {
                    System.out.println("Programm wird beendet!");
                    System.exit(0);

                } else {
                    System.out.println("Falsche Eingabe!");
                    main(null);
                }
                return menuEingabe;

            } catch (InputMismatchException e) {
                System.out.println("Sie haben keine zahl eingegeben! Bitte geben sie die im Menü geforderten Zahlen ein");
                System.out.println("Programm wird neugestartet!");
                main(null);
            }
        }
    }

    public static int zeiterfassung(int menuEingabe) {
        int zeitEingabe;
        String sportart = "";
        while (true) {
            try {
                if (menuEingabe == 1) {
                    sportart = "Fahrrad fahren?";
                } else if (menuEingabe == 2) {
                    sportart = "joggen?";
                } else if (menuEingabe == 3) {
                     sportart = "walken?";
                                    }
                System.out.println("Wielange wollen sie " + sportart);
                System.out.println("(1) 15 Minuten");
                System.out.println("(2) 30 Minuten");
                System.out.println("(3) 45 Minuten");
                System.out.println("(4) 60 Minuten");
                zeitEingabe = scanner.nextInt();
                return zeitEingabe;
            } catch (InputMismatchException e){
                System.out.println("Sie haben keine zahl eingegeben! Bitte geben sie die im Menü geforderten Zahlen ein");
                System.out.println("Programm wird neugestartet!");
                main(null);
            }
        }
    }

    public static int gewichtsErfassung() {
        int gewichtsKlasse = 0;
        System.out.println("Wieviel wiegen Sie?");
        while (true) {
            try{
            int gewicht = scanner.nextInt();
            if (gewicht < 55) {
                System.out.println("Ihr Gewicht liegt außerhalb der Norm!");
                System.out.println("Programm wird neugestartet!");
                main(null);
            }
            else if (gewicht < 65) {
                gewichtsKlasse = 1;
            }
            else if (gewicht < 75) {
                gewichtsKlasse = 2;
            }
            else if (gewicht < 85) {
                gewichtsKlasse = 3;
            }
            else if (gewicht < 95) {
                gewichtsKlasse = 4;
            }
            else if (gewicht < 105) {
                gewichtsKlasse = 5;
            }
            else if (gewicht < 115) {
                gewichtsKlasse = 6;
            }
            else if (gewicht < 125){
                gewichtsKlasse = 7;
            }
            else{
                System.out.println("Ihr Gewicht liegt außerhalb der Norm!");
                System.out.println("Programm wird neugestartet!");
                main(null);
            }

            return gewichtsKlasse;
        } catch (InputMismatchException e) {
                System.out.println("Sie haben keine zahl eingegeben! Bitte geben sie die im Menü geforderten Zahlen ein");
                System.out.println("Programm wird neugestartet!");
                main(null);
            }
        }
    }

    public static void tabelle(int sportart, int zeit, int gewicht){
        int[] joggingArr = {113, 132, 152, 165, 195, 226, 258};
        int[] radfahrenArr = {83, 98, 113, 128, 145, 161, 178};
        int[] walkenArr = {62, 73, 84, 96, 108, 121, 134};

        if(sportart == 1){
            System.out.println("Sie haben " + radfahrenArr[gewicht-1]* zeit + " Kalorien verbraucht!");
            System.out.println("Programm wird neugestartet!");
            main(null);
        }
        if(sportart == 2){
            System.out.println("Sie haben " + joggingArr[gewicht-1] * zeit + " Kalorien verbraucht!");
            System.out.println("Programm wird neugestartet!");
            main(null);
        }
        if(sportart == 3){
            System.out.println("Sie haben " + walkenArr[gewicht-1] * zeit + " Kalorien verbraucht!");
            System.out.println("Programm wird neugestartet!");
            main(null);
        }
    }
}
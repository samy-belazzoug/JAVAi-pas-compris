import java.util.Scanner;
//9. Calculer la somme de deux nombres saisis par l'utilisateur.
public class Exercice_9 {
    public static void main(String[] args) {
        Scanner nombre1 = new Scanner(System.in);
        System.out.println("Saisissez un nombre : ");
        int n1 = nombre1.nextInt();
        Scanner nombre2 = new Scanner(System.in);
        System.out.println("Saississez un deuxième nombre : ");
        int n2 = nombre2.nextInt();

        System.out.println("Resultat : ");
        System.out.println(n1 + n2);
    }
}

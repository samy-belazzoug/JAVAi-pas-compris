import java.util.Scanner;
//3. Écrire un programme qui demande à l'utilisateur son nom et l'affiche.
public class Exercice_3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //Créer un objet Scanner
        System.out.println("Enter username"); // Affiche demande

        String userName = myObj.nextLine(); //Entrée utilisateur (nextline = string à entrer)
        System.out.println("Your name is : " + userName); //Sortie
    }
}

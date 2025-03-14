//8. Échanger deux variables en utilisant une variable temporaire.
public class Exercice_8 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 20;
        int vartemp;
        vartemp = var1;
        var1 = var2;
        var2 = vartemp;
        System.out.println(var1);
        System.out.println(var2);
    }
}

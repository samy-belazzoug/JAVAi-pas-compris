//7. Inverser deux variables sans utiliser de variable temporaire.
public class Exercice_7 {
    public static void main(String[] args) {
        int var1,var2;
        var1 = 10;
        var2 = 20;
        System.out.println(var1);
        System.out.println(var2);
        var2 = var1+var2;
        var1 = var2 - var1;
        var2 = var2 - var1;
        System.out.println(var1);
        System.out.println(var2);
    }
}
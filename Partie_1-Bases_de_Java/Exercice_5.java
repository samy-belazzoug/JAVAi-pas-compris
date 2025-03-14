//5. Convertir un type de données en un autre (int en double, String en int, etc.).
public class Exercice_5 {
    public static void main(String[] args) {
        int nombre = 10;
        double decimal = nombre; //Automatic casting : int to double
        System.out.println(decimal);
        

        float flt = 3.13f;
        int numberpipi = (int) flt; //Manual casting : float to int
        System.out.println(numberpipi);
        
        String strng = "12450541";
        int number2 = Integer.parseInt(strng); // PARSE casting : String to int
        System.out.println(number2);
    }
}
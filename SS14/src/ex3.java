import java.util.HashSet;
import java.util.Set;

public class ex3 {

    public static void main(String[] args) {

        Set<String> medicine = new HashSet<>();
        medicine.add("Aspirin");
        medicine.add("Caffeine");
        medicine.add("Paracetamol");

        Set<String> allergy = new HashSet<>();
        allergy.add("Penicillin");
        allergy.add("Aspirin");


        Set<String> warning = new HashSet<>(medicine);
        warning.retainAll(allergy);
        Set<String> safeIngredients = new HashSet<>(medicine);
        safeIngredients.removeAll(allergy);

        System.out.println("Canh bao di ung: " + warning);
        System.out.println("Thanh phan an toan: " + safeIngredients);

    }
}


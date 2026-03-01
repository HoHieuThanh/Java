import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Map<String, String> medicineMap = new HashMap<>();

        medicineMap.put("T01", "Paracetamol");
        medicineMap.put("T02", "Ibuprofen");
        medicineMap.put("T03", "Amoxicillin");
        medicineMap.put("T04", "Vitamin C");
        medicineMap.put("T05", "Loratadin");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma thuoc: ");
        String drugCode = scanner.nextLine().trim().toUpperCase();

        if (medicineMap.containsKey(drugCode)) {
            System.out.println("Ten thuoc: " + medicineMap.get(drugCode));
        } else {
            System.out.println("Thuoc khong co trong danh muc BHYT");
        }

        scanner.close();
    }
}


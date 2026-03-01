import java.util.LinkedHashSet;
import java.util.Set;

public class ex1 {

    public static void main(String[] args) {

        Set<String> patients = new LinkedHashSet<>();

        patients.add("Nguyen Van A - Yen Bai");
        patients.add("Tran Thi B - Thai Binh");
        patients.add("Nguyen Van A - Yen Bai");
        patients.add("Le Van C - Hung Yen");

        System.out.println("Danh sach goi kham:");

        for(String name : patients){
            System.out.println(name);
        }
    }
}


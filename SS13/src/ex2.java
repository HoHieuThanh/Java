import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ex2 {

    public static List<String> uniqueMedicine(List<String> medicines){
        ArrayList<String> result = new ArrayList<>();
        for (String med: medicines){
            if(!result.contains(med)){
                result.add(med);
            }
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("Paracetamol");
        input.add("Ibuprofen");
        input.add("Panadol");
        input.add("Paracetamol");
        input.add("Aspirin");
        input.add("Ibuprofen");
        System.out.println("Input: " + input);
        List<String> output = uniqueMedicine(input);
        System.out.println("Output: "+ output);
    }
}

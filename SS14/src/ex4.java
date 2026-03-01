import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ex4 {

    public static void main(String[] args) {

        List<String> diseases = new ArrayList<>();

        diseases.add("Cum A");
        diseases.add("Sot xuat huyet");
        diseases.add("Cum A");
        diseases.add("Covid-19");
        diseases.add("Cum A");
        diseases.add("Sot xuat huyet");

        Map<String, Integer> statistic = new TreeMap<>();
        for (String disease : diseases) {
            if (statistic.containsKey(disease)) {
                statistic.put(disease,
                        statistic.get(disease) + 1);
            } else {
                statistic.put(disease, 1);
            }
        }

        System.out.println("Bao cao dich te:");

        for (Map.Entry<String, Integer> entry : statistic.entrySet()) {

            System.out.println(
                    entry.getKey() + ": "
                            + entry.getValue() + " ca"
            );
        }
    }
}

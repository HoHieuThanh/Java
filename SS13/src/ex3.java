import java.util.ArrayList;
import java.util.List;

public class ex3 {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB){
        List<T> result = new ArrayList<>();
        for (T value: listA){
            if(listB.contains(value)){
                if (!result.contains(value)){
                    result.add(value);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> khoaNoi = new ArrayList<>();
        khoaNoi.add(101);
        khoaNoi.add(102);
        khoaNoi.add(105);

        List<Integer> khoaNgoai = new ArrayList<>();
        khoaNgoai.add(102);
        khoaNgoai.add(105);
        khoaNgoai.add(108);

        List<Integer> result1 = findCommonPatients(khoaNoi, khoaNgoai);
        System.out.println("Test case 1 Output: "+result1);

        List<String> bhytA = new ArrayList<>();
        bhytA.add("DN01");
        bhytA.add("DN02");
        bhytA.add("DN03");

        List<String> bhytB = new ArrayList<>();
        bhytB.add("DN02");
        bhytB.add("DN04");

        List<String> result2 = findCommonPatients(bhytA, bhytB);
        System.out.println("Test case 2 Output: " + result2);
    }
}

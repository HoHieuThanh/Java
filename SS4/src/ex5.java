import java.util.regex.*;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        String[] logs = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: TranThiB | Action: RETURN | BookID: BK12345",
                "2024-05-22 | User: LeVanC | Action: BORROW | BookID: BK99999"
        };

        String regex = "(\\d{4}-\\d{2}-\\d{2}) \\| User: (\\w+) \\| Action: (BORROW|RETURN) \\| BookID: (\\w+)";
        Pattern pattern = Pattern.compile(regex);

        int borrowCount = 0;
        int returnCount = 0;

        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);

            if (matcher.find()) {
                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookId = matcher.group(4);

                System.out.println("Ngay: " + date);
                System.out.println("Nguoi dung: " + user);
                System.out.println("Hanh dong: " + action);
                System.out.println("Ma sach: " + bookId);
                System.out.println("----------------------");

                if (action.equals("BORROW")) borrowCount++;
                if (action.equals("RETURN")) returnCount++;
            }
        }

        System.out.println("Thong ke:");
        System.out.println("So lan muon (BORROW): " + borrowCount);
        System.out.println("So lan tra (RETURN): " + returnCount);
    }
}

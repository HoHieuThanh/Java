public class ex3 {
    public static void main(String[] args) {

        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        long currentTime = System.currentTimeMillis();

        long startSB = System.currentTimeMillis();

        StringBuilder report = new StringBuilder();
        report.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        report.append("Thoi gian tao: ").append(currentTime).append("\n");

        for (String t : transactions) {
            report.append("Giao dich: ").append(t).append("\n");
        }

        long endSB = System.currentTimeMillis();

        long startStr = System.currentTimeMillis();

        String report2 = "--- BÁO CÁO MƯỢN SÁCH ---\n";
        report2 += "Thoi gian tao: " + currentTime + "\n";

        for (String t : transactions) {
            report2 += "Giao dich: " + t + "\n";
        }

        long endStr = System.currentTimeMillis();

        System.out.println(report);
        System.out.println("So thoi gian thuc thi doi voi StringBuilder: " + (endSB - startSB));
        System.out.println("So thoi gian thuc thi doi voi String: " + (endStr - startStr));
    }
}

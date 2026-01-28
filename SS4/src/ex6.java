import java.util.regex.*;

public class ex6 {
    public static void main(String[] args) {

        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";

        String[] blacklist = {"tệ", "ngu ngốc"};

        for (String badWord : blacklist) {
            String regex = "(?i)\\b" + Pattern.quote(badWord) + "\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(review);

            while (matcher.find()) {
                String found = matcher.group();
                String stars = "*".repeat(found.length());
                review = review.replaceAll("(?i)" + Pattern.quote(found), stars);
            }
        }

        if (review.length() > 200) {
            int cutIndex = review.lastIndexOf(" ", 200);
            if (cutIndex == -1) {
                cutIndex = 200;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(review.substring(0, cutIndex));
            sb.append("...");
            review = sb.toString();
        }

        System.out.println("Review sau khi xử lý: " + review);
    }
}

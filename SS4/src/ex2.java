public class ex2 {
    public static void main(String[] args) {

        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";
        if (description.contains("Kệ:")) {

            // Vị trí bắt đầu của "Kệ:"
            int start = description.indexOf("Kệ:") + "Kệ:".length();

            // Tìm dấu phẩy tiếp theo sau "Kệ:"
            int end = description.indexOf(",", start);

            // Nếu không có dấu phẩy thì lấy đến hết chuỗi
            if (end == -1) {
                end = description.length();
            }

            // Trích xuất mã vị trí
            String location = description.substring(start, end).trim();

            // Thay thế "Kệ:" bằng "Vị trí lưu trữ:"
            String newDescription = description.replace("Kệ:", "Vị trí lưu trữ:");
            System.out.println("Vị trí tìm thấy: " + location);
            System.out.println("Mô tả mới: " + newDescription + ".");
        } else {
            System.out.println("Không tìm thấy thông tin kệ sách trong mô tả.");
        }
    }
}

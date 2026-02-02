package ex5;

public class Main {
    public static void main(String[] args) {

        double score = 8.5;

        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Diem hop le: " + score);
        } else {
            System.out.println("Diem khong hop le!");
        }
    }
}

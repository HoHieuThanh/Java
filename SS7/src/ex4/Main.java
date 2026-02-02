package ex4;

public class Main {
    public static void main(String[] args) {

        ClassRoom sv1 = new ClassRoom("An");
        ClassRoom sv2 = new ClassRoom("Binh");
        ClassRoom sv3 = new ClassRoom("Cuong");

        sv1.contribute(100000);
        ClassRoom.showClassFund();

        sv2.contribute(50000);
        ClassRoom.showClassFund();

        sv3.contribute(150000);
        ClassRoom.showClassFund();
    }
}


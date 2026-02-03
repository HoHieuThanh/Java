package HN_KS24_CNTT2_HoHieuThanh;

public class Student {
    private String id;
    private String name;
    private double score;

    public Student() {
        id = "";
        name = "";
        score = 0;
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRank(double score){
        if (score >= 8.0){
            return "Gioi";
        }else if (score < 6.5){
            return "Trung binh";
        }else return "Kha";
    }

    public String toStrings(){
        return id + " - "  + name + " - Điểm: " + score + " - Hoc lực: " + getRank(score) ;
    }
}

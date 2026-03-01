package ex6;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Patient> patients =
                new ArrayList<>();

        patients.add(
                new Patient("Lan",30,"Tim mach"));

        patients.add(
                new Patient("Hung",40,"Noi tiet"));

        patients.add(
                new Patient("Mai",25,"Tim mach"));

        // Map gom nhom
        Map<String,List<Patient>> map =
                new HashMap<>();



        for (Patient p : patients) {

            String dept =
                    p.getDepartment();

            // Neu chua co khoa
            if (!map.containsKey(dept)) {

                map.put(dept,
                        new ArrayList<>());
            }

            // add vao list cua khoa
            map.get(dept).add(p);
        }



        System.out.println(
                "Danh sach theo khoa:");

        for (String dept : map.keySet()) {

            System.out.println(
                    "Khoa " + dept + ":");

            for (Patient p :
                    map.get(dept)) {

                p.display();
            }
        }



        String maxDept = "";
        int max = 0;

        for (String dept :
                map.keySet()) {

            int size =
                    map.get(dept).size();

            if (size > max) {

                max = size;
                maxDept = dept;
            }
        }

        System.out.println(
                "Khoa " + maxDept +
                        " dang dong nhat (" +
                        max + " benh nhan)");
    }
}


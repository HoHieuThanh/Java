package ex4;

import java.util.LinkedList;

public class EmergencyRoom {

    private LinkedList<String> waitingList = new LinkedList<>();
    public void patientCheckIn(String name){
        waitingList.addLast(name);
        System.out.println(name + " da check-in (benh nhan thuong)");
    }
    public void emergencyCheckIn(String name){
        waitingList.addFirst(name);
        System.out.println(name + " la ca cap cuu!");
    }
    public void treatPatient(){
        if (waitingList.isEmpty()){
            System.out.println("Khong con benh nhan.");
            return;
        }
        String patient = waitingList.removeFirst();
        if (patient.equals("C")){
            System.out.println("Dang cap cuu: " + patient);
        }else{
            System.out.println("Dang kham: " + patient);
        }
    }
}
package day25;

public class MedantaHospital extends ArtemisHospital {
    public void medicalRnDServices() {
        System.out.println("medicalRnDServices from Medanta ");
    }

    public static void medicalNewsServices() {
        System.out.println("medicalNewsServices from Medanta ");
    }

    @Override
    public void ambulanCeServices() {
        System.out.println("ambulanCeServices from Artemis implemented by Medanta");
    }
}

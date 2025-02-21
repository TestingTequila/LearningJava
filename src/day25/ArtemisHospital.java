package day25;

public abstract class ArtemisHospital {

    int age;
    public ArtemisHospital()
    {

    }
    public abstract void ambulanCeServices();

    public void onlineConsultancyServices() {
        System.out.println("onlineConsultancyServices from ArtemisHospital");
    }
}

package day24;

public class FortisHospital extends Hospital implements USMedicalAssociation, UKMedicalAssociation, IndianMedicalAssociation
{

    //USMA
    @Override
    public void cardioServices() {
        System.out.println("FH----cardioServices");
    }

    //USMA
    @Override
    public void neuroServices() {
        System.out.println("FH----neuroServices");
    }

    //USMA
    @Override
    public void physioServices() {
        System.out.println("FH----physioServices");
    }

    //USMA/UKMA/IMA ==> Common method
    @Override
    public void emergencyServices() {
        System.out.println("FH----emergencyServices");
    }


    //UKMA
    @Override
    public void entServices() {
        System.out.println("FH----entServices");
    }

    //UKMA
    @Override
    public void dentalServices() {
        System.out.println("FH----dentalServices");
    }

    //IMA
    @Override
    public void oncologyServices() {
        System.out.println("FH----oncologyServices");
    }

    //IMA
    @Override
    public void gynicServices() {
        System.out.println("FH----gynicServices");
    }

    //IMA
    @Override
    public void orthoServices() {
        System.out.println("FH----orthoServices");
    }

    //Fortis
    public void medicalTrainingServices()
    {
        System.out.println("FH----medicalTrainingServices");
    }

    //Fortis
    public void medicalInsuranceServices()
    {
        System.out.println("FH----medicalInsuranceServices");
    }

    @Override
    public void covidVaccinationServices() {
        System.out.println("FH----covidVaccinationServices");
    }

    @Override
    public void childCareServices() {
        System.out.println("FH----childCareServices");
    }
}

package day25;

public class FortisHospital extends MedantaHospital implements USMedicalAssociation, UKMedicalAssociation, IndianMedicalAssociation {

    @Override
    public void cardioServices() {
        System.out.println("Fortis Hospital -----cardioServices from USMA");
    }

    @Override
    public void neuroServices() {
        System.out.println("Fortis Hospital -----neuroServices from USMA ");
    }

    @Override
    public void physioServices() {
        System.out.println("Fortis Hospital -----physioServices from USMA ");
    }

    @Override
    public void emergencyServices() {
        System.out.println("Fortis Hospital -----emergencyServices from USMA,UKMA & IMA ");
    }

    public void medicalTraining() {
        System.out.println("Fortis Hospital -----medicalTraining");
    }

    public void medicalInsurance() {
        System.out.println("Fortis Hospital -----medicalInsurance");
    }

    @Override
    public void entServices() {
        System.out.println("Fortis Hospital -----entServices from UKMA ");
    }

    @Override
    public void dentalServices() {
        System.out.println("Fortis Hospital -----dentalServices from UKMA ");
    }

    @Override
    public void oncologyServices() {
        System.out.println("Fortis Hospital -----oncologyServices from IMA ");
    }

    @Override
    public void gynicServices() {
        System.out.println("Fortis Hospital -----gynicServices from IMA ");
    }

    @Override
    public void orthoServices() {
        System.out.println("Fortis Hospital -----orthoServices from IMA ");
    }

    @Override
    public void covidVaccinationServices() {
        System.out.println("covidVaccinationServices from WHO");
    }

    @Override
    public void medicalRnDServices() {
        System.out.println("medicalRnDServices from Fortis ");
    }

    public static void medicalNewsServices() {
        System.out.println("medicalNewsServices from Fortis ");
    }

    @Override
    public void viralInfectionVaccinationServices() {
        System.out.println("viralInfectionVaccinationServices from UHO");
    }
}

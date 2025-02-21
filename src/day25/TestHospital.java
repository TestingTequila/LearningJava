package day25;

public class TestHospital {
    public static void main(String[] args) {

        System.out.println("================WITHOUT TOP CASTING=================");
        FortisHospital fh = new FortisHospital();
        fh.cardioServices();//inherited USMA
        fh.neuroServices(); //inherited USMA
        fh.physioServices();//inherited USMA
        fh.medicalTraining(); //Self
        fh.medicalInsurance(); //Self
        fh.entServices();//UKMA
        fh.dentalServices();//UKMA
        fh.oncologyServices();//IMA
        fh.gynicServices();//IMA
        fh.orthoServices();//IMA
        fh.emergencyServices();//Common
        fh.medicalRnDServices();
        fh.medicalNewsServices();
        fh.onlineConsultancyServices();
        fh.ambulanCeServices();
        fh.viralInfectionVaccinationServices();

        //USMedicalAssociation usMedicalAssociation = new USMedicalAssociation(); --Interface object can't be created
        //UKMedicalAssociation usMedicalAssociation = new UKMedicalAssociation(); --Interface object can't be created
        //IndianMedicalAssociation usMedicalAssociation = new IndianMedicalAssociation(); --Interface object can't be created

        System.out.println("=============TOP CASTING 1================");

        USMedicalAssociation usMedicalAssociation = new FortisHospital();
        usMedicalAssociation.cardioServices();
        usMedicalAssociation.physioServices();
        usMedicalAssociation.neuroServices();
        usMedicalAssociation.emergencyServices();

        System.out.println("=============TOP CASTING 2================");
        UKMedicalAssociation ukMedicalAssociation = new FortisHospital();
        ukMedicalAssociation.entServices();
        ukMedicalAssociation.dentalServices();
        ukMedicalAssociation.emergencyServices();

        System.out.println("=============TOP CASTING 3================");

        IndianMedicalAssociation indianMedicalAssociation = new FortisHospital();
        indianMedicalAssociation.oncologyServices();
        indianMedicalAssociation.gynicServices();
        indianMedicalAssociation.orthoServices();
        indianMedicalAssociation.emergencyServices();

        System.out.println("=============TOP CASTING 4================");

        MedantaHospital medantaHospital = new FortisHospital();
        FortisHospital.medicalNewsServices();
        medantaHospital.onlineConsultancyServices();
        medantaHospital.medicalRnDServices(); //Fortis Hospital
        medantaHospital.ambulanCeServices();

        System.out.println("=============TOP CASTING 5================");
        UHO uho=new FortisHospital();
        uho.viralInfectionVaccinationServices();

    }
}

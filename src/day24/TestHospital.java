package day24;

public class TestHospital
{
    public static void main(String[] args) {
        FortisHospital fh = new FortisHospital();
        fh.cardioServices();
        fh.neuroServices();
        fh.physioServices();
        fh.entServices();
        fh.dentalServices();
        fh.oncologyServices();
        fh.gynicServices();
        fh.orthoServices();
        fh.medicalTrainingServices();
        fh.medicalInsuranceServices();
        fh.emergencyServices();
        fh.medicalRD();
        fh.medicalNews();
        fh.covidVaccinationServices();
        fh.childCareServices();

        System.out.println("==============TOP CASTING WITH USMA==================");

        USMedicalAssociation usma =new FortisHospital();
        usma.cardioServices();
        usma.emergencyServices();
        usma.neuroServices();
        usma.physioServices();
        usma.covidVaccinationServices();
        usma.childCareServices();


        System.out.println("==============TOP CASTING WITH UKMA==================");
        UKMedicalAssociation ukma = new FortisHospital();
        ukma.entServices();
        ukma.dentalServices();
        ukma.emergencyServices();
        ukma.covidVaccinationServices();
        ukma.childCareServices();


        System.out.println("==============TOP CASTING WITH IMA==================");
        IndianMedicalAssociation ima = new FortisHospital();
        ima.oncologyServices();
        ima.gynicServices();
        ima.orthoServices();
        ima.emergencyServices();
        ima.covidVaccinationServices();

        System.out.println("==============TOP CASTING WITH WHO==================");

        WHO who=new FortisHospital();
        who.covidVaccinationServices();

        System.out.println("==============TOP CASTING WITH UHO==================");

        UHO uho=new FortisHospital();
        uho.childCareServices();

        //  WebDriver driver= new ChromeDriver();



    }
}

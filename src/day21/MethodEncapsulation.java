package day21;

public class MethodEncapsulation {
    public void launchBrowser() {
        checkRAMemory();
        checkOSCompatibility();
        organisingLaunchTime();
        System.out.println("Launch Browser.....");
    }

    private void checkRAMemory() {
        System.out.println("Checking RAM memory.....");
    }

    private void checkOSCompatibility() {
        System.out.println("Checking checkOSCompatibility.....");
    }

    private void organisingLaunchTime() {
        System.out.println("Checking organisingLaunchTime.....");
    }
}

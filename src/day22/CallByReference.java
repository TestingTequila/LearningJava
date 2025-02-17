
package day22;

public class CallByReference {
    String name;
    int age;
    char gender;

    public void m1(CallByReference obj) {
        this.name = "Jason";
//        this.age = 44;
        this.gender = 'm';
    }

}

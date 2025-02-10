package day18;

import java.util.Arrays;

public class ExecutingDevices
{
    public static void main(String[] args) {
        DeviceName dn = new DeviceName();
        String[] empDevice = dn.deviceWithEmployee("Dhruv");
        System.out.println(Arrays.toString(empDevice));
    }
}

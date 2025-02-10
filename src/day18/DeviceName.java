package day18;

public class DeviceName
{
    public String[] deviceWithEmployee(String empName)
    {
        String[] devices=null;
        if(empName.equals("Jason"))
        {
            String[] device = {"Laptop", "iphone"};
            devices= device;
        }
        else if (empName.equals("Rohan"))
        {
            String[] device = {"Laptop", "iphone", "ipad"};
            devices= device;
        }
        else if (empName.equals("Tony"))
        {
            String[] device = {"iphone", "ipad"};
            devices= device;
        }
        else if (empName.equals("Dhruv"))
        {
            String[] device = {"iphone", "ipad", "macbookPro"};
            devices= device;
        }
        return devices;
    }
}

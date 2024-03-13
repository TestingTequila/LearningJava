package day16;

public class Employee {
    public String[] getEmployeeDevices(String empName) {
        String[] device = null;
        if (empName.equals("Jason")) {
            return new String[]{"macbook pro", "ipad", "iphone13"};

        } else if (empName.equals("Kerrie")) {
            return new String[]{"macbook pro", "ipad"};

        } else if (empName.equals("Lee")) {
            return device = new String[]{"macbook pro", "ipad", "samsung11", "Vodafone SIM"};
        }
        return device;
    }
}


// "macbook pro", "ipad", "iphone13"
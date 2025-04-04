//Task14

public class IPAddressValidator {

    public static boolean isValidIPAddress(String ipAddress) {
        if (ipAddress == null) {
            return false;
        }

        String[] parts = ipAddress.split("\\.");
        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) {
                    return false;
                }
                if (part.startsWith("0") && part.length() > 1) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }

        if (parts[0].startsWith("0") || parts[0].length() == 1) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidIPAddress("192.168.0.1") ? "Valid IP" : "Invalid IP");
        System.out.println(isValidIPAddress("172.16.56") ? "Valid IP" : "Invalid IP");
        System.out.println(isValidIPAddress("0.0.0.1") ? "Valid IP" : "Invalid IP");
        System.out.println(isValidIPAddress("1.12.72.2") ? "Valid IP" : "Invalid IP");
    }
}
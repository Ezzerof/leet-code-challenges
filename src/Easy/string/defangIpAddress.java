package Easy.string;

public class defangIpAddress {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if  (c == '.')
                sb.append("[.]");
            else {
                sb.append(String.valueOf(c));
            }
        }
        return sb.toString();
    }

//    public String defangIPaddr(String address) {
//        return address.replace(".", "[.]");
//    }
}

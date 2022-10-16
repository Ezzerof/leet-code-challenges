package Easy.arrays;

public class DefangingAnIPAddress {

//    public static String defangIPaddr(String address) {
//        String a = "";
//        for (int i = 0; i < address.length(); i++) {
//            char k = address.charAt(i);
//            if (k == '.') {
//                a += "[.]";
//            } else {
//                a += k + "";
//            }
//        }
//
//        return a;
//    }

    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

}

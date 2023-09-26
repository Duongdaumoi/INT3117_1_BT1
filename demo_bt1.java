public class demo_bt1 {
    String a, b, c;
    public static void main(String[] args) {

    }

    public static String check_per(String a, String b, String c) {
        if (a.equals("Y")) {
            // Co the VIP.
            if (b.equals("Y")) {
                // Di cung tre em duoi 16 tuoi.
                // Co the thanh vien.
                return "50%";
            } else if (b.equals("N")){
                // Khong di cung tre em duoi 16 tuoi.
                // Co the thanh vien hoac khong co the thanh vien.
                return "35%";
            }
        } else if (a.equals("N")) {
            // Khong co the VIP.
            if (b.equals("Y")) {
                // Di cung tre em duoi 16 tuoi.
                if (c.equals("Y")) {
                    // Co the thanh vien.
                    return "40%";
                } else if (c.equals("N")){
                    // Khong co the thanh vien.
                    return "10%";
                }
            } else if (b.equals("N")){
                // Khong di cung tre em duoi 16 tuoi.
                if (c.equals("Y")){
                    // Co the thanh vien.
                    return "25%";
                } else if (c.equals("N")){
                    // Khong co the thanh vien.
                    return "10%";
                }
            }
        }

        return "";
    }
}
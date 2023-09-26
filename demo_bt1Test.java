import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class demo_bt1Test {

    @Test
    void check_per1() {
        assertEquals("50%", check_per("Y", "Y", "Y"));
    }
    @Test
    void check_per2() {
        assertEquals("50%", check_per("Y", "Y", "N"));
    }
    @Test
    void check_per3() {
        assertEquals("35%", check_per("Y", "N", "Y"));
    }
    @Test
    void check_per4() {
        assertEquals("40%", check_per("N", "Y", "Y"));
    }
    @Test
    void check_per5() {
        assertEquals("35%", check_per("Y", "N", "N"));
    }
    @Test
    void check_per6() {
        assertEquals("10%", check_per("N", "Y", "N"));
    }
    @Test
    void check_per7() {
        assertEquals("25%", check_per("N", "N", "Y"));
    }
    @Test
    void check_per8() {
        assertEquals("10%", check_per("N", "N", "N"));
    }


    private String check_per(String a, String b, String c) {
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
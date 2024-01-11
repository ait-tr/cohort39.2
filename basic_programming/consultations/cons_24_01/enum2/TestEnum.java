package enum2;

public class TestEnum {
    public static void main(String[] args) {
        String stringColor = "RDE";


        Color color = Color.RED;
        System.out.println(color);

        ColorExt colorExt = new ColorExt();
        System.out.println(colorExt.getColorRed());

        System.out.println(colorExt.getColorGreen());
    }
}

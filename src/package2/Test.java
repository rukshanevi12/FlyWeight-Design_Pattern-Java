/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package2;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Color color1 = Color.createColorInstance(255, 0, 0);
        Color color2 = Color.createColorInstance(255, 0, 0);

        System.out.println(color1 == color2); // Should print true since they are the same object
    }
}

class Color {
    private static final HashMap<String, Color> POOL = new HashMap<>();

    private int red;
    private int green;
    private int blue;

    private Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public static Color createColorInstance(int red, int green, int blue) {
        String key = red + "-" + green + "-" + blue;
        Color instance = POOL.get(key);

        if (instance == null) {
            instance = new Color(red, green, blue);
            POOL.put(key, instance);
        }

        return instance;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void setColor(int red, int green, int blue) {
        Color.createColorInstance(red, green, blue);
    }
}

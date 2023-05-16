package Easy;

public class ConvertTheTemperature {

    public static double[] convertTemperature (double celsius) {
        double kelvin = 273.15 + celsius;
        double fahrenheit = (celsius * 1.80) + 32.00;
        System.out.println(kelvin);
        System.out.println(fahrenheit);

        return new double[] {kelvin, fahrenheit};
    }

    public static void main(String[] args) {
        System.out.println(convertTemperature(36.50));
    }


}

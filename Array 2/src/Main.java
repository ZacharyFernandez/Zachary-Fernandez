public class Main { // Main class na magsisilbing lalagyan ng ating Java program.

    public static void main(String[] args) { // Main method kung saan magsisimula ang program.

        // Nag declare at gumagawa ng isang 1D double array na pinangalanang temperatures na kayang maglaman ng eksaktong limang values.
        double[] temperatures = new double[5];

        // Naglalagay ng pangunang araw na temperatura sa index 0.
        temperatures[0] = 32.5;

        // Naglalagay ng pangalawang araw na temperatura sa index 1.
        temperatures[1] = 34.0;

        // Naglalagay ng pangatlong araw na temperatura sa index 2.
        temperatures[2] = 31.8;

        // Naglalagay ng pang apat na araw na temperatura sa index 3.
        temperatures[3] = 33.2;

        // Naglalagay ng pang lima araw na temperatura sa index 4.
        temperatures[4] = 35.1;

        // Gumagamit ng for loop upang maulit ang pagpapakita ng bawat temperatura sa array.
        // Nagsisimula ang variable na i sa 0 at magpapatuloy habang mas maliit ito sa haba ng array.
        for (int i = 0; i < temperatures.length; i++) {

            // Ipinapakita ang araw at katumbas nitong temperatura gamit ang kasalukuyang index.
            System.out.println("Day " + (i + 1) + ": " + temperatures[i] + "°C");

        } // Pagsasara ng for loop pagkatapos maipakita ang lahat ng temperatura.

        // Ina-update ang temperatura sa ikatlong araw mula 31.8 tungo sa 32.0 gamit ang index 2.
        temperatures[2] = 32.0;

        // Ipinapakita ang bagong temperatura sa ikatlong araw pagkatapos itong ma-update.
        System.out.println("Updated temperature for the third day: " + temperatures[2] + "°C");

    } // Pagsasara ng main method

} // Pagsasara ng Main class.
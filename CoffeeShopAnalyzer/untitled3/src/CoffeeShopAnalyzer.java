// Gumagawa ng class na may pangalang CoffeeShopAnalyzer (dapat kapareho ng filename).
public class CoffeeShopAnalyzer {
    // Nagsisimula rito ang program kapag ni-run mo ito.
    public static void main(String[] args) {

        // Array ng benta mula Lunes (index 0) hanggang Linggo (index 6).
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};
        // Array ng mga araw upang maitugma sa benta sa parehong posisyon (index).
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Nagpi-print ng pamagat para sa pang-araw-araw na benta.
        System.out.println("--- Daily Sales ---");
        // Uulitin ang loop nang 7 beses (mula i = 0 hanggang 6).
        for (int i = 0; i < weeklySales.length; i++) {
            // Ipi-print ang araw at ang benta nito sa posisyong i.
            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);
        }

        // Gagamitin natin ito upang ipunin ang lahat ng benta.
        int totalSales = 0;
        // Kukunin isa-isa ang bawat benta sa weeklySales.
        for (int i = 0; i < weeklySales.length; i++) {
            // Idadagdag ang benta ngayong araw sa totalSales.
            totalSales = totalSales + weeklySales[i];
        }

        // Hahatiin ang totalSales sa 7 (haba ng array); ginamit ang double para may decimal.
        double averageSales = (double) totalSales / weeklySales.length;

        // Ipi-print ang kabuuan at average na benta.
        System.out.println("\n--- Weekly Summary ---");
        // Ipi-print ang totalSales.
        System.out.println("Total Sales: " + totalSales + " cups");
        // Ipi-print ang averageSales.
        System.out.println("Average Daily Sales: " + averageSales + " cups");

        // Ipagpalagay muna na ang unang araw (index 0) ang pinakamataas at pinakamababa.
        int maxSales = weeklySales[0];
        // Itatabi ang pinakamababang benta na nagsisimula sa index 0.
        int minSales = weeklySales[0];
        // Itatabi ang pangalan ng araw na may pinakamataas na benta.
        String bestDay = daysOfWeek[0];
        // Itatabi ang pangalan ng araw na may pinakamababang benta.
        String worstDay = daysOfWeek[0];

        // Titingnan ang natitirang araw mula index 1 hanggang sa huli.
        for (int i = 1; i < weeklySales.length; i++) {
            // Kung mas malaki ang benta ngayon kaysa sa maxSales:
            if (weeklySales[i] > maxSales) {
                // Papalitan ang maxSales ng bagong mas malaking benta.
                maxSales = weeklySales[i];
                // Papalitan din ang bestDay ng kasalukuyang araw.
                bestDay = daysOfWeek[i];
            }
            // Kung mas maliit ang benta ngayon kaysa sa minSales:
            if (weeklySales[i] < minSales) {
                // Papalitan ang minSales ng bagong mas maliit na benta.
                minSales = weeklySales[i];
                // Papalitan din ang worstDay ng kasalukuyang araw.
                worstDay = daysOfWeek[i];
            }
        }

        // Ipi-print ang pinakamataas at pinakamababang benta.
        System.out.println("\n--- Bests and Worsts ---");
        // Ipi-print ang bestDay at maxSales.
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");
        // Ipi-print ang worstDay at minSales.
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");
    }
}
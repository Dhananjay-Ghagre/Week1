class EarthVolumeCalculator {

    public static void main(String[] args) {

        // Earth's radius in kilometers
        double radiusKm = 6378;

        // 1 kilometer equals 0.621371 miles
        double kmToMiles = 0.621371;

        // Calculate the volume of the Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        // Print the results in a single statement
        System.out.println(
                "The volume of Earth in cubic kilometers is " + volumeKm3 +
                        " and in cubic miles is " + volumeMiles3
        );
    }
}

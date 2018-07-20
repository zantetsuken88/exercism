class SpaceAge {

    private static final double EARTH_SECONDS = 31557600;
    private static final double MERCURY_ORBIT = 0.2408467;
    private static final double VENUS_ORBIT = 0.61519726;
    private static final double MARS_ORBIT = 1.8808158;
    private static final double JUPITER_ORBIT = 11.862615;
    private static final double SATURN_ORBIT = 29.447498;
    private static final double URANUS_ORBIT = 84.016846;
    private static final double NEPTUNE_ORBIT = 164.79132;


    private double seconds;

    SpaceAge(double seconds) {

        this.seconds = seconds;
    }

    private double getSeconds(double orbit) {
        return this.seconds / (EARTH_SECONDS * orbit);
    }

    double onEarth() {
        return getSeconds(1);
    }

    double onMercury() {

        return getSeconds(MERCURY_ORBIT);
    }

    double onVenus() {
        return getSeconds(VENUS_ORBIT);
    }

    double onMars() {
        return getSeconds(MARS_ORBIT);
    }

    double onJupiter() {
        return getSeconds(JUPITER_ORBIT);
    }

    double onSaturn() {
        return getSeconds(SATURN_ORBIT);
    }

    double onUranus() {
        return getSeconds(URANUS_ORBIT);
    }

    double onNeptune() {
        return getSeconds(NEPTUNE_ORBIT);
    }

}

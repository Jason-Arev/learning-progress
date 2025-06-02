@SuppressWarnings("unused")
class SpaceAge {
    private final double ageInSeconds;
    private static final double EARTH_YEAR_SECONDS = 31557600.0;

    private static final double MERCURY_ORBITAL_PERIOD = 0.2408467;
    private static final double VENUS_ORBITAL_PERIOD = 0.61519726;
    private static final double EARTH_ORBITAL_PERIOD = 1.0;
    private static final double MARS_ORBITAL_PERIOD = 1.8808158;
    private static final double JUPITER_ORBITAL_PERIOD = 11.862615;
    private static final double SATURN_ORBITAL_PERIOD = 29.447498;
    private static final double URANUS_ORBITAL_PERIOD = 84.016846;
    private static final double NEPTUNE_ORBITAL_PERIOD = 164.79132;

    SpaceAge(double seconds) {
        this.ageInSeconds = seconds;
    }

    double getSeconds() {
        return ageInSeconds;
    }

    double onEarth() {
        return ageInSeconds / (EARTH_YEAR_SECONDS * EARTH_ORBITAL_PERIOD);
    }

    double onMercury() {
        return ageInSeconds / (EARTH_YEAR_SECONDS * MERCURY_ORBITAL_PERIOD);
    }

    double onVenus() {
        return ageInSeconds / (EARTH_YEAR_SECONDS * VENUS_ORBITAL_PERIOD);
    }

    double onMars() {
        return ageInSeconds / (EARTH_YEAR_SECONDS * MARS_ORBITAL_PERIOD);
    }

    double onJupiter() {
        return ageInSeconds / (EARTH_YEAR_SECONDS * JUPITER_ORBITAL_PERIOD);
    }

    double onSaturn() {
        return ageInSeconds / (EARTH_YEAR_SECONDS * SATURN_ORBITAL_PERIOD);
    }

    double onUranus() {
        return ageInSeconds / (EARTH_YEAR_SECONDS * URANUS_ORBITAL_PERIOD);
    }

    double onNeptune() {
        return ageInSeconds / (EARTH_YEAR_SECONDS * NEPTUNE_ORBITAL_PERIOD);
    }
}
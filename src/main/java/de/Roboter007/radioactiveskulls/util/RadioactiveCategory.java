package de.Roboter007.radioactiveskulls.util;

public enum RadioactiveCategory {
    NONEXPERIMENTAL(true),
    EXPERIMENTAL(false);

    private final boolean enabled;

    RadioactiveCategory(boolean enabled) {
        this.enabled = enabled;
    }


    public boolean isEnabled() {
        return enabled;
    }
}

package com.containers.closets.domain;

public enum CustomSpaceSource {

    // Design Center Online
    ONLINE_DOOR_WALL_RACK_TOOL("DC_DOOR"),
    ONLINE_CLOSET_TOOL("DC_CLOSET"),
    DESIGN_CENTER_TOOL("DC_TOOL"),
    DESIGN_CENTER_LUXURY("DC_LUX"),

    // External vendor design tool
    THIRD_PARTY_TOOL("VENDOR"),

    // Legacy Sources
    LEGACY_MOBILE("MOBILE"),
    ORIGINAL_TOOL("DESIGN_TOOL");

    private static final Set<CustomSpaceSource> EMPLOYEE_DESIGNED_SOURCES
            = EnumSet.of(DESIGN_CENTER_TOOL,
                         DESIGN_CENTER_LUXURY,
                         THIRD_PARTY_TOOL,
                         ORIGINAL_TOOL);

    private static final Set<CustomSpaceSource> CUSTOMER_DESIGNED_SOURCES
            = EnumSet.of(ONLINE_DOOR_WALL_RACK_TOOL,
                         ONLINE_CLOSET_TOOL,
                         LEGACY_MOBILE);


    private final String source;

    CustomSpaceSource(String source) {
        this.source = source;
    }

    // what does this do?
    public static boolean methodName(String source) {
        return EMPLOYEE_DESIGNED_SOURCES
                .stream()
                .map(CustomSpaceSource::getSource)
                .anyMatch(s -> s.equals(source));
    }
}
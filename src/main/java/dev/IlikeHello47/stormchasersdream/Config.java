package dev.IlikeHello47.stormchasersdream;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue DESTROY_BLOCKS;
    public static final ModConfigSpec.BooleanValue ALLOW_MULTIPLE_DISASTERS;
    public static final ModConfigSpec.DoubleValue MAX_STORM_STRENGTH;
    public static final ModConfigSpec.IntValue MAX_TORNADO_STRENGTH;
    public static final ModConfigSpec.IntValue MAX_HURRICANE_STRENGTH;
    public static final ModConfigSpec.IntValue MAX_DISASTERS;

    public static final ModConfigSpec.EnumValue<MaxTyphoonStrength> MAX_TYPHOON_STRENGTH;
    public static final ModConfigSpec.EnumValue<UnitSystem> UNIT_SYSTEM;

    static {
        BUILDER.comment("Server-side gameplay settings").push("server");

        DESTROY_BLOCKS = BUILDER
                .comment("Should tornadoes and heavy storms destroy blocks in the world?")
                .define("destroyBlocks", true);

        ALLOW_MULTIPLE_DISASTERS = BUILDER
                .comment("Are Multiple Disasters of the same Type allowed?")
                .define("allowMultipleDisasters", true);

        MAX_DISASTERS = BUILDER
                .comment("How many Disasters of the same type are allowed? (Overrode by ALLOW_MULTIPLE_DISASTERS)")
                .defineInRange("maxDisasters", 20, 1, Integer.MAX_VALUE );

        MAX_STORM_STRENGTH = BUILDER
                .comment("Multiplier for maximum wind strength.")
                .defineInRange("maxStormStrength", 1.0, 0.1, Double.MAX_VALUE);

        MAX_TORNADO_STRENGTH = BUILDER
                .comment("How strong can a Tornado be in EF-Scale? (6 is just an Joke, it doesn't go to 6 in real life.)")
                .defineInRange("maxTornadoStrength", 5, 1, 6);

        MAX_HURRICANE_STRENGTH = BUILDER
                .comment("How strong can a Hurricane be in SSHW-Scale?")
                .defineInRange("maxHurricaneStrength", 5, 1, 5);

        MAX_TYPHOON_STRENGTH = BUILDER
                .comment("How strong can a Typhoon be in JMA-Scale?")
                .defineEnum("maxTyphoonStrength", MaxTyphoonStrength.VIOLENT_TYPHOON);

        BUILDER.pop();

        BUILDER.comment("Client-side display settings").push("client");

        UNIT_SYSTEM = BUILDER
                .comment("The unit system used for displaying wind speeds (METRIC = km/h, IMPERIAL = mph).")
                .defineEnum("unitSystem", UnitSystem.METRIC);

        BUILDER.pop();
    }

    public static final ModConfigSpec SPEC = BUILDER.build();

    public enum MaxTyphoonStrength {
        TROPICAL_DEPRESSION,
        TROPICAL_STORM,
        SEVERE_TROPICAL_STORM,
        TYPHOON,
        VERY_STRONG_TYPHOON,
        VIOLENT_TYPHOON
    }

    public enum UnitSystem {
        METRIC,
        IMPERIAL
    }
}

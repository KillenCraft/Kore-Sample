package com.scottkillen.mod.koresample;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;

@SuppressWarnings({
        "StaticNonFinalField",
        "WeakerAccess",
        "StaticVariableMayNotBeInitialized",
        "NonConstantFieldWithUpperCaseName", "UtilityClass",
        "UtilityClassWithoutPrivateConstructor"
})
@Mod(modid = TheMod.MOD_ID, name = TheMod.MOD_NAME, version = TheMod.MOD_VERSION, useMetadata = true)
public final class TheMod
{
    static final String MOD_ID = "koresample";
    static final String MOD_NAME = "Kore Sample";
    static final String MOD_VERSION = "${mod_version}";
    private static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ':';

    @Instance(MOD_ID)
    public static TheMod INSTANCE;

    @SuppressWarnings("unused")
    public static String resourcePrefix() { return RESOURCE_PREFIX; }
}

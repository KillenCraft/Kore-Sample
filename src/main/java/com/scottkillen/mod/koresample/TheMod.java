package com.scottkillen.mod.koresample;

import com.scottkillen.mod.koresample.common.handler.FuelHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@SuppressWarnings({
        "StaticNonFinalField",
        "WeakerAccess",
        "StaticVariableMayNotBeInitialized",
        "NonConstantFieldWithUpperCaseName"
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

    @SuppressWarnings("MethodMayBeStatic")
    @EventHandler
    public void OnFMLPostInitialization(FMLPostInitializationEvent unused)
    {
        GameRegistry.registerFuelHandler(new FuelHandler());
    }
}

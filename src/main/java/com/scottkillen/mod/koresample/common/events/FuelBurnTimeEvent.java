package com.scottkillen.mod.koresample.common.events;

import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.item.ItemStack;
import javax.annotation.Nonnull;

public class FuelBurnTimeEvent extends Event
{
    private final ItemStack fuel;
    private int burnTime = 0;

    public FuelBurnTimeEvent(@Nonnull ItemStack fuel) { this.fuel = fuel; }

    public int getBurnTime() { return burnTime; }

    public void setBurnTime(int burnTime) { this.burnTime = burnTime; }
}

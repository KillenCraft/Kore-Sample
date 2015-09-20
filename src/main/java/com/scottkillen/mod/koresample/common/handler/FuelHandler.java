package com.scottkillen.mod.koresample.common.handler;

import com.scottkillen.mod.koresample.common.events.FuelBurnTimeEvent;
import com.scottkillen.mod.koresample.common.events.KoreEventBusDispatcher;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;
import javax.annotation.Nullable;

public class FuelHandler implements IFuelHandler
{
    @Override
    public int getBurnTime(@Nullable ItemStack fuel)
    {
        if (fuel == null) return 0;

        final FuelBurnTimeEvent event = new FuelBurnTimeEvent(fuel);
        new KoreEventBusDispatcher().broadcast(event);
        return event.getBurnTime();
    }
}

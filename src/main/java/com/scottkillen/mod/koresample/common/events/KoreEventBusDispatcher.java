package com.scottkillen.mod.koresample.common.events;

import com.scottkillen.mod.koresample.common.util.event.ForgeEventListener;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.EventBus;
import javax.annotation.Nonnull;

public class KoreEventBusDispatcher
{
    private static final EventBus EVENT_BUS = new EventBus();

    public void connect(@Nonnull ForgeEventListener listener) { listener.listen(EVENT_BUS); }

    public boolean broadcast(@Nonnull Event event) { return EVENT_BUS.post(event); }
}

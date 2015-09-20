package com.scottkillen.mod.koresample.common.util.itemstack;

import net.minecraft.item.ItemStack;

@SuppressWarnings("WeakerAccess")
public class ItemStackMatcher
{
    private final ItemStack baseline;

    public ItemStackMatcher(ItemStack baseline)
    {
        this.baseline = baseline;
    }

    @SuppressWarnings("SimplifiableIfStatement")
    public boolean isAMatch(ItemStack input)
    {
        if (input != null && input.equals(baseline)) return true;
        return input != null && baseline != null && input.isItemEqual(baseline);
    }
}

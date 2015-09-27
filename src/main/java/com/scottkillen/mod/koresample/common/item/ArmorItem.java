package com.scottkillen.mod.koresample.common.item;

import com.google.common.base.Preconditions;
import net.minecraft.item.ItemArmor;
import javax.annotation.Nonnull;

@SuppressWarnings({ "WeakerAccess", "AbstractClassNeverImplemented" })
public abstract class ArmorItem extends ItemArmor
{
    protected ArmorItem(@Nonnull ArmorMaterial armorMaterial, int renderIndex, @Nonnull ArmorType armorType,
                        @Nonnull String iconPath)
    {
        super(armorMaterial, renderIndex, armorType.value());
        Preconditions.checkArgument(!iconPath.isEmpty());
        setTextureName(iconPath);
    }
}

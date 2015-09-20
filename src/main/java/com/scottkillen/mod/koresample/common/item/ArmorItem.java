package com.scottkillen.mod.koresample.common.item;

import net.minecraft.item.ItemArmor;
import javax.annotation.Nonnull;

@SuppressWarnings({ "WeakerAccess", "AbstractClassNeverImplemented", "ClassHasNoToStringMethod" })
public abstract class ArmorItem extends ItemArmor
{
    protected ArmorItem(ArmorMaterial armorMaterial, int renderIndex, @Nonnull ArmorType armorType,
                        @Nonnull String iconPath)
    {
        super(armorMaterial, renderIndex, armorType.value());
        setTextureName(iconPath);
    }
}

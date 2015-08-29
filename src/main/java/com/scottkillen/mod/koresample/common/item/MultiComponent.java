package com.scottkillen.mod.koresample.common.item;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import java.util.List;

@SuppressWarnings({ "WeakerAccess", "AbstractClassNeverImplemented", "ClassHasNoToStringMethod" })
public abstract class MultiComponent extends Item
{
    private final ImmutableList<DescribesComponent> components;

    private ImmutableList<IIcon> icons = null;

    protected MultiComponent(Iterable<DescribesComponent> components)
    {
        setHasSubtypes(true);
        setMaxDamage(0);
        this.components = ImmutableList.copyOf(components);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        final int i = itemStack.getItemDamage() < 0 ? 0 : itemStack.getItemDamage();
        return components.get(i < components.size() ? i : components.size() - 1).unlocalizedName();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int damage)
    {
        final int correctedDamage = damage < 0 ? 0 : damage;
        return icons.get(correctedDamage < icons.size() ? correctedDamage : icons.size() - 1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        final List<IIcon> componentIcons = Lists.newArrayListWithCapacity(components.size());
        for (final DescribesComponent component : components)
            componentIcons.add(iconRegister.registerIcon(component.icon()));
        icons = ImmutableList.copyOf(componentIcons);
    }

    @SuppressWarnings("unchecked")
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs unused, List subItems)
    {
        for (int i = 0; i < components.size(); i++)
            //noinspection ObjectAllocationInLoop
            subItems.add(new ItemStack(item, 1, i));
    }
}

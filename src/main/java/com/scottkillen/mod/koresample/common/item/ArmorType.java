package com.scottkillen.mod.koresample.common.item;

public enum ArmorType
{
    HELMET(0),
    CHESTPLATE(1),
    LEGGINGS(2),
    BOOTS(3);

    private final int value;

    ArmorType(int value) { this.value = value; }

    static boolean isBoots(int armorType) {return armorType == BOOTS.value();}

    static boolean isChestplate(int armorType) {return armorType == CHESTPLATE.value();}

    static boolean isHelmet(int armorType) {return armorType == HELMET.value();}

    static boolean isLeggings(int armorType) {return armorType == LEGGINGS.value();}

    int value()
    {
        return value;
    }
}

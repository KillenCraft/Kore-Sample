package com.scottkillen.mod.koresample.common.util.enums;

import com.google.common.collect.BiMap;
import com.google.common.collect.EnumHashBiMap;

@SuppressWarnings({ "ClassHasNoToStringMethod", "unused" })
public final class EnumIndexer<T extends Enum<T>>
{
    private final BiMap<T, Integer> lookup;

    private EnumIndexer(Class<T> enumType)
    {
        lookup = EnumHashBiMap.create(enumType);
    }

    public static <T extends Enum<T>> EnumIndexer<T> create(Class<T> enumType)
    {
        return new EnumIndexer<T>(enumType);
    }

    public T get(int index) { return lookup.inverse().get(index); }

    public int get(T value) { return lookup.get(value); }

    public void put(T key, int value) { lookup.put(key, value); }

    public void put(int key, T value) { lookup.put(value, key); }
}

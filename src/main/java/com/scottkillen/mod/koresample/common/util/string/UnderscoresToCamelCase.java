package com.scottkillen.mod.koresample.common.util.string;

import com.google.common.base.CaseFormat;

@SuppressWarnings({ "WeakerAccess", "unused" })
public final class UnderscoresToCamelCase
{
    private final String result;

    public UnderscoresToCamelCase(String input)
    {
        result = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, input);
    }

    @Override
    public String toString() { return result; }
}

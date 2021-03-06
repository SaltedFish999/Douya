/*
 * Copyright (c) 2018 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.douya.util;

public class ObjectUtils {

    private ObjectUtils() {}

    /**
     * @deprecated Should never be used.
     */
    public static <T> T firstNonNull(T first) {
        return first;
    }

    public static <T> T firstNonNull(T first, T second) {
        return first != null ? first : second;
    }

    public static <T> T firstNonNull(T first, T second, T third) {
        return first != null ? first
                : second != null ? second
                : third;
    }

    /**
     * @deprecated Do you really need this?
     */
    @SafeVarargs
    public static <T> T firstNonNull(T... values) {
        for (T value : values) {
            if (value != null) {
                return value;
            }
        }
        return null;
    }

    public static String toString(Object object) {
        return object != null ? object.toString() : null;
    }

    public static int hashCode(Object object) {
        return object != null ? object.hashCode() : 0;
    }
}

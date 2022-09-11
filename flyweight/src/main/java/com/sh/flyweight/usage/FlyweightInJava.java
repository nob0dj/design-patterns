package com.sh.flyweight.usage;

public class FlyweightInJava {

    public static void main(String[] args) {
        /**
         * Integer.valueOf(int)
         * Returns an Integer instance representing the specified int value.
         * If a new Integer instance is not required, this method should generally be used in preference to the constructor Integer(int),
         * as this method is likely to yield significantly better space and time performance
         * by caching frequently requested values.
         * This method will always cache values in the range -128 to 127, inclusive,
         * and may cache other values outside of this range.
         * Params:
         * i – an int value.
         * Returns:
         * an Integer instance representing i.
         * Since:
         * 1.5
         */
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1 == i2); // true 자주 요청되는 값은 caching을 통해 성능향성추구. -128 ~ 127은 우선 caching!
        System.out.println(i1.equals(i2)); // true Integer객체값 비교는 equals를 사용해야 한다.

        Integer i3 = Integer.valueOf(1000);
        Integer i4 = Integer.valueOf(1000);
        System.out.println(i3 == i4); // false
        System.out.println(i3.equals(i4)); // true
    }
}

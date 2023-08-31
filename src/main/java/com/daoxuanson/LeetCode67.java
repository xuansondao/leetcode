package com.daoxuanson;

public class LeetCode67 {
    public String addBinary(String a, String b) {
        StringBuilder rs = new StringBuilder();
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int sum = 0;
        int memory = 0;
        while (aIndex >= 0 || bIndex >= 0) {
            if (aIndex >= 0)
                sum += a.charAt(aIndex--) - '0';
            if (bIndex >= 0)
                sum += b.charAt(bIndex--) - '0';
            memory = sum  > 1 ? 1 : 0;
            rs.append(sum%2);
            sum = memory;
        }

        if (memory == 1) rs.append(memory);


        return rs.reverse().toString();
    }
}

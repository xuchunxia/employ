package com.xcx.employ;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by chunxiaxu@yahoo.com
 * Date: 2016/9/25 14:26
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        String a = "";
        if (StringUtils.isBlank(a)) {
            System.out.println(a + " is blank");
        }
    }
}

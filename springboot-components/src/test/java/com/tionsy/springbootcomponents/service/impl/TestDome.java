package com.tionsy.springbootcomponents.service.impl;

import com.tionsy.springbootcomponents.SpringbootComponentsApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author tianyun
 * @version 1.0
 * @date Created in 2020年08月26日 08:52
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= SpringbootComponentsApplication.class)
public class TestDome {

    @Test
    public void test1(){
        String password = encrypt("123456adfaf");
        if(encrypt("123456adfaf").equals(password)) {
            System.out.println("密码正确");
        } else {
            System.out.println("密码错误");
        }

    }


    private String encrypt(String password) {
        String passwordMd5 = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(password.getBytes("utf-8"));
            passwordMd5 = toHex(bytes);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return passwordMd5;
    }

    private static String toHex(byte[] bytes) {
        final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();
        StringBuilder ret = new StringBuilder(bytes.length * 2);
        for (int i=0; i<bytes.length; i++) {
            ret.append(HEX_DIGITS[(bytes[i] >> 4) & 0x0f]);
            ret.append(HEX_DIGITS[bytes[i] & 0x0f]);
        }
        return ret.toString();
    }


}

package com.silmood.ciph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CipherTest {

    @Test
    public void cipher_Rot13(){
        String result = Cipher.rot13("Hello World");

        assertEquals("Uryyb Jbeyq",result);
    }
}

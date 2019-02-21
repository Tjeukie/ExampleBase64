package org.siemons.examplebase64;

import java.util.Base64;

public class ExampleBase64 {
    
    public static void main(String[] args) {
        String code = "Hi die Tjeu";
        System.out.println("Before encoding: " + code);
        
        byte[] encodedBytes = Base64.getEncoder().encode(code.getBytes());
        code = new String(encodedBytes);
        System.out.println("After encoding and before decoding: " + code);

        code = new String(Base64.getDecoder().decode(code));
        System.out.println("After decoding: " + code);

    }

}

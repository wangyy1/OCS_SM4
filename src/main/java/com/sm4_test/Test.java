package com.sm4_test;


public class Test {
    public static void main(String[] args) {
        System.out.println("CBC模式-BASE64处理");

        //设置待加密的文本
        String plainText = "123";
        SM4Utils sm4 = new SM4Utils();
        //设置 密钥 16长度的字符
        sm4.setSecretKey("A067C0F8FAB64069859CD6D205DC47F6");
        //设置 向量 16长度的字符
        sm4.setIv("6F009111085B429FB6AD1B7C2577AA8F");
        //声明密钥和向量是否是32长度的十六进制的字符串，如果true则需要设置密钥向量都是十六进制的32长度字符串。Util.byteToHex("b7b3gSMFWd9a67i1".getBytes())
        sm4.setHexString(true);

        //进行加密
        String cipherText = sm4.encryptData_CBC(plainText);
        System.out.println("密文: " + cipherText);
        System.out.println("");

        //进行解密
        plainText = sm4.decryptData_CBC(cipherText);
        System.out.println("明文: " + plainText);
    }
}

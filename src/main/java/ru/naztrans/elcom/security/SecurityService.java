package ru.naztrans.elcom.security;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.faces.bean.ApplicationScoped;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;


public class SecurityService {
    public static final String SHA256 = "SHA-256";
    public static final String UTF8 = "UTF-8";
    public static final String SECRET = "gdfverfbiuefh";

    private static SecretKeySpec secretKey;
    private static byte[] key;

    static public String getHash(final String password){
        if (password == null || password.isEmpty()) return null;
        return sha256(password);
    }

     public static String sha256(final String value)  {
        try {
            return getHash(SHA256, value);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
     }
    public static String getHash(
             final String algorithm,
             final String value
    ) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if (value == null || algorithm == null) {
            return null;
        }
        final MessageDigest md = MessageDigest.getInstance(algorithm);
        final byte[] digest = md.digest(value.getBytes(UTF8));
        return digestToString(digest);
    }
    public static String digestToString( final byte[] digest) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (final byte anArray : digest) {
            stringBuilder.append(Integer.toHexString((anArray & 0xFF) | 0x100).substring(1, 3));
        }
        return stringBuilder.toString();
    }



    public static void setKey(String myKey) {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        } catch (final NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (final UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    public static String encrypt(String strToEncrypt, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.encodeBase64String(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } catch (final Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    public static String decrypt(String strToDecrypt, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.decodeBase64(strToDecrypt)));
        } catch (final Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }

}

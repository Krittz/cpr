package model;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author crist
 */
public class User implements Serializable {

    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = hashPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        String hashedPasswordToCheck = hashPassword(password);
        return this.password.equals(hashedPasswordToCheck);
    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte[] hashedPasswordBytes = md.digest();
            return new String(hashedPasswordBytes);
        } catch (NoSuchAlgorithmException ex) {
            return null;
        }
    }

}

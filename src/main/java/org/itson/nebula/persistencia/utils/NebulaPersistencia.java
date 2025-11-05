/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.nebula.persistencia.utils;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class NebulaPersistencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InvalidKeySpecException, NoSuchAlgorithmException {
        for (int i = 1; i <= 6; i++) {
            String hashedPassword = ManejadorPasswords.hashPassword("654321");
            System.out.println(hashedPassword);
        }
    }
    
}

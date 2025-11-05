/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.nebula.persistencia.utils;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class NebulaPersistencia {

    public static void main(String[] args) throws InvalidKeySpecException, NoSuchAlgorithmException {
        // generacion de passwords hashed que pueden resetearse en la BD en caso de perderlos
        for (int i = 1; i <= 6; i++) {
            String hashedPassword = ManejadorPasswords.hashPassword("123456");
            System.out.println(hashedPassword);
        }
    }
    
}

package domain;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class Password {
    private static int LONGITUD = 8;
    private String contraseña;
    private String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public Password() {

    }

    public Password(int longitud) {
        LONGITUD = longitud;
        contraseña = generarContraseña(LONGITUD);
    }

    public String generarContraseña(int longitud)
    {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder contraseña = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++)
        {
            int indice = random.nextInt(caracteres.length());
            contraseña.append(caracteres.charAt(indice));
        }

        return contraseña.toString();

    }

    @Override
    public String toString() {
        return "EjercucuiDos.Password{" +
                "contraseña='" + contraseña + '\'' +
                '}';
    }


}

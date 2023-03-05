
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ruflas
 */
public class Usuario {

    private String user, password;
    private boolean admin = this.isAdmin();

    public Usuario(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Usuario(String user, String password, boolean admin) {
        this(user, password);
        this.admin = admin;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        String archivo = "admin.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.equals(this.user)) {
                    admin = true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo " + archivo);
            e.printStackTrace();
        }

        return admin;
    }

    public void setAdmin() {
        String archivo = "admin.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.newLine();
            bw.write(this.user);
            this.admin = true;
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo " + archivo);
            e.printStackTrace();
        }
    }

public static void setAdmin(String usuario, boolean status) {
    String archivo = "admin.txt";
    if (status) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.newLine();
            bw.write(usuario);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo " + archivo);
            e.printStackTrace();
        }
    } else {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            StringBuilder sb = new StringBuilder();
            while ((linea = br.readLine()) != null) {
                if (!linea.equals(usuario)) {
                    sb.append(linea).append(System.lineSeparator());
                }
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
                bw.write(sb.toString());
            } catch (IOException e) {
                System.err.println("Error al escribir en el archivo " + archivo);
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo " + archivo);
            e.printStackTrace();
        }
    }
}


    @Override
    public String toString() {
        return String.format("%s:%s isAdmin?: %b", this.user, this.password, this.admin);
    }

}

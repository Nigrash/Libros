/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package remakesegundoparcial;
/**
 *
 * @author YAYA
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class remakesegundoparcial {
    public static void main(String[] args) {
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        BufferedReader almacenamiento;
        FileReader leer;
        String nombrelibro = "", autor = "", code = "", busqueda = "";
        archivo = new File("libros.txt");
        int opcion = 0, i, NumerodeRegistro = 1;
        String cadena;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Agregar Libro" + "\n2.- Lectura secuencial del archivo" + "\n3.- Lectura directa por código" + "\n4.- Salida", "INGRESE OPCION", 1));
            switch (opcion) {
                case 1:
                    if (!archivo.exists()) {
                        try {
                            archivo.createNewFile();
                            code = JOptionPane.showInputDialog(null, "Código : ", "Solicitando Datos", 3);
                            nombrelibro = JOptionPane.showInputDialog(null, "Libro : ", "Solicitando Datos", 3);
                            autor = JOptionPane.showInputDialog(null, "Autor : ", "Solicitando Datos", 3);
                            escribir = new FileWriter(archivo, true);
                            linea = new PrintWriter(escribir);
                            linea.println(code);
                            linea.println(nombrelibro);
                            linea.println(autor);
                            linea.close();
                            escribir.close();
                        } catch (IOException ex) {
                            Logger.getLogger(remakesegundoparcial.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        try {
                            code = JOptionPane.showInputDialog(null, "Código : ", "Solicitando Datos", 3);
                            nombrelibro = JOptionPane.showInputDialog(null, "Libro : ", "Solicitando Datos", 3);
                            autor = JOptionPane.showInputDialog(null, "Autor : ", "Solicitando Datos", 3);
                            escribir = new FileWriter(archivo, true);
                            linea = new PrintWriter(escribir);
                            linea.println(code);
                            linea.println(nombrelibro);
                            linea.println(autor);
                            linea.close();
                            escribir.close();
                        } catch (IOException ex) {
                            Logger.getLogger(remakesegundoparcial.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;
                case 2:
                    archivo = new File("libros.txt");
                    try {
                        leer = new FileReader(archivo);
                        almacenamiento = new BufferedReader(leer);
                        cadena = "";
                        while (cadena != null) {
                            try {
                                cadena = almacenamiento.readLine();
                                code = cadena;
                                cadena = almacenamiento.readLine();
                                nombrelibro = cadena;
                                cadena = almacenamiento.readLine();
                                autor = cadena;
                                if (cadena != null) {
                                    JOptionPane.showMessageDialog(null, "\nLibro :" + nombrelibro + "\nAutor :" + autor + "\nCódigo: " + code, "Mostrando Datos del registro No. " + NumerodeRegistro, 1);
                                    NumerodeRegistro++;
                                }
                            } catch (IOException ex) {
                                Logger.getLogger(remakesegundoparcial.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        almacenamiento.close();
                        leer.close();
                    } catch (IOException ex) {
                        Logger.getLogger(remakesegundoparcial.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 3:
                    busqueda = JOptionPane.showInputDialog(null, "Código a buscar: ", "Solicitando Datos", 3);
                    try {
                        leer = new FileReader(archivo);
                        almacenamiento = new BufferedReader(leer);
                        cadena = "";
                        while (cadena != null) {
                            try {
                                cadena = almacenamiento.readLine();
                                code = cadena;
                                cadena = almacenamiento.readLine();
                                nombrelibro = cadena;
                                cadena = almacenamiento.readLine();
                                autor = cadena;
                                if (cadena != null) {
                                    if (code.equals(busqueda)) {
                                        JOptionPane.showMessageDialog(null, "\nLibro :" + nombrelibro + "\nAutor :" + autor + "\nCódigo: " + code, "Mostrando Datos del registro No. " + NumerodeRegistro, 1);
                                        NumerodeRegistro++;
                                    }
                                }
                            } catch (IOException ex) {
                                Logger.getLogger(remakesegundoparcial.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        almacenamiento.close();
                        leer.close();
                    } catch (IOException ex) {
                        Logger.getLogger(remakesegundoparcial.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Programa Cerrado con éxito", "Listo", 3);
            }
        } while (opcion != 4);
    }
}



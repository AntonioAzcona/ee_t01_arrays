/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AZCONA GONZÁLEZ JOSÉ ANTONIO
 * Materia: Estructura de Datos
 * Docente: Lic. León Felipe Villavicencio Fernandez
 * Hora: 10:00 - 11:00
 * Nombre del trabajo: Tarea01
 */
import java.util.*;
import java.io.*;
import javax.swing.*;
public class MiClase {
    
    String ruta = JOptionPane.showInputDialog("Ingrese la ruta donde se encuentra el archivo y el nombre del archivo con su extension");
    File f = new File(ruta);
 
    public void leerArchivo()
    {
        try{
         FileReader fr = new FileReader(f);
         BufferedReader br = new BufferedReader(fr);
         String renglon = br.readLine();
         char [] arr = renglon.toCharArray();
        System.out.print("ENTRADA: ");
        for(int j = 0; j < renglon.length(); j++)
        {
            System.out.print(arr[j]);
        }
        System.out.print("\nSALIDA:  ");
        for(int i = renglon.length()-1; i > 0; i--)
        {
            System.out.print(arr[i]);
        }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    // ENTRADA: 6123456
    // SALIDA:  654321
    //     C:\\Users\\Antonio\\Desktop\\ee_t01_arrays\\archivo.txt
}

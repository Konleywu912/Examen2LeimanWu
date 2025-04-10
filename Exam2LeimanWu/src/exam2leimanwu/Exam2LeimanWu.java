/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam2leimanwu;

import javax.swing.JOptionPane;

/**
 *
 * @author leymanwu
 */
public class Exam2LeimanWu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Habitaciones habitaciones = new Habitaciones("");
        //Funcion donde el usuario puede seleccionar cada opcion
        while (true) {
            JOptionPane.showMessageDialog(null, "Sistema de Gestion de reservacion del Hotel");
            int gestion = Integer.parseInt(JOptionPane.showInputDialog("¿Que le gustaria realizar?" + "\n"
                    + "1) Revisar habitaciones" + "\n"
                    + "2) Modificar reservaciones" + "\n"
                    + "3) Resumen de habitaciones disponibles" + "\n"
                    + "4) Salir"));

            switch (gestion) {
                case 1:
                    habitaciones.mostrainformacionhabitacion();
                    break;
                case 2:
            }
        }
    }
}

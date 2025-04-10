/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2leimanwu;

import javax.swing.JOptionPane;

/**
 *
 * @author leymanwu
 */
public class Habitaciones {

    private String estadohabitacion;
    private String piso1;
    private String piso2;
    private String piso3;
    private String piso4;
    private String piso5;

    public Habitaciones(String estadohabitacion) {
        this.estadohabitacion = estadohabitacion;
    }
//creamo un metodo que pueda el usuario seleccionar el piso

    public void mostrainformacionhabitacion() {
        while (true) {
            int op = Integer.parseInt(JOptionPane.showInputDialog("Revisando habitaciones..." + "\n"
                    + "Digite el piso que desea revisar" + "\n"
                    + "1)Piso1" + "\n"
                    + "2)Piso2" + "\n"
                    + "3)Piso3" + "\n"
                    + "4)Piso4" + "\n"
                    + "5)Piso5" + "\n"
                    + "6)Salir"));

            if (op == 1) {
                p1();
                break;
            }
            if (op == 2) {
                p2();
                break;
            }
            if (op == 3) {
                p3();
                break;
            }
            if (op == 4) {
                p4();
                break;
            }
            if (op == 5) {
                p5();
                break;

            }
        }
    }
    //metodos para cada piso

    public void p1() {
        String operacion = JOptionPane.showInputDialog("Digite el numero de habitacion del 101 al 105");
        int ope = Integer.parseInt(operacion);
        if (ope == 101) {
            JOptionPane.showInputDialog("La habitacion 101 se encuentra Disponible" + "\n"
                    + "Habitacion Simple" + "\n"
                    + "Costo:$30");
            String aceptar = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                    + "1)Si)" + "\n"
                    + "2)No");
            int ace = Integer.parseInt(aceptar);
            if (ace == 1) {
                JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");
            }
            if (ope == 102) {
                JOptionPane.showInputDialog("La habitacion 102 se encuentra Disponible" + "\n"
                        + "Habitacion Doble" + "\n"
                        + "Costo:$30");
                String acep = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                        + "1)Si)" + "\n"
                        + "2)No");
                int ac = Integer.parseInt(acep);
                if (ace == 1) {
                    JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");

                }
                if (ope == 103) {
                    JOptionPane.showInputDialog("La habitacion 103 se encuentra Disponible" + "\n"
                            + "Habitacion Simple" + "\n"
                            + "Costo:$30");
                    String acept = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                            + "1)Si)" + "\n"
                            + "2)No");
                    int acew = Integer.parseInt(acept);
                    if (ace == 1) {
                        JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");
                    }

                    if (ope == 104) {
                        JOptionPane.showInputDialog("La habitacion 104 se encuentra Disponible" + "\n"
                                + "Habitacion Doble" + "\n"
                                + "Costo:$30");
                        String acepta = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                                + "1)Si)" + "\n"
                                + "2)No");
                        int a = Integer.parseInt(acepta);
                        if (ace == 1) {
                            JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");
                        }
                        if (ope == 105) {
                            JOptionPane.showInputDialog("La habitacion 105 se encuentra Sucia" + "\n"
                                    + "No se puede reservar");
                        } else {
                            JOptionPane.showMessageDialog(null, "Habitacion no existe, intentelo nuevamente");
                        }

                    }
                }
            }
        }
    }

    public void p2() {
        String operacion = JOptionPane.showInputDialog("Digite el numero de habitacion del 201 al 205");
        int ope = Integer.parseInt(operacion);
        if (ope == 201) {
            JOptionPane.showInputDialog("La habitacion 201 se encuentra Disponible" + "\n"
                    + "Habitacion Simple" + "\n"
                    + "Costo:$40");
            String aceptar = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                    + "1)Si)" + "\n"
                    + "2)No");
            int ace = Integer.parseInt(aceptar);
            if (ace == 1) {
                JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");
            }

            if (ope == 202) {
                JOptionPane.showInputDialog("La habitacion 202 se encuentra Disponible" + "\n"
                        + "Habitacion Doble" + "\n"
                        + "Costo:$40");
                String acepta = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                        + "1)Si)" + "\n"
                        + "2)No");
                int ae = Integer.parseInt(acepta);
                if (ace == 1) {
                    JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");
                }

                if (ope == 203) {
                    JOptionPane.showInputDialog("La habitacion 203 se encuentra Disponible" + "\n"
                            + "Habitacion Simple" + "\n"
                            + "Costo:$40");
                    String acept = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                            + "1)Si)" + "\n"
                            + "2)No");
                    int a = Integer.parseInt(acept);
                    if (ace == 1) {
                        JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");
                    }

                    if (ope == 204) {
                        JOptionPane.showInputDialog("La habitacion 204 se encuentra Disponible" + "\n"
                                + "Habitacion Double" + "\n"
                                + "Costo:$40");
                        String aw = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                                + "1)Si)" + "\n"
                                + "2)No");
                        int ac = Integer.parseInt(aw);
                        if (ace == 1) {
                            JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");
                        }

                        if (ope == 205) {
                            JOptionPane.showInputDialog("La habitacion 205 se encuentra sucia" + "\n"
                                    + "No se puede reservar");

                        } else {
                            JOptionPane.showMessageDialog(null, "Habitacion no existe, intentelo nuevamente");

                        }
                    }

                }
            }
        }
    }

    public void p3() {

        String operacion = JOptionPane.showInputDialog("Digite el numero de habitacion del 301 al 305");
        int ope = Integer.parseInt(operacion);
        if (ope == 301) {
            JOptionPane.showInputDialog("La habitacion 301 se encuentra Sucia" + "\n"
                    + "No esta disponible");

        }
        if (ope == 302) {
            JOptionPane.showInputDialog("La habitacion 302 se encuentra Disponible" + "\n"
                    + "Habitacion Double" + "\n"
                    + "Costo:$60");
            String acepta = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                    + "1)Si)" + "\n"
                    + "2)No");
            int ac = Integer.parseInt(acepta);
            if (ac == 1) {
                JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");
            }

            if (ope == 303) {
                JOptionPane.showInputDialog("La habitacion 303 se encuentra Disponible" + "\n"
                        + "Habitacion Simple" + "\n"
                        + "Costo:$40");
                String aceptar = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                        + "1)Si)" + "\n"
                        + "2)No");
                int ace = Integer.parseInt(aceptar);
                if (ace == 1) {
                    JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");
                }

                if (ope == 304) {
                    JOptionPane.showInputDialog("La habitacion 304 se encuentra Disponible" + "\n"
                            + "Habitacion Double" + "\n"
                            + "Costo:$30");
                    String acept = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                            + "1)Si)" + "\n"
                            + "2)No");
                    int a = Integer.parseInt(acept);
                    if (ace == 1) {
                        JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");

                    }
                    if (ope == 305) {
                        JOptionPane.showInputDialog("La habitacion 305 se encuentra Sucia" + "\n"
                                + "No esta disponible");

                    } else {
                        JOptionPane.showMessageDialog(null, "Habitacion no existe, intentelo nuevamente");
                    }
                }
            }

        }
    }

    public void p4() {
        String operacion = JOptionPane.showInputDialog("Digite el numero de habitacion del 401 al 405");
        int ope = Integer.parseInt(operacion);

        if (ope == 401) {
            JOptionPane.showInputDialog("La habitacion 401 se encuentra Ocupada" + "\n"
                    + "No esta disponoble");

        }
        if (ope == 402) {
            JOptionPane.showInputDialog("La habitacion 402 se encuentra Disponible" + "\n"
                    + "Habitacion Double" + "\n"
                    + "Costo:$60");
            String aceptar = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                    + "1)Si)" + "\n"
                    + "2)No");
            int ace = Integer.parseInt(aceptar);
            if (ace == 1) {
                JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");

            }
            if (ope == 403) {
                JOptionPane.showInputDialog("La habitacion 403 se encuentra Disponible" + "\n"
                        + "Habitacion Simple" + "\n"
                        + "Costo:$40");
                String acept = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                        + "1)Si)" + "\n"
                        + "2)No");
                int ae = Integer.parseInt(acept);
                if (ace == 1) {
                    JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");

                }

                if (ope == 404) {
                    JOptionPane.showInputDialog("La habitacion 404 se encuentra Disponible" + "\n"
                            + "Habitacion Simple" + "\n"
                            + "Costo:$40");
                    String a = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                            + "1)Si)" + "\n"
                            + "2)No");
                    int ac = Integer.parseInt(a);
                    if (ace == 1) {
                        JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");

                    }
                    if (ope == 405) {
                        JOptionPane.showInputDialog("La habitacion 405 se encuentra Sucia" + "\n"
                                + "No esta disponible");

                    } else {
                        JOptionPane.showMessageDialog(null, "Habitacion no existe, intentelo nuevamente");
                    }
                }

            }
        }
    }

    public void p5() {
        String operacion = JOptionPane.showInputDialog("Digite el numero de habitacion del 501 al 505");
        int ope = Integer.parseInt(operacion);
        if (ope == 501) {
            JOptionPane.showInputDialog("La habitacion 501 se encuentra Disponible" + "\n"
                    + "Habitacion Simple" + "\n"
                    + "Costo:$50");
            String aceptar = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                    + "1)Si)" + "\n"
                    + "2)No");
            int ace = Integer.parseInt(aceptar);
            if (ace == 1) {
                JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");

            }
            if (ope == 502) {
                JOptionPane.showInputDialog("La habitacion 502 se encuentra Disponible" + "\n"
                        + "Habitacion Double" + "\n"
                        + "Costo:$60");
                String acepta = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                        + "1)Si)" + "\n"
                        + "2)No");
                int ac = Integer.parseInt(acepta);
                if (ace == 1) {
                    JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");

                }
                if (ope == 503) {
                    JOptionPane.showInputDialog("La habitacion 503 se encuentra Disponible" + "\n"
                            + "Habitacion Simple" + "\n"
                            + "Costo:$40");
                    String a = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                            + "1)Si)" + "\n"
                            + "2)No");
                    int ae = Integer.parseInt(a);
                    if (ace == 1) {
                        JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");

                    }

                    if (ope == 504) {
                        JOptionPane.showInputDialog("La habitacion 504 se encuentra Disponible" + "\n"
                                + "Habitacion Double" + "\n"
                                + "Costo:$40");
                        String acept = JOptionPane.showInputDialog("¿Le gustaria reservar?" + "\n"
                                + "1)Si)" + "\n"
                                + "2)No");
                        int acase = Integer.parseInt(acept);
                        if (ace == 1) {
                            JOptionPane.showMessageDialog(null, "Gracias por tu reservacion, nos vemos pronto");

                        }
                        if (ope == 505) {
                            JOptionPane.showInputDialog("La habitacion 505 se encuentra Sucia" + "\n"
                                    + "No esta disponible");

                        } else {
                            JOptionPane.showMessageDialog(null, "Habitacion no existe, intentelo nuevamente");
                        }
                    } else {
                        JOptionPane.showConfirmDialog(null, "Piso no existe");
                    }
                }
            }
        }

    }
}

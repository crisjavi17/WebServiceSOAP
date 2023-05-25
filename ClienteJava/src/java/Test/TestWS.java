/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author LENOVO
 */
public class TestWS {

    public static void main(String[] args) {

        //crear el cliente
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones cliente = servicio.getWSOperacionesPort();
        //usar login
        if (cliente.login("Cristian", "12345678")) {
            System.out.println("Credenciales correctas.");
        } else {
            System.out.println("Credenciales incorrectas.");
        }
        //procesar pago
        System.out.println(cliente.procesarPago(5000, 20000));
    }
}

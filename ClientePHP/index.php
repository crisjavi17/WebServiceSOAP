<?php

// Crear el cliente
$cliente = new SoapClient('http://localhost:8080/ServicioWebSOAP/WSOperaciones?WSDL');
// USAR LOGIN
$inicio = $cliente->Login([
            "usuario" => "Cristian",
            "contrasena" => "12345678",
        ])->return;
if ($inicio == "Cristian" && $inicio == "123456789") {

    echo " Credenciales correctas.  ";
    echo " BIENVENIDO  ";
} else {
    echo 'Credenciales incorrectas.';
}
//USAR PROCESAR 
//$resultado_pago = $cliente->ProcesarPago([
//            "total" => 10000,
//            "pago" => 5000,
//        ])->return;
//
//if ($resultado_pago >= 0) {
//    echo " Pago realizado, su vuelto es: $resultado_pago ";
//} else {
//    echo 'Dinero innsuficiente';
//}


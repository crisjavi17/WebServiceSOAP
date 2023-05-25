from zeep import Client

cliente = Client('http://localhost:8080/ServicioWebSOAP/WSOperaciones?WSDL')

#login

if cliente.service.Login("Cristian","12345678"):{

print("Credenciales correctas")
}
else:{
    print("Credenciales incorrectas")
}
#procesar pago

if cliente.service.ProcesarPago(23,100)>=0: {
    print("Pago realizado")

}
else: {
    print("Dinero insuficiente")
}

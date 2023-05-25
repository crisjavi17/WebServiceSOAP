package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasena") String contrasena) {

        if (usuario.equals("Cristian") && contrasena.equals("1234j5678")) {
            return true;
        } else {
            return false;
        }
    }

    @WebMethod(operationName = "ProcesarPago")
    public int ProcesarPago(@WebParam(name = "total") int total, @WebParam(name = "pago") int pago) {

        if (pago >= total) {
            return pago - total;
        } else {
            return -1;
        }
    }
}

package uni.isw.sigvitbackend.model;

import java.sql.Timestamp;

public class Boleta extends ComprobantePago{
    public Boleta(Timestamp fecha, double monto, int nroComprobante) {
        super(fecha, monto, nroComprobante);
    }
}

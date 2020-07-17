package adminvecinos;

/**
 *
 * @author Carlos Fortin
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pago {
    private double monto;
    private Date fecha, mes;
    private int idVecino;
    private String id;

    public Pago() {
    }

    public Pago(double monto, Date fecha, Date mes, int idVecino) {
        this.monto = monto;
        this.fecha = fecha;
        this.mes = mes;
        this.idVecino = idVecino;
    }
    
    public Pago(double monto, String fecha, String mes, String id, int idVecino) throws ParseException{
        this.monto = monto;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        this.fecha = df.parse(fecha);
        df = new SimpleDateFormat("MM");
        this.mes = df.parse(mes);
        this.idVecino = idVecino;
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getMes() {
        return mes;
    }

    public void setMes(Date mes) {
        this.mes = mes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getFechaString(){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String fechaString = df.format(fecha);
        return fechaString;
    }
    
    public String getMesString(){
        SimpleDateFormat df = new SimpleDateFormat("MM");
        String mesString = df.format(mes);
        return mesString;
    }

    public int getIdVecino() {
        return idVecino;
    }

    public void setIdVecino(int idVecino) {
        this.idVecino = idVecino;
    }
    
    
}

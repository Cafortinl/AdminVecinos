package adminvecinos;

/**
 *
 * @author Carlos Fortin
 */
import java.util.ArrayList;

public class Vecino {
    private boolean isEmpresa;
    private String nombre, numCasa, numTel, correo, codZona;
    private double cuota;
    private ArrayList<Pago> pagos = new ArrayList();
    private ArrayList<String> nombresAlt = new ArrayList();
    private int id;

    public Vecino() {
    }

    public Vecino(String nombre, String numCasa, String numTel, double cuota, String correo, String codZona, int isEmpresa) {
        this.nombre = nombre;
        this.numCasa = numCasa;
        this.numTel = numTel;
        this.cuota = cuota;
        this.correo = correo;
        this.codZona = codZona;
        if(isEmpresa == 0)
            this.isEmpresa = false;
        else if(isEmpresa == 1)
            this.isEmpresa = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<Pago> pagos) {
        this.pagos = pagos;
    }

    public ArrayList<String> getNombresAlt() {
        return nombresAlt;
    }

    public void setNombresAlt(ArrayList<String> nombresAlt) {
        this.nombresAlt = nombresAlt;
    }
    
    public Pago getPago(int x){
        return pagos.get(x);
    }
    
    public void setPago(Pago x){
        pagos.add(x);
    }
    
    public String getNombreAlt(int x){
        return nombresAlt.get(x);
    }
    
    public void setNombreAlt(String x){
        nombresAlt.add(x);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isIsEmpresa() {
        return isEmpresa;
    }
    
    public int getIsEmpresa(){
        if(isEmpresa)
            return 1;
        else
            return 0;
    }

    public void setIsEmpresa(boolean isEmpresa) {
        this.isEmpresa = isEmpresa;
    }

    public String getCodZona() {
        return codZona;
    }

    public void setCodZona(String codZona) {
        this.codZona = codZona;
    }
    
    
    
}

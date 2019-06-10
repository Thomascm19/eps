
package proyecto02;

import java.util.Date;

public class Empresa {
    private String nit;
    private String nombre;
    private String direccion;
    private String telefono;
    private Date fechaFundacion;
    private String sede;

    public Empresa(String nit, String nombre, String direccion, String telefono, Date fechaFundacion, String sede){
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaFundacion = fechaFundacion;
        this.sede = sede;
    }
    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the fechaFundacion
     */
    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    /**
     * @param fechaFundacion the fechaFundacion to set
     */
    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    /**
     * @return the sede
     */
    public String getSede() {
        return sede;
    }

    /**
     * @param sede the sede to set
     */
    public void setSede(String sede) {
        this.sede = sede;
    }
}

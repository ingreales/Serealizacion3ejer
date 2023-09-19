package AtencionUniversidadDTO;


public class AtencionDTO {

    public Integer id;

    private String indentificacion;
    private String tipodeatencion;
    private int cantidadusuarios;
    private String asesoria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndentificacion() {
        return indentificacion;
    }

    public void setIndentificacion(String indentificacion) {
        this.indentificacion = indentificacion;
    }

    public String getTipodeatencion() {
        return tipodeatencion;
    }

    public void setTipodeatencion(String tipodeatencion) {
        this.tipodeatencion = tipodeatencion;
    }

    public int getCantidadusuarios() {
        return cantidadusuarios;
    }

    public void setCantidadusuarios(int cantidadusuarios) {
        this.cantidadusuarios = cantidadusuarios;
    }

    public String getAsesoria() {
        return asesoria;
    }

    public void setAsesoria(String asesoria) {
        this.asesoria = asesoria;
    }

    @Override
    public String toString() {
        return "antencionDTO{" +
                "id=" + id +
                ", indentificacion='" + indentificacion + '\'' +
                ", tipodeatencion='" + tipodeatencion + '\'' +
                ", cantidadusuarios=" + cantidadusuarios +
                ", asesoria='" + asesoria + '\'' +
                '}';
    }

    public AtencionDTO(Integer id, String indentificacion, String tipodeatencion, int cantidadusuarios, String asesoria) {
        this.id = id;
        this.indentificacion = indentificacion;
        this.tipodeatencion = tipodeatencion;
        this.cantidadusuarios = cantidadusuarios;
        this.asesoria = asesoria;


    }


    public void remove(AtencionDTO producto) {
    }
}

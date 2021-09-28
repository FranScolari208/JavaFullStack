package jdbc.entidad;

public class Familias {
    private Integer idFamilia;
    private String nombre;
    private Integer edadMinima;
    private Integer edadMaxima;
    private Integer numeroHijos;
    private String email;
    private Integer idCasaFamilia;

    public Familias() {
    }

    public Familias(Integer idFamilia, String nombre, Integer edadMinima, Integer edadMaxima, Integer numeroHijos, String email, Integer idCasaFamilia) {
        this.idFamilia = idFamilia;
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.numeroHijos = numeroHijos;
        this.email = email;
        this.idCasaFamilia = idCasaFamilia;
    }

    public Integer getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public Integer getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(Integer edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public Integer getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(Integer numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdCasaFamilia() {
        return idCasaFamilia;
    }

    public void setIdCasaFamilia(Integer idCasaFamilia) {
        this.idCasaFamilia = idCasaFamilia;
    }
    
    
}

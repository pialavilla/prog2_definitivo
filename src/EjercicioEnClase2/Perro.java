package EjercicioEnClase2;

public class Perro extends Canino {
    private String vacunar;
    private String sacarPaseo;

    public Perro() {
    }

    public Perro(String vacunar, String sacarPaseo) {
        this.vacunar = vacunar;
        this.sacarPaseo = sacarPaseo;
    }

    public String getVacunar() {
        return vacunar;
    }

    public void setVacunar(String vacunar) {
        this.vacunar = vacunar;
    }

    public String getSacarPaseo() {
        return sacarPaseo;
    }

    public void setSacarPaseo(String sacarPaseo) {
        this.sacarPaseo = sacarPaseo;
    }
    @Override
    public void comer(){
    }
    @Override
    public void hacerRuido(){
    }
}

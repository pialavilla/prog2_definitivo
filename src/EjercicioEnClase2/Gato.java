package EjercicioEnClase2;

public class Gato extends Felino{


    private String vacunar;

    // para que me pregunte lo q esta en animal
    public Gato(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }


    public String getVacunar() {
        return vacunar;
    }

    public void setVacunar(String vacunar) {
        this.vacunar = vacunar;
    }

    @Override
    public void comer(){
        System.out.println("el gato come "+getComida());
    }
    @Override
    public void hacerRuido(){
        System.out.println("Miau");
    }
}


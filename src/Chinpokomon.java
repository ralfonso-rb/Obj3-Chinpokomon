import java.util.ArrayList;
import java.util.List;

public class Chinpokomon {
    String nombre;
    Integer nivel;
    Integer vida;
    List<Ataque> ataques = new ArrayList<Ataque>();

    public Chinpokomon(String nombre, Integer nivel, Integer vida, List<Ataque> ataques) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.ataques = ataques;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public void atacar(Chinpokomon chipo){
        //de manera random enviar un ataque de la lista de ataques
        //llamar a ataque.ataque(chipo)
    }
}

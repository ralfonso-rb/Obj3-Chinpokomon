package model.logger;

public class Logger {
    private Nivel nivel;

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Logger(Nivel nivel) {
        this.nivel = nivel;
    }

    public void debug(String respuesta){
        System.out.println(respuesta);
    }

    public void info(String respuesta){
        if (getNivel() != Nivel.DEBUG){
            System.out.println(respuesta);
        }
    }

    public void warn(String respuesta){
        if( getNivel() != Nivel.DEBUG || getNivel() != Nivel.INFO){
            System.out.println(respuesta);
        }
    }

    public void error(String respuesta){
        if(getNivel() == Nivel.ERROR){
            System.out.println(respuesta);
        }
    }
}

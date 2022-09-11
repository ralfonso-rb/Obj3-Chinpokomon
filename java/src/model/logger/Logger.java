package model.logger;

public class Logger {

    private Nivel nivel = null;

    private static Logger instance = null;

    private Logger(Nivel nivel) {
        this.nivel = nivel;
    }

    public static Logger getInstance(Nivel nivel) {
        if (instance == null) {
            instance = new Logger(nivel);
        }
        return instance;
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(Nivel.INFO);
            Logger.getInstance().info("El Logger ha sido instanciado a nivel INFO por defecto");
        }
        return instance;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public void debug(String respuesta){
        System.out.println("DEBUG: " + respuesta);
    }

    public void info(String respuesta){
        if (getNivel() != Nivel.DEBUG){
            System.out.println("INFO: " + respuesta);
        }
    }

    public void warn(String respuesta){
        if( getNivel() != Nivel.DEBUG || getNivel() != Nivel.INFO){
            System.out.println("WARN: " + respuesta);
        }
    }

    public void error(String respuesta){
        if(getNivel() == Nivel.ERROR){
            System.out.println("ERROR: " + respuesta);
        }
    }
}

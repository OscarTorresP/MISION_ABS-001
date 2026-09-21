
public class Main {
    public static void main(String[] args) {
        BrigadaMedica brigadaMedica = new BrigadaMedica("Healers");
        BrigadaTecnica brigadaTecnica = new BrigadaTecnica("Ingenieros");
        DronRescate dronRescate = new DronRescate("ARTURITO");
        brigadaMedica.mostrarNombre();
        brigadaMedica.atenderEmergencia();
        brigadaTecnica.mostrarNombre();
        brigadaTecnica.atenderEmergencia();
        dronRescate.mostrarNombre();
        dronRescate.atenderEmergencia();

    }
}

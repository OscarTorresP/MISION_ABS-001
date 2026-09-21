
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
        DronRescate dron = new DronRescate("Dron de rescate");
        BrigadaTecnica tecnica = new BrigadaTecnica("Brigada TEcnica");
        dron.volar();
        dron.atenderEmergencia();
        tecnica.atenderEmergencia();
        tecnica.reparar();
        EquipoEmergencia equipo1 = new BrigadaMedica("Brigada Medica");
        EquipoEmergencia equipo2 = new BrigadaTecnica("Brigada Tecnica");
        EquipoEmergencia equipo3 = new DronRescate("Dron de Rescate");
        equipo1.atenderEmergencia();
        equipo2.atenderEmergencia();
        equipo3.atenderEmergencia();
        Volador volador = new DronRescate("Dron Aereo");
        volador.volar();
        Reparador reparador = new BrigadaTecnica("Equipo Tecnico");
        reparador.reparar();
    }
}

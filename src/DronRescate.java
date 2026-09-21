public class DronRescate extends EquipoEmergencia implements IVolador{
    public DronRescate(String nombre) {
        super(nombre);
    }
    @Override
    public void atenderEmergencia() {
        System.out.println("BIDO-BIDO-BIDO");
    }

    @Override
    public void volar() {
        System.out.println("Aleteando mas rapido...");
    }
}

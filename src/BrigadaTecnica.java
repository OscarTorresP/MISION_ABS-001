public class BrigadaTecnica extends EquipoEmergencia implements IReparador{
    public BrigadaTecnica(String nombre) {
        super(nombre);
    }
    @Override
    public void atenderEmergencia() {
        System.out.println("Reparando corazones...");
    }

    @Override
    public void reparar() {
        System.out.println("Parchando con un chicle...");
    }
}

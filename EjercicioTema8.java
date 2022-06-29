public class EjercicioTema8 {

    public static void main(String[] args) {

    Persona persona1 = new Persona();
    persona1.setEdad(22);
    persona1.setNombre("Juan");
    persona1.setTelefono(123456789);
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getTelefono());
    }


    public static class Persona {

        int edad;
        String nombre;
        int telefono;

        public int getEdad() {
            return this.edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getTelefono() {
            return this.telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
    }
}

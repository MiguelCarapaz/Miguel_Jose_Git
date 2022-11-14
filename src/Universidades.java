public class Universidades {
    //ATRIBUTOS
    String nombre,direccion;
    int carreras, alumnos, bibliotecas;
        public Universidades(){
            nombre="EPN";
            direccion="AVD.12 de obtubre";
            carreras=5;
            alumnos=1000;
            bibliotecas=5;

        }
        //METODOS

    public void Registrar_Alumno(){}
    public void Eliminar_Alumno(){}

    //GETTER AND SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCarreras() {
        return carreras;
    }

    public void setCarreras(int carreras) {
        this.carreras = carreras;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public int getBibliotecas() {
        return bibliotecas;
    }

    public void setBibliotecas(int bibliotecas) {
        this.bibliotecas = bibliotecas;
    }
}


import models.Carro;
import models.CarrosGenerator;
import models.Person;
import models.PersonasGenerator;


public class App {
    public static void main(String[] args) throws Exception {

        MetodosOrdenamientoBusquedaGrupoB metodosOrdenamientoBusqueda = new MetodosOrdenamientoBusquedaGrupoB();
        MetodosOrdenamientoBusqueda metodosOrdenamientoBusqueda2 = new MetodosOrdenamientoBusqueda();
        
        CarrosGenerator generator = new CarrosGenerator();

        // Obtener el arreglo de 50 carros generadas aleatoriamente
        Carro[] carros = generator.generarCarros();
        metodosOrdenamientoBusqueda.sortBYearWithBubbleAvnDesendente(carros);


        int anioBuscar = 20;

        int posicionCarro = metodosOrdenamientoBusqueda.searchBinaryByYear(carros,anioBuscar);

        if(posicionCarro == -1) {
            System.out.println("Carro no encontrado");
        }else {
            System.out.println("Carro encontrado!!");
            System.out.println();
            System.out.println("Carro encontrado en la posicion " + posicionCarro);
            System.out.println();
            System.out.println("Datos del carro encontrado: ");
            System.out.println(carros[posicionCarro].toString());
        }

        System.out.println();
        System.out.println("Listado de carros generados, ordenados de menor a mayor segun año:");
        int i=1;
        for (Carro carro : carros) {
            System.out.println("CARRO# " + i);
            System.out.println();
            System.out.println("Nombre: " + carro.getName());
            System.out.println("Modelo: " + carro.getModel());
            System.out.println("Año: " + carro.getYear());
            System.out.println();
            System.out.println("---------------------------------------------");
            i++;
        }

        PersonasGenerator generatorP = new PersonasGenerator();
        Person[] personas = generatorP.generarPersonas();
        metodosOrdenamientoBusqueda2.sortByAgeWithInsertion(personas);
        System.out.println();

        int personaAnioBuscar = 20;

        System.out.println();
        int posicionPersona = metodosOrdenamientoBusqueda2.searchBinaryByAge(personas, personaAnioBuscar);
        

        if(posicionPersona == -1) {
            System.out.println("Persona no encontrado");
        }else {
            System.out.println("Persona encontrado!!");
            System.out.println();
            System.out.println("Persona encontrado en la posicion " + posicionPersona);
            System.out.println();
            System.out.println("Datos de la persona encontrada: ");
            System.out.println(personas[posicionPersona].toString());
        }

        System.out.println();
        System.out.println("Listado de personas generados, ordenados de menor a mayor segun año:");
        int ii=1;
        for (Person person : personas) {
            System.out.println("PERSONA# " + ii);
            System.out.println();
            System.out.println("Nombre: " + person.getName());
            System.out.println("Edad: " + person.getAge());
            System.out.println("Estatura: " + person.getHeight());
            System.out.println();
            System.out.println("---------------------------------------------");
            ii++;
        }








        







    }
}

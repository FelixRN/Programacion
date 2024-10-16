public class Modelos_teorias {
    public static void main(String[] args) {
        
    
    //Crear la instancia de la teoria
    Teoria newTeoria = new Teoria();
    newTeoria.setName("Liderazgo adaptativo");
    newTeoria.setDescription("Nació en los años 90 cuando los autores Marty Linsky y Ronald Heifetz abordaron una nueva manera de actuar.\n"
    + "1- Reflexión y correcció\n"
    + "2- Aceptación de la incertidumbre\n"
    + "3- Enfoque en experimentación y aprendizaje\n"
    + "4- Inteligencia emocional\n"
    + "5- Valoración de ralaciones y confianza\n"
    + "6- Apariencia y persistencia\n"
    + "7- Creación de propósito compartido");

    System.out.println("Liderazgo adaptativo");
    System.out.println(newTeoria.toString());

    //Crear la instancia de la clase Modelo
    Modelo newModelo = new Modelo();
    newModelo.setName("Modelo del empujon");
    newModelo.setDescripcion("De forma muy sencilla y siguiendo con el ejemplo de las bebidas azucaradas, una acción vinculada a una estrategia nudge sería eliminar estos productos de la zona media de los estantes evitando así que estén a la altura de los ojos de los individuos. O, por ejemplo, llevarlos a la segunda página de un ecommerce.\n" + 

"En definitiva, la teoría del empujón no se basa en cambiar ni prohibir nada; simplemente pretende empujar a comprar lo fácil, pero también lo más adecuado a largo plazo.\n" + 

"Realmente, esta teoría impregna muchas ideas que ya contemplamos de manera cotidiana. Por ejemplo, cuando encontramos una opción predeterminada en una compra, nos está marcando el camino fácil, un nudge. La famosa pegatina de una mosca en los urinarios públicos es otro pequeño empujón que busca guiar hacia un resultado limpio y satisfactorio al finalizar el uso del inodoro.\n" + 

"En un entorno tan competitivo y complejo, es importante guiar a los consumidores de una forma correcta y responsable. Por ello, el planteamiento de la teoría del nudge consigue que sea más probable que una persona tome una decisión con un pequeño cambio en el entorno y con una implementación fácil y económica.\n");


System.out.println("Modelo del empujon");
    System.out.println(newModelo.toString());
}
}


//Definición de la clase Teoria
class Teoria {
    private String Name;
    private String Description;

    public String getName() {
        return Name;
        }
        
        public void setName(String Name) {
        this.Name = Name;
        }
        
        public String getDescripcion() {
        return Description;
        }
        
        public void setDescription(String description) {
        this.Description = description;
        }


    // Método toString para imprimir la información de la teoría
    @Override
    public String toString() {
    return "Nombre: " + this.Name + "\nDescripción: " + this.Description;
    }
}
// Definición de la clase Modelo
class Modelo {
    private String Name;
    private String Description;
    
    public String getName() {
    return Name;
    }
    
    public void setName(String Name) {
    this.Name = Name;
    }
    
    public String getDescription() {
    return Description;
    }
    
    public void setDescripcion(String Description) {
    this.Description = Description;
    }
    
    // Método toString para imprimir la información del modelo
    @Override
    public String toString() {
    return "Nombre: " + this.Name + "\nDescripción: " + this.Description;
    
    }
}
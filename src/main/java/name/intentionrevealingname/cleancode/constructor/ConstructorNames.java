package src.main.java.name.intentionrevealingname.cleancode.constructor;

// When constructors are overloaded, use static factory methods with names that describe the arguments. For example:
public class ConstructorNames {
    public void CreateClienteForNames() { //Criando Clientes (PK) e NumeroTelefone (FK)
// Just Example:
        Cliente cliente = Cliente.cliente("John");
        cliente.setName("John");

        NumeroTelefone fone1 = NumeroTelefone.fone1("1234567890");
        ph1.setNumber("1234567890");
        ph1.setType("cell");

        NumeroTelefone fone2 = NumeroTelefone.fone2("0987654321");
        ph2.setNumber("0987654321");
        ph2.setType("home");

        cliente.addNumeroTelefone(fone1);
        cliente.addNumeroTelefone(fone2);

        repository.save(cliente);
    }

}

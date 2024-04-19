package RepasoProg;

public class Main {
    public static void main(String[] args) {

        //CREAMOS PRODUCTOS
        Productos produc = new Productos("Cacao", 27, 2);
        Productos produc1 = new Productos("Pera", 55, 6);
        Productos produc2 = new Productos("Agua", 0, 20);
        Productos produc3 = new Productos("Pan Lactal", 230, 9);
        Productos produc4 = new Productos("Leche", 110, 10);

        //CREAMOS CLIENTES Y LOS AGREGAMOS AL CARRITO
        Cliente c1 = new Cliente("Pia", "Lavilla");


        c1.agregarProducto(produc1);
        c1.agregarProducto(produc2);
        c1.agregarProducto(produc3);
        c1.agregarProducto(produc4);


        //AGREGAMOS PRODUCTOS AL SUPERMERCADO
        Supermercado supers = new Supermercado(c1);
        supers.agregarProducto(produc);
        supers.agregarProducto(produc1);
        supers.agregarProducto(produc2);
        supers.agregarProducto(produc3);
        supers.agregarProducto(produc4);

        System.out.println("EL CLIENTE " + c1.getNombre() + " COMPRO:");

        //REALIZAMOS LA COMPRA DE LOS PRODUCTOS
        supers.realizarCompra("Agua");
        supers.realizarCompra("Queso");
        supers.realizarCompra("Manteca");
        supers.realizarCompra("Manteca");
        supers.realizarCompra("Manteca");

        System.out.println("------------------------");
        System.out.println("STOCK DEL SUPER");

        //MOSTRAMOS EL INVENTARIO Y EL STOCK
        supers.mostrar();
        System.out.println("---------------------");
        System.out.println("MONTO TOTAL GASTADO");
        //MOSTRAMOS EL MONTO QUE SE GASTO EN COMPRAR
        supers.montoTotal();


    }
}

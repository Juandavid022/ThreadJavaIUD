public class CashierProduct extends Thread {


    private String name;
    private CustomerProduct customer;
    private long initialTime;

    public CashierProduct(String names, CustomerProduct customers, long intialTime) {
        this.name = names;
        this.customer = customers;
        this.initialTime = intialTime;
    }

    @Override
    public void run() {
        System.out.println("La cajera " + this.name + " inicia la compra del cliente: "
                + this.customer.getName() + ". En: "
                + (System.currentTimeMillis() - this.initialTime)/1000
                + " seg" + "(" + (System.currentTimeMillis() - this.initialTime) + " ms)");

        int countCustomer = 1;
        for (Product product : customer.getProducts()) {
            this.esperarXsegundos();
            System.out.println("Procesado el producto " + product.getName()
                    + ", precio producto: " + product.getPrice()
                    + ", cantidad de productos: " + product.getQuantity()
                    + ", costo total del producto: $" + product.getQuantity() * product.getPrice()
                    + ", del cliente: " + this.customer.getName() + " --> Tiempo transacción: "
                    + (System.currentTimeMillis() - this.initialTime)/1000
                    + " seg " + "(" + (System.currentTimeMillis() - this.initialTime) + " ms)");
            countCustomer++;
        }
    }

    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}

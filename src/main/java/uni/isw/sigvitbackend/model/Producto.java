package uni.isw.sigvitbackend.model;

public class Producto {
    private int idProduct;
    private String descripcion;
    private String nombre;
    private double precio;
    private int stock;
    private Carrito carrito;
    private Almacen almacen;
    private LineaCompra lineaCompra;
    private Proveedor proveedor;

    public Producto(int idProduct, String descripcion, String nombre, double precio, int stock) {
        this.idProduct = idProduct;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public LineaCompra getLineaCompra() {
        return lineaCompra;
    }

    public void setLineaCompra(LineaCompra lineaCompra) {
        this.lineaCompra = lineaCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void mostrarDetalle(Producto producto) {
        System.out.println("Nombre del producto "+nombre);
        System.out.println("Precio del producto "+precio);
        System.out.println("Stock del producto "+stock);
        System.out.println("Descripcion del producto "+descripcion);
    }

    public void solicitarProducto(Producto producto){
        if(producto != null){
            System.out.println("Producto solicitado");
        }else{
            System.out.println("Ingrese producto");
        }
    }

    public int showStockProduct(Producto producto){
        return stock;
    }

    public boolean registrarProducto(Producto producto){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String buscarProducto(Producto producto){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

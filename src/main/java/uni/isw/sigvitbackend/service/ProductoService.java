package uni.isw.sigvitbackend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.isw.sigvitbackend.dto.ProductoRequest;
import uni.isw.sigvitbackend.dto.ProductoResponse;
import uni.isw.sigvitbackend.model.Categoria;
import uni.isw.sigvitbackend.model.Producto;
import uni.isw.sigvitbackend.model.Proveedor;
import uni.isw.sigvitbackend.repository.CategoriaRepository;
import uni.isw.sigvitbackend.repository.ProductoRepository;
import uni.isw.sigvitbackend.repository.ProveedorRepository;

/**
 *
 * @author user0
 */
@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;
    @Autowired
    ProveedorRepository proveedorRepository;
    @Autowired
    CategoriaRepository categoriaRepository;
    
    public List<ProductoResponse> listProductos(){
        return ProductoResponse.fromEntities(productoRepository.findAll());
    }
    public ProductoResponse findProducto(Long id){
        return ProductoResponse.fromEntity(productoRepository.findById(id).get());
    }
    public ProductoResponse insertProducto(ProductoRequest productoRequest){
        Proveedor proveedor = proveedorRepository.findById(productoRequest.getRucProveedor()).get();
        if(proveedor == null) return new ProductoResponse();
        
        long idCat = productoRequest.getIdCategoria();
        Categoria categoria = categoriaRepository.findById(idCat).get();
        if(categoria == null) return new ProductoResponse();
        
        Producto producto = new Producto(
                productoRequest.getIdProducto(),
                productoRequest.getDescripcion(),
                productoRequest.getNombre(),
                productoRequest.getPrecioVenta(),
                productoRequest.getPrecioCompra(),
                productoRequest.getStock(),
                proveedor,
                categoria
        );
        
        productoRepository.save(producto);
        ProductoResponse pr = ProductoResponse.fromEntity(producto);
        return pr;
    }
    public ProductoResponse updateProducto(ProductoRequest productoRequest){
        Producto producto = productoRepository.findById((long)productoRequest.getIdProducto()).orElse(null);
        if (producto == null) {
          return new ProductoResponse();
        }
        
        Proveedor proveedor = null;
        if (productoRequest.getRucProveedor()!= 0) {
            proveedor = proveedorRepository.findById((long)productoRequest.getRucProveedor()).orElse(null);
            if (proveedor == null) {
              return new ProductoResponse();
            }
        } else {
            proveedor = producto.getProveedor();
        }
        
        Categoria categoria = null;
        if (productoRequest.getIdCategoria() != 0) {
            long idCat = productoRequest.getIdCategoria();
            categoria = categoriaRepository.findById(idCat).orElse(null);
            if (categoria == null) {
              return new ProductoResponse();
            }
        } else {
            categoria = producto.getCategoria();
        }

        if (productoRequest.getDescripcion() != null && !productoRequest.getDescripcion().isEmpty()) {
          producto.setDescripcion(productoRequest.getDescripcion());
        }
        if (productoRequest.getNombre() != null && !productoRequest.getNombre().isEmpty()) {
          producto.setNombre(productoRequest.getNombre());
        }
        if (productoRequest.getPrecioVenta() > 0) {
          producto.setPrecioVenta(productoRequest.getPrecioVenta());
        }
        if (productoRequest.getPrecioCompra() > 0) {
          producto.setPrecioCompra(productoRequest.getPrecioCompra());
        }
        if (productoRequest.getStock() >= 0) {
          producto.setStock(productoRequest.getStock());
        }

        producto.setProveedor(proveedor);
        producto.setCategoria(categoria);

        productoRepository.save(producto);

        return ProductoResponse.fromEntity(producto);
    }
    public void deleteProducto(Long id){
        productoRepository.deleteById(id);
    }
}

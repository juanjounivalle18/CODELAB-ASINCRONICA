package com.springboot.producto;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productorService;

    public ProductoController(ProductoService productorService) {
        this.productorService = productorService;
    }

    @PostMapping("/enviar")
    public String enviarProductos(@RequestBody List<ProductoDTO> productos) {
        productorService.enviarListaProductos(productos);
        return "Productos enviados con éxito al pedido-service";
    }
}
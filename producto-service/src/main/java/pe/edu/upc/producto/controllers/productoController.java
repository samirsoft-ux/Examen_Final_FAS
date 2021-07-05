package pe.edu.upc.producto.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.producto.entities.producto;
import pe.edu.upc.producto.services.productoService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/productos")
public class productoController {
    @Autowired
    private productoService productoService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<producto>> fetchAll(){
        try {
            List<producto> productos = productoService.findAll();
            return new ResponseEntity<List<producto>>(productos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

package pe.edu.upc.producto.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.producto.entities.proveedor;
import pe.edu.upc.producto.services.proveedorService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/proveedores")
public class proveedorController {
    @Autowired
    private proveedorService proveedorService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<proveedor>> fetchAll(){
        try {
            List<proveedor> proveedors = proveedorService.findAll();
            return new ResponseEntity<List<proveedor>>(proveedors, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

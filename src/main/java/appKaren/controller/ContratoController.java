package appKaren.controller;

import appKaren.entity.ContratoEntity;
import appKaren.services.ContratoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contrato")
@CrossOrigin(origins = "*")
@Validated
@Slf4j
public class ContratoController {

    private final ContratoService _contratoService;

    public ContratoController(ContratoService contratoService) {
        _contratoService = contratoService;
    }

    // Agregar un nuevo contrato
    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public ContratoEntity createProduct(@RequestBody ContratoEntity contrato) {
        return _contratoService.newContrato(contrato);
    }

    @GetMapping(value = "/getAll")
    public List<ContratoEntity> getAllContratos (){
        return _contratoService.getAllContratos();
    }
}

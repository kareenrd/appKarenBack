package appKaren.controller;

import appKaren.entity.ContratoEntity;
import appKaren.services.ContratoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    public Page<ContratoEntity> getAllContratos (@RequestParam(defaultValue = "0") int page){
        Pageable pageable = PageRequest.of(page, 10);
        return _contratoService.getAllContratos(pageable);
    }
}

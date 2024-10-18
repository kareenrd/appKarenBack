package appKaren.services;

import appKaren.entity.ContratoEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContratoService {
    ContratoEntity newContrato(ContratoEntity contrato);
    List<ContratoEntity> getAllContratos();
}

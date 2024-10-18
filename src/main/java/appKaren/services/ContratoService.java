package appKaren.services;

import appKaren.entity.ContratoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContratoService {
    ContratoEntity newContrato(ContratoEntity contrato);
    Page<ContratoEntity> getAllContratos(Pageable pageable);
}

package appKaren.implement;

import appKaren.entity.ContratoEntity;
import appKaren.repository.ContratoRepository;
import appKaren.services.ContratoService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class ContratoImplement implements ContratoService {

    private final ContratoRepository _contratoRepository;

    @Override
    public ContratoEntity newContrato(ContratoEntity contrato) {
        log.info("contrato: "+contrato);
        contrato.setDate(new Date());

        return _contratoRepository.save(contrato);
    }

    @Override
    public List<ContratoEntity> getAllContratos() {
        return _contratoRepository.findAll();
    }
}

package pl.coderslab.charity.institution;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface InstitutionService{
    Optional<InstitutionDto> findInstitutionByName(String name);
    List<InstitutionDto> findAllInstitutions();
}

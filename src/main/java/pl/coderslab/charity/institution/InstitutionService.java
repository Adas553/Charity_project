package pl.coderslab.charity.institution;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface InstitutionService{
    Optional<Institution> findInstitutionByName(String name);
}

package pl.coderslab.charity.institution;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InstitutionServiceImpl implements InstitutionService {

    private final InstitutionRepository institutionRepository;

    public InstitutionServiceImpl(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }

    @Override
    public Optional<Institution> findInstitutionByName(String name) {
        return institutionRepository.findInstitutionByName(name);
    }
}

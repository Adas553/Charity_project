package pl.coderslab.charity.institution;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class InstitutionServiceImpl implements InstitutionService {

    private final InstitutionRepository institutionRepository;

    public InstitutionServiceImpl(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }

    @Override
    public Optional<InstitutionDto> findInstitutionByName(String name) {
        return institutionRepository.findInstitutionByName(name)
                .map(this::convertToInstitutionDto);
    }

    @Override
    public List<InstitutionDto> findAllInstitutions() {
        return institutionRepository.findAll()
                .stream()
                .map(this::convertToInstitutionDto)
                .collect(Collectors.toList());
    }

    public InstitutionDto convertToInstitutionDto(Institution institution) {
        InstitutionDto institutionDto = new InstitutionDto(
                institution.getName(),
                institution.getDescription()
        );

        return institutionDto;
    }
}

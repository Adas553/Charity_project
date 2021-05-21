package pl.coderslab.charity.donation;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DonationServiceImpl implements DonationService {

    private final DonationRepository donationRepository;

    public DonationServiceImpl(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @Override
    public List<DonationDto> findAllDonations() {
        return donationRepository.findAll()
                .stream()
                .map(this::convertToDonationDto)
                .collect(Collectors.toList());
    }

    @Override
    public Long numberOfQuantities() {
        return findAllDonations().stream()
                .map(DonationDto::getQuantity)
                .mapToLong(Integer::longValue)
                .sum();
    }

    @Override
    public Long numberOfDonations() {
        return findAllDonations().stream()
                .count();
    }

    public DonationDto convertToDonationDto(Donation donation) {
        DonationDto donationDto = new DonationDto();
        donationDto.setId(donation.getId());
        donationDto.setQuantity(donation.getQuantity());
        donationDto.setCategoryList(donation.getCategoryList()
        .stream()
        .map(x -> x.getId())
        .collect(Collectors.toList()));
        donationDto.setInstitution(donation.getInstitution().getId());
        donationDto.setStreet(donation.getStreet());
        donationDto.setCity(donation.getCity());
        donationDto.setZipCode(donationDto.getZipCode());
        donationDto.setPickUpDate(donation.getPickUpDate());
        donationDto.setPickUpTime(donation.getPickUpTime());
        donationDto.setPickUpComment(donation.getPickUpComment());

        return donationDto;
    }

}

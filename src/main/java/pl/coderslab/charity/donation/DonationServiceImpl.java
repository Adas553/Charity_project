package pl.coderslab.charity.donation;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.category.Category;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DonationServiceImpl implements DonationService {

    private final DonationRepository donationRepository;

    public DonationServiceImpl(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @Override
    public List<DonationDto> findSelectedDonations() {
       return donationRepository.findAll(PageRequest.of(0, 4))
        .map(this::convertToDonationDto)
        .getContent();
    }

    @Override
    public Long numberOfQuantities() {
        return findSelectedDonations()
                .stream()
                .map(DonationDto::getQuantity)
                .mapToLong(Integer::longValue)
                .sum();
    }

    @Override
    public Long numberOfDonations() {
        return donationRepository.numberOfBags();
    }



    public DonationDto convertToDonationDto(Donation donation) {
        DonationDto donationDto = new DonationDto();
        donationDto.setId(donation.getId());
        donationDto.setQuantity(donation.getQuantity());
        donationDto.setCategoryList(donation.getCategoryList()
        .stream()
        .map(Category::getId)
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

//    public Donation convertToDonation(DonationDto donationDto) {
//        Donation donation = new Donation();
//        donation.setId(donationDto.getId());
//        donation
//    }

}

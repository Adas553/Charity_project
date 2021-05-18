package pl.coderslab.charity.donation;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationServiceImpl implements DonationService {

    private final DonationRepository donationRepository;

    public DonationServiceImpl(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @Override
    public List<Donation> findAllDonations() {
        return donationRepository.findAll();
    }

    @Override
    public Long numberOfQuantities() {
        return findAllDonations().stream()
                .map(Donation::getQuantity)
                .mapToLong(Integer::longValue)
                .sum();
    }

    @Override
    public Long numberOfDonations() {
        return findAllDonations().stream()
                .count();
    }


}

package pl.coderslab.charity.donation;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DonationService {
    List<DonationDto> findAllDonations();
    Long numberOfQuantities();
    Long numberOfDonations();
}

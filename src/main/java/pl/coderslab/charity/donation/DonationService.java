package pl.coderslab.charity.donation;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DonationService {
    List<DonationDto> findSelectedDonations();
    Long numberOfQuantities();
    Long numberOfDonations();
}

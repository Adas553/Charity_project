package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.charity.donation.DonationDto;
import pl.coderslab.charity.donation.DonationService;

import javax.validation.Valid;

@Controller
public class DonationController {

    private final DonationService donationService;

    public DonationController(DonationService donationServiceImpl) {
        this.donationService = donationServiceImpl;
    }

    @GetMapping("/add")
    public String donationAction(Model model) {
        model.addAttribute("donatation", new DonationDto());
        return "form";
    }

    @PostMapping("/add")
    public String addDonation(@ModelAttribute("donation") @Valid DonationDto donationDto,
                               BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        donationService.add(donationDto);
        return "form";
    }
}

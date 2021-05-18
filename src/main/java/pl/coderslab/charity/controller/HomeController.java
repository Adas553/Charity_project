package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.charity.donation.DonationService;
import pl.coderslab.charity.institution.Institution;
import pl.coderslab.charity.institution.InstitutionService;

import java.util.List;


@Controller
public class HomeController {

    private final InstitutionService institutionService;
    private final DonationService donationService;

    public HomeController(InstitutionService institutionServiceImpl, DonationService donationService) {
        this.institutionService = institutionServiceImpl;
        this.donationService = donationService;
    }

    @GetMapping("/")
    public String homeAction(Model model) {
        List<Institution> institutions = institutionService.findAllInstitutions();
        Long quantities = donationService.numberOfQuantities();
        Long donations = donationService.numberOfDonations();
        model.addAttribute("institutions", institutions);
        model.addAttribute("quantities", quantities);
        model.addAttribute("donations", donations);
        return "index";
    }

//    @ModelAttribute("institutions")
//    public List<String> institutionList() {
//        return List.of("Fundacja \"Dbam o Zdrowie\"", "Fundacja \"Dla dzieci\"",
//                "Fundacja \"A kogo\"", "Fundacja \"Bez domu\"");
//    }
}

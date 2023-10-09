package hu.progmatic.accountapplication_1009.controller;

import hu.progmatic.accountapplication_1009.model.Owner;
import hu.progmatic.accountapplication_1009.service.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class OwnerController {
    private OwnerService ownerService;

    @GetMapping("/owners")
    public String getAllGuests(Model model) {
        model.addAttribute("owners", ownerService.getAllOwners());
        return "owners";
    }

    @GetMapping("/addOwner")
    public String addNewOwner(Model model) {
        model.addAttribute("newOwner", new Owner());
        return "addOwner";
    }

    @PostMapping("/addOwner")
    public String addNewOwner(@ModelAttribute("newOwner") Owner newOwner) {
        ownerService.addNewOwner(newOwner);
        return "redirect:/owners";
    }

    @GetMapping("/modifyName")
    public String modifyOwnerName() {
        return "modifyName";
    }

    @PostMapping("/modifyName")
    public String modifyOwnerName(@RequestParam("id") Long id,
                                  @RequestParam("name") String name) throws Exception {
        ownerService.modifyOwnerName(id, name);
        return "redirect:/owners";
    }

    @GetMapping("modifyOwnerEmail")
    public String modifyOwnerEmail() {
        return "modifyEmail";
    }

    @PostMapping("/modifyEmail")
    public String modifyOwnerEmail(@RequestParam("id") Long id,
                                   @RequestParam("email") String email) throws Exception {
        ownerService.modifyOwnerEmail(id, email);
        return "redirect:/owners";
    }

    @GetMapping("/deleteOwner")
    public String deleteOwner() {
        return "deleteOwner";
    }

    @PostMapping("/deleteOwner")
    public String deleteOwner(@RequestParam("id") Long id) {
        ownerService.deleteOwner(id);
        return "redirect:/owners";
    }

}

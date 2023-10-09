package hu.progmatic.accountapplication_1009.controller;

import hu.progmatic.accountapplication_1009.service.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class OwnerController {
    private OwnerService ownerService;


}

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CompanyController {

    @RequestMapping("/hellocompany")
    public String display(){
        return "companypage";
    }

}

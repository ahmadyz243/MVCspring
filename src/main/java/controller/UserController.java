package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String display(HttpServletRequest req, Model model){
        String name = req.getParameter("name"), password = req.getParameter("password");
        if (password.equals("admin")){
            String msg = "hello " + name;
            model.addAttribute("message", msg);
            return "viewpage";
        }else {
            String msg = "sorry " + name + " wrong password";
            model.addAttribute("message", msg);
            return "errorpage";
        }
    }

}

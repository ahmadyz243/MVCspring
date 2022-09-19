package controller;

import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
//@RequestMapping("/loginForm")
@Controller
public class UserController {

    @RequestMapping("/user")
    public String display(@RequestParam("name") String name, @RequestParam("password") String password, Model model){
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

    @RequestMapping("/signup")
    public String signup(Model model){

        User user = new User();
        model.addAttribute("user", user);

        return "signuppage";
    }

    @RequestMapping("/submitForm")
    public String submitForm(@ModelAttribute("user") User user){
        return "viewpage";
    }

}

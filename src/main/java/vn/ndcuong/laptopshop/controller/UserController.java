package vn.ndcuong.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.ndcuong.laptopshop.service.UserService;

@Controller // MVC
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        String ndcuong = this.userService.hanleHello();
        model.addAttribute("ndcuong", ndcuong);
        model.addAttribute("cuong", "from Model with controller");
        return "hello";
    }
}

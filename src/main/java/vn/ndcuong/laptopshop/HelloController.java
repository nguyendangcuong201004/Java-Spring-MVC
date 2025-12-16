package vn.ndcuong.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Nguyen Dang Cuong";
    }

    @GetMapping("/user")
    public String userPage() {
        return "User Page";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Admin Page";
    }
}

package demo.myspring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello(ModelMap map) {
    	map.addAttribute("hello","Hello Spring boot attribute");
        return new ModelAndView("hello"); // 根據view resolver mapping至hello.jsp
    }
}

package institute.ims;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IsmApplicationController {

    @GetMapping("/index")
    public String showHome(){
        return "index";
    }
    @GetMapping("/about")
    public String aboutUs(){
        return"about";
    }
    @GetMapping("/contact")
    public String contactUs(){
        return"contact";
    }
    @GetMapping("/course-details")
    public String courseDetails(){
        return"coourse-details";
    }
    @GetMapping("/courses")
    public String coursesOffered(){
        return"courses";
    }
    @GetMapping("/events")
    public String ourEvents(){
        return"events";
    }
}

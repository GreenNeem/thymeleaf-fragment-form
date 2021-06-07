package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.MyMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")
//@RequestMapping("")
public class HelloController{

    // private PostMapping postMapping;

    // public HelloController(PostMapping postMapping) {
	// 	this.postMapping = postMapping;
    // }
    //@Autowired
    // private PostMapping postMapping;

    // public HelloController(PostMapping postMapping){
    //     this.postMapping = postMapping;
    // }

    //@RequestMapping("/api/people")
    @GetMapping("/api/people")
    public String index(Model model){
        model.addAttribute("msg", "hello message");
        MyMap mymap = new MyMap();
        mymap.setName(null);
        mymap.setMessage(null);
        model.addAttribute("myMap",mymap);
        return "home";
    }

    @PostMapping("/api/doSubmit")
    public String doSubmit(@ModelAttribute MyMap mymap, Model model) {
        System.out.print("MyMap-name: "+mymap.getName());
        System.out.print("MyMap-message: "+mymap.getMessage());
        return "home";
    }
    

}
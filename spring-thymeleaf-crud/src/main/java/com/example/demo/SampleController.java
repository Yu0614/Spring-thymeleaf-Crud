package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/sample")
public class SampleController {

	 @RequestMapping(method = RequestMethod.GET)
	    public String test(Model model) {
	        model.addAttribute("name", "草苅API");
	        model.addAttribute("get", "GET /sample");
	        model.addAttribute("post", "POST /sample");
	        return "sample/index";
	    }


}

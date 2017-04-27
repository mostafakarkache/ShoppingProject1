package org.mostafa.onlineshopping;

 import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	
	@RequestMapping(value={"/","/index","/home"})
	public ModelAndView index(){
		System.out.println("inside index()");
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title", "home");
			mv.addObject("UserClickHome", true);
			return mv;
		}
	@RequestMapping("/about")
	public ModelAndView about(){
		System.out.println("inside index()");
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title", "About Us");
			mv.addObject("UserClickAbout", true);
			return mv;
		}
	@RequestMapping("/contact")
	public ModelAndView contact(){
		System.out.println("inside index()");
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title", "Contact Us");
			mv.addObject("UserClickContact", true);
			return mv;
		}
}
/*	@RequestMapping(value={"/test","/sayHi","/salut"})
	public ModelAndView indexx(@RequestParam(value="greetings",required=false) String greetings){
		 if(greetings==null){
			 greetings = "sup";
		 }
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("greeting", greetings);
			return mv;
		}
	}*/
	
/*		@RequestMapping(value="/test/{greetings}")
	public ModelAndView indexx(@PathVariable("greetings") String greetings){
		 if(greetings==null){
			 greetings = "sup";
		 }
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("greeting", greetings);
			return mv;
		}
	}*/
 

/*import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class PageController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("msg", "hello world");

		return model;
	 
}*/
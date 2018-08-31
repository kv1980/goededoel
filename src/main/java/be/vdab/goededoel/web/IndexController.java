package be.vdab.goededoel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import be.vdab.goededoel.entities.GoedeDoel;

@Controller
@RequestMapping("/")
class IndexController {
	private static final String VIEW = "index";

	@GetMapping
	ModelAndView index() {
		return new ModelAndView(VIEW, "doel", new GoedeDoel("CliniClowns"));
	}
}

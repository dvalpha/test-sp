package dvalphatest.dvalphatest.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mockito.Mockito;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

	@RequestMapping(value = { "/mai" })
	public ModelAndView main(HttpServletResponse response, HttpServletRequest request) throws IOException {
		System.out.println("Llega al controladorw");
    return new ModelAndView("/home");
	}

}

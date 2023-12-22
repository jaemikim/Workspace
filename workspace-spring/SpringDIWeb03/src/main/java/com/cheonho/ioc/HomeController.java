package com.cheonho.ioc;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	WebApplicationContext servletAC;    // Servlet AC
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request, Locale locale, Model model) {
		ServletContext sc = request.getSession().getServletContext();
		WebApplicationContext rootAC = WebApplicationContextUtils.getWebApplicationContext(sc);   // Root AC
		
		System.out.println("WebApplicationContext = " + rootAC);
		System.out.println("servletAC = " + servletAC);
		
		System.out.println("rootAC.getBeanDefinitionNames() = " + Arrays.toString(rootAC.getBeanDefinitionNames()));		
		System.out.println("rootAC.getBeanDefinitionCount() =" + rootAC.getBeanDefinitionCount());		
		
		System.out.println("servletAC.getBeanDefinitionNames()"  + Arrays.toString(servletAC.getBeanDefinitionNames()));
		System.out.println("servletAC.getBeanDefinitionCount() =" + servletAC.getBeanDefinitionCount());
		
		System.out.println("(servletAC.getParent() == rootAC) =" + (servletAC.getParent() == rootAC));
		
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}

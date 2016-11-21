package com.moonlight.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("LoginViewController")
public class MainController {
	@RequestMapping("getTourPromotion")
	public void onSubmit(HttpServletRequest request,HttpServletResponse response){
		
		try {
			response.getWriter().print("8888888888");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

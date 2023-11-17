package kr.co.himedia.servlet02;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/november/firstday")   //http://localhost:8080/Chap01/november/firstday 내용확인 
public class AnnoMappingServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("@WebServlet 애너테이션으로 매핑");
	}

	
}

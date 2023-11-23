package kr.co.himedia.controller;

import java.io.IOException;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servelt/lifecycle.do")
public class lifeCycleServlet extends HttpServlet {
	
	@PostConstruct
	public void hiPostConstruce() {
		System.out.println("hiPostConstruce() 전처리 함수 호출");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init() 호출");
	}
	
//	@Override
//	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
//		System.out.println("service() 호출");
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGot() 호출");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost() 호출");
	}

	@Override
	public void destroy() {
		System.out.println("destroy() 호출");
	}
	
	@PreDestroy
	public void hiPreDestroy() {
		System.out.println("hiPreDestroy() 후처리 함수 호출");
	}
}

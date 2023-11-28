package kr.co.himedia.mvcboard;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.himedia.fileupload.FileUtility;

public class WriteController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/mvcBoard/write.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.파일 업로드 처리
		// 업로드 디렉토리 물리적 경로 설저
		String saveDirectory = request.getServletContext().getRealPath("/Uploads");
		String originalFileName = "";
		
		try {
			originalFileName = FileUtility.uploadFile(request, saveDirectory);
		} catch (Exception e) {
			
		}
		
		// 2.파일 업로드 외 처리
		
	}
	
	
}

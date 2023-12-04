package kr.co.mvcweb.mvcboard;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.mvcweb.fileupload.FileUtility;

@WebServlet("/mvcwebboard/download.do")
public class DownloadController extends HttpServlet {	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("다운로드 컨트롤러");
		
		String ofile = request.getParameter("ofile");     // 원본 파일명
		String sfile = request.getParameter("sfile");	  // 저장된 파일명
		String id = request.getParameter("id");			  // 게시물 일련번호
		
		// 파일 다운로드
		FileUtility.download(request, response, "/Uploads", sfile, ofile);
		
		//해당 게시물의 다운로드 수 1 증가
		MvcBoardDAO dao = new MvcBoardDAO();
		dao.downloadCount(id);
		dao.close();
	}
}

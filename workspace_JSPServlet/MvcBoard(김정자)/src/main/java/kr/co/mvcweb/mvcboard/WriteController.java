package kr.co.mvcweb.mvcboard;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.mvcweb.fileupload.FileUtility;
import kr.co.mvcweb.utils.JSFunction;

public class WriteController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/mvcWebBoard/write.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String saveDirectory = request.getServletContext().getRealPath("/Uploads");
		String originalFileName = "";
		
		try {
			originalFileName = FileUtility.uploadFile(request, saveDirectory);
		} catch (Exception e) {
			JSFunction.alertLocation(response,"파일 업로드 오류입니다.", "../mvcwebboard/write.do");
			return;
		}
		

		MvcBoardDTO dto = new MvcBoardDTO();

		dto.setName(request.getParameter("name"));
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		dto.setPass(request.getParameter("pass"));
		

		if (originalFileName != "") {

			String savedFileName = FileUtility.renameFile(saveDirectory, originalFileName);
			
			dto.setOfile(originalFileName);  
			dto.setSfile(savedFileName);     		
		}
		

		MvcBoardDAO dao = new MvcBoardDAO();
		int result = dao.insertWrite(dto);
		dao.close();
		
		
		if(result == 1)    
			response.sendRedirect("../mvcwebboard/list.do");
		else				 
			JSFunction.alertLocation(response, "글쓰기에 실패했습니다", "../mvcwebboard/write.do");
	}
	
	
}

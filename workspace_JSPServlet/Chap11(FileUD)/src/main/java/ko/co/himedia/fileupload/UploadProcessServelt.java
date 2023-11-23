package ko.co.himedia.fileupload;
import java.io.IOException;

import jakarta.servlet.ServletException;
/*
 * @MultipartConfig
 * - 파일업로드 처리위한 서블릿 구성 애너테이션임
 * - 멀티파트 요청을 처리
 * - Part 객체를 사용하여 업로드된 파일의 정보에 접근 할 수 있음
 * - maxFileSize : 업로드 할 개별 파일의 최대 크기 (1MB)
 * - maxRequestSize : 멀티파트 요청에 포함된 전체 파일 크기 (10MB)
 */
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/fileupload/uploadProcess.do")
@MultipartConfig(
		maxFileSize = 1024 * 1024 * 1, 
		maxRequestSize = 1024 * 1024 * 10
)
public class UploadProcessServelt extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("here!!");
	}
}

package kr.co.mvcweb.mvcboard;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.mvcweb.utils.BoardPage;

public class ListController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MvcBoardDAO dao = new MvcBoardDAO();
		
		Map<String, Object> map = new HashMap<>();
		String searchField = request.getParameter("searchField");
		String searchWord = request.getParameter("searchWord");
		
		if (searchWord != null ) {
			map.put("searchField", searchField);
			map.put("searchWord", searchWord);
		}
		
		int totalCount = dao.selectCount(map);
		
		ServletContext application = getServletContext();
		int pageSize = Integer.parseInt(application.getInitParameter("POSTS_PER_PAGE"));
		int blockPage = Integer.parseInt(application.getInitParameter("PAGES_PER_BLOCK"));
		
		int pageNum = 1;
		String pageTemp = request.getParameter("pageNum");
		if (pageTemp != null && pageTemp.equals("")) {
			pageNum = Integer.parseInt(pageTemp);      
		}
		
		int start = (pageNum -1) * pageSize + 1;    
		int end = pageNum * pageSize;               
		map.put("start", start);
		map.put("end", end);
		
		List<MvcBoardDTO> boardLists = dao.selectListPage(map);	
		dao.close();  
		
		String pagingData = BoardPage.pagingStr(totalCount, pageSize, blockPage, pageNum, "../mvcwebboard/list.do");
		map.put("pagingData", pagingData);
		map.put("totalCount", totalCount);
		map.put("pageSize", pageSize);
		map.put("pageNum", pageNum);
				
		request.setAttribute("boardLists", boardLists);
		request.setAttribute("map", map);
		request.getRequestDispatcher("/mvcWebBoard/list.jsp").forward(request, response);
	}
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.15
 * Generated at: 2023-11-16 06:40:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import kr.co.himedia.board.BoardDAO;
import kr.co.himedia.board.BoardDTO;
import kr.co.himedia.board.JSFunction;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/./isLoginedln.jsp", Long.valueOf(1700098221757L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("kr.co.himedia.board.BoardDAO");
    _jspx_imports_classes.add("kr.co.himedia.board.JSFunction");
    _jspx_imports_classes.add("kr.co.himedia.board.BoardDTO");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	if(session.getAttribute("userId") == null) {  //session 영역에 "userId"라는 속성값이 있는지 확인 => null이면 로그인하지 않았다는 의미임
		JSFunction.alertLocation("로그인 후 이동", "./session02/loginForm.jsp", out);
		return;			//
	}

      out.write('\r');
      out.write('\n');
      out.write("  <!-- 로그인 확인 -->\r\n");

	String num = request.getParameter("num");   //일련번호 받기
	BoardDAO dao = new BoardDAO(application);   //DAO 생성	
	BoardDTO dto = dao.selectView(num);			//게시물 가져오기
	
	String userId = session.getAttribute("userId").toString();
	if (!userId.equals(dto.getId())) {		    //본인인지 확인하기 
		JSFunction.alertBack("작성자 본인만 수정할 수 있습니다", out);
	}
	dao.close();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>수정하기</title>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("	function validateForm(form) {\r\n");
      out.write("		if(form.title.value == \"\") {\r\n");
      out.write("			alert(\"제목을 입력하세요\");\r\n");
      out.write("			form.title.focus();\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("	}	\r\n");
      out.write("  	function validateForm(form) {\r\n");
      out.write("		if(form.content.value == \"\") {\r\n");
      out.write("			alert(\"내용을 입력하세요\");\r\n");
      out.write("			form.content.focus();\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./common/headerLink.jsp", out, false);
      out.write("  <!-- 공통 링크 -->\r\n");
      out.write("	<h2>게시판 - 수정하기</h2>\r\n");
      out.write("	<form action=\"editProcess.jsp\" name = \"editFrm\" method=\"post\" onsubmit=\"return validateForm(this);\">\r\n");
      out.write("		<input type = \"hidden\" name = \"num\" value = \"");
      out.print( dto.getNum() );
      out.write("\" />\r\n");
      out.write("		<table border = \"1\"  width =\"90%\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>제목</td>\r\n");
      out.write("				<td>\r\n");
      out.write("					<input type =\"text\" name =\"title\" style=\"width:90%;\" value =\"");
      out.print( dto.getTitle());
      out.write("\" />\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>		\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

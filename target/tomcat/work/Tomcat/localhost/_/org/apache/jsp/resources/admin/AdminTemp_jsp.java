/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-10-17 07:32:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.resources.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminTemp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(request.getContextPath());
      out.write("/\"/>\r\n");
      out.write("  <title>都市信息网-后台管理</title>\r\n");
      out.write("  <link type=\"text/css\" rel=\"stylesheet\" href=\"resources/css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("   \r\n");
      out.write("        <table border=\"0\" width=\"920\" cellspacing=\"0\" height=\"auto\" bgcolor=\"white\" align=\"center\" >\r\n");
      out.write("\t\t\t<!-- 页眉 -->\r\n");
      out.write("            <tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t<iframe src=\"resources/admin/top.jsp\" frameBorder=\"0\" width=\"920\" scrolling=\"no\" height=\"100\" ></iframe>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<!-- 分隔行 -->\r\n");
      out.write("            <tr height=\"10\" bgcolor=\"lightgrey\">\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<!-- 内容区域 -->\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"700\" align=\"center\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- main -->\r\n");
      out.write("\t\t\t\t\t<iframe src=\"resources/admin/main.jsp\" frameBorder=\"0\" width=\"688\" scrolling=\"no\" height=\"400\" ></iframe>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td width=\"200\" align=\"center\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- 右侧栏 -->\r\n");
      out.write("\t\t\t\t\t<iframe src=\"resources/admin/right.jsp\" frameBorder=\"0\" width=\"240\" scrolling=\"no\" height=\"570\" ></iframe>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\t\t\t<!-- 分隔行 -->\r\n");
      out.write("\t\t\t<tr height=\"10\" bgcolor=\"lightgrey\">\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<!-- 页脚 -->\r\n");
      out.write("            <tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t<iframe src=\"resources/admin/end.jsp\" frameBorder=\"0\" width=\"920\" scrolling=\"no\" height=\"70\" style=\"margin-top:0\"></iframe>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("        </table>        \r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

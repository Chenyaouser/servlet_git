/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-10-17 08:01:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.resources.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class right_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<title>后台-侧栏</title>\r\n");
      out.write("  <link type=\"text/css\" rel=\"stylesheet\" href=\"../css/style.css\">\r\n");
      out.write("  <script language=\"javascript\" type=\"text/javascript\" src=\"../js/My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"../images/back.gif\" style=\"background-color:white\">\r\n");
      out.write("    <center>\r\n");
      out.write("   \r\n");
      out.write("        <table border=\"0\" width=\"220\" height=\"auto\" cellspacing=\"0\" cellpadding=\"0\" style=\"margin-top:7;background-color:white\">\r\n");
      out.write("            <!-- 显示方式 -->\r\n");
      out.write("            \r\n");
      out.write("            <tr>欢迎 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("登录</tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr height=\"30\" bgcolor=\"#F0F0F0\"><td style=\"text-indent:5\" style=\"border:1 solid\"><font color=\"#004790\"><b>■用户管理</b></font></td></tr>\r\n");
      out.write("            <tr height=\"1\"><td></td></tr>\r\n");
      out.write("            <form action=\"/userSelectServlet\" method=\"post\" target=\"default\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"center\" valign=\"top\" style=\"border:1 solid\">\r\n");
      out.write("                    <table border=\"0\" width=\"220\" height=\"80\" cellspacing=\"0\"  style=\"font-size:12px\">\r\n");
      out.write("                        <tr height=\"25\"><td align=\"center\" valign=\"bottom\">请输入要查询的用户ID：</td></tr>\r\n");
      out.write("                        <tr height=\"40\">\r\n");
      out.write("                            <td align=\"center\">\r\n");
      out.write("                                <input type=\"text\" name=\"userid\" value=\"\" size=\"24\"/>\r\n");
      out.write("                                <input type=\"submit\" value=\"查询\"/>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </form>\r\n");
      out.write("            \r\n");
      out.write("            <tr height=\"30\" bgcolor=\"#F0F0F0\"><td style=\"text-indent:5px;border:1px solid \"><font color=\"#004790\"><b>■显示方式</b></font></td></tr>\r\n");
      out.write("            <tr height=\"1\"><td></td></tr>\r\n");
      out.write("            <form id=\"admin_ListShow_action?\" name=\"admin_ListShow_action?\" action=\"infoListServlet\" method=\"post\" target=\"default\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"center\" valign=\"top\" style=\"border:1px solid\">\r\n");
      out.write("                    <table border=\"0\" width=\"215\" height=\"150\" cellspacing=\"0\" style=\"font-size:12px\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td align=\"center\" colspan=\"2\">\r\n");
      out.write("                                <fieldset style=\"height:60px;width:200px\">\r\n");
      out.write("                                  <legend>★付费状态</legend>\r\n");
      out.write("                                  <br>\r\n");
      out.write("                                  <input type=\"radio\" name=\"infopaystate\" id=\"payforType0\" value=\"0\" checked=\"checked\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <label for=\"payforType0\">未付费</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"infopaystate\" id=\"payforType1\" value=\"1\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"payforType1\">已付费</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"infopaystate\" id=\"payforTypeall\" value=\"all\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"payforTypeall\">全部</label>\r\n");
      out.write("\r\n");
      out.write("                                </fieldset>\r\n");
      out.write("                                <fieldset style=\"height:60px;width:200px\">\r\n");
      out.write("                                  <legend>★审核状态</legend>\r\n");
      out.write("                                  <br>\r\n");
      out.write("                                  <input type=\"radio\" name=\"infocheckstate\" id=\"stateType0\" value=\"0\" checked=\"checked\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <label for=\"stateType0\">未审核</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"infocheckstate\" id=\"stateType1\" value=\"1\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"stateType1\">已审核</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"infocheckstate\" id=\"stateTypeall\" value=\"all\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"stateTypeall\">全部</label>\r\n");
      out.write("\r\n");
      out.write("                                </fieldset>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr align=\"center\" height=\"30\" bgcolor=\"lightgrey\">\r\n");
      out.write("                            <td>\r\n");
      out.write("                               信息类别：\r\n");
      out.write("                               \r\n");
      out.write("                                   <select name=\"infotypeid\" id=\"infoType\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">招聘信息</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">培训信息</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"3\">房屋信息</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"4\">求购信息</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"5\">招商引资</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"6\">公寓信息</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"7\">求职信息</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"8\">家教信息</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"9\">车辆信息</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"10\">出售信息</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"11\">寻找启示</option>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("                               <input type=\"submit\" id=\"admin_ListShow_action?_0\" value=\"显示\"/>\r\n");
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        \r\n");
      out.write("                    </table>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("            <tr height=\"5\"><td></td></tr>\r\n");
      out.write("            <!-- 设置已付费信息 -->            \r\n");
      out.write("            <tr height=\"30\" bgcolor=\"#F0F0F0\"><td style=\"text-indent:5px\" style=\"border:1px solid\"><font color=\"#004790\"><b>■付费设置</b></font></td></tr>\r\n");
      out.write("            <tr height=\"1\"><td></td></tr>\r\n");
      out.write("            <form action=\"searchInfoByIdServlet\" method=\"post\" target=\"default\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"center\" valign=\"top\" style=\"border:1px solid\">\r\n");
      out.write("                    <table border=\"0\" width=\"220\" height=\"80\" cellspacing=\"0\"  style=\"font-size:12px\">\r\n");
      out.write("                        <tr height=\"25\"><td align=\"center\" valign=\"bottom\">请输入要设为已付费状态的信息ID：</td></tr>\r\n");
      out.write("                        <tr height=\"40\">\r\n");
      out.write("                            <td align=\"center\">\r\n");
      out.write("                                <input type=\"text\" name=\"infoid\" value=\"\" size=\"24\"/>\r\n");
      out.write("                                <input type=\"submit\" value=\"查询\"/>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </form>\r\n");
      out.write("        </table>        \r\n");
      out.write("    </center>\r\n");
      out.write("</body>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tWdatePicker({eCont:'div1'})\r\n");
      out.write("\t</script>\r\n");
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

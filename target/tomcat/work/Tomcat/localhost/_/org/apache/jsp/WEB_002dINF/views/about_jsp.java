/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-13 16:35:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>About</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h1>Spring MVC</h1>\n");
      out.write("\t<hr>\n");
      out.write("\t<p>The Spring Framework is an application framework and inversion\n");
      out.write("\t\tof control container for the Java platform. The framework's core\n");
      out.write("\t\tfeatures can be used by any Java application, but there are extensions\n");
      out.write("\t\tfor building web applications on top of the Java EE (Enterprise\n");
      out.write("\t\tEdition) platform. Although the framework does not impose any specific\n");
      out.write("\t\tprogramming model, it has become popular in the Java community as an\n");
      out.write("\t\taddition to, or even replacement for the Enterprise JavaBeans (EJB)\n");
      out.write("\t\tmodel. The Spring Framework is open source.</p>\n");
      out.write("\t<h1>Modules</h1>\n");
      out.write("\t<hr>\n");
      out.write("\t<p>The Spring Framework includes several modules that provide a\n");
      out.write("\t\trange of services: Spring Core Container: this is the base module of\n");
      out.write("\t\tSpring and provides spring containers (BeanFactory and\n");
      out.write("\t\tApplicationContext).[11] Aspect-oriented programming: enables\n");
      out.write("\t\timplementing cross-cutting concerns. Authentication and authorization:\n");
      out.write("\t\tconfigurable security processes that support a range of standards,\n");
      out.write("\t\tprotocols, tools and practices via the Spring Security sub-project\n");
      out.write("\t\t(formerly Acegi Security System for Spring). Convention over\n");
      out.write("\t\tconfiguration: a rapid application development solution for\n");
      out.write("\t\tSpring-based enterprise applications is offered in the Spring Roo\n");
      out.write("\t\tmodule Data access: working with relational database management\n");
      out.write("\t\tsystems on the Java platform using Java Database Connectivity (JDBC)\n");
      out.write("\t\tand object-relational mapping tools and with NoSQL databases Inversion\n");
      out.write("\t\tof control container: configuration of application components and\n");
      out.write("\t\tlifecycle management of Java objects, done mainly via dependency\n");
      out.write("\t\tinjection Messaging: configurative registration of message listener\n");
      out.write("\t\tobjects for transparent message-consumption from message queues via\n");
      out.write("\t\tJava Message Service (JMS), improvement of message sending over\n");
      out.write("\t\tstandard JMS APIs Model–view–controller: an HTTP- and servlet-based\n");
      out.write("\t\tframework providing hooks for extension and customization for web\n");
      out.write("\t\tapplications and RESTful (representational state transfer) Web\n");
      out.write("\t\tservices. Remote access framework: configurative remote procedure call\n");
      out.write("\t\t(RPC)-style marshalling of Java objects over networks supporting Java\n");
      out.write("\t\tremote method invocation (RMI), CORBA (Common Object Request Broker\n");
      out.write("\t\tArchitecture) and HTTP-based protocols including Web services (SOAP\n");
      out.write("\t\t(Simple Object Access Protocol)) Transaction management: unifies\n");
      out.write("\t\tseveral transaction management APIs and coordinates transactions for\n");
      out.write("\t\tJava objects Remote management: configurative exposure and management\n");
      out.write("\t\tof Java objects for local or remote configuration via Java Management\n");
      out.write("\t\tExtensions (JMX) Testing: support classes for writing unit tests and\n");
      out.write("\t\tintegration tests</p>\n");
      out.write("</body>\n");
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
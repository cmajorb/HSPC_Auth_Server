/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.5.v20170502
 * Generated at: 2017-06-12 17:50:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.springframework.security.web.savedrequest.DefaultSavedRequest;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:trim", org.apache.taglibs.standard.functions.Functions.class, "trim", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(9);
    _jspx_dependants.put("/WEB-INF/tags/header.tag", Long.valueOf(1496321350000L));
    _jspx_dependants.put("jar:file:/Users/Debbie/Desktop/Major/hspconsortium-reference-auth-980c6e0c6685/reference-auth-server-ldap-webapp/target/tmp/hspc-reference-auth-server-webapp-1_7_0-SNAPSHOT_war1/WEB-INF/lib/spring-security-taglibs-3.2.7.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1427341356000L));
    _jspx_dependants.put("file:/Users/Debbie/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1496285112000L));
    _jspx_dependants.put("jar:file:/Users/Debbie/Desktop/Major/hspconsortium-reference-auth-980c6e0c6685/reference-auth-server-ldap-webapp/target/tmp/hspc-reference-auth-server-webapp-1_7_0-SNAPSHOT_war1/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153410282000L));
    _jspx_dependants.put("jar:file:/Users/Debbie/.m2/repository/org/springframework/spring-webmvc/4.1.7.RELEASE/spring-webmvc-4.1.7.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1435682828000L));
    _jspx_dependants.put("jar:file:/Users/Debbie/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1426003870000L));
    _jspx_dependants.put("file:/Users/Debbie/.m2/repository/org/springframework/spring-webmvc/4.1.7.RELEASE/spring-webmvc-4.1.7.RELEASE.jar", Long.valueOf(1497287820000L));
    _jspx_dependants.put("file:/Users/Debbie/Desktop/Major/hspconsortium-reference-auth-980c6e0c6685/reference-auth-server-ldap-webapp/target/tmp/hspc-reference-auth-server-webapp-1_7_0-SNAPSHOT_war1/WEB-INF/lib/spring-security-taglibs-3.2.7.RELEASE.jar", Long.valueOf(1436490830000L));
    _jspx_dependants.put("file:/Users/Debbie/Desktop/Major/hspconsortium-reference-auth-980c6e0c6685/reference-auth-server-ldap-webapp/target/tmp/hspc-reference-auth-server-webapp-1_7_0-SNAPSHOT_war1/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1392357078000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.springframework.security.web.savedrequest.DefaultSavedRequest");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005feval_0026_005fexpression_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fexpression_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005feval_0026_005fexpression_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


    DefaultSavedRequest savedRequest = null;
    if (session.getAttribute("SPRING_SECURITY_SAVED_REQUEST") != null)
        savedRequest = (DefaultSavedRequest) session.getAttribute("SPRING_SECURITY_SAVED_REQUEST");

      if (_jspx_meth_o_005fheader_005f0(_jspx_page_context))
        return;
      out.write("<link rel=\"stylesheet\" href=\"static/css/app.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    <!--\n");
      out.write("\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        // select the appropriate field based on context\n");
      out.write("        $('#");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("').focus();\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    //-->\n");
      out.write("</script>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <div class=\"row-fluid\">\n");
      out.write("        <div id=\"errors\" class=\"span8 offset2\">\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container-fluid full-screen login-form\">\n");
      out.write("\n");
      out.write("    <div class=\"row-fluid\">\n");
      out.write("        <div class=\"span4 offset4\">\n");
      out.write("\n");
      out.write("            <form id=\"loginForm\" name=\"loginForm\" action=\"");
      out.print(request.getContextPath());
      out.write("/j_spring_security_check\"\n");
      out.write("                  method=\"POST\">\n");
      out.write("                <div>\n");
      out.write("                    <img src=\"static/images/company-logo.png\"/>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"input-prepend input-block-level\">\n");
      out.write("                        <span class=\"add-on\"><i class=\"icon-user\"></i></span>\n");
      out.write("                        <input type=\"text\" placeholder=\"Email Address\" autocorrect=\"off\" autocapitalize=\"off\" required\n");
      out.write("                               autocomplete=\"off\" spellcheck=\"false\" value=\"");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("                               id=\"j_username\" name=\"j_username\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"input-prepend input-block-level\">\n");
      out.write("                        <span class=\"add-on\"><i class=\"icon-lock\"></i></span>\n");
      out.write("                        <input type=\"password\" placeholder=\"Password\" autocorrect=\"off\" autocapitalize=\"off\" required\n");
      out.write("                               autocomplete=\"off\" spellcheck=\"false\" id=\"j_password\" name=\"j_password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <input id=\"redirectUrl\" type=\"hidden\" name=\"redirectUrl\"\n");
      out.write("                       value=\"");
      out.print( savedRequest == null ? "" : savedRequest.getRequestURL() + "?" + savedRequest.getQueryString() );
      out.write("\"/>\n");
      out.write("                <div>\n");
      out.write("                    <input id=\"submitButton\" type=\"submit\" class=\"btn-block login-form-btn\" value=\"Sign in\" name=\"submit\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("\t\t\t\t\t<span class=\"help-block pull-left\">\n");
      out.write("                        ");
      if (_jspx_meth_spring_005feval_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("                    <span class=\"help-block pull-right\">\n");
      out.write("                        ");
      if (_jspx_meth_spring_005feval_005f1(_jspx_page_context))
        return;
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <!-- a little space -->\n");
      out.write("        <div class=\"span12\" style=\"height:50px;\"></div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var personaAttemptFailed = false;\n");
      out.write("\n");
      out.write("    $('#loginForm').submit(function (e) {\n");
      out.write("        var username = $('#j_username').val();\n");
      out.write("        var password = $('#j_password').val();\n");
      out.write("\n");
      out.write("        if (username && username.length && looksLikePersona(username)) {\n");
      out.write("            e.preventDefault();\n");
      out.write("            var personaAuthEndpoint = \"");
      if (_jspx_meth_spring_005feval_005f2(_jspx_page_context))
        return;
      if (_jspx_meth_spring_005feval_005f3(_jspx_page_context))
        return;
      out.write("\";\n");
      out.write("\n");
      out.write("            $.ajax({\n");
      out.write("                type: \"POST\",\n");
      out.write("                url: personaAuthEndpoint,\n");
      out.write("                data: JSON.stringify({\n");
      out.write("                    \"username\": username,\n");
      out.write("                    \"password\": password\n");
      out.write("                }),\n");
      out.write("                contentType: \"application/json; charset=utf-8\",\n");
      out.write("                dataType: \"json\",\n");
      out.write("                success: personaAuthResponse,\n");
      out.write("                error: personaAuthFailure\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    function looksLikePersona(username){\n");
      out.write("        var personaRegex = /^[a-zA-Z0-9]{1,50}@[a-zA-Z0-9]{1,20}$/;\n");
      out.write("        return !personaAttemptFailed && username.match(personaRegex) !== null;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function personaAuthResponse(response) {\n");
      out.write("        if (!response.jwt || response.jwt.length < 1) {\n");
      out.write("            updateErrorMessage(\"Error authenticating persona user.\");\n");
      out.write("            return;\n");
      out.write("        }\n");
      out.write("        // add persona cookie & remove session cookie\n");
      out.write("        document.cookie = \"hspc-persona-token=\" + response.jwt + \"; expires=\" + (new Date((new Date()).getTime() + 3 * 60000)).toUTCString() + \"; Path=/;\";\n");
      out.write("        // forward to authorize endpoint\n");
      out.write("        var redirectUrl = $('#redirectUrl').val();\n");
      out.write("        window.location = redirectUrl + \"&cache=clear\";\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function personaAuthFailure(response) {\n");
      out.write("        // persona auth failed, try logging in as a real user\n");
      out.write("        personaAttemptFailed = true;\n");
      out.write("        $('#submitButton').click();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function updateErrorMessage(message) {\n");
      out.write("        if ($('div.alert').length)\n");
      out.write("            $('div.alert').remove();\n");
      out.write("\n");
      out.write("        $('#errors').append(\"<div class='alert alert-error'>\" + message + \"</div>\");\n");
      out.write("    }\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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

  private boolean _jspx_meth_o_005fheader_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  o:header
    org.apache.jsp.tag.web.header_tag _jspx_th_o_005fheader_005f0 = (new org.apache.jsp.tag.web.header_tag());
    _jsp_getInstanceManager().newInstance(_jspx_th_o_005fheader_005f0);
    _jspx_th_o_005fheader_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/login.jsp(14,0) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_o_005fheader_005f0.setTitle("Log In");
    _jspx_th_o_005fheader_005f0.doTag();
    _jsp_getInstanceManager().destroyInstance(_jspx_th_o_005fheader_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /WEB-INF/views/login.jsp(22,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ login_hint != null ? 'j_password' : 'j_username' }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/login.jsp(31,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ param.error != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<div class=\"alert alert-error\">");
          if (_jspx_meth_spring_005fmessage_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("</div>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    try {
      _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /WEB-INF/views/login.jsp(32,47) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f0.setCode("login.error");
      int[] _jspx_push_body_count_spring_005fmessage_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fmessage_005f0 = _jspx_th_spring_005fmessage_005f0.doStartTag();
        if (_jspx_th_spring_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fmessage_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fmessage_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fmessage_005f0.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    try {
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent(null);
      // /WEB-INF/views/login.jsp(51,76) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ login_hint }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005feval_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:eval
    org.springframework.web.servlet.tags.EvalTag _jspx_th_spring_005feval_005f0 = (org.springframework.web.servlet.tags.EvalTag) _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.get(org.springframework.web.servlet.tags.EvalTag.class);
    try {
      _jspx_th_spring_005feval_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005feval_005f0.setParent(null);
      // /WEB-INF/views/login.jsp(69,24) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005feval_005f0.setVar("newUserUrl");
      // /WEB-INF/views/login.jsp(69,24) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005feval_005f0.setExpression("@ldapProperties.newUserUrl");
      int[] _jspx_push_body_count_spring_005feval_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005feval_005f0 = _jspx_th_spring_005feval_005f0.doStartTag();
        if (_jspx_th_spring_005feval_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005feval_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005feval_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005feval_005f0.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.reuse(_jspx_th_spring_005feval_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/login.jsp(70,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty fn:trim(newUserUrl)}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${newUserUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" name=\"register_new_account\"\n");
          out.write("                               target=\"_self\" class=\"login-form-text\">Create New Account</a>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005feval_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:eval
    org.springframework.web.servlet.tags.EvalTag _jspx_th_spring_005feval_005f1 = (org.springframework.web.servlet.tags.EvalTag) _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.get(org.springframework.web.servlet.tags.EvalTag.class);
    try {
      _jspx_th_spring_005feval_005f1.setPageContext(_jspx_page_context);
      _jspx_th_spring_005feval_005f1.setParent(null);
      // /WEB-INF/views/login.jsp(76,24) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005feval_005f1.setVar("forgotPasswordUrl");
      // /WEB-INF/views/login.jsp(76,24) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005feval_005f1.setExpression("@ldapProperties.forgotPasswordUrl");
      int[] _jspx_push_body_count_spring_005feval_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005feval_005f1 = _jspx_th_spring_005feval_005f1.doStartTag();
        if (_jspx_th_spring_005feval_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005feval_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005feval_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005feval_005f1.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fspring_005feval_0026_005fvar_005fexpression_005fnobody.reuse(_jspx_th_spring_005feval_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /WEB-INF/views/login.jsp(77,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty fn:trim(forgotPasswordUrl)}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${forgotPasswordUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" name=\"forgot_password\"\n");
          out.write("                               target=\"_self\" class=\"login-form-text\">Forgot Password?</a>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005feval_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:eval
    org.springframework.web.servlet.tags.EvalTag _jspx_th_spring_005feval_005f2 = (org.springframework.web.servlet.tags.EvalTag) _005fjspx_005ftagPool_005fspring_005feval_0026_005fexpression_005fnobody.get(org.springframework.web.servlet.tags.EvalTag.class);
    try {
      _jspx_th_spring_005feval_005f2.setPageContext(_jspx_page_context);
      _jspx_th_spring_005feval_005f2.setParent(null);
      // /WEB-INF/views/login.jsp(98,39) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005feval_005f2.setExpression("@authProperties.getProperty('hspc.platform.sandbox.host')");
      int[] _jspx_push_body_count_spring_005feval_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005feval_005f2 = _jspx_th_spring_005feval_005f2.doStartTag();
        if (_jspx_th_spring_005feval_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005feval_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005feval_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005feval_005f2.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fspring_005feval_0026_005fexpression_005fnobody.reuse(_jspx_th_spring_005feval_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005feval_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:eval
    org.springframework.web.servlet.tags.EvalTag _jspx_th_spring_005feval_005f3 = (org.springframework.web.servlet.tags.EvalTag) _005fjspx_005ftagPool_005fspring_005feval_0026_005fexpression_005fnobody.get(org.springframework.web.servlet.tags.EvalTag.class);
    try {
      _jspx_th_spring_005feval_005f3.setPageContext(_jspx_page_context);
      _jspx_th_spring_005feval_005f3.setParent(null);
      // /WEB-INF/views/login.jsp(98,124) name = expression type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005feval_005f3.setExpression("@authProperties.getProperty('hspc.platform.sandbox.personaAuthPath')");
      int[] _jspx_push_body_count_spring_005feval_005f3 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005feval_005f3 = _jspx_th_spring_005feval_005f3.doStartTag();
        if (_jspx_th_spring_005feval_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005feval_005f3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005feval_005f3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005feval_005f3.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fspring_005feval_0026_005fexpression_005fnobody.reuse(_jspx_th_spring_005feval_005f3);
    }
    return false;
  }
}

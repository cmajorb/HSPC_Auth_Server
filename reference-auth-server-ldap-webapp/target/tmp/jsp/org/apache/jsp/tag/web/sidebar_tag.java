/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.5.v20170502
 * Generated at: 2017-06-12 17:50:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/Users/Debbie/Desktop/Major/hspconsortium-reference-auth-980c6e0c6685/reference-auth-server-ldap-webapp/target/tmp/hspc-reference-auth-server-webapp-1_7_0-SNAPSHOT_war1/WEB-INF/lib/spring-security-taglibs-3.2.7.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1427341356000L));
    _jspx_dependants.put("jar:file:/Users/Debbie/.m2/repository/org/springframework/spring-webmvc/4.1.7.RELEASE/spring-webmvc-4.1.7.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1435682828000L));
    _jspx_dependants.put("file:/Users/Debbie/.m2/repository/org/springframework/spring-webmvc/4.1.7.RELEASE/spring-webmvc-4.1.7.RELEASE.jar", Long.valueOf(1497287820000L));
    _jspx_dependants.put("file:/Users/Debbie/Desktop/Major/hspconsortium-reference-auth-980c6e0c6685/reference-auth-server-ldap-webapp/target/tmp/hspc-reference-auth-server-webapp-1_7_0-SNAPSHOT_war1/WEB-INF/lib/spring-security-taglibs-3.2.7.RELEASE.jar", Long.valueOf(1436490830000L));
    _jspx_dependants.put("/WEB-INF/tags/actionmenu.tag", Long.valueOf(1438801812000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(this, ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }

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
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.release();
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_security_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_security_005fauthorize_005f1(_jspx_page_context))
        return;
      out.write('\n');
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_security_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    try {
      _jspx_th_security_005fauthorize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_security_005fauthorize_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/sidebar.tag(5,0) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_security_005fauthorize_005f0.setAccess("hasRole('ROLE_USER')");
      int _jspx_eval_security_005fauthorize_005f0 = _jspx_th_security_005fauthorize_005f0.doStartTag();
      if (_jspx_eval_security_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t<div class=\"span2 visible-desktop\">\n");
        out.write("\t    <div class=\"well sidebar-nav\">\n");
        out.write("\t        <ul class=\"nav nav-list\">\n");
        out.write("\t        \t");
        if (_jspx_meth_o_005factionmenu_005f0(_jspx_th_security_005fauthorize_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t        </ul>\n");
        out.write("\t    </div><!--/.well -->\n");
        out.write("\t</div><!--/span-->\n");
      }
      if (_jspx_th_security_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } finally {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_o_005factionmenu_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_security_005fauthorize_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  o:actionmenu
    org.apache.jsp.tag.web.actionmenu_tag _jspx_th_o_005factionmenu_005f0 = (new org.apache.jsp.tag.web.actionmenu_tag());
    _jsp_getInstanceManager().newInstance(_jspx_th_o_005factionmenu_005f0);
    _jspx_th_o_005factionmenu_005f0.setJspContext(_jspx_page_context);
    _jspx_th_o_005factionmenu_005f0.setParent(_jspx_th_security_005fauthorize_005f0);
    _jspx_th_o_005factionmenu_005f0.doTag();
    _jsp_getInstanceManager().destroyInstance(_jspx_th_o_005factionmenu_005f0);
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    try {
      _jspx_th_security_005fauthorize_005f1.setPageContext(_jspx_page_context);
      _jspx_th_security_005fauthorize_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/sidebar.tag(14,0) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_security_005fauthorize_005f1.setAccess("!hasRole('ROLE_USER')");
      int _jspx_eval_security_005fauthorize_005f1 = _jspx_th_security_005fauthorize_005f1.doStartTag();
      if (_jspx_eval_security_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t<div class=\"span1\">\n");
        out.write("\t\t<!-- placeholder for non-logged-in users -->\n");
        out.write("\t</div><!--/span-->\n");
      }
      if (_jspx_th_security_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } finally {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f1);
    }
    return false;
  }
}

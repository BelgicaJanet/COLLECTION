package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fpassword_0026_005fvalue_005fpath_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fpassword_0026_005fvalue_005fpath_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fpassword_0026_005fvalue_005fpath_005fname_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

      out.write("<!-- p2 -->\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t\r\n");
      out.write("<!-- Mirrored from ninetheme.com/themes/commercahtml/register.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 14 May 2015 23:37:50 GMT -->\r\n");
      out.write("<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\r\n");
      out.write("\t\t<title>Sistema de Colleciones de Figuritas </title>\r\n");
      out.write("<meta name=\"description\" content=\"\"/> \t\t\r\n");
      out.write("<meta name=\"keywords\" content=\"\"/> \t\t\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\"> \t\t\t\t \t\t \t\t \t\t\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://ninetheme.com/themes/commercahtml/fonts/open-sans/stylesheet.css\" type=\"text/css\"> \t\t\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://ninetheme.com/themes/commercahtml/fonts/icomoon/style.css\" type=\"text/css\" media=\"screen\" /> \t\t \t\t\r\n");
      out.write("<!-- CSS styles  --> \t\t\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://ninetheme.com/themes/commercahtml/css/bootstrap.min.css\" type=\"text/css\" media=\"screen\" /> \t\t\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://ninetheme.com/themes/commercahtml/css/style.css\" type=\"text/css\" media=\"screen\" /> \t\t\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://ninetheme.com/themes/commercahtml/css/responsive.css\" type=\"text/css\" media=\"screen\" /> \t\t\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://ninetheme.com/themes/commercahtml/css/animate.css\" type=\"text/css\" media=\"screen\" /> \t\t\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://ninetheme.com/themes/commercahtml/css/color-scheme.css\" type=\"text/css\" media=\"screen\" /> \t\t \t\t\r\n");
      out.write("<!-- Javascripts  --> \t\t\r\n");
      out.write("<!--[if IE 8]><script src=\"js/respond.min.js\"></script><![endif]--> \t\t\r\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script> \t\t\r\n");
      out.write("<script>window.jQuery || document.write('<script src=\"http://ninetheme.com/themes/commercahtml/js/jquery.min.js\"><\\/script>');</script> \t\t\r\n");
      out.write("<script src=\"http://ninetheme.com/themes/commercahtml/js/modernizr.min.js\"></script> \t\t\r\n");
      out.write("<script src=\"http://ninetheme.com/themes/commercahtml/js/bootstrap.min.js\"></script> \t\t\r\n");
      out.write("<script src=\"http://ninetheme.com/themes/commercahtml/js/package.min.js\"></script> \t\t\r\n");
      out.write("<script src=\"http://ninetheme.com/themes/commercahtml/js/jquery.tweet.js\"></script> \t\t\r\n");
      out.write("<script src=\"http://ninetheme.com/themes/commercahtml/js/scripts.js\"></script> \t\t \t\r\n");
      out.write("\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- PAGE WRAPPER -->\r\n");
      out.write("\t\t<div id=\"template-wrapper\" class=\"wide\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<!-- SITE HEADER  -->\r\n");
      out.write("\t\t\t<div id=\"header-container\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t<!-- top header bar --> \t\t\t\t\r\n");
      out.write("\t\t\t<div id=\"header-container-inner\"> \t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"container headtop\"> \t\t\t\t\t\t \t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row\"> \t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<!-- top header links --> \t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 top-links center-sm\"> \t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"link-menu cl-effect-21\"> \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Login</a></li> \t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Register</a></li>\t\r\n");
      out.write("\t\t\t\t\t\t\t</ul> \t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div> \t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- /top header links --> \r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 header-social-icons multicolor center-sm\"> \t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<ul> \t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"twitter\"><br/></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"facebook\"><br/></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"skype\"><br/></a></li> \r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"linkedin\"><br/></a></li> \t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"rss\"><br/></a></li> \t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"deviantart\"><br/></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"googleplus\"><br/></a></li> \t\r\n");
      out.write("\t\t\t\t\t\t\t</ul> \t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div> \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- /social icons --> \t\r\n");
      out.write("\t\t\t\t\t\t</div> \t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t \t\t<!-- /top header bar --> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t \t\t<!-- main header --> \t\r\n");
      out.write("\t\t \t\t<div id=\"header-center\"> \r\n");
      out.write("\t\t \t\t\t<div class=\"container\">\r\n");
      out.write("\t\t \t\t\t\t<div class=\"row\"> \t\r\n");
      out.write("\t\t \t\t\t\t\t<!-- logo --> \r\n");
      out.write("\t\t \t\t\t\t\t<div class=\"col-xs-6 col-sm-6 logo-container\">\r\n");
      out.write("\t\t \t\t\t\t\t\t<strong class=\"logo \"> \t\r\n");
      out.write("\t\t \t\t\t\t\t\t\t<a href=\"index-2.html\"> \r\n");
      out.write("\t\t \t\t\t\t\t\t\t\t<img src=\"img/logo.png\" \r\n");
      out.write("\t\t \t\t\t\t\t\t\t\t\talt=\"Sistema de Colleciones de Figuritas\" title=\"Sistema de Colleciones de Figuritas\" /> \t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t \t\t\t\t\t\t\t</a> \t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t \t\t\t\t\t\t</strong> \r\n");
      out.write("\t\t \t\t\t\t\t</div> \t\t\t\t\t\t\t\r\n");
      out.write("\t\t \t\t\t\t\t<!-- /logo --> \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div> \t\t\t\t\r\n");
      out.write("\t\t\t\t</div> \t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- /main header --> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- Navigation menu -->\r\n");
      out.write("\t\t\t\t<div id=\"menu-container\"> \r\n");
      out.write("\t\t\t\t\t<div class=\"container\"> \r\n");
      out.write("\t\t\t\t\t\t<div class=\"inner\"> \t\r\n");
      out.write("\t\t\t\t\t\t<!-- main menu --> \t\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"main-menu menu visible-lg\">\r\n");
      out.write(" \t\t\t\t\t\t\t\t<li class=\"active\"> \r\n");
      out.write(" \t\t\t\t\t\t\t\t\t<a href=\"index-2.html\"><i class=\"icon-home\"></i></a>\r\n");
      out.write("\r\n");
      out.write(" \t\t\t\t\t\t\t\t</li> \r\n");
      out.write(" \t\t\t\t\t\t\t\t<li> \r\n");
      out.write(" \t\t\t\t\t\t\t\t\t<a href=\"product_grid.html\">Figuritas Tipo A</a> \r\n");
      out.write(" \t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t<li><a href=\"product_list.html\">Figuritas Tipo A.1</a></li>\r\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t<li><a href=\"product_grid.html\">Figuritas Tipo A.2</a></li> \t\r\n");
      out.write(" \t\t\t\t\t\t\t\t\t</ul> \t\r\n");
      out.write(" \t\t\t\t\t\t\t\t</li> \t\r\n");
      out.write(" \t\t\t\t\t\t\t\t<li> \t\r\n");
      out.write(" \t\t\t\t\t\t\t\t\t<a href=\"product_grid.html\">Figuritas Tipo B</a> \r\n");
      out.write(" \t\t\t\t\t\t\t\t</li> \r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"product_grid.html\">Figuritas Tipo C</a></li> \r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"product_grid.html\">Figuritas Tipo D</a></li> \t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"product_grid.html\">Figuritas Tipo E</a></li> \t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact.html\">Contactenos</a></li> \r\n");
      out.write("\t\t\t\t\t\t\t</ul> \t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- /main menu --> \r\n");
      out.write("\t\t\t\t\t\t</div> \t\r\n");
      out.write("\t\t\t\t\t</div> \t\t\t\t\r\n");
      out.write("\t\t\t\t</div> \t\t\t\r\n");
      out.write("\t\t\t\t<!-- /Navigation menu --> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /SITE HEADER -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- SITE CONTENT  -->\r\n");
      out.write("\t\t\t<div id=\"site-wrapper\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- SIDEBAR + MAIN CONTENT CONTAINER -->\r\n");
      out.write("\t\t\t\t<div class=\"main-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- SIDE BAR -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-4 col-lg-3 pull-right sidebar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- CHOOSE COLOR -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"section  module-list-items\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"widget widget-contact\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"section-title\">Contact Us</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-inner iconlist\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-location\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Commerca 15, New City Avenue, <br/>New York, USA 10000</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-phone\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>+ 453 443 11 23<br/>+ 453 443 11 23</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-mail6\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Commerca@gmail.com<br/>Commerca_sup@gmail.com</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-skype2\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>shop_fast<br/>Commerca_support</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- /CHOOSE COLOR -->\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /SIDE BAR -->\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- MAIN CONTENT -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-8 col-lg-9 main\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"section\">\r\n");
      out.write("\t\t\t\t\t\t\t  <p>If you already have an account with us, please login at the <a href=\"Login.htm\">login page</a>.</p>\r\n");
      out.write("\t\t\t\t\t\t\t  ");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/jsp/RegistrarCliente.jsp(191,9) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("post");
      // /WEB-INF/jsp/RegistrarCliente.jsp(191,9) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction("addCliente.htm");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t <h2>Datos Personales</h2>\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"content\">\r\n");
            out.write("\t\t\t\t\t\t\t\t  <table class=\"form\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td><span class=\"required\">*</span> First Name:");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/RegistrarCliente.jsp(197,58) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f0.setPath("firstname");
            int[] _jspx_push_body_count_form_005ferrors_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f0 = _jspx_th_form_005ferrors_005f0.doStartTag();
              if (_jspx_th_form_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f0.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f0);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td>");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td><span class=\"required\">*</span> Last Name:");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f1.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/RegistrarCliente.jsp(201,57) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f1.setPath("lastname");
            int[] _jspx_push_body_count_form_005ferrors_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f1 = _jspx_th_form_005ferrors_005f1.doStartTag();
              if (_jspx_th_form_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f1.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f1);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td>");
            if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td><span class=\"required\">*</span> E-Mail:");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f2.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/RegistrarCliente.jsp(205,54) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f2.setPath("email");
            int[] _jspx_push_body_count_form_005ferrors_005f2 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f2 = _jspx_th_form_005ferrors_005f2.doStartTag();
              if (_jspx_th_form_005ferrors_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f2.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f2);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td>");
            if (_jspx_meth_form_005finput_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td><span class=\"required\">*</span> Telephone:");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f3.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/RegistrarCliente.jsp(209,57) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f3.setPath("telephone");
            int[] _jspx_push_body_count_form_005ferrors_005f3 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f3 = _jspx_th_form_005ferrors_005f3.doStartTag();
              if (_jspx_th_form_005ferrors_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f3.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f3);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td>");
            if (_jspx_meth_form_005finput_005f3(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td><span class=\"required\">*</span> DNI:");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f4 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f4.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/RegistrarCliente.jsp(213,51) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f4.setPath("dni");
            int[] _jspx_push_body_count_form_005ferrors_005f4 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f4 = _jspx_th_form_005ferrors_005f4.doStartTag();
              if (_jspx_th_form_005ferrors_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f4[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f4.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f4.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f4);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td>");
            if (_jspx_meth_form_005finput_005f4(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td><span class=\"required\">*</span>User");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f5 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f5.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/RegistrarCliente.jsp(218,50) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f5.setPath("dni");
            int[] _jspx_push_body_count_form_005ferrors_005f5 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f5 = _jspx_th_form_005ferrors_005f5.doStartTag();
              if (_jspx_th_form_005ferrors_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f5[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f5.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f5.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f5);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td>");
            if (_jspx_meth_form_005finput_005f5(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td><span class=\"required\">*</span> Password:");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f6 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f6.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/RegistrarCliente.jsp(223,56) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f6.setPath("password");
            int[] _jspx_push_body_count_form_005ferrors_005f6 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f6 = _jspx_th_form_005ferrors_005f6.doStartTag();
              if (_jspx_th_form_005ferrors_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f6[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f6.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f6.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f6);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td>");
            if (_jspx_meth_form_005fpassword_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td><span class=\"required\">*</span> Password Confirm:");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f7 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f7.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/RegistrarCliente.jsp(228,64) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f7.setPath("password2");
            int[] _jspx_push_body_count_form_005ferrors_005f7 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f7 = _jspx_th_form_005ferrors_005f7.doStartTag();
              if (_jspx_th_form_005ferrors_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f7[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f7.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f7.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f7);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t  <td>");
            if (_jspx_meth_form_005fpassword_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t  </tbody></table>\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"buttons\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<div class=\"right\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Continue\" class=\"button\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
      }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- MAIN CONTENT -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /SITE CONTENT -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<!-- FOOTER ANNONCE -->\r\n");
      out.write("\t\t\t<div id=\"footer-annonce\" class=\"footer-annonce\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 annonce\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"annonce-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"iconic icon-support\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>24/7 Support</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>We support everything we sell</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 annonce\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\" annonce-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"iconic icon-gift\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Surprise Gift</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Value $50 on orders over $700</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 annonce\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"annonce-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"iconic icon-headphones\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>24/7 Support</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>We support everything we sell</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 annonce\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\" annonce-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"iconic icon-truck\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Free Shipping</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>All over in world over $100</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /FOOTER ANNONCE -->\r\n");
      out.write("\t\t\t<!-- SITE FOOTER -->\r\n");
      out.write("\t\t\t<div id=\"footer-container\" class=\"footer-container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"footer-inner alt\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- WIDGET: ABOUT US -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-lg-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"widget widget-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"widget-header\">About Us</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat., conse\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tadipiscing elit. Donec in sagittis sem. \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tAliquam vitae egestas odio [...] </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Pellentesque habitant morbi tristiq\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsenectus et netus. Proin ornare nisl at \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tenim vestibulum [...]</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"space40 hidden-lg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /WIDGET: ABOUT US -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 hidden-lg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- WIDGET: TWITTER FEED -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-lg-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"widget widget-twitter\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"widget-header\">Latest Tweets</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-inner twitterfeed iconlist\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-tweet\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Briza 1.5 has been quickly releas edto fix some bugs from the pre More on <a href=\"http://t.co/MqacjST\" target=\"_blank\">http://t.co/MqacjST</a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p><i>12 minutes ago</i></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-tweet\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>@Commercatemplate please, use the <a href=\"http://t.co/zRmkywea\" target=\"_blank\">http://t.co/zRmkywea</a> to ask support questions [...]</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p><i>25 minutes ago</i></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"space40 hidden-lg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /WIDGET: TWITTER FEED -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- WIDGET: FACEBOOK FEED -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-lg-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"widget widget-facebook\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"widget-header\">Facebook Widget</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- facebook social plugin SDK -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"fb-root\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<script>(function(d, s, id) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  var js, fjs = d.getElementsByTagName(s)[0];\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  if (d.getElementById(id)) return;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  js = d.createElement(s); js.id = id;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  js.src = \"../../../connect.facebook.net/tr_TR/all.js#xfbml=1&appId=126099991051\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  fjs.parentNode.insertBefore(js, fjs);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}(document, 'script', 'facebook-jssdk'));</script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- /facebook social plugin SDK -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"fb-like-box\" data-href=\"https://www.facebook.com/envato\" data-width=\"270\" data-height=\"200\" data-show-faces=\"true\" data-header=\"true\" data-stream=\"false\" data-show-border=\"false\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"space40 hidden-lg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /WIDGET: FACEBOOK FEED -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- WIDGET: CONTACT US -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-lg-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"widget widget-contact\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"widget-header\">Contact Us</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-inner iconlist\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-location\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Ninetheme LTD,  Old City Avenue, <br/>New York, USA 1121</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-phone\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>+ 952 123 11 22<br/>+ 952 123 11 22</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-mail6\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>commerca@gmail.com<br/>cma_support@gmail.com</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-skype2\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>hayatifaruk<br/>Commerca_support</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"space40 hidden-lg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /WIDGET: CONTACT US -->\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"footer-inner main\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- WIDGET LINKS -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6 col-sm-3 col-lg-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"widget wdgt-linklist\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"widget-header\">INFORMATION</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"cl-effect-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> About Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Delivery Information</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Privacy Policy</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Terms & Conditions</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Contact </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Touch</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Shops</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6 col-sm-3 col-lg-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"widget wdgt-linklist\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"widget-header\">CUSTOMER SERVICE</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"cl-effect-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Return</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Site Map</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Financial </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Stock Information</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Customers</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Sharing</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"space40 col-xs-12 col-sm-12 visible-xs\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6 col-sm-3 col-lg-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"widget wdgt-linklist\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"widget-header\">EXTRAS</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"cl-effect-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Brands / Manufacturer</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Gift Vouchers</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Affiliates</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Bestsellers</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> New Season</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Suits</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Specials</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6 col-sm-3 col-lg-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"widget wdgt-linklist\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"widget-header\">MY ACCOUNT</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"cl-effect-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> My Account</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Order History</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Wish List</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Testimonials</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Awards</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Newsletter</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> Blog</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /WIDGET LINKS -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- SUBSCRIPTION -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"widget widget-subs\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Proin ut quam eros. Donec sed lobortis diam. Nulla nec odio lacus. Quisque porttitor egestas dolor in placerat. Nunc vehicula dapibus ipsum [...]</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form class=\"frm-subs clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"subscribe-input\" class=\"subscribe-title\">Subscribe to our newsletter : </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"subscribe-input\" class=\"subscribe-input\" placeholder=\"Your email address\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary button-sbsr\">Submit</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"card-icons\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" title=\"visa card\"><img src=\"img/payment_2checkout.png\" alt=\"Visa Card\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" title=\"master card\"><img src=\"img/payment_american.png\" alt=\"Master Card\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" title=\"JCB\"><img src=\"img/payment_cirrus.png\" alt=\"JCB\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" title=\"diner's club\"><img src=\"img/payment_maestro.png\" alt=\"Diner's Club\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" title=\"paypal\"><img src=\"img/payment_moneybookers.png\" alt=\"PayPal\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\" title=\"western\"><img src=\"img/payment_western_union.png\" alt=\"western\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"space40 hidden-lg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /SUBSCRIPTION -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"footer-powered\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 copyright center-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\tCopyright © 2014 Commerca   |   All Rights Reserved.\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 space10 visible-xs\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 text-right center-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"http://themeforest.net/item/commerca-responsive-bootstrap-ecommerce-template/7299949?ref=Ninetheme\">Buy This Template</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /SITE FOOTER -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /PAGE WRAPPER -->\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"js/jquery.carouFredSel.min.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from ninetheme.com/themes/commercahtml/register.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 14 May 2015 23:37:50 GMT -->\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/RegistrarCliente.jsp(198,15) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("firstname");
    // /WEB-INF/jsp/RegistrarCliente.jsp(198,15) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "name", new String("firstname"));
    // /WEB-INF/jsp/RegistrarCliente.jsp(198,15) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "value", new String(""));
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/RegistrarCliente.jsp(202,15) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setPath("lastname");
    // /WEB-INF/jsp/RegistrarCliente.jsp(202,15) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "name", new String("lastname"));
    // /WEB-INF/jsp/RegistrarCliente.jsp(202,15) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "value", new String(""));
    int[] _jspx_push_body_count_form_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f1 = _jspx_th_form_005finput_005f1.doStartTag();
      if (_jspx_th_form_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.reuse(_jspx_th_form_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/RegistrarCliente.jsp(206,15) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setPath("email");
    // /WEB-INF/jsp/RegistrarCliente.jsp(206,15) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "name", new String("email"));
    // /WEB-INF/jsp/RegistrarCliente.jsp(206,15) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "value", new String(""));
    int[] _jspx_push_body_count_form_005finput_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f2 = _jspx_th_form_005finput_005f2.doStartTag();
      if (_jspx_th_form_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.reuse(_jspx_th_form_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/RegistrarCliente.jsp(210,15) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setPath("telephone");
    // /WEB-INF/jsp/RegistrarCliente.jsp(210,15) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "name", new String("telephone"));
    // /WEB-INF/jsp/RegistrarCliente.jsp(210,15) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "value", new String(""));
    int[] _jspx_push_body_count_form_005finput_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f3 = _jspx_th_form_005finput_005f3.doStartTag();
      if (_jspx_th_form_005finput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f3.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.reuse(_jspx_th_form_005finput_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f4 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f4.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/RegistrarCliente.jsp(214,15) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f4.setPath("dni");
    // /WEB-INF/jsp/RegistrarCliente.jsp(214,15) null
    _jspx_th_form_005finput_005f4.setDynamicAttribute(null, "name", new String("dni"));
    // /WEB-INF/jsp/RegistrarCliente.jsp(214,15) null
    _jspx_th_form_005finput_005f4.setDynamicAttribute(null, "value", new String(""));
    int[] _jspx_push_body_count_form_005finput_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f4 = _jspx_th_form_005finput_005f4.doStartTag();
      if (_jspx_th_form_005finput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f4.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.reuse(_jspx_th_form_005finput_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f5 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f5.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/RegistrarCliente.jsp(219,15) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f5.setPath("user");
    // /WEB-INF/jsp/RegistrarCliente.jsp(219,15) null
    _jspx_th_form_005finput_005f5.setDynamicAttribute(null, "name", new String("password"));
    // /WEB-INF/jsp/RegistrarCliente.jsp(219,15) null
    _jspx_th_form_005finput_005f5.setDynamicAttribute(null, "value", new String(""));
    int[] _jspx_push_body_count_form_005finput_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f5 = _jspx_th_form_005finput_005f5.doStartTag();
      if (_jspx_th_form_005finput_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f5.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.reuse(_jspx_th_form_005finput_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_form_005fpassword_005f0 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _005fjspx_005ftagPool_005fform_005fpassword_0026_005fvalue_005fpath_005fname_005fnobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    _jspx_th_form_005fpassword_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/RegistrarCliente.jsp(224,15) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fpassword_005f0.setPath("password");
    // /WEB-INF/jsp/RegistrarCliente.jsp(224,15) null
    _jspx_th_form_005fpassword_005f0.setDynamicAttribute(null, "name", new String("password"));
    // /WEB-INF/jsp/RegistrarCliente.jsp(224,15) null
    _jspx_th_form_005fpassword_005f0.setDynamicAttribute(null, "value", new String(""));
    int[] _jspx_push_body_count_form_005fpassword_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fpassword_005f0 = _jspx_th_form_005fpassword_005f0.doStartTag();
      if (_jspx_th_form_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fpassword_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fpassword_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fpassword_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fpassword_0026_005fvalue_005fpath_005fname_005fnobody.reuse(_jspx_th_form_005fpassword_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fpassword_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_form_005fpassword_005f1 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _005fjspx_005ftagPool_005fform_005fpassword_0026_005fvalue_005fpath_005fname_005fnobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    _jspx_th_form_005fpassword_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005fpassword_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/RegistrarCliente.jsp(229,15) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fpassword_005f1.setPath("password2");
    // /WEB-INF/jsp/RegistrarCliente.jsp(229,15) null
    _jspx_th_form_005fpassword_005f1.setDynamicAttribute(null, "name", new String("confirm"));
    // /WEB-INF/jsp/RegistrarCliente.jsp(229,15) null
    _jspx_th_form_005fpassword_005f1.setDynamicAttribute(null, "value", new String(""));
    int[] _jspx_push_body_count_form_005fpassword_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fpassword_005f1 = _jspx_th_form_005fpassword_005f1.doStartTag();
      if (_jspx_th_form_005fpassword_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fpassword_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fpassword_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fpassword_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005fpassword_0026_005fvalue_005fpath_005fname_005fnobody.reuse(_jspx_th_form_005fpassword_005f1);
    }
    return false;
  }
}

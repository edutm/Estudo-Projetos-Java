package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/tags/menu/menu.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/category.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/item.tagx");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_hasPermission_name;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_shiro_hasPermission_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_shiro_hasPermission_name.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div version=\"2.0\" id=\"menu\">");
      if (_jspx_meth_menu_menu_0(_jspx_page_context))
        return;
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_menu_menu_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:menu
    org.apache.jsp.tag.web.menu.menu_tagx _jspx_th_menu_menu_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.menu_tagx.class) : new org.apache.jsp.tag.web.menu.menu_tagx();
    _jspx_th_menu_menu_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_menu_0.setZ("nZaf43BjUg1iM0v70HJVEsXDopc=");
    _jspx_th_menu_menu_0.setId("_menu");
    _jspx_th_menu_menu_0.setJspBody(new menu_jspxHelper( 0, _jspx_page_context, _jspx_th_menu_menu_0, null));
    _jspx_th_menu_menu_0.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_0.setParent(_jspx_parent);
    _jspx_th_menu_category_0.setZ("g6oG0656PcsmmvUYeBtpgiQROck=");
    _jspx_th_menu_category_0.setId("c_usuario");
    _jspx_th_menu_category_0.setJspBody(new menu_jspxHelper( 1, _jspx_page_context, _jspx_th_menu_category_0, null));
    _jspx_th_menu_category_0.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_0.setParent(_jspx_parent);
    _jspx_th_menu_item_0.setZ("P7ZIPrcTTBR41JYD0QldbYgsZrM=");
    _jspx_th_menu_item_0.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/usuarios?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_0.setMessageCode("global_menu_list");
    _jspx_th_menu_item_0.setId("i_usuario_list");
    _jspx_th_menu_item_0.doTag();
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_0 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_shiro_hasPermission_0.setName("comentario:criar,ler");
    int _jspx_eval_shiro_hasPermission_0 = _jspx_th_shiro_hasPermission_0.doStartTag();
    if (_jspx_eval_shiro_hasPermission_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_menu_category_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_hasPermission_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_0);
    return false;
  }

  private boolean _jspx_meth_menu_category_1(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_hasPermission_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_1.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_1.setParent(_jspx_th_shiro_hasPermission_0);
    _jspx_th_menu_category_1.setZ("2E9ITjDnEbh1ztvrGtR4mxL/KN4=");
    _jspx_th_menu_category_1.setId("c_comentario");
    _jspx_th_menu_category_1.setJspBody(new menu_jspxHelper( 2, _jspx_page_context, _jspx_th_menu_category_1, null));
    _jspx_th_menu_category_1.doTag();
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_1 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_1.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_shiro_hasPermission_1.setName("comentario:criar");
    int _jspx_eval_shiro_hasPermission_1 = _jspx_th_shiro_hasPermission_1.doStartTag();
    if (_jspx_eval_shiro_hasPermission_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_menu_item_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_hasPermission_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_1);
    return false;
  }

  private boolean _jspx_meth_menu_item_1(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_hasPermission_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_1.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_1.setParent(_jspx_th_shiro_hasPermission_1);
    _jspx_th_menu_item_1.setZ("J+ZrndoI6FLnEUZazG2bNkY4m0I=");
    _jspx_th_menu_item_1.setUrl("/comentarios?form");
    _jspx_th_menu_item_1.setMessageCode("global_menu_new");
    _jspx_th_menu_item_1.setId("i_comentario_new");
    _jspx_th_menu_item_1.doTag();
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_2 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_2.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_shiro_hasPermission_2.setName("comentario:ler");
    int _jspx_eval_shiro_hasPermission_2 = _jspx_th_shiro_hasPermission_2.doStartTag();
    if (_jspx_eval_shiro_hasPermission_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_menu_item_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_hasPermission_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_2);
    return false;
  }

  private boolean _jspx_meth_menu_item_2(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_hasPermission_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_2.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_2.setParent(_jspx_th_shiro_hasPermission_2);
    _jspx_th_menu_item_2.setZ("aPAINYt2YbS9z+enZyQMNeC9CWw=");
    _jspx_th_menu_item_2.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/comentarios?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_2.setMessageCode("global_menu_list");
    _jspx_th_menu_item_2.setId("i_comentario_list");
    _jspx_th_menu_item_2.doTag();
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_3 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_3.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_shiro_hasPermission_3.setName("papel:criar,ler");
    int _jspx_eval_shiro_hasPermission_3 = _jspx_th_shiro_hasPermission_3.doStartTag();
    if (_jspx_eval_shiro_hasPermission_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_menu_category_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_hasPermission_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_3);
    return false;
  }

  private boolean _jspx_meth_menu_category_2(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_hasPermission_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_2.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_2.setParent(_jspx_th_shiro_hasPermission_3);
    _jspx_th_menu_category_2.setZ("Bq0xhRrhgPiyLNl6T08/3Dzmyjw=");
    _jspx_th_menu_category_2.setId("c_papel");
    _jspx_th_menu_category_2.setJspBody(new menu_jspxHelper( 3, _jspx_page_context, _jspx_th_menu_category_2, null));
    _jspx_th_menu_category_2.doTag();
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_4 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_4.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_shiro_hasPermission_4.setName("papel:criar");
    int _jspx_eval_shiro_hasPermission_4 = _jspx_th_shiro_hasPermission_4.doStartTag();
    if (_jspx_eval_shiro_hasPermission_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_menu_item_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_hasPermission_4, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_4);
    return false;
  }

  private boolean _jspx_meth_menu_item_3(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_hasPermission_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_3.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_3.setParent(_jspx_th_shiro_hasPermission_4);
    _jspx_th_menu_item_3.setZ("user-managed");
    _jspx_th_menu_item_3.setUrl("/papeis?form");
    _jspx_th_menu_item_3.setMessageCode("global_menu_new");
    _jspx_th_menu_item_3.setId("i_papel_new");
    _jspx_th_menu_item_3.doTag();
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_5 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_5.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_shiro_hasPermission_5.setName("papel:ler");
    int _jspx_eval_shiro_hasPermission_5 = _jspx_th_shiro_hasPermission_5.doStartTag();
    if (_jspx_eval_shiro_hasPermission_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_menu_item_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_hasPermission_5, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_5);
    return false;
  }

  private boolean _jspx_meth_menu_item_4(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_hasPermission_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_4.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_4.setParent(_jspx_th_shiro_hasPermission_5);
    _jspx_th_menu_item_4.setZ("user-managed");
    _jspx_th_menu_item_4.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/papeis?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_4.setMessageCode("global_menu_list");
    _jspx_th_menu_item_4.setId("i_papel_list");
    _jspx_th_menu_item_4.doTag();
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_6 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_6.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_shiro_hasPermission_6.setName("permissao:criar,ler");
    int _jspx_eval_shiro_hasPermission_6 = _jspx_th_shiro_hasPermission_6.doStartTag();
    if (_jspx_eval_shiro_hasPermission_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_menu_category_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_hasPermission_6, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_6);
    return false;
  }

  private boolean _jspx_meth_menu_category_3(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_hasPermission_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_3.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_3.setParent(_jspx_th_shiro_hasPermission_6);
    _jspx_th_menu_category_3.setZ("Ts0ZjwTUtkREjO50PA0H0ZYACTw=");
    _jspx_th_menu_category_3.setId("c_permissao");
    _jspx_th_menu_category_3.setJspBody(new menu_jspxHelper( 4, _jspx_page_context, _jspx_th_menu_category_3, null));
    _jspx_th_menu_category_3.doTag();
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_7 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_7.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_shiro_hasPermission_7.setName("permissao:criar");
    int _jspx_eval_shiro_hasPermission_7 = _jspx_th_shiro_hasPermission_7.doStartTag();
    if (_jspx_eval_shiro_hasPermission_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_menu_item_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_hasPermission_7, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_7);
      throw new SkipPageException();
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_7);
    return false;
  }

  private boolean _jspx_meth_menu_item_5(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_hasPermission_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_5.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_5.setParent(_jspx_th_shiro_hasPermission_7);
    _jspx_th_menu_item_5.setZ("zVjcZihtncpZGKWl98PFCLgHoo4=");
    _jspx_th_menu_item_5.setUrl("/permissoes?form");
    _jspx_th_menu_item_5.setMessageCode("global_menu_new");
    _jspx_th_menu_item_5.setId("i_permissao_new");
    _jspx_th_menu_item_5.doTag();
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_8 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_8.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_shiro_hasPermission_8.setName("permissao:ler");
    int _jspx_eval_shiro_hasPermission_8 = _jspx_th_shiro_hasPermission_8.doStartTag();
    if (_jspx_eval_shiro_hasPermission_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_menu_item_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_hasPermission_8, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_8);
      throw new SkipPageException();
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_8);
    return false;
  }

  private boolean _jspx_meth_menu_item_6(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_hasPermission_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_6.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_6.setParent(_jspx_th_shiro_hasPermission_8);
    _jspx_th_menu_item_6.setZ("NFrsnJiNExMoT2YazrK1R20Fy7M=");
    _jspx_th_menu_item_6.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/permissoes?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_6.setMessageCode("global_menu_list");
    _jspx_th_menu_item_6.setId("i_permissao_list");
    _jspx_th_menu_item_6.doTag();
    return false;
  }

  private class menu_jspxHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public menu_jspxHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_category_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_shiro_hasPermission_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_shiro_hasPermission_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_shiro_hasPermission_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_shiro_hasPermission_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_shiro_hasPermission_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_shiro_hasPermission_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_shiro_hasPermission_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_shiro_hasPermission_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_shiro_hasPermission_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
          case 3:
            invoke3( out );
            break;
          case 4:
            invoke4( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}

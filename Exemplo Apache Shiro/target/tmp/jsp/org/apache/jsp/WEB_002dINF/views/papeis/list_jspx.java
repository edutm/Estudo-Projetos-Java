package org.apache.jsp.WEB_002dINF.views.papeis;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/WEB-INF/tags/form/list.tagx");
    _jspx_dependants.add("/WEB-INF/tags/util/panel.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/table.tagx");
    _jspx_dependants.add("/WEB-INF/tags/util/pagination.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/column.tagx");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("<div version=\"2.0\">");
      if (_jspx_meth_page_list_0(_jspx_page_context))
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

  private boolean _jspx_meth_page_list_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  page:list
    org.apache.jsp.tag.web.form.list_tagx _jspx_th_page_list_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.list_tagx.class) : new org.apache.jsp.tag.web.form.list_tagx();
    _jspx_th_page_list_0.setJspContext(_jspx_page_context);
    _jspx_th_page_list_0.setZ("iNxAoDAy3RGeOg6Ff2yVM0+xNtE=");
    _jspx_th_page_list_0.setItems((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${papels}", java.util.Collection.class, (PageContext)_jspx_page_context, null));
    _jspx_th_page_list_0.setId("pl_br_com_devmedia_javamagazine_apacheshiro_model_bean_Papel");
    _jspx_th_page_list_0.setJspBody(new list_jspxHelper( 0, _jspx_page_context, _jspx_th_page_list_0, null));
    _jspx_th_page_list_0.doTag();
    return false;
  }

  private boolean _jspx_meth_table_table_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:table
    org.apache.jsp.tag.web.form.fields.table_tagx _jspx_th_table_table_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.fields.table_tagx.class) : new org.apache.jsp.tag.web.form.fields.table_tagx();
    _jspx_th_table_table_0.setJspContext(_jspx_page_context);
    _jspx_th_table_table_0.setParent(_jspx_parent);
    _jspx_th_table_table_0.setZ("kAJfSHmVNLcmCIMOzvgEVoDtA2w=");
    _jspx_th_table_table_0.setPath("/papeis");
    _jspx_th_table_table_0.setId("l_br_com_devmedia_javamagazine_apacheshiro_model_bean_Papel");
    _jspx_th_table_table_0.setData((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${papels}", java.util.Collection.class, (PageContext)_jspx_page_context, null));
    _jspx_th_table_table_0.setJspBody(new list_jspxHelper( 1, _jspx_page_context, _jspx_th_table_table_0, null));
    _jspx_th_table_table_0.doTag();
    return false;
  }

  private boolean _jspx_meth_table_column_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:column
    org.apache.jsp.tag.web.form.fields.column_tagx _jspx_th_table_column_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.fields.column_tagx.class) : new org.apache.jsp.tag.web.form.fields.column_tagx();
    _jspx_th_table_column_0.setJspContext(_jspx_page_context);
    _jspx_th_table_column_0.setParent(_jspx_parent);
    _jspx_th_table_column_0.setZ("qr8dqqeSdn1iNADCEaKXUKjEbVA=");
    _jspx_th_table_column_0.setProperty("nome");
    _jspx_th_table_column_0.setId("c_br_com_devmedia_javamagazine_apacheshiro_model_bean_Papel_nome");
    _jspx_th_table_column_0.doTag();
    return false;
  }

  private boolean _jspx_meth_table_column_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:column
    org.apache.jsp.tag.web.form.fields.column_tagx _jspx_th_table_column_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.fields.column_tagx.class) : new org.apache.jsp.tag.web.form.fields.column_tagx();
    _jspx_th_table_column_1.setJspContext(_jspx_page_context);
    _jspx_th_table_column_1.setParent(_jspx_parent);
    _jspx_th_table_column_1.setZ("RQCUPmi3D+fJS9WOW6ap4HIRm4M=");
    _jspx_th_table_column_1.setProperty("permissoes");
    _jspx_th_table_column_1.setId("c_br_com_devmedia_javamagazine_apacheshiro_model_bean_Papel_permissoes");
    _jspx_th_table_column_1.doTag();
    return false;
  }

  private class list_jspxHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public list_jspxHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_table_table_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_table_column_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_table_column_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
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

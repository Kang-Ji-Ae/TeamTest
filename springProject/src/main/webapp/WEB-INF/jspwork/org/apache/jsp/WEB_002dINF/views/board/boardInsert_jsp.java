/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-08-21 03:30:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1597285717419L));
    _jspx_dependants.put("jar:file:/C:/workspace/framework/springProject/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

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
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>게시글 등록</title>\r\n");
      out.write("<style>\r\n");
      out.write("    .insert-label {\r\n");
      out.write("      display: inline-block;\r\n");
      out.write("      width: 80px;\r\n");
      out.write("      line-height: 40px\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("   \t#content-main{ margin: 100px auto;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container pb-5 mb-5\" id=\"content-main\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h3>게시글 등록</h3>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<!-- encType : form태그 데이터가 서버에 제출 될 때의 인코딩 방법을 지정하는 속성 \r\n");
      out.write("\t\t\t\t(기본값 : application/x-www-form-urlencoded : 데이터를 서버에 전송하기 전에 문자로 인코딩)\r\n");
      out.write("\t\t\t\tmultipart/form-data : 모든 데이터를 인코딩 하지 않음(원본 데이터 상태(바이트) -> 파일을 서버에 전달 가능)\r\n");
      out.write("\t\t\t-->\r\n");
      out.write("\t\t\t<form action=\"insertAction\" method=\"post\" role=\"form\" \r\n");
      out.write("\t\t\t\t  encType=\"multipart/form-data\"\tonsubmit=\"return validate();\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"mb-2\">\r\n");
      out.write("\t\t\t\t\t<label class=\"input-group-addon mr-3 insert-label\">카테고리</label> \r\n");
      out.write("\t\t\t\t\t<select\tclass=\"custom-select\" id=\"category\" name=\"boardCategory\" style=\"width: 150px;\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"10\">운동</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"20\">영화</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"30\">음악</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"40\">요리</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"50\">게임</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"60\">기타</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-inline mb-2\">\r\n");
      out.write("\t\t\t\t\t<label class=\"input-group-addon mr-3 insert-label\">제목</label> \r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"title\" name=\"boardTitle\" size=\"70\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-inline mb-2\">\r\n");
      out.write("\t\t\t\t\t<label class=\"input-group-addon mr-3 insert-label\">작성자</label>\r\n");
      out.write("\t\t\t\t\t<h5 class=\"my-0\" id=\"writer\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-inline mb-2\">\r\n");
      out.write("\t\t\t\t\t<label class=\"input-group-addon mr-3 insert-label\">작성일</label>\r\n");
      out.write("\t\t\t\t\t<h5 class=\"my-0\" id=\"today\">\r\n");
      out.write("\t\t\t\t\t\t");
      java.util.Date now = null;
      now = (java.util.Date) _jspx_page_context.getAttribute("now", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (now == null){
        now = new java.util.Date();
        _jspx_page_context.setAttribute("now", now, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t</div>  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-inline mb-2\">\r\n");
      out.write("\t\t\t\t\t<label class=\"input-group-addon mr-3 insert-label\">썸네일</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"boardImg\" id=\"titleImgArea\">\r\n");
      out.write("\t\t\t\t\t\t<img id=\"titleImg\" width=\"200\" height=\"200\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-inline mb-2\">\r\n");
      out.write("\t\t\t\t\t<label class=\"input-group-addon mr-3 insert-label\">업로드<br>이미지</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"mr-2 boardImg\" id=\"contentImgArea1\">\r\n");
      out.write("\t\t\t\t\t\t<img id=\"contentImg1\" width=\"150\" height=\"150\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"mr-2 boardImg\" id=\"contentImgArea2\">\r\n");
      out.write("\t\t\t\t\t\t<img id=\"contentImg2\" width=\"150\" height=\"150\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"mr-2 boardImg\" id=\"contentImgArea3\">\r\n");
      out.write("\t\t\t\t\t\t<img id=\"contentImg3\" width=\"150\" height=\"150\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 파일 업로드 하는 부분 -->\r\n");
      out.write("\t\t\t\t<div id=\"fileArea\">\r\n");
      out.write("\t\t\t\t\t<!--  multiple 속성\r\n");
      out.write("\t\t\t\t\t\t- input 요소 하나에 둘 이상의 값을 입력할 수 있음을 명시 (파일 여러개 선택 가능)\r\n");
      out.write("\t\t\t\t\t -->\r\n");
      out.write("\t\t\t\t\t<input type=\"file\" id=\"img1\" name=\"thumbnail\" onchange=\"LoadImg(this,1)\"> \r\n");
      out.write("\t\t\t\t\t<input type=\"file\" id=\"img2\" name=\"images\" onchange=\"LoadImg(this,2)\">\r\n");
      out.write("\t\t\t\t\t<input type=\"file\" id=\"img3\" name=\"images\" onchange=\"LoadImg(this,3)\"> \r\n");
      out.write("\t\t\t\t\t<input type=\"file\" id=\"img4\" name=\"images\" onchange=\"LoadImg(this,4)\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"content\">내용</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<textarea class=\"form-control\" id=\"content\" name=\"boardContent\"\r\n");
      out.write("\t\t\t\t\t\trows=\"10\" style=\"resize: none;\"></textarea>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<hr class=\"mb-4\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">등록</button>\r\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-primary float-right\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${header.referer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">목록으로</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\r\n");
      out.write("\t\t// 유효성 검사\r\n");
      out.write("\t\tfunction validate() {\r\n");
      out.write("\t\t\tif ($(\"#title\").val().trim().length == 0) {\r\n");
      out.write("\t\t\t\talert(\"제목을 입력해 주세요.\");\r\n");
      out.write("\t\t\t\t$(\"#title\").focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tif ($(\"#content\").val().trim().length == 0) {\r\n");
      out.write("\t\t\t\talert(\"내용을 입력해 주세요.\");\r\n");
      out.write("\t\t\t\t$(\"#content\").focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t // 이미지 공간을 클릭할 때 파일 첨부 창이 뜨도록 설정하는 함수\r\n");
      out.write("\t    $(function () {\r\n");
      out.write("\t       $(\"#fileArea\").hide();\r\n");
      out.write("\r\n");
      out.write("\t      $(\"#titleImgArea\").click(function () {\r\n");
      out.write("\t        $(\"#img1\").click();\r\n");
      out.write("\t      });\r\n");
      out.write("\t      $(\"#contentImgArea1\").click(function () {\r\n");
      out.write("\t        $(\"#img2\").click();\r\n");
      out.write("\t      });\r\n");
      out.write("\t      $(\"#contentImgArea2\").click(function () {\r\n");
      out.write("\t        $(\"#img3\").click();\r\n");
      out.write("\t      });\r\n");
      out.write("\t      $(\"#contentImgArea3\").click(function () {\r\n");
      out.write("\t        $(\"#img4\").click();\r\n");
      out.write("\t      });\r\n");
      out.write("\r\n");
      out.write("\t    });\r\n");
      out.write("\r\n");
      out.write("\t    // 각각의 영역에 파일을 첨부 했을 경우 미리 보기가 가능하도록 하는 함수\r\n");
      out.write("\t    function LoadImg(value, num) {\r\n");
      out.write("\t      if (value.files && value.files[0]) {\r\n");
      out.write("\t        var reader = new FileReader();\r\n");
      out.write("\r\n");
      out.write("\t        reader.onload = function (e) {\r\n");
      out.write("\t          switch (num) {\r\n");
      out.write("\t            case 1:\r\n");
      out.write("\t              $(\"#titleImg\").attr(\"src\", e.target.result);\r\n");
      out.write("\t              break;\r\n");
      out.write("\t            case 2:\r\n");
      out.write("\t              $(\"#contentImg1\").attr(\"src\", e.target.result);\r\n");
      out.write("\t              break;\r\n");
      out.write("\t            case 3:\r\n");
      out.write("\t              $(\"#contentImg2\").attr(\"src\", e.target.result);\r\n");
      out.write("\t              break;\r\n");
      out.write("\t            case 4:\r\n");
      out.write("\t              $(\"#contentImg3\").attr(\"src\", e.target.result);\r\n");
      out.write("\t              break;\r\n");
      out.write("\t          }\r\n");
      out.write("\t        }\r\n");
      out.write("\r\n");
      out.write("\t        reader.readAsDataURL(value.files[0]);\r\n");
      out.write("\t      }\r\n");
      out.write("\t    }\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent(null);
      // /WEB-INF/views/board/boardInsert.jsp(59,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${now}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/board/boardInsert.jsp(59,6) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd");
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      _jspx_th_fmt_005fformatDate_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f0_reused);
    }
    return false;
  }
}
/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-09-01 05:37:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reply_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
      out.write("\t\r\n");
      out.write("<style>\r\n");
      out.write("/*댓글*/\r\n");
      out.write(".replyWrite>table {\r\n");
      out.write("\twidth: 90%;\r\n");
      out.write("\tmargin-top : 100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#replyContentArea {\r\n");
      out.write("\twidth: 90%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#replyContentArea>textarea {\r\n");
      out.write("\tresize: none;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#replyBtnArea {\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rWriter {\r\n");
      out.write("\tdisplay : inline-block;\r\n");
      out.write("\tmargin-right: 30px;\r\n");
      out.write("\tvertical-align: top;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 1.2em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rDate {\r\n");
      out.write("\tdisplay : inline-block;\r\n");
      out.write("\tfont-size: 0.5em;\r\n");
      out.write("\tcolor: gray;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#replyListArea {\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rContent, .btnArea{\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rContent {\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\twidth : 100%;\r\n");
      out.write("\tword-break:normal;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btnArea {\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\twidth : 180px;\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("hr{\r\n");
      out.write("    clear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".replyUpdateContent{\r\n");
      out.write("\tresize: none;\r\n");
      out.write("\twidth: 70%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* 답글 */\r\n");
      out.write(".reply2-li{\r\n");
      out.write("\tpadding-left: 50px;  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".reply2Area{\r\n");
      out.write("\tpadding-top : 30px;\r\n");
      out.write("\twidth : 80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".reply2Content{\r\n");
      out.write("\tresize: none;  \r\n");
      out.write("\twidth : 100%; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<div id=\"reply-area \">\r\n");
      out.write("\t<!-- 댓글 작성 부분 -->\r\n");
      out.write("\t<div class=\"replyWrite\">\r\n");
      out.write("\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td id=\"replyContentArea\"><textArea rows=\"3\" id=\"replyContent\"></textArea>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td id=\"replyBtnArea\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary\" id=\"addReply\">댓글<br>등록</button>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- 댓글 출력 부분 -->\r\n");
      out.write("\t<div class=\"replyList mt-5 pt-2\">\r\n");
      out.write("\t\t<ul id=\"replyListArea\">\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("// 댓글\r\n");
      out.write("// 페이지 로딩 완료 시 댓글 목록 호출\r\n");
      out.write("$(function(){\r\n");
      out.write("\tselectReplyList();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("// 댓글 목록 불러오기\r\n");
      out.write("function selectReplyList(){\r\n");
      out.write("\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/reply/selectList/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.boardNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl : url,\r\n");
      out.write("\t\ttype : \"POST\",\r\n");
      out.write("\t\tdataType:\"json\",\r\n");
      out.write("\t\tsuccess:function(rList){\r\n");
      out.write("\t\t\tconsole.log(rList);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 아이디가 #replyListArea인 요소를 얻어와 $replyListArea 변수에 저장\r\n");
      out.write("\t\t\tvar $replyListArea = $(\"#replyListArea\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$replyListArea.html(\"\"); // 기존 댓글 정보 초기화\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 로그인한 멤버의 아이디를 저장할 변수\r\n");
      out.write("\t\t\t// 로그인 아이디와 댓글 작성자가 같다면 댓글 수정, 삭제 버튼 출력하는 조건문에 사용할 예정\r\n");
      out.write("\t\t\tvar loginMemberId = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 댓글이 포함된 <li> 요소 생성 반복문\r\n");
      out.write("\t\t\t$.each(rList, function(i){\r\n");
      out.write("\t\t\t\tconsole.log(rList[i]);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// li태그마다 댓글 번호를 id로 추가\r\n");
      out.write("\t\t\t\tvar $li = $(\"<li>\").addClass(\"reply-row\").attr(\"id\", rList[i].replyNo);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 답글(대댓글)일 경우 reply2-li 클래스 추가\r\n");
      out.write("\t\t\t\tif(rList[i].replyDepth == 1){\r\n");
      out.write("\t\t\t\t\t$li.addClass(\"reply2-li\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 작성자, 작성일, 수정일 영역 \r\n");
      out.write("\t\t\t\tvar $div = $(\"<div>\");\r\n");
      out.write("\t\t\t\tvar $rWriter = $(\"<a>\").addClass(\"rWriter idSelect\").html(rList[i].memberId);\r\n");
      out.write("\t\t\t\tvar $rDate = $(\"<p>\").addClass(\"rDate\")\r\n");
      out.write("\t\t\t\t\t\t\t\t.html(\"작성일 : \" + rList[i].replyCreateDate + \"<br>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ \"마지막 수정 날짜 : \" + rList[i].replyModifyDate);\r\n");
      out.write("\t\t\t\t$div.append($rWriter).append($rDate)\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 댓글 내용\r\n");
      out.write("\t\t\t\tvar $rContent = $(\"<p>\").addClass(\"rContent\").html(rList[i].replyContent);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 답글, 수정, 삭제 버튼 영역\r\n");
      out.write("\t\t\t\tvar $btnArea = $(\"<div>\").addClass(\"btnArea\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 로그인 되어 있는 경우에 답글 버튼 추가\r\n");
      out.write("\t\t\t\tif(loginMemberId != \"\"){\r\n");
      out.write("\t\t\t\t\t// ** 추가되는 댓글에 onclick 이벤트를 부여하여 버튼 클릭 시 답글창을 생성하는 함수를 이벤트 핸들러로 추가함. \r\n");
      out.write("\t\t\t\t\tvar $reply2 = $(\"<button>\").addClass(\"btn btn-sm btn-primary ml-1 reply2\").text(\"답글\").attr(\"onclick\", \"addReply2Area(this, \"+rList[i].parentReplyNo+\")\");\r\n");
      out.write("\t\t\t\t\t$btnArea.append($reply2);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 현재 댓글의 작성자와 로그인한 멤버의 아이디가 같을 때 버튼 추가\r\n");
      out.write("\t\t\t\tif(rList[i].memberId == loginMemberId){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar $showUpdate = $(\"<button>\").addClass(\"btn btn-sm btn-primary ml-1\").text(\"수정\");\r\n");
      out.write("\t\t\t\t\tvar $deleteReply = $(\"<button>\").addClass(\"btn btn-sm btn-primary ml-1\").text(\"삭제\");\r\n");
      out.write("\t\t\t\t\t$btnArea.append($showUpdate, $deleteReply);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 댓글 경계선\r\n");
      out.write("\t\t\t\tvar $hr = $(\"<hr>\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 댓글 하나로 합치기\r\n");
      out.write("\t\t\t\t$li.append($div).append($rContent).append($btnArea);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 댓글 영역을 화면에 배치\r\n");
      out.write("\t\t\t\t$replyListArea.append($li).append($hr);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}, error : function(request, status, error){\r\n");
      out.write("\t\t\t \tconsole.log(\"ajax 통신 오류\");\r\n");
      out.write("\t\t\t\tconsole.log(\"code:\"+request.status+\"\\n\"+\"message:\"+request.responseText+\"\\n\"+\"error:\"+error);\r\n");
      out.write("\t        \r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//-----------------------------------------------------------------------------------------\r\n");
      out.write("\r\n");
      out.write("// 댓글 등록\r\n");
      out.write("$(\"#addReply\").on(\"click\", function(){\r\n");
      out.write("\t\r\n");
      out.write("\t// 댓글 내용을 얻어와 변수에 저장\r\n");
      out.write("\tvar replyContent = $(\"#replyContent\").val();\r\n");
      out.write("\t\r\n");
      out.write("\t// 로그인이 되어있지 않은 경우\r\n");
      out.write("\tif(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty loginMember}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" == true){\r\n");
      out.write("\t\talert(\"로그인 후 이용해 주세요.\");\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t// 댓글이 작성되었는지 유효성 검사\r\n");
      out.write("\t\tif(replyContent.trim().length == 0){\r\n");
      out.write("\t\t\talert(\"댓글 작성 후 클릭해주세요.\");\r\n");
      out.write("\t\t\t$(\"#replyContent\").focus();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t// 로그인이 되어있고, 댓글이 작성이 된 상태로 댓글 등록 버튼이 클릭된 경우\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/reply/insertReply/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.boardNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\t\tvar memberId = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"; // 회원 아이디에 회원 번호를 저장해서 전달\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl : url,\r\n");
      out.write("\t\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t\tdata : {\"memberId\" : memberId,\r\n");
      out.write("\t\t\t\t\t\t\t\"replyContent\" : replyContent},\r\n");
      out.write("\t\t\t\t\tdataType : \"text\",\r\n");
      out.write("\t\t\t\t\tsuccess : function(result){\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t// 서버측에 출력할 내용을 가공하여 전달받아 출력\r\n");
      out.write("\t\t\t\t\t\talert(result);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$(\"#replyContent\").val(\"\"); // 기존 댓글 삭제\r\n");
      out.write("\t\t\t\t\t\tselectReplyList();\r\n");
      out.write("\t\t\t\t\t},error : function(){\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"통신 실패\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t} \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//-----------------------------------------------------------------------------------------\r\n");
      out.write("// 답글 버튼 클릭 동작\r\n");
      out.write("function addReply2Area(el, parentReplyNo){\r\n");
      out.write("\t// el : 클릭된 답글 버튼,  // parentReplyNo : 클릭된 답글 버튼이 포함된 댓글의 부모 댓글 번호\r\n");
      out.write("\t\r\n");
      out.write("\t// 답글 작성 영역이 여러 개 생기지 않도록 처리\r\n");
      out.write("\tvar check = cancelReply2(); // 답글 취소 처리 함수\r\n");
      out.write("\t\r\n");
      out.write("\t// 부모 댓글의 작성자를 얻어와 placeholder로 사용할 목적 \r\n");
      out.write("\tvar replyWriter = $(el).parent().prev().prev().children(\"a\").text();\r\n");
      out.write("\t\r\n");
      out.write("\t// 이미 화면에 존재하는 답글 작성 영역이 삭제 되어야지만\r\n");
      out.write("\t// 새로운 답글 영역을 생성, 추가함\r\n");
      out.write("\tif(check){\r\n");
      out.write("\t\tvar $div = $(\"<div>\").addClass(\"reply2Area\");\r\n");
      out.write("\t\tvar $textArea = $(\"<textarea rows='3'>\").addClass(\"reply2Content\").attr(\"placeholder\", replyWriter + \"님께 답글 작성하기\");\r\n");
      out.write("\t\tvar $btnArea = $(\"<div>\").addClass(\"btnArea\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar $insertBtn = $(\"<button>\").addClass(\"btn btn-sm btn-primary ml-1\").text(\"등록\").attr(\"onclick\", \"addReply2(this, \" + parentReplyNo + \", \\'\" + replyWriter + \"\\')\");\r\n");
      out.write("\t\tvar $cancelBtn = $(\"<button>\").addClass(\"btn btn-sm btn-secondary ml-1 reply-cancel\").text(\"취소\").attr(\"onclick\", \"cancelReply2()\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$btnArea.append($insertBtn,$cancelBtn);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$div.append($textArea, $btnArea);  \r\n");
      out.write("\t\t$(el).parent().after($div);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 추가된 답글 작성 영역으로 포커스 이동\r\n");
      out.write("\t$(\".reply2Content\").focus();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//-----------------------------------------------------------------------------------------\r\n");
      out.write("// 답글 등록\r\n");
      out.write("function addReply2(el, parentReplyNo, replyWriter){\r\n");
      out.write("\t// el : 답글 등록 버튼 요소\r\n");
      out.write("\t// parentReplyNo : 부모 댓글 번호\r\n");
      out.write("\t\t\r\n");
      out.write("\tconsole.log($(el).parent().prev().val());\r\n");
      out.write("\tconsole.log(parentReplyNo);\r\n");
      out.write("\t\r\n");
      out.write("\tvar replyContent = $(el).parent().prev().val(); // textarea에 작성된 값\r\n");
      out.write("\tvar memberId = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"; // 답글 작성자 회원 번호\r\n");
      out.write("\t\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/reply/insertReply2/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.boardNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\",\r\n");
      out.write("\t\tdata : {\"replyContent\" : replyContent,\r\n");
      out.write("\t\t\t\t\"parentReplyNo\" : parentReplyNo,\r\n");
      out.write("\t\t\t\t\"memberId\" : memberId},\r\n");
      out.write("\t\tdataType : \"text\",\r\n");
      out.write("\t\tsuccess : function(result){\r\n");
      out.write("\t\t\talert(result);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tselectReplyList();\r\n");
      out.write("\t\t},error : function(){\r\n");
      out.write("\t\t\tconsole.log(\"통신 실패\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//-----------------------------------------------------------------------------------------\r\n");
      out.write("// 답글 취소\r\n");
      out.write("function cancelReply2(){\r\n");
      out.write("\t\r\n");
      out.write("\t// 다른 답글이 작성된 상태로  새로운 답글이 클릭된 경우 \r\n");
      out.write("\t// 이미 작성된 답글을 삭제할 것이지 확인하는 작업.\r\n");
      out.write("\t\r\n");
      out.write("\t// 이미 존재하는 답글 영역에 작성된 값 얻어오기 \r\n");
      out.write("\tvar tmp = $(\".reply2Area\").children(\"textArea\").val();\r\n");
      out.write("\t// -> textarea에 값이 작성되어 있지 않으면 \"\"(빈 문자열) 반환\r\n");
      out.write("\t\r\n");
      out.write("\t// 작성된 값이 없다면\r\n");
      out.write("\tif(tmp == \"\" || tmp == undefined){\r\n");
      out.write("\t\t$(\".reply2Area\").remove(); // 클래스명이 reply2Area인 요소를 모두 제거\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tvar cancelConfirm = confirm(\"작성된 댓글 내용이 사라집니다. 취소 하시겠습니까?\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(cancelConfirm){\r\n");
      out.write("\t\t\t$(\".reply2Area\").remove();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn cancelConfirm;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
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
}

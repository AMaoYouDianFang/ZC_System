<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/2/26
  Time: 下午6:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <title>记事本</title>
    <link rel="shortcut icon" type="image/x-icon" href="/images/logo-dt.png" media="screen">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入bootstrap -->
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
    <!-- 引入JQuery  bootstrap.js-->
    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>



</head>
<body>
<!-- 顶栏 -->

<!-- 中间主体 -->
<div class="container" id="content">
    <div class="row">
        <jsp:include page="menu.jsp"></jsp:include>
        <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <div class="row">
                        <h1 style="text-align: center;">记事本: ${texttitle}</h1>
                    </div>
                </div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form" action="#" id="editfrom" >



                        <div class="form-group">
                            <input class="hidden" name="textid" value="${textid}">
                            <div id="div1">
                                ${textDic}
                            </div>

                            <%--                            <textarea style="width: 100%; resize: none; border: none; font-size:18px;" rows="25"--%>
                            <%--                                      name="content">${textDic}</textarea>--%>
                            <input class="hidden" name="currentPage" value="${currentPage}">
                        </div>
                        <div class="form-group" style="text-align: center">
                            <button class="btn btn-default" type="submit" onclick="addNoteText();">保存</button>
                            <button class="btn btn-default" type="reset">重置</button>
                        </div>
                    </form>
                </div>

            </div>

        </div>
    </div>
</div>
<div class="container" id="footer">
    <div class="row">
        <div class="col-md-12"></div>
    </div>
</div>
<script type="text/javascript" src="/js/wangEditor.min.js"></script>


</body>
<script type="text/javascript">
    $("#nav20").addClass("active");
    var E = window.wangEditor
    var editor = new E('#div1')
    editor.customConfig.menus = [
        'head',  // 标题
        'bold',  // 粗体
        'fontSize',  // 字号
        'fontName',  // 字体
        'italic',  // 斜体
        'underline',  // 下划线
        'strikeThrough',  // 删除线
        'foreColor',  // 文字颜色
        'backColor',  // 背景颜色
        'link',  // 插入链接
        'list',  // 列表
        'justify',  // 对齐方式
        //'table',  // 表格
        'undo',  // 撤销
        'redo'  // 重复
    ]
    editor.create()
    editor.$textContainerElem.css('height', '600px !important'); //设置高度
    var textid = $("input[name='textid']").val()
    var currentPage = $("input[name='currentPage']").val()

    function addNoteText() {
        var data1 = JSON.stringify({'textid': textid.toString(),"editor": editor.txt.html().toString()});
        $.ajax({
            type : "POST",
            url : "/leader/editSeNoteText",
            dataType : 'text',
            data : JSON.stringify(data1),
            contentType: "application/json;charset=utf-8",
            success: function(result) {
                if ("success" == result) {
                    window.location.href = "/leader/showSeTextDic?page=" + currentPage;
                }
            },
            error: function(result) {
                alert("提交失败");
            }

        });
    }


</script>
</html>
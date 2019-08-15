<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en-US">
  <head>
    
    <title>搜藏</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	
	<link rel="stylesheet" type="text/css" href="styles.css">
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript">
	function add(){
		window.location.href="add.do";
	}
	function update(id){
		window.location.href="update.do?id="+id;
	}
		
	</script>
  </head>
  <body>
  <div class="main">
    <form name="favForm" method="post" action="/cang/fav.do;jsessionid=FF8C0487A99814B144B07E5633524A0F">
      <input type="hidden" name="op" value="toList" />
    
    <div class="banner" valign="top">
    	 搜藏
    </div>
      
	<table cellspacing="0" cellpadding="0" border="0">
		<tr>
			<td style="text-align:right;" valign="top">
			<!-- 左边Tag列表 -->
				<div class="left_labels" >
				 
				
				<table class="labels_table" cellspacing="0" cellpadding="0" border="0">
					<tr><td><a href="#" onclick="add();" style="font-weight:bold;">添加书签</a></td></tr>
					<tr>
						<td class="${param.type==1?'selected_label':''}">
							<a href="index.do?type=1">全部</a>
						</td>
					</tr>
					<tr>
						<td class="${param.type==2?'selected_label':''}">
							<a href="index.do?type=2">未分类</a>
						</td>
					</tr>
					
						
					<c:forEach items="${tagsList }" var="t">
					    <tr><td class="${param.type==null and param.tid==t.id ? 'selected_label' :''}">
					        <a href="index.do?tid=${t.id }">${t.tName }</a>
					    </td></tr>
					</c:forEach>		
					
					<tr>
						<td class="${param.type==3?'selected_label':'' }">
							<a style="font-weight:bold;" href="index.do?type=3">云图</a>
						</td>
					</tr>
				</table>
				</div>
			</td>
			<td>
			<!-- 右边fav内容 -->
				<div class="content_links" style="overflow-y:scroll;">
				<c:if test="${param.type == 1 }">
				    <c:forEach items="${fList }" var="f">
			            <div style="padding:6px 10px;">	
							<div>
								<a href="http://${f.fUrl }" style="color:blue;font-size:18px;" target="_blank">
                                       ${f.fLabel }
                                   </a><%-- <a href="update.s?id=${f.id }"> --%><a href="#" onclick="update(${f.id})">修改</a>
							</div>
							<div style="color:black;font-size:16px;">	
								${f.fDesc }
							</div>
							<div style="color:green;font-size:14px;">
								http://${f.fUrl}
							</div>
						</div>	
				    </c:forEach>
				</c:if>
				<c:if test="${param.type == 2 }">
				    <c:forEach items="${fList }" var="f">
			            <div style="padding:6px 10px;">	
							<div>
								<a href="http://${f.fUrl }" style="color:blue;font-size:18px;" target="_blank">
                                       ${f.fLabel }
                                   </a><a href="#" onclick="update(${f.id})">修改</a>
							</div>
							<div style="color:black;font-size:16px;">	
								${f.fDesc }
							</div>
							<div style="color:green;font-size:14px;">
								http://${f.fUrl}
							</div>
						</div>	
				    </c:forEach>
				</c:if>
				<c:if test="${param.type == 3 }">
				    <c:forEach items="${tagsList }" var="t">
				        <h${t.tCount > 1 ? 1 : 2}>
				            ${t.tName }
				        </h${t.tCount > 1 ? 1 : 2}>
				    </c:forEach>
				</c:if>
				<c:if test="${param.type != 3 }">
				    <c:forEach items="${tagsList }" var="t">
					    <c:if test="${t.id == param.tid }">
					        <c:forEach items="${t.fList }" var="f">
					            <div style="padding:6px 10px;">	
									<div>
										<a href="http://${f.fUrl }" style="color:blue;font-size:18px;" target="_blank">
	                                        ${f.fLabel }
	                                    </a><a href="#" onclick="update(${f.id})">修改</a>
									</div>
									<div style="color:black;font-size:16px;">	
										${f.fDesc }
									</div>
									<div style="color:green;font-size:14px;">
										http://${f.fUrl}
									</div>
								</div>	
					        </c:forEach>
					    </c:if>
					</c:forEach>
				</c:if>
							
				</div>
			</td>
		</tr>
	</table> 
	
    </form>
   </div>
  </body>
</html>
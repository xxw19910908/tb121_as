<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>

	.a1{
		text-decoration: none;
		color: #fff;
	}
	.topDiv{
		width:980px;
		height: 62px;
		background: url('/tb121_as/img/top_bg.gif') 20px -5px no-repeat;
		text-align: right;
		padding-right: 20px;
	}

</style>

<div>

<div class="topDiv" >
	<c:if test="${empty user }">
	<a class="a1" href="javaScript:void();" id="loginBtn">登录</a>
</c:if>
	<c:if test="${user !=null }">
		欢迎：${user.userName }
		
		<a class="a1" href="/tb121_as/as/user/logout" >退出</a>
		
	</c:if>
</div>


	<div class="easyui-panel" style="padding:5px;">
	
		<c:forEach items="${menus}" var="m" varStatus="s">
		<a href="#" class="easyui-menubutton" data-options="menu:'#mm${s.count }',iconCls:'icon-large-smartart'">${m.functionName }</a>
		
		</c:forEach>
	
	</div>
	
	<c:forEach items="${menus}" var="m" varStatus="s">
		<div id="mm${s.count}" style="width:100px;">
		
		<c:forEach items="${m.menus}" var="mm" >
		<div data-options="iconCls:'icon-undo',href:'${mm.funcUrl }' ">${mm.functionName}</div>
		
		</c:forEach>
		
		</div>
	</c:forEach>
	
	
	
</div>


<div id="dlg" class="easyui-dialog" title="Basic Dialog" data-options="title:'用户登录',closed:true" style="width:400px;height:200px;padding:10px">
			<div style="padding:10px 60px 20px 60px">
	    <form id="loginForm" method="post">
	    	<table cellpadding="5">
	    		<tr>
	    			<td>Name:</td>
	    			<td><input class="easyui-validatebox" type="text" name="userCode" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>Password:</td>
	    			<td><input class="easyui-validatebox" type="password" name="pwd" data-options="required:true,validType:'ckPwd'"></input></td>
	    		</tr>
	    		
	    	</table>
	    </form>
	    <div style="text-align:center;padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">Submit</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">Clear</a>
	    </div>
	    </div>
</div>


<script>

	

//自定义验证规则
$.extend($.fn.validatebox.defaults.rules, {    
    ckPwd: {    
        validator: function(value, param){
        	var regexp=/^\d{6,10}$/;        	        	
            return regexp.test(value);    
        },    
        message: '密码必须是数字，长度为6-10位'   
    }    
});  

	
	
	
	
	
	$("#loginBtn").click(function(){
		//组件如何调用方法
		$("#dlg").dialog('open');
		
		
	});

	
//登录
function submitForm(){
	$('#loginForm').form({    
	    url:"http://localhost:8080/tb121_as/as/user/login",    
	    onSubmit: function(){    
	    	var isValid = $(this).form('validate');
			if (!isValid){
				$.messager.progress('close');	// 如果表单是无效的则隐藏进度条
			}
			return isValid;	// 返回false终止表单提交
  
	    },    
	    success:function(data){
	    	//关闭对话框
	    	$("#dlg").dialog('close');
	    	
	    	if(JSON.parse(data).code!=200){
	    		//出来一个消息
		    	$.messager.show({
		    		title:'登录结果',
		    		msg:JSON.parse(data).message,
		    		showType:'slide'
		    		
		    	});
	    	}else{
	    		
	    		window.location="http://localhost:8080/tb121_as/as/goIndex";
	    	}
	    	

	    	
	        
	    }    
	}); 
	
	// submit the form    
	$('#loginForm').submit();  

		return false;
		}

	
	


</script>



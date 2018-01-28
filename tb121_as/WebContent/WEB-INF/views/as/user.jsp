<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<table id="userDg"></table>  


<script>

$('#userDg').datagrid({    
    url:'http://localhost:8080/tb121_as/as/user/showUser',    
    columns:[[    
        {field:'userId',title:'编号',width:150,align:'center',halign:'center',sortable:true,order:'desc',styler: function(value,row,index){
			if (value < 5){
				return 'color:red;';
			}else{
				return 'color:green;';
				
			}
		}
},    
        {field:'userName',title:'姓名',width:150},    
        {field:'roleName',title:'权限',width:150},
        {field:'',title:'操作',width:150,formatter: function(value,row,index){
			
        	console.log(row);
        	
        	return "<a class='aa' href='/aaa/aa/dele?userID="+row.userId+"'>删除</a> |  <a href='#'>更新</a>";
		}
}
    ]],
    sortName:'userId',
    remoteSort:false
});  










</script>
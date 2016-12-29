<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>注册</title>
	<meta name="keywords" content="注册">
	<meta name="content" content="注册">
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <link type="text/css" rel="stylesheet" href="css/login.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>

</head>
<body class="login_bj" >

<div class="zhuce_body">
	<div class="logo"><a href="#"><img src="images/logo.png" width="114" height="54" border="0"></a></div>
    <div class="zhuce_kong">
    	<div class="zc">
        	<div class="bj_bai">
            <h3>欢迎注册</h3>
       	  	  <form action="" method="get">
                <input name="" type="text" class="kuang_txt phone" placeholder="用户名" onblur="validate()" onfocus="">
                <input name="" type="text" class="kuang_txt email" placeholder="邮箱">
                <input name="" type="text" class="kuang_txt possword" placeholder="密码">
                <input name="" type="text" class="kuang_txt possword" placeholder="邀请码">
                <input name="" type="text" class="kuang_txt yanzm" placeholder="验证码">
                <div>
                	<div class="hui_kuang"><img src="images/zc_22.jpg" width="92" height="31"></div>
                	<div class="shuaxin"><a href="#"><img src="images/zc_25.jpg" width="13" height="14"></a></div>
                </div>
                <div>
               		<input name="" type="checkbox" value=""><span>已阅读并同意<a href="#" target="_blank"><span class="lan">《XXXXX使用协议》</span></a></span>
                </div>
                <input name="注册" type="button" class="btn_zhuce" value="注册">
                
                </form>
            </div>
        	<div class="bj_right">
            	<p>使用以下账号直接登录</p>
                <a href="#" class="zhuce_qq">QQ注册</a>
                <a href="#" class="zhuce_wb">微博注册</a>
                <a href="#" class="zhuce_wx">微信注册</a>
                <p>已有账号？<a href="login.html">立即登录</a></p>
            
            </div>
        </div>
        <P>Diyhe.com&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎您定制盒子模型</P>
    </div>

</div>
    
<div style="text-align:center;">
<p>来源:<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p>
</div>

</body>
<script type="text/javascript">
	var validate = function(){
		var sname = $("#sname").val();
		//var spassword = "11111";
		//alert(hex_md5(spassword));
		$.ajax({
			url: "./access/validate",
			data: "name="+sname,
			type: "post",
			dataType:"json",
			success: function(result){
				//alert(result);
				console.log(result);
			},
			error: function(e){
				alert(e);
			}
		});
	}
	var swap = function(){
		
	}
</script>
</html>
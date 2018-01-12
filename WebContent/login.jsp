<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆</title>
<style>
@media screen and (max-width: 1400px) {
	.bili-wrapper {
		margin: 0 auto;
		width: 980px;
	}
}
</style>
<style type="text/css">
* {
	padding: 0 auto;
	margin: 0 auto;
}
</style>
<style>
			div{
			    display: block;
			}
			ul{
				width: 410px;
				height: 302px;
				margin: 0px;
				padding: 0px;
				list-style-type: none;
				display: block;
				-webkit-margin-before: 1em;
				-webkit-margin-after: 1em;
				-webkit-margin-start: 0px;
				-webkit-margin-end: 0px;
				-webkit-padding-start: 0px;
			}
			li{
				margin: 0px;
				padding: 0px;
				display: list-item;
				list-style-type: none;
				text-align: -webkit-match-parent;
			}
			span{
				margin: 0px;
				padding: 0px;
			}
			input{
				cursor:auto;
				width: 388px;
				border: 1px solid rgb(221, 221, 221);
				color: rgb(170, 170, 170);
				font-size: 14px;
				padding: 10px;
				height: 18px;
				vertical-align: middle;
				border-radius: 4px;
				font-style: normal;
				font-variant: normal;
				font-weight: normal;
				font-stretch: normal;
				line-height: normal;
				font-family: "Helvetica Neue", Helvetica, Arial, "Microsoft Yahei", "Hiragino Sans GB", "Heiti SC", "WenQuanYi Micro Hei", sans-serif;
			}
			p{
				color: rgb(246, 100, 149);
				float: left;
				margin: 0px;
				padding: 0px;
				display: block;
				-webkit-margin-before: 1em;
				-webkit-margin-after: 1em;
				-webkit-margin-start: 0px;
				-webkit-margin-end: 0px;
			}
			a{
				outline: 0px;
				text-decoration: none;
			}
		</style>
		<style>
			.top-banner {
				background: #00a0d8;
				height: 86px;
				text-align: center;
				margin-bottom: 20px;
			}
			.title-line {
				color: #666;
				font-size: 38px;
				height: 56px;
				line-height: 56px;
				margin: 0 auto;
				padding: 0 20px;
				font-size: 40px;
				background: #fff;
				text-align: center;
			}
			.login-box{
				position: relative;
				width: 980px;
				height: 325px;
				margin: 0px auto;
			}
			.login-box .login-left{
				position: relative;
				width: 445px;
				height: 322px;
				float: left;
				padding-right: 35px;
			}
			.login-box .login-left .form-login{
				position: relative;
				width: 410px;
				height: 322px;
				float: left;
				padding-right: 35px;
				-webkit-margin-before: 4em;
				-webkit-margin-after: 1em;
				-webkit-margin-start: 0px;
				-webkit-margin-end: 0px;
			}
			.status-box{
				position: relative;
				width: 410px;
				height: 66px; 
			}
			.status{
				display: none;
				background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMAAAABgCAYAAABLwH3pAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyZpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMTM4IDc5LjE1OTgyNCwgMjAxNi8wOS8xNC0wMTowOTowMSAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6RjQwNEFEMDQ2MDY1MTFFNzgwMUFCNTY2RDg4RTI2MzciIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6RjQwNEFEMDM2MDY1MTFFNzgwMUFCNTY2RDg4RTI2MzciIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIDIwMTUgKFdpbmRvd3MpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjZBN0NFOTkzQThEMTFFNTgxMjFCNUQ2NUNCMTI0N0QiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjZBN0NFOUEzQThEMTFFNTgxMjFCNUQ2NUNCMTI0N0QiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4mPh/xAAAMb0lEQVR42uxd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);
				position: absolute;
				top: 8px;
				right: -25px;
				width: 20px;
				height: 20px;
			}
			.text{
				margin: 6px 0px;
				font-size: 12px;
				height: 20px;
				line-height: 20px;
			}
			.btn-login{
				border: 1px solid rgb(3, 129, 170);
				color: rgb(255, 255, 255);
				background-color: rgb(0, 167, 222);
				display: inline-block;
				height: 36px;
				border-radius: 2px;
				width: 184px;
				line-height: 38px;
				font-size: 14px;
				text-align: center;
				cursor: pointer;
				transition: all 0.3s;
			}
			.btn-reg{
				margin-left: 30px;
				color: rgb(85, 85, 85);
				display: inline-block;
				height: 36px;
				border: 1px solid rgb(204, 204, 204);
				border-radius: 2px;
				width: 184px;
				line-height: 38px;
				font-size: 14px;
				text-align: center;
				cursor: pointer;
				transition: all 0.3s;
			}
			.login-box .line{
				float: left;
				border-right: 1px solid rgb(221, 221, 221);
				height: 300px;
				margin: 0px auto 0px 50%;
				position: absolute;
				top: 28px;
			}
			.login-box .login-right{
				position: absolute;
				left:80px;
				float: right;
				padding-right: 70px;
				margin: 58px auto 0px 50%;
				top: 10px;
			}
		</style>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
		<script type="text/javascript">
			$(function() {
				
			})
		</script>
	</head>
	<body>
	<div>
		<div class="top-banner">
			<img src="http://s1.hdslb.com/bfs/static/passport/static/img/rl_top.35edfde.png">
		</div>
		<div class="title-line">
			<span class="tit" style="font-size: 38px;">登录</span>
		</div>
		<div class="login-box">
			<div class="login-left">
				<div class="form-login">
					<ul>
						<li class="username status-box">
							<input type="text" placeholder="你的手机号/邮箱" id="login-username" maxlength="50" autocomplete="off">
							<span class="status"></span>
							<div class="text"><p class="tips"></p></div>
						</li>
						<li class="userpassword status-box">
							<input type="text" placeholder="密码" id="login-passwd">
							<span class="status"></span>
							<div class="text"><p class="tips"></p></div>
						</li>
						<li class="btn-box">
							<a class="btn-login" style="pointer-events:auto;" href="">登陆</a>
							<a class="btn-reg" href="">注册</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="line"></div>
			<div class="login-right">
				<img src="${pageContext.request.contextPath}/img/a.gif" width="298px" height="199px">
			</div>
		</div>
	</div>
</body>
</html>
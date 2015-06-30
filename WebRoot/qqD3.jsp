<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<meta name="author" content="echo" >
	<meta http-equiv="cache-control" content="no-cache">
	<script src="Static/js/org/jquery.min.js"></script>
	<script src="Static/js/org/d3.min.js"></script>
	<script src="Static/js/module/Re_DrawD3_QQ.js"></script>
	<title>QQ关系图</title>

	<style>
		.node {
		  cursor: pointer;
		  fill : url(#hs);
		}
		
		.node:hover {
		  /*stroke: #FF8C00;*/
		  stroke-width: 1.5px;
		  fill : url(#hs);
		}		
		.node node--leaf {
		  fill: white;
		  opacity:1;
		}
		.node node--leaf:hover {
		  fill: #FF8C00;
		  opacity:1;
		}
		.node node--root {
		  fill: red;
		  opacity:1;
		}
		.node node--root:hover {
		  fill: pink;
		  opacity:1;
		}
		
		.label {
		  font: 11px "Helvetica Neue", Helvetica, Arial, sans-serif;
		  text-anchor: middle;
		  text-shadow: 0 1px 0 #fff, 1px 0 0 #fff, -1px 0 0 #fff, 0 -1px 0 #fff;
		}
		
		.label,
		.node--root,
		.node--leaf {
		  pointer-events: none;
		}
		
		.linetext {
			font-family: '微软雅黑',
			font-size: .6em ;
			/*font-family: SimSun;*/
			fill:lightgrey;
			fill-opacity:1;
		}
		.myload{
			display:none;
			position: absolute;
			top:200px;
			left:900px;
			height: 50px;
			width: 200px;
			background: black;
			opacity: 1;
			border-radius: 10px;
			text-align: center;
			padding-top:24px;
			z-index: 777;
		}
		.bgload{
			display:none;
			position: absolute;
			height: 100%;
			width: 100%;
			background: lightgrey;
			opacity: .3;
			z-index: 666;
			padding:0;
			margin:0;
		}
		.right>a{
			display: inline-block;
			background: white;
			border-radius: 5px;
			box-shadow: 0 0px 0px 1px lightgrey;
			width:100px;
			height: 20px;
			color: blue;
			text-align: center;
			padding: 5px 0;
		}

	</style>
	
	<script>
		function initShowQQD3Relation() {
			var qqid = "12345";
			var orgqunid= "56781";
			$.ajax({
				url: "/D3Extensionable/callBackDrawQQD3.do?qqid=" + qqid,
				type: "get",
				dataType: "json",
				beforeSend: function() {
					$("#imgload").show();
				},
				ajaxStop: function() {
					$("#imgload").hide();
				},
				
				success: function (result) {
					$("#imgload").hide();
					drawD3QQ(result, orgqunid);
					
				}, 
				error: function () {
					$("#imgload").hide();
				}
			
			})
		}
	
	</script>

	
	
<body onload="initShowQQD3Relation()">
	<div class="bgload">
		<div class="myload">扩展中......</div>
	</div>

			
	<div class="right" id="right">
			
			
			
			<%--<input type="button" id="showAll" style="position:absolute;" onclick="showAllNets()" value="全部展开" />
			<input type="button" id="showMore" onclick="showMoreChild()" value="扩展" />	--%>
			<%--<input type="button" id="save" onclick="saveAsSvg()" value="保存SVG" />
			<input type="button" id="save" onclick="saveAsPng()" value="保存PNG" />
			<input type="button" id="save" onclick="saveAsJpg()" value="保存JPG" />
			--%><%--<a id="_svg" download="" href="">保存SVG</a>
			<a id="_jpg" download="" href="">保存JPG</a>
			<a id="_png" download="" href="">保存PNG</a>--%>
			<img alt="" id="imgload" src="Static/img/loading.gif" / style="display:none; margin-left:30%; margin-top:10%">
			<div class="tu" id="d3part"></div>
	</div>
	
	<%--定义一些svg渐变的效果对象，作为节点样式使用--%>
	  <svg>
			<radialGradient id="qungr" cx="0.5"  cy="0.5" r="0.5" fx="0.5" fy="0.5">
				<stop offset="0" stop-color="rgba(152, 251, 152,0.6)" />
				<stop offset="0.5" stop-color="rgba(50, 205, 50,0.7)" />
				<stop offset="1" stop-color="rgba(34, 139, 34,0.7)" />
			</radialGradient>
			
			<radialGradient id="qqgr" cx="0.5"  cy="0.5" r="0.5" fx="0.5" fy="0.5">
				<stop offset="0" stop-color="rgba(175, 238, 238,0.9)" />
				<stop offset="0.5" stop-color="rgba(102,205,170,0.6)" />
				<stop offset="1" stop-color="rgba(46, 139, 87,0.4)" />
			</radialGradient>
			
			<radialGradient id="self2" cx="0.5"  cy="0.5" r="0.6" fx="0.5" fy="0.5">
				<stop offset="0" stop-color="rgba(131, 111, 255,0.3)" />
				<stop offset="0.5" stop-color="rgba(218, 112, 214,0.8)" />
				<stop offset="1" stop-color="rgba(176, 48, 96,0.6)" />
			</radialGradient>
			<radialGradient id="self" cx="0.5"  cy="0.5" r="0.5" fx="0.5" fy="0.5">
				<stop offset="0" stop-color="rgba(30, 144, 255,0.3)" />
				<stop offset="0.5" stop-color="rgba(65, 105, 225,0.7)" />
				<stop offset="1" stop-color="rgba(0, 0, 139,0.6)" />
			</radialGradient>
			
			<radialGradient id="hs" cx="0.5"  cy="0.5" r="0.5" fx="0.5" fy="0.5">
				<stop offset="0" stop-color="rgba(255, 255, 0,0.2)" />
				<stop offset="0.3" stop-color="rgba(255, 215, 0,0.7)" />
				<stop offset="0.7" stop-color="rgba(255, 165, 0,0.8)" />
				<stop offset="1" stop-color="rgba(255, 165, 0,1)" />
			</radialGradient>
		</svg>

	
</body>
</html>

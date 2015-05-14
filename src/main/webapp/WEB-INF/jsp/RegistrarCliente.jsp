<!-- p2 --><%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
   <head>
   <title>Sistema de Inventario Figuritas</title>
   <meta charset="UTF-8">
   <style>
/*! normalize.css v3.0.2 | MIT License | git.io/normalize */html{font-family:sans-serif;-ms-text-size-adjust:100%;-webkit-text-size-adjust:100%}body{margin:0}article,aside,details,figcaption,figure,footer,header,hgroup,main,menu,nav,section,summary{display:block}audio,canvas,progress,video{display:inline-block;vertical-align:baseline}audio:not([controls]){display:none;height:0}[hidden],template{display:none}a{background-color:transparent}a:active,a:hover{outline:0}abbr[title]{border-bottom:1px dotted}b,strong{font-weight:bold}dfn{font-style:italic}h1{font-size:2em;margin:0.67em 0}mark{background:#ff0;color:#000}small{font-size:80%}sub,sup{font-size:75%;line-height:0;position:relative;vertical-align:baseline}sup{top:-0.5em}sub{bottom:-0.25em}img{border:0}svg:not(:root){overflow:hidden}figure{margin:1em 40px}hr{-moz-box-sizing:content-box;-webkit-box-sizing:content-box;box-sizing:content-box;height:0}pre{overflow:auto}code,kbd,pre,samp{font-family:monospace, monospace;font-size:1em}button,input,optgroup,select,textarea{color:inherit;font:inherit;margin:0}button{overflow:visible}button,select{text-transform:none}button,html input[type="button"],input[type="reset"],input[type="submit"]{-webkit-appearance:button;cursor:pointer}button[disabled],html input[disabled]{cursor:default}button::-moz-focus-inner,input::-moz-focus-inner{border:0;padding:0}input{line-height:normal}input[type="checkbox"],input[type="radio"]{-webkit-box-sizing:border-box;-moz-box-sizing:border-box;box-sizing:border-box;padding:0}input[type="number"]::-webkit-inner-spin-button,input[type="number"]::-webkit-outer-spin-button{height:auto}input[type="search"]{-webkit-appearance:textfield;-moz-box-sizing:content-box;-webkit-box-sizing:content-box;box-sizing:content-box}input[type="search"]::-webkit-search-cancel-button,input[type="search"]::-webkit-search-decoration{-webkit-appearance:none}fieldset{border:1px solid #c0c0c0;margin:0 2px;padding:0.35em 0.625em 0.75em}legend{border:0;padding:0}textarea{overflow:auto}optgroup{font-weight:bold}table{border-collapse:collapse;border-spacing:0}td,th{padding:0}

</style>

    <style>
body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, 
pre, form, fieldset, input, textarea, p, blockquote, th, td { 
  padding:0;
  margin:0;}

fieldset, img {border:0}

ol, ul, li {list-style:none}

:focus {outline:none}

body,
input,
textarea,
select {
  font-family: 'Open Sans', sans-serif;
  font-size: 16px;
  color: #4c4c4c;
}

p {
  font-size: 12px;
  width: 150px;
  display: inline-block;
  margin-left: 18px;
}
h1 {
  font-size: 32px;
  font-weight: 300;
  color: #4c4c4c;
  text-align: center;
  padding-top: 10px;
  margin-bottom: 10px;
}

html{
  background-color: #ffffff;
}

.testbox {
  margin: 20px auto;
  width: 343px; 
  height: 600px; 
  -webkit-border-radius: 8px/7px; 
  -moz-border-radius: 8px/7px; 
  border-radius: 8px/7px; 
  background-color: #ebebeb; 
  -webkit-box-shadow: 1px 2px 5px rgba(0,0,0,.31); 
  -moz-box-shadow: 1px 2px 5px rgba(0,0,0,.31); 
  box-shadow: 1px 2px 5px rgba(0,0,0,.31); 
  border: solid 1px #cbc9c9;
}

input[type=radio] {
  visibility: hidden;
}

form{
  margin: 0 30px;
}

label.radio {
  cursor: pointer;
  text-indent: 35px;
  overflow: visible;
  display: inline-block;
  position: relative;
  margin-bottom: 15px;
}

label.radio:before {
  background: #FF4500;
  content:'';
  position: absolute;
  top:2px;
  left: 0;
  width: 20px;
  height: 20px;
  border-radius: 100%;
}

label.radio:after {
  opacity: 0;
  content: '';
  position: absolute;
  width: 0.5em;
  height: 0.25em;
  background: transparent;
  top: 7.5px;
  left: 4.5px;
  border: 3px solid #ffffff;
  border-top: none;
  border-right: none;

  -webkit-transform: rotate(-45deg);
  -moz-transform: rotate(-45deg);
  -o-transform: rotate(-45deg);
  -ms-transform: rotate(-45deg);
  transform: rotate(-45deg);
}

input[type=radio]:checked + label:after {
  opacity: 1;
}

hr{
  color: #a9a9a9;
  opacity: 0.3;
}

input[type=text],input[type=password]{
  width: 200px; 
  height: 39px; 
  -webkit-border-radius: 0px 4px 4px 0px/5px 5px 4px 4px; 
  -moz-border-radius: 0px 4px 4px 0px/0px 0px 4px 4px; 
  border-radius: 0px 4px 4px 0px/5px 5px 4px 4px; 
  background-color: #fff; 
  -webkit-box-shadow: 1px 2px 5px rgba(0,0,0,.09); 
  -moz-box-shadow: 1px 2px 5px rgba(0,0,0,.09); 
  box-shadow: 1px 2px 5px rgba(0,0,0,.09); 
  border: solid 1px #cbc9c9;
  margin-left: -5px;
  margin-top: 13px; 
  padding-left: 10px;
}

input[type=password]{
  margin-bottom: 25px;
}

#icon {
  display: inline-block;
  width: 30px;
  background-color: #FF4500;
  padding: 8px 0px 8px 15px;
  margin-left: 15px;
  -webkit-border-radius: 4px 0px 0px 4px; 
  -moz-border-radius: 4px 0px 0px 4px; 
  border-radius: 4px 0px 0px 4px;
  color: white;
  -webkit-box-shadow: 1px 2px 5px rgba(0,0,0,.09);
  -moz-box-shadow: 1px 2px 5px rgba(0,0,0,.09); 
  box-shadow: 1px 2px 5px rgba(0,0,0,.09); 
  border: solid 0px #cbc9c9;
}

.gender {
  margin-left: 30px;
  margin-bottom: 30px;
}

.accounttype{
  margin-left: 8px;
  margin-top: 20px;
}

a.button {
  font-size: 14px;
  font-weight: 600;
  color: white;
  padding: 6px 25px 0px 20px;
  margin: 10px 8px 20px 0px;
  display: inline-block;
  float: right;
  text-decoration: none;
  width: 50px; height: 27px; 
  -webkit-border-radius: 5px; 
  -moz-border-radius: 5px; 
  border-radius: 5px; 
  background-color: #FF4500; 
  -webkit-box-shadow: 0 3px rgba(58,87,175,.75); 
  -moz-box-shadow: 0 3px rgba(58,87,175,.75); 
  box-shadow: 0 3px rgba(58,00,10,.75);
  transition: all 0.1s linear 0s; 
  top: 0px;
  position: relative;
}

a.button:hover {
  top: 3px;
  background-color:#FF0000;
  -webkit-box-shadow: none; 
  -moz-box-shadow: none; 
  box-shadow: none;

}

*{
	padding: 0px;
	margin: 0px;
}

header{
	width: 100%;
	height: auto;
	font-family: Arial,Helvetica, sans-serif;
}

nav{

	width: 100%;
	height: 122px;
	background-color: #000000;

}

nav ul{
	list-style: none;
}

nav ul li a{
			background-color: #000;
			color: #fff;
			text-decoration: none;	
			padding: 42px  55px;
			display: block;

}

nav li a:hover{
	background-color: #434343;
}
nav > ul > li{
	float: left;

}

</style>

    <script src="js/prefixfree.min.js"></script>
   
   </head>
   <body>
 
		<header>	
		<center><img src="http://i61.tinypic.com/35k3bzl.jpg" border="0" alt="Image and video hosting by TinyPic"></center>
		<nav>
		
				<ul>
					<li><a href="RegistrarProducto.htm"><h4>Registro de Producto</h4></a></li>
					<li><a href="ActualizarStock.htm"><h4>Actualizar Stock</h4></a></li>
					<li><a href="RegistrarCliente.htm"><h4>Registrar Cliente</h4></a></li>
					<li><a href="#"><h4>Visualizar Producto</h4></a></li>
				</ul>
		</nav>
		</header>
	
	  <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>
<link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">

<div class="testbox">
<center>
  <h1><spring:message code="label.title"/></h1>
   
<!-- p2 -->   <form:form method="post" action="addCliente.htm">
	
	   <table width="200" border="0">
	     <tr>
	       <td width="46"><spring:message code="label.id"/></td>
	       <td width="144">
<!-- p2 -->   		<form:input path="id"/>	       </td>
	     </tr>
	     <tr>
	       <td><spring:message code="label.name"/></td>
	       <td>
<!-- p2 -->    		<form:input path="name"/>	       </td>
	     </tr>
	     <tr>
	       <td><spring:message code="label.lastname"/></td>
	       <td>
<!-- p2 -->    		<form:input path="lastname"/>	       </td><br/>
	     </tr>
	     <tr>
	       <td><spring:message code="label.gender"/></td>
	       <td>
<!-- p2 -->	       
	 			<form:select path="gender" id="genderOptions">
	        		<form:option value="">Select Gender</form:option>
	        		<form:option value="MALE"><spring:message code="label.genderM"/></form:option>
	        		<form:option value="FEMALE"><spring:message code="label.genderF"/></form:option>
	      		</form:select>
	      		
	       </td>
         </tr>
          <tr>
	       <td width="46"><spring:message code="label.dni"/></td>
	       <td width="144">
<!-- p2 -->   		<form:input path="dni"/>	       </td>
	     </tr>
         <tr>
	       <td width="46"><spring:message code="label.age"/></td>
	       <td width="144">
<!-- p2 -->   		<form:input path="age"/>	       </td>
	     </tr>
	     <tr>
	       <td width="46"><spring:message code="label.email"/></td>
	       <td width="144">
<!-- p2 -->   		<form:input path="email"/>	       </td>
	     </tr>
	     <tr>
	       <td width="46"><spring:message code="label.telephone"/></td>
	       <td width="144">
<!-- p2 -->   		<form:input path="telephone"/>	       </td>
	     </tr>
	     <tr>
	       <td width="46"><spring:message code="label.address"/></td>
	       <td width="144">
<!-- p2 -->   		<form:input path="address"/>	       </td>
	     </tr>
	     <tr>
	       <td>&nbsp;</td>
	       <td><input type="submit" name="Submit" value="<spring:message code="label.btnRegister"/>"></td>
	     </tr>
	   </table>
<!-- p2 -->   </form:form>
</center>
</div>
   </body>
</html>
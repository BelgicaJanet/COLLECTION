<!DOCTYPE html>
<html>
<head lang="es">
<meta charset="UTF-8"/> 
<link rel="stylesheet" type="text/css" href="<%request.getContextPath(); %>CSS/index.css">
	<title>POWERCOLLETION</title>
	
	<style type="text/css">
	
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
</head>
	<body>
			
		<header>	
		<center><img src="http://i61.tinypic.com/35k3bzl.jpg" border="0" alt="Image and video hosting by TinyPic"></center>
		
		<nav>
		
				<ul>
					<li><a href="RegistrarProducto.htm"><h4>Registro de Producto</h4></a></li>
				</ul>
				<ul>	
					<li><a href="ActualizarStock.htm"><h4>Actualizar Stock</h4></a></li>
				</ul>
				<ul>	
					<li><a href="RegistrarCliente.htm"><h4>Registrar Cliente</h4></a></li>
				</ul>
				<ul>	
					<li><a href="#"><h4>Visualizar Producto</h4></a></li>
				</ul>
		</nav>
		</header>
	
	
	INdex donde se mostrara toda la informacion con respecto a nuestra pagina y algo mas
	</body>
	</html>

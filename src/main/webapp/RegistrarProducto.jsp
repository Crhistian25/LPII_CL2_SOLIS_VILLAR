<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar cliente</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">
Registrar Producto
</h1>
<form action="ControladorProducto" method="post">
<table align="center">
<tr>
<td>nombre</td>
<td><input type="text" name="nombre"></td>
</tr>
<tr>
<td>Precio venta</td>
<td><input type="text" name="precioventa"></td>
</tr>
<tr>
<td>Precio compra</td>
<td><input type="text" name="preciocompra"></td>
</tr>
<tr>
<td>Estado</td>
<td><input type="text" name="estado"></td>
</tr>
<tr>
<td>Descripcion</td>
<td><input type="text" name="descrip"></td>
</tr>
<tr>
<td colspan="2" style="text-align:center">
<input type="submit"  value="Registrar">
</td>
</tr>
</table>

</form>

</body>
</html>
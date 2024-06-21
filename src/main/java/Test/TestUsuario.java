package Test;

import Dao.TblProductoImp;
import Dao.TblUsuarioImp;
import model.TblProductocl2;
import model.TblUsuariocl2;

public class TestUsuario {

	public static void main(String[] args) {
		//realizamos las respectiva instancias..
		TblUsuariocl2 usuario=new TblUsuariocl2();
		TblUsuarioImp crud=new TblUsuarioImp();
		//insertamos datos
		usuario.setUsuariocl2("cristian");
		usuario.setPasswordcl2("123456");
		//invocamos el metodo registrar...
		crud.RegistrarUsuario(usuario);
		//****************testeamos el listado
		/*List<TblProductocl2> listado=crud.ListarProducto();
		//aplicamos un bucle
		for(TblProductocl2 lis:listado){
			
			//imprimimos por pantalla
			System.out.println("codigo "+lis.getIdproductocl2()+
					" nombre "+lis.getNombrecl2()+" precio venta "+lis.getPrecioventacl2()+" precio compra "+
					lis.getPreciocompcl2()+"estado" + lis.getEstadocl2() + "descripcion"+ lis.getDescripcl2());*/
			
		}    //fin del bucle for...
		

	}//fin del metodo principal...

//fin de la clase...

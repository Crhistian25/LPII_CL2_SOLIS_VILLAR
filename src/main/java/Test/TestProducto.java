package Test;

import java.util.List;

import Dao.TblProductoImp;
import model.TblProductocl2;

public class TestProducto {

	public static void main(String[] args) {
		//realizamos las respectiva instancias..
				TblProductocl2 producto=new TblProductocl2();
				TblProductoImp crud=new TblProductoImp();
				//insertamos datos
				/*producto.setNombrecl2("hals");
				producto.setPrecioventacl2(0);
				producto.setPreciocompcl2(0);
				producto.setEstadocl2(0);
				producto.setDescripcl2("sellado");*/
				//invocamos el metodo registrar...
				crud.RegistrarProducto(producto);
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

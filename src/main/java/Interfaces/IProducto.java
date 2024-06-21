package Interfaces;

import java.util.List;

import model.TblProductocl2;

public interface IProducto {
	//declaramos los metodos
		public void RegistrarProducto(TblProductocl2 productocl2);
		public void ActualizarProducto(TblProductocl2 productocl2);
		public void EliminarProducto(TblProductocl2 productocl2);
		public TblProductocl2 BuscarProducto(TblProductocl2 productocl2);
		public List<TblProductocl2> ListarProducto();
}  //fin de la interface

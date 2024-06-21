package Interfaces;

import java.util.List;

import model.TblProductocl2;
import model.TblUsuariocl2;

public interface IUsuario {
	//declaramos los metodos
			public void RegistrarUsuario(TblUsuariocl2 usuariocl2);
			public void ActualizarUsuario(TblUsuariocl2 usuariocl2);
			public void EliminarUsuario(TblUsuariocl2 usuariocl2);
			public TblUsuariocl2 BuscarProducto(TblUsuariocl2 usuariocl2);
			public List<TblUsuariocl2> listarTblUsuariocl2s();
			 TblUsuariocl2 obtenerUsuario(String usuario);

}    //fin de la interface...

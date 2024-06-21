package Dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl2;

public class TblProductoImp implements IProducto {

	@Override
	public void RegistrarProducto(TblProductocl2 cliente) {
		//establecemo conexion con la unidad de persistencia...
				EntityManagerFactory fabri=Persistence.createEntityManagerFactory("Examen_CL2_SOLIS");
				//permite gestionar entidades..
				EntityManager eman=fabri.createEntityManager();
				//iniciar transaccion...
				eman.getTransaction().begin();
				//registramos
				eman.persist(cliente);
				//emitimos mensaje por pantalla
				System.out.println("Producto registrado en la base de datos");
				//confirmamos
				eman.getTransaction().commit();
				//cerramos la transaccion...
				eman.close();
		
	}

	@Override
	public void ActualizarProducto(TblProductocl2 cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarProducto(TblProductocl2 cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TblProductocl2 BuscarProducto(TblProductocl2 cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TblProductocl2> ListarProducto() {
		//establecemos la conexion con la unidad de persistencia..
				EntityManagerFactory fab=Persistence.createEntityManagerFactory("Examen_CL2_SOLIS");
				//gestionamos las entidades
				EntityManager  em=fab.createEntityManager();
				//iniciamos la transaccion
				em.getTransaction().begin();
				//recuperamos la data de la base de datos
				List<TblProductocl2> listado=em.createQuery("select c from TblProductocl2 c",TblProductocl2.class).getResultList();
				//confirmamos la transaccion
				em.getTransaction().commit();
				//cerramos
				em.close();
				//retornamos el listado
				return listado;
	}

}   //fin de la clase..

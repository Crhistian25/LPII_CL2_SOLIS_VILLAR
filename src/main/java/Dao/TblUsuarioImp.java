package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import Interfaces.IUsuario;
import model.TblProductocl2;
import model.TblUsuariocl2;

public class TblUsuarioImp implements IUsuario{

	@Override
	public void RegistrarUsuario(TblUsuariocl2 usuariocl2) {
		//establecemo conexion con la unidad de persistencia...
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("Examen_CL2_SOLIS");
		//permite gestionar entidades..
		EntityManager eman=fabri.createEntityManager();
		//iniciar transaccion...
		eman.getTransaction().begin();
		//registramos
		eman.persist(usuariocl2);
		//emitimos mensaje por pantalla
		System.out.println("Usuario registrado en la base de datos");
		//confirmamos
		eman.getTransaction().commit();
		//cerramos la transaccion...
		eman.close();
		
	}

	@Override
	public void ActualizarUsuario(TblUsuariocl2 usuariocl2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarUsuario(TblUsuariocl2 usuariocl2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TblUsuariocl2 BuscarProducto(TblUsuariocl2 usuariocl2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TblUsuariocl2> listarTblUsuariocl2s() {
		//establecemos la conexion con la unidad de persistencia..
		EntityManagerFactory fab=Persistence.createEntityManagerFactory("Examen_CL2_SOLIS");
		//gestionamos las entidades
		EntityManager  em=fab.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos la data de la base de datos
		List<TblUsuariocl2> listado=em.createQuery("select c from TblUsuariocl2 c",TblUsuariocl2.class).getResultList();
		//confirmamos la transaccion
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado
		return listado;
	}
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Examen_CL2_SOLIS");


	@Override
	public TblUsuariocl2 obtenerUsuario(String usuario) {
		  EntityManager em = emf.createEntityManager();
	        TypedQuery<TblUsuariocl2> query = em.createQuery("SELECT u FROM TblUsuariocl2 u WHERE u.usuariocl2 = :usuario", TblUsuariocl2.class);
	        query.setParameter("usuario", usuario);
	        TblUsuariocl2 usuarioEncontrado = null;
	        try {
	            usuarioEncontrado = query.getSingleResult();
	        } catch (Exception e) {
	            // Manejar excepciones (usuario no encontrado, etc.)
	        } finally {
	            em.close();
	        }
	        return usuarioEncontrado;
	    }

	}

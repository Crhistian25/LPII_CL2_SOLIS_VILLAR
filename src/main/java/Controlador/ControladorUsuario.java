package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TblProductoImp;
import Dao.TblUsuarioImp;
import model.TblProductocl2;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorUsuario
 */
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
       // super();
        // TODO Auto-generated constructor stub
    }   //fin del constructor...

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TblUsuariocl2 	usuario=new TblUsuariocl2();
		TblUsuarioImp crud=new TblUsuarioImp();
		List<TblUsuariocl2> listarusuario=crud.listarTblUsuariocl2s();
	
		//aplicamos un bucle
			/*	for(TblCliente lis:listadocliente){
					
					//imprimimos por pantalla
					System.out.println("codigo "+lis.getIdproductocl2()+
					" nombre "+lis.getNombrecl2()+" precio venta "+lis.getPrecioventacl2()+" precio compra "+
					lis.getPreciocompcl2()+"estado" + lis.getEstadocl2() + "descripcion"+ lis.getDescripcl2());
					
				}    //fin del bucle for...
				*/
		
		//asignamo el listado de clientes recuperados de la BD.
		request.setAttribute("listarusuario",listarusuario);	
		//response.getWriter().append("Controlador Cliente ").append(request.getContextPath());
	   //redireccionamos
		request.getRequestDispatcher("/ListadoUsuario.jsp").forward(request, response);
	}   //fin del metodo doget...

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//recuperamos los datos del formulario
		String usuariocl2=request.getParameter("usuario");
		String passwordcl2=request.getParameter("password");
		//instanciamos las respectivas clases...
		TblUsuariocl2 usuario=new TblUsuariocl2();
		TblUsuarioImp crud=new TblUsuarioImp();
		//asignamos valores
		usuario.setUsuariocl2(usuariocl2);
		usuario.setPasswordcl2(passwordcl2);
		//invocamos el metodo a registrar cliente en la bd
		crud.RegistrarUsuario(usuario);
		//actualizar el listado
		List<TblUsuariocl2> listadoTblUsuariocl2s=crud.listarTblUsuariocl2s();
		//asignamo el listado de clientes recuperados de la BD.
	     request.setAttribute("listarusuario",listadoTblUsuariocl2s);
		//redireccionamos hacia el listado de clientes...
		request.getRequestDispatcher("/ListadoUsuario.jsp").forward(request, response);
	}   //fin del metodo dopost...

}

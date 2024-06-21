package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TblProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        //super();
        // TODO Auto-generated constructor stub
    }  //fin del constructor...

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
				TblProductocl2 	producto=new TblProductocl2();
				TblProductoImp crud=new TblProductoImp();
				List<TblProductocl2> listadoproducto=crud.ListarProducto();
			
				//aplicamos un bucle
					/*	for(TblCliente lis:listadocliente){
							
							//imprimimos por pantalla
							System.out.println("codigo "+lis.getIdproductocl2()+
							" nombre "+lis.getNombrecl2()+" precio venta "+lis.getPrecioventacl2()+" precio compra "+
							lis.getPreciocompcl2()+"estado" + lis.getEstadocl2() + "descripcion"+ lis.getDescripcl2());
							
						}    //fin del bucle for...
						*/
				
				//asignamo el listado de clientes recuperados de la BD.
				request.setAttribute("listadoproducto",listadoproducto);	
				//response.getWriter().append("Controlador Cliente ").append(request.getContextPath());
			   //redireccionamos
				request.getRequestDispatcher("/ListadoProducto.jsp").forward(request, response);
	}  //fin del metodo doget...

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//recuperamos los datos del formulario
		String nombre=request.getParameter("nombre");
		 double precioventa = Double.parseDouble(request.getParameter("precioventa"));
		 double preciocompra = Double.parseDouble(request.getParameter("preciocompra"));
		String estadocl2=request.getParameter("estado");
		String descrip=request.getParameter("descrip");
		//instanciamos las respectivas clases...
		TblProductocl2 producto=new TblProductocl2();
		TblProductoImp crud=new TblProductoImp();
		//asignamos valores
		producto.setNombrecl2(nombre);
		 producto.setPrecioventacl2(precioventa);
		    producto.setPreciocompcl2(preciocompra);

		producto.setEstadocl2(1);
		producto.setDescripcl2(descrip);
		//invocamos el metodo a registrar cliente en la bd
		crud.RegistrarProducto(producto);
		//actualizar el listado
		List<TblProductocl2> listadoProductocl2s=crud.ListarProducto();
		//asignamo el listado de clientes recuperados de la BD.
	     request.setAttribute("listadoproducto",listadoProductocl2s);
		//redireccionamos hacia el listado de clientes...
		request.getRequestDispatcher("/ListadoProducto.jsp").forward(request, response);

	}  //fin del metodo dopost...

}

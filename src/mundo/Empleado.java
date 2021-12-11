package mundo;

	import java.util.Calendar;
	//import java.util.Date;
	import java.util.GregorianCalendar;

	public class Empleado {
		//Atributos
		private String nombreEmpleado ;
		private String apellidoEmpleado;
		private int genero; // 1 Femenido & 2 Masculino
		private String imagen;
		private double salario;
		private Fecha fechaNacimiento;
		private Fecha fechaIngreso;
		
//Metodo constructor sin parametros
		 public Empleado() {
			 nombreEmpleado="";
			 apellidoEmpleado="";
			 genero=0;
			 imagen="";
			 salario=0.0; 
			 fechaNacimiento = new Fecha (23,07,1992);
			 fechaIngreso = new Fecha(17,03,2000);
		 }
//Metodo constructor con parametros
		 public Empleado(String pNombreEmpleado, String pApellidoEmpleado,int pGenero, String pImagen, double pSalario) {
			 nombreEmpleado=pNombreEmpleado;
			 apellidoEmpleado=pApellidoEmpleado;
			 genero=pGenero;
			 imagen=pImagen;
			 salario=pSalario;
		 }
	
//Metodos analizadores (permiten obtener o modificar la informacion de los atributos )
			 //Getters(Obtener) // Setters () 
		
		public String getNombreEmpleado() {
			return nombreEmpleado;
		}

		public String getApellidoEmpleado() {
			return apellidoEmpleado;
		}

		public String getGenero() {
			String generoStrg =null;
			if (genero==1) {
				generoStrg="Masculino";
			} else {
				generoStrg="Femenino";
			}
			
			return generoStrg;
		}

		public String getFechaNacimiento() {
			String strFecha = fechaNacimiento.toString();
			return strFecha;
		}

		public String getFechaIngreso() {
			String strFecha = fechaNacimiento.toString();
			return strFecha;
		}
		
		public String getImagen() {
			return imagen;
		}

		public double getSalario() {
			return salario;
		}
// Métodos 		
		
		public int calcularEdad() {
			Fecha hoy = darFechaActual();
			int edad = fechaNacimiento.darDiferenciaEnMeses(hoy)/12;
			return edad;
		}
		
		public int calcularAntiguedad () {
			Fecha hoy = darFechaActual();
			int antiguedad = fechaIngreso.darDiferenciaEnMeses(hoy)/12;
			return antiguedad;
		}

			
		public double calcularPrestaciones() {
			double prestaciones;
			int antiguedad = calcularAntiguedad();
			prestaciones= ((double)(antiguedad*salario))/12;
			return prestaciones; 
		}
		
		
//Método que permite modificar información del empleado
		
		public void setEmpleado(String pNombreEmpleado, String pApellidoEmpleado, 
				int pGenero, String pImagen,  double pSalario, Fecha pFechaNacimiento, Fecha pfechaIngreso)  {
			 nombreEmpleado= pNombreEmpleado;
			 apellidoEmpleado=pApellidoEmpleado;
			 genero=pGenero;
			 imagen= pImagen;
			 salario= pSalario; 
			 fechaNacimiento = pFechaNacimiento;
			 fechaIngreso = pfechaIngreso;
		}
		
// metodo dar fecha actual		
		public Fecha darFechaActual() {
			GregorianCalendar gc = new GregorianCalendar( );
			int dia = gc.get( Calendar.DAY_OF_MONTH );
	        int mes = gc.get( Calendar.MONTH ) + 1;
	        int anho = gc.get( Calendar.YEAR );
	        Fecha hoy = new Fecha( dia, mes, anho );

	        return hoy;
		}
		
					
//Método que permite visualizar la información del empleado
		public void mostrarInformacion() {
			System.out.println("La información del empleado es:");
			System.out.println("Nombre y Apellido: "+getNombreEmpleado()+" "+getApellidoEmpleado());
			System.out.println("Género: "+ getGenero());
			System.out.println("La edad: "+ calcularEdad() );
			System.out.println("Fecha de Nacimiento: "+ getFechaNacimiento());
			System.out.println("Fecha de ingreso a la empresa: "+ getFechaIngreso());
			System.out.println("Salario: "+getSalario());
			System.out.println("Antiguedad: "+calcularAntiguedad()+" años.");
			System.out.println("Prestaciones: "+calcularPrestaciones());
			
		}
		
//Método que permite ingresar únicamente Letras y no números
		public static boolean validarPalabra(String datos) {
			return datos.matches("[a-zA-Z]*");
		}
}

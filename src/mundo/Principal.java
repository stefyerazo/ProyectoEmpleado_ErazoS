package mundo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int opc = 0;
		
		Empleado empleado = new Empleado();
		String nombre, apellido, imagen = null;
		int genero, dia, mes, anio =0;
		double salario = 0;
		Fecha fechaNac, fechaIngreso;
		
		do {
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("             MENÚ PRINCIPAL ");
			System.out.println("	1. Ingresar datos personales del empleado: ");
			System.out.println("	2. Calcular la edad del empleado: ");
			System.out.println("	3. Calcular la antiguedad del empleado en la empresa:");
			System.out.println("	4. Calcular las prestaciones:");
			System.out.println("	5. Visualizar la informacion del empleado:");
			System.out.println("	6. Opción Salir");
			
			try {
				System.out.println("\nElija una de las opciones: ");
				opc = scanner.nextInt();
							
			}
			catch(InputMismatchException e) {
				System.out.println("Debe ingresar solo las opciones indicadas ");
				opc = 6;
				e.printStackTrace();
			}
			
			switch(opc) {
				case 1:
					System.out.println("..................................... ");
					System.out.println("           INGRESO DE  DATOS        ");			
								
//Ingreso Nombre
					System.out.println("\nIngrese su Nombre: ");
					nombre = scanner.next();
		
//Ingreso Apellido
					System.out.println("Ingrese Apellido: ");
					apellido = scanner.next();
			
			        								        			  
//Ingreso Género
			        System.out.println("Ingrese Genero (1 para masculino, 2 para femenino): ");
			        do {
			        	try {
							genero= scanner.nextInt();
										
						}
						catch(InputMismatchException e) {
							genero = 0;
							scanner.nextLine();
						}
			        	if (genero<1 || genero>2) {
			        		System.out.println("Debe ingresar solo el número 1 o 2 ");
			        	}
			        }while (genero<1 || genero>2);
			        
					
//Ingreso salario
			        System.out.println("Ingrese Salario: ");
			        do {
						try {	
					        salario = scanner.nextDouble();
						}
						catch(InputMismatchException e) {					
							salario = 0;
							scanner.nextLine();
						}
						if(salario<0.1) {
							System.out.println("Ingrese solo números mayores a 0,1 ");
						}
					}while (salario<0.1);
					
			        			        
// Ingreso día de nacimiento
			        System.out.println("Ingrese dia de nacimiento (00): ");
			        do {
			        	try {		        		
					        dia = scanner.nextInt();
			        	}
			        	catch(InputMismatchException e) {						
							dia = 0;
							scanner.nextLine();
			        	}	
			        	if (dia<1 || dia>31) {
			        		System.out.println("Debe ingresar solo números entre 1 y 31");
			        	}
			        }while (dia<1 || dia>31);
			        
			        
//Ingreso mes de nacimiento
			        System.out.println("Ingrese mes de nacimiento (#): ");
			        do {
			        	try {		        		
					        mes = scanner.nextInt();
			        	}
			        	catch(InputMismatchException e) {						
							mes = 0;
							scanner.nextLine();
			        	}
			        	if (mes<1 || mes >12) {
			        		System.out.println("Ingrese unicamente números entre 1 y 12 ");
			        	}
			        } while (mes<1 || mes >12);
			        
			        
//Ingreso año de nacimiento
			        
			        System.out.println("Ingrese año de nacimiento (mayor a 1900 y menor a 2021): ");
			        do {
			        	try {		        		
					        anio = scanner.nextInt();
			        	}
			        	catch(InputMismatchException e) {						
							anio = 0;
							scanner.nextLine();
			        	}
			        	if (anio<1900 || anio>2021) {
			        		System.out.println("Ingrese el año correcto entre 1900 hasta el 2021 ");
			        	}
			        } while (anio<1900 || anio>2021);
			        
			        
			        fechaNac = new Fecha(dia, mes, anio);
			        
			        
// Ingreso día de Ingreso
			        System.out.println("Ingrese dia de Ingreso (00): ");
			        do {
			        	try {		        		
					        dia = scanner.nextInt();
			        	}
			        	catch(InputMismatchException e) {						
							dia = 0;
							scanner.nextLine();
			        	}	
			        	if (dia<1 || dia>31) {
			        		System.out.println("Debe ingresar solo números entre 1 y 31");
			        	}
			        }while (dia<1 || dia>31);
			        
			        
//Ingreso mes de ingreso a la empresa
			        System.out.println("Ingrese mes de ingreso (#): ");
			        do {
			        	try {		        		
					        mes = scanner.nextInt();
			        	}
			        	catch(InputMismatchException e) {						
							mes = 0;
							scanner.nextLine();
			        	}
			        	if (mes<1 || mes >12) {
			        		System.out.println("Ingrese solo números entre 1 y 12 ");
			        	}
			        } while (mes<1 || mes >12);
			        
			        
//Ingreso año de nacimiento
			        
			        System.out.println("Ingrese año de ingreso (mayor a 1900 y menor o igual a 2021): ");
			        do {
			        	try {		        		
					        anio = scanner.nextInt();
			        	}
			        	catch(InputMismatchException e) {						
							anio = 0;
							scanner.nextLine();
			        	}
			        	if (anio<1900 || anio>2021) {
			        		System.out.println("Ingrese solo números mayores a 1900 y menores o igual a 2021 ");
			        	}
			        } while (anio<1900 || anio>2021);
			        
			        fechaIngreso = new Fecha(dia, mes, anio);
			        
			        empleado.setEmpleado(nombre, apellido, genero, imagen, salario, fechaNac, fechaIngreso);
					break;
				case 2:
					System.out.println("Edad del empleado: " + empleado.calcularEdad());
					break;
				case 3:
					System.out.println("Antiguedad del empleado: " + empleado.calcularAntiguedad());
					break;
				case 4:
					System.out.println("Prestaciones del empleado: " + empleado.calcularPrestaciones());
					break;
				case 5:
					empleado.mostrarInformacion();
					break;
				case 6:
					System.out.println("Gracias por visitarnos. Estamos gustosos de servirte");
					break;
				default:
					System.out.println("Ingrese una opción entre 1 y 6");
			}
		} while(opc != 6);
	}
}

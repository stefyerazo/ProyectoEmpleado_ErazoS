package mundo;

	public class Fecha {
		private int dia;
		private int mes;
		private int anio;
		
//Constructor
		public Fecha (int pDia, int pMes, int pAnio) {
			dia = pDia;
			mes = pMes;
			anio = pAnio;
		}
		
		public Fecha () {
		}
		
//Metodos analizadores
		public int getDia() {
			return dia;
		}
		public int getMes() {
			return mes;
		}
		public int getAnio() {
			return anio;
		}
		
//Metodos funcionales
			
			public int darDiferenciaEnMeses (Fecha pFecha) {
											
				int diferenciaMeses = 0;
				int nuevoAnio =  pFecha.getAnio();
				int nuevoMes = pFecha.getMes();
				int nuevoDia = pFecha.getDia();
				
				diferenciaMeses = 12 * (nuevoAnio-anio)+(nuevoMes - mes);
				
				if (nuevoDia<dia) {
					diferenciaMeses = diferenciaMeses-1;
				}
												
				return diferenciaMeses;
			}
//Formato Fecha dd-mm--aaaa || dd/mm/aaaa || aaaa-mm-dd
		public String toString() {
			return dia + "-"  + mes +"-" + anio;
		}
}

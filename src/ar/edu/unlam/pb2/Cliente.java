package ar.edu.unlam.pb2;

import java.util.Comparator;


public class Cliente implements Comparable<Cliente>{ 
	

			private String nombre;
			private Integer edad;
			private Double dinero;
			
				//Constructor
			public Cliente (String nombre, Double dinero, Integer edad)
			{
				this.nombre = nombre;
				this.dinero = dinero;
				this.edad = edad;
			}

				//Getters y Setters
			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public Double getDinero() {
				return dinero;
			}

			public void setDinero(Double dinero) {
				this.dinero = dinero;
			}
			
			public Integer getEdad() {
				return edad;
			}

			public void setEdad(Integer edad) {
				this.edad = edad;
			}

			
				//Métodos Equals y HashCode

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((dinero == null) ? 0 : dinero.hashCode());
				result = prime * result + ((edad == null) ? 0 : edad.hashCode());
				result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
				return result;
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Cliente other = (Cliente) obj;
				if (dinero == null) {
					if (other.dinero != null)
						return false;
				} else if (!dinero.equals(other.dinero))
					return false;
				if (edad == null) {
					if (other.edad != null)
						return false;
				} else if (!edad.equals(other.edad))
					return false;
				if (nombre == null) {
					if (other.nombre != null)
						return false;
				} else if (!nombre.equals(other.nombre))
					return false;
				return true;
			}
		
			
			// como quiero ordenarlos, en este caso por nombre
			// si quiero cambiar el criterio del orden cambio este metodo
			// para ordenar en descendente multiplico por -1 al principio
		
			// ESTO ES POR ORDEN NATURAL --> Comparable
		@Override
		public int compareTo(Cliente otro) {
			return this.nombre.compareTo(otro.getNombre());   //uso el metodo .compareTo
		}
		
}

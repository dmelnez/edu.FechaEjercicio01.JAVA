package edu.FechaEjercicio01.JAVA;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Inicio {

	public static void main(String[] args) {
		
		
		
		LocalDate hoy = LocalDate.now();
		LocalTime hoyHora = LocalTime.now();
		
		System.out.println(hoy);
		System.out.println(hoyHora);
		
		
		System.out.println("DIA: ");
		System.out.println(hoy.getDayOfMonth());
		
		System.out.println("MES: ");
		System.out.println(hoy.getMonth());
		
		System.out.println("ANIO: ");
		System.out.println(hoy.getYear());

		System.out.println("HORA: ");
		System.out.println(hoyHora.getHour());
		
		System.out.println("MINUTOS: ");
		System.out.println(hoyHora.getMinute());
		
		System.out.println("SEGUNDOS: ");
		System.out.println(hoyHora.getSecond());
		
		System.out.println("DIA DE LA SEMANA: : ");
		System.out.println(hoy.getDayOfWeek());
		
		System.out.println("DIA DEL ANIO: ");
		System.out.println(hoy.getDayOfYear());
		
		
		
		
		

	}

}

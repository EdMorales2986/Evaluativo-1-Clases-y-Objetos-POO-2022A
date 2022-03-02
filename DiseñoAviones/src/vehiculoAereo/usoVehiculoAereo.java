package vehiculoAereo;

import javax.swing.JOptionPane;

public class usoVehiculoAereo 
{
	public float pesoRuedas = 0.25f;
	
	public static void main(String[] args) 
	{
		Carguero avion1 = new Carguero();
		Pasajero avion2 = new Pasajero();
		Avioneta avion3 = new Avioneta();
		Helicoptero heli1 = new Helicoptero();
		
		String tipo = JOptionPane.showInputDialog("¿Que tipo de aeronave quiere diseñar? \n- Carguero\n- Comercial\n- Avioneta\n- Helicoptero");
		
		// usar un switch hubiera sido mas efectivo pero no se puede implementar junto a la funcion que ignora 
		// las mayusculas y minusculas de un String, pudiera haberlo hecho con numeros pero me parecio mas interesante asi...
		
		if (tipo == null)
		{
			JOptionPane.showMessageDialog(null, "Saliendo...");
		}
		else if (tipo.equalsIgnoreCase("carguero"))
		{
			avion1.estableceNumeroRuedas(JOptionPane.showInputDialog("Introduzca el numero de ruedas del tren de aterrizaje\nCondiciones: Numero par y entre el rango de 28 y 40"));
			avion1.estableceCapacidadTripulantes(JOptionPane.showInputDialog("Introduzca la capacidad actual de pasajeros (min 2 - max 6)"));
			avion1.estableceTipoCarga(JOptionPane.showInputDialog("Introduzca el tipo de cargamento que llevara (Pallets o Suelto)"));
			avion1.estableceGrua(JOptionPane.showInputDialog("La aeronave contara con una grua de carga interna? (si o no)"));
			System.out.println(avion1.dimeDatosGenerales()+"\n");
			System.out.println(avion1.dimeNumeroRuedas());
			System.out.println(avion1.dimeCapacidadTripulantes());
			System.out.println(avion1.dimeTipoCarga());
			System.out.println(avion1.dimeCargaGruaInterna());
			System.out.println(avion1.dimepesoFinal());
			System.out.println(avion1.dimeprecioFinal());
		}
		else if (tipo.equalsIgnoreCase("comercial"))
		{
			avion2.estableceNumClaseTripulantes(JOptionPane.showInputDialog("Introduzca el numero de clases de la aeronave (1 o 2)\n1- Economica (instala 660 asientos)\n2- Economica+Ejecutiva (instala 550 asientos)"));
			avion2.estableceNumeroRuedas(JOptionPane.showInputDialog("Introduzca el numero de ruedas del tren de aterrizaje\nCondiciones: Numero par y entre el rango de 14 y 20"));
			avion2.estableceServicioAborodo(JOptionPane.showInputDialog("La aeronave contara con servicios abordo, alimentos y bebidas? (si o no)"));
			System.out.println(avion2.dimeDatosGenerales()+"\n");
			System.out.println(avion2.dimeNumeroRuedas());
			System.out.println(avion2.dimeServicioAbordo());
			System.out.println(avion2.dimeCapacidadTripulantes());
			System.out.println(avion2.dimepesoFinal());
			System.out.println(avion2.dimeprecioFinal());
		}
		else if (tipo.equalsIgnoreCase("avioneta"))
		{
			avion3.estableceAsientosTraseros(JOptionPane.showInputDialog("La avioneta contara con asientos traseros? (si o no)"));
			avion3.estableceTipoHelice(JOptionPane.showInputDialog("Que tipo de helice se instalara?\n-Dos patas (2)\n-Tres patas (3)"));
			System.out.println(avion3.dimeDatosGenerales()+"\n");
			System.out.println(avion3.dimeNumeroRuedas());
			System.out.println(avion3.dimeAsientosTraseros());
			System.out.println(avion3.dimeCapacidadTripulantes());
			System.out.println(avion3.dimepesoFinal());
			System.out.println(avion3.dimeprecioFinal());
		}
		else if (tipo.equalsIgnoreCase("helicoptero"))
		{
			heli1.estableceBlindaje(JOptionPane.showInputDialog("Desea instalar blindaje de grado militar en la aeronave? (si o no)"));
			heli1.estableceArrmamento1(JOptionPane.showInputDialog("Armamento 1: Ametralladoras\nDesea instalar? (si o no)"));
			heli1.estableceArrmamento2(JOptionPane.showInputDialog("Armamento 2: Misiles guiados\nDesea instalar? (si o no)"));
			System.out.println(heli1.dimeDatosGenerales()+"\n");
			System.out.println(heli1.dimeNumeroRuedas());
			System.out.println(heli1.dimeCapacidadTripulantes());
			System.out.println(heli1.dimeBlindaje());
			System.out.println(heli1.dimeArmamento1());
			System.out.println(heli1.dimeArmamento2());
			System.out.println(heli1.dimepesoFinal());
			System.out.println(heli1.dimeprecioFinal());
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Respuesta no valida");
		}
	}
}
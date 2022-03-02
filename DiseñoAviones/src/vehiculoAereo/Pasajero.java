package vehiculoAereo;

import javax.swing.JOptionPane;

public class Pasajero 
{
	private String modelo;	// Boeing 747
	private int numMotores;	// 4 motores 
	private int velocidadMaxima;	// 950 km/h
	private int capacidadCarga;		// 140 t
	private float pesoInicial;	// Cuando se encuentra vacio 180 t, peso util 325 t, peso maximo 440 t
	private int precioInicial;	
	
	private int numClaseTripulantes;	// Hasta 660 pasajeros (solo economica), 550 pasajeros (economica+ejecutiva)
	private int capacidadTripulantes;
	private int numeroRuedas;	// 16 en el modelo original
	private boolean servicioAbordo;		// Alimentos y bebidas
	private int precioFinal;
	private float pesoFinal;
	private float pesoRuedas;
	
	// Metodo Constructor
	public Pasajero()
	{
			modelo = "Boeing 747";
			numMotores = 4;
			velocidadMaxima = 950;
			capacidadCarga = 140;
			pesoInicial = 180;
			pesoRuedas = 0.25f;
			precioInicial = 150000;
	}
	
	// Getters
	public String dimeDatosGenerales()
	{
		return "El avion comercial, "+modelo+", cuenta con "+numMotores+" motores, permitiendole alcanzar una velocidad maxima"
				+ " de "+velocidadMaxima+" km/h. \nAdicionalmente este tiene un capacidad de carga de "+capacidadCarga+" toneladas";
	}
	
	public String dimeNumeroRuedas()
	{
		return "La aeronave contara con: "+numeroRuedas+" ruedas"; 
	}
	
	public String dimeCapacidadTripulantes()
	{
		if (numClaseTripulantes == 1)
		{
			return "La capacidad actual de pasajeros es: "+capacidadTripulantes+" (Clase Economica)";
		}
		else
		{
			return "La capacidad actual de pasajeros es: "+capacidadTripulantes+" (Clase Economica+Ejecutiva)";
		}
	}
	
	public String dimeServicioAbordo()
	{
		if (servicioAbordo == true)
		{
			return "A la aeronave se le instalara una estacion de alimentos y bebidas";
		}
		else
		{
			return "A la aeronave no se le instalara una estacion de alimentos y bebidas";
		}
	}
	
	public String dimepesoFinal()
	{
		return "El peso total de la aeronave es: "+(pesoFinal+=pesoInicial)+" toneladas";
	}
	
	public String dimeprecioFinal()
	{
		return "El precio final de constrccuion es: $"+(precioFinal+=precioInicial);
	}
	
	// Setters 
	public void estableceNumeroRuedas (String ruedas)
	{
		numeroRuedas = Integer.parseInt(ruedas);
		if (numeroRuedas%2 != 0 || numeroRuedas<14 || numeroRuedas>20) 
		{
			JOptionPane.showMessageDialog(null, "Respuesta no valida");
			System.exit(0);
		}
		else
		{
			if (numeroRuedas >= 16)
			{
				precioFinal += 3500;
				pesoFinal += pesoRuedas*numeroRuedas;
			}
			else if (numeroRuedas < 16)
			{
				precioFinal += 1700;
				pesoFinal -= pesoRuedas*numeroRuedas;
			}
		}
	}
	
	public void estableceNumClaseTripulantes(String clase)
	{
		numClaseTripulantes = Integer.parseInt(clase);
		if (numClaseTripulantes < 1 || numClaseTripulantes > 2) 
		{
			JOptionPane.showMessageDialog(null, "Respuesta no valida");
			System.exit(0);
		}
		else
		{
			if (numClaseTripulantes == 1)
			{
				precioFinal += 1750;
				capacidadTripulantes = 660;
			}
			else if (numClaseTripulantes == 2)
			{
				precioFinal += 2400;
				capacidadTripulantes = 550;
			}
		}	
	}
	
	public void estableceServicioAborodo(String servicio)
	{
		if(servicio.equalsIgnoreCase("si"))
		{
			servicioAbordo = true;
			pesoFinal += 0.34 ;
			precioFinal += 12000;
		}
		else
		{
			servicioAbordo = false;
		}
	}
	
}

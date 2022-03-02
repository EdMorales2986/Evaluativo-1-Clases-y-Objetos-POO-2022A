package vehiculoAereo;

import javax.swing.JOptionPane;

public class Avioneta 
{
	private String modelo;	// Beechcraft Bonanza
	private int numMotores;	// 1 motor 
	private int velocidadMaxima;	// 305 km/h
	private int capacidadCarga;		// 32 kg
	private int numeroRuedas;	// 3 ruedas en el modelo original
	private int capacidadTripulantes;
	private int pesoInicial;	// Cuando se encuentra vacio 750 kg, peso util 1000 kg, peso maximo 1235 kg
	private int precioInicial;	
	
	private boolean asientosTraseros;	// 2 + 4 si tienen asientos atras 
	private int tipoHelice;
	private int precioFinal;
	private int pesoFinal;
	
	// Metodo Constructor
	public Avioneta()
	{
			modelo = "Beechcraft Bonanza";
			numMotores = 1;
			numeroRuedas = 3;
			velocidadMaxima = 305;
			capacidadCarga = 32;
			capacidadTripulantes = 2;
			pesoInicial = 750;
			precioInicial = 40000;
	}
	
	// Getters
	public String dimeDatosGenerales()
	{
		return "La avioneta, "+modelo+", cuenta con "+numMotores+" motor, permitiendole alcanzar una velocidad maxima"
				+ " de "+velocidadMaxima+" km/h. \nAdicionalmente este tiene un capacidad de carga de "+capacidadCarga+" kilogramos";
	}
	
	public String dimeNumeroRuedas()
	{
		return "La aeronave contara con: "+numeroRuedas+" ruedas"; 
	}
	
	public String dimeAsientosTraseros()
	{
		if (asientosTraseros == true)
		{
			return "A la aeronave se le instalaran 4 asientos extras, reemplazando el area de carga";
		}
		else
		{
			return "A la aeronave no se le instalaran asiewntos traseros, el area de carga queda disponible en su totalidad";
		}
	}
	
	public String dimeCapacidadTripulantes()
	{
		return "La capacidad de pasajeros sera de: "+capacidadTripulantes;
	}
	
	public String dimeTipoHelice()
	{
		if (tipoHelice == 2)
		{
			return "A la aeronave se le instalaran una helice de 2 patas";
		}
		else
		{
			return "A la aeronave se le instalara una hyelice de 3 patas";
		}
	}
	
	public String dimepesoFinal()
	{
		return "El peso total de la aeronave es: "+(pesoFinal+=pesoInicial)+" kilogramos";
	}
	
	public String dimeprecioFinal()
	{
		return "El precio final de constrccuion es: $"+(precioFinal+=precioInicial);
	}
	
	// Setters 
	
	public void estableceAsientosTraseros(String asientosT)
	{
		if(asientosT.equalsIgnoreCase("si"))
		{
			asientosTraseros = true;
			capacidadTripulantes += 4;
			capacidadCarga -= 12;
			pesoFinal += 12 ;
			precioFinal += 4000;
		}
		else
		{
			asientosTraseros = false;
		}
	}
	
	public void estableceTipoHelice(String helice)
	{
		tipoHelice = Integer.parseInt(helice);
		if (tipoHelice < 2 || tipoHelice > 3) 
		{
			JOptionPane.showMessageDialog(null, "Respuesta no valida");
			System.exit(0);
		}
		else
		{
			if (tipoHelice == 2)
			{
				precioFinal += 2000;
			}
			else if (tipoHelice == 3)
			{
				precioFinal += 3000;
			}
		}	
	}
}

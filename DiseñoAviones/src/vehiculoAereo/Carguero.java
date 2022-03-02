package vehiculoAereo;

import javax.swing.JOptionPane;

public class Carguero 
{
	private String modelo;	// Antonov 225 Mriya, curiosamente el modelo real de esta aeronave fue destruido el pasado domingo 27/02
	private int numMotores;	// 6 motores 
	private int velocidadMaxima;	// 1368 km/h
	private int capacidadCarga;		// 250 t
	private float pesoInicial;	// Cuando se encuentra vacio 285 t, peso util 355 t, peso maximo 640 t
	private int precioInicial;
	private float pesoRuedas;
	
	private int capacidadTripulantes;	// Hasta 6 pasajeros
	private String tipoCarga;	// pallets o carga suelta ($ 7.000 vs $ 1500)
	private boolean gruaCargaInterna;	// +42 t si esta presente
	private int numeroRuedas;	// 32 reudas en el modelo original
	private int precioFinal;
	private float pesoFinal;
	
	// Metodo Constructor
	public Carguero()
	{
			modelo = "Antonov 225 Mriya";
			numMotores = 6;
			velocidadMaxima = 1368;
			capacidadCarga = 250;
			pesoInicial = 285;
			pesoRuedas = 0.35f;
			precioInicial = 300200;
	}
	
	// Getters
	public String dimeDatosGenerales()
	{
		return "El avion carguero, "+modelo+", cuenta con "+numMotores+" motores, permitiendole alcanzar una velocidad maxima"
				+ " de "+velocidadMaxima+" km/h. \nAdicionalmente este tiene un capacidad de carga de "+capacidadCarga+" toneladas";
	}
	
	public String dimeNumeroRuedas()
	{
		return "EL tren de aterrizaje contara con: "+numeroRuedas+" ruedas"; 
	}
	
	public String dimeTipoCarga()
	{
		return "La aeronave llevara cargamento de tipo: "+tipoCarga;
	}
	
	public String dimeCapacidadTripulantes()
	{
		return "Se instalaran asientos para una capacidad de pasajeros de: "+capacidadTripulantes;
	}
	
	public String dimeCargaGruaInterna()
	{
		if (gruaCargaInterna == true)
		{
			return "A la aeronave se le instalara una grua de carga interna";
		}
		else
		{
			return "A la aeronave no se le instalara una grua de carga interna";
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
		if (numeroRuedas%2 != 0 || numeroRuedas<28 || numeroRuedas>40) 
		{
			JOptionPane.showMessageDialog(null, "Respuesta no valida");
			System.exit(0);
		}
		else
		{
			if (numeroRuedas >= 32)
			{
				precioFinal += 6025;
				pesoFinal += pesoRuedas*numeroRuedas;
			}
			else if (numeroRuedas < 32)
			{
				precioFinal += 3275;
				pesoFinal -= pesoRuedas*numeroRuedas;
			}
		}
	}
		
	
	public void estableceCapacidadTripulantes(String pasajeros)
	{
		capacidadTripulantes = Integer.parseInt(pasajeros);
		if (capacidadTripulantes < 2 || capacidadTripulantes > 6) 
		{
			JOptionPane.showMessageDialog(null, "Respuesta no valida");
			System.exit(0);
		}
		else
		{
			if (capacidadTripulantes >= 3)
			{
				precioFinal += 375;
			}
			else
			{
				precioFinal += 135;
			}
		}	
	}
	
	public void estableceTipoCarga(String Carga)
	{
		tipoCarga = Carga;
		if (tipoCarga.equalsIgnoreCase("pallets"))
		{
			precioFinal += 75000;
		}
		else if (tipoCarga.equalsIgnoreCase("suelto"))
		{
			precioFinal += 10500;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Respuesta no valida");
			System.exit(0);
		}
	}
	
	public void estableceGrua(String grua)
	{
		if(grua.equalsIgnoreCase("si"))
		{
			gruaCargaInterna = true;
			pesoFinal += 42;
			precioFinal += 82000;
		}
		else
		{
			gruaCargaInterna = false;
		}
	}
}

package vehiculoAereo;

public class Helicoptero 
{
	private String modelo;	// Kamov Ka-50
	private int numMotores;	// 2 motores 
	private int velocidadMaxima;	// 390 km/h
	private int capacidadCarga;		//  kg
	private int numeroRuedas;
	private int capacidadTripulantes;
	private int pesoInicial;	// Cuando se encuentra vacio 7800 kg, peso util 9800 kg, peso maximo 10800 kg
	private int precioInicial;	
	
	private boolean blindaje;
	private boolean ametralladoras;
	private boolean misiles;
	
	
	private int precioFinal;
	private int pesoFinal;
	
	// Metodo Constructor
	public Helicoptero()
	{
			modelo = "Beechcraft Bonanza";
			numMotores = 2;
			numeroRuedas = 3;
			velocidadMaxima = 380;
			capacidadCarga = 3000;
			capacidadTripulantes = 1;
			pesoInicial = 7800;
			precioInicial = 97500;
	}
	
	// Getters
	public String dimeDatosGenerales()
	{
		return "El helicoptero, "+modelo+", cuenta con "+numMotores+" motores de sistema rotor coaxial (4 helices), permitiendole \nalcanzar una velocidad maxima"
				+ " de "+velocidadMaxima+" km/h. Adicionalmente este tiene un capacidad de carga de "+capacidadCarga+" kilogramos";
	}
	
	public String dimeNumeroRuedas()
	{
		return "La aeronave contara con: "+numeroRuedas+" ruedas"; 
	}
	
	public String dimeCapacidadTripulantes()
	{
		return "La capacidad de pasajeros sera de: "+capacidadTripulantes;
	}
	
	public String dimeBlindaje()
	{
		if (blindaje == true)
		{
			return "Al helicoptero se le instalara blindaje militar";
		}
		else
		{
			return "Al helicoptero no se le instalara blindaje militar";
		}
	}
	
	public String dimeArmamento1()
	{
		if (ametralladoras == true)
		{
			return "Al helicoptero se le instalaran ametralladoras 30mm";
		}
		else
		{
			return "Al helicoptero no se le instalaran ametralladoras 30 mm";
		}
	}
	
	public String dimeArmamento2()
	{
		if (misiles == true)
		{
			return "Al helicoptero se le instalaran misiles Kh-25";
		}
		else
		{
			return "Al helicoptero no se le instalaran misiles Kh-25";
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
	public void estableceBlindaje(String armadura)
	{
		if(armadura.equalsIgnoreCase("si"))
		{
			blindaje = true;
			capacidadCarga -= 400;
			pesoFinal += 1000;
			precioFinal += 100000;
		}
		else
		{
			blindaje = false;
		}
	}
	
	public void estableceArrmamento1(String ametralladora)
	{
		if(ametralladora.equalsIgnoreCase("si"))
		{
			ametralladoras = true;
			pesoFinal += 300;
			capacidadCarga -= 150;
			precioFinal += 55000;
		}
		else
		{
			ametralladoras = false;
		}
	}
	
	public void estableceArrmamento2(String misil)
	{
		if(misil.equalsIgnoreCase("si"))
		{
			misiles = true;
			pesoFinal += 500;
			capacidadCarga -= 300;
			precioFinal += 85000;
		}
		else
		{
			misiles = false;
		}
	}
	
}

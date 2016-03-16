package TestCases;
import hlmc.*;
import hlmc.exceptions.*;
import hlmc.logic.*;




public class objeto extends Calculator {
	objeto(){
		super();
	}
	static String ruta = "C:\\Users\\Jose Julio\\Desktop";
	public static void main(String args[]){
		//test.CalculateTMB(arg0);
		Calculator prueba = new Calculator();
		try{
			prueba.CalculateThermogenicEffect(ruta);
		}
		catch (HLMCException e){}
	}

}

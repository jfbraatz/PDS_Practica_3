package TestCases;

import static org.junit.Assert.*;

import hlmc.*;
import hlmc.exceptions.*;
import hlmc.logic.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateThermogenicEffect_EClasses {
	
	HealthyLifeMetricsCalculator miCalculator ;
	String FileLocation=" ";
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		miCalculator = new Calculator();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test 
	public void CPCEValido01() {
		float result=0F;
		try {
			result=miCalculator.CalculateThermogenicEffect("RF03/Fichero001");
		} catch (HLMCException e) {
			e.printStackTrace();
		}
		float expectedresult=85.0F; //valor aleatrorio porque sabemos que todos los 
		//metodos devuelven 0.0
		assertEquals(result,expectedresult,0.0);
	}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoNombre-02>
	 * Parametro de entrada analizado<Nombre>
	 * Descripción del valor de entrada <Nombre:85>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoNombre02() 
		throws HLMCException
		{
		miCalculator.CalculateThermogenicEffect("RF03/Fichero002");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoSexo-03>
	 * Parametro de entrada analizado<sexo>
	 * Descripción del valor de entrada <sexo:gato>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoSexo03() 
		throws HLMCException
		{
	    miCalculator.CalculateThermogenicEffect("RF03/Fichero003");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoSexo-04>
	 * Parametro de entrada analizado<sexo>
	 * Descripción del valor de entrada <sexo:hombre,mujer>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoSexo04() 
		throws HLMCException
		{
	    miCalculator.CalculateThermogenicEffect("RF03/Fichero004");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoEdad-05>
	 * Parametro de entrada analizado<edad>
	 * Descripción del valor de entrada <edad:18.85>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoEdad05() 
		throws HLMCException
		{
	    miCalculator.CalculateThermogenicEffect("RF03/Fichero005");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoEdad-06>
	 * Parametro de entrada analizado<edad>
	 * Descripción del valor de entrada <edad:-18.00>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoEdad06() 
		throws HLMCException
		{
	    miCalculator.CalculateThermogenicEffect("RF03/Fichero006");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoEdad-07>
	 * Parametro de entrada analizado<edad>
	 * Descripción del valor de entrada <edad:19,20,25>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoEdad07() 
		throws HLMCException
		{
	    miCalculator.CalculateThermogenicEffect("RF03/Fichero007");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoPeso-08>
	 * Parametro de entrada analizado<peso>
	 * Descripción del valor de entrada <peso:sesenta-kg>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoPeso08() 
		throws HLMCException
		{
	    miCalculator.CalculateThermogenicEffect("RF03/Fichero008");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoPeso-09>
	 * Parametro de entrada analizado<peso>
	 * Descripción del valor de entrada <peso:-57.77-kg>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoPeso09() 
		throws HLMCException
		{
	    miCalculator.CalculateThermogenicEffect("RF03/Fichero009");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoPeso-010>
	 * Parametro de entrada analizado<peso>
	 * Descripción del valor de entrada <peso:588.7-cg>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoPeso10() 
		throws HLMCException
		{
	    miCalculator.CalculateThermogenicEffect("RF03/Fichero010");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoPeso-011>
	 * Parametro de entrada analizado<peso>
	 * Descripción del valor de entrada <peso:58.75-kg,68.75-kg>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoPeso11() 
		throws HLMCException
		{
	    miCalculator.CalculateThermogenicEffect("RF03/Fichero011");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoAltura-12>
	 * Parametro de entrada analizado<Altura>
	 * Descripción del valor de entrada <Altura:1con78-metros>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoAltura12() 
		throws HLMCException
		{
	    miCalculator.CalculateThermogenicEffect("RF03/Fichero012");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoAltura-13>
	 * Parametro de entrada analizado<Altura>
	 * Descripción del valor de entrada <Altura:-1.78-metros>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoAltura13() 
		throws HLMCException
		{
	    miCalculator.CalculateThermogenicEffect("RF03/Fichero013");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoAltura-14>
	 * Parametro de entrada analizado<Altura>
	 * Descripción del valor de entrada <Altura:178-centimetros>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoAltura14() 
		throws HLMCException
		{
	    miCalculator.CalculateThermogenicEffect("RF03/Fichero014");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoAltura-15>
	 * Parametro de entrada analizado<Altura>
	 * Descripción del valor de entrada <Altura:Altura:1.78-metros,1.85-metros>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoAltura15() 
		throws HLMCException
		{
	    miCalculator.CalculateThermogenicEffect("RF03/Fichero015");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoNombre-16>
	 * Parametro de entrada analizado<Nombre>
	 * Descripción del valor de entrada <Nombre:Pepe,Marisa>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoNombre16() 
		throws HLMCException
		{
		miCalculator.CalculateThermogenicEffect("RF03/Fichero016");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoNombre-17>
	 * Parametro de entrada analizado<Nombre>
	 * Descripción del valor de entrada <Nombre:" ">
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoNombre17() 
		throws HLMCException
		{
		miCalculator.CalculateThermogenicEffect("RF03/Fichero017");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoSexo-18>
	 * Parametro de entrada analizado<Sexo>
	 * Descripción del valor de entrada <Sexo:" ">
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoSexo18() 
		throws HLMCException
		{
		miCalculator.CalculateThermogenicEffect("RF03/Fichero018");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoEdad-19>
	 * Parametro de entrada analizado<Edad>
	 * Descripción del valor de entrada <Edad:" ">
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoEdad19() 
		throws HLMCException
		{
		miCalculator.CalculateThermogenicEffect("RF03/Fichero019");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoPeso-20>
	 * Parametro de entrada analizado<Peso>
	 * Descripción del valor de entrada <Peso:" ">
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoPeso20() 
		throws HLMCException
		{
		miCalculator.CalculateThermogenicEffect("RF03/Fichero020");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoAltura-21>
	 * Parametro de entrada analizado<Altura>
	 * Descripción del valor de entrada <Altura:" ">
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoPeso21() 
		throws HLMCException
		{
		miCalculator.CalculateThermogenicEffect("RF03/Fichero021");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoPeso-22>
	 * Parametro de entrada analizado<Peso>
	 * Descripción del valor de entrada <Peso:64.05>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoPeso22() 
		throws HLMCException
		{
		miCalculator.CalculateThermogenicEffect("RF03/Fichero022");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-CEInvalidoAltura-23>
	 * Parametro de entrada analizado<Altura>
	 * Descripción del valor de entrada <Altura:1.78>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPCEInvalidoPeso23() 
		throws HLMCException
		{
		miCalculator.CalculateThermogenicEffect("RF03/Fichero023");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-FicheroVacio-24>
	 * Parametro de entrada analizado<Altura>
	 * Descripción del valor de entrada <Altura:1.78>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPFicheroVacio24() 
		throws HLMCException
		{
		miCalculator.CalculateThermogenicEffect("RF03/Fichero024");		
		}
	/*
	 * Caso de prueba: <CP-SalidaCorrecta-25>
	 * Parametro analizado<HLMC-RF-03-S1>
	 * Descripción del valor de salida <float result>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: float result
	 */
	public void CPSalidaCorrecta25() {
	float result=0F;
	try {
		result=miCalculator.CalculateThermogenicEffect("RF03/Fichero001");
	} catch (HLMCException e) {
		e.printStackTrace();
	}
	float expectedresult=85.0F; //valor aleatrorio porque sabemos que todos los 
	//metodos devuelven 0.0
	assertEquals(result,expectedresult,0.0);	
	}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-FicheroVacio-24>
	 * Parametro de entrada analizado<Altura>
	 * Descripción del valor de entrada <Altura:1.78>
	 * Técnica de prueba <Clase de equivalencia>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPSalidaIncorrecta26() 
		throws HLMCException
		{
		miCalculator.CalculateThermogenicEffect("RF03/Fichero024");		
		}
	/*
	 * VALORES LÍMITE
	 */
}

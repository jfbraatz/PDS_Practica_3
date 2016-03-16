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

public class CalculateTMB_Syntax {
	
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

	/*
	 * Caso de prueba: <CP-RF01-Valido001>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Entrada con formato correcto>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la TMB
	 */
	@Test
	public void CPRF01E1Valido1() {
		float result=0F;
		try {
			result=miCalculator.CalculateTMB("RF01/Fichero001");
		} catch (HLMCException e) {
			e.printStackTrace();
		}
		float expectedresult=85.0F; //valor aleatorio
		assertEquals(result,expectedresult,0.0);
	}
	/*
	 * Caso de prueba: <CP-RF01-Valido002>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Entrada con formato correcto>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la TMB
	 */
	@Test
	public void CPRF01E1Valido2() {
		float result=0F;
		try {
			result=miCalculator.CalculateTMB("RF01/Fichero002");
		} catch (HLMCException e) {
			e.printStackTrace();
		}
		float expectedresult=85.0F; //valor aleatorio
		assertEquals(result,expectedresult,0.0);
	}
	
	/*
	 * Caso de prueba: <CP-RF01-Valido003>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Entrada con formato correcto>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la TMB
	 */
	@Test
	public void CPRF01E1Valido3() {
		float result=0F;
		try {
			result=miCalculator.CalculateTMB("RF01/Fichero003");
		} catch (HLMCException e) {
			e.printStackTrace();
		}
		float expectedresult=85.0F; //valor aleatorio
		assertEquals(result,expectedresult,0.0);
	}
	
	/*
	 * Caso de prueba: <CP-RF01-Valido004>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Entrada con formato correcto>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la TMB
	 */
	@Test
	public void CPRF01E1Valido4() {
		float result=0F;
		try {
			result=miCalculator.CalculateTMB("RF01/Fichero004");
		} catch (HLMCException e) {
			e.printStackTrace();
		}
		float expectedresult=85.0F; //valor aleatorio
		assertEquals(result,expectedresult,0.0);
	}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido001>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 1>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido1() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero005");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido002>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 2>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido2() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero006");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido003>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 3>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido3() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero007");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido004>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 4>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido4() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero008");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido005>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 5>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido5() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero009");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido006>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 6>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido6() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero010");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido007>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 7>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido7() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero011");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido008>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 8>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido8() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero012");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido009>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 9>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido9() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero013");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido010>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 10>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido10() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero014");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido011>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 11>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido11() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero015");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido012>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 12>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido12() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero016");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido013>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 13>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido13() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero017");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido014>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 14>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido14() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero018");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido015>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 15>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido15() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero019");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido016>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 16>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido16() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero020");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido017>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 17>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido17() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero021");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido018>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 18>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido18() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero022");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido019>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 19>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido19() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero023");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido020>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 20>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido20() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero024");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido021>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 21>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido21() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero025");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido022>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 22>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido22() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero026");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido023>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 23>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido23() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero027");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido024>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 24>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido24() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero028");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido025>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 25>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido25() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero029");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido026>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 26>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido26() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero030");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido027>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 27>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido27() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero031");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido028>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 28>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido28() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero032");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido029>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 29>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido29() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero033");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido030>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repeticion del nodo hoja 1>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido30() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero034");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido031>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repeticion del nodo hoja 2>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido31() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero035");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido032>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repeticion del nodo hoja 3>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido32() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero036");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido033>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repeticion del nodo hoja 4>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido33() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero037");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido034>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repeticion del nodo hoja 5>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF01Invalido34() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero038");		
		}
}

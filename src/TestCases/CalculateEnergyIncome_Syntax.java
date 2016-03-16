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

public class CalculateEnergyIncome_Syntax {
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
	 * Caso de prueba: <CP-RF0-Valido001>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Entrada con formato correcto>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal que tiene la cantidad de calorias que tiene un aliemnto
	 */
	@Test
	public void CPRF04Valido1() {
		float result=0F;
		try {
			result=miCalculator.CalculateEnergyIncome("RF04/Fichero001");
		} catch (HLMCException e) {
			e.printStackTrace();
		}
		float expectedresult=85.0F; //valor aleatorio
		assertEquals(result,expectedresult,0.0);
	}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido002>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 1>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido2() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero002");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido003>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 2>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido3() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero003");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido004>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 3>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido4() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero004");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido005>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 4>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido5() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero005");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido006>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 5>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido6() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero006");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido007>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 6>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido7() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero007");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido008>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 7>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido8() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero008");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido009>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 8>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido9() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero009");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido010>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 9>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido10() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero010");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido011>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Omision del nodo hoja 10>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido11() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero011");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido012>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repiticion del nodo hoja 1>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido12() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero012");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido013>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repiticion del nodo hoja 2>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido13() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero013");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido014>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repiticion del nodo hoja 3>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido14() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero014");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido015>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repiticion del nodo hoja 4>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido15() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero015");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido016>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repiticion del nodo hoja 5>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido16() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero016");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido017>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repiticion del nodo hoja 6>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido17() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero017");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido018>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repiticion del nodo hoja 7>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido18() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero018");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido019>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repiticion del nodo hoja 8>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido19() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero019");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido020>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repiticion del nodo hoja 9>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido20() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero020");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF04-Invalido021>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Repiticion del nodo hoja 10>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido21() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero021");		
		}
	/*
	 * Caso de prueba: <CP-RF04-Invalido022>
	 * Parametro de entrada analizado<Entrada>
	 * Descripción del valor de entrada <Adicción al nodo hoja 10>
	 * Técnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepción)
	 */
	public void CPRF04Invalido22() 
		throws HLMCException
		{
		miCalculator.CalculateEnergyIncome("RF04/Fichero022");		
		}


}

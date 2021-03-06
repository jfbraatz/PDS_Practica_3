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
	 * Descripci�n del valor de entrada <Entrada con formato correcto>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la TMB
	 */
	@Test
	public void CPRF01Valido1() {
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
	 * Descripci�n del valor de entrada <Entrada con formato correcto>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la TMB
	 */
	@Test
	public void CPRF01Valido2() {
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
	 * Descripci�n del valor de entrada <Entrada con formato correcto>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la TMB
	 */
	@Test
	public void CPRF01Valido3() {
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
	 * Descripci�n del valor de entrada <Entrada con formato correcto>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la TMB
	 */
	@Test
	public void CPRF01Valido4() {
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 1>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 2>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 3>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 4>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 5>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 6>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 7>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 8>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 9>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 10>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 11>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 12>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 13>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 14>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 15>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 16>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 17>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 18>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 19>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 20>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 21>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 22>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 23>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 24>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 25>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 26>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 27>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 28>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Omision del nodo hoja 29>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 1>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 2>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 3>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 4>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
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
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 5>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido34() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero038");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido035>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 6>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido35() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero039");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido036>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 7>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido36() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero040");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido037>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 8>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido37() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero041");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido038>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 9>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido38() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero042");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido039>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 10>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido39() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero043");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido040>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 11>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido40() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero044");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido041>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 12>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido41() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero045");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido042>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 13>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido42() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero046");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido043>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 14>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido43() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero047");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido044>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 15>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido44() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero048");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido045>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 16>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido45() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero049");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido046>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 17>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido46() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero050");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido047>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 18>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido47() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero051");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido048>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 19>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido48() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero052");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido049>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 20>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido49() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero053");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido050>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 21>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido50() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero054");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido051>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 22>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido51() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero055");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido052>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 23>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido52() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero056");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido053>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 24>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido53() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero057");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido054>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 25>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido54() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero058");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido055>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 26>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido55() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero059");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido056>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 27>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido56() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero060");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido057>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 28>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido57() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero061");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido058>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 29>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido58() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero062");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido059>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 1>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido59() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero063");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido060>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 2>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido60() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero064");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido061>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 3>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido61() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero065");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido062>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 4>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido62() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero066");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido063>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 5>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido63() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero067");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido064>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 6>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido64() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero068");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido065>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 7>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido65() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero069");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido066>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 8>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido66() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero070");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido067>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 9>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido67() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero071");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido068>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 10>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido68() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero072");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido069>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 11>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido69() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero073");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido070>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 12>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido70() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero074");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido071>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 13>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido71() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero075");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido072>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 14>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido72() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero076");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido073>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 15>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido73() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero077");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido074>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 16>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido74() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero078");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido075>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 17>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido75() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero079");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido076>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 18>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido76() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero080");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido077>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 19>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido77() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero081");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido078>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 20>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido78() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero082");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido079>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 21>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido79() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero083");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido080>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 22>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido80() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero084");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido081>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 23>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido81() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero085");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido082>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 24>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido82() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero086");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido083>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 25>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido83() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero087");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido084>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 26>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido84() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero088");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido085>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 27>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido85() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero089");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido086>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 28>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido86() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero090");		
		}
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF01-Invalido087>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <adicion al nodo hoja 29>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF01Invalido87() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF01/Fichero091");		
		}
}

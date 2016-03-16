package TestCases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import hlmc.HealthyLifeMetricsCalculator;
import hlmc.exceptions.HLMCException;
import hlmc.logic.Calculator;

public class CalculatePhysicalActivityExpenditure_Syntax {

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
	/*
	 * Caso de prueba: <CP-RF02-Valido001>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Entrada con formato correcto>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la Physical Activity Expenditure
	 */
	public void CPRF02Valido01() {
		float result=0F;
		try {
			result=miCalculator.CalculatePhysicalActivityExpenditure("RF02/Fichero001");
		} catch (HLMCException e) {
			e.printStackTrace();
		}
		float expectedresult=85.0F; //valor aleatrorio porque sabemos que todos los 
		//metodos devuelven 0.0
		assertEquals(result,expectedresult,0.0);
	}
	
	@Test 
	/*
	 * Caso de prueba: <CP-RF02-Valido002>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Entrada con formato correcto>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la Physical Activity Expenditure
	 */
	public void CPRF02Valido02() {
		float result=0F;
		try {
			result=miCalculator.CalculatePhysicalActivityExpenditure("RF02/Fichero002");
		} catch (HLMCException e) {
			e.printStackTrace();
		}
		float expectedresult=85.0F; //valor aleatrorio porque sabemos que todos los 
		//metodos devuelven 0.0
		assertEquals(result,expectedresult,0.0);
	}
	
	@Test 
	/*
	 * Caso de prueba: <CP-RF02-Valido003>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Entrada con formato correcto>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la Physical Activity Expenditure
	 */
	public void CPRF02Valido03() {
		float result=0F;
		try {
			result=miCalculator.CalculatePhysicalActivityExpenditure("RF02/Fichero003");
		} catch (HLMCException e) {
			e.printStackTrace();
		}
		float expectedresult=85.0F; //valor aleatrorio porque sabemos que todos los 
		//metodos devuelven 0.0
		assertEquals(result,expectedresult,0.0);
	}
	
	@Test 
	/*
	 * Caso de prueba: <CP-RF02-Valido004>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Entrada con formato correcto>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la Physical Activity Expenditure
	 */
	public void CPRF02Valido04() {
		float result=0F;
		try {
			result=miCalculator.CalculatePhysicalActivityExpenditure("RF02/Fichero004");
		} catch (HLMCException e) {
			e.printStackTrace();
		}
		float expectedresult=85.0F; //valor aleatrorio porque sabemos que todos los 
		//metodos devuelven 0.0
		assertEquals(result,expectedresult,0.0);
	}

	@Test 
	/*
	 * Caso de prueba: <CP-RF02-Valido005>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Entrada con formato correcto>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la Physical Activity Expenditure
	 */
	public void CPRF02Valido05() {
		float result=0F;
		try {
			result=miCalculator.CalculatePhysicalActivityExpenditure("RF02/Fichero005");
		} catch (HLMCException e) {
			e.printStackTrace();
		}
		float expectedresult=85.0F; //valor aleatrorio porque sabemos que todos los 
		//metodos devuelven 0.0
		assertEquals(result,expectedresult,0.0);
	}
	
	@Test 
	/*
	 * Caso de prueba: <CP-RF02-Valido006>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Entrada con formato correcto>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la Physical Activity Expenditure
	 */
	public void CPRF02Valido06() {
		float result=0F;
		try {
			result=miCalculator.CalculatePhysicalActivityExpenditure("RF02/Fichero006");
		} catch (HLMCException e) {
			e.printStackTrace();
		}
		float expectedresult=85.0F; //valor aleatrorio porque sabemos que todos los 
		//metodos devuelven 0.0
		assertEquals(result,expectedresult,0.0);
	}
	
	@Test 
	/*
	 * Caso de prueba: <CP-RF02-Valido007>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Entrada con formato correcto>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la Physical Activity Expenditure
	 */
	public void CPRF02Valido07() {
		float result=0F;
		try {
			result=miCalculator.CalculatePhysicalActivityExpenditure("RF02/Fichero007");
		} catch (HLMCException e) {
			e.printStackTrace();
		}
		float expectedresult=85.0F; //valor aleatrorio porque sabemos que todos los 
		//metodos devuelven 0.0
		assertEquals(result,expectedresult,0.0);
	}
	
	@Test 
	/*
	 * Caso de prueba: <CP-RF02-Valido008>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Entrada con formato correcto>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Valor decimal resultado del calculo de la Physical Activity Expenditure
	 */
	public void CPRF02Valido08() {
		float result=0F;
		try {
			result=miCalculator.CalculatePhysicalActivityExpenditure("RF02/Fichero008");
		} catch (HLMCException e) {
			e.printStackTrace();
		}
		float expectedresult=85.0F; //valor aleatrorio porque sabemos que todos los 
		//metodos devuelven 0.0
		assertEquals(result,expectedresult,0.0);
	}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido001>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 1>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido1() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero009");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido002>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 2>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido2() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero010");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido003>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 3>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido3() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero011");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido004>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 4>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido4() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero012");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido005>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 5>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido5() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero013");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido006>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 6>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido6() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero014");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido007>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 7>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido7() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero015");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido008>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 8>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido8() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero016");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido009>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 9>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido9() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero017");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido010>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 10>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido10() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero018");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido011>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 11>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido11() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero019");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido012>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 12>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido12() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero020");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido013>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 13>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido13() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero021");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido014>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 14>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido14() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero022");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido015>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 15>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido15() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero023");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido016>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 16>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido16() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero024");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido017>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 17>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido17() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero025");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido018>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 18>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido18() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero026");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido019>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 19>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido19() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero027");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido020>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 20>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido20() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero028");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido021>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 21>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido21() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero029");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido022>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 22>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido22() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero030");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido023>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 23>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido23() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero031");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido024>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 24>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido24() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero032");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido025>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 25>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido25() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero033");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido026>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 26>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido26() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero034");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido027>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 27>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido27() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero035");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido028>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Omision del nodo hoja 28>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido28() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero036");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido029>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 1>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido29() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero037");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido030>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 2>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido30() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero038");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido031>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 3>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido31() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero039");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido032>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 4>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido32() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero040");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido033>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 5>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido33() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero041");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido034>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 6>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido34() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero042");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido035>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 7>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido35() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero043");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido036>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 8>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido36() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero044");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido037>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 9>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido37() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero045");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido038>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 10>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido38() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero046");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido039>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 11>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido39() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero047");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido040>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 12>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido40() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero048");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido041>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 13>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido41() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero049");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido042>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 14>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido42() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero050");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido043>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 15>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido43() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero051");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido044>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 16>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido44() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero052");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido045>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 17>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido45() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero053");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido046>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 18>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido46() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero054");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido047>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 19>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido47() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero055");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido048>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 20>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido48() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero056");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido049>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 21>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido49() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero057");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido050>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 22>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido50() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero058");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido051>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 23>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido51() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero059");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido052>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 24>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido52() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero060");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido053>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 25>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido53() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero061");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido054>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 26>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido54() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero062");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido055>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Repeticion del nodo hoja 27>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido55() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero063");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido056>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 1>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido56() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero064");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido057>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 2>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido57() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero065");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido058>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 3>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido58() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero066");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido059>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 4>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido59() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero067");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido060>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 5>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido60() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero068");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido061>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 6>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido61() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero069");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido062>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 7>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido62() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero070");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido063>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 8>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido63() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero071");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido064>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 9>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido64() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero072");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido065>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 10>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido65() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero073");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido066>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 11>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido66() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero074");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido067>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 12>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido67() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero075");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido068>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 13>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido68() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero076");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido069>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 14>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido69() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero077");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido070>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 15>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido70() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero078");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido071>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 16>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido71() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero079");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido072>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 17>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido72() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero080");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido073>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 17>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido73() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero081");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido074>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 18>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido74() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero082");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido075>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 19>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido75() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero083");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido076>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 20>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido76() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero084");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido077>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 21>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido77() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero085");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido078>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 22>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido78() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero086");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido079>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 23>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido79() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero087");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido080>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 24>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido80() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero088");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido081>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 25>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido81() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero089");		
		}
	
	@Test (expected=HLMCException.class)
	/*
	 * Caso de prueba: <CP-RF02-Invalido082>
	 * Parametro de entrada analizado<Entrada>
	 * Descripci�n del valor de entrada <Adicion del nodo hoja 26>
	 * T�cnica de prueba <Analisis sintactico>
	 * RESULTADO ESPERADO: Error (excepci�n)
	 */
	public void CPRF02Invalido82() 
		throws HLMCException
		{
		miCalculator.CalculateTMB("RF02/Fichero090");		
		}
}

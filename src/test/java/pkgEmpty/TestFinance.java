package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

import org.apache.poi.ss.formula.functions.*;

public class TestFinance {

	@Test
	public void TestPV() {

		int iYearsToWork = 40;
		double dAnnualReturnWorking = 0.07;
		int iYearsRetired = 20;
		double dAnnualReturnRetired = 0.02;
		double dRequiredIncome = 10000;
		double dMonthlySSI = 2642;

		double PV = Retirement.PV(dAnnualReturnRetired / 12, iYearsRetired * 12, dRequiredIncome - dMonthlySSI, 0, false);
		
		System.out.println(PV);
		
		
		assertEquals(1454485.55,Math.abs(PV),0.01);
		
	}

	@Test
	public void TestPMT() {
		

			int iYearsToWork = 40;
			double dAnnualReturnWorking = 0.07;
			int iYearsRetired = 20;
			double dAnnualReturnRetired = 0.02;
			double dRequiredIncome = 10000;
			double dMonthlySSI = 2642;

			double PMT = Retirement.PMT(dAnnualReturnRetired / 12, iYearsRetired * 12, dRequiredIncome - dMonthlySSI, 0, false);
			
			System.out.println(PMT);
			assertEquals(554.13,Math.abs(PMT),0.01);

	}
}

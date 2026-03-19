package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-478), 5, 2021);
	    String string0 = nextDate0.run(5, 31, 2021);
	    assertEquals("6/1/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 2019);
	    String string0 = nextDate0.run(12, 2019, 2019);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 1982, 1982);
	    String string0 = nextDate0.run(11, 30, 1982);
	    assertEquals("12/1/1982", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 2004, 2004);
	    String string0 = nextDate0.run(1, 1, 2004);
	    assertEquals("1/2/2004", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate((-478), 12, 2021);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate((-516), 4, 2020);
	    String string0 = nextDate0.run(4, 31, 2020);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(29, 2014, 2014);
	    String string0 = nextDate0.run(2, 29, 2014);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1380), (-1380), (-1380));
	    String string0 = nextDate0.run((-1380), 755, 755);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-549), (-549), (-549));
	    String string0 = nextDate0.run((-549), (-549), (-549));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 6, 6);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 1968, 1968);
	    String string0 = nextDate0.run(10, 30, 1968);
	    assertEquals("10/31/1968", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1230, 1230, 1230);
	    String string0 = nextDate0.run(1230, 1230, 1230);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 2004, 2004);
	    String string0 = nextDate0.run(8, 8, 2004);
	    assertEquals("8/9/2004", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 30);
	    String string0 = nextDate0.run(9, 9, 1928);
	    assertEquals("9/10/1928", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(2155, 12, 2155);
	    String string0 = nextDate0.run(12, 12, 2155);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 1959, 1959);
	    String string0 = nextDate0.run(6, 6, 1959);
	    assertEquals("6/7/1959", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate((-511), 12, 2019);
	    String string0 = nextDate0.run(12, 31, 2019);
	    assertEquals("1/1/2020", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 1949, 1949);
	    String string0 = nextDate0.run(12, 12, 1949);
	    assertEquals("12/13/1949", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 1975, 1975);
	    String string0 = nextDate0.run(2, 2, 1975);
	    assertEquals("2/3/1975", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 1974, 1974);
	    String string0 = nextDate0.run(7, 30, 1974);
	    assertEquals("7/30/1974", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 1966, 1966);
	    String string0 = nextDate0.run(2, 28, 1966);
	    assertEquals("3/1/1966", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 2004, 2004);
	    String string0 = nextDate0.run(3, 3, 2004);
	    assertEquals("3/4/2004", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 1968, 1968);
	    String string0 = nextDate0.run(2, 30, 1968);
	    assertEquals("Invalid Input Date", string0);
	}

}
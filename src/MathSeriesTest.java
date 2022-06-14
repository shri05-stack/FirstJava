import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

class MathSeriesTest {
	@Mock
	MathSeries mathseries;
	
	@InjectMocks
	Random random;
	

	@Test
	void test() {
		MathSeries mathseries= new MathSeries(new Random());
		String actual = mathseries.fibo(9);
		String expect ="0,1,1,2,3,5,8,13,21";
		assertEquals(actual, expect);
	}
	void fibo_surprise_me() {
		// Mock the collborator object -- dummy object -- Random
		MathSeries mathseries= new MathSeries(new Random());
		String actual = mathseries.fibo(null);
		String expect ="0,1,1,2,3,5";
		assertEquals(actual, expect);
	}


}

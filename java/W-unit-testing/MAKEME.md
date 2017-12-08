# Homework

### 1. In Eclipse, right click your src folder and select _New_->_Junit Test Case_. Name the test case _TestJunit_ and hit _Finish_. Then replace the contents of your new file with this:
```
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestJunit {

	@Test
	public void testAdd() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine",str);
	}

}
```
### To run this test case, right click "TestJunit.java" in the Package Explorer and select _Run As_->_Junit Test_. If you do not see "Junit Test" under "Run As", select _Run As_->_Run Configurations_. Double click "JUnit" on the left, and type "TestJunit" under the "Test Class" field, then hit "Run".
#### After running the test, you should see a green bar appear in the JUnit tab. This shows you that the test completed successfully.

### 2. 

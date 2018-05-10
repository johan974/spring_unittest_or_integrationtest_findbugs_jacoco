import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class DomainClassTest {
    @Test
    @Category(UnitTest.class)
    public void testUnitTestOne() {
        DomainClass domainClass = new DomainClass();
        assertEquals( 15131, domainClass.convert( 123));
    }
}

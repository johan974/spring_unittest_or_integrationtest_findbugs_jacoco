import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class DomainClassIntegrationTest {
    @Test
    @Category(IntegrationTest.class)
    public void testUnitIntegrationTestOne() {
        DomainClass domainClass = new DomainClass();
        assertEquals( 15131, domainClass.convert( 123));
    }
    @Test
    @Category(IntegrationTest.class)
    public void testUnitIntegrationTestTwo() {
        DomainClass domainClass = new DomainClass();
        assertEquals( 15131, domainClass.convert2( 123));
    }
}

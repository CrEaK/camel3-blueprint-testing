import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.junit.Before;
import org.junit.Test;

public class CamelBlueprintTest extends CamelBlueprintTestSupport {

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    // override this method, and return the location of our Blueprint XML file to be used for testing
    @Override
    protected String getBlueprintDescriptor() {
        return "blueprints/test.xml";
    }


    // here we have regular Junit @Test method
    @Test
    public void testRoute() throws Exception {

    }
}

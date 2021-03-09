import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringActionTest {

    private StringAction str;
    pom.xml
    @Before
    public void setup(){
        str = new StringAction();
    }

    @Test
    public void size() {
        String temp = "Hello";
        Assert.assertEquals(5, str.Length(temp));
    }

    @Test
    public void add() {
        String temp1 = "Hello", temp2 = "World";
        Assert.assertEquals("HelloWorld", str.Connect(temp1, temp2));
    }

    @Test
    public void toLowerCase() {
        String temp = "Hello";
        Assert.assertEquals("hello",str.Low(temp));
    }

    @Test
    public void toUpperCase() {
        String temp = "Hello";
        Assert.assertEquals("HELLO",str.High(temp));

    }
}
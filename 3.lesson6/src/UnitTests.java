import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class UnitTests {
    private Example instance;
    private Example14 instance1;

    @Before
    public void init(){
        instance = new Example();
    }

    @Before
    public void init1(){
        instance1 = new Example14();
    }

    @Test
    public void testArray(){
        List sourceArray = Arrays.asList(1,2,4,4,2,3,4,1,7);
        List output = Arrays.asList(1,7);
        Assert.assertEquals(output, instance.cutArray(sourceArray));
    }

    @Test
    public void testArray1(){
        List sourceArray = Arrays.asList(1,2,3,4,5);
        List output = Arrays.asList(5);
        Assert.assertEquals(output, instance.cutArray(sourceArray));
    }

    @Test
    public void testArray2(){
        List sourceArray = Arrays.asList(1,4,4,4,4,4,1,2);
        List output = Arrays.asList(1,2);
        Assert.assertEquals(output, instance.cutArray(sourceArray));
    }

    @Test
    public void testArray3(){
        List sourceArray = Arrays.asList(1,2,3,4,5);
        boolean result = true;
        Assert.assertEquals(result, instance1.checkArray(sourceArray));
    }
    @Test
    public void testArray4(){
        List sourceArray = Arrays.asList(2,3,6,7);
        boolean result = true;
        Assert.assertEquals(result, instance1.checkArray(sourceArray));
    }
}

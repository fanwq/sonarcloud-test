import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestTwoTest {

    @Test
    void run() {
        TestOne testOne = new TestOne();
        testOne.setRet("return");
        TestTwo testTwo = new TestTwo(testOne);
        Assert.assertSame(testTwo.run(), "return");
    }
}
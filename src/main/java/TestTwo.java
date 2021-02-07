public class TestTwo {

    private TestOne testOne;

    public TestTwo(TestOne testOne){
        this.testOne = testOne;

    }

    public String run(){
        return testOne.getRet();

    }
}

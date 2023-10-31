package practice1;

public class FrontendEngineer extends Engineer {

    public FrontendEngineer(String name) {
        super(name);
    }

    @Override
    public void design() {
        System.out.println("画面設計をします");
    }

    @Override
    public void implement() {
        System.out.println("NextJSを使って実装をします");
    }

    @Override
    public void test() {
        System.out.println("Jestを使ってテストをします");
    }

}

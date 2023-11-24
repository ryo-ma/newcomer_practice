package practice2;

public class FrontendEngineer extends Engineer {
    private String name;
    public FrontendEngineer(String name) {
        this.name = name;
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

    @Override
    public String getName() {
        return this.name;
    }
}

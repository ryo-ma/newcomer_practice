package practice2;

public class BackendEngineer extends Engineer {
    private String name;

    public BackendEngineer(String name) {
        this.name = name;
    }

    @Override
    public void design() {
        System.out.println("バックエンドの構成を設計します");
    }

    @Override
    public void implement() {
        System.out.println("Djangoを使って実装します");
    }

    @Override
    public void test() {
        System.out.println("pytestを使ってテストをします");
    }

    @Override
    public String getName() {
        return this.name;
    }
}

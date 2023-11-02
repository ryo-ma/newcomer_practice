package practice1;

public abstract class Engineer {
    private String name;

    public abstract void design();

    public abstract void implement();

    public abstract void test();

    public Engineer(String name) {
        this.name = name;
    }

    // Template method
    public void work() {
        System.out.println(this.name + "：仕事を開始します");
        this.design();
        this.implement();
        this.test();
        System.out.println(this.name + "：仕事が完了しました\n");
    }
}